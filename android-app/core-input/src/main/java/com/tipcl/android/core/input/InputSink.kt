package com.tipcl.android.core.input

/**
 * 对运行时输入注入的最小接口。core-input 只负责把触控手势翻译成
 * 「键鼠事件」，真正注入由 app 层实现并桥接到 core-runtime，
 * 因此本模块不直接依赖 core-runtime。
 */
interface InputSink {
    /** 注入按键按下/释放（WASD、数字键等）。keyEvent 中携带 key 码与按下状态。 */
    fun postKeyEvent(keyEvent: KeyEvent)

    /** 注入字符输入（聊天等场景）。 */
    fun postCharEvent(char: Char)

    /**
     * 注入一个完整 Unicode codepoint（UTF-32，聊天等文字输入场景）。
     *
     * [postCharEvent] 是 UTF-16 语义，BMP 之外的字符（emoji 等）在调用方
     * 侧会先被拆成代理项再逐 Char 下发，native 侧若按 codepoint 消费会收到
     * 两个非法码点。实现方应覆写本方法做真正的 codepoint 注入；未覆写时
     * 降级转发 [postCharEvent]：BMP 码点原样单 Char 转发，非 BMP 码点拆成
     * 高/低代理项逐 Char 转发（即保持与旧调用方拆分一致的行为）。
     */
    fun postCodepoint(codepoint: Int) {
        when {
            codepoint in 0..Char.MAX_VALUE.code && !isSurrogateCodepoint(codepoint) ->
                postCharEvent(codepoint.toChar())

            codepoint in (Char.MAX_VALUE.code + 1)..MAX_CODEPOINT -> {
                val v = codepoint - 0x10000
                val high = 0xD800 or (v shr 10)
                val low = 0xDC00 or (v and 0x3FF)
                postCharEvent(high.toChar())
                postCharEvent(low.toChar())
            }

            // 非法码点（负数、代理区、> U+10FFFF）：忽略，避免向下游注入撕裂值。
        }
    }

    private fun isSurrogateCodepoint(cp: Int): Boolean =
        cp in Char.MIN_SURROGATE.code..Char.MAX_SURROGATE.code

    /** 注入相对或绝对鼠标位置。 */
    fun postCursorPos(x: Float, y: Float)

    /** 注入鼠标按键动作。 */
    fun postMouseButton(button: MouseButton, action: ButtonAction)
}

/** Minecraft 风格的键位描述。code 采用 GLFW 键位码，与桌面端一致。 */
data class KeyEvent(val code: Int, val action: ButtonAction)

enum class MouseButton { LEFT, RIGHT, MIDDLE }

enum class ButtonAction { PRESS, RELEASE }

/** Unicode 码点上界（U+10FFFF）。 */
const val MAX_CODEPOINT: Int = 0x10FFFF

/** 常用 GLFW 键位码，避免各处硬编码。 */
object Keys {
    const val W = 87
    const val A = 65
    const val S = 83
    const val D = 68
    const val SPACE = 32
    const val SHIFT_LEFT = 340
    const val KEY_1 = 49
    const val KEY_2 = 50
    const val KEY_3 = 51
    const val KEY_4 = 52
    const val KEY_5 = 53
    const val KEY_6 = 54
    const val KEY_7 = 55
    const val KEY_8 = 56
    const val KEY_9 = 57
}
