package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_free_func.class */
public abstract class SDL_free_func extends Callback implements SDL_free_funcI {
    public static SDL_free_func create(long functionPointer) {
        SDL_free_funcI instance = (SDL_free_funcI) Callback.get(functionPointer);
        if (instance instanceof SDL_free_func) {
            return (SDL_free_func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_free_func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_free_func create(SDL_free_funcI instance) {
        if (instance instanceof SDL_free_func) {
            return (SDL_free_func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_free_func() {
        super(DESCRIPTOR);
    }

    SDL_free_func(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_free_func$Container.class */
    private static final class Container extends SDL_free_func {
        private final SDL_free_funcI delegate;

        Container(long functionPointer, SDL_free_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_free_funcI
        public void invoke(long mem) {
            this.delegate.invoke(mem);
        }
    }
}
