package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWMouseButtonCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWMouseButtonCallback.class */
public abstract class GLFWMouseButtonCallback extends Callback implements GLFWMouseButtonCallbackI {
    public static GLFWMouseButtonCallback create(long functionPointer) {
        GLFWMouseButtonCallbackI instance = (GLFWMouseButtonCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWMouseButtonCallback) {
            return (GLFWMouseButtonCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWMouseButtonCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWMouseButtonCallback create(GLFWMouseButtonCallbackI instance) {
        if (instance instanceof GLFWMouseButtonCallback) {
            return (GLFWMouseButtonCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWMouseButtonCallback() {
        super(DESCRIPTOR);
    }

    GLFWMouseButtonCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWMouseButtonCallback set(long window) {
        GLFW.glfwSetMouseButtonCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWMouseButtonCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWMouseButtonCallback$Container.class */
    private static final class Container extends GLFWMouseButtonCallback {
        private final GLFWMouseButtonCallbackI delegate;

        Container(long functionPointer, GLFWMouseButtonCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWMouseButtonCallbackI
        public void invoke(long window, int button, int action, int mods) {
            this.delegate.invoke(window, button, action, mods);
        }
    }
}
