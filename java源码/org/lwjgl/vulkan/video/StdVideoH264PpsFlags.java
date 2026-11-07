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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264PpsFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264PpsFlags.class */
public class StdVideoH264PpsFlags extends Struct<StdVideoH264PpsFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoH264PpsFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH264PpsFlags create(long address, ByteBuffer container) {
        return new StdVideoH264PpsFlags(address, container);
    }

    public StdVideoH264PpsFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean transform_8x8_mode_flag() {
        return ntransform_8x8_mode_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean redundant_pic_cnt_present_flag() {
        return nredundant_pic_cnt_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean constrained_intra_pred_flag() {
        return nconstrained_intra_pred_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean deblocking_filter_control_present_flag() {
        return ndeblocking_filter_control_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean weighted_pred_flag() {
        return nweighted_pred_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean bottom_field_pic_order_in_frame_present_flag() {
        return nbottom_field_pic_order_in_frame_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean entropy_coding_mode_flag() {
        return nentropy_coding_mode_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pic_scaling_matrix_present_flag() {
        return npic_scaling_matrix_present_flag(address()) != 0;
    }

    public StdVideoH264PpsFlags transform_8x8_mode_flag(@NativeType("uint32_t") boolean value) {
        ntransform_8x8_mode_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264PpsFlags redundant_pic_cnt_present_flag(@NativeType("uint32_t") boolean value) {
        nredundant_pic_cnt_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264PpsFlags constrained_intra_pred_flag(@NativeType("uint32_t") boolean value) {
        nconstrained_intra_pred_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264PpsFlags deblocking_filter_control_present_flag(@NativeType("uint32_t") boolean value) {
        ndeblocking_filter_control_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264PpsFlags weighted_pred_flag(@NativeType("uint32_t") boolean value) {
        nweighted_pred_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264PpsFlags bottom_field_pic_order_in_frame_present_flag(@NativeType("uint32_t") boolean value) {
        nbottom_field_pic_order_in_frame_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264PpsFlags entropy_coding_mode_flag(@NativeType("uint32_t") boolean value) {
        nentropy_coding_mode_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264PpsFlags pic_scaling_matrix_present_flag(@NativeType("uint32_t") boolean value) {
        npic_scaling_matrix_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264PpsFlags set(boolean transform_8x8_mode_flag, boolean redundant_pic_cnt_present_flag, boolean constrained_intra_pred_flag, boolean deblocking_filter_control_present_flag, boolean weighted_pred_flag, boolean bottom_field_pic_order_in_frame_present_flag, boolean entropy_coding_mode_flag, boolean pic_scaling_matrix_present_flag) {
        transform_8x8_mode_flag(transform_8x8_mode_flag);
        redundant_pic_cnt_present_flag(redundant_pic_cnt_present_flag);
        constrained_intra_pred_flag(constrained_intra_pred_flag);
        deblocking_filter_control_present_flag(deblocking_filter_control_present_flag);
        weighted_pred_flag(weighted_pred_flag);
        bottom_field_pic_order_in_frame_present_flag(bottom_field_pic_order_in_frame_present_flag);
        entropy_coding_mode_flag(entropy_coding_mode_flag);
        pic_scaling_matrix_present_flag(pic_scaling_matrix_present_flag);
        return this;
    }

    public StdVideoH264PpsFlags set(StdVideoH264PpsFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH264PpsFlags malloc() {
        return new StdVideoH264PpsFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH264PpsFlags calloc() {
        return new StdVideoH264PpsFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH264PpsFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH264PpsFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH264PpsFlags create(long address) {
        return new StdVideoH264PpsFlags(address, null);
    }

    public static StdVideoH264PpsFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH264PpsFlags(address, null);
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

    public static StdVideoH264PpsFlags malloc(MemoryStack stack) {
        return new StdVideoH264PpsFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH264PpsFlags calloc(MemoryStack stack) {
        return new StdVideoH264PpsFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntransform_8x8_mode_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nredundant_pic_cnt_present_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nconstrained_intra_pred_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int ndeblocking_filter_control_present_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nweighted_pred_flag(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int nbottom_field_pic_order_in_frame_present_flag(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int nentropy_coding_mode_flag(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int npic_scaling_matrix_present_flag(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ntransform_8x8_mode_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nredundant_pic_cnt_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nconstrained_intra_pred_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void ndeblocking_filter_control_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nweighted_pred_flag(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void nbottom_field_pic_order_in_frame_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void nentropy_coding_mode_flag(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void npic_scaling_matrix_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264PpsFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264PpsFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH264PpsFlags, Buffer> implements NativeResource {
        private static final StdVideoH264PpsFlags ELEMENT_FACTORY = StdVideoH264PpsFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH264PpsFlags.SIZEOF);
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
        public StdVideoH264PpsFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean transform_8x8_mode_flag() {
            return StdVideoH264PpsFlags.ntransform_8x8_mode_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean redundant_pic_cnt_present_flag() {
            return StdVideoH264PpsFlags.nredundant_pic_cnt_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean constrained_intra_pred_flag() {
            return StdVideoH264PpsFlags.nconstrained_intra_pred_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean deblocking_filter_control_present_flag() {
            return StdVideoH264PpsFlags.ndeblocking_filter_control_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean weighted_pred_flag() {
            return StdVideoH264PpsFlags.nweighted_pred_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean bottom_field_pic_order_in_frame_present_flag() {
            return StdVideoH264PpsFlags.nbottom_field_pic_order_in_frame_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean entropy_coding_mode_flag() {
            return StdVideoH264PpsFlags.nentropy_coding_mode_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pic_scaling_matrix_present_flag() {
            return StdVideoH264PpsFlags.npic_scaling_matrix_present_flag(address()) != 0;
        }

        public Buffer transform_8x8_mode_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264PpsFlags.ntransform_8x8_mode_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer redundant_pic_cnt_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264PpsFlags.nredundant_pic_cnt_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer constrained_intra_pred_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264PpsFlags.nconstrained_intra_pred_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer deblocking_filter_control_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264PpsFlags.ndeblocking_filter_control_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer weighted_pred_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264PpsFlags.nweighted_pred_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bottom_field_pic_order_in_frame_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264PpsFlags.nbottom_field_pic_order_in_frame_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer entropy_coding_mode_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264PpsFlags.nentropy_coding_mode_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pic_scaling_matrix_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264PpsFlags.npic_scaling_matrix_present_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
