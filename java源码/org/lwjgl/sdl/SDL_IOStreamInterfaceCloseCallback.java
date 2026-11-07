package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceCloseCallback.class */
public abstract class SDL_IOStreamInterfaceCloseCallback extends Callback implements SDL_IOStreamInterfaceCloseCallbackI {
    public static SDL_IOStreamInterfaceCloseCallback create(long functionPointer) {
        SDL_IOStreamInterfaceCloseCallbackI instance = (SDL_IOStreamInterfaceCloseCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_IOStreamInterfaceCloseCallback) {
            return (SDL_IOStreamInterfaceCloseCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_IOStreamInterfaceCloseCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_IOStreamInterfaceCloseCallback create(SDL_IOStreamInterfaceCloseCallbackI instance) {
        if (instance instanceof SDL_IOStreamInterfaceCloseCallback) {
            return (SDL_IOStreamInterfaceCloseCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceCloseCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceCloseCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceCloseCallback$Container.class */
    private static final class Container extends SDL_IOStreamInterfaceCloseCallback {
        private final SDL_IOStreamInterfaceCloseCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceCloseCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_IOStreamInterfaceCloseCallbackI
        public boolean invoke(long userdata) {
            return this.delegate.invoke(userdata);
        }
    }
}
