package com.tipcl.android.core.input

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DirectionStickTest {
    private val sink = RecordingSink()
    private val stick = DirectionStick(sink, radius = 120f)

    // ---- 死区 ----

    @Test
    fun deadZone_within24px_noKeys() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 100f + 20f, 100f)
        assertTrue(sink.keyEvents.isEmpty())

        stick.onMove(1, 100f, 100f + 23f)
        assertTrue(sink.keyEvents.isEmpty())
    }

    @Test
    fun deadZone_boundary_24px_stillDead() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 124f, 100f) // 恰好 24px，仍属死区
        assertTrue(sink.keyEvents.isEmpty())
    }

    @Test
    fun beyondDeadZone_25px_right_outputsD() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 125f, 100f)
        assertEquals(listOf(Keys.D to ButtonAction.PRESS), sink.keyEvents)
    }

    // ---- 比例死区：deadZoneRatio * radius ----

    private fun newStick(ratio: Float, radius: Float = 120f) =
        DirectionStick(RecordingSink(), radius = radius).also { it.deadZoneRatio = ratio }

    @Test
    fun ratioDeadZone_boundary_exactlyRatioXRadius_stillDead() {
        // ratio 0.2 * radius 120 = 24px：恰好落在边界仍属死区（≤ 判定）。
        val s = newStick(ratio = 0.2f)
        s.onDown(1, 100f, 100f)
        s.onMove(1, 100f + 24f, 100f)
        assertTrue(s.pressedKeys().isEmpty())
    }

    @Test
    fun ratioDeadZone_justBeyondRatioXRadius_outputsDirection() {
        val s = newStick(ratio = 0.2f)
        s.onDown(1, 100f, 100f)
        s.onMove(1, 100f + 24.1f, 100f) // 24.1 > 0.2*120=24 → 出死区，输出 D
        assertEquals(listOf(Keys.D), s.pressedKeys().toList())
    }

    @Test
    fun ratioDeadZone_scalesWithRadius() {
        // 同一比例、双倍半径：死区像素应随半径等比放大（0.2*240=48px）。
        val s = newStick(ratio = 0.2f, radius = 240f)
        s.onDown(1, 100f, 100f)
        s.onMove(1, 100f + 30f, 100f) // 30px：旧固定 24px 制会输出，比例制仍属死区
        assertEquals(emptyList(), s.pressedKeys().toList())
        s.onMove(1, 100f + 48.1f, 100f)
        assertEquals(listOf(Keys.D), s.pressedKeys().toList())
    }

    @Test
    fun ratioDeadZone_hotUpdateTakesEffectImmediately() {
        val s = newStick(ratio = 0.1f, radius = 120f)
        s.onDown(1, 100f, 100f)
        s.onMove(1, 100f + 20f, 100f) // 20px > 0.1*120=12px → 输出 D
        assertEquals(listOf(Keys.D), s.pressedKeys().toList())

        // 运行期调大死区比例：死区扩大为 0.3*120=36px，进行中触点回到死区即松键。
        s.deadZoneRatio = 0.3f
        s.onMove(1, 100f + 20f, 100f)
        assertEquals(emptyList(), s.pressedKeys().toList())

        // 再调小：死区缩为 0.05*120=6px，20px 重新输出。
        s.deadZoneRatio = 0.05f
        s.onMove(1, 100f + 20f, 100f)
        assertEquals(listOf(Keys.D), s.pressedKeys().toList())
    }

    @Test
    fun ratioDeadZone_outOfRangeRatioIsClamped() {
        // ratio 超界夹取到 0..1：ratio=1.5 → 全半径死区，永不输出。
        val s = newStick(ratio = 1.5f)
        s.onDown(1, 100f, 100f)
        s.onMove(1, 100f + 100f, 100f)
        assertEquals(emptyList(), s.pressedKeys().toList())
        // 负值夹取为 0 → 无死区。
        val t = newStick(ratio = -0.5f)
        t.onDown(1, 100f, 100f)
        t.onMove(1, 100f + 1f, 100f)
        assertEquals(listOf(Keys.D), t.pressedKeys().toList())
    }

    // ---- 8 向量化 ----

    private fun assertKeys(vararg expected: Int) {
        assertEquals(expected.toList(), sink.keyEvents.filter { it.second == ButtonAction.PRESS }.map { it.first })
    }

    @Test
    fun direction_up_outputsW() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 100f, 100f - 80f)
        assertKeys(Keys.W)
    }

    @Test
    fun direction_upRight_outputsWandD() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 100f + 60f, 100f - 60f)
        assertKeys(Keys.W, Keys.D)
    }

    @Test
    fun direction_downLeft_outputsSandA() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 100f - 60f, 100f + 60f)
        assertKeys(Keys.S, Keys.A)
    }

    @Test
    fun directionTransition_releasesOldKeys() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 180f, 100f) // 右 → D
        sink.clear()
        stick.onMove(1, 100f, 20f)  // 上 → D 应释放，W 应按下
        assertEquals(
            listOf(Keys.D to ButtonAction.RELEASE, Keys.W to ButtonAction.PRESS),
            sink.keyEvents,
        )
    }

    // ---- 浮动摇杆模式 ----

    private fun floatingStick(radius: Float = 120f, ratio: Float = DirectionStick.DEAD_ZONE_PX / DirectionStick.DEFAULT_RADIUS_PX) =
        DirectionStick(RecordingSink(), radius = radius, deadZoneRatio = ratio, floating = true)

    @Test
    fun floating_downPointIsCenter() {
        val s = floatingStick()
        assertTrue(s.floating)
        // 按点即中心：任意位置按下（含非屏幕原点）都以其为圆心。
        assertTrue(s.onDown(7, 350f, 640f))
        assertEquals(350f, s.centerXPx)
        assertEquals(640f, s.centerYPx)
        // 8 向输出以按点为原点。
        s.onMove(7, 350f + 80f, 640f)
        assertEquals(listOf(Keys.D), s.pressedKeys().toList())
    }

    @Test
    fun floating_deadZoneRelativeToDownPoint() {
        val s = floatingStick(ratio = 0.2f)
        s.onDown(1, 300f, 500f) // 死区 24px 相对按点 (300,500)
        s.onMove(1, 324f, 500f) // 距按点 24px：仍属死区
        assertTrue(s.pressedKeys().isEmpty())
        s.onMove(1, 324.1f, 500f)
        assertEquals(listOf(Keys.D), s.pressedKeys().toList())
    }

    @Test
    fun floating_slipOutBeyond1_5xReleases() {
        val sink = RecordingSink()
        val s = DirectionStick(sink, radius = 120f, floating = true)
        s.onDown(1, 300f, 500f)
        s.onMove(1, 300f, 500f - 80f) // W
        assertTrue(s.isTracking(1))
        sink.clear()
        s.onMove(1, 300f, 500f - 200f) // 距按点 200 > 1.5*120=180：滑出松键
        assertFalse(s.isTracking(1))
        assertEquals(listOf(Keys.W to ButtonAction.RELEASE), sink.keyEvents)
    }

    @Test
    fun slipOut_within1_5x_keepsTracking() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 100f, 100f - 80f)
        assertTrue(sink.keyEvents.contains(Keys.W to ButtonAction.PRESS))

        stick.onMove(1, 100f + 179f, 100f) // 距离 179 < 120*1.5=180
        assertTrue(stick.isTracking(1))
    }

    @Test
    fun slipOut_beyond1_5x_releasesAllKeys_andStopsTracking() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 100f + 60f, 100f - 60f) // W+D
        assertTrue(stick.isTracking(1))
        sink.clear()

        stick.onMove(1, 100f + 200f, 100f) // 距离 200 > 180
        assertFalse(stick.isTracking(1))
        assertEquals(
            listOf(Keys.W to ButtonAction.RELEASE, Keys.D to ButtonAction.RELEASE),
            sink.keyEvents,
        )

        // 结束跟踪后，同一 pointer 的后续事件不消费
        assertFalse(stick.onUp(1, 100f + 200f, 100f))
    }

    @Test
    fun slipOut_boundary_exactly1_5x_keepsTracking() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 100f + 180f, 100f) // 恰好 180 = 1.5*120，不算滑出
        assertTrue(stick.isTracking(1))
    }

    // ---- pointerId 跟踪 ----

    @Test
    fun secondPointer_notTracked() {
        assertTrue(stick.onDown(1, 100f, 100f))
        assertFalse(stick.onDown(2, 150f, 150f))
        assertFalse(stick.onMove(2, 160f, 160f))
        assertFalse(stick.onUp(2, 160f, 160f))
        // 第二指抬起不影响第一指
        assertTrue(stick.isTracking(1))
    }

    @Test
    fun up_releasesKeys() {
        stick.onDown(1, 100f, 100f)
        stick.onMove(1, 180f, 100f) // D
        sink.clear()
        stick.onUp(1, 180f, 100f)
        assertEquals(listOf(Keys.D to ButtonAction.RELEASE), sink.keyEvents)
    }
}
