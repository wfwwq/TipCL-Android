package org.lwjgl.sdl;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLVersion.class */
public class SDLVersion {
    public static final int SDL_MAJOR_VERSION = 3;
    public static final int SDL_MINOR_VERSION = 4;
    public static final int SDL_MICRO_VERSION = 1;
    public static final int SDL_VERSION = SDL_VERSIONNUM(3, 4, 1);

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLVersion$Functions.class */
    public static final class Functions {
        public static final long GetVersion = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetVersion");
        public static final long GetRevision = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRevision");

        private Functions() {
        }
    }

    protected SDLVersion() {
        throw new UnsupportedOperationException();
    }

    public static int SDL_GetVersion() {
        long __functionAddress = Functions.GetVersion;
        return JNI.invokeI(__functionAddress);
    }

    public static long nSDL_GetRevision() {
        long __functionAddress = Functions.GetRevision;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetRevision() {
        long __result = nSDL_GetRevision();
        return MemoryUtil.memASCIISafe(__result);
    }

    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return (major * 1000000) + (minor * 1000) + patch;
    }

    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM_MAJOR(@NativeType("uint32_t") int version) {
        return version / 1000000;
    }

    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM_MINOR(@NativeType("uint32_t") int version) {
        return (version / 1000) % 1000;
    }

    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM_MICRO(@NativeType("uint32_t") int version) {
        return version % 1000;
    }

    @NativeType("bool")
    public static boolean SDL_VERSION_ATLEAST(@NativeType("uint32_t") int X, @NativeType("uint32_t") int Y, @NativeType("uint32_t") int Z) {
        return SDL_VERSION >= SDL_VERSIONNUM(X, Y, Z);
    }
}
