package com.tipcl.android.core.ui

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/** 布局 JSON 序列化/反序列化往返与版本兼容。 */
class OverlayLayoutJsonTest {

    @Test
    fun defaultLayoutRoundTrip() {
        val original = OverlayLayout.default()
        val decoded = OverlayLayoutJson.decode(OverlayLayoutJson.encode(original))
        assertEquals(original, decoded)
    }

    @Test
    fun customLayoutRoundTrip() {
        val original = OverlayLayout(
            version = OverlayLayout.VERSION,
            buttons = listOf(
                ButtonSpec("A", 65, "TAP", 0.25f, 0.5f, 56f, 0.75f),
                ButtonSpec("↑", 265, "HOLD", 0.5f, 0.2f, 64.5f, 0.4f),
            ),
            joystick = JoystickSpec(centerXF = 0.2f, centerYF = 0.6f, radiusF = 0.13f, deadZoneF = 0.2f, floating = true),
            globalAlpha = 0.8f,
        )
        val decoded = OverlayLayoutJson.decode(OverlayLayoutJson.encode(original))
        assertEquals(original, decoded)
    }

    @Test
    fun legacyJsonWithoutNewFieldsDecodesWithDefaults() {
        // 旧版格式：无 version / deadZone / globalAlpha。
        val legacy = """
            {"buttons":[{"name":"跳跃","key":32,"behavior":"HOLD","x":0.86,"y":0.72,"sizeDp":76.0,"alpha":0.5}],
             "joystick":{"cx":0.14,"cy":0.74,"r":0.11}}
        """.trimIndent()
        val layout = OverlayLayoutJson.decode(legacy)
        assertEquals(OverlayLayout.VERSION, layout.version)
        assertEquals(1, layout.buttons.size)
        assertEquals(32, layout.buttons[0].key)
        assertEquals(JoystickSpec().deadZoneF, layout.joystick.deadZoneF)
        assertEquals(false, layout.joystick.floating)
        assertEquals(1f, layout.globalAlpha)
    }

    @Test
    fun floatingJoystickRoundTrip() {
        val original = OverlayLayout.default()
            .copy(joystick = JoystickSpec(floating = true))
        val json = OverlayLayoutJson.encode(original)
        assertTrue(json.contains("\"floating\":true"))
        assertEquals(original, OverlayLayoutJson.decode(json))
    }

    @Test
    fun encodedJsonCarriesVersionField() {
        val json = OverlayLayoutJson.encode(OverlayLayout.default())
        assertTrue(json.contains("\"version\":${OverlayLayout.VERSION}"))
    }

    @Test
    fun defaultLayoutRestoreProducesPresetButtons() {
        val restored = OverlayLayout.default()
        assertEquals(5, restored.buttons.size)
        // 默认键位含 GLFW 码映射。
        assertEquals(listOf(32, 340, 84, 69, 81), restored.buttons.map { it.key })
        assertEquals(JoystickSpec(), restored.joystick)
    }
}
