package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWCharCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWCharCallback.class */
public abstract class GLFWCharCallback extends Callback implements GLFWCharCallbackI {
    public static GLFWCharCallback create(long functionPointer) {
        GLFWCharCallbackI instance = (GLFWCharCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWCharCallback) {
            return (GLFWCharCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWCharCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWCharCallback create(GLFWCharCallbackI instance) {
        if (instance instanceof GLFWCharCallback) {
            return (GLFWCharCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWCharCallback() {
        super(DESCRIPTOR);
    }

    GLFWCharCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWCharCallback set(long window) {
        GLFW.glfwSetCharCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWCharCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWCharCallback$Container.class */
    private static final class Container extends GLFWCharCallback {
        private final GLFWCharCallbackI delegate;

        Container(long functionPointer, GLFWCharCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWCharCallbackI
        public void invoke(long window, int codepoint) {
            this.delegate.invoke(window, codepoint);
        }
    }
}
