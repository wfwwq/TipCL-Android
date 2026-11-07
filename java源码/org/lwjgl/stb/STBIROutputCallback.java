package org.lwjgl.stb;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIROutputCallback.class */
public abstract class STBIROutputCallback extends Callback implements STBIROutputCallbackI {
    public static STBIROutputCallback create(long functionPointer) {
        STBIROutputCallbackI instance = (STBIROutputCallbackI) Callback.get(functionPointer);
        if (instance instanceof STBIROutputCallback) {
            return (STBIROutputCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static STBIROutputCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static STBIROutputCallback create(STBIROutputCallbackI instance) {
        if (instance instanceof STBIROutputCallback) {
            return (STBIROutputCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected STBIROutputCallback() {
        super(DESCRIPTOR);
    }

    STBIROutputCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIROutputCallback$Container.class */
    private static final class Container extends STBIROutputCallback {
        private final STBIROutputCallbackI delegate;

        Container(long functionPointer, STBIROutputCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.stb.STBIROutputCallbackI
        public void invoke(long output_ptr, int num_pixels, int x, int y, long context) {
            this.delegate.invoke(output_ptr, num_pixels, x, y, context);
        }
    }
}
