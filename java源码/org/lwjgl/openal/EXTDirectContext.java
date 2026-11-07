package org.lwjgl.openal;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/EXTDirectContext.class */
public class EXTDirectContext {
    protected EXTDirectContext() {
        throw new UnsupportedOperationException();
    }

    public static long nalcGetProcAddress2(long device, long funcName) {
        long __functionAddress = ALC.getICD().alcGetProcAddress2;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokePPP(device, funcName, __functionAddress);
    }

    @NativeType("ALCvoid *")
    public static long alcGetProcAddress2(@NativeType("ALCdevice *") long device, @NativeType("ALchar const *") ByteBuffer funcName) {
        if (Checks.CHECKS) {
            Checks.checkNT1(funcName);
        }
        return nalcGetProcAddress2(device, MemoryUtil.memAddress(funcName));
    }

    @NativeType("ALCvoid *")
    public static long alcGetProcAddress2(@NativeType("ALCdevice *") long device, @NativeType("ALchar const *") CharSequence funcName) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(funcName, true);
            long funcNameEncoded = stack.getPointerAddress();
            long jNalcGetProcAddress2 = nalcGetProcAddress2(device, funcNameEncoded);
            stack.setPointer(stackPointer);
            return jNalcGetProcAddress2;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
