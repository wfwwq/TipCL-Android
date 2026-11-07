package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_EGLAttribArrayCallback.class */
public abstract class SDL_EGLAttribArrayCallback extends Callback implements SDL_EGLAttribArrayCallbackI {
    public static SDL_EGLAttribArrayCallback create(long functionPointer) {
        SDL_EGLAttribArrayCallbackI instance = (SDL_EGLAttribArrayCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_EGLAttribArrayCallback) {
            return (SDL_EGLAttribArrayCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_EGLAttribArrayCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_EGLAttribArrayCallback create(SDL_EGLAttribArrayCallbackI instance) {
        if (instance instanceof SDL_EGLAttribArrayCallback) {
            return (SDL_EGLAttribArrayCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_EGLAttribArrayCallback() {
        super(DESCRIPTOR);
    }

    SDL_EGLAttribArrayCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_EGLAttribArrayCallback$Container.class */
    private static final class Container extends SDL_EGLAttribArrayCallback {
        private final SDL_EGLAttribArrayCallbackI delegate;

        Container(long functionPointer, SDL_EGLAttribArrayCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_EGLAttribArrayCallbackI
        public long invoke(long userdata) {
            return this.delegate.invoke(userdata);
        }
    }
}
