package com.tipcl.android.launch

import android.content.Context
import android.util.Log
import com.tipcl.android.R
import com.tipcl.android.core.audio.AudioInitHook
import com.tipcl.android.core.launch.InstanceManager
import com.tipcl.android.core.launch.LaunchOptions
import com.tipcl.android.core.launch.LaunchPlan
import com.tipcl.android.core.launch.LaunchPlanValidator
import com.tipcl.android.core.launch.LaunchService
import com.tipcl.android.core.launch.LaunchStage
import com.tipcl.android.core.launch.ProgressListener
import com.tipcl.android.core.launch.ValidationCode
import com.tipcl.android.core.launch.ValidationIssue
import com.tipcl.android.core.launch.ValidationSeverity
import com.tipcl.android.core.runtime.GameProcessBuilder
import com.tipcl.android.core.runtime.GameProcessLauncher
import com.tipcl.android.core.runtime.GameLaunchSpec
import com.tipcl.android.core.runtime.LaunchArgsProvider
import com.tipcl.android.core.runtime.LocalRuntimeCatalog
import java.nio.file.Files
import java.nio.file.Path

/**
 * 启动链路总编排（进程级单例）：
 *
 * ```
 * GameHostActivity(instanceId + 设置摘要 extras)
 *   → TipCLLaunchCoordinator.validate   （LaunchPlanValidator，问题清单 → UI"缺什么"）
 *   → repairMissingAssets               （缺失 assets 一键补齐，可跳过）
 *   → LaunchService.assembleLaunchPlan  （版本合并/library 解析/JRE 供给/参数拼装）
 *   → 映射 GameLaunchSpec（app 层适配器，含 AudioInitHook jvm 属性注入）
 *   → GameProcessLauncher.launch        （natives 解压 → 进程拉起）
 *   → stdout/stderr 泵 → logcat + GameHost 状态栏；awaitExit → stderrTail
 * ```
 *
 * core-launch / core-runtime 只读：接口不对齐处（LaunchPlan → GameLaunchSpec
 * 弱类型映射、RuntimeProvisioner 包装）全部在本类/本包内完成。
 */
class TipCLLaunchCoordinator private constructor(context: Context) {

    private val appContext: Context = context.applicationContext

    companion object {
        const val TAG = "TipCL.Launch"
        const val TAG_GAME = "TipCL.Game"

        /** GameProcessLauncher 只复用 GameProcessBuilder 的泵/等待/停止；
         *  其 launch(majorVersion…) 路径不再被走，故此处为占位 stub。 */
        private val LAUNCH_ARGS_STUB = object : LaunchArgsProvider {
            override fun provide(): LaunchArgsProvider.LaunchSpec =
                throw UnsupportedOperationException("superseded by GameProcessLauncher + GameLaunchSpec")
        }

        @Volatile
        private var sharedInstance: TipCLLaunchCoordinator? = null

        fun get(context: Context): TipCLLaunchCoordinator =
            sharedInstance ?: synchronized(this) {
                sharedInstance
                    ?: TipCLLaunchCoordinator(context.applicationContext).also { sharedInstance = it }
            }
    }

    /** app 数据根（filesDir），JRE 目录 / 实例根 / TMPDIR 均挂在其下。 */
    val appDataDir: Path = context.filesDir.toPath()

    /** 实例根目录，与 TipCLInstanceStore.instancesRoot、core-launch InstanceManager 对齐。 */
    val instancesRoot: Path = appDataDir.resolve("instances")

    /** 运行时供给的状态文案（下载/解压进度），UI 可直接订阅展示。 */
    val runtimeStatus = kotlinx.coroutines.flow.MutableStateFlow<String?>(null)

    private val instanceManager = InstanceManager(instancesRoot)
    private val provisioner = TipCLRuntimeProvisioner(appDataDir, runtimeStatus)

    /** 供设置页等外部查询运行时就绪态。 */
    fun isRuntimeReady(major: Int) = provisioner.isRuntimeReady(com.tipcl.android.core.launch.RuntimeRequirement(major))

    private val launchService = LaunchService(instanceManager, runtimeProvisioner = provisioner)
    private val validator = LaunchPlanValidator(
        instanceManager,
        runtimeReady = { requirement -> provisioner.isRuntimeReady(requirement) },
    )
    private val processLauncher = GameProcessLauncher(
        GameProcessBuilder(LocalRuntimeCatalog(appDataDir), LAUNCH_ARGS_STUB),
    )

    /**
     * 由 UI 传入的摘要 extras 组装 [LaunchOptions]：
     * javaExecutable 留空 → 由 [provisioner] 按版本需求供给；
     * 内存/JVM 参数来自设置页（真实进入命令行）；
     * gameDirectory 缺省取实例根（与 InstanceManager 布局对齐，saves 共享）。
     */
    fun buildOptions(
        minMemoryMb: Int,
        maxMemoryMb: Int,
        extraJvmArgs: List<String>,
        gameDirectory: String?,
        playerName: String,
    ): LaunchOptions = LaunchOptions(
        javaExecutable = "",
        minMemoryMb = minMemoryMb.takeIf { it > 0 },
        maxMemoryMb = maxMemoryMb.takeIf { it > 0 },
        extraJvmArgs = extraJvmArgs,
        gameDirectory = (gameDirectory?.takeIf { it.isNotBlank() } ?: instancesRoot.toString()),
        playerName = playerName.ifBlank { "Player" },
    )

    /** 启动前体检（不触发下载）。 */
    fun validate(instanceId: String, options: LaunchOptions): List<ValidationIssue> =
        runCatching { validator.validate(instanceId, options) }.getOrElse { listOf(
            ValidationIssue(
                ValidationCode.VERSION_JSON_MISSING,
                ValidationSeverity.ERROR,
                it.message ?: appContext.getString(R.string.launch_failed_load),
            ),
        ) }

    /** UI 侧"缺什么"的合并文案（每条问题一行）。 */
    fun issueSummary(issues: List<ValidationIssue>): String =
        issues.joinToString("\n") { it.message }

    /**
     * 补齐缺失 assets（对应 ASSETS_INCOMPLETE 问题的一键修复）。
     * @return 本次下载的资源数。
     */
    fun repairMissingAssets(instanceId: String, listener: ProgressListener? = null): Int {
        val merged = launchService.loadMergedSpec(instanceId)
        val assetsDir = instanceManager.assetsDir
        val pending = launchService.computeMissingAssets(merged, assetsDir)
        if (pending.isEmpty()) return 0
        listener?.onStage(LaunchStage.CHECK_ASSETS, appContext.getString(R.string.repair_assets_count, pending.size))
        val result = com.tipcl.android.core.launch.AssetInstaller(
            okhttp3.OkHttpClient(),
            assetsDir,
        ).install(pending)
        Log.i(TAG, "asset repair done: ${result.ok} ok, ${result.failed.size} failed")
        return result.ok
    }

    /**
     * 阻塞执行：组装计划（必要时下载 JRE，进度经 [listener]/[runtimeStatus] 外发）
     * → 映射 spec → 拉起进程。进程输出泵在返回前已接好 logcat。
     */
    fun launch(
        instanceId: String,
        options: LaunchOptions,
        listener: ProgressListener? = null,
        soundEnabled: Boolean = true,
    ): TipCLGameHandle {
        val plan = launchService.assembleLaunchPlan(instanceId, options, listener)
        Log.i(TAG, "plan ready: version=${plan.versionId} java=${plan.javaExecutable} sound=$soundEnabled")
        val spec = toGameLaunchSpec(plan, soundEnabled)
        val result = processLauncher.launch(spec)
        result.logs.onStdoutLine = { line -> Log.i(TAG_GAME, line) }
        result.logs.onStderrLine = { line -> Log.w(TAG_GAME, line) }
        return TipCLGameHandle(result, plan)
    }

    /** 阻塞等待退出（结构化 GameExit，含 stderr 尾部）。 */
    fun awaitExit(handle: TipCLGameHandle): GameProcessBuilder.GameExit =
        processLauncher.awaitExit(handle.result)

    /** 用户主动退出游戏。 */
    fun stop(handle: TipCLGameHandle) = processLauncher.stop(handle.result)

    /**
     * LaunchPlan → GameLaunchSpec 弱类型映射（core-runtime 有意不依赖 core-launch）：
     * - nativeJars = libraryResolution.natives 展开 librariesDir+relativePath
     *   （GameProcessLauncher 启动前解压到 nativeLibDir）；
     * - jvmArgs 追加 AudioInitHook 的 openal.library.path（仅 JVM 属性注入，
     *   OpenAL native 未就绪不影响启动路径）；soundEnabled=false 时整段跳过
     *   （无 openal 属性，音频供给 OpenAlProvisioner 也不会被触发）；
     * - env 补 HOME（游戏工作目录）与 TMPDIR（Android 无 /tmp，必须显式给）。
     */
    private fun toGameLaunchSpec(plan: LaunchPlan, soundEnabled: Boolean): GameLaunchSpec {
        Files.createDirectories(appDataDir.resolve("tmp"))
        val jvmArgs = if (soundEnabled) {
            AudioInitHook.injectOpenAlArgs(plan.jvmArgs, plan.nativeLibDir.toFile())
        } else {
            plan.jvmArgs
        }
        return GameLaunchSpec(
            mainClass = plan.mainClass,
            classpath = plan.classpath,
            jvmArgs = jvmArgs,
            gameArgs = plan.gameArgs,
            javaExecutable = plan.javaExecutable,
            workingDir = plan.gameDir.toString(),
            nativeLibDir = plan.nativeLibDir.toString(),
            nativeJars = plan.libraryResolution.natives.map {
                plan.librariesDir.resolve(it.relativePath).toAbsolutePath().toString()
            },
            env = mapOf(
                "HOME" to plan.gameDir.toString(),
                "TMPDIR" to appDataDir.resolve("tmp").toString(),
            ),
        )
    }
}

/** 一次成功拉起的游戏进程句柄。 */
class TipCLGameHandle(
    val result: GameProcessBuilder.LaunchResult,
    val plan: LaunchPlan,
) {
    fun stderrTail(): List<String> = result.logs.stderrTail()
}
