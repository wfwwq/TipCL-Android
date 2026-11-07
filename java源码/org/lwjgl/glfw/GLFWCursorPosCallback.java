package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWCursorPosCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWCursorPosCallback.class */
public abstract class GLFWCursorPosCallback extends Callback implements GLFWCursorPosCallbackI {
    public static GLFWCursorPosCallback create(long functionPointer) {
        GLFWCursorPosCallbackI instance = (GLFWCursorPosCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWCursorPosCallback) {
            return (GLFWCursorPosCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWCursorPosCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWCursorPosCallback create(GLFWCursorPosCallbackI instance) {
        if (instance instanceof GLFWCursorPosCallback) {
            return (GLFWCursorPosCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWCursorPosCallback() {
        super(DESCRIPTOR);
    }

    GLFWCursorPosCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWCursorPosCallback set(long window) {
        GLFW.glfwSetCursorPosCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWCursorPosCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWCursorPosCallback$Container.class */
    private static final class Container extends GLFWCursorPosCallback {
        private final GLFWCursorPosCallbackI delegate;

        Container(long functionPointer, GLFWCursorPosCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWCursorPosCallbackI
        public void invoke(long window, double xpos, double ypos) {
            this.delegate.invoke(window, xpos, ypos);
        }
    }
}
