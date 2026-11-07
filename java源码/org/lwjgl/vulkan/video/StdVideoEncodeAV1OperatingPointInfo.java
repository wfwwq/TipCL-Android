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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1OperatingPointInfo.class */
public class StdVideoEncodeAV1OperatingPointInfo extends Struct<StdVideoEncodeAV1OperatingPointInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int OPERATING_POINT_IDC;
    public static final int SEQ_LEVEL_IDX;
    public static final int SEQ_TIER;
    public static final int DECODER_BUFFER_DELAY;
    public static final int ENCODER_BUFFER_DELAY;
    public static final int INITIAL_DISPLAY_DELAY_MINUS_1;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeAV1OperatingPointInfoFlags.SIZEOF, StdVideoEncodeAV1OperatingPointInfoFlags.ALIGNOF), __member(2), __member(1), __member(1), __member(4), __member(4), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        OPERATING_POINT_IDC = layout.offsetof(1);
        SEQ_LEVEL_IDX = layout.offsetof(2);
        SEQ_TIER = layout.offsetof(3);
        DECODER_BUFFER_DELAY = layout.offsetof(4);
        ENCODER_BUFFER_DELAY = layout.offsetof(5);
        INITIAL_DISPLAY_DELAY_MINUS_1 = layout.offsetof(6);
    }

    protected StdVideoEncodeAV1OperatingPointInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeAV1OperatingPointInfo create(long address, ByteBuffer container) {
        return new StdVideoEncodeAV1OperatingPointInfo(address, container);
    }

    public StdVideoEncodeAV1OperatingPointInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeAV1OperatingPointInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("uint16_t")
    public short operating_point_idc() {
        return noperating_point_idc(address());
    }

    @NativeType("uint8_t")
    public byte seq_level_idx() {
        return nseq_level_idx(address());
    }

    @NativeType("uint8_t")
    public byte seq_tier() {
        return nseq_tier(address());
    }

    @NativeType("uint32_t")
    public int decoder_buffer_delay() {
        return ndecoder_buffer_delay(address());
    }

    @NativeType("uint32_t")
    public int encoder_buffer_delay() {
        return nencoder_buffer_delay(address());
    }

    @NativeType("uint8_t")
    public byte initial_display_delay_minus_1() {
        return ninitial_display_delay_minus_1(address());
    }

    public StdVideoEncodeAV1OperatingPointInfo flags(StdVideoEncodeAV1OperatingPointInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfo flags(Consumer<StdVideoEncodeAV1OperatingPointInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfo operating_point_idc(@NativeType("uint16_t") short value) {
        noperating_point_idc(address(), value);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfo seq_level_idx(@NativeType("uint8_t") byte value) {
        nseq_level_idx(address(), value);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfo seq_tier(@NativeType("uint8_t") byte value) {
        nseq_tier(address(), value);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfo decoder_buffer_delay(@NativeType("uint32_t") int value) {
        ndecoder_buffer_delay(address(), value);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfo encoder_buffer_delay(@NativeType("uint32_t") int value) {
        nencoder_buffer_delay(address(), value);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfo initial_display_delay_minus_1(@NativeType("uint8_t") byte value) {
        ninitial_display_delay_minus_1(address(), value);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfo set(StdVideoEncodeAV1OperatingPointInfoFlags flags, short operating_point_idc, byte seq_level_idx, byte seq_tier, int decoder_buffer_delay, int encoder_buffer_delay, byte initial_display_delay_minus_1) {
        flags(flags);
        operating_point_idc(operating_point_idc);
        seq_level_idx(seq_level_idx);
        seq_tier(seq_tier);
        decoder_buffer_delay(decoder_buffer_delay);
        encoder_buffer_delay(encoder_buffer_delay);
        initial_display_delay_minus_1(initial_display_delay_minus_1);
        return this;
    }

    public StdVideoEncodeAV1OperatingPointInfo set(StdVideoEncodeAV1OperatingPointInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeAV1OperatingPointInfo malloc() {
        return new StdVideoEncodeAV1OperatingPointInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeAV1OperatingPointInfo calloc() {
        return new StdVideoEncodeAV1OperatingPointInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeAV1OperatingPointInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1OperatingPointInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeAV1OperatingPointInfo create(long address) {
        return new StdVideoEncodeAV1OperatingPointInfo(address, null);
    }

    public static StdVideoEncodeAV1OperatingPointInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeAV1OperatingPointInfo(address, null);
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

    public static StdVideoEncodeAV1OperatingPointInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1OperatingPointInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeAV1OperatingPointInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1OperatingPointInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags nflags(long struct) {
        return StdVideoEncodeAV1OperatingPointInfoFlags.create(struct + FLAGS);
    }

    public static short noperating_point_idc(long struct) {
        return MemoryUtil.memGetShort(struct + OPERATING_POINT_IDC);
    }

    public static byte nseq_level_idx(long struct) {
        return MemoryUtil.memGetByte(struct + SEQ_LEVEL_IDX);
    }

    public static byte nseq_tier(long struct) {
        return MemoryUtil.memGetByte(struct + SEQ_TIER);
    }

    public static int ndecoder_buffer_delay(long struct) {
        return MemoryUtil.memGetInt(struct + DECODER_BUFFER_DELAY);
    }

    public static int nencoder_buffer_delay(long struct) {
        return MemoryUtil.memGetInt(struct + ENCODER_BUFFER_DELAY);
    }

    public static byte ninitial_display_delay_minus_1(long struct) {
        return MemoryUtil.memGetByte(struct + INITIAL_DISPLAY_DELAY_MINUS_1);
    }

    public static void nflags(long struct, StdVideoEncodeAV1OperatingPointInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeAV1OperatingPointInfoFlags.SIZEOF);
    }

    public static void noperating_point_idc(long struct, short value) {
        MemoryUtil.memPutShort(struct + OPERATING_POINT_IDC, value);
    }

    public static void nseq_level_idx(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SEQ_LEVEL_IDX, value);
    }

    public static void nseq_tier(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SEQ_TIER, value);
    }

    public static void ndecoder_buffer_delay(long struct, int value) {
        MemoryUtil.memPutInt(struct + DECODER_BUFFER_DELAY, value);
    }

    public static void nencoder_buffer_delay(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENCODER_BUFFER_DELAY, value);
    }

    public static void ninitial_display_delay_minus_1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + INITIAL_DISPLAY_DELAY_MINUS_1, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1OperatingPointInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1OperatingPointInfo, Buffer> implements NativeResource {
        private static final StdVideoEncodeAV1OperatingPointInfo ELEMENT_FACTORY = StdVideoEncodeAV1OperatingPointInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeAV1OperatingPointInfo.SIZEOF);
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
        public StdVideoEncodeAV1OperatingPointInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeAV1OperatingPointInfoFlags flags() {
            return StdVideoEncodeAV1OperatingPointInfo.nflags(address());
        }

        @NativeType("uint16_t")
        public short operating_point_idc() {
            return StdVideoEncodeAV1OperatingPointInfo.noperating_point_idc(address());
        }

        @NativeType("uint8_t")
        public byte seq_level_idx() {
            return StdVideoEncodeAV1OperatingPointInfo.nseq_level_idx(address());
        }

        @NativeType("uint8_t")
        public byte seq_tier() {
            return StdVideoEncodeAV1OperatingPointInfo.nseq_tier(address());
        }

        @NativeType("uint32_t")
        public int decoder_buffer_delay() {
            return StdVideoEncodeAV1OperatingPointInfo.ndecoder_buffer_delay(address());
        }

        @NativeType("uint32_t")
        public int encoder_buffer_delay() {
            return StdVideoEncodeAV1OperatingPointInfo.nencoder_buffer_delay(address());
        }

        @NativeType("uint8_t")
        public byte initial_display_delay_minus_1() {
            return StdVideoEncodeAV1OperatingPointInfo.ninitial_display_delay_minus_1(address());
        }

        public Buffer flags(StdVideoEncodeAV1OperatingPointInfoFlags value) {
            StdVideoEncodeAV1OperatingPointInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeAV1OperatingPointInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer operating_point_idc(@NativeType("uint16_t") short value) {
            StdVideoEncodeAV1OperatingPointInfo.noperating_point_idc(address(), value);
            return this;
        }

        public Buffer seq_level_idx(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1OperatingPointInfo.nseq_level_idx(address(), value);
            return this;
        }

        public Buffer seq_tier(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1OperatingPointInfo.nseq_tier(address(), value);
            return this;
        }

        public Buffer decoder_buffer_delay(@NativeType("uint32_t") int value) {
            StdVideoEncodeAV1OperatingPointInfo.ndecoder_buffer_delay(address(), value);
            return this;
        }

        public Buffer encoder_buffer_delay(@NativeType("uint32_t") int value) {
            StdVideoEncodeAV1OperatingPointInfo.nencoder_buffer_delay(address(), value);
            return this;
        }

        public Buffer initial_display_delay_minus_1(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1OperatingPointInfo.ninitial_display_delay_minus_1(address(), value);
            return this;
        }
    }
}
