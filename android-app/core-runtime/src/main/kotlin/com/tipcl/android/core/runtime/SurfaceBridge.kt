package com.tipcl.android.core.runtime

import android.view.Surface

/**
 * Android Surface -> native 渲染面的桥。
 *
 * 宿主 Activity/View 侧在持有 Surface 时调用生命周期方法，
 * 这里通过 JNI 把 Surface（ANativeWindow）交给 egl_bridge.c。
 *
 * 典型接线（app 模块）：
 * ```
 * surfaceHolder.addCallback(object : SurfaceHolder.Callback {
 *     override fun surfaceCreated(h: SurfaceHolder) = surfaceBridge.onSurfaceCreated(h.surface)
 *     override fun surfaceChanged(h: SurfaceHolder, f: Int, w: Int, h2: Int) =
 *         surfaceBridge.onSurfaceChanged(h.surface, w, h2)
 *     override fun surfaceDestroyed(h: SurfaceHolder) = surfaceBridge.onSurfaceDestroyed()
 * })
 * ```
 */
class SurfaceBridge {

    /** 渲染线程需要在 EGL 就绪后才能消费 Surface；此标志由 native 侧维护。 */
    @Volatile
    var isNativeReady: Boolean = false
        private set

    init {
        ensureLoaded()
    }

    fun onSurfaceCreated(surface: Surface) {
        check(surface.isValid) { "Surface is not valid" }
        nativeOnSurfaceCreated(surface)
    }

    fun onSurfaceChanged(surface: Surface, width: Int, height: Int) {
        nativeOnSurfaceChanged(surface, width, height)
        isNativeReady = true
    }

    fun onSurfaceDestroyed() {
        isNativeReady = false
        nativeOnSurfaceDestroyed()
    }

    /** 请求 native 侧执行一次 swap（渲染循环位于游戏进程内时由其调用）。 */
    fun swapBuffers(): Boolean = nativeSwapBuffers()

    // ---- JNI ----
    private external fun nativeOnSurfaceCreated(surface: Surface)
    private external fun nativeOnSurfaceChanged(surface: Surface, width: Int, height: Int)
    private external fun nativeOnSurfaceDestroyed()
    external fun nativeSwapBuffers(): Boolean

    companion object {
        @Volatile
        private var loaded = false

        fun ensureLoaded() {
            if (loaded) return
            synchronized(this) {
                if (!loaded) {
                    System.loadLibrary("tipcl_runtime")
                    loaded = true
                }
            }
        }
    }
}
