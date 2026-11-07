package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescRumbleTriggersCallback.class */
public abstract class SDL_VirtualJoystickDescRumbleTriggersCallback extends Callback implements SDL_VirtualJoystickDescRumbleTriggersCallbackI {
    public static SDL_VirtualJoystickDescRumbleTriggersCallback create(long functionPointer) {
        SDL_VirtualJoystickDescRumbleTriggersCallbackI instance = (SDL_VirtualJoystickDescRumbleTriggersCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_VirtualJoystickDescRumbleTriggersCallback) {
            return (SDL_VirtualJoystickDescRumbleTriggersCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_VirtualJoystickDescRumbleTriggersCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_VirtualJoystickDescRumbleTriggersCallback create(SDL_VirtualJoystickDescRumbleTriggersCallbackI instance) {
        if (instance instanceof SDL_VirtualJoystickDescRumbleTriggersCallback) {
            return (SDL_VirtualJoystickDescRumbleTriggersCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescRumbleTriggersCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescRumbleTriggersCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescRumbleTriggersCallback$Container.class */
    private static final class Container extends SDL_VirtualJoystickDescRumbleTriggersCallback {
        private final SDL_VirtualJoystickDescRumbleTriggersCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescRumbleTriggersCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_VirtualJoystickDescRumbleTriggersCallbackI
        public boolean invoke(long userdata, short left_rumble, short right_rumble) {
            return this.delegate.invoke(userdata, left_rumble, right_rumble);
        }
    }
}
