package com.tipcl.android.core.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue

/**
 * 游戏内文字输入控制器（聊天栏的编辑状态机）。
 *
 * 只管「文本状态 + 提交/取消时的注入」，不管通道占用与 UI：
 * - 通道占用由 [OverlayInputPipeline] 在 textInputActive 期间独占
 *   （暂停 LookGesture / 摇杆 / 虚拟按键的注入路径）；
 * - UI 由 [ChatInputBar] 承载（BasicTextField 托管 Android IME）。
 *
 * 提交语义（中英文 IME 兼容的关键）：
 * - [TextFieldValue.composition] 非空表示 IME 正在组字（拼音串/注音串
 *   尚未上屏），此时 text 中混有未确定内容，[commit] 直接忽略本次请求，
 *   等 IME 确认（组字清空）后再提交；
 * - 提交时按 codepoint 逐个 [GameInputTarget.postCodepoint]，最后补一个
 *   回车键 press+release，对应 MC 聊天「回车发送」。
 */
class TextInputController(private val target: GameInputTarget) {

    /** 编辑框当前内容（含 IME 组字状态，供 UI 镜像显示）。 */
    var text by mutableStateOf(TextFieldValue(""))
        private set

    /** IME 是否正在组字（拼音/注音未上屏）。 */
    val composing: Boolean get() = text.composition != null

    /** 打开输入：清空上次内容（通道占用由 pipeline 负责）。 */
    fun begin() {
        text = TextFieldValue("")
    }

    fun updateText(value: TextFieldValue) {
        text = value
    }

    /** 剪贴板粘贴：插入光标处并替换选中段。 */
    fun paste(clipboardText: String?) {
        if (clipboardText.isNullOrEmpty()) return
        val sel = text.selection
        val start = sel.min.coerceIn(0, text.text.length)
        val end = sel.max.coerceIn(0, text.text.length)
        val newText = text.text.replaceRange(start, end, clipboardText)
        text = TextFieldValue(newText, TextRange(start + clipboardText.length))
    }

    /** 取消：丢弃当前内容，不向游戏注入任何字符。 */
    fun cancel() {
        text = TextFieldValue("")
    }

    /**
     * 提交：把最终文本逐字符注入游戏并补回车。
     * 组字中（composition 非空）时拒绝提交，返回 false，由 UI 保持输入状态。
     */
    fun commit(): Boolean {
        if (composing) return false
        val final = text.text
        var i = 0
        while (i < final.length) {
            val c = final[i]
            if (c.isHighSurrogate() && i + 1 < final.length && final[i + 1].isLowSurrogate()) {
                // BMP 之外的字符（如 emoji）：作为完整 codepoint 注入，
                // 而不是拆成两个 UTF-16 代理项。
                target.postCodepoint(Character.toCodePoint(c, final[i + 1]))
                i += 2
            } else {
                target.postCodepoint(c.code)
                i += 1
            }
        }
        // 回车确认（GLFW_KEY_ENTER=257）。
        target.postKey(GlfwKeys.KEY_ENTER, true)
        target.postKey(GlfwKeys.KEY_ENTER, false)
        text = TextFieldValue("")
        return true
    }
}
