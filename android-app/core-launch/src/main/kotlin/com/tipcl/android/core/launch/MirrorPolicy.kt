package com.tipcl.android.core.launch

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

/**
 * 镜像源 URL 改写策略（可注入，默认关闭，[MirrorPolicy.OFF] 即关闭态）。
 *
 * 改写规则依据 BMCLAPI 公开文档（https://bmclapidoc.bangbang93.com）并经 2026-11-07 真实
 * 网络实测验证：BMCLAPI 对官方 meta/data 域做**整域前缀替换**（路径原样保留）：
 * - 版本 JSON / assetIndex：`piston-meta.mojang.com`（旧版 launchermeta / launcher）→ 镜像根
 *   实测 `https://bmclapi2.bangbang93.com/v1/packages/<sha1>/<id>.json` → 200
 * - 客户端 jar：`piston-data.mojang.com` → 镜像根
 *   实测 `https://bmclapi2.bangbang93.com/v1/objects/<sha1>/client.jar` → 200
 * - assets 对象：`resources.download.minecraft.net/<hash2>/<hash>` → 镜像 `/assets/<hash2>/<hash>`
 *   （NETTEST 3b 已实测 200；[AssetInstaller.assetBaseUrl] 直接传入 [assetBaseUrl] 即可）
 * - libraries：`libraries.minecraft.net` → 镜像 `/maven`，沿用 [LibraryResolver] 的镜像
 *   优先逻辑（repository 参数），此处不重复处理
 *
 * 注意：BMCLAPI 自身下发的版本 JSON 里 `assetIndex.url` 与 `downloads.client.url` 仍指向
 * piston-meta/piston-data 官方域（镜像不改写该指针），须在镜像激活时由 [rewriteVersionSpec]
 * 显式改写。文档未提供 `assets/<indexId>/<文件名>` 形态的索引镜像路径
 * （实测 HEAD 404），故索引 URL 与客户端 jar 均按整域前缀替换处理。
 *
 * @param enabled 是否激活镜像改写；false 时全部方法原样返回（官方源直连）
 * @param mirrorHost 镜像站点根 URL（不带结尾斜杠）
 */
class MirrorPolicy(
    val enabled: Boolean = false,
    val mirrorHost: String = "https://bmclapi2.bangbang93.com",
) {

    companion object {
        /** 关闭态：全部 URL 原样返回（官方源直连）。 */
        val OFF = MirrorPolicy(enabled = false)

        /** 预置 BMCLAPI 激活态策略。 */
        val BMCLAPI = MirrorPolicy(enabled = true, mirrorHost = "https://bmclapi2.bangbang93.com")

        /** 官方 meta/data 域前缀清单（命中即整域替换为 [mirrorHost]）。 */
        private val OFFICIAL_HOST_PREFIXES = listOf(
            "https://piston-meta.mojang.com",
            "https://piston-data.mojang.com",
            "https://launchermeta.mojang.com",
            "https://launcher.mojang.com",
        )

        /** 官方 assets 对象 base（镜像回退时使用）。 */
        const val OFFICIAL_ASSET_BASE_URL = MavenRepository.MOJANG_RESOURCES

        /** 官方 meta 域（assetIndex 指针回退目标）。 */
        private const val OFFICIAL_META_HOST = "https://piston-meta.mojang.com"

        /** 官方 data 域（客户端 jar 等对象回退目标）。 */
        private const val OFFICIAL_DATA_HOST = "https://piston-data.mojang.com"
    }

    /** 镜像 assets 对象 base：官方 resources.download.minecraft.net 的对应物。 */
    val assetBaseUrl: String
        get() = "${mirrorHost.trimEnd('/')}/assets"

    /**
     * 单个 URL 改写：命中官方 meta/data 域前缀时替换为 [mirrorHost]（路径原样保留），
     * 其余（已指向镜像、第三方或相对路径）原样返回。关闭态或 null URL 恒返回原值。
     */
    fun rewriteUrl(url: String?): String? {
        if (url == null || !enabled) return url
        val host = mirrorHost.trimEnd('/')
        for (prefix in OFFICIAL_HOST_PREFIXES) {
            if (url.startsWith(prefix)) return host + url.substring(prefix.length)
        }
        return url
    }

    /**
     * 镜像激活时改写版本 JSON 的下载指针：[VersionSpec.assetIndex.url] 与
     * [VersionSpec.downloads.client.url]。其余字段与对象引用原样保留。
     */
    fun rewriteVersionSpec(spec: VersionSpec): VersionSpec {
        if (!enabled) return spec
        return spec.copy(
            assetIndex = spec.assetIndex?.let { it.copy(url = rewriteUrl(it.url) ?: it.url) },
            downloads = spec.downloads?.let { d ->
                d.copy(client = d.client?.let { c -> c.copy(url = rewriteUrl(c.url)) })
            },
        )
    }

    /**
     * 逆向映射（回退用）：镜像 URL → 官方 URL。按路径特征选择官方域：
     * `/v1/packages/...`（版本 JSON / assetIndex）回 [piston-meta]；其余 `/v1/...`
     * 对象路径（如 `/v1/objects/<sha1>/client.jar`）回 [piston-data]。
     * 非镜像 URL 返回 null（无可回退）。
     */
    fun fallbackUrl(url: String): String? {
        if (!enabled) return null
        val host = mirrorHost.trimEnd('/')
        if (!url.startsWith("$host/")) return null
        val path = url.substring(host.length)
        return if (path.startsWith("/v1/packages/")) {
            "$OFFICIAL_META_HOST$path"
        } else {
            "$OFFICIAL_DATA_HOST$path"
        }
    }
}

/**
 * 镜像失败自动回退官方源的 OkHttp 拦截器：镜像请求抛 [IOException] 或返回非 2xx 时，
 * 按 [MirrorPolicy.fallbackUrl] 取官方 URL **重试一次**；回退请求本身的结果（无论成败）
 * 直接返回，不再级联重试。
 *
 * [fallbackResolver] 默认绑定 [MirrorPolicy.fallbackUrl]；测试可注入纯函数替代。
 */
class MirrorFallbackInterceptor(
    private val policy: MirrorPolicy = MirrorPolicy.BMCLAPI,
    private val fallbackResolver: (String) -> String? = { policy.fallbackUrl(it) },
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val first: Response = try {
            chain.proceed(request)
        } catch (e: IOException) {
            val fallback = fallbackResolver(request.url.toString()) ?: throw e
            // 回退请求失败时优先抛出原始镜像侧异常（保留根因）
            try {
                return chain.proceed(request.newBuilder().url(fallback).build())
            } catch (_: IOException) {
                throw e
            }
        }
        if (first.isSuccessful) return first
        val fallback = fallbackResolver(request.url.toString()) ?: return first
        first.close()
        // 回退请求的响应（无论成败）如实返回，仅重试一次、不级联
        return chain.proceed(request.newBuilder().url(fallback).build())
    }
}
