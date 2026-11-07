package com.tipcl.android.core.input

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TouchRouterTest {
    private val sink = RecordingSink()
    private val look = LookGesture(sink)
    private val stick = DirectionStick(sink)
    private val jump = VirtualButton(
        "jump", Keys.SPACE, sink,
        Region("jump", 800f, 1200f, 1000f, 1400f),
    )
    private val game = GameChannel(listOf(jump))

    private val router = TouchRouter(
        zoneResolver = { x, y ->
            when {
                y in 1200f..1400f && x in 800f..1000f -> TouchZone.BUTTON
                x < 400f && y > 800f -> TouchZone.MOVE
                else -> TouchZone.LOOK
            }
        },
        lookChannel = look,
        moveChannel = stick,
        gameChannel = game,
    )

    @Test
    fun pointer_bindsZoneAtDown_andKeepsItUntilUp() {
        // 指落在摇杆区
        router.onPointerEvent(InputPointerEvent(1, InputPointerEvent.Action.DOWN, 100f, 900f, 0))
        assertEquals(TouchZone.MOVE, router.activeBindings()[1])

        // MOVE 滑到视角区也不换通道
        router.onPointerEvent(InputPointerEvent(1, InputPointerEvent.Action.MOVE, 2000f, 100f, 10))
        assertEquals(TouchZone.MOVE, router.activeBindings()[1])
        // 但摇杆内部已按滑出 1.5 倍松键
        assertFalse(stick.isTracking(1))

        router.onPointerEvent(InputPointerEvent(1, InputPointerEvent.Action.UP, 2000f, 100f, 20))
        assertTrue(router.activeBindings().isEmpty())
    }

    @Test
    fun multiFinger_eachPointerOwnChannel() {
        // 指A：摇杆；指B：视角；指C：跳跃键——三者互不干扰
        router.onPointerEvent(InputPointerEvent(1, InputPointerEvent.Action.DOWN, 100f, 900f, 0))
        router.onPointerEvent(InputPointerEvent(2, InputPointerEvent.Action.DOWN, 1500f, 500f, 1))
        router.onPointerEvent(InputPointerEvent(3, InputPointerEvent.Action.DOWN, 900f, 1300f, 2))

        assertEquals(
            mapOf(1 to TouchZone.MOVE, 2 to TouchZone.LOOK, 3 to TouchZone.BUTTON),
            router.activeBindings(),
        )

        // 指B 拖动视角
        router.onPointerEvent(InputPointerEvent(2, InputPointerEvent.Action.MOVE, 1540f, 500f, 10))
        assertEquals(1, sink.cursorMoves.size)

        // 指C 按住跳跃
        assertTrue(jump.isPressed())

        // 指A 输出 W
        router.onPointerEvent(InputPointerEvent(1, InputPointerEvent.Action.MOVE, 100f, 850f, 20))
        assertTrue(sink.keyEvents.contains(Keys.W to ButtonAction.PRESS))

        // 依次抬起，各通道独立清理
        router.onPointerEvent(InputPointerEvent(1, InputPointerEvent.Action.UP, 100f, 850f, 30))
        router.onPointerEvent(InputPointerEvent(2, InputPointerEvent.Action.UP, 1540f, 500f, 31))
        router.onPointerEvent(InputPointerEvent(3, InputPointerEvent.Action.UP, 900f, 1300f, 32))
        assertTrue(router.activeBindings().isEmpty())
        assertFalse(jump.isPressed())
    }

    @Test
    fun pointer_outsideAllZones_isRejected() {
        val bareRouter = TouchRouter(
            zoneResolver = { _, _ -> null },
            lookChannel = look,
            moveChannel = stick,
            gameChannel = game,
        )
        assertFalse(bareRouter.onPointerEvent(InputPointerEvent(1, InputPointerEvent.Action.DOWN, 0f, 0f, 0)))
        assertTrue(bareRouter.activeBindings().isEmpty())
    }

    @Test
    fun hotbar_tap_mapsToDigitKey() {
        val hotbar = HotbarTap(
            sink,
            Region("hotbar", 400f, 1400f, 1300f, 1500f),
        )
        // 宽 900，槽宽 100：x=450 → 槽 1；x=1299 → 槽 9
        assertEquals(1, hotbar.onTap(450f, 1450f))
        assertEquals(9, hotbar.onTap(1299f, 1450f))
        assertEquals(5, hotbar.onTap(850f, 1450f))

        // 注入了对应数字键 PRESS+RELEASE（先清掉前面三次 onTap 累积的事件）
        sink.clear()
        assertEquals(5, hotbar.onTap(850f, 1450f))
        assertEquals(listOf(Keys.KEY_5 to ButtonAction.PRESS, Keys.KEY_5 to ButtonAction.RELEASE), sink.keyEvents)
    }
}
