package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowPosCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowPosCallback.class */
public abstract class GLFWWindowPosCallback extends Callback implements GLFWWindowPosCallbackI {
    public static GLFWWindowPosCallback create(long functionPointer) {
        GLFWWindowPosCallbackI instance = (GLFWWindowPosCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWWindowPosCallback) {
            return (GLFWWindowPosCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWWindowPosCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWWindowPosCallback create(GLFWWindowPosCallbackI instance) {
        if (instance instanceof GLFWWindowPosCallback) {
            return (GLFWWindowPosCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWWindowPosCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowPosCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWWindowPosCallback set(long window) {
        GLFW.glfwSetWindowPosCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowPosCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowPosCallback$Container.class */
    private static final class Container extends GLFWWindowPosCallback {
        private final GLFWWindowPosCallbackI delegate;

        Container(long functionPointer, GLFWWindowPosCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWWindowPosCallbackI
        public void invoke(long window, int xpos, int ypos) {
            this.delegate.invoke(window, xpos, ypos);
        }
    }
}
