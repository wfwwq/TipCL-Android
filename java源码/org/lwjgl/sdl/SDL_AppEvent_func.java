package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AppEvent_func.class */
public abstract class SDL_AppEvent_func extends Callback implements SDL_AppEvent_funcI {
    public static SDL_AppEvent_func create(long functionPointer) {
        SDL_AppEvent_funcI instance = (SDL_AppEvent_funcI) Callback.get(functionPointer);
        if (instance instanceof SDL_AppEvent_func) {
            return (SDL_AppEvent_func) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_AppEvent_func createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_AppEvent_func create(SDL_AppEvent_funcI instance) {
        if (instance instanceof SDL_AppEvent_func) {
            return (SDL_AppEvent_func) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_AppEvent_func() {
        super(DESCRIPTOR);
    }

    SDL_AppEvent_func(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AppEvent_func$Container.class */
    private static final class Container extends SDL_AppEvent_func {
        private final SDL_AppEvent_funcI delegate;

        Container(long functionPointer, SDL_AppEvent_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_AppEvent_funcI
        public int invoke(long appstate, long event) {
            return this.delegate.invoke(appstate, event);
        }
    }
}
