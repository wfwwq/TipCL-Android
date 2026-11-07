package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWCursorEnterCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWCursorEnterCallback.class */
public abstract class GLFWCursorEnterCallback extends Callback implements GLFWCursorEnterCallbackI {
    public static GLFWCursorEnterCallback create(long functionPointer) {
        GLFWCursorEnterCallbackI instance = (GLFWCursorEnterCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWCursorEnterCallback) {
            return (GLFWCursorEnterCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWCursorEnterCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWCursorEnterCallback create(GLFWCursorEnterCallbackI instance) {
        if (instance instanceof GLFWCursorEnterCallback) {
            return (GLFWCursorEnterCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWCursorEnterCallback() {
        super(DESCRIPTOR);
    }

    GLFWCursorEnterCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWCursorEnterCallback set(long window) {
        GLFW.glfwSetCursorEnterCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWCursorEnterCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWCursorEnterCallback$Container.class */
    private static final class Container extends GLFWCursorEnterCallback {
        private final GLFWCursorEnterCallbackI delegate;

        Container(long functionPointer, GLFWCursorEnterCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWCursorEnterCallbackI
        public void invoke(long window, boolean entered) {
            this.delegate.invoke(window, entered);
        }
    }
}
