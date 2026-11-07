package org.lwjgl.util.spng;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_malloc_fn.class */
public abstract class spng_malloc_fn extends Callback implements spng_malloc_fnI {
    public static spng_malloc_fn create(long functionPointer) {
        spng_malloc_fnI instance = (spng_malloc_fnI) Callback.get(functionPointer);
        if (instance instanceof spng_malloc_fn) {
            return (spng_malloc_fn) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static spng_malloc_fn createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static spng_malloc_fn create(spng_malloc_fnI instance) {
        if (instance instanceof spng_malloc_fn) {
            return (spng_malloc_fn) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected spng_malloc_fn() {
        super(DESCRIPTOR);
    }

    spng_malloc_fn(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_malloc_fn$Container.class */
    private static final class Container extends spng_malloc_fn {
        private final spng_malloc_fnI delegate;

        Container(long functionPointer, spng_malloc_fnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.spng.spng_malloc_fnI
        public long invoke(long size) {
            return this.delegate.invoke(size);
        }
    }
}
