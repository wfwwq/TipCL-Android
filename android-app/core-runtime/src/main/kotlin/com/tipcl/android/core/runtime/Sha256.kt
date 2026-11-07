package com.tipcl.android.core.runtime

import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest

/** 流式 sha256 工具（不整文件进内存）。 */
object Sha256 {

    class ChecksumMismatchException(val expected: String, val actual: String) :
        IOException("sha256 mismatch: expected=$expected actual=$actual")

    private val HEX = "0123456789abcdef".toCharArray()

    fun ofFile(file: Path): String = Files.newInputStream(file).use { ofStream(it) }

    fun ofStream(input: InputStream): String {
        val digest = MessageDigest.getInstance("SHA-256")
        val buf = ByteArray(65536)
        while (true) {
            val n = input.read(buf)
            if (n < 0) break
            digest.update(buf, 0, n)
        }
        return toHex(digest.digest())
    }

    fun bytes(bytes: ByteArray): String =
        toHex(MessageDigest.getInstance("SHA-256").digest(bytes))

    fun toHex(hash: ByteArray): String {
        val sb = StringBuilder(hash.size * 2)
        for (b in hash) {
            sb.append(HEX[(b.toInt() shr 4) and 0xF]).append(HEX[b.toInt() and 0xF])
        }
        return sb.toString()
    }

    /** 校验文件摘要；不一致抛 [ChecksumMismatchException]。expected 大小写不敏感。 */
    fun verify(file: Path, expected: String) {
        val actual = ofFile(file)
        val wanted = expected.trim().lowercase()
        if (actual != wanted) throw ChecksumMismatchException(wanted, actual)
    }
}
