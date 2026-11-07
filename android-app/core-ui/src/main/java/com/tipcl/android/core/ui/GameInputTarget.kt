package com.tipcl.android.core.ui

/**
 * core-ui 对运行时注入的最小出口。刻意不依赖 core-runtime：
 * app 层用 InputInjector 适配本接口，core-ui 只面向本抽象写测试与 UI。
 *
 * code 为 GLFW 键位码；mouseButton 采用 GLFW 编号：0=左 1=右 2=中。
 * cursorDelta 为相对增量（视角拖动输出），由 native 侧按捕获模式消费。
 */
interface GameInputTarget {
    fun postKey(code: Int, press: Boolean)

    /**
     * 带修饰键（mods，GLFW modifier bitmask）与重复键标记的按键注入。
     * 保留为独立重载而非给 [postKey] 加默认参数，是为了不破坏既有的
     * 两参覆写（app 层 InputInjector 适配无需跟随修改）。默认实现忽略
     * mods/repeat，降级为两参 [postKey]；需要精确修饰键语义的实现方
     * 覆写本方法。
     */
    fun postKey(code: Int, press: Boolean, mods: Int = 0, repeat: Boolean = false) {
        postKey(code, press)
    }

    fun postChar(char: Char)

    /**
     * 注入一个完整 Unicode codepoint（UTF-32）。文字输入路径优先用本方法，
     * 避免 BMP 之外的字符（emoji 等）被拆成 UTF-16 代理项发到 native。
     * 默认实现降级为 postChar（仅 BMP 正确），app 层的 InputInjector 适配
     * 会覆写为真正的 codepoint 注入。
     */
    fun postCodepoint(codepoint: Int) {
        postChar(codepoint.toChar())
    }

    fun postCursorDelta(dx: Float, dy: Float)
    fun postMouseButton(mouseButton: Int, press: Boolean)
}

/** 本工程用到的 GLFW 键位码补充（core-input.Keys 覆盖 WASD/数字/空格/Shift）。 */
object GlfwKeys {
    const val ESCAPE = 256
    const val KEY_ENTER = 257
    const val KEY_T = 84
    const val KEY_E = 69
    const val KEY_Q = 81
}
