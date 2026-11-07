package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceCloseCallback.class */
public abstract class SDL_StorageInterfaceCloseCallback extends Callback implements SDL_StorageInterfaceCloseCallbackI {
    public static SDL_StorageInterfaceCloseCallback create(long functionPointer) {
        SDL_StorageInterfaceCloseCallbackI instance = (SDL_StorageInterfaceCloseCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceCloseCallback) {
            return (SDL_StorageInterfaceCloseCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceCloseCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceCloseCallback create(SDL_StorageInterfaceCloseCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceCloseCallback) {
            return (SDL_StorageInterfaceCloseCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceCloseCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceCloseCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceCloseCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceCloseCallback {
        private final SDL_StorageInterfaceCloseCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceCloseCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceCloseCallbackI
        public boolean invoke(long userdata) {
            return this.delegate.invoke(userdata);
        }
    }
}
