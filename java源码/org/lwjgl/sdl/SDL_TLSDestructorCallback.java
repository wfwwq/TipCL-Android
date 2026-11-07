package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TLSDestructorCallback.class */
public abstract class SDL_TLSDestructorCallback extends Callback implements SDL_TLSDestructorCallbackI {
    public static SDL_TLSDestructorCallback create(long functionPointer) {
        SDL_TLSDestructorCallbackI instance = (SDL_TLSDestructorCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_TLSDestructorCallback) {
            return (SDL_TLSDestructorCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_TLSDestructorCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_TLSDestructorCallback create(SDL_TLSDestructorCallbackI instance) {
        if (instance instanceof SDL_TLSDestructorCallback) {
            return (SDL_TLSDestructorCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_TLSDestructorCallback() {
        super(DESCRIPTOR);
    }

    SDL_TLSDestructorCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TLSDestructorCallback$Container.class */
    private static final class Container extends SDL_TLSDestructorCallback {
        private final SDL_TLSDestructorCallbackI delegate;

        Container(long functionPointer, SDL_TLSDestructorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_TLSDestructorCallbackI
        public void invoke(long value) {
            this.delegate.invoke(value);
        }
    }
}
