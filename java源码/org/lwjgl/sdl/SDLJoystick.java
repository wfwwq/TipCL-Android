package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.LibFFI;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLJoystick.class */
public class SDLJoystick {
    public static final int SDL_JOYSTICK_TYPE_UNKNOWN = 0;
    public static final int SDL_JOYSTICK_TYPE_GAMEPAD = 1;
    public static final int SDL_JOYSTICK_TYPE_WHEEL = 2;
    public static final int SDL_JOYSTICK_TYPE_ARCADE_STICK = 3;
    public static final int SDL_JOYSTICK_TYPE_FLIGHT_STICK = 4;
    public static final int SDL_JOYSTICK_TYPE_DANCE_PAD = 5;
    public static final int SDL_JOYSTICK_TYPE_GUITAR = 6;
    public static final int SDL_JOYSTICK_TYPE_DRUM_KIT = 7;
    public static final int SDL_JOYSTICK_TYPE_ARCADE_PAD = 8;
    public static final int SDL_JOYSTICK_TYPE_THROTTLE = 9;
    public static final int SDL_JOYSTICK_TYPE_COUNT = 10;
    public static final int SDL_JOYSTICK_CONNECTION_INVALID = -1;
    public static final int SDL_JOYSTICK_CONNECTION_UNKNOWN = 0;
    public static final int SDL_JOYSTICK_CONNECTION_WIRED = 1;
    public static final int SDL_JOYSTICK_CONNECTION_WIRELESS = 2;
    public static final int SDL_JOYSTICK_AXIS_MAX = 32767;
    public static final int SDL_JOYSTICK_AXIS_MIN = -32768;
    public static final String SDL_PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN = "SDL.joystick.cap.mono_led";
    public static final String SDL_PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN = "SDL.joystick.cap.rgb_led";
    public static final String SDL_PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN = "SDL.joystick.cap.player_led";
    public static final String SDL_PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN = "SDL.joystick.cap.rumble";
    public static final String SDL_PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN = "SDL.joystick.cap.trigger_rumble";
    public static final int SDL_HAT_CENTERED = 0;
    public static final int SDL_HAT_UP = 1;
    public static final int SDL_HAT_RIGHT = 2;
    public static final int SDL_HAT_DOWN = 4;
    public static final int SDL_HAT_LEFT = 8;
    public static final int SDL_HAT_RIGHTUP = 3;
    public static final int SDL_HAT_RIGHTDOWN = 6;
    public static final int SDL_HAT_LEFTUP = 9;
    public static final int SDL_HAT_LEFTDOWN = 12;
    private static final FFICIF SDL_GetJoystickGUIDForIDCIF = APIUtil.apiCreateCIF(APIUtil.apiCreateStruct(APIUtil.apiCreateArray(LibFFI.ffi_type_uint8, 16)), LibFFI.ffi_type_uint32);
    private static final FFICIF SDL_GetJoystickGUIDCIF = APIUtil.apiCreateCIF(APIUtil.apiCreateStruct(APIUtil.apiCreateArray(LibFFI.ffi_type_uint8, 16)), LibFFI.ffi_type_pointer);
    private static final FFICIF SDL_GetJoystickGUIDInfoCIF = APIUtil.apiCreateCIF(LibFFI.ffi_type_void, APIUtil.apiCreateStruct(APIUtil.apiCreateArray(LibFFI.ffi_type_uint8, 16)), LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer);

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLJoystick$Functions.class */
    public static final class Functions {
        public static final long LockJoysticks = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockJoysticks");
        public static final long UnlockJoysticks = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnlockJoysticks");
        public static final long HasJoystick = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasJoystick");
        public static final long GetJoysticks = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoysticks");
        public static final long GetJoystickNameForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickNameForID");
        public static final long GetJoystickPathForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickPathForID");
        public static final long GetJoystickPlayerIndexForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickPlayerIndexForID");
        public static final long GetJoystickGUIDForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickGUIDForID");
        public static final long GetJoystickVendorForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickVendorForID");
        public static final long GetJoystickProductForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickProductForID");
        public static final long GetJoystickProductVersionForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickProductVersionForID");
        public static final long GetJoystickTypeForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickTypeForID");
        public static final long OpenJoystick = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenJoystick");
        public static final long GetJoystickFromID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickFromID");
        public static final long GetJoystickFromPlayerIndex = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickFromPlayerIndex");
        public static final long AttachVirtualJoystick = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AttachVirtualJoystick");
        public static final long DetachVirtualJoystick = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DetachVirtualJoystick");
        public static final long IsJoystickVirtual = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsJoystickVirtual");
        public static final long SetJoystickVirtualAxis = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickVirtualAxis");
        public static final long SetJoystickVirtualBall = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickVirtualBall");
        public static final long SetJoystickVirtualButton = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickVirtualButton");
        public static final long SetJoystickVirtualHat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickVirtualHat");
        public static final long SetJoystickVirtualTouchpad = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickVirtualTouchpad");
        public static final long SendJoystickVirtualSensorData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SendJoystickVirtualSensorData");
        public static final long GetJoystickProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickProperties");
        public static final long GetJoystickName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickName");
        public static final long GetJoystickPath = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickPath");
        public static final long GetJoystickPlayerIndex = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickPlayerIndex");
        public static final long SetJoystickPlayerIndex = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickPlayerIndex");
        public static final long GetJoystickGUID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickGUID");
        public static final long GetJoystickVendor = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickVendor");
        public static final long GetJoystickProduct = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickProduct");
        public static final long GetJoystickProductVersion = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickProductVersion");
        public static final long GetJoystickFirmwareVersion = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickFirmwareVersion");
        public static final long GetJoystickSerial = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickSerial");
        public static final long GetJoystickType = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickType");
        public static final long GetJoystickGUIDInfo = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickGUIDInfo");
        public static final long JoystickConnected = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_JoystickConnected");
        public static final long GetJoystickID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickID");
        public static final long GetNumJoystickAxes = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumJoystickAxes");
        public static final long GetNumJoystickBalls = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumJoystickBalls");
        public static final long GetNumJoystickHats = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumJoystickHats");
        public static final long GetNumJoystickButtons = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumJoystickButtons");
        public static final long SetJoystickEventsEnabled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickEventsEnabled");
        public static final long JoystickEventsEnabled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_JoystickEventsEnabled");
        public static final long UpdateJoysticks = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateJoysticks");
        public static final long GetJoystickAxis = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickAxis");
        public static final long GetJoystickAxisInitialState = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickAxisInitialState");
        public static final long GetJoystickBall = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickBall");
        public static final long GetJoystickHat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickHat");
        public static final long GetJoystickButton = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickButton");
        public static final long RumbleJoystick = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RumbleJoystick");
        public static final long RumbleJoystickTriggers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RumbleJoystickTriggers");
        public static final long SetJoystickLED = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickLED");
        public static final long SendJoystickEffect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SendJoystickEffect");
        public static final long CloseJoystick = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseJoystick");
        public static final long GetJoystickConnectionState = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickConnectionState");
        public static final long GetJoystickPowerInfo = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickPowerInfo");

        private Functions() {
        }
    }

    protected SDLJoystick() {
        throw new UnsupportedOperationException();
    }

    public static void SDL_LockJoysticks() {
        long __functionAddress = Functions.LockJoysticks;
        JNI.invokeV(__functionAddress);
    }

    public static void SDL_UnlockJoysticks() {
        long __functionAddress = Functions.UnlockJoysticks;
        JNI.invokeV(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasJoystick() {
        long __functionAddress = Functions.HasJoystick;
        return JNI.invokeZ(__functionAddress);
    }

    public static long nSDL_GetJoysticks(long count) {
        long __functionAddress = Functions.GetJoysticks;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_JoystickID *")
    public static IntBuffer SDL_GetJoysticks() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetJoysticks(MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetJoystickNameForID(int instance_id) {
        long __functionAddress = Functions.GetJoystickNameForID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetJoystickNameForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetJoystickNameForID(instance_id);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nSDL_GetJoystickPathForID(int instance_id) {
        long __functionAddress = Functions.GetJoystickPathForID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetJoystickPathForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetJoystickPathForID(instance_id);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static int SDL_GetJoystickPlayerIndexForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickPlayerIndexForID;
        return JNI.invokeI(instance_id, __functionAddress);
    }

    public static void nSDL_GetJoystickGUIDForID(int instance_id, long __result) {
        long __functionAddress = Functions.GetJoystickGUIDForID;
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(MemoryStack.POINTER_SIZE, MemoryStack.POINTER_SIZE * 1);
            MemoryUtil.memPutAddress(arguments, stack.nint(instance_id));
            LibFFI.nffi_call(SDL_GetJoystickGUIDForIDCIF.address(), __functionAddress, __result, arguments);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static SDL_GUID SDL_GetJoystickGUIDForID(@NativeType("SDL_JoystickID") int instance_id, SDL_GUID __result) {
        nSDL_GetJoystickGUIDForID(instance_id, __result.address());
        return __result;
    }

    @NativeType("Uint16")
    public static short SDL_GetJoystickVendorForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickVendorForID;
        return JNI.invokeC(instance_id, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetJoystickProductForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickProductForID;
        return JNI.invokeC(instance_id, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetJoystickProductVersionForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickProductVersionForID;
        return JNI.invokeC(instance_id, __functionAddress);
    }

    @NativeType("SDL_JoystickType")
    public static int SDL_GetJoystickTypeForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickTypeForID;
        return JNI.invokeI(instance_id, __functionAddress);
    }

    @NativeType("SDL_Joystick *")
    public static long SDL_OpenJoystick(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.OpenJoystick;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("SDL_Joystick *")
    public static long SDL_GetJoystickFromID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickFromID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("SDL_Joystick *")
    public static long SDL_GetJoystickFromPlayerIndex(int player_index) {
        long __functionAddress = Functions.GetJoystickFromPlayerIndex;
        return JNI.invokeP(player_index, __functionAddress);
    }

    public static int nSDL_AttachVirtualJoystick(long desc) {
        long __functionAddress = Functions.AttachVirtualJoystick;
        if (Checks.CHECKS) {
            SDL_VirtualJoystickDesc.validate(desc);
        }
        return JNI.invokePI(desc, __functionAddress);
    }

    @NativeType("SDL_JoystickID")
    public static int SDL_AttachVirtualJoystick(@NativeType("SDL_VirtualJoystickDesc const *") SDL_VirtualJoystickDesc desc) {
        return nSDL_AttachVirtualJoystick(desc.address());
    }

    @NativeType("bool")
    public static boolean SDL_DetachVirtualJoystick(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.DetachVirtualJoystick;
        return JNI.invokeZ(instance_id, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_IsJoystickVirtual(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.IsJoystickVirtual;
        return JNI.invokeZ(instance_id, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualAxis(@NativeType("SDL_Joystick *") long joystick, int axis, @NativeType("Sint16") short value) {
        long __functionAddress = Functions.SetJoystickVirtualAxis;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePSZ(joystick, axis, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualBall(@NativeType("SDL_Joystick *") long joystick, int ball, @NativeType("Sint16") short xrel, @NativeType("Sint16") short yrel) {
        long __functionAddress = Functions.SetJoystickVirtualBall;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePSSZ(joystick, ball, xrel, yrel, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualButton(@NativeType("SDL_Joystick *") long joystick, int button, @NativeType("bool") boolean down) {
        long __functionAddress = Functions.SetJoystickVirtualButton;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePZ(joystick, button, down, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualHat(@NativeType("SDL_Joystick *") long joystick, int hat, @NativeType("Uint8") byte value) {
        long __functionAddress = Functions.SetJoystickVirtualHat;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePUZ(joystick, hat, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualTouchpad(@NativeType("SDL_Joystick *") long joystick, int touchpad, int finger, @NativeType("bool") boolean down, float x, float y, float pressure) {
        long __functionAddress = Functions.SetJoystickVirtualTouchpad;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePZ(joystick, touchpad, finger, down, x, y, pressure, __functionAddress);
    }

    public static boolean nSDL_SendJoystickVirtualSensorData(long joystick, int type, long sensor_timestamp, long data, int num_values) {
        long __functionAddress = Functions.SendJoystickVirtualSensorData;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePJPZ(joystick, type, sensor_timestamp, data, num_values, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SendJoystickVirtualSensorData(@NativeType("SDL_Joystick *") long joystick, @NativeType("SDL_SensorType") int type, @NativeType("Uint64") long sensor_timestamp, @NativeType("float const *") FloatBuffer data) {
        return nSDL_SendJoystickVirtualSensorData(joystick, type, sensor_timestamp, MemoryUtil.memAddress(data), data.remaining());
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetJoystickProperties(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickProperties;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePI(joystick, __functionAddress);
    }

    public static long nSDL_GetJoystickName(long joystick) {
        long __functionAddress = Functions.GetJoystickName;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePP(joystick, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetJoystickName(@NativeType("SDL_Joystick *") long joystick) {
        long __result = nSDL_GetJoystickName(joystick);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nSDL_GetJoystickPath(long joystick) {
        long __functionAddress = Functions.GetJoystickPath;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePP(joystick, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetJoystickPath(@NativeType("SDL_Joystick *") long joystick) {
        long __result = nSDL_GetJoystickPath(joystick);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static int SDL_GetJoystickPlayerIndex(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickPlayerIndex;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePI(joystick, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetJoystickPlayerIndex(@NativeType("SDL_Joystick *") long joystick, int player_index) {
        long __functionAddress = Functions.SetJoystickPlayerIndex;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePZ(joystick, player_index, __functionAddress);
    }

    public static void nSDL_GetJoystickGUID(long joystick, long __result) {
        long __functionAddress = Functions.GetJoystickGUID;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(MemoryStack.POINTER_SIZE, MemoryStack.POINTER_SIZE * 1);
            MemoryUtil.memPutAddress(arguments, stack.npointer(joystick));
            LibFFI.nffi_call(SDL_GetJoystickGUIDCIF.address(), __functionAddress, __result, arguments);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static SDL_GUID SDL_GetJoystickGUID(@NativeType("SDL_Joystick *") long joystick, SDL_GUID __result) {
        nSDL_GetJoystickGUID(joystick, __result.address());
        return __result;
    }

    @NativeType("Uint16")
    public static short SDL_GetJoystickVendor(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickVendor;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePC(joystick, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetJoystickProduct(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickProduct;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePC(joystick, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetJoystickProductVersion(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickProductVersion;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePC(joystick, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetJoystickFirmwareVersion(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickFirmwareVersion;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePC(joystick, __functionAddress);
    }

    public static long nSDL_GetJoystickSerial(long joystick) {
        long __functionAddress = Functions.GetJoystickSerial;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePP(joystick, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetJoystickSerial(@NativeType("SDL_Joystick *") long joystick) {
        long __result = nSDL_GetJoystickSerial(joystick);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("SDL_JoystickType")
    public static int SDL_GetJoystickType(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickType;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePI(joystick, __functionAddress);
    }

    public static void nSDL_GetJoystickGUIDInfo(long guid, long vendor, long product, long version, long crc16) {
        long __functionAddress = Functions.GetJoystickGUIDInfo;
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(MemoryStack.POINTER_SIZE, MemoryStack.POINTER_SIZE * 5);
            MemoryUtil.memPutAddress(arguments, guid);
            MemoryUtil.memPutAddress(arguments + MemoryStack.POINTER_SIZE, stack.npointer(vendor));
            MemoryUtil.memPutAddress(arguments + (2 * MemoryStack.POINTER_SIZE), stack.npointer(product));
            MemoryUtil.memPutAddress(arguments + (3 * MemoryStack.POINTER_SIZE), stack.npointer(version));
            MemoryUtil.memPutAddress(arguments + (4 * MemoryStack.POINTER_SIZE), stack.npointer(crc16));
            LibFFI.nffi_call(SDL_GetJoystickGUIDInfoCIF.address(), __functionAddress, 0L, arguments);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void SDL_GetJoystickGUIDInfo(SDL_GUID guid, @NativeType("Uint16 *") ShortBuffer vendor, @NativeType("Uint16 *") ShortBuffer product, @NativeType("Uint16 *") ShortBuffer version, @NativeType("Uint16 *") ShortBuffer crc16) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) vendor, 1);
            Checks.checkSafe((Buffer) product, 1);
            Checks.checkSafe((Buffer) version, 1);
            Checks.checkSafe((Buffer) crc16, 1);
        }
        nSDL_GetJoystickGUIDInfo(guid.address(), MemoryUtil.memAddressSafe(vendor), MemoryUtil.memAddressSafe(product), MemoryUtil.memAddressSafe(version), MemoryUtil.memAddressSafe(crc16));
    }

    @NativeType("bool")
    public static boolean SDL_JoystickConnected(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.JoystickConnected;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePZ(joystick, __functionAddress);
    }

    @NativeType("SDL_JoystickID")
    public static int SDL_GetJoystickID(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickID;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePI(joystick, __functionAddress);
    }

    public static int SDL_GetNumJoystickAxes(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickAxes;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePI(joystick, __functionAddress);
    }

    public static int SDL_GetNumJoystickBalls(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickBalls;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePI(joystick, __functionAddress);
    }

    public static int SDL_GetNumJoystickHats(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickHats;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePI(joystick, __functionAddress);
    }

    public static int SDL_GetNumJoystickButtons(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickButtons;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePI(joystick, __functionAddress);
    }

    public static void SDL_SetJoystickEventsEnabled(@NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetJoystickEventsEnabled;
        JNI.invokeV(enabled, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_JoystickEventsEnabled() {
        long __functionAddress = Functions.JoystickEventsEnabled;
        return JNI.invokeZ(__functionAddress);
    }

    public static void SDL_UpdateJoysticks() {
        long __functionAddress = Functions.UpdateJoysticks;
        JNI.invokeV(__functionAddress);
    }

    @NativeType("Sint16")
    public static short SDL_GetJoystickAxis(@NativeType("SDL_Joystick *") long joystick, int axis) {
        long __functionAddress = Functions.GetJoystickAxis;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePS(joystick, axis, __functionAddress);
    }

    public static boolean nSDL_GetJoystickAxisInitialState(long joystick, int axis, long state) {
        long __functionAddress = Functions.GetJoystickAxisInitialState;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePPZ(joystick, axis, state, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetJoystickAxisInitialState(@NativeType("SDL_Joystick *") long joystick, int axis, @NativeType("Sint16 *") ShortBuffer state) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) state, 1);
        }
        return nSDL_GetJoystickAxisInitialState(joystick, axis, MemoryUtil.memAddressSafe(state));
    }

    public static boolean nSDL_GetJoystickBall(long joystick, int ball, long dx, long dy) {
        long __functionAddress = Functions.GetJoystickBall;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePPPZ(joystick, ball, dx, dy, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetJoystickBall(@NativeType("SDL_Joystick *") long joystick, int ball, @NativeType("int *") IntBuffer dx, @NativeType("int *") IntBuffer dy) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) dx, 1);
            Checks.checkSafe((Buffer) dy, 1);
        }
        return nSDL_GetJoystickBall(joystick, ball, MemoryUtil.memAddressSafe(dx), MemoryUtil.memAddressSafe(dy));
    }

    @NativeType("Uint8")
    public static byte SDL_GetJoystickHat(@NativeType("SDL_Joystick *") long joystick, int hat) {
        long __functionAddress = Functions.GetJoystickHat;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePU(joystick, hat, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetJoystickButton(@NativeType("SDL_Joystick *") long joystick, int button) {
        long __functionAddress = Functions.GetJoystickButton;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePZ(joystick, button, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RumbleJoystick(@NativeType("SDL_Joystick *") long joystick, @NativeType("Uint16") short low_frequency_rumble, @NativeType("Uint16") short high_frequency_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleJoystick;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePCCZ(joystick, low_frequency_rumble, high_frequency_rumble, duration_ms, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RumbleJoystickTriggers(@NativeType("SDL_Joystick *") long joystick, @NativeType("Uint16") short left_rumble, @NativeType("Uint16") short right_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleJoystickTriggers;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePCCZ(joystick, left_rumble, right_rumble, duration_ms, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetJoystickLED(@NativeType("SDL_Joystick *") long joystick, @NativeType("Uint8") byte red, @NativeType("Uint8") byte green, @NativeType("Uint8") byte blue) {
        long __functionAddress = Functions.SetJoystickLED;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePUUUZ(joystick, red, green, blue, __functionAddress);
    }

    public static boolean nSDL_SendJoystickEffect(long joystick, long data, int size) {
        long __functionAddress = Functions.SendJoystickEffect;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePPZ(joystick, data, size, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SendJoystickEffect(@NativeType("SDL_Joystick *") long joystick, @NativeType("void const *") ByteBuffer data) {
        return nSDL_SendJoystickEffect(joystick, MemoryUtil.memAddress(data), data.remaining());
    }

    public static void SDL_CloseJoystick(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.CloseJoystick;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        JNI.invokePV(joystick, __functionAddress);
    }

    @NativeType("SDL_JoystickConnectionState")
    public static int SDL_GetJoystickConnectionState(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickConnectionState;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePI(joystick, __functionAddress);
    }

    public static int nSDL_GetJoystickPowerInfo(long joystick, long percent) {
        long __functionAddress = Functions.GetJoystickPowerInfo;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePPI(joystick, percent, __functionAddress);
    }

    @NativeType("SDL_PowerState")
    public static int SDL_GetJoystickPowerInfo(@NativeType("SDL_Joystick *") long joystick, @NativeType("int *") IntBuffer percent) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) percent, 1);
        }
        return nSDL_GetJoystickPowerInfo(joystick, MemoryUtil.memAddressSafe(percent));
    }

    public static void SDL_INIT_INTERFACE(SDL_VirtualJoystickDesc iface) {
        iface.clear();
        iface.version(SDL_VirtualJoystickDesc.SIZEOF);
    }
}
