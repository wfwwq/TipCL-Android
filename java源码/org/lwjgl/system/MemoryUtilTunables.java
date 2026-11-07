package org.lwjgl.system;

import org.lwjgl.system.libc.LibCString;
import sun.misc.Unsafe;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryUtilTunables.class */
final class MemoryUtilTunables {
    private static final int FILL_PATTERN_32 = Integer.divideUnsigned(-1, 255);
    private static final long FILL_PATTERN_64 = Long.divideUnsigned(-1, 255);
    private static final long BASE_OFFSET_BYTE = Integer.toUnsignedLong(Unsafe.ARRAY_BYTE_BASE_OFFSET);
    private static final long BASE_OFFSET_SHORT = Integer.toUnsignedLong(Unsafe.ARRAY_SHORT_BASE_OFFSET);
    private static final long BASE_OFFSET_INT = Integer.toUnsignedLong(Unsafe.ARRAY_INT_BASE_OFFSET);
    private static final long BASE_OFFSET_LONG = Integer.toUnsignedLong(Unsafe.ARRAY_LONG_BASE_OFFSET);
    private static final long BASE_OFFSET_FLOAT = Integer.toUnsignedLong(Unsafe.ARRAY_FLOAT_BASE_OFFSET);
    private static final long BASE_OFFSET_DOUBLE = Integer.toUnsignedLong(Unsafe.ARRAY_DOUBLE_BASE_OFFSET);

    private MemoryUtilTunables() {
    }

    static void memset(long ptr, int value, long bytes) {
        if (bytes < 256) {
            int p = (int) ptr;
            if (Pointer.BITS64) {
                if ((p & 7) == 0) {
                    memset64(ptr, value, bytes);
                    return;
                }
            } else if ((p & 3) == 0) {
                memset32(p, value, bytes);
                return;
            }
        }
        LibCString.nmemset(ptr, value, bytes);
    }

    private static void memset64(long ptr, int value, long bytes) {
        int limit = ((int) bytes) & 255;
        long l = (value & 255) * FILL_PATTERN_64;
        int offset = 0;
        int aligned = limit & (-8);
        while (offset < aligned) {
            MemoryUtil.UNSAFE.putLong((Object) null, ptr + offset, l);
            offset += 8;
        }
        if (offset < (limit & (-4))) {
            MemoryUtil.UNSAFE.putInt((Object) null, ptr + offset, (int) l);
            offset += 4;
        }
        if (offset < (limit & (-2))) {
            MemoryUtil.UNSAFE.putShort((Object) null, ptr + offset, (short) l);
            offset += 2;
        }
        if (offset < limit) {
            MemoryUtil.UNSAFE.putByte((Object) null, ptr + offset, (byte) l);
        }
    }

    private static void memset32(int ptr, int value, long bytes) {
        int limit = ((int) bytes) & 255;
        int i = (value & 255) * FILL_PATTERN_32;
        int offset = 0;
        int aligned = limit & (-4);
        while (offset < aligned) {
            MemoryUtil.UNSAFE.putInt((Object) null, Integer.toUnsignedLong(ptr + offset), i);
            offset += 4;
        }
        if (offset < (limit & (-2))) {
            MemoryUtil.UNSAFE.putShort((Object) null, Integer.toUnsignedLong(ptr + offset), (short) i);
            offset += 2;
        }
        if (offset < limit) {
            MemoryUtil.UNSAFE.putByte((Object) null, Integer.toUnsignedLong(ptr + offset), (byte) i);
        }
    }

    static void memcpy(long src, long dst, long bytes) {
        if (Pointer.BITS64 && bytes <= 160 && ((src | dst) & 7) == 0) {
            memcpyAligned64(src, dst, bytes);
        } else {
            LibCString.nmemcpy(dst, src, bytes);
        }
    }

    private static void memcpyAligned64(long src, long dst, long bytes) {
        int limit = ((int) bytes) & 255;
        int offset = 0;
        int aligned = limit & (-8);
        while (offset < aligned) {
            MemoryUtil.UNSAFE.putLong((Object) null, dst + offset, MemoryUtil.UNSAFE.getLong((Object) null, src + offset));
            offset += 8;
        }
        if (offset < (limit & (-4))) {
            MemoryUtil.UNSAFE.putInt((Object) null, dst + offset, MemoryUtil.UNSAFE.getInt((Object) null, src + offset));
            offset += 4;
        }
        if (offset < (limit & (-2))) {
            MemoryUtil.UNSAFE.putShort((Object) null, dst + offset, MemoryUtil.UNSAFE.getShort((Object) null, src + offset));
            offset += 2;
        }
        if (offset < limit) {
            MemoryUtil.UNSAFE.putByte((Object) null, dst + offset, MemoryUtil.UNSAFE.getByte((Object) null, src + offset));
        }
    }

    static void memcpy(byte[] src, long dst, int offset, int size) {
        Checks.checkMemcpy(dst, offset, size, src.length);
        MemoryUtil.UNSAFE.copyMemory(src, BASE_OFFSET_BYTE + offset, (Object) null, dst, size);
    }

    static void memcpy(short[] src, long dst, int offset, int size) {
        Checks.checkMemcpy(dst, offset, size, src.length);
        MemoryUtil.UNSAFE.copyMemory(src, BASE_OFFSET_SHORT + APIUtil.apiGetBytes(offset, 1), (Object) null, dst, APIUtil.apiGetBytes(size, 1));
    }

    static void memcpy(int[] src, long dst, int offset, int size) {
        Checks.checkMemcpy(dst, offset, size, src.length);
        MemoryUtil.UNSAFE.copyMemory(src, BASE_OFFSET_INT + APIUtil.apiGetBytes(offset, 2), (Object) null, dst, APIUtil.apiGetBytes(size, 2));
    }

    static void memcpy(long[] src, long dst, int offset, int size) {
        Checks.checkMemcpy(dst, offset, size, src.length);
        MemoryUtil.UNSAFE.copyMemory(src, BASE_OFFSET_LONG + APIUtil.apiGetBytes(offset, 3), (Object) null, dst, APIUtil.apiGetBytes(size, 3));
    }

    static void memcpy(float[] src, long dst, int offset, int size) {
        Checks.checkMemcpy(dst, offset, size, src.length);
        MemoryUtil.UNSAFE.copyMemory(src, BASE_OFFSET_FLOAT + APIUtil.apiGetBytes(offset, 2), (Object) null, dst, APIUtil.apiGetBytes(size, 2));
    }

    static void memcpy(double[] src, long dst, int offset, int size) {
        Checks.checkMemcpy(dst, offset, size, src.length);
        MemoryUtil.UNSAFE.copyMemory(src, BASE_OFFSET_DOUBLE + APIUtil.apiGetBytes(offset, 3), (Object) null, dst, APIUtil.apiGetBytes(size, 3));
    }

    static void memcpy(long src, byte[] dst, int offset, int size) {
        Checks.checkMemcpy(src, offset, size, dst.length);
        MemoryUtil.UNSAFE.copyMemory((Object) null, src, dst, BASE_OFFSET_BYTE + offset, size);
    }

    static void memcpy(long src, short[] dst, int offset, int size) {
        Checks.checkMemcpy(src, offset, size, dst.length);
        MemoryUtil.UNSAFE.copyMemory((Object) null, src, dst, BASE_OFFSET_SHORT + APIUtil.apiGetBytes(offset, 1), APIUtil.apiGetBytes(size, 1));
    }

    static void memcpy(long src, int[] dst, int offset, int size) {
        Checks.checkMemcpy(src, offset, size, dst.length);
        MemoryUtil.UNSAFE.copyMemory((Object) null, src, dst, BASE_OFFSET_INT + APIUtil.apiGetBytes(offset, 2), APIUtil.apiGetBytes(size, 2));
    }

    static void memcpy(long src, long[] dst, int offset, int size) {
        Checks.checkMemcpy(src, offset, size, dst.length);
        MemoryUtil.UNSAFE.copyMemory((Object) null, src, dst, BASE_OFFSET_LONG + APIUtil.apiGetBytes(offset, 3), APIUtil.apiGetBytes(size, 3));
    }

    static void memcpy(long src, float[] dst, int offset, int size) {
        Checks.checkMemcpy(src, offset, size, dst.length);
        MemoryUtil.UNSAFE.copyMemory((Object) null, src, dst, BASE_OFFSET_FLOAT + APIUtil.apiGetBytes(offset, 2), APIUtil.apiGetBytes(size, 2));
    }

    static void memcpy(long src, double[] dst, int offset, int size) {
        Checks.checkMemcpy(src, offset, size, dst.length);
        MemoryUtil.UNSAFE.copyMemory((Object) null, src, dst, BASE_OFFSET_DOUBLE + APIUtil.apiGetBytes(offset, 3), APIUtil.apiGetBytes(size, 3));
    }
}
