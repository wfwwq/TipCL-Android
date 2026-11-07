package org.lwjgl.openal;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTSourceStartDelay.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTSourceStartDelay.class */
public class SOFTSourceStartDelay {
    protected SOFTSourceStartDelay() {
        throw new UnsupportedOperationException();
    }

    @NativeType("ALvoid")
    public static void alSourcePlayAtTimeSOFT(@NativeType("ALuint") int source, @NativeType("ALint64SOFT") long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimeSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeJV(source, start_time, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcePlayAtTimeDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALint64SOFT") long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimeDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePJV(context, source, start_time, __functionAddress);
    }

    public static void nalSourcePlayAtTimevSOFT(int n, long sources, long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimevSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePJV(n, sources, start_time, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcePlayAtTimevSOFT(@NativeType("ALuint const *") IntBuffer sources, @NativeType("ALint64SOFT") long start_time) {
        nalSourcePlayAtTimevSOFT(sources.remaining(), MemoryUtil.memAddress(sources), start_time);
    }

    public static void nalSourcePlayAtTimevDirectSOFT(long context, int n, long sources, long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimevDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPJV(context, n, sources, start_time, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcePlayAtTimevDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") IntBuffer sources, @NativeType("ALint64SOFT") long start_time) {
        nalSourcePlayAtTimevDirectSOFT(context, sources.remaining(), MemoryUtil.memAddress(sources), start_time);
    }

    @NativeType("ALvoid")
    public static void alSourcePlayAtTimevSOFT(@NativeType("ALuint const *") int[] sources, @NativeType("ALint64SOFT") long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimevSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePJV(sources.length, sources, start_time, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcePlayAtTimevDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") int[] sources, @NativeType("ALint64SOFT") long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimevDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPJV(context, sources.length, sources, start_time, __functionAddress);
    }
}
