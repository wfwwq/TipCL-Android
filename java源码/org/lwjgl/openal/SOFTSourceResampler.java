package org.lwjgl.openal;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTSourceResampler.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTSourceResampler.class */
public class SOFTSourceResampler {
    public static final int AL_NUM_RESAMPLERS_SOFT = 4624;
    public static final int AL_DEFAULT_RESAMPLER_SOFT = 4625;
    public static final int AL_SOURCE_RESAMPLER_SOFT = 4626;
    public static final int AL_RESAMPLER_NAME_SOFT = 4627;

    protected SOFTSourceResampler() {
        throw new UnsupportedOperationException();
    }

    public static long nalGetStringiSOFT(int pname, int index) {
        long __functionAddress = AL.getICD().alGetStringiSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeP(pname, index, __functionAddress);
    }

    @NativeType("ALchar const *")
    public static String alGetStringiSOFT(@NativeType("ALenum") int pname, @NativeType("ALsizei") int index) {
        long __result = nalGetStringiSOFT(pname, index);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nalGetStringiDirectSOFT(long context, int pname, int index) {
        long __functionAddress = AL.getICD().alGetStringiDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        return JNI.invokePP(context, pname, index, __functionAddress);
    }

    @NativeType("ALchar const *")
    public static String alGetStringiDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int pname, @NativeType("ALsizei") int index) {
        long __result = nalGetStringiDirectSOFT(context, pname, index);
        return MemoryUtil.memUTF8Safe(__result);
    }
}
