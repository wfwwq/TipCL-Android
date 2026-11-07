package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowFocusCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowFocusCallback.class */
public abstract class GLFWWindowFocusCallback extends Callback implements GLFWWindowFocusCallbackI {
    public static GLFWWindowFocusCallback create(long functionPointer) {
        GLFWWindowFocusCallbackI instance = (GLFWWindowFocusCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWWindowFocusCallback) {
            return (GLFWWindowFocusCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWWindowFocusCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWWindowFocusCallback create(GLFWWindowFocusCallbackI instance) {
        if (instance instanceof GLFWWindowFocusCallback) {
            return (GLFWWindowFocusCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWWindowFocusCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowFocusCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWWindowFocusCallback set(long window) {
        GLFW.glfwSetWindowFocusCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowFocusCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowFocusCallback$Container.class */
    private static final class Container extends GLFWWindowFocusCallback {
        private final GLFWWindowFocusCallbackI delegate;

        Container(long functionPointer, GLFWWindowFocusCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWWindowFocusCallbackI
        public void invoke(long window, boolean focused) {
            this.delegate.invoke(window, focused);
        }
    }
}
