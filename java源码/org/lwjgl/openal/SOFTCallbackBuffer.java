package org.lwjgl.openal;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTCallbackBuffer.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTCallbackBuffer.class */
public class SOFTCallbackBuffer {
    public static final int AL_BUFFER_CALLBACK_FUNCTION_SOFT = 6560;
    public static final int AL_BUFFER_CALLBACK_USER_PARAM_SOFT = 6561;

    protected SOFTCallbackBuffer() {
        throw new UnsupportedOperationException();
    }

    public static void nalBufferCallbackSOFT(int buffer, int format, int freq, long callback, long userptr) {
        long __functionAddress = AL.getICD().alBufferCallbackSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(userptr);
        }
        JNI.invokePPV(buffer, format, freq, callback, userptr, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferCallbackSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALsizei") int freq, @NativeType("ALBUFFERCALLBACKTYPESOFT") SOFTCallbackBufferTypeI callback, @NativeType("ALvoid *") long userptr) {
        nalBufferCallbackSOFT(buffer, format, freq, callback.address(), userptr);
    }

    public static void nalBufferCallbackDirectSOFT(long context, int buffer, int format, int freq, long callback, long userptr) {
        long __functionAddress = AL.getICD().alBufferCallbackDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(userptr);
        }
        JNI.invokePPPV(context, buffer, format, freq, callback, userptr, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferCallbackDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALsizei") int freq, @NativeType("ALBUFFERCALLBACKTYPESOFT") SOFTCallbackBufferTypeI callback, @NativeType("ALvoid *") long userptr) {
        nalBufferCallbackDirectSOFT(context, buffer, format, freq, callback.address(), userptr);
    }

    public static void nalGetBufferPtrSOFT(int buffer, int param, long ptr) {
        long __functionAddress = AL.getICD().alGetBufferPtrSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, param, ptr, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferPtrSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ptr, 1);
        }
        nalGetBufferPtrSOFT(buffer, param, MemoryUtil.memAddress(ptr));
    }

    @NativeType("ALvoid")
    public static long alGetBufferPtrSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            PointerBuffer ptr = stack.callocPointer(1);
            nalGetBufferPtrSOFT(buffer, param, MemoryUtil.memAddress(ptr));
            long j = ptr.get(0);
            stack.setPointer(stackPointer);
            return j;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetBufferPtrDirectSOFT(long context, int buffer, int param, long ptr) {
        long __functionAddress = AL.getICD().alGetBufferPtrDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, buffer, param, ptr, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferPtrDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ptr, 1);
        }
        nalGetBufferPtrDirectSOFT(context, buffer, param, MemoryUtil.memAddress(ptr));
    }

    @NativeType("ALvoid")
    public static long alGetBufferPtrDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            PointerBuffer ptr = stack.callocPointer(1);
            nalGetBufferPtrDirectSOFT(context, buffer, param, MemoryUtil.memAddress(ptr));
            long j = ptr.get(0);
            stack.setPointer(stackPointer);
            return j;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetBuffer3PtrSOFT(int buffer, int param, long ptr0, long ptr1, long ptr2) {
        long __functionAddress = AL.getICD().alGetBuffer3PtrSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPPV(buffer, param, ptr0, ptr1, ptr2, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3PtrSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr0, @NativeType("ALvoid **") PointerBuffer ptr1, @NativeType("ALvoid **") PointerBuffer ptr2) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ptr0, 1);
            Checks.check((CustomBuffer<?>) ptr1, 1);
            Checks.check((CustomBuffer<?>) ptr2, 1);
        }
        nalGetBuffer3PtrSOFT(buffer, param, MemoryUtil.memAddress(ptr0), MemoryUtil.memAddress(ptr1), MemoryUtil.memAddress(ptr2));
    }

    public static void nalGetBuffer3PtrDirectSOFT(long context, int buffer, int param, long ptr0, long ptr1, long ptr2) {
        long __functionAddress = AL.getICD().alGetBuffer3PtrDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPPPV(context, buffer, param, ptr0, ptr1, ptr2, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3PtrDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr0, @NativeType("ALvoid **") PointerBuffer ptr1, @NativeType("ALvoid **") PointerBuffer ptr2) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ptr0, 1);
            Checks.check((CustomBuffer<?>) ptr1, 1);
            Checks.check((CustomBuffer<?>) ptr2, 1);
        }
        nalGetBuffer3PtrDirectSOFT(context, buffer, param, MemoryUtil.memAddress(ptr0), MemoryUtil.memAddress(ptr1), MemoryUtil.memAddress(ptr2));
    }

    public static void nalGetBufferPtrvSOFT(int buffer, int param, long ptr) {
        long __functionAddress = AL.getICD().alGetBufferPtrvSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, param, ptr, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferPtrvSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ptr, 1);
        }
        nalGetBufferPtrvSOFT(buffer, param, MemoryUtil.memAddress(ptr));
    }

    public static void nalGetBufferPtrvDirectSOFT(long context, int buffer, int param, long ptr) {
        long __functionAddress = AL.getICD().alGetBufferPtrvDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, buffer, param, ptr, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferPtrvDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ptr, 1);
        }
        nalGetBufferPtrvDirectSOFT(context, buffer, param, MemoryUtil.memAddress(ptr));
    }
}
