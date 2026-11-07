package org.lwjgl.system.jni;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.jni.JNINativeMethod;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/jni/JNINativeInterface.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/jni/JNINativeInterface.class */
public class JNINativeInterface {
    public static final int JNI_VERSION_1_1 = 65537;
    public static final int JNI_VERSION_1_2 = 65538;
    public static final int JNI_VERSION_1_4 = 65540;
    public static final int JNI_VERSION_1_6 = 65542;
    public static final int JNI_VERSION_1_8 = 65544;
    public static final int JNI_VERSION_9 = 589824;
    public static final int JNI_VERSION_10 = 655360;
    public static final int JNI_VERSION_19 = 1245184;
    public static final int JNI_VERSION_20 = 1310720;
    public static final int JNI_VERSION_21 = 1376256;
    public static final int JNI_VERSION_24 = 1572864;
    public static final int JNIInvalidRefType = 0;
    public static final int JNILocalRefType = 1;
    public static final int JNIGlobalRefType = 2;
    public static final int JNIWeakGlobalRefType = 3;
    public static final int JNI_FALSE = 0;
    public static final int JNI_TRUE = 1;
    public static final int JNI_OK = 0;
    public static final int JNI_ERR = -1;
    public static final int JNI_EDETACHED = -2;
    public static final int JNI_EVERSION = -3;
    public static final int JNI_ENOMEM = -4;
    public static final int JNI_EEXIST = -5;
    public static final int JNI_EINVAL = -6;
    public static final int JNI_COMMIT = 1;
    public static final int JNI_ABORT = 2;

    @NativeType("jint")
    public static native int GetVersion();

    @NativeType("jmethodID")
    public static native long FromReflectedMethod(@NativeType("jobject") Method method);

    @NativeType("jfieldID")
    public static native long FromReflectedField(@NativeType("jobject") Field field);

    public static native Method nToReflectedMethod(Class<?> cls, long j, boolean z);

    public static native Field nToReflectedField(Class<?> cls, long j, boolean z);

    @NativeType("void *")
    public static native long NewGlobalRef(@NativeType("jobject") Object obj);

    public static native void nDeleteGlobalRef(long j);

    public static native long nGetBooleanArrayElements(byte[] bArr, long j);

    public static native void nReleaseBooleanArrayElements(byte[] bArr, long j, int i);

    public static native long nGetByteArrayElements(byte[] bArr, long j);

    public static native void nReleaseByteArrayElements(byte[] bArr, long j, int i);

    public static native long nGetCharArrayElements(char[] cArr, long j);

    public static native void nReleaseCharArrayElements(char[] cArr, long j, int i);

    public static native long nGetShortArrayElements(short[] sArr, long j);

    public static native void nReleaseShortArrayElements(short[] sArr, long j, int i);

    public static native long nGetIntArrayElements(int[] iArr, long j);

    public static native void nReleaseIntArrayElements(int[] iArr, long j, int i);

    public static native long nGetLongArrayElements(long[] jArr, long j);

    public static native void nReleaseLongArrayElements(long[] jArr, long j, int i);

    public static native long nGetFloatArrayElements(float[] fArr, long j);

    public static native void nReleaseFloatArrayElements(float[] fArr, long j, int i);

    public static native long nGetDoubleArrayElements(double[] dArr, long j);

    public static native void nReleaseDoubleArrayElements(double[] dArr, long j, int i);

    public static native void nGetBooleanArrayRegion(byte[] bArr, int i, int i2, long j);

    public static native void nSetBooleanArrayRegion(byte[] bArr, int i, int i2, long j);

    public static native void nGetByteArrayRegion(byte[] bArr, int i, int i2, long j);

    public static native void nSetByteArrayRegion(byte[] bArr, int i, int i2, long j);

    public static native void nGetCharArrayRegion(char[] cArr, int i, int i2, long j);

    public static native void nSetCharArrayRegion(char[] cArr, int i, int i2, long j);

    public static native void nGetShortArrayRegion(short[] sArr, int i, int i2, long j);

    public static native void nSetShortArrayRegion(short[] sArr, int i, int i2, long j);

    public static native void nGetIntArrayRegion(int[] iArr, int i, int i2, long j);

    public static native void nSetIntArrayRegion(int[] iArr, int i, int i2, long j);

    public static native void nGetLongArrayRegion(long[] jArr, int i, int i2, long j);

    public static native void nSetLongArrayRegion(long[] jArr, int i, int i2, long j);

    public static native void nGetFloatArrayRegion(float[] fArr, int i, int i2, long j);

    public static native void nSetFloatArrayRegion(float[] fArr, int i, int i2, long j);

    public static native void nGetDoubleArrayRegion(double[] dArr, int i, int i2, long j);

    public static native void nSetDoubleArrayRegion(double[] dArr, int i, int i2, long j);

    public static native int nRegisterNatives(Class<?> cls, long j, int i);

    @NativeType("jint")
    public static native int UnregisterNatives(@NativeType("jclass") Class<?> cls);

    public static native int nGetJavaVM(long j);

    public static native void nGetStringRegion(String str, int i, int i2, long j);

    public static native void nGetStringUTFRegion(String str, int i, int i2, long j);

    @NativeType("void *")
    public static native long NewWeakGlobalRef(@NativeType("jobject") Object obj);

    public static native void nDeleteWeakGlobalRef(long j);

    public static native ByteBuffer nNewDirectByteBuffer(long j, long j2);

    @NativeType("void *")
    public static native long GetDirectBufferAddress(@NativeType("jobject") Buffer buffer);

    @NativeType("jobjectRefType")
    public static native int GetObjectRefType(@NativeType("jobject") Object obj);

    public static native void noop();

    static {
        Library.initialize();
    }

    protected JNINativeInterface() {
        throw new UnsupportedOperationException();
    }

    @NativeType("jobject")
    public static Method ToReflectedMethod(@NativeType("jclass") Class<?> cls, @NativeType("jmethodID") long methodID, @NativeType("jboolean") boolean isStatic) {
        if (Checks.CHECKS) {
            Checks.check(methodID);
        }
        return nToReflectedMethod(cls, methodID, isStatic);
    }

    @NativeType("jobject")
    public static Field ToReflectedField(@NativeType("jclass") Class<?> cls, @NativeType("jfieldID") long fieldID, @NativeType("jboolean") boolean isStatic) {
        if (Checks.CHECKS) {
            Checks.check(fieldID);
        }
        return nToReflectedField(cls, fieldID, isStatic);
    }

    public static void DeleteGlobalRef(@NativeType("void *") long globalRef) {
        if (Checks.CHECKS) {
            Checks.check(globalRef);
        }
        nDeleteGlobalRef(globalRef);
    }

    @NativeType("jboolean *")
    public static ByteBuffer GetBooleanArrayElements(@NativeType("jbooleanArray") byte[] array, @NativeType("jboolean *") ByteBuffer isCopy) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) isCopy, 1);
        }
        long __result = nGetBooleanArrayElements(array, MemoryUtil.memAddressSafe(isCopy));
        return MemoryUtil.memByteBufferSafe(__result, array.length);
    }

    public static void ReleaseBooleanArrayElements(@NativeType("jbooleanArray") byte[] array, @NativeType("jboolean *") ByteBuffer elems, @NativeType("jint") int mode) {
        nReleaseBooleanArrayElements(array, MemoryUtil.memAddress(elems), mode);
    }

    @NativeType("jbyte *")
    public static ByteBuffer GetByteArrayElements(@NativeType("jbyteArray") byte[] array, @NativeType("jboolean *") ByteBuffer isCopy) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) isCopy, 1);
        }
        long __result = nGetByteArrayElements(array, MemoryUtil.memAddressSafe(isCopy));
        return MemoryUtil.memByteBufferSafe(__result, array.length);
    }

    public static void ReleaseByteArrayElements(@NativeType("jbyteArray") byte[] array, @NativeType("jbyte *") ByteBuffer elems, @NativeType("jint") int mode) {
        nReleaseByteArrayElements(array, MemoryUtil.memAddress(elems), mode);
    }

    @NativeType("jchar *")
    public static ShortBuffer GetCharArrayElements(@NativeType("jcharArray") char[] array, @NativeType("jboolean *") ByteBuffer isCopy) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) isCopy, 1);
        }
        long __result = nGetCharArrayElements(array, MemoryUtil.memAddressSafe(isCopy));
        return MemoryUtil.memShortBufferSafe(__result, array.length);
    }

    public static void ReleaseCharArrayElements(@NativeType("jcharArray") char[] array, @NativeType("jchar *") ShortBuffer elems, @NativeType("jint") int mode) {
        nReleaseCharArrayElements(array, MemoryUtil.memAddress(elems), mode);
    }

    @NativeType("jshort *")
    public static ShortBuffer GetShortArrayElements(@NativeType("jshortArray") short[] array, @NativeType("jboolean *") ByteBuffer isCopy) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) isCopy, 1);
        }
        long __result = nGetShortArrayElements(array, MemoryUtil.memAddressSafe(isCopy));
        return MemoryUtil.memShortBufferSafe(__result, array.length);
    }

    public static void ReleaseShortArrayElements(@NativeType("jshortArray") short[] array, @NativeType("jshort *") ShortBuffer elems, @NativeType("jint") int mode) {
        nReleaseShortArrayElements(array, MemoryUtil.memAddress(elems), mode);
    }

    @NativeType("jint *")
    public static IntBuffer GetIntArrayElements(@NativeType("jintArray") int[] array, @NativeType("jboolean *") ByteBuffer isCopy) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) isCopy, 1);
        }
        long __result = nGetIntArrayElements(array, MemoryUtil.memAddressSafe(isCopy));
        return MemoryUtil.memIntBufferSafe(__result, array.length);
    }

    public static void ReleaseIntArrayElements(@NativeType("jintArray") int[] array, @NativeType("jint *") IntBuffer elems, @NativeType("jint") int mode) {
        nReleaseIntArrayElements(array, MemoryUtil.memAddress(elems), mode);
    }

    @NativeType("jlong *")
    public static LongBuffer GetLongArrayElements(@NativeType("jlongArray") long[] array, @NativeType("jboolean *") ByteBuffer isCopy) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) isCopy, 1);
        }
        long __result = nGetLongArrayElements(array, MemoryUtil.memAddressSafe(isCopy));
        return MemoryUtil.memLongBufferSafe(__result, array.length);
    }

    public static void ReleaseLongArrayElements(@NativeType("jlongArray") long[] array, @NativeType("jlong *") LongBuffer elems, @NativeType("jint") int mode) {
        nReleaseLongArrayElements(array, MemoryUtil.memAddress(elems), mode);
    }

    @NativeType("jfloat *")
    public static FloatBuffer GetFloatArrayElements(@NativeType("jfloatArray") float[] array, @NativeType("jboolean *") ByteBuffer isCopy) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) isCopy, 1);
        }
        long __result = nGetFloatArrayElements(array, MemoryUtil.memAddressSafe(isCopy));
        return MemoryUtil.memFloatBufferSafe(__result, array.length);
    }

    public static void ReleaseFloatArrayElements(@NativeType("jfloatArray") float[] array, @NativeType("jfloat *") FloatBuffer elems, @NativeType("jint") int mode) {
        nReleaseFloatArrayElements(array, MemoryUtil.memAddress(elems), mode);
    }

    @NativeType("jdouble *")
    public static DoubleBuffer GetDoubleArrayElements(@NativeType("jdoubleArray") double[] array, @NativeType("jboolean *") ByteBuffer isCopy) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) isCopy, 1);
        }
        long __result = nGetDoubleArrayElements(array, MemoryUtil.memAddressSafe(isCopy));
        return MemoryUtil.memDoubleBufferSafe(__result, array.length);
    }

    public static void ReleaseDoubleArrayElements(@NativeType("jdoubleArray") double[] array, @NativeType("jdouble *") DoubleBuffer elems, @NativeType("jint") int mode) {
        nReleaseDoubleArrayElements(array, MemoryUtil.memAddress(elems), mode);
    }

    public static void GetBooleanArrayRegion(@NativeType("jbooleanArray") byte[] array, @NativeType("jsize") int start, @NativeType("jboolean *") ByteBuffer buf) {
        nGetBooleanArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void SetBooleanArrayRegion(@NativeType("jbooleanArray") byte[] array, @NativeType("jsize") int start, @NativeType("jboolean const *") ByteBuffer buf) {
        nSetBooleanArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void GetByteArrayRegion(@NativeType("jbyteArray") byte[] array, @NativeType("jsize") int start, @NativeType("jbyte *") ByteBuffer buf) {
        nGetByteArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void SetByteArrayRegion(@NativeType("jbyteArray") byte[] array, @NativeType("jsize") int start, @NativeType("jbyte const *") ByteBuffer buf) {
        nSetByteArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void GetCharArrayRegion(@NativeType("jcharArray") char[] array, @NativeType("jsize") int start, @NativeType("jchar *") ShortBuffer buf) {
        nGetCharArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void SetCharArrayRegion(@NativeType("jcharArray") char[] array, @NativeType("jsize") int start, @NativeType("jchar const *") ShortBuffer buf) {
        nSetCharArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void GetShortArrayRegion(@NativeType("jshortArray") short[] array, @NativeType("jsize") int start, @NativeType("jshort *") ShortBuffer buf) {
        nGetShortArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void SetShortArrayRegion(@NativeType("jshortArray") short[] array, @NativeType("jsize") int start, @NativeType("jshort const *") ShortBuffer buf) {
        nSetShortArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void GetIntArrayRegion(@NativeType("jintArray") int[] array, @NativeType("jsize") int start, @NativeType("jint *") IntBuffer buf) {
        nGetIntArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void SetIntArrayRegion(@NativeType("jintArray") int[] array, @NativeType("jsize") int start, @NativeType("jint const *") IntBuffer buf) {
        nSetIntArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void GetLongArrayRegion(@NativeType("jlongArray") long[] array, @NativeType("jsize") int start, @NativeType("jlong *") LongBuffer buf) {
        nGetLongArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void SetLongArrayRegion(@NativeType("jlongArray") long[] array, @NativeType("jsize") int start, @NativeType("jlong const *") LongBuffer buf) {
        nSetLongArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void GetFloatArrayRegion(@NativeType("jfloatArray") float[] array, @NativeType("jsize") int start, @NativeType("jfloat *") FloatBuffer buf) {
        nGetFloatArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void SetFloatArrayRegion(@NativeType("jfloatArray") float[] array, @NativeType("jsize") int start, @NativeType("jfloat const *") FloatBuffer buf) {
        nSetFloatArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void GetDoubleArrayRegion(@NativeType("jdoubleArray") double[] array, @NativeType("jsize") int start, @NativeType("jdouble *") DoubleBuffer buf) {
        nGetDoubleArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    public static void SetDoubleArrayRegion(@NativeType("jdoubleArray") double[] array, @NativeType("jsize") int start, @NativeType("jdouble const *") DoubleBuffer buf) {
        nSetDoubleArrayRegion(array, start, buf.remaining(), MemoryUtil.memAddress(buf));
    }

    @NativeType("jint")
    public static int RegisterNatives(@NativeType("jclass") Class<?> targetClass, @NativeType("JNINativeMethod const *") JNINativeMethod.Buffer methods) {
        if (Checks.CHECKS) {
            Struct.validate(methods.address(), methods.remaining(), JNINativeMethod.SIZEOF, JNINativeMethod::validate);
        }
        return nRegisterNatives(targetClass, methods.address(), methods.remaining());
    }

    @NativeType("jint")
    public static int GetJavaVM(@NativeType("JavaVM **") PointerBuffer vm) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) vm, 1);
        }
        return nGetJavaVM(MemoryUtil.memAddress(vm));
    }

    public static void GetStringRegion(@NativeType("jstring") String str, @NativeType("jsize") int start, @NativeType("jchar *") ByteBuffer buf) {
        nGetStringRegion(str, start, buf.remaining() >> 1, MemoryUtil.memAddress(buf));
    }

    public static void GetStringUTFRegion(@NativeType("jstring") String str, @NativeType("jsize") int start, @NativeType("jsize") int len, @NativeType("char *") ByteBuffer buf) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) buf, len);
        }
        nGetStringUTFRegion(str, start, len, MemoryUtil.memAddress(buf));
    }

    public static void DeleteWeakGlobalRef(@NativeType("void *") long weakGlobalRef) {
        if (Checks.CHECKS) {
            Checks.check(weakGlobalRef);
        }
        nDeleteWeakGlobalRef(weakGlobalRef);
    }

    @NativeType("jobject")
    public static ByteBuffer NewDirectByteBuffer(@NativeType("void *") long address, @NativeType("jlong") long capacity) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        return nNewDirectByteBuffer(address, capacity);
    }
}
