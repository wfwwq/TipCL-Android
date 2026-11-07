package com.tipcl.android.core.input

/**
 * 虚拟按键模型（Button 通道）。
 *
 * 三种行为（由调用方按下时注册的 [Region] 决定命中，本类负责状态机）：
 * - 按住（HOLD）：按住期间保持键 PRESS，抬起才 RELEASE（跳跃/潜行用）。
 * - 单击（TAP）：按下即 PRESS，抬起即 RELEASE——与 HOLD 的区别是
 *   调用方语义（快捷动作）；状态机一致，由 [behavior] 控制是否允许
 *   长按期间重复触发。
 * - 滑出松键：触点 MOVE 出 [region] 边界即立即 RELEASE 并结束跟踪，
 *   无需等手指抬起——对应验收项「滑出按键区域即自动释放」。
 */
class VirtualButton(
    val name: String,
    val key: Int,
    private val sink: InputSink,
    private val region: Region,
    val behavior: Behavior = Behavior.HOLD,
) {
    enum class Behavior { HOLD, TAP }

    private var trackedPointerId: Int? = null
    private var isDown = false

    /** 判断坐标是否落在本按键区域内（供 GameChannel 分发）。 */
    fun hitTest(x: Float, y: Float): Boolean = region.contains(x, y)

    fun onDown(pointerId: Int, x: Float, y: Float): Boolean {
        if (!hitTest(x, y) || trackedPointerId != null) return false
        trackedPointerId = pointerId
        isDown = true
        sink.postKeyEvent(KeyEvent(key, ButtonAction.PRESS))
        return true
    }

    fun onMove(pointerId: Int, x: Float, y: Float): Boolean {
        if (trackedPointerId != pointerId) return false
        if (!hitTest(x, y)) {
            // 滑出按键区域：自动释放，结束跟踪。之后手指抬起不再处理。
            release()
        }
        return true
    }

    fun onUp(pointerId: Int, x: Float, y: Float): Boolean {
        if (trackedPointerId != pointerId) return false
        release()
        return true
    }

    private fun release() {
        if (isDown) {
            isDown = false
            sink.postKeyEvent(KeyEvent(key, ButtonAction.RELEASE))
        }
        trackedPointerId = null
    }

    fun isPressed(): Boolean = isDown

    fun isTracking(pointerId: Int): Boolean = trackedPointerId == pointerId

    fun reset() {
        release()
    }
}

/**
 * GameChannel（按键区通道）：管理一组 [VirtualButton]，
 * 把按键区的指针事件按落点分发到对应按键。每个 pointer 只归一个按键，
 * 互不干扰。
 */
class GameChannel(private val buttons: List<VirtualButton>) {
    fun onDown(pointerId: Int, x: Float, y: Float): Boolean {
        return buttons.firstOrNull { it.hitTest(x, y) }?.onDown(pointerId, x, y) ?: false
    }

    fun onMove(pointerId: Int, x: Float, y: Float): Boolean {
        return buttons.firstOrNull { it.isTracking(pointerId) }?.onMove(pointerId, x, y) ?: false
    }

    fun onUp(pointerId: Int, x: Float, y: Float): Boolean {
        return buttons.firstOrNull { it.isTracking(pointerId) }?.onUp(pointerId, x, y) ?: false
    }

    fun reset() = buttons.forEach { it.reset() }
}
