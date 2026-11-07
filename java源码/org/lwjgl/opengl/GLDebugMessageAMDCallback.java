package org.lwjgl.opengl;

import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageAMDCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageAMDCallback.class */
public abstract class GLDebugMessageAMDCallback extends Callback implements GLDebugMessageAMDCallbackI {
    public static GLDebugMessageAMDCallback create(long functionPointer) {
        GLDebugMessageAMDCallbackI instance = (GLDebugMessageAMDCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLDebugMessageAMDCallback) {
            return (GLDebugMessageAMDCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLDebugMessageAMDCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLDebugMessageAMDCallback create(GLDebugMessageAMDCallbackI instance) {
        if (instance instanceof GLDebugMessageAMDCallback) {
            return (GLDebugMessageAMDCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLDebugMessageAMDCallback() {
        super(DESCRIPTOR);
    }

    GLDebugMessageAMDCallback(long functionPointer) {
        super(functionPointer);
    }

    public static String getMessage(int length, long message) {
        return MemoryUtil.memUTF8(MemoryUtil.memByteBuffer(message, length));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageAMDCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageAMDCallback$Container.class */
    private static final class Container extends GLDebugMessageAMDCallback {
        private final GLDebugMessageAMDCallbackI delegate;

        Container(long functionPointer, GLDebugMessageAMDCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.opengl.GLDebugMessageAMDCallbackI
        public void invoke(int id, int category, int severity, int length, long message, long userParam) {
            this.delegate.invoke(id, category, severity, length, message, userParam);
        }
    }
}
