package org.lwjgl.stb;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIRKernelCallback.class */
public abstract class STBIRKernelCallback extends Callback implements STBIRKernelCallbackI {
    public static STBIRKernelCallback create(long functionPointer) {
        STBIRKernelCallbackI instance = (STBIRKernelCallbackI) Callback.get(functionPointer);
        if (instance instanceof STBIRKernelCallback) {
            return (STBIRKernelCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static STBIRKernelCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static STBIRKernelCallback create(STBIRKernelCallbackI instance) {
        if (instance instanceof STBIRKernelCallback) {
            return (STBIRKernelCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected STBIRKernelCallback() {
        super(DESCRIPTOR);
    }

    STBIRKernelCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIRKernelCallback$Container.class */
    private static final class Container extends STBIRKernelCallback {
        private final STBIRKernelCallbackI delegate;

        Container(long functionPointer, STBIRKernelCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.stb.STBIRKernelCallbackI
        public float invoke(float x, float scale, long user_data) {
            return this.delegate.invoke(x, scale, user_data);
        }
    }
}
