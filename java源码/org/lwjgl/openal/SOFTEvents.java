package org.lwjgl.openal;

import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTEvents.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTEvents.class */
public class SOFTEvents {
    public static final int AL_EVENT_CALLBACK_FUNCTION_SOFT = 6562;
    public static final int AL_EVENT_CALLBACK_USER_PARAM_SOFT = 6563;
    public static final int AL_EVENT_TYPE_BUFFER_COMPLETED_SOFT = 6564;
    public static final int AL_EVENT_TYPE_SOURCE_STATE_CHANGED_SOFT = 6565;
    public static final int AL_EVENT_TYPE_DISCONNECTED_SOFT = 6566;

    protected SOFTEvents() {
        throw new UnsupportedOperationException();
    }

    public static void nalEventControlSOFT(int count, long types, boolean enable) {
        long __functionAddress = AL.getICD().alEventControlSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(count, types, enable, __functionAddress);
    }

    public static void alEventControlSOFT(@NativeType("ALenum const *") IntBuffer types, @NativeType("ALboolean") boolean enable) {
        nalEventControlSOFT(types.remaining(), MemoryUtil.memAddress(types), enable);
    }

    public static void nalEventControlDirectSOFT(long context, int count, long types, boolean enable) {
        long __functionAddress = AL.getICD().alEventControlDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, count, types, enable, __functionAddress);
    }

    public static void alEventControlDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALenum const *") IntBuffer types, @NativeType("ALboolean") boolean enable) {
        nalEventControlDirectSOFT(context, types.remaining(), MemoryUtil.memAddress(types), enable);
    }

    public static void nalEventCallbackSOFT(long callback, long userParam) {
        long __functionAddress = AL.getICD().alEventCallbackSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPV(callback, userParam, __functionAddress);
    }

    public static void alEventCallbackSOFT(@NativeType("ALEVENTPROCSOFT") SOFTEventProcI callback, @NativeType("ALvoid *") long userParam) {
        nalEventCallbackSOFT(MemoryUtil.memAddressSafe(callback), userParam);
    }

    public static void nalEventCallbackDirectSOFT(long context, long callback, long userParam) {
        long __functionAddress = AL.getICD().alEventCallbackDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPPV(context, callback, userParam, __functionAddress);
    }

    public static void alEventCallbackDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALEVENTPROCSOFT") SOFTEventProcI callback, @NativeType("ALvoid *") long userParam) {
        nalEventCallbackDirectSOFT(context, MemoryUtil.memAddressSafe(callback), userParam);
    }

    @NativeType("ALvoid *")
    public static long alGetPointerSOFT(@NativeType("ALenum") int pname) {
        long __functionAddress = AL.getICD().alGetPointerSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeP(pname, __functionAddress);
    }

    @NativeType("ALvoid *")
    public static long alGetPointerDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int pname) {
        long __functionAddress = AL.getICD().alGetPointerDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        return JNI.invokePP(context, pname, __functionAddress);
    }

    public static void nalGetPointervSOFT(int pname, long values) {
        long __functionAddress = AL.getICD().alGetPointervSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(pname, values, __functionAddress);
    }

    public static void alGetPointervSOFT(@NativeType("ALenum") int pname, @NativeType("ALvoid **") PointerBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) values, 1);
        }
        nalGetPointervSOFT(pname, MemoryUtil.memAddress(values));
    }

    public static void nalGetPointervDirectSOFT(long context, int pname, long values) {
        long __functionAddress = AL.getICD().alGetPointervDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, pname, values, __functionAddress);
    }

    public static void alGetPointervDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int pname, @NativeType("ALvoid **") PointerBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) values, 1);
        }
        nalGetPointervDirectSOFT(context, pname, MemoryUtil.memAddress(values));
    }

    public static void alEventControlSOFT(@NativeType("ALenum const *") int[] types, @NativeType("ALboolean") boolean enable) {
        long __functionAddress = AL.getICD().alEventControlSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(types.length, types, enable, __functionAddress);
    }

    public static void alEventControlDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALenum const *") int[] types, @NativeType("ALboolean") boolean enable) {
        long __functionAddress = AL.getICD().alEventControlDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, types.length, types, enable, __functionAddress);
    }
}
