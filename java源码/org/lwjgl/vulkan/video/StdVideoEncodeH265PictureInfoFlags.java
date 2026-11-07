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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfoFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfoFlags.class */
public class StdVideoEncodeH265PictureInfoFlags extends Struct<StdVideoEncodeH265PictureInfoFlags> implements NativeResource {
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

    protected StdVideoEncodeH265PictureInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH265PictureInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoEncodeH265PictureInfoFlags(address, container);
    }

    public StdVideoEncodeH265PictureInfoFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean is_reference() {
        return nis_reference(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean IrapPicFlag() {
        return nIrapPicFlag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean used_for_long_term_reference() {
        return nused_for_long_term_reference(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean discardable_flag() {
        return ndiscardable_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean cross_layer_bla_flag() {
        return ncross_layer_bla_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pic_output_flag() {
        return npic_output_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean no_output_of_prior_pics_flag() {
        return nno_output_of_prior_pics_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean short_term_ref_pic_set_sps_flag() {
        return nshort_term_ref_pic_set_sps_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean slice_temporal_mvp_enabled_flag() {
        return nslice_temporal_mvp_enabled_flag(address()) != 0;
    }

    public StdVideoEncodeH265PictureInfoFlags is_reference(@NativeType("uint32_t") boolean value) {
        nis_reference(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265PictureInfoFlags IrapPicFlag(@NativeType("uint32_t") boolean value) {
        nIrapPicFlag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265PictureInfoFlags used_for_long_term_reference(@NativeType("uint32_t") boolean value) {
        nused_for_long_term_reference(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265PictureInfoFlags discardable_flag(@NativeType("uint32_t") boolean value) {
        ndiscardable_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265PictureInfoFlags cross_layer_bla_flag(@NativeType("uint32_t") boolean value) {
        ncross_layer_bla_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265PictureInfoFlags pic_output_flag(@NativeType("uint32_t") boolean value) {
        npic_output_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265PictureInfoFlags no_output_of_prior_pics_flag(@NativeType("uint32_t") boolean value) {
        nno_output_of_prior_pics_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265PictureInfoFlags short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") boolean value) {
        nshort_term_ref_pic_set_sps_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265PictureInfoFlags slice_temporal_mvp_enabled_flag(@NativeType("uint32_t") boolean value) {
        nslice_temporal_mvp_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265PictureInfoFlags set(boolean is_reference, boolean IrapPicFlag, boolean used_for_long_term_reference, boolean discardable_flag, boolean cross_layer_bla_flag, boolean pic_output_flag, boolean no_output_of_prior_pics_flag, boolean short_term_ref_pic_set_sps_flag, boolean slice_temporal_mvp_enabled_flag) {
        is_reference(is_reference);
        IrapPicFlag(IrapPicFlag);
        used_for_long_term_reference(used_for_long_term_reference);
        discardable_flag(discardable_flag);
        cross_layer_bla_flag(cross_layer_bla_flag);
        pic_output_flag(pic_output_flag);
        no_output_of_prior_pics_flag(no_output_of_prior_pics_flag);
        short_term_ref_pic_set_sps_flag(short_term_ref_pic_set_sps_flag);
        slice_temporal_mvp_enabled_flag(slice_temporal_mvp_enabled_flag);
        return this;
    }

    public StdVideoEncodeH265PictureInfoFlags set(StdVideoEncodeH265PictureInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH265PictureInfoFlags malloc() {
        return new StdVideoEncodeH265PictureInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH265PictureInfoFlags calloc() {
        return new StdVideoEncodeH265PictureInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH265PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265PictureInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH265PictureInfoFlags create(long address) {
        return new StdVideoEncodeH265PictureInfoFlags(address, null);
    }

    public static StdVideoEncodeH265PictureInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH265PictureInfoFlags(address, null);
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

    public static StdVideoEncodeH265PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH265PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH265PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH265PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nis_reference(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nIrapPicFlag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nused_for_long_term_reference(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int ndiscardable_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int ncross_layer_bla_flag(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int npic_output_flag(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int nno_output_of_prior_pics_flag(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int nshort_term_ref_pic_set_sps_flag(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static int nslice_temporal_mvp_enabled_flag(long struct) {
        return (nbitfield0(struct) & 256) >>> 8;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & 8388607;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nis_reference(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nIrapPicFlag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nused_for_long_term_reference(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void ndiscardable_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void ncross_layer_bla_flag(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void npic_output_flag(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void nno_output_of_prior_pics_flag(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void nshort_term_ref_pic_set_sps_flag(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    public static void nslice_temporal_mvp_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 8) & 256) | (nbitfield0(struct) & (-257)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-8388608)) | (value & 8388607));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfoFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265PictureInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoEncodeH265PictureInfoFlags ELEMENT_FACTORY = StdVideoEncodeH265PictureInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH265PictureInfoFlags.SIZEOF);
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
        public StdVideoEncodeH265PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean is_reference() {
            return StdVideoEncodeH265PictureInfoFlags.nis_reference(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean IrapPicFlag() {
            return StdVideoEncodeH265PictureInfoFlags.nIrapPicFlag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean used_for_long_term_reference() {
            return StdVideoEncodeH265PictureInfoFlags.nused_for_long_term_reference(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean discardable_flag() {
            return StdVideoEncodeH265PictureInfoFlags.ndiscardable_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean cross_layer_bla_flag() {
            return StdVideoEncodeH265PictureInfoFlags.ncross_layer_bla_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pic_output_flag() {
            return StdVideoEncodeH265PictureInfoFlags.npic_output_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean no_output_of_prior_pics_flag() {
            return StdVideoEncodeH265PictureInfoFlags.nno_output_of_prior_pics_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean short_term_ref_pic_set_sps_flag() {
            return StdVideoEncodeH265PictureInfoFlags.nshort_term_ref_pic_set_sps_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean slice_temporal_mvp_enabled_flag() {
            return StdVideoEncodeH265PictureInfoFlags.nslice_temporal_mvp_enabled_flag(address()) != 0;
        }

        public Buffer is_reference(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265PictureInfoFlags.nis_reference(address(), value ? 1 : 0);
            return this;
        }

        public Buffer IrapPicFlag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265PictureInfoFlags.nIrapPicFlag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer used_for_long_term_reference(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265PictureInfoFlags.nused_for_long_term_reference(address(), value ? 1 : 0);
            return this;
        }

        public Buffer discardable_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265PictureInfoFlags.ndiscardable_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cross_layer_bla_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265PictureInfoFlags.ncross_layer_bla_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pic_output_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265PictureInfoFlags.npic_output_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer no_output_of_prior_pics_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265PictureInfoFlags.nno_output_of_prior_pics_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265PictureInfoFlags.nshort_term_ref_pic_set_sps_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer slice_temporal_mvp_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265PictureInfoFlags.nslice_temporal_mvp_enabled_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
