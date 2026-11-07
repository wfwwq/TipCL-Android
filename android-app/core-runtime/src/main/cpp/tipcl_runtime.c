/* tipcl_runtime.c — JNI 导出层。
 *
 * Kotlin 侧方法与本文件的 Java_com_tipcl_android_core_runtime_* 导出一一对应，
 * 对照表见 core-runtime/NOTES.md。
 *
 * M2 回调生命周期策略：
 *  - native 侧对每个回调持一个全局引用；Set*Callback 返回"旧回调"时，
 *    旧全局引用先 NewLocalRef 转成局部引用再 DeleteGlobalRef，返回的局部引用
 *    在 JNI 返回边界被 JVM 提升为普通 Java 引用，由 Kotlin 侧持有或丢弃。
 *    这样旧/新引用绝不重复释放，Kotlin 侧无需手动 delete。
 *  - 回调线程：glfwPollEvents 在游戏主线程调用 Java 回调。JNIEnv 获取规范：
 *      1) GetEnv 命中（线程本来就 attached，如游戏主线程）→ 直接用；
 *      2) GetEnv 返回 JNI_EDETACHED → AttachCurrentThread，并把线程登记到
 *         pthread_key，其析构器在线程退出时 DetachCurrentThread。
 *         保证我们 attach 的线程一定被我们自己 detach，不泄漏 JavaVM 引用计数。
 *      3) 一次性 attach 的线程反复进出回调不会重复 attach（GetEnv 命中）。
 */
#include "egl_bridge.h"
#include "glfw_stub.h"

#include <jni.h>
#include <pthread.h>
#include <android/log.h>
#include <string.h>
#include <stdlib.h>

#define LOG_TAG "TipCL-Runtime"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO,  LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

/* ---------- JNI_OnLoad / JavaVM 缓存 ---------- */

static JavaVM* g_jvm = NULL;
static pthread_key_t g_attach_key;
static int g_attach_key_ready = 0;
static pthread_once_t g_attach_once = PTHREAD_ONCE_INIT;

static void detach_current_thread(void* unused) {
    (void)unused;
    JNIEnv* env = NULL;
    if (g_jvm && (*g_jvm)->GetEnv(g_jvm, (void**)&env, JNI_VERSION_1_6) == JNI_OK && env) {
        (*g_jvm)->DetachCurrentThread(g_jvm);
    }
}

static void make_attach_key(void) {
    g_attach_key_ready = (pthread_key_create(&g_attach_key, detach_current_thread) == 0);
}

static JavaVM* get_jvm(void) {
    return g_jvm;
}

/* 获取当前线程 JNIEnv；线程未 attached 则 attach 并登记自动 detach */
static JNIEnv* ensure_env(void) {
    if (!g_jvm) return NULL;
    JNIEnv* env = NULL;
    jint rc = (*g_jvm)->GetEnv(g_jvm, (void**)&env, JNI_VERSION_1_6);
    if (rc == JNI_OK) return env;
    if (rc != JNI_EDETACHED) return NULL;
    if ((*g_jvm)->AttachCurrentThread(g_jvm, &env, NULL) != JNI_OK) return NULL;
    pthread_once(&g_attach_once, make_attach_key);
    if (g_attach_key_ready) pthread_setspecific(g_attach_key, (void*)1);
    return env;
}

JNIEXPORT jint JNI_OnLoad(JavaVM* vm, void* reserved) {
    (void)reserved;
    g_jvm = vm;
    pthread_once(&g_attach_once, make_attach_key);
    LOGI("tipcl_runtime loaded (GLFW stub %d.%d, clean-room implementation)",
         GLFW_STUB_API_VERSION_MAJOR, GLFW_STUB_API_VERSION_MINOR);
    return JNI_VERSION_1_6;
}

/* ---------- Java 回调槽（全局引用 + invoke 方法句柄） ---------- */

typedef enum {
    CB_KEY = 0, CB_CHAR, CB_CURSOR_POS, CB_MOUSE_BUTTON, CB_SCROLL, CB_FB_SIZE, CB_ERROR, CB_COUNT
} cb_kind;

typedef struct {
    jobject   ref; /* 全局引用，NULL 表示未设置 */
    jmethodID mid; /* invoke 方法句柄（随类加载终身有效） */
} cb_slot;

static cb_slot g_cbs[CB_COUNT];

/* 各回调 invoke 签名（Kotlin 侧函数式接口必须一致，见 NOTES.md）：
 *   GLFWkeyfun            invoke(JIIII)V  （window 句柄, key, scancode, action, mods）
 *   GLFWcharfun           invoke(JI)V
 *   GLFWcursorposfun      invoke(JDD)V
 *   GLFWmousebuttonfun    invoke(JIII)V
 *   GLFWscrollfun         invoke(JDD)V
 *   GLFWframebuffersizefun invoke(JII)V
 *   GLFWerrorfun          invoke(ILjava/lang/String;)V
 */
static const char* k_cb_sig[CB_COUNT] = {
    "(JIIII)V", "(JI)V", "(JDD)V", "(JIII)V", "(JDD)V", "(JII)V",
    "(ILjava/lang/String;)V"
};

/* 设置回调：new_global 新全局引用（可为 NULL=清除）；
 * 返回旧回调的 Java 引用（局部引用在返回边界提升），旧全局引用被立即释放。 */
static jobject swap_callback(JNIEnv* env, cb_kind kind, jobject new_global) {
    cb_slot* slot = &g_cbs[kind];
    jobject old_java = NULL;
    if (slot->ref) {
        old_java = (*env)->NewLocalRef(env, slot->ref);
        (*env)->DeleteGlobalRef(env, slot->ref);
        slot->ref = NULL;
        slot->mid = NULL;
    }
    slot->ref = new_global;
    if (new_global) {
        jclass cls = (*env)->GetObjectClass(env, new_global);
        slot->mid = (*env)->GetMethodID(env, cls, "invoke", k_cb_sig[kind]);
        if (!slot->mid) {
            LOGE("callback %d: invoke(%s) not found", kind, k_cb_sig[kind]);
            (*env)->ExceptionClear(env);
        }
        (*env)->DeleteLocalRef(env, cls);
    }
    return old_java;
}

/* 分发器公共体：在 pollEvents 调用线程上执行 Java 回调 */
static void dispatch_cb(cb_kind kind, void* window, jboolean is_double, double d0, double d1,
                        jint i0, jint i1, jint i2, jint i3) {
    cb_slot* slot = &g_cbs[kind];
    (void)window; (void)is_double;
    if (!slot->ref || !slot->mid) return;
    JNIEnv* env = ensure_env();
    if (!env) return;
    /* v1 回调协议以窗口句柄 0 透传（单窗口模型）；M3 透传真实 handle */
    switch (kind) {
    case CB_KEY:
        (*env)->CallVoidMethod(env, slot->ref, slot->mid, (jlong)0, i0, i1, i2, i3);
        break;
    case CB_CHAR:
        (*env)->CallVoidMethod(env, slot->ref, slot->mid, (jlong)0, i0);
        break;
    case CB_CURSOR_POS:
        (*env)->CallVoidMethod(env, slot->ref, slot->mid, (jlong)0, d0, d1);
        break;
    case CB_MOUSE_BUTTON:
        (*env)->CallVoidMethod(env, slot->ref, slot->mid, (jlong)0, i0, i1, i2);
        break;
    case CB_SCROLL:
        (*env)->CallVoidMethod(env, slot->ref, slot->mid, (jlong)0, d0, d1);
        break;
    case CB_FB_SIZE:
        (*env)->CallVoidMethod(env, slot->ref, slot->mid, (jlong)0, i0, i1);
        break;
    default:
        break;
    }
    if ((*env)->ExceptionCheck(env)) {
        (*env)->ExceptionDescribe(env);
        (*env)->ExceptionClear(env);
    }
}

static void jni_key_bridge(void* window, int key, int scancode, int action, int mods) {
    dispatch_cb(CB_KEY, window, JNI_FALSE, 0, 0, key, scancode, action, mods);
}
static void jni_char_bridge(void* window, unsigned int codepoint) {
    dispatch_cb(CB_CHAR, window, JNI_FALSE, 0, 0, (jint)codepoint, 0, 0, 0);
}
static void jni_cursor_pos_bridge(void* window, double x, double y) {
    dispatch_cb(CB_CURSOR_POS, window, JNI_TRUE, x, y, 0, 0, 0, 0);
}
static void jni_mouse_button_bridge(void* window, int button, int action, int mods) {
    dispatch_cb(CB_MOUSE_BUTTON, window, JNI_FALSE, 0, 0, button, action, mods, 0);
}
static void jni_scroll_bridge(void* window, double xoff, double yoff) {
    dispatch_cb(CB_SCROLL, window, JNI_TRUE, xoff, yoff, 0, 0, 0, 0);
}
static void jni_framebuffer_size_bridge(void* window, int w, int h) {
    dispatch_cb(CB_FB_SIZE, window, JNI_FALSE, 0, 0, w, h, 0, 0);
}

/* ---------- SurfaceBridge ---------- */

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_SurfaceBridge_nativeOnSurfaceCreated(JNIEnv* env, jobject thiz, jobject surface) {
    (void)thiz;
    if (!egl_bridge_init()) {
        LOGE("egl_bridge_init failed on surfaceCreated");
        return;
    }
    /* 仅初始化 EGL；attach 延迟到 surfaceChanged 拿到尺寸 */
    (void)surface;
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_SurfaceBridge_nativeOnSurfaceChanged(JNIEnv* env, jobject thiz, jobject surface, jint width, jint height) {
    (void)thiz;
    if (!egl_bridge_attach_surface(env, surface, width, height)) {
        LOGE("attach_surface failed (%dx%d)", width, height);
    }
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_SurfaceBridge_nativeOnSurfaceDestroyed(JNIEnv* env, jobject thiz) {
    (void)env;
    (void)thiz;
    egl_bridge_detach_surface();
}

JNIEXPORT jboolean JNICALL
Java_com_tipcl_android_core_runtime_SurfaceBridge_nativeSwapBuffers(JNIEnv* env, jobject thiz) {
    (void)env;
    (void)thiz;
    return egl_bridge_swap_buffers() ? JNI_TRUE : JNI_FALSE;
}

/* ---------- GlfwFacade ---------- */

JNIEXPORT jint JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwInit(JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
    return glfwInit();
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwTerminate(JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
    /* 清空所有回调全局引用（glfwTerminate 会销毁全部窗口） */
    for (int k = 0; k < CB_COUNT; k++) {
        if (g_cbs[k].ref && env) (*env)->DeleteGlobalRef(env, g_cbs[k].ref);
        g_cbs[k].ref = NULL;
        g_cbs[k].mid = NULL;
    }
    glfwTerminate();
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwInitHint(JNIEnv* env, jclass clazz, jint hint, jint value) {
    (void)env; (void)clazz;
    glfwInitHint(hint, value);
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwDefaultWindowHints(JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
    glfwDefaultWindowHints();
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwWindowHint(JNIEnv* env, jclass clazz, jint hint, jint value) {
    (void)env; (void)clazz;
    glfwWindowHint(hint, value);
}

JNIEXPORT jlong JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwCreateWindow(JNIEnv* env, jclass clazz, jint width, jint height, jstring title, jlong monitor, jlong share) {
    (void)env; (void)clazz; (void)title; (void)monitor; (void)share;
    /* v1：标题/monitor/share 均忽略 */
    return (jlong)(uintptr_t)glfwCreateWindow(width, height, NULL, NULL, NULL);
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwDestroyWindow(JNIEnv* env, jclass clazz, jlong window) {
    (void)env; (void)clazz;
    glfwDestroyWindow((void*)(uintptr_t)window);
}

JNIEXPORT jint JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwWindowShouldClose(JNIEnv* env, jclass clazz, jlong window) {
    (void)env; (void)clazz;
    return glfwWindowShouldClose((void*)(uintptr_t)window);
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetWindowShouldClose(JNIEnv* env, jclass clazz, jlong window, jint value) {
    (void)env; (void)clazz;
    glfwSetWindowShouldClose((void*)(uintptr_t)window, value);
}

JNIEXPORT jintArray JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwGetFramebufferSize(JNIEnv* env, jclass clazz, jlong window) {
    (void)clazz;
    int w = 0, h = 0;
    glfwGetFramebufferSize((void*)(uintptr_t)window, &w, &h);
    jintArray arr = (*env)->NewIntArray(env, 2);
    jint tmp[2] = { w, h };
    (*env)->SetIntArrayRegion(env, arr, 0, 2, tmp);
    return arr;
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwMakeContextCurrent(JNIEnv* env, jclass clazz, jlong window) {
    (void)env; (void)clazz;
    glfwMakeContextCurrent((void*)(uintptr_t)window);
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSwapInterval(JNIEnv* env, jclass clazz, jint interval) {
    (void)env; (void)clazz;
    glfwSwapInterval(interval);
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSwapBuffers(JNIEnv* env, jclass clazz, jlong window) {
    (void)env; (void)clazz;
    glfwSwapBuffers((void*)(uintptr_t)window);
}

JNIEXPORT jint JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwExtensionSupported(JNIEnv* env, jclass clazz, jstring extension) {
    (void)clazz;
    const char* ext = extension ? (*env)->GetStringUTFChars(env, extension, NULL) : NULL;
    int r = glfwExtensionSupported(ext);
    if (ext) (*env)->ReleaseStringUTFChars(env, extension, ext);
    return r;
}

JNIEXPORT jlong JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwGetProcAddress(JNIEnv* env, jclass clazz, jstring proc) {
    (void)clazz;
    if (!proc) return 0;
    const char* name = (*env)->GetStringUTFChars(env, proc, NULL);
    if (!name) return 0;
    void* fn = glfwGetProcAddress(name);
    (*env)->ReleaseStringUTFChars(env, proc, name);
    return (jlong)(intptr_t)fn;
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwPollEvents(JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
    glfwPollEvents();
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwWaitEvents(JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
    glfwWaitEvents();
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetInputMode(JNIEnv* env, jclass clazz, jlong window, jint mode, jint value) {
    (void)env; (void)clazz;
    glfwSetInputMode((void*)(uintptr_t)window, mode, value);
}

JNIEXPORT jint JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwGetInputMode(JNIEnv* env, jclass clazz, jlong window, jint mode) {
    (void)env; (void)clazz;
    return glfwGetInputMode((void*)(uintptr_t)window, mode);
}

JNIEXPORT jint JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwGetKey(JNIEnv* env, jclass clazz, jlong window, jint key) {
    (void)env; (void)clazz;
    return glfwGetKey((void*)(uintptr_t)window, key);
}

JNIEXPORT jint JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwGetMouseButton(JNIEnv* env, jclass clazz, jlong window, jint button) {
    (void)env; (void)clazz;
    return glfwGetMouseButton((void*)(uintptr_t)window, button);
}

JNIEXPORT jdoubleArray JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwGetCursorPos(JNIEnv* env, jclass clazz, jlong window) {
    (void)clazz;
    double x = 0, y = 0;
    glfwGetCursorPos((void*)(uintptr_t)window, &x, &y);
    jdoubleArray arr = (*env)->NewDoubleArray(env, 2);
    jdouble tmp[2] = { x, y };
    (*env)->SetDoubleArrayRegion(env, arr, 0, 2, tmp);
    return arr;
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetCursorPos(JNIEnv* env, jclass clazz, jlong window, jdouble xpos, jdouble ypos) {
    (void)env; (void)clazz;
    glfwSetCursorPos((void*)(uintptr_t)window, xpos, ypos);
}

/* --- 回调注册：全局引用创建/替换/清除 + 旧引用返回语义 --- */

JNIEXPORT jobject JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetKeyCallback(JNIEnv* env, jclass clazz, jlong window, jobject cb) {
    (void)clazz;
    jobject new_global = cb ? (*env)->NewGlobalRef(env, cb) : NULL;
    jobject old = swap_callback(env, CB_KEY, new_global);
    glfwSetKeyCallback((void*)(uintptr_t)window, new_global ? jni_key_bridge : NULL);
    return old;
}

JNIEXPORT jobject JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetCharCallback(JNIEnv* env, jclass clazz, jlong window, jobject cb) {
    (void)clazz;
    jobject new_global = cb ? (*env)->NewGlobalRef(env, cb) : NULL;
    jobject old = swap_callback(env, CB_CHAR, new_global);
    glfwSetCharCallback((void*)(uintptr_t)window, new_global ? jni_char_bridge : NULL);
    return old;
}

JNIEXPORT jobject JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetCursorPosCallback(JNIEnv* env, jclass clazz, jlong window, jobject cb) {
    (void)clazz;
    jobject new_global = cb ? (*env)->NewGlobalRef(env, cb) : NULL;
    jobject old = swap_callback(env, CB_CURSOR_POS, new_global);
    glfwSetCursorPosCallback((void*)(uintptr_t)window, new_global ? jni_cursor_pos_bridge : NULL);
    return old;
}

JNIEXPORT jobject JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetMouseButtonCallback(JNIEnv* env, jclass clazz, jlong window, jobject cb) {
    (void)clazz;
    jobject new_global = cb ? (*env)->NewGlobalRef(env, cb) : NULL;
    jobject old = swap_callback(env, CB_MOUSE_BUTTON, new_global);
    glfwSetMouseButtonCallback((void*)(uintptr_t)window, new_global ? jni_mouse_button_bridge : NULL);
    return old;
}

JNIEXPORT jobject JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetScrollCallback(JNIEnv* env, jclass clazz, jlong window, jobject cb) {
    (void)clazz;
    jobject new_global = cb ? (*env)->NewGlobalRef(env, cb) : NULL;
    jobject old = swap_callback(env, CB_SCROLL, new_global);
    glfwSetScrollCallback((void*)(uintptr_t)window, new_global ? jni_scroll_bridge : NULL);
    return old;
}

JNIEXPORT jobject JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetFramebufferSizeCallback(JNIEnv* env, jclass clazz, jlong window, jobject cb) {
    (void)clazz;
    jobject new_global = cb ? (*env)->NewGlobalRef(env, cb) : NULL;
    jobject old = swap_callback(env, CB_FB_SIZE, new_global);
    glfwSetFramebufferSizeCallback((void*)(uintptr_t)window, new_global ? jni_framebuffer_size_bridge : NULL);
    return old;
}

JNIEXPORT jobject JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetErrorCallback(JNIEnv* env, jclass clazz, jobject cb) {
    (void)clazz;
    /* 错误回调无窗口句柄；Java 侧 invoke(I, String)V。native 侧错误（队列溢出等）
     * 目前只在glfw_stub 内部走 C 错误回调；Java 侧设置时记录全局引用，M3 接入。 */
    jobject new_global = cb ? (*env)->NewGlobalRef(env, cb) : NULL;
    return swap_callback(env, CB_ERROR, new_global);
}

/* ---------- 剪贴板 / 时间 / 显示器 ---------- */

JNIEXPORT jstring JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwGetClipboardString(JNIEnv* env, jclass clazz, jlong window) {
    (void)clazz;
    const char* s = glfwGetClipboardString((void*)(uintptr_t)window);
    return s ? (*env)->NewStringUTF(env, s) : NULL;
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetClipboardString(JNIEnv* env, jclass clazz, jlong window, jstring text) {
    (void)clazz;
    const char* c = text ? (*env)->GetStringUTFChars(env, text, NULL) : NULL;
    glfwSetClipboardString((void*)(uintptr_t)window, c);
    if (c) (*env)->ReleaseStringUTFChars(env, text, c);
}

JNIEXPORT jdouble JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwGetTime(JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
    return glfwGetTime();
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwSetTime(JNIEnv* env, jclass clazz, jdouble time) {
    (void)env; (void)clazz;
    glfwSetTime(time);
}

JNIEXPORT jlong JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwGetPrimaryMonitor(JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
    return (jlong)(uintptr_t)glfwGetPrimaryMonitor();
}

JNIEXPORT jintArray JNICALL
Java_com_tipcl_android_core_runtime_GlfwFacade_glfwGetVideoMode(JNIEnv* env, jclass clazz, jlong monitor) {
    (void)clazz;
    int count = 0;
    const int* mode = glfwGetVideoMode((void*)(uintptr_t)monitor, &count);
    if (!mode) return NULL;
    jintArray arr = (*env)->NewIntArray(env, count);
    (*env)->SetIntArrayRegion(env, arr, 0, count, mode);
    return arr;
}

/* ---------- InputInjector ---------- */

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_InputInjector_nativePostKeyEvent(JNIEnv* env, jobject thiz, jint key, jint scancode, jint action, jint mods) {
    (void)env; (void)thiz;
    glfw_stub_event ev;
    memset(&ev, 0, sizeof(ev));
    ev.type = GLFW_STUB_EVENT_KEY;
    ev.i0 = key; ev.i1 = scancode; ev.i2 = action; ev.i3 = mods;
    glfw_stub_push_event(&ev);
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_InputInjector_nativePostCharEvent(JNIEnv* env, jobject thiz, jint codepoint) {
    (void)env; (void)thiz;
    glfw_stub_event ev;
    memset(&ev, 0, sizeof(ev));
    ev.type = GLFW_STUB_EVENT_CHAR;
    ev.i0 = codepoint;
    glfw_stub_push_event(&ev);
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_InputInjector_nativePostCursorPos(JNIEnv* env, jobject thiz, jdouble x, jdouble y) {
    (void)env; (void)thiz;
    glfw_stub_event ev;
    memset(&ev, 0, sizeof(ev));
    ev.type = GLFW_STUB_EVENT_CURSOR_POS;
    ev.d0 = x; ev.d1 = y;
    glfw_stub_push_event(&ev);
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_InputInjector_nativePostMouseButton(JNIEnv* env, jobject thiz, jint button, jint action, jint mods) {
    (void)env; (void)thiz;
    glfw_stub_event ev;
    memset(&ev, 0, sizeof(ev));
    ev.type = GLFW_STUB_EVENT_MOUSE_BUTTON;
    ev.i0 = button; ev.i1 = action; ev.i2 = mods;
    glfw_stub_push_event(&ev);
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_InputInjector_nativePostScroll(JNIEnv* env, jobject thiz, jdouble xoffset, jdouble yoffset) {
    (void)env; (void)thiz;
    glfw_stub_event ev;
    memset(&ev, 0, sizeof(ev));
    ev.type = GLFW_STUB_EVENT_SCROLL;
    ev.d0 = xoffset; ev.d1 = yoffset;
    glfw_stub_push_event(&ev);
}

JNIEXPORT void JNICALL
Java_com_tipcl_android_core_runtime_InputInjector_nativePostFramebufferSize(JNIEnv* env, jobject thiz, jint width, jint height) {
    (void)env; (void)thiz;
    glfw_stub_event ev;
    memset(&ev, 0, sizeof(ev));
    ev.type = GLFW_STUB_EVENT_FRAMEBUFFER_SIZE;
    ev.i0 = width; ev.i1 = height;
    glfw_stub_push_event(&ev);
}
