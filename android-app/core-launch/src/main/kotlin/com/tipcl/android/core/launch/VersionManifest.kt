package com.tipcl.android.core.launch

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.time.Instant

/**
 * Mojang `version_manifest_v2.json` 的顶层模型。
 *
 * 对应 piston-meta 端点 `https://piston-meta.mojang.com/mc/game/version_manifest_v2.json`。
 * v2 相比 v1 为每个 [VersionEntry] 增加了 sha1 与 complianceLevel 字段。
 */
@Serializable
data class VersionManifest(
    /** 清单结构版本，官方当前为固定值 2；官方 JSON 实际不回传该字段，反序列化取默认值。 */
    val manifestVersion: Int = 2,
    /** 最新快照版与最新稳定版的 id。 */
    val latest: Latest,
    /** 全部已知版本，按 Mojang 返回顺序（大致为新到旧）。 */
    val versions: List<VersionEntry>,
) {
    /** latest 字段：snapshot / release 两个指针。 */
    @Serializable
    data class Latest(val snapshot: String, val release: String)

    /** 单个版本条目，仅含元数据；详情需再拉取 [url] 指向的版本 JSON。 */
    @Serializable
    data class VersionEntry(
        val id: String,
        val type: String,
        val url: String,
        val time: String,
        val releaseTime: String,
        val sha1: String? = null,
        val complianceLevel: Int = 0,
    )
}

/**
 * 负责拉取、缓存与查询 version_manifest_v2。
 *
 * 缓存策略：首次结果落盘到 [cacheDir]/version_manifest_v2.json，并记录抓取时间；
 * 在 [cacheTtl] 内的后续请求直接读本地文件，过期则重新联网刷新（刷新失败时回退到
 * 过期缓存，保证离线可用）。
 *
 * @property httpClient 用于联网的 OkHttp 客户端
 * @property cacheDir 缓存目录，通常为实例根目录下的 meta 子目录
 * @property manifestUrl 清单 URL，可替换为镜像源
 * @property cacheTtl 缓存有效期，默认 30 分钟
 */
class VersionManifestFetcher(
    private val httpClient: OkHttpClient,
    private val cacheDir: Path,
    private val manifestUrl: String = DEFAULT_MANIFEST_URL,
    private val cacheTtl: java.time.Duration = java.time.Duration.ofMinutes(30),
) {
    companion object {
        const val DEFAULT_MANIFEST_URL =
            "https://piston-meta.mojang.com/mc/game/version_manifest_v2.json"
        private const val CACHE_FILE = "version_manifest_v2.json"
        private const val CACHE_TIME_FILE = "version_manifest_v2.fetchtime"
    }

    private val json = Json { ignoreUnknownKeys = true }

    /**
     * 获取清单：优先命中缓存，过期后联网刷新。
     * @param forceRefresh 为 true 时忽略缓存强制联网（联网失败仍回退缓存）。
     * @throws LaunchException 联网失败且无任何可用缓存时抛出。
     */
    fun fetch(forceRefresh: Boolean = false): VersionManifest {
        val cacheFile = cacheDir.resolve(CACHE_FILE)
        val timeFile = cacheDir.resolve(CACHE_TIME_FILE)
        val cachedRaw = readCache(cacheFile)
        val cached = cachedRaw?.let { raw ->
            runCatching { json.decodeFromString<VersionManifest>(raw) }.getOrNull()
        }
        val cacheTime = readCacheTime(timeFile)

        val fresh = cacheTime != null &&
            cached != null &&
            !forceRefresh &&
            Instant.now().isBefore(cacheTime.plus(cacheTtl))
        if (fresh) return cached

        try {
            val body = httpGet(manifestUrl)
            val manifest = json.decodeFromString<VersionManifest>(body)
            Files.createDirectories(cacheDir)
            Files.writeString(cacheFile, body)
            Files.writeString(timeFile, Instant.now().toString())
            return manifest
        } catch (e: Exception) {
            if (cached != null) return cached
            throw LaunchException("无法获取版本清单且无可用缓存: ${e.message}", e)
        }
    }

    /** 按 id 在清单中查找版本条目。 */
    fun findVersion(id: String): VersionManifest.VersionEntry? =
        fetch().versions.firstOrNull { it.id == id }

    /** 下载指定版本的版本 JSON（详情）。 */
    fun fetchVersionJson(entry: VersionManifest.VersionEntry): String = httpGet(entry.url)

    private fun httpGet(url: String): String {
        val request = Request.Builder().url(url).build()
        httpClient.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw LaunchException("HTTP ${response.code} 获取 $url 失败")
            return response.body?.string()
                ?: throw LaunchException("获取 $url 返回空响应体")
        }
    }

    private fun readCache(file: Path): String? =
        try {
            if (Files.isRegularFile(file)) Files.readString(file) else null
        } catch (_: Exception) {
            null
        }

    private fun readCacheTime(file: Path): Instant? =
        try {
            if (Files.isRegularFile(file)) Instant.parse(Files.readString(file).trim()) else null
        } catch (_: Exception) {
            null
        }
}
