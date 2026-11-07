package org.lwjgl.system.libc;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libc/LibCString.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libc/LibCString.class */
public class LibCString {
    public static native long nmemset(long j, int i, long j2);

    public static native long nmemcpy(long j, long j2, long j3);

    public static native long nmemmove(long j, long j2, long j3);

    public static native long nstrlen(long j);

    public static native long nstrerror(int i);

    public static native long nmemset(byte[] bArr, int i, long j);

    public static native long nmemset(short[] sArr, int i, long j);

    public static native long nmemset(int[] iArr, int i, long j);

    public static native long nmemset(long[] jArr, int i, long j);

    public static native long nmemset(float[] fArr, int i, long j);

    public static native long nmemset(double[] dArr, int i, long j);

    public static native long nmemcpy(byte[] bArr, byte[] bArr2, long j);

    public static native long nmemcpy(short[] sArr, short[] sArr2, long j);

    public static native long nmemcpy(int[] iArr, int[] iArr2, long j);

    public static native long nmemcpy(long[] jArr, long[] jArr2, long j);

    public static native long nmemcpy(float[] fArr, float[] fArr2, long j);

    public static native long nmemcpy(double[] dArr, double[] dArr2, long j);

    public static native long nmemmove(byte[] bArr, byte[] bArr2, long j);

    public static native long nmemmove(short[] sArr, short[] sArr2, long j);

    public static native long nmemmove(int[] iArr, int[] iArr2, long j);

    public static native long nmemmove(long[] jArr, long[] jArr2, long j);

    public static native long nmemmove(float[] fArr, float[] fArr2, long j);

    public static native long nmemmove(double[] dArr, double[] dArr2, long j);

    static {
        Library.initialize();
    }

    protected LibCString() {
        throw new UnsupportedOperationException();
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") ByteBuffer dest, int c) {
        return nmemset(MemoryUtil.memAddress(dest), c, dest.remaining());
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") ShortBuffer dest, int c) {
        return nmemset(MemoryUtil.memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) << 1);
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") IntBuffer dest, int c) {
        return nmemset(MemoryUtil.memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) << 2);
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") LongBuffer dest, int c) {
        return nmemset(MemoryUtil.memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) << 3);
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") FloatBuffer dest, int c) {
        return nmemset(MemoryUtil.memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) << 2);
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") DoubleBuffer dest, int c) {
        return nmemset(MemoryUtil.memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) << 3);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") ByteBuffer dest, @NativeType("void const *") ByteBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemcpy(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), src.remaining());
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") ShortBuffer dest, @NativeType("void const *") ShortBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemcpy(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), Integer.toUnsignedLong(src.remaining()) << 1);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") IntBuffer dest, @NativeType("void const *") IntBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemcpy(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), Integer.toUnsignedLong(src.remaining()) << 2);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") LongBuffer dest, @NativeType("void const *") LongBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemcpy(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), Integer.toUnsignedLong(src.remaining()) << 3);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") FloatBuffer dest, @NativeType("void const *") FloatBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemcpy(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), Integer.toUnsignedLong(src.remaining()) << 2);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") DoubleBuffer dest, @NativeType("void const *") DoubleBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemcpy(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), Integer.toUnsignedLong(src.remaining()) << 3);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") ByteBuffer dest, @NativeType("void const *") ByteBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemmove(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), src.remaining());
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") ShortBuffer dest, @NativeType("void const *") ShortBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemmove(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), Integer.toUnsignedLong(src.remaining()) << 1);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") IntBuffer dest, @NativeType("void const *") IntBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemmove(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), Integer.toUnsignedLong(src.remaining()) << 2);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") LongBuffer dest, @NativeType("void const *") LongBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemmove(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), Integer.toUnsignedLong(src.remaining()) << 3);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") FloatBuffer dest, @NativeType("void const *") FloatBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemmove(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), Integer.toUnsignedLong(src.remaining()) << 2);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") DoubleBuffer dest, @NativeType("void const *") DoubleBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, src.remaining());
        }
        return nmemmove(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src), Integer.toUnsignedLong(src.remaining()) << 3);
    }

    @NativeType("size_t")
    public static long strlen(@NativeType("char const *") ByteBuffer str) {
        if (Checks.CHECKS) {
            Checks.checkNT1(str);
        }
        return nstrlen(MemoryUtil.memAddress(str));
    }

    @NativeType("char *")
    public static String strerror(int errnum) {
        long __result = nstrerror(errnum);
        return MemoryUtil.memASCIISafe(__result);
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") byte[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 0);
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") short[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 1);
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") int[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 2);
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") long[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 3);
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") float[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 2);
    }

    @NativeType("void *")
    public static long memset(@NativeType("void *") double[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 3);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") byte[] dest, @NativeType("void const *") byte[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 0);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") short[] dest, @NativeType("void const *") short[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 1);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") int[] dest, @NativeType("void const *") int[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 2);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") long[] dest, @NativeType("void const *") long[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 3);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") float[] dest, @NativeType("void const *") float[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 2);
    }

    @NativeType("void *")
    public static long memcpy(@NativeType("void *") double[] dest, @NativeType("void const *") double[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 3);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") byte[] dest, @NativeType("void const *") byte[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 0);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") short[] dest, @NativeType("void const *") short[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 1);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") int[] dest, @NativeType("void const *") int[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 2);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") long[] dest, @NativeType("void const *") long[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 3);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") float[] dest, @NativeType("void const *") float[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 2);
    }

    @NativeType("void *")
    public static long memmove(@NativeType("void *") double[] dest, @NativeType("void const *") double[] src) {
        if (Checks.CHECKS) {
            Checks.check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 3);
    }

    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memset(@NativeType("void *") T dest, @NativeType("int") int c) {
        return nmemset(MemoryUtil.memAddress((CustomBuffer<?>) dest), c, Integer.toUnsignedLong(dest.remaining()) * dest.sizeof());
    }

    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memcpy(@NativeType("void *") T dest, @NativeType("void const *") T src) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) src, dest.remaining());
        }
        return nmemcpy(MemoryUtil.memAddress((CustomBuffer<?>) dest), MemoryUtil.memAddress((CustomBuffer<?>) src), src.remaining() * src.sizeof());
    }

    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memmove(@NativeType("void *") T dest, @NativeType("void const *") T src) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) src, dest.remaining());
        }
        return nmemmove(MemoryUtil.memAddress((CustomBuffer<?>) dest), MemoryUtil.memAddress((CustomBuffer<?>) src), src.remaining() * src.sizeof());
    }
}
