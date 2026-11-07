package org.lwjgl.stb;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBIEOFCallback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIEOFCallback.class */
public abstract class STBIEOFCallback extends Callback implements STBIEOFCallbackI {
    public static STBIEOFCallback create(long functionPointer) {
        STBIEOFCallbackI instance = (STBIEOFCallbackI) Callback.get(functionPointer);
        if (instance instanceof STBIEOFCallback) {
            return (STBIEOFCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static STBIEOFCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static STBIEOFCallback create(STBIEOFCallbackI instance) {
        if (instance instanceof STBIEOFCallback) {
            return (STBIEOFCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected STBIEOFCallback() {
        super(DESCRIPTOR);
    }

    STBIEOFCallback(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBIEOFCallback$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIEOFCallback$Container.class */
    private static final class Container extends STBIEOFCallback {
        private final STBIEOFCallbackI delegate;

        Container(long functionPointer, STBIEOFCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.stb.STBIEOFCallbackI
        public int invoke(long user) {
            return this.delegate.invoke(user);
        }
    }
}
