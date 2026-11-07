package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceRenameCallback.class */
public abstract class SDL_StorageInterfaceRenameCallback extends Callback implements SDL_StorageInterfaceRenameCallbackI {
    public static SDL_StorageInterfaceRenameCallback create(long functionPointer) {
        SDL_StorageInterfaceRenameCallbackI instance = (SDL_StorageInterfaceRenameCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceRenameCallback) {
            return (SDL_StorageInterfaceRenameCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceRenameCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceRenameCallback create(SDL_StorageInterfaceRenameCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceRenameCallback) {
            return (SDL_StorageInterfaceRenameCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceRenameCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceRenameCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceRenameCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceRenameCallback {
        private final SDL_StorageInterfaceRenameCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceRenameCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceRenameCallbackI
        public boolean invoke(long userdata, long oldpath, long newpath) {
            return this.delegate.invoke(userdata, oldpath, newpath);
        }
    }
}
