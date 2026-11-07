package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescUpdateCallback.class */
public abstract class SDL_VirtualJoystickDescUpdateCallback extends Callback implements SDL_VirtualJoystickDescUpdateCallbackI {
    public static SDL_VirtualJoystickDescUpdateCallback create(long functionPointer) {
        SDL_VirtualJoystickDescUpdateCallbackI instance = (SDL_VirtualJoystickDescUpdateCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_VirtualJoystickDescUpdateCallback) {
            return (SDL_VirtualJoystickDescUpdateCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_VirtualJoystickDescUpdateCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_VirtualJoystickDescUpdateCallback create(SDL_VirtualJoystickDescUpdateCallbackI instance) {
        if (instance instanceof SDL_VirtualJoystickDescUpdateCallback) {
            return (SDL_VirtualJoystickDescUpdateCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescUpdateCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescUpdateCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescUpdateCallback$Container.class */
    private static final class Container extends SDL_VirtualJoystickDescUpdateCallback {
        private final SDL_VirtualJoystickDescUpdateCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescUpdateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_VirtualJoystickDescUpdateCallbackI
        public void invoke(long userdata) {
            this.delegate.invoke(userdata);
        }
    }
}
