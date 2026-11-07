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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeader.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeader.class */
public class StdVideoEncodeH265SliceSegmentHeader extends Struct<StdVideoEncodeH265SliceSegmentHeader> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int SLICE_TYPE;
    public static final int SLICE_SEGMENT_ADDRESS;
    public static final int COLLOCATED_REF_IDX;
    public static final int MAXNUMMERGECAND;
    public static final int SLICE_CB_QP_OFFSET;
    public static final int SLICE_CR_QP_OFFSET;
    public static final int SLICE_BETA_OFFSET_DIV2;
    public static final int SLICE_TC_OFFSET_DIV2;
    public static final int SLICE_ACT_Y_QP_OFFSET;
    public static final int SLICE_ACT_CB_QP_OFFSET;
    public static final int SLICE_ACT_CR_QP_OFFSET;
    public static final int SLICE_QP_DELTA;
    public static final int RESERVED1;
    public static final int PWEIGHTTABLE;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeH265SliceSegmentHeaderFlags.SIZEOF, StdVideoEncodeH265SliceSegmentHeaderFlags.ALIGNOF), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(2), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        SLICE_TYPE = layout.offsetof(1);
        SLICE_SEGMENT_ADDRESS = layout.offsetof(2);
        COLLOCATED_REF_IDX = layout.offsetof(3);
        MAXNUMMERGECAND = layout.offsetof(4);
        SLICE_CB_QP_OFFSET = layout.offsetof(5);
        SLICE_CR_QP_OFFSET = layout.offsetof(6);
        SLICE_BETA_OFFSET_DIV2 = layout.offsetof(7);
        SLICE_TC_OFFSET_DIV2 = layout.offsetof(8);
        SLICE_ACT_Y_QP_OFFSET = layout.offsetof(9);
        SLICE_ACT_CB_QP_OFFSET = layout.offsetof(10);
        SLICE_ACT_CR_QP_OFFSET = layout.offsetof(11);
        SLICE_QP_DELTA = layout.offsetof(12);
        RESERVED1 = layout.offsetof(13);
        PWEIGHTTABLE = layout.offsetof(14);
    }

    protected StdVideoEncodeH265SliceSegmentHeader(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH265SliceSegmentHeader create(long address, ByteBuffer container) {
        return new StdVideoEncodeH265SliceSegmentHeader(address, container);
    }

    public StdVideoEncodeH265SliceSegmentHeader(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH265SliceType")
    public int slice_type() {
        return nslice_type(address());
    }

    @NativeType("uint32_t")
    public int slice_segment_address() {
        return nslice_segment_address(address());
    }

    @NativeType("uint8_t")
    public byte collocated_ref_idx() {
        return ncollocated_ref_idx(address());
    }

    @NativeType("uint8_t")
    public byte MaxNumMergeCand() {
        return nMaxNumMergeCand(address());
    }

    @NativeType("int8_t")
    public byte slice_cb_qp_offset() {
        return nslice_cb_qp_offset(address());
    }

    @NativeType("int8_t")
    public byte slice_cr_qp_offset() {
        return nslice_cr_qp_offset(address());
    }

    @NativeType("int8_t")
    public byte slice_beta_offset_div2() {
        return nslice_beta_offset_div2(address());
    }

    @NativeType("int8_t")
    public byte slice_tc_offset_div2() {
        return nslice_tc_offset_div2(address());
    }

    @NativeType("int8_t")
    public byte slice_act_y_qp_offset() {
        return nslice_act_y_qp_offset(address());
    }

    @NativeType("int8_t")
    public byte slice_act_cb_qp_offset() {
        return nslice_act_cb_qp_offset(address());
    }

    @NativeType("int8_t")
    public byte slice_act_cr_qp_offset() {
        return nslice_act_cr_qp_offset(address());
    }

    @NativeType("int8_t")
    public byte slice_qp_delta() {
        return nslice_qp_delta(address());
    }

    @NativeType("StdVideoEncodeH265WeightTable const *")
    public StdVideoEncodeH265WeightTable pWeightTable() {
        return npWeightTable(address());
    }

    public StdVideoEncodeH265SliceSegmentHeader flags(StdVideoEncodeH265SliceSegmentHeaderFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader flags(Consumer<StdVideoEncodeH265SliceSegmentHeaderFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader slice_type(@NativeType("StdVideoH265SliceType") int value) {
        nslice_type(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader slice_segment_address(@NativeType("uint32_t") int value) {
        nslice_segment_address(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader collocated_ref_idx(@NativeType("uint8_t") byte value) {
        ncollocated_ref_idx(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader MaxNumMergeCand(@NativeType("uint8_t") byte value) {
        nMaxNumMergeCand(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader slice_cb_qp_offset(@NativeType("int8_t") byte value) {
        nslice_cb_qp_offset(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader slice_cr_qp_offset(@NativeType("int8_t") byte value) {
        nslice_cr_qp_offset(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader slice_beta_offset_div2(@NativeType("int8_t") byte value) {
        nslice_beta_offset_div2(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader slice_tc_offset_div2(@NativeType("int8_t") byte value) {
        nslice_tc_offset_div2(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader slice_act_y_qp_offset(@NativeType("int8_t") byte value) {
        nslice_act_y_qp_offset(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader slice_act_cb_qp_offset(@NativeType("int8_t") byte value) {
        nslice_act_cb_qp_offset(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader slice_act_cr_qp_offset(@NativeType("int8_t") byte value) {
        nslice_act_cr_qp_offset(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader slice_qp_delta(@NativeType("int8_t") byte value) {
        nslice_qp_delta(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader pWeightTable(@NativeType("StdVideoEncodeH265WeightTable const *") StdVideoEncodeH265WeightTable value) {
        npWeightTable(address(), value);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader set(StdVideoEncodeH265SliceSegmentHeaderFlags flags, int slice_type, int slice_segment_address, byte collocated_ref_idx, byte MaxNumMergeCand, byte slice_cb_qp_offset, byte slice_cr_qp_offset, byte slice_beta_offset_div2, byte slice_tc_offset_div2, byte slice_act_y_qp_offset, byte slice_act_cb_qp_offset, byte slice_act_cr_qp_offset, byte slice_qp_delta, StdVideoEncodeH265WeightTable pWeightTable) {
        flags(flags);
        slice_type(slice_type);
        slice_segment_address(slice_segment_address);
        collocated_ref_idx(collocated_ref_idx);
        MaxNumMergeCand(MaxNumMergeCand);
        slice_cb_qp_offset(slice_cb_qp_offset);
        slice_cr_qp_offset(slice_cr_qp_offset);
        slice_beta_offset_div2(slice_beta_offset_div2);
        slice_tc_offset_div2(slice_tc_offset_div2);
        slice_act_y_qp_offset(slice_act_y_qp_offset);
        slice_act_cb_qp_offset(slice_act_cb_qp_offset);
        slice_act_cr_qp_offset(slice_act_cr_qp_offset);
        slice_qp_delta(slice_qp_delta);
        pWeightTable(pWeightTable);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeader set(StdVideoEncodeH265SliceSegmentHeader src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH265SliceSegmentHeader malloc() {
        return new StdVideoEncodeH265SliceSegmentHeader(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH265SliceSegmentHeader calloc() {
        return new StdVideoEncodeH265SliceSegmentHeader(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH265SliceSegmentHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265SliceSegmentHeader(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH265SliceSegmentHeader create(long address) {
        return new StdVideoEncodeH265SliceSegmentHeader(address, null);
    }

    public static StdVideoEncodeH265SliceSegmentHeader createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH265SliceSegmentHeader(address, null);
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

    public static StdVideoEncodeH265SliceSegmentHeader malloc(MemoryStack stack) {
        return new StdVideoEncodeH265SliceSegmentHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH265SliceSegmentHeader calloc(MemoryStack stack) {
        return new StdVideoEncodeH265SliceSegmentHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags nflags(long struct) {
        return StdVideoEncodeH265SliceSegmentHeaderFlags.create(struct + FLAGS);
    }

    public static int nslice_type(long struct) {
        return MemoryUtil.memGetInt(struct + SLICE_TYPE);
    }

    public static int nslice_segment_address(long struct) {
        return MemoryUtil.memGetInt(struct + SLICE_SEGMENT_ADDRESS);
    }

    public static byte ncollocated_ref_idx(long struct) {
        return MemoryUtil.memGetByte(struct + COLLOCATED_REF_IDX);
    }

    public static byte nMaxNumMergeCand(long struct) {
        return MemoryUtil.memGetByte(struct + MAXNUMMERGECAND);
    }

    public static byte nslice_cb_qp_offset(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_CB_QP_OFFSET);
    }

    public static byte nslice_cr_qp_offset(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_CR_QP_OFFSET);
    }

    public static byte nslice_beta_offset_div2(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_BETA_OFFSET_DIV2);
    }

    public static byte nslice_tc_offset_div2(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_TC_OFFSET_DIV2);
    }

    public static byte nslice_act_y_qp_offset(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_ACT_Y_QP_OFFSET);
    }

    public static byte nslice_act_cb_qp_offset(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_ACT_CB_QP_OFFSET);
    }

    public static byte nslice_act_cr_qp_offset(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_ACT_CR_QP_OFFSET);
    }

    public static byte nslice_qp_delta(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_QP_DELTA);
    }

    public static short nreserved1(long struct) {
        return MemoryUtil.memGetShort(struct + RESERVED1);
    }

    public static StdVideoEncodeH265WeightTable npWeightTable(long struct) {
        return StdVideoEncodeH265WeightTable.create(MemoryUtil.memGetAddress(struct + PWEIGHTTABLE));
    }

    public static void nflags(long struct, StdVideoEncodeH265SliceSegmentHeaderFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeH265SliceSegmentHeaderFlags.SIZEOF);
    }

    public static void nslice_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + SLICE_TYPE, value);
    }

    public static void nslice_segment_address(long struct, int value) {
        MemoryUtil.memPutInt(struct + SLICE_SEGMENT_ADDRESS, value);
    }

    public static void ncollocated_ref_idx(long struct, byte value) {
        MemoryUtil.memPutByte(struct + COLLOCATED_REF_IDX, value);
    }

    public static void nMaxNumMergeCand(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MAXNUMMERGECAND, value);
    }

    public static void nslice_cb_qp_offset(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_CB_QP_OFFSET, value);
    }

    public static void nslice_cr_qp_offset(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_CR_QP_OFFSET, value);
    }

    public static void nslice_beta_offset_div2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_BETA_OFFSET_DIV2, value);
    }

    public static void nslice_tc_offset_div2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_TC_OFFSET_DIV2, value);
    }

    public static void nslice_act_y_qp_offset(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_ACT_Y_QP_OFFSET, value);
    }

    public static void nslice_act_cb_qp_offset(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_ACT_CB_QP_OFFSET, value);
    }

    public static void nslice_act_cr_qp_offset(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_ACT_CR_QP_OFFSET, value);
    }

    public static void nslice_qp_delta(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_QP_DELTA, value);
    }

    public static void nreserved1(long struct, short value) {
        MemoryUtil.memPutShort(struct + RESERVED1, value);
    }

    public static void npWeightTable(long struct, StdVideoEncodeH265WeightTable value) {
        MemoryUtil.memPutAddress(struct + PWEIGHTTABLE, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PWEIGHTTABLE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeader$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeader$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265SliceSegmentHeader, Buffer> implements NativeResource {
        private static final StdVideoEncodeH265SliceSegmentHeader ELEMENT_FACTORY = StdVideoEncodeH265SliceSegmentHeader.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH265SliceSegmentHeader.SIZEOF);
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
        public StdVideoEncodeH265SliceSegmentHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeH265SliceSegmentHeaderFlags flags() {
            return StdVideoEncodeH265SliceSegmentHeader.nflags(address());
        }

        @NativeType("StdVideoH265SliceType")
        public int slice_type() {
            return StdVideoEncodeH265SliceSegmentHeader.nslice_type(address());
        }

        @NativeType("uint32_t")
        public int slice_segment_address() {
            return StdVideoEncodeH265SliceSegmentHeader.nslice_segment_address(address());
        }

        @NativeType("uint8_t")
        public byte collocated_ref_idx() {
            return StdVideoEncodeH265SliceSegmentHeader.ncollocated_ref_idx(address());
        }

        @NativeType("uint8_t")
        public byte MaxNumMergeCand() {
            return StdVideoEncodeH265SliceSegmentHeader.nMaxNumMergeCand(address());
        }

        @NativeType("int8_t")
        public byte slice_cb_qp_offset() {
            return StdVideoEncodeH265SliceSegmentHeader.nslice_cb_qp_offset(address());
        }

        @NativeType("int8_t")
        public byte slice_cr_qp_offset() {
            return StdVideoEncodeH265SliceSegmentHeader.nslice_cr_qp_offset(address());
        }

        @NativeType("int8_t")
        public byte slice_beta_offset_div2() {
            return StdVideoEncodeH265SliceSegmentHeader.nslice_beta_offset_div2(address());
        }

        @NativeType("int8_t")
        public byte slice_tc_offset_div2() {
            return StdVideoEncodeH265SliceSegmentHeader.nslice_tc_offset_div2(address());
        }

        @NativeType("int8_t")
        public byte slice_act_y_qp_offset() {
            return StdVideoEncodeH265SliceSegmentHeader.nslice_act_y_qp_offset(address());
        }

        @NativeType("int8_t")
        public byte slice_act_cb_qp_offset() {
            return StdVideoEncodeH265SliceSegmentHeader.nslice_act_cb_qp_offset(address());
        }

        @NativeType("int8_t")
        public byte slice_act_cr_qp_offset() {
            return StdVideoEncodeH265SliceSegmentHeader.nslice_act_cr_qp_offset(address());
        }

        @NativeType("int8_t")
        public byte slice_qp_delta() {
            return StdVideoEncodeH265SliceSegmentHeader.nslice_qp_delta(address());
        }

        @NativeType("StdVideoEncodeH265WeightTable const *")
        public StdVideoEncodeH265WeightTable pWeightTable() {
            return StdVideoEncodeH265SliceSegmentHeader.npWeightTable(address());
        }

        public Buffer flags(StdVideoEncodeH265SliceSegmentHeaderFlags value) {
            StdVideoEncodeH265SliceSegmentHeader.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeH265SliceSegmentHeaderFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer slice_type(@NativeType("StdVideoH265SliceType") int value) {
            StdVideoEncodeH265SliceSegmentHeader.nslice_type(address(), value);
            return this;
        }

        public Buffer slice_segment_address(@NativeType("uint32_t") int value) {
            StdVideoEncodeH265SliceSegmentHeader.nslice_segment_address(address(), value);
            return this;
        }

        public Buffer collocated_ref_idx(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265SliceSegmentHeader.ncollocated_ref_idx(address(), value);
            return this;
        }

        public Buffer MaxNumMergeCand(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265SliceSegmentHeader.nMaxNumMergeCand(address(), value);
            return this;
        }

        public Buffer slice_cb_qp_offset(@NativeType("int8_t") byte value) {
            StdVideoEncodeH265SliceSegmentHeader.nslice_cb_qp_offset(address(), value);
            return this;
        }

        public Buffer slice_cr_qp_offset(@NativeType("int8_t") byte value) {
            StdVideoEncodeH265SliceSegmentHeader.nslice_cr_qp_offset(address(), value);
            return this;
        }

        public Buffer slice_beta_offset_div2(@NativeType("int8_t") byte value) {
            StdVideoEncodeH265SliceSegmentHeader.nslice_beta_offset_div2(address(), value);
            return this;
        }

        public Buffer slice_tc_offset_div2(@NativeType("int8_t") byte value) {
            StdVideoEncodeH265SliceSegmentHeader.nslice_tc_offset_div2(address(), value);
            return this;
        }

        public Buffer slice_act_y_qp_offset(@NativeType("int8_t") byte value) {
            StdVideoEncodeH265SliceSegmentHeader.nslice_act_y_qp_offset(address(), value);
            return this;
        }

        public Buffer slice_act_cb_qp_offset(@NativeType("int8_t") byte value) {
            StdVideoEncodeH265SliceSegmentHeader.nslice_act_cb_qp_offset(address(), value);
            return this;
        }

        public Buffer slice_act_cr_qp_offset(@NativeType("int8_t") byte value) {
            StdVideoEncodeH265SliceSegmentHeader.nslice_act_cr_qp_offset(address(), value);
            return this;
        }

        public Buffer slice_qp_delta(@NativeType("int8_t") byte value) {
            StdVideoEncodeH265SliceSegmentHeader.nslice_qp_delta(address(), value);
            return this;
        }

        public Buffer pWeightTable(@NativeType("StdVideoEncodeH265WeightTable const *") StdVideoEncodeH265WeightTable value) {
            StdVideoEncodeH265SliceSegmentHeader.npWeightTable(address(), value);
            return this;
        }
    }
}
