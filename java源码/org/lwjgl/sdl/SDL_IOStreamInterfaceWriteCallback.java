package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceWriteCallback.class */
public abstract class SDL_IOStreamInterfaceWriteCallback extends Callback implements SDL_IOStreamInterfaceWriteCallbackI {
    public static SDL_IOStreamInterfaceWriteCallback create(long functionPointer) {
        SDL_IOStreamInterfaceWriteCallbackI instance = (SDL_IOStreamInterfaceWriteCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_IOStreamInterfaceWriteCallback) {
            return (SDL_IOStreamInterfaceWriteCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_IOStreamInterfaceWriteCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_IOStreamInterfaceWriteCallback create(SDL_IOStreamInterfaceWriteCallbackI instance) {
        if (instance instanceof SDL_IOStreamInterfaceWriteCallback) {
            return (SDL_IOStreamInterfaceWriteCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceWriteCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceWriteCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceWriteCallback$Container.class */
    private static final class Container extends SDL_IOStreamInterfaceWriteCallback {
        private final SDL_IOStreamInterfaceWriteCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceWriteCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_IOStreamInterfaceWriteCallbackI
        public long invoke(long userdata, long ptr, long size, long status) {
            return this.delegate.invoke(userdata, ptr, size, status);
        }
    }
}
