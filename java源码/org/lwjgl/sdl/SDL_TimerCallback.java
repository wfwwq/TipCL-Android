package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TimerCallback.class */
public abstract class SDL_TimerCallback extends Callback implements SDL_TimerCallbackI {
    public static SDL_TimerCallback create(long functionPointer) {
        SDL_TimerCallbackI instance = (SDL_TimerCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_TimerCallback) {
            return (SDL_TimerCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_TimerCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_TimerCallback create(SDL_TimerCallbackI instance) {
        if (instance instanceof SDL_TimerCallback) {
            return (SDL_TimerCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_TimerCallback() {
        super(DESCRIPTOR);
    }

    SDL_TimerCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_TimerCallback$Container.class */
    private static final class Container extends SDL_TimerCallback {
        private final SDL_TimerCallbackI delegate;

        Container(long functionPointer, SDL_TimerCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_TimerCallbackI
        public int invoke(long userdata, int timerID, int interval) {
            return this.delegate.invoke(userdata, timerID, interval);
        }
    }
}
