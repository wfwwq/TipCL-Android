package org.lwjgl.openal;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTHRTF.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTHRTF.class */
public class SOFTHRTF {
    public static final int ALC_HRTF_SOFT = 6546;
    public static final int ALC_HRTF_ID_SOFT = 6550;
    public static final int ALC_DONT_CARE_SOFT = 2;
    public static final int ALC_HRTF_STATUS_SOFT = 6547;
    public static final int ALC_NUM_HRTF_SPECIFIERS_SOFT = 6548;
    public static final int ALC_HRTF_SPECIFIER_SOFT = 6549;
    public static final int ALC_HRTF_DISABLED_SOFT = 0;
    public static final int ALC_HRTF_ENABLED_SOFT = 1;
    public static final int ALC_HRTF_DENIED_SOFT = 2;
    public static final int ALC_HRTF_REQUIRED_SOFT = 3;
    public static final int ALC_HRTF_HEADPHONES_DETECTED_SOFT = 4;
    public static final int ALC_HRTF_UNSUPPORTED_FORMAT_SOFT = 5;

    protected SOFTHRTF() {
        throw new UnsupportedOperationException();
    }

    public static long nalcGetStringiSOFT(long device, int paramName, int index) {
        long __functionAddress = ALC.getICD().alcGetStringiSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(device);
        }
        return JNI.invokePP(device, paramName, index, __functionAddress);
    }

    @NativeType("ALCchar const *")
    public static String alcGetStringiSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCenum") int paramName, @NativeType("ALCsizei") int index) {
        long __result = nalcGetStringiSOFT(device, paramName, index);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static boolean nalcResetDeviceSOFT(long device, long attrList) {
        long __functionAddress = ALC.getICD().alcResetDeviceSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(device);
        }
        return JNI.invokePPZ(device, attrList, __functionAddress);
    }

    @NativeType("ALCboolean")
    public static boolean alcResetDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCint const *") IntBuffer attrList) {
        if (Checks.CHECKS) {
            Checks.checkNTSafe(attrList);
        }
        return nalcResetDeviceSOFT(device, MemoryUtil.memAddressSafe(attrList));
    }

    @NativeType("ALCboolean")
    public static boolean alcResetDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCint const *") int[] attrList) {
        long __functionAddress = ALC.getICD().alcResetDeviceSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(device);
            Checks.checkNTSafe(attrList);
        }
        return JNI.invokePPZ(device, attrList, __functionAddress);
    }
}
