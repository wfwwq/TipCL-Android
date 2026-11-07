package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_X11EventHook.class */
public abstract class SDL_X11EventHook extends Callback implements SDL_X11EventHookI {
    public static SDL_X11EventHook create(long functionPointer) {
        SDL_X11EventHookI instance = (SDL_X11EventHookI) Callback.get(functionPointer);
        if (instance instanceof SDL_X11EventHook) {
            return (SDL_X11EventHook) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_X11EventHook createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_X11EventHook create(SDL_X11EventHookI instance) {
        if (instance instanceof SDL_X11EventHook) {
            return (SDL_X11EventHook) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_X11EventHook() {
        super(DESCRIPTOR);
    }

    SDL_X11EventHook(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_X11EventHook$Container.class */
    private static final class Container extends SDL_X11EventHook {
        private final SDL_X11EventHookI delegate;

        Container(long functionPointer, SDL_X11EventHookI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_X11EventHookI
        public boolean invoke(long userdata, long xevent) {
            return this.delegate.invoke(userdata, xevent);
        }
    }
}
