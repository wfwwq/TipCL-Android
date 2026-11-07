package org.lwjgl.util.spng;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_free_fn.class */
public abstract class spng_free_fn extends Callback implements spng_free_fnI {
    public static spng_free_fn create(long functionPointer) {
        spng_free_fnI instance = (spng_free_fnI) Callback.get(functionPointer);
        if (instance instanceof spng_free_fn) {
            return (spng_free_fn) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static spng_free_fn createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static spng_free_fn create(spng_free_fnI instance) {
        if (instance instanceof spng_free_fn) {
            return (spng_free_fn) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected spng_free_fn() {
        super(DESCRIPTOR);
    }

    spng_free_fn(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_free_fn$Container.class */
    private static final class Container extends spng_free_fn {
        private final spng_free_fnI delegate;

        Container(long functionPointer, spng_free_fnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.spng.spng_free_fnI
        public void invoke(long ptr) {
            this.delegate.invoke(ptr);
        }
    }
}
