package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SpsFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SpsFlags.class */
public class StdVideoH264SpsFlags extends Struct<StdVideoH264SpsFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoH264SpsFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH264SpsFlags create(long address, ByteBuffer container) {
        return new StdVideoH264SpsFlags(address, container);
    }

    public StdVideoH264SpsFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean constraint_set0_flag() {
        return nconstraint_set0_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean constraint_set1_flag() {
        return nconstraint_set1_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean constraint_set2_flag() {
        return nconstraint_set2_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean constraint_set3_flag() {
        return nconstraint_set3_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean constraint_set4_flag() {
        return nconstraint_set4_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean constraint_set5_flag() {
        return nconstraint_set5_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean direct_8x8_inference_flag() {
        return ndirect_8x8_inference_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean mb_adaptive_frame_field_flag() {
        return nmb_adaptive_frame_field_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean frame_mbs_only_flag() {
        return nframe_mbs_only_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean delta_pic_order_always_zero_flag() {
        return ndelta_pic_order_always_zero_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean separate_colour_plane_flag() {
        return nseparate_colour_plane_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean gaps_in_frame_num_value_allowed_flag() {
        return ngaps_in_frame_num_value_allowed_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean qpprime_y_zero_transform_bypass_flag() {
        return nqpprime_y_zero_transform_bypass_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean frame_cropping_flag() {
        return nframe_cropping_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean seq_scaling_matrix_present_flag() {
        return nseq_scaling_matrix_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean vui_parameters_present_flag() {
        return nvui_parameters_present_flag(address()) != 0;
    }

    public StdVideoH264SpsFlags constraint_set0_flag(@NativeType("uint32_t") boolean value) {
        nconstraint_set0_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags constraint_set1_flag(@NativeType("uint32_t") boolean value) {
        nconstraint_set1_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags constraint_set2_flag(@NativeType("uint32_t") boolean value) {
        nconstraint_set2_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags constraint_set3_flag(@NativeType("uint32_t") boolean value) {
        nconstraint_set3_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags constraint_set4_flag(@NativeType("uint32_t") boolean value) {
        nconstraint_set4_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags constraint_set5_flag(@NativeType("uint32_t") boolean value) {
        nconstraint_set5_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags direct_8x8_inference_flag(@NativeType("uint32_t") boolean value) {
        ndirect_8x8_inference_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags mb_adaptive_frame_field_flag(@NativeType("uint32_t") boolean value) {
        nmb_adaptive_frame_field_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags frame_mbs_only_flag(@NativeType("uint32_t") boolean value) {
        nframe_mbs_only_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags delta_pic_order_always_zero_flag(@NativeType("uint32_t") boolean value) {
        ndelta_pic_order_always_zero_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags separate_colour_plane_flag(@NativeType("uint32_t") boolean value) {
        nseparate_colour_plane_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags gaps_in_frame_num_value_allowed_flag(@NativeType("uint32_t") boolean value) {
        ngaps_in_frame_num_value_allowed_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags qpprime_y_zero_transform_bypass_flag(@NativeType("uint32_t") boolean value) {
        nqpprime_y_zero_transform_bypass_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags frame_cropping_flag(@NativeType("uint32_t") boolean value) {
        nframe_cropping_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags seq_scaling_matrix_present_flag(@NativeType("uint32_t") boolean value) {
        nseq_scaling_matrix_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags vui_parameters_present_flag(@NativeType("uint32_t") boolean value) {
        nvui_parameters_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsFlags set(boolean constraint_set0_flag, boolean constraint_set1_flag, boolean constraint_set2_flag, boolean constraint_set3_flag, boolean constraint_set4_flag, boolean constraint_set5_flag, boolean direct_8x8_inference_flag, boolean mb_adaptive_frame_field_flag, boolean frame_mbs_only_flag, boolean delta_pic_order_always_zero_flag, boolean separate_colour_plane_flag, boolean gaps_in_frame_num_value_allowed_flag, boolean qpprime_y_zero_transform_bypass_flag, boolean frame_cropping_flag, boolean seq_scaling_matrix_present_flag, boolean vui_parameters_present_flag) {
        constraint_set0_flag(constraint_set0_flag);
        constraint_set1_flag(constraint_set1_flag);
        constraint_set2_flag(constraint_set2_flag);
        constraint_set3_flag(constraint_set3_flag);
        constraint_set4_flag(constraint_set4_flag);
        constraint_set5_flag(constraint_set5_flag);
        direct_8x8_inference_flag(direct_8x8_inference_flag);
        mb_adaptive_frame_field_flag(mb_adaptive_frame_field_flag);
        frame_mbs_only_flag(frame_mbs_only_flag);
        delta_pic_order_always_zero_flag(delta_pic_order_always_zero_flag);
        separate_colour_plane_flag(separate_colour_plane_flag);
        gaps_in_frame_num_value_allowed_flag(gaps_in_frame_num_value_allowed_flag);
        qpprime_y_zero_transform_bypass_flag(qpprime_y_zero_transform_bypass_flag);
        frame_cropping_flag(frame_cropping_flag);
        seq_scaling_matrix_present_flag(seq_scaling_matrix_present_flag);
        vui_parameters_present_flag(vui_parameters_present_flag);
        return this;
    }

    public StdVideoH264SpsFlags set(StdVideoH264SpsFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH264SpsFlags malloc() {
        return new StdVideoH264SpsFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH264SpsFlags calloc() {
        return new StdVideoH264SpsFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH264SpsFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH264SpsFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH264SpsFlags create(long address) {
        return new StdVideoH264SpsFlags(address, null);
    }

    public static StdVideoH264SpsFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH264SpsFlags(address, null);
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

    public static StdVideoH264SpsFlags malloc(MemoryStack stack) {
        return new StdVideoH264SpsFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH264SpsFlags calloc(MemoryStack stack) {
        return new StdVideoH264SpsFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nconstraint_set0_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nconstraint_set1_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nconstraint_set2_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nconstraint_set3_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nconstraint_set4_flag(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int nconstraint_set5_flag(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int ndirect_8x8_inference_flag(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int nmb_adaptive_frame_field_flag(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static int nframe_mbs_only_flag(long struct) {
        return (nbitfield0(struct) & 256) >>> 8;
    }

    public static int ndelta_pic_order_always_zero_flag(long struct) {
        return (nbitfield0(struct) & 512) >>> 9;
    }

    public static int nseparate_colour_plane_flag(long struct) {
        return (nbitfield0(struct) & 1024) >>> 10;
    }

    public static int ngaps_in_frame_num_value_allowed_flag(long struct) {
        return (nbitfield0(struct) & 2048) >>> 11;
    }

    public static int nqpprime_y_zero_transform_bypass_flag(long struct) {
        return (nbitfield0(struct) & 4096) >>> 12;
    }

    public static int nframe_cropping_flag(long struct) {
        return (nbitfield0(struct) & 8192) >>> 13;
    }

    public static int nseq_scaling_matrix_present_flag(long struct) {
        return (nbitfield0(struct) & 16384) >>> 14;
    }

    public static int nvui_parameters_present_flag(long struct) {
        return (nbitfield0(struct) & 32768) >>> 15;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nconstraint_set0_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nconstraint_set1_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nconstraint_set2_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nconstraint_set3_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nconstraint_set4_flag(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void nconstraint_set5_flag(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void ndirect_8x8_inference_flag(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void nmb_adaptive_frame_field_flag(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    public static void nframe_mbs_only_flag(long struct, int value) {
        nbitfield0(struct, ((value << 8) & 256) | (nbitfield0(struct) & (-257)));
    }

    public static void ndelta_pic_order_always_zero_flag(long struct, int value) {
        nbitfield0(struct, ((value << 9) & 512) | (nbitfield0(struct) & (-513)));
    }

    public static void nseparate_colour_plane_flag(long struct, int value) {
        nbitfield0(struct, ((value << 10) & 1024) | (nbitfield0(struct) & (-1025)));
    }

    public static void ngaps_in_frame_num_value_allowed_flag(long struct, int value) {
        nbitfield0(struct, ((value << 11) & 2048) | (nbitfield0(struct) & (-2049)));
    }

    public static void nqpprime_y_zero_transform_bypass_flag(long struct, int value) {
        nbitfield0(struct, ((value << 12) & 4096) | (nbitfield0(struct) & (-4097)));
    }

    public static void nframe_cropping_flag(long struct, int value) {
        nbitfield0(struct, ((value << 13) & 8192) | (nbitfield0(struct) & (-8193)));
    }

    public static void nseq_scaling_matrix_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 14) & 16384) | (nbitfield0(struct) & (-16385)));
    }

    public static void nvui_parameters_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 15) & 32768) | (nbitfield0(struct) & (-32769)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SpsFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SpsFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH264SpsFlags, Buffer> implements NativeResource {
        private static final StdVideoH264SpsFlags ELEMENT_FACTORY = StdVideoH264SpsFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH264SpsFlags.SIZEOF);
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
        public StdVideoH264SpsFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean constraint_set0_flag() {
            return StdVideoH264SpsFlags.nconstraint_set0_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean constraint_set1_flag() {
            return StdVideoH264SpsFlags.nconstraint_set1_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean constraint_set2_flag() {
            return StdVideoH264SpsFlags.nconstraint_set2_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean constraint_set3_flag() {
            return StdVideoH264SpsFlags.nconstraint_set3_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean constraint_set4_flag() {
            return StdVideoH264SpsFlags.nconstraint_set4_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean constraint_set5_flag() {
            return StdVideoH264SpsFlags.nconstraint_set5_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean direct_8x8_inference_flag() {
            return StdVideoH264SpsFlags.ndirect_8x8_inference_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean mb_adaptive_frame_field_flag() {
            return StdVideoH264SpsFlags.nmb_adaptive_frame_field_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean frame_mbs_only_flag() {
            return StdVideoH264SpsFlags.nframe_mbs_only_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean delta_pic_order_always_zero_flag() {
            return StdVideoH264SpsFlags.ndelta_pic_order_always_zero_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean separate_colour_plane_flag() {
            return StdVideoH264SpsFlags.nseparate_colour_plane_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean gaps_in_frame_num_value_allowed_flag() {
            return StdVideoH264SpsFlags.ngaps_in_frame_num_value_allowed_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean qpprime_y_zero_transform_bypass_flag() {
            return StdVideoH264SpsFlags.nqpprime_y_zero_transform_bypass_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean frame_cropping_flag() {
            return StdVideoH264SpsFlags.nframe_cropping_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean seq_scaling_matrix_present_flag() {
            return StdVideoH264SpsFlags.nseq_scaling_matrix_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean vui_parameters_present_flag() {
            return StdVideoH264SpsFlags.nvui_parameters_present_flag(address()) != 0;
        }

        public Buffer constraint_set0_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nconstraint_set0_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer constraint_set1_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nconstraint_set1_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer constraint_set2_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nconstraint_set2_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer constraint_set3_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nconstraint_set3_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer constraint_set4_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nconstraint_set4_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer constraint_set5_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nconstraint_set5_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer direct_8x8_inference_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.ndirect_8x8_inference_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer mb_adaptive_frame_field_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nmb_adaptive_frame_field_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer frame_mbs_only_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nframe_mbs_only_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer delta_pic_order_always_zero_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.ndelta_pic_order_always_zero_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer separate_colour_plane_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nseparate_colour_plane_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer gaps_in_frame_num_value_allowed_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.ngaps_in_frame_num_value_allowed_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer qpprime_y_zero_transform_bypass_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nqpprime_y_zero_transform_bypass_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer frame_cropping_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nframe_cropping_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer seq_scaling_matrix_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nseq_scaling_matrix_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vui_parameters_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsFlags.nvui_parameters_present_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
