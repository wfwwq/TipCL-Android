package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1DecoderModelInfo.class */
public class StdVideoEncodeAV1DecoderModelInfo extends Struct<StdVideoEncodeAV1DecoderModelInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUFFER_DELAY_LENGTH_MINUS_1;
    public static final int BUFFER_REMOVAL_TIME_LENGTH_MINUS_1;
    public static final int FRAME_PRESENTATION_TIME_LENGTH_MINUS_1;
    public static final int RESERVED1;
    public static final int NUM_UNITS_IN_DECODING_TICK;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1), __member(1), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUFFER_DELAY_LENGTH_MINUS_1 = layout.offsetof(0);
        BUFFER_REMOVAL_TIME_LENGTH_MINUS_1 = layout.offsetof(1);
        FRAME_PRESENTATION_TIME_LENGTH_MINUS_1 = layout.offsetof(2);
        RESERVED1 = layout.offsetof(3);
        NUM_UNITS_IN_DECODING_TICK = layout.offsetof(4);
    }

    protected StdVideoEncodeAV1DecoderModelInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeAV1DecoderModelInfo create(long address, ByteBuffer container) {
        return new StdVideoEncodeAV1DecoderModelInfo(address, container);
    }

    public StdVideoEncodeAV1DecoderModelInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t")
    public byte buffer_delay_length_minus_1() {
        return nbuffer_delay_length_minus_1(address());
    }

    @NativeType("uint8_t")
    public byte buffer_removal_time_length_minus_1() {
        return nbuffer_removal_time_length_minus_1(address());
    }

    @NativeType("uint8_t")
    public byte frame_presentation_time_length_minus_1() {
        return nframe_presentation_time_length_minus_1(address());
    }

    @NativeType("uint32_t")
    public int num_units_in_decoding_tick() {
        return nnum_units_in_decoding_tick(address());
    }

    public StdVideoEncodeAV1DecoderModelInfo buffer_delay_length_minus_1(@NativeType("uint8_t") byte value) {
        nbuffer_delay_length_minus_1(address(), value);
        return this;
    }

    public StdVideoEncodeAV1DecoderModelInfo buffer_removal_time_length_minus_1(@NativeType("uint8_t") byte value) {
        nbuffer_removal_time_length_minus_1(address(), value);
        return this;
    }

    public StdVideoEncodeAV1DecoderModelInfo frame_presentation_time_length_minus_1(@NativeType("uint8_t") byte value) {
        nframe_presentation_time_length_minus_1(address(), value);
        return this;
    }

    public StdVideoEncodeAV1DecoderModelInfo num_units_in_decoding_tick(@NativeType("uint32_t") int value) {
        nnum_units_in_decoding_tick(address(), value);
        return this;
    }

    public StdVideoEncodeAV1DecoderModelInfo set(byte buffer_delay_length_minus_1, byte buffer_removal_time_length_minus_1, byte frame_presentation_time_length_minus_1, int num_units_in_decoding_tick) {
        buffer_delay_length_minus_1(buffer_delay_length_minus_1);
        buffer_removal_time_length_minus_1(buffer_removal_time_length_minus_1);
        frame_presentation_time_length_minus_1(frame_presentation_time_length_minus_1);
        num_units_in_decoding_tick(num_units_in_decoding_tick);
        return this;
    }

    public StdVideoEncodeAV1DecoderModelInfo set(StdVideoEncodeAV1DecoderModelInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeAV1DecoderModelInfo malloc() {
        return new StdVideoEncodeAV1DecoderModelInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeAV1DecoderModelInfo calloc() {
        return new StdVideoEncodeAV1DecoderModelInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeAV1DecoderModelInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1DecoderModelInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeAV1DecoderModelInfo create(long address) {
        return new StdVideoEncodeAV1DecoderModelInfo(address, null);
    }

    public static StdVideoEncodeAV1DecoderModelInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeAV1DecoderModelInfo(address, null);
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

    public static StdVideoEncodeAV1DecoderModelInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1DecoderModelInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeAV1DecoderModelInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1DecoderModelInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte nbuffer_delay_length_minus_1(long struct) {
        return MemoryUtil.memGetByte(struct + BUFFER_DELAY_LENGTH_MINUS_1);
    }

    public static byte nbuffer_removal_time_length_minus_1(long struct) {
        return MemoryUtil.memGetByte(struct + BUFFER_REMOVAL_TIME_LENGTH_MINUS_1);
    }

    public static byte nframe_presentation_time_length_minus_1(long struct) {
        return MemoryUtil.memGetByte(struct + FRAME_PRESENTATION_TIME_LENGTH_MINUS_1);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static int nnum_units_in_decoding_tick(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_UNITS_IN_DECODING_TICK);
    }

    public static void nbuffer_delay_length_minus_1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BUFFER_DELAY_LENGTH_MINUS_1, value);
    }

    public static void nbuffer_removal_time_length_minus_1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BUFFER_REMOVAL_TIME_LENGTH_MINUS_1, value);
    }

    public static void nframe_presentation_time_length_minus_1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + FRAME_PRESENTATION_TIME_LENGTH_MINUS_1, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void nnum_units_in_decoding_tick(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_UNITS_IN_DECODING_TICK, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1DecoderModelInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1DecoderModelInfo, Buffer> implements NativeResource {
        private static final StdVideoEncodeAV1DecoderModelInfo ELEMENT_FACTORY = StdVideoEncodeAV1DecoderModelInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeAV1DecoderModelInfo.SIZEOF);
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
        public StdVideoEncodeAV1DecoderModelInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t")
        public byte buffer_delay_length_minus_1() {
            return StdVideoEncodeAV1DecoderModelInfo.nbuffer_delay_length_minus_1(address());
        }

        @NativeType("uint8_t")
        public byte buffer_removal_time_length_minus_1() {
            return StdVideoEncodeAV1DecoderModelInfo.nbuffer_removal_time_length_minus_1(address());
        }

        @NativeType("uint8_t")
        public byte frame_presentation_time_length_minus_1() {
            return StdVideoEncodeAV1DecoderModelInfo.nframe_presentation_time_length_minus_1(address());
        }

        @NativeType("uint32_t")
        public int num_units_in_decoding_tick() {
            return StdVideoEncodeAV1DecoderModelInfo.nnum_units_in_decoding_tick(address());
        }

        public Buffer buffer_delay_length_minus_1(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1DecoderModelInfo.nbuffer_delay_length_minus_1(address(), value);
            return this;
        }

        public Buffer buffer_removal_time_length_minus_1(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1DecoderModelInfo.nbuffer_removal_time_length_minus_1(address(), value);
            return this;
        }

        public Buffer frame_presentation_time_length_minus_1(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1DecoderModelInfo.nframe_presentation_time_length_minus_1(address(), value);
            return this;
        }

        public Buffer num_units_in_decoding_tick(@NativeType("uint32_t") int value) {
            StdVideoEncodeAV1DecoderModelInfo.nnum_units_in_decoding_tick(address(), value);
            return this;
        }
    }
}
