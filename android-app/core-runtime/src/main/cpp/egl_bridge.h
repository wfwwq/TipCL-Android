/* egl_bridge.h — EGL 桥对外接口（JNI 层与 glfw_stub 平台钩子使用） */
#ifndef TIPCL_EGL_BRIDGE_H
#define TIPCL_EGL_BRIDGE_H

#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif

int egl_bridge_init(void);
void egl_bridge_release(void);

/* 从 Java Surface 建立 EGLSurface 并 makeCurrent，成功返回 1 */
int egl_bridge_attach_surface(JNIEnv* env, jobject surface, int width, int height);
void egl_bridge_detach_surface(void);
int egl_bridge_swap_buffers(void);
int egl_bridge_surface_size(int* width, int* height);

/* glfwGetProcAddress 的实现体：eglGetProcAddress 优先，dlsym(RTLD_DEFAULT) 回退
 * （部分驱动 eglGetProcAddress 对核心 GL ES 函数返回 NULL）。 */
void* egl_bridge_get_proc_address(const char* name);

/* glfw_stub 平台钩子实现（egl_bridge_init 时注入 glfw_stub） */
void egl_bridge_hook_make_current(void* window);
void egl_bridge_hook_swap_buffers(void* window);
void egl_bridge_hook_swap_interval(int interval);

#ifdef __cplusplus
}
#endif

#endif /* TIPCL_EGL_BRIDGE_H */
