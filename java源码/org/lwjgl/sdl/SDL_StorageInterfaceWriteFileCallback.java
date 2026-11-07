package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceWriteFileCallback.class */
public abstract class SDL_StorageInterfaceWriteFileCallback extends Callback implements SDL_StorageInterfaceWriteFileCallbackI {
    public static SDL_StorageInterfaceWriteFileCallback create(long functionPointer) {
        SDL_StorageInterfaceWriteFileCallbackI instance = (SDL_StorageInterfaceWriteFileCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceWriteFileCallback) {
            return (SDL_StorageInterfaceWriteFileCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceWriteFileCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceWriteFileCallback create(SDL_StorageInterfaceWriteFileCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceWriteFileCallback) {
            return (SDL_StorageInterfaceWriteFileCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceWriteFileCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceWriteFileCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceWriteFileCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceWriteFileCallback {
        private final SDL_StorageInterfaceWriteFileCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceWriteFileCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceWriteFileCallbackI
        public boolean invoke(long userdata, long path, long source, long length) {
            return this.delegate.invoke(userdata, path, source, length);
        }
    }
}
