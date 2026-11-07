package com.tipcl.android.core.runtime

import java.io.EOFException
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path

/**
 * 纯 Kotlin 的 tar 流解析/解包器，无第三方依赖。
 *
 * 支持面：
 * - classic tar（name 字段 100 字节）
 * - ustar：`prefix` 字段拼接（345 偏移）
 * - GNU 长文件名：typeflag 'L'（`././@LongLink`，下一个 entry 的真实 name 在其数据中）
 * - GNU 长链接名：typeflag 'K'（读出后丢弃，本工程不处理 symlink 内容）
 * - PAX 头：typeflag 'x'（解析 `path=` 记录覆盖下一个 entry 的名字；其余记录忽略）
 * - 大文件 base-256 编码的 size 字段
 *
 * 不支持（显式拒绝而非静默出错）：typeflag '1'-'6' 中的硬链接/符号链接按普通
 * 数据跳过处理（本工程 JRE 分发包内不依赖 symlink；若遇到 symlink 记录仅跳过）。
 */
object TarExtractor {

    const val BLOCK_SIZE = 512

    class TarException(message: String) : IOException(message)

    data class TarEntry(
        val name: String,
        val typeFlag: Byte,
        val size: Long,
        /** 八进制字符串形式的权限位，如 "100755"（含文件类型位）。 */
        val mode: String,
        val isDirectory: Boolean,
        val isExecutableFile: Boolean,
        /** 硬链接('1')/符号链接('2')记录：不落盘，仅记录名字。 */
        val isLink: Boolean = false,
    )

    /**
     * 解析并解包 tar 流到 [targetDir]（必须已存在）。
     *
     * @param stripLeadingDir 若 true，剔除所有 entry 的公共顶层目录
     *   （发布包常见布局 `jdk-17.0.x/...`），使内容直接落在 targetDir 下。
     * @return 解出的 entry 列表（名字已应用 strip/长名规则）。
     */
    fun extract(input: InputStream, targetDir: Path, stripLeadingDir: Boolean = false): List<TarEntry> {
        val header = ByteArray(BLOCK_SIZE)
        val entries = mutableListOf<TarEntry>()
        var gnuNextName: String? = null
        var paxNextPath: String? = null
        var sawAnyEntry = false

        while (true) {
            if (!readFully(input, header)) {
                if (sawAnyEntry) break // 流在数据块边界结束，容忍
                throw TarException("empty tar stream")
            }
            if (isZeroBlock(header)) {
                if (sawAnyEntry) break
                throw TarException("tar stream starts with a zero block")
            }
            sawAnyEntry = true
            verifyChecksum(header)

            val rawName = readString(header, 0, 100)
            val mode = readString(header, 100, 8)
            val size = readSize(header, 124, 12)
            val typeFlag = header[156]
            val magic = readString(header, 257, 6)
            val prefix = if (magic.startsWith("ustar")) readString(header, 345, 155) else ""

            when (typeFlag) {
                'L'.code.toByte() -> { // GNU long name
                    val data = ByteArray(size.toInt())
                    readFully(input, data) || throw TarException("truncated GNU long name entry")
                    skipPadding(input, size)
                    gnuNextName = data.toString(Charsets.UTF_8).trimEnd('\u0000')
                    continue
                }
                'K'.code.toByte() -> { // GNU long link target — 跳过数据
                    skipFully(input, size)
                    skipPadding(input, size)
                    continue
                }
                'x'.code.toByte(), 'X'.code.toByte() -> { // PAX extended header
                    val data = ByteArray(size.toInt())
                    readFully(input, data) || throw TarException("truncated PAX header entry")
                    skipPadding(input, size)
                    paxNextPath = parsePaxPath(data)
                    continue
                }
            }

            var name = gnuNextName ?: paxNextPath ?: rawName
            gnuNextName = null
            paxNextPath = null
            if (prefix.isNotEmpty() && name == rawName) name = "$prefix/$name"

            val isDir = typeFlag == '5'.code.toByte() || name.endsWith("/")
            val isLink = typeFlag == '1'.code.toByte() || typeFlag == '2'.code.toByte()
            val finalName = (if (stripLeadingDir) stripTopComponent(name) else name)
                .trimStart('/')
            // 记录的 entry 名与落盘布局一致（strip 已应用），executableRelPaths
            // 的消费方（chmod 后处理）按落地相对路径匹配。
            val entry = TarEntry(
                name = finalName,
                typeFlag = typeFlag,
                size = size,
                mode = mode,
                isDirectory = isDir,
                isExecutableFile = !isDir && !isLink && isModeExecutable(mode),
                isLink = isLink,
            )
            entries += entry

            if (isLink) {
                // 链接记录不落盘：其数据（若有）只是链接目标字符串，写出去会
                // 产生内容为路径文本的伪文件（Temurin 包内 legal/ 全是 symlink）。
                skipFully(input, size)
                skipPadding(input, size)
                continue
            }

            if (finalName.isNotEmpty() && finalName != ".") {
                val outPath = targetDir.resolve(finalName)
                if (isDir) {
                    Files.createDirectories(outPath)
                } else {
                    Files.createDirectories(outPath.parent)
                    Files.newOutputStream(outPath).use { out -> copyLimited(input, out, size) }
                }
            } else {
                skipFully(input, size)
            }
            skipPadding(input, size)
        }
        return entries
    }

    /** 从 entry 列表收集"应具备可执行位的相对路径"（Android 侧 post-process 用）。 */
    fun executableRelPaths(entries: List<TarEntry>): List<String> =
        entries.filter { it.isExecutableFile }.map { it.name.trimStart('/') }

    private fun isModeExecutable(mode: String): Boolean {
        // "0007550"（七位带尾零）或 "100755" 等变体：取低 9 位判断 x 位
        val v = mode.toLongOrNull(8) ?: return false
        val low9 = (v and 0b111_111_111L).toInt()
        return (low9 and 0b001_001_001) != 0
    }

    private fun parsePaxPath(data: ByteArray): String? {
        // 记录格式："<len> <key>=<value>\n"
        var i = 0
        val text = data.toString(Charsets.UTF_8)
        while (i < text.length) {
            val sp = text.indexOf(' ', i)
            if (sp < 0) break
            val len = text.substring(i, sp).toIntOrNull() ?: break
            if (len <= 0) break
            val record = text.substring(sp + 1, (i + len).coerceAtMost(text.length)).trimEnd('\n')
            if (record.startsWith("path=")) return record.removePrefix("path=")
            i += len
        }
        return null
    }

    private fun stripTopComponent(name: String): String {
        val normalized = name.trimStart('/')
        val idx = normalized.indexOf('/')
        return if (idx < 0) "" else normalized.substring(idx + 1)
    }

    private fun verifyChecksum(header: ByteArray) {
        val stored = readString(header, 148, 8).trim('\u0000', ' ').toLongOrNull(8)
            ?: throw TarException("malformed tar checksum field")
        val computed = header.foldIndexed(0L) { i, acc, b ->
            acc + (if (i in 148..155) ' '.code else b.toInt() and 0xFF)
        }
        if (stored != computed) throw TarException("tar header checksum mismatch")
    }

    private fun readSize(header: ByteArray, off: Int, len: Int): Long {
        // base-256（GNU 大文件）：最高字节为 0x80 前缀
        if (header[off].toInt() and 0xFF == 0x80) {
            var v = 0L
            for (i in off + 1 until off + len) v = (v shl 8) or (header[i].toLong() and 0xFF)
            return v
        }
        return readString(header, off, len).trim('\u0000', ' ').toLongOrNull(8)
            ?: throw TarException("malformed tar size field")
    }

    private fun readString(buf: ByteArray, off: Int, len: Int): String {
        var end = off
        val max = off + len
        while (end < max && buf[end] != 0.toByte()) end++
        return String(buf, off, end - off, Charsets.UTF_8)
    }

    private fun isZeroBlock(buf: ByteArray): Boolean = buf.all { it == 0.toByte() }

    private fun readFully(input: InputStream, buf: ByteArray): Boolean {
        var read = 0
        while (read < buf.size) {
            val n = input.read(buf, read, buf.size - read)
            if (n < 0) return read > 0
            read += n
        }
        return true
    }

    /** tar 数据块按 512 对齐：读完 size 字节后跳过补齐的 padding。 */
    private fun skipPadding(input: InputStream, size: Long) {
        val pad = ((512 - (size % 512)) % 512).toInt()
        if (pad > 0) skipFully(input, pad.toLong())
    }

    private fun skipFully(input: InputStream, count: Long) {
        var remaining = count
        val scratch = ByteArray(8192)
        while (remaining > 0) {
            val n = input.read(scratch, 0, minOf(scratch.size.toLong(), remaining).toInt())
            if (n < 0) throw EOFException("unexpected EOF in tar data")
            remaining -= n
        }
    }

    private fun copyLimited(input: InputStream, out: java.io.OutputStream, count: Long) {
        var remaining = count
        val scratch = ByteArray(8192)
        while (remaining > 0) {
            val n = input.read(scratch, 0, minOf(scratch.size.toLong(), remaining).toInt())
            if (n < 0) throw EOFException("unexpected EOF in tar data")
            out.write(scratch, 0, n)
            remaining -= n
        }
    }
}
