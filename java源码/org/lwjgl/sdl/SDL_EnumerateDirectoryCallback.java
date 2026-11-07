package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_EnumerateDirectoryCallback.class */
public abstract class SDL_EnumerateDirectoryCallback extends Callback implements SDL_EnumerateDirectoryCallbackI {
    public static SDL_EnumerateDirectoryCallback create(long functionPointer) {
        SDL_EnumerateDirectoryCallbackI instance = (SDL_EnumerateDirectoryCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_EnumerateDirectoryCallback) {
            return (SDL_EnumerateDirectoryCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_EnumerateDirectoryCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_EnumerateDirectoryCallback create(SDL_EnumerateDirectoryCallbackI instance) {
        if (instance instanceof SDL_EnumerateDirectoryCallback) {
            return (SDL_EnumerateDirectoryCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_EnumerateDirectoryCallback() {
        super(DESCRIPTOR);
    }

    SDL_EnumerateDirectoryCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_EnumerateDirectoryCallback$Container.class */
    private static final class Container extends SDL_EnumerateDirectoryCallback {
        private final SDL_EnumerateDirectoryCallbackI delegate;

        Container(long functionPointer, SDL_EnumerateDirectoryCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_EnumerateDirectoryCallbackI
        public int invoke(long userdata, long dirname, long fname) {
            return this.delegate.invoke(userdata, dirname, fname);
        }
    }
}
