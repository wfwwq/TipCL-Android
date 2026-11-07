package com.tipcl.android.core.input

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class VirtualButtonTest {
    private val sink = RecordingSink()
    private val region = Region("jump", 800f, 1200f, 1000f, 1400f)

    @Test
    fun hold_pressAndRelease() {
        val btn = VirtualButton("jump", Keys.SPACE, sink, region)
        assertTrue(btn.onDown(1, 900f, 1300f))
        assertTrue(btn.isPressed())
        assertEquals(listOf(Keys.SPACE to ButtonAction.PRESS), sink.keyEvents)

        btn.onUp(1, 900f, 1300f)
        assertFalse(btn.isPressed())
        assertEquals(
            listOf(Keys.SPACE to ButtonAction.PRESS, Keys.SPACE to ButtonAction.RELEASE),
            sink.keyEvents,
        )
    }

    @Test
    fun slipOut_releasesImmediately_withoutWaitingForUp() {
        val btn = VirtualButton("jump", Keys.SPACE, sink, region)
        btn.onDown(1, 900f, 1300f)
        sink.clear()

        btn.onMove(1, 1100f, 1300f) // 滑出区域右边界
        assertFalse(btn.isPressed())
        assertFalse(btn.isTracking(1))
        assertEquals(listOf(Keys.SPACE to ButtonAction.RELEASE), sink.keyEvents)

        // 滑出后再抬起：不再重复注入
        btn.onUp(1, 1100f, 1300f)
        assertEquals(1, sink.keyEvents.size)
    }

    @Test
    fun secondPointer_onSameButton_isRejected() {
        val btn = VirtualButton("jump", Keys.SPACE, sink, region)
        assertTrue(btn.onDown(1, 900f, 1300f))
        assertFalse(btn.onDown(2, 900f, 1300f))
    }

    @Test
    fun down_outsideRegion_isRejected() {
        val btn = VirtualButton("jump", Keys.SPACE, sink, region)
        assertFalse(btn.onDown(1, 100f, 100f))
        assertTrue(sink.keyEvents.isEmpty())
    }

    @Test
    fun gameChannel_routesByTracking() {
        val jump = VirtualButton("jump", Keys.SPACE, sink, region)
        val sneak = VirtualButton(
            "sneak", Keys.SHIFT_LEFT, sink,
            Region("sneak", 100f, 1200f, 300f, 1400f),
        )
        val channel = GameChannel(listOf(jump, sneak))

        assertTrue(channel.onDown(1, 900f, 1300f))   // jump
        assertTrue(channel.onDown(2, 200f, 1300f))   // sneak
        assertTrue(jump.isPressed())
        assertTrue(sneak.isPressed())

        // 指1 滑出 jump 区域 → 只释放 jump
        channel.onMove(1, 1500f, 1300f)
        assertFalse(jump.isPressed())
        assertTrue(sneak.isPressed())

        channel.onUp(2, 200f, 1300f)
        assertFalse(sneak.isPressed())
    }
}
