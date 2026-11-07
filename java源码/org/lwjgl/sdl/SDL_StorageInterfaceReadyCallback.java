package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceReadyCallback.class */
public abstract class SDL_StorageInterfaceReadyCallback extends Callback implements SDL_StorageInterfaceReadyCallbackI {
    public static SDL_StorageInterfaceReadyCallback create(long functionPointer) {
        SDL_StorageInterfaceReadyCallbackI instance = (SDL_StorageInterfaceReadyCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceReadyCallback) {
            return (SDL_StorageInterfaceReadyCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceReadyCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceReadyCallback create(SDL_StorageInterfaceReadyCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceReadyCallback) {
            return (SDL_StorageInterfaceReadyCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceReadyCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceReadyCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceReadyCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceReadyCallback {
        private final SDL_StorageInterfaceReadyCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceReadyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceReadyCallbackI
        public boolean invoke(long userdata) {
            return this.delegate.invoke(userdata);
        }
    }
}
