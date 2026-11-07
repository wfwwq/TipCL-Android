package com.tipcl.android.download

import android.content.Context
import com.tipcl.android.R
import com.tipcl.android.core.launch.VersionManifestFetcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File

/**
 * 版本清单仓库：包装 core-launch 的 [VersionManifestFetcher]，为向导"选版本"页供货。
 *
 * 缓存分两层：
 * 1. 内存缓存 —— 本次会话内命中直接返回，不触磁盘；
 * 2. 磁盘缓存 —— fetcher 落盘到 `<cacheDir>/version_manifest_v2.json`（TTL 30 分钟），
 *    过期后联网刷新；联网失败回退过期磁盘缓存，仍失败再回退内存缓存。
 *
 * 所有网络/IO 都在 Dispatchers.IO 执行，UI 只拿到不可变列表快照。
 */
class VersionRepository(
    cacheDir: File,
    httpClient: okhttp3.OkHttpClient = HttpProvider.client,
    /** 用于本地化错误文案（传 applicationContext）。 */
    private val appContext: android.content.Context,
) {

    private val fetcher = VersionManifestFetcher(httpClient, cacheDir.toPath())

    @Volatile
    private var memoryCache: List<VersionListItem>? = null

    /**
     * 拉取版本列表。
     * @param forceRefresh true 时忽略缓存强制联网（下拉刷新）；失败仍回退缓存。
     */
    suspend fun list(forceRefresh: Boolean = false): VersionListResult = withContext(Dispatchers.IO) {
        val cached = memoryCache
        if (cached != null && !forceRefresh) {
            return@withContext VersionListResult(cached, fromCache = true)
        }
        try {
            val manifest = fetcher.fetch(forceRefresh)
            val items = manifest.versions.map {
                VersionListItem(id = it.id, type = it.type, releaseTime = it.releaseTime, url = it.url)
            }
            memoryCache = items
            VersionListResult(items, fromCache = false)
        } catch (e: Exception) {
            val fallback = memoryCache
            if (fallback != null) {
                VersionListResult(fallback, fromCache = true, error = appContext.getString(R.string.repo_offline_cached))
            } else {
                VersionListResult(emptyList(), fromCache = true, error = appContext.getString(R.string.repo_manifest_failed, e.message ?: ""))
            }
        }
    }
}
