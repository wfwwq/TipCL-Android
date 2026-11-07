package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWKeyCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWKeyCallback.class */
public abstract class GLFWKeyCallback extends Callback implements GLFWKeyCallbackI {
    public static GLFWKeyCallback create(long functionPointer) {
        GLFWKeyCallbackI instance = (GLFWKeyCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWKeyCallback) {
            return (GLFWKeyCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWKeyCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWKeyCallback create(GLFWKeyCallbackI instance) {
        if (instance instanceof GLFWKeyCallback) {
            return (GLFWKeyCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWKeyCallback() {
        super(DESCRIPTOR);
    }

    GLFWKeyCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWKeyCallback set(long window) {
        GLFW.glfwSetKeyCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWKeyCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWKeyCallback$Container.class */
    private static final class Container extends GLFWKeyCallback {
        private final GLFWKeyCallbackI delegate;

        Container(long functionPointer, GLFWKeyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWKeyCallbackI
        public void invoke(long window, int key, int scancode, int action, int mods) {
            this.delegate.invoke(window, key, scancode, action, mods);
        }
    }
}
