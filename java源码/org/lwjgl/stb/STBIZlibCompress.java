package org.lwjgl.stb;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBIZlibCompress.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIZlibCompress.class */
public abstract class STBIZlibCompress extends Callback implements STBIZlibCompressI {
    public static STBIZlibCompress create(long functionPointer) {
        STBIZlibCompressI instance = (STBIZlibCompressI) Callback.get(functionPointer);
        if (instance instanceof STBIZlibCompress) {
            return (STBIZlibCompress) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static STBIZlibCompress createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static STBIZlibCompress create(STBIZlibCompressI instance) {
        if (instance instanceof STBIZlibCompress) {
            return (STBIZlibCompress) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected STBIZlibCompress() {
        super(DESCRIPTOR);
    }

    STBIZlibCompress(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBIZlibCompress$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIZlibCompress$Container.class */
    private static final class Container extends STBIZlibCompress {
        private final STBIZlibCompressI delegate;

        Container(long functionPointer, STBIZlibCompressI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.stb.STBIZlibCompressI
        public long invoke(long data, int data_len, long out_len, int quality) {
            return this.delegate.invoke(data, data_len, out_len, quality);
        }
    }
}
