package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CleanupPropertyCallback.class */
public abstract class SDL_CleanupPropertyCallback extends Callback implements SDL_CleanupPropertyCallbackI {
    public static SDL_CleanupPropertyCallback create(long functionPointer) {
        SDL_CleanupPropertyCallbackI instance = (SDL_CleanupPropertyCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_CleanupPropertyCallback) {
            return (SDL_CleanupPropertyCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_CleanupPropertyCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_CleanupPropertyCallback create(SDL_CleanupPropertyCallbackI instance) {
        if (instance instanceof SDL_CleanupPropertyCallback) {
            return (SDL_CleanupPropertyCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_CleanupPropertyCallback() {
        super(DESCRIPTOR);
    }

    SDL_CleanupPropertyCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CleanupPropertyCallback$Container.class */
    private static final class Container extends SDL_CleanupPropertyCallback {
        private final SDL_CleanupPropertyCallbackI delegate;

        Container(long functionPointer, SDL_CleanupPropertyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_CleanupPropertyCallbackI
        public void invoke(long userdata, long value) {
            this.delegate.invoke(userdata, value);
        }
    }
}
