package org.lwjgl.openal;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTDeferredUpdates.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTDeferredUpdates.class */
public class SOFTDeferredUpdates {
    public static final int AL_DEFERRED_UPDATES_SOFT = 49154;

    protected SOFTDeferredUpdates() {
        throw new UnsupportedOperationException();
    }

    @NativeType("ALvoid")
    public static void alDeferUpdatesSOFT() {
        long __functionAddress = AL.getICD().alDeferUpdatesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(__functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeferUpdatesDirectSOFT(@NativeType("ALCcontext *") long context) {
        long __functionAddress = AL.getICD().alDeferUpdatesDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alProcessUpdatesSOFT() {
        long __functionAddress = AL.getICD().alProcessUpdatesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(__functionAddress);
    }

    @NativeType("ALvoid")
    public static void alProcessUpdatesDirectSOFT(@NativeType("ALCcontext *") long context) {
        long __functionAddress = AL.getICD().alProcessUpdatesDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, __functionAddress);
    }
}
