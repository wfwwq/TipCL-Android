package org.lwjgl.glfw;

import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWNativeOSMesa.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWNativeOSMesa.class */
public class GLFWNativeOSMesa {
    @NativeType("int")
    public static boolean glfwGetOSMesaColorBuffer(@NativeType("GLFWwindow *") long window, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer format, @NativeType("void **") PointerBuffer buffer) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    public static int glfwGetOSMesaDepthBuffer(@NativeType("GLFWwindow *") long window, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer bytesPerValue, @NativeType("void **") PointerBuffer buffer) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    @NativeType("OSMesaContext")
    public static long glfwGetOSMesaContext(@NativeType("GLFWwindow *") long window) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    @NativeType("int")
    public static boolean glfwGetOSMesaColorBuffer(@NativeType("GLFWwindow *") long window, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] format, @NativeType("void **") PointerBuffer buffer) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWNativeOSMesa$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWNativeOSMesa$Functions.class */
    public static final class Functions {
        public static final long GetOSMesaColorBuffer = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetOSMesaColorBuffer");
        public static final long GetOSMesaDepthBuffer = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetOSMesaDepthBuffer");
        public static final long GetOSMesaContext = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetOSMesaContext");

        private Functions() {
        }
    }

    public static int glfwGetOSMesaDepthBuffer(@NativeType("GLFWwindow *") long window, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] bytesPerValue, @NativeType("void **") PointerBuffer buffer) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }
}
