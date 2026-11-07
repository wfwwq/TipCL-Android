package com.tipcl.android.core.input

/**
 * 虚拟方向摇杆（Move 通道）。
 *
 * 行为：
 * - 按 pointerId 跟踪：第一根落在摇杆区的手指全程独占，其他手指不干扰。
 * - 死区：落点距中心 ≤ [deadZoneRatio] * [radius] 时不输出任何按键
 *   （比例语义，随摇杆半径缩放；运行期可热更新）。
 * - 8 向量化：以中心为原点把摇杆方向量化为 8 向，映射到 WASD 按键状态
 *   （前进/后退/左/右，斜向为组合键）。
 * - 滑出松键：触点距离中心 > [radius] * [SLIP_RELEASE_FACTOR] 时
 *   视为滑出，立即释放全部 WASD 键并结束跟踪（即使手指还没抬起）。
 * - 浮动模式（[floating] = true）：DOWN 落点即为中心（底座随手指出现），
 *   死区/滑出判定均相对按点；false 时保持既有固定底座语义。
 *   两种模式的中心均以 DOWN 点为准，仅影响上层对中心的呈现与区域解析。
 */
class DirectionStick(
    private val sink: InputSink,
    /** 摇杆可感知半径（像素），由调用方按控件实际尺寸传入。 */
    val radius: Float = DEFAULT_RADIUS_PX,
    /**
     * 死区比例（0..1）：死区半径 = [deadZoneRatio] * [radius]。
     * 默认 0.2 = 24px / 120px，即在默认半径 [DEFAULT_RADIUS_PX] 下与旧
     * 固定像素死区 [DEAD_ZONE_PX] 等价；改用比例后死区随摇杆尺寸等比缩放，
     * 大小摇杆的手指抖动过滤体验一致。运行期可通过覆写热更新（无需重建）。
     */
    var deadZoneRatio: Float = DEAD_ZONE_PX / DEFAULT_RADIUS_PX,
    /**
     * 浮动摇杆模式：DOWN 点即中心（底座出现在按点），死区判定相对按点。
     * 默认 false 保持既有固定底座行为。
     */
    val floating: Boolean = false,
) {
    /** 死区半径（像素）：比例夹取到 0..1 后乘以摇杆半径。 */
    val deadZonePx: Float
        get() = deadZoneRatio.coerceIn(0f, 1f) * radius

    private var trackedPointerId: Int? = null
    private var centerX = 0f
    private var centerY = 0f
    private val pressedKeys = mutableSetOf<Int>()

    /** 当前跟踪触点的中心（底座圆心，DOWN 点）；未跟踪时为 0。 */
    val centerXPx: Float get() = centerX
    val centerYPx: Float get() = centerY

    fun onDown(pointerId: Int, x: Float, y: Float): Boolean {
        if (trackedPointerId != null) return false
        trackedPointerId = pointerId
        centerX = x
        centerY = y
        return true
    }

    fun onMove(pointerId: Int, x: Float, y: Float): Boolean {
        if (trackedPointerId != pointerId) return false
        update(x, y)
        return true
    }

    fun onUp(pointerId: Int, x: Float, y: Float): Boolean {
        if (trackedPointerId != pointerId) return false
        releaseAll()
        trackedPointerId = null
        return true
    }

    private fun update(x: Float, y: Float) {
        val dx = x - centerX
        val dy = y - centerY
        val distance = kotlin.math.hypot(dx, dy)

        // 滑出 1.5 倍半径：自动松键并结束跟踪。
        if (distance > radius * SLIP_RELEASE_FACTOR) {
            releaseAll()
            trackedPointerId = null
            return
        }

        // 死区内：无输出（比例死区：ratio * radius，随摇杆尺寸缩放）。
        if (distance <= deadZonePx) {
            releaseAll()
            return
        }

        applyDirection(dx, dy)
    }

    /** 8 向量化：角度量化为 8 个扇区（每 45° 一个），映射 WASD。 */
    private fun applyDirection(dx: Float, dy: Float) {
        // 屏幕坐标 y 向下为正；游戏世界 z 轴 -1 为前进。
        val angle = Math.toDegrees(kotlin.math.atan2(dy.toDouble(), dx.toDouble()))
        // 归一到以「上」为 0°、顺时针为正（-180..180 → 上/右上/右/…）。
        val compass = (angle + 90.0 + 360.0) % 360.0
        val sector = Math.round(compass / 45.0).toInt() % 8

        val forward: Boolean
        val back: Boolean
        val left: Boolean
        val right: Boolean
        when (sector) {
            0 -> { forward = true; back = false; left = false; right = false }          // 上
            1 -> { forward = true; back = false; left = false; right = true }           // 右上
            2 -> { forward = false; back = false; left = false; right = true }          // 右
            3 -> { forward = false; back = true; left = false; right = true }           // 右下
            4 -> { forward = false; back = true; left = false; right = false }          // 下
            5 -> { forward = false; back = true; left = true; right = false }           // 左下
            6 -> { forward = false; back = false; left = true; right = false }          // 左
            else -> { forward = true; back = false; left = true; right = false }        // 左上
        }

        // 先释放不再需要的键，再按下新键，保证 RELEASE 事件先于 PRESS。
        listOf(Keys.W to forward, Keys.S to back, Keys.A to left, Keys.D to right)
            .filter { !it.second }
            .forEach { syncKey(it.first, false) }
        listOf(Keys.W to forward, Keys.S to back, Keys.A to left, Keys.D to right)
            .filter { it.second }
            .forEach { syncKey(it.first, true) }
    }

    /** 把目标按键状态同步到 sink：新按下的发 PRESS，新松开的发 RELEASE。 */
    private fun syncKey(key: Int, shouldBeDown: Boolean) {
        val isDown = key in pressedKeys
        if (shouldBeDown && !isDown) {
            pressedKeys.add(key)
            sink.postKeyEvent(KeyEvent(key, ButtonAction.PRESS))
        } else if (!shouldBeDown && isDown) {
            pressedKeys.remove(key)
            sink.postKeyEvent(KeyEvent(key, ButtonAction.RELEASE))
        }
    }

    private fun releaseAll() {
        for (key in pressedKeys.toList()) {
            sink.postKeyEvent(KeyEvent(key, ButtonAction.RELEASE))
        }
        pressedKeys.clear()
    }

    fun reset() {
        releaseAll()
        trackedPointerId = null
    }

    fun isTracking(pointerId: Int): Boolean = trackedPointerId == pointerId

    fun pressedKeys(): Set<Int> = pressedKeys.toSet()

    companion object {
        /**
         * 旧版固定死区像素（8dp@3x）：仅作换算参考与历史语义锚点，
         * 判定已改为比例制 [deadZoneRatio] * radius。
         */
        const val DEAD_ZONE_PX = 24f

        /** 默认摇杆半径（像素）。 */
        const val DEFAULT_RADIUS_PX = 120f

        /** 滑出松键倍率：超过 1.5 倍半径即释放全部按键。 */
        const val SLIP_RELEASE_FACTOR = 1.5f
    }
}
