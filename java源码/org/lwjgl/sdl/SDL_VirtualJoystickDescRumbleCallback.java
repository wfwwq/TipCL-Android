package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescRumbleCallback.class */
public abstract class SDL_VirtualJoystickDescRumbleCallback extends Callback implements SDL_VirtualJoystickDescRumbleCallbackI {
    public static SDL_VirtualJoystickDescRumbleCallback create(long functionPointer) {
        SDL_VirtualJoystickDescRumbleCallbackI instance = (SDL_VirtualJoystickDescRumbleCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_VirtualJoystickDescRumbleCallback) {
            return (SDL_VirtualJoystickDescRumbleCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_VirtualJoystickDescRumbleCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_VirtualJoystickDescRumbleCallback create(SDL_VirtualJoystickDescRumbleCallbackI instance) {
        if (instance instanceof SDL_VirtualJoystickDescRumbleCallback) {
            return (SDL_VirtualJoystickDescRumbleCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescRumbleCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescRumbleCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescRumbleCallback$Container.class */
    private static final class Container extends SDL_VirtualJoystickDescRumbleCallback {
        private final SDL_VirtualJoystickDescRumbleCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescRumbleCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_VirtualJoystickDescRumbleCallbackI
        public boolean invoke(long userdata, short low_frequency_rumble, short high_frequency_rumble) {
            return this.delegate.invoke(userdata, low_frequency_rumble, high_frequency_rumble);
        }
    }
}
