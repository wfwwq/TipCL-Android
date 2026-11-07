package org.lwjgl.openal;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/AL11.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/AL11.class */
public class AL11 extends AL10 {
    public static final int AL_SEC_OFFSET = 4132;
    public static final int AL_SAMPLE_OFFSET = 4133;
    public static final int AL_BYTE_OFFSET = 4134;
    public static final int AL_STATIC = 4136;
    public static final int AL_STREAMING = 4137;
    public static final int AL_UNDETERMINED = 4144;
    public static final int AL_ILLEGAL_COMMAND = 40964;
    public static final int AL_SPEED_OF_SOUND = 49155;
    public static final int AL_LINEAR_DISTANCE = 53251;
    public static final int AL_LINEAR_DISTANCE_CLAMPED = 53252;
    public static final int AL_EXPONENT_DISTANCE = 53253;
    public static final int AL_EXPONENT_DISTANCE_CLAMPED = 53254;

    protected AL11() {
        throw new UnsupportedOperationException();
    }

    @NativeType("ALvoid")
    public static void alListener3i(@NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alListener3i;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(paramName, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alListener3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alListener3iDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, paramName, value1, value2, value3, __functionAddress);
    }

    public static void nalGetListener3i(int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetListener3i;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPPV(param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetListener3i(@NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetListener3i(param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetListener3iDirect(long context, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetListener3iDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPPPV(context, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetListener3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetListener3iDirect(context, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetListeneriv(int param, long values) {
        long __functionAddress = AL.getICD().alGetListeneriv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetListeneriv(@NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetListeneriv(param, MemoryUtil.memAddress(values));
    }

    public static void nalGetListenerivDirect(long context, int param, long values) {
        long __functionAddress = AL.getICD().alGetListenerivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetListenerivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetListenerivDirect(context, param, MemoryUtil.memAddress(values));
    }

    @NativeType("ALvoid")
    public static void alSource3i(@NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alSource3i;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(source, paramName, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSource3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alSource3iDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, source, paramName, value1, value2, value3, __functionAddress);
    }

    public static void nalGetSource3i(int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3i;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3i(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetSource3i(source, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetSource3iDirect(long context, int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3iDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPPPV(context, source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetSource3iDirect(context, source, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalListeneriv(int listener, long value) {
        long __functionAddress = AL.getICD().alListeneriv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(listener, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alListeneriv(@NativeType("ALenum") int listener, @NativeType("ALint const *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalListeneriv(listener, MemoryUtil.memAddress(value));
    }

    public static void nalListenerivDirect(long context, int listener, long value) {
        long __functionAddress = AL.getICD().alListenerivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, listener, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alListenerivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int listener, @NativeType("ALint const *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalListenerivDirect(context, listener, MemoryUtil.memAddress(value));
    }

    public static void nalSourceiv(int source, int paramName, long value) {
        long __functionAddress = AL.getICD().alSourceiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(source, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourceiv(@NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint const *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalSourceiv(source, paramName, MemoryUtil.memAddress(value));
    }

    public static void nalSourceivDirect(long context, int source, int paramName, long value) {
        long __functionAddress = AL.getICD().alSourceivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, source, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourceivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint const *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalSourceivDirect(context, source, paramName, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static void alBufferf(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alBufferf;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alBufferfDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBuffer3f(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat") float value1, @NativeType("ALfloat") float value2, @NativeType("ALfloat") float value3) {
        long __functionAddress = AL.getICD().alBuffer3f;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(buffer, paramName, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBuffer3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat") float value1, @NativeType("ALfloat") float value2, @NativeType("ALfloat") float value3) {
        long __functionAddress = AL.getICD().alBuffer3fDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, buffer, paramName, value1, value2, value3, __functionAddress);
    }

    public static void nalBufferfv(int buffer, int paramName, long value) {
        long __functionAddress = AL.getICD().alBufferfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferfv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat const *") FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalBufferfv(buffer, paramName, MemoryUtil.memAddress(value));
    }

    public static void nalBufferfvDirect(long context, int buffer, int paramName, long value) {
        long __functionAddress = AL.getICD().alBufferfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat const *") FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalBufferfvDirect(context, buffer, paramName, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static void alBufferi(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alBufferi;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alBufferiDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBuffer3i(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alBuffer3i;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(buffer, paramName, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBuffer3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alBuffer3iDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, buffer, paramName, value1, value2, value3, __functionAddress);
    }

    public static void nalBufferiv(int buffer, int paramName, long value) {
        long __functionAddress = AL.getICD().alBufferiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferiv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint const *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalBufferiv(buffer, paramName, MemoryUtil.memAddress(value));
    }

    public static void nalBufferivDirect(long context, int buffer, int paramName, long value) {
        long __functionAddress = AL.getICD().alBufferivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint const *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalBufferivDirect(context, buffer, paramName, MemoryUtil.memAddress(value));
    }

    public static void nalGetBuffer3i(int buffer, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetBuffer3i;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPPV(buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3i(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetBuffer3i(buffer, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetBuffer3iDirect(long context, int buffer, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetBuffer3iDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPPPV(context, buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetBuffer3iDirect(context, buffer, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetBufferiv(int buffer, int param, long values) {
        long __functionAddress = AL.getICD().alGetBufferiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferiv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetBufferiv(buffer, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetBufferivDirect(long context, int buffer, int param, long values) {
        long __functionAddress = AL.getICD().alGetBufferivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, buffer, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetBufferivDirect(context, buffer, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetBuffer3f(int buffer, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetBuffer3f;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPPV(buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3f(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value1, @NativeType("ALfloat *") FloatBuffer value2, @NativeType("ALfloat *") FloatBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetBuffer3f(buffer, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetBuffer3fDirect(long context, int buffer, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetBuffer3fDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPPPV(context, buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value1, @NativeType("ALfloat *") FloatBuffer value2, @NativeType("ALfloat *") FloatBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetBuffer3fDirect(context, buffer, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetBufferfv(int buffer, int param, long values) {
        long __functionAddress = AL.getICD().alGetBufferfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(buffer, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferfv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetBufferfv(buffer, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetBufferfvDirect(long context, int buffer, int param, long values) {
        long __functionAddress = AL.getICD().alGetBufferfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, buffer, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetBufferfvDirect(context, buffer, param, MemoryUtil.memAddress(values));
    }

    @NativeType("ALvoid")
    public static void alSpeedOfSound(@NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alSpeedOfSound;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSpeedOfSoundDirect(@NativeType("ALCcontext *") long context, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alSpeedOfSoundDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetListener3i(@NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetListener3i;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value1, 1);
            Checks.check(value2, 1);
            Checks.check(value3, 1);
        }
        JNI.invokePPPV(param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetListener3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetListener3iDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value1, 1);
            Checks.check(value2, 1);
            Checks.check(value3, 1);
        }
        JNI.invokePPPPV(context, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetListeneriv(@NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetListeneriv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetListenerivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetListenerivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3i(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetSource3i;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value1, 1);
            Checks.check(value2, 1);
            Checks.check(value3, 1);
        }
        JNI.invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetSource3iDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value1, 1);
            Checks.check(value2, 1);
            Checks.check(value3, 1);
        }
        JNI.invokePPPPV(context, source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alListeneriv(@NativeType("ALenum") int listener, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alListeneriv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(listener, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alListenerivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int listener, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alListenerivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, listener, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourceiv(@NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alSourceiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(source, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourceivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alSourceivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, source, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferfv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat const *") float[] value) {
        long __functionAddress = AL.getICD().alBufferfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat const *") float[] value) {
        long __functionAddress = AL.getICD().alBufferfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferiv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alBufferiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alBufferivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alBufferivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, buffer, paramName, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3i(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetBuffer3i;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value1, 1);
            Checks.check(value2, 1);
            Checks.check(value3, 1);
        }
        JNI.invokePPPV(buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetBuffer3iDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value1, 1);
            Checks.check(value2, 1);
            Checks.check(value3, 1);
        }
        JNI.invokePPPPV(context, buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferiv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetBufferiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(buffer, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetBufferivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, buffer, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3f(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value1, @NativeType("ALfloat *") float[] value2, @NativeType("ALfloat *") float[] value3) {
        long __functionAddress = AL.getICD().alGetBuffer3f;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value1, 1);
            Checks.check(value2, 1);
            Checks.check(value3, 1);
        }
        JNI.invokePPPV(buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value1, @NativeType("ALfloat *") float[] value2, @NativeType("ALfloat *") float[] value3) {
        long __functionAddress = AL.getICD().alGetBuffer3fDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value1, 1);
            Checks.check(value2, 1);
            Checks.check(value3, 1);
        }
        JNI.invokePPPPV(context, buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferfv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetBufferfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(buffer, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBufferfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetBufferfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, buffer, param, values, __functionAddress);
    }
}
