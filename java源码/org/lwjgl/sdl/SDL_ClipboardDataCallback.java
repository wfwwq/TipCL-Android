package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_ClipboardDataCallback.class */
public abstract class SDL_ClipboardDataCallback extends Callback implements SDL_ClipboardDataCallbackI {
    public static SDL_ClipboardDataCallback create(long functionPointer) {
        SDL_ClipboardDataCallbackI instance = (SDL_ClipboardDataCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_ClipboardDataCallback) {
            return (SDL_ClipboardDataCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_ClipboardDataCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_ClipboardDataCallback create(SDL_ClipboardDataCallbackI instance) {
        if (instance instanceof SDL_ClipboardDataCallback) {
            return (SDL_ClipboardDataCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_ClipboardDataCallback() {
        super(DESCRIPTOR);
    }

    SDL_ClipboardDataCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_ClipboardDataCallback$Container.class */
    private static final class Container extends SDL_ClipboardDataCallback {
        private final SDL_ClipboardDataCallbackI delegate;

        Container(long functionPointer, SDL_ClipboardDataCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_ClipboardDataCallbackI
        public long invoke(long userdata, long mime_type, long size) {
            return this.delegate.invoke(userdata, mime_type, size);
        }
    }
}
