package com.tipcl.android.core.input

/**
 * 视角手势识别（Look 通道）。
 *
 * 三种手势，按位移与时长判定：
 * - 点按：总位移 < [TAP_SLOP_PX] 且总时长 < [TAP_MAX_MS]
 *       → 鼠标左键单击（放置方块）。
 * - 长按：持续 >= [LONG_PRESS_MS] 且无位移（位移 < [TAP_SLOP_PX]）
 *       → 按住左键（破坏方块），长按期间保持 PRESS，抬起时 RELEASE。
 * - 拖动：累计位移 >= [TAP_SLOP_PX] 即判定为拖动
 *       → 视角增量：按位移 dx/dy 乘 [sensitivity] 产出相对鼠标移动量。
 *
 * [TAP_SLOP_PX] 默认 24px 的理由：与 Android 平台 ViewConfiguration
 * 的标准触摸斜率（scaledTouchSlop 在中高密度屏约为 16~32px）一致，
 * 24px 是 3x 密度下 8dp 的近似值——低于该阈值的手指抖动应视为
 * 点按/长按而非拖动；阈值过大（>30px）会让轻微视角调整被误判为
 * 点按触发放置，过小（<16px）会让手抖误触发视角跳动。
 *
 * 判定优先级：一旦位移达到 24px 即锁定为「拖动」，之后即使回到
 * 原位也不会再变成点按/长按（有状态锁定，避免中途语义跳变）。
 */
class LookGesture(
    private val sink: InputSink,
    /**
     * 视角灵敏度系数：输出 = 位移(px) * sensitivity。
     *
     * 支持运行期热更新：直接改本 var 即对后续手势生效，无需重建实例
     * （此前为构造期 val，灵敏度变更只能重建 LookGesture + TouchRouter）。
     * 标记 @Volatile 保证设置线程（UI）与触摸事件线程的可见性；单次
     * Float 写，读取方不会看到撕裂值。
     */
    @Volatile var sensitivity: Float = DEFAULT_SENSITIVITY,
) {
    private val tracking = mutableMapOf<Int, PointerState>()

    var onGesture: ((Gesture) -> Unit)? = null

    sealed class Gesture {
        data class Drag(val dx: Float, val dy: Float) : Gesture()
        data object Tap : Gesture()
        data object LongPressStart : Gesture()
    }

    private class PointerState(
        val startX: Float,
        val startY: Float,
        val startMs: Long,
        var lastX: Float = startX,
        var lastY: Float = startY,
    ) {
        var moved = false
        var longPressFired = false
    }

    fun onDown(pointerId: Int, x: Float, y: Float, timestampMs: Long): Boolean {
        // Look 通道一次只跟踪一个触点：第二根手指落在视角区不接管，
        // 防止双指误触。路由器已保证 pointerId 绑定，这里防御性忽略。
        if (tracking.isNotEmpty()) return false
        tracking[pointerId] = PointerState(x, y, timestampMs)
        return true
    }

    fun onMove(pointerId: Int, x: Float, y: Float, timestampMs: Long): Boolean {
        val state = tracking[pointerId] ?: return false
        val dx = x - state.startX
        val dy = y - state.startY
        val distance = kotlin.math.hypot(dx, dy)

        if (state.moved) {
            // 拖动中：以增量形式上报视角移动（相对上一次位置）。
            val outDx = x - state.lastX
            val outDy = y - state.lastY
            state.lastX = x
            state.lastY = y
            emitDrag(outDx, outDy)
            return true
        }

        if (distance >= TAP_SLOP_PX) {
            // 越过 24px 阈值：锁定为拖动。
            state.moved = true
            state.lastX = x
            state.lastY = y
            emitDrag(dx, dy)
            return true
        }

        // 未越过阈值：检查长按。
        if (!state.longPressFired && timestampMs - state.startMs >= LONG_PRESS_MS) {
            state.longPressFired = true
            sink.postMouseButton(MouseButton.LEFT, ButtonAction.PRESS)
            onGesture?.invoke(Gesture.LongPressStart)
        }
        return true
    }

    fun onUp(pointerId: Int, x: Float, y: Float, timestampMs: Long): Boolean {
        val state = tracking.remove(pointerId) ?: return false
        val dx = x - state.startX
        val dy = y - state.startY
        val distance = kotlin.math.hypot(dx, dy)
        val duration = timestampMs - state.startMs

        when {
            state.moved -> {
                // 拖动结束。若长按已触发过左键，需要释放。
                if (state.longPressFired) {
                    sink.postMouseButton(MouseButton.LEFT, ButtonAction.RELEASE)
                }
            }

            state.longPressFired -> {
                // 长按（破坏）结束：释放左键。
                sink.postMouseButton(MouseButton.LEFT, ButtonAction.RELEASE)
            }

            distance < TAP_SLOP_PX && duration < TAP_MAX_MS -> {
                // 点按（放置）：左键完整按下再抬起。
                sink.postMouseButton(MouseButton.LEFT, ButtonAction.PRESS)
                sink.postMouseButton(MouseButton.LEFT, ButtonAction.RELEASE)
                onGesture?.invoke(Gesture.Tap)
            }
            // 超时但无位移、又没达到长按时长的按下（理论上只在
            // DOWN 与 UP 时间戳异常时出现）：不做任何注入。
        }
        return true
    }

    private fun emitDrag(dx: Float, dy: Float) {
        sink.postCursorPos(dx * sensitivity, dy * sensitivity)
        onGesture?.invoke(Gesture.Drag(dx * sensitivity, dy * sensitivity))
    }

    fun reset() = tracking.clear()

    companion object {
        /** 点按/拖动分界位移（像素）。 */
        const val TAP_SLOP_PX = 24f

        /** 点按最长时长（毫秒），超过则不视为点按。 */
        const val TAP_MAX_MS = 200L

        /** 长按触发时长（毫秒）。 */
        const val LONG_PRESS_MS = 400L

        /** 默认视角灵敏度。 */
        const val DEFAULT_SENSITIVITY = 0.5f
    }
}
