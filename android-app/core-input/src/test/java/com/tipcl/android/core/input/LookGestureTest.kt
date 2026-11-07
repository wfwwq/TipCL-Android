package com.tipcl.android.core.input

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LookGestureTest {
    private val sink = RecordingSink()

    private fun gesture(sensitivity: Float = 0.5f) = LookGesture(sink, sensitivity)

    private fun down(g: LookGesture, x: Float = 100f, y: Float = 100f, t: Long = 0) =
        g.onDown(1, x, y, t)

    // ---- 点按：位移 < 24px 且时长 < 200ms → 左键单击（PRESS+RELEASE） ----

    @Test
    fun tap_shortMove_shortDuration_firesLeftClick() {
        val g = gesture()
        down(g, t = 0)
        g.onMove(1, 102f, 100f, 50)   // 位移 2px
        g.onUp(1, 101f, 100f, 150)    // 时长 150ms < 200ms

        assertEquals(
            listOf(MouseButton.LEFT to ButtonAction.PRESS, MouseButton.LEFT to ButtonAction.RELEASE),
            sink.mouseButtons,
        )
    }

    @Test
    fun tap_boundary_exactly23px_199ms_isStillTap() {
        val g = gesture()
        down(g, t = 0)
        g.onUp(1, 100f + 23.9f, 100f, 199)

        assertEquals(2, sink.mouseButtons.size) // PRESS + RELEASE
    }

    // ---- 24px 阈值边界 ----

    @Test
    fun move_exactly24px_isDrag_notTap() {
        val g = gesture()
        down(g, t = 0)
        g.onMove(1, 100f + 24f, 100f, 50)
        g.onUp(1, 100f + 24f, 100f, 50)

        // 位移恰好 24px：判定为拖动，无鼠标按键注入
        assertTrue(sink.mouseButtons.isEmpty())
        assertEquals(1, sink.cursorMoves.size)
        assertEquals(24f * LookGesture.DEFAULT_SENSITIVITY to 0f, sink.cursorMoves[0])
    }

    @Test
    fun move_23px_isNotDrag() {
        val g = gesture()
        down(g, t = 0)
        g.onMove(1, 100f + 23f, 100f, 50)
        g.onUp(1, 100f + 23f, 100f, 50)

        assertTrue(sink.cursorMoves.isEmpty())
        assertEquals(2, sink.mouseButtons.size) // 仍为点按
    }

    @Test
    fun dragLock_onceMoved_returningToOrigin_stillDrag() {
        val g = gesture()
        down(g, t = 0)
        g.onMove(1, 200f, 100f, 50)   // 越过 24px，锁定拖动
        g.onMove(1, 100f, 100f, 80)   // 回到起点仍是拖动
        g.onUp(1, 100f, 100f, 100)

        assertTrue(sink.cursorMoves.isNotEmpty())
        assertTrue(sink.mouseButtons.isEmpty()) // 不是点按
        // 第二段增量为 -100 * 0.5 = -50
        assertEquals(-50f to 0f, sink.cursorMoves.last())
    }

    // ---- 200ms / 400ms 时长边界 ----

    @Test
    fun up_exactly200ms_withoutMove_isNotTap() {
        val g = gesture()
        down(g, t = 0)
        g.onUp(1, 100f, 100f, 200) // 时长恰好 200ms，不小于 200ms

        assertTrue(sink.mouseButtons.isEmpty())
    }

    @Test
    fun longPress_exactly400ms_withNoMove_firesHold() {
        val g = gesture()
        down(g, t = 0)
        g.onMove(1, 101f, 100f, 399) // 未越阈值、未到 400ms：无动作
        assertTrue(sink.mouseButtons.isEmpty())

        g.onMove(1, 101f, 100f, 400) // 恰好 400ms：长按触发按住左键
        assertEquals(
            listOf(MouseButton.LEFT to ButtonAction.PRESS),
            sink.mouseButtons,
        )

        g.onUp(1, 101f, 100f, 600) // 抬起释放
        assertEquals(
            listOf(MouseButton.LEFT to ButtonAction.PRESS, MouseButton.LEFT to ButtonAction.RELEASE),
            sink.mouseButtons,
        )
    }

    @Test
    fun longPress_notFired_below400ms() {
        val g = gesture()
        down(g, t = 0)
        g.onMove(1, 100f, 100f, 399) // 无位移、399ms
        assertTrue(sink.mouseButtons.isEmpty())

        g.onUp(1, 100f, 100f, 399)
        // 时长 399ms < 200ms 不成立（不是点按），无注入
        assertTrue(sink.mouseButtons.isEmpty())
    }

    // ---- 拖动灵敏度 ----

    @Test
    fun drag_outputIsDeltaTimesSensitivity() {
        val g = gesture(sensitivity = 0.5f)
        down(g, t = 0)
        g.onMove(1, 148f, 130f, 50) // dx=48, dy=30，距离>24 锁定拖动
        g.onUp(1, 148f, 130f, 60)

        assertEquals(1, sink.cursorMoves.size)
        assertEquals(24f to 15f, sink.cursorMoves[0]) // 48*0.5, 30*0.5
    }

    @Test
    fun secondFinger_onLookChannel_isIgnored() {
        val g = gesture()
        down(g, t = 0)
        val consumed = g.onDown(2, 120f, 120f, 10)
        assertEquals(false, consumed)

        g.onUp(1, 100f, 100f, 100)
        assertEquals(2, sink.mouseButtons.size) // 第一指正常点按
    }

    @Test
    fun reset_clearsTracking() {
        val g = gesture()
        down(g, t = 0)
        g.reset()
        val consumed = g.onUp(1, 100f, 100f, 100)
        assertEquals(false, consumed)
    }

    // ---- 灵敏度热更新：改 var 即生效，无需重建实例 ----

    @Test
    fun sensitivity_hotUpdate_takesEffectWithoutRebuild() {
        val g = gesture(sensitivity = 0.5f)
        down(g, t = 0)
        g.onMove(1, 148f, 130f, 50) // 锁定拖动，增量 48x30
        assertEquals(24f to 15f, sink.cursorMoves[0])

        g.sensitivity = 1.0f        // 直接热更新，实例不变
        g.onMove(1, 198f, 180f, 60) // 增量 50x50
        assertEquals(50f to 50f, sink.cursorMoves[1])
    }

    @Test
    fun sensitivity_hotUpdate_visibleOnSubsequentGestures() {
        val g = gesture(sensitivity = 0.5f)
        down(g, t = 0)
        g.onUp(1, 100f, 100f, 50)   // 结束第一次手势
        assertEquals(0, sink.cursorMoves.size)

        g.sensitivity = 2.0f
        down(g, t = 100)
        g.onMove(1, 130f, 100f, 150) // 新手势：30px * 2.0
        g.onUp(1, 130f, 100f, 160)

        assertEquals(1, sink.cursorMoves.size)
        assertEquals(60f to 0f, sink.cursorMoves[0])
    }
}
