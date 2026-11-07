package org.lwjgl.sdl;

import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLTouch.class */
public class SDLTouch {
    public static final int SDL_TOUCH_DEVICE_INVALID = -1;
    public static final int SDL_TOUCH_DEVICE_DIRECT = 0;
    public static final int SDL_TOUCH_DEVICE_INDIRECT_ABSOLUTE = 1;
    public static final int SDL_TOUCH_DEVICE_INDIRECT_RELATIVE = 2;
    public static final int SDL_TOUCH_MOUSEID = -1;
    public static final long SDL_MOUSE_TOUCHID = -1;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLTouch$Functions.class */
    public static final class Functions {
        public static final long GetTouchDevices = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTouchDevices");
        public static final long GetTouchDeviceName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTouchDeviceName");
        public static final long GetTouchDeviceType = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTouchDeviceType");
        public static final long GetTouchFingers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTouchFingers");

        private Functions() {
        }
    }

    protected SDLTouch() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_GetTouchDevices(long count) {
        long __functionAddress = Functions.GetTouchDevices;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_TouchID *")
    public static LongBuffer SDL_GetTouchDevices() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetTouchDevices(MemoryUtil.memAddress(count));
            LongBuffer longBufferMemLongBufferSafe = MemoryUtil.memLongBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return longBufferMemLongBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetTouchDeviceName(long touchID) {
        long __functionAddress = Functions.GetTouchDeviceName;
        return JNI.invokeJP(touchID, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetTouchDeviceName(@NativeType("SDL_TouchID") long touchID) {
        long __result = nSDL_GetTouchDeviceName(touchID);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("SDL_TouchDeviceType")
    public static int SDL_GetTouchDeviceType(@NativeType("SDL_TouchID") long touchID) {
        long __functionAddress = Functions.GetTouchDeviceType;
        return JNI.invokeJI(touchID, __functionAddress);
    }

    public static long nSDL_GetTouchFingers(long touchID, long count) {
        long __functionAddress = Functions.GetTouchFingers;
        return JNI.invokeJPP(touchID, count, __functionAddress);
    }

    @NativeType("SDL_Finger **")
    public static PointerBuffer SDL_GetTouchFingers(@NativeType("SDL_TouchID") long touchID) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetTouchFingers(touchID, MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
