package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AudioStreamDataCompleteCallback.class */
public abstract class SDL_AudioStreamDataCompleteCallback extends Callback implements SDL_AudioStreamDataCompleteCallbackI {
    public static SDL_AudioStreamDataCompleteCallback create(long functionPointer) {
        SDL_AudioStreamDataCompleteCallbackI instance = (SDL_AudioStreamDataCompleteCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_AudioStreamDataCompleteCallback) {
            return (SDL_AudioStreamDataCompleteCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_AudioStreamDataCompleteCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_AudioStreamDataCompleteCallback create(SDL_AudioStreamDataCompleteCallbackI instance) {
        if (instance instanceof SDL_AudioStreamDataCompleteCallback) {
            return (SDL_AudioStreamDataCompleteCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_AudioStreamDataCompleteCallback() {
        super(DESCRIPTOR);
    }

    SDL_AudioStreamDataCompleteCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AudioStreamDataCompleteCallback$Container.class */
    private static final class Container extends SDL_AudioStreamDataCompleteCallback {
        private final SDL_AudioStreamDataCompleteCallbackI delegate;

        Container(long functionPointer, SDL_AudioStreamDataCompleteCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_AudioStreamDataCompleteCallbackI
        public void invoke(long userdata, long buf, int buflen) {
            this.delegate.invoke(userdata, buf, buflen);
        }
    }
}
