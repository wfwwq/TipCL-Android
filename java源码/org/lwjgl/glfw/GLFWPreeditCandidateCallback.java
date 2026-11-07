package org.lwjgl.glfw;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWPreeditCandidateCallback.class */
public abstract class GLFWPreeditCandidateCallback extends Callback implements GLFWPreeditCandidateCallbackI {
    public static GLFWPreeditCandidateCallback create(long functionPointer) {
        GLFWPreeditCandidateCallbackI instance = (GLFWPreeditCandidateCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWPreeditCandidateCallback) {
            return (GLFWPreeditCandidateCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWPreeditCandidateCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWPreeditCandidateCallback create(GLFWPreeditCandidateCallbackI instance) {
        if (instance instanceof GLFWPreeditCandidateCallback) {
            return (GLFWPreeditCandidateCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWPreeditCandidateCallback() {
        super(DESCRIPTOR);
    }

    GLFWPreeditCandidateCallback(long functionPointer) {
        super(functionPointer);
    }

    public GLFWPreeditCandidateCallback set(long window) {
        GLFW.glfwSetPreeditCandidateCallback(window, this);
        return this;
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWPreeditCandidateCallback$Container.class */
    private static final class Container extends GLFWPreeditCandidateCallback {
        private final GLFWPreeditCandidateCallbackI delegate;

        Container(long functionPointer, GLFWPreeditCandidateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWPreeditCandidateCallbackI
        public void invoke(long window, int candidates_count, int selected_index, int page_start, int page_size) {
            this.delegate.invoke(window, candidates_count, selected_index, page_start, page_size);
        }
    }
}
