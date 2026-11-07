package com.tipcl.android.core.forgelike

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.time.Duration
import org.junit.jupiter.api.Tag
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Quilt meta v3 联网实测（M4，NETTEST.md 记录结论）：
 *
 * 对真实 `https://meta.quiltmc.org/v3/versions/loader/...` 端点走一遍完整链路：
 * 枚举 1.20.1 的 loader 版本 → 取 latest stable → 经 [QuiltInstaller.install]
 * 产出实例版本 JSON → 结构断言（对齐 core-launch FabricInstaller 产物形态）→
 * 用内嵌最小 VersionSpec 语义模型做可解析性回环。
 *
 * 全部用例打 @Tag("network")：默认 `test` 任务排除；`gradle :core-forgelike:networkTest` 执行。
 * 不依赖 core-launch 模块（QuiltInstaller 本就只依赖 serialization），最小解析模型内嵌于测试。
 */
@Tag("network")
class QuiltMetaNetworkTest {

    companion object {
        const val GAME_VERSION = "1.20.1"
        const val META_LIST_URL = "https://meta.quiltmc.org/v3/versions/loader/$GAME_VERSION"

        /** Quilt Knot 客户端主类（meta profile 实测值）。 */
        const val QUILT_KNOT_CLIENT = "org.quiltmc.loader.impl.launch.knot.KnotClient"
    }

    private val installer = QuiltInstaller()

    // ------------------------------------------------------------------
    // 内嵌最小 VersionSpec 语义模型（借 core-launch 的语义，字段同构；
    // ignoreUnknownKeys，缺省字段给默认值——与 VersionSpec.parse 行为一致）
    // ------------------------------------------------------------------

    @Serializable
    data class MinimalLibrary(
        val name: String,
        val url: String? = null,
    )

    @Serializable
    data class MinimalArguments(
        val game: List<kotlinx.serialization.json.JsonElement> = emptyList(),
        val jvm: List<kotlinx.serialization.json.JsonElement> = emptyList(),
    )

    @Serializable
    data class MinimalSpec(
        val id: String,
        val type: String? = null,
        val mainClass: String,
        val inheritsFrom: String? = null,
        val arguments: MinimalArguments? = null,
        val libraries: List<MinimalLibrary> = emptyList(),
        val releaseTime: String? = null,
    )

    /** meta 版本列表条目（v3 结构：loader/hashed/intermediary/launcherMeta）。 */
    @Serializable
    data class MetaEntry(val loader: LoaderInfo)

    @Serializable
    data class LoaderInfo(val version: String, val build: Int = 0)

    private val metaJson = Json { ignoreUnknownKeys = true }

    /** 下载文本（GET，非 2xx 抛异常）。 */
    private fun fetchText(url: String): String {
        val conn = java.net.URI.create(url).toURL().openConnection() as java.net.HttpURLConnection
        conn.connectTimeout = 15_000
        conn.readTimeout = 15_000
        conn.requestMethod = "GET"
        try {
            assertEquals(true, conn.responseCode in 200..299, "HTTP ${conn.responseCode}: $url")
            return conn.inputStream.bufferedReader().readText()
        } finally {
            conn.disconnect()
        }
    }

    /**
     * 从 meta 列表取 latest stable：过滤预发布（含 '-' 的版本号，如 0.20.0-beta.9），
     * 其余按数字点分段取最大。返回该 loader 版本与列表大小。
     */
    private fun versionKey(v: String): List<Int> = v.split('.').map { it.toIntOrNull() ?: 0 }

    private fun latestStable(entries: List<MetaEntry>): Pair<String, Int> {
        val stable = entries.map { it.loader.version }.filter { '-' !in it }
        val max = stable.maxWith(Comparator { a, b ->
            val ka = versionKey(a)
            val kb = versionKey(b)
            for (i in 0 until maxOf(ka.size, kb.size)) {
                val c = (ka.getOrNull(i) ?: 0).compareTo(kb.getOrNull(i) ?: 0)
                if (c != 0) return@Comparator c
            }
            0
        })
        return max to entries.size
    }

    @Test
    fun `meta 枚举 1_20_1 loader 版本并选中 latest stable`() {
        val text = fetchText(META_LIST_URL)
        val entries = metaJson.decodeFromString(kotlinx.serialization.builtins.ListSerializer(MetaEntry.serializer()), text)
        assertTrue(entries.size > 50, "1.20.1 应有大量 loader 构建，实际 ${entries.size}")
        val (latest, total) = latestStable(entries)
        assertTrue(latest.isNotBlank() && latest.startsWith("0."), "latest stable 版本号异常: $latest")
        println("[quilt-meta] 1.20.1 共 $total 个构建，latest stable = $latest")
    }

    @Test
    fun `latest stable profile 经 QuiltInstaller 产出结构与 Fabric 形态对齐`() {
        val entries = metaJson.decodeFromString(
            kotlinx.serialization.builtins.ListSerializer(MetaEntry.serializer()),
            fetchText(META_LIST_URL),
        )
        val (latest, _) = latestStable(entries)

        val t0 = System.nanoTime()
        val (newId, json) = installer.install(GAME_VERSION, latest)
        val elapsedMs = (System.nanoTime() - t0) / 1_000_000
        println("[quilt-meta] install($GAME_VERSION, $latest) 耗时 ${elapsedMs}ms")

        assertEquals(QuiltInstaller.instanceIdFor(GAME_VERSION, latest), newId)

        // meta profile 的 id 为 fabric 风格命名（quilt-loader-<v>-<mc>），必须被改写为本工程实例 id
        val raw = parseObject(json)
        assertEquals(newId, raw["id"]?.toString()?.trim('"'), "id 必须改写为实例 id")
        assertEquals(GAME_VERSION, raw["inheritsFrom"]?.toString()?.trim('"'))
        assertEquals("release", raw["type"]?.toString()?.trim('"'))

        // 与 FabricInstaller 产物形态对齐：Fabric 主类为 net.fabricmc...KnotClient，
        // Quilt meta 主类为 org.quiltmc...KnotClient（同为 Knot 体系但命名空间不同）
        assertEquals(QUILT_KNOT_CLIENT, raw["mainClass"]?.toString()?.trim('"'))

        // 必需 library 齐全：quilt-loader / intermediary / hashed（Quilt 特有）
        val libNames = metaJson.parseToJsonElement(json).let { el ->
            (el as kotlinx.serialization.json.JsonObject)["libraries"]!!.let {
                kotlinx.serialization.json.Json.decodeFromString(
                    kotlinx.serialization.builtins.ListSerializer(MinimalLibrary.serializer()),
                    it.toString(),
                )
            }
        }
        assertTrue(libNames.any { it.name == "org.quiltmc:quilt-loader:$latest" }, "缺少 quilt-loader")
        assertTrue(libNames.any { it.name == "net.fabricmc:intermediary:$GAME_VERSION" }, "缺少 intermediary")
        assertTrue(libNames.any { it.name == "org.quiltmc:hashed:$GAME_VERSION" }, "缺少 hashed")
        // Fabric 形态：每条 library 声明自定义 Maven base URL（quilt/fabric maven）
        assertTrue(libNames.all { it.url != null && it.url!!.endsWith("/") }, "library 应带 Maven base URL")
        assertTrue(
            libNames.any { it.url == "https://maven.quiltmc.org/repository/release/" },
            "quilt 构件应指向 quilt maven",
        )
    }

    @Test
    fun `profile JSON 经内嵌最小 VersionSpec 语义模型回环解析`() {
        val entries = metaJson.decodeFromString(
            kotlinx.serialization.builtins.ListSerializer(MetaEntry.serializer()),
            fetchText(META_LIST_URL),
        )
        val (latest, _) = latestStable(entries)
        val (_, json) = installer.install(GAME_VERSION, latest)

        // 与 core-launch InstanceManager 落盘后 loadVersionSpec 同语义：
        // ignoreUnknownKeys + 必需字段缺失即抛
        val spec = metaJson.decodeFromString(MinimalSpec.serializer(), json)
        assertEquals(QuiltInstaller.instanceIdFor(GAME_VERSION, latest), spec.id)
        assertEquals(QUILT_KNOT_CLIENT, spec.mainClass)
        assertEquals(GAME_VERSION, spec.inheritsFrom)
        assertTrue(spec.libraries.isNotEmpty(), "联网 profile 的 libraries 不应为空")
        println(
            "[quilt-meta] 回环解析成功: id=${spec.id}, libs=${spec.libraries.size}, " +
                "arguments.game=${spec.arguments?.game?.size ?: 0}",
        )
    }

    @Test
    fun `meta 不可达时回退本地骨架`() {
        val offline = QuiltInstaller(
            metaBaseUrl = "https://invalid.tipcl-nonexistent.test/v3/versions/loader",
            timeout = Duration.ofSeconds(2),
        )
        val (newId, json) = offline.install(GAME_VERSION, "0.30.2")
        assertEquals(QuiltInstaller.instanceIdFor(GAME_VERSION, "0.30.2"), newId)
        val obj = parseObject(json)
        assertEquals("net.fabricmc.loader.impl.launch.knot.KnotClient", obj["mainClass"]?.toString()?.trim('"'))
        assertEquals("[]", obj["libraries"].toString())
        assertEquals("true", obj["tipclPendingQuiltLibraries"].toString())
        assertTrue(obj.containsKey("inheritsFrom"))
    }

    private fun parseObject(text: String): kotlinx.serialization.json.JsonObject =
        metaJson.parseToJsonElement(text) as kotlinx.serialization.json.JsonObject
}
