package com.tipcl.android.core.forgelike

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.put

/**
 * [ForgePendingTask.FinalizeVersionJson] 的执行器：processors 全部成功后，
 * 依据 profile 的 libraries 声明生成可启动的运行期版本 JSON。
 *
 * 合并策略（公开规范驱动）：
 * - 新版本 `id` = 任务 newId，`inheritsFrom` = 原版 id，运行期由启动器按继承链合并；
 * - 顶层 `libraries` 为 profile.libraries 的运行期子集（clientreq != false），
 *   保留声明 `url` 便于启动器按 Maven 布局补下载；
 * - 移除 M4 骨架中的 `tipclPendingForgeProcessing` 标记与占位字段，
 *   落盘后该实例即进入可启动状态。
 *
 * 输入的 vanilla JSON 仅用于校验继承目标存在性描述信息（可选），生成逻辑本身
 * 不内联复制原版内容——继承语义交给启动器的版本链解析。
 */
class ForgeVersionJsonFinalizer(private val profile: ForgeInstallProfile) {

    private val json = Json { prettyPrint = true }

    /** 生成最终版本 JSON 文本；[vanillaJson] 为原版版本 JSON（可选，仅读取 inheritsFrom 校验）。 */
    fun finalize(task: ForgePendingTask.FinalizeVersionJson, vanillaJson: String? = null): String {
        if (vanillaJson != null) {
            val vanilla = json.parseToJsonElement(vanillaJson).jsonObject
            check(vanilla["id"]?.toString()?.trim('"') != null) { "vanilla JSON 缺少 id" }
        }
        val runtimeLibraries = profile.libraries
            .filter { it.clientreq != false }
            .map { lib ->
                buildJsonObject {
                    put("name", lib.name)
                    if (lib.url != null) put("url", lib.url)
                }
            }
        val obj = buildJsonObject {
            put("id", task.newId)
            put("inheritsFrom", profile.minecraft)
            put("type", "release")
            // Forge 1.13+ 官方主类；旧版本（≤1.12，paulscode 体系）不在现代 profile 范围。
            put("mainClass", MAIN_CLASS)
            put("libraries", JsonArray(runtimeLibraries))
            put("tipclForgeLoaderVersion", profile.version)
        }
        return json.encodeToString(JsonObject.serializer(), obj)
    }

    companion object {
        const val MAIN_CLASS = "cpw.mods.modlauncher.Launcher"
    }
}

/** 便捷入口：从既有（M4 骨架）版本 JSON 文本升级为最终版。 */
fun ForgeVersionJsonFinalizer.finalizeFromSkeleton(task: ForgePendingTask.FinalizeVersionJson, skeletonJson: String): String {
    val skeleton = Json.parseToJsonElement(skeletonJson).jsonObject
    require(skeleton["tipclPendingForgeProcessing"]?.let { (it as? JsonPrimitive)?.content == "true" } ?: false) {
        "骨架版本 JSON 未标记 tipclPendingForgeProcessing，可能已是最终版"
    }
    val finalized = finalize(task)
    check(!finalized.contains("tipclPendingForgeProcessing")) { "最终 JSON 不应残留 pending 标记" }
    return finalized
}
