package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowSizeCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowSizeCallback.class */
public abstract class GLFWWindowSizeCallback extends Callback implements GLFWWindowSizeCallbackI {
    public static GLFWWindowSizeCallback create(long functionPointer) {
        GLFWWindowSizeCallbackI instance = (GLFWWindowSizeCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWWindowSizeCallback) {
            return (GLFWWindowSizeCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWWindowSizeCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWWindowSizeCallback create(GLFWWindowSizeCallbackI instance) {
        if (instance instanceof GLFWWindowSizeCallback) {
            return (GLFWWindowSizeCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWWindowSizeCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowSizeCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWWindowSizeCallback set(long window) {
        GLFW.glfwSetWindowSizeCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowSizeCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowSizeCallback$Container.class */
    private static final class Container extends GLFWWindowSizeCallback {
        private final GLFWWindowSizeCallbackI delegate;

        Container(long functionPointer, GLFWWindowSizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWWindowSizeCallbackI
        public void invoke(long window, int width, int height) {
            this.delegate.invoke(window, width, height);
        }
    }
}
