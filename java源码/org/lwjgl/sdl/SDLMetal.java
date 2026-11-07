package org.lwjgl.sdl;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLMetal.class */
public class SDLMetal {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLMetal$Functions.class */
    public static final class Functions {
        public static final long Metal_CreateView = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Metal_CreateView");
        public static final long Metal_DestroyView = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Metal_DestroyView");
        public static final long Metal_GetLayer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Metal_GetLayer");

        private Functions() {
        }
    }

    protected SDLMetal() {
        throw new UnsupportedOperationException();
    }

    @NativeType("SDL_MetalView")
    public static long SDL_Metal_CreateView(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.Metal_CreateView;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePP(window, __functionAddress);
    }

    public static void SDL_Metal_DestroyView(@NativeType("SDL_MetalView") long view) {
        long __functionAddress = Functions.Metal_DestroyView;
        if (Checks.CHECKS) {
            Checks.check(view);
        }
        JNI.invokePV(view, __functionAddress);
    }

    @NativeType("void *")
    public static long SDL_Metal_GetLayer(@NativeType("SDL_MetalView") long view) {
        long __functionAddress = Functions.Metal_GetLayer;
        if (Checks.CHECKS) {
            Checks.check(view);
        }
        return JNI.invokePP(view, __functionAddress);
    }
}
