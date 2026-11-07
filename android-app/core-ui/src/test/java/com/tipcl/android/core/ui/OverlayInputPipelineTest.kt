package com.tipcl.android.core.ui

import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import com.tipcl.android.core.input.InputPointerEvent
import com.tipcl.android.core.input.Keys
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * M3 接口清债后的 core-ui 行为回归：
 * - 灵敏度热更新（LookGesture.sensitivity @Volatile var）：updateSensitivity
 *   不再重建 LookGesture + TouchRouter，进行中的拖动手势继续跟踪且按新
 *   灵敏度产出视角增量；
 * - codepoint 直通：sink 覆写 postCodepoint 直达 GameInputTarget，
 *   非 BMP 字符（emoji）不再被拆成代理项。
 */
class OverlayInputPipelineTest {

    private class RecordingTarget : GameInputTarget {
        val cursorDeltas = mutableListOf<Pair<Float, Float>>()
        val codepoints = mutableListOf<Int>()
        val keys = mutableListOf<Pair<Int, Boolean>>()

        override fun postKey(code: Int, press: Boolean) {
            keys.add(code to press)
        }

        override fun postChar(char: Char) {
            codepoints.add(char.code)
        }

        override fun postCodepoint(codepoint: Int) {
            codepoints.add(codepoint)
        }

        override fun postCursorDelta(dx: Float, dy: Float) {
            cursorDeltas.add(dx to dy)
        }

        override fun postMouseButton(mouseButton: Int, press: Boolean) = Unit
    }

    private class FakeSettings(
        private val sensitivity: Float = LookGestureDefaultSensitivity,
    ) : OverlaySettingsStore {
        var savedSensitivity: Float? = null

        override fun loadLayout(): OverlayLayout? = null
        override fun saveLayout(layout: OverlayLayout) = Unit
        override fun loadSensitivity(): Float = sensitivity
        override fun saveSensitivity(value: Float) {
            savedSensitivity = value
        }

        companion object {
            // LookGesture.DEFAULT_SENSITIVITY 是 const，直接引用。
            val LookGestureDefaultSensitivity =
                com.tipcl.android.core.input.LookGesture.DEFAULT_SENSITIVITY
        }
    }

    private fun down(id: Int, x: Float, y: Float, ms: Long) =
        InputPointerEvent(id, InputPointerEvent.Action.DOWN, x, y, ms)

    private fun move(id: Int, x: Float, y: Float, ms: Long) =
        InputPointerEvent(id, InputPointerEvent.Action.MOVE, x, y, ms)

    private fun up(id: Int, x: Float, y: Float, ms: Long) =
        InputPointerEvent(id, InputPointerEvent.Action.UP, x, y, ms)

    @Test
    fun updateSensitivity_hotUpdatesLookGesture_withoutRebuild() {
        // 初始灵敏度 1f；拖动产出 = 位移 * sensitivity。
        val settings = FakeSettings(sensitivity = 1f)
        val target = RecordingTarget()
        val pipeline = OverlayInputPipeline(target, settings)
        pipeline.setMetrics(800, 1280, density = 3f)

        // 左上角空白区（避开摇杆/按键/快捷栏热区）：down 后拖动锁定。
        assertTrue(pipeline.dispatch(down(1, 100f, 100f, 0)))
        assertTrue(pipeline.dispatch(move(1, 200f, 100f, 10)))
        assertTrue(pipeline.dispatch(move(1, 210f, 100f, 20)))
        assertEquals(listOf(100f to 0f, 10f to 0f), target.cursorDeltas)

        // 热更新：不重建管线，进行中的拖动继续跟踪并按新灵敏度产出。
        pipeline.updateSensitivity(2f)
        assertEquals(2f, settings.savedSensitivity)
        assertTrue(pipeline.dispatch(move(1, 220f, 100f, 30)))
        assertEquals(listOf(100f to 0f, 10f to 0f, 20f to 0f), target.cursorDeltas)

        // 同一触点 UP 正常收尾（若中途重建过，跟踪已丢失，UP 不会产出）。
        assertTrue(pipeline.dispatch(up(1, 220f, 100f, 40)))
        assertTrue(target.cursorDeltas.size == 3)
    }

    @Test
    fun codepointPassthrough_emojiReachesTargetAsSingleCodepoint() {
        val target = RecordingTarget()
        val pipeline = OverlayInputPipeline(target, FakeSettings())
        pipeline.setMetrics(800, 1280, density = 3f)

        pipeline.openTextInput()
        assertTrue(pipeline.textInputActive)
        pipeline.textInput.updateText(TextFieldValue("a😀", TextRange(3)))
        pipeline.commitTextInput()

        // a=0x61；😀=U+1F600（若直通失败会被降级拆成高低代理项 0xD83D/0xDE00）。
        assertEquals(listOf(0x61, 0x1F600), target.codepoints)
        assertEquals(
            listOf(GlfwKeys.KEY_ENTER to true, GlfwKeys.KEY_ENTER to false),
            target.keys,
        )
        assertTrue(!pipeline.textInputActive)
    }

    @Test
    fun deadZoneRatio_fromLayout_hotUpdatesOnUpdateLayout() {
        val target = RecordingTarget()
        val settings = FakeSettings()
        val pipeline = OverlayInputPipeline(target, settings)
        pipeline.setMetrics(800, 1280, density = 3f)

        // 默认布局：摇杆半径 = 0.11*800 = 88px，deadZoneF=0.12 → 死区约 10.6px。
        val cx = 0.14f * 800
        val cy = 0.74f * 1280
        assertTrue(pipeline.dispatch(down(1, cx, cy, 0)))
        assertTrue(pipeline.dispatch(move(1, cx + 20f, cy, 10))) // 20px > 死区 → 输出 D
        assertTrue(target.keys.contains(Keys.D to true))
        pipeline.dispatch(up(1, cx + 20f, cy, 20))
        target.keys.clear()

        // 热更新：updateLayout 把 deadZoneF 提到 0.5 → 死区 44px。
        pipeline.updateLayout(pipeline.layout.copy(joystick = pipeline.layout.joystick.copy(deadZoneF = 0.5f)))
        assertEquals(0.5f, pipeline.layout.joystick.deadZoneF)
        assertTrue(pipeline.dispatch(down(2, cx, cy, 30)))
        assertTrue(pipeline.dispatch(move(2, cx + 20f, cy, 40))) // 20px < 44px → 死区内无输出
        assertFalse(target.keys.contains(Keys.D to true))
        // 出死区（>44px）后恢复输出，证明热更新的新比例确实在消费。
        assertTrue(pipeline.dispatch(move(2, cx + 50f, cy, 50)))
        assertTrue(target.keys.contains(Keys.D to true))
        pipeline.dispatch(up(2, cx + 50f, cy, 60))
    }
}
