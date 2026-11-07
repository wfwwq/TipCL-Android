package org.lwjgl.util.spng;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_rw_fn.class */
public abstract class spng_rw_fn extends Callback implements spng_rw_fnI {
    public static spng_rw_fn create(long functionPointer) {
        spng_rw_fnI instance = (spng_rw_fnI) Callback.get(functionPointer);
        if (instance instanceof spng_rw_fn) {
            return (spng_rw_fn) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static spng_rw_fn createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static spng_rw_fn create(spng_rw_fnI instance) {
        if (instance instanceof spng_rw_fn) {
            return (spng_rw_fn) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected spng_rw_fn() {
        super(DESCRIPTOR);
    }

    spng_rw_fn(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_rw_fn$Container.class */
    private static final class Container extends spng_rw_fn {
        private final spng_rw_fnI delegate;

        Container(long functionPointer, spng_rw_fnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.spng.spng_rw_fnI
        public void invoke(long ctx, long user, long dest, long length) {
            this.delegate.invoke(ctx, user, dest, length);
        }
    }
}
