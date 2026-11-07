package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescSendEffectCallback.class */
public abstract class SDL_VirtualJoystickDescSendEffectCallback extends Callback implements SDL_VirtualJoystickDescSendEffectCallbackI {
    public static SDL_VirtualJoystickDescSendEffectCallback create(long functionPointer) {
        SDL_VirtualJoystickDescSendEffectCallbackI instance = (SDL_VirtualJoystickDescSendEffectCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_VirtualJoystickDescSendEffectCallback) {
            return (SDL_VirtualJoystickDescSendEffectCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_VirtualJoystickDescSendEffectCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_VirtualJoystickDescSendEffectCallback create(SDL_VirtualJoystickDescSendEffectCallbackI instance) {
        if (instance instanceof SDL_VirtualJoystickDescSendEffectCallback) {
            return (SDL_VirtualJoystickDescSendEffectCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescSendEffectCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescSendEffectCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescSendEffectCallback$Container.class */
    private static final class Container extends SDL_VirtualJoystickDescSendEffectCallback {
        private final SDL_VirtualJoystickDescSendEffectCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescSendEffectCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_VirtualJoystickDescSendEffectCallbackI
        public boolean invoke(long userdata, long data, int size) {
            return this.delegate.invoke(userdata, data, size);
        }
    }
}
