package org.lwjgl.sdl;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLPen.class */
public class SDLPen {
    public static final int SDL_PEN_MOUSEID = -2;
    public static final long SDL_PEN_TOUCHID = -2;
    public static final int SDL_PEN_INPUT_DOWN = 1;
    public static final int SDL_PEN_INPUT_BUTTON_1 = 2;
    public static final int SDL_PEN_INPUT_BUTTON_2 = 4;
    public static final int SDL_PEN_INPUT_BUTTON_3 = 8;
    public static final int SDL_PEN_INPUT_BUTTON_4 = 16;
    public static final int SDL_PEN_INPUT_BUTTON_5 = 32;
    public static final int SDL_PEN_INPUT_ERASER_TIP = 1073741824;
    public static final int SDL_PEN_INPUT_IN_PROXIMITY = Integer.MIN_VALUE;
    public static final int SDL_PEN_AXIS_PRESSURE = 0;
    public static final int SDL_PEN_AXIS_XTILT = 1;
    public static final int SDL_PEN_AXIS_YTILT = 2;
    public static final int SDL_PEN_AXIS_DISTANCE = 3;
    public static final int SDL_PEN_AXIS_ROTATION = 4;
    public static final int SDL_PEN_AXIS_SLIDER = 5;
    public static final int SDL_PEN_AXIS_TANGENTIAL_PRESSURE = 6;
    public static final int SDL_PEN_AXIS_COUNT = 7;
    public static final int SDL_PEN_DEVICE_TYPE_INVALID = -1;
    public static final int SDL_PEN_DEVICE_TYPE_UNKNOWN = 0;
    public static final int SDL_PEN_DEVICE_TYPE_DIRECT = 1;
    public static final int SDL_PEN_DEVICE_TYPE_INDIRECT = 2;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLPen$Functions.class */
    public static final class Functions {
        public static final long GetPenDeviceType = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPenDeviceType");

        private Functions() {
        }
    }

    protected SDLPen() {
        throw new UnsupportedOperationException();
    }

    @NativeType("SDL_PenDeviceType")
    public static int SDL_GetPenDeviceType(@NativeType("SDL_PenID") int instance_id) {
        long __functionAddress = Functions.GetPenDeviceType;
        return JNI.invokeI(instance_id, __functionAddress);
    }
}
