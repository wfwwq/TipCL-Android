package org.lwjgl.stb;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBImage.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBImage.class */
public class STBImage {
    public static final int STBI_default = 0;
    public static final int STBI_grey = 1;
    public static final int STBI_grey_alpha = 2;
    public static final int STBI_rgb = 3;
    public static final int STBI_rgb_alpha = 4;

    public static native long nstbi_load(long j, long j2, long j3, long j4, int i);

    public static native long nstbi_load_from_memory(long j, int i, long j2, long j3, long j4, int i2);

    public static native long nstbi_load_from_callbacks(long j, long j2, long j3, long j4, long j5, int i);

    public static native long nstbi_load_gif_from_memory(long j, int i, long j2, long j3, long j4, long j5, long j6, int i2);

    public static native long nstbi_load_16(long j, long j2, long j3, long j4, int i);

    public static native long nstbi_load_16_from_memory(long j, int i, long j2, long j3, long j4, int i2);

    public static native long nstbi_load_16_from_callbacks(long j, long j2, long j3, long j4, long j5, int i);

    public static native long nstbi_loadf(long j, long j2, long j3, long j4, int i);

    public static native long nstbi_loadf_from_memory(long j, int i, long j2, long j3, long j4, int i2);

    public static native long nstbi_loadf_from_callbacks(long j, long j2, long j3, long j4, long j5, int i);

    public static native void stbi_hdr_to_ldr_gamma(float f);

    public static native void stbi_hdr_to_ldr_scale(float f);

    public static native void stbi_ldr_to_hdr_gamma(float f);

    public static native void stbi_ldr_to_hdr_scale(float f);

    public static native int nstbi_is_hdr(long j);

    public static native int nstbi_is_hdr_from_memory(long j, int i);

    public static native int nstbi_is_hdr_from_callbacks(long j, long j2);

    public static native long nstbi_failure_reason();

    public static native void nstbi_image_free(long j);

    public static native int nstbi_info(long j, long j2, long j3, long j4);

    public static native int nstbi_info_from_memory(long j, int i, long j2, long j3, long j4);

    public static native int nstbi_info_from_callbacks(long j, long j2, long j3, long j4, long j5);

    public static native int nstbi_is_16_bit(long j);

    public static native int nstbi_is_16_bit_from_memory(long j, int i);

    public static native int nstbi_is_16_bit_from_callbacks(long j, long j2);

    public static native void nstbi_set_unpremultiply_on_load(int i);

    public static native void nstbi_convert_iphone_png_to_rgb(int i);

    public static native void nstbi_set_flip_vertically_on_load(int i);

    public static native void nstbi_set_unpremultiply_on_load_thread(int i);

    public static native void nstbi_convert_iphone_png_to_rgb_thread(int i);

    public static native void stbi_set_flip_vertically_on_load_thread(int i);

    public static native long nstbi_zlib_decode_malloc_guesssize(long j, int i, int i2, long j2);

    public static native long nstbi_zlib_decode_malloc_guesssize_headerflag(long j, int i, int i2, long j2, int i3);

    public static native long nstbi_zlib_decode_malloc(long j, int i, long j2);

    public static native int nstbi_zlib_decode_buffer(long j, int i, long j2, int i2);

    public static native long nstbi_zlib_decode_noheader_malloc(long j, int i, long j2);

    public static native int nstbi_zlib_decode_noheader_buffer(long j, int i, long j2, int i2);

    public static native long nstbi_load(long j, int[] iArr, int[] iArr2, int[] iArr3, int i);

    public static native long nstbi_load_from_memory(long j, int i, int[] iArr, int[] iArr2, int[] iArr3, int i2);

    public static native long nstbi_load_from_callbacks(long j, long j2, int[] iArr, int[] iArr2, int[] iArr3, int i);

    public static native long nstbi_load_gif_from_memory(long j, int i, long j2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i2);

    public static native long nstbi_load_16(long j, int[] iArr, int[] iArr2, int[] iArr3, int i);

    public static native long nstbi_load_16_from_memory(long j, int i, int[] iArr, int[] iArr2, int[] iArr3, int i2);

    public static native long nstbi_load_16_from_callbacks(long j, long j2, int[] iArr, int[] iArr2, int[] iArr3, int i);

    public static native long nstbi_loadf(long j, int[] iArr, int[] iArr2, int[] iArr3, int i);

    public static native long nstbi_loadf_from_memory(long j, int i, int[] iArr, int[] iArr2, int[] iArr3, int i2);

    public static native long nstbi_loadf_from_callbacks(long j, long j2, int[] iArr, int[] iArr2, int[] iArr3, int i);

    public static native int nstbi_info(long j, int[] iArr, int[] iArr2, int[] iArr3);

    public static native int nstbi_info_from_memory(long j, int i, int[] iArr, int[] iArr2, int[] iArr3);

    public static native int nstbi_info_from_callbacks(long j, long j2, int[] iArr, int[] iArr2, int[] iArr3);

    static {
        LibSTB.initialize();
    }

    protected STBImage() {
        throw new UnsupportedOperationException();
    }

    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
        }
        long __result = nstbi_load(MemoryUtil.memAddress(filename), MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
        return MemoryUtil.memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load(filenameEncoded, MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
        }
        long __result = nstbi_load_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining(), MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
        return MemoryUtil.memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_from_callbacks(clbk.address(), user, MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
        return MemoryUtil.memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_gif_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int **") PointerBuffer delays, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer z, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) delays, 1);
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) z, 1);
            Checks.check((Buffer) channels_in_file, 1);
        }
        long __result = nstbi_load_gif_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining(), MemoryUtil.memAddress(delays), MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(z), MemoryUtil.memAddress(channels_in_file), desired_channels);
        return MemoryUtil.memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * z.get(z.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
        }
        long __result = nstbi_load_16(MemoryUtil.memAddress(filename), MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
        return MemoryUtil.memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load_16(filenameEncoded, MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
            ShortBuffer shortBufferMemShortBufferSafe = MemoryUtil.memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
            stack.setPointer(stackPointer);
            return shortBufferMemShortBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
        }
        long __result = nstbi_load_16_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining(), MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
        return MemoryUtil.memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_16_from_callbacks(clbk.address(), user, MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
        return MemoryUtil.memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    @NativeType("float *")
    public static FloatBuffer stbi_loadf(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
        }
        long __result = nstbi_loadf(MemoryUtil.memAddress(filename), MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
        return MemoryUtil.memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    @NativeType("float *")
    public static FloatBuffer stbi_loadf(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_loadf(filenameEncoded, MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
            FloatBuffer floatBufferMemFloatBufferSafe = MemoryUtil.memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
            stack.setPointer(stackPointer);
            return floatBufferMemFloatBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("float *")
    public static FloatBuffer stbi_loadf_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
        }
        long __result = nstbi_loadf_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining(), MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
        return MemoryUtil.memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    @NativeType("float *")
    public static FloatBuffer stbi_loadf_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_loadf_from_callbacks(clbk.address(), user, MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(channels_in_file), desired_channels);
        return MemoryUtil.memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    @NativeType("int")
    public static boolean stbi_is_hdr(@NativeType("char const *") ByteBuffer filename) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
        }
        return nstbi_is_hdr(MemoryUtil.memAddress(filename)) != 0;
    }

    @NativeType("int")
    public static boolean stbi_is_hdr(@NativeType("char const *") CharSequence filename) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_is_hdr(filenameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("int")
    public static boolean stbi_is_hdr_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer) {
        return nstbi_is_hdr_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining()) != 0;
    }

    @NativeType("int")
    public static boolean stbi_is_hdr_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user) {
        if (Checks.CHECKS) {
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_is_hdr_from_callbacks(clbk.address(), user) != 0;
    }

    @NativeType("char const *")
    public static String stbi_failure_reason() {
        long __result = nstbi_failure_reason();
        return MemoryUtil.memASCIISafe(__result);
    }

    public static void stbi_image_free(@NativeType("void *") ByteBuffer retval_from_stbi_load) {
        nstbi_image_free(MemoryUtil.memAddress(retval_from_stbi_load));
    }

    public static void stbi_image_free(@NativeType("void *") ShortBuffer retval_from_stbi_load) {
        nstbi_image_free(MemoryUtil.memAddress(retval_from_stbi_load));
    }

    public static void stbi_image_free(@NativeType("void *") FloatBuffer retval_from_stbi_load) {
        nstbi_image_free(MemoryUtil.memAddress(retval_from_stbi_load));
    }

    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) comp, 1);
        }
        return nstbi_info(MemoryUtil.memAddress(filename), MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(comp)) != 0;
    }

    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) comp, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_info(filenameEncoded, MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(comp)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("int")
    public static boolean stbi_info_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) comp, 1);
        }
        return nstbi_info_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining(), MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(comp)) != 0;
    }

    @NativeType("int")
    public static boolean stbi_info_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x, 1);
            Checks.check((Buffer) y, 1);
            Checks.check((Buffer) comp, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_info_from_callbacks(clbk.address(), user, MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(comp)) != 0;
    }

    @NativeType("int")
    public static boolean stbi_is_16_bit(@NativeType("char const *") ByteBuffer filename) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
        }
        return nstbi_is_16_bit(MemoryUtil.memAddress(filename)) != 0;
    }

    @NativeType("int")
    public static boolean stbi_is_16_bit(@NativeType("char const *") CharSequence filename) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_is_16_bit(filenameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("int")
    public static boolean stbi_is_16_bit_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer) {
        return nstbi_is_16_bit_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining()) != 0;
    }

    @NativeType("int")
    public static boolean stbi_is_16_bit_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user) {
        if (Checks.CHECKS) {
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_is_16_bit_from_callbacks(clbk.address(), user) != 0;
    }

    public static void stbi_set_unpremultiply_on_load(@NativeType("int") boolean flag_true_if_should_unpremultiply) {
        nstbi_set_unpremultiply_on_load(flag_true_if_should_unpremultiply ? 1 : 0);
    }

    public static void stbi_convert_iphone_png_to_rgb(@NativeType("int") boolean flag_true_if_should_convert) {
        nstbi_convert_iphone_png_to_rgb(flag_true_if_should_convert ? 1 : 0);
    }

    public static void stbi_set_flip_vertically_on_load(@NativeType("int") boolean flag_true_if_should_flip) {
        nstbi_set_flip_vertically_on_load(flag_true_if_should_flip ? 1 : 0);
    }

    public static void stbi_set_unpremultiply_on_load_thread(@NativeType("int") boolean flag_true_if_should_unpremultiply) {
        nstbi_set_unpremultiply_on_load_thread(flag_true_if_should_unpremultiply ? 1 : 0);
    }

    public static void stbi_convert_iphone_png_to_rgb_thread(@NativeType("int") boolean flag_true_if_should_convert) {
        nstbi_convert_iphone_png_to_rgb_thread(flag_true_if_should_convert ? 1 : 0);
    }

    @NativeType("char *")
    public static ByteBuffer stbi_zlib_decode_malloc_guesssize(@NativeType("char const *") ByteBuffer buffer, int initial_size) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_malloc_guesssize(MemoryUtil.memAddress(buffer), buffer.remaining(), initial_size, MemoryUtil.memAddress(outlen));
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, outlen.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char *")
    public static ByteBuffer stbi_zlib_decode_malloc_guesssize_headerflag(@NativeType("char const *") ByteBuffer buffer, int initial_size, @NativeType("int") boolean parse_header) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_malloc_guesssize_headerflag(MemoryUtil.memAddress(buffer), buffer.remaining(), initial_size, MemoryUtil.memAddress(outlen), parse_header ? 1 : 0);
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, outlen.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char *")
    public static ByteBuffer stbi_zlib_decode_malloc(@NativeType("char const *") ByteBuffer buffer) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_malloc(MemoryUtil.memAddress(buffer), buffer.remaining(), MemoryUtil.memAddress(outlen));
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, outlen.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int stbi_zlib_decode_buffer(@NativeType("char *") ByteBuffer obuffer, @NativeType("char const *") ByteBuffer ibuffer) {
        return nstbi_zlib_decode_buffer(MemoryUtil.memAddress(obuffer), obuffer.remaining(), MemoryUtil.memAddress(ibuffer), ibuffer.remaining());
    }

    @NativeType("char *")
    public static ByteBuffer stbi_zlib_decode_noheader_malloc(@NativeType("char const *") ByteBuffer buffer) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_noheader_malloc(MemoryUtil.memAddress(buffer), buffer.remaining(), MemoryUtil.memAddress(outlen));
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, outlen.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int stbi_zlib_decode_noheader_buffer(@NativeType("char *") ByteBuffer obuffer, @NativeType("char const *") ByteBuffer ibuffer) {
        return nstbi_zlib_decode_noheader_buffer(MemoryUtil.memAddress(obuffer), obuffer.remaining(), MemoryUtil.memAddress(ibuffer), ibuffer.remaining());
    }

    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
        }
        long __result = nstbi_load(MemoryUtil.memAddress(filename), x, y, channels_in_file, desired_channels);
        return MemoryUtil.memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load(filenameEncoded, x, y, channels_in_file, desired_channels);
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
        }
        long __result = nstbi_load_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining(), x, y, channels_in_file, desired_channels);
        return MemoryUtil.memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_from_callbacks(clbk.address(), user, x, y, channels_in_file, desired_channels);
        return MemoryUtil.memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    @NativeType("stbi_uc *")
    public static ByteBuffer stbi_load_gif_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int **") PointerBuffer delays, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] z, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) delays, 1);
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(z, 1);
            Checks.check(channels_in_file, 1);
        }
        long __result = nstbi_load_gif_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining(), MemoryUtil.memAddress(delays), x, y, z, channels_in_file, desired_channels);
        return MemoryUtil.memByteBufferSafe(__result, x[0] * y[0] * z[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
        }
        long __result = nstbi_load_16(MemoryUtil.memAddress(filename), x, y, channels_in_file, desired_channels);
        return MemoryUtil.memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load_16(filenameEncoded, x, y, channels_in_file, desired_channels);
            ShortBuffer shortBufferMemShortBufferSafe = MemoryUtil.memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
            stack.setPointer(stackPointer);
            return shortBufferMemShortBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
        }
        long __result = nstbi_load_16_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining(), x, y, channels_in_file, desired_channels);
        return MemoryUtil.memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    @NativeType("stbi_us *")
    public static ShortBuffer stbi_load_16_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_16_from_callbacks(clbk.address(), user, x, y, channels_in_file, desired_channels);
        return MemoryUtil.memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    @NativeType("float *")
    public static FloatBuffer stbi_loadf(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
        }
        long __result = nstbi_loadf(MemoryUtil.memAddress(filename), x, y, channels_in_file, desired_channels);
        return MemoryUtil.memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    @NativeType("float *")
    public static FloatBuffer stbi_loadf(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_loadf(filenameEncoded, x, y, channels_in_file, desired_channels);
            FloatBuffer floatBufferMemFloatBufferSafe = MemoryUtil.memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
            stack.setPointer(stackPointer);
            return floatBufferMemFloatBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("float *")
    public static FloatBuffer stbi_loadf_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
        }
        long __result = nstbi_loadf_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining(), x, y, channels_in_file, desired_channels);
        return MemoryUtil.memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    @NativeType("float *")
    public static FloatBuffer stbi_loadf_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_loadf_from_callbacks(clbk.address(), user, x, y, channels_in_file, desired_channels);
        return MemoryUtil.memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(comp, 1);
        }
        return nstbi_info(MemoryUtil.memAddress(filename), x, y, comp) != 0;
    }

    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(comp, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_info(filenameEncoded, x, y, comp) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("int")
    public static boolean stbi_info_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(comp, 1);
        }
        return nstbi_info_from_memory(MemoryUtil.memAddress(buffer), buffer.remaining(), x, y, comp) != 0;
    }

    @NativeType("int")
    public static boolean stbi_info_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(comp, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_info_from_callbacks(clbk.address(), user, x, y, comp) != 0;
    }
}
