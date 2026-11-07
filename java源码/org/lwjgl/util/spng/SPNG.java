package org.lwjgl.util.spng;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.util.spng.spng_unknown_chunk;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/SPNG.class */
public class SPNG {
    public static final int SPNG_VERSION_MAJOR = 0;
    public static final int SPNG_VERSION_MINOR = 7;
    public static final int SPNG_VERSION_PATCH = 4;
    public static final int SPNG_IO_ERROR = -2;
    public static final int SPNG_IO_EOF = -1;
    public static final int SPNG_OK = 0;
    public static final int SPNG_EINVAL = 1;
    public static final int SPNG_EMEM = 2;
    public static final int SPNG_EOVERFLOW = 3;
    public static final int SPNG_ESIGNATURE = 4;
    public static final int SPNG_EWIDTH = 5;
    public static final int SPNG_EHEIGHT = 6;
    public static final int SPNG_EUSER_WIDTH = 7;
    public static final int SPNG_EUSER_HEIGHT = 8;
    public static final int SPNG_EBIT_DEPTH = 9;
    public static final int SPNG_ECOLOR_TYPE = 10;
    public static final int SPNG_ECOMPRESSION_METHOD = 11;
    public static final int SPNG_EFILTER_METHOD = 12;
    public static final int SPNG_EINTERLACE_METHOD = 13;
    public static final int SPNG_EIHDR_SIZE = 14;
    public static final int SPNG_ENOIHDR = 15;
    public static final int SPNG_ECHUNK_POS = 16;
    public static final int SPNG_ECHUNK_SIZE = 17;
    public static final int SPNG_ECHUNK_CRC = 18;
    public static final int SPNG_ECHUNK_TYPE = 19;
    public static final int SPNG_ECHUNK_UNKNOWN_CRITICAL = 20;
    public static final int SPNG_EDUP_PLTE = 21;
    public static final int SPNG_EDUP_CHRM = 22;
    public static final int SPNG_EDUP_GAMA = 23;
    public static final int SPNG_EDUP_ICCP = 24;
    public static final int SPNG_EDUP_SBIT = 25;
    public static final int SPNG_EDUP_SRGB = 26;
    public static final int SPNG_EDUP_BKGD = 27;
    public static final int SPNG_EDUP_HIST = 28;
    public static final int SPNG_EDUP_TRNS = 29;
    public static final int SPNG_EDUP_PHYS = 30;
    public static final int SPNG_EDUP_TIME = 31;
    public static final int SPNG_EDUP_OFFS = 32;
    public static final int SPNG_EDUP_EXIF = 33;
    public static final int SPNG_ECHRM = 34;
    public static final int SPNG_EPLTE_IDX = 35;
    public static final int SPNG_ETRNS_COLOR_TYPE = 36;
    public static final int SPNG_ETRNS_NO_PLTE = 37;
    public static final int SPNG_EGAMA = 38;
    public static final int SPNG_EICCP_NAME = 39;
    public static final int SPNG_EICCP_COMPRESSION_METHOD = 40;
    public static final int SPNG_ESBIT = 41;
    public static final int SPNG_ESRGB = 42;
    public static final int SPNG_ETEXT = 43;
    public static final int SPNG_ETEXT_KEYWORD = 44;
    public static final int SPNG_EZTXT = 45;
    public static final int SPNG_EZTXT_COMPRESSION_METHOD = 46;
    public static final int SPNG_EITXT = 47;
    public static final int SPNG_EITXT_COMPRESSION_FLAG = 48;
    public static final int SPNG_EITXT_COMPRESSION_METHOD = 49;
    public static final int SPNG_EITXT_LANG_TAG = 50;
    public static final int SPNG_EITXT_TRANSLATED_KEY = 51;
    public static final int SPNG_EBKGD_NO_PLTE = 52;
    public static final int SPNG_EBKGD_PLTE_IDX = 53;
    public static final int SPNG_EHIST_NO_PLTE = 54;
    public static final int SPNG_EPHYS = 55;
    public static final int SPNG_ESPLT_NAME = 56;
    public static final int SPNG_ESPLT_DUP_NAME = 57;
    public static final int SPNG_ESPLT_DEPTH = 58;
    public static final int SPNG_ETIME = 59;
    public static final int SPNG_EOFFS = 60;
    public static final int SPNG_EEXIF = 61;
    public static final int SPNG_EIDAT_TOO_SHORT = 62;
    public static final int SPNG_EIDAT_STREAM = 63;
    public static final int SPNG_EZLIB = 64;
    public static final int SPNG_EFILTER = 65;
    public static final int SPNG_EBUFSIZ = 66;
    public static final int SPNG_EIO = 67;
    public static final int SPNG_EOF = 68;
    public static final int SPNG_EBUF_SET = 69;
    public static final int SPNG_EBADSTATE = 70;
    public static final int SPNG_EFMT = 71;
    public static final int SPNG_EFLAGS = 72;
    public static final int SPNG_ECHUNKAVAIL = 73;
    public static final int SPNG_ENCODE_ONLY = 74;
    public static final int SPNG_EOI = 75;
    public static final int SPNG_ENOPLTE = 76;
    public static final int SPNG_ECHUNK_LIMITS = 77;
    public static final int SPNG_EZLIB_INIT = 78;
    public static final int SPNG_ECHUNK_STDLEN = 79;
    public static final int SPNG_EINTERNAL = 80;
    public static final int SPNG_ECTXTYPE = 81;
    public static final int SPNG_ENOSRC = 82;
    public static final int SPNG_ENODST = 83;
    public static final int SPNG_EOPSTATE = 84;
    public static final int SPNG_ENOTFINAL = 85;
    public static final int SPNG_TEXT = 1;
    public static final int SPNG_ZTXT = 2;
    public static final int SPNG_ITXT = 3;
    public static final byte SPNG_COLOR_TYPE_GRAYSCALE = 0;
    public static final byte SPNG_COLOR_TYPE_TRUECOLOR = 2;
    public static final byte SPNG_COLOR_TYPE_INDEXED = 3;
    public static final byte SPNG_COLOR_TYPE_GRAYSCALE_ALPHA = 4;
    public static final byte SPNG_COLOR_TYPE_TRUECOLOR_ALPHA = 6;
    public static final byte SPNG_FILTER_NONE = 0;
    public static final byte SPNG_FILTER_SUB = 1;
    public static final byte SPNG_FILTER_UP = 2;
    public static final byte SPNG_FILTER_AVERAGE = 3;
    public static final byte SPNG_FILTER_PAETH = 4;
    public static final int SPNG_DISABLE_FILTERING = 0;
    public static final int SPNG_FILTER_CHOICE_NONE = 8;
    public static final int SPNG_FILTER_CHOICE_SUB = 16;
    public static final int SPNG_FILTER_CHOICE_UP = 32;
    public static final int SPNG_FILTER_CHOICE_AVG = 64;
    public static final int SPNG_FILTER_CHOICE_PAETH = 128;
    public static final int SPNG_FILTER_CHOICE_ALL = 248;
    public static final byte SPNG_INTERLACE_NONE = 0;
    public static final byte SPNG_INTERLACE_ADAM7 = 1;
    public static final int SPNG_FMT_RGBA8 = 1;
    public static final int SPNG_FMT_RGBA16 = 2;
    public static final int SPNG_FMT_RGB8 = 4;
    public static final int SPNG_FMT_GA8 = 16;
    public static final int SPNG_FMT_GA16 = 32;
    public static final int SPNG_FMT_G8 = 64;
    public static final int SPNG_FMT_PNG = 256;
    public static final int SPNG_FMT_RAW = 512;
    public static final int SPNG_CTX_IGNORE_ADLER32 = 1;
    public static final int SPNG_CTX_ENCODER = 2;
    public static final int SPNG_DECODE_USE_TRNS = 1;
    public static final int SPNG_DECODE_USE_GAMA = 2;
    public static final int SPNG_DECODE_USE_SBIT = 8;
    public static final int SPNG_DECODE_TRNS = 1;
    public static final int SPNG_DECODE_GAMMA = 2;
    public static final int SPNG_DECODE_PROGRESSIVE = 256;
    public static final int SPNG_CRC_ERROR = 0;
    public static final int SPNG_CRC_DISCARD = 1;
    public static final int SPNG_CRC_USE = 2;
    public static final int SPNG_ENCODE_PROGRESSIVE = 1;
    public static final int SPNG_ENCODE_FINALIZE = 2;
    public static final int SPNG_AFTER_IHDR = 1;
    public static final int SPNG_AFTER_PLTE = 2;
    public static final int SPNG_AFTER_IDAT = 8;
    public static final int SPNG_KEEP_UNKNOWN_CHUNKS = 1;
    public static final int SPNG_IMG_COMPRESSION_LEVEL = 2;
    public static final int SPNG_IMG_WINDOW_BITS = 3;
    public static final int SPNG_IMG_MEM_LEVEL = 4;
    public static final int SPNG_IMG_COMPRESSION_STRATEGY = 5;
    public static final int SPNG_TEXT_COMPRESSION_LEVEL = 6;
    public static final int SPNG_TEXT_WINDOW_BITS = 7;
    public static final int SPNG_TEXT_MEM_LEVEL = 8;
    public static final int SPNG_TEXT_COMPRESSION_STRATEGY = 9;
    public static final int SPNG_FILTER_CHOICE = 10;
    public static final int SPNG_CHUNK_COUNT_LIMIT = 11;
    public static final int SPNG_ENCODE_TO_BUFFER = 12;

    @NativeType("spng_ctx *")
    public static native long spng_ctx_new(int i);

    public static native long nspng_ctx_new2(long j, int i);

    public static native void nspng_ctx_free(long j);

    public static native int nspng_set_png_buffer(long j, long j2, long j3);

    public static native int nspng_set_png_stream(long j, long j2, long j3);

    public static native long nspng_get_png_buffer(long j, long j2, long j3);

    public static native int nspng_set_image_limits(long j, int i, int i2);

    public static native int nspng_get_image_limits(long j, long j2, long j3);

    public static native int nspng_set_chunk_limits(long j, long j2, long j3);

    public static native int nspng_get_chunk_limits(long j, long j2, long j3);

    public static native int nspng_set_crc_action(long j, int i, int i2);

    public static native int nspng_set_option(long j, int i, int i2);

    public static native int nspng_get_option(long j, int i, long j2);

    public static native int nspng_decoded_image_size(long j, int i, long j2);

    public static native int nspng_decode_image(long j, long j2, long j3, int i, int i2);

    public static native int nspng_decode_scanline(long j, long j2, long j3);

    public static native int nspng_decode_row(long j, long j2, long j3);

    public static native int nspng_decode_chunks(long j);

    public static native int nspng_get_row_info(long j, long j2);

    public static native int nspng_encode_image(long j, long j2, long j3, int i, int i2);

    public static native int nspng_encode_scanline(long j, long j2, long j3);

    public static native int nspng_encode_row(long j, long j2, long j3);

    public static native int nspng_encode_chunks(long j);

    public static native int nspng_get_ihdr(long j, long j2);

    public static native int nspng_get_plte(long j, long j2);

    public static native int nspng_get_trns(long j, long j2);

    public static native int nspng_get_chrm(long j, long j2);

    public static native int nspng_get_chrm_int(long j, long j2);

    public static native int nspng_get_gama(long j, long j2);

    public static native int nspng_get_gama_int(long j, long j2);

    public static native int nspng_get_iccp(long j, long j2);

    public static native int nspng_get_sbit(long j, long j2);

    public static native int nspng_get_srgb(long j, long j2);

    public static native int nspng_get_text(long j, long j2, long j3);

    public static native int nspng_get_bkgd(long j, long j2);

    public static native int nspng_get_hist(long j, long j2);

    public static native int nspng_get_phys(long j, long j2);

    public static native int nspng_get_splt(long j, long j2, long j3);

    public static native int nspng_get_time(long j, long j2);

    public static native int nspng_get_unknown_chunks(long j, long j2, long j3);

    public static native int nspng_get_offs(long j, long j2);

    public static native int nspng_get_exif(long j, long j2);

    public static native int nspng_set_ihdr(long j, long j2);

    public static native int nspng_set_plte(long j, long j2);

    public static native int nspng_set_trns(long j, long j2);

    public static native int nspng_set_chrm(long j, long j2);

    public static native int nspng_set_chrm_int(long j, long j2);

    public static native int nspng_set_gama(long j, double d);

    public static native int nspng_set_gama_int(long j, int i);

    public static native int nspng_set_iccp(long j, long j2);

    public static native int nspng_set_sbit(long j, long j2);

    public static native int nspng_set_srgb(long j, byte b);

    public static native int nspng_set_text(long j, long j2, int i);

    public static native int nspng_set_bkgd(long j, long j2);

    public static native int nspng_set_hist(long j, long j2);

    public static native int nspng_set_phys(long j, long j2);

    public static native int nspng_set_splt(long j, long j2, int i);

    public static native int nspng_set_time(long j, long j2);

    public static native int nspng_set_unknown_chunks(long j, long j2, int i);

    public static native int nspng_set_offs(long j, long j2);

    public static native int nspng_set_exif(long j, long j2);

    public static native long nspng_strerror(int i);

    public static native long nspng_version_string();

    static {
        LibSPNG.initialize();
    }

    protected SPNG() {
        throw new UnsupportedOperationException();
    }

    @NativeType("spng_ctx *")
    public static long spng_ctx_new2(@NativeType("struct spng_alloc *") spng_alloc alloc, int flags) {
        return nspng_ctx_new2(alloc.address(), flags);
    }

    public static void spng_ctx_free(@NativeType("spng_ctx *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nspng_ctx_free(ctx);
    }

    public static int spng_set_png_buffer(@NativeType("spng_ctx *") long ctx, @NativeType("void const *") ByteBuffer buf) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_png_buffer(ctx, MemoryUtil.memAddress(buf), buf.remaining());
    }

    public static int spng_set_png_stream(@NativeType("spng_ctx *") long ctx, @NativeType("spng_rw_fn *") spng_rw_fnI rw_func, @NativeType("void *") long user) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_png_stream(ctx, rw_func.address(), user);
    }

    @NativeType("void *")
    public static ByteBuffer spng_get_png_buffer(@NativeType("spng_ctx *") long ctx, @NativeType("int *") IntBuffer error) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) error, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        PointerBuffer len = stack.callocPointer(1);
        try {
            long __result = nspng_get_png_buffer(ctx, MemoryUtil.memAddress(len), MemoryUtil.memAddress(error));
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, (int) len.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int spng_set_image_limits(@NativeType("spng_ctx *") long ctx, @NativeType("uint32_t") int width, @NativeType("uint32_t") int height) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_image_limits(ctx, width, height);
    }

    public static int spng_get_image_limits(@NativeType("spng_ctx *") long ctx, @NativeType("uint32_t *") IntBuffer width, @NativeType("uint32_t *") IntBuffer height) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) width, 1);
            Checks.check((Buffer) height, 1);
        }
        return nspng_get_image_limits(ctx, MemoryUtil.memAddress(width), MemoryUtil.memAddress(height));
    }

    public static int spng_set_chunk_limits(@NativeType("spng_ctx *") long ctx, @NativeType("size_t") long chunk_size, @NativeType("size_t") long cache_size) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_chunk_limits(ctx, chunk_size, cache_size);
    }

    public static int spng_get_chunk_limits(@NativeType("spng_ctx *") long ctx, @NativeType("size_t *") PointerBuffer chunk_size, @NativeType("size_t *") PointerBuffer cache_size) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((CustomBuffer<?>) chunk_size, 1);
            Checks.check((CustomBuffer<?>) cache_size, 1);
        }
        return nspng_get_chunk_limits(ctx, MemoryUtil.memAddress(chunk_size), MemoryUtil.memAddress(cache_size));
    }

    public static int spng_set_crc_action(@NativeType("spng_ctx *") long ctx, int critical, int ancillary) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_crc_action(ctx, critical, ancillary);
    }

    public static int spng_set_option(@NativeType("spng_ctx *") long ctx, @NativeType("enum spng_option") int option, int value) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_option(ctx, option, value);
    }

    public static int spng_get_option(@NativeType("spng_ctx *") long ctx, @NativeType("enum spng_option") int option, @NativeType("int *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) value, 1);
        }
        return nspng_get_option(ctx, option, MemoryUtil.memAddress(value));
    }

    public static int spng_decoded_image_size(@NativeType("spng_ctx *") long ctx, int fmt, @NativeType("size_t *") PointerBuffer len) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((CustomBuffer<?>) len, 1);
        }
        return nspng_decoded_image_size(ctx, fmt, MemoryUtil.memAddress(len));
    }

    public static int spng_decode_image(@NativeType("spng_ctx *") long ctx, @NativeType("void *") ByteBuffer out, int fmt, int flags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_decode_image(ctx, MemoryUtil.memAddress(out), out.remaining(), fmt, flags);
    }

    public static int spng_decode_scanline(@NativeType("spng_ctx *") long ctx, @NativeType("void *") ByteBuffer out) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_decode_scanline(ctx, MemoryUtil.memAddress(out), out.remaining());
    }

    public static int spng_decode_row(@NativeType("spng_ctx *") long ctx, @NativeType("void *") ByteBuffer out) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_decode_row(ctx, MemoryUtil.memAddress(out), out.remaining());
    }

    public static int spng_decode_chunks(@NativeType("spng_ctx *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_decode_chunks(ctx);
    }

    public static int spng_get_row_info(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_row_info *") spng_row_info row_info) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_row_info(ctx, row_info.address());
    }

    public static int spng_encode_image(@NativeType("spng_ctx *") long ctx, @NativeType("void const *") ByteBuffer img, int fmt, int flags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_encode_image(ctx, MemoryUtil.memAddress(img), img.remaining(), fmt, flags);
    }

    public static int spng_encode_scanline(@NativeType("spng_ctx *") long ctx, @NativeType("void const *") ByteBuffer scanline) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_encode_scanline(ctx, MemoryUtil.memAddress(scanline), scanline.remaining());
    }

    public static int spng_encode_row(@NativeType("spng_ctx *") long ctx, @NativeType("void const *") ByteBuffer row) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_encode_row(ctx, MemoryUtil.memAddress(row), row.remaining());
    }

    public static int spng_encode_chunks(@NativeType("spng_ctx *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_encode_chunks(ctx);
    }

    public static int spng_get_ihdr(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_ihdr *") spng_ihdr ihdr) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_ihdr(ctx, ihdr.address());
    }

    public static int spng_get_plte(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_plte *") spng_plte plte) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_plte(ctx, plte.address());
    }

    public static int spng_get_trns(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_trns *") spng_trns trns) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_trns(ctx, trns.address());
    }

    public static int spng_get_chrm(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_chrm *") spng_chrm chrm) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_chrm(ctx, chrm.address());
    }

    public static int spng_get_chrm_int(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_chrm_int *") spng_chrm_int chrm_int) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_chrm_int(ctx, chrm_int.address());
    }

    public static int spng_get_gama(@NativeType("spng_ctx *") long ctx, @NativeType("double *") DoubleBuffer gamma) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) gamma, 1);
        }
        return nspng_get_gama(ctx, MemoryUtil.memAddress(gamma));
    }

    public static int spng_get_gama_int(@NativeType("spng_ctx *") long ctx, @NativeType("uint32_t *") IntBuffer gama_int) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) gama_int, 1);
        }
        return nspng_get_gama_int(ctx, MemoryUtil.memAddress(gama_int));
    }

    public static int spng_get_iccp(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_iccp *") spng_iccp iccp) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_iccp(ctx, iccp.address());
    }

    public static int spng_get_sbit(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_sbit *") spng_sbit sbit) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_sbit(ctx, sbit.address());
    }

    public static int spng_get_srgb(@NativeType("spng_ctx *") long ctx, @NativeType("uint8_t *") ByteBuffer rendering_intent) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) rendering_intent, 1);
        }
        return nspng_get_srgb(ctx, MemoryUtil.memAddress(rendering_intent));
    }

    public static int spng_get_text(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_text *") spng_text text, @NativeType("uint32_t *") IntBuffer n_text) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) n_text, 1);
        }
        return nspng_get_text(ctx, text.address(), MemoryUtil.memAddress(n_text));
    }

    public static int spng_get_bkgd(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_bkgd *") spng_bkgd bkgd) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_bkgd(ctx, bkgd.address());
    }

    public static int spng_get_hist(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_hist *") spng_hist hist) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_hist(ctx, hist.address());
    }

    public static int spng_get_phys(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_phys *") spng_phys phys) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_phys(ctx, phys.address());
    }

    public static int spng_get_splt(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_splt *") spng_splt splt, @NativeType("uint32_t *") IntBuffer n_splt) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) n_splt, 1);
        }
        return nspng_get_splt(ctx, splt.address(), MemoryUtil.memAddress(n_splt));
    }

    public static int spng_get_time(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_time *") spng_time time) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_time(ctx, time.address());
    }

    public static int spng_get_unknown_chunks(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_unknown_chunk *") spng_unknown_chunk chunks, @NativeType("uint32_t *") IntBuffer n_chunks) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) n_chunks, 1);
        }
        return nspng_get_unknown_chunks(ctx, chunks.address(), MemoryUtil.memAddress(n_chunks));
    }

    public static int spng_get_offs(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_offs *") spng_offs offs) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_offs(ctx, offs.address());
    }

    public static int spng_get_exif(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_exif *") spng_exif exif) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_get_exif(ctx, exif.address());
    }

    public static int spng_set_ihdr(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_ihdr *") spng_ihdr ihdr) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_ihdr(ctx, ihdr.address());
    }

    public static int spng_set_plte(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_plte *") spng_plte plte) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_plte(ctx, plte.address());
    }

    public static int spng_set_trns(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_trns *") spng_trns trns) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_trns(ctx, trns.address());
    }

    public static int spng_set_chrm(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_chrm *") spng_chrm chrm) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_chrm(ctx, chrm.address());
    }

    public static int spng_set_chrm_int(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_chrm_int *") spng_chrm_int chrm_int) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_chrm_int(ctx, chrm_int.address());
    }

    public static int spng_set_gama(@NativeType("spng_ctx *") long ctx, double gamma) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_gama(ctx, gamma);
    }

    public static int spng_set_gama_int(@NativeType("spng_ctx *") long ctx, @NativeType("uint32_t") int gamma) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_gama_int(ctx, gamma);
    }

    public static int spng_set_iccp(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_iccp *") spng_iccp iccp) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_iccp(ctx, iccp.address());
    }

    public static int spng_set_sbit(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_sbit *") spng_sbit sbit) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_sbit(ctx, sbit.address());
    }

    public static int spng_set_srgb(@NativeType("spng_ctx *") long ctx, @NativeType("uint8_t") byte rendering_intent) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_srgb(ctx, rendering_intent);
    }

    public static int spng_set_text(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_text *") spng_text text, @NativeType("uint32_t") int n_text) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_text(ctx, text.address(), n_text);
    }

    public static int spng_set_bkgd(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_bkgd *") spng_bkgd bkgd) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_bkgd(ctx, bkgd.address());
    }

    public static int spng_set_hist(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_hist *") spng_hist hist) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_hist(ctx, hist.address());
    }

    public static int spng_set_phys(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_phys *") spng_phys phys) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_phys(ctx, phys.address());
    }

    public static int spng_set_splt(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_splt *") spng_splt splt, @NativeType("uint32_t") int n_splt) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_splt(ctx, splt.address(), n_splt);
    }

    public static int spng_set_time(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_time *") spng_time time) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_time(ctx, time.address());
    }

    public static int spng_set_unknown_chunks(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_unknown_chunk *") spng_unknown_chunk.Buffer chunks) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_unknown_chunks(ctx, chunks.address(), chunks.remaining());
    }

    public static int spng_set_offs(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_offs *") spng_offs offs) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_offs(ctx, offs.address());
    }

    public static int spng_set_exif(@NativeType("spng_ctx *") long ctx, @NativeType("struct spng_exif *") spng_exif exif) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nspng_set_exif(ctx, exif.address());
    }

    @NativeType("char const *")
    public static String spng_strerror(int err) {
        long __result = nspng_strerror(err);
        return MemoryUtil.memASCIISafe(__result);
    }

    @NativeType("char const *")
    public static String spng_version_string() {
        long __result = nspng_version_string();
        return MemoryUtil.memASCIISafe(__result);
    }
}
