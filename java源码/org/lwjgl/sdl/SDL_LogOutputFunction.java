package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_LogOutputFunction.class */
public abstract class SDL_LogOutputFunction extends Callback implements SDL_LogOutputFunctionI {
    public static SDL_LogOutputFunction create(long functionPointer) {
        SDL_LogOutputFunctionI instance = (SDL_LogOutputFunctionI) Callback.get(functionPointer);
        if (instance instanceof SDL_LogOutputFunction) {
            return (SDL_LogOutputFunction) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_LogOutputFunction createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_LogOutputFunction create(SDL_LogOutputFunctionI instance) {
        if (instance instanceof SDL_LogOutputFunction) {
            return (SDL_LogOutputFunction) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_LogOutputFunction() {
        super(DESCRIPTOR);
    }

    SDL_LogOutputFunction(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_LogOutputFunction$Container.class */
    private static final class Container extends SDL_LogOutputFunction {
        private final SDL_LogOutputFunctionI delegate;

        Container(long functionPointer, SDL_LogOutputFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_LogOutputFunctionI
        public void invoke(long userdata, int category, int priority, long message) {
            this.delegate.invoke(userdata, category, priority, message);
        }
    }
}
