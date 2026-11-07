package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWReallocateCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWReallocateCallback.class */
public abstract class GLFWReallocateCallback extends Callback implements GLFWReallocateCallbackI {
    public static GLFWReallocateCallback create(long functionPointer) {
        GLFWReallocateCallbackI instance = (GLFWReallocateCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWReallocateCallback) {
            return (GLFWReallocateCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWReallocateCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWReallocateCallback create(GLFWReallocateCallbackI instance) {
        if (instance instanceof GLFWReallocateCallback) {
            return (GLFWReallocateCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWReallocateCallback() {
        super(DESCRIPTOR);
    }

    GLFWReallocateCallback(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWReallocateCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWReallocateCallback$Container.class */
    private static final class Container extends GLFWReallocateCallback {
        private final GLFWReallocateCallbackI delegate;

        Container(long functionPointer, GLFWReallocateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWReallocateCallbackI
        public long invoke(long block, long size, long user) {
            return this.delegate.invoke(block, size, user);
        }
    }
}
