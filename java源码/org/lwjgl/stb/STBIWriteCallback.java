package org.lwjgl.stb;

import java.nio.ByteBuffer;
import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBIWriteCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIWriteCallback.class */
public abstract class STBIWriteCallback extends Callback implements STBIWriteCallbackI {
    public static STBIWriteCallback create(long functionPointer) {
        STBIWriteCallbackI instance = (STBIWriteCallbackI) Callback.get(functionPointer);
        if (instance instanceof STBIWriteCallback) {
            return (STBIWriteCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static STBIWriteCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static STBIWriteCallback create(STBIWriteCallbackI instance) {
        if (instance instanceof STBIWriteCallback) {
            return (STBIWriteCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected STBIWriteCallback() {
        super(DESCRIPTOR);
    }

    STBIWriteCallback(long functionPointer) {
        super(functionPointer);
    }

    public static ByteBuffer getData(long data, int size) {
        return MemoryUtil.memByteBuffer(data, size);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBIWriteCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIWriteCallback$Container.class */
    private static final class Container extends STBIWriteCallback {
        private final STBIWriteCallbackI delegate;

        Container(long functionPointer, STBIWriteCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.stb.STBIWriteCallbackI
        public void invoke(long context, long data, int size) {
            this.delegate.invoke(context, data, size);
        }
    }
}
