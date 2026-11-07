package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AppQuit_func.class */
public abstract class SDL_AppQuit_func extends Callback implements SDL_AppQuit_funcI {
    public static SDL_AppQuit_func create(long functionPointer) {
        SDL_AppQuit_funcI instance = (SDL_AppQuit_funcI) Callback.get(functionPointer);
        if (instance instanceof SDL_AppQuit_func) {
            return (SDL_AppQuit_func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_AppQuit_func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_AppQuit_func create(SDL_AppQuit_funcI instance) {
        if (instance instanceof SDL_AppQuit_func) {
            return (SDL_AppQuit_func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_AppQuit_func() {
        super(DESCRIPTOR);
    }

    SDL_AppQuit_func(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AppQuit_func$Container.class */
    private static final class Container extends SDL_AppQuit_func {
        private final SDL_AppQuit_funcI delegate;

        Container(long functionPointer, SDL_AppQuit_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_AppQuit_funcI
        public void invoke(long appstate, int result) {
            this.delegate.invoke(appstate, result);
        }
    }
}
