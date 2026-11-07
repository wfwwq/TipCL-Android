package org.lwjgl.glfw;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWNativeWin32.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWNativeWin32.class */
public class GLFWNativeWin32 {
    @NativeType("char const *")
    public static String glfwGetWin32Adapter(@NativeType("GLFWmonitor *") long monitor) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @NativeType("char const *")
    public static String glfwGetWin32Monitor(@NativeType("GLFWmonitor *") long monitor) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWNativeWin32$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWNativeWin32$Functions.class */
    public static final class Functions {
        public static final long GetWin32Adapter = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Adapter");
        public static final long GetWin32Monitor = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Monitor");
        public static final long GetWin32Window = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Window");
        public static final long AttachWin32Window = APIUtil.apiGetFunctionAddressOptional(GLFW.getLibrary(), "glfwAttachWin32Window");

        private Functions() {
        }
    }

    @NativeType("HWND")
    public static long glfwGetWin32Window(@NativeType("GLFWwindow *") long window) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @NativeType("GLFWwindow *")
    public static long glfwAttachWin32Window(@NativeType("HWND") long handle, @NativeType("GLFWwindow *") long share) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
