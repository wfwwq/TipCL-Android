package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceInfoCallback.class */
public abstract class SDL_StorageInterfaceInfoCallback extends Callback implements SDL_StorageInterfaceInfoCallbackI {
    public static SDL_StorageInterfaceInfoCallback create(long functionPointer) {
        SDL_StorageInterfaceInfoCallbackI instance = (SDL_StorageInterfaceInfoCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceInfoCallback) {
            return (SDL_StorageInterfaceInfoCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceInfoCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceInfoCallback create(SDL_StorageInterfaceInfoCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceInfoCallback) {
            return (SDL_StorageInterfaceInfoCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceInfoCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceInfoCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceInfoCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceInfoCallback {
        private final SDL_StorageInterfaceInfoCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceInfoCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceInfoCallbackI
        public boolean invoke(long userdata, long path, long info) {
            return this.delegate.invoke(userdata, path, info);
        }
    }
}
