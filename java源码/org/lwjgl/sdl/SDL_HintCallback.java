package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HintCallback.class */
public abstract class SDL_HintCallback extends Callback implements SDL_HintCallbackI {
    public static SDL_HintCallback create(long functionPointer) {
        SDL_HintCallbackI instance = (SDL_HintCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_HintCallback) {
            return (SDL_HintCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_HintCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_HintCallback create(SDL_HintCallbackI instance) {
        if (instance instanceof SDL_HintCallback) {
            return (SDL_HintCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_HintCallback() {
        super(DESCRIPTOR);
    }

    SDL_HintCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HintCallback$Container.class */
    private static final class Container extends SDL_HintCallback {
        private final SDL_HintCallbackI delegate;

        Container(long functionPointer, SDL_HintCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_HintCallbackI
        public void invoke(long userdata, long name, long oldValue, long newValue) {
            this.delegate.invoke(userdata, name, oldValue, newValue);
        }
    }
}
