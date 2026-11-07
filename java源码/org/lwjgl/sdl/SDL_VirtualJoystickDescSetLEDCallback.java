package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescSetLEDCallback.class */
public abstract class SDL_VirtualJoystickDescSetLEDCallback extends Callback implements SDL_VirtualJoystickDescSetLEDCallbackI {
    public static SDL_VirtualJoystickDescSetLEDCallback create(long functionPointer) {
        SDL_VirtualJoystickDescSetLEDCallbackI instance = (SDL_VirtualJoystickDescSetLEDCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_VirtualJoystickDescSetLEDCallback) {
            return (SDL_VirtualJoystickDescSetLEDCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_VirtualJoystickDescSetLEDCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_VirtualJoystickDescSetLEDCallback create(SDL_VirtualJoystickDescSetLEDCallbackI instance) {
        if (instance instanceof SDL_VirtualJoystickDescSetLEDCallback) {
            return (SDL_VirtualJoystickDescSetLEDCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescSetLEDCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescSetLEDCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescSetLEDCallback$Container.class */
    private static final class Container extends SDL_VirtualJoystickDescSetLEDCallback {
        private final SDL_VirtualJoystickDescSetLEDCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescSetLEDCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_VirtualJoystickDescSetLEDCallbackI
        public boolean invoke(long userdata, byte red, byte green, byte blue) {
            return this.delegate.invoke(userdata, red, green, blue);
        }
    }
}
