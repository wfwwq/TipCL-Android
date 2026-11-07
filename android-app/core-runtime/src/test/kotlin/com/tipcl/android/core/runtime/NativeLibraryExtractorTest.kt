package com.tipcl.android.core.runtime

import java.nio.file.Files
import java.nio.file.Path
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class NativeLibraryExtractorTest {

    private fun tempDir(tag: String): Path =
        Files.createTempDirectory("natives-$tag")

    /** 构造假 jar：path->content。 */
    private fun makeJar(target: Path, entries: Map<String, ByteArray>): Path {
        Files.newOutputStream(target).use { raw ->
            ZipOutputStream(raw).use { zip ->
                entries.forEach { (name, content) ->
                    zip.putNextEntry(ZipEntry(name))
                    zip.write(content)
                    zip.closeEntry()
                }
            }
        }
        return target
    }

    @Test
    fun extractsCurrentAbiAndGlobalSo() {
        val dir = tempDir("extract")
        val natives = dir.resolve("natives")
        val jar = makeJar(dir.resolve("lwjgl.jar"), mapOf(
            "META-INF/MANIFEST.MF" to "manifest".toByteArray(),
            "lib/arm64-v8a/liblwjgl.so" to byteArrayOf(1, 2, 3),
            "lib/x86_64/liblwjgl.so" to byteArrayOf(9, 9),
            "liblwjgl_global.so" to byteArrayOf(4, 5),
        ))

        val result = NativeLibraryExtractor(abi = "arm64-v8a").ensureExtracted(listOf(jar), natives)

        assertFalse(result.cached)
        assertTrue(Files.isRegularFile(natives.resolve("liblwjgl.so")))
        assertTrue(Files.isRegularFile(natives.resolve("liblwjgl_global.so")))
        assertFalse(Files.exists(natives.resolve("lib/x86_64")))
        assertTrue(Files.readAllBytes(natives.resolve("liblwjgl.so")).contentEquals(byteArrayOf(1, 2, 3)))
    }

    @Test
    fun secondCallSkipsWhenEverythingInPlace() {
        val dir = tempDir("cache")
        val natives = dir.resolve("natives")
        val jar = makeJar(dir.resolve("n.jar"), mapOf(
            "lib/arm64-v8a/liba.so" to "aaa".toByteArray(),
        ))
        val extractor = NativeLibraryExtractor(abi = "arm64-v8a")

        extractor.ensureExtracted(listOf(jar), natives)
        val second = extractor.ensureExtracted(listOf(jar), natives)

        assertTrue(second.cached)
        assertTrue(second.extracted.isEmpty())
        assertTrue(Files.isRegularFile(natives.resolve("liba.so")))
    }

    @Test
    fun changedJarReextracts() {
        val dir = tempDir("reextract")
        val natives = dir.resolve("natives")
        val jar = dir.resolve("n.jar")
        makeJar(jar, mapOf("lib/arm64-v8a/liba.so" to "v1".toByteArray()))
        val extractor = NativeLibraryExtractor(abi = "arm64-v8a")

        extractor.ensureExtracted(listOf(jar), natives)
        // 同路径重写不同内容（模拟构件更新）
        makeJar(jar, mapOf("lib/arm64-v8a/liba.so" to "v2-longer".toByteArray()))
        val second = extractor.ensureExtracted(listOf(jar), natives)

        assertFalse(second.cached)
        assertTrue(Files.readAllBytes(natives.resolve("liba.so")).contentEquals("v2-longer".toByteArray()))
    }

    @Test
    fun missingExtractedFileBreaksCache() {
        val dir = tempDir("missing")
        val natives = dir.resolve("natives")
        val jar = makeJar(dir.resolve("n.jar"), mapOf("lib/arm64-v8a/liba.so" to "aaa".toByteArray()))
        val extractor = NativeLibraryExtractor(abi = "arm64-v8a")

        extractor.ensureExtracted(listOf(jar), natives)
        Files.delete(natives.resolve("liba.so"))
        val second = extractor.ensureExtracted(listOf(jar), natives)

        assertFalse(second.cached)
        assertTrue(Files.isRegularFile(natives.resolve("liba.so")))
    }

    @Test
    fun corruptJarThrowsNativeExtractException() {
        val dir = tempDir("corrupt")
        val natives = dir.resolve("natives")
        val bad = dir.resolve("bad.jar")
        Files.write(bad, "not a zip at all".toByteArray())

        val e = assertFailsWith<NativeLibraryExtractor.NativeExtractException> {
            NativeLibraryExtractor(abi = "arm64-v8a").ensureExtracted(listOf(bad), natives)
        }
        assertTrue(e.message!!.contains("bad.jar"))
    }

    @Test
    fun missingJarFileThrows() {
        val dir = tempDir("nofile")
        val e = assertFailsWith<NativeLibraryExtractor.NativeExtractException> {
            NativeLibraryExtractor(abi = "x86_64")
                .ensureExtracted(listOf(dir.resolve("gone.jar")), dir.resolve("natives"))
        }
        assertTrue(e.message!!.contains("不存在"))
    }

    @Test
    fun nameConflictLaterJarOverwrites() {
        val dir = tempDir("conflict")
        val natives = dir.resolve("natives")
        val jar1 = makeJar(dir.resolve("a.jar"), mapOf("lib/arm64-v8a/libdup.so" to "one".toByteArray()))
        val jar2 = makeJar(dir.resolve("b.jar"), mapOf("lib/arm64-v8a/libdup.so" to "two!!".toByteArray()))

        NativeLibraryExtractor(abi = "arm64-v8a").ensureExtracted(listOf(jar1, jar2), natives)

        assertTrue(Files.readAllBytes(natives.resolve("libdup.so")).contentEquals("two!!".toByteArray()))
    }

    @Test
    fun osArchMapping() {
        assertEquals("arm64-v8a", NativeLibraryExtractor.fromOsArch("aarch64"))
        assertEquals("x86_64", NativeLibraryExtractor.fromOsArch("amd64"))
        assertEquals("armeabi-v7a", NativeLibraryExtractor.fromOsArch("armv7l"))
        assertEquals("x86", NativeLibraryExtractor.fromOsArch("i686"))
    }

    @Test
    fun upstreamArchAliasSegmentsFilterByAbi() {
        // LWJGL natives jar 的真实布局：linux/arm64/org/lwjgl/liblwjgl.so
        val dir = tempDir("alias")
        val jar = makeJar(dir.resolve("lwjgl.jar"), mapOf(
            "linux/arm64/org/lwjgl/liblwjgl.so" to "arm64".toByteArray(),
            "linux/x86_64/org/lwjgl/liblwjgl.so" to "x64".toByteArray(),
        ))

        val arm = NativeLibraryExtractor(abi = "arm64-v8a")
            .ensureExtracted(listOf(jar), dir.resolve("n-arm"))
        assertEquals(listOf("linux/arm64/org/lwjgl/liblwjgl.so"), arm.extracted)

        val x64 = NativeLibraryExtractor(abi = "x86_64")
            .ensureExtracted(listOf(jar), dir.resolve("n-x64"))
        assertEquals(listOf("linux/x86_64/org/lwjgl/liblwjgl.so"), x64.extracted)
    }

    @Test
    fun manifestRecordsEntries() {
        val dir = tempDir("manifest")
        val natives = dir.resolve("natives")
        val jar = makeJar(dir.resolve("n.jar"), mapOf("lib/x86_64/libx.so" to "xyz".toByteArray()))

        NativeLibraryExtractor(abi = "x86_64").ensureExtracted(listOf(jar), natives)
        val manifest = natives.resolve(".natives_manifest.properties")
        val props = java.util.Properties()
        Files.newInputStream(manifest).use { props.load(it) }

        assertEquals("x86_64", props.getProperty("abi"))
        assertEquals("lib/x86_64/libx.so", props.getProperty("entry.0"))
        assertEquals("libx.so", props.getProperty("target.0"))
    }
}
