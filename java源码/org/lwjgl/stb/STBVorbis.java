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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBVorbis.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBVorbis.class */
public class STBVorbis {
    public static final int VORBIS__no_error = 0;
    public static final int VORBIS_need_more_data = 1;
    public static final int VORBIS_invalid_api_mixing = 2;
    public static final int VORBIS_outofmem = 3;
    public static final int VORBIS_feature_not_supported = 4;
    public static final int VORBIS_too_many_channels = 5;
    public static final int VORBIS_file_open_failure = 6;
    public static final int VORBIS_seek_without_length = 7;
    public static final int VORBIS_unexpected_eof = 10;
    public static final int VORBIS_seek_invalid = 11;
    public static final int VORBIS_invalid_setup = 20;
    public static final int VORBIS_invalid_stream = 21;
    public static final int VORBIS_missing_capture_pattern = 30;
    public static final int VORBIS_invalid_stream_structure_version = 31;
    public static final int VORBIS_continued_packet_flag_invalid = 32;
    public static final int VORBIS_incorrect_stream_serial_number = 33;
    public static final int VORBIS_invalid_first_page = 34;
    public static final int VORBIS_bad_packet_type = 35;
    public static final int VORBIS_cant_find_last_page = 36;
    public static final int VORBIS_seek_failed = 37;
    public static final int VORBIS_ogg_skeleton_not_supported = 38;

    public static native void nstb_vorbis_get_info(long j, long j2);

    public static native void nstb_vorbis_get_comment(long j, long j2);

    public static native int nstb_vorbis_get_error(long j);

    public static native void nstb_vorbis_close(long j);

    public static native int nstb_vorbis_get_sample_offset(long j);

    public static native int nstb_vorbis_get_file_offset(long j);

    public static native long nstb_vorbis_open_pushdata(long j, int i, long j2, long j3, long j4);

    public static native int nstb_vorbis_decode_frame_pushdata(long j, long j2, int i, long j3, long j4, long j5);

    public static native void nstb_vorbis_flush_pushdata(long j);

    public static native int nstb_vorbis_decode_filename(long j, long j2, long j3, long j4);

    public static native int nstb_vorbis_decode_memory(long j, int i, long j2, long j3, long j4);

    public static native long nstb_vorbis_open_memory(long j, int i, long j2, long j3);

    public static native long nstb_vorbis_open_filename(long j, long j2, long j3);

    public static native int nstb_vorbis_seek_frame(long j, int i);

    public static native int nstb_vorbis_seek(long j, int i);

    public static native int nstb_vorbis_seek_start(long j);

    public static native int nstb_vorbis_stream_length_in_samples(long j);

    public static native float nstb_vorbis_stream_length_in_seconds(long j);

    public static native int nstb_vorbis_get_frame_float(long j, long j2, long j3);

    public static native int nstb_vorbis_get_frame_short(long j, int i, long j2, int i2);

    public static native int nstb_vorbis_get_frame_short_interleaved(long j, int i, long j2, int i2);

    public static native int nstb_vorbis_get_samples_float(long j, int i, long j2, int i2);

    public static native int nstb_vorbis_get_samples_float_interleaved(long j, int i, long j2, int i2);

    public static native int nstb_vorbis_get_samples_short(long j, int i, long j2, int i2);

    public static native int nstb_vorbis_get_samples_short_interleaved(long j, int i, long j2, int i2);

    public static native long nstb_vorbis_open_pushdata(long j, int i, int[] iArr, int[] iArr2, long j2);

    public static native int nstb_vorbis_decode_frame_pushdata(long j, long j2, int i, int[] iArr, long j3, int[] iArr2);

    public static native int nstb_vorbis_decode_filename(long j, int[] iArr, int[] iArr2, long j2);

    public static native int nstb_vorbis_decode_memory(long j, int i, int[] iArr, int[] iArr2, long j2);

    public static native long nstb_vorbis_open_memory(long j, int i, int[] iArr, long j2);

    public static native long nstb_vorbis_open_filename(long j, int[] iArr, long j2);

    public static native int nstb_vorbis_get_frame_float(long j, int[] iArr, long j2);

    public static native int nstb_vorbis_get_frame_short_interleaved(long j, int i, short[] sArr, int i2);

    public static native int nstb_vorbis_get_samples_float_interleaved(long j, int i, float[] fArr, int i2);

    public static native int nstb_vorbis_get_samples_short_interleaved(long j, int i, short[] sArr, int i2);

    static {
        LibSTB.initialize();
    }

    protected STBVorbis() {
        throw new UnsupportedOperationException();
    }

    @NativeType("stb_vorbis_info")
    public static STBVorbisInfo stb_vorbis_get_info(@NativeType("stb_vorbis *") long f, @NativeType("stb_vorbis_info") STBVorbisInfo __result) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        nstb_vorbis_get_info(f, __result.address());
        return __result;
    }

    @NativeType("stb_vorbis_comment")
    public static STBVorbisComment stb_vorbis_get_comment(@NativeType("stb_vorbis *") long f, @NativeType("stb_vorbis_comment") STBVorbisComment __result) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        nstb_vorbis_get_comment(f, __result.address());
        return __result;
    }

    public static int stb_vorbis_get_error(@NativeType("stb_vorbis *") long f) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_error(f);
    }

    public static void stb_vorbis_close(@NativeType("stb_vorbis *") long f) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        nstb_vorbis_close(f);
    }

    public static int stb_vorbis_get_sample_offset(@NativeType("stb_vorbis *") long f) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_sample_offset(f);
    }

    @NativeType("unsigned int")
    public static int stb_vorbis_get_file_offset(@NativeType("stb_vorbis *") long f) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_file_offset(f);
    }

    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_pushdata(@NativeType("unsigned char const *") ByteBuffer datablock, @NativeType("int *") IntBuffer datablock_memory_consumed_in_bytes, @NativeType("int *") IntBuffer error, @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) datablock_memory_consumed_in_bytes, 1);
            Checks.check((Buffer) error, 1);
            if (alloc_buffer != null) {
                STBVorbisAlloc.validate(alloc_buffer.address());
            }
        }
        return nstb_vorbis_open_pushdata(MemoryUtil.memAddress(datablock), datablock.remaining(), MemoryUtil.memAddress(datablock_memory_consumed_in_bytes), MemoryUtil.memAddress(error), MemoryUtil.memAddressSafe(alloc_buffer));
    }

    public static int stb_vorbis_decode_frame_pushdata(@NativeType("stb_vorbis *") long f, @NativeType("unsigned char const *") ByteBuffer datablock, @NativeType("int *") IntBuffer channels, @NativeType("float ***") PointerBuffer output, @NativeType("int *") IntBuffer samples) {
        if (Checks.CHECKS) {
            Checks.check(f);
            Checks.checkSafe((Buffer) channels, 1);
            Checks.check((CustomBuffer<?>) output, 1);
            Checks.check((Buffer) samples, 1);
        }
        return nstb_vorbis_decode_frame_pushdata(f, MemoryUtil.memAddress(datablock), datablock.remaining(), MemoryUtil.memAddressSafe(channels), MemoryUtil.memAddress(output), MemoryUtil.memAddress(samples));
    }

    public static void stb_vorbis_flush_pushdata(@NativeType("stb_vorbis *") long f) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        nstb_vorbis_flush_pushdata(f);
    }

    public static int stb_vorbis_decode_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate, @NativeType("short **") PointerBuffer output) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) channels, 1);
            Checks.check((Buffer) sample_rate, 1);
            Checks.check((CustomBuffer<?>) output, 1);
        }
        return nstb_vorbis_decode_filename(MemoryUtil.memAddress(filename), MemoryUtil.memAddress(channels), MemoryUtil.memAddress(sample_rate), MemoryUtil.memAddress(output));
    }

    public static int stb_vorbis_decode_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate, @NativeType("short **") PointerBuffer output) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) channels, 1);
            Checks.check((Buffer) sample_rate, 1);
            Checks.check((CustomBuffer<?>) output, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            int iNstb_vorbis_decode_filename = nstb_vorbis_decode_filename(filenameEncoded, MemoryUtil.memAddress(channels), MemoryUtil.memAddress(sample_rate), MemoryUtil.memAddress(output));
            stack.setPointer(stackPointer);
            return iNstb_vorbis_decode_filename;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("int")
    public static ShortBuffer stb_vorbis_decode_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) channels, 1);
            Checks.check((Buffer) sample_rate, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            PointerBuffer output = stack.pointers(0L);
            int __result = nstb_vorbis_decode_filename(filenameEncoded, MemoryUtil.memAddress(channels), MemoryUtil.memAddress(sample_rate), MemoryUtil.memAddress(output));
            ShortBuffer shortBufferMemShortBufferSafe = MemoryUtil.memShortBufferSafe(output.get(0), __result * channels.get(0));
            stack.setPointer(stackPointer);
            return shortBufferMemShortBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int stb_vorbis_decode_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate, @NativeType("short **") PointerBuffer output) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) channels, 1);
            Checks.check((Buffer) sample_rate, 1);
            Checks.check((CustomBuffer<?>) output, 1);
        }
        return nstb_vorbis_decode_memory(MemoryUtil.memAddress(mem), mem.remaining(), MemoryUtil.memAddress(channels), MemoryUtil.memAddress(sample_rate), MemoryUtil.memAddress(output));
    }

    @NativeType("int")
    public static ShortBuffer stb_vorbis_decode_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) channels, 1);
            Checks.check((Buffer) sample_rate, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            PointerBuffer output = stack.pointers(0L);
            int __result = nstb_vorbis_decode_memory(MemoryUtil.memAddress(mem), mem.remaining(), MemoryUtil.memAddress(channels), MemoryUtil.memAddress(sample_rate), MemoryUtil.memAddress(output));
            ShortBuffer shortBufferMemShortBufferSafe = MemoryUtil.memShortBufferSafe(output.get(0), __result * channels.get(0));
            stack.setPointer(stackPointer);
            return shortBufferMemShortBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") IntBuffer error, @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) error, 1);
            if (alloc_buffer != null) {
                STBVorbisAlloc.validate(alloc_buffer.address());
            }
        }
        return nstb_vorbis_open_memory(MemoryUtil.memAddress(mem), mem.remaining(), MemoryUtil.memAddress(error), MemoryUtil.memAddressSafe(alloc_buffer));
    }

    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer error, @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check((Buffer) error, 1);
            if (alloc_buffer != null) {
                STBVorbisAlloc.validate(alloc_buffer.address());
            }
        }
        return nstb_vorbis_open_filename(MemoryUtil.memAddress(filename), MemoryUtil.memAddress(error), MemoryUtil.memAddressSafe(alloc_buffer));
    }

    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer error, @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) error, 1);
            if (alloc_buffer != null) {
                STBVorbisAlloc.validate(alloc_buffer.address());
            }
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long jNstb_vorbis_open_filename = nstb_vorbis_open_filename(filenameEncoded, MemoryUtil.memAddress(error), MemoryUtil.memAddressSafe(alloc_buffer));
            stack.setPointer(stackPointer);
            return jNstb_vorbis_open_filename;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("int")
    public static boolean stb_vorbis_seek_frame(@NativeType("stb_vorbis *") long f, @NativeType("unsigned int") int sample_number) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_seek_frame(f, sample_number) != 0;
    }

    @NativeType("int")
    public static boolean stb_vorbis_seek(@NativeType("stb_vorbis *") long f, @NativeType("unsigned int") int sample_number) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_seek(f, sample_number) != 0;
    }

    @NativeType("int")
    public static boolean stb_vorbis_seek_start(@NativeType("stb_vorbis *") long f) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_seek_start(f) != 0;
    }

    @NativeType("unsigned int")
    public static int stb_vorbis_stream_length_in_samples(@NativeType("stb_vorbis *") long f) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_stream_length_in_samples(f);
    }

    public static float stb_vorbis_stream_length_in_seconds(@NativeType("stb_vorbis *") long f) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_stream_length_in_seconds(f);
    }

    public static int stb_vorbis_get_frame_float(@NativeType("stb_vorbis *") long f, @NativeType("int *") IntBuffer channels, @NativeType("float ***") PointerBuffer output) {
        if (Checks.CHECKS) {
            Checks.check(f);
            Checks.checkSafe((Buffer) channels, 1);
            Checks.check((CustomBuffer<?>) output, 1);
        }
        return nstb_vorbis_get_frame_float(f, MemoryUtil.memAddressSafe(channels), MemoryUtil.memAddress(output));
    }

    public static int stb_vorbis_get_frame_short(@NativeType("stb_vorbis *") long f, @NativeType("short **") PointerBuffer buffer, int num_samples) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_frame_short(f, buffer.remaining(), MemoryUtil.memAddress(buffer), num_samples);
    }

    public static int stb_vorbis_get_frame_short_interleaved(@NativeType("stb_vorbis *") long f, int num_c, @NativeType("short *") ShortBuffer buffer) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_frame_short_interleaved(f, num_c, MemoryUtil.memAddress(buffer), buffer.remaining());
    }

    public static int stb_vorbis_get_samples_float(@NativeType("stb_vorbis *") long f, @NativeType("float **") PointerBuffer buffer, int num_samples) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_samples_float(f, buffer.remaining(), MemoryUtil.memAddress(buffer), num_samples);
    }

    public static int stb_vorbis_get_samples_float_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("float *") FloatBuffer buffer) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_samples_float_interleaved(f, channels, MemoryUtil.memAddress(buffer), buffer.remaining());
    }

    public static int stb_vorbis_get_samples_short(@NativeType("stb_vorbis *") long f, @NativeType("short **") PointerBuffer buffer, int num_samples) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_samples_short(f, buffer.remaining(), MemoryUtil.memAddress(buffer), num_samples);
    }

    public static int stb_vorbis_get_samples_short_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("short *") ShortBuffer buffer) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_samples_short_interleaved(f, channels, MemoryUtil.memAddress(buffer), buffer.remaining());
    }

    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_pushdata(@NativeType("unsigned char const *") ByteBuffer datablock, @NativeType("int *") int[] datablock_memory_consumed_in_bytes, @NativeType("int *") int[] error, @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (Checks.CHECKS) {
            Checks.check(datablock_memory_consumed_in_bytes, 1);
            Checks.check(error, 1);
            if (alloc_buffer != null) {
                STBVorbisAlloc.validate(alloc_buffer.address());
            }
        }
        return nstb_vorbis_open_pushdata(MemoryUtil.memAddress(datablock), datablock.remaining(), datablock_memory_consumed_in_bytes, error, MemoryUtil.memAddressSafe(alloc_buffer));
    }

    public static int stb_vorbis_decode_frame_pushdata(@NativeType("stb_vorbis *") long f, @NativeType("unsigned char const *") ByteBuffer datablock, @NativeType("int *") int[] channels, @NativeType("float ***") PointerBuffer output, @NativeType("int *") int[] samples) {
        if (Checks.CHECKS) {
            Checks.check(f);
            Checks.checkSafe(channels, 1);
            Checks.check((CustomBuffer<?>) output, 1);
            Checks.check(samples, 1);
        }
        return nstb_vorbis_decode_frame_pushdata(f, MemoryUtil.memAddress(datablock), datablock.remaining(), channels, MemoryUtil.memAddress(output), samples);
    }

    public static int stb_vorbis_decode_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] channels, @NativeType("int *") int[] sample_rate, @NativeType("short **") PointerBuffer output) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check(channels, 1);
            Checks.check(sample_rate, 1);
            Checks.check((CustomBuffer<?>) output, 1);
        }
        return nstb_vorbis_decode_filename(MemoryUtil.memAddress(filename), channels, sample_rate, MemoryUtil.memAddress(output));
    }

    public static int stb_vorbis_decode_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] channels, @NativeType("int *") int[] sample_rate, @NativeType("short **") PointerBuffer output) {
        if (Checks.CHECKS) {
            Checks.check(channels, 1);
            Checks.check(sample_rate, 1);
            Checks.check((CustomBuffer<?>) output, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            int iNstb_vorbis_decode_filename = nstb_vorbis_decode_filename(filenameEncoded, channels, sample_rate, MemoryUtil.memAddress(output));
            stack.setPointer(stackPointer);
            return iNstb_vorbis_decode_filename;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int stb_vorbis_decode_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") int[] channels, @NativeType("int *") int[] sample_rate, @NativeType("short **") PointerBuffer output) {
        if (Checks.CHECKS) {
            Checks.check(channels, 1);
            Checks.check(sample_rate, 1);
            Checks.check((CustomBuffer<?>) output, 1);
        }
        return nstb_vorbis_decode_memory(MemoryUtil.memAddress(mem), mem.remaining(), channels, sample_rate, MemoryUtil.memAddress(output));
    }

    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") int[] error, @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (Checks.CHECKS) {
            Checks.check(error, 1);
            if (alloc_buffer != null) {
                STBVorbisAlloc.validate(alloc_buffer.address());
            }
        }
        return nstb_vorbis_open_memory(MemoryUtil.memAddress(mem), mem.remaining(), error, MemoryUtil.memAddressSafe(alloc_buffer));
    }

    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] error, @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.check(error, 1);
            if (alloc_buffer != null) {
                STBVorbisAlloc.validate(alloc_buffer.address());
            }
        }
        return nstb_vorbis_open_filename(MemoryUtil.memAddress(filename), error, MemoryUtil.memAddressSafe(alloc_buffer));
    }

    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] error, @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (Checks.CHECKS) {
            Checks.check(error, 1);
            if (alloc_buffer != null) {
                STBVorbisAlloc.validate(alloc_buffer.address());
            }
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long jNstb_vorbis_open_filename = nstb_vorbis_open_filename(filenameEncoded, error, MemoryUtil.memAddressSafe(alloc_buffer));
            stack.setPointer(stackPointer);
            return jNstb_vorbis_open_filename;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int stb_vorbis_get_frame_float(@NativeType("stb_vorbis *") long f, @NativeType("int *") int[] channels, @NativeType("float ***") PointerBuffer output) {
        if (Checks.CHECKS) {
            Checks.check(f);
            Checks.checkSafe(channels, 1);
            Checks.check((CustomBuffer<?>) output, 1);
        }
        return nstb_vorbis_get_frame_float(f, channels, MemoryUtil.memAddress(output));
    }

    public static int stb_vorbis_get_frame_short_interleaved(@NativeType("stb_vorbis *") long f, int num_c, @NativeType("short *") short[] buffer) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_frame_short_interleaved(f, num_c, buffer, buffer.length);
    }

    public static int stb_vorbis_get_samples_float_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("float *") float[] buffer) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_samples_float_interleaved(f, channels, buffer, buffer.length);
    }

    public static int stb_vorbis_get_samples_short_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("short *") short[] buffer) {
        if (Checks.CHECKS) {
            Checks.check(f);
        }
        return nstb_vorbis_get_samples_short_interleaved(f, channels, buffer, buffer.length);
    }
}
