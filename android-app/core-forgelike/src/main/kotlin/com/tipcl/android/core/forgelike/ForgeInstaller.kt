package com.tipcl.android.core.forgelike

import kotlinx.serialization.json.Json

/**
 * Forge 安装器：解析 `install_profile.json` 为 [ForgeInstallProfile]，
 * 并产出"待执行任务列表"骨架（下载构件 → 依序执行 processors → 生成运行期版本 JSON）。
 *
 * 简化策略（公开规范驱动，未抄任何启动器实现）：
 * 1. 只建模现代格式 install_profile（1.6+），老式 install/versionInfo 双节点格式不支持；
 * 2. processors 清单原样保留为数据结构并展开为 [ForgePendingTask] 列表，但不执行——
 *    processor 需要在安装机上跑任意 Java 工具 jar（SpecialSource 重映射、BinaryPatch
 *    打补丁），涉及下载工具链、`{KEY}` 数据占位符展开与 outputs 校验，工程量大且
 *    需要可靠的本机 JVM 调用路径，放到 M4.5；
 * 3. [install] 直接产出一份 `inheritsFrom` 原版 + Forge 主类占位的运行期版本 JSON 骨架，
 *    使实例可被实例管理器落盘并出现在列表中；正式的 client jar 必须等 processors
 *    执行完成后才是可启动状态（骨架 JSON 中以 `tipclPendingForgeProcessing` 标记字段注明）。
 */
class ForgeInstaller : ModLoaderInstaller {

    override val id: String = "forge"

    private val json = Json { ignoreUnknownKeys = true }

    /** 解析 install_profile.json 文本；格式不合法抛 IllegalArgumentException。 */
    fun parseInstallProfile(text: String): ForgeInstallProfile = json.decodeFromString(text)

    /**
     * 将 profile 展开为有序待执行任务列表。
     * 顺序遵循官方规范：先下载 libraries，再按清单顺序执行 processors。
     */
    fun buildPendingTasks(profile: ForgeInstallProfile): List<ForgePendingTask> {
        val tasks = mutableListOf<ForgePendingTask>()
        profile.libraries.forEach { lib ->
            tasks += ForgePendingTask.DownloadLibrary(artifact = lib.name, baseUrl = lib.downloadBaseUrl)
        }
        profile.processors.forEach { p ->
            val side = p.sides
            if (side == null || "client" in side) {
                tasks += ForgePendingTask.RunProcessor(
                    mainArtifact = p.jar,
                    classpath = p.classpath.toList(),
                    args = p.args.toList(),
                    outputs = p.outputs.toMap(),
                )
            }
        }
        // 新式 profile（1.20.1 实测）version 字段已是 "1.20.1-forge-47.4.28" 全名，
        // 不能再拼一次 minecraft 前缀；旧式（离线测试样例）version 只有加载器号。
        val declaredVersion = profile.version
        val newId = if ("forge" in declaredVersion) declaredVersion
        else instanceIdFor(profile.minecraft, declaredVersion)
        tasks += ForgePendingTask.FinalizeVersionJson(newId = newId)
        return tasks
    }

    override fun install(vanillaId: String, loaderVersion: String): Pair<String, String> {
        // M4 阶段未联网拉取 install_profile（真实安装需下载 Forge installer jar 并解包），
        // 此处以公开规范中的字段布局生成骨架：processors 下载与执行留待 TODO(M4.5)。
        val newId = instanceIdFor(vanillaId, loaderVersion)
        val versionJson = buildString {
            append("{\n")
            append("  \"id\": \"$newId\",\n")
            append("  \"inheritsFrom\": \"$vanillaId\",\n")
            append("  \"type\": \"release\",\n")
            // Forge 1.13+ 官方主类；旧版本为 cpw.mods.modlauncher.Launcher 之前的 ClientLaunchHandler 体系。
            append("  \"mainClass\": \"cpw.mods.modlauncher.Launcher\",\n")
            append("  \"tipclPendingForgeProcessing\": true,\n")
            append("  \"tipclForgeLoaderVersion\": \"$loaderVersion\",\n")
            append("  \"libraries\": []\n")
            append("}\n")
        }
        return newId to versionJson
    }

    companion object {
        /** 实例 id 命名：<mc>-forge-<loader>，与社区通行版本命名一致以便用户识别。 */
        fun instanceIdFor(minecraft: String, loaderVersion: String): String =
            "$minecraft-forge-$loaderVersion"
    }
}

/** Forge 安装的待执行任务骨架，由 [ForgeInstaller.buildPendingTasks] 产出。 */
sealed interface ForgePendingTask {
    /** 下载一条 Maven 构件到共享 libraries 目录。 */
    data class DownloadLibrary(val artifact: String, val baseUrl: String?) : ForgePendingTask

    /**
     * 执行一个 processor 工具 jar。TODO(M4.5)：需要本机 JVM 进程调用、
     * {KEY} 数据占位符展开与 outputs 摘要校验，M4 仅产出计划不执行。
     */
    data class RunProcessor(
        val mainArtifact: String,
        val classpath: List<String>,
        val args: List<String>,
        val outputs: Map<String, String>,
    ) : ForgePendingTask

    /** 用 processors 产物（去混淆打补丁后的 client jar）生成运行期版本 JSON。 */
    data class FinalizeVersionJson(val newId: String) : ForgePendingTask
}
