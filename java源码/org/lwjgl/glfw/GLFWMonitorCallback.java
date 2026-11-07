package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWMonitorCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWMonitorCallback.class */
public abstract class GLFWMonitorCallback extends Callback implements GLFWMonitorCallbackI {
    public static GLFWMonitorCallback create(long functionPointer) {
        GLFWMonitorCallbackI instance = (GLFWMonitorCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWMonitorCallback) {
            return (GLFWMonitorCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWMonitorCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWMonitorCallback create(GLFWMonitorCallbackI instance) {
        if (instance instanceof GLFWMonitorCallback) {
            return (GLFWMonitorCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWMonitorCallback() {
        super(DESCRIPTOR);
    }

    GLFWMonitorCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWMonitorCallback set() {
        GLFW.glfwSetMonitorCallback(this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWMonitorCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWMonitorCallback$Container.class */
    private static final class Container extends GLFWMonitorCallback {
        private final GLFWMonitorCallbackI delegate;

        Container(long functionPointer, GLFWMonitorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWMonitorCallbackI
        public void invoke(long monitor, int event) {
            this.delegate.invoke(monitor, event);
        }
    }
}
