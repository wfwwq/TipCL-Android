package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AudioStreamCallback.class */
public abstract class SDL_AudioStreamCallback extends Callback implements SDL_AudioStreamCallbackI {
    public static SDL_AudioStreamCallback create(long functionPointer) {
        SDL_AudioStreamCallbackI instance = (SDL_AudioStreamCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_AudioStreamCallback) {
            return (SDL_AudioStreamCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_AudioStreamCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_AudioStreamCallback create(SDL_AudioStreamCallbackI instance) {
        if (instance instanceof SDL_AudioStreamCallback) {
            return (SDL_AudioStreamCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_AudioStreamCallback() {
        super(DESCRIPTOR);
    }

    SDL_AudioStreamCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AudioStreamCallback$Container.class */
    private static final class Container extends SDL_AudioStreamCallback {
        private final SDL_AudioStreamCallbackI delegate;

        Container(long functionPointer, SDL_AudioStreamCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_AudioStreamCallbackI
        public void invoke(long userdata, long stream, int additional_amount, int total_amount) {
            this.delegate.invoke(userdata, stream, additional_amount, total_amount);
        }
    }
}
