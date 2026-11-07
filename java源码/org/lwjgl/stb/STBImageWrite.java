package org.lwjgl.stb;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBImageWrite.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBImageWrite.class */
public class STBImageWrite {
    public static final IntBuffer stbi_write_png_compression_level;
    public static final IntBuffer stbi_write_force_png_filter;
    public static final PointerBuffer stbi_zlib_compress;
    public static final IntBuffer stbi_write_tga_with_rle;

    public static native int nstbi_write_png(long j, int i, int i2, int i3, long j2, int i4);

    private static native long nstbi_write_png_compression_level();

    private static native long nstbi_write_force_png_filter();

    private static native long nstbi_zlib_compress();

    public static native int nstbi_write_bmp(long j, int i, int i2, int i3, long j2);

    public static native int nstbi_write_tga(long j, int i, int i2, int i3, long j2);

    private static native long nstbi_write_tga_with_rle();

    public static native int nstbi_write_hdr(long j, int i, int i2, int i3, long j2);

    public static native int nstbi_write_jpg(long j, int i, int i2, int i3, long j2, int i4);

    public static native int nstbi_write_png_to_func(long j, long j2, int i, int i2, int i3, long j3, int i4);

    public static native int nstbi_write_bmp_to_func(long j, long j2, int i, int i2, int i3, long j3);

    public static native int nstbi_write_tga_to_func(long j, long j2, int i, int i2, int i3, long j3);

    public static native int nstbi_write_hdr_to_func(long j, long j2, int i, int i2, int i3, long j3);

    public static native int nstbi_write_jpg_to_func(long j, long j2, int i, int i2, int i3, long j3, int i4);

    public static native void nstbi_flip_vertically_on_write(int i);

    public static native int nstbi_write_hdr(long j, int i, int i2, int i3, float[] fArr);

    public static native int nstbi_write_hdr_to_func(long j, long j2, int i, int i2, int i3, float[] fArr);

    static {
        LibSTB.initialize();
        stbi_write_png_compression_level = stbi_write_png_compression_level();
        stbi_write_force_png_filter = stbi_write_force_png_filter();
        stbi_zlib_compress = stbi_zlib_compress();
        stbi_write_tga_with_rle = stbi_write_tga_with_rle();
    }

    protected STBImageWrite() {
        throw new UnsupportedOperationException();
    }

    @NativeType("int")
    public static boolean stbi_write_png(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int stride_in_bytes) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) data, (stride_in_bytes != 0 ? stride_in_bytes : w * comp) * h);
        }
        return nstbi_write_png(MemoryUtil.memAddress(filename), w, h, comp, MemoryUtil.memAddress(data), stride_in_bytes) != 0;
    }

    @NativeType("int")
    public static boolean stbi_write_png(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int stride_in_bytes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, (stride_in_bytes != 0 ? stride_in_bytes : w * comp) * h);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_png(filenameEncoded, w, h, comp, MemoryUtil.memAddress(data), stride_in_bytes) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("int *")
    private static IntBuffer stbi_write_png_compression_level() {
        long __result = nstbi_write_png_compression_level();
        return MemoryUtil.memIntBuffer(__result, 1);
    }

    @NativeType("int *")
    private static IntBuffer stbi_write_force_png_filter() {
        long __result = nstbi_write_force_png_filter();
        return MemoryUtil.memIntBuffer(__result, 1);
    }

    @NativeType("unsigned char * (*) (unsigned char *, int, int *, int) *")
    private static PointerBuffer stbi_zlib_compress() {
        long __result = nstbi_zlib_compress();
        return MemoryUtil.memPointerBuffer(__result, 1);
    }

    @NativeType("int")
    public static boolean stbi_write_bmp(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) data, w * h * comp);
        }
        return nstbi_write_bmp(MemoryUtil.memAddress(filename), w, h, comp, MemoryUtil.memAddress(data)) != 0;
    }

    @NativeType("int")
    public static boolean stbi_write_bmp(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, w * h * comp);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_bmp(filenameEncoded, w, h, comp, MemoryUtil.memAddress(data)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("int")
    public static boolean stbi_write_tga(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) data, w * h * comp);
        }
        return nstbi_write_tga(MemoryUtil.memAddress(filename), w, h, comp, MemoryUtil.memAddress(data)) != 0;
    }

    @NativeType("int")
    public static boolean stbi_write_tga(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, w * h * comp);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_tga(filenameEncoded, w, h, comp, MemoryUtil.memAddress(data)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("int *")
    private static IntBuffer stbi_write_tga_with_rle() {
        long __result = nstbi_write_tga_with_rle();
        return MemoryUtil.memIntBuffer(__result, 1);
    }

    @NativeType("int")
    public static boolean stbi_write_hdr(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("float const *") FloatBuffer data) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) data, w * h * comp);
        }
        return nstbi_write_hdr(MemoryUtil.memAddress(filename), w, h, comp, MemoryUtil.memAddress(data)) != 0;
    }

    @NativeType("int")
    public static boolean stbi_write_hdr(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("float const *") FloatBuffer data) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, w * h * comp);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_hdr(filenameEncoded, w, h, comp, MemoryUtil.memAddress(data)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("int")
    public static boolean stbi_write_jpg(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int quality) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) data, w * h * comp);
        }
        return nstbi_write_jpg(MemoryUtil.memAddress(filename), w, h, comp, MemoryUtil.memAddress(data), quality) != 0;
    }

    @NativeType("int")
    public static boolean stbi_write_jpg(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int quality) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, w * h * comp);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_jpg(filenameEncoded, w, h, comp, MemoryUtil.memAddress(data), quality) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("int")
    public static boolean stbi_write_png_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int stride_in_bytes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, (stride_in_bytes != 0 ? stride_in_bytes : w * comp) * h);
        }
        return nstbi_write_png_to_func(func.address(), context, w, h, comp, MemoryUtil.memAddress(data), stride_in_bytes) != 0;
    }

    @NativeType("int")
    public static boolean stbi_write_bmp_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, w * h * comp);
        }
        return nstbi_write_bmp_to_func(func.address(), context, w, h, comp, MemoryUtil.memAddress(data)) != 0;
    }

    @NativeType("int")
    public static boolean stbi_write_tga_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, w * h * comp);
        }
        return nstbi_write_tga_to_func(func.address(), context, w, h, comp, MemoryUtil.memAddress(data)) != 0;
    }

    @NativeType("int")
    public static boolean stbi_write_hdr_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("float const *") FloatBuffer data) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, w * h * comp);
        }
        return nstbi_write_hdr_to_func(func.address(), context, w, h, comp, MemoryUtil.memAddress(data)) != 0;
    }

    public static int stbi_write_jpg_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int quality) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) data, w * h * comp);
        }
        return nstbi_write_jpg_to_func(func.address(), context, w, h, comp, MemoryUtil.memAddress(data), quality);
    }

    public static void stbi_flip_vertically_on_write(@NativeType("int") boolean flip_boolean) {
        nstbi_flip_vertically_on_write(flip_boolean ? 1 : 0);
    }

    @NativeType("int")
    public static boolean stbi_write_hdr(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("float const *") float[] data) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check(data, w * h * comp);
        }
        return nstbi_write_hdr(MemoryUtil.memAddress(filename), w, h, comp, data) != 0;
    }

    @NativeType("int")
    public static boolean stbi_write_hdr(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("float const *") float[] data) {
        if (Checks.CHECKS) {
            Checks.check(data, w * h * comp);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_hdr(filenameEncoded, w, h, comp, data) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("int")
    public static boolean stbi_write_hdr_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("float const *") float[] data) {
        if (Checks.CHECKS) {
            Checks.check(data, w * h * comp);
        }
        return nstbi_write_hdr_to_func(func.address(), context, w, h, comp, data) != 0;
    }
}
