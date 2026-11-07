package org.lwjgl.stb;

import java.nio.ByteBuffer;
import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBIReadCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIReadCallback.class */
public abstract class STBIReadCallback extends Callback implements STBIReadCallbackI {
    public static STBIReadCallback create(long functionPointer) {
        STBIReadCallbackI instance = (STBIReadCallbackI) Callback.get(functionPointer);
        if (instance instanceof STBIReadCallback) {
            return (STBIReadCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static STBIReadCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static STBIReadCallback create(STBIReadCallbackI instance) {
        if (instance instanceof STBIReadCallback) {
            return (STBIReadCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected STBIReadCallback() {
        super(DESCRIPTOR);
    }

    STBIReadCallback(long functionPointer) {
        super(functionPointer);
    }

    public static ByteBuffer getData(long data, int size) {
        return MemoryUtil.memByteBuffer(data, size);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBIReadCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIReadCallback$Container.class */
    private static final class Container extends STBIReadCallback {
        private final STBIReadCallbackI delegate;

        Container(long functionPointer, STBIReadCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.stb.STBIReadCallbackI
        public int invoke(long user, long data, int size) {
            return this.delegate.invoke(user, data, size);
        }
    }
}
