package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_EGLIntArrayCallback.class */
public abstract class SDL_EGLIntArrayCallback extends Callback implements SDL_EGLIntArrayCallbackI {
    public static SDL_EGLIntArrayCallback create(long functionPointer) {
        SDL_EGLIntArrayCallbackI instance = (SDL_EGLIntArrayCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_EGLIntArrayCallback) {
            return (SDL_EGLIntArrayCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_EGLIntArrayCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_EGLIntArrayCallback create(SDL_EGLIntArrayCallbackI instance) {
        if (instance instanceof SDL_EGLIntArrayCallback) {
            return (SDL_EGLIntArrayCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_EGLIntArrayCallback() {
        super(DESCRIPTOR);
    }

    SDL_EGLIntArrayCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_EGLIntArrayCallback$Container.class */
    private static final class Container extends SDL_EGLIntArrayCallback {
        private final SDL_EGLIntArrayCallbackI delegate;

        Container(long functionPointer, SDL_EGLIntArrayCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_EGLIntArrayCallbackI
        public long invoke(long userdata, long display, long config) {
            return this.delegate.invoke(userdata, display, config);
        }
    }
}
