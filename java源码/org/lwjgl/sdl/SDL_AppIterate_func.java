package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AppIterate_func.class */
public abstract class SDL_AppIterate_func extends Callback implements SDL_AppIterate_funcI {
    public static SDL_AppIterate_func create(long functionPointer) {
        SDL_AppIterate_funcI instance = (SDL_AppIterate_funcI) Callback.get(functionPointer);
        if (instance instanceof SDL_AppIterate_func) {
            return (SDL_AppIterate_func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_AppIterate_func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_AppIterate_func create(SDL_AppIterate_funcI instance) {
        if (instance instanceof SDL_AppIterate_func) {
            return (SDL_AppIterate_func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_AppIterate_func() {
        super(DESCRIPTOR);
    }

    SDL_AppIterate_func(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AppIterate_func$Container.class */
    private static final class Container extends SDL_AppIterate_func {
        private final SDL_AppIterate_funcI delegate;

        Container(long functionPointer, SDL_AppIterate_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_AppIterate_funcI
        public int invoke(long appstate) {
            return this.delegate.invoke(appstate);
        }
    }
}
