package com.tipcl.android.core.launch

import com.sun.net.httpserver.HttpServer
import okhttp3.OkHttpClient
import okhttp3.Request
import org.junit.jupiter.api.Tag
import java.net.InetSocketAddress
import java.util.concurrent.Executors
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * MirrorPolicy 与 MirrorFallbackInterceptor 离线单测（内嵌样例 + 本地 HTTP 服务）。
 */
@Suppress("unused")
class MirrorPolicyTest {

    private val officialJson = """
        {
          "id": "1.20.1",
          "mainClass": "net.minecraft.client.main.Main",
          "assetIndex": {
            "id": "5", "sha1": "ada52cc672270e8dc69e912b2ba0ea9c141ed664",
            "url": "https://piston-meta.mojang.com/v1/packages/ada52cc672270e8dc69e912b2ba0ea9c141ed664/5.json"
          },
          "downloads": {
            "client": {
              "sha1": "0c3ec587af28e5a785c0b4a7b8a30f9a8f78f838", "size": 23028853,
              "url": "https://piston-data.mojang.com/v1/objects/0c3ec587af28e5a785c0b4a7b8a30f9a8f78f838/client.jar"
            }
          }
        }
    """.trimIndent()

    @Test
    fun `rewrite assetIndex and client url by host swap when mirror enabled`() {
        val policy = MirrorPolicy.BMCLAPI
        assertEquals(
            "https://bmclapi2.bangbang93.com/v1/packages/ada52cc672270e8dc69e912b2ba0ea9c141ed664/5.json",
            policy.rewriteUrl("https://piston-meta.mojang.com/v1/packages/ada52cc672270e8dc69e912b2ba0ea9c141ed664/5.json"),
        )
        assertEquals(
            "https://bmclapi2.bangbang93.com/v1/objects/0c3ec587af28e5a785c0b4a7b8a30f9a8f78f838/client.jar",
            policy.rewriteUrl("https://piston-data.mojang.com/v1/objects/0c3ec587af28e5a785c0b4a7b8a30f9a8f78f838/client.jar"),
        )
        // 旧版域名同样覆盖
        assertEquals(
            "https://bmclapi2.bangbang93.com/mc/game/version_manifest.json",
            policy.rewriteUrl("https://launchermeta.mojang.com/mc/game/version_manifest.json"),
        )
    }

    @Test
    fun `rewriteVersionSpec rewrites assetIndex and client only`() {
        val spec = VersionSpec.parse(officialJson)
        val rewritten = MirrorPolicy.BMCLAPI.rewriteVersionSpec(spec)
        assertEquals(
            "https://bmclapi2.bangbang93.com/v1/packages/ada52cc672270e8dc69e912b2ba0ea9c141ed664/5.json",
            rewritten.assetIndex?.url,
        )
        assertEquals(
            "https://bmclapi2.bangbang93.com/v1/objects/0c3ec587af28e5a785c0b4a7b8a30f9a8f78f838/client.jar",
            rewritten.downloads?.client?.url,
        )
        // sha1/size 等元数据原样保留
        assertEquals(spec.assetIndex?.sha1, rewritten.assetIndex?.sha1)
        assertEquals(spec.downloads?.client?.size, rewritten.downloads?.client?.size)
        assertEquals(spec.mainClass, rewritten.mainClass)
    }

    @Test
    fun `mirror disabled keeps urls untouched`() {
        val policy = MirrorPolicy.OFF
        val official = "https://piston-meta.mojang.com/v1/packages/abc/5.json"
        assertEquals(official, policy.rewriteUrl(official))
        val spec = VersionSpec.parse(officialJson)
        val untouched = policy.rewriteVersionSpec(spec)
        assertEquals(spec, untouched)
        // 关闭态无回退
        assertNull(policy.fallbackUrl("https://bmclapi2.bangbang93.com/v1/packages/abc/5.json"))
    }

    @Test
    fun `non official urls are left alone`() {
        val policy = MirrorPolicy.BMCLAPI
        // 已指向镜像：不再二次改写
        assertEquals(
            "https://bmclapi2.bangbang93.com/v1/packages/abc/5.json",
            policy.rewriteUrl("https://bmclapi2.bangbang93.com/v1/packages/abc/5.json"),
        )
        // 第三方域与 assets 对象路径（由 AssetInstaller.assetBaseUrl 处理）不改写
        assertEquals(
            "https://resources.download.minecraft.net/ab/abcd",
            policy.rewriteUrl("https://resources.download.minecraft.net/ab/abcd"),
        )
        assertEquals(
            "https://libraries.minecraft.net/oops/1.0/oops-1.0.jar",
            policy.rewriteUrl("https://libraries.minecraft.net/oops/1.0/oops-1.0.jar"),
        )
    }

    @Test
    fun `asset base url points at mirror assets`() {
        assertEquals(
            "https://bmclapi2.bangbang93.com/assets",
            MirrorPolicy.BMCLAPI.assetBaseUrl,
        )
        assertEquals(
            "https://resources.download.minecraft.net",
            MirrorPolicy.OFFICIAL_ASSET_BASE_URL,
        )
        // AssetInstaller 直接用镜像 base 拼对象 URL（与官方同布局 <hash2>/<hash>）
        val installer = AssetInstaller(
            okhttp3.OkHttpClient(),
            java.nio.file.Files.createTempDirectory("tipcl-mirror-test"),
            assetBaseUrl = MirrorPolicy.BMCLAPI.assetBaseUrl,
        )
        assertEquals(
            "https://bmclapi2.bangbang93.com/assets/ab/abcd",
            installer.urlFor("abcd"),
        )
    }

    @Test
    fun `fallback url maps mirror paths back to official hosts`() {
        val policy = MirrorPolicy.BMCLAPI
        assertEquals(
            "https://piston-meta.mojang.com/v1/packages/ada/5.json",
            policy.fallbackUrl("https://bmclapi2.bangbang93.com/v1/packages/ada/5.json"),
        )
        assertEquals(
            "https://piston-data.mojang.com/v1/objects/abc/client.jar",
            policy.fallbackUrl("https://bmclapi2.bangbang93.com/v1/objects/abc/client.jar"),
        )
        assertNull(policy.fallbackUrl("https://resources.download.minecraft.net/ab/abcd"))
        assertNull(policy.fallbackUrl("https://example.com/whatever"))
    }

    @Test
    fun `rewrite cooperates with mergeWithParent inherited assetIndex`() {
        val parent = VersionSpec.parse(officialJson)
        val child = VersionSpec.parse(
            """
            { "id": "1.20.1-fabric", "inheritsFrom": "1.20.1",
              "mainClass": "net.fabricmc.loader.impl.launch.knot.KnotClient" }
            """.trimIndent()
        )
        val merged = child.mergeWithParent(parent)
        val rewritten = MirrorPolicy.BMCLAPI.rewriteVersionSpec(merged)
        // 子版本无 assetIndex/downloader，继承自父版本后仍应被改写
        assertEquals(
            "https://bmclapi2.bangbang93.com/v1/packages/ada52cc672270e8dc69e912b2ba0ea9c141ed664/5.json",
            rewritten.assetIndex?.url,
        )
        assertEquals(
            "https://bmclapi2.bangbang93.com/v1/objects/0c3ec587af28e5a785c0b4a7b8a30f9a8f78f838/client.jar",
            rewritten.downloads?.client?.url,
        )
        assertEquals("net.fabricmc.loader.impl.launch.knot.KnotClient", rewritten.mainClass)
    }

    @Test
    fun `rewriteVersionSpec on already rewritten merged spec is idempotent`() {
        val spec = VersionSpec.parse(officialJson)
        val once = MirrorPolicy.BMCLAPI.rewriteVersionSpec(spec)
        assertEquals(once, MirrorPolicy.BMCLAPI.rewriteVersionSpec(once))
    }

    // ------------------------------------------------------------------
    // MirrorFallbackInterceptor：本地 HTTP 服务模拟镜像失败回退
    // ------------------------------------------------------------------

    /** 起一个本地 HttpServer，返回 (server, baseUrl)。请求路径以 failPathPrefix 开头时返回 fail 状态码。 */
    private fun startServer(failPathPrefix: String, failStatus: Int, okPath: String, okBody: String): Pair<HttpServer, String> {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { exchange ->
            val path = exchange.requestURI.path
            if (path.startsWith(failPathPrefix)) {
                exchange.sendResponseHeaders(failStatus, -1)
            } else if (path == okPath) {
                val bytes = okBody.toByteArray(Charsets.UTF_8)
                exchange.responseHeaders.add("Content-Type", "application/json")
                exchange.sendResponseHeaders(200, bytes.size.toLong())
                exchange.responseBody.use { it.write(bytes) }
            } else {
                exchange.sendResponseHeaders(404, -1)
            }
            exchange.close()
        }
        server.executor = Executors.newSingleThreadExecutor()
        server.start()
        return server to "http://127.0.0.1:${server.address.port}"
    }

    @Test
    fun `interceptor retries official url once on mirror non 2xx`() {
        val (server, base) = startServer("/mirror/", 503, "/official/data", """{"ok":true}""")
        try {
            val policy = MirrorPolicy(enabled = true, mirrorHost = "$base/mirror")
            val client = OkHttpClient.Builder()
                .addInterceptor(MirrorFallbackInterceptor(
                    policy,
                    fallbackResolver = { url -> if (url.startsWith("$base/mirror")) "$base/official/data" else null },
                ))
                .build()
            val resp = client.newCall(Request.Builder().url("$base/mirror/v1/packages/abc/5.json").build()).execute()
            resp.use {
                assertEquals(200, it.code, "镜像 503 应回退官方重试成功")
                assertTrue(it.body?.string()?.contains("ok") == true)
            }
            // 无回退路径的请求：镜像 503 原样透传
            val client2 = OkHttpClient.Builder()
                .addInterceptor(MirrorFallbackInterceptor(policy, fallbackResolver = { null }))
                .build()
            client2.newCall(Request.Builder().url("$base/mirror/x").build()).execute().use {
                assertEquals(503, it.code, "无官方回退时应透传镜像错误")
            }
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun `interceptor does not loop when official also fails`() {
        // 镜像与回退目标都失败：应把官方失败如实返回，服务端只收到 2 个请求（镜像 1 + 回退 1）
        val hits = java.util.concurrent.atomic.AtomicInteger(0)
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { exchange ->
            hits.incrementAndGet()
            exchange.sendResponseHeaders(500, -1)
            exchange.close()
        }
        server.executor = Executors.newSingleThreadExecutor()
        server.start()
        try {
            val base = "http://127.0.0.1:${server.address.port}"
            val policy = MirrorPolicy(enabled = true, mirrorHost = base)
            val client = OkHttpClient.Builder()
                .addInterceptor(MirrorFallbackInterceptor(
                    policy,
                    fallbackResolver = { "$base/official-also-fails" },
                ))
                .build()
            client.newCall(Request.Builder().url("$base/mirror/v1/objects/abc/client.jar").build()).execute().use {
                assertEquals(500, it.code, "官方回退仍失败应如实返回官方错误")
            }
            assertEquals(2, hits.get(), "镜像 1 次 + 官方回退 1 次，不应级联重试")
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun `interceptor falls back to official on mirror connect failure`() {
        // 镜像端口指向一个必然拒绝连接的地址：回退到本地正常 server
        val (server, base) = startServer("", 200, "/official/data", """{"ok":true}""")
        try {
            val deadPort = 1 // 1 端口基本不可能有服务监听
            val policy = MirrorPolicy(enabled = true, mirrorHost = "http://127.0.0.1:$deadPort/mirror")
            val client = OkHttpClient.Builder()
                .addInterceptor(MirrorFallbackInterceptor(
                    policy,
                    fallbackResolver = { url ->
                        // 仅当 URL 指向死亡镜像时回退到本地 official
                        if (url.startsWith("http://127.0.0.1:$deadPort")) "$base/official/data" else null
                    },
                ))
                .connectTimeout(2, java.util.concurrent.TimeUnit.SECONDS)
                .build()
            client.newCall(Request.Builder().url("http://127.0.0.1:$deadPort/mirror/v1/packages/abc/5.json").build())
                .execute().use {
                    assertEquals(200, it.code, "镜像连接失败应回退官方成功")
                }
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun `parse real shape version json with downloads node`() {
        // 内嵌 1.20.1 官方 JSON 精简形态：downloads 顶层节点可解析且默认值安全
        val spec = VersionSpec.parse(officialJson)
        assertTrue(spec.downloads?.client?.url?.startsWith("https://piston-data") == true)
        // 无 downloads 的 JSON（旧版形态）不报错
        val legacy = VersionSpec.parse(
            """{ "id": "b1.7.3", "mainClass": "net.minecraft.client.Minecraft" }"""
        )
        assertNull(legacy.downloads)
        assertFalse(legacy.assetIndex != null)
    }
}
