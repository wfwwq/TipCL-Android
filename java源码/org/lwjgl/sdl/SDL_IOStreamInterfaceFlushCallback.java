package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceFlushCallback.class */
public abstract class SDL_IOStreamInterfaceFlushCallback extends Callback implements SDL_IOStreamInterfaceFlushCallbackI {
    public static SDL_IOStreamInterfaceFlushCallback create(long functionPointer) {
        SDL_IOStreamInterfaceFlushCallbackI instance = (SDL_IOStreamInterfaceFlushCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_IOStreamInterfaceFlushCallback) {
            return (SDL_IOStreamInterfaceFlushCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_IOStreamInterfaceFlushCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_IOStreamInterfaceFlushCallback create(SDL_IOStreamInterfaceFlushCallbackI instance) {
        if (instance instanceof SDL_IOStreamInterfaceFlushCallback) {
            return (SDL_IOStreamInterfaceFlushCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceFlushCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceFlushCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterfaceFlushCallback$Container.class */
    private static final class Container extends SDL_IOStreamInterfaceFlushCallback {
        private final SDL_IOStreamInterfaceFlushCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceFlushCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_IOStreamInterfaceFlushCallbackI
        public boolean invoke(long userdata, long status) {
            return this.delegate.invoke(userdata, status);
        }
    }
}
