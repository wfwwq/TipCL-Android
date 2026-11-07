package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CompareCallback_r.class */
public abstract class SDL_CompareCallback_r extends Callback implements SDL_CompareCallback_rI {
    public static SDL_CompareCallback_r create(long functionPointer) {
        SDL_CompareCallback_rI instance = (SDL_CompareCallback_rI) Callback.get(functionPointer);
        if (instance instanceof SDL_CompareCallback_r) {
            return (SDL_CompareCallback_r) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_CompareCallback_r createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_CompareCallback_r create(SDL_CompareCallback_rI instance) {
        if (instance instanceof SDL_CompareCallback_r) {
            return (SDL_CompareCallback_r) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_CompareCallback_r() {
        super(DESCRIPTOR);
    }

    SDL_CompareCallback_r(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CompareCallback_r$Container.class */
    private static final class Container extends SDL_CompareCallback_r {
        private final SDL_CompareCallback_rI delegate;

        Container(long functionPointer, SDL_CompareCallback_rI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_CompareCallback_rI
        public int invoke(long userdata, long a, long b) {
            return this.delegate.invoke(userdata, a, b);
        }
    }
}
