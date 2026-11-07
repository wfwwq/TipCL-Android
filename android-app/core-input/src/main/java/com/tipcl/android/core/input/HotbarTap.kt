package com.tipcl.android.core.input

/**
 * 快捷栏（Hotbar）区域点击 → 1..9 数字键。
 *
 * 快捷栏整体是一条水平区域，内部按槽位均分为 9 格：
 * 落点 x 相对区域宽度换算出槽位 1..9，注入对应数字键 PRESS+RELEASE。
 * 行为定义为「点击」：本类不跟踪 pointer，UP 时判定即可，
 * 但为与路由协议一致仍提供 onDown/onMove（均不消费）。
 */
class HotbarTap(
    private val sink: InputSink,
    private val region: Region,
) {
    /** 供路由器判定触点是否落在快捷栏。 */
    fun hitTest(x: Float, y: Float): Boolean = region.contains(x, y)

    /**
     * 在 UP 时调用：按落点计算槽位并注入 1..9 数字键。
     * @return 命中的槽位（1..9），未命中返回 null。
     */
    fun onTap(x: Float, y: Float): Int? {
        if (!hitTest(x, y)) return null
        val width = region.right - region.left
        if (width <= 0f) return null
        val slot = ((x - region.left) / width * SLOT_COUNT).toInt().coerceIn(0, SLOT_COUNT - 1) + 1
        val key = keyForSlot(slot)
        sink.postKeyEvent(KeyEvent(key, ButtonAction.PRESS))
        sink.postKeyEvent(KeyEvent(key, ButtonAction.RELEASE))
        return slot
    }

    fun keyForSlot(slot: Int): Int = Keys.KEY_1 + (slot - 1)

    fun onDown(pointerId: Int, x: Float, y: Float): Boolean = false

    fun onMove(pointerId: Int, x: Float, y: Float): Boolean = false

    fun onUp(pointerId: Int, x: Float, y: Float): Boolean = onTap(x, y) != null

    companion object {
        const val SLOT_COUNT = 9
    }
}
