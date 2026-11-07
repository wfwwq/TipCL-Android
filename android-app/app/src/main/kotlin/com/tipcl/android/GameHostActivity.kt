package com.tipcl.android

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.addCallback
import androidx.compose.ui.platform.ComposeView
import com.tipcl.android.core.launch.LaunchStage
import com.tipcl.android.core.launch.ProgressListener
import com.tipcl.android.core.launch.ValidationCode
import com.tipcl.android.core.launch.ValidationSeverity
import com.tipcl.android.core.runtime.InputInjector
import com.tipcl.android.core.runtime.SurfaceBridge
import com.tipcl.android.core.ui.GameInputTarget
import com.tipcl.android.core.ui.InputOverlay
import com.tipcl.android.core.ui.OverlayInputPipeline
import com.tipcl.android.core.ui.SharedPrefsOverlaySettings
import com.tipcl.android.launch.TipCLGameHandle
import com.tipcl.android.launch.TipCLLaunchCoordinator
import kotlin.concurrent.thread

/**
 * M3 游戏宿主：SurfaceView 提供 Surface → SurfaceBridge 生命周期接线；
 * 启动链路走 TipCLLaunchCoordinator（LaunchPlanValidator 体检 → LaunchService
 * 组装 LaunchPlan → GameProcessLauncher 拉起进程），Compose 覆盖层
 * （core-ui InputOverlay）承载虚拟摇杆/按键/快捷栏/菜单，触控经 core-input
 * 归一化后由 InputInjector 注入游戏。
 *
 * 进程 stdout/stderr 由协调器泵到 logcat；状态栏展示启动阶段进度，
 * 异常退出时展示 stderr 尾部若干行（崩溃排查主线索）。
 *
 * 退出兜底：返回键与 onDestroy 均确保游戏进程被销毁，不留孤儿 java 进程。
 */
class GameHostActivity : ComponentActivity(), SurfaceHolder.Callback {

    private lateinit var surfaceBridge: SurfaceBridge
    private lateinit var statusView: TextView

    private var inputInjector: InputInjector? = null
    private var inputPipeline: OverlayInputPipeline? = null
    private var gameHandle: TipCLGameHandle? = null
    private var surfaceReady = false

    /** core-ui GameInputTarget → core-runtime InputInjector 适配。 */
    private val gameInputTarget = object : GameInputTarget {
        override fun postKey(code: Int, press: Boolean) {
            // GLFW_PRESS=1 / GLFW_RELEASE=0（GLFW 规范公开常量）。
            inputInjector?.postKeyEvent(code, 0, if (press) 1 else 0, 0)
        }

        override fun postChar(char: Char) {
            inputInjector?.postCharEvent(char.code)
        }

        override fun postCodepoint(codepoint: Int) {
            // native 侧按 UTF-32 codepoint 消费（中文等 BMP 字符及 emoji 均正确）。
            inputInjector?.postCharEvent(codepoint)
        }

        override fun postCursorDelta(dx: Float, dy: Float) {
            inputInjector?.postCursorPos(dx.toDouble(), dy.toDouble())
        }

        override fun postMouseButton(mouseButton: Int, press: Boolean) {
            // GLFW_MOUSE_BUTTON_LEFT/RIGHT/MIDDLE = 0/1/2，与 core-input 枚举序一致。
            inputInjector?.postMouseButton(mouseButton, if (press) 1 else 0, 0)
        }
    }

    /** UI 传入的 LaunchOptions 摘要（实例 id / 内存 / JVM 参数 / 游戏目录 / 玩家名）。 */
    private var pendingInstanceId: String? = null
    private var pendingMinMemoryMb: Int = -1
    private var pendingMaxMemoryMb: Int = -1
    private var pendingJvmArgs: List<String> = emptyList()
    private var pendingGameDir: String? = null
    private var pendingPlayerName: String? = null
    private var pendingSoundEnabled: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Predictive back 兼容：经 OnBackPressedDispatcher 注册返回兜底，替代已废弃的
        // onBackPressed()；保留"返回键兜底销毁游戏进程"的原语义（先停进程再退出页面）。
        onBackPressedDispatcher.addCallback(this) {
            shutdownGameProcess()
            finish()
        }
        surfaceBridge = SurfaceBridge()
        readLaunchExtras()

        val root = FrameLayout(this)
        val surfaceView = SurfaceView(this)
        surfaceView.holder.addCallback(this)
        // 焦点管理：SurfaceView 不参与焦点（键盘弹出时不抢焦点），
        // IME 焦点由覆盖层的 Compose 输入条持有。
        surfaceView.isFocusable = false
        surfaceView.isFocusableInTouchMode = false
        // 软键盘不缩放/不平移窗口：游戏 Surface 尺寸稳定，聊天输入条
        // 固定在屏幕上方 1/3 处，不会被键盘遮挡。
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)
        root.addView(
            surfaceView,
            FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
            ),
        )
        statusView = TextView(this).apply {
            setTextColor(Color.WHITE)
            setPadding(32, 64, 32, 32)
        }
        root.addView(
            statusView,
            FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ),
        )
        // M3：输入覆盖层（虚拟摇杆/按键/快捷栏/菜单），位于 Surface 之上。
        val pipeline = OverlayInputPipeline(gameInputTarget, SharedPrefsOverlaySettings(this, getFilesDir().toPath()))
        inputPipeline = pipeline
        val overlay = ComposeView(this)
        overlay.setContent {
            InputOverlay(
                pipeline = pipeline,
                onBackToLauncher = { runOnUiThread { shutdownGameProcess(); finish() } },
            )
        }
        root.addView(
            overlay,
            FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
            ),
        )
        setContentView(root)

        startGameProcess()
    }

    /** 读取 LauncherActivity 经 Intent 传入的 LaunchOptions 摘要；缺失时保持默认值。 */
    private fun readLaunchExtras() {
        pendingInstanceId = intent.getStringExtra(EXTRA_INSTANCE_ID)
        pendingMinMemoryMb = intent.getIntExtra(EXTRA_MIN_MEMORY_MB, -1)
        pendingMaxMemoryMb = intent.getIntExtra(EXTRA_MAX_MEMORY_MB, -1)
        pendingJvmArgs = intent.getStringArrayExtra(EXTRA_JVM_ARGS)?.toList() ?: emptyList()
        pendingGameDir = intent.getStringExtra(EXTRA_GAME_DIR)
        pendingPlayerName = intent.getStringExtra(EXTRA_PLAYER_NAME)
        pendingSoundEnabled = intent.getBooleanExtra(EXTRA_SOUND_ENABLED, true)
        Log.i(
            TAG,
            "launch options received: instance=$pendingInstanceId " +
                "mem=[$pendingMinMemoryMb..$pendingMaxMemoryMb] jvm=$pendingJvmArgs " +
                "gameDir=$pendingGameDir player=$pendingPlayerName sound=$pendingSoundEnabled",
        )
    }

    private fun startGameProcess() {
        val instanceId = pendingInstanceId
        if (instanceId.isNullOrBlank()) {
            statusView.text = getString(R.string.game_host_error, getString(R.string.game_host_missing_instance_id, EXTRA_INSTANCE_ID))
            return
        }
        statusView.text = getString(R.string.game_host_starting)
        val coordinator = TipCLLaunchCoordinator.get(this)
        thread(name = "game-host-launch") {
            try {
                val options = coordinator.buildOptions(
                    minMemoryMb = pendingMinMemoryMb,
                    maxMemoryMb = pendingMaxMemoryMb,
                    extraJvmArgs = pendingJvmArgs,
                    gameDirectory = pendingGameDir,
                    playerName = pendingPlayerName ?: "Player",
                )

                // 体检：问题清单直接上状态栏（"缺什么"）；缺失 assets 一键补齐。
                val issues = coordinator.validate(instanceId, options)
                issues.forEach { Log.w(TAG, "validation: $it") }
                val hardErrors = issues.filter {
                    it.severity == ValidationSeverity.ERROR && it.code != ValidationCode.RUNTIME_NOT_READY
                }
                if (hardErrors.isNotEmpty()) {
                    runOnUiThread { statusView.text = coordinator.issueSummary(hardErrors) }
                    return@thread
                }
                if (issues.any { it.code == ValidationCode.ASSETS_INCOMPLETE }) {
                    setUiStatus(getString(R.string.game_host_repairing_assets))
                    coordinator.repairMissingAssets(instanceId)
                }

                val handle = coordinator.launch(instanceId, options, progressListener(), soundEnabled = pendingSoundEnabled)
                gameHandle = handle
                Log.i(TAG, "game process started: ${handle.result.commandLine}")
                if (!pendingSoundEnabled) {
                    // 声音关闭提示：仅在进程拉起后展示一次（此前的进度文案由启动阶段覆写）。
                    setUiStatus(getString(R.string.game_host_sound_off_hint))
                }

                val exit = coordinator.awaitExit(handle)
                Log.i(TAG, "game process exited with ${exit.exitCode}")
                runOnUiThread {
                    if (exit.exitCode == 0) {
                        Toast.makeText(this, getString(R.string.game_host_exited, exit.exitCode), Toast.LENGTH_LONG)
                            .show()
                    } else {
                        // 崩溃：stderr 尾部直接上状态栏
                        val tail = exit.stderrTail.takeLast(STDERR_TAIL_UI_LINES)
                        statusView.text = buildString {
                            append(getString(R.string.game_host_exited, exit.exitCode))
                            if (tail.isNotEmpty()) {
                                append("\n").append(getString(R.string.game_host_stderr_tail)).append("\n")
                                append(tail.joinToString("\n"))
                            }
                        }
                        // 崩溃时留在宿主页展示 stderr，由用户返回键退出
                    }
                }
            } catch (t: Throwable) {
                Log.e(TAG, "failed to launch game process", t)
                runOnUiThread {
                    statusView.text = getString(R.string.game_host_error, t.message ?: t.javaClass.simpleName)
                }
            }
        }
    }

    /** 启动阶段进度 → 状态栏（进度回调可能在后台线程触发，切主线程更新）。 */
    private fun progressListener() = object : ProgressListener {
        override fun onStage(stage: LaunchStage, detail: String) {
            setUiStatus("${stageLabel(stage)} $detail")
        }

        override fun onProgress(stage: LaunchStage, done: Int, total: Int) {
            if (total > 0) setUiStatus("${stageLabel(stage)} $done/$total")
        }
    }

    private fun stageLabel(stage: LaunchStage): String = when (stage) {
        LaunchStage.RESOLVE_VERSION -> getString(R.string.stage_resolve_version)
        LaunchStage.RESOLVE_LIBRARIES -> getString(R.string.stage_resolve_libraries)
        LaunchStage.CHECK_ASSETS -> getString(R.string.stage_check_assets)
        LaunchStage.PROVISION_RUNTIME -> getString(R.string.stage_provision_runtime)
        LaunchStage.BUILD_PLAN -> getString(R.string.stage_build_plan)
    }

    private fun setUiStatus(text: String) {
        runOnUiThread { statusView.text = text }
    }

    // ---- SurfaceHolder.Callback → SurfaceBridge ----

    override fun surfaceCreated(holder: SurfaceHolder) {
        surfaceReady = true
        surfaceBridge.onSurfaceCreated(holder.surface)
        if (inputInjector == null) inputInjector = InputInjector()
    }

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
        surfaceBridge.onSurfaceChanged(holder.surface, width, height)
        inputInjector?.postFramebufferSize(width, height)
    }

    override fun surfaceDestroyed(holder: SurfaceHolder) {
        surfaceReady = false
        surfaceBridge.onSurfaceDestroyed()
    }

    // ---- 生命周期：切后台清空触点状态，防止按键卡死 ----

    override fun onPause() {
        inputPipeline?.reset()
        super.onPause()
    }

    // ---- 退出兜底 ----

    override fun onDestroy() {
        shutdownGameProcess()
        super.onDestroy()
    }

    private fun shutdownGameProcess() {
        gameHandle?.let { handle ->
            val p = handle.result.process
            if (p.isAlive) {
                TipCLLaunchCoordinator.get(this).stop(handle)
                Log.w(TAG, "game process destroyed by host (exit fallback)")
            }
        }
        gameHandle = null
    }

    companion object {
        const val TAG = "TipCL.GameHost"

        /** 崩溃时状态栏展示的 stderr 尾部行数。 */
        const val STDERR_TAIL_UI_LINES = 12

        /** LauncherActivity → GameHostActivity 的 LaunchOptions 摘要 extras。 */
        const val EXTRA_INSTANCE_ID = "tipcl.extra.INSTANCE_ID"
        const val EXTRA_MIN_MEMORY_MB = "tipcl.extra.MIN_MEMORY_MB"
        const val EXTRA_MAX_MEMORY_MB = "tipcl.extra.MAX_MEMORY_MB"
        const val EXTRA_JVM_ARGS = "tipcl.extra.JVM_ARGS"
        const val EXTRA_GAME_DIR = "tipcl.extra.GAME_DIR"
        const val EXTRA_PLAYER_NAME = "tipcl.extra.PLAYER_NAME"
        const val EXTRA_SOUND_ENABLED = "tipcl.extra.SOUND_ENABLED"
    }
}
