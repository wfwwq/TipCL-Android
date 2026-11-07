package com.tipcl.android.core.runtime

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.util.concurrent.TimeUnit

/**
 * Java 运行时（JRE）供给接口。
 *
 * core-runtime 不关心 JRE 从哪来（内置打包 / 下载解包 / 用户导入），
 * 只要求给一个 majorVersion 换一个可用的 java home 目录。
 */
interface JavaRuntimeProvider {
    /** 当前已就绪的运行时列表（majorVersion -> 已供给目录）。 */
    fun list(): List<ProvisionedRuntime>

    /** 若指定 majorVersion 尚未供给则下载/解包，返回 java home 目录。 */
    fun provision(majorVersion: Int): Path

    data class ProvisionedRuntime(
        val majorVersion: Int,
        val home: Path,
    )
}

/**
 * 本地 JRE 目录登记簿：扫描 `<appData>/jre/<major>/` 布局，
 * 提供 java -version 实测探测、外部 JRE 注册、损坏目录清理。
 *
 * 目录约定：
 * ```
 * <appData>/jre/
 *   8/  bin/java, lib/...
 *   17/ bin/java, lib/...
 *   archives/   下载归档缓存（RemoteRuntimeProvider 用）
 *   .staging/   解包暂存（成功后移走，失败自动清理）
 * ```
 */
class LocalRuntimeCatalog(
    appDataDir: Path,
) : JavaRuntimeProvider {

    val jreRoot: Path = appDataDir.resolve("jre")

    override fun list(): List<JavaRuntimeProvider.ProvisionedRuntime> {
        if (!Files.isDirectory(jreRoot)) return emptyList()
        val result = mutableListOf<JavaRuntimeProvider.ProvisionedRuntime>()
        Files.list(jreRoot).use { stream ->
            stream.filter { Files.isDirectory(it) }
                .map { it to it.fileName.toString().toIntOrNull() }
                .filter { (_, major) -> major != null }
                .filter { (dir, _) -> looksValid(dir) }
                .forEach { (dir, major) ->
                    result += JavaRuntimeProvider.ProvisionedRuntime(major!!, dir)
                }
        }
        return result.sortedBy { it.majorVersion }
    }

    override fun provision(majorVersion: Int): Path =
        provisioned(majorVersion)
            ?: error("JRE $majorVersion not provisioned under $jreRoot " +
                "(use RemoteRuntimeProvider for download, or register() a local copy)")

    /** 已就绪则返回目录，否则 null（不做下载）。 */
    fun provisioned(majorVersion: Int): Path? {
        val candidate = homeFor(majorVersion)
        if (!looksValid(candidate)) return null
        // 目录形态完整但二进制实际不可跑 → 让上层决定是否重新供给
        return candidate
    }

    fun homeFor(majorVersion: Int): Path = jreRoot.resolve(majorVersion.toString())

    /**
     * 实测探测：运行 `<home>/bin/java -version`，从 stderr 解析 major 版本。
     * 返回 null 表示无法运行或输出不可解析。
     */
    fun probe(home: Path): Int? {
        val javaBin = resolveJavaBinary(home) ?: return null
        return try {
            val p = ProcessBuilder(javaBin.toString(), "-version")
                .redirectErrorStream(false)
                .start()
            val out = p.errorStream.bufferedReader().readText()
            if (!p.waitFor(30, TimeUnit.SECONDS)) {
                p.destroyForcibly()
                return null
            }
            parseJavaVersionMajor(out)
        } catch (e: IOException) {
            null
        }
    }

    /**
     * 注册一份现成的 java home 到目录簿：探测其 major 版本后复制为
     * `<jreRoot>/<major>/`。已存在同版本供给时若现供给有效则拒绝覆盖。
     *
     * @return 注册后的目录。
     */
    fun register(home: Path, majorOverride: Int? = null): Path {
        if (!looksValid(home)) throw IOException("not a java home (no bin/java): $home")
        val major = majorOverride ?: probe(home)
            ?: throw IOException("probe failed for $home; pass majorOverride to skip probing")
        val existing = homeFor(major)
        if (looksValid(existing)) throw IOException("JRE $major already provisioned at $existing")
        Files.createDirectories(existing)
        Files.walk(home).use { walk ->
            walk.forEach { src ->
                val rel = home.relativize(src)
                val dst = existing.resolve(rel)
                if (Files.isDirectory(src)) Files.createDirectories(dst)
                else {
                    Files.createDirectories(dst.parent)
                    Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING)
                }
            }
        }
        return existing
    }

    /**
     * 清理：删除 `<jreRoot>` 下形态损坏的版本目录（目录名为纯数字但缺 bin/java）、
     * 残留 `.part` 临时档与 `.staging` 残骸。已就绪目录不受影响。
     *
     * @return 被清理的路径。
     */
    fun cleanupCorrupt(): List<Path> {
        val removed = mutableListOf<Path>()
        if (!Files.isDirectory(jreRoot)) return removed

        Files.list(jreRoot).use { stream ->
            stream.forEach { child ->
                val name = child.fileName.toString()
                when {
                    name == ".staging" -> {
                        child.toFile().deleteRecursively(); removed.add(child)
                    }
                    name.startsWith("archives") -> {
                        // 归档缓存：只清 .part
                        if (Files.isDirectory(child)) {
                            Files.list(child).use { s ->
                                s.filter { it.fileName.toString().endsWith(".part") }
                                    .forEach { Files.deleteIfExists(it); removed.add(it) }
                            }
                        } else if (name.endsWith(".part")) {
                            Files.deleteIfExists(child); removed.add(child)
                        }
                    }
                    name.toIntOrNull() != null && !looksValid(child) -> {
                        child.toFile().deleteRecursively(); removed.add(child)
                    }
                }
            }
        }
        return removed
    }

    companion object {
        fun looksValid(home: Path): Boolean {
            val javaBin = home.resolve("bin").resolve("java")
            val javaExe = home.resolve("bin").resolve("java.exe")
            return Files.isRegularFile(javaBin) || Files.isRegularFile(javaExe)
        }

        fun resolveJavaBinary(home: Path): Path? {
            val unix = home.resolve("bin").resolve("java")
            val win = home.resolve("bin").resolve("java.exe")
            return when {
                Files.isRegularFile(unix) -> unix
                Files.isRegularFile(win) -> win
                else -> null
            }
        }

        /**
         * 从 `java -version` 输出解析 major：
         * `openjdk version "17.0.2"` → 17；`"1.8.0_392"` → 8。
         */
        fun parseJavaVersionMajor(output: String): Int? {
            val m = Regex("""version "([^"]+)"""").find(output) ?: return null
            val v = m.groupValues[1]
            val first = v.substringBefore('.').toIntOrNull() ?: return null
            return if (first == 1) v.substringAfter('.').substringBefore('.').toIntOrNull() else first
        }

        /**
         * 免执行的形态校验：解析 `<home>/release` 的 `JAVA_VERSION="x.y.z"` 行
         * 返回 major。用于宿主 CPU 架构与 JRE 二进制不一致（无法 `java -version`
         * 实测）时的文件树完整性验证。
         */
        fun releaseFileMajor(home: Path): Int? {
            val release = home.resolve("release")
            if (!Files.isRegularFile(release)) return null
            val m = Regex("""JAVA_VERSION="([^"]+)"""").find(String(Files.readAllBytes(release))) ?: return null
            val v = m.groupValues[1]
            val first = v.substringBefore('.').toIntOrNull() ?: return null
            return if (first == 1) v.substringAfter('.').substringBefore('.').toIntOrNull() else first
        }

        /** 便捷构造：从 Android appData 路径字符串。 */
        fun fromAppData(appDataPath: String): LocalRuntimeCatalog =
            LocalRuntimeCatalog(Paths.get(appDataPath))
    }
}
