package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceReadCallback.class */
public abstract class SDL_IOStreamInterfaceReadCallback extends Callback implements SDL_IOStreamInterfaceReadCallbackI {
    public static SDL_IOStreamInterfaceReadCallback create(long functionPointer) {
        SDL_IOStreamInterfaceReadCallbackI instance = (SDL_IOStreamInterfaceReadCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_IOStreamInterfaceReadCallback) {
            return (SDL_IOStreamInterfaceReadCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_IOStreamInterfaceReadCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_IOStreamInterfaceReadCallback create(SDL_IOStreamInterfaceReadCallbackI instance) {
        if (instance instanceof SDL_IOStreamInterfaceReadCallback) {
            return (SDL_IOStreamInterfaceReadCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceReadCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceReadCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceReadCallback$Container.class */
    private static final class Container extends SDL_IOStreamInterfaceReadCallback {
        private final SDL_IOStreamInterfaceReadCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceReadCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_IOStreamInterfaceReadCallbackI
        public long invoke(long userdata, long ptr, long size, long status) {
            return this.delegate.invoke(userdata, ptr, size, status);
        }
    }
}
