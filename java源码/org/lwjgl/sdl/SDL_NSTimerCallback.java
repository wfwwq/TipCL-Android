package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_NSTimerCallback.class */
public abstract class SDL_NSTimerCallback extends Callback implements SDL_NSTimerCallbackI {
    public static SDL_NSTimerCallback create(long functionPointer) {
        SDL_NSTimerCallbackI instance = (SDL_NSTimerCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_NSTimerCallback) {
            return (SDL_NSTimerCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_NSTimerCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_NSTimerCallback create(SDL_NSTimerCallbackI instance) {
        if (instance instanceof SDL_NSTimerCallback) {
            return (SDL_NSTimerCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_NSTimerCallback() {
        super(DESCRIPTOR);
    }

    SDL_NSTimerCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_NSTimerCallback$Container.class */
    private static final class Container extends SDL_NSTimerCallback {
        private final SDL_NSTimerCallbackI delegate;

        Container(long functionPointer, SDL_NSTimerCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_NSTimerCallbackI
        public long invoke(long userdata, int timerID, long interval) {
            return this.delegate.invoke(userdata, timerID, interval);
        }
    }
}
