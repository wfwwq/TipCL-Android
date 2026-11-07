package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWPreeditCallback.class */
public abstract class GLFWPreeditCallback extends Callback implements GLFWPreeditCallbackI {
    public static GLFWPreeditCallback create(long functionPointer) {
        GLFWPreeditCallbackI instance = (GLFWPreeditCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWPreeditCallback) {
            return (GLFWPreeditCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWPreeditCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWPreeditCallback create(GLFWPreeditCallbackI instance) {
        if (instance instanceof GLFWPreeditCallback) {
            return (GLFWPreeditCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWPreeditCallback() {
        super(DESCRIPTOR);
    }

    GLFWPreeditCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWPreeditCallback set(long window) {
        GLFW.glfwSetPreeditCallback(window, this);
        return this;
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWPreeditCallback$Container.class */
    private static final class Container extends GLFWPreeditCallback {
        private final GLFWPreeditCallbackI delegate;

        Container(long functionPointer, GLFWPreeditCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWPreeditCallbackI
        public void invoke(long window, int preedit_count, long preedit_string, int block_count, long block_sizes, int focused_block, int caret) {
            this.delegate.invoke(window, preedit_count, preedit_string, block_count, block_sizes, focused_block, caret);
        }
    }
}
