package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryAccessJNI.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryAccessJNI.class */
final class MemoryAccessJNI {
    static final long malloc;
    static final long calloc;
    static final long realloc;
    static final long free;
    static final long aligned_alloc;
    static final long aligned_free;

    static native int getPointerSize();

    @NativeType("void * (*) (size_t)")
    private static native long malloc();

    @NativeType("void * (*) (size_t, size_t)")
    private static native long calloc();

    @NativeType("void * (*) (void *, size_t)")
    private static native long realloc();

    @NativeType("void (*) (void *)")
    private static native long free();

    @NativeType("void * (*) (size_t, size_t)")
    private static native long aligned_alloc();

    @NativeType("void (*) (void *)")
    private static native long aligned_free();

    static native byte ngetByte(long j);

    static native short ngetShort(long j);

    static native int ngetInt(long j);

    static native long ngetLong(long j);

    static native float ngetFloat(long j);

    static native double ngetDouble(long j);

    static native long ngetAddress(long j);

    static native void nputByte(long j, byte b);

    static native void nputShort(long j, short s);

    static native void nputInt(long j, int i);

    static native void nputLong(long j, long j2);

    static native void nputFloat(long j, float f);

    static native void nputDouble(long j, double d);

    static native void nputAddress(long j, long j2);

    static {
        Library.initialize();
        malloc = malloc();
        calloc = calloc();
        realloc = realloc();
        free = free();
        aligned_alloc = aligned_alloc();
        aligned_free = aligned_free();
    }

    private MemoryAccessJNI() {
        throw new UnsupportedOperationException();
    }

    @NativeType("int8_t")
    static byte getByte(@NativeType("void *") long ptr) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        return ngetByte(ptr);
    }

    @NativeType("int16_t")
    static short getShort(@NativeType("void *") long ptr) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        return ngetShort(ptr);
    }

    @NativeType("int32_t")
    static int getInt(@NativeType("void *") long ptr) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        return ngetInt(ptr);
    }

    @NativeType("int64_t")
    static long getLong(@NativeType("void *") long ptr) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        return ngetLong(ptr);
    }

    static float getFloat(@NativeType("void *") long ptr) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        return ngetFloat(ptr);
    }

    static double getDouble(@NativeType("void *") long ptr) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        return ngetDouble(ptr);
    }

    @NativeType("uintptr_t")
    static long getAddress(@NativeType("void *") long ptr) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        return ngetAddress(ptr);
    }

    static void putByte(@NativeType("void *") long ptr, @NativeType("int8_t") byte value) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        nputByte(ptr, value);
    }

    static void putShort(@NativeType("void *") long ptr, @NativeType("int16_t") short value) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        nputShort(ptr, value);
    }

    static void putInt(@NativeType("void *") long ptr, @NativeType("int32_t") int value) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        nputInt(ptr, value);
    }

    static void putLong(@NativeType("void *") long ptr, @NativeType("int64_t") long value) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        nputLong(ptr, value);
    }

    static void putFloat(@NativeType("void *") long ptr, float value) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        nputFloat(ptr, value);
    }

    static void putDouble(@NativeType("void *") long ptr, double value) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        nputDouble(ptr, value);
    }

    static void putAddress(@NativeType("void *") long ptr, @NativeType("uintptr_t") long value) {
        if (Checks.CHECKS) {
            Checks.check(ptr);
        }
        nputAddress(ptr, value);
    }
}
