package org.lwjgl.sdl;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLTimer.class */
public class SDLTimer {
    public static final int SDL_MS_PER_SECOND = 1000;
    public static final int SDL_US_PER_SECOND = 1000000;
    public static final long SDL_NS_PER_SECOND = 1000000000;
    public static final int SDL_NS_PER_MS = 1000000;
    public static final int SDL_NS_PER_US = 1000;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLTimer$Functions.class */
    public static final class Functions {
        public static final long GetTicks = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTicks");
        public static final long GetTicksNS = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTicksNS");
        public static final long GetPerformanceCounter = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPerformanceCounter");
        public static final long GetPerformanceFrequency = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPerformanceFrequency");
        public static final long Delay = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Delay");
        public static final long DelayNS = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DelayNS");
        public static final long DelayPrecise = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DelayPrecise");
        public static final long AddTimer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddTimer");
        public static final long AddTimerNS = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddTimerNS");
        public static final long RemoveTimer = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemoveTimer");

        private Functions() {
        }
    }

    protected SDLTimer() {
        throw new UnsupportedOperationException();
    }

    @NativeType("Uint64")
    public static long SDL_GetTicks() {
        long __functionAddress = Functions.GetTicks;
        return JNI.invokeJ(__functionAddress);
    }

    @NativeType("Uint64")
    public static long SDL_GetTicksNS() {
        long __functionAddress = Functions.GetTicksNS;
        return JNI.invokeJ(__functionAddress);
    }

    @NativeType("Uint64")
    public static long SDL_GetPerformanceCounter() {
        long __functionAddress = Functions.GetPerformanceCounter;
        return JNI.invokeJ(__functionAddress);
    }

    @NativeType("Uint64")
    public static long SDL_GetPerformanceFrequency() {
        long __functionAddress = Functions.GetPerformanceFrequency;
        return JNI.invokeJ(__functionAddress);
    }

    public static void SDL_Delay(@NativeType("Uint32") int ms) {
        long __functionAddress = Functions.Delay;
        JNI.invokeV(ms, __functionAddress);
    }

    public static void SDL_DelayNS(@NativeType("Uint64") long ns) {
        long __functionAddress = Functions.DelayNS;
        JNI.invokeJV(ns, __functionAddress);
    }

    public static void SDL_DelayPrecise(@NativeType("Uint64") long ns) {
        long __functionAddress = Functions.DelayPrecise;
        JNI.invokeJV(ns, __functionAddress);
    }

    public static int nSDL_AddTimer(int interval, long callback, long userdata) {
        long __functionAddress = Functions.AddTimer;
        return JNI.invokePPI(interval, callback, userdata, __functionAddress);
    }

    @NativeType("SDL_TimerID")
    public static int SDL_AddTimer(@NativeType("Uint32") int interval, @NativeType("SDL_TimerCallback") SDL_TimerCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_AddTimer(interval, callback.address(), userdata);
    }

    public static int nSDL_AddTimerNS(long interval, long callback, long userdata) {
        long __functionAddress = Functions.AddTimerNS;
        return JNI.invokeJPPI(interval, callback, userdata, __functionAddress);
    }

    @NativeType("SDL_TimerID")
    public static int SDL_AddTimerNS(@NativeType("Uint64") long interval, @NativeType("SDL_NSTimerCallback") SDL_NSTimerCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_AddTimerNS(interval, callback.address(), userdata);
    }

    @NativeType("bool")
    public static boolean SDL_RemoveTimer(@NativeType("SDL_TimerID") int id) {
        long __functionAddress = Functions.RemoveTimer;
        return JNI.invokeZ(id, __functionAddress);
    }

    @NativeType("Uint64")
    public static long SDL_SECONDS_TO_NS(@NativeType("Uint64") long S) {
        return S * SDL_NS_PER_SECOND;
    }

    @NativeType("Uint64")
    public static long SDL_NS_TO_SECONDS(@NativeType("Uint64") long NS) {
        return NS / SDL_NS_PER_SECOND;
    }

    @NativeType("Uint64")
    public static long SDL_MS_TO_NS(@NativeType("Uint64") long MS) {
        return MS * 1000000;
    }

    @NativeType("Uint64")
    public static long SDL_NS_TO_MS(@NativeType("Uint64") long NS) {
        return NS / 1000000;
    }

    @NativeType("Uint64")
    public static long SDL_US_TO_NS(@NativeType("Uint64") long US) {
        return US * 1000;
    }

    @NativeType("Uint64")
    public static long SDL_NS_TO_US(@NativeType("Uint64") long NS) {
        return NS / 1000;
    }
}
