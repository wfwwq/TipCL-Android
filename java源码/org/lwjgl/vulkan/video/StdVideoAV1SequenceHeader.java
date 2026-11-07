package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1SequenceHeader.class */
public class StdVideoAV1SequenceHeader extends Struct<StdVideoAV1SequenceHeader> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int SEQ_PROFILE;
    public static final int FRAME_WIDTH_BITS_MINUS_1;
    public static final int FRAME_HEIGHT_BITS_MINUS_1;
    public static final int MAX_FRAME_WIDTH_MINUS_1;
    public static final int MAX_FRAME_HEIGHT_MINUS_1;
    public static final int DELTA_FRAME_ID_LENGTH_MINUS_2;
    public static final int ADDITIONAL_FRAME_ID_LENGTH_MINUS_1;
    public static final int ORDER_HINT_BITS_MINUS_1;
    public static final int SEQ_FORCE_INTEGER_MV;
    public static final int SEQ_FORCE_SCREEN_CONTENT_TOOLS;
    public static final int RESERVED1;
    public static final int PCOLORCONFIG;
    public static final int PTIMINGINFO;

    static {
        Struct.Layout layout = __struct(__member(StdVideoAV1SequenceHeaderFlags.SIZEOF, StdVideoAV1SequenceHeaderFlags.ALIGNOF), __member(4), __member(1), __member(1), __member(2), __member(2), __member(1), __member(1), __member(1), __member(1), __member(1), __array(1, 5), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        SEQ_PROFILE = layout.offsetof(1);
        FRAME_WIDTH_BITS_MINUS_1 = layout.offsetof(2);
        FRAME_HEIGHT_BITS_MINUS_1 = layout.offsetof(3);
        MAX_FRAME_WIDTH_MINUS_1 = layout.offsetof(4);
        MAX_FRAME_HEIGHT_MINUS_1 = layout.offsetof(5);
        DELTA_FRAME_ID_LENGTH_MINUS_2 = layout.offsetof(6);
        ADDITIONAL_FRAME_ID_LENGTH_MINUS_1 = layout.offsetof(7);
        ORDER_HINT_BITS_MINUS_1 = layout.offsetof(8);
        SEQ_FORCE_INTEGER_MV = layout.offsetof(9);
        SEQ_FORCE_SCREEN_CONTENT_TOOLS = layout.offsetof(10);
        RESERVED1 = layout.offsetof(11);
        PCOLORCONFIG = layout.offsetof(12);
        PTIMINGINFO = layout.offsetof(13);
    }

    protected StdVideoAV1SequenceHeader(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1SequenceHeader create(long address, ByteBuffer container) {
        return new StdVideoAV1SequenceHeader(address, container);
    }

    public StdVideoAV1SequenceHeader(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoAV1SequenceHeaderFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoAV1Profile")
    public int seq_profile() {
        return nseq_profile(address());
    }

    @NativeType("uint8_t")
    public byte frame_width_bits_minus_1() {
        return nframe_width_bits_minus_1(address());
    }

    @NativeType("uint8_t")
    public byte frame_height_bits_minus_1() {
        return nframe_height_bits_minus_1(address());
    }

    @NativeType("uint16_t")
    public short max_frame_width_minus_1() {
        return nmax_frame_width_minus_1(address());
    }

    @NativeType("uint16_t")
    public short max_frame_height_minus_1() {
        return nmax_frame_height_minus_1(address());
    }

    @NativeType("uint8_t")
    public byte delta_frame_id_length_minus_2() {
        return ndelta_frame_id_length_minus_2(address());
    }

    @NativeType("uint8_t")
    public byte additional_frame_id_length_minus_1() {
        return nadditional_frame_id_length_minus_1(address());
    }

    @NativeType("uint8_t")
    public byte order_hint_bits_minus_1() {
        return norder_hint_bits_minus_1(address());
    }

    @NativeType("uint8_t")
    public byte seq_force_integer_mv() {
        return nseq_force_integer_mv(address());
    }

    @NativeType("uint8_t")
    public byte seq_force_screen_content_tools() {
        return nseq_force_screen_content_tools(address());
    }

    @NativeType("StdVideoAV1ColorConfig const *")
    public StdVideoAV1ColorConfig pColorConfig() {
        return npColorConfig(address());
    }

    @NativeType("StdVideoAV1TimingInfo const *")
    public StdVideoAV1TimingInfo pTimingInfo() {
        return npTimingInfo(address());
    }

    public StdVideoAV1SequenceHeader flags(StdVideoAV1SequenceHeaderFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader flags(Consumer<StdVideoAV1SequenceHeaderFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoAV1SequenceHeader seq_profile(@NativeType("StdVideoAV1Profile") int value) {
        nseq_profile(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader frame_width_bits_minus_1(@NativeType("uint8_t") byte value) {
        nframe_width_bits_minus_1(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader frame_height_bits_minus_1(@NativeType("uint8_t") byte value) {
        nframe_height_bits_minus_1(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader max_frame_width_minus_1(@NativeType("uint16_t") short value) {
        nmax_frame_width_minus_1(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader max_frame_height_minus_1(@NativeType("uint16_t") short value) {
        nmax_frame_height_minus_1(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader delta_frame_id_length_minus_2(@NativeType("uint8_t") byte value) {
        ndelta_frame_id_length_minus_2(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader additional_frame_id_length_minus_1(@NativeType("uint8_t") byte value) {
        nadditional_frame_id_length_minus_1(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader order_hint_bits_minus_1(@NativeType("uint8_t") byte value) {
        norder_hint_bits_minus_1(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader seq_force_integer_mv(@NativeType("uint8_t") byte value) {
        nseq_force_integer_mv(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader seq_force_screen_content_tools(@NativeType("uint8_t") byte value) {
        nseq_force_screen_content_tools(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader pColorConfig(@NativeType("StdVideoAV1ColorConfig const *") StdVideoAV1ColorConfig value) {
        npColorConfig(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader pTimingInfo(@NativeType("StdVideoAV1TimingInfo const *") StdVideoAV1TimingInfo value) {
        npTimingInfo(address(), value);
        return this;
    }

    public StdVideoAV1SequenceHeader set(StdVideoAV1SequenceHeaderFlags flags, int seq_profile, byte frame_width_bits_minus_1, byte frame_height_bits_minus_1, short max_frame_width_minus_1, short max_frame_height_minus_1, byte delta_frame_id_length_minus_2, byte additional_frame_id_length_minus_1, byte order_hint_bits_minus_1, byte seq_force_integer_mv, byte seq_force_screen_content_tools, StdVideoAV1ColorConfig pColorConfig, StdVideoAV1TimingInfo pTimingInfo) {
        flags(flags);
        seq_profile(seq_profile);
        frame_width_bits_minus_1(frame_width_bits_minus_1);
        frame_height_bits_minus_1(frame_height_bits_minus_1);
        max_frame_width_minus_1(max_frame_width_minus_1);
        max_frame_height_minus_1(max_frame_height_minus_1);
        delta_frame_id_length_minus_2(delta_frame_id_length_minus_2);
        additional_frame_id_length_minus_1(additional_frame_id_length_minus_1);
        order_hint_bits_minus_1(order_hint_bits_minus_1);
        seq_force_integer_mv(seq_force_integer_mv);
        seq_force_screen_content_tools(seq_force_screen_content_tools);
        pColorConfig(pColorConfig);
        pTimingInfo(pTimingInfo);
        return this;
    }

    public StdVideoAV1SequenceHeader set(StdVideoAV1SequenceHeader src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1SequenceHeader malloc() {
        return new StdVideoAV1SequenceHeader(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1SequenceHeader calloc() {
        return new StdVideoAV1SequenceHeader(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1SequenceHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1SequenceHeader(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1SequenceHeader create(long address) {
        return new StdVideoAV1SequenceHeader(address, null);
    }

    public static StdVideoAV1SequenceHeader createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1SequenceHeader(address, null);
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

    public static StdVideoAV1SequenceHeader malloc(MemoryStack stack) {
        return new StdVideoAV1SequenceHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1SequenceHeader calloc(MemoryStack stack) {
        return new StdVideoAV1SequenceHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoAV1SequenceHeaderFlags nflags(long struct) {
        return StdVideoAV1SequenceHeaderFlags.create(struct + FLAGS);
    }

    public static int nseq_profile(long struct) {
        return MemoryUtil.memGetInt(struct + SEQ_PROFILE);
    }

    public static byte nframe_width_bits_minus_1(long struct) {
        return MemoryUtil.memGetByte(struct + FRAME_WIDTH_BITS_MINUS_1);
    }

    public static byte nframe_height_bits_minus_1(long struct) {
        return MemoryUtil.memGetByte(struct + FRAME_HEIGHT_BITS_MINUS_1);
    }

    public static short nmax_frame_width_minus_1(long struct) {
        return MemoryUtil.memGetShort(struct + MAX_FRAME_WIDTH_MINUS_1);
    }

    public static short nmax_frame_height_minus_1(long struct) {
        return MemoryUtil.memGetShort(struct + MAX_FRAME_HEIGHT_MINUS_1);
    }

    public static byte ndelta_frame_id_length_minus_2(long struct) {
        return MemoryUtil.memGetByte(struct + DELTA_FRAME_ID_LENGTH_MINUS_2);
    }

    public static byte nadditional_frame_id_length_minus_1(long struct) {
        return MemoryUtil.memGetByte(struct + ADDITIONAL_FRAME_ID_LENGTH_MINUS_1);
    }

    public static byte norder_hint_bits_minus_1(long struct) {
        return MemoryUtil.memGetByte(struct + ORDER_HINT_BITS_MINUS_1);
    }

    public static byte nseq_force_integer_mv(long struct) {
        return MemoryUtil.memGetByte(struct + SEQ_FORCE_INTEGER_MV);
    }

    public static byte nseq_force_screen_content_tools(long struct) {
        return MemoryUtil.memGetByte(struct + SEQ_FORCE_SCREEN_CONTENT_TOOLS);
    }

    public static ByteBuffer nreserved1(long struct) {
        return MemoryUtil.memByteBuffer(struct + RESERVED1, 5);
    }

    public static byte nreserved1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + RESERVED1 + (Checks.check(index, 5) * 1));
    }

    public static StdVideoAV1ColorConfig npColorConfig(long struct) {
        return StdVideoAV1ColorConfig.create(MemoryUtil.memGetAddress(struct + PCOLORCONFIG));
    }

    public static StdVideoAV1TimingInfo npTimingInfo(long struct) {
        return StdVideoAV1TimingInfo.create(MemoryUtil.memGetAddress(struct + PTIMINGINFO));
    }

    public static void nflags(long struct, StdVideoAV1SequenceHeaderFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoAV1SequenceHeaderFlags.SIZEOF);
    }

    public static void nseq_profile(long struct, int value) {
        MemoryUtil.memPutInt(struct + SEQ_PROFILE, value);
    }

    public static void nframe_width_bits_minus_1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + FRAME_WIDTH_BITS_MINUS_1, value);
    }

    public static void nframe_height_bits_minus_1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + FRAME_HEIGHT_BITS_MINUS_1, value);
    }

    public static void nmax_frame_width_minus_1(long struct, short value) {
        MemoryUtil.memPutShort(struct + MAX_FRAME_WIDTH_MINUS_1, value);
    }

    public static void nmax_frame_height_minus_1(long struct, short value) {
        MemoryUtil.memPutShort(struct + MAX_FRAME_HEIGHT_MINUS_1, value);
    }

    public static void ndelta_frame_id_length_minus_2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_FRAME_ID_LENGTH_MINUS_2, value);
    }

    public static void nadditional_frame_id_length_minus_1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ADDITIONAL_FRAME_ID_LENGTH_MINUS_1, value);
    }

    public static void norder_hint_bits_minus_1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ORDER_HINT_BITS_MINUS_1, value);
    }

    public static void nseq_force_integer_mv(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SEQ_FORCE_INTEGER_MV, value);
    }

    public static void nseq_force_screen_content_tools(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SEQ_FORCE_SCREEN_CONTENT_TOOLS, value);
    }

    public static void nreserved1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 5);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESERVED1, value.remaining() * 1);
    }

    public static void nreserved1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1 + (Checks.check(index, 5) * 1), value);
    }

    public static void npColorConfig(long struct, StdVideoAV1ColorConfig value) {
        MemoryUtil.memPutAddress(struct + PCOLORCONFIG, value.address());
    }

    public static void npTimingInfo(long struct, StdVideoAV1TimingInfo value) {
        MemoryUtil.memPutAddress(struct + PTIMINGINFO, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PCOLORCONFIG));
        Checks.check(MemoryUtil.memGetAddress(struct + PTIMINGINFO));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1SequenceHeader$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1SequenceHeader, Buffer> implements NativeResource {
        private static final StdVideoAV1SequenceHeader ELEMENT_FACTORY = StdVideoAV1SequenceHeader.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1SequenceHeader.SIZEOF);
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
        public StdVideoAV1SequenceHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoAV1SequenceHeaderFlags flags() {
            return StdVideoAV1SequenceHeader.nflags(address());
        }

        @NativeType("StdVideoAV1Profile")
        public int seq_profile() {
            return StdVideoAV1SequenceHeader.nseq_profile(address());
        }

        @NativeType("uint8_t")
        public byte frame_width_bits_minus_1() {
            return StdVideoAV1SequenceHeader.nframe_width_bits_minus_1(address());
        }

        @NativeType("uint8_t")
        public byte frame_height_bits_minus_1() {
            return StdVideoAV1SequenceHeader.nframe_height_bits_minus_1(address());
        }

        @NativeType("uint16_t")
        public short max_frame_width_minus_1() {
            return StdVideoAV1SequenceHeader.nmax_frame_width_minus_1(address());
        }

        @NativeType("uint16_t")
        public short max_frame_height_minus_1() {
            return StdVideoAV1SequenceHeader.nmax_frame_height_minus_1(address());
        }

        @NativeType("uint8_t")
        public byte delta_frame_id_length_minus_2() {
            return StdVideoAV1SequenceHeader.ndelta_frame_id_length_minus_2(address());
        }

        @NativeType("uint8_t")
        public byte additional_frame_id_length_minus_1() {
            return StdVideoAV1SequenceHeader.nadditional_frame_id_length_minus_1(address());
        }

        @NativeType("uint8_t")
        public byte order_hint_bits_minus_1() {
            return StdVideoAV1SequenceHeader.norder_hint_bits_minus_1(address());
        }

        @NativeType("uint8_t")
        public byte seq_force_integer_mv() {
            return StdVideoAV1SequenceHeader.nseq_force_integer_mv(address());
        }

        @NativeType("uint8_t")
        public byte seq_force_screen_content_tools() {
            return StdVideoAV1SequenceHeader.nseq_force_screen_content_tools(address());
        }

        @NativeType("StdVideoAV1ColorConfig const *")
        public StdVideoAV1ColorConfig pColorConfig() {
            return StdVideoAV1SequenceHeader.npColorConfig(address());
        }

        @NativeType("StdVideoAV1TimingInfo const *")
        public StdVideoAV1TimingInfo pTimingInfo() {
            return StdVideoAV1SequenceHeader.npTimingInfo(address());
        }

        public Buffer flags(StdVideoAV1SequenceHeaderFlags value) {
            StdVideoAV1SequenceHeader.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoAV1SequenceHeaderFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer seq_profile(@NativeType("StdVideoAV1Profile") int value) {
            StdVideoAV1SequenceHeader.nseq_profile(address(), value);
            return this;
        }

        public Buffer frame_width_bits_minus_1(@NativeType("uint8_t") byte value) {
            StdVideoAV1SequenceHeader.nframe_width_bits_minus_1(address(), value);
            return this;
        }

        public Buffer frame_height_bits_minus_1(@NativeType("uint8_t") byte value) {
            StdVideoAV1SequenceHeader.nframe_height_bits_minus_1(address(), value);
            return this;
        }

        public Buffer max_frame_width_minus_1(@NativeType("uint16_t") short value) {
            StdVideoAV1SequenceHeader.nmax_frame_width_minus_1(address(), value);
            return this;
        }

        public Buffer max_frame_height_minus_1(@NativeType("uint16_t") short value) {
            StdVideoAV1SequenceHeader.nmax_frame_height_minus_1(address(), value);
            return this;
        }

        public Buffer delta_frame_id_length_minus_2(@NativeType("uint8_t") byte value) {
            StdVideoAV1SequenceHeader.ndelta_frame_id_length_minus_2(address(), value);
            return this;
        }

        public Buffer additional_frame_id_length_minus_1(@NativeType("uint8_t") byte value) {
            StdVideoAV1SequenceHeader.nadditional_frame_id_length_minus_1(address(), value);
            return this;
        }

        public Buffer order_hint_bits_minus_1(@NativeType("uint8_t") byte value) {
            StdVideoAV1SequenceHeader.norder_hint_bits_minus_1(address(), value);
            return this;
        }

        public Buffer seq_force_integer_mv(@NativeType("uint8_t") byte value) {
            StdVideoAV1SequenceHeader.nseq_force_integer_mv(address(), value);
            return this;
        }

        public Buffer seq_force_screen_content_tools(@NativeType("uint8_t") byte value) {
            StdVideoAV1SequenceHeader.nseq_force_screen_content_tools(address(), value);
            return this;
        }

        public Buffer pColorConfig(@NativeType("StdVideoAV1ColorConfig const *") StdVideoAV1ColorConfig value) {
            StdVideoAV1SequenceHeader.npColorConfig(address(), value);
            return this;
        }

        public Buffer pTimingInfo(@NativeType("StdVideoAV1TimingInfo const *") StdVideoAV1TimingInfo value) {
            StdVideoAV1SequenceHeader.npTimingInfo(address(), value);
            return this;
        }
    }
}
