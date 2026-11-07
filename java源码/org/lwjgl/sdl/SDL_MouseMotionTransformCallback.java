package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MouseMotionTransformCallback.class */
public abstract class SDL_MouseMotionTransformCallback extends Callback implements SDL_MouseMotionTransformCallbackI {
    public static SDL_MouseMotionTransformCallback create(long functionPointer) {
        SDL_MouseMotionTransformCallbackI instance = (SDL_MouseMotionTransformCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_MouseMotionTransformCallback) {
            return (SDL_MouseMotionTransformCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_MouseMotionTransformCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_MouseMotionTransformCallback create(SDL_MouseMotionTransformCallbackI instance) {
        if (instance instanceof SDL_MouseMotionTransformCallback) {
            return (SDL_MouseMotionTransformCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_MouseMotionTransformCallback() {
        super(DESCRIPTOR);
    }

    SDL_MouseMotionTransformCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MouseMotionTransformCallback$Container.class */
    private static final class Container extends SDL_MouseMotionTransformCallback {
        private final SDL_MouseMotionTransformCallbackI delegate;

        Container(long functionPointer, SDL_MouseMotionTransformCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_MouseMotionTransformCallbackI
        public void invoke(long userdata, long timestamp, long window, int mouseID, long x, long y) {
            this.delegate.invoke(userdata, timestamp, window, mouseID, x, y);
        }
    }
}
