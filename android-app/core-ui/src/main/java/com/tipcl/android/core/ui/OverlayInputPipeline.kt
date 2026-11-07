package com.tipcl.android.core.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.tipcl.android.core.input.ButtonAction
import com.tipcl.android.core.input.DirectionStick
import com.tipcl.android.core.input.GameChannel
import com.tipcl.android.core.input.HotbarTap
import com.tipcl.android.core.input.InputPointerEvent
import com.tipcl.android.core.input.InputSink
import com.tipcl.android.core.input.KeyEvent
import com.tipcl.android.core.input.LookGesture
import com.tipcl.android.core.input.MouseButton
import com.tipcl.android.core.input.Region
import com.tipcl.android.core.input.TouchRouter
import com.tipcl.android.core.input.TouchZone
import com.tipcl.android.core.input.VirtualButton

/**
 * 输入管线：持有 core-input 的 TouchRouter / LookGesture / DirectionStick /
 * VirtualButton / HotbarTap，把覆盖层收到的 InputPointerEvent 分发进去。
 *
 * 区域解析优先级（DOWN 落点）：
 * 1. 快捷栏热区（屏幕底部 1/6 高度）——由本类自管（HotbarTap 只在 UP 判定，
 *    不适配 GameChannel 的按住语义，故不走 TouchRouter）；
 * 2. 虚拟按键区 → TouchZone.BUTTON；
 * 3. 摇杆圆形区 → TouchZone.MOVE；
 * 4. 其余 → TouchZone.LOOK。
 * 首次 DOWN 绑定通道后 MOVE/UP 不再重判（TouchRouter 契约）。
 *
 * 灵敏度变更直接写入 LookGesture.sensitivity（@Volatile var，运行期热更新），
 * 无需重建 LookGesture + TouchRouter，进行中的触点绑定不受影响。
 */
class OverlayInputPipeline(
    private val target: GameInputTarget,
    private val settings: OverlaySettingsStore,
) {
    var layout: OverlayLayout = settings.loadLayout() ?: OverlayLayout.default()
        private set

    /** 视角灵敏度，写入时热更新 LookGesture 并持久化（Compose 可观测）。 */
    var sensitivity: Float by mutableStateOf(settings.loadSensitivity())
        private set

    var screenWidthPx: Int = 0
        private set
    var screenHeightPx: Int = 0
        private set
    var density: Float = 3f
        private set

    // ---- 视觉状态（Compose 观测）----
    var stickVisual by mutableStateOf(StickVisual())
        private set
    var pressedButtonNames by mutableStateOf(emptySet<String>())
        private set
    var hotbarFlashSlot by mutableStateOf<Int?>(null)
        private set

    data class StickVisual(
        val pointerId: Int? = null,
        val centerX: Float = 0f,
        val centerY: Float = 0f,
        val knobX: Float = 0f,
        val knobY: Float = 0f,
        val sector: Int = -1,
        val active: Boolean = false,
    )

    // ---- 游戏内文字输入（聊天栏）----

    /** 聊天输入控制器：文本状态与提交/取消注入。 */
    val textInput = TextInputController(target)

    /**
     * 文字输入激活中（CHAR 通道被聊天栏独占）：期间 dispatch 一律不消费，
     * LookGesture / 摇杆 / 虚拟按键 / 快捷栏全部暂停，防输入时误触游戏。
     */
    var textInputActive by mutableStateOf(false)
        private set

    /** 触发了「聊天」按钮但尚未抬起的触点（抬起时打开输入，不注入 T 键）。 */
    private val chatPendingPointers = mutableSetOf<Int>()

    private val sink = object : InputSink {
        override fun postKeyEvent(keyEvent: KeyEvent) {
            target.postKey(keyEvent.code, keyEvent.action == ButtonAction.PRESS)
        }

        override fun postCharEvent(char: Char) = target.postChar(char)

        override fun postCodepoint(codepoint: Int) = target.postCodepoint(codepoint)

        override fun postCursorPos(x: Float, y: Float) = target.postCursorDelta(x, y)

        override fun postMouseButton(button: MouseButton, action: ButtonAction) =
            target.postMouseButton(button.ordinal, action == ButtonAction.PRESS)
    }

    private var lookGesture: LookGesture? = null
    private var stick: DirectionStick? = null
    private var router: TouchRouter? = null
    private var buttons: List<VirtualButton> = emptyList()
    private var hotbar: HotbarTap? = null
    private var hotbarPointers = mutableSetOf<Int>()

    /** 由 Compose 层在尺寸/密度就绪或变化时调用；重建全部区域与通道。 */
    fun setMetrics(widthPx: Int, heightPx: Int, density: Float) {
        if (widthPx <= 0 || heightPx <= 0) return
        this.screenWidthPx = widthPx
        this.screenHeightPx = heightPx
        this.density = density
        rebuild()
    }

    /** 应用外部编辑后的布局（编辑模式拖动/滑条）并持久化。 */
    fun updateLayout(layout: OverlayLayout) {
        this.layout = layout
        settings.saveLayout(layout)
        rebuild()
    }

    /** 更新灵敏度并持久化；直接热更新 LookGesture，不重建管线。 */
    fun updateSensitivity(value: Float) {
        this.sensitivity = value
        settings.saveSensitivity(value)
        lookGesture?.sensitivity = value
    }

    private fun rebuild() {
        val w = screenWidthPx.toFloat()
        val h = screenHeightPx.toFloat()
        if (w <= 0f || h <= 0f) return

        val look = LookGesture(sink, sensitivity)
        val stickRadius = (layout.joystick.radiusF * w).coerceAtLeast(48f)
        // 死区比例来自布局（OverlayLayout.JoystickSpec.deadZoneF，0..1），
        // updateLayout 改布局时随 rebuild 换入新比例。
        val moveStick = DirectionStick(sink, stickRadius, layout.joystick.deadZoneF, layout.joystick.floating)

        val px = density
        val vbuttons = layout.buttons.map { spec ->
            val size = spec.sizeDp * px
            VirtualButton(
                name = spec.name,
                key = spec.key,
                sink = sink,
                region = Region(
                    name = spec.name,
                    left = spec.anchorXF * w - size / 2f,
                    top = spec.anchorYF * h - size / 2f,
                    right = spec.anchorXF * w + size / 2f,
                    bottom = spec.anchorYF * h + size / 2f,
                ),
                behavior = if (spec.behavior == "TAP") VirtualButton.Behavior.TAP
                else VirtualButton.Behavior.HOLD,
            )
        }

        val joy = layout.joystick
        val joyCenterX = joy.centerXF * w
        val joyCenterY = joy.centerYF * h
        val joyRadius = stickRadius * JOYSTICK_ZONE_FACTOR
        val buttonChannel = GameChannel(vbuttons)

        fun resolve(x: Float, y: Float): TouchZone? {
            if (hotbarRegionPx()?.contains(x, y) == true) return null
            if (layout.joystick.floating) {
                // 浮动摇杆：摇杆区域为屏幕左半侧（无固定底座），按点即中心。
                return when {
                    vbuttons.any { it.hitTest(x, y) } -> TouchZone.BUTTON
                    x <= w / 2f -> TouchZone.MOVE
                    else -> TouchZone.LOOK
                }
            }
            val distToJoy = kotlin.math.hypot((x - joyCenterX).toDouble(), (y - joyCenterY).toDouble())
            return when {
                vbuttons.any { it.hitTest(x, y) } -> TouchZone.BUTTON
                distToJoy <= joyRadius -> TouchZone.MOVE
                else -> TouchZone.LOOK
            }
        }

        lookGesture = look
        stick = moveStick
        buttons = vbuttons
        hotbar = HotbarTap(sink, hotbarRegionPx() ?: Region("hotbar", 0f, h, w, h))
        router = TouchRouter(::resolve, look, moveStick, buttonChannel)
        pressedButtonNames = emptySet()
    }

    /** 快捷栏热区：屏幕底部 1/6 高度的整行。 */
    fun hotbarRegionPx(): Region? {
        if (screenHeightPx <= 0) return null
        val h = screenHeightPx.toFloat()
        val w = screenWidthPx.toFloat()
        return Region("hotbar", 0f, h - h / HOTBAR_HEIGHT_FRACTION, w, h)
    }

    /** 摇杆展示参数（供 Canvas 绘制底座默认位置）。 */
    fun idleStickCenter(): Pair<Float, Float> {
        val w = screenWidthPx.toFloat()
        val h = screenHeightPx.toFloat()
        return Pair(layout.joystick.centerXF * w, layout.joystick.centerYF * h)
    }

    fun stickRadiusPx(): Float =
        (layout.joystick.radiusF * screenWidthPx).coerceAtLeast(48f)

    fun buttonPixelRect(spec: ButtonSpec): Region? {
        if (screenWidthPx <= 0) return null
        val size = spec.sizeDp * density
        return Region(
            spec.name,
            spec.anchorXF * screenWidthPx - size / 2f,
            spec.anchorYF * screenHeightPx - size / 2f,
            spec.anchorXF * screenWidthPx + size / 2f,
            spec.anchorYF * screenHeightPx + size / 2f,
        )
    }

    /**
     * 覆盖层入口：一条指针事件（每触点一条）分发进管线。
     * 返回是否消费。
     */
    fun dispatch(event: InputPointerEvent): Boolean {
        // 文字输入期间独占通道：游戏手势全部不消费（输入条之外的区域无响应）。
        if (textInputActive) return false
        if (router == null) return false
        return when (event.action) {
            InputPointerEvent.Action.DOWN -> dispatchDown(event)
            InputPointerEvent.Action.MOVE -> dispatchMove(event)
            InputPointerEvent.Action.UP -> dispatchUp(event)
        }
    }

    private fun dispatchDown(event: InputPointerEvent): Boolean {
        // 「聊天」按钮走文字输入路径：不注入 T 键，抬起时打开聊天栏。
        if (isChatButtonHit(event.x, event.y)) {
            chatPendingPointers.add(event.pointerId)
            return true
        }
        val hb = hotbar
        if (hb != null && hb.hitTest(event.x, event.y)) {
            hotbarPointers.add(event.pointerId)
            return true
        }
        val consumed = router!!.onPointerEvent(event)
        refreshButtonVisuals()
        // 摇杆视觉：DOWN 点即为浮动底座中心（DirectionStick 以落点为圆心）。
        if (consumed && router?.activeBindings()?.get(event.pointerId) == TouchZone.MOVE) {
            stickVisual = StickVisual(
                pointerId = event.pointerId,
                centerX = event.x,
                centerY = event.y,
                knobX = event.x,
                knobY = event.y,
                sector = -1,
                active = true,
            )
        }
        return consumed
    }

    private fun dispatchMove(event: InputPointerEvent): Boolean {
        if (event.pointerId in chatPendingPointers) return true
        if (event.pointerId in hotbarPointers) return true
        val consumed = router!!.onPointerEvent(event)
        refreshButtonVisuals()
        if (stickVisual.pointerId == event.pointerId && stickVisual.active) {
            if (stick?.isTracking(event.pointerId) == true) {
                val radius = stickRadiusPx()
                var dx = event.x - stickVisual.centerX
                var dy = event.y - stickVisual.centerY
                val dist = kotlin.math.hypot(dx.toDouble(), dy.toDouble())
                if (dist > radius) {
                    val scale = (radius / dist).toFloat()
                    dx *= scale
                    dy *= scale
                }
                stickVisual = stickVisual.copy(knobX = stickVisual.centerX + dx, knobY = stickVisual.centerY + dy)
                stickVisual = stickVisual.copy(sector = sectorOf(dx, dy))
            } else {
                // 滑出松键：摇杆已结束跟踪，视觉复位。
                stickVisual = StickVisual()
            }
        }
        return consumed
    }

    private fun dispatchUp(event: InputPointerEvent): Boolean {
        if (chatPendingPointers.remove(event.pointerId)) {
            openTextInput()
            return true
        }
        if (hotbarPointers.remove(event.pointerId)) {
            val slot = hotbar?.onTap(event.x, event.y)
            if (slot != null) hotbarFlashSlot = slot
            return true
        }
        if (stickVisual.pointerId == event.pointerId) stickVisual = StickVisual()
        val consumed = router!!.onPointerEvent(event)
        refreshButtonVisuals()
        return consumed
    }

    private fun refreshButtonVisuals() {
        pressedButtonNames = buttons.filter { it.isPressed() }.map { it.name }.toSet()
    }

    /** 打开聊天输入：占用 CHAR 通道（暂停全部游戏手势），清空进行中触点。 */
    fun openTextInput() {
        if (textInputActive) return
        reset()
        textInput.begin()
        textInputActive = true
    }

    /** 发送聊天：逐字符注入 + 回车确认，随后释放通道。组字中则忽略。 */
    fun commitTextInput() {
        if (!textInputActive) return
        if (textInput.commit()) textInputActive = false
    }

    /** 取消聊天：丢弃内容，释放通道。 */
    fun cancelTextInput() {
        if (!textInputActive) return
        textInput.cancel()
        textInputActive = false
    }

    private fun isChatButtonHit(x: Float, y: Float): Boolean {
        val spec = layout.buttons.firstOrNull { it.name == CHAT_BUTTON_NAME } ?: return false
        return buttonPixelRect(spec)?.contains(x, y) == true
    }

    /** 切后台等场景：清空全部触点状态，防止按键卡死。 */
    fun reset() {
        router?.reset()
        buttons.forEach { it.reset() }
        hotbarPointers.clear()
        chatPendingPointers.clear()
        stickVisual = StickVisual()
        pressedButtonNames = emptySet()
    }

    /** 菜单「暂停」：注入 ESC 按下+释放。 */
    fun sendPause() {
        target.postKey(GlfwKeys.ESCAPE, true)
        target.postKey(GlfwKeys.ESCAPE, false)
    }

    private companion object {
        const val HOTBAR_HEIGHT_FRACTION = 6f
        const val JOYSTICK_ZONE_FACTOR = 1.35f

        /** 聊天按钮名（默认布局中的「聊天」，TAP → 打开文字输入而非注入 T 键）。 */
        const val CHAT_BUTTON_NAME = "聊天"

        /** 8 向扇区：0=上，顺时针。与 DirectionStick 的量化一致。 */
        fun sectorOf(dx: Float, dy: Float): Int {
            val angle = Math.toDegrees(kotlin.math.atan2(dy.toDouble(), dx.toDouble()))
            val compass = (angle + 90.0 + 360.0) % 360.0
            return Math.round(compass / 45.0).toInt() % 8
        }
    }
}
