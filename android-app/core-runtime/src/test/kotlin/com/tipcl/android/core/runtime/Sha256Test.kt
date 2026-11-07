package com.tipcl.android.core.runtime

import java.nio.file.Files
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class Sha256Test {

    @get:Rule
    val tmp = TemporaryFolder()

    @Test
    fun `known digest of empty input`() {
        assertEquals(
            "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855",
            Sha256.bytes(ByteArray(0)),
        )
    }

    @Test
    fun `file digest matches stream digest`() {
        val f = tmp.newFile("a.bin")
        f.writeBytes(ByteArray(70000) { (it % 251).toByte() }) // 跨 64k 缓冲块
        assertEquals(Sha256.bytes(f.readBytes()), Sha256.ofFile(f.toPath()))
    }

    @Test
    fun `verify passes on matching digest`() {
        val f = tmp.newFile("b.bin")
        val data = "tipcl".toByteArray()
        f.writeBytes(data)
        Sha256.verify(f.toPath(), Sha256.bytes(data)) // 不抛即通过
    }

    @Test
    fun `verify failure path raises ChecksumMismatchException with expected and actual`() {
        val f = tmp.newFile("c.bin")
        f.writeBytes("corrupted".toByteArray())
        val ex = assertThrows(Sha256.ChecksumMismatchException::class.java) {
            Sha256.verify(f.toPath(), "deadbeef".repeat(8))
        }
        assertEquals("deadbeef".repeat(8), ex.expected)
        assertEquals(Sha256.bytes("corrupted".toByteArray()), ex.actual)
    }

    @Test
    fun `hex is lowercase fixed width`() {
        val hex = Sha256.bytes("x".toByteArray())
        assertEquals(64, hex.length)
        assertEquals(hex, hex.lowercase())
    }

    @Test
    fun `selector picks first source matching major and arch`() {
        val sources = listOf(
            RuntimeSource("https://a/jre17-x64.tar.gz", "0".repeat(64), 17, "x86_64", "tar.gz"),
            RuntimeSource("https://a/jre17-arm.tar.gz", "1".repeat(64), 17, "aarch64", "tar.gz"),
            RuntimeSource("https://a/jre21-arm.tar.gz", "2".repeat(64), 21, "aarch64", "zip"),
        )
        val pick = RuntimeSourceSelector.select(sources, 17, "aarch64")
        assertEquals("https://a/jre17-arm.tar.gz", pick!!.url)

        assertEquals("https://a/jre21-arm.tar.gz", RuntimeSourceSelector.select(sources, 21, "aarch64")!!.url)
        assertNull(RuntimeSourceSelector.select(sources, 8, "aarch64"))
        assertNull(RuntimeSourceSelector.select(sources, 17, "armv7"))
    }

    @Test
    fun `selector arch match is case insensitive`() {
        val sources = listOf(RuntimeSource("u", "0".repeat(64), 17, "AArch64", "tar.gz"))
        assertEquals("u", RuntimeSourceSelector.select(sources, 17, "aarch64")!!.url)
    }
}

class LocalRuntimeCatalogTest {

    @get:Rule
    val tmp = TemporaryFolder()

    private fun makeJavaHome(home: java.nio.file.Path, unixBin: Boolean = true): java.nio.file.Path {
        val bin = home.resolve("bin")
        Files.createDirectories(bin)
        if (unixBin) Files.write(bin.resolve("java"), byteArrayOf(0x7f, 0x45, 0x4c, 0x46))
        else Files.write(bin.resolve("java.exe"), byteArrayOf(0x4d, 0x5a))
        Files.write(home.resolve("release"), "JAVA_VERSION=\"17.0.2\"".toByteArray())
        return home
    }

    @Test
    fun `list returns sorted provisioned majors only`() {
        val appData = tmp.newFolder("app").toPath()
        val catalog = LocalRuntimeCatalog(appData)
        Files.createDirectories(catalog.homeFor(21)).also { makeJavaHome(it) }
        Files.createDirectories(catalog.homeFor(8)).also { makeJavaHome(it) }
        Files.createDirectories(catalog.homeFor(17)) // 空 → 损坏
        Files.createDirectories(appData.resolve("jre").resolve("junk")) // 非数字 → 忽略

        val listed = catalog.list()
        assertEquals(listOf(8, 21), listed.map { it.majorVersion })
    }

    @Test
    fun `cleanupCorrupt removes numeric dirs without java and keeps valid ones`() {
        val appData = tmp.newFolder("app2").toPath()
        val catalog = LocalRuntimeCatalog(appData)
        val valid = Files.createDirectories(catalog.homeFor(17)).also { makeJavaHome(it) }
        val broken = Files.createDirectories(catalog.homeFor(8))
        val staging = Files.createDirectories(catalog.jreRoot.resolve(".staging").resolve("17-1"))

        val removed = catalog.cleanupCorrupt()
        assertTrue(broken in removed)
        assertTrue(!Files.exists(broken))
        assertTrue(!Files.exists(staging))
        assertTrue(Files.exists(valid))
        assertTrue(catalog.provisioned(17) != null)
    }

    @Test
    fun `parseJavaVersionMajor handles modern and legacy formats`() {
        assertEquals(17, LocalRuntimeCatalog.parseJavaVersionMajor(
            "openjdk version \"17.0.2\" 2022-01-18\nOpenJDK Runtime Environment ..."))
        assertEquals(21, LocalRuntimeCatalog.parseJavaVersionMajor("openjdk version \"21.0.1\""))
        assertEquals(8, LocalRuntimeCatalog.parseJavaVersionMajor("java version \"1.8.0_392\""))
        assertNull(LocalRuntimeCatalog.parseJavaVersionMajor("no version here"))
    }
}
