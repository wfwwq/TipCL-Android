package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_WindowsMessageHook.class */
public abstract class SDL_WindowsMessageHook extends Callback implements SDL_WindowsMessageHookI {
    public static SDL_WindowsMessageHook create(long functionPointer) {
        SDL_WindowsMessageHookI instance = (SDL_WindowsMessageHookI) Callback.get(functionPointer);
        if (instance instanceof SDL_WindowsMessageHook) {
            return (SDL_WindowsMessageHook) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_WindowsMessageHook createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_WindowsMessageHook create(SDL_WindowsMessageHookI instance) {
        if (instance instanceof SDL_WindowsMessageHook) {
            return (SDL_WindowsMessageHook) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_WindowsMessageHook() {
        super(DESCRIPTOR);
    }

    SDL_WindowsMessageHook(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_WindowsMessageHook$Container.class */
    private static final class Container extends SDL_WindowsMessageHook {
        private final SDL_WindowsMessageHookI delegate;

        Container(long functionPointer, SDL_WindowsMessageHookI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_WindowsMessageHookI
        public boolean invoke(long userdata, long msg) {
            return this.delegate.invoke(userdata, msg);
        }
    }
}
