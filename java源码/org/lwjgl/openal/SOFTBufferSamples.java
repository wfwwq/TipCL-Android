package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTBufferSamples.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTBufferSamples.class */
public class SOFTBufferSamples {
    public static final int AL_MONO8_SOFT = 4352;
    public static final int AL_MONO16_SOFT = 4353;
    public static final int AL_MONO32F_SOFT = 65552;
    public static final int AL_STEREO8_SOFT = 4354;
    public static final int AL_STEREO16_SOFT = 4355;
    public static final int AL_STEREO32F_SOFT = 65553;
    public static final int AL_QUAD8_SOFT = 4612;
    public static final int AL_QUAD16_SOFT = 4613;
    public static final int AL_QUAD32F_SOFT = 4614;
    public static final int AL_REAR8_SOFT = 4615;
    public static final int AL_REAR16_SOFT = 4616;
    public static final int AL_REAR32F_SOFT = 4617;
    public static final int AL_5POINT1_8_SOFT = 4618;
    public static final int AL_5POINT1_16_SOFT = 4619;
    public static final int AL_5POINT1_32F_SOFT = 4620;
    public static final int AL_6POINT1_8_SOFT = 4621;
    public static final int AL_6POINT1_16_SOFT = 4622;
    public static final int AL_6POINT1_32F_SOFT = 4623;
    public static final int AL_7POINT1_8_SOFT = 4624;
    public static final int AL_7POINT1_16_SOFT = 4625;
    public static final int AL_7POINT1_32F_SOFT = 4626;
    public static final int AL_MONO_SOFT = 5376;
    public static final int AL_STEREO_SOFT = 5377;
    public static final int AL_QUAD_SOFT = 5378;
    public static final int AL_REAR_SOFT = 5379;
    public static final int AL_5POINT1_SOFT = 5380;
    public static final int AL_6POINT1_SOFT = 5381;
    public static final int AL_7POINT1_SOFT = 5382;
    public static final int AL_BYTE_SOFT = 5120;
    public static final int AL_UNSIGNED_BYTE_SOFT = 5121;
    public static final int AL_SHORT_SOFT = 5122;
    public static final int AL_UNSIGNED_SHORT_SOFT = 5123;
    public static final int AL_INT_SOFT = 5124;
    public static final int AL_UNSIGNED_INT_SOFT = 5125;
    public static final int AL_FLOAT_SOFT = 5126;
    public static final int AL_DOUBLE_SOFT = 5127;
    public static final int AL_BYTE3_SOFT = 5128;
    public static final int AL_UNSIGNED_BYTE3_SOFT = 5129;
    public static final int AL_INTERNAL_FORMAT_SOFT = 8200;
    public static final int AL_BYTE_LENGTH_SOFT = 8201;
    public static final int AL_SAMPLE_LENGTH_SOFT = 8202;
    public static final int AL_SEC_LENGTH_SOFT = 8203;
    public static final int AL_BYTE_RW_OFFSETS_SOFT = 4145;
    public static final int AL_SAMPLE_RW_OFFSETS_SOFT = 4146;

    protected SOFTBufferSamples() {
        throw new UnsupportedOperationException();
    }

    public static void nalBufferSamplesSOFT(int buffer, int samplerate, int internalformat, int samples, int channels, int type, long data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ByteBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ShortBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") IntBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") FloatBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") DoubleBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void nalBufferSubSamplesSOFT(int buffer, int offset, int samples, int channels, int type, long data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ByteBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ShortBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") IntBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") FloatBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") DoubleBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void nalGetBufferSamplesSOFT(int buffer, int offset, int samples, int channels, int type, long data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") ByteBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") ShortBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") IntBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") FloatBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, MemoryUtil.memAddress(data));
    }

    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") DoubleBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, MemoryUtil.memAddress(data));
    }

    @NativeType("ALboolean")
    public static boolean alIsBufferFormatSupportedSOFT(@NativeType("ALenum") int format) {
        long __functionAddress = AL.getICD().alIsBufferFormatSupportedSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeZ(format, __functionAddress);
    }

    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") short[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") int[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") float[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") double[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") short[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") int[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") float[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") double[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") short[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") int[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") float[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") double[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }
}
