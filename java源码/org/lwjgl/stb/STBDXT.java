package org.lwjgl.stb;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBDXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBDXT.class */
public class STBDXT {
    public static final int STB_DXT_NORMAL = 0;
    public static final int STB_DXT_DITHER = 1;
    public static final int STB_DXT_HIGHQUAL = 2;

    public static native void nstb_compress_dxt_block(long j, long j2, int i, int i2);

    public static native void nstb_compress_bc4_block(long j, long j2);

    public static native void nstb_compress_bc5_block(long j, long j2);

    static {
        LibSTB.initialize();
    }

    protected STBDXT() {
        throw new UnsupportedOperationException();
    }

    public static void stb_compress_dxt_block(@NativeType("unsigned char *") ByteBuffer dest, @NativeType("unsigned char const *") ByteBuffer src_rgba_four_bytes_per_pixel, @NativeType("int") boolean alpha, int mode) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, alpha ? 16 : 8);
            Checks.check((Buffer) src_rgba_four_bytes_per_pixel, 64);
        }
        nstb_compress_dxt_block(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src_rgba_four_bytes_per_pixel), alpha ? 1 : 0, mode);
    }

    public static void stb_compress_bc4_block(@NativeType("unsigned char *") ByteBuffer dest, @NativeType("unsigned char const *") ByteBuffer src_r_one_byte_per_pixel) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, 8);
            Checks.check((Buffer) src_r_one_byte_per_pixel, 16);
        }
        nstb_compress_bc4_block(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src_r_one_byte_per_pixel));
    }

    public static void stb_compress_bc5_block(@NativeType("unsigned char *") ByteBuffer dest, @NativeType("unsigned char const *") ByteBuffer src_rg_two_byte_per_pixel) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dest, 16);
            Checks.check((Buffer) src_rg_two_byte_per_pixel, 32);
        }
        nstb_compress_bc5_block(MemoryUtil.memAddress(dest), MemoryUtil.memAddress(src_rg_two_byte_per_pixel));
    }
}
