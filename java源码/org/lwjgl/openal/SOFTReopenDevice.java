package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTReopenDevice.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTReopenDevice.class */
public class SOFTReopenDevice {
    protected SOFTReopenDevice() {
        throw new UnsupportedOperationException();
    }

    public static boolean nalcReopenDeviceSOFT(long device, long deviceName, long attribs) {
        long __functionAddress = ALC.getICD().alcReopenDeviceSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(device);
        }
        return JNI.invokePPPZ(device, deviceName, attribs, __functionAddress);
    }

    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCchar const *") ByteBuffer deviceName, @NativeType("ALCint const *") IntBuffer attribs) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(deviceName);
            Checks.checkNTSafe(attribs);
        }
        return nalcReopenDeviceSOFT(device, MemoryUtil.memAddressSafe(deviceName), MemoryUtil.memAddressSafe(attribs));
    }

    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCchar const *") CharSequence deviceName, @NativeType("ALCint const *") IntBuffer attribs) {
        if (Checks.CHECKS) {
            Checks.checkNTSafe(attribs);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(deviceName, true);
            long deviceNameEncoded = deviceName == null ? 0L : stack.getPointerAddress();
            boolean zNalcReopenDeviceSOFT = nalcReopenDeviceSOFT(device, deviceNameEncoded, MemoryUtil.memAddressSafe(attribs));
            stack.setPointer(stackPointer);
            return zNalcReopenDeviceSOFT;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCchar const *") ByteBuffer deviceName, @NativeType("ALCint const *") int[] attribs) {
        long __functionAddress = ALC.getICD().alcReopenDeviceSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(device);
            Checks.checkNT1Safe(deviceName);
            Checks.checkNTSafe(attribs);
        }
        return JNI.invokePPPZ(device, MemoryUtil.memAddressSafe(deviceName), attribs, __functionAddress);
    }

    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCchar const *") CharSequence deviceName, @NativeType("ALCint const *") int[] attribs) {
        long __functionAddress = ALC.getICD().alcReopenDeviceSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(device);
            Checks.checkNTSafe(attribs);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(deviceName, true);
            long deviceNameEncoded = deviceName == null ? 0L : stack.getPointerAddress();
            boolean zInvokePPPZ = JNI.invokePPPZ(device, deviceNameEncoded, attribs, __functionAddress);
            stack.setPointer(stackPointer);
            return zInvokePPPZ;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
