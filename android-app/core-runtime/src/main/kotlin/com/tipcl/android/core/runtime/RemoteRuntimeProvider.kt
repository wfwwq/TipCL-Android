package com.tipcl.android.core.runtime

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.util.zip.ZipInputStream

/**
 * 一个可下载的 JRE 分发源描述。
 *
 * @param url          压缩包直链（http/https，允许重定向）
 * @param sha256       包内压缩档的十六进制 sha256（下载完整性硬校验）
 * @param majorVersion 供应的 Java major 版本（如 17、21）
 * @param arch         目标 CPU 架构，如 "aarch64"、"x86_64"
 * @param format       压缩格式："zip" 或 "tar.gz"
 */
data class RuntimeSource(
    val url: String,
    val sha256: String,
    val majorVersion: Int,
    val arch: String,
    val format: String,
)

/**
 * 按 (majorVersion, arch) 从 [RuntimeSource] 清单选择下载源。
 * 列表顺序即优先级：取第一个同时匹配 major 与 arch 的源。
 */
object RuntimeSourceSelector {
    fun select(sources: List<RuntimeSource>, majorVersion: Int, arch: String): RuntimeSource? =
        sources.firstOrNull { it.majorVersion == majorVersion && it.arch.equals(arch, ignoreCase = true) }
}

/**
 * JavaRuntimeProvider 的远程供给实现：
 *
 * - 从构造注入的 [sources] 清单按 major/arch 选择源；
 * - 下载到 `<jreRoot>/archives/<major>.<format>`（先写 `.part`，支持断点续传 Range）；
 * - sha256 硬校验（不通过即删除归档并抛错，绝不落地解包）；
 * - 按扩展名解包（zip → java.util.zip；tar.gz → 自研 [TarExtractor]），
 *   剔除发布包公共顶层目录，落地到 `<jreRoot>/<major>/`；
 * - 可执行位：tar 包内 mode 位会被记录并在解包后统一 chmod（见 [ExecPostProcessor]）；
 *   zip 包无法携带 mode，统一对 `bin/` post-process；
 * - 扫描/校验复用 [catalog]（LocalRuntimeCatalog），已就绪则零下载。
 *
 * 线程约定：provision 不做并发去重，调用方保证同一 major 不并发供给
 * （App 侧单一供给协程即可）。
 */
class RemoteRuntimeProvider(
    private val catalog: LocalRuntimeCatalog,
    private val sources: List<RuntimeSource>,
    private val arch: String,
    private val execPostProcessor: ExecPostProcessor = Companion.CHMOD,
) : JavaRuntimeProvider {

    /** 解包完成后为可执行文件补位/修正可执行位的策略。 */
    fun interface ExecPostProcessor {
        /** @return 是否成功（false 不阻断，仅记录——校验逻辑会再探测 java 可用性）。 */
        fun postProcess(home: Path): Boolean
    }

    companion object {
        /** Android/POSIX 默认实现：对 `bin` 目录递归 chmod 755。
         *  java.nio 的 POSIX view 在 Android 上抛 UnsupportedOperationException，
         *  因此走 toybox chmod。 */
        val CHMOD = ExecPostProcessor { home ->
            val bin = home.resolve("bin")
            if (!Files.isDirectory(bin)) return@ExecPostProcessor false
            try {
                val p = ProcessBuilder("chmod", "-R", "755", bin.toString())
                    .redirectErrorStream(true)
                    .start()
                p.waitFor() == 0
            } catch (e: IOException) {
                false
            }
        }

        /** Windows 桌面调试：无需 chmod。 */
        val NOOP = ExecPostProcessor { true }
    }

    override fun list(): List<JavaRuntimeProvider.ProvisionedRuntime> = catalog.list()

    override fun provision(majorVersion: Int): Path {
        catalog.provisioned(majorVersion)?.let { return it }
        val source = RuntimeSourceSelector.select(sources, majorVersion, arch)
            ?: throw IOException("no RuntimeSource for major=$majorVersion arch=$arch; " +
                "available=${sources.map { "${it.majorVersion}/${it.arch}" }}")
        return provisionFrom(source)
    }

    /** 从指定源供给（供重试/手动指定场景）。 */
    fun provisionFrom(source: RuntimeSource): Path {
        val target = catalog.homeFor(source.majorVersion)
        Files.createDirectories(target)

        val ext = if (source.format.equals("zip", ignoreCase = true)) "zip" else "tar.gz"
        val archive = catalog.jreRoot.resolve("archives").resolve("${source.majorVersion}.${ext}")
        downloadWithResume(source.url, archive)

        try {
            Sha256.verify(archive, source.sha256)
        } catch (e: Sha256.ChecksumMismatchException) {
            Files.deleteIfExists(archive) // 坏包不落地复用
            throw e
        }

        val staging = catalog.jreRoot.resolve(".staging")
            .resolve("${source.majorVersion}-${System.nanoTime()}")
        Files.createDirectories(staging)
        try {
            unpack(archive, source.format, staging)
            execPostProcessor.postProcess(staging)
            if (!LocalRuntimeCatalog.looksValid(staging)) {
                throw IOException("unpacked JRE at $staging has no bin/java")
            }
            // 原子替换：目标若存在（半成品/损坏）先清掉
            target.toFile().deleteRecursively()
            Files.move(staging, target, StandardCopyOption.ATOMIC_MOVE)
            return target
        } finally {
            staging.toFile().deleteRecursively()
        }
    }

    /**
     * 带断点续传的下载：先检查 `<archive>.part` 已有字节数，发 `Range: bytes=n-`；
     * 服务器 206 → 追加；200（不支持 Range 或归档被清理）→ 截断重下。
     * 最多 [maxRetries] 次重试网络中断。
     */
    fun downloadWithResume(url: String, dest: Path, maxRetries: Int = 3): Path {
        Files.createDirectories(dest.parent)
        val part = dest.resolveSibling(dest.fileName.toString() + ".part")
        var attempt = 0
        while (true) {
            val offset = if (Files.isRegularFile(part)) Files.size(part) else 0L
            val conn = URL(url).openConnection() as HttpURLConnection
            try {
                conn.connectTimeout = 30_000
                conn.readTimeout = 60_000
                conn.instanceFollowRedirects = true
                if (offset > 0) conn.setRequestProperty("Range", "bytes=$offset-")
                val code = conn.responseCode
                when {
                    code == 206 -> {
                        // 续传：追加
                        Files.newByteChannel(
                            part,
                            java.nio.file.StandardOpenOption.WRITE,
                            java.nio.file.StandardOpenOption.APPEND,
                        ).use { ch ->
                            conn.inputStream.use { input -> input.copyTo(java.nio.channels.Channels.newOutputStream(ch)) }
                        }
                    }
                    code in 200..299 -> {
                        // 全量（可能是服务器忽略 Range）
                        if (offset > 0) {
                            // 若服务器实际返回的是剩余内容，无法区分 → 保守全量重下
                        }
                        conn.inputStream.use { input ->
                            Files.newOutputStream(part, java.nio.file.StandardOpenOption.CREATE,
                                java.nio.file.StandardOpenOption.TRUNCATE_EXISTING).use { out -> input.copyTo(out) }
                        }
                    }
                    code == 416 -> {
                        // Range 起点超长（.part 已完整或脏数据）→ 重下
                        Files.deleteIfExists(part)
                        attempt++
                        if (attempt > maxRetries) throw IOException("download failed after $maxRetries retries (416)")
                        continue
                    }
                    else -> throw IOException("download HTTP $code for $url")
                }
            } catch (e: IOException) {
                attempt++
                if (attempt > maxRetries) throw IOException("download failed after $maxRetries retries: $url (last: $e)", e)
                // 直连源不稳（GitHub 常见连接超时），退避后再试；.part 保留已有字节
                try { Thread.sleep(attempt * 3_000L) } catch (_: InterruptedException) {}
                continue
            } finally {
                conn.disconnect()
            }
            Files.move(part, dest, java.nio.file.StandardCopyOption.REPLACE_EXISTING)
            return dest
        }
    }

    private fun unpack(archive: Path, format: String, targetDir: Path) {
        when {
            format.equals("zip", ignoreCase = true) ->
                Files.newInputStream(archive).use { raw ->
                    ZipInputStream(raw.buffered(), Charsets.UTF_8).use { zip ->
                        val names = mutableListOf<String>()
                        while (true) {
                            val e = zip.nextEntry ?: break
                            if (!e.isDirectory) {
                                val rel = ArchiveLayout.stripTop(e.name)
                                if (rel.isNotEmpty()) {
                                    val out = targetDir.resolve(rel)
                                    Files.createDirectories(out.parent)
                                    Files.copy(zip, out, StandardCopyOption.REPLACE_EXISTING)
                                    names += rel
                                }
                            }
                            zip.closeEntry()
                        }
                    }
                }
            format.equals("tar.gz", ignoreCase = true) || format.equals("tgz", ignoreCase = true) ->
                Files.newInputStream(archive).use { raw ->
                    java.util.zip.GZIPInputStream(raw.buffered()).use { gz ->
                        TarExtractor.extract(gz, targetDir, stripLeadingDir = true)
                    }
                }
            else -> throw IOException("unsupported archive format: $format")
        }
    }
}

/** 归档顶层目录剥离规则（zip/tar 共用）。 */
private object ArchiveLayout {
    fun stripTop(name: String): String {
        val normalized = name.replace('\\', '/').trimStart('/')
        val idx = normalized.indexOf('/')
        return if (idx < 0) "" else normalized.substring(idx + 1)
    }
}
