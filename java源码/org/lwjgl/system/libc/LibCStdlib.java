package org.lwjgl.system.libc;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libc/LibCStdlib.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libc/LibCStdlib.class */
public class LibCStdlib {
    public static native long nmalloc(long j);

    public static native long ncalloc(long j, long j2);

    public static native long nrealloc(long j, long j2);

    public static native void nfree(long j);

    public static native long naligned_alloc(long j, long j2);

    public static native void naligned_free(long j);

    static {
        Library.initialize();
    }

    protected LibCStdlib() {
        throw new UnsupportedOperationException();
    }

    @NativeType("void *")
    public static ByteBuffer malloc(@NativeType("size_t") long size) {
        long __result = nmalloc(size);
        return MemoryUtil.memByteBufferSafe(__result, (int) size);
    }

    @NativeType("void *")
    public static ByteBuffer calloc(@NativeType("size_t") long nmemb, @NativeType("size_t") long size) {
        long __result = ncalloc(nmemb, size);
        return MemoryUtil.memByteBufferSafe(__result, ((int) nmemb) * ((int) size));
    }

    @NativeType("void *")
    public static ByteBuffer realloc(@NativeType("void *") ByteBuffer ptr, @NativeType("size_t") long size) {
        long __result = nrealloc(MemoryUtil.memAddressSafe(ptr), size);
        return MemoryUtil.memByteBufferSafe(__result, (int) size);
    }

    public static void free(@NativeType("void *") ByteBuffer ptr) {
        nfree(MemoryUtil.memAddressSafe(ptr));
    }

    public static void free(@NativeType("void *") ShortBuffer ptr) {
        nfree(MemoryUtil.memAddressSafe(ptr));
    }

    public static void free(@NativeType("void *") IntBuffer ptr) {
        nfree(MemoryUtil.memAddressSafe(ptr));
    }

    public static void free(@NativeType("void *") LongBuffer ptr) {
        nfree(MemoryUtil.memAddressSafe(ptr));
    }

    public static void free(@NativeType("void *") FloatBuffer ptr) {
        nfree(MemoryUtil.memAddressSafe(ptr));
    }

    public static void free(@NativeType("void *") DoubleBuffer ptr) {
        nfree(MemoryUtil.memAddressSafe(ptr));
    }

    public static void free(@NativeType("void *") PointerBuffer ptr) {
        nfree(MemoryUtil.memAddressSafe(ptr));
    }

    @NativeType("void *")
    public static ByteBuffer aligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = naligned_alloc(alignment, size);
        return MemoryUtil.memByteBufferSafe(__result, (int) size);
    }

    public static void aligned_free(@NativeType("void *") ByteBuffer ptr) {
        naligned_free(MemoryUtil.memAddressSafe(ptr));
    }

    public static void aligned_free(@NativeType("void *") ShortBuffer ptr) {
        naligned_free(MemoryUtil.memAddressSafe(ptr));
    }

    public static void aligned_free(@NativeType("void *") IntBuffer ptr) {
        naligned_free(MemoryUtil.memAddressSafe(ptr));
    }

    public static void aligned_free(@NativeType("void *") LongBuffer ptr) {
        naligned_free(MemoryUtil.memAddressSafe(ptr));
    }

    public static void aligned_free(@NativeType("void *") FloatBuffer ptr) {
        naligned_free(MemoryUtil.memAddressSafe(ptr));
    }

    public static void aligned_free(@NativeType("void *") DoubleBuffer ptr) {
        naligned_free(MemoryUtil.memAddressSafe(ptr));
    }

    public static void aligned_free(@NativeType("void *") PointerBuffer ptr) {
        naligned_free(MemoryUtil.memAddressSafe(ptr));
    }
}
