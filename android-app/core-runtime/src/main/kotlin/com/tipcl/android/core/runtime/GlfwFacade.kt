package com.tipcl.android.core.runtime

/**
 * 对游戏暴露的 GLFW 静态门面。
 *
 * 游戏代码按标准 GLFW C API 写；字节码里调用的是本类的同名静态方法
 * （由 core-runtime 的字节码重映射层或编译期替换保证，M2 落实）。
 * 全部实现委托给 native 侧 glfw_stub。
 *
 * 行为定义参照 GLFW 官方 API 规范（glfw3.h / glfw.org docs），洁净室实现。
 */
object GlfwFacade {

    // ---- 常量（与 glfw3.h 数值一致，洁净室抄写自官方公开规范） ----
    const val GLFW_TRUE = 1
    const val GLFW_FALSE = 0

    const val GLFW_PRESS = 1
    const val GLFW_RELEASE = 0
    const val GLFW_REPEAT = 2

    const val GLFW_KEY_SPACE = 32
    const val GLFW_KEY_ESCAPE = 256
    const val GLFW_KEY_ENTER = 257
    const val GLFW_KEY_TAB = 258
    const val GLFW_KEY_BACKSPACE = 259
    const val GLFW_KEY_UP = 265
    const val GLFW_KEY_DOWN = 264
    const val GLFW_KEY_LEFT = 263
    const val GLFW_KEY_RIGHT = 262
    const val GLFW_KEY_LEFT_SHIFT = 340
    const val GLFW_KEY_LEFT_CONTROL = 341
    const val GLFW_KEY_LEFT_ALT = 342

    const val GLFW_MOUSE_BUTTON_1 = 0
    const val GLFW_MOUSE_BUTTON_2 = 1

    const val GLFW_CLIENT_API = 0x22001
    const val GLFW_OPENGL_ES_API = 0x22004
    const val GLFW_CONTEXT_VERSION_MAJOR = 0x22002
    const val GLFW_CONTEXT_VERSION_MINOR = 0x22003

    // 输入模式（与 glfw_stub.h 数值一致）
    const val GLFW_CURSOR = 0x00033001
    const val GLFW_STICKY_KEYS = 0x00033002
    const val GLFW_STICKY_MOUSE_BUTTONS = 0x00033003
    const val GLFW_LOCK_KEY_MODS = 0x00033004
    const val GLFW_RAW_MOUSE_MOTION = 0x00033005

    const val GLFW_CURSOR_NORMAL = 0x00034001
    const val GLFW_CURSOR_HIDDEN = 0x00034002
    const val GLFW_CURSOR_DISABLED = 0x00034003

    // ---- 回调函数式接口（对应 GLFW 回调指针） ----
    fun interface GLFWkeyfun {
        fun invoke(window: Long, key: Int, scancode: Int, action: Int, mods: Int)
    }

    fun interface GLFWcharfun {
        fun invoke(window: Long, codepoint: Int)
    }

    fun interface GLFWcursorposfun {
        fun invoke(window: Long, xpos: Double, ypos: Double)
    }

    fun interface GLFWmousebuttonfun {
        fun invoke(window: Long, button: Int, action: Int, mods: Int)
    }

    fun interface GLFWscrollfun {
        fun invoke(window: Long, xoffset: Double, yoffset: Double)
    }

    fun interface GLFWframebuffersizefun {
        fun invoke(window: Long, width: Int, height: Int)
    }

    fun interface GLFWerrorfun {
        fun invoke(errorCode: Int, description: String)
    }

    // ---- init / 终止 ----
    @JvmStatic external fun glfwInit(): Int
    @JvmStatic external fun glfwTerminate()
    @JvmStatic external fun glfwInitHint(hint: Int, value: Int)

    // ---- 窗口 ----
    @JvmStatic external fun glfwDefaultWindowHints()
    @JvmStatic external fun glfwWindowHint(hint: Int, value: Int)
    @JvmStatic external fun glfwCreateWindow(width: Int, height: Int, title: String?, monitor: Long, share: Long): Long
    @JvmStatic external fun glfwDestroyWindow(window: Long)
    @JvmStatic external fun glfwWindowShouldClose(window: Long): Int
    @JvmStatic external fun glfwSetWindowShouldClose(window: Long, value: Int)
    @JvmStatic external fun glfwGetFramebufferSize(window: Long): IntArray // [w, h]

    // ---- 上下文 ----
    @JvmStatic external fun glfwMakeContextCurrent(window: Long)
    @JvmStatic external fun glfwSwapInterval(interval: Int)
    @JvmStatic external fun glfwSwapBuffers(window: Long)
    @JvmStatic external fun glfwExtensionSupported(extension: String?): Int

    /**
     * 取 GL/GLES 扩展函数指针。
     * native 侧实现：eglGetProcAddress 优先，NULL 时 dlsym(RTLD_DEFAULT) 回退。
     * 返回 0 表示该函数在当前上下文不可用（调用方必须判空再转调）。
     */
    @JvmStatic external fun glfwGetProcAddress(procName: String?): Long

    // ---- 事件循环 ----
    @JvmStatic external fun glfwPollEvents()
    @JvmStatic external fun glfwWaitEvents()

    // ---- 输入 ----
    @JvmStatic external fun glfwGetKey(window: Long, key: Int): Int
    @JvmStatic external fun glfwGetMouseButton(window: Long, button: Int): Int
    @JvmStatic external fun glfwGetCursorPos(window: Long): DoubleArray // [x, y]
    @JvmStatic external fun glfwSetCursorPos(window: Long, xpos: Double, ypos: Double)

    /** 设置输入模式（[GLFW_CURSOR] 取 [GLFW_CURSOR_NORMAL]/[GLFW_CURSOR_HIDDEN]/[GLFW_CURSOR_DISABLED]）。 */
    @JvmStatic external fun glfwSetInputMode(window: Long, mode: Int, value: Int)

    /** 读取输入模式当前值（如进存档前探测鼠标捕获态）。 */
    @JvmStatic external fun glfwGetInputMode(window: Long, mode: Int): Int

    /** 进存档鼠标捕获的易用包装：等价 glfwSetInputMode(window, GLFW_CURSOR, mode)。 */
    @JvmStatic fun setCursorMode(window: Long, mode: Int) = glfwSetInputMode(window, GLFW_CURSOR, mode)

    @JvmStatic external fun glfwSetKeyCallback(window: Long, cb: GLFWkeyfun?): GLFWkeyfun?
    @JvmStatic external fun glfwSetCharCallback(window: Long, cb: GLFWcharfun?): GLFWcharfun?
    @JvmStatic external fun glfwSetCursorPosCallback(window: Long, cb: GLFWcursorposfun?): GLFWcursorposfun?
    @JvmStatic external fun glfwSetMouseButtonCallback(window: Long, cb: GLFWmousebuttonfun?): GLFWmousebuttonfun?
    @JvmStatic external fun glfwSetScrollCallback(window: Long, cb: GLFWscrollfun?): GLFWscrollfun?
    @JvmStatic external fun glfwSetFramebufferSizeCallback(window: Long, cb: GLFWframebuffersizefun?): GLFWframebuffersizefun?
    @JvmStatic external fun glfwSetErrorCallback(cb: GLFWerrorfun?): GLFWerrorfun?

    // ---- 剪贴板 ----
    @JvmStatic external fun glfwGetClipboardString(window: Long): String?
    @JvmStatic external fun glfwSetClipboardString(window: Long, text: String?)

    // ---- 时间 ----
    @JvmStatic external fun glfwGetTime(): Double
    @JvmStatic external fun glfwSetTime(time: Double)

    // ---- 显示器（v1 最小集：仅主显示器） ----
    @JvmStatic external fun glfwGetPrimaryMonitor(): Long
    @JvmStatic external fun glfwGetVideoMode(monitor: Long): IntArray? // [w, h, redBits, greenBits, blueBits, refreshRate]
}
