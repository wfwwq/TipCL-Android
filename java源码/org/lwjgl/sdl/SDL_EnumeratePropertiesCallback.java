package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_EnumeratePropertiesCallback.class */
public abstract class SDL_EnumeratePropertiesCallback extends Callback implements SDL_EnumeratePropertiesCallbackI {
    public static SDL_EnumeratePropertiesCallback create(long functionPointer) {
        SDL_EnumeratePropertiesCallbackI instance = (SDL_EnumeratePropertiesCallbackI) Callback.get(functionPointer);
        if (instance instanceof SDL_EnumeratePropertiesCallback) {
            return (SDL_EnumeratePropertiesCallback) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_EnumeratePropertiesCallback createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_EnumeratePropertiesCallback create(SDL_EnumeratePropertiesCallbackI instance) {
        if (instance instanceof SDL_EnumeratePropertiesCallback) {
            return (SDL_EnumeratePropertiesCallback) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_EnumeratePropertiesCallback() {
        super(DESCRIPTOR);
    }

    SDL_EnumeratePropertiesCallback(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_EnumeratePropertiesCallback$Container.class */
    private static final class Container extends SDL_EnumeratePropertiesCallback {
        private final SDL_EnumeratePropertiesCallbackI delegate;

        Container(long functionPointer, SDL_EnumeratePropertiesCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_EnumeratePropertiesCallbackI
        public void invoke(long userdata, int props, long name) {
            this.delegate.invoke(userdata, props, name);
        }
    }
}
