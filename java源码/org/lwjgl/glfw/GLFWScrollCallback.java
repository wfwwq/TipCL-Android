package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWScrollCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWScrollCallback.class */
public abstract class GLFWScrollCallback extends Callback implements GLFWScrollCallbackI {
    public static GLFWScrollCallback create(long functionPointer) {
        GLFWScrollCallbackI instance = (GLFWScrollCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWScrollCallback) {
            return (GLFWScrollCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWScrollCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWScrollCallback create(GLFWScrollCallbackI instance) {
        if (instance instanceof GLFWScrollCallback) {
            return (GLFWScrollCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWScrollCallback() {
        super(DESCRIPTOR);
    }

    GLFWScrollCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWScrollCallback set(long window) {
        GLFW.glfwSetScrollCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWScrollCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWScrollCallback$Container.class */
    private static final class Container extends GLFWScrollCallback {
        private final GLFWScrollCallbackI delegate;

        Container(long functionPointer, GLFWScrollCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWScrollCallbackI
        public void invoke(long window, double xoffset, double yoffset) {
            this.delegate.invoke(window, xoffset, yoffset);
        }
    }
}
