package com.tipcl.android.core.input

/** 测试用 InputSink：记录全部注入事件。 */
class RecordingSink : InputSink {
    data class Entry(val kind: String, val detail: String)

    val entries = mutableListOf<Entry>()

    val keyEvents = mutableListOf<Pair<Int, ButtonAction>>()
    val cursorMoves = mutableListOf<Pair<Float, Float>>()
    val mouseButtons = mutableListOf<Pair<MouseButton, ButtonAction>>()
    val chars = mutableListOf<Char>()

    override fun postKeyEvent(keyEvent: KeyEvent) {
        keyEvents.add(keyEvent.code to keyEvent.action)
        entries.add(Entry("key", "${keyEvent.code}:${keyEvent.action}"))
    }

    override fun postCharEvent(char: Char) {
        chars.add(char)
        entries.add(Entry("char", char.toString()))
    }

    override fun postCursorPos(x: Float, y: Float) {
        cursorMoves.add(x to y)
        entries.add(Entry("cursor", "$x,$y"))
    }

    override fun postMouseButton(button: MouseButton, action: ButtonAction) {
        mouseButtons.add(button to action)
        entries.add(Entry("mouse", "$button:$action"))
    }

    fun clear() {
        entries.clear(); keyEvents.clear(); cursorMoves.clear()
        mouseButtons.clear(); chars.clear()
    }
}
