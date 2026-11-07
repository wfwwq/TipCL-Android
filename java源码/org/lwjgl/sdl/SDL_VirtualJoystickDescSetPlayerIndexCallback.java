package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescSetPlayerIndexCallback.class */
public abstract class SDL_VirtualJoystickDescSetPlayerIndexCallback extends Callback implements SDL_VirtualJoystickDescSetPlayerIndexCallbackI {
    public static SDL_VirtualJoystickDescSetPlayerIndexCallback create(long functionPointer) {
        SDL_VirtualJoystickDescSetPlayerIndexCallbackI instance = (SDL_VirtualJoystickDescSetPlayerIndexCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_VirtualJoystickDescSetPlayerIndexCallback) {
            return (SDL_VirtualJoystickDescSetPlayerIndexCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_VirtualJoystickDescSetPlayerIndexCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_VirtualJoystickDescSetPlayerIndexCallback create(SDL_VirtualJoystickDescSetPlayerIndexCallbackI instance) {
        if (instance instanceof SDL_VirtualJoystickDescSetPlayerIndexCallback) {
            return (SDL_VirtualJoystickDescSetPlayerIndexCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescSetPlayerIndexCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescSetPlayerIndexCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescSetPlayerIndexCallback$Container.class */
    private static final class Container extends SDL_VirtualJoystickDescSetPlayerIndexCallback {
        private final SDL_VirtualJoystickDescSetPlayerIndexCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescSetPlayerIndexCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_VirtualJoystickDescSetPlayerIndexCallbackI
        public void invoke(long userdata, int player_index) {
            this.delegate.invoke(userdata, player_index);
        }
    }
}
