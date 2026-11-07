/* glfw_stub.c — 自研 GLFW 兼容桩实现。
 *
 * 设计：
 * - 窗口：固定槽位数组，句柄 = slot+1（0 = NULL）；glfwDestroyWindow 回收槽位供复用。
 * - 事件：SPSC 环形缓冲（InputInjector 线程生产，游戏主线程 glfwPollEvents 消费）。
 *   光标移动事件在入队时与队尾连续光标事件合并（只留最新坐标），防止高频触摸
 *   冲掉按键/点击事件；队列满时丢弃最旧事件并触发错误回调（节流）。
 * - 输入模式：GLFW_CURSOR 支持 NORMAL/HIDDEN/DISABLED。DISABLED 模式下把绝对坐标
 *   差分累积为"虚拟光标位置"上报（等价相对运动），支持 GLFW_RAW_MOUSE_MOTION 标志
 *   （v1 中 raw 与普通差分共用绝对差分源，区分留给 core-input 联动）。
 * - 平台钩子：EGL 相关（GetProcAddress/SwapBuffers/SwapInterval/MakeCurrent）由
 *   egl_bridge 在 egl_bridge_init 时注入；host 自检时钩子为 NULL，走安全默认。
 */
#include "glfw_stub.h"

#include <pthread.h>
#include <string.h>
#include <stdio.h>
#include <time.h>

#define GLFW_STUB_MAX_WINDOWS    4
#define GLFW_STUB_EVENT_QUEUE_SZ 512
#define GLFW_STUB_KEY_COUNT      349 /* GLFW_KEY_LAST + 1 */
#define GLFW_STUB_MOUSE_COUNT    8

#define STUB_ERR_QUEUE_FULL    0x00010001
#define STUB_ERR_WINDOW_LIMIT  0x00010003

typedef struct {
    int in_use;
    uintptr_t handle; /* = slot+1，回调透传给 JNI 层定位 Kotlin 窗口对象 */
    int should_close;
    int width, height;
    int fb_width, fb_height;

    /* 输入模式状态机 */
    int cursor_mode;      /* GLFW_CURSOR_NORMAL / HIDDEN / DISABLED */
    int raw_motion;       /* GLFW_RAW_MOUSE_MOTION 布尔 */

    /* 光标：raw 为注入端绝对坐标；virt 为上报给游戏的坐标。
     * DISABLED 模式下 virt = virt + (raw - last_raw)，即相对差分累积。 */
    int has_last_raw;
    double virt_x, virt_y;
    double last_raw_x, last_raw_y;

    GLFWkeyfun            key_cb;
    GLFWcharfun           char_cb;
    GLFWcursorposfun      cursor_pos_cb;
    GLFWmousebuttonfun    mouse_button_cb;
    GLFWscrollfun         scroll_cb;
    GLFWframebuffersizefun fb_size_cb;

    unsigned char key_state[GLFW_STUB_KEY_COUNT];
    unsigned char mouse_state[GLFW_STUB_MOUSE_COUNT];
} glfw_stub_window;

static glfw_stub_window g_windows[GLFW_STUB_MAX_WINDOWS];

static GLFWerrorfun g_error_cb;

static glfw_stub_platform_hooks g_hooks;

/* 事件环形缓冲（单生产者单消费者；锁仅保护并发可见性） */
static glfw_stub_event g_event_queue[GLFW_STUB_EVENT_QUEUE_SZ];
static volatile size_t g_event_head = 0; /* 生产者写 */
static volatile size_t g_event_tail = 0; /* 消费者写 */
static pthread_mutex_t g_stub_mutex = PTHREAD_MUTEX_INITIALIZER;
static int g_overflow_reported = 0; /* 溢出错误回调节流 */

static unsigned char g_key_state[GLFW_STUB_KEY_COUNT];
static unsigned char g_mouse_state[GLFW_STUB_MOUSE_COUNT];
static double g_cursor_x = 0.0, g_cursor_y = 0.0; /* 最近一次 raw 绝对坐标 */
static int g_cursor_has_raw = 0;

static int g_window_hints[16]; /* 少量 hint 槽位，按 hint 值线性存取 */

/* ---------- 内部工具 ---------- */

static glfw_stub_window* win_from_handle(void* handle) {
    uintptr_t h = (uintptr_t)handle;
    if (h == 0 || h > (uintptr_t)GLFW_STUB_MAX_WINDOWS) return NULL;
    glfw_stub_window* w = &g_windows[h - 1];
    return w->in_use ? w : NULL;
}

static void report_error(int code, const char* msg) {
    if (g_error_cb) g_error_cb(code, msg);
}

/* ---------- 桩内部状态 API ---------- */

void glfw_stub_reset(void) {
    pthread_mutex_lock(&g_stub_mutex);
    memset(g_windows, 0, sizeof(g_windows));
    memset(g_key_state, 0, sizeof(g_key_state));
    memset(g_mouse_state, 0, sizeof(g_mouse_state));
    memset(g_window_hints, 0, sizeof(g_window_hints));
    g_event_head = 0;
    g_event_tail = 0;
    g_overflow_reported = 0;
    g_cursor_x = 0.0;
    g_cursor_y = 0.0;
    g_cursor_has_raw = 0;
    pthread_mutex_unlock(&g_stub_mutex);
}

/* 光标事件合并：仅当队尾（最后一个事件）也是光标事件时原位覆盖，
 * 保证 move 与 click/keydown 的相对顺序不被破坏。 */
void glfw_stub_push_event(const glfw_stub_event* ev) {
    if (!ev || ev->type == GLFW_STUB_EVENT_NONE) return;
    pthread_mutex_lock(&g_stub_mutex);
    if (ev->type == GLFW_STUB_EVENT_CURSOR_POS && g_event_head != g_event_tail) {
        size_t last = (g_event_head == 0) ? GLFW_STUB_EVENT_QUEUE_SZ - 1 : g_event_head - 1;
        if (g_event_queue[last].type == GLFW_STUB_EVENT_CURSOR_POS) {
            g_event_queue[last] = *ev;
            pthread_mutex_unlock(&g_stub_mutex);
            return;
        }
    }
    size_t next = (g_event_head + 1) % GLFW_STUB_EVENT_QUEUE_SZ;
    if (next == g_event_tail) {
        /* 溢出：丢最旧事件腾出空间，错误回调按进程生命周期只报一次（防日志刷屏） */
        g_event_tail = (g_event_tail + 1) % GLFW_STUB_EVENT_QUEUE_SZ;
        if (!g_overflow_reported) {
            g_overflow_reported = 1;
            pthread_mutex_unlock(&g_stub_mutex);
            report_error(STUB_ERR_QUEUE_FULL, "glfw_stub: event queue overflow, oldest event dropped");
            pthread_mutex_lock(&g_stub_mutex);
        }
    }
    g_event_queue[g_event_head] = *ev;
    g_event_head = (g_event_head + 1) % GLFW_STUB_EVENT_QUEUE_SZ;
    pthread_mutex_unlock(&g_stub_mutex);
}

int glfw_stub_pop_event(glfw_stub_event* out) {
    pthread_mutex_lock(&g_stub_mutex);
    if (g_event_tail == g_event_head) {
        pthread_mutex_unlock(&g_stub_mutex);
        return 0;
    }
    *out = g_event_queue[g_event_tail];
    g_event_tail = (g_event_tail + 1) % GLFW_STUB_EVENT_QUEUE_SZ;
    pthread_mutex_unlock(&g_stub_mutex);
    return 1;
}

void glfw_stub_set_window_size(int w, int h) {
    pthread_mutex_lock(&g_stub_mutex);
    for (int i = 0; i < GLFW_STUB_MAX_WINDOWS; i++) {
        if (!g_windows[i].in_use) continue;
        g_windows[i].width = w;
        g_windows[i].height = h;
        g_windows[i].fb_width = w;
        g_windows[i].fb_height = h;
    }
    pthread_mutex_unlock(&g_stub_mutex);
}

int glfw_stub_window_count(void) {
    pthread_mutex_lock(&g_stub_mutex);
    int n = 0;
    for (int i = 0; i < GLFW_STUB_MAX_WINDOWS; i++)
        if (g_windows[i].in_use) n++;
    pthread_mutex_unlock(&g_stub_mutex);
    return n;
}

unsigned char glfw_stub_get_key_state(int key) {
    if (key < 0 || key >= GLFW_STUB_KEY_COUNT) return GLFW_RELEASE;
    return g_key_state[key];
}

unsigned char glfw_stub_get_mouse_button_state(int button) {
    if (button < 0 || button >= GLFW_STUB_MOUSE_COUNT) return GLFW_RELEASE;
    return g_mouse_state[button];
}

void glfw_stub_get_cursor_pos(double* x, double* y) {
    if (x) *x = g_cursor_x;
    if (y) *y = g_cursor_y;
}

/* ---------- 平台钩子 ---------- */

void glfw_stub_set_platform_hooks(const glfw_stub_platform_hooks* hooks) {
    if (hooks) {
        g_hooks = *hooks;
    } else {
        memset(&g_hooks, 0, sizeof(g_hooks));
    }
}

const glfw_stub_platform_hooks* glfw_stub_get_platform_hooks(void) {
    return &g_hooks;
}

/* ---------- GLFW API 桩实现 ---------- */

/* 窗口/上下文 */

void glfwDefaultWindowHints(void) {
    memset(g_window_hints, 0, sizeof(g_window_hints));
}

void glfwWindowHint(int hint, int value) {
    /* 槽位简化：hint 值对槽数取模。v1 只消费 CLIENT_API / 版本号。 */
    g_window_hints[hint % 16] = value;
}

int glfwInit(void) {
    /* Android 虚拟平台：无需平台探测，直接成功 */
    return GLFW_TRUE;
}

void glfwTerminate(void) {
    glfw_stub_reset();
}

void glfwInitHint(int hint, int value) {
    (void)hint;
    (void)value; /* v1 不需要 */
}

void* glfwCreateWindow(int width, int height, const char* title, void* monitor, void* share) {
    (void)title;
    (void)monitor; /* v1 不支持全屏 */
    (void)share;   /* v1 不支持共享上下文 */
    pthread_mutex_lock(&g_stub_mutex);
    int slot = -1;
    for (int i = 0; i < GLFW_STUB_MAX_WINDOWS; i++) {
        if (!g_windows[i].in_use) { slot = i; break; }
    }
    if (slot < 0) {
        pthread_mutex_unlock(&g_stub_mutex);
        report_error(STUB_ERR_WINDOW_LIMIT, "glfw_stub: window limit reached");
        return NULL;
    }
    glfw_stub_window* w = &g_windows[slot];
    memset(w, 0, sizeof(*w));
    w->in_use = 1;
    w->handle = (uintptr_t)slot + 1;
    w->width = width > 0 ? width : 1;
    w->height = height > 0 ? height : 1;
    w->fb_width = w->width;
    w->fb_height = w->height;
    w->cursor_mode = GLFW_CURSOR_NORMAL;
    void* handle = (void*)w->handle;
    pthread_mutex_unlock(&g_stub_mutex);
    return handle;
}

void glfwDestroyWindow(void* window) {
    glfw_stub_window* w = win_from_handle(window);
    if (!w) return;
    pthread_mutex_lock(&g_stub_mutex);
    /* 清空回调后整体回收槽位；下次 glfwCreateWindow 复用该槽位 */
    memset(w, 0, sizeof(*w));
    pthread_mutex_unlock(&g_stub_mutex);
}

int glfwWindowShouldClose(void* window) {
    glfw_stub_window* w = win_from_handle(window);
    return w ? w->should_close : GLFW_FALSE;
}

void glfwSetWindowShouldClose(void* window, int value) {
    glfw_stub_window* w = win_from_handle(window);
    if (w) w->should_close = value ? GLFW_TRUE : GLFW_FALSE;
}

void glfwGetFramebufferSize(void* window, int* width, int* height) {
    glfw_stub_window* w = win_from_handle(window);
    if (w && width)  *width = w->fb_width;
    if (w && height) *height = w->fb_height;
}

void glfwMakeContextCurrent(void* window) {
    /* EGL 接线由 egl_bridge 注入的钩子完成；host 上为空操作 */
    if (g_hooks.make_current) g_hooks.make_current(window);
}

void glfwSwapInterval(int interval) {
    if (g_hooks.swap_interval) g_hooks.swap_interval(interval);
}

void glfwSwapBuffers(void* window) {
    if (g_hooks.swap_buffers) g_hooks.swap_buffers(window);
}

int glfwExtensionSupported(const char* extension) {
    /* GL ES 上下文下 GLFW 平台扩展均不支持 */
    (void)extension;
    return GLFW_FALSE;
}

void* glfwGetProcAddress(const char* procname) {
    /* LWJGL 解析 GL 符号的命门：eglGetProcAddress 优先 + dlsym 回退
     * （egl_bridge.c 注入实现）。 */
    if (!procname || !*procname) return NULL;
    if (g_hooks.get_proc_address) return g_hooks.get_proc_address(procname);
    return NULL;
}

/* 事件循环 */

/* 光标事件分发：DISABLED 模式做差分累积 */
static void dispatch_cursor_event(glfw_stub_window* w, double x, double y) {
    double report_x, report_y;
    if (w->cursor_mode == GLFW_CURSOR_DISABLED) {
        if (!w->has_last_raw) {
            w->last_raw_x = x;
            w->last_raw_y = y;
            w->has_last_raw = 1;
            /* 首帧校准：只记录基准，不上报跳变 */
            return;
        }
        w->virt_x += (x - w->last_raw_x);
        w->virt_y += (y - w->last_raw_y);
        w->last_raw_x = x;
        w->last_raw_y = y;
        report_x = w->virt_x;
        report_y = w->virt_y;
    } else {
        w->last_raw_x = x;
        w->last_raw_y = y;
        w->virt_x = x;
        w->virt_y = y;
        report_x = x;
        report_y = y;
    }
    if (w->cursor_pos_cb)
        w->cursor_pos_cb(w, report_x, report_y);
}

void glfwPollEvents(void) {
    glfw_stub_event ev;
    while (glfw_stub_pop_event(&ev)) {
        switch (ev.type) {
        case GLFW_STUB_EVENT_KEY:
            if (ev.i0 >= 0 && ev.i0 < GLFW_STUB_KEY_COUNT)
                g_key_state[ev.i0] = (unsigned char)ev.i2;
            for (int i = 0; i < GLFW_STUB_MAX_WINDOWS; i++) {
                glfw_stub_window* w = &g_windows[i];
                if (w->in_use && w->key_cb)
                    w->key_cb(w, ev.i0, ev.i1, ev.i2, ev.i3);
            }
            break;
        case GLFW_STUB_EVENT_CHAR:
            for (int i = 0; i < GLFW_STUB_MAX_WINDOWS; i++) {
                glfw_stub_window* w = &g_windows[i];
                if (w->in_use && w->char_cb)
                    w->char_cb(w, (unsigned int)ev.i0);
            }
            break;
        case GLFW_STUB_EVENT_CURSOR_POS:
            g_cursor_x = ev.d0;
            g_cursor_y = ev.d1;
            g_cursor_has_raw = 1;
            for (int i = 0; i < GLFW_STUB_MAX_WINDOWS; i++) {
                glfw_stub_window* w = &g_windows[i];
                if (w->in_use)
                    dispatch_cursor_event(w, ev.d0, ev.d1);
            }
            break;
        case GLFW_STUB_EVENT_MOUSE_BUTTON:
            if (ev.i0 >= 0 && ev.i0 < GLFW_STUB_MOUSE_COUNT)
                g_mouse_state[ev.i0] = (unsigned char)ev.i1;
            for (int i = 0; i < GLFW_STUB_MAX_WINDOWS; i++) {
                glfw_stub_window* w = &g_windows[i];
                if (w->in_use && w->mouse_button_cb)
                    w->mouse_button_cb(w, ev.i0, ev.i1, ev.i2);
            }
            break;
        case GLFW_STUB_EVENT_SCROLL:
            for (int i = 0; i < GLFW_STUB_MAX_WINDOWS; i++) {
                glfw_stub_window* w = &g_windows[i];
                if (w->in_use && w->scroll_cb)
                    w->scroll_cb(w, ev.d0, ev.d1);
            }
            break;
        case GLFW_STUB_EVENT_FRAMEBUFFER_SIZE:
            glfw_stub_set_window_size(ev.i0, ev.i1);
            for (int i = 0; i < GLFW_STUB_MAX_WINDOWS; i++) {
                glfw_stub_window* w = &g_windows[i];
                if (w->in_use && w->fb_size_cb)
                    w->fb_size_cb(w, ev.i0, ev.i1);
            }
            break;
        default:
            break;
        }
    }
}

void glfwWaitEvents(void) {
    /* v1 简化：与 pollEvents 等价（游戏帧率由自身控制）；条件等待 TODO(M3) */
    glfwPollEvents();
}

/* 输入查询与模式 */

void glfwSetInputMode(void* window, int mode, int value) {
    glfw_stub_window* w = win_from_handle(window);
    if (!w) return;
    switch (mode) {
    case GLFW_CURSOR:
        if (value != GLFW_CURSOR_NORMAL && value != GLFW_CURSOR_HIDDEN &&
            value != GLFW_CURSOR_DISABLED) {
            report_error(0x00010000, "glfw_stub: invalid cursor mode");
            return;
        }
        if (w->cursor_mode == GLFW_CURSOR_DISABLED && value != GLFW_CURSOR_DISABLED) {
            /* 退出捕获：虚拟位置对齐回最近绝对坐标 */
            w->virt_x = g_cursor_x;
            w->virt_y = g_cursor_y;
            w->has_last_raw = 0;
        }
        if (value == GLFW_CURSOR_DISABLED && w->cursor_mode != GLFW_CURSOR_DISABLED) {
            /* 进入捕获：以当前绝对坐标为差分基准，下一事件起报相对增量 */
            w->has_last_raw = 0;
            w->virt_x = g_cursor_x;
            w->virt_y = g_cursor_y;
        }
        w->cursor_mode = value;
        break;
    case GLFW_RAW_MOUSE_MOTION:
        /* v1：注入端只有绝对坐标流，raw 标志仅记录；差分源相同。
         * core-input 若提供原始相对流，M3 在此切换差分来源。 */
        w->raw_motion = value ? GLFW_TRUE : GLFW_FALSE;
        break;
    case GLFW_STICKY_KEYS:
    case GLFW_STICKY_MOUSE_BUTTONS:
    case GLFW_LOCK_KEY_MODS:
        /* v1 不实现粘滞键（Minecraft 不依赖） */
        break;
    default:
        report_error(0x00010000, "glfw_stub: unsupported input mode");
        break;
    }
}

int glfwGetInputMode(void* window, int mode) {
    glfw_stub_window* w = win_from_handle(window);
    if (!w) return GLFW_FALSE;
    switch (mode) {
    case GLFW_CURSOR:           return w->cursor_mode;
    case GLFW_RAW_MOUSE_MOTION: return w->raw_motion;
    default:                    return GLFW_FALSE;
    }
}

int glfwGetKey(void* window, int key) {
    (void)window;
    return glfw_stub_get_key_state(key);
}

int glfwGetMouseButton(void* window, int button) {
    (void)window;
    return glfw_stub_get_mouse_button_state(button);
}

void glfwGetCursorPos(void* window, double* xpos, double* ypos) {
    /* DISABLED 模式返回虚拟（相对累积）坐标，与回调上报一致 */
    glfw_stub_window* w = win_from_handle(window);
    if (w && w->cursor_mode == GLFW_CURSOR_DISABLED) {
        if (xpos) *xpos = w->virt_x;
        if (ypos) *ypos = w->virt_y;
    } else {
        if (xpos) *xpos = g_cursor_x;
        if (ypos) *ypos = g_cursor_y;
    }
}

void glfwSetCursorPos(void* window, double xpos, double ypos) {
    /* 规范：直接设置光标位置；DISABLED 模式下重置差分基准避免假跳变 */
    glfw_stub_window* w = win_from_handle(window);
    g_cursor_x = xpos;
    g_cursor_y = ypos;
    g_cursor_has_raw = 1;
    if (w) {
        w->virt_x = xpos;
        w->virt_y = ypos;
        w->has_last_raw = 1;
        w->last_raw_x = xpos;
        w->last_raw_y = ypos;
    }
}

/* 回调注册 */

GLFWkeyfun glfwSetKeyCallback(void* window, GLFWkeyfun cb) {
    glfw_stub_window* w = win_from_handle(window);
    if (!w) return NULL;
    GLFWkeyfun old = w->key_cb;
    w->key_cb = cb;
    return old;
}

GLFWcharfun glfwSetCharCallback(void* window, GLFWcharfun cb) {
    glfw_stub_window* w = win_from_handle(window);
    if (!w) return NULL;
    GLFWcharfun old = w->char_cb;
    w->char_cb = cb;
    return old;
}

GLFWcursorposfun glfwSetCursorPosCallback(void* window, GLFWcursorposfun cb) {
    glfw_stub_window* w = win_from_handle(window);
    if (!w) return NULL;
    GLFWcursorposfun old = w->cursor_pos_cb;
    w->cursor_pos_cb = cb;
    return old;
}

GLFWmousebuttonfun glfwSetMouseButtonCallback(void* window, GLFWmousebuttonfun cb) {
    glfw_stub_window* w = win_from_handle(window);
    if (!w) return NULL;
    GLFWmousebuttonfun old = w->mouse_button_cb;
    w->mouse_button_cb = cb;
    return old;
}

GLFWscrollfun glfwSetScrollCallback(void* window, GLFWscrollfun cb) {
    glfw_stub_window* w = win_from_handle(window);
    if (!w) return NULL;
    GLFWscrollfun old = w->scroll_cb;
    w->scroll_cb = cb;
    return old;
}

GLFWframebuffersizefun glfwSetFramebufferSizeCallback(void* window, GLFWframebuffersizefun cb) {
    glfw_stub_window* w = win_from_handle(window);
    if (!w) return NULL;
    GLFWframebuffersizefun old = w->fb_size_cb;
    w->fb_size_cb = cb;
    return old;
}

GLFWerrorfun glfwSetErrorCallback(GLFWerrorfun cb) {
    GLFWerrorfun old = g_error_cb;
    g_error_cb = cb;
    return old;
}

/* 剪贴板 */

const char* glfwGetClipboardString(void* window) {
    /* TODO(M2): 桥接 Android ClipboardManager（需 JNI 回调） */
    (void)window;
    return NULL;
}

void glfwSetClipboardString(void* window, const char* text) {
    /* TODO(M2): 同上 */
    (void)window;
    (void)text;
}

/* 时间 */

static double g_time_offset = 0.0;

double glfwGetTime(void) {
    struct timespec ts;
    clock_gettime(CLOCK_MONOTONIC, &ts);
    return (double)ts.tv_sec + (double)ts.tv_nsec * 1e-9 - g_time_offset;
}

void glfwSetTime(double time) {
    g_time_offset = glfwGetTime() - time;
}

/* 显示器 */

void* glfwGetPrimaryMonitor(void) {
    /* v1 窗口化虚拟显示器：TODO(M2) 对接真实显示尺寸 */
    return (void*)(uintptr_t)1;
}

const int* glfwGetVideoMode(void* monitor, int* count) {
    (void)monitor;
    static int mode_stub[6] = { 1920, 1080, 8, 8, 8, 60 };
    if (count) *count = 6;
    return mode_stub;
}
