package com.tipcl.android.core.runtime

import java.net.HttpURLConnection
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assume
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

/**
 * LWJGL 3.3.3 真实 natives jar 实测（Maven Central 发布产物，aarch64 linux）。
 *
 * 5 个构件：lwjgl / lwjgl-glfw / lwjgl-openal / lwjgl-opengl / lwjgl-stb，
 * 分类器 natives-linux-arm64。jar 内 .so 布局为 `linux/arm64/org/lwjgl/<pkg>/lib*.so`
 * （上游架构段名 + org/lwjgl 包段，非 Android ABI 目录），sha256 下载后与下方
 * 写死值核对，保证复现性。
 *
 * 默认跳过（Assume 门控），设 TIPCL_NETTEST=1 才执行，不污染常规回归。
 * 缓存根 tipcl.lwjgl.cache.dir（gradle 默认指向 <root>/tools/lwjgl-cache），
 * 已有合法 jar（sha256 吻合）则零下载。
 *
 * 符号抽查（alcCreateContext / glfwInit 等）由外部 llvm-readelf 对解压产物
 * 核对，见 core-runtime/NOTES.md「LWJGL 实测」节。
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class LwjglNativesE2ETest {

    companion object {
        const val BASE = "https://repo1.maven.org/maven2/org/lwjgl"
        const val VERSION = "3.3.3"

        data class Artifact(val name: String, val sha256: String, val soName: String)

        val ARTIFACTS = listOf(
            Artifact("lwjgl", "397a79a5d8907286d4018d026cbc37358c53bbb6aabc3a1534f19ff23b7f8558", "liblwjgl.so"),
            Artifact("lwjgl-glfw", "cc6139c83f799d0e1484ea4c201c8ce6d57c8c7a244a5217116a806b1eb4179b", "libglfw.so"),
            Artifact("lwjgl-openal", "abf392487b3587da89b655250008df4a360a2fd5e1ee00abd61f7f52915205a1", "libopenal.so"),
            Artifact("lwjgl-opengl", "0b2b75327d47451634123348d55503ae03e51551b0c8879ae90c8e4b4e1a4f9c", "liblwjgl_opengl.so"),
            Artifact("lwjgl-stb", "17f0cf1b8e522eea6b4b97c19070b39e54f5f87ed84fb89585747e40f905e1db", "liblwjgl_stb.so"),
        )
    }

    private val cacheDir: Path by lazy {
        Paths.get(
            System.getProperty(
                "tipcl.lwjgl.cache.dir",
                Paths.get(System.getProperty("java.io.tmpdir"), "tipcl-lwjgl-e2e").toString(),
            ),
        )
    }

    private fun jarPath(name: String): Path = cacheDir.resolve("$name-$VERSION-natives-linux-arm64.jar")

    /** 缓存无 jar 或 sha256 不符时从 Maven Central 下载。失败则 Assume 跳过（无网环境）。 */
    private fun provisionJars() {
        Assume.assumeTrue("TIPCL_NETTEST=1 才执行", System.getenv("TIPCL_NETTEST") == "1")
        Files.createDirectories(cacheDir)
        for (a in ARTIFACTS) {
            val target = jarPath(a.name)
            if (Files.isRegularFile(target)) {
                val sha = try { Sha256.ofFile(target) } catch (_: Exception) { null }
                if (sha == a.sha256) continue
            }
            val url = "$BASE/${a.name}/$VERSION/${a.name}-$VERSION-natives-linux-arm64.jar"
            val conn = URL(url).openConnection() as HttpURLConnection
            conn.connectTimeout = 10_000
            conn.readTimeout = 30_000
            try {
                Assume.assumeTrue("Maven Central 不可达，跳过", conn.responseCode == 200)
                conn.inputStream.use { input -> Files.copy(input, target, StandardCopyOption.REPLACE_EXISTING) }
            } finally {
                conn.disconnect()
            }
            assertEquals("下载产物 sha256 不符: $url", a.sha256, Sha256.ofFile(target))
        }
    }

    private fun allJars(): List<Path> = ARTIFACTS.map { jarPath(it.name) }

    @Test
    fun test1_extractFiveRealJars() {
        provisionJars()
        val natives = cacheDir.resolve("natives-e2e")
        // 从零解压：清掉上次运行的缓存目录
        Files.walk(natives).use { paths -> paths.sorted(Comparator.reverseOrder()).forEach { Files.deleteIfExists(it) } }
        val result = NativeLibraryExtractor(abi = "arm64-v8a").ensureExtracted(allJars(), natives)

        assertFalse(result.cached)
        // 每个 jar 恰好 1 个 .so，共 5 个，名字与各包内容一致
        assertEquals(ARTIFACTS.map { it.soName }.sorted(), result.extracted.map { it.substringAfterLast('/') }.sorted())
        for (a in ARTIFACTS) {
            val f = natives.resolve(a.soName)
            assertTrue("缺少 ${a.soName}", Files.isRegularFile(f))
            assertTrue("${a.soName} 为空", Files.size(f) > 0)
        }
        assertEquals(1_151_424L, Files.size(natives.resolve("libopenal.so")))
        // linux/ 目录本身不应落到目标目录（平铺）
        assertFalse(Files.exists(natives.resolve("linux")))
    }

    @Test
    fun test2_manifestRecordsJarSha256() {
        provisionJars()
        val natives = cacheDir.resolve("natives-e2e")
        // test1 已解压；重复调用确保清单在位
        NativeLibraryExtractor(abi = "arm64-v8a").ensureExtracted(allJars(), natives)

        val props = java.util.Properties()
        Files.newInputStream(natives.resolve(".natives_manifest.properties")).use { props.load(it) }
        assertEquals("arm64-v8a", props.getProperty("abi"))
        assertEquals(
            ARTIFACTS.map { it.sha256 },
            props.getProperty("jars")!!.split(','),
        )
        assertEquals("5", props.getProperty("jars")!!.split(',').size.toString())
        // entry 记录上游路径（含 org/lwjgl 段）
        assertTrue(
            "清单应记录上游 entry 路径",
            (0 until 5).any { props.getProperty("entry.$it")?.contains("linux/arm64/org/lwjgl/") == true },
        )
    }

    @Test
    fun test3_secondCallHitsCache() {
        provisionJars()
        val natives = cacheDir.resolve("natives-e2e")
        val extractor = NativeLibraryExtractor(abi = "arm64-v8a")
        extractor.ensureExtracted(allJars(), natives)
        val second = extractor.ensureExtracted(allJars(), natives)

        assertTrue(second.cached)
        assertTrue(second.extracted.isEmpty())
    }

    @Test
    fun test4_tamperedJarReextracts() {
        provisionJars()
        val natives = cacheDir.resolve("natives-e2e")
        val extractor = NativeLibraryExtractor(abi = "arm64-v8a")
        extractor.ensureExtracted(allJars(), natives)

        // 篡改最小 jar（追加字节，zip 仍可读但 sha 变化）
        val victim = jarPath("lwjgl-opengl")
        val backup = victim.resolveSibling(victim.fileName.toString() + ".bak")
        Files.copy(victim, backup, StandardCopyOption.REPLACE_EXISTING)
        try {
            Files.newOutputStream(victim, java.nio.file.StandardOpenOption.APPEND).use {
                it.write("tampered".toByteArray())
            }
            val second = extractor.ensureExtracted(allJars(), natives)
            assertFalse("篡改后应重新解压", second.cached)
            assertEquals(ARTIFACTS.map { it.soName }.sorted(), second.extracted.map { it.substringAfterLast('/') }.sorted())
        } finally {
            Files.copy(backup, victim, StandardCopyOption.REPLACE_EXISTING)
            Files.delete(backup)
        }
        // 还原后 sha 与清单（记录的是篡改版）不符 → 先重解压一次，再命中缓存
        assertFalse(extractor.ensureExtracted(allJars(), natives).cached)
        assertTrue(extractor.ensureExtracted(allJars(), natives).cached)
    }

    @Test
    fun test5_wrongAbiSkipsUpstreamArm64Layout() {
        provisionJars()
        val natives = cacheDir.resolve("natives-e2e-x64")
        val result = NativeLibraryExtractor(abi = "x86_64").ensureExtracted(allJars(), natives)

        // 这些 jar 只有 linux/arm64 段，x86_64 目标应一条不取
        assertTrue(result.extracted.isEmpty())
        assertTrue(
            Files.list(natives).use { it.filter { p -> p.toString().endsWith(".so") }.count() } == 0L,
        )
    }
}
