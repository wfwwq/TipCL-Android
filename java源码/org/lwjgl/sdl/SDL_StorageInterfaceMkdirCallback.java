package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceMkdirCallback.class */
public abstract class SDL_StorageInterfaceMkdirCallback extends Callback implements SDL_StorageInterfaceMkdirCallbackI {
    public static SDL_StorageInterfaceMkdirCallback create(long functionPointer) {
        SDL_StorageInterfaceMkdirCallbackI instance = (SDL_StorageInterfaceMkdirCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceMkdirCallback) {
            return (SDL_StorageInterfaceMkdirCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceMkdirCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceMkdirCallback create(SDL_StorageInterfaceMkdirCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceMkdirCallback) {
            return (SDL_StorageInterfaceMkdirCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceMkdirCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceMkdirCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceMkdirCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceMkdirCallback {
        private final SDL_StorageInterfaceMkdirCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceMkdirCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceMkdirCallbackI
        public boolean invoke(long userdata, long path) {
            return this.delegate.invoke(userdata, path);
        }
    }
}
