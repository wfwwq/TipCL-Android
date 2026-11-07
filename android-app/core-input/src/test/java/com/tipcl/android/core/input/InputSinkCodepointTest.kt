package com.tipcl.android.core.input

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * InputSink.postCodepoint 通道：
 * - 默认实现降级转发 postCharEvent（BMP 单 Char、非 BMP 拆代理项）；
 * - 覆写实现收到完整 codepoint，emoji 不再被拆散。
 */
class InputSinkCodepointTest {

    /** 覆写 postCodepoint 的实现：模拟 app 层真正的 codepoint 注入。 */
    private class CodepointSink : InputSink {
        val codepoints = mutableListOf<Int>()

        override fun postKeyEvent(keyEvent: KeyEvent) = Unit
        override fun postCharEvent(char: Char) = fail()
        override fun postCursorPos(x: Float, y: Float) = Unit
        override fun postMouseButton(button: MouseButton, action: ButtonAction) = Unit

        override fun postCodepoint(codepoint: Int) {
            codepoints.add(codepoint)
        }

        private fun fail(): Nothing = throw AssertionError("不应走到 postCharEvent")
    }

    // ---- 默认实现：BMP 码点 ----

    @Test
    fun default_bmpCodepoint_forwardsSingleChar() {
        val sink = RecordingSink()
        sink.postCodepoint(65)          // 'A'
        sink.postCodepoint(0x4E2D)      // '中'
        assertEquals(listOf('A', '中'), sink.chars)
    }

    @Test
    fun default_bmpBoundary_0xFFFF_forwardsSingleChar() {
        val sink = RecordingSink()
        sink.postCodepoint(0xFFFF)
        assertEquals(listOf<Char>(0xFFFF.toChar()), sink.chars)
    }

    // ---- 默认实现：非 BMP 码点拆代理项（与旧调用方行为一致） ----

    @Test
    fun default_nonBmpEmoji_splitsIntoSurrogatePair() {
        val sink = RecordingSink()
        sink.postCodepoint(0x1F600)     // 😀
        assertEquals(0xD83D, sink.chars[0].code) // 高代理
        assertEquals(0xDE00, sink.chars[1].code) // 低代理
        assertEquals(2, sink.chars.size)
    }

    @Test
    fun default_nonBmpBoundary_0x10000_splitsIntoSurrogatePair() {
        val sink = RecordingSink()
        sink.postCodepoint(0x10000)
        assertEquals(0xD800, sink.chars[0].code)
        assertEquals(0xDC00, sink.chars[1].code)
    }

    @Test
    fun default_invalidSurrogateCodepoint_isIgnored() {
        val sink = RecordingSink()
        sink.postCodepoint(0xD800) // 代理区不是合法码点，不注入撕裂值
        assertTrue(sink.chars.isEmpty())
    }

    // ---- 覆写实现：完整 codepoint 直达 ----

    @Test
    fun override_receivesFullCodepoint_emojiIntact() {
        val sink = CodepointSink()
        sink.postCodepoint(0x1F600)
        sink.postCodepoint(0x4E2D)
        assertEquals(listOf(0x1F600, 0x4E2D), sink.codepoints)
        assertTrue(sink.codepoints[0] > Char.MAX_VALUE.code)
    }
}
