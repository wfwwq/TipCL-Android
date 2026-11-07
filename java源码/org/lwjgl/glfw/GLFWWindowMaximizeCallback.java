package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowMaximizeCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowMaximizeCallback.class */
public abstract class GLFWWindowMaximizeCallback extends Callback implements GLFWWindowMaximizeCallbackI {
    public static GLFWWindowMaximizeCallback create(long functionPointer) {
        GLFWWindowMaximizeCallbackI instance = (GLFWWindowMaximizeCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWWindowMaximizeCallback) {
            return (GLFWWindowMaximizeCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWWindowMaximizeCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWWindowMaximizeCallback create(GLFWWindowMaximizeCallbackI instance) {
        if (instance instanceof GLFWWindowMaximizeCallback) {
            return (GLFWWindowMaximizeCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWWindowMaximizeCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowMaximizeCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWWindowMaximizeCallback set(long window) {
        GLFW.glfwSetWindowMaximizeCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowMaximizeCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowMaximizeCallback$Container.class */
    private static final class Container extends GLFWWindowMaximizeCallback {
        private final GLFWWindowMaximizeCallbackI delegate;

        Container(long functionPointer, GLFWWindowMaximizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWWindowMaximizeCallbackI
        public void invoke(long window, boolean maximized) {
            this.delegate.invoke(window, maximized);
        }
    }
}
