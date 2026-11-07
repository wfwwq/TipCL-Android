package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeaderFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeaderFlags.class */
public class StdVideoEncodeH265SliceSegmentHeaderFlags extends Struct<StdVideoEncodeH265SliceSegmentHeaderFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;
    public static final int BITFIELD1;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoEncodeH265SliceSegmentHeaderFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH265SliceSegmentHeaderFlags create(long address, ByteBuffer container) {
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(address, container);
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean first_slice_segment_in_pic_flag() {
        return nfirst_slice_segment_in_pic_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean dependent_slice_segment_flag() {
        return ndependent_slice_segment_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean slice_sao_luma_flag() {
        return nslice_sao_luma_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean slice_sao_chroma_flag() {
        return nslice_sao_chroma_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean num_ref_idx_active_override_flag() {
        return nnum_ref_idx_active_override_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean mvd_l1_zero_flag() {
        return nmvd_l1_zero_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean cabac_init_flag() {
        return ncabac_init_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean cu_chroma_qp_offset_enabled_flag() {
        return ncu_chroma_qp_offset_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean deblocking_filter_override_flag() {
        return ndeblocking_filter_override_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean slice_deblocking_filter_disabled_flag() {
        return nslice_deblocking_filter_disabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean collocated_from_l0_flag() {
        return ncollocated_from_l0_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean slice_loop_filter_across_slices_enabled_flag() {
        return nslice_loop_filter_across_slices_enabled_flag(address()) != 0;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags first_slice_segment_in_pic_flag(@NativeType("uint32_t") boolean value) {
        nfirst_slice_segment_in_pic_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags dependent_slice_segment_flag(@NativeType("uint32_t") boolean value) {
        ndependent_slice_segment_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_sao_luma_flag(@NativeType("uint32_t") boolean value) {
        nslice_sao_luma_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_sao_chroma_flag(@NativeType("uint32_t") boolean value) {
        nslice_sao_chroma_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags num_ref_idx_active_override_flag(@NativeType("uint32_t") boolean value) {
        nnum_ref_idx_active_override_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags mvd_l1_zero_flag(@NativeType("uint32_t") boolean value) {
        nmvd_l1_zero_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags cabac_init_flag(@NativeType("uint32_t") boolean value) {
        ncabac_init_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags cu_chroma_qp_offset_enabled_flag(@NativeType("uint32_t") boolean value) {
        ncu_chroma_qp_offset_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags deblocking_filter_override_flag(@NativeType("uint32_t") boolean value) {
        ndeblocking_filter_override_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_deblocking_filter_disabled_flag(@NativeType("uint32_t") boolean value) {
        nslice_deblocking_filter_disabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags collocated_from_l0_flag(@NativeType("uint32_t") boolean value) {
        ncollocated_from_l0_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags slice_loop_filter_across_slices_enabled_flag(@NativeType("uint32_t") boolean value) {
        nslice_loop_filter_across_slices_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags set(boolean first_slice_segment_in_pic_flag, boolean dependent_slice_segment_flag, boolean slice_sao_luma_flag, boolean slice_sao_chroma_flag, boolean num_ref_idx_active_override_flag, boolean mvd_l1_zero_flag, boolean cabac_init_flag, boolean cu_chroma_qp_offset_enabled_flag, boolean deblocking_filter_override_flag, boolean slice_deblocking_filter_disabled_flag, boolean collocated_from_l0_flag, boolean slice_loop_filter_across_slices_enabled_flag) {
        first_slice_segment_in_pic_flag(first_slice_segment_in_pic_flag);
        dependent_slice_segment_flag(dependent_slice_segment_flag);
        slice_sao_luma_flag(slice_sao_luma_flag);
        slice_sao_chroma_flag(slice_sao_chroma_flag);
        num_ref_idx_active_override_flag(num_ref_idx_active_override_flag);
        mvd_l1_zero_flag(mvd_l1_zero_flag);
        cabac_init_flag(cabac_init_flag);
        cu_chroma_qp_offset_enabled_flag(cu_chroma_qp_offset_enabled_flag);
        deblocking_filter_override_flag(deblocking_filter_override_flag);
        slice_deblocking_filter_disabled_flag(slice_deblocking_filter_disabled_flag);
        collocated_from_l0_flag(collocated_from_l0_flag);
        slice_loop_filter_across_slices_enabled_flag(slice_loop_filter_across_slices_enabled_flag);
        return this;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags set(StdVideoEncodeH265SliceSegmentHeaderFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags malloc() {
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags calloc() {
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags create(long address) {
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(address, null);
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(address, null);
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

    public static StdVideoEncodeH265SliceSegmentHeaderFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbitfield0(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD0);
    }

    public static int nfirst_slice_segment_in_pic_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int ndependent_slice_segment_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nslice_sao_luma_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nslice_sao_chroma_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nnum_ref_idx_active_override_flag(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int nmvd_l1_zero_flag(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int ncabac_init_flag(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int ncu_chroma_qp_offset_enabled_flag(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static int ndeblocking_filter_override_flag(long struct) {
        return (nbitfield0(struct) & 256) >>> 8;
    }

    public static int nslice_deblocking_filter_disabled_flag(long struct) {
        return (nbitfield0(struct) & 512) >>> 9;
    }

    public static int ncollocated_from_l0_flag(long struct) {
        return (nbitfield0(struct) & 1024) >>> 10;
    }

    public static int nslice_loop_filter_across_slices_enabled_flag(long struct) {
        return (nbitfield0(struct) & 2048) >>> 11;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & GL11.GL_ALL_ATTRIB_BITS;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nfirst_slice_segment_in_pic_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void ndependent_slice_segment_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nslice_sao_luma_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nslice_sao_chroma_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nnum_ref_idx_active_override_flag(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void nmvd_l1_zero_flag(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void ncabac_init_flag(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void ncu_chroma_qp_offset_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    public static void ndeblocking_filter_override_flag(long struct, int value) {
        nbitfield0(struct, ((value << 8) & 256) | (nbitfield0(struct) & (-257)));
    }

    public static void nslice_deblocking_filter_disabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 9) & 512) | (nbitfield0(struct) & (-513)));
    }

    public static void ncollocated_from_l0_flag(long struct, int value) {
        nbitfield0(struct, ((value << 10) & 1024) | (nbitfield0(struct) & (-1025)));
    }

    public static void nslice_loop_filter_across_slices_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 11) & 2048) | (nbitfield0(struct) & (-2049)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-1048576)) | (value & GL11.GL_ALL_ATTRIB_BITS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeaderFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeaderFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265SliceSegmentHeaderFlags, Buffer> implements NativeResource {
        private static final StdVideoEncodeH265SliceSegmentHeaderFlags ELEMENT_FACTORY = StdVideoEncodeH265SliceSegmentHeaderFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH265SliceSegmentHeaderFlags.SIZEOF);
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
        public StdVideoEncodeH265SliceSegmentHeaderFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean first_slice_segment_in_pic_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.nfirst_slice_segment_in_pic_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean dependent_slice_segment_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.ndependent_slice_segment_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean slice_sao_luma_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_sao_luma_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean slice_sao_chroma_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_sao_chroma_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean num_ref_idx_active_override_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.nnum_ref_idx_active_override_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean mvd_l1_zero_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.nmvd_l1_zero_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean cabac_init_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.ncabac_init_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean cu_chroma_qp_offset_enabled_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.ncu_chroma_qp_offset_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean deblocking_filter_override_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.ndeblocking_filter_override_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean slice_deblocking_filter_disabled_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_deblocking_filter_disabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean collocated_from_l0_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.ncollocated_from_l0_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean slice_loop_filter_across_slices_enabled_flag() {
            return StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_loop_filter_across_slices_enabled_flag(address()) != 0;
        }

        public Buffer first_slice_segment_in_pic_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.nfirst_slice_segment_in_pic_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dependent_slice_segment_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.ndependent_slice_segment_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer slice_sao_luma_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_sao_luma_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer slice_sao_chroma_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_sao_chroma_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer num_ref_idx_active_override_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.nnum_ref_idx_active_override_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer mvd_l1_zero_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.nmvd_l1_zero_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cabac_init_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.ncabac_init_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cu_chroma_qp_offset_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.ncu_chroma_qp_offset_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer deblocking_filter_override_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.ndeblocking_filter_override_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer slice_deblocking_filter_disabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_deblocking_filter_disabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer collocated_from_l0_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.ncollocated_from_l0_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer slice_loop_filter_across_slices_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265SliceSegmentHeaderFlags.nslice_loop_filter_across_slices_enabled_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
