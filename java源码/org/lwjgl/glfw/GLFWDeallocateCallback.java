package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWDeallocateCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWDeallocateCallback.class */
public abstract class GLFWDeallocateCallback extends Callback implements GLFWDeallocateCallbackI {
    public static GLFWDeallocateCallback create(long functionPointer) {
        GLFWDeallocateCallbackI instance = (GLFWDeallocateCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWDeallocateCallback) {
            return (GLFWDeallocateCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWDeallocateCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWDeallocateCallback create(GLFWDeallocateCallbackI instance) {
        if (instance instanceof GLFWDeallocateCallback) {
            return (GLFWDeallocateCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWDeallocateCallback() {
        super(DESCRIPTOR);
    }

    GLFWDeallocateCallback(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWDeallocateCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWDeallocateCallback$Container.class */
    private static final class Container extends GLFWDeallocateCallback {
        private final GLFWDeallocateCallbackI delegate;

        Container(long functionPointer, GLFWDeallocateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWDeallocateCallbackI
        public void invoke(long block, long user) {
            this.delegate.invoke(block, user);
        }
    }
}
