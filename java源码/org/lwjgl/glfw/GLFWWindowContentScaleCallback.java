package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowContentScaleCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowContentScaleCallback.class */
public abstract class GLFWWindowContentScaleCallback extends Callback implements GLFWWindowContentScaleCallbackI {
    public static GLFWWindowContentScaleCallback create(long functionPointer) {
        GLFWWindowContentScaleCallbackI instance = (GLFWWindowContentScaleCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWWindowContentScaleCallback) {
            return (GLFWWindowContentScaleCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWWindowContentScaleCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWWindowContentScaleCallback create(GLFWWindowContentScaleCallbackI instance) {
        if (instance instanceof GLFWWindowContentScaleCallback) {
            return (GLFWWindowContentScaleCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWWindowContentScaleCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowContentScaleCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWWindowContentScaleCallback set(long window) {
        GLFW.glfwSetWindowContentScaleCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowContentScaleCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowContentScaleCallback$Container.class */
    private static final class Container extends GLFWWindowContentScaleCallback {
        private final GLFWWindowContentScaleCallbackI delegate;

        Container(long functionPointer, GLFWWindowContentScaleCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWWindowContentScaleCallbackI
        public void invoke(long window, float xscale, float yscale) {
            this.delegate.invoke(window, xscale, yscale);
        }
    }
}
