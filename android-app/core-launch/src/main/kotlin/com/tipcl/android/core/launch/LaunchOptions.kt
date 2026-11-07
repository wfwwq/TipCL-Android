package com.tipcl.android.core.launch

import java.util.UUID

/**
 * 用户侧启动选项：内存、JVM 额外参数、窗口、账号等。
 * 与 [VersionSpec] 一起输入 [LaunchArgsBuilder] 产出最终命令行。
 */
data class LaunchOptions(
    /** java 可执行文件路径（必须）。 */
    val javaExecutable: String,
    /** JVM 初始堆，MB；null 使用 JVM 默认。 */
    val minMemoryMb: Int? = null,
    /** JVM 最大堆，MB；null 使用 JVM 默认。 */
    val maxMemoryMb: Int? = null,
    /** 用户附加 JVM 参数（置于版本 jvm arguments 之前）。 */
    val extraJvmArgs: List<String> = emptyList(),
    /** 用户附加 game 参数（追加到版本 game arguments 之后）。 */
    val extraGameArgs: List<String> = emptyList(),
    /** 启动器名称，用于 ${launcher_name} 占位。 */
    val launcherName: String = "TipCL",
    /** 启动器版本号，用于 ${launcher_version} 占位。 */
    val launcherVersion: String = "0.1.0",
    /** 游戏工作目录（即实例根）；null 时由调用方决定。 */
    val gameDirectory: String? = null,
    /** 玩家名（离线模式即此名）。 */
    val playerName: String = "Player",
    /** 玩家 UUID；null 时按离线模式由玩家名确定（uuid:uuid 语义）。 */
    val playerUuid: UUID? = null,
    /** 访问令牌；离线模式用占位 0。 */
    val accessToken: String = "0",
    /** 窗口宽度；非 null 时追加 --width（并激活 has_custom_resolution feature）。 */
    val windowWidth: Int? = null,
    /** 窗口高度；非 null 时追加 --height。 */
    val windowHeight: Int? = null,
    /** 是否全屏（true 时追加 --fullscreen）。 */
    val fullscreen: Boolean = false,
    /** 是否以 demo 模式启动。 */
    val demo: Boolean = false,
    /** 自动加入服务器地址；null 不加入。 */
    val serverAddress: String? = null,
    /** 自动加入服务器端口。 */
    val serverPort: Int? = null,
    /** 内存分配调整说明（档位推荐、钳制原因等）；手动构造时为空。 */
    val memoryNotes: List<MemoryNote> = emptyList(),
) {
    /** 已解析的玩家 UUID（离线模式：v3 名字 UUID）。 */
    val resolvedUuid: UUID get() = playerUuid ?: offlineUuid(playerName)

    companion object {
        /** 离线模式 UUID：name 的 UUIDv3（与社区通行做法一致的 MD5 命名空间推导）。 */
        fun offlineUuid(name: String): UUID =
            UUID.nameUUIDFromBytes("OfflinePlayer:$name".toByteArray(Charsets.UTF_8))

        /**
         * 按设备总内存产出启动选项。
         *
         * @param totalMemMB 设备总内存（MB），调用方从 ActivityManager 换算后传入。
         * @param userOverride 用户显式设置的 (min, max)，MB；null 表示使用档位推荐值。
         *   显式设置优先，但 max 会被钳制到总内存 60%，超出部分以 warning 级说明记录。
         * @return 启动选项；[memoryNotes][LaunchOptions.memoryNotes] 携带全部调整说明。
         */
        fun forDevice(totalMemMB: Int, userOverride: Pair<Int, Int>? = null): LaunchOptions {
            val profile = MemoryProfile.of(totalMemMB)
            val notes = profile.notes.toMutableList()

            val (min, max) = if (userOverride == null) {
                profile.recommendedMinMb to profile.recommendedMaxMb
            } else {
                val (userMin, userMax) = userOverride
                require(userMin > 0 && userMax > 0) {
                    "用户内存设置必须为正数，实际: min=$userMin, max=$userMax"
                }
                val userCap = (totalMemMB * MemoryProfile.USER_MAX_RATIO).toInt()
                var clampedMin = userMin
                var clampedMax = userMax
                if (clampedMax > userCap) {
                    clampedMax = userCap
                    notes += MemoryNote.warning(
                        "手动设置的最大内存 ${userMax}MB 超过设备总内存 $totalMemMB 的 60%" +
                            "（上限 ${userCap}MB），已自动调整为 ${userCap}MB。"
                    )
                }
                if (clampedMin > clampedMax) {
                    clampedMin = clampedMax
                    notes += MemoryNote.warning(
                        "手动设置的初始内存 ${userMin}MB 大于调整后的最大内存，" +
                            "已同步下调至 ${clampedMin}MB。"
                    )
                }
                clampedMin to clampedMax
            }

            return LaunchOptions(
                javaExecutable = "java",
                minMemoryMb = min,
                maxMemoryMb = max,
                memoryNotes = notes,
            )
        }
    }
}

/**
 * 模加载器安装接口占位：由各 modloader 实现负责向实例目录注入
 * 修改后的版本 JSON（inheritsFrom 原版）与所需 library。
 *
 * TODO(Fabric): 实现 Fabric 版本——向 fabric-meta 拉取
 *   `https://meta.fabricmc.net/v2/versions/loader/<mc>/<loader>/profile/json`
 *   并按 [install] 写入实例目录；后续再补 Quilt/Forge。
 */
interface ModLoaderInstaller {
    /** 该加载器的标识（fabric / quilt / forge）。 */
    val id: String

    /**
     * 为原版版本 [vanilla] 安装 modloader，返回新版本 JSON 文本。
     * 实现应把结果交给 [InstanceManager.installInstance] 落盘。
     *
     * @param vanilla 已解析的原版 VersionSpec
     * @param loaderVersion 加载器版本号
     * @return 生成的新版本 id 与版本 JSON 文本
     */
    fun install(vanilla: VersionSpec, loaderVersion: String): Pair<String, String>
}
