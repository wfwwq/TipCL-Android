package org.lwjgl.opengl;

import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageARBCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageARBCallback.class */
public abstract class GLDebugMessageARBCallback extends Callback implements GLDebugMessageARBCallbackI {
    public static GLDebugMessageARBCallback create(long functionPointer) {
        GLDebugMessageARBCallbackI instance = (GLDebugMessageARBCallbackI) Callback.get(functionPointer);
        if (instance instanceof GLDebugMessageARBCallback) {
            return (GLDebugMessageARBCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLDebugMessageARBCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLDebugMessageARBCallback create(GLDebugMessageARBCallbackI instance) {
        if (instance instanceof GLDebugMessageARBCallback) {
            return (GLDebugMessageARBCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLDebugMessageARBCallback() {
        super(DESCRIPTOR);
    }

    GLDebugMessageARBCallback(long functionPointer) {
        super(functionPointer);
    }

    public static String getMessage(int length, long message) {
        return MemoryUtil.memUTF8(MemoryUtil.memByteBuffer(message, length));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageARBCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLDebugMessageARBCallback$Container.class */
    private static final class Container extends GLDebugMessageARBCallback {
        private final GLDebugMessageARBCallbackI delegate;

        Container(long functionPointer, GLDebugMessageARBCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.opengl.GLDebugMessageARBCallbackI
        public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
            this.delegate.invoke(source, type, id, severity, length, message, userParam);
        }
    }
}
