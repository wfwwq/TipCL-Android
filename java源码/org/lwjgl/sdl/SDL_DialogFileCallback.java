package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DialogFileCallback.class */
public abstract class SDL_DialogFileCallback extends Callback implements SDL_DialogFileCallbackI {
    public static SDL_DialogFileCallback create(long functionPointer) {
        SDL_DialogFileCallbackI instance = (SDL_DialogFileCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_DialogFileCallback) {
            return (SDL_DialogFileCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_DialogFileCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_DialogFileCallback create(SDL_DialogFileCallbackI instance) {
        if (instance instanceof SDL_DialogFileCallback) {
            return (SDL_DialogFileCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_DialogFileCallback() {
        super(DESCRIPTOR);
    }

    SDL_DialogFileCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DialogFileCallback$Container.class */
    private static final class Container extends SDL_DialogFileCallback {
        private final SDL_DialogFileCallbackI delegate;

        Container(long functionPointer, SDL_DialogFileCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_DialogFileCallbackI
        public void invoke(long userdata, long filelist, int filter) {
            this.delegate.invoke(userdata, filelist, filter);
        }
    }
}
