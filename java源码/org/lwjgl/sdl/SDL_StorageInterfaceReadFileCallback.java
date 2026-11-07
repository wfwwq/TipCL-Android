package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceReadFileCallback.class */
public abstract class SDL_StorageInterfaceReadFileCallback extends Callback implements SDL_StorageInterfaceReadFileCallbackI {
    public static SDL_StorageInterfaceReadFileCallback create(long functionPointer) {
        SDL_StorageInterfaceReadFileCallbackI instance = (SDL_StorageInterfaceReadFileCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceReadFileCallback) {
            return (SDL_StorageInterfaceReadFileCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceReadFileCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceReadFileCallback create(SDL_StorageInterfaceReadFileCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceReadFileCallback) {
            return (SDL_StorageInterfaceReadFileCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceReadFileCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceReadFileCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceReadFileCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceReadFileCallback {
        private final SDL_StorageInterfaceReadFileCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceReadFileCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceReadFileCallbackI
        public boolean invoke(long userdata, long path, long destination, long length) {
            return this.delegate.invoke(userdata, path, destination, length);
        }
    }
}
