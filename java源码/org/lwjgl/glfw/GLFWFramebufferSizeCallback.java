package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWFramebufferSizeCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWFramebufferSizeCallback.class */
public abstract class GLFWFramebufferSizeCallback extends Callback implements GLFWFramebufferSizeCallbackI {
    public static GLFWFramebufferSizeCallback create(long functionPointer) {
        GLFWFramebufferSizeCallbackI instance = (GLFWFramebufferSizeCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWFramebufferSizeCallback) {
            return (GLFWFramebufferSizeCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWFramebufferSizeCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWFramebufferSizeCallback create(GLFWFramebufferSizeCallbackI instance) {
        if (instance instanceof GLFWFramebufferSizeCallback) {
            return (GLFWFramebufferSizeCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWFramebufferSizeCallback() {
        super(DESCRIPTOR);
    }

    GLFWFramebufferSizeCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWFramebufferSizeCallback set(long window) {
        GLFW.glfwSetFramebufferSizeCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWFramebufferSizeCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWFramebufferSizeCallback$Container.class */
    private static final class Container extends GLFWFramebufferSizeCallback {
        private final GLFWFramebufferSizeCallbackI delegate;

        Container(long functionPointer, GLFWFramebufferSizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWFramebufferSizeCallbackI
        public void invoke(long window, int width, int height) {
            this.delegate.invoke(window, width, height);
        }
    }
}
