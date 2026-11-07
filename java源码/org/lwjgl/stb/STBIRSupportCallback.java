package org.lwjgl.stb;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIRSupportCallback.class */
public abstract class STBIRSupportCallback extends Callback implements STBIRSupportCallbackI {
    public static STBIRSupportCallback create(long functionPointer) {
        STBIRSupportCallbackI instance = (STBIRSupportCallbackI) Callback.get(functionPointer);
        if (instance instanceof STBIRSupportCallback) {
            return (STBIRSupportCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static STBIRSupportCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static STBIRSupportCallback create(STBIRSupportCallbackI instance) {
        if (instance instanceof STBIRSupportCallback) {
            return (STBIRSupportCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected STBIRSupportCallback() {
        super(DESCRIPTOR);
    }

    STBIRSupportCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIRSupportCallback$Container.class */
    private static final class Container extends STBIRSupportCallback {
        private final STBIRSupportCallbackI delegate;

        Container(long functionPointer, STBIRSupportCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.stb.STBIRSupportCallbackI
        public float invoke(float scale, long user_data) {
            return this.delegate.invoke(scale, user_data);
        }
    }
}
