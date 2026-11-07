package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1ColorConfig.class */
public class StdVideoAV1ColorConfig extends Struct<StdVideoAV1ColorConfig> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int BITDEPTH;
    public static final int SUBSAMPLING_X;
    public static final int SUBSAMPLING_Y;
    public static final int RESERVED1;
    public static final int COLOR_PRIMARIES;
    public static final int TRANSFER_CHARACTERISTICS;
    public static final int MATRIX_COEFFICIENTS;
    public static final int CHROMA_SAMPLE_POSITION;

    static {
        Struct.Layout layout = __struct(__member(StdVideoAV1ColorConfigFlags.SIZEOF, StdVideoAV1ColorConfigFlags.ALIGNOF), __member(1), __member(1), __member(1), __member(1), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        BITDEPTH = layout.offsetof(1);
        SUBSAMPLING_X = layout.offsetof(2);
        SUBSAMPLING_Y = layout.offsetof(3);
        RESERVED1 = layout.offsetof(4);
        COLOR_PRIMARIES = layout.offsetof(5);
        TRANSFER_CHARACTERISTICS = layout.offsetof(6);
        MATRIX_COEFFICIENTS = layout.offsetof(7);
        CHROMA_SAMPLE_POSITION = layout.offsetof(8);
    }

    protected StdVideoAV1ColorConfig(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1ColorConfig create(long address, ByteBuffer container) {
        return new StdVideoAV1ColorConfig(address, container);
    }

    public StdVideoAV1ColorConfig(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoAV1ColorConfigFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte BitDepth() {
        return nBitDepth(address());
    }

    @NativeType("uint8_t")
    public byte subsampling_x() {
        return nsubsampling_x(address());
    }

    @NativeType("uint8_t")
    public byte subsampling_y() {
        return nsubsampling_y(address());
    }

    @NativeType("StdVideoAV1ColorPrimaries")
    public int color_primaries() {
        return ncolor_primaries(address());
    }

    @NativeType("StdVideoAV1TransferCharacteristics")
    public int transfer_characteristics() {
        return ntransfer_characteristics(address());
    }

    @NativeType("StdVideoAV1MatrixCoefficients")
    public int matrix_coefficients() {
        return nmatrix_coefficients(address());
    }

    @NativeType("StdVideoAV1ChromaSamplePosition")
    public int chroma_sample_position() {
        return nchroma_sample_position(address());
    }

    public StdVideoAV1ColorConfig flags(StdVideoAV1ColorConfigFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoAV1ColorConfig flags(Consumer<StdVideoAV1ColorConfigFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoAV1ColorConfig BitDepth(@NativeType("uint8_t") byte value) {
        nBitDepth(address(), value);
        return this;
    }

    public StdVideoAV1ColorConfig subsampling_x(@NativeType("uint8_t") byte value) {
        nsubsampling_x(address(), value);
        return this;
    }

    public StdVideoAV1ColorConfig subsampling_y(@NativeType("uint8_t") byte value) {
        nsubsampling_y(address(), value);
        return this;
    }

    public StdVideoAV1ColorConfig color_primaries(@NativeType("StdVideoAV1ColorPrimaries") int value) {
        ncolor_primaries(address(), value);
        return this;
    }

    public StdVideoAV1ColorConfig transfer_characteristics(@NativeType("StdVideoAV1TransferCharacteristics") int value) {
        ntransfer_characteristics(address(), value);
        return this;
    }

    public StdVideoAV1ColorConfig matrix_coefficients(@NativeType("StdVideoAV1MatrixCoefficients") int value) {
        nmatrix_coefficients(address(), value);
        return this;
    }

    public StdVideoAV1ColorConfig chroma_sample_position(@NativeType("StdVideoAV1ChromaSamplePosition") int value) {
        nchroma_sample_position(address(), value);
        return this;
    }

    public StdVideoAV1ColorConfig set(StdVideoAV1ColorConfigFlags flags, byte BitDepth, byte subsampling_x, byte subsampling_y, int color_primaries, int transfer_characteristics, int matrix_coefficients, int chroma_sample_position) {
        flags(flags);
        BitDepth(BitDepth);
        subsampling_x(subsampling_x);
        subsampling_y(subsampling_y);
        color_primaries(color_primaries);
        transfer_characteristics(transfer_characteristics);
        matrix_coefficients(matrix_coefficients);
        chroma_sample_position(chroma_sample_position);
        return this;
    }

    public StdVideoAV1ColorConfig set(StdVideoAV1ColorConfig src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1ColorConfig malloc() {
        return new StdVideoAV1ColorConfig(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1ColorConfig calloc() {
        return new StdVideoAV1ColorConfig(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1ColorConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1ColorConfig(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1ColorConfig create(long address) {
        return new StdVideoAV1ColorConfig(address, null);
    }

    public static StdVideoAV1ColorConfig createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1ColorConfig(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static StdVideoAV1ColorConfig malloc(MemoryStack stack) {
        return new StdVideoAV1ColorConfig(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1ColorConfig calloc(MemoryStack stack) {
        return new StdVideoAV1ColorConfig(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoAV1ColorConfigFlags nflags(long struct) {
        return StdVideoAV1ColorConfigFlags.create(struct + FLAGS);
    }

    public static byte nBitDepth(long struct) {
        return MemoryUtil.memGetByte(struct + BITDEPTH);
    }

    public static byte nsubsampling_x(long struct) {
        return MemoryUtil.memGetByte(struct + SUBSAMPLING_X);
    }

    public static byte nsubsampling_y(long struct) {
        return MemoryUtil.memGetByte(struct + SUBSAMPLING_Y);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static int ncolor_primaries(long struct) {
        return MemoryUtil.memGetInt(struct + COLOR_PRIMARIES);
    }

    public static int ntransfer_characteristics(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFER_CHARACTERISTICS);
    }

    public static int nmatrix_coefficients(long struct) {
        return MemoryUtil.memGetInt(struct + MATRIX_COEFFICIENTS);
    }

    public static int nchroma_sample_position(long struct) {
        return MemoryUtil.memGetInt(struct + CHROMA_SAMPLE_POSITION);
    }

    public static void nflags(long struct, StdVideoAV1ColorConfigFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoAV1ColorConfigFlags.SIZEOF);
    }

    public static void nBitDepth(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BITDEPTH, value);
    }

    public static void nsubsampling_x(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SUBSAMPLING_X, value);
    }

    public static void nsubsampling_y(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SUBSAMPLING_Y, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void ncolor_primaries(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLOR_PRIMARIES, value);
    }

    public static void ntransfer_characteristics(long struct, int value) {
        MemoryUtil.memPutInt(struct + TRANSFER_CHARACTERISTICS, value);
    }

    public static void nmatrix_coefficients(long struct, int value) {
        MemoryUtil.memPutInt(struct + MATRIX_COEFFICIENTS, value);
    }

    public static void nchroma_sample_position(long struct, int value) {
        MemoryUtil.memPutInt(struct + CHROMA_SAMPLE_POSITION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1ColorConfig$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1ColorConfig, Buffer> implements NativeResource {
        private static final StdVideoAV1ColorConfig ELEMENT_FACTORY = StdVideoAV1ColorConfig.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1ColorConfig.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public StdVideoAV1ColorConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoAV1ColorConfigFlags flags() {
            return StdVideoAV1ColorConfig.nflags(address());
        }

        @NativeType("uint8_t")
        public byte BitDepth() {
            return StdVideoAV1ColorConfig.nBitDepth(address());
        }

        @NativeType("uint8_t")
        public byte subsampling_x() {
            return StdVideoAV1ColorConfig.nsubsampling_x(address());
        }

        @NativeType("uint8_t")
        public byte subsampling_y() {
            return StdVideoAV1ColorConfig.nsubsampling_y(address());
        }

        @NativeType("StdVideoAV1ColorPrimaries")
        public int color_primaries() {
            return StdVideoAV1ColorConfig.ncolor_primaries(address());
        }

        @NativeType("StdVideoAV1TransferCharacteristics")
        public int transfer_characteristics() {
            return StdVideoAV1ColorConfig.ntransfer_characteristics(address());
        }

        @NativeType("StdVideoAV1MatrixCoefficients")
        public int matrix_coefficients() {
            return StdVideoAV1ColorConfig.nmatrix_coefficients(address());
        }

        @NativeType("StdVideoAV1ChromaSamplePosition")
        public int chroma_sample_position() {
            return StdVideoAV1ColorConfig.nchroma_sample_position(address());
        }

        public Buffer flags(StdVideoAV1ColorConfigFlags value) {
            StdVideoAV1ColorConfig.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoAV1ColorConfigFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer BitDepth(@NativeType("uint8_t") byte value) {
            StdVideoAV1ColorConfig.nBitDepth(address(), value);
            return this;
        }

        public Buffer subsampling_x(@NativeType("uint8_t") byte value) {
            StdVideoAV1ColorConfig.nsubsampling_x(address(), value);
            return this;
        }

        public Buffer subsampling_y(@NativeType("uint8_t") byte value) {
            StdVideoAV1ColorConfig.nsubsampling_y(address(), value);
            return this;
        }

        public Buffer color_primaries(@NativeType("StdVideoAV1ColorPrimaries") int value) {
            StdVideoAV1ColorConfig.ncolor_primaries(address(), value);
            return this;
        }

        public Buffer transfer_characteristics(@NativeType("StdVideoAV1TransferCharacteristics") int value) {
            StdVideoAV1ColorConfig.ntransfer_characteristics(address(), value);
            return this;
        }

        public Buffer matrix_coefficients(@NativeType("StdVideoAV1MatrixCoefficients") int value) {
            StdVideoAV1ColorConfig.nmatrix_coefficients(address(), value);
            return this;
        }

        public Buffer chroma_sample_position(@NativeType("StdVideoAV1ChromaSamplePosition") int value) {
            StdVideoAV1ColorConfig.nchroma_sample_position(address(), value);
            return this;
        }
    }
}
