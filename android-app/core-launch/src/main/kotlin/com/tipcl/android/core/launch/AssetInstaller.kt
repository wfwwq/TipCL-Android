package com.tipcl.android.core.launch

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request
import java.nio.file.Files
import java.nio.file.Path
import java.util.concurrent.Executors
import java.util.concurrent.Semaphore
import java.util.concurrent.TimeUnit

/** 资源索引（asset index JSON）中单个对象条目。 */
@Serializable
data class AssetObject(val hash: String, val size: Long = 0)

/** 资源索引顶层结构：虚拟/映射到 objects。 */
@Serializable
data class AssetIndex(val objects: Map<String, AssetObject>, val virtual: Boolean = false)

/** 单个待下载资源。 */
data class PendingAsset(val path: String, val hash: String, val size: Long)

/** 资源下载结果统计。 */
data class AssetInstallResult(
    /** 成功数。 */
    val ok: Int,
    /** 重试后仍失败的对象（路径 -> 原因），调用方可据此提示或重跑。 */
    val failed: Map<String, String>,
)

/**
 * 资源文件安装器：下载 asset index 并并发下载全部对象文件到
 * `assets/objects/<hash前两位>/<hash>` 的标准布局。
 *
 * 并发由固定线程池 + [Semaphore] 双重限流；每个对象失败自动重试 [maxRetries] 次。
 *
 * @property httpClient OkHttp 客户端
 * @property assetsRoot assets 根目录（通常为实例根/assets）
 * @property assetBaseUrl 资源对象下载 base，默认 Mojang resources，可替换为 BMCLAPI
 * @property concurrency 并发度
 * @property maxRetries 单文件最大重试次数
 */
class AssetInstaller(
    private val httpClient: OkHttpClient,
    private val assetsRoot: Path,
    private val assetBaseUrl: String = MavenRepository.MOJANG_RESOURCES,
    private val concurrency: Int = 8,
    private val maxRetries: Int = 3,
) {

    private val json = Json { ignoreUnknownKeys = true }

    /**
     * 下载并解析 asset index JSON。
     * @param indexUrl VersionSpec.assetIndex.url
     * @param indexSha1 索引本身的 sha1，非空时校验
     */
    fun fetchAssetIndex(indexUrl: String, indexSha1: String? = null): AssetIndex {
        val text = httpGetString(indexUrl)
        if (indexSha1 != null) {
            val actual = sha1Hex(text.toByteArray(Charsets.UTF_8))
            if (!actual.equals(indexSha1, ignoreCase = true)) {
                throw LaunchException("asset index 校验失败: 期望 $indexSha1 实际 $actual")
            }
        }
        return json.decodeFromString(AssetIndex.serializer(), text)
    }

    /** 将索引转为去重的待下载清单（同一 hash 只下载一次）。 */
    fun buildPendingList(index: AssetIndex): List<PendingAsset> =
        index.objects.values
            .distinctBy { it.hash }
            .map { PendingAsset(it.hash, it.hash, it.size) }

    /**
     * 并发下载全部待下载对象。已存在且大小一致（或 sha1 一致）的文件跳过。
     * 阻塞直至全部任务结束。
     */
    fun install(pending: List<PendingAsset>): AssetInstallResult {
        Files.createDirectories(assetsRoot)
        val pool = Executors.newFixedThreadPool(concurrency.coerceAtLeast(1))
        val limiter = Semaphore(concurrency.coerceAtLeast(1))
        val failures = java.util.concurrent.ConcurrentHashMap<String, String>()
        var okCount = java.util.concurrent.atomic.AtomicInteger(0)

        try {
            val futures = pending.map { asset ->
                pool.submit {
                    limiter.acquire()
                    try {
                        if (alreadyPresent(asset)) {
                            okCount.incrementAndGet()
                            return@submit
                        }
                        downloadWithRetry(asset)
                        okCount.incrementAndGet()
                    } catch (e: Exception) {
                        failures[asset.path] = e.message ?: e.javaClass.simpleName
                    } finally {
                        limiter.release()
                    }
                }
            }
            futures.forEach { it.get() }
        } finally {
            pool.shutdown()
            pool.awaitTermination(30, TimeUnit.SECONDS)
        }
        return AssetInstallResult(okCount.get(), failures.toMap())
    }

    /** 资源对象在本地 objects 布局中的目标路径。 */
    fun targetPathFor(hash: String): Path =
        assetsRoot.resolve("objects").resolve(hash.take(2)).resolve(hash)

    /** 官方资源对象 URL：`base/<hash前两位>/<hash>`。 */
    fun urlFor(hash: String): String =
        "${assetBaseUrl.trimEnd('/')}/${hash.take(2)}/$hash"

    private fun alreadyPresent(asset: PendingAsset): Boolean {
        val target = targetPathFor(asset.hash)
        if (!Files.isRegularFile(target)) return false
        val size = Files.size(target)
        return asset.size <= 0 || size == asset.size
    }

    private fun downloadWithRetry(asset: PendingAsset) {
        var lastError: Exception? = null
        repeat(maxRetries.coerceAtLeast(1)) {
            try {
                val target = targetPathFor(asset.hash)
                Files.createDirectories(target.parent)
                val bytes = httpGetBytes(urlFor(asset.hash))
                if (asset.size > 0 && bytes.size.toLong() != asset.size) {
                    throw LaunchException("资源 ${asset.path} 大小不符: 期望 ${asset.size} 实际 ${bytes.size}")
                }
                val tmp = target.resolveSibling(target.fileName.toString() + ".part")
                Files.write(tmp, bytes)
                Files.move(tmp, target, java.nio.file.StandardCopyOption.REPLACE_EXISTING)
                return
            } catch (e: Exception) {
                lastError = e
            }
        }
        throw lastError ?: LaunchException("资源 ${asset.path} 下载失败")
    }

    private fun httpGetString(url: String): String {
        httpClient.newCall(Request.Builder().url(url).build()).execute().use { resp ->
            if (!resp.isSuccessful) throw LaunchException("HTTP ${resp.code} 获取 $url 失败")
            return resp.body?.string() ?: throw LaunchException("获取 $url 返回空响应体")
        }
    }

    private fun httpGetBytes(url: String): ByteArray {
        httpClient.newCall(Request.Builder().url(url).build()).execute().use { resp ->
            if (!resp.isSuccessful) throw LaunchException("HTTP ${resp.code} 获取 $url 失败")
            return resp.body?.bytes() ?: throw LaunchException("获取 $url 返回空响应体")
        }
    }

    private fun sha1Hex(data: ByteArray): String =
        java.security.MessageDigest.getInstance("SHA-1").digest(data)
            .joinToString("") { "%02x".format(it) }
}
