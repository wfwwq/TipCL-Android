package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CompareCallback.class */
public abstract class SDL_CompareCallback extends Callback implements SDL_CompareCallbackI {
    public static SDL_CompareCallback create(long functionPointer) {
        SDL_CompareCallbackI instance = (SDL_CompareCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_CompareCallback) {
            return (SDL_CompareCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_CompareCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_CompareCallback create(SDL_CompareCallbackI instance) {
        if (instance instanceof SDL_CompareCallback) {
            return (SDL_CompareCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_CompareCallback() {
        super(DESCRIPTOR);
    }

    SDL_CompareCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CompareCallback$Container.class */
    private static final class Container extends SDL_CompareCallback {
        private final SDL_CompareCallbackI delegate;

        Container(long functionPointer, SDL_CompareCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_CompareCallbackI
        public int invoke(long a, long b) {
            return this.delegate.invoke(a, b);
        }
    }
}
