package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWJoystickCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWJoystickCallback.class */
public abstract class GLFWJoystickCallback extends Callback implements GLFWJoystickCallbackI {
    public static GLFWJoystickCallback create(long functionPointer) {
        GLFWJoystickCallbackI instance = (GLFWJoystickCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWJoystickCallback) {
            return (GLFWJoystickCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWJoystickCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWJoystickCallback create(GLFWJoystickCallbackI instance) {
        if (instance instanceof GLFWJoystickCallback) {
            return (GLFWJoystickCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWJoystickCallback() {
        super(DESCRIPTOR);
    }

    GLFWJoystickCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWJoystickCallback set() {
        GLFW.glfwSetJoystickCallback(this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWJoystickCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWJoystickCallback$Container.class */
    private static final class Container extends GLFWJoystickCallback {
        private final GLFWJoystickCallbackI delegate;

        Container(long functionPointer, GLFWJoystickCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWJoystickCallbackI
        public void invoke(int jid, int event) {
            this.delegate.invoke(jid, event);
        }
    }
}
