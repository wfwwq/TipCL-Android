package org.lwjgl.glfw;

import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Pointer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWDropCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWDropCallback.class */
public abstract class GLFWDropCallback extends Callback implements GLFWDropCallbackI {
    public static GLFWDropCallback create(long functionPointer) {
        GLFWDropCallbackI instance = (GLFWDropCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWDropCallback) {
            return (GLFWDropCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWDropCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWDropCallback create(GLFWDropCallbackI instance) {
        if (instance instanceof GLFWDropCallback) {
            return (GLFWDropCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWDropCallback() {
        super(DESCRIPTOR);
    }

    GLFWDropCallback(long functionPointer) {
        super(functionPointer);
    }

    public static String getName(long names, int index) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(names + (Pointer.POINTER_SIZE * index)));
    }

    public GLFWDropCallback set(long window) {
        GLFW.glfwSetDropCallback(window, this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWDropCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWDropCallback$Container.class */
    private static final class Container extends GLFWDropCallback {
        private final GLFWDropCallbackI delegate;

        Container(long functionPointer, GLFWDropCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWDropCallbackI
        public void invoke(long window, int count, long names) {
            this.delegate.invoke(window, count, names);
        }
    }
}
