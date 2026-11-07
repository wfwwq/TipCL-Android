package org.lwjgl.openal;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTSystemEvents.class */
public class SOFTSystemEvents {
    public static final int ALC_EVENT_TYPE_DEFAULT_DEVICE_CHANGED_SOFT = 6614;
    public static final int ALC_EVENT_TYPE_DEVICE_ADDED_SOFT = 6615;
    public static final int ALC_EVENT_TYPE_DEVICE_REMOVED_SOFT = 6616;
    public static final int ALC_PLAYBACK_DEVICE_SOFT = 6612;
    public static final int ALC_CAPTURE_DEVICE_SOFT = 6613;
    public static final int ALC_EVENT_SUPPORTED_SOFT = 6617;
    public static final int ALC_EVENT_NOT_SUPPORTED_SOFT = 6618;

    protected SOFTSystemEvents() {
        throw new UnsupportedOperationException();
    }

    @NativeType("ALCenum")
    public static int alcEventIsSupportedSOFT(@NativeType("ALCenum") int eventType, @NativeType("ALCenum") int deviceType) {
        long __functionAddress = ALC.getICD().alcEventIsSupportedSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeI(eventType, deviceType, __functionAddress);
    }

    public static boolean nalcEventControlSOFT(int count, long events, boolean enable) {
        long __functionAddress = ALC.getICD().alcEventControlSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokePZ(count, events, enable, __functionAddress);
    }

    @NativeType("ALCboolean")
    public static boolean alcEventControlSOFT(@NativeType("ALCenum const *") IntBuffer events, @NativeType("ALCboolean") boolean enable) {
        return nalcEventControlSOFT(Checks.remainingSafe(events), MemoryUtil.memAddressSafe(events), enable);
    }

    public static void nalcEventCallbackSOFT(long callback, long userParam) {
        long __functionAddress = ALC.getICD().alcEventCallbackSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPV(callback, userParam, __functionAddress);
    }

    @NativeType("ALCvoid")
    public static void alcEventCallbackSOFT(@NativeType("ALCEVENTPROCTYPESOFT") SOFTSystemEventProcI callback, @NativeType("ALCvoid *") long userParam) {
        nalcEventCallbackSOFT(MemoryUtil.memAddressSafe(callback), userParam);
    }

    @NativeType("ALCboolean")
    public static boolean alcEventControlSOFT(@NativeType("ALCenum const *") int[] events, @NativeType("ALCboolean") boolean enable) {
        long __functionAddress = ALC.getICD().alcEventControlSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokePZ(Checks.lengthSafe(events), events, enable, __functionAddress);
    }
}
