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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeader.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeader.class */
public class StdVideoEncodeH264SliceHeader extends Struct<StdVideoEncodeH264SliceHeader> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int FIRST_MB_IN_SLICE;
    public static final int SLICE_TYPE;
    public static final int SLICE_ALPHA_C0_OFFSET_DIV2;
    public static final int SLICE_BETA_OFFSET_DIV2;
    public static final int SLICE_QP_DELTA;
    public static final int RESERVED1;
    public static final int CABAC_INIT_IDC;
    public static final int DISABLE_DEBLOCKING_FILTER_IDC;
    public static final int PWEIGHTTABLE;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeH264SliceHeaderFlags.SIZEOF, StdVideoEncodeH264SliceHeaderFlags.ALIGNOF), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        FIRST_MB_IN_SLICE = layout.offsetof(1);
        SLICE_TYPE = layout.offsetof(2);
        SLICE_ALPHA_C0_OFFSET_DIV2 = layout.offsetof(3);
        SLICE_BETA_OFFSET_DIV2 = layout.offsetof(4);
        SLICE_QP_DELTA = layout.offsetof(5);
        RESERVED1 = layout.offsetof(6);
        CABAC_INIT_IDC = layout.offsetof(7);
        DISABLE_DEBLOCKING_FILTER_IDC = layout.offsetof(8);
        PWEIGHTTABLE = layout.offsetof(9);
    }

    protected StdVideoEncodeH264SliceHeader(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264SliceHeader create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264SliceHeader(address, container);
    }

    public StdVideoEncodeH264SliceHeader(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeH264SliceHeaderFlags flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int first_mb_in_slice() {
        return nfirst_mb_in_slice(address());
    }

    @NativeType("StdVideoH264SliceType")
    public int slice_type() {
        return nslice_type(address());
    }

    @NativeType("int8_t")
    public byte slice_alpha_c0_offset_div2() {
        return nslice_alpha_c0_offset_div2(address());
    }

    @NativeType("int8_t")
    public byte slice_beta_offset_div2() {
        return nslice_beta_offset_div2(address());
    }

    @NativeType("int8_t")
    public byte slice_qp_delta() {
        return nslice_qp_delta(address());
    }

    @NativeType("StdVideoH264CabacInitIdc")
    public int cabac_init_idc() {
        return ncabac_init_idc(address());
    }

    @NativeType("StdVideoH264DisableDeblockingFilterIdc")
    public int disable_deblocking_filter_idc() {
        return ndisable_deblocking_filter_idc(address());
    }

    @NativeType("StdVideoEncodeH264WeightTable const *")
    public StdVideoEncodeH264WeightTable pWeightTable() {
        return npWeightTable(address());
    }

    public StdVideoEncodeH264SliceHeader flags(StdVideoEncodeH264SliceHeaderFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeH264SliceHeader flags(Consumer<StdVideoEncodeH264SliceHeaderFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeH264SliceHeader first_mb_in_slice(@NativeType("uint32_t") int value) {
        nfirst_mb_in_slice(address(), value);
        return this;
    }

    public StdVideoEncodeH264SliceHeader slice_type(@NativeType("StdVideoH264SliceType") int value) {
        nslice_type(address(), value);
        return this;
    }

    public StdVideoEncodeH264SliceHeader slice_alpha_c0_offset_div2(@NativeType("int8_t") byte value) {
        nslice_alpha_c0_offset_div2(address(), value);
        return this;
    }

    public StdVideoEncodeH264SliceHeader slice_beta_offset_div2(@NativeType("int8_t") byte value) {
        nslice_beta_offset_div2(address(), value);
        return this;
    }

    public StdVideoEncodeH264SliceHeader slice_qp_delta(@NativeType("int8_t") byte value) {
        nslice_qp_delta(address(), value);
        return this;
    }

    public StdVideoEncodeH264SliceHeader cabac_init_idc(@NativeType("StdVideoH264CabacInitIdc") int value) {
        ncabac_init_idc(address(), value);
        return this;
    }

    public StdVideoEncodeH264SliceHeader disable_deblocking_filter_idc(@NativeType("StdVideoH264DisableDeblockingFilterIdc") int value) {
        ndisable_deblocking_filter_idc(address(), value);
        return this;
    }

    public StdVideoEncodeH264SliceHeader pWeightTable(@NativeType("StdVideoEncodeH264WeightTable const *") StdVideoEncodeH264WeightTable value) {
        npWeightTable(address(), value);
        return this;
    }

    public StdVideoEncodeH264SliceHeader set(StdVideoEncodeH264SliceHeaderFlags flags, int first_mb_in_slice, int slice_type, byte slice_alpha_c0_offset_div2, byte slice_beta_offset_div2, byte slice_qp_delta, int cabac_init_idc, int disable_deblocking_filter_idc, StdVideoEncodeH264WeightTable pWeightTable) {
        flags(flags);
        first_mb_in_slice(first_mb_in_slice);
        slice_type(slice_type);
        slice_alpha_c0_offset_div2(slice_alpha_c0_offset_div2);
        slice_beta_offset_div2(slice_beta_offset_div2);
        slice_qp_delta(slice_qp_delta);
        cabac_init_idc(cabac_init_idc);
        disable_deblocking_filter_idc(disable_deblocking_filter_idc);
        pWeightTable(pWeightTable);
        return this;
    }

    public StdVideoEncodeH264SliceHeader set(StdVideoEncodeH264SliceHeader src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264SliceHeader malloc() {
        return new StdVideoEncodeH264SliceHeader(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264SliceHeader calloc() {
        return new StdVideoEncodeH264SliceHeader(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264SliceHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264SliceHeader(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264SliceHeader create(long address) {
        return new StdVideoEncodeH264SliceHeader(address, null);
    }

    public static StdVideoEncodeH264SliceHeader createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264SliceHeader(address, null);
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

    public static StdVideoEncodeH264SliceHeader malloc(MemoryStack stack) {
        return new StdVideoEncodeH264SliceHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264SliceHeader calloc(MemoryStack stack) {
        return new StdVideoEncodeH264SliceHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeH264SliceHeaderFlags nflags(long struct) {
        return StdVideoEncodeH264SliceHeaderFlags.create(struct + FLAGS);
    }

    public static int nfirst_mb_in_slice(long struct) {
        return MemoryUtil.memGetInt(struct + FIRST_MB_IN_SLICE);
    }

    public static int nslice_type(long struct) {
        return MemoryUtil.memGetInt(struct + SLICE_TYPE);
    }

    public static byte nslice_alpha_c0_offset_div2(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_ALPHA_C0_OFFSET_DIV2);
    }

    public static byte nslice_beta_offset_div2(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_BETA_OFFSET_DIV2);
    }

    public static byte nslice_qp_delta(long struct) {
        return MemoryUtil.memGetByte(struct + SLICE_QP_DELTA);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static int ncabac_init_idc(long struct) {
        return MemoryUtil.memGetInt(struct + CABAC_INIT_IDC);
    }

    public static int ndisable_deblocking_filter_idc(long struct) {
        return MemoryUtil.memGetInt(struct + DISABLE_DEBLOCKING_FILTER_IDC);
    }

    public static StdVideoEncodeH264WeightTable npWeightTable(long struct) {
        return StdVideoEncodeH264WeightTable.create(MemoryUtil.memGetAddress(struct + PWEIGHTTABLE));
    }

    public static void nflags(long struct, StdVideoEncodeH264SliceHeaderFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeH264SliceHeaderFlags.SIZEOF);
    }

    public static void nfirst_mb_in_slice(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRST_MB_IN_SLICE, value);
    }

    public static void nslice_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + SLICE_TYPE, value);
    }

    public static void nslice_alpha_c0_offset_div2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_ALPHA_C0_OFFSET_DIV2, value);
    }

    public static void nslice_beta_offset_div2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_BETA_OFFSET_DIV2, value);
    }

    public static void nslice_qp_delta(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SLICE_QP_DELTA, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void ncabac_init_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + CABAC_INIT_IDC, value);
    }

    public static void ndisable_deblocking_filter_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISABLE_DEBLOCKING_FILTER_IDC, value);
    }

    public static void npWeightTable(long struct, StdVideoEncodeH264WeightTable value) {
        MemoryUtil.memPutAddress(struct + PWEIGHTTABLE, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PWEIGHTTABLE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeader$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeader$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264SliceHeader, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264SliceHeader ELEMENT_FACTORY = StdVideoEncodeH264SliceHeader.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264SliceHeader.SIZEOF);
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
        public StdVideoEncodeH264SliceHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeH264SliceHeaderFlags flags() {
            return StdVideoEncodeH264SliceHeader.nflags(address());
        }

        @NativeType("uint32_t")
        public int first_mb_in_slice() {
            return StdVideoEncodeH264SliceHeader.nfirst_mb_in_slice(address());
        }

        @NativeType("StdVideoH264SliceType")
        public int slice_type() {
            return StdVideoEncodeH264SliceHeader.nslice_type(address());
        }

        @NativeType("int8_t")
        public byte slice_alpha_c0_offset_div2() {
            return StdVideoEncodeH264SliceHeader.nslice_alpha_c0_offset_div2(address());
        }

        @NativeType("int8_t")
        public byte slice_beta_offset_div2() {
            return StdVideoEncodeH264SliceHeader.nslice_beta_offset_div2(address());
        }

        @NativeType("int8_t")
        public byte slice_qp_delta() {
            return StdVideoEncodeH264SliceHeader.nslice_qp_delta(address());
        }

        @NativeType("StdVideoH264CabacInitIdc")
        public int cabac_init_idc() {
            return StdVideoEncodeH264SliceHeader.ncabac_init_idc(address());
        }

        @NativeType("StdVideoH264DisableDeblockingFilterIdc")
        public int disable_deblocking_filter_idc() {
            return StdVideoEncodeH264SliceHeader.ndisable_deblocking_filter_idc(address());
        }

        @NativeType("StdVideoEncodeH264WeightTable const *")
        public StdVideoEncodeH264WeightTable pWeightTable() {
            return StdVideoEncodeH264SliceHeader.npWeightTable(address());
        }

        public Buffer flags(StdVideoEncodeH264SliceHeaderFlags value) {
            StdVideoEncodeH264SliceHeader.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeH264SliceHeaderFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer first_mb_in_slice(@NativeType("uint32_t") int value) {
            StdVideoEncodeH264SliceHeader.nfirst_mb_in_slice(address(), value);
            return this;
        }

        public Buffer slice_type(@NativeType("StdVideoH264SliceType") int value) {
            StdVideoEncodeH264SliceHeader.nslice_type(address(), value);
            return this;
        }

        public Buffer slice_alpha_c0_offset_div2(@NativeType("int8_t") byte value) {
            StdVideoEncodeH264SliceHeader.nslice_alpha_c0_offset_div2(address(), value);
            return this;
        }

        public Buffer slice_beta_offset_div2(@NativeType("int8_t") byte value) {
            StdVideoEncodeH264SliceHeader.nslice_beta_offset_div2(address(), value);
            return this;
        }

        public Buffer slice_qp_delta(@NativeType("int8_t") byte value) {
            StdVideoEncodeH264SliceHeader.nslice_qp_delta(address(), value);
            return this;
        }

        public Buffer cabac_init_idc(@NativeType("StdVideoH264CabacInitIdc") int value) {
            StdVideoEncodeH264SliceHeader.ncabac_init_idc(address(), value);
            return this;
        }

        public Buffer disable_deblocking_filter_idc(@NativeType("StdVideoH264DisableDeblockingFilterIdc") int value) {
            StdVideoEncodeH264SliceHeader.ndisable_deblocking_filter_idc(address(), value);
            return this;
        }

        public Buffer pWeightTable(@NativeType("StdVideoEncodeH264WeightTable const *") StdVideoEncodeH264WeightTable value) {
            StdVideoEncodeH264SliceHeader.npWeightTable(address(), value);
            return this;
        }
    }
}
