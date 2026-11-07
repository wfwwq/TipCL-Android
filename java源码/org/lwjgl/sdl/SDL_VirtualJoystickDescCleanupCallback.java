package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescCleanupCallback.class */
public abstract class SDL_VirtualJoystickDescCleanupCallback extends Callback implements SDL_VirtualJoystickDescCleanupCallbackI {
    public static SDL_VirtualJoystickDescCleanupCallback create(long functionPointer) {
        SDL_VirtualJoystickDescCleanupCallbackI instance = (SDL_VirtualJoystickDescCleanupCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_VirtualJoystickDescCleanupCallback) {
            return (SDL_VirtualJoystickDescCleanupCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_VirtualJoystickDescCleanupCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_VirtualJoystickDescCleanupCallback create(SDL_VirtualJoystickDescCleanupCallbackI instance) {
        if (instance instanceof SDL_VirtualJoystickDescCleanupCallback) {
            return (SDL_VirtualJoystickDescCleanupCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescCleanupCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescCleanupCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescCleanupCallback$Container.class */
    private static final class Container extends SDL_VirtualJoystickDescCleanupCallback {
        private final SDL_VirtualJoystickDescCleanupCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescCleanupCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_VirtualJoystickDescCleanupCallbackI
        public void invoke(long userdata) {
            this.delegate.invoke(userdata);
        }
    }
}
