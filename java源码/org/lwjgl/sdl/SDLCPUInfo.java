package org.lwjgl.sdl;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLCPUInfo.class */
public class SDLCPUInfo {
    public static final int SDL_CACHELINE_SIZE = 128;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLCPUInfo$Functions.class */
    public static final class Functions {
        public static final long GetNumLogicalCPUCores = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumLogicalCPUCores");
        public static final long GetCPUCacheLineSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCPUCacheLineSize");
        public static final long HasAltiVec = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasAltiVec");
        public static final long HasMMX = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasMMX");
        public static final long HasSSE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasSSE");
        public static final long HasSSE2 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasSSE2");
        public static final long HasSSE3 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasSSE3");
        public static final long HasSSE41 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasSSE41");
        public static final long HasSSE42 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasSSE42");
        public static final long HasAVX = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasAVX");
        public static final long HasAVX2 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasAVX2");
        public static final long HasAVX512F = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasAVX512F");
        public static final long HasARMSIMD = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasARMSIMD");
        public static final long HasNEON = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasNEON");
        public static final long HasLSX = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasLSX");
        public static final long HasLASX = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasLASX");
        public static final long GetSystemRAM = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSystemRAM");
        public static final long GetSIMDAlignment = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSIMDAlignment");
        public static final long GetSystemPageSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSystemPageSize");

        private Functions() {
        }
    }

    protected SDLCPUInfo() {
        throw new UnsupportedOperationException();
    }

    public static int SDL_GetNumLogicalCPUCores() {
        long __functionAddress = Functions.GetNumLogicalCPUCores;
        return JNI.invokeI(__functionAddress);
    }

    public static int SDL_GetCPUCacheLineSize() {
        long __functionAddress = Functions.GetCPUCacheLineSize;
        return JNI.invokeI(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasAltiVec() {
        long __functionAddress = Functions.HasAltiVec;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasMMX() {
        long __functionAddress = Functions.HasMMX;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasSSE() {
        long __functionAddress = Functions.HasSSE;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasSSE2() {
        long __functionAddress = Functions.HasSSE2;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasSSE3() {
        long __functionAddress = Functions.HasSSE3;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasSSE41() {
        long __functionAddress = Functions.HasSSE41;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasSSE42() {
        long __functionAddress = Functions.HasSSE42;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasAVX() {
        long __functionAddress = Functions.HasAVX;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasAVX2() {
        long __functionAddress = Functions.HasAVX2;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasAVX512F() {
        long __functionAddress = Functions.HasAVX512F;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasARMSIMD() {
        long __functionAddress = Functions.HasARMSIMD;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasNEON() {
        long __functionAddress = Functions.HasNEON;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasLSX() {
        long __functionAddress = Functions.HasLSX;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasLASX() {
        long __functionAddress = Functions.HasLASX;
        return JNI.invokeZ(__functionAddress);
    }

    public static int SDL_GetSystemRAM() {
        long __functionAddress = Functions.GetSystemRAM;
        return JNI.invokeI(__functionAddress);
    }

    @NativeType("size_t")
    public static long SDL_GetSIMDAlignment() {
        long __functionAddress = Functions.GetSIMDAlignment;
        return JNI.invokeP(__functionAddress);
    }

    public static int SDL_GetSystemPageSize() {
        long __functionAddress = Functions.GetSystemPageSize;
        return JNI.invokeI(__functionAddress);
    }
}
