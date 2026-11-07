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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SpsVuiFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SpsVuiFlags.class */
public class StdVideoH265SpsVuiFlags extends Struct<StdVideoH265SpsVuiFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoH265SpsVuiFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265SpsVuiFlags create(long address, ByteBuffer container) {
        return new StdVideoH265SpsVuiFlags(address, container);
    }

    public StdVideoH265SpsVuiFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean aspect_ratio_info_present_flag() {
        return naspect_ratio_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean overscan_info_present_flag() {
        return noverscan_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean overscan_appropriate_flag() {
        return noverscan_appropriate_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean video_signal_type_present_flag() {
        return nvideo_signal_type_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean video_full_range_flag() {
        return nvideo_full_range_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean colour_description_present_flag() {
        return ncolour_description_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean chroma_loc_info_present_flag() {
        return nchroma_loc_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean neutral_chroma_indication_flag() {
        return nneutral_chroma_indication_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean field_seq_flag() {
        return nfield_seq_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean frame_field_info_present_flag() {
        return nframe_field_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean default_display_window_flag() {
        return ndefault_display_window_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean vui_timing_info_present_flag() {
        return nvui_timing_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean vui_poc_proportional_to_timing_flag() {
        return nvui_poc_proportional_to_timing_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean vui_hrd_parameters_present_flag() {
        return nvui_hrd_parameters_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean bitstream_restriction_flag() {
        return nbitstream_restriction_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean tiles_fixed_structure_flag() {
        return ntiles_fixed_structure_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean motion_vectors_over_pic_boundaries_flag() {
        return nmotion_vectors_over_pic_boundaries_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean restricted_ref_pic_lists_flag() {
        return nrestricted_ref_pic_lists_flag(address()) != 0;
    }

    public StdVideoH265SpsVuiFlags aspect_ratio_info_present_flag(@NativeType("uint32_t") boolean value) {
        naspect_ratio_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags overscan_info_present_flag(@NativeType("uint32_t") boolean value) {
        noverscan_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags overscan_appropriate_flag(@NativeType("uint32_t") boolean value) {
        noverscan_appropriate_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags video_signal_type_present_flag(@NativeType("uint32_t") boolean value) {
        nvideo_signal_type_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags video_full_range_flag(@NativeType("uint32_t") boolean value) {
        nvideo_full_range_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags colour_description_present_flag(@NativeType("uint32_t") boolean value) {
        ncolour_description_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags chroma_loc_info_present_flag(@NativeType("uint32_t") boolean value) {
        nchroma_loc_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags neutral_chroma_indication_flag(@NativeType("uint32_t") boolean value) {
        nneutral_chroma_indication_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags field_seq_flag(@NativeType("uint32_t") boolean value) {
        nfield_seq_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags frame_field_info_present_flag(@NativeType("uint32_t") boolean value) {
        nframe_field_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags default_display_window_flag(@NativeType("uint32_t") boolean value) {
        ndefault_display_window_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags vui_timing_info_present_flag(@NativeType("uint32_t") boolean value) {
        nvui_timing_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags vui_poc_proportional_to_timing_flag(@NativeType("uint32_t") boolean value) {
        nvui_poc_proportional_to_timing_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags vui_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) {
        nvui_hrd_parameters_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags bitstream_restriction_flag(@NativeType("uint32_t") boolean value) {
        nbitstream_restriction_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags tiles_fixed_structure_flag(@NativeType("uint32_t") boolean value) {
        ntiles_fixed_structure_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags motion_vectors_over_pic_boundaries_flag(@NativeType("uint32_t") boolean value) {
        nmotion_vectors_over_pic_boundaries_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags restricted_ref_pic_lists_flag(@NativeType("uint32_t") boolean value) {
        nrestricted_ref_pic_lists_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsVuiFlags set(boolean aspect_ratio_info_present_flag, boolean overscan_info_present_flag, boolean overscan_appropriate_flag, boolean video_signal_type_present_flag, boolean video_full_range_flag, boolean colour_description_present_flag, boolean chroma_loc_info_present_flag, boolean neutral_chroma_indication_flag, boolean field_seq_flag, boolean frame_field_info_present_flag, boolean default_display_window_flag, boolean vui_timing_info_present_flag, boolean vui_poc_proportional_to_timing_flag, boolean vui_hrd_parameters_present_flag, boolean bitstream_restriction_flag, boolean tiles_fixed_structure_flag, boolean motion_vectors_over_pic_boundaries_flag, boolean restricted_ref_pic_lists_flag) {
        aspect_ratio_info_present_flag(aspect_ratio_info_present_flag);
        overscan_info_present_flag(overscan_info_present_flag);
        overscan_appropriate_flag(overscan_appropriate_flag);
        video_signal_type_present_flag(video_signal_type_present_flag);
        video_full_range_flag(video_full_range_flag);
        colour_description_present_flag(colour_description_present_flag);
        chroma_loc_info_present_flag(chroma_loc_info_present_flag);
        neutral_chroma_indication_flag(neutral_chroma_indication_flag);
        field_seq_flag(field_seq_flag);
        frame_field_info_present_flag(frame_field_info_present_flag);
        default_display_window_flag(default_display_window_flag);
        vui_timing_info_present_flag(vui_timing_info_present_flag);
        vui_poc_proportional_to_timing_flag(vui_poc_proportional_to_timing_flag);
        vui_hrd_parameters_present_flag(vui_hrd_parameters_present_flag);
        bitstream_restriction_flag(bitstream_restriction_flag);
        tiles_fixed_structure_flag(tiles_fixed_structure_flag);
        motion_vectors_over_pic_boundaries_flag(motion_vectors_over_pic_boundaries_flag);
        restricted_ref_pic_lists_flag(restricted_ref_pic_lists_flag);
        return this;
    }

    public StdVideoH265SpsVuiFlags set(StdVideoH265SpsVuiFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265SpsVuiFlags malloc() {
        return new StdVideoH265SpsVuiFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265SpsVuiFlags calloc() {
        return new StdVideoH265SpsVuiFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265SpsVuiFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265SpsVuiFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265SpsVuiFlags create(long address) {
        return new StdVideoH265SpsVuiFlags(address, null);
    }

    public static StdVideoH265SpsVuiFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265SpsVuiFlags(address, null);
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

    public static StdVideoH265SpsVuiFlags malloc(MemoryStack stack) {
        return new StdVideoH265SpsVuiFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265SpsVuiFlags calloc(MemoryStack stack) {
        return new StdVideoH265SpsVuiFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int naspect_ratio_info_present_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int noverscan_info_present_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int noverscan_appropriate_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nvideo_signal_type_present_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nvideo_full_range_flag(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int ncolour_description_present_flag(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int nchroma_loc_info_present_flag(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int nneutral_chroma_indication_flag(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static int nfield_seq_flag(long struct) {
        return (nbitfield0(struct) & 256) >>> 8;
    }

    public static int nframe_field_info_present_flag(long struct) {
        return (nbitfield0(struct) & 512) >>> 9;
    }

    public static int ndefault_display_window_flag(long struct) {
        return (nbitfield0(struct) & 1024) >>> 10;
    }

    public static int nvui_timing_info_present_flag(long struct) {
        return (nbitfield0(struct) & 2048) >>> 11;
    }

    public static int nvui_poc_proportional_to_timing_flag(long struct) {
        return (nbitfield0(struct) & 4096) >>> 12;
    }

    public static int nvui_hrd_parameters_present_flag(long struct) {
        return (nbitfield0(struct) & 8192) >>> 13;
    }

    public static int nbitstream_restriction_flag(long struct) {
        return (nbitfield0(struct) & 16384) >>> 14;
    }

    public static int ntiles_fixed_structure_flag(long struct) {
        return (nbitfield0(struct) & 32768) >>> 15;
    }

    public static int nmotion_vectors_over_pic_boundaries_flag(long struct) {
        return (nbitfield0(struct) & 65536) >>> 16;
    }

    public static int nrestricted_ref_pic_lists_flag(long struct) {
        return (nbitfield0(struct) & 131072) >>> 17;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void naspect_ratio_info_present_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void noverscan_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void noverscan_appropriate_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nvideo_signal_type_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nvideo_full_range_flag(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void ncolour_description_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void nchroma_loc_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void nneutral_chroma_indication_flag(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    public static void nfield_seq_flag(long struct, int value) {
        nbitfield0(struct, ((value << 8) & 256) | (nbitfield0(struct) & (-257)));
    }

    public static void nframe_field_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 9) & 512) | (nbitfield0(struct) & (-513)));
    }

    public static void ndefault_display_window_flag(long struct, int value) {
        nbitfield0(struct, ((value << 10) & 1024) | (nbitfield0(struct) & (-1025)));
    }

    public static void nvui_timing_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 11) & 2048) | (nbitfield0(struct) & (-2049)));
    }

    public static void nvui_poc_proportional_to_timing_flag(long struct, int value) {
        nbitfield0(struct, ((value << 12) & 4096) | (nbitfield0(struct) & (-4097)));
    }

    public static void nvui_hrd_parameters_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 13) & 8192) | (nbitfield0(struct) & (-8193)));
    }

    public static void nbitstream_restriction_flag(long struct, int value) {
        nbitfield0(struct, ((value << 14) & 16384) | (nbitfield0(struct) & (-16385)));
    }

    public static void ntiles_fixed_structure_flag(long struct, int value) {
        nbitfield0(struct, ((value << 15) & 32768) | (nbitfield0(struct) & (-32769)));
    }

    public static void nmotion_vectors_over_pic_boundaries_flag(long struct, int value) {
        nbitfield0(struct, ((value << 16) & 65536) | (nbitfield0(struct) & (-65537)));
    }

    public static void nrestricted_ref_pic_lists_flag(long struct, int value) {
        nbitfield0(struct, ((value << 17) & 131072) | (nbitfield0(struct) & (-131073)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SpsVuiFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SpsVuiFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265SpsVuiFlags, Buffer> implements NativeResource {
        private static final StdVideoH265SpsVuiFlags ELEMENT_FACTORY = StdVideoH265SpsVuiFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265SpsVuiFlags.SIZEOF);
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
        public StdVideoH265SpsVuiFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean aspect_ratio_info_present_flag() {
            return StdVideoH265SpsVuiFlags.naspect_ratio_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean overscan_info_present_flag() {
            return StdVideoH265SpsVuiFlags.noverscan_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean overscan_appropriate_flag() {
            return StdVideoH265SpsVuiFlags.noverscan_appropriate_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean video_signal_type_present_flag() {
            return StdVideoH265SpsVuiFlags.nvideo_signal_type_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean video_full_range_flag() {
            return StdVideoH265SpsVuiFlags.nvideo_full_range_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean colour_description_present_flag() {
            return StdVideoH265SpsVuiFlags.ncolour_description_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean chroma_loc_info_present_flag() {
            return StdVideoH265SpsVuiFlags.nchroma_loc_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean neutral_chroma_indication_flag() {
            return StdVideoH265SpsVuiFlags.nneutral_chroma_indication_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean field_seq_flag() {
            return StdVideoH265SpsVuiFlags.nfield_seq_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean frame_field_info_present_flag() {
            return StdVideoH265SpsVuiFlags.nframe_field_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean default_display_window_flag() {
            return StdVideoH265SpsVuiFlags.ndefault_display_window_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean vui_timing_info_present_flag() {
            return StdVideoH265SpsVuiFlags.nvui_timing_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean vui_poc_proportional_to_timing_flag() {
            return StdVideoH265SpsVuiFlags.nvui_poc_proportional_to_timing_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean vui_hrd_parameters_present_flag() {
            return StdVideoH265SpsVuiFlags.nvui_hrd_parameters_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean bitstream_restriction_flag() {
            return StdVideoH265SpsVuiFlags.nbitstream_restriction_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean tiles_fixed_structure_flag() {
            return StdVideoH265SpsVuiFlags.ntiles_fixed_structure_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean motion_vectors_over_pic_boundaries_flag() {
            return StdVideoH265SpsVuiFlags.nmotion_vectors_over_pic_boundaries_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean restricted_ref_pic_lists_flag() {
            return StdVideoH265SpsVuiFlags.nrestricted_ref_pic_lists_flag(address()) != 0;
        }

        public Buffer aspect_ratio_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.naspect_ratio_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer overscan_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.noverscan_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer overscan_appropriate_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.noverscan_appropriate_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer video_signal_type_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nvideo_signal_type_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer video_full_range_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nvideo_full_range_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer colour_description_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.ncolour_description_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer chroma_loc_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nchroma_loc_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer neutral_chroma_indication_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nneutral_chroma_indication_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer field_seq_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nfield_seq_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer frame_field_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nframe_field_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer default_display_window_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.ndefault_display_window_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vui_timing_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nvui_timing_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vui_poc_proportional_to_timing_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nvui_poc_proportional_to_timing_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vui_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nvui_hrd_parameters_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bitstream_restriction_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nbitstream_restriction_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tiles_fixed_structure_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.ntiles_fixed_structure_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer motion_vectors_over_pic_boundaries_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nmotion_vectors_over_pic_boundaries_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer restricted_ref_pic_lists_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsVuiFlags.nrestricted_ref_pic_lists_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
