package com.tipcl.android.core.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.stringResource

/**
 * MC 聊天栏样式的游戏内输入条。仅当 pipeline.textInputActive 时被组合。
 *
 * - BasicTextField 托管 Android IME（中文输入法原生支持：组字下划线、
 *   候选词栏均由系统 IME 呈现，组字内容不注入游戏）；
 * - 上方一行是「镜像显示」：实时展示当前输入内容（含组字串），MC 风格；
 * - 粘贴按钮读取系统剪贴板；发送=逐字符 postCodepoint + 回车；取消=丢弃；
 * - 返回键：先收起本输入（释放通道），再次返回才走游戏退出路径；
 * - 物理键盘：ESC 取消、Enter 发送（onPreviewKeyEvent 拦截）。
 */
@Composable
fun ChatInputBar(
    pipeline: OverlayInputPipeline,
    modifier: Modifier = Modifier,
) {
    val keyboard = LocalSoftwareKeyboardController.current
    val clipboard = LocalClipboardManager.current
    val focusRequester = remember { FocusRequester() }

    fun commit() {
        keyboard?.hide()
        pipeline.commitTextInput()
    }

    fun cancel() {
        keyboard?.hide()
        pipeline.cancelTextInput()
    }

    // 本组件只在输入激活时组合，因此 BackHandler 直接启用即可：
    // 第一次返回收起输入并释放通道，不落入 GameHostActivity 的退出逻辑。
    BackHandler { cancel() }

    LaunchedEffect(Unit) {
        // 聚焦编辑框 → 系统弹出软键盘（BasicTextField 聚焦即请求 IME）。
        focusRequester.requestFocus()
    }

    Column(
        modifier = modifier
            .background(color = Color(0xB0101010), shape = MaterialTheme.shapes.medium)
            .border(1.dp, Color.White.copy(alpha = 0.35f), MaterialTheme.shapes.medium)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp),
    ) {
        // 镜像显示：MC 聊天栏会把当前消息以白色文本展示在输入行上方。
        Text(
            text = buildString {
                append("> ")
                append(pipeline.textInput.text.text)
                if (pipeline.textInput.composing) append("…") // 组字中标记
            },
            color = Color.White.copy(alpha = 0.85f),
            fontSize = 14.sp,
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = ">",
                color = Color.White,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(end = 8.dp),
            )
            BasicTextField(
                value = pipeline.textInput.text,
                onValueChange = pipeline.textInput::updateText,
                singleLine = true,
                textStyle = TextStyle(color = Color.White, fontSize = 16.sp),
                cursorBrush = SolidColor(Color.White),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Send,
                    autoCorrect = false,
                ),
                keyboardActions = KeyboardActions(onSend = { commit() }),
                modifier = Modifier
                    .weight(1f)
                    .focusRequester(focusRequester)
                    .onPreviewKeyEvent { event ->
                        // 物理键盘：ESC 取消 / Enter 发送；软键盘的发送走 onSend。
                        when {
                            event.type == KeyEventType.KeyDown && event.key == Key.Escape -> {
                                cancel()
                                true
                            }
                            event.type == KeyEventType.KeyDown &&
                                (event.key == Key.Enter || event.key == Key.NumPadEnter) -> {
                                commit()
                                true
                            }
                            else -> false
                        }
                    },
            )
            Text(
                text = stringResource(R.string.overlay_paste),
                color = Color(0xFF66CCFF),
                modifier = Modifier
                    .padding(start = 8.dp)
                    .clickable { pipeline.textInput.paste(clipboard.getText()?.toString()) },
            )
            Text(
                text = stringResource(R.string.overlay_send),
                color = Color(0xFF66CCFF),
                modifier = Modifier
                    .padding(start = 12.dp)
                    .clickable { commit() },
            )
            Text(
                text = stringResource(R.string.overlay_cancel),
                color = Color.White.copy(alpha = 0.7f),
                modifier = Modifier
                    .padding(start = 12.dp)
                    .clickable { cancel() },
            )
        }

        if (pipeline.textInput.composing) {
            Text(
                text = stringResource(R.string.overlay_composing_hint),
                color = Color.White.copy(alpha = 0.45f),
                fontSize = 12.sp,
            )
        }
    }
}
