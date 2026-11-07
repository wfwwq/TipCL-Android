package com.tipcl.android.download

/**
 * 下载管线进度模型：一次建模覆盖三类下载（版本 JSON / library 构件 / assets 资源）。
 *
 * UI 只订阅 [InstanceDownloadService.state]，不接触任何网络或文件操作。
 */

/** 下载阶段，按执行顺序排列。 */
enum class DownloadPhase {
    /** 未开始 / 空闲。 */
    IDLE,

    /** 版本清单条目定位 + 版本 JSON 下载。 */
    VERSION_JSON,

    /** 客户端主 jar（downloads.client）。 */
    CLIENT_JAR,

    /** library 构件（含 natives）。 */
    LIBRARIES,

    /** asset index JSON 下载与解析。 */
    ASSET_INDEX,

    /** assets 资源对象文件。 */
    ASSETS,

    /** Forge installer 下载 / 解包 / install_profile 解析。 */
    FORGE_SETUP,

    /** Forge processors 依序执行（重映射 / 打补丁等，断点续跑）。 */
    FORGE_PROCESSORS,

    /** 全部完成。 */
    DONE,
}

/**
 * 单次进度快照。
 *
 * @param phase 当前阶段
 * @param totalBytes 本阶段已知总字节数（旧版本 library 无 size 声明时为 0，进度条按比例钳制）
 * @param downloadedBytes 本阶段已完成字节
 * @param filesDone 已完成文件数
 * @param filesTotal 本阶段文件总数
 * @param currentFile 正在下载的文件名（Maven 相对路径或资源路径）
 * @param speedBps 平滑后的下载速度（字节/秒）
 * @param message 附加提示（跳过统计、失败数、镜像信息等）
 */
data class DownloadProgress(
    val phase: DownloadPhase,
    val totalBytes: Long = 0,
    val downloadedBytes: Long = 0,
    val filesDone: Int = 0,
    val filesTotal: Int = 0,
    val currentFile: String = "",
    val speedBps: Long = 0,
    val message: String? = null,
)

/** 安装任务整体状态（向导进度页直接渲染）。 */
sealed interface InstallState {
    data object Idle : InstallState

    data class Running(val progress: DownloadProgress) : InstallState

    /**
     * 安装成功，携带最终实例 id（即 versions 子目录名）。
     * [warning] 非空表示流程有降级（如 Quilt meta 不可达回退本地骨架），UI 应展示给用户。
     */
    data class Completed(val instanceId: String, val warning: String? = null) : InstallState

    data class Failed(val message: String) : InstallState
}

/** 版本清单列表项（UI 展示模型）。 */
data class VersionListItem(
    val id: String,
    /** release / snapshot / old_beta / old_alpha。 */
    val type: String,
    /** 发布时间（ISO-8601 原文）。 */
    val releaseTime: String,
    /** 版本 JSON 详情 URL。 */
    val url: String,
) {
}

/** 清单拉取结果：列表 + 来源/错误信息（网络失败回退缓存时 [error] 非空）。 */
data class VersionListResult(
    val versions: List<VersionListItem>,
    /** true 表示本次数据来自缓存（内存或本地文件）而非新鲜网络响应。 */
    val fromCache: Boolean,
    val error: String? = null,
)
