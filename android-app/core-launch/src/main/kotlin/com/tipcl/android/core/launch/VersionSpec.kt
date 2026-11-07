package com.tipcl.android.core.launch

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonPrimitive

/**
 * 单个版本 JSON 的完整模型（Mojang version JSON schema）。
 *
 * 仅建模启动必需字段；未知字段由 [ignoreUnknownKeys] 忽略。
 * 通过 [parse] 反序列化，通过 [mergeWithParent] 处理 `inheritsFrom` 继承链。
 */
@Serializable
data class VersionSpec(
    val id: String,
    val type: String? = null,
    val mainClass: String,
    val inheritsFrom: String? = null,
    /** 现代版本（1.13+）的 arguments 结构。 */
    val arguments: Arguments? = null,
    /** 旧版本（<1.13）的空格分隔 game 参数串。 */
    val minecraftArguments: String? = null,
    val libraries: List<Library> = emptyList(),
    val assetIndex: AssetIndexInfo? = null,
    /** 顶层下载指针（client jar 等），镜像激活时由 MirrorPolicy 改写。 */
    val downloads: Downloads? = null,
    /** 资源版本名，如 "8"（pre-1.6 为 legacy）。 */
    val assets: String? = null,
    /** 所需 Java 大版本，未标注的旧版本默认 8。 */
    val javaVersion: JavaVersion? = null,
) {
    /** 所需 Java 大版本，缺省视为 8。 */
    @Serializable
    data class JavaVersion(val component: String, val majorVersion: Int)

    /** 下载元数据（client/server 等，启动仅关心 client）。 */
    @Serializable
    data class DownloadInfo(
        val url: String? = null,
        val sha1: String? = null,
        val size: Long = 0,
    )

    /** 现代版本 JSON 顶层 downloads 对象。 */
    @Serializable
    data class Downloads(
        val client: DownloadInfo? = null,
        val server: DownloadInfo? = null,
        val mappings: DownloadInfo? = null,
    )

    /** library 内的 downloads 节点：artifact 为主构件，classifiers 为 natives。 */
    @Serializable
    data class LibraryDownloads(
        val artifact: DownloadInfo? = null,
        val classifiers: Map<String, DownloadInfo> = emptyMap(),
    )

    /** 解压 natives jar 时的排除项。 */
    @Serializable
    data class ExtractRule(val exclude: List<String> = emptyList())

    /**
     * 一条 library 声明。[name] 为 Maven 坐标 group:artifact:version[:classifier]；
     * 老版本 JSON 无 downloads 节点时用 [url] 作为基础 URL 按 Maven 布局拼接。
     */
    @Serializable
    data class Library(
        val name: String,
        val downloads: LibraryDownloads? = null,
        val rules: List<Rule> = emptyList(),
        /** 操作系统 -> natives classifier 名（如 windows -> natives-windows）。 */
        val natives: Map<String, String> = emptyMap(),
        /** 无 downloads 时的自定义 Maven 仓库 base URL。 */
        val url: String? = null,
        val extract: ExtractRule? = null,
    )

    /** assetIndex 指针：详情需再下载 [url] 指向的资源索引。 */
    @Serializable
    data class AssetIndexInfo(
        val id: String,
        val url: String,
        val sha1: String? = null,
        val totalSize: Long = 0,
        val size: Long = 0,
    )

    /**
     * arguments 数组元素：普通字符串或带 rules 的对象
     * （对象内 value 亦可为数组，展开后按序拼接）。
     */
    @Serializable(with = ArgumentSerializer::class)
    data class Argument(
        /** 该参数项展开后的所有字符串片段。 */
        val values: List<String>,
        val rules: List<Rule> = emptyList(),
    )

    /** 现代版本顶层 arguments 节点。 */
    @Serializable
    data class Arguments(
        val game: List<Argument> = emptyList(),
        val jvm: List<Argument> = emptyList(),
    )

    /**
     * 合并继承链：以 [parent]（被继承的版本，即 parent-first 序中的前驱）为底，
     * 子版本的 mainClass/assetIndex/arguments/libraries 覆盖或追加。
     * 依据官方安装器惯例：libraries 追加（子在前），arguments 追加（子在前），
     * 其余标量字段子版本优先。
     */
    fun mergeWithParent(parent: VersionSpec): VersionSpec = copy(
        type = type ?: parent.type,
        minecraftArguments = minecraftArguments ?: parent.minecraftArguments,
        // 子版本的参数排在前面（官方安装器惯例：子优先、父补足）
        arguments = Arguments(
            game = (arguments?.game ?: emptyList()) + (parent.arguments?.game ?: emptyList()),
            jvm = (arguments?.jvm ?: emptyList()) + (parent.arguments?.jvm ?: emptyList()),
        ),
        libraries = libraries + parent.libraries,
        assetIndex = assetIndex ?: parent.assetIndex,
        downloads = downloads ?: parent.downloads,
        assets = assets ?: parent.assets,
        javaVersion = javaVersion ?: parent.javaVersion,
    )

    companion object {
        private val json = Json { ignoreUnknownKeys = true }

        /** 从版本 JSON 字符串解析。 */
        fun parse(text: String): VersionSpec = json.decodeFromString(serializer(), text)
    }
}

/**
 * Argument 的多态反序列化：字符串 → 单值无规则；对象 → rules + value（数组或字符串）。
 */
object ArgumentSerializer : JsonContentPolymorphicSerializer<VersionSpec.Argument>(
    VersionSpec.Argument::class,
) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<VersionSpec.Argument> =
        ArgumentDeserializer

    private object ArgumentDeserializer : kotlinx.serialization.KSerializer<VersionSpec.Argument> {
        override val descriptor = ArgumentSurrogate.serializer().descriptor

        override fun deserialize(decoder: kotlinx.serialization.encoding.Decoder): VersionSpec.Argument {
            val element = decoder.decodeSerializableValue(JsonElement.serializer())
            return when (element) {
                is JsonPrimitive -> VersionSpec.Argument(listOf(element.jsonPrimitive.content))
                is JsonObject -> {
                    val surrogate = Json.decodeFromJsonElement(ArgumentSurrogate.serializer(), element)
                    val raw = surrogate.value ?: return VersionSpec.Argument(emptyList(), surrogate.rules)
                    val values = if (raw is kotlinx.serialization.json.JsonArray) {
                        raw.jsonArray.map { it.jsonPrimitive.content }
                    } else {
                        listOf(raw.jsonPrimitive.content)
                    }
                    VersionSpec.Argument(values, surrogate.rules)
                }
                else -> throw LaunchException("无法解析 argument 节点: $element")
            }
        }

        override fun serialize(
            encoder: kotlinx.serialization.encoding.Encoder,
            value: VersionSpec.Argument,
        ) {
            // 本模块只反序列化官方 JSON，序列化走代理结构即可
            Json.encodeToJsonElement(
                ArgumentSurrogate.serializer(),
                ArgumentSurrogate(value.rules, kotlinx.serialization.json.JsonArray(value.values.map { JsonPrimitive(it) })),
            ).let { encoder.encodeSerializableValue(JsonElement.serializer(), it) }
        }
    }

    @kotlinx.serialization.Serializable
    private data class ArgumentSurrogate(
        val rules: List<Rule> = emptyList(),
        val value: JsonElement? = null,
    )
}
