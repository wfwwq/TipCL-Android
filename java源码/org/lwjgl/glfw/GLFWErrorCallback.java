package org.lwjgl.glfw;

import java.io.PrintStream;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWErrorCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWErrorCallback.class */
public abstract class GLFWErrorCallback extends Callback implements GLFWErrorCallbackI {
    public static GLFWErrorCallback create(long functionPointer) {
        GLFWErrorCallbackI instance = (GLFWErrorCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLFWErrorCallback) {
            return (GLFWErrorCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLFWErrorCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLFWErrorCallback create(GLFWErrorCallbackI instance) {
        if (instance instanceof GLFWErrorCallback) {
            return (GLFWErrorCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLFWErrorCallback() {
        super(DESCRIPTOR);
    }

    GLFWErrorCallback(long functionPointer) {
        super(functionPointer);
    }

    public static String getDescription(long description) {
        return MemoryUtil.memUTF8(description);
    }

    public static GLFWErrorCallback createPrint() {
        return createPrint(APIUtil.DEBUG_STREAM);
    }

    public static GLFWErrorCallback createPrint(final PrintStream stream) {
        return new GLFWErrorCallback() { // from class: org.lwjgl.glfw.GLFWErrorCallback.1
            private Map<Integer, String> ERROR_CODES = APIUtil.apiClassTokens((field, value) -> {
                return 65536 < value.intValue() && value.intValue() < 131072;
            }, null, GLFW.class);

            @Override // org.lwjgl.glfw.GLFWErrorCallbackI
            public void invoke(int error, long description) {
                String msg = getDescription(description);
                StringBuilder sb = new StringBuilder(512);
                sb.append("[LWJGL] ").append(this.ERROR_CODES.get(Integer.valueOf(error))).append(" error\n").append("\tDescription : ").append(msg).append(StringUtils.LF).append("\tStacktrace  :\n");
                StackTraceElement[] stack = Thread.currentThread().getStackTrace();
                for (int i = 4; i < stack.length; i++) {
                    sb.append("\t\t");
                    sb.append(stack[i]);
                    sb.append(StringUtils.LF);
                }
                stream.print(sb);
            }
        };
    }

    public static GLFWErrorCallback createThrow() {
        return new GLFWErrorCallback() { // from class: org.lwjgl.glfw.GLFWErrorCallback.2
            @Override // org.lwjgl.glfw.GLFWErrorCallbackI
            public void invoke(int error, long description) {
                throw new IllegalStateException(String.format("GLFW error [0x%X]: %s", Integer.valueOf(error), getDescription(description)));
            }
        };
    }

    public GLFWErrorCallback set() {
        GLFW.glfwSetErrorCallback(this);
        return this;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWErrorCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWErrorCallback$Container.class */
    private static final class Container extends GLFWErrorCallback {
        private final GLFWErrorCallbackI delegate;

        Container(long functionPointer, GLFWErrorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.glfw.GLFWErrorCallbackI
        public void invoke(int error, long description) {
            this.delegate.invoke(error, description);
        }
    }
}
