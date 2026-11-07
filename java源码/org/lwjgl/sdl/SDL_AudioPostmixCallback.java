package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AudioPostmixCallback.class */
public abstract class SDL_AudioPostmixCallback extends Callback implements SDL_AudioPostmixCallbackI {
    public static SDL_AudioPostmixCallback create(long functionPointer) {
        SDL_AudioPostmixCallbackI instance = (SDL_AudioPostmixCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_AudioPostmixCallback) {
            return (SDL_AudioPostmixCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_AudioPostmixCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_AudioPostmixCallback create(SDL_AudioPostmixCallbackI instance) {
        if (instance instanceof SDL_AudioPostmixCallback) {
            return (SDL_AudioPostmixCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_AudioPostmixCallback() {
        super(DESCRIPTOR);
    }

    SDL_AudioPostmixCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AudioPostmixCallback$Container.class */
    private static final class Container extends SDL_AudioPostmixCallback {
        private final SDL_AudioPostmixCallbackI delegate;

        Container(long functionPointer, SDL_AudioPostmixCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_AudioPostmixCallbackI
        public void invoke(long userdata, long spec, long buffer, int buflen) {
            this.delegate.invoke(userdata, spec, buffer, buflen);
        }
    }
}
