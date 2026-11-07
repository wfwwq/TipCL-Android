package com.tipcl.android.core.launch

import java.nio.file.Path

/** 启动阶段枚举：进度回调与 UI 文案共用的阶段标识。 */
enum class LaunchStage {
    /** 解析版本 JSON（含 inheritsFrom 链合并）。 */
    RESOLVE_VERSION,

    /** 解析 library 依赖（classpath 与 natives 清单）。 */
    RESOLVE_LIBRARIES,

    /** 检测资源文件完整性。 */
    CHECK_ASSETS,

    /** 确保 JRE 可用（下载/解压由 RuntimeProvisioner 实现）。 */
    PROVISION_RUNTIME,

    /** 组装最终 LaunchPlan。 */
    BUILD_PLAN,
}

/**
 * 下载/安装进度回调接口，供 UI 层绑定。
 *
 * [onStage] 表示进入某阶段（detail 为人读说明，可为空）；
 * [onProgress] 表示该阶段内的计数进度（done/total）。
 * 两者均可能被后台线程调用，实现方需自行切主线程。
 */
interface ProgressListener {
    fun onStage(stage: LaunchStage, detail: String = "")

    fun onProgress(stage: LaunchStage, done: Int, total: Int)
}

/** 空实现，供不关心进度的调用方使用。 */
object NoOpProgressListener : ProgressListener {
    override fun onStage(stage: LaunchStage, detail: String) = Unit

    override fun onProgress(stage: LaunchStage, done: Int, total: Int) = Unit
}

/** 版本所需的 JRE 规格：由版本 JSON 的 javaVersion.majorVersion 推导（缺省 8）。 */
data class RuntimeRequirement(
    /** Java 大版本号，如 8 / 17 / 21。 */
    val major: Int,
) {
    init {
        require(major in 5..99) { "非法 Java 大版本: $major" }
    }

    /** 人类可读描述，如 "Java 17"。 */
    val displayName: String get() = "Java $major"
}

/** 已就绪的 JRE 句柄。 */
data class RuntimeHandle(
    /** java 可执行文件绝对路径。 */
    val javaExecutable: String,
    /** 实际提供的 Java 大版本（应 >= 需求）。 */
    val majorVersion: Int,
)

/**
 * JRE 供给接口（依赖注入边界）：core-launch 只声明"需要 Java N"，
 * 具体的下载/解压/缓存由实现方负责（app 层接 core-runtime 的
 * RemoteRuntimeProvider / GameProcessBuilder）。测试注入假实现。
 */
interface RuntimeProvisioner {
    /** 指定规格的 JRE 是否已就绪（只查询，不触发下载）。 */
    fun isRuntimeReady(requirement: RuntimeRequirement): Boolean

    /** 确保 JRE 可用，必要时触发下载安装（阻塞），返回可用的运行时句柄。 */
    fun ensureRuntime(requirement: RuntimeRequirement, listener: ProgressListener?): RuntimeHandle
}

/**
 * 启动计划的最终产物：进程命令行所需的全部要素 + 启动前的资源/运行时体检结果。
 * 由 [LaunchService.assembleLaunchPlan] 产出，供执行层（如 core-runtime 的
 * GameProcessBuilder）直接消费。
 */
data class LaunchPlan(
    /** 请求启动的实例 id。 */
    val instanceId: String,
    /** 最终参与启动的版本 id（fabric 派生版本为其自身 id）。 */
    val versionId: String,
    /** 主类全限定名。 */
    val mainClass: String,
    /** JVM 参数（不含 java 可执行文件；末尾含 -cp）。 */
    val jvmArgs: List<String>,
    /** game 参数（含 --username 等）。 */
    val gameArgs: List<String>,
    /** classpath 各条目（绝对路径，保序去重）。 */
    val classpath: List<String>,
    /** natives 解压目标目录（占位路径，解压由执行层完成）。 */
    val nativeLibDir: Path,
    /** 共享 assets 根目录。 */
    val assetsDir: Path,
    /** 实例根目录（即 InstanceManager 的 root）。 */
    val instanceDir: Path,
    /** 共享 libraries 根目录。 */
    val librariesDir: Path,
    /** 游戏工作目录（--game_directory 占位取值）。 */
    val gameDir: Path,
    /** 版本所需的 Java 大版本。 */
    val javaRequirement: RuntimeRequirement,
    /** 选定的 java 可执行文件（用户指定或 RuntimeProvisioner 提供）。 */
    val javaExecutable: String,
    /** 本地缺失的资源对象清单（空表示资源齐备或索引不可用）。 */
    val missingAssets: List<PendingAsset>,
    /** library 解析结果（含待下载 natives）。 */
    val libraryResolution: LibraryResolution,
    /** 内存分配调整说明（档位推荐、钳制原因等）；未套用档位时与 options.memoryNotes 一致。 */
    val memoryNotes: List<MemoryNote> = emptyList(),
)
