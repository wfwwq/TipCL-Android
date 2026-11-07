package org.lwjgl.stb;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBImageResize.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBImageResize.class */
public class STBImageResize {
    public static final int STBIR_1CHANNEL = 1;
    public static final int STBIR_2CHANNEL = 2;
    public static final int STBIR_RGB = 3;
    public static final int STBIR_BGR = 0;
    public static final int STBIR_4CHANNEL = 5;
    public static final int STBIR_RGBA = 4;
    public static final int STBIR_BGRA = 6;
    public static final int STBIR_ARGB = 7;
    public static final int STBIR_ABGR = 8;
    public static final int STBIR_RA = 9;
    public static final int STBIR_AR = 10;
    public static final int STBIR_RGBA_PM = 11;
    public static final int STBIR_BGRA_PM = 12;
    public static final int STBIR_ARGB_PM = 13;
    public static final int STBIR_ABGR_PM = 14;
    public static final int STBIR_RA_PM = 15;
    public static final int STBIR_AR_PM = 16;
    public static final int STBIR_RGBA_NO_AW = 11;
    public static final int STBIR_BGRA_NO_AW = 12;
    public static final int STBIR_ARGB_NO_AW = 13;
    public static final int STBIR_ABGR_NO_AW = 14;
    public static final int STBIR_RA_NO_AW = 15;
    public static final int STBIR_AR_NO_AW = 16;
    public static final int STBIR_EDGE_CLAMP = 0;
    public static final int STBIR_EDGE_REFLECT = 1;
    public static final int STBIR_EDGE_WRAP = 2;
    public static final int STBIR_EDGE_ZERO = 3;
    public static final int STBIR_FILTER_DEFAULT = 0;
    public static final int STBIR_FILTER_BOX = 1;
    public static final int STBIR_FILTER_TRIANGLE = 2;
    public static final int STBIR_FILTER_CUBICBSPLINE = 3;
    public static final int STBIR_FILTER_CATMULLROM = 4;
    public static final int STBIR_FILTER_MITCHELL = 5;
    public static final int STBIR_FILTER_POINT_SAMPLE = 6;
    public static final int STBIR_FILTER_OTHER = 7;
    public static final int STBIR_TYPE_UINT8 = 0;
    public static final int STBIR_TYPE_UINT8_SRGB = 1;
    public static final int STBIR_TYPE_UINT8_SRGB_ALPHA = 2;
    public static final int STBIR_TYPE_UINT16 = 3;
    public static final int STBIR_TYPE_FLOAT = 4;
    public static final int STBIR_TYPE_HALF_FLOAT = 5;
    private static final int[] stbir_pixel_layout_channels;
    private static final int[] stbir_type_size;

    public static native long nstbir_resize_uint8_srgb(long j, int i, int i2, int i3, long j2, int i4, int i5, int i6, int i7);

    public static native long nstbir_resize_uint8_linear(long j, int i, int i2, int i3, long j2, int i4, int i5, int i6, int i7);

    public static native long nstbir_resize_float_linear(long j, int i, int i2, int i3, long j2, int i4, int i5, int i6, int i7);

    public static native long nstbir_resize(long j, int i, int i2, int i3, long j2, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public static native void nstbir_resize_init(long j, long j2, int i, int i2, int i3, long j3, int i4, int i5, int i6, int i7, int i8);

    public static native void nstbir_set_datatypes(long j, int i, int i2);

    public static native void nstbir_set_pixel_callbacks(long j, long j2, long j3);

    public static native void nstbir_set_user_data(long j, long j2);

    public static native void nstbir_set_buffer_ptrs(long j, long j2, int i, long j3, int i2);

    public static native int nstbir_set_pixel_layouts(long j, int i, int i2);

    public static native int nstbir_set_edgemodes(long j, int i, int i2);

    public static native int nstbir_set_filters(long j, int i, int i2);

    public static native int nstbir_set_filter_callbacks(long j, long j2, long j3, long j4, long j5);

    public static native int nstbir_set_pixel_subrect(long j, int i, int i2, int i3, int i4);

    public static native int nstbir_set_input_subrect(long j, double d, double d2, double d3, double d4);

    public static native int nstbir_set_output_pixel_subrect(long j, int i, int i2, int i3, int i4);

    public static native int nstbir_set_non_pm_alpha_speed_over_quality(long j, int i);

    public static native int nstbir_build_samplers(long j);

    public static native void nstbir_free_samplers(long j);

    public static native int nstbir_resize_extended(long j);

    public static native int nstbir_build_samplers_with_splits(long j, int i);

    public static native int nstbir_resize_extended_split(long j, int i, int i2);

    static {
        LibSTB.initialize();
        stbir_pixel_layout_channels = new int[]{3, 1, 2, 3, 4, 4, 4, 4, 4, 2, 2, 4, 4, 4, 4, 2, 2};
        stbir_type_size = new int[]{1, 1, 1, 2, 4, 2};
    }

    protected STBImageResize() {
        throw new UnsupportedOperationException();
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbir_resize_uint8_srgb(@NativeType("unsigned char const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("unsigned char *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_pixel_layout") int pixel_type) {
        int length = calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_type, 1);
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) output_pixels, length);
        }
        long __result = nstbir_resize_uint8_srgb(MemoryUtil.memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, MemoryUtil.memAddressSafe(output_pixels), output_w, output_h, output_stride_in_bytes, pixel_type);
        return MemoryUtil.memByteBufferSafe(__result, length);
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbir_resize_uint8_srgb(@NativeType("unsigned char const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("unsigned char *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_pixel_layout") int pixel_type, long length) {
        if (Checks.CHECKS) {
            Checks.checkSafe(output_pixels, length);
        }
        long __result = nstbir_resize_uint8_srgb(MemoryUtil.memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, MemoryUtil.memAddressSafe(output_pixels), output_w, output_h, output_stride_in_bytes, pixel_type);
        return MemoryUtil.memByteBufferSafe(__result, (int) length);
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbir_resize_uint8_linear(@NativeType("unsigned char const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("unsigned char *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_pixel_layout") int pixel_type) {
        int length = calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_type, 1);
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) output_pixels, length);
        }
        long __result = nstbir_resize_uint8_linear(MemoryUtil.memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, MemoryUtil.memAddressSafe(output_pixels), output_w, output_h, output_stride_in_bytes, pixel_type);
        return MemoryUtil.memByteBufferSafe(__result, length);
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbir_resize_uint8_linear(@NativeType("unsigned char const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("unsigned char *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_pixel_layout") int pixel_type, long length) {
        if (Checks.CHECKS) {
            Checks.checkSafe(output_pixels, length);
        }
        long __result = nstbir_resize_uint8_linear(MemoryUtil.memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, MemoryUtil.memAddressSafe(output_pixels), output_w, output_h, output_stride_in_bytes, pixel_type);
        return MemoryUtil.memByteBufferSafe(__result, (int) length);
    }

    @NativeType("float *")
    public static FloatBuffer stbir_resize_float_linear(@NativeType("float const *") FloatBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("float *") FloatBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_pixel_layout") int pixel_type) {
        int length = calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_type, 4);
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) output_pixels, length);
        }
        long __result = nstbir_resize_float_linear(MemoryUtil.memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, MemoryUtil.memAddressSafe(output_pixels), output_w, output_h, output_stride_in_bytes, pixel_type);
        return MemoryUtil.memFloatBufferSafe(__result, length);
    }

    @NativeType("float *")
    public static FloatBuffer stbir_resize_float_linear(@NativeType("float const *") FloatBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("float *") FloatBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_pixel_layout") int pixel_type, long length) {
        if (Checks.CHECKS) {
            Checks.checkSafe(output_pixels, length);
        }
        long __result = nstbir_resize_float_linear(MemoryUtil.memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, MemoryUtil.memAddressSafe(output_pixels), output_w, output_h, output_stride_in_bytes, pixel_type);
        return MemoryUtil.memFloatBufferSafe(__result, (int) length);
    }

    @NativeType("void *")
    public static ByteBuffer stbir_resize(@NativeType("void const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("void *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_pixel_layout") int pixel_layout, @NativeType("stbir_datatype") int data_type, @NativeType("stbir_edge") int edge, @NativeType("stbir_filter") int filter) {
        int length = calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_layout, stbir_type_size[data_type]);
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) output_pixels, length);
        }
        long __result = nstbir_resize(MemoryUtil.memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, MemoryUtil.memAddressSafe(output_pixels), output_w, output_h, output_stride_in_bytes, pixel_layout, data_type, edge, filter);
        return MemoryUtil.memByteBufferSafe(__result, length);
    }

    @NativeType("void *")
    public static ByteBuffer stbir_resize(@NativeType("void const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("void *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_pixel_layout") int pixel_layout, @NativeType("stbir_datatype") int data_type, @NativeType("stbir_edge") int edge, @NativeType("stbir_filter") int filter, long length) {
        if (Checks.CHECKS) {
            Checks.checkSafe(output_pixels, length);
        }
        long __result = nstbir_resize(MemoryUtil.memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, MemoryUtil.memAddressSafe(output_pixels), output_w, output_h, output_stride_in_bytes, pixel_layout, data_type, edge, filter);
        return MemoryUtil.memByteBufferSafe(__result, (int) length);
    }

    public static void stbir_resize_init(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, @NativeType("void const *") ByteBuffer input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NativeType("void *") ByteBuffer output_pixels, int output_w, int output_h, int output_stride_in_bytes, @NativeType("stbir_pixel_layout") int pixel_layout, @NativeType("stbir_datatype") int data_type) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) output_pixels, calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_layout, stbir_type_size[data_type]));
        }
        nstbir_resize_init(resize.address(), MemoryUtil.memAddress(input_pixels), input_w, input_h, input_stride_in_bytes, MemoryUtil.memAddressSafe(output_pixels), output_w, output_h, output_stride_in_bytes, pixel_layout, data_type);
    }

    public static void stbir_set_datatypes(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, @NativeType("stbir_datatype") int input_type, @NativeType("stbir_datatype") int output_type) {
        nstbir_set_datatypes(resize.address(), input_type, output_type);
    }

    public static void stbir_set_pixel_callbacks(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, @NativeType("stbir_input_callback *") STBIRInputCallbackI input_cb, @NativeType("stbir_output_callback *") STBIROutputCallbackI output_cb) {
        nstbir_set_pixel_callbacks(resize.address(), MemoryUtil.memAddressSafe(input_cb), MemoryUtil.memAddressSafe(output_cb));
    }

    public static void stbir_set_user_data(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, @NativeType("void *") long user_data) {
        nstbir_set_user_data(resize.address(), user_data);
    }

    public static void stbir_set_buffer_ptrs(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, @NativeType("void const *") ByteBuffer input_pixels, int input_stride_in_bytes, @NativeType("void *") ByteBuffer output_pixels, int output_stride_in_bytes) {
        nstbir_set_buffer_ptrs(resize.address(), MemoryUtil.memAddress(input_pixels), input_stride_in_bytes, MemoryUtil.memAddressSafe(output_pixels), output_stride_in_bytes);
    }

    public static int stbir_set_pixel_layouts(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, @NativeType("stbir_pixel_layout") int input_pixel_layout, @NativeType("stbir_pixel_layout") int output_pixel_layout) {
        return nstbir_set_pixel_layouts(resize.address(), input_pixel_layout, output_pixel_layout);
    }

    public static int stbir_set_edgemodes(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, @NativeType("stbir_edge") int horizontal_edge, @NativeType("stbir_edge") int vertical_edge) {
        return nstbir_set_edgemodes(resize.address(), horizontal_edge, vertical_edge);
    }

    public static int stbir_set_filters(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, @NativeType("stbir_filter") int horizontal_filter, @NativeType("stbir_filter") int vertical_filter) {
        return nstbir_set_filters(resize.address(), horizontal_filter, vertical_filter);
    }

    public static int stbir_set_filter_callbacks(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, @NativeType("stbir__kernel_callback *") STBIRKernelCallbackI horizontal_filter, @NativeType("stbir__support_callback *") STBIRSupportCallbackI horizontal_support, @NativeType("stbir__kernel_callback *") STBIRKernelCallbackI vertical_filter, @NativeType("stbir__support_callback *") STBIRSupportCallbackI vertical_support) {
        return nstbir_set_filter_callbacks(resize.address(), MemoryUtil.memAddressSafe(horizontal_filter), MemoryUtil.memAddressSafe(horizontal_support), MemoryUtil.memAddressSafe(vertical_filter), MemoryUtil.memAddressSafe(vertical_support));
    }

    public static int stbir_set_pixel_subrect(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, int subx, int suby, int subw, int subh) {
        return nstbir_set_pixel_subrect(resize.address(), subx, suby, subw, subh);
    }

    public static int stbir_set_input_subrect(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, double s0, double t0, double s1, double t1) {
        return nstbir_set_input_subrect(resize.address(), s0, t0, s1, t1);
    }

    public static int stbir_set_output_pixel_subrect(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, int subx, int suby, int subw, int subh) {
        return nstbir_set_output_pixel_subrect(resize.address(), subx, suby, subw, subh);
    }

    public static int stbir_set_non_pm_alpha_speed_over_quality(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, @NativeType("int") boolean non_pma_alpha_speed_over_quality) {
        return nstbir_set_non_pm_alpha_speed_over_quality(resize.address(), non_pma_alpha_speed_over_quality ? 1 : 0);
    }

    public static int stbir_build_samplers(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize) {
        return nstbir_build_samplers(resize.address());
    }

    public static void stbir_free_samplers(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize) {
        nstbir_free_samplers(resize.address());
    }

    public static int stbir_resize_extended(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize) {
        return nstbir_resize_extended(resize.address());
    }

    public static int stbir_build_samplers_with_splits(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, int try_splits) {
        return nstbir_build_samplers_with_splits(resize.address(), try_splits);
    }

    public static int stbir_resize_extended_split(@NativeType("STBIR_RESIZE *") STBIR_RESIZE resize, int split_start, int split_count) {
        return nstbir_resize_extended_split(resize.address(), split_start, split_count);
    }

    private static int calculateBufferSize(int width, int height, int stride_in_bytes, int pixel_type, int type_size) {
        return height * (stride_in_bytes == 0 ? width * stbir_pixel_layout_channels[pixel_type] * type_size : stride_in_bytes);
    }
}
