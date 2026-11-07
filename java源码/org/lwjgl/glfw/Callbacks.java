package org.lwjgl.glfw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.lwjgl.system.Checks;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/Callbacks.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/Callbacks.class */
public final class Callbacks {
    private Callbacks() {
    }

    public static void glfwFreeCallbacks(@NativeType("GLFWwindow *") long window) {
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        try {
            for (Method callback : GLFW.class.getMethods()) {
                if (callback.getName().startsWith("glfwSet") && callback.getName().endsWith("Callback")) {
                    if (callback.getParameterCount() == 1) {
                        callback.invoke(null, null);
                    } else {
                        callback.invoke(null, Long.valueOf(GLFW.glfwGetCurrentContext()), null);
                    }
                }
            }
        } catch (IllegalAccessException | NullPointerException e) {
            throw new RuntimeException("org.lwjgl.GLFW.glfwSetXXXCallback() must be set to public and static", e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
