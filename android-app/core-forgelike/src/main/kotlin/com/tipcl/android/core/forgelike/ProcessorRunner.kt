package com.tipcl.android.core.forgelike

import java.io.File
import java.net.URI
import java.security.MessageDigest
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

/**
 * 按序执行 [ForgePendingTask] 清单（Forge install_profile 公开规范的 processors 运行语义）：
 *
 * 1. [ForgePendingTask.DownloadLibrary]：按 Maven 布局 URL 下载构件到 [libraryDir]，
 *    支持镜像注入（[mirrorBaseUrls] 优先于声明 url，最后回退 Maven Central）；
 * 2. [ForgePendingTask.RunProcessor]：组装 `java -cp ... MainClass args...` 命令并执行。
 *    args 中 `{KEY}` 占位符由 [data]（client 侧已取值）展开；data 值本身可含 `{ROOT}`
 *    等嵌套占位符，相对路径一律相对 [workingDir] 解析。outputs 声明校验：产物文件必须
 *    存在；key 指向的库构件 sha1 与产物不一致时用产物覆写构件；value 以 `!` 结尾时
 *    语义为"将该文件作为条目回写进 key 构件的 jar"。
 *    断点重跑：outputs 全部满足（构件存在且 sha1 匹配，或 jar 内条目已存在）的
 *    processor 直接跳过不再执行；
 * 3. [ForgePendingTask.FinalizeVersionJson]：交给 [finalize] 回调（见
 *    [ForgeVersionJsonFinalizer]）。
 *
 * 命令的实际执行通过 [CommandSink] 抽象：生产用 [ProcessCommandSink]，测试用
 * [DryRunCommandSink] 只记录组装好的命令而不真跑，便于断言占位符展开与组装正确。
 */
class ProcessorRunner(
    private val javaLocator: HostJavaLocator,
    private val libraryDir: File,
    private val workingDir: File,
    /** 展开后的 client 侧 data 表（`{MINECRAFT_JAR}` 等特殊键也在此提供）。 */
    private val data: Map<String, String>,
    private val mirrorBaseUrls: List<String> = emptyList(),
    private val commandSink: CommandSink = ProcessCommandSink,
    private val downloader: Downloader = UrlDownloader,
    private val finalize: (ForgePendingTask.FinalizeVersionJson) -> Unit = {},
    /** installer jar 内部资源解析（BINPATCH 等指向 jar 内条目的 data 值）；null 关闭该特判。 */
    private val installerEntries: InstallerEntries? = null,
) {

    /** 执行全部任务，返回逐任务结果（顺序与输入一致）。 */
    fun runAll(tasks: List<ForgePendingTask>): List<TaskResult> = tasks.map { run(it) }

    sealed interface TaskResult {
        data class Library(val artifact: String, val url: String?, val file: File) : TaskResult
        data class Processor(val mainArtifact: String, val skipped: Boolean, val command: List<String>) : TaskResult
        data class Finalize(val newId: String) : TaskResult
    }

    fun run(task: ForgePendingTask): TaskResult = when (task) {
        is ForgePendingTask.DownloadLibrary -> runDownload(task)
        is ForgePendingTask.RunProcessor -> runProcessor(task)
        is ForgePendingTask.FinalizeVersionJson -> {
            finalize(task)
            TaskResult.Finalize(task.newId)
        }
    }

    // ---------- DownloadLibrary ----------

    private fun runDownload(task: ForgePendingTask.DownloadLibrary): TaskResult.Library {
        val dest = File(libraryDir, mavenPath(task.artifact))
        val urls = candidateUrls(task.artifact, task.baseUrl)
        if (!dryRun) {
            // 已存在则跳过下载：该副本可能来自 installer 内嵌 maven（InstallerEntries 同步）。
            if (dest.isFile) return TaskResult.Library(task.artifact, task.baseUrl, dest)
            var lastError: Exception? = null
            for (url in urls) {
                try {
                    downloader.download(url, dest)
                    return TaskResult.Library(task.artifact, task.baseUrl, dest)
                } catch (e: Exception) {
                    lastError = e
                }
            }
            throw IllegalStateException("下载构件失败: ${task.artifact}", lastError)
        }
        return TaskResult.Library(task.artifact, task.baseUrl, dest)
    }

    /** 镜像注入：mirrorBaseUrls 优先，其次 profile 声明 url，最后 Maven Central。 */
    fun candidateUrls(artifact: String, baseUrl: String?): List<String> {
        val path = mavenPath(artifact)
        val bases = mirrorBaseUrls + listOfNotNull(baseUrl?.trimEnd('/'), DEFAULT_MAVEN)
        return bases.map { it.trimEnd('/') + "/" + path }.distinct()
    }

    // ---------- RunProcessor ----------

    private fun runProcessor(task: ForgePendingTask.RunProcessor): TaskResult.Processor {
        val command = buildCommand(task)
        // outputs 为空的 processor 没有可校验的完成凭证，每次都必须重跑。
        if (task.outputs.isNotEmpty() && outputsSatisfied(task.outputs)) {
            return TaskResult.Processor(task.mainArtifact, skipped = true, command = command)
        }
        val exit = commandSink.run(command, workingDir)
        if (exit != 0) {
            throw IllegalStateException("processor ${task.mainArtifact} 退出码 $exit")
        }
        applyOutputs(task.outputs)
        return TaskResult.Processor(task.mainArtifact, skipped = false, command = command)
    }

    /**
     * 组装命令：`java -cp <jar 构件 + classpath 构件> <mainClass> <展开后的 args>`。
     * mainClass 优先级：`data["mainClass"]`（调用方注入，测试用）> 主构件 jar 清单的
     * Main-Class > 回退 `-jar` 方式启动（此时 classpath 不会生效，仅为兜底）。
     */
    fun buildCommand(task: ForgePendingTask.RunProcessor): List<String> {
        val java = javaLocator.locate() ?: error("未找到可用 Java 运行时")
        val cp = (listOf(task.mainArtifact) + task.classpath)
            .joinToString(File.pathSeparator) { resolveArtifactFile(it).absolutePath }
        val mainArtifactFile = resolveArtifactFile(task.mainArtifact)
        val mainClass = data["mainClass"]
            ?: mainClassFromManifest(mainArtifactFile)
        return buildList {
            add(java)
            add("-cp")
            add(cp)
            if (mainClass != null) {
                add(mainClass)
            } else {
                add("-jar")
                add(mainArtifactFile.absolutePath)
            }
            task.args.forEach { add(expand(it)) }
        }
    }

    private fun mainClassFromManifest(jar: File): String? =
        runCatching {
            if (!jar.isFile) return@runCatching null
            java.util.jar.JarFile(jar).use { jf ->
                jf.manifest?.mainAttributes?.getValue("Main-Class")
            }
        }.getOrNull()

    /** `{KEY}` 展开：特殊键与 data 表取值；data 值可嵌套含其他 `{KEY}`；最多 5 层。 */
    fun expand(raw: String): String = expandInternal(raw, resolveBrackets = true)

    /**
     * `{KEY}` 展开的真实 profile 语义（Forge 1.20.1 install_profile 实测）：
     * - data 值形如 `'20230612.114412'`：单引号包裹的常量，展开后剥掉引号；
     * - data 值形如 `[g:a:v[:classifier][@ext]]`：Maven 构件引用，展开为库目录内的
     *   绝对路径（[resolveBrackets] = true，用于 args）；
     * - outputs 的 key 也是 `{KEY}` 占位符（如 `{MC_SLIM}`），需解析出 Maven 坐标本身
     *   而非路径（[resolveBrackets] = false，见 [outputArtifactCoordinate]）。
     */
    private fun expandInternal(raw: String, resolveBrackets: Boolean, resolveRelative: Boolean = true): String {
        var value = raw
        var depth = 0
        while (REGEX.containsMatchIn(value)) {
            if (++depth > MAX_EXPANSION) throw IllegalArgumentException("占位符展开超出深度: $raw")
            value = REGEX.replace(value) { m ->
                val key = m.groupValues[1]
                data[key] ?: throw IllegalArgumentException("未知占位符 {$key}")
            }
        }
        if (value.length >= 2 && value.startsWith('\'') && value.endsWith('\'')) {
            value = value.substring(1, value.length - 1)
        }
        if (resolveBrackets) {
            BRACKET_REGEX.find(value)?.let { m ->
                return normalizePath(resolveArtifactFile(mavenCoordinate(m.groupValues[1])).absolutePath)
            }
        }
        // data 值指向 installer jar 内部条目（BINPATCH=/data/client.lzma 等）：解出到
        // workingDir 并改写为解出后的文件系统路径（M4.5 NETTEST 边界 #6）。
        if (installerEntries?.isInternalValue(value) == true) {
            return installerEntries.resolve(value).absolutePath
        }
        return normalizePath(if (resolveRelative) resolveIfRelative(value) else value)
    }

    /**
     * outputs key → Maven 坐标：key 经展开与引号/方括号剥离后应还原为
     * `group:artifact:version[:classifier]`（1.20.1 实测 outputs key 全为 `{MC_*}` 占位符，
     * 取值形如 `[net.minecraft:client:1.20.1-...:slim]`）。
     */
    private fun outputArtifactCoordinate(key: String): String =
        mavenCoordinate(expandInternal(key, resolveBrackets = false))

    /** 剥掉 outputs key 展开值外层的 `[...]` 引用记号，还原为纯 Maven 坐标。 */
    private fun mavenCoordinate(value: String): String =
        BRACKET_REGEX.find(value)?.groupValues?.get(1) ?: value

    /**
     * 路径语义：相对值若在工作目录下真实存在（或带 `!` jar 内条目后缀）则相对
     * [workingDir] 解析为绝对路径；`{SIDE}` 之类的非路径取值原样保留。
     */
    private fun resolveIfRelative(value: String): String {
        if (value.isEmpty() || File(value).isAbsolute) return value
        val resolved = File(workingDir, value)
        val exists = if (value.endsWith("!")) {
            File(workingDir, value.removeSuffix("!")).isFile
        } else {
            resolved.isFile || resolved.isDirectory
        }
        return if (exists) resolved.path else value
    }

    /** 嵌套展开后的绝对路径统一为本平台分隔符（data 值常用 `/` 拼接）。 */
    private fun normalizePath(value: String): String = value.replace('/', File.separatorChar)

    // ---------- outputs 校验与回写 ----------

    /** outputs 全部满足即认为该 processor 已完成（断点重跑跳过依据）。 */
    fun outputsSatisfied(outputs: Map<String, String>): Boolean = outputs.all { (key, path) ->
        val artifact = outputArtifactCoordinate(key)
        val expandedPath = expandInternal(path, resolveBrackets = false, resolveRelative = false)
        if (expandedPath.endsWith("!")) {
            val entry = expandedPath.removeSuffix("!").replace('\\', '/')
            val jar = artifactFileOrNull(artifact) ?: return@all false
            runCatching { JarFile(jar).use { it.getJarEntry(entry) != null } }.getOrDefault(false)
        } else {
            artifactSha1Matches(artifact, File(workingDir, expandedPath))
        }
    }

    /** sha1 存在性检查：产物 sha1 与库构件一致即通过；不一致则用产物覆写构件。 */
    private fun applyOutputs(outputs: Map<String, String>) {
        outputs.forEach { (key, path) ->
            val artifact = outputArtifactCoordinate(key)
            val expandedPath = expandInternal(path, resolveBrackets = false, resolveRelative = false)
            if (expandedPath.endsWith("!")) {
                val entryFile = File(workingDir, expandedPath.removeSuffix("!"))
                require(entryFile.isFile) { "output 产物不存在: $expandedPath" }
                replaceJarEntry(artifactFileOrNull(artifact) ?: error("构件不存在: $artifact"), entryFile, expandedPath.removeSuffix("!").replace('\\', '/'))
            } else {
                val produced = File(workingDir, expandedPath)
                require(produced.isFile) { "output 产物不存在: $expandedPath" }
                val target = resolveArtifactFile(artifact)
                target.parentFile.mkdirs()
                if (artifactSha1Matches(artifact, produced) && target.isFile) return@forEach
                produced.copyTo(target, overwrite = true)
            }
        }
    }

    private fun artifactSha1Matches(artifact: String, produced: File?): Boolean {
        val jar = artifactFileOrNull(artifact) ?: return false
        if (!jar.isFile) return false
        val other = produced?.takeIf { it.isFile } ?: return false
        return sha1(jar) == sha1(other)
    }

    private fun artifactFileOrNull(artifact: String): File? =
        resolveArtifactFile(artifact).takeIf { it.isFile }

    /** Maven 坐标 → 库目录内相对路径；允许带 `url` 限定符以外的普通坐标。 */
    fun resolveArtifactFile(artifact: String): File = File(libraryDir, mavenPath(artifact))

    private val dryRun: Boolean get() = commandSink is DryRunCommandSink

    companion object {
        private val REGEX = Regex("\\{([A-Za-z0-9_.]+)}")
        private val BRACKET_REGEX = Regex("^\\[(.+)\\]$")
        private const val MAX_EXPANSION = 5
        const val DEFAULT_MAVEN = "https://maven.minecraftforge.net/maven"

        /** `group:artifact:version[:classifier]` → Maven 布局相对路径，version/classifier 可带 `@ext`。 */
        fun mavenPath(coordinate: String): String {
            val parts = coordinate.split(':')
            require(parts.size >= 3) { "非法 Maven 坐标: $coordinate" }
            val group = parts[0]
            val artifactId = parts[1]
            val versionFull = parts[2]
            val classifierFull = parts.getOrNull(3)
            val version = versionFull.substringBefore('@')
            val classifier = classifierFull?.substringBefore('@')?.takeIf { it.isNotBlank() }
            val ext = versionFull.takeIf { it.contains('@') }?.substringAfter('@')
                ?: classifierFull?.takeIf { it.contains('@') }?.substringAfter('@')
                ?: "jar"
            val fileName = buildString {
                append(artifactId).append('-').append(version)
                if (classifier != null) append('-').append(classifier)
                append('.').append(ext)
            }
            return "${group.replace('.', '/')}/$artifactId/$version/$fileName"
        }

        fun sha1(file: File): String {
            val md = MessageDigest.getInstance("SHA-1")
            file.inputStream().use { input ->
                val buf = ByteArray(8192)
                while (true) {
                    val n = input.read(buf)
                    if (n <= 0) break
                    md.update(buf, 0, n)
                }
            }
            return md.digest().joinToString("") { "%02x".format(it) }
        }

        /** 将 [entryFile] 作为 [entryPath] 替换进 [jar]（保留其余条目）。 */
        fun replaceJarEntry(jar: File, entryFile: File, entryPath: String) {
            val tmp = File(jar.parentFile, jar.name + ".tipcl-tmp")
            JarFile(jar).use { source ->
                JarOutputStream(tmp.outputStream()).use { out ->
                    val seen = mutableSetOf<String>()
                    source.entries().asSequence().forEach { e ->
                        if (e.name == entryPath) return@forEach
                        seen += e.name
                        out.putNextEntry(JarEntry(e.name).apply { time = e.time })
                        if (!e.isDirectory) source.getInputStream(e).use { it.copyTo(out) }
                        out.closeEntry()
                    }
                    out.putNextEntry(JarEntry(entryPath))
                    entryFile.inputStream().use { it.copyTo(out) }
                    out.closeEntry()
                }
            }
            jar.delete()
            check(tmp.renameTo(jar)) { "回写 jar 失败: $jar" }
        }
    }
}

/** 命令执行抽象：生产走进程，测试记录命令（DryRun）。 */
interface CommandSink {
    /** 返回进程退出码。 */
    fun run(command: List<String>, workingDir: File): Int
}

object ProcessCommandSink : CommandSink {
    override fun run(command: List<String>, workingDir: File): Int =
        ProcessBuilder(command).directory(workingDir).inheritIO().start().waitFor()
}

/** 测试用：只记录命令与工作目录，返回 0。 */
class DryRunCommandSink : CommandSink {
    val recorded = mutableListOf<Pair<List<String>, File>>()

    override fun run(command: List<String>, workingDir: File): Int {
        recorded += command to workingDir
        return 0
    }
}

/** 下载抽象（测试可替换）。 */
interface Downloader {
    fun download(url: String, dest: File)
}

object UrlDownloader : Downloader {
    override fun download(url: String, dest: File) {
        dest.parentFile.mkdirs()
        val tmp = File(dest.parentFile, dest.name + ".part")
        URI(url).toURL().openStream().use { input -> tmp.outputStream().use { input.copyTo(it) } }
        check(tmp.renameTo(dest)) { "下载落盘失败: $url" }
    }
}
