package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AppInit_func.class */
public abstract class SDL_AppInit_func extends Callback implements SDL_AppInit_funcI {
    public static SDL_AppInit_func create(long functionPointer) {
        SDL_AppInit_funcI instance = (SDL_AppInit_funcI) Callback.get(functionPointer);
        if (instance instanceof SDL_AppInit_func) {
            return (SDL_AppInit_func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_AppInit_func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_AppInit_func create(SDL_AppInit_funcI instance) {
        if (instance instanceof SDL_AppInit_func) {
            return (SDL_AppInit_func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_AppInit_func() {
        super(DESCRIPTOR);
    }

    SDL_AppInit_func(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AppInit_func$Container.class */
    private static final class Container extends SDL_AppInit_func {
        private final SDL_AppInit_funcI delegate;

        Container(long functionPointer, SDL_AppInit_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_AppInit_funcI
        public int invoke(long appstate, int argc, long argv) {
            return this.delegate.invoke(appstate, argc, argv);
        }
    }
}
