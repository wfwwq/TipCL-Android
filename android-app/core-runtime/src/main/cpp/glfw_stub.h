/* glfw_stub.h — 自研 GLFW 兼容桩（洁净室实现，行为定义参照 GLFW 官方 API 规范）。
 *
 * v1 最小集 + M2 补全：glfwGetProcAddress、GLFW_CURSOR 输入模式（含 raw motion）、
 * 光标事件合并、窗口槽位回收。
 * 本文件不依赖 EGL/JNI/Android —— 纯 C，可在 host 上编译自检（hostcheck）。
 * 窗口句柄为虚拟句柄（槽位+1，0 为 NULL）。
 */
#ifndef TIPCL_GLFW_STUB_H
#define TIPCL_GLFW_STUB_H

#ifdef __cplusplus
extern "C" {
#endif

#include <stdint.h>
#include <stddef.h>

#define GLFW_STUB_API_VERSION_MAJOR 3
#define GLFW_STUB_API_VERSION_MINOR 3

/* glfw3.h 常量子集（数值与官方公开规范一致） */
#define GLFW_TRUE  1
#define GLFW_FALSE 0

#define GLFW_RELEASE 0
#define GLFW_PRESS   1
#define GLFW_REPEAT  2

#define GLFW_CLIENT_API            0x22001
#define GLFW_CONTEXT_VERSION_MAJOR 0x22002
#define GLFW_CONTEXT_VERSION_MINOR 0x22003
#define GLFW_OPENGL_ES_API         0x22004

/* 输入模式（glfwSetInputMode / glfwGetInputMode） */
#define GLFW_CURSOR                0x00033001
#define GLFW_STICKY_KEYS           0x00033002
#define GLFW_STICKY_MOUSE_BUTTONS  0x00033003
#define GLFW_LOCK_KEY_MODS         0x00033004
#define GLFW_RAW_MOUSE_MOTION      0x00033005

/* GLFW_CURSOR 模式值 */
#define GLFW_CURSOR_NORMAL   0x00034001
#define GLFW_CURSOR_HIDDEN   0x00034002
#define GLFW_CURSOR_DISABLED 0x00034003

/* 事件类型（内部队列用） */
typedef enum {
    GLFW_STUB_EVENT_NONE = 0,
    GLFW_STUB_EVENT_KEY,
    GLFW_STUB_EVENT_CHAR,
    GLFW_STUB_EVENT_CURSOR_POS,
    GLFW_STUB_EVENT_MOUSE_BUTTON,
    GLFW_STUB_EVENT_SCROLL,
    GLFW_STUB_EVENT_FRAMEBUFFER_SIZE
} glfw_stub_event_type;

typedef struct {
    glfw_stub_event_type type;
    int i0, i1, i2, i3;   /* key/scancode/action/mods 或 w/h */
    double d0, d1;        /* 坐标 / 滚轮偏移 */
} glfw_stub_event;

/* 回调签名（与 glfw3.h 一致） */
typedef void (*GLFWerrorfun)(int, const char*);
typedef void (*GLFWkeyfun)(void*, int, int, int, int);
typedef void (*GLFWcharfun)(void*, unsigned int);
typedef void (*GLFWcursorposfun)(void*, double, double);
typedef void (*GLFWmousebuttonfun)(void*, int, int, int);
typedef void (*GLFWscrollfun)(void*, double, double);
typedef void (*GLFWframebuffersizefun)(void*, int, int);

/* 平台钩子：egl_bridge 在初始化时注入；host 上为 NULL 走安全默认。
 *  - get_proc_address: eglGetProcAddress 优先 + dlsym 回退
 *  - swap_buffers / swap_interval / make_current: EGL 侧实现
 */
typedef void* (*glfw_stub_proc_address_fn)(const char* name);
typedef void (*glfw_stub_swap_buffers_fn)(void* window);
typedef void (*glfw_stub_swap_interval_fn)(int interval);
typedef void (*glfw_stub_make_current_fn)(void* window);

typedef struct {
    glfw_stub_proc_address_fn get_proc_address;
    glfw_stub_swap_buffers_fn swap_buffers;
    glfw_stub_swap_interval_fn swap_interval;
    glfw_stub_make_current_fn make_current;
} glfw_stub_platform_hooks;

void glfw_stub_set_platform_hooks(const glfw_stub_platform_hooks* hooks);
const glfw_stub_platform_hooks* glfw_stub_get_platform_hooks(void);

/* GLFW API（桩实现） */
void* glfwCreateWindow(int width, int height, const char* title, void* monitor, void* share);
void  glfwDestroyWindow(void* window);
int   glfwWindowShouldClose(void* window);
void  glfwSetWindowShouldClose(void* window, int value);
void  glfwGetFramebufferSize(void* window, int* width, int* height);
void  glfwMakeContextCurrent(void* window);
void  glfwSwapInterval(int interval);
void  glfwSwapBuffers(void* window);
int   glfwExtensionSupported(const char* extension);
void* glfwGetProcAddress(const char* procname);

void  glfwDefaultWindowHints(void);
void  glfwWindowHint(int hint, int value);
int   glfwInit(void);
void  glfwTerminate(void);
void  glfwInitHint(int hint, int value);

void  glfwPollEvents(void);
void  glfwWaitEvents(void);

void  glfwSetInputMode(void* window, int mode, int value);
int   glfwGetInputMode(void* window, int mode);
int   glfwGetKey(void* window, int key);
int   glfwGetMouseButton(void* window, int button);
void  glfwGetCursorPos(void* window, double* xpos, double* ypos);
void  glfwSetCursorPos(void* window, double xpos, double ypos);

GLFWkeyfun            glfwSetKeyCallback(void* window, GLFWkeyfun cb);
GLFWcharfun           glfwSetCharCallback(void* window, GLFWcharfun cb);
GLFWcursorposfun      glfwSetCursorPosCallback(void* window, GLFWcursorposfun cb);
GLFWmousebuttonfun    glfwSetMouseButtonCallback(void* window, GLFWmousebuttonfun cb);
GLFWscrollfun         glfwSetScrollCallback(void* window, GLFWscrollfun cb);
GLFWframebuffersizefun glfwSetFramebufferSizeCallback(void* window, GLFWframebuffersizefun cb);
GLFWerrorfun          glfwSetErrorCallback(GLFWerrorfun cb);

const char* glfwGetClipboardString(void* window);
void        glfwSetClipboardString(void* window, const char* text);

double glfwGetTime(void);
void   glfwSetTime(double time);

void* glfwGetPrimaryMonitor(void);
const int* glfwGetVideoMode(void* monitor, int* count);

/* 桩内部状态访问（JNI 层与 egl_bridge 使用） */
void  glfw_stub_reset(void);
void  glfw_stub_push_event(const glfw_stub_event* ev);
int   glfw_stub_pop_event(glfw_stub_event* out); /* 0 = 空 */
void  glfw_stub_set_window_size(int w, int h);
int   glfw_stub_window_count(void);

/* 键/鼠标状态查询（core-input 之外也允许 native 直接注入） */
unsigned char glfw_stub_get_key_state(int key);
unsigned char glfw_stub_get_mouse_button_state(int button);
void          glfw_stub_get_cursor_pos(double* x, double* y);

#ifdef __cplusplus
}
#endif

#endif /* TIPCL_GLFW_STUB_H */
