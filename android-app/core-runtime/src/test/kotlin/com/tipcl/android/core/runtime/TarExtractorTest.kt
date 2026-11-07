package com.tipcl.android.core.runtime

import java.io.ByteArrayOutputStream
import java.nio.file.Files
import java.util.zip.GZIPOutputStream
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import java.util.zip.GZIPInputStream
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

/** 手工拼 512B 头 + 数据的样例字节，验证 ustar / GNU 长名 / PAX 解析。 */
class TarExtractorTest {

    @get:Rule
    val tmp = TemporaryFolder()

    internal class TarBuilder {
        val buf = ByteArrayOutputStream()

        private fun octal(value: Long, width: Int): ByteArray {
            // 宽度含结尾 NUL（tar 惯例）
            val s = "%0${width - 1}o\u0000".format(value)
            return s.toByteArray(Charsets.US_ASCII)
        }

        fun addEntry(name: String, content: ByteArray, mode: String = "0000644", typeFlag: Char = '0') {
            require(name.length <= 100) { "use addLongEntry for names > 100 bytes" }
            addHeader(name, mode, content.size.toLong(), typeFlag)
            buf.write(content)
            pad(content.size.toLong())
        }

        fun addGnuLongName(longName: String) {
            val data = longName.toByteArray(Charsets.UTF_8) + 0
            addHeader("././@LongLink", "0000000", data.size.toLong(), 'L')
            buf.write(data)
            pad(data.size.toLong())
        }

        fun addPaxPathHeader(path: String, name: String = "PaxHeaders/0") {
            // PAX 记录长度自指：<len> " " <record>\n，先估位数再回填
            val body = "path=$path\n"
            var lenDigits = 1
            var total = body.length + 1 + lenDigits
            while (total.toString().length != lenDigits) {
                lenDigits = total.toString().length
                total = body.length + 1 + lenDigits
            }
            val data = "$total $body".toByteArray(Charsets.UTF_8)
            addHeader(name, "0000000", data.size.toLong(), 'x')
            buf.write(data)
            pad(data.size.toLong())
        }

        /** GNU 长名普通文件 entry：LongLink 头 + 真实 entry，中间不插 endmarker。 */
        fun addGnuLongNamedEntry(longName: String, fileContent: ByteArray, mode: String = "0000644") {
            addGnuLongName(longName)
            // 真实 entry 的 header name 填占位（GNU tar 用首字符）
            val header = ByteArray(512)
            System.arraycopy("x".toByteArray(Charsets.US_ASCII), 0, header, 0, 1)
            put(header, 100, 8, "$mode\u0000")
            put(header, 108, 8, "0000000\u0000")
            put(header, 116, 8, "0000000\u0000")
            put(header, 124, 12, octal(fileContent.size.toLong(), 12))
            put(header, 136, 12, octal(0, 12))
            header[156] = '0'.code.toByte()
            put(header, 257, 6, "ustar\u0000")
            put(header, 263, 2, "00")
            fillChecksum(header)
            buf.write(header)
            buf.write(fileContent)
            pad(fileContent.size.toLong())
        }

        fun addUstarPrefixedEntry(prefix: String, name: String, content: ByteArray) {
            val header = ByteArray(512)
            put(header, 0, 100, name)
            put(header, 100, 8, "0000644\u0000")
            put(header, 108, 8, "0000000\u0000")
            put(header, 116, 8, "0000000\u0000")
            put(header, 124, 12, octal(content.size.toLong(), 12))
            put(header, 136, 12, octal(0, 12))
            header[156] = '0'.code.toByte()
            put(header, 257, 6, "ustar\u0000")
            put(header, 263, 2, "00")
            put(header, 345, 155, prefix)
            fillChecksum(header)
            buf.write(header)
            buf.write(content)
            pad(content.size.toLong())
        }

        private fun addHeader(name: String, mode: String, size: Long, typeFlag: Char) {
            val header = ByteArray(512)
            put(header, 0, 100, name)
            put(header, 100, 8, "$mode\u0000")
            put(header, 108, 8, "0000000\u0000")
            put(header, 116, 8, "0000000\u0000")
            put(header, 124, 12, octal(size, 12))
            put(header, 136, 12, octal(0, 12))
            header[156] = typeFlag.code.toByte()
            put(header, 257, 6, "ustar\u0000")
            put(header, 263, 2, "00")
            fillChecksum(header)
            buf.write(header)
        }

        private fun fillChecksum(header: ByteArray) {
            put(header, 148, 8, "        ")
            var sum = 0L
            for (b in header) sum += b.toInt() and 0xFF
            put(header, 148, 7, "%06o\u0000 ".format(sum).toByteArray(Charsets.US_ASCII))
        }

        private fun put(header: ByteArray, off: Int, len: Int, s: String) =
            System.arraycopy(s.toByteArray(Charsets.US_ASCII), 0, header, off, minOf(s.length, len))

        private fun put(header: ByteArray, off: Int, len: Int, bytes: ByteArray) =
            System.arraycopy(bytes, 0, header, off, minOf(bytes.size, len))

        private fun pad(written: Long) {
            val rem = (written % 512).toInt()
            if (rem != 0) buf.write(ByteArray(512 - rem))
        }

        fun endMarker(): ByteArray = ByteArray(1024) // 两个零块

        fun bytes(): ByteArray = buf.toByteArray() + endMarker()
    }

    private fun content(seed: Char, len: Int) = ByteArray(len) { i -> (seed.code + (i % 26)).toByte() }

    @Test
    fun `short name entry extracts content and mode`() {
        val tb = TarBuilder()
        tb.addEntry("hello.txt", content('a', 1000), mode = "0000644")
        val dir = tmp.newFolder("out").toPath()
        val entries = TarExtractor.extract(tb.bytes().inputStream(), dir)

        assertEquals(1, entries.size)
        assertEquals("hello.txt", entries[0].name)
        assertFalse(entries[0].isExecutableFile)
        assertTrue(dir.resolve("hello.txt").readBytes().contentEquals(content('a', 1000)))
    }

    @Test
    fun `symlink entry is skipped not written as pseudo file`() {
        // 复现 Temurin JRE 包内 legal/ 布局：typeflag '2'，数据为链接目标文本
        val tb = TarBuilder()
        tb.addEntry("legal/java.base/LICENSE", content('a', 100))
        tb.addEntry("legal/java.sql/LICENSE", "../java.base/LICENSE".toByteArray(), typeFlag = '2')
        val dir = tmp.newFolder("out-sym").toPath()
        val entries = TarExtractor.extract(tb.bytes().inputStream(), dir)

        assertEquals(2, entries.size)
        assertTrue(entries[1].isLink)
        assertFalse(entries[1].isExecutableFile)
        // 链接记录不得落盘为内容是目标路径的伪文件
        assertFalse(Files.exists(dir.resolve("legal/java.sql/LICENSE")))
        assertTrue(dir.resolve("legal/java.base/LICENSE").toFile().exists())
    }

    @Test
    fun `gnu long name entry above 100 bytes is resolved`() {
        val longName = "jdk-17.0.9+7/lib/modules/" + "x".repeat(140) + "/release" // >100 字节
        assertTrue(longName.length > 100)
        val tb = TarBuilder()
        tb.addGnuLongNamedEntry(longName, content('b', 10))
        val dir = tmp.newFolder("out2").toPath()
        val entries = TarExtractor.extract(tb.bytes().inputStream(), dir)
        assertEquals(1, entries.size)
        assertEquals(longName, entries[0].name)
        assertTrue(dir.resolve(longName).toFile().exists())
    }

    @Test
    fun `ustar prefix field is joined`() {
        val tb = TarBuilder()
        tb.addUstarPrefixedEntry("jdk-21", "bin/java", content('c', 5))
        val dir = tmp.newFolder("out3").toPath()
        val entries = TarExtractor.extract(tb.bytes().inputStream(), dir)
        assertEquals("jdk-21/bin/java", entries[0].name)
        assertFalse(entries[0].isExecutableFile)
    }

    @Test
    fun `pax path record overrides entry name`() {
        val paxPath = "jdk-21/" + "p".repeat(120)
        val tb = TarBuilder()
        tb.addPaxPathHeader(paxPath)
        tb.addEntry("x", content('d', 3))
        val dir = tmp.newFolder("out4").toPath()
        val entries = TarExtractor.extract(tb.bytes().inputStream(), dir)
        assertEquals(paxPath, entries[0].name)
    }

    @Test
    fun `executable mode bit is detected`() {
        val tb = TarBuilder()
        tb.addEntry("bin/java", content('e', 4), mode = "0000755")
        val dir = tmp.newFolder("out5").toPath()
        val entries = TarExtractor.extract(tb.bytes().inputStream(), dir)
        assertTrue(entries[0].isExecutableFile)
        assertEquals(listOf("bin/java"), TarExtractor.executableRelPaths(entries))
    }

    @Test
    fun `corrupt checksum is rejected`() {
        val tb = TarBuilder()
        tb.addEntry("ok.txt", content('f', 3))
        val bytes = tb.bytes()
        bytes[200] = (bytes[200].toInt() xor 0x55).toByte() // 破坏 header 区
        try {
            TarExtractor.extract(bytes.inputStream(), tmp.newFolder("out6").toPath())
            throw AssertionError("expected TarException")
        } catch (e: TarExtractor.TarException) {
            assertTrue(e.message!!.contains("checksum"))
        }
    }

    @Test
    fun `stripLeadingDir removes common top folder`() {
        val tb = TarBuilder()
        tb.addUstarPrefixedEntry("jdk-17", "release", content('g', 2))
        tb.addUstarPrefixedEntry("jdk-17", "bin/java", content('h', 2))
        val dir = tmp.newFolder("out7").toPath()
        val entries = TarExtractor.extract(tb.bytes().inputStream(), dir, stripLeadingDir = true)
        // entry.name 与落盘布局一致（strip 已应用，见 extract() 契约）：
        // executableRelPaths 的消费方（chmod 后处理）按落地相对路径匹配
        assertEquals(listOf("release", "bin/java"), entries.map { it.name })
        assertTrue(Files.exists(dir.resolve("release")))
        assertTrue(Files.exists(dir.resolve("bin/java")))
    }

    @Test
    fun `gzipped tar round-trips through extractor`() {
        val tb = TarBuilder()
        tb.addEntry("a/b.txt", content('i', 7))
        val gz = ByteArrayOutputStream()
        GZIPOutputStream(gz).use { it.write(tb.bytes()) }
        val dir = tmp.newFolder("out8").toPath()
        TarExtractor.extract(GZIPInputStream(gz.toByteArray().inputStream()), dir)
        assertTrue(Files.exists(dir.resolve("a/b.txt")))
    }

    private fun octalFor(value: Long, width: Int): ByteArray =
        "%0${width - 1}o\u0000".format(value).toByteArray(Charsets.US_ASCII)

    private fun checksumAndWrite(header: ByteArray, out: ByteArrayOutputStream) {
        System.arraycopy("        ".toByteArray(), 0, header, 148, 8)
        var sum = 0L
        for (b in header) sum += b.toInt() and 0xFF
        System.arraycopy("%06o\u0000 ".format(sum).toByteArray(), 0, header, 148, 8)
        out.write(header)
    }

    private fun padTo(out: ByteArrayOutputStream, written: Int) {
        val rem = written % 512
        if (rem != 0) out.write(ByteArray(512 - rem))
    }
}
