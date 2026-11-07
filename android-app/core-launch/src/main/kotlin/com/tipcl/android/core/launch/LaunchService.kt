package com.tipcl.android.core.launch

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/**
 * 启动编排服务（单例语义）：把版本加载、继承链合并、library 解析、
 * 资源完整性检测、JRE 选择与参数拼装串成一个 [LaunchPlan]。
 *
 * 依赖边界：core-launch 不依赖 core-runtime——JRE 供给通过 [RuntimeProvisioner]
 * 注入；app 层组装时传入基于 RemoteRuntimeProvider 的实现。
 *
 * @param instanceManager 实例/版本存储
 * @param libraryResolver library 解析器（含镜像源配置）
 * @param runtimeProvisioner JRE 供给器；null 时只接受 options.javaExecutable 显式指定
 * @param totalMemMB 设备总内存（MB）；null 表示调用方无法提供，内存完全按 options 原样使用
 */
class LaunchService(
    private val instanceManager: InstanceManager,
    private val libraryResolver: LibraryResolver = LibraryResolver(),
    private val runtimeProvisioner: RuntimeProvisioner? = null,
    private val argsBuilder: LaunchArgsBuilder = LaunchArgsBuilder(),
    private val totalMemMB: Long? = null,
) {

    private val indexParser = kotlinx.serialization.json.Json { ignoreUnknownKeys = true }

    /** 构造单例语义的持有器：app 层可用 [singleton] 按进程持有。 */
    companion object {
        @Volatile
        private var sharedInstance: LaunchService? = null

        /** 进程级单例存取（app 层在 Application 初始化时 set）。 */
        fun singleton(): LaunchService? = sharedInstance

        fun setSingleton(service: LaunchService) {
            sharedInstance = service
        }

        /** natives 解压目录名（versions/<id>/natives）。 */
        const val NATIVES_DIR_NAME = "natives"

        /** 未标注 javaVersion 时默认的 Java 大版本。 */
        const val DEFAULT_JAVA_MAJOR = 8

        /** 继承链最大深度（防循环/异常数据）。 */
        const val MAX_INHERIT_DEPTH = 10
    }

    /**
     * 组装完整启动计划。
     *
     * @param instanceId 实例 id（versions 子目录名）
     * @param options 用户启动选项
     * @param listener 进度回调，可为 null
     * @throws LaunchException 版本 JSON 缺失/损坏、继承链循环或过深、
     *   java 可执行文件无法确定
     */
    fun assembleLaunchPlan(
        instanceId: String,
        options: LaunchOptions,
        listener: ProgressListener? = null,
    ): LaunchPlan {
        val paths = instanceManager.pathsFor(instanceId)
        val instanceDir = paths.versionDir.parent

        listener?.onStage(LaunchStage.RESOLVE_VERSION, instanceId)
        val merged = loadMergedSpec(instanceId)

        val effectiveOptions = applyMemoryProfile(options)

        listener?.onStage(LaunchStage.RESOLVE_LIBRARIES, merged.id)
        val features = argsBuilder.buildFeatures(merged, effectiveOptions)
        val resolution = libraryResolver.resolve(merged.libraries, features = features)
        val classpath = libraryResolver.classpathEntries(resolution, paths.librariesDir)

        listener?.onStage(LaunchStage.CHECK_ASSETS, merged.assetIndex?.id ?: "-")
        val missingAssets = computeMissingAssets(merged, paths.assetsDir)

        val requirement = requirementOf(merged)
        listener?.onStage(LaunchStage.PROVISION_RUNTIME, requirement.displayName)
        val javaExecutable = resolveJavaExecutable(options, requirement, listener)

        listener?.onStage(LaunchStage.BUILD_PLAN, merged.id)
        val nativesDir = paths.versionDir.resolve(NATIVES_DIR_NAME)
        val gameDir = options.gameDirectory?.let { Paths.get(it) } ?: instanceDir
        val classpathString = classpath.joinToString(pathSeparator())
        val jvmArgs = argsBuilder.buildJvmArgs(merged, effectiveOptions, nativesDir, classpathString, paths.librariesDir)
        val gameArgs = argsBuilder.buildGameArgs(merged, effectiveOptions, gameDir)

        return LaunchPlan(
            instanceId = instanceId,
            versionId = merged.id,
            mainClass = merged.mainClass,
            jvmArgs = jvmArgs,
            gameArgs = gameArgs,
            classpath = classpath,
            nativeLibDir = nativesDir.toAbsolutePath(),
            assetsDir = paths.assetsDir,
            instanceDir = instanceDir,
            librariesDir = paths.librariesDir,
            gameDir = gameDir,
            javaRequirement = requirement,
            javaExecutable = javaExecutable,
            missingAssets = missingAssets,
            libraryResolution = resolution,
            memoryNotes = effectiveOptions.memoryNotes,
        )
    }

    /**
     * 按 [totalMemMB] 套用设备内存档位：
     * - totalMemMB 为 null/非正数时原样返回 options（行为与未注入时一致）。
     * - options 未显式指定内存（min/max 任一为 null 或 ≤0）→ 使用 [LaunchOptions.forDevice]
     *   的档位推荐值。
     * - min/max 均显式指定 → 用户设置优先，仍走 [LaunchOptions.forDevice] 的 60% 钳制逻辑。
     * 两种路径的调整说明均写入 options.memoryNotes，透传到 [LaunchPlan.memoryNotes]。
     */
    private fun applyMemoryProfile(options: LaunchOptions): LaunchOptions {
        val total = totalMemMB ?: return options
        if (total <= 0) return options
        val totalInt = total.coerceAtMost(Int.MAX_VALUE.toLong()).toInt()
        val min = options.minMemoryMb
        val max = options.maxMemoryMb
        val explicit = min != null && min > 0 && max != null && max > 0
        val fromDevice = if (explicit) {
            LaunchOptions.forDevice(totalInt, min to max)
        } else {
            LaunchOptions.forDevice(totalInt)
        }
        return options.copy(
            minMemoryMb = fromDevice.minMemoryMb,
            maxMemoryMb = fromDevice.maxMemoryMb,
            memoryNotes = fromDevice.memoryNotes,
        )
    }

    /**
     * 加载实例版本并沿 inheritsFrom 链合并（子字段优先、libraries/arguments 追加）。
     * 链上有节点缺失/损坏即抛 [LaunchException]；带循环检测与深度上限。
     */
    fun loadMergedSpec(instanceId: String): VersionSpec {
        val chain = mutableListOf<VersionSpec>()
        var current = instanceManager.loadVersionSpec(instanceManager.pathsFor(instanceId))
        val seen = mutableSetOf(instanceId)
        while (true) {
            chain.add(current)
            val parentId = current.inheritsFrom ?: break
            if (seen.contains(parentId)) throw LaunchException("版本继承链循环: $parentId")
            if (seen.size >= MAX_INHERIT_DEPTH) {
                throw LaunchException("版本继承链过深（>$MAX_INHERIT_DEPTH）")
            }
            seen.add(parentId)
            current = instanceManager.loadVersionSpec(instanceManager.pathsFor(parentId))
        }
        var merged = chain[0]
        for (i in 1 until chain.size) merged = merged.mergeWithParent(chain[i])
        return merged
    }

    /**
     * 检测本地缺失的资源对象：读 assets/indexes/<id>.json 生成清单，
     * 逐个核对 objects/<hash前2>/<hash> 的存在性与大小。
     * 索引文件缺失或损坏时返回空清单（由 [LaunchPlanValidator] 单独报告该问题）。
     */
    fun computeMissingAssets(spec: VersionSpec, assetsDir: Path): List<PendingAsset> {
        val indexInfo = spec.assetIndex ?: return emptyList()
        val indexFile = assetsDir.resolve("indexes").resolve("${indexInfo.id}.json")
        if (!Files.isRegularFile(indexFile)) return emptyList()
        val index = try {
            indexParser.decodeFromString(AssetIndex.serializer(), Files.readString(indexFile))
        } catch (_: Exception) {
            return emptyList()
        }
        val installer = AssetInstaller(okhttp3.OkHttpClient(), assetsDir)
        return installer.buildPendingList(index).filter { pending ->
            val target = installer.targetPathFor(pending.hash)
            !Files.isRegularFile(target) ||
                (pending.size > 0 && runCatching { Files.size(target) != pending.size }.getOrDefault(true))
        }
    }

    /** 由合并后版本推导 JRE 需求；未标注 javaVersion 的旧版本默认 Java 8。 */
    fun requirementOf(spec: VersionSpec): RuntimeRequirement =
        RuntimeRequirement(spec.javaVersion?.majorVersion ?: DEFAULT_JAVA_MAJOR)

    private fun resolveJavaExecutable(
        options: LaunchOptions,
        requirement: RuntimeRequirement,
        listener: ProgressListener?,
    ): String {
        if (options.javaExecutable.isNotBlank()) return options.javaExecutable
        val provisioner = runtimeProvisioner
            ?: throw LaunchException("未指定 javaExecutable 且未注入 RuntimeProvisioner")
        val handle = provisioner.ensureRuntime(requirement, listener)
        return handle.javaExecutable
    }

    private fun pathSeparator(): String = System.getProperty("path.separator") ?: ":"
}
