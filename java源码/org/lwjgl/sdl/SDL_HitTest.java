package org.lwjgl.sdl;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HitTest.class */
public abstract class SDL_HitTest extends Callback implements SDL_HitTestI {
    public static SDL_HitTest create(long functionPointer) {
        SDL_HitTestI instance = (SDL_HitTestI) Callback.get(functionPointer);
        if (instance instanceof SDL_HitTest) {
            return (SDL_HitTest) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static SDL_HitTest createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static SDL_HitTest create(SDL_HitTestI instance) {
        if (instance instanceof SDL_HitTest) {
            return (SDL_HitTest) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected SDL_HitTest() {
        super(DESCRIPTOR);
    }

    SDL_HitTest(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HitTest$Container.class */
    private static final class Container extends SDL_HitTest {
        private final SDL_HitTestI delegate;

        Container(long functionPointer, SDL_HitTestI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.sdl.SDL_HitTestI
        public int invoke(long win, long area, long data) {
            return this.delegate.invoke(win, area, data);
        }
    }
}
