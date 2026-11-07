package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescSetSensorsEnabledCallback.class */
public abstract class SDL_VirtualJoystickDescSetSensorsEnabledCallback extends Callback implements SDL_VirtualJoystickDescSetSensorsEnabledCallbackI {
    public static SDL_VirtualJoystickDescSetSensorsEnabledCallback create(long functionPointer) {
        SDL_VirtualJoystickDescSetSensorsEnabledCallbackI instance = (SDL_VirtualJoystickDescSetSensorsEnabledCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_VirtualJoystickDescSetSensorsEnabledCallback) {
            return (SDL_VirtualJoystickDescSetSensorsEnabledCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_VirtualJoystickDescSetSensorsEnabledCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_VirtualJoystickDescSetSensorsEnabledCallback create(SDL_VirtualJoystickDescSetSensorsEnabledCallbackI instance) {
        if (instance instanceof SDL_VirtualJoystickDescSetSensorsEnabledCallback) {
            return (SDL_VirtualJoystickDescSetSensorsEnabledCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescSetSensorsEnabledCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescSetSensorsEnabledCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescSetSensorsEnabledCallback$Container.class */
    private static final class Container extends SDL_VirtualJoystickDescSetSensorsEnabledCallback {
        private final SDL_VirtualJoystickDescSetSensorsEnabledCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescSetSensorsEnabledCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_VirtualJoystickDescSetSensorsEnabledCallbackI
        public boolean invoke(long userdata, boolean enabled) {
            return this.delegate.invoke(userdata, enabled);
        }
    }
}
