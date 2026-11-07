package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_EventFilter.class */
public abstract class SDL_EventFilter extends Callback implements SDL_EventFilterI {
    public static SDL_EventFilter create(long functionPointer) {
        SDL_EventFilterI instance = (SDL_EventFilterI) Callback.get(functionPointer);
        if (instance instanceof SDL_EventFilter) {
            return (SDL_EventFilter) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_EventFilter createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_EventFilter create(SDL_EventFilterI instance) {
        if (instance instanceof SDL_EventFilter) {
            return (SDL_EventFilter) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_EventFilter() {
        super(DESCRIPTOR);
    }

    SDL_EventFilter(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_EventFilter$Container.class */
    private static final class Container extends SDL_EventFilter {
        private final SDL_EventFilterI delegate;

        Container(long functionPointer, SDL_EventFilterI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_EventFilterI
        public boolean invoke(long userdata, long event) {
            return this.delegate.invoke(userdata, event);
        }
    }
}
