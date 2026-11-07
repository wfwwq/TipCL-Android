package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowIconifyCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowIconifyCallback.class */
public abstract class GLFWWindowIconifyCallback extends Callback implements GLFWWindowIconifyCallbackI {
    public static GLFWWindowIconifyCallback create(long functionPointer) {
        GLFWWindowIconifyCallbackI instance = (GLFWWindowIconifyCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWWindowIconifyCallback) {
            return (GLFWWindowIconifyCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWWindowIconifyCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWWindowIconifyCallback create(GLFWWindowIconifyCallbackI instance) {
        if (instance instanceof GLFWWindowIconifyCallback) {
            return (GLFWWindowIconifyCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWWindowIconifyCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowIconifyCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWWindowIconifyCallback set(long window) {
        GLFW.glfwSetWindowIconifyCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowIconifyCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowIconifyCallback$Container.class */
    private static final class Container extends GLFWWindowIconifyCallback {
        private final GLFWWindowIconifyCallbackI delegate;

        Container(long functionPointer, GLFWWindowIconifyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWWindowIconifyCallbackI
        public void invoke(long window, boolean iconified) {
            this.delegate.invoke(window, iconified);
        }
    }
}
