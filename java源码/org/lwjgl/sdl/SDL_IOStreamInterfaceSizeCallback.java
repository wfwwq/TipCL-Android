package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceSizeCallback.class */
public abstract class SDL_IOStreamInterfaceSizeCallback extends Callback implements SDL_IOStreamInterfaceSizeCallbackI {
    public static SDL_IOStreamInterfaceSizeCallback create(long functionPointer) {
        SDL_IOStreamInterfaceSizeCallbackI instance = (SDL_IOStreamInterfaceSizeCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_IOStreamInterfaceSizeCallback) {
            return (SDL_IOStreamInterfaceSizeCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_IOStreamInterfaceSizeCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_IOStreamInterfaceSizeCallback create(SDL_IOStreamInterfaceSizeCallbackI instance) {
        if (instance instanceof SDL_IOStreamInterfaceSizeCallback) {
            return (SDL_IOStreamInterfaceSizeCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceSizeCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceSizeCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceSizeCallback$Container.class */
    private static final class Container extends SDL_IOStreamInterfaceSizeCallback {
        private final SDL_IOStreamInterfaceSizeCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceSizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_IOStreamInterfaceSizeCallbackI
        public long invoke(long userdata) {
            return this.delegate.invoke(userdata);
        }
    }
}
