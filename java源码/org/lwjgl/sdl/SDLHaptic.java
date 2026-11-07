package org.lwjgl.sdl;

import java.nio.IntBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLHaptic.class */
public class SDLHaptic {
    public static final int SDL_HAPTIC_INFINITY = -1;
    public static final int SDL_HAPTIC_CONSTANT = 1;
    public static final int SDL_HAPTIC_SINE = 2;
    public static final int SDL_HAPTIC_SQUARE = 4;
    public static final int SDL_HAPTIC_TRIANGLE = 8;
    public static final int SDL_HAPTIC_SAWTOOTHUP = 16;
    public static final int SDL_HAPTIC_SAWTOOTHDOWN = 32;
    public static final int SDL_HAPTIC_RAMP = 64;
    public static final int SDL_HAPTIC_SPRING = 128;
    public static final int SDL_HAPTIC_DAMPER = 256;
    public static final int SDL_HAPTIC_INERTIA = 512;
    public static final int SDL_HAPTIC_FRICTION = 1024;
    public static final int SDL_HAPTIC_LEFTRIGHT = 2048;
    public static final int SDL_HAPTIC_RESERVED1 = 4096;
    public static final int SDL_HAPTIC_RESERVED2 = 8192;
    public static final int SDL_HAPTIC_RESERVED3 = 16384;
    public static final int SDL_HAPTIC_CUSTOM = 32768;
    public static final int SDL_HAPTIC_GAIN = 65536;
    public static final int SDL_HAPTIC_AUTOCENTER = 131072;
    public static final int SDL_HAPTIC_STATUS = 262144;
    public static final int SDL_HAPTIC_PAUSE = 524288;
    public static final int SDL_HAPTIC_POLAR = 0;
    public static final int SDL_HAPTIC_CARTESIAN = 1;
    public static final int SDL_HAPTIC_SPHERICAL = 2;
    public static final int SDL_HAPTIC_STEERING_AXIS = 3;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLHaptic$Functions.class */
    public static final class Functions {
        public static final long GetHaptics = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHaptics");
        public static final long GetHapticNameForID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticNameForID");
        public static final long OpenHaptic = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenHaptic");
        public static final long GetHapticFromID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticFromID");
        public static final long GetHapticID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticID");
        public static final long GetHapticName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticName");
        public static final long IsMouseHaptic = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsMouseHaptic");
        public static final long OpenHapticFromMouse = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenHapticFromMouse");
        public static final long IsJoystickHaptic = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsJoystickHaptic");
        public static final long OpenHapticFromJoystick = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenHapticFromJoystick");
        public static final long CloseHaptic = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseHaptic");
        public static final long GetMaxHapticEffects = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMaxHapticEffects");
        public static final long GetMaxHapticEffectsPlaying = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMaxHapticEffectsPlaying");
        public static final long GetHapticFeatures = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticFeatures");
        public static final long GetNumHapticAxes = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumHapticAxes");
        public static final long HapticEffectSupported = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HapticEffectSupported");
        public static final long CreateHapticEffect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateHapticEffect");
        public static final long UpdateHapticEffect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateHapticEffect");
        public static final long RunHapticEffect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RunHapticEffect");
        public static final long StopHapticEffect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_StopHapticEffect");
        public static final long DestroyHapticEffect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyHapticEffect");
        public static final long GetHapticEffectStatus = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticEffectStatus");
        public static final long SetHapticGain = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetHapticGain");
        public static final long SetHapticAutocenter = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetHapticAutocenter");
        public static final long PauseHaptic = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PauseHaptic");
        public static final long ResumeHaptic = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ResumeHaptic");
        public static final long StopHapticEffects = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_StopHapticEffects");
        public static final long HapticRumbleSupported = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HapticRumbleSupported");
        public static final long InitHapticRumble = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_InitHapticRumble");
        public static final long PlayHapticRumble = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PlayHapticRumble");
        public static final long StopHapticRumble = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_StopHapticRumble");

        private Functions() {
        }
    }

    protected SDLHaptic() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_GetHaptics(long count) {
        long __functionAddress = Functions.GetHaptics;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_HapticID *")
    public static IntBuffer SDL_GetHaptics() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetHaptics(MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetHapticNameForID(int instance_id) {
        long __functionAddress = Functions.GetHapticNameForID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetHapticNameForID(@NativeType("SDL_HapticID") int instance_id) {
        long __result = nSDL_GetHapticNameForID(instance_id);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("SDL_Haptic *")
    public static long SDL_OpenHaptic(@NativeType("SDL_HapticID") int instance_id) {
        long __functionAddress = Functions.OpenHaptic;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("SDL_Haptic *")
    public static long SDL_GetHapticFromID(@NativeType("SDL_HapticID") int instance_id) {
        long __functionAddress = Functions.GetHapticFromID;
        return JNI.invokeP(instance_id, __functionAddress);
    }

    @NativeType("SDL_HapticID")
    public static int SDL_GetHapticID(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetHapticID;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePI(haptic, __functionAddress);
    }

    public static long nSDL_GetHapticName(long haptic) {
        long __functionAddress = Functions.GetHapticName;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePP(haptic, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetHapticName(@NativeType("SDL_Haptic *") long haptic) {
        long __result = nSDL_GetHapticName(haptic);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("bool")
    public static boolean SDL_IsMouseHaptic() {
        long __functionAddress = Functions.IsMouseHaptic;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("SDL_Haptic *")
    public static long SDL_OpenHapticFromMouse() {
        long __functionAddress = Functions.OpenHapticFromMouse;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_IsJoystickHaptic(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.IsJoystickHaptic;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePZ(joystick, __functionAddress);
    }

    @NativeType("SDL_Haptic *")
    public static long SDL_OpenHapticFromJoystick(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.OpenHapticFromJoystick;
        if (Checks.CHECKS) {
            Checks.check(joystick);
        }
        return JNI.invokePP(joystick, __functionAddress);
    }

    public static void SDL_CloseHaptic(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.CloseHaptic;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        JNI.invokePV(haptic, __functionAddress);
    }

    public static int SDL_GetMaxHapticEffects(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetMaxHapticEffects;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePI(haptic, __functionAddress);
    }

    public static int SDL_GetMaxHapticEffectsPlaying(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetMaxHapticEffectsPlaying;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePI(haptic, __functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_GetHapticFeatures(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetHapticFeatures;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePI(haptic, __functionAddress);
    }

    public static int SDL_GetNumHapticAxes(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetNumHapticAxes;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePI(haptic, __functionAddress);
    }

    public static boolean nSDL_HapticEffectSupported(long haptic, long effect) {
        long __functionAddress = Functions.HapticEffectSupported;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePPZ(haptic, effect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HapticEffectSupported(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffect const *") SDL_HapticEffect effect) {
        return nSDL_HapticEffectSupported(haptic, effect.address());
    }

    public static int nSDL_CreateHapticEffect(long haptic, long effect) {
        long __functionAddress = Functions.CreateHapticEffect;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePPI(haptic, effect, __functionAddress);
    }

    @NativeType("SDL_HapticEffectID")
    public static int SDL_CreateHapticEffect(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffect const *") SDL_HapticEffect effect) {
        return nSDL_CreateHapticEffect(haptic, effect.address());
    }

    public static boolean nSDL_UpdateHapticEffect(long haptic, int effect, long data) {
        long __functionAddress = Functions.UpdateHapticEffect;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePPZ(haptic, effect, data, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_UpdateHapticEffect(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffectID") int effect, @NativeType("SDL_HapticEffect const *") SDL_HapticEffect data) {
        return nSDL_UpdateHapticEffect(haptic, effect, data.address());
    }

    @NativeType("bool")
    public static boolean SDL_RunHapticEffect(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffectID") int effect, @NativeType("Uint32") int iterations) {
        long __functionAddress = Functions.RunHapticEffect;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, effect, iterations, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_StopHapticEffect(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffectID") int effect) {
        long __functionAddress = Functions.StopHapticEffect;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, effect, __functionAddress);
    }

    public static void SDL_DestroyHapticEffect(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffectID") int effect) {
        long __functionAddress = Functions.DestroyHapticEffect;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        JNI.invokePV(haptic, effect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetHapticEffectStatus(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffectID") int effect) {
        long __functionAddress = Functions.GetHapticEffectStatus;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, effect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetHapticGain(@NativeType("SDL_Haptic *") long haptic, int gain) {
        long __functionAddress = Functions.SetHapticGain;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, gain, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetHapticAutocenter(@NativeType("SDL_Haptic *") long haptic, int autocenter) {
        long __functionAddress = Functions.SetHapticAutocenter;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, autocenter, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_PauseHaptic(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.PauseHaptic;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ResumeHaptic(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.ResumeHaptic;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_StopHapticEffects(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.StopHapticEffects;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HapticRumbleSupported(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.HapticRumbleSupported;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_InitHapticRumble(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.InitHapticRumble;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_PlayHapticRumble(@NativeType("SDL_Haptic *") long haptic, float strength, @NativeType("Uint32") int length) {
        long __functionAddress = Functions.PlayHapticRumble;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, strength, length, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_StopHapticRumble(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.StopHapticRumble;
        if (Checks.CHECKS) {
            Checks.check(haptic);
        }
        return JNI.invokePZ(haptic, __functionAddress);
    }
}
