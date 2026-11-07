package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceRemoveCallback.class */
public abstract class SDL_StorageInterfaceRemoveCallback extends Callback implements SDL_StorageInterfaceRemoveCallbackI {
    public static SDL_StorageInterfaceRemoveCallback create(long functionPointer) {
        SDL_StorageInterfaceRemoveCallbackI instance = (SDL_StorageInterfaceRemoveCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceRemoveCallback) {
            return (SDL_StorageInterfaceRemoveCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceRemoveCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceRemoveCallback create(SDL_StorageInterfaceRemoveCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceRemoveCallback) {
            return (SDL_StorageInterfaceRemoveCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceRemoveCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceRemoveCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceRemoveCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceRemoveCallback {
        private final SDL_StorageInterfaceRemoveCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceRemoveCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceRemoveCallbackI
        public boolean invoke(long userdata, long path) {
            return this.delegate.invoke(userdata, path);
        }
    }
}
