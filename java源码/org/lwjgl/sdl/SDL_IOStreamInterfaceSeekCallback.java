package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceSeekCallback.class */
public abstract class SDL_IOStreamInterfaceSeekCallback extends Callback implements SDL_IOStreamInterfaceSeekCallbackI {
    public static SDL_IOStreamInterfaceSeekCallback create(long functionPointer) {
        SDL_IOStreamInterfaceSeekCallbackI instance = (SDL_IOStreamInterfaceSeekCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_IOStreamInterfaceSeekCallback) {
            return (SDL_IOStreamInterfaceSeekCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_IOStreamInterfaceSeekCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_IOStreamInterfaceSeekCallback create(SDL_IOStreamInterfaceSeekCallbackI instance) {
        if (instance instanceof SDL_IOStreamInterfaceSeekCallback) {
            return (SDL_IOStreamInterfaceSeekCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceSeekCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceSeekCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceSeekCallback$Container.class */
    private static final class Container extends SDL_IOStreamInterfaceSeekCallback {
        private final SDL_IOStreamInterfaceSeekCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceSeekCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_IOStreamInterfaceSeekCallbackI
        public long invoke(long userdata, long offset, int whence) {
            return this.delegate.invoke(userdata, offset, whence);
        }
    }
}
