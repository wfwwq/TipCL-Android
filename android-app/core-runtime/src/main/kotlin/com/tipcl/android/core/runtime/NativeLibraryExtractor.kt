package com.tipcl.android.core.runtime

import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.util.Properties
import java.util.zip.ZipFile

/**
 * 从 library jar 中解压当前 ABI 匹配的 .so 到 natives 目录。
 *
 * 对接 core-launch 的 LaunchPlan 约定：LaunchPlan.nativeLibDir 是单一目标目录
 * （-Djava.library.path 直接指向它），本类把 natives 构件 jar（LibraryResolution.natives
 * 的 relativePath 对应文件）中的 .so 平铺解压到该目录。
 *
 * 提取规则：
 * - 只取路径以 `.so` 结尾的 entry；
 * - jar 内按 ABI 分目录（如 `lib/arm64-v8a/liblwjgl.so`）时，取当前 ABI 目录下的
 *   entry，其他 ABI 目录整体忽略；无 ABI 目录段的全局 .so 一并提取；
 * - 目标文件取 entry 的 basename 平铺；同名冲突后到覆盖（REPLACE_EXISTING）；
 * - META-INF / 签名文件恒跳过。
 *
 * 缓存：目标目录写 `.natives_manifest.properties`，记录 ABI、各源 jar 的 sha256
 * 与每个 entry 的目标名+大小。再次调用时若 ABI、jar 集合（按 sha256）与全部在位
 * 文件大小均吻合则整跳过，不重新解压。
 *
 * 损坏 jar（非 zip / 中央目录损坏）抛 [NativeExtractException]。
 *
 * 不 import core-launch 类型：jar 路径清单由调用方（app 层）从
 * LaunchPlan.libraryResolution.natives 展开传入。
 */
class NativeLibraryExtractor(
    /** 目标 ABI，默认自动探测（Android 取 Build.SUPPORTED_ABIS[0]，桌面按 os.arch 映射）。 */
    private val abi: String = currentAbi(),
) {

    /** 解压结果。[cached]=true 表示清单校验通过、未做任何解压。 */
    data class ExtractionResult(
        val abi: String,
        /** 实际解压的 entry 名（缓存命中时为空）。 */
        val extracted: List<String>,
        val cached: Boolean,
    )

    class NativeExtractException(message: String, cause: Throwable? = null) :
        IOException(message, cause)

    fun ensureExtracted(jars: List<Path>, nativesDir: Path): ExtractionResult {
        val existing = readManifest(nativesDir)
        if (existing != null && cacheValid(existing, jars, nativesDir)) {
            return ExtractionResult(abi, emptyList(), cached = true)
        }

        Files.createDirectories(nativesDir)
        val extracted = mutableListOf<ExtractedEntry>()

        for (jar in jars) {
            if (!Files.isRegularFile(jar)) {
                throw NativeExtractException("natives jar 不存在: $jar")
            }
            extractJar(jar, nativesDir, extracted)
        }

        writeManifest(nativesDir, jars, extracted)
        return ExtractionResult(abi, extracted.map { it.entryName }, cached = false)
    }

    private data class ExtractedEntry(
        val entryName: String,
        val targetName: String,
        val size: Long,
        val jarSha: String,
    )

    private fun extractJar(jar: Path, nativesDir: Path, out: MutableList<ExtractedEntry>) {
        val jarSha = try {
            Sha256.ofFile(jar)
        } catch (e: IOException) {
            throw NativeExtractException("读取 natives jar 失败: $jar", e)
        }

        val zip = try {
            ZipFile(jar.toFile())
        } catch (e: IOException) {
            throw NativeExtractException("损坏或非 zip 的 natives jar: $jar", e)
        }

        zip.use { zf ->
            val entries = zf.entries().asSequence()
                .filter { !it.isDirectory }
                .filter { it.name.endsWith(".so") }
                .filter { !EXCLUDED.any { p -> it.name.startsWith(p) } }
                .filter { matchesAbi(it.name) }
                .toList()

            for (entry in entries) {
                val targetName = entry.name.substringAfterLast('/')
                val target = nativesDir.resolve(targetName)
                try {
                    zf.getInputStream(entry).use { input ->
                        Files.newOutputStream(target).use { output -> input.copyTo(output, 65536) }
                    }
                } catch (e: IOException) {
                    throw NativeExtractException("解压 ${entry.name} 失败 (来自 $jar)", e)
                }
                val size = try {
                    Files.size(target)
                } catch (e: IOException) {
                    throw NativeExtractException("确认解压产物失败: $target", e)
                }
                out += ExtractedEntry(entry.name, targetName, size, jarSha)
            }
        }
    }

    /**
     * entry 路径含 ABI 目录段时只留当前 ABI；无 ABI 段的放行。
     *
     * 除 Android ABI 名外，还识别常见上游架构别名（LWJGL natives jar 用
     * `linux/arm64/org/lwjgl/...` 这类布局，`arm64`/`aarch64` 等段名等价映射到
     * Android ABI）：识别到别名段但与目标 ABI 不符时同样跳过，避免 x86_64
     * 设备误提取 arm64 产物。
     */
    private fun matchesAbi(entryName: String): Boolean {
        val seg = entryName.substringBeforeLast('/').split('/')
        val abiSegment = seg.firstNotNullOfOrNull { ABI_ALIASES[it] ?: (if (it in KNOWN_ABIS) it else null) }
            ?: return true
        return abiSegment == abi
    }

    // ---- 缓存清单 ----

    private data class Manifest(
        val abi: String,
        val jarShas: List<String>,
        val entries: List<Triple<String, String, Long>>, // entryName, targetName, size
    )

    private fun manifestFile(nativesDir: Path): Path = nativesDir.resolve(MANIFEST_NAME)

    private fun readManifest(nativesDir: Path): Manifest? {
        val f = manifestFile(nativesDir)
        if (!Files.isRegularFile(f)) return null
        return try {
            val p = Properties()
            Files.newInputStream(f).use { p.load(it) }
            val jarShas = p.getProperty("jars")?.split(',').orEmpty().filter { it.isNotBlank() }
            val entries = mutableListOf<Triple<String, String, Long>>()
            var i = 0
            while (p.getProperty("entry.$i") != null) {
                entries += Triple(
                    p.getProperty("entry.$i")!!,
                    p.getProperty("target.$i")!!,
                    p.getProperty("size.$i")?.toLongOrNull() ?: -1L,
                )
                i++
            }
            Manifest(p.getProperty("abi") ?: "", jarShas, entries)
        } catch (_: IOException) {
            null
        }
    }

    private fun cacheValid(m: Manifest, jars: List<Path>, nativesDir: Path): Boolean {
        if (m.abi != abi) return false
        if (m.jarShas.size != jars.size) return false
        val currentShas = jars.mapIndexed { idx, jar ->
            if (!Files.isRegularFile(jar)) return false
            try {
                Sha256.ofFile(jar)
            } catch (_: IOException) {
                return false
            }
        }
        if (currentShas != m.jarShas) return false
        // 全量在位且大小一致才算命中
        return m.entries.all { (_, targetName, size) ->
            val f = nativesDir.resolve(targetName)
            size >= 0 && Files.isRegularFile(f) && try {
                Files.size(f) == size
            } catch (_: IOException) {
                false
            }
        }
    }

    private fun writeManifest(nativesDir: Path, jars: List<Path>, extracted: List<ExtractedEntry>) {
        val p = Properties()
        p.setProperty("abi", abi)
        p.setProperty("jars", jars.joinToString(",") { Sha256.ofFile(it) })
        extracted.forEachIndexed { i, e ->
            p.setProperty("entry.$i", e.entryName)
            p.setProperty("target.$i", e.targetName)
            p.setProperty("size.$i", e.size.toString())
        }
        try {
            Files.newOutputStream(manifestFile(nativesDir)).use { p.store(it, "tipcl natives manifest") }
        } catch (e: IOException) {
            throw NativeExtractException("写入 natives 清单失败: ${manifestFile(nativesDir)}", e)
        }
    }

    companion object {
        private const val MANIFEST_NAME = ".natives_manifest.properties"

        private val EXCLUDED = listOf("META-INF/", ".signature")

        val KNOWN_ABIS = setOf("arm64-v8a", "armeabi-v7a", "x86", "x86_64")

        /** jar 内目录段名 → Android ABI 的别名映射（不含本身就在 KNOWN_ABIS 里的名字）。 */
        val ABI_ALIASES = mapOf(
            "aarch64" to "arm64-v8a",
            "arm64" to "arm64-v8a",
            "armv8" to "arm64-v8a",
            "armv8a" to "arm64-v8a",
            "amd64" to "x86_64",
            "x64" to "x86_64",
            "win64" to "x86_64",
            "linux-amd64" to "x86_64",
            "i386" to "x86",
            "i686" to "x86",
            "x86-32" to "x86",
            "armv7" to "armeabi-v7a",
            "armv7l" to "armeabi-v7a",
            "armhf" to "armeabi-v7a",
            "armeabi" to "armeabi-v7a",
        )

        /**
         * 当前设备 ABI：Android 优先 Build.SUPPORTED_ABIS[0]（反射，桌面单测无此类），
         * 否则按 os.arch 映射。
         */
        fun currentAbi(): String {
            try {
                val build = Class.forName("android.os.Build")
                val abis = build.getField("SUPPORTED_ABIS").get(null) as? Array<*>
                if (abis != null && abis.isNotEmpty()) return abis[0].toString()
                @Suppress("DEPRECATION")
                val legacy = build.getField("CPU_ABI").get(null) as? String
                if (!legacy.isNullOrBlank()) return legacy
            } catch (_: Throwable) { /* 非 Android 运行时 */ }
            return fromOsArch(System.getProperty("os.arch") ?: "")
        }

        /** `aarch64`/`arm64` → arm64-v8a；`x86_64`/`amd64` → x86_64；`armv7` → armeabi-v7a；`x86`/`i386` → x86。 */
        fun fromOsArch(osArch: String): String {
            val a = osArch.lowercase()
            return when {
                a.contains("aarch64") || a.contains("arm64") -> "arm64-v8a"
                a.contains("x86_64") || a.contains("amd64") -> "x86_64"
                a.contains("armv7") || a == "arm" || a.startsWith("armhf") -> "armeabi-v7a"
                a.contains("x86") || a.contains("i386") || a.contains("i686") -> "x86"
                else -> throw NativeExtractException("无法识别的目标架构: os.arch=$osArch")
            }
        }
    }
}
