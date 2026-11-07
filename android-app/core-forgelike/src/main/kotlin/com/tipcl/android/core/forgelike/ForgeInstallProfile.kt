package com.tipcl.android.core.forgelike

import kotlinx.serialization.Serializable

/**
 * Forge `install_profile.json`（现代格式，1.6+ 安装器）的数据模型。
 *
 * 依据 Forge 官方安装器公开规范简化建模：
 * - `minecraft` / `version`：目标原版与 Forge 版本号；
 * - `libraries`：安装期与运行期全部 Maven 构件声明；
 * - `processors`：需按顺序在安装机上执行的工具任务（SpecialSource、BinaryPatch 等）；
 * - `data`：processor 参数中的占位符数据表（{MINECRAFT_JAR}、{SIDE} 等 key → client/server 值）。
 *
 * 老式（≤1.5）install_profile 的 `install`/`versionInfo` 双节点格式不在本阶段范围。
 */
@Serializable
data class ForgeInstallProfile(
    val minecraft: String,
    val version: String,
    val libraries: List<ProfileLibrary> = emptyList(),
    val processors: List<Processor> = emptyList(),
    val data: Map<String, SideData> = emptyMap(),
) {
    /**
     * Maven 构件声明。兼容两种真实变体：
     * - 旧式：`url`（下载基址）+ 可选 `clientreq`/`serverreq`；
     * - spec 1 新式（1.20.1 实测）：`downloads.artifact.{path,url,sha1,size}`，
     *   无 `url`/`clientreq` 字段。
     */
    @Serializable
    data class ProfileLibrary(
        val name: String,
        val url: String? = null,
        val clientreq: Boolean? = null,
        val serverreq: Boolean? = null,
        val downloads: Downloads? = null,
    ) {
        /** 新式下载元数据节点。 */
        @Serializable
        data class Downloads(val artifact: Artifact? = null)

        /** 单构件下载信息：Maven 布局相对路径 + 绝对下载地址 + sha1 + 字节数。 */
        @Serializable
        data class Artifact(
            val path: String? = null,
            val url: String? = null,
            val sha1: String? = null,
            val size: Long? = null,
        )

        /** 该构件的下载基址：旧式 url 优先，回退新式 downloads.artifact.url。 */
        val downloadBaseUrl: String?
            get() = url ?: downloads?.artifact?.url
    }

    /**
     * 单个 processor 任务：`jar` 为主工具构件，`classpath` 为依赖集合，
     * `args` 中形如 `{KEY}` 的项需用 [ForgeInstallProfile.data] 展开。
     */
    @Serializable
    data class Processor(
        val sides: List<String>? = null,
        val jar: String,
        val classpath: List<String> = emptyList(),
        val args: List<String> = emptyList(),
        val outputs: Map<String, String> = emptyMap(),
    )

    /** data 表项：同一 key 在 client / server 侧的取值不同。 */
    @Serializable
    data class SideData(val client: String, val server: String)
}
