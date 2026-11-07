package org.lwjgl.stb;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBISkipCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBISkipCallback.class */
public abstract class STBISkipCallback extends Callback implements STBISkipCallbackI {
    public static STBISkipCallback create(long functionPointer) {
        STBISkipCallbackI instance = (STBISkipCallbackI) Callback.get(functionPointer);
        if (instance instanceof STBISkipCallback) {
            return (STBISkipCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static STBISkipCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static STBISkipCallback create(STBISkipCallbackI instance) {
        if (instance instanceof STBISkipCallback) {
            return (STBISkipCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected STBISkipCallback() {
        super(DESCRIPTOR);
    }

    STBISkipCallback(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBISkipCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBISkipCallback$Container.class */
    private static final class Container extends STBISkipCallback {
        private final STBISkipCallbackI delegate;

        Container(long functionPointer, STBISkipCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.stb.STBISkipCallbackI
        public void invoke(long user, int n) {
            this.delegate.invoke(user, n);
        }
    }
}
