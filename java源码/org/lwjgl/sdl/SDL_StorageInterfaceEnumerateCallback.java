package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceEnumerateCallback.class */
public abstract class SDL_StorageInterfaceEnumerateCallback extends Callback implements SDL_StorageInterfaceEnumerateCallbackI {
    public static SDL_StorageInterfaceEnumerateCallback create(long functionPointer) {
        SDL_StorageInterfaceEnumerateCallbackI instance = (SDL_StorageInterfaceEnumerateCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceEnumerateCallback) {
            return (SDL_StorageInterfaceEnumerateCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceEnumerateCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceEnumerateCallback create(SDL_StorageInterfaceEnumerateCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceEnumerateCallback) {
            return (SDL_StorageInterfaceEnumerateCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceEnumerateCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceEnumerateCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceEnumerateCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceEnumerateCallback {
        private final SDL_StorageInterfaceEnumerateCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceEnumerateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceEnumerateCallbackI
        public boolean invoke(long userdata, long path, long callback, long callback_userdata) {
            return this.delegate.invoke(userdata, path, callback, callback_userdata);
        }
    }
}
