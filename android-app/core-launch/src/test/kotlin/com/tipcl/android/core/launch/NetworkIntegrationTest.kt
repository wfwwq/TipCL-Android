package com.tipcl.android.core.launch

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import okhttp3.OkHttpClient
import okhttp3.Request
import org.junit.jupiter.api.Tag
import java.nio.file.Files
import java.time.Duration
import java.time.Instant
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * 真实网络端到端实测（Mojang / Fabric / BMCLAPI）。
 *
 * 全部用例打 @Tag("network")：默认 `test` 任务排除该 tag，不跑网络；
 * 仅 `gradlew :core-launch:networkTest` 手动触发。
 * 网络失败不代表代码错误，但会以失败形式如实暴露，便于对照 NETTEST.md。
 */
@Tag("network")
@Suppress("unused")
class NetworkIntegrationTest {

    private val http = OkHttpClient.Builder()
        .connectTimeout(15, java.util.concurrent.TimeUnit.SECONDS)
        .readTimeout(60, java.util.concurrent.TimeUnit.SECONDS)
        .build()

    private val json = Json { ignoreUnknownKeys = true }

    /** 对 URL 发 HEAD，返回响应码（跟随重定向）。 */
    private fun headStatus(url: String): Int =
        http.newCall(
            Request.Builder().url(url).head()
                .header("User-Agent", "TipCL-networktest/0.1")
                .build()
        ).execute().use { it.code }

    /** GET 全文，返回 (状态码, 字节数, 耗时ms)。 */
    private fun getWithStats(url: String): Triple<Int, Long, Long> {
        val t0 = System.currentTimeMillis()
        http.newCall(
            Request.Builder().url(url).header("User-Agent", "TipCL-networktest/0.1").build()
        ).execute().use { resp ->
            val bytes = resp.body?.bytes()?.size?.toLong() ?: 0L
            return Triple(resp.code, bytes, System.currentTimeMillis() - t0)
        }
    }

    // ------------------------------------------------------------------
    // 1. manifest 实测
    // ------------------------------------------------------------------

    @Test
    fun `manifest from Mojang piston-meta and cache second hit`() {
        val cacheDir = Files.createTempDirectory("tipcl-manifest")
        val fetcher = VersionManifestFetcher(http, cacheDir)

        val t0 = System.currentTimeMillis()
        val m = fetcher.fetch(forceRefresh = true)
        val elapsed = System.currentTimeMillis() - t0

        assertTrue(m.latest.release.isNotBlank(), "latest.release 为空")
        assertTrue(m.latest.snapshot.isNotBlank(), "latest.snapshot 为空")
        assertTrue(m.versions.size > 500, "版本数异常少: ${m.versions.size}")
        assertTrue(m.versions.any { it.id == "1.20.1" }, "清单缺少 1.20.1")
        assertTrue(m.versions.first().sha1 != null, "v2 清单应含 sha1")
        println("[manifest-mojang] versions=${m.versions.size} release=${m.latest.release} bytes=~${Files.size(cacheDir.resolve("version_manifest_v2.json"))} time=${elapsed}ms")

        // 缓存二次命中：TTL 内直接返回，不产生网络请求（fetch 时间文件不更新）
        val timeBefore = Files.readString(cacheDir.resolve("version_manifest_v2.fetchtime"))
        val t1 = System.currentTimeMillis()
        val cached = fetcher.fetch()
        val cachedElapsed = System.currentTimeMillis() - t1
        val timeAfter = Files.readString(cacheDir.resolve("version_manifest_v2.fetchtime"))
        assertEquals(timeBefore, timeAfter, "缓存命中不应重写抓取时间")
        assertEquals(m.versions.size, cached.versions.size)
        println("[manifest-cache] second hit time=${cachedElapsed}ms")
    }

    @Test
    fun `manifest via BMCLAPI mirror`() {
        val cacheDir = Files.createTempDirectory("tipcl-manifest-bmcl")
        val fetcher = VersionManifestFetcher(
            http, cacheDir,
            manifestUrl = "https://bmclapi2.bangbang93.com/mc/game/version_manifest_v2.json",
        )
        val t0 = System.currentTimeMillis()
        val m = fetcher.fetch()
        val elapsed = System.currentTimeMillis() - t0
        assertTrue(m.versions.size > 500, "BMCLAPI 版本数异常: ${m.versions.size}")
        assertTrue(m.versions.any { it.id == "1.20.1" }, "BMCLAPI 清单缺少 1.20.1")
        println("[manifest-bmclapi] versions=${m.versions.size} time=${elapsed}ms")
    }

    // ------------------------------------------------------------------
    // 2. 版本 JSON + 库解析实测
    // ------------------------------------------------------------------

    /** 拉取 1.20.1 版本 JSON（经指定清单源），返回 (spec, 原始字节, 耗时)。 */
    private fun load1201Spec(manifestUrl: String): Triple<VersionSpec, Long, Long> {
        val fetcher = VersionManifestFetcher(http, Files.createTempDirectory("tipcl-vjson"), manifestUrl)
        val entry = fetcher.fetch().versions.first { it.id == "1.20.1" }
        val (code, bytes, ms) = getWithStats(entry.url)
        assertEquals(200, code, "版本 JSON 下载失败: ${entry.url}")
        val spec = VersionSpec.parse(http.newCall(Request.Builder().url(entry.url).build())
            .execute().use { it.body!!.string() })
        return Triple(spec, bytes, ms)
    }

    @Test
    fun `1_20_1 version JSON parse merge and library resolution via Mojang`() {
        val (spec, bytes, ms) = load1201Spec(VersionManifestFetcher.DEFAULT_MANIFEST_URL)
        println("[version-json-mojang] id=${spec.id} libraries=${spec.libraries.size} bytes=$bytes time=${ms}ms")
        assertEquals("1.20.1", spec.id)
        assertEquals("net.minecraft.client.main.Main", spec.mainClass)
        assertTrue(spec.libraries.size > 30, "1.20.1 library 数异常: ${spec.libraries.size}")
        assertTrue(spec.assetIndex != null, "assetIndex 缺失")
        val resolution = LibraryResolver(null).resolve(spec.libraries)
        assertTrue(resolution.classpath.size > 20, "classpath 数异常: ${resolution.classpath.size}")
        // 1.20.1 属现代版本：natives 以 classifier 构件形式进 classpath，natives map 为空是预期
        assertTrue(
            resolution.classpath.any { it.relativePath.contains("natives-") },
            "classPath 应含 natives classifier 构件",
        )
        println("[resolve-mojang] classpath=${resolution.classpath.size} nativesMap=${resolution.natives.size}")

        // 抽 3 个真实 library URL 做 HEAD 200（含 1 个 natives classifier 构件）
        val mojangLibs = resolution.classpath.filter { it.url.startsWith("https://libraries.minecraft.net") }
        val nativeLib = mojangLibs.firstOrNull { it.relativePath.contains("natives-") }
        val sample = mojangLibs.take(2) + listOfNotNull(nativeLib)
        for (lib in sample) {
            val st = headStatus(lib.url)
            assertEquals(200, st, "HEAD ${lib.url} -> $st")
            println("[library-mojang] HEAD 200 ${lib.relativePath}")
        }
    }

    @Test
    fun `1_20_1 libraries via BMCLAPI mirror HEAD checks`() {
        val (spec, _, _) = load1201Spec("https://bmclapi2.bangbang93.com/mc/game/version_manifest_v2.json")
        val resolution = LibraryResolver(MavenRepository.BMCLAPI).resolve(spec.libraries)
        assertTrue(resolution.classpath.size > 20)
        val sample = resolution.classpath.take(3) + resolution.natives.take(1)
        for (lib in sample) {
            assertTrue(lib.url.startsWith("https://bmclapi2.bangbang93.com/maven/"), "镜像 URL 拼装错误: ${lib.url}")
            val st = headStatus(lib.url)
            assertEquals(200, st, "BMCLAPI HEAD ${lib.url} -> $st")
            println("[library-bmclapi] HEAD 200 ${lib.relativePath}")
        }
    }

    // ------------------------------------------------------------------
    // 3. assetIndex 实测
    // ------------------------------------------------------------------

    @Test
    fun `1_20_1 assetIndex download and validate`() {
        val fetcher = VersionManifestFetcher(http, Files.createTempDirectory("tipcl-ai"))
        val entry = fetcher.fetch().versions.first { it.id == "1.20.1" }
        val spec = VersionSpec.parse(
            http.newCall(Request.Builder().url(entry.url).build()).execute().use { it.body!!.string() }
        )
        val idxInfo = spec.assetIndex!!
        val installer = AssetInstaller(http, Files.createTempDirectory("tipcl-assets"))
        val t0 = System.currentTimeMillis()
        val index = installer.fetchAssetIndex(idxInfo.url, idxInfo.sha1)
        val elapsed = System.currentTimeMillis() - t0
        assertTrue(index.objects.size > 3000, "1.20.1 资源对象数异常: ${index.objects.size}")
        val pending = installer.buildPendingList(index)
        println("[asset-index-mojang] objects=${index.objects.size} pendingUnique=${pending.size} time=${elapsed}ms")
        // 抽 1 个资源对象 HEAD 验证下载源可达（不下载全部）
        val one = pending.first()
        val st = headStatus(installer.urlFor(one.hash))
        assertEquals(200, st, "资源对象 HEAD ${installer.urlFor(one.hash)} -> $st")
    }

    @Test
    fun `1_20_1 assetIndex via BMCLAPI`() {
        val fetcher = VersionManifestFetcher(
            http, Files.createTempDirectory("tipcl-ai-bmcl"),
            manifestUrl = "https://bmclapi2.bangbang93.com/mc/game/version_manifest_v2.json",
        )
        val entry = fetcher.fetch().versions.first { it.id == "1.20.1" }
        val spec = VersionSpec.parse(
            http.newCall(Request.Builder().url(entry.url).build()).execute().use { it.body!!.string() }
        )
        // BMCLAPI 版本 JSON 中 assetIndex.url 应已指向镜像，指向 piston-meta 也可接受（回退官方）
        val idxInfo = spec.assetIndex!!
        val installer = AssetInstaller(
            http, Files.createTempDirectory("tipcl-assets-bmcl"),
            assetBaseUrl = "https://bmclapi2.bangbang93.com/assets",
        )
        val index = installer.fetchAssetIndex(idxInfo.url, idxInfo.sha1)
        assertTrue(index.objects.isNotEmpty())
        println("[asset-index-bmclapi] objects=${index.objects.size} indexUrl=${idxInfo.url}")
        val one = installer.buildPendingList(index).first()
        val st = headStatus(installer.urlFor(one.hash))
        assertEquals(200, st, "BMCLAPI 资源对象 HEAD ${installer.urlFor(one.hash)} -> $st")
    }

    @Test
    fun `1_20_1 assetIndex rewritten by MirrorPolicy is reachable via BMCLAPI`() {
        // 官方清单拿版本 JSON，激活 MirrorPolicy.BMCLAPI 改写 assetIndex/client 指针，
        // 验证改写后的镜像 URL 真实可达且内容与官方一致（sha1 校验）
        val fetcher = VersionManifestFetcher(http, Files.createTempDirectory("tipcl-ai-mirror"))
        val entry = fetcher.fetch().versions.first { it.id == "1.20.1" }
        val spec = VersionSpec.parse(
            http.newCall(Request.Builder().url(entry.url).build()).execute().use { it.body!!.string() }
        )
        val policy = MirrorPolicy.BMCLAPI
        val rewritten = policy.rewriteVersionSpec(spec)
        val idxInfo = rewritten.assetIndex!!
        assertTrue(idxInfo.url.startsWith("https://bmclapi2.bangbang93.com/v1/packages/"), "改写后应指向镜像: ${idxInfo.url}")
        assertTrue(
            rewritten.downloads?.client?.url?.startsWith("https://bmclapi2.bangbang93.com/v1/objects/") == true,
            "client jar 应改写为镜像: ${rewritten.downloads?.client?.url}",
        )

        val t0 = System.currentTimeMillis()
        val index = AssetInstaller(http, Files.createTempDirectory("tipcl-assets-mirror"))
            .fetchAssetIndex(idxInfo.url, idxInfo.sha1)
        val elapsed = System.currentTimeMillis() - t0
        assertTrue(index.objects.size > 3000, "镜像 assetIndex 对象数异常: ${index.objects.size}")
        println("[asset-index-mirrorpolicy] objects=${index.objects.size} url=$idxInfo.url time=${elapsed}ms")

        val clientSt = headStatus(rewritten.downloads!!.client!!.url)
        assertEquals(200, clientSt, "镜像 client jar HEAD ${rewritten.downloads!!.client!!.url} -> $clientSt")

        // 镜像 assets 对象 base（与官方同布局 <hash2>/<hash>）
        val one = AssetInstaller(http, Files.createTempDirectory("tipcl-assets-mirror2"))
            .buildPendingList(index).first()
        val objUrl = "${policy.assetBaseUrl}/${one.hash.take(2)}/${one.hash}"
        assertEquals(200, headStatus(objUrl), "镜像资源对象 HEAD $objUrl 失败")
    }

    // ------------------------------------------------------------------
    // 4. Fabric 实测
    // ------------------------------------------------------------------

    @Test
    fun `fabric list loader versions and fetch profile for 1_20_1`() {
        val installer = FabricInstaller()
        val t0 = System.currentTimeMillis()
        val loaders = installer.listLoaderVersions("1.20.1")
        val elapsed = System.currentTimeMillis() - t0
        assertTrue(loaders.isNotEmpty(), "fabric-meta loader 列表为空")
        println("[fabric-loaders] count=${loaders.size} latest=${loaders.first().version} stable=${loaders.first().stable} time=${elapsed}ms")

        val loaderVersion = loaders.first { it.stable }.version
        val manifestFetcher = VersionManifestFetcher(http, Files.createTempDirectory("tipcl-fabric"))
        val entry = manifestFetcher.fetch().versions.first { it.id == "1.20.1" }
        val vanilla = VersionSpec.parse(http.newCall(Request.Builder().url(entry.url).build())
            .execute().use { it.body!!.string() })
        val t1 = System.currentTimeMillis()
        val (newId, normalizedText) = installer.install(vanilla, loaderVersion)
        val elapsed2 = System.currentTimeMillis() - t1
        assertEquals("1.20.1-fabric", newId)
        val parsed = VersionSpec.parse(normalizedText)
        assertEquals("1.20.1", parsed.inheritsFrom)
        assertEquals(FabricInstaller.KNOT_CLIENT, parsed.mainClass)
        assertTrue(parsed.libraries.any { it.name.startsWith("net.fabricmc:fabric-loader") }, "profile 缺 fabric-loader")
        println("[fabric-profile] id=$newId loader=$loaderVersion libraries=${parsed.libraries.size} time=${elapsed2}ms")

        // 归一后的 profile 经 LibraryResolver 解析（自定义仓库 base 形态）
        val resolution = LibraryResolver(null).resolve(parsed.libraries)
        assertTrue(resolution.classpath.isNotEmpty(), "fabric profile classpath 解析为空")
        println("[fabric-resolve] classpath=${resolution.classpath.size} first=${resolution.classpath.first().relativePath} url=${resolution.classpath.first().url}")
    }
}
