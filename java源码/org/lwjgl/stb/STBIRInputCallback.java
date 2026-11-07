package org.lwjgl.stb;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIRInputCallback.class */
public abstract class STBIRInputCallback extends Callback implements STBIRInputCallbackI {
    public static STBIRInputCallback create(long functionPointer) {
        STBIRInputCallbackI instance = (STBIRInputCallbackI) Callback.get(functionPointer);
        if (instance instanceof STBIRInputCallback) {
            return (STBIRInputCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static STBIRInputCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static STBIRInputCallback create(STBIRInputCallbackI instance) {
        if (instance instanceof STBIRInputCallback) {
            return (STBIRInputCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected STBIRInputCallback() {
        super(DESCRIPTOR);
    }

    STBIRInputCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIRInputCallback$Container.class */
    private static final class Container extends STBIRInputCallback {
        private final STBIRInputCallbackI delegate;

        Container(long functionPointer, STBIRInputCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.stb.STBIRInputCallbackI
        public void invoke(long optional_output, long input_ptr, int num_pixels, int x, int y, long context) {
            this.delegate.invoke(optional_output, input_ptr, num_pixels, x, y, context);
        }
    }
}
