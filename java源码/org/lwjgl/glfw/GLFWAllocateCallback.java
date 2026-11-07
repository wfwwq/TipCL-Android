package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWAllocateCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWAllocateCallback.class */
public abstract class GLFWAllocateCallback extends Callback implements GLFWAllocateCallbackI {
    public static GLFWAllocateCallback create(long functionPointer) {
        GLFWAllocateCallbackI instance = (GLFWAllocateCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWAllocateCallback) {
            return (GLFWAllocateCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWAllocateCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWAllocateCallback create(GLFWAllocateCallbackI instance) {
        if (instance instanceof GLFWAllocateCallback) {
            return (GLFWAllocateCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWAllocateCallback() {
        super(DESCRIPTOR);
    }

    GLFWAllocateCallback(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWAllocateCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWAllocateCallback$Container.class */
    private static final class Container extends GLFWAllocateCallback {
        private final GLFWAllocateCallbackI delegate;

        Container(long functionPointer, GLFWAllocateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWAllocateCallbackI
        public long invoke(long size, long user) {
            return this.delegate.invoke(size, user);
        }
    }
}
