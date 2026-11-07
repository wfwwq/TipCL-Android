package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_main_func.class */
public abstract class SDL_main_func extends Callback implements SDL_main_funcI {
    public static SDL_main_func create(long functionPointer) {
        SDL_main_funcI instance = (SDL_main_funcI) Callback.get(functionPointer);
        if (instance instanceof SDL_main_func) {
            return (SDL_main_func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_main_func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_main_func create(SDL_main_funcI instance) {
        if (instance instanceof SDL_main_func) {
            return (SDL_main_func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_main_func() {
        super(DESCRIPTOR);
    }

    SDL_main_func(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_main_func$Container.class */
    private static final class Container extends SDL_main_func {
        private final SDL_main_funcI delegate;

        Container(long functionPointer, SDL_main_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_main_funcI
        public int invoke(int argc, long argv) {
            return this.delegate.invoke(argc, argv);
        }
    }
}
