/* egl_bridge.c — EGL 上下文创建 + Android Surface(ANativeWindow) 生命周期接线。
 *
 * 目标：EGL_OPENGL_ES_API，GL ES 3.2 优先、3.1 回退。
 * M2 完成项：
 *  - ANativeWindow_fromSurface/release 与 EGLSurface 严格配对（attach 失败路径也释放）；
 *  - EGL_KHR_no_config_context / EGL_KHR_surfaceless_context 兼容回退；
 *  - glfwGetProcAddress 实现（eglGetProcAddress 优先 + dlsym 回退）注入 glfw_stub。
 */
#include "egl_bridge.h"
#include "glfw_stub.h"

#include <android/native_window.h>
#include <android/native_window_jni.h>
#include <EGL/egl.h>
#include <EGL/eglext.h>
#include <dlfcn.h>
#include <string.h>
#include <jni.h>
#include <android/log.h>

#define LOG_TAG "TipCL-EGLBridge"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO,  LOG_TAG, __VA_ARGS__)
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN,  LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

/* EGL_KHR_no_config_context / EGL_KHR_surfaceless_context 的规范常量；
 * 旧头文件可能没有，本地兜底定义。 */
#ifndef EGL_NO_CONFIG_KHR
#define EGL_NO_CONFIG_KHR ((EGLConfig)0)
#endif

static EGLDisplay g_display = EGL_NO_DISPLAY;
static EGLConfig  g_config  = NULL;      /* NULL 且支持 no_config 时合法 */
static int        g_have_config = 0;
static EGLContext g_context = EGL_NO_CONTEXT;
static EGLSurface g_surface = EGL_NO_SURFACE;
static EGLSurface g_pbuffer = EGL_NO_SURFACE; /* surfaceless 回退用 */
static int        g_no_config_ctx = 0;
static int        g_surfaceless = 0;
static int        g_swap_interval = 1;

static ANativeWindow* g_window = NULL;
static int g_width = 0, g_height = 0;

static int has_extension(const char* exts, const char* name) {
    if (!exts) return 0;
    size_t len = strlen(name);
    const char* p = exts;
    while ((p = strstr(p, name)) != NULL) {
        char before = (p == exts) ? ' ' : p[-1];
        char after = p[len];
        if ((before == ' ' || before == '\0') && (after == ' ' || after == '\0'))
            return 1;
        p += len;
    }
    return 0;
}

/* 选择支持所请求 GL ES 版本的 config */
static EGLConfig pick_config(EGLDisplay display) {
    EGLConfig configs[64];
    EGLint num = 0;
    const EGLint attrs[] = {
        EGL_SURFACE_TYPE, EGL_WINDOW_BIT,
        EGL_RENDERABLE_TYPE, EGL_OPENGL_ES3_BIT,
        EGL_RED_SIZE, 8, EGL_GREEN_SIZE, 8, EGL_BLUE_SIZE, 8,
        EGL_ALPHA_SIZE, 8, EGL_DEPTH_SIZE, 24, EGL_STENCIL_SIZE, 8,
        EGL_NONE
    };
    if (eglChooseConfig(display, attrs, configs, 64, &num) && num > 0) {
        return configs[0];
    }
    /* 回退：放宽到 ES2 / 565，深度模板交给驱动默认 */
    const EGLint attrs_fallback[] = {
        EGL_SURFACE_TYPE, EGL_WINDOW_BIT,
        EGL_RENDERABLE_TYPE, EGL_OPENGL_ES2_BIT,
        EGL_NONE
    };
    if (eglChooseConfig(display, attrs_fallback, configs, 64, &num) && num > 0) {
        return configs[0];
    }
    return NULL;
}

/* 创建上下文：3.2 优先，3.1 回退；config 可为 EGL_NO_CONFIG_KHR（no_config 扩展）。
 * 属性用 EGL_KHR_create_context 的 KHR 后缀常量（各 NDK 版本 eglext.h 均有）。 */
static EGLContext create_context(EGLDisplay display, EGLConfig config) {
    static const EGLint attrs_32[] = {
        EGL_CONTEXT_MAJOR_VERSION_KHR, 3,
        EGL_CONTEXT_MINOR_VERSION_KHR, 2,
        EGL_NONE
    };
    static const EGLint attrs_31[] = {
        EGL_CONTEXT_MAJOR_VERSION_KHR, 3,
        EGL_CONTEXT_MINOR_VERSION_KHR, 1,
        EGL_NONE
    };
    EGLContext ctx = eglCreateContext(display, config, EGL_NO_CONTEXT, attrs_32);
    if (ctx == EGL_NO_CONTEXT) {
        LOGI("GLES 3.2 context failed (0x%x), falling back to 3.1", eglGetError());
        ctx = eglCreateContext(display, config, EGL_NO_CONTEXT, attrs_31);
    }
    return ctx;
}

/* glfwGetProcAddress：eglGetProcAddress 优先，dlsym(RTLD_DEFAULT) 回退。
 * 有些驱动 eglGetProcAddress 对 GL ES 核心函数（glClear 等）返回 NULL，
 * 此时核心符号可从 libGLESv2/libGLESv3 直接 dlsym。 */
void* egl_bridge_get_proc_address(const char* name) {
    if (!name || !*name) return NULL;
    void* fn = (void*)eglGetProcAddress(name);
    if (fn) return fn;
    fn = dlsym(RTLD_DEFAULT, name);
    if (fn) LOGW("eglGetProcAddress(%s) NULL, dlsym fallback hit", name);
    return fn;
}

/* 上下文创建后未 attach surface 时，让 context 可被 makeCurrent：
 * 优先 surfaceless 扩展；否则建一个 1x1 pbuffer 顶住。 */
static int ensure_headless_surface(void) {
    if (g_surfaceless) {
        return eglMakeCurrent(g_display, EGL_NO_SURFACE, EGL_NO_SURFACE, g_context);
    }
    if (g_pbuffer == EGL_NO_SURFACE) {
        const EGLint pbattribs[] = { EGL_WIDTH, 1, EGL_HEIGHT, 1, EGL_NONE };
        g_pbuffer = eglCreatePbufferSurface(g_display, g_config, pbattribs);
        if (g_pbuffer == EGL_NO_SURFACE) {
            LOGE("eglCreatePbufferSurface failed: 0x%x", eglGetError());
            return 0;
        }
    }
    return eglMakeCurrent(g_display, g_pbuffer, g_pbuffer, g_context);
}

int egl_bridge_init(void) {
    if (g_display != EGL_NO_DISPLAY) return 1; /* 已初始化 */

    glfw_stub_platform_hooks hooks;
    memset(&hooks, 0, sizeof(hooks));
    hooks.get_proc_address = egl_bridge_get_proc_address;
    hooks.swap_buffers     = egl_bridge_hook_swap_buffers;
    hooks.swap_interval    = egl_bridge_hook_swap_interval;
    hooks.make_current     = egl_bridge_hook_make_current;
    glfw_stub_set_platform_hooks(&hooks);

    g_display = eglGetDisplay(EGL_DEFAULT_DISPLAY);
    if (g_display == EGL_NO_DISPLAY) {
        LOGE("eglGetDisplay failed");
        return 0;
    }
    if (!eglInitialize(g_display, NULL, NULL)) {
        LOGE("eglInitialize failed");
        return 0;
    }
    const char* exts = eglQueryString(g_display, EGL_EXTENSIONS);
    g_no_config_ctx = has_extension(exts, "EGL_KHR_no_config_context");
    g_surfaceless   = has_extension(exts, "EGL_KHR_surfaceless_context");

    g_config = pick_config(g_display);
    if (g_config != NULL) {
        g_have_config = 1;
    } else if (g_no_config_ctx) {
        LOGW("no window config, using EGL_NO_CONFIG_KHR (EGL_KHR_no_config_context)");
        g_config = EGL_NO_CONFIG_KHR;
        g_have_config = 0;
    } else {
        LOGE("eglChooseConfig: no suitable config and no_config_context unsupported");
        return 0;
    }
    g_context = create_context(g_display, g_config);
    if (g_context == EGL_NO_CONTEXT) {
        LOGE("eglCreateContext failed: 0x%x", eglGetError());
        return 0;
    }
    /* 初始解绑：驱动要求 context 创建线程持 current 的场景由 attach 兜底 */
    eglMakeCurrent(g_display, EGL_NO_SURFACE, EGL_NO_SURFACE, EGL_NO_CONTEXT);
    LOGI("egl_bridge init ok (no_config=%d surfaceless=%d)", g_no_config_ctx, g_surfaceless);
    return 1;
}

void egl_bridge_release(void) {
    if (g_display == EGL_NO_DISPLAY) return;
    eglMakeCurrent(g_display, EGL_NO_SURFACE, EGL_NO_SURFACE, EGL_NO_CONTEXT);
    if (g_surface != EGL_NO_SURFACE) {
        eglDestroySurface(g_display, g_surface);
        g_surface = EGL_NO_SURFACE;
    }
    if (g_pbuffer != EGL_NO_SURFACE) {
        eglDestroySurface(g_display, g_pbuffer);
        g_pbuffer = EGL_NO_SURFACE;
    }
    if (g_context != EGL_NO_CONTEXT) {
        eglDestroyContext(g_display, g_context);
        g_context = EGL_NO_CONTEXT;
    }
    eglTerminate(g_display);
    g_display = EGL_NO_DISPLAY;
    g_config = NULL;
    g_have_config = 0;
    g_window = NULL; /* ANativeWindow 由 detach 释放 */
}

int egl_bridge_attach_surface(JNIEnv* env, jobject surface, int width, int height) {
    if (g_display == EGL_NO_DISPLAY && !egl_bridge_init()) return 0;
    if (g_surface != EGL_NO_SURFACE || g_window) egl_bridge_detach_surface();

    ANativeWindow* win = ANativeWindow_fromSurface(env, surface);
    if (!win) {
        LOGE("ANativeWindow_fromSurface failed");
        return 0;
    }
    if (width > 0 && height > 0) {
        /* 复核缓冲几何：与 Java 侧声明的渲染分辨率一致（支持降采样） */
        ANativeWindow_setBuffersGeometry(win, width, height, WINDOW_FORMAT_RGBA_8888);
    }
    EGLSurface surf = eglCreateWindowSurface(g_display, g_config, (EGLNativeWindowType)win, NULL);
    if (surf == EGL_NO_SURFACE && !g_have_config && g_no_config_ctx) {
        /* 个别驱动窗口 surface 仍要求显式 config：用eglChooseConfig 任取一个窗口 config */
        EGLConfig cfgs[8]; EGLint n = 0;
        const EGLint attrs[] = { EGL_SURFACE_TYPE, EGL_WINDOW_BIT, EGL_NONE };
        if (eglChooseConfig(g_display, attrs, cfgs, 8, &n) && n > 0) {
            surf = eglCreateWindowSurface(g_display, cfgs[0], (EGLNativeWindowType)win, NULL);
            if (surf != EGL_NO_SURFACE) g_config = cfgs[0];
        }
    }
    if (surf == EGL_NO_SURFACE) {
        LOGE("eglCreateWindowSurface failed: 0x%x", eglGetError());
        ANativeWindow_release(win);
        return 0;
    }
    if (!eglMakeCurrent(g_display, surf, surf, g_context)) {
        LOGE("eglMakeCurrent failed: 0x%x", eglGetError());
        eglDestroySurface(g_display, surf);
        ANativeWindow_release(win);
        return 0;
    }
    g_window = win;
    g_surface = surf;
    g_width = width;
    g_height = height;
    eglSwapInterval(g_display, g_swap_interval);
    LOGI("surface attached: %dx%d", width, height);
    return 1;
}

void egl_bridge_detach_surface(void) {
    if (g_display != EGL_NO_DISPLAY) {
        /* 销毁 surface 前必须解绑当前线程，否则 eglDestroySurface 报 BUSY */
        eglMakeCurrent(g_display, EGL_NO_SURFACE, EGL_NO_SURFACE, EGL_NO_CONTEXT);
        if (g_surface != EGL_NO_SURFACE) {
            eglDestroySurface(g_display, g_surface);
            g_surface = EGL_NO_SURFACE;
        }
    }
    /* ANativeWindow_fromSurface 的引用必须配对 release，否则 Surface 永不释放 */
    if (g_window) {
        ANativeWindow_release(g_window);
        g_window = NULL;
    }
    g_width = 0;
    g_height = 0;
}

int egl_bridge_swap_buffers(void) {
    if (g_display == EGL_NO_DISPLAY || g_surface == EGL_NO_SURFACE) return 0;
    return eglSwapBuffers(g_display, g_surface) ? 1 : 0;
}

int egl_bridge_surface_size(int* width, int* height) {
    if (!g_window) return 0;
    if (width)  *width  = ANativeWindow_getWidth(g_window);
    if (height) *height = ANativeWindow_getHeight(g_window);
    return 1;
}

/* ---------- glfw_stub 平台钩子实现 ---------- */

void egl_bridge_hook_make_current(void* window) {
    /* v1 单窗口：window 非 NULL 时若尚无 surface，落在 headless surface 上，
     * 等 SurfaceChanged attach 真实窗口 surface；window 为 NULL 解绑。 */
    (void)window;
    if (g_display == EGL_NO_DISPLAY || g_context == EGL_NO_CONTEXT) return;
    if (g_surface != EGL_NO_SURFACE) return; /* 已有真实 surface，无需动作 */
    if (!ensure_headless_surface()) {
        LOGW("headless makeCurrent failed: 0x%x", eglGetError());
    }
}

void egl_bridge_hook_swap_buffers(void* window) {
    (void)window;
    egl_bridge_swap_buffers();
}

void egl_bridge_hook_swap_interval(int interval) {
    g_swap_interval = interval;
    if (g_display != EGL_NO_DISPLAY && g_surface != EGL_NO_SURFACE) {
        eglSwapInterval(g_display, interval);
    }
}
