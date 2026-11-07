package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.LibFFI;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLGamepad.class */
public class SDLGamepad {
    public static final String SDL_PROP_GAMEPAD_CAP_MONO_LED_BOOLEAN = "SDL.joystick.cap.mono_led";
    public static final String SDL_PROP_GAMEPAD_CAP_RGB_LED_BOOLEAN = "SDL.joystick.cap.rgb_led";
    public static final String SDL_PROP_GAMEPAD_CAP_PLAYER_LED_BOOLEAN = "SDL.joystick.cap.player_led";
    public static final String SDL_PROP_GAMEPAD_CAP_RUMBLE_BOOLEAN = "SDL.joystick.cap.rumble";
    public static final String SDL_PROP_GAMEPAD_CAP_TRIGGER_RUMBLE_BOOLEAN = "SDL.joystick.cap.trigger_rumble";
    public static final int SDL_GAMEPAD_TYPE_UNKNOWN = 0;
    public static final int SDL_GAMEPAD_TYPE_STANDARD = 1;
    public static final int SDL_GAMEPAD_TYPE_XBOX360 = 2;
    public static final int SDL_GAMEPAD_TYPE_XBOXONE = 3;
    public static final int SDL_GAMEPAD_TYPE_PS3 = 4;
    public static final int SDL_GAMEPAD_TYPE_PS4 = 5;
    public static final int SDL_GAMEPAD_TYPE_PS5 = 6;
    public static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_PRO = 7;
    public static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_LEFT = 8;
    public static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT = 9;
    public static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_PAIR = 10;
    public static final int SDL_GAMEPAD_TYPE_GAMECUBE = 11;
    public static final int SDL_GAMEPAD_TYPE_COUNT = 12;
    public static final int SDL_GAMEPAD_BUTTON_INVALID = -1;
    public static final int SDL_GAMEPAD_BUTTON_SOUTH = 0;
    public static final int SDL_GAMEPAD_BUTTON_EAST = 1;
    public static final int SDL_GAMEPAD_BUTTON_WEST = 2;
    public static final int SDL_GAMEPAD_BUTTON_NORTH = 3;
    public static final int SDL_GAMEPAD_BUTTON_BACK = 4;
    public static final int SDL_GAMEPAD_BUTTON_GUIDE = 5;
    public static final int SDL_GAMEPAD_BUTTON_START = 6;
    public static final int SDL_GAMEPAD_BUTTON_LEFT_STICK = 7;
    public static final int SDL_GAMEPAD_BUTTON_RIGHT_STICK = 8;
    public static final int SDL_GAMEPAD_BUTTON_LEFT_SHOULDER = 9;
    public static final int SDL_GAMEPAD_BUTTON_RIGHT_SHOULDER = 10;
    public static final int SDL_GAMEPAD_BUTTON_DPAD_UP = 11;
    public static final int SDL_GAMEPAD_BUTTON_DPAD_DOWN = 12;
    public static final int SDL_GAMEPAD_BUTTON_DPAD_LEFT = 13;
    public static final int SDL_GAMEPAD_BUTTON_DPAD_RIGHT = 14;
    public static final int SDL_GAMEPAD_BUTTON_MISC1 = 15;
    public static final int SDL_GAMEPAD_BUTTON_RIGHT_PADDLE1 = 16;
    public static final int SDL_GAMEPAD_BUTTON_LEFT_PADDLE1 = 17;
    public static final int SDL_GAMEPAD_BUTTON_RIGHT_PADDLE2 = 18;
    public static final int SDL_GAMEPAD_BUTTON_LEFT_PADDLE2 = 19;
    public static final int SDL_GAMEPAD_BUTTON_TOUCHPAD = 20;
    public static final int SDL_GAMEPAD_BUTTON_MISC2 = 21;
    public static final int SDL_GAMEPAD_BUTTON_MISC3 = 22;
    public static final int SDL_GAMEPAD_BUTTON_MISC4 = 23;
    public static final int SDL_GAMEPAD_BUTTON_MISC5 = 24;
    public static final int SDL_GAMEPAD_BUTTON_MISC6 = 25;
    public static final int SDL_GAMEPAD_BUTTON_COUNT = 26;
    public static final int SDL_GAMEPAD_BUTTON_LABEL_UNKNOWN = 0;
    public static final int SDL_GAMEPAD_BUTTON_LABEL_A = 1;
    public static final int SDL_GAMEPAD_BUTTON_LABEL_B = 2;
    public static final int SDL_GAMEPAD_BUTTON_LABEL_X = 3;
    public static final int SDL_GAMEPAD_BUTTON_LABEL_Y = 4;
    public static final int SDL_GAMEPAD_BUTTON_LABEL_CROSS = 5;
    public static final int SDL_GAMEPAD_BUTTON_LABEL_CIRCLE = 6;
    public static final int SDL_GAMEPAD_BUTTON_LABEL_SQUARE = 7;
    public static final int SDL_GAMEPAD_BUTTON_LABEL_TRIANGLE = 8;
    public static final int SDL_GAMEPAD_AXIS_INVALID = -1;
    public static final int SDL_GAMEPAD_AXIS_LEFTX = 0;
    public static final int SDL_GAMEPAD_AXIS_LEFTY = 1;
    public static final int SDL_GAMEPAD_AXIS_RIGHTX = 2;
    public static final int SDL_GAMEPAD_AXIS_RIGHTY = 3;
    public static final int SDL_GAMEPAD_AXIS_LEFT_TRIGGER = 4;
    public static final int SDL_GAMEPAD_AXIS_RIGHT_TRIGGER = 5;
    public static final int SDL_GAMEPAD_AXIS_COUNT = 6;
    public static final int SDL_GAMEPAD_BINDTYPE_NONE = 0;
    public static final int SDL_GAMEPAD_BINDTYPE_BUTTON = 1;
    public static final int SDL_GAMEPAD_BINDTYPE_AXIS = 2;
    public static final int SDL_GAMEPAD_BINDTYPE_HAT = 3;
    private static final FFICIF SDL_GetGamepadMappingForGUIDCIF = APIUtil.apiCreateCIF(LibFFI.ffi_type_pointer, APIUtil.apiCreateStruct(APIUtil.apiCreateArray(LibFFI.ffi_type_uint8, 16)));
    private static final FFICIF SDL_GetGamepadGUIDForIDCIF = APIUtil.apiCreateCIF(APIUtil.apiCreateStruct(APIUtil.apiCreateArray(LibFFI.ffi_type_uint8, 16)), LibFFI.ffi_type_uint32);

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLGamepad$Functions.class */
    public static final class Functions {
        public static final long AddGamepadMapping = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddGamepadMapping");
        public static final long AddGamepadMappingsFromIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddGamepadMappingsFromIO");
        public static final long AddGamepadMappingsFromFile = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddGamepadMappingsFromFile");
        public static final long ReloadGamepadMappings = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReloadGamepadMappings");
        public static final long GetGamepadMappings = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadMappings");
        public static final long GetGamepadMappingForGUID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadMappingForGUID");
        public static final long GetGamepadMapping = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadMapping");
        public static final long SetGamepadMapping = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGamepadMapping");
        public static final long HasGamepad = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasGamepad");
        public static final long GetGamepads = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepads");
        public static final long IsGamepad = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsGamepad");
        public static final long GetGamepadNameForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadNameForID");
        public static final long GetGamepadPathForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadPathForID");
        public static final long GetGamepadPlayerIndexForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadPlayerIndexForID");
        public static final long GetGamepadGUIDForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadGUIDForID");
        public static final long GetGamepadVendorForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadVendorForID");
        public static final long GetGamepadProductForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadProductForID");
        public static final long GetGamepadProductVersionForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadProductVersionForID");
        public static final long GetGamepadTypeForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadTypeForID");
        public static final long GetRealGamepadTypeForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRealGamepadTypeForID");
        public static final long GetGamepadMappingForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadMappingForID");
        public static final long OpenGamepad = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenGamepad");
        public static final long GetGamepadFromID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadFromID");
        public static final long GetGamepadFromPlayerIndex = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadFromPlayerIndex");
        public static final long GetGamepadProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadProperties");
        public static final long GetGamepadID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadID");
        public static final long GetGamepadName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadName");
        public static final long GetGamepadPath = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadPath");
        public static final long GetGamepadType = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadType");
        public static final long GetRealGamepadType = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRealGamepadType");
        public static final long GetGamepadPlayerIndex = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadPlayerIndex");
        public static final long SetGamepadPlayerIndex = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGamepadPlayerIndex");
        public static final long GetGamepadVendor = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadVendor");
        public static final long GetGamepadProduct = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadProduct");
        public static final long GetGamepadProductVersion = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadProductVersion");
        public static final long GetGamepadFirmwareVersion = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadFirmwareVersion");
        public static final long GetGamepadSerial = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadSerial");
        public static final long GetGamepadSteamHandle = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadSteamHandle");
        public static final long GetGamepadConnectionState = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadConnectionState");
        public static final long GetGamepadPowerInfo = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadPowerInfo");
        public static final long GamepadConnected = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadConnected");
        public static final long GetGamepadJoystick = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadJoystick");
        public static final long SetGamepadEventsEnabled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGamepadEventsEnabled");
        public static final long GamepadEventsEnabled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadEventsEnabled");
        public static final long GetGamepadBindings = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadBindings");
        public static final long UpdateGamepads = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateGamepads");
        public static final long GetGamepadTypeFromString = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadTypeFromString");
        public static final long GetGamepadStringForType = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadStringForType");
        public static final long GetGamepadAxisFromString = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadAxisFromString");
        public static final long GetGamepadStringForAxis = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadStringForAxis");
        public static final long GamepadHasAxis = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadHasAxis");
        public static final long GetGamepadAxis = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadAxis");
        public static final long GetGamepadButtonFromString = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadButtonFromString");
        public static final long GetGamepadStringForButton = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadStringForButton");
        public static final long GamepadHasButton = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadHasButton");
        public static final long GetGamepadButton = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadButton");
        public static final long GetGamepadButtonLabelForType = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadButtonLabelForType");
        public static final long GetGamepadButtonLabel = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadButtonLabel");
        public static final long GetNumGamepadTouchpads = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumGamepadTouchpads");
        public static final long GetNumGamepadTouchpadFingers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumGamepadTouchpadFingers");
        public static final long GetGamepadTouchpadFinger = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadTouchpadFinger");
        public static final long GamepadHasSensor = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadHasSensor");
        public static final long SetGamepadSensorEnabled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGamepadSensorEnabled");
        public static final long GamepadSensorEnabled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadSensorEnabled");
        public static final long GetGamepadSensorDataRate = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadSensorDataRate");
        public static final long GetGamepadSensorData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadSensorData");
        public static final long RumbleGamepad = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RumbleGamepad");
        public static final long RumbleGamepadTriggers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RumbleGamepadTriggers");
        public static final long SetGamepadLED = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGamepadLED");
        public static final long SendGamepadEffect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SendGamepadEffect");
        public static final long CloseGamepad = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseGamepad");
        public static final long GetGamepadAppleSFSymbolsNameForButton = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadAppleSFSymbolsNameForButton");
        public static final long GetGamepadAppleSFSymbolsNameForAxis = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadAppleSFSymbolsNameForAxis");

        private Functions() {
        }
    }

    protected SDLGamepad() {
        throw new UnsupportedOperationException();
    }

    public static int nSDL_AddGamepadMapping(long mapping) {
        long __functionAddress = Functions.AddGamepadMapping;
        return JNI.invokePI(mapping, __functionAddress);
    }

    public static int SDL_AddGamepadMapping(@NativeType("char const *") ByteBuffer mapping) {
        if (Checks.CHECKS) {
            Checks.checkNT1(mapping);
        }
        return nSDL_AddGamepadMapping(MemoryUtil.memAddress(mapping));
    }

    public static int SDL_AddGamepadMapping(@NativeType("char const *") CharSequence mapping) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(mapping, true);
            long mappingEncoded = stack.getPointerAddress();
            int iNSDL_AddGamepadMapping = nSDL_AddGamepadMapping(mappingEncoded);
            stack.setPointer(stackPointer);
            return iNSDL_AddGamepadMapping;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int SDL_AddGamepadMappingsFromIO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        long __functionAddress = Functions.AddGamepadMappingsFromIO;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePI(src, closeio, __functionAddress);
    }

    public static int nSDL_AddGamepadMappingsFromFile(long file) {
        long __functionAddress = Functions.AddGamepadMappingsFromFile;
        return JNI.invokePI(file, __functionAddress);
    }

    public static int SDL_AddGamepadMappingsFromFile(@NativeType("char const *") ByteBuffer file) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
        }
        return nSDL_AddGamepadMappingsFromFile(MemoryUtil.memAddress(file));
    }

    public static int SDL_AddGamepadMappingsFromFile(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            int iNSDL_AddGamepadMappingsFromFile = nSDL_AddGamepadMappingsFromFile(fileEncoded);
            stack.setPointer(stackPointer);
            return iNSDL_AddGamepadMappingsFromFile;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("bool")
    public static boolean SDL_ReloadGamepadMappings() {
        long __functionAddress = Functions.ReloadGamepadMappings;
        return JNI.invokeZ(__functionAddress);
    }

    public static long nSDL_GetGamepadMappings(long count) {
        long __functionAddress = Functions.GetGamepadMappings;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("char **")
    public static PointerBuffer SDL_GetGamepadMappings() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetGamepadMappings(MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetGamepadMappingForGUID(long guid) {
        long __functionAddress = Functions.GetGamepadMappingForGUID;
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long __result = stack.npointer(0L);
            long arguments = stack.nmalloc(MemoryStack.POINTER_SIZE, MemoryStack.POINTER_SIZE * 1);
            MemoryUtil.memPutAddress(arguments, guid);
            LibFFI.nffi_call(SDL_GetGamepadMappingForGUIDCIF.address(), __functionAddress, __result, arguments);
            long jMemGetAddress = MemoryUtil.memGetAddress(__result);
            stack.setPointer(stackPointer);
            return jMemGetAddress;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char *")
    public static String SDL_GetGamepadMappingForGUID(SDL_GUID guid) {
        long __result = 0;
        try {
            __result = nSDL_GetGamepadMappingForGUID(guid.address());
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            SDLStdinc.nSDL_free(__result);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            SDLStdinc.nSDL_free(__result);
            throw th;
        }
    }

    public static long nSDL_GetGamepadMapping(long gamepad) {
        long __functionAddress = Functions.GetGamepadMapping;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePP(gamepad, __functionAddress);
    }

    @NativeType("char *")
    public static String SDL_GetGamepadMapping(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = 0;
        try {
            __result = nSDL_GetGamepadMapping(gamepad);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            SDLStdinc.nSDL_free(__result);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            SDLStdinc.nSDL_free(__result);
            throw th;
        }
    }

    public static boolean nSDL_SetGamepadMapping(int instance_id, long mapping) {
        long __functionAddress = Functions.SetGamepadMapping;
        return JNI.invokePZ(instance_id, mapping, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetGamepadMapping(@NativeType("SDL_JoystickID") int instance_id, @NativeType("char const *") ByteBuffer mapping) {
        if (Checks.CHECKS) {
            Checks.checkNT1(mapping);
        }
        return nSDL_SetGamepadMapping(instance_id, MemoryUtil.memAddress(mapping));
    }

    @NativeType("bool")
    public static boolean SDL_SetGamepadMapping(@NativeType("SDL_JoystickID") int instance_id, @NativeType("char const *") CharSequence mapping) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(mapping, true);
            long mappingEncoded = stack.getPointerAddress();
            boolean zNSDL_SetGamepadMapping = nSDL_SetGamepadMapping(instance_id, mappingEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_SetGamepadMapping;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("bool")
    public static boolean SDL_HasGamepad() {
        long __functionAddress = Functions.HasGamepad;
        return JNI.invokeZ(__functionAddress);
    }

    public static long nSDL_GetGamepads(long count) {
        long __functionAddress = Functions.GetGamepads;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_JoystickID *")
    public static IntBuffer SDL_GetGamepads() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetGamepads(MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("bool")
    public static boolean SDL_IsGamepad(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.IsGamepad;
        return JNI.invokeZ(instance_id, __functionAddress);
    }

    public static long nSDL_GetGamepadNameForID(int instance_id) {
        long __functionAddress = Functions.GetGamepadNameForID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGamepadNameForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetGamepadNameForID(instance_id);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nSDL_GetGamepadPathForID(int instance_id) {
        long __functionAddress = Functions.GetGamepadPathForID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGamepadPathForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetGamepadPathForID(instance_id);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static int SDL_GetGamepadPlayerIndexForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadPlayerIndexForID;
        return JNI.invokeI(instance_id, __functionAddress);
    }

    public static void nSDL_GetGamepadGUIDForID(int instance_id, long __result) {
        long __functionAddress = Functions.GetGamepadGUIDForID;
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(MemoryStack.POINTER_SIZE, MemoryStack.POINTER_SIZE * 1);
            MemoryUtil.memPutAddress(arguments, stack.nint(instance_id));
            LibFFI.nffi_call(SDL_GetGamepadGUIDForIDCIF.address(), __functionAddress, __result, arguments);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static SDL_GUID SDL_GetGamepadGUIDForID(@NativeType("SDL_JoystickID") int instance_id, SDL_GUID __result) {
        nSDL_GetGamepadGUIDForID(instance_id, __result.address());
        return __result;
    }

    @NativeType("Uint16")
    public static short SDL_GetGamepadVendorForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadVendorForID;
        return JNI.invokeC(instance_id, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetGamepadProductForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadProductForID;
        return JNI.invokeC(instance_id, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetGamepadProductVersionForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadProductVersionForID;
        return JNI.invokeC(instance_id, __functionAddress);
    }

    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadTypeForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadTypeForID;
        return JNI.invokeI(instance_id, __functionAddress);
    }

    @NativeType("SDL_GamepadType")
    public static int SDL_GetRealGamepadTypeForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetRealGamepadTypeForID;
        return JNI.invokeI(instance_id, __functionAddress);
    }

    public static long nSDL_GetGamepadMappingForID(int instance_id) {
        long __functionAddress = Functions.GetGamepadMappingForID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("char *")
    public static String SDL_GetGamepadMappingForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = 0;
        try {
            __result = nSDL_GetGamepadMappingForID(instance_id);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            SDLStdinc.nSDL_free(__result);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            SDLStdinc.nSDL_free(__result);
            throw th;
        }
    }

    @NativeType("SDL_Gamepad *")
    public static long SDL_OpenGamepad(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.OpenGamepad;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("SDL_Gamepad *")
    public static long SDL_GetGamepadFromID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadFromID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("SDL_Gamepad *")
    public static long SDL_GetGamepadFromPlayerIndex(int player_index) {
        long __functionAddress = Functions.GetGamepadFromPlayerIndex;
        return JNI.invokeP(player_index, __functionAddress);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetGamepadProperties(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadProperties;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePI(gamepad, __functionAddress);
    }

    @NativeType("SDL_JoystickID")
    public static int SDL_GetGamepadID(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadID;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePI(gamepad, __functionAddress);
    }

    public static long nSDL_GetGamepadName(long gamepad) {
        long __functionAddress = Functions.GetGamepadName;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePP(gamepad, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGamepadName(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = nSDL_GetGamepadName(gamepad);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nSDL_GetGamepadPath(long gamepad) {
        long __functionAddress = Functions.GetGamepadPath;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePP(gamepad, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGamepadPath(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = nSDL_GetGamepadPath(gamepad);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadType(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadType;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePI(gamepad, __functionAddress);
    }

    @NativeType("SDL_GamepadType")
    public static int SDL_GetRealGamepadType(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetRealGamepadType;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePI(gamepad, __functionAddress);
    }

    public static int SDL_GetGamepadPlayerIndex(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadPlayerIndex;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePI(gamepad, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetGamepadPlayerIndex(@NativeType("SDL_Gamepad *") long gamepad, int player_index) {
        long __functionAddress = Functions.SetGamepadPlayerIndex;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePZ(gamepad, player_index, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetGamepadVendor(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadVendor;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePC(gamepad, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetGamepadProduct(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadProduct;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePC(gamepad, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetGamepadProductVersion(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadProductVersion;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePC(gamepad, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_GetGamepadFirmwareVersion(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadFirmwareVersion;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePC(gamepad, __functionAddress);
    }

    public static long nSDL_GetGamepadSerial(long gamepad) {
        long __functionAddress = Functions.GetGamepadSerial;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePP(gamepad, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGamepadSerial(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = nSDL_GetGamepadSerial(gamepad);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("Uint64")
    public static long SDL_GetGamepadSteamHandle(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadSteamHandle;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePJ(gamepad, __functionAddress);
    }

    @NativeType("SDL_JoystickConnectionState")
    public static int SDL_GetGamepadConnectionState(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadConnectionState;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePI(gamepad, __functionAddress);
    }

    public static int nSDL_GetGamepadPowerInfo(long gamepad, long percent) {
        long __functionAddress = Functions.GetGamepadPowerInfo;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePPI(gamepad, percent, __functionAddress);
    }

    @NativeType("SDL_PowerState")
    public static int SDL_GetGamepadPowerInfo(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("int *") IntBuffer percent) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) percent, 1);
        }
        return nSDL_GetGamepadPowerInfo(gamepad, MemoryUtil.memAddressSafe(percent));
    }

    @NativeType("bool")
    public static boolean SDL_GamepadConnected(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GamepadConnected;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePZ(gamepad, __functionAddress);
    }

    @NativeType("SDL_Joystick *")
    public static long SDL_GetGamepadJoystick(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadJoystick;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePP(gamepad, __functionAddress);
    }

    public static void SDL_SetGamepadEventsEnabled(@NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetGamepadEventsEnabled;
        JNI.invokeV(enabled, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GamepadEventsEnabled() {
        long __functionAddress = Functions.GamepadEventsEnabled;
        return JNI.invokeZ(__functionAddress);
    }

    public static long nSDL_GetGamepadBindings(long gamepad, long count) {
        long __functionAddress = Functions.GetGamepadBindings;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePPP(gamepad, count, __functionAddress);
    }

    @NativeType("SDL_GamepadBinding **")
    public static PointerBuffer SDL_GetGamepadBindings(@NativeType("SDL_Gamepad *") long gamepad) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetGamepadBindings(gamepad, MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void SDL_UpdateGamepads() {
        long __functionAddress = Functions.UpdateGamepads;
        JNI.invokeV(__functionAddress);
    }

    public static int nSDL_GetGamepadTypeFromString(long str) {
        long __functionAddress = Functions.GetGamepadTypeFromString;
        return JNI.invokePI(str, __functionAddress);
    }

    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadTypeFromString(@NativeType("char const *") ByteBuffer str) {
        if (Checks.CHECKS) {
            Checks.checkNT1(str);
        }
        return nSDL_GetGamepadTypeFromString(MemoryUtil.memAddress(str));
    }

    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadTypeFromString(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            int iNSDL_GetGamepadTypeFromString = nSDL_GetGamepadTypeFromString(strEncoded);
            stack.setPointer(stackPointer);
            return iNSDL_GetGamepadTypeFromString;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetGamepadStringForType(int type) {
        long __functionAddress = Functions.GetGamepadStringForType;
        return JNI.invokeP(type, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGamepadStringForType(@NativeType("SDL_GamepadType") int type) {
        long __result = nSDL_GetGamepadStringForType(type);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static int nSDL_GetGamepadAxisFromString(long str) {
        long __functionAddress = Functions.GetGamepadAxisFromString;
        return JNI.invokePI(str, __functionAddress);
    }

    @NativeType("SDL_GamepadAxis")
    public static int SDL_GetGamepadAxisFromString(@NativeType("char const *") ByteBuffer str) {
        if (Checks.CHECKS) {
            Checks.checkNT1(str);
        }
        return nSDL_GetGamepadAxisFromString(MemoryUtil.memAddress(str));
    }

    @NativeType("SDL_GamepadAxis")
    public static int SDL_GetGamepadAxisFromString(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            int iNSDL_GetGamepadAxisFromString = nSDL_GetGamepadAxisFromString(strEncoded);
            stack.setPointer(stackPointer);
            return iNSDL_GetGamepadAxisFromString;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetGamepadStringForAxis(int axis) {
        long __functionAddress = Functions.GetGamepadStringForAxis;
        return JNI.invokeP(axis, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGamepadStringForAxis(@NativeType("SDL_GamepadAxis") int axis) {
        long __result = nSDL_GetGamepadStringForAxis(axis);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("bool")
    public static boolean SDL_GamepadHasAxis(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadAxis") int axis) {
        long __functionAddress = Functions.GamepadHasAxis;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePZ(gamepad, axis, __functionAddress);
    }

    @NativeType("Sint16")
    public static short SDL_GetGamepadAxis(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadAxis") int axis) {
        long __functionAddress = Functions.GetGamepadAxis;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePS(gamepad, axis, __functionAddress);
    }

    public static int nSDL_GetGamepadButtonFromString(long str) {
        long __functionAddress = Functions.GetGamepadButtonFromString;
        return JNI.invokePI(str, __functionAddress);
    }

    @NativeType("SDL_GamepadButton")
    public static int SDL_GetGamepadButtonFromString(@NativeType("char const *") ByteBuffer str) {
        if (Checks.CHECKS) {
            Checks.checkNT1(str);
        }
        return nSDL_GetGamepadButtonFromString(MemoryUtil.memAddress(str));
    }

    @NativeType("SDL_GamepadButton")
    public static int SDL_GetGamepadButtonFromString(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            int iNSDL_GetGamepadButtonFromString = nSDL_GetGamepadButtonFromString(strEncoded);
            stack.setPointer(stackPointer);
            return iNSDL_GetGamepadButtonFromString;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetGamepadStringForButton(int button) {
        long __functionAddress = Functions.GetGamepadStringForButton;
        return JNI.invokeP(button, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGamepadStringForButton(@NativeType("SDL_GamepadButton") int button) {
        long __result = nSDL_GetGamepadStringForButton(button);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("bool")
    public static boolean SDL_GamepadHasButton(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GamepadHasButton;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePZ(gamepad, button, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetGamepadButton(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GetGamepadButton;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePZ(gamepad, button, __functionAddress);
    }

    @NativeType("SDL_GamepadButtonLabel")
    public static int SDL_GetGamepadButtonLabelForType(@NativeType("SDL_GamepadType") int type, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GetGamepadButtonLabelForType;
        return JNI.invokeI(type, button, __functionAddress);
    }

    @NativeType("SDL_GamepadButtonLabel")
    public static int SDL_GetGamepadButtonLabel(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GetGamepadButtonLabel;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePI(gamepad, button, __functionAddress);
    }

    public static int SDL_GetNumGamepadTouchpads(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetNumGamepadTouchpads;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePI(gamepad, __functionAddress);
    }

    public static int SDL_GetNumGamepadTouchpadFingers(@NativeType("SDL_Gamepad *") long gamepad, int touchpad) {
        long __functionAddress = Functions.GetNumGamepadTouchpadFingers;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePI(gamepad, touchpad, __functionAddress);
    }

    public static boolean nSDL_GetGamepadTouchpadFinger(long gamepad, int touchpad, int finger, long down, long x, long y, long pressure) {
        long __functionAddress = Functions.GetGamepadTouchpadFinger;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePPPPPZ(gamepad, touchpad, finger, down, x, y, pressure, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetGamepadTouchpadFinger(@NativeType("SDL_Gamepad *") long gamepad, int touchpad, int finger, @NativeType("bool *") ByteBuffer down, @NativeType("float *") FloatBuffer x, @NativeType("float *") FloatBuffer y, @NativeType("float *") FloatBuffer pressure) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) down, 1);
            Checks.checkSafe((Buffer) x, 1);
            Checks.checkSafe((Buffer) y, 1);
            Checks.checkSafe((Buffer) pressure, 1);
        }
        return nSDL_GetGamepadTouchpadFinger(gamepad, touchpad, finger, MemoryUtil.memAddressSafe(down), MemoryUtil.memAddressSafe(x), MemoryUtil.memAddressSafe(y), MemoryUtil.memAddressSafe(pressure));
    }

    @NativeType("bool")
    public static boolean SDL_GamepadHasSensor(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type) {
        long __functionAddress = Functions.GamepadHasSensor;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePZ(gamepad, type, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetGamepadSensorEnabled(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetGamepadSensorEnabled;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePZ(gamepad, type, enabled, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GamepadSensorEnabled(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type) {
        long __functionAddress = Functions.GamepadSensorEnabled;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePZ(gamepad, type, __functionAddress);
    }

    public static float SDL_GetGamepadSensorDataRate(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type) {
        long __functionAddress = Functions.GetGamepadSensorDataRate;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePF(gamepad, type, __functionAddress);
    }

    public static boolean nSDL_GetGamepadSensorData(long gamepad, int type, long data, int num_values) {
        long __functionAddress = Functions.GetGamepadSensorData;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePPZ(gamepad, type, data, num_values, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetGamepadSensorData(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type, @NativeType("float *") FloatBuffer data) {
        return nSDL_GetGamepadSensorData(gamepad, type, MemoryUtil.memAddress(data), data.remaining());
    }

    @NativeType("bool")
    public static boolean SDL_RumbleGamepad(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("Uint16") short low_frequency_rumble, @NativeType("Uint16") short high_frequency_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleGamepad;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePCCZ(gamepad, low_frequency_rumble, high_frequency_rumble, duration_ms, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RumbleGamepadTriggers(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("Uint16") short left_rumble, @NativeType("Uint16") short right_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleGamepadTriggers;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePCCZ(gamepad, left_rumble, right_rumble, duration_ms, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetGamepadLED(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("Uint8") byte red, @NativeType("Uint8") byte green, @NativeType("Uint8") byte blue) {
        long __functionAddress = Functions.SetGamepadLED;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePUUUZ(gamepad, red, green, blue, __functionAddress);
    }

    public static boolean nSDL_SendGamepadEffect(long gamepad, long data, int size) {
        long __functionAddress = Functions.SendGamepadEffect;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePPZ(gamepad, data, size, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SendGamepadEffect(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("void const *") ByteBuffer data) {
        return nSDL_SendGamepadEffect(gamepad, MemoryUtil.memAddress(data), data.remaining());
    }

    public static void SDL_CloseGamepad(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.CloseGamepad;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        JNI.invokePV(gamepad, __functionAddress);
    }

    public static long nSDL_GetGamepadAppleSFSymbolsNameForButton(long gamepad, int button) {
        long __functionAddress = Functions.GetGamepadAppleSFSymbolsNameForButton;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePP(gamepad, button, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGamepadAppleSFSymbolsNameForButton(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __result = nSDL_GetGamepadAppleSFSymbolsNameForButton(gamepad, button);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nSDL_GetGamepadAppleSFSymbolsNameForAxis(long gamepad, int axis) {
        long __functionAddress = Functions.GetGamepadAppleSFSymbolsNameForAxis;
        if (Checks.CHECKS) {
            Checks.check(gamepad);
        }
        return JNI.invokePP(gamepad, axis, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetGamepadAppleSFSymbolsNameForAxis(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadAxis") int axis) {
        long __result = nSDL_GetGamepadAppleSFSymbolsNameForAxis(gamepad, axis);
        return MemoryUtil.memUTF8Safe(__result);
    }
}
