package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_realloc_func.class */
public abstract class SDL_realloc_func extends Callback implements SDL_realloc_funcI {
    public static SDL_realloc_func create(long functionPointer) {
        SDL_realloc_funcI instance = (SDL_realloc_funcI) Callback.get(functionPointer);
        if (instance instanceof SDL_realloc_func) {
            return (SDL_realloc_func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_realloc_func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_realloc_func create(SDL_realloc_funcI instance) {
        if (instance instanceof SDL_realloc_func) {
            return (SDL_realloc_func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_realloc_func() {
        super(DESCRIPTOR);
    }

    SDL_realloc_func(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_realloc_func$Container.class */
    private static final class Container extends SDL_realloc_func {
        private final SDL_realloc_funcI delegate;

        Container(long functionPointer, SDL_realloc_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_realloc_funcI
        public long invoke(long mem, long size) {
            return this.delegate.invoke(mem, size);
        }
    }
}
