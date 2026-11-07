package com.tipcl.android.core.input

/**
 * 纯数据指针事件。刻意不使用 android.view.MotionEvent，保证核心触控逻辑
 * 可以在纯 JVM 环境下测试。app 层负责把 MotionEvent 转换成此结构。
 *
 * @param pointerId  触点 ID，从按下到抬起保持不变（对应 MotionEvent#getPointerId）
 * @param action     DOWN / MOVE / UP 三态足够描述触控行为
 * @param x, y       视图坐标系像素
 * @param timestampMs 事件时间戳（毫秒），用于点按/长按时长判定
 */
data class InputPointerEvent(
    val pointerId: Int,
    val action: Action,
    val x: Float,
    val y: Float,
    val timestampMs: Long,
) {
    enum class Action { DOWN, MOVE, UP }
}
