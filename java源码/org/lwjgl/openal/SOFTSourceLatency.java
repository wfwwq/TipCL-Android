package org.lwjgl.openal;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/SOFTSourceLatency.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/SOFTSourceLatency.class */
public class SOFTSourceLatency {
    public static final int AL_SAMPLE_OFFSET_LATENCY_SOFT = 4608;
    public static final int AL_SEC_OFFSET_LATENCY_SOFT = 4609;

    protected SOFTSourceLatency() {
        throw new UnsupportedOperationException();
    }

    @NativeType("ALvoid")
    public static void alSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble") double value) {
        long __functionAddress = AL.getICD().alSourcedSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcedDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble") double value) {
        long __functionAddress = AL.getICD().alSourcedDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSource3dSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble") double value1, @NativeType("ALdouble") double value2, @NativeType("ALdouble") double value3) {
        long __functionAddress = AL.getICD().alSource3dSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSource3dDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble") double value1, @NativeType("ALdouble") double value2, @NativeType("ALdouble") double value3) {
        long __functionAddress = AL.getICD().alSource3dDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, source, param, value1, value2, value3, __functionAddress);
    }

    public static void nalSourcedvSOFT(int source, int param, long value) {
        long __functionAddress = AL.getICD().alSourcedvSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble const *") DoubleBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalSourcedvSOFT(source, param, MemoryUtil.memAddress(value));
    }

    public static void nalSourcedvDirectSOFT(long context, int source, int param, long value) {
        long __functionAddress = AL.getICD().alSourcedvDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcedvDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble const *") DoubleBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalSourcedvDirectSOFT(context, source, param, MemoryUtil.memAddress(value));
    }

    public static void nalGetSourcedSOFT(int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcedSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetSourcedSOFT(source, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static double alGetSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            DoubleBuffer value = stack.callocDouble(1);
            nalGetSourcedSOFT(source, param, MemoryUtil.memAddress(value));
            double d = value.get(0);
            stack.setPointer(stackPointer);
            return d;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetSourcedDirectSOFT(long context, int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcedDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcedDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetSourcedDirectSOFT(context, source, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static double alGetSourcedDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            DoubleBuffer value = stack.callocDouble(1);
            nalGetSourcedDirectSOFT(context, source, param, MemoryUtil.memAddress(value));
            double d = value.get(0);
            stack.setPointer(stackPointer);
            return d;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetSource3dSOFT(int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3dSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3dSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer value1, @NativeType("ALdouble *") DoubleBuffer value2, @NativeType("ALdouble *") DoubleBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetSource3dSOFT(source, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetSource3dDirectSOFT(long context, int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3dDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPPPV(context, source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3dDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer value1, @NativeType("ALdouble *") DoubleBuffer value2, @NativeType("ALdouble *") DoubleBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetSource3dDirectSOFT(context, source, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetSourcedvSOFT(int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcedvSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetSourcedvSOFT(source, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetSourcedvDirectSOFT(long context, int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcedvDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcedvDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetSourcedvDirectSOFT(context, source, param, MemoryUtil.memAddress(values));
    }

    @NativeType("ALvoid")
    public static void alSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT") long value) {
        long __functionAddress = AL.getICD().alSourcei64SOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeJV(source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcei64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT") long value) {
        long __functionAddress = AL.getICD().alSourcei64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePJV(context, source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSource3i64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT") long value1, @NativeType("ALint64SOFT") long value2, @NativeType("ALint64SOFT") long value3) {
        long __functionAddress = AL.getICD().alSource3i64SOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeJJJV(source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSource3i64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT") long value1, @NativeType("ALint64SOFT") long value2, @NativeType("ALint64SOFT") long value3) {
        long __functionAddress = AL.getICD().alSource3i64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePJJJV(context, source, param, value1, value2, value3, __functionAddress);
    }

    public static void nalSourcei64vSOFT(int source, int param, long values) {
        long __functionAddress = AL.getICD().alSourcei64vSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT const *") LongBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalSourcei64vSOFT(source, param, MemoryUtil.memAddress(values));
    }

    public static void nalSourcei64vDirectSOFT(long context, int source, int param, long values) {
        long __functionAddress = AL.getICD().alSourcei64vDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcei64vDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT const *") LongBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalSourcei64vDirectSOFT(context, source, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetSourcei64SOFT(int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcei64SOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetSourcei64SOFT(source, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static long alGetSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            LongBuffer value = stack.callocLong(1);
            nalGetSourcei64SOFT(source, param, MemoryUtil.memAddress(value));
            long j = value.get(0);
            stack.setPointer(stackPointer);
            return j;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetSourcei64DirectSOFT(long context, int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcei64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcei64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetSourcei64DirectSOFT(context, source, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static long alGetSourcei64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            LongBuffer value = stack.callocLong(1);
            nalGetSourcei64DirectSOFT(context, source, param, MemoryUtil.memAddress(value));
            long j = value.get(0);
            stack.setPointer(stackPointer);
            return j;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetSource3i64SOFT(int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3i64SOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3i64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer value1, @NativeType("ALint64SOFT *") LongBuffer value2, @NativeType("ALint64SOFT *") LongBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetSource3i64SOFT(source, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetSource3i64DirectSOFT(long context, int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3i64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPPPV(context, source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3i64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer value1, @NativeType("ALint64SOFT *") LongBuffer value2, @NativeType("ALint64SOFT *") LongBuffer value3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value1, 1);
            Checks.check((Buffer) value2, 1);
            Checks.check((Buffer) value3, 1);
        }
        nalGetSource3i64DirectSOFT(context, source, param, MemoryUtil.memAddress(value1), MemoryUtil.memAddress(value2), MemoryUtil.memAddress(value3));
    }

    public static void nalGetSourcei64vSOFT(int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcei64vSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetSourcei64vSOFT(source, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetSourcei64vDirectSOFT(long context, int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcei64vDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcei64vDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetSourcei64vDirectSOFT(context, source, param, MemoryUtil.memAddress(values));
    }

    @NativeType("ALvoid")
    public static void alSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble const *") double[] value) {
        long __functionAddress = AL.getICD().alSourcedvSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcedvDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble const *") double[] value) {
        long __functionAddress = AL.getICD().alSourcedvDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] value) {
        long __functionAddress = AL.getICD().alGetSourcedSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcedDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] value) {
        long __functionAddress = AL.getICD().alGetSourcedDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3dSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] value1, @NativeType("ALdouble *") double[] value2, @NativeType("ALdouble *") double[] value3) {
        long __functionAddress = AL.getICD().alGetSource3dSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value1, 1);
            Checks.check(value2, 1);
            Checks.check(value3, 1);
        }
        JNI.invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3dDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] value1, @NativeType("ALdouble *") double[] value2, @NativeType("ALdouble *") double[] value3) {
        long __functionAddress = AL.getICD().alGetSource3dDirectSOFT;
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
    public static void alGetSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] values) {
        long __functionAddress = AL.getICD().alGetSourcedvSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcedvDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] values) {
        long __functionAddress = AL.getICD().alGetSourcedvDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT const *") long[] values) {
        long __functionAddress = AL.getICD().alSourcei64vSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcei64vDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT const *") long[] values) {
        long __functionAddress = AL.getICD().alSourcei64vDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] value) {
        long __functionAddress = AL.getICD().alGetSourcei64SOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcei64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] value) {
        long __functionAddress = AL.getICD().alGetSourcei64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, source, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3i64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] value1, @NativeType("ALint64SOFT *") long[] value2, @NativeType("ALint64SOFT *") long[] value3) {
        long __functionAddress = AL.getICD().alGetSource3i64SOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value1, 1);
            Checks.check(value2, 1);
            Checks.check(value3, 1);
        }
        JNI.invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3i64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] value1, @NativeType("ALint64SOFT *") long[] value2, @NativeType("ALint64SOFT *") long[] value3) {
        long __functionAddress = AL.getICD().alGetSource3i64DirectSOFT;
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
    public static void alGetSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] values) {
        long __functionAddress = AL.getICD().alGetSourcei64vSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(source, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSourcei64vDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] values) {
        long __functionAddress = AL.getICD().alGetSourcei64vDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, source, param, values, __functionAddress);
    }
}
