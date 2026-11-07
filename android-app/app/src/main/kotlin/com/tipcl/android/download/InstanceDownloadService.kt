package com.tipcl.android.download

import android.content.Context
import com.tipcl.android.R
import com.tipcl.android.core.forgelike.ForgeInstaller
import com.tipcl.android.core.forgelike.ForgePendingTask
import com.tipcl.android.core.forgelike.ForgeVersionJsonFinalizer
import com.tipcl.android.core.forgelike.HostJavaLocator
import com.tipcl.android.core.forgelike.ProcessorRunner
import com.tipcl.android.core.forgelike.QuiltInstaller
import com.tipcl.android.core.launch.AssetInstaller
import com.tipcl.android.core.launch.FabricInstaller
import com.tipcl.android.core.launch.InstanceManager
import com.tipcl.android.core.launch.LibraryResolver
import com.tipcl.android.core.launch.VersionManifestFetcher
import com.tipcl.android.core.launch.VersionSpec
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.nio.file.StandardOpenOption
import java.security.MessageDigest
import java.util.concurrent.atomic.AtomicLong

/**
 * 实例安装下载管线（vanilla / fabric 共用），协程驱动 + StateFlow 暴露进度。
 *
 * ```
 * start(mcVersion, loader, loaderVersion, instanceName)
 *   ├─ VERSION_JSON  清单定位版本条目 → 下载版本 JSON → installInstance 落盘
 *   │                （fabric：先落原版 JSON，再调 FabricInstaller 生成派生版本落盘）
 *   ├─ CLIENT_JAR    downloads.client.url → versions/<id>/<id>.jar（流式 + sha1）
 *   ├─ LIBRARIES     LibraryResolver 解析合并后 library → 逐个下载（.part → 改名，sha1 校验）
 *   ├─ ASSET_INDEX   AssetInstaller.fetchAssetIndex
 *   ├─ ASSETS        AssetInstaller.install 分批并发下载（批间更新进度、可取消）
 *   └─ DONE
 * ```
 *
 * 取消：[cancel] 置位取消标志并取消协程；下载循环在每文件/每批之间
 * `ensureActive()`，字节回调中检查标志中断流，finally 统一清理 .part 残留。
 *
 * 进度：单次建模见 [DownloadProgress]；速度由 [SpeedMeter] 指数平滑；
 * StateFlow 节流至约 150ms 一次，UI 直接渲染，不做二次聚合。
 */
class InstanceDownloadService(
    instancesRoot: File,
    /** 版本清单缓存目录，与 VersionRepository 共用同一 meta 目录。 */
    manifestCacheDir: File,
    httpClient: okhttp3.OkHttpClient = HttpProvider.client,
    /**
     * Forge processors 执行用的本机 Java 定位器（app 注入，通常为
     * [ProvisionedJavaLocator]）；null 时 forge 安装会抛出明确错误。
     */
    private val javaLocator: HostJavaLocator? = null,
    /** 用于本地化进度/错误文案（传 applicationContext）。 */
    private val appContext: android.content.Context,
) {

    private val root: Path = instancesRoot.toPath()
    private val manager = InstanceManager(root)
    private val manifestFetcher = VersionManifestFetcher(httpClient, manifestCacheDir.toPath())
    private val assetInstaller = AssetInstaller(httpClient, root.resolve("assets"))
    private val resolver = LibraryResolver()

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val _state = MutableStateFlow<InstallState>(InstallState.Idle)

    /** 向导进度页订阅的状态流。 */
    val state: StateFlow<InstallState> = _state

    @Volatile
    private var cancelRequested = false

    private var job: Job? = null

    /** 已写出的 .part 文件，取消/失败时统一删除。 */
    private val trackedParts: MutableSet<Path> =
        java.util.Collections.synchronizedSet(LinkedHashSet())

    // ---- 进度累积（仅在单个安装协程内读写） ----
    private var downloadedBytes = 0L
    private var totalBytes = 0L
    private var filesDone = 0
    private var filesTotal = 0
    private var lastEmitAt = 0L
    private val speedMeter = SpeedMeter()

    /**
     * 启动安装任务。已有任务在跑时忽略本次调用。
     * 失败重试（Forge processors 断点续跑）：直接以相同参数再次 [start]，已下载
     * 构件/已完成的 processor 由下载与 ProcessorRunner 的 outputs 校验自动跳过。
     * @param loader vanilla / fabric / quilt / forge
     */
    fun start(mcVersion: String, loader: String, loaderVersion: String, instanceName: String) {
        if (job?.isActive == true) return
        cancelRequested = false
        resetProgress()
        _state.value = InstallState.Running(progressOf(DownloadPhase.VERSION_JSON, appContext.getString(R.string.dl_locating_version, mcVersion)))
        job = scope.launch {
            try {
                val outcome = when (loader) {
                    "fabric" -> InstallOutcome(installFabric(mcVersion, loaderVersion, instanceName), null)
                    "quilt" -> installQuilt(mcVersion, loaderVersion)
                    "forge" -> installForge(mcVersion, loaderVersion)
                    else -> InstallOutcome(installVanilla(mcVersion, instanceName), null)
                }
                _state.value = InstallState.Completed(outcome.id, outcome.warning)
            } catch (e: CancellationException) {
                _state.value = InstallState.Failed(appContext.getString(R.string.dl_cancelled))
            } catch (e: Exception) {
                _state.value = InstallState.Failed(e.message ?: e.javaClass.simpleName)
            } finally {
                cleanupParts()
            }
        }
    }

    /** 取消当前安装：协程取消 + 中断进行中的流 + 清理 .part。 */
    fun cancel() {
        cancelRequested = true
        job?.cancel()
    }

    /** 进度页复位（回到列表前调用）。 */
    fun reset() {
        cancel()
        _state.value = InstallState.Idle
    }

    /** 任务进行中则取消（离开向导页时兜底）。 */
    fun cancelIfRunning() {
        if (job?.isActive == true) cancel()
    }

    // ---------------------------------------------------------------- vanilla

    private suspend fun installVanilla(mcVersion: String, instanceName: String): String {
        val id = sanitizeId("$mcVersion-${instanceName.ifBlank { "instance" }}")
        val (spec, jsonText) = downloadAndInstallVersionJson(mcVersion, id)
        downloadClientJar(clientUrlOf(jsonText), id)
        installLibraries(spec)
        installAssets(spec)
        return id
    }

    // ---------------------------------------------------------------- fabric

    private suspend fun installFabric(mcVersion: String, loaderVersion: String, instanceName: String): String {
        // 原版 JSON 先按原版 id 落盘（派生版本 inheritsFrom 指向它）。
        val (vanillaSpec, vanillaJsonText) = downloadAndInstallVersionJson(mcVersion, mcVersion)
        emitForce(DownloadPhase.VERSION_JSON, appContext.getString(R.string.dl_fabric_derive))
        val (derivedId, derivedJson) = FabricInstaller().install(vanillaSpec, loaderVersion)
        manager.installInstance(derivedId, derivedJson)
        val merged = VersionSpec.parse(derivedJson).mergeWithParent(vanillaSpec)
        downloadClientJar(clientUrlOf(vanillaJsonText), derivedId)
        installLibraries(merged)
        installAssets(merged)
        return derivedId
    }

    // ---------------------------------------------------------------- quilt

    /**
     * Quilt 安装：原版 JSON 落盘后调 core-forgelike [QuiltInstaller]（Quilt meta
     * 拉 Fabric 兼容 profile JSON），派生版本落盘后与 Fabric 完全同管线
     * （client jar / libraries / assets）。meta 不可达时 installer 返回本地骨架
     * 版本（libraries 留空待联网补全），流程继续但结果带降级标注。
     */
    private suspend fun installQuilt(mcVersion: String, loaderVersion: String): InstallOutcome {
        val (_, vanillaJsonText) = downloadAndInstallVersionJson(mcVersion, mcVersion)
        val vanillaSpec = VersionSpec.parse(vanillaJsonText)
        emitForce(DownloadPhase.VERSION_JSON, appContext.getString(R.string.dl_quilt_derive))
        val (derivedId, derivedJson) = kotlinx.coroutines.withContext(Dispatchers.IO) {
            QuiltInstaller().install(mcVersion, loaderVersion)
        }
        val offlineSkeleton = derivedJson.contains("tipclPendingQuiltLibraries")
        manager.installInstance(derivedId, derivedJson)
        val merged = VersionSpec.parse(derivedJson).mergeWithParent(vanillaSpec)
        downloadClientJar(clientUrlOf(vanillaJsonText), derivedId)
        installLibraries(merged)
        installAssets(merged)
        return InstallOutcome(
            derivedId,
            warning = if (offlineSkeleton) appContext.getString(R.string.dl_quilt_fallback) else null,
        )
    }

    // ---------------------------------------------------------------- forge（实验性）

    /**
     * Forge 安装（实验性）：下载官方 installer jar → 解包 install_profile 与 data
     * 附件 → [ForgeInstaller.buildPendingTasks] 展开 → [ProcessorRunner] 真执行
     * （app 注入 [javaLocator] 提供的 JRE 与 stderr 捕获 sink）→ FinalizeVersionJson
     * 落盘 → 合并原版走 library/assets 管线。
     *
     * 断点续跑：installer 与原版 jar 已存在则跳过下载；已完成 processor 由
     * ProcessorRunner 的 outputs 校验自动跳过——重试直接以相同参数再调 [start]。
     */
    private suspend fun installForge(mcVersion: String, loaderVersion: String): InstallOutcome {
        val locator = javaLocator
            ?: throw IllegalStateException(appContext.getString(R.string.error_forge_no_java_locator))
        val (_, vanillaJsonText) = downloadAndInstallVersionJson(mcVersion, mcVersion)
        val vanillaSpec = VersionSpec.parse(vanillaJsonText)
        if (locator is ProvisionedJavaLocator) {
            locator.setPreferredMajor(vanillaSpec.javaVersion?.majorVersion ?: DEFAULT_JAVA_MAJOR)
        }

        val workDir = root.resolve(FORGE_WORK_DIR).resolve("$mcVersion-$loaderVersion")
        val installerJar = workDir.resolve("installer.jar")
        emitForce(DownloadPhase.FORGE_SETUP, appContext.getString(R.string.dl_forge_download_installer))
        kotlinx.coroutines.withContext(Dispatchers.IO) {
            Files.createDirectories(workDir)
            if (!Files.isRegularFile(installerJar)) {
                downloadToFile(forgeInstallerUrl(mcVersion, loaderVersion), installerJar, expectedSha1 = null) { }
            }
        }
        emitForce(DownloadPhase.FORGE_SETUP, appContext.getString(R.string.dl_forge_unpack_profile))
        val profileText = kotlinx.coroutines.withContext(Dispatchers.IO) {
            extractInstallerContents(workDir, installerJar)
        }
        val profile = ForgeInstaller().parseInstallProfile(profileText)
        val tasks = ForgeInstaller().buildPendingTasks(profile)

        // processors 依赖原版 client jar（{MINECRAFT_JAR}），先确保就位（重试跳过）。
        val vanillaJar = root.resolve("versions").resolve(mcVersion).resolve("$mcVersion.jar")
        kotlinx.coroutines.withContext(Dispatchers.IO) {
            if (!Files.isRegularFile(vanillaJar)) {
                val clientUrl = clientUrlOf(vanillaJsonText)
                    ?: throw IllegalStateException(appContext.getString(R.string.dl_forge_no_client_url))
                downloadToFile(clientUrl, vanillaJar, expectedSha1 = null) { }
            }
        }

        // client 侧 data 表 + 特殊键注入（ROOT / MINECRAFT_JAR 指向真实绝对路径）。
        val data = profile.data.mapValues { it.value.client }.toMutableMap()
        data["ROOT"] = workDir.toString()
        data["MINECRAFT_JAR"] = vanillaJar.toString()
        data.putIfAbsent("MINECRAFT_VERSION", mcVersion)
        data.putIfAbsent("SIDE", "client")

        val finalizer = ForgeVersionJsonFinalizer(profile)
        val derivedId = tasks.filterIsInstance<ForgePendingTask.FinalizeVersionJson>()
            .firstOrNull()?.newId
            ?: throw IllegalStateException(appContext.getString(R.string.dl_forge_no_version_task))
        val processorTotal = tasks.count { it is ForgePendingTask.RunProcessor }
        var processorDone = 0
        val runner = ProcessorRunner(
            javaLocator = locator,
            libraryDir = manager.librariesDir.toFile(),
            workingDir = workDir.toFile(),
            data = data,
            commandSink = CapturingCommandSink(),
            finalize = { task ->
                manager.installInstance(task.newId, finalizer.finalize(task))
            },
        )

        emitForce(DownloadPhase.FORGE_PROCESSORS, appContext.getString(R.string.dl_forge_processors_start, processorTotal))
        kotlinx.coroutines.withContext(Dispatchers.IO) {
            for (task in tasks) {
                currentCoroutineContext().ensureActive()
                when (task) {
                    is ForgePendingTask.RunProcessor -> {
                        emitForce(
                            DownloadPhase.FORGE_PROCESSORS,
                            appContext.getString(R.string.dl_processor_progress, processorDone + 1, processorTotal, task.mainArtifact),
                        )
                        try {
                            runner.run(task)
                        } catch (e: CancellationException) {
                            throw e
                        } catch (e: Exception) {
                            throw IllegalStateException(
                                appContext.getString(R.string.dl_forge_proc_failed, processorDone + 1, task.mainArtifact, e.message ?: ""),
                                e,
                            )
                        }
                        processorDone++
                    }
                    is ForgePendingTask.DownloadLibrary -> {
                        emitForce(DownloadPhase.LIBRARIES, appContext.getString(R.string.dl_forge_artifact, task.artifact))
                        runner.run(task)
                    }
                    else -> runner.run(task)
                }
            }
        }
        emitForce(DownloadPhase.FORGE_PROCESSORS, appContext.getString(R.string.dl_forge_processors_done))

        // 运行期 library/assets 按 finalize 产物走常规管线。
        val finalJsonText = kotlinx.coroutines.withContext(Dispatchers.IO) {
            manager.pathsFor(derivedId).versionJson.toFile().readText()
        }
        installLibraries(VersionSpec.parse(finalJsonText).mergeWithParent(vanillaSpec))
        installAssets(VersionSpec.parse(finalJsonText).mergeWithParent(vanillaSpec))

        // 派生实例主 jar 复用原版 client jar（Forge 内容经 libraries 装载）。
        kotlinx.coroutines.withContext(Dispatchers.IO) {
            val derivedJar = root.resolve("versions").resolve(derivedId).resolve("$derivedId.jar")
            if (!Files.isRegularFile(derivedJar)) Files.copy(vanillaJar, derivedJar)
        }
        return InstallOutcome(derivedId, null)
    }

    /** Forge installer 的 Maven 直链（官方 maven 布局，installer 分类器）。 */
    private fun forgeInstallerUrl(mcVersion: String, loaderVersion: String): String =
        "${ProcessorRunner.DEFAULT_MAVEN}/net/minecraftforge/forge/" +
            "$mcVersion-$loaderVersion/forge-$mcVersion-$loaderVersion-installer.jar"

    /**
     * 解包 installer jar 全部条目到 [workDir]（install_profile.json、data/client.lzma
     * 等 processor data 附件；META-INF 跳过，路径做 zip-slip 防护）。已解包过（存在
     * install_profile.json）时直接读取，支持重试复用。
     */
    private fun extractInstallerContents(workDir: Path, installerJar: Path): String {
        val profileFile = workDir.resolve("install_profile.json")
        if (!Files.isRegularFile(profileFile)) {
            val normalizedRoot = workDir.normalize()
            java.util.zip.ZipFile(installerJar.toFile()).use { zip ->
                zip.entries().asSequence().forEach { entry ->
                    if (entry.isDirectory || entry.name.startsWith("META-INF/")) return@forEach
                    val target = workDir.resolve(entry.name).normalize()
                    if (!target.startsWith(normalizedRoot)) return@forEach
                    Files.createDirectories(target.parent)
                    zip.getInputStream(entry).use { input ->
                        Files.newOutputStream(
                            target,
                            java.nio.file.StandardOpenOption.CREATE,
                            java.nio.file.StandardOpenOption.TRUNCATE_EXISTING,
                            java.nio.file.StandardOpenOption.WRITE,
                        ).use { input.copyTo(it) }
                    }
                }
            }
        }
        return profileFile.toFile().readText()
    }

    // ---------------------------------------------------------------- 阶段实现

    /** 定位清单条目 → 下载版本 JSON → 落盘为 versions/<id>/<id>.json，返回解析后的 spec 与 JSON 原文。 */
    private suspend fun downloadAndInstallVersionJson(mcVersion: String, installId: String): Pair<VersionSpec, String> {
        val entry = kotlinx.coroutines.withContext(Dispatchers.IO) {
            manifestFetcher.findVersion(mcVersion)
        } ?: throw IllegalStateException(appContext.getString(R.string.dl_no_such_version, mcVersion))
        emitForce(DownloadPhase.VERSION_JSON, appContext.getString(R.string.dl_version_json_named, mcVersion))
        val jsonText = kotlinx.coroutines.withContext(Dispatchers.IO) {
            manifestFetcher.fetchVersionJson(entry)
        }
        manager.installInstance(installId, jsonText)
        val spec = VersionSpec.parse(jsonText)
        filesDone = 1
        filesTotal = 1
        return spec to jsonText
    }

    /** 下载客户端主 jar（fabric 时仍取原版 downloads.client，jar 名用实例 id）。 */
    private suspend fun downloadClientJar(clientUrl: String?, instanceId: String) {
        if (clientUrl.isNullOrBlank()) {
            emitForce(DownloadPhase.CLIENT_JAR, appContext.getString(R.string.dl_client_jar_skipped))
            return
        }
        filesTotal = 1
        filesDone = 0
        val target = root.resolve("versions").resolve(instanceId).resolve("$instanceId.jar")
        emitForce(DownloadPhase.CLIENT_JAR, target.fileName.toString())
        downloadToFile(clientUrl, target, expectedSha1 = null) { n ->
            downloadedBytes += n
            maybeEmit(DownloadPhase.CLIENT_JAR, target.fileName.toString())
        }
        filesDone = 1
    }

    /** 解析 library 并逐个下载；已存在且大小一致的跳过。 */
    private suspend fun installLibraries(spec: VersionSpec) {
        val resolution = resolver.resolve(spec.libraries)
        val all = resolution.classpath + resolution.natives
        totalBytes = all.sumOf { it.size }
        downloadedBytes = 0
        filesTotal = all.size
        filesDone = 0
        val librariesDir: Path = manager.librariesDir
        var skipped = 0
        for (lib in all) {
            currentCoroutineContext().ensureActive()
            val target = librariesDir.resolve(lib.relativePath)
            if (Files.isRegularFile(target) && (lib.size <= 0 || Files.size(target) == lib.size)) {
                skipped++
                filesDone++
                downloadedBytes += lib.size
                continue
            }
            emitForce(DownloadPhase.LIBRARIES, lib.relativePath)
            downloadToFile(lib.url, target, lib.sha1) { n ->
                downloadedBytes += n
                maybeEmit(DownloadPhase.LIBRARIES, lib.relativePath)
            }
            filesDone++
        }
        emitForce(
            DownloadPhase.LIBRARIES,
            message = appContext.getString(R.string.dl_libraries_done, all.size, skipped),
        )
    }

    /** asset index 下载解析 + 分批并发下载对象文件。 */
    private suspend fun installAssets(spec: VersionSpec) {
        val indexInfo = spec.assetIndex
        if (indexInfo == null) {
            emitForce(DownloadPhase.ASSET_INDEX, appContext.getString(R.string.dl_asset_index_skipped))
            return
        }
        emitForce(DownloadPhase.ASSET_INDEX, indexInfo.id)
        val index = kotlinx.coroutines.withContext(Dispatchers.IO) {
            assetInstaller.fetchAssetIndex(indexInfo.url, indexInfo.sha1)
        }
        val pending = assetInstaller.buildPendingList(index)
        totalBytes = pending.sumOf { it.size }
        downloadedBytes = 0
        filesTotal = pending.size
        filesDone = 0
        val failures = LinkedHashMap<String, String>()
        // AssetInstaller.install 阻塞到整批完成，分批既给出进度粒度也缩小取消延迟。
        for (batch in pending.chunked(ASSET_BATCH_SIZE)) {
            currentCoroutineContext().ensureActive()
            if (cancelRequested) throw CancellationException(appContext.getString(R.string.dl_cancelled))
            emitForce(DownloadPhase.ASSETS, appContext.getString(R.string.dl_assets_batch, filesDone + 1, filesDone + batch.size, filesTotal))
            val result = kotlinx.coroutines.withContext(Dispatchers.IO) { assetInstaller.install(batch) }
            failures.putAll(result.failed)
            filesDone += batch.size
            downloadedBytes += batch.sumOf { it.size }
            maybeEmit(DownloadPhase.ASSETS, appContext.getString(R.string.dl_assets_batch_plain))
        }
        emitForce(
            DownloadPhase.ASSETS,
            message = if (failures.isEmpty()) appContext.getString(R.string.dl_assets_done, filesTotal)
            else appContext.getString(R.string.dl_assets_done_failures, failures.size, failures.keys.take(3).joinToString()) +
                (if (failures.size > 3) appContext.getString(R.string.dl_and_more) else ""),
        )
    }

    // ---------------------------------------------------------------- 下载与进度

    /**
     * 流式下载到 target（先写 .part 再原子改名），可选 sha1 校验。
     * [onBytes] 在 IO 线程回调；请求取消时抛出以中断流。
     */
    private fun downloadToFile(
        url: String,
        target: Path,
        expectedSha1: String?,
        onBytes: (Long) -> Unit,
    ) {
        Files.createDirectories(target.parent)
        val part = target.resolveSibling(target.fileName.toString() + ".part")
        trackedParts.add(part)
        run {
            val digest = MessageDigest.getInstance("SHA-1")
            val request = okhttp3.Request.Builder().url(url).build()
            HttpProvider.client.newCall(request).execute().use { resp ->
                if (!resp.isSuccessful) throw IllegalStateException(appContext.getString(R.string.error_http_download_failed, resp.code, url))
                val body = resp.body ?: throw IllegalStateException(appContext.getString(R.string.error_empty_body, url))
                body.byteStream().use { input ->
                    Files.newOutputStream(
                        part,
                        StandardOpenOption.CREATE,
                        StandardOpenOption.TRUNCATE_EXISTING,
                        StandardOpenOption.WRITE,
                    ).use { out ->
                        val buf = ByteArray(DOWNLOAD_BUFFER_SIZE)
                        while (true) {
                            if (cancelRequested) throw IllegalStateException(appContext.getString(R.string.dl_cancelled))
                            val n = input.read(buf)
                            if (n < 0) break
                            out.write(buf, 0, n)
                            digest.update(buf, 0, n)
                            onBytes(n.toLong())
                        }
                    }
                }
            }
            if (expectedSha1 != null) {
                val actual = digest.digest().joinToString("") { "%02x".format(it) }
                if (!actual.equals(expectedSha1, ignoreCase = true)) {
                    throw IllegalStateException(appContext.getString(R.string.error_sha1_mismatch, url, expectedSha1, actual))
                }
            }
            Files.move(part, target, StandardCopyOption.REPLACE_EXISTING)
            trackedParts.remove(part)
        }
    }

    private fun cleanupParts() {
        synchronized(trackedParts) {
            trackedParts.forEach { runCatching { Files.deleteIfExists(it) } }
            trackedParts.clear()
        }
    }

    private fun resetProgress() {
        downloadedBytes = 0
        totalBytes = 0
        filesDone = 0
        filesTotal = 0
        lastEmitAt = 0
        speedMeter.reset()
    }

    private fun progressOf(phase: DownloadPhase, currentFile: String, message: String? = null): DownloadProgress =
        DownloadProgress(
            phase = phase,
            totalBytes = totalBytes,
            downloadedBytes = downloadedBytes,
            filesDone = filesDone,
            filesTotal = filesTotal,
            currentFile = currentFile,
            speedBps = speedMeter.speed(downloadedBytes),
            message = message,
        )

    /** 节流发射：150ms 内的更新合并（阶段切换用 [emitForce] 保证不丢）。 */
    private fun maybeEmit(phase: DownloadPhase, currentFile: String) {
        val now = System.currentTimeMillis()
        if (now - lastEmitAt < EMIT_INTERVAL_MS) return
        lastEmitAt = now
        _state.value = InstallState.Running(progressOf(phase, currentFile))
    }

    private fun emitForce(phase: DownloadPhase, currentFile: String = "", message: String? = null) {
        lastEmitAt = System.currentTimeMillis()
        _state.value = InstallState.Running(progressOf(phase, currentFile, message))
    }

    private fun sanitizeId(raw: String): String {
        val cleaned = raw.replace(Regex("[^A-Za-z0-9._-]"), "-")
        return cleaned.ifBlank { "instance" }
    }

    /** VersionSpec 未建模顶层 downloads，客户端 jar 地址从 JSON 原文轻量提取（app 层适配）。 */
    private fun clientUrlOf(versionJsonText: String): String? = runCatching {
        JSONObject(versionJsonText)
            .optJSONObject("downloads")?.optJSONObject("client")?.optString("url")
    }.getOrNull()

    private companion object {
        const val EMIT_INTERVAL_MS = 150L
        const val DOWNLOAD_BUFFER_SIZE = 64 * 1024
        const val ASSET_BATCH_SIZE = 64
        const val DEFAULT_JAVA_MAJOR = 8

        /** Forge processors 工作目录（installer 解包 + processor 运行，重试复用）。 */
        const val FORGE_WORK_DIR = "forge-processing"
    }
}

/** 单次安装的内部结果：最终实例 id + 可选降级标注（如 Quilt 离线骨架）。 */
private data class InstallOutcome(val id: String, val warning: String?)

/** 指数平滑的下载速度表（字节/秒），基于累计字节与采样时刻。 */
private class SpeedMeter {
    private var lastBytes = 0L
    private var lastAt = 0L
    private var smoothed = AtomicLong(0)

    fun speed(currentBytes: Long): Long {
        val now = System.currentTimeMillis()
        if (lastAt == 0L) {
            lastAt = now
            lastBytes = currentBytes
            return smoothed.get()
        }
        val dtMs = now - lastAt
        if (dtMs < SAMPLE_MS) return smoothed.get()
        val inst = ((currentBytes - lastBytes) * 1000 / dtMs).coerceAtLeast(0)
        val next = if (smoothed.get() == 0L) inst else (smoothed.get() * 7 + inst) / 8
        smoothed.set(next)
        lastAt = now
        lastBytes = currentBytes
        return next
    }

    fun reset() {
        lastBytes = 0
        lastAt = 0
        smoothed.set(0)
    }

    private companion object {
        const val SAMPLE_MS = 300L
    }
}
