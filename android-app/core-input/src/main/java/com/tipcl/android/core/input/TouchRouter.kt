package com.tipcl.android.core.input

/**
 * 触点区域分类。由调用方（app 层）注册 Region 映射，core-input
 * 不感知具体控件坐标。
 */
enum class TouchZone { LOOK, MOVE, BUTTON }

/** 一个可命中的矩形区域（视图坐标，像素）。 */
data class Region(
    val name: String,
    val left: Float,
    val top: Float,
    val right: Float,
    val bottom: Float,
) {
    fun contains(x: Float, y: Float): Boolean =
        x >= left && x <= right && y >= top && y <= bottom
}

/**
 * 核心事件路由：把输入指针流按 pointerId 分配到输入通道。
 *
 * 多指互抢的解法：pointer 首次 DOWN 时按落点区域一次性绑定通道，
 * 此后该 pointer 的所有 MOVE/UP 事件都路由到同一通道，直到 UP 才解绑。
 * 后续 MOVE 即使滑出原区域也不换通道（区别于「每次事件重新判定」的做法），
 * 保证多指同时操作时互不干扰——摇杆按触点 ID 跟踪，
 * 视角指不会抢走摇杆的触点，反之亦然。
 */
class TouchRouter(
    /** 返回触点落点所属区域；null 表示落在任何已注册区域之外。 */
    private val zoneResolver: (x: Float, y: Float) -> TouchZone?,
    private val lookChannel: LookGesture,
    private val moveChannel: DirectionStick,
    private val gameChannel: GameChannel,
) {
    /** pointerId -> 绑定的通道。UP 后立即移除。 */
    private val bindings = mutableMapOf<Int, TouchZone>()

    /**
     * 处理一条指针事件。返回该事件是否被消费。
     */
    fun onPointerEvent(event: InputPointerEvent): Boolean {
        when (event.action) {
            InputPointerEvent.Action.DOWN -> {
                val zone = zoneResolver(event.x, event.y) ?: return false
                bindings[event.pointerId] = zone
                return when (zone) {
                    TouchZone.LOOK -> lookChannel.onDown(event.pointerId, event.x, event.y, event.timestampMs)
                    TouchZone.MOVE -> moveChannel.onDown(event.pointerId, event.x, event.y)
                    TouchZone.BUTTON -> gameChannel.onDown(event.pointerId, event.x, event.y)
                }
            }

            InputPointerEvent.Action.MOVE -> {
                val zone = bindings[event.pointerId] ?: return false
                return when (zone) {
                    TouchZone.LOOK -> lookChannel.onMove(event.pointerId, event.x, event.y, event.timestampMs)
                    TouchZone.MOVE -> moveChannel.onMove(event.pointerId, event.x, event.y)
                    TouchZone.BUTTON -> gameChannel.onMove(event.pointerId, event.x, event.y)
                }
            }

            InputPointerEvent.Action.UP -> {
                val zone = bindings.remove(event.pointerId) ?: return false
                return when (zone) {
                    TouchZone.LOOK -> lookChannel.onUp(event.pointerId, event.x, event.y, event.timestampMs)
                    TouchZone.MOVE -> moveChannel.onUp(event.pointerId, event.x, event.y)
                    TouchZone.BUTTON -> gameChannel.onUp(event.pointerId, event.x, event.y)
                }
            }
        }
    }

    /** 当前绑定中的触点 ID 及其通道，供调试/测试。 */
    fun activeBindings(): Map<Int, TouchZone> = bindings.toMap()

    /** 清空全部绑定（例如切后台时调用，防止触点状态泄漏）。 */
    fun reset() {
        bindings.clear()
        lookChannel.reset()
        moveChannel.reset()
    }
}
