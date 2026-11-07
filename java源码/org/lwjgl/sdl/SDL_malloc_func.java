package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_malloc_func.class */
public abstract class SDL_malloc_func extends Callback implements SDL_malloc_funcI {
    public static SDL_malloc_func create(long functionPointer) {
        SDL_malloc_funcI instance = (SDL_malloc_funcI) Callback.get(functionPointer);
        if (instance instanceof SDL_malloc_func) {
            return (SDL_malloc_func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_malloc_func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_malloc_func create(SDL_malloc_funcI instance) {
        if (instance instanceof SDL_malloc_func) {
            return (SDL_malloc_func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_malloc_func() {
        super(DESCRIPTOR);
    }

    SDL_malloc_func(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_malloc_func$Container.class */
    private static final class Container extends SDL_malloc_func {
        private final SDL_malloc_funcI delegate;

        Container(long functionPointer, SDL_malloc_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_malloc_funcI
        public long invoke(long size) {
            return this.delegate.invoke(size);
        }
    }
}
