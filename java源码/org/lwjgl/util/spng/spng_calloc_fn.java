package org.lwjgl.util.spng;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_calloc_fn.class */
public abstract class spng_calloc_fn extends Callback implements spng_calloc_fnI {
    public static spng_calloc_fn create(long functionPointer) {
        spng_calloc_fnI instance = (spng_calloc_fnI) Callback.get(functionPointer);
        if (instance instanceof spng_calloc_fn) {
            return (spng_calloc_fn) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static spng_calloc_fn createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static spng_calloc_fn create(spng_calloc_fnI instance) {
        if (instance instanceof spng_calloc_fn) {
            return (spng_calloc_fn) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected spng_calloc_fn() {
        super(DESCRIPTOR);
    }

    spng_calloc_fn(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_calloc_fn$Container.class */
    private static final class Container extends spng_calloc_fn {
        private final spng_calloc_fnI delegate;

        Container(long functionPointer, spng_calloc_fnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.spng.spng_calloc_fnI
        public long invoke(long count, long size) {
            return this.delegate.invoke(count, size);
        }
    }
}
