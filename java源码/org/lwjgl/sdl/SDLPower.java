package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLPower.class */
public class SDLPower {
    public static final int SDL_POWERSTATE_ERROR = -1;
    public static final int SDL_POWERSTATE_UNKNOWN = 0;
    public static final int SDL_POWERSTATE_ON_BATTERY = 1;
    public static final int SDL_POWERSTATE_NO_BATTERY = 2;
    public static final int SDL_POWERSTATE_CHARGING = 3;
    public static final int SDL_POWERSTATE_CHARGED = 4;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLPower$Functions.class */
    public static final class Functions {
        public static final long GetPowerInfo = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPowerInfo");

        private Functions() {
        }
    }

    protected SDLPower() {
        throw new UnsupportedOperationException();
    }

    public static int nSDL_GetPowerInfo(long seconds, long percent) {
        long __functionAddress = Functions.GetPowerInfo;
        return JNI.invokePPI(seconds, percent, __functionAddress);
    }

    @NativeType("SDL_PowerState")
    public static int SDL_GetPowerInfo(@NativeType("int *") IntBuffer seconds, @NativeType("int *") IntBuffer percent) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) seconds, 1);
            Checks.checkSafe((Buffer) percent, 1);
        }
        return nSDL_GetPowerInfo(MemoryUtil.memAddressSafe(seconds), MemoryUtil.memAddressSafe(percent));
    }
}
