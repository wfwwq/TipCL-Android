package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowRefreshCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowRefreshCallback.class */
public abstract class GLFWWindowRefreshCallback extends Callback implements GLFWWindowRefreshCallbackI {
    public static GLFWWindowRefreshCallback create(long functionPointer) {
        GLFWWindowRefreshCallbackI instance = (GLFWWindowRefreshCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWWindowRefreshCallback) {
            return (GLFWWindowRefreshCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWWindowRefreshCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWWindowRefreshCallback create(GLFWWindowRefreshCallbackI instance) {
        if (instance instanceof GLFWWindowRefreshCallback) {
            return (GLFWWindowRefreshCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWWindowRefreshCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowRefreshCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWWindowRefreshCallback set(long window) {
        GLFW.glfwSetWindowRefreshCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowRefreshCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowRefreshCallback$Container.class */
    private static final class Container extends GLFWWindowRefreshCallback {
        private final GLFWWindowRefreshCallbackI delegate;

        Container(long functionPointer, GLFWWindowRefreshCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWWindowRefreshCallbackI
        public void invoke(long window) {
            this.delegate.invoke(window);
        }
    }
}
