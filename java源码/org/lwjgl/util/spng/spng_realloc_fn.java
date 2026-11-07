package org.lwjgl.util.spng;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_realloc_fn.class */
public abstract class spng_realloc_fn extends Callback implements spng_realloc_fnI {
    public static spng_realloc_fn create(long functionPointer) {
        spng_realloc_fnI instance = (spng_realloc_fnI) Callback.get(functionPointer);
        if (instance instanceof spng_realloc_fn) {
            return (spng_realloc_fn) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static spng_realloc_fn createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static spng_realloc_fn create(spng_realloc_fnI instance) {
        if (instance instanceof spng_realloc_fn) {
            return (spng_realloc_fn) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected spng_realloc_fn() {
        super(DESCRIPTOR);
    }

    spng_realloc_fn(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_realloc_fn$Container.class */
    private static final class Container extends spng_realloc_fn {
        private final spng_realloc_fnI delegate;

        Container(long functionPointer, spng_realloc_fnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.spng.spng_realloc_fnI
        public long invoke(long ptr, long size) {
            return this.delegate.invoke(ptr, size);
        }
    }
}
