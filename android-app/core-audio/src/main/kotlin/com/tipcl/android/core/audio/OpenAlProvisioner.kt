package com.tipcl.android.core.audio

import java.io.File
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.security.MessageDigest

/**
 * 一个 OpenAL Soft 安卓预编译产物的下载源描述。
 *
 * @param url        归档直链（zip；http/https，允许重定向）
 * @param sha256     归档十六进制 sha256（下载完整性硬校验，不通过绝不落地）
 * @param abi        目标 ABI，"arm64-v8a" / "x86_64" / "armeabi-v7a" / "x86"
 * @param version    上游版本标识（仅诊断/清单管理用，如 "1.23.1"）
 */
data class OpenAlSource(
    val url: String,
    val sha256: String,
    val abi: String,
    val version: String,
)

/**
 * 本地 OpenAL 产物目录清单骨架：扫描 nativeLibDir、按 ABI 归位、
 * 记录已就绪产物（含 sha256），配合 [OpenAlProvisioner] 实现"已就绪零下载"。
 *
 * M3 骨架：只做文件存在性 + 可配置的 so 名约定（libopenal.so / libsoft_oal.so），
 * 真正的逐文件 sha256 台账落库留真机联调后（记录到 catalog.json）。
 */
class LocalOpenAlCatalog(private val root: Path) {

    /** 一个已就绪的本地 OpenAL 产物（abi 目录下的关键 so）。 */
    data class Entry(val abi: String, val soName: String, val file: File)

    fun abiDir(abi: String): Path = root.resolve(abi)

    /**
     * 查询某 ABI 是否已就绪：`<root>/<abi>/<soName>` 存在且非空。
     * soName 按候选顺序探测（openal-soft 官方产物名 libopenal.so，
     * 部分打包重命名为 libsoft_oal.so）。
     */
    fun findReady(abi: String): Entry? {
        val dir = abiDir(abi).toFile()
        for (name in SO_NAME_CANDIDATES) {
            val f = File(dir, name)
            if (f.isFile && f.length() > 0) return Entry(abi, name, f)
        }
        return null
    }

    companion object {
        val SO_NAME_CANDIDATES = listOf("libopenal.so", "libsoft_oal.so")
    }
}

class OpenAlProvisionException(message: String, cause: Throwable? = null) : IOException(message, cause)

/**
 * OpenAL Soft 供给器（对标 core-runtime 的 JavaRuntimeProvider 模式，但零依赖）：
 *
 * - [sources] 清单按 abi 选择源（顺序即优先级）；
 * - 下载到 `<root>/archives/<abi>.zip`（先写 `.part`，完成后原子 rename）；
 * - sha256 硬校验，不通过删除归档并抛 [OpenAlProvisionException]；
 * - 解包走注入的 [ArchiveExtractor]（core-audio 不依赖 core-runtime）；
 * - 解包目标 `<root>/<abi>/`，已就绪（[LocalOpenAlCatalog.findReady]）则零下载复用。
 *
 * 线程约定：provision 不做并发去重，调用方保证同 ABI 不并发供给。
 *
 * 归档内容约定（写进清单时校验）：包内 lib/<abi>/libopenal.so（或 libsoft_oal.so）。
 * 若上游包顶层目录结构与约定不符，由注入的 extractor 或适配层剥顶层。
 */
class OpenAlProvisioner(
    private val sources: List<OpenAlSource>,
    private val root: Path,
    private val extractor: ArchiveExtractor,
    private val catalog: LocalOpenAlCatalog = LocalOpenAlCatalog(root),
) {

    class ProvisionResult(
        val nativeLibDir: Path,
        val sourceUrl: String?,
        val reusedCache: Boolean,
    )

    fun provision(abi: String): ProvisionResult {
        // 已就绪：直接复用（首启动后续、重试场景）。
        catalog.findReady(abi)?.let {
            return ProvisionResult(it.file.parentFile?.toPath() ?: catalog.abiDir(abi), null, reusedCache = true)
        }

        val source = sources.firstOrNull { it.abi.equals(abi, ignoreCase = true) }
            ?: throw OpenAlProvisionException("no OpenAL source for abi=$abi (catalog has ${sources.map { it.abi }})")

        val archivesDir = root.resolve("archives")
        Files.createDirectories(archivesDir)
        val archive = archivesDir.resolve("$abi.zip")

        downloadVerified(source, archive)

        val abiDir = catalog.abiDir(abi)
        Files.createDirectories(abiDir)
        try {
            extractor.extract(archive, abiDir)
        } catch (e: IOException) {
            throw OpenAlProvisionException("extract failed for abi=$abi from $archive", e)
        }

        val ready = catalog.findReady(abi)
            ?: throw OpenAlProvisionException(
                "archive extracted but no ${LocalOpenAlCatalog.SO_NAME_CANDIDATES} found under $abiDir " +
                    "(check extractor top-level dir stripping)"
            )
        return ProvisionResult(ready.file.parentFile?.toPath() ?: abiDir, source.url, reusedCache = false)
    }

    private fun downloadVerified(source: OpenAlSource, dest: Path) {
        val part = dest.resolveSibling(dest.fileName.toString() + ".part")
        try {
            val conn = URL(source.url).openConnection() as HttpURLConnection
            conn.connectTimeout = 15_000
            conn.readTimeout = 60_000
            conn.instanceFollowRedirects = true
            if (conn.responseCode !in 200..299) {
                throw OpenAlProvisionException("HTTP ${conn.responseCode} for ${source.url}")
            }
            conn.inputStream.use { input ->
                Files.newOutputStream(part).use { out ->
                    val buf = ByteArray(64 * 1024)
                    while (true) {
                        val n = input.read(buf)
                        if (n < 0) break
                        out.write(buf, 0, n)
                    }
                }
            }
            val actual = sha256Hex(part)
            if (!actual.equals(source.sha256, ignoreCase = true)) {
                Files.deleteIfExists(part)
                throw OpenAlProvisionException(
                    "sha256 mismatch for ${source.url}: expected=${source.sha256} actual=$actual"
                )
            }
            Files.move(part, dest, StandardCopyOption.REPLACE_EXISTING)
        } catch (e: OpenAlProvisionException) {
            throw e
        } catch (e: IOException) {
            throw OpenAlProvisionException("download failed: ${source.url}", e)
        } finally {
            Files.deleteIfExists(part)
        }
    }

    private fun sha256Hex(path: Path): String {
        val md = MessageDigest.getInstance("SHA-256")
        Files.newInputStream(path).use { input ->
            val buf = ByteArray(64 * 1024)
            while (true) {
                val n = input.read(buf)
                if (n < 0) break
                md.update(buf, 0, n)
            }
        }
        return md.digest().joinToString("") { "%02x".format(it) }
    }
}
