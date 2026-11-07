package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowCloseCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowCloseCallback.class */
public abstract class GLFWWindowCloseCallback extends Callback implements GLFWWindowCloseCallbackI {
    public static GLFWWindowCloseCallback create(long functionPointer) {
        GLFWWindowCloseCallbackI instance = (GLFWWindowCloseCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWWindowCloseCallback) {
            return (GLFWWindowCloseCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWWindowCloseCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWWindowCloseCallback create(GLFWWindowCloseCallbackI instance) {
        if (instance instanceof GLFWWindowCloseCallback) {
            return (GLFWWindowCloseCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWWindowCloseCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowCloseCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWWindowCloseCallback set(long window) {
        GLFW.glfwSetWindowCloseCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowCloseCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowCloseCallback$Container.class */
    private static final class Container extends GLFWWindowCloseCallback {
        private final GLFWWindowCloseCallbackI delegate;

        Container(long functionPointer, GLFWWindowCloseCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWWindowCloseCallbackI
        public void invoke(long window) {
            this.delegate.invoke(window);
        }
    }
}
