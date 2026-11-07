package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWCharModsCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWCharModsCallback.class */
public abstract class GLFWCharModsCallback extends Callback implements GLFWCharModsCallbackI {
    public static GLFWCharModsCallback create(long functionPointer) {
        GLFWCharModsCallbackI instance = (GLFWCharModsCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWCharModsCallback) {
            return (GLFWCharModsCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWCharModsCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWCharModsCallback create(GLFWCharModsCallbackI instance) {
        if (instance instanceof GLFWCharModsCallback) {
            return (GLFWCharModsCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWCharModsCallback() {
        super(DESCRIPTOR);
    }

    GLFWCharModsCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWCharModsCallback set(long window) {
        GLFW.glfwSetCharModsCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWCharModsCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWCharModsCallback$Container.class */
    private static final class Container extends GLFWCharModsCallback {
        private final GLFWCharModsCallbackI delegate;

        Container(long functionPointer, GLFWCharModsCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWCharModsCallbackI
        public void invoke(long window, int codepoint, int mods) {
            this.delegate.invoke(window, codepoint, mods);
        }
    }
}
