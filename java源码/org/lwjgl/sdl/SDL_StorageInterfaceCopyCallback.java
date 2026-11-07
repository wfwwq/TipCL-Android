package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceCopyCallback.class */
public abstract class SDL_StorageInterfaceCopyCallback extends Callback implements SDL_StorageInterfaceCopyCallbackI {
    public static SDL_StorageInterfaceCopyCallback create(long functionPointer) {
        SDL_StorageInterfaceCopyCallbackI instance = (SDL_StorageInterfaceCopyCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceCopyCallback) {
            return (SDL_StorageInterfaceCopyCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceCopyCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceCopyCallback create(SDL_StorageInterfaceCopyCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceCopyCallback) {
            return (SDL_StorageInterfaceCopyCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceCopyCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceCopyCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceCopyCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceCopyCallback {
        private final SDL_StorageInterfaceCopyCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceCopyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceCopyCallbackI
        public boolean invoke(long userdata, long oldpath, long newpath) {
            return this.delegate.invoke(userdata, oldpath, newpath);
        }
    }
}
