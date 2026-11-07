package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_ClipboardCleanupCallback.class */
public abstract class SDL_ClipboardCleanupCallback extends Callback implements SDL_ClipboardCleanupCallbackI {
    public static SDL_ClipboardCleanupCallback create(long functionPointer) {
        SDL_ClipboardCleanupCallbackI instance = (SDL_ClipboardCleanupCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_ClipboardCleanupCallback) {
            return (SDL_ClipboardCleanupCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_ClipboardCleanupCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_ClipboardCleanupCallback create(SDL_ClipboardCleanupCallbackI instance) {
        if (instance instanceof SDL_ClipboardCleanupCallback) {
            return (SDL_ClipboardCleanupCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_ClipboardCleanupCallback() {
        super(DESCRIPTOR);
    }

    SDL_ClipboardCleanupCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_ClipboardCleanupCallback$Container.class */
    private static final class Container extends SDL_ClipboardCleanupCallback {
        private final SDL_ClipboardCleanupCallbackI delegate;

        Container(long functionPointer, SDL_ClipboardCleanupCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_ClipboardCleanupCallbackI
        public void invoke(long userdata) {
            this.delegate.invoke(userdata);
        }
    }
}
