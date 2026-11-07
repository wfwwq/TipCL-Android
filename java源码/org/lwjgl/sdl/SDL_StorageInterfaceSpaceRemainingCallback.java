package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceSpaceRemainingCallback.class */
public abstract class SDL_StorageInterfaceSpaceRemainingCallback extends Callback implements SDL_StorageInterfaceSpaceRemainingCallbackI {
    public static SDL_StorageInterfaceSpaceRemainingCallback create(long functionPointer) {
        SDL_StorageInterfaceSpaceRemainingCallbackI instance = (SDL_StorageInterfaceSpaceRemainingCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_StorageInterfaceSpaceRemainingCallback) {
            return (SDL_StorageInterfaceSpaceRemainingCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_StorageInterfaceSpaceRemainingCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_StorageInterfaceSpaceRemainingCallback create(SDL_StorageInterfaceSpaceRemainingCallbackI instance) {
        if (instance instanceof SDL_StorageInterfaceSpaceRemainingCallback) {
            return (SDL_StorageInterfaceSpaceRemainingCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceSpaceRemainingCallback() {
        super(DESCRIPTOR);
    }

    SDL_StorageInterfaceSpaceRemainingCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterfaceSpaceRemainingCallback$Container.class */
    private static final class Container extends SDL_StorageInterfaceSpaceRemainingCallback {
        private final SDL_StorageInterfaceSpaceRemainingCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceSpaceRemainingCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_StorageInterfaceSpaceRemainingCallbackI
        public long invoke(long userdata) {
            return this.delegate.invoke(userdata);
        }
    }
}
