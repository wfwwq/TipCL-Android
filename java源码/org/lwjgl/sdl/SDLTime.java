package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLTime.class */
public class SDLTime {
    public static final int SDL_DATE_FORMAT_YYYYMMDD = 0;
    public static final int SDL_DATE_FORMAT_DDMMYYYY = 1;
    public static final int SDL_DATE_FORMAT_MMDDYYYY = 2;
    public static final int SDL_TIME_FORMAT_24HR = 0;
    public static final int SDL_TIME_FORMAT_12HR = 1;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLTime$Functions.class */
    public static final class Functions {
        public static final long GetDateTimeLocalePreferences = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDateTimeLocalePreferences");
        public static final long GetCurrentTime = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentTime");
        public static final long TimeToDateTime = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_TimeToDateTime");
        public static final long DateTimeToTime = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DateTimeToTime");
        public static final long TimeToWindows = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_TimeToWindows");
        public static final long TimeFromWindows = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_TimeFromWindows");
        public static final long GetDaysInMonth = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDaysInMonth");
        public static final long GetDayOfYear = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDayOfYear");
        public static final long GetDayOfWeek = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDayOfWeek");

        private Functions() {
        }
    }

    protected SDLTime() {
        throw new UnsupportedOperationException();
    }

    public static boolean nSDL_GetDateTimeLocalePreferences(long dateFormat, long timeFormat) {
        long __functionAddress = Functions.GetDateTimeLocalePreferences;
        return JNI.invokePPZ(dateFormat, timeFormat, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetDateTimeLocalePreferences(@NativeType("SDL_DateFormat *") IntBuffer dateFormat, @NativeType("SDL_TimeFormat *") IntBuffer timeFormat) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) dateFormat, 1);
            Checks.checkSafe((Buffer) timeFormat, 1);
        }
        return nSDL_GetDateTimeLocalePreferences(MemoryUtil.memAddressSafe(dateFormat), MemoryUtil.memAddressSafe(timeFormat));
    }

    public static boolean nSDL_GetCurrentTime(long ticks) {
        long __functionAddress = Functions.GetCurrentTime;
        return JNI.invokePZ(ticks, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetCurrentTime(@NativeType("SDL_Time *") LongBuffer ticks) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) ticks, 1);
        }
        return nSDL_GetCurrentTime(MemoryUtil.memAddress(ticks));
    }

    public static boolean nSDL_TimeToDateTime(long ticks, long dt, boolean localTime) {
        long __functionAddress = Functions.TimeToDateTime;
        return JNI.invokeJPZ(ticks, dt, localTime, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_TimeToDateTime(@NativeType("SDL_Time") long ticks, @NativeType("SDL_DateTime *") SDL_DateTime dt, @NativeType("bool") boolean localTime) {
        return nSDL_TimeToDateTime(ticks, dt.address(), localTime);
    }

    public static boolean nSDL_DateTimeToTime(long dt, long ticks) {
        long __functionAddress = Functions.DateTimeToTime;
        return JNI.invokePPZ(dt, ticks, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_DateTimeToTime(@NativeType("SDL_DateTime const *") SDL_DateTime dt, @NativeType("SDL_Time *") LongBuffer ticks) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) ticks, 1);
        }
        return nSDL_DateTimeToTime(dt.address(), MemoryUtil.memAddress(ticks));
    }

    public static void nSDL_TimeToWindows(long ticks, long dwLowDateTime, long dwHighDateTime) {
        long __functionAddress = Functions.TimeToWindows;
        JNI.invokeJPPV(ticks, dwLowDateTime, dwHighDateTime, __functionAddress);
    }

    public static void SDL_TimeToWindows(@NativeType("SDL_Time") long ticks, @NativeType("Uint32 *") IntBuffer dwLowDateTime, @NativeType("Uint32 *") IntBuffer dwHighDateTime) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) dwLowDateTime, 1);
            Checks.checkSafe((Buffer) dwHighDateTime, 1);
        }
        nSDL_TimeToWindows(ticks, MemoryUtil.memAddressSafe(dwLowDateTime), MemoryUtil.memAddressSafe(dwHighDateTime));
    }

    @NativeType("SDL_Time")
    public static long SDL_TimeFromWindows(@NativeType("Uint32") int dwLowDateTime, @NativeType("Uint32") int dwHighDateTime) {
        long __functionAddress = Functions.TimeFromWindows;
        return JNI.invokeJ(dwLowDateTime, dwHighDateTime, __functionAddress);
    }

    public static int SDL_GetDaysInMonth(int year, int month) {
        long __functionAddress = Functions.GetDaysInMonth;
        return JNI.invokeI(year, month, __functionAddress);
    }

    public static int SDL_GetDayOfYear(int year, int month, int day) {
        long __functionAddress = Functions.GetDayOfYear;
        return JNI.invokeI(year, month, day, __functionAddress);
    }

    public static int SDL_GetDayOfWeek(int year, int month, int day) {
        long __functionAddress = Functions.GetDayOfWeek;
        return JNI.invokeI(year, month, day, __functionAddress);
    }
}
