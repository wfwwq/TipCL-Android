package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWIMEStatusCallback.class */
public abstract class GLFWIMEStatusCallback extends Callback implements GLFWIMEStatusCallbackI {
    public static GLFWIMEStatusCallback create(long functionPointer) {
        GLFWIMEStatusCallbackI instance = (GLFWIMEStatusCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWIMEStatusCallback) {
            return (GLFWIMEStatusCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWIMEStatusCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWIMEStatusCallback create(GLFWIMEStatusCallbackI instance) {
        if (instance instanceof GLFWIMEStatusCallback) {
            return (GLFWIMEStatusCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWIMEStatusCallback() {
        super(DESCRIPTOR);
    }

    GLFWIMEStatusCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWIMEStatusCallback set(long window) {
        GLFW.glfwSetIMEStatusCallback(window, this);
        return this;
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWIMEStatusCallback$Container.class */
    private static final class Container extends GLFWIMEStatusCallback {
        private final GLFWIMEStatusCallbackI delegate;

        Container(long functionPointer, GLFWIMEStatusCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWIMEStatusCallbackI
        public void invoke(long window) {
            this.delegate.invoke(window);
        }
    }
}
