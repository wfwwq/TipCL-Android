package org.lwjgl.sdl;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLPlatform.class */
public class SDLPlatform {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLPlatform$Functions.class */
    public static final class Functions {
        public static final long GetPlatform = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPlatform");

        private Functions() {
        }
    }

    protected SDLPlatform() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_GetPlatform() {
        long __functionAddress = Functions.GetPlatform;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetPlatform() {
        long __result = nSDL_GetPlatform();
        return MemoryUtil.memASCIISafe(__result);
    }
}
