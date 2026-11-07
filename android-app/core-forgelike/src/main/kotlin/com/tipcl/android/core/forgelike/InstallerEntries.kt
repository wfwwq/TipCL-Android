package com.tipcl.android.core.forgelike

import java.io.File
import java.util.jar.JarFile

/**
 * installer jar 内部资源解析层（M4.5 NETTEST 边界 #6）：
 *
 * Forge `install_profile.json` 的 data 表中存在形如 `/data/client.lzma`（BINPATCH）、
 * `/maven/net/minecraftforge/...` 的取值——它们不是文件系统路径，而是 **installer jar
 * 内部条目**。ProcessorRunner 正式执行时若原样传给 processor 工具必然失败（binarypatcher
 * 找不到 `--binpatches /data/client.lzma` 这个文件），必须在展开阶段特判注入：
 *
 * 1. [isInternalValue]：识别 data 展开值是否为 installer 内部条目引用（`/data/`、`/maven/`
 *    前缀，且条目真实存在于 jar 内，防止把巧合的 Unix 绝对路径误判进来）；
 * 2. [resolve]：按 installer jar 路径映射把条目解出到 workingDir（`/data/client.lzma` →
 *    `workingDir/data/client.lzma`、`/maven/<rel>` → `workingDir/maven/<rel>`）并返回
 *    解出后的文件系统路径。存在即复用（字节数一致跳过解出），二次运行零重复 IO；
 * 3. `/maven/` 条目额外同步进 [libraryDir]（同相对 Maven 布局路径，已存在不覆盖），
 *    使 [ForgePendingTask.DownloadLibrary] 的"已存在则跳过下载"语义天然复用该副本。
 */
class InstallerEntries(
    private val installerJar: File,
    private val workingDir: File,
    /** 共享 libraries 目录；`/maven/` 条目解出后同步一份到此处供 DownloadLibrary 复用。 */
    private val libraryDir: File? = null,
) {

    /** 已解出条目缓存：jar 内条目名 → 解出文件（进程内 + 落盘双层）。 */
    private val extracted = mutableMapOf<String, File>()

    /** jar 内条目字节数缓存，用于落盘副本与条目不一致时判定重解。 */
    private val entrySizes by lazy {
        buildMap {
            if (!installerJar.isFile) return@buildMap
            runCatching {
                JarFile(installerJar).use { jar ->
                    jar.entries().asSequence().forEach { e ->
                        if (!e.isDirectory) put(e.name, e.size)
                    }
                }
            }
        }
    }

    /** data 展开值是否指向 installer jar 内部条目（`/data/...` 或 `/maven/...`）。 */
    fun isInternalValue(value: String): Boolean {
        val entry = value.removePrefix("/").replace('\\', '/')
        return (value.startsWith("/data/") || value.startsWith("/maven/")) && entry in entrySizes
    }

    /**
     * 把 [value] 指向的 jar 内条目解出到 workingDir 并返回解出后的绝对路径。
     * 条目不存在抛 [IllegalStateException]；落盘副本已存在且字节数一致则直接复用。
     */
    fun resolve(value: String): File {
        require(isInternalValue(value)) { "非 installer 内部条目引用: $value" }
        val entry = value.removePrefix("/").replace('\\', '/')
        extracted[entry]?.let { return it }
        val dest = File(workingDir, entry)
        val expectedSize = entrySizes[entry]
        if (!dest.isFile || (expectedSize != null && dest.length() != expectedSize)) {
            dest.parentFile.mkdirs()
            JarFile(installerJar).use { jar ->
                val zipEntry = jar.getJarEntry(entry)
                    ?: throw IllegalStateException("installer jar 内不存在条目: $entry")
                jar.getInputStream(zipEntry).use { input ->
                    dest.outputStream().use { output -> input.copyTo(output) }
                }
            }
        }
        if (entry.startsWith("maven/")) syncMavenIntoLibrary(entry.removePrefix("maven/"), dest)
        extracted[entry] = dest
        return dest
    }

    /**
     * 把 `/maven/<rel>` 解出副本同步到 [libraryDir]/<rel>（Maven 布局相对路径与
     * [ProcessorRunner.mavenPath] 产出一致）。已存在不覆盖——DownloadLibrary 的
     * `dest.isFile → 跳过下载` 语义保持。
     */
    private fun syncMavenIntoLibrary(relativeMavenPath: String, extractedFile: File) {
        val libraryDir = libraryDir ?: return
        val dest = File(libraryDir, relativeMavenPath)
        if (dest.isFile) return
        dest.parentFile.mkdirs()
        extractedFile.copyTo(dest, overwrite = false)
    }
}
