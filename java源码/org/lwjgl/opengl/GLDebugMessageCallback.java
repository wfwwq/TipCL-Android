package org.lwjgl.opengl;

import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageCallback.class */
public abstract class GLDebugMessageCallback extends Callback implements GLDebugMessageCallbackI {
    public static GLDebugMessageCallback create(long functionPointer) {
        GLDebugMessageCallbackI instance = (GLDebugMessageCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLDebugMessageCallback) {
            return (GLDebugMessageCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLDebugMessageCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLDebugMessageCallback create(GLDebugMessageCallbackI instance) {
        if (instance instanceof GLDebugMessageCallback) {
            return (GLDebugMessageCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLDebugMessageCallback() {
        super(DESCRIPTOR);
    }

    GLDebugMessageCallback(long functionPointer) {
        super(functionPointer);
    }

    public static String getMessage(int length, long message) {
        return MemoryUtil.memUTF8(MemoryUtil.memByteBuffer(message, length));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageCallback$Container.class */
    private static final class Container extends GLDebugMessageCallback {
        private final GLDebugMessageCallbackI delegate;

        Container(long functionPointer, GLDebugMessageCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.opengl.GLDebugMessageCallbackI
        public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
            this.delegate.invoke(source, type, id, severity, length, message, userParam);
        }
    }
}
