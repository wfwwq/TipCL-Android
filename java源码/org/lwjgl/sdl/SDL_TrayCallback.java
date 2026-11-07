package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TrayCallback.class */
public abstract class SDL_TrayCallback extends Callback implements SDL_TrayCallbackI {
    public static SDL_TrayCallback create(long functionPointer) {
        SDL_TrayCallbackI instance = (SDL_TrayCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_TrayCallback) {
            return (SDL_TrayCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_TrayCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_TrayCallback create(SDL_TrayCallbackI instance) {
        if (instance instanceof SDL_TrayCallback) {
            return (SDL_TrayCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_TrayCallback() {
        super(DESCRIPTOR);
    }

    SDL_TrayCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TrayCallback$Container.class */
    private static final class Container extends SDL_TrayCallback {
        private final SDL_TrayCallbackI delegate;

        Container(long functionPointer, SDL_TrayCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_TrayCallbackI
        public void invoke(long userdata, long entry) {
            this.delegate.invoke(userdata, entry);
        }
    }
}
