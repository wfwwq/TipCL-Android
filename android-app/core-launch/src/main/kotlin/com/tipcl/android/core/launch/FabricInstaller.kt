package com.tipcl.android.core.launch

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.booleanOrNull
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.util.concurrent.TimeUnit

/**
 * Fabric 模加载器安装器，实现 [ModLoaderInstaller]。
 *
 * 数据源为 fabric-meta 公开 API（https://meta.fabricmc.net）：
 * - `/v2/versions/loader/:game`                    枚举可用 loader 版本
 * - `/v2/versions/loader/:game/:loader/profile/json` 获取可直接落盘的合并版版本 JSON
 *   （其 inheritsFrom 指向原版 id，libraries 已含 fabric-loader、intermediary、
 *   sponge-mixin 等条目，mainClass 为 Knot）。
 *
 * 网络访问通过 [metaFetcher] 抽象：生产环境默认用 OkHttp，测试注入假实现即可，
 * 保证 core-launch 单测纯 JVM、无网络。
 *
 * 落盘约定：派生版本 id 固定为 `<vanilla.id>-fabric`，inheritsFrom 强制指向原版 id，
 * 与 [InstanceManager] / [LibraryResolver] 的 inheritsFrom 链无缝协作。
 */
class FabricInstaller(
    /** fabric-meta 文本获取器：输入完整 URL，返回响应体；失败应抛异常。 */
    private val metaFetcher: (String) -> String = DEFAULT_FETCHER,
    /** fabric-meta base URL，可指向镜像。 */
    private val metaBase: String = "https://meta.fabricmc.net",
) : ModLoaderInstaller {

    override val id: String get() = "fabric"

    /** 派生版本 id 后缀。 */
    val versionSuffix: String get() = "-fabric"

    /**
     * fabric-meta 枚举条目，仅取启动所需字段。
     * 线上 v2 端点返回嵌套形态 `{"loader": {"version": .., "stable": ..}, "intermediary": ..}`，
     * 兼容旧的扁平形态 `{version, stable}`，两者均可反序列化。
     */
    @Serializable(with = LoaderEntrySerializer::class)
    data class LoaderEntry(val version: String, val stable: Boolean = false)

    /** 兼容嵌套/扁平两种 fabric-meta 枚举形态的反序列化器。 */
    private object LoaderEntrySerializer : kotlinx.serialization.KSerializer<LoaderEntry> {
        override val descriptor = kotlinx.serialization.json.JsonObject.serializer().descriptor

        override fun deserialize(decoder: kotlinx.serialization.encoding.Decoder): LoaderEntry {
            val obj = decoder.decodeSerializableValue(kotlinx.serialization.json.JsonElement.serializer()).jsonObject
            val inner = (obj["loader"] as? kotlinx.serialization.json.JsonObject) ?: obj
            val version = inner["version"]?.jsonPrimitive?.content
                ?: throw LaunchException("fabric-meta 枚举条目缺少 version 字段: $obj")
            val stable = inner["stable"]?.jsonPrimitive?.booleanOrNull ?: false
            return LoaderEntry(version, stable)
        }

        override fun serialize(encoder: kotlinx.serialization.encoding.Encoder, value: LoaderEntry) {
            encoder.encodeSerializableValue(
                kotlinx.serialization.json.JsonElement.serializer(),
                kotlinx.serialization.json.JsonObject(
                    mapOf(
                        "version" to kotlinx.serialization.json.JsonPrimitive(value.version),
                        "stable" to kotlinx.serialization.json.JsonPrimitive(value.stable),
                    )
                ),
            )
        }
    }

    /**
     * 枚举指定 Minecraft 版本可用的 Fabric loader 版本（meta 端点原序，最新在前）。
     * 仅保留 stable 条目时传 [stableOnly]。
     */
    fun listLoaderVersions(gameVersion: String, stableOnly: Boolean = false): List<LoaderEntry> {
        val text = fetch("/v2/versions/loader/$gameVersion")
        val entries = runCatching { metaJson.decodeFromString(kotlinx.serialization.builtins.ListSerializer(LoaderEntry.serializer()), text) }
            .getOrElse { throw LaunchException("解析 fabric-meta loader 列表失败: $gameVersion (${it.message})", it) }
        return if (stableOnly) entries.filter { it.stable } else entries
    }

    /**
     * 拉取 meta 合并版 profile JSON，归一 id/inheritsFrom/type 后返回派生版本文本。
     * 直接在 JSON 对象层重写字段（保留 meta 的全部未知字段），并回环校验可解析为
     * [VersionSpec]；meta 不可达或返回非法 JSON 时抛 [LaunchException]。
     */
    override fun install(vanilla: VersionSpec, loaderVersion: String): Pair<String, String> {
        val text = fetch("/v2/versions/loader/${vanilla.id}/$loaderVersion/profile/json")
        val obj = runCatching { metaJson.parseToJsonElement(text) as kotlinx.serialization.json.JsonObject }
            .getOrElse { throw LaunchException("解析 fabric-meta profile JSON 失败 (${it.message})", it) }
        val newId = derivedId(vanilla.id)
        val normalized = kotlinx.serialization.json.JsonObject(
            obj + mapOf(
                "id" to kotlinx.serialization.json.JsonPrimitive(newId),
                "inheritsFrom" to kotlinx.serialization.json.JsonPrimitive(vanilla.id),
                "type" to kotlinx.serialization.json.JsonPrimitive("release"),
            ),
        )
        val normalizedText = normalized.toString()
        runCatching { VersionSpec.parse(normalizedText) }
            .getOrElse { throw LaunchException("fabric-meta profile JSON 缺少必需字段: (${it.message})", it) }
        return newId to normalizedText
    }

    /**
     * 离线构造派生版本（meta profile 之外的确定性兜底，亦供结构断言使用）：
     * 继承原版，追加 fabric-loader / intermediary / sponge-mixin 三类必需 library
     * （均声明为 Fabric maven 布局来源），mainClass 换为 Knot。
     */
    fun buildDerivedSpec(vanilla: VersionSpec, loaderVersion: String): VersionSpec {
        val fabricLib = listOf(
            lib("net.fabricmc:fabric-loader:$loaderVersion"),
            lib("net.fabricmc:intermediary:${vanilla.id}"),
            lib("net.fabricmc:sponge-mixin:0.15.4+mixin.0.8.7"),
        )
        return VersionSpec(
            id = derivedId(vanilla.id),
            type = "release",
            mainClass = KNOT_CLIENT,
            inheritsFrom = vanilla.id,
            arguments = vanilla.arguments ?: VersionSpec.Arguments(),
            minecraftArguments = vanilla.minecraftArguments,
            libraries = fabricLib,
            assetIndex = vanilla.assetIndex,
            assets = vanilla.assets,
            javaVersion = vanilla.javaVersion,
        )
    }

    /** 派生版本 id：`<vanilla.id>-fabric`。 */
    fun derivedId(vanillaId: String): String = "$vanillaId$versionSuffix"

    private fun fetch(path: String): String = runCatching { metaFetcher(metaBase.trimEnd('/') + path) }
        .getOrElse { throw LaunchException("访问 fabric-meta 失败: $path (${it.message})", it) }

    private fun lib(name: String) = VersionSpec.Library(
        name = name,
        url = MavenRepository.FABRIC_MAVEN.base,
    )

    companion object {
        /** Fabric Knot 客户端主类。 */
        const val KNOT_CLIENT = "net.fabricmc.loader.impl.launch.knot.KnotClient"

        private val metaJson = Json { ignoreUnknownKeys = true }

        /** 生产默认 fetcher：OkHttp，非 2xx 抛 [LaunchException]。 */
        private val DEFAULT_FETCHER: (String) -> String = { url ->
            val client = okhttp3.OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build()
            val call = client.newCall(okhttp3.Request.Builder().url(url).build())
            call.execute().use { resp ->
                val body = resp.body?.string()
                if (!resp.isSuccessful || body == null) {
                    throw LaunchException("fabric-meta HTTP ${resp.code}: $url")
                }
                body
            }
        }
    }
}
