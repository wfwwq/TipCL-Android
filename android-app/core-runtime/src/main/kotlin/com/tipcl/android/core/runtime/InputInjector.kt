package com.tipcl.android.core.runtime

/**
 * 供 core-input 调用的事件注入器。
 *
 * Android 输入事件（触摸/按键/手柄）经 core-input 归一化后，
 * 通过这里转发到 native 侧 glfw_stub 的环形事件队列；
 * 游戏 pollEvents 时消费并回调 GLFW 用户回调。
 *
 * 坐标约定：cursorPos 以像素为单位，左上角原点（与 Android 一致），
 * native 侧不做翻转——GLFW 在安卓上是虚拟平台，直接用 Android 坐标系。
 */
class InputInjector {

    init {
        SurfaceBridge.ensureLoaded()
    }

    /** 按键事件：action 为 GLFW_PRESS/RELEASE/REPEAT，mods 为 GLFW_MOD_* 位或。 */
    fun postKeyEvent(key: Int, scancode: Int, action: Int, mods: Int) {
        nativePostKeyEvent(key, scancode, action, mods)
    }

    /** 文本输入（字符级，UTF-32 codepoint）。 */
    fun postCharEvent(codepoint: Int) {
        nativePostCharEvent(codepoint)
    }

    fun postCursorPos(x: Double, y: Double) {
        nativePostCursorPos(x, y)
    }

    /** button 为 GLFW_MOUSE_BUTTON_*，action 为 PRESS/RELEASE。 */
    fun postMouseButton(button: Int, action: Int, mods: Int) {
        nativePostMouseButton(button, action, mods)
    }

    fun postScroll(xoffset: Double, yoffset: Double) {
        nativePostScroll(xoffset, yoffset)
    }

    fun postFramebufferSize(width: Int, height: Int) {
        nativePostFramebufferSize(width, height)
    }

    // ---- JNI ----
    private external fun nativePostKeyEvent(key: Int, scancode: Int, action: Int, mods: Int)
    private external fun nativePostCharEvent(codepoint: Int)
    private external fun nativePostCursorPos(x: Double, y: Double)
    private external fun nativePostMouseButton(button: Int, action: Int, mods: Int)
    private external fun nativePostScroll(xoffset: Double, yoffset: Double)
    private external fun nativePostFramebufferSize(width: Int, height: Int)
}
