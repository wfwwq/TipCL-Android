package com.tipcl.android.core.forgelike

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject
import java.net.HttpURLConnection
import java.net.URI
import java.time.Duration

/**
 * Quilt 安装器：结构同 Fabric 的安装方式——从 Quilt meta 拉取一份
 * Fabric 兼容的版本 JSON（`inheritsFrom` 原版 + Quilt Loader 及其依赖库），
 * 落盘后该版本即可作为独立实例启动。
 *
 * meta 端点（公开 API）：
 * `https://meta.quiltmc.org/v3/versions/loader/<game_version>/<loader_version>/profile/json`
 *
 * M4 简化：联网失败（离线/镜像不可用）时回退到本地骨架版本 JSON
 * （inheritsFrom + Quilt 主类占位），保证向导流程可走通；正式 libraries
 * 清单需在联网安装时补全。
 */
class QuiltInstaller(
    /** meta 服务根地址，可替换为镜像源。 */
    private val metaBaseUrl: String = "https://meta.quiltmc.org/v3/versions/loader",
    /** 联网超时，Android 设备网络较慢取宽松值。 */
    private val timeout: Duration = Duration.ofSeconds(20),
) : ModLoaderInstaller {

    override val id: String = "quilt"

    override fun install(vanillaId: String, loaderVersion: String): Pair<String, String> {
        val newId = instanceIdFor(vanillaId, loaderVersion)
        val fetched = fetchProfileJson(vanillaId, loaderVersion)
        if (fetched != null) {
            // meta 返回的 profile 中 id 字段为 Fabric 风格命名，统一改写为本工程实例 id。
            val obj = Json.parseToJsonElement(fetched).jsonObject
            val patched = JsonObject(LinkedHashMap(obj).apply { put("id", JsonPrimitive(newId)) })
            return newId to patched.toString()
        }
        return newId to fallbackVersionJson(vanillaId, loaderVersion, newId)
    }

    /** 请求 Quilt meta 的 profile JSON；任何网络/解析失败返回 null（由调用方回退骨架）。 */
    private fun fetchProfileJson(vanillaId: String, loaderVersion: String): String? {
        return try {
            val url = URI.create("$metaBaseUrl/$vanillaId/$loaderVersion/profile/json").toURL()
            val conn = url.openConnection() as HttpURLConnection
            conn.connectTimeout = timeout.toMillis().toInt()
            conn.readTimeout = timeout.toMillis().toInt()
            conn.requestMethod = "GET"
            try {
                if (conn.responseCode !in 200..299) return null
                conn.inputStream.bufferedReader().readText()
            } finally {
                conn.disconnect()
            }
        } catch (_: Exception) {
            null
        }
    }

    /** 离线骨架：结构与 meta 返回的 profile 一致，但 libraries 留空待联网补全。 */
    private fun fallbackVersionJson(vanillaId: String, loaderVersion: String, newId: String): String =
        buildString {
            append("{\n")
            append("  \"id\": \"$newId\",\n")
            append("  \"inheritsFrom\": \"$vanillaId\",\n")
            append("  \"type\": \"release\",\n")
            // Quilt Loader 复用 Fabric 的 Knot 启动体系（公开文档），主类与 Fabric 相同。
            append("  \"mainClass\": \"net.fabricmc.loader.impl.launch.knot.KnotClient\",\n")
            append("  \"tipclPendingQuiltLibraries\": true,\n")
            append("  \"tipclQuiltLoaderVersion\": \"$loaderVersion\",\n")
            append("  \"libraries\": []\n")
            append("}\n")
        }

    companion object {
        /** 实例 id 命名：<mc>-quilt-<loader>。 */
        fun instanceIdFor(minecraft: String, loaderVersion: String): String =
            "$minecraft-quilt-$loaderVersion"
    }
}
