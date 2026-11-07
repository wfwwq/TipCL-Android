package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MainThreadCallback.class */
public abstract class SDL_MainThreadCallback extends Callback implements SDL_MainThreadCallbackI {
    public static SDL_MainThreadCallback create(long functionPointer) {
        SDL_MainThreadCallbackI instance = (SDL_MainThreadCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_MainThreadCallback) {
            return (SDL_MainThreadCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_MainThreadCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_MainThreadCallback create(SDL_MainThreadCallbackI instance) {
        if (instance instanceof SDL_MainThreadCallback) {
            return (SDL_MainThreadCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_MainThreadCallback() {
        super(DESCRIPTOR);
    }

    SDL_MainThreadCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MainThreadCallback$Container.class */
    private static final class Container extends SDL_MainThreadCallback {
        private final SDL_MainThreadCallbackI delegate;

        Container(long functionPointer, SDL_MainThreadCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_MainThreadCallbackI
        public void invoke(long userdata) {
            this.delegate.invoke(userdata);
        }
    }
}
