package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTBufferSubData.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTBufferSubData.class */
public class SOFTBufferSubData {
    public static final int AL_BYTE_RW_OFFSETS_SOFT = 4145;
    public static final int AL_SAMPLE_RW_OFFSETS_SOFT = 4146;

    protected SOFTBufferSubData() {
        throw new UnsupportedOperationException();
    }

    public static void nalBufferSubDataSOFT(int buffer, int format, long data, int offset, int length) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, format, data, offset, length, __functionAddress);
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ByteBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, MemoryUtil.memAddress(data), offset, data.remaining());
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ShortBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, MemoryUtil.memAddress(data), offset, data.remaining() << 1);
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") IntBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, MemoryUtil.memAddress(data), offset, data.remaining() << 2);
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") FloatBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, MemoryUtil.memAddress(data), offset, data.remaining() << 2);
    }

    public static void nalBufferSubDataDirectSOFT(long context, int buffer, int format, long data, int offset, int length) {
        long __functionAddress = AL.getICD().alBufferSubDataDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, buffer, format, data, offset, length, __functionAddress);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ByteBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataDirectSOFT(context, buffer, format, MemoryUtil.memAddress(data), offset, data.remaining());
    }

    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ShortBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataDirectSOFT(context, buffer, format, MemoryUtil.memAddress(data), offset, data.remaining() << 1);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") IntBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataDirectSOFT(context, buffer, format, MemoryUtil.memAddress(data), offset, data.remaining() << 2);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") FloatBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataDirectSOFT(context, buffer, format, MemoryUtil.memAddress(data), offset, data.remaining() << 2);
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") short[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, format, data, offset, data.length << 1, __functionAddress);
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") int[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, format, data, offset, data.length << 2, __functionAddress);
    }

    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") float[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, format, data, offset, data.length << 2, __functionAddress);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") short[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, buffer, format, data, offset, data.length << 1, __functionAddress);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") int[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, buffer, format, data, offset, data.length << 2, __functionAddress);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") float[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, buffer, format, data, offset, data.length << 2, __functionAddress);
    }
}
