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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PpsFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PpsFlags.class */
public class StdVideoH265PpsFlags extends Struct<StdVideoH265PpsFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoH265PpsFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265PpsFlags create(long address, ByteBuffer container) {
        return new StdVideoH265PpsFlags(address, container);
    }

    public StdVideoH265PpsFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean dependent_slice_segments_enabled_flag() {
        return ndependent_slice_segments_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean output_flag_present_flag() {
        return noutput_flag_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sign_data_hiding_enabled_flag() {
        return nsign_data_hiding_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean cabac_init_present_flag() {
        return ncabac_init_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean constrained_intra_pred_flag() {
        return nconstrained_intra_pred_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean transform_skip_enabled_flag() {
        return ntransform_skip_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean cu_qp_delta_enabled_flag() {
        return ncu_qp_delta_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pps_slice_chroma_qp_offsets_present_flag() {
        return npps_slice_chroma_qp_offsets_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean weighted_pred_flag() {
        return nweighted_pred_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean weighted_bipred_flag() {
        return nweighted_bipred_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean transquant_bypass_enabled_flag() {
        return ntransquant_bypass_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean tiles_enabled_flag() {
        return ntiles_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean entropy_coding_sync_enabled_flag() {
        return nentropy_coding_sync_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean uniform_spacing_flag() {
        return nuniform_spacing_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean loop_filter_across_tiles_enabled_flag() {
        return nloop_filter_across_tiles_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pps_loop_filter_across_slices_enabled_flag() {
        return npps_loop_filter_across_slices_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean deblocking_filter_control_present_flag() {
        return ndeblocking_filter_control_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean deblocking_filter_override_enabled_flag() {
        return ndeblocking_filter_override_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pps_deblocking_filter_disabled_flag() {
        return npps_deblocking_filter_disabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pps_scaling_list_data_present_flag() {
        return npps_scaling_list_data_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean lists_modification_present_flag() {
        return nlists_modification_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean slice_segment_header_extension_present_flag() {
        return nslice_segment_header_extension_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pps_extension_present_flag() {
        return npps_extension_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean cross_component_prediction_enabled_flag() {
        return ncross_component_prediction_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean chroma_qp_offset_list_enabled_flag() {
        return nchroma_qp_offset_list_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pps_curr_pic_ref_enabled_flag() {
        return npps_curr_pic_ref_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean residual_adaptive_colour_transform_enabled_flag() {
        return nresidual_adaptive_colour_transform_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pps_slice_act_qp_offsets_present_flag() {
        return npps_slice_act_qp_offsets_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pps_palette_predictor_initializers_present_flag() {
        return npps_palette_predictor_initializers_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean monochrome_palette_flag() {
        return nmonochrome_palette_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pps_range_extension_flag() {
        return npps_range_extension_flag(address()) != 0;
    }

    public StdVideoH265PpsFlags dependent_slice_segments_enabled_flag(@NativeType("uint32_t") boolean value) {
        ndependent_slice_segments_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags output_flag_present_flag(@NativeType("uint32_t") boolean value) {
        noutput_flag_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags sign_data_hiding_enabled_flag(@NativeType("uint32_t") boolean value) {
        nsign_data_hiding_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags cabac_init_present_flag(@NativeType("uint32_t") boolean value) {
        ncabac_init_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags constrained_intra_pred_flag(@NativeType("uint32_t") boolean value) {
        nconstrained_intra_pred_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags transform_skip_enabled_flag(@NativeType("uint32_t") boolean value) {
        ntransform_skip_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags cu_qp_delta_enabled_flag(@NativeType("uint32_t") boolean value) {
        ncu_qp_delta_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags pps_slice_chroma_qp_offsets_present_flag(@NativeType("uint32_t") boolean value) {
        npps_slice_chroma_qp_offsets_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags weighted_pred_flag(@NativeType("uint32_t") boolean value) {
        nweighted_pred_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags weighted_bipred_flag(@NativeType("uint32_t") boolean value) {
        nweighted_bipred_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags transquant_bypass_enabled_flag(@NativeType("uint32_t") boolean value) {
        ntransquant_bypass_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags tiles_enabled_flag(@NativeType("uint32_t") boolean value) {
        ntiles_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags entropy_coding_sync_enabled_flag(@NativeType("uint32_t") boolean value) {
        nentropy_coding_sync_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags uniform_spacing_flag(@NativeType("uint32_t") boolean value) {
        nuniform_spacing_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags loop_filter_across_tiles_enabled_flag(@NativeType("uint32_t") boolean value) {
        nloop_filter_across_tiles_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags pps_loop_filter_across_slices_enabled_flag(@NativeType("uint32_t") boolean value) {
        npps_loop_filter_across_slices_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags deblocking_filter_control_present_flag(@NativeType("uint32_t") boolean value) {
        ndeblocking_filter_control_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags deblocking_filter_override_enabled_flag(@NativeType("uint32_t") boolean value) {
        ndeblocking_filter_override_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags pps_deblocking_filter_disabled_flag(@NativeType("uint32_t") boolean value) {
        npps_deblocking_filter_disabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags pps_scaling_list_data_present_flag(@NativeType("uint32_t") boolean value) {
        npps_scaling_list_data_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags lists_modification_present_flag(@NativeType("uint32_t") boolean value) {
        nlists_modification_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags slice_segment_header_extension_present_flag(@NativeType("uint32_t") boolean value) {
        nslice_segment_header_extension_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags pps_extension_present_flag(@NativeType("uint32_t") boolean value) {
        npps_extension_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags cross_component_prediction_enabled_flag(@NativeType("uint32_t") boolean value) {
        ncross_component_prediction_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags chroma_qp_offset_list_enabled_flag(@NativeType("uint32_t") boolean value) {
        nchroma_qp_offset_list_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags pps_curr_pic_ref_enabled_flag(@NativeType("uint32_t") boolean value) {
        npps_curr_pic_ref_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags residual_adaptive_colour_transform_enabled_flag(@NativeType("uint32_t") boolean value) {
        nresidual_adaptive_colour_transform_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags pps_slice_act_qp_offsets_present_flag(@NativeType("uint32_t") boolean value) {
        npps_slice_act_qp_offsets_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags pps_palette_predictor_initializers_present_flag(@NativeType("uint32_t") boolean value) {
        npps_palette_predictor_initializers_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags monochrome_palette_flag(@NativeType("uint32_t") boolean value) {
        nmonochrome_palette_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags pps_range_extension_flag(@NativeType("uint32_t") boolean value) {
        npps_range_extension_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265PpsFlags set(boolean dependent_slice_segments_enabled_flag, boolean output_flag_present_flag, boolean sign_data_hiding_enabled_flag, boolean cabac_init_present_flag, boolean constrained_intra_pred_flag, boolean transform_skip_enabled_flag, boolean cu_qp_delta_enabled_flag, boolean pps_slice_chroma_qp_offsets_present_flag, boolean weighted_pred_flag, boolean weighted_bipred_flag, boolean transquant_bypass_enabled_flag, boolean tiles_enabled_flag, boolean entropy_coding_sync_enabled_flag, boolean uniform_spacing_flag, boolean loop_filter_across_tiles_enabled_flag, boolean pps_loop_filter_across_slices_enabled_flag, boolean deblocking_filter_control_present_flag, boolean deblocking_filter_override_enabled_flag, boolean pps_deblocking_filter_disabled_flag, boolean pps_scaling_list_data_present_flag, boolean lists_modification_present_flag, boolean slice_segment_header_extension_present_flag, boolean pps_extension_present_flag, boolean cross_component_prediction_enabled_flag, boolean chroma_qp_offset_list_enabled_flag, boolean pps_curr_pic_ref_enabled_flag, boolean residual_adaptive_colour_transform_enabled_flag, boolean pps_slice_act_qp_offsets_present_flag, boolean pps_palette_predictor_initializers_present_flag, boolean monochrome_palette_flag, boolean pps_range_extension_flag) {
        dependent_slice_segments_enabled_flag(dependent_slice_segments_enabled_flag);
        output_flag_present_flag(output_flag_present_flag);
        sign_data_hiding_enabled_flag(sign_data_hiding_enabled_flag);
        cabac_init_present_flag(cabac_init_present_flag);
        constrained_intra_pred_flag(constrained_intra_pred_flag);
        transform_skip_enabled_flag(transform_skip_enabled_flag);
        cu_qp_delta_enabled_flag(cu_qp_delta_enabled_flag);
        pps_slice_chroma_qp_offsets_present_flag(pps_slice_chroma_qp_offsets_present_flag);
        weighted_pred_flag(weighted_pred_flag);
        weighted_bipred_flag(weighted_bipred_flag);
        transquant_bypass_enabled_flag(transquant_bypass_enabled_flag);
        tiles_enabled_flag(tiles_enabled_flag);
        entropy_coding_sync_enabled_flag(entropy_coding_sync_enabled_flag);
        uniform_spacing_flag(uniform_spacing_flag);
        loop_filter_across_tiles_enabled_flag(loop_filter_across_tiles_enabled_flag);
        pps_loop_filter_across_slices_enabled_flag(pps_loop_filter_across_slices_enabled_flag);
        deblocking_filter_control_present_flag(deblocking_filter_control_present_flag);
        deblocking_filter_override_enabled_flag(deblocking_filter_override_enabled_flag);
        pps_deblocking_filter_disabled_flag(pps_deblocking_filter_disabled_flag);
        pps_scaling_list_data_present_flag(pps_scaling_list_data_present_flag);
        lists_modification_present_flag(lists_modification_present_flag);
        slice_segment_header_extension_present_flag(slice_segment_header_extension_present_flag);
        pps_extension_present_flag(pps_extension_present_flag);
        cross_component_prediction_enabled_flag(cross_component_prediction_enabled_flag);
        chroma_qp_offset_list_enabled_flag(chroma_qp_offset_list_enabled_flag);
        pps_curr_pic_ref_enabled_flag(pps_curr_pic_ref_enabled_flag);
        residual_adaptive_colour_transform_enabled_flag(residual_adaptive_colour_transform_enabled_flag);
        pps_slice_act_qp_offsets_present_flag(pps_slice_act_qp_offsets_present_flag);
        pps_palette_predictor_initializers_present_flag(pps_palette_predictor_initializers_present_flag);
        monochrome_palette_flag(monochrome_palette_flag);
        pps_range_extension_flag(pps_range_extension_flag);
        return this;
    }

    public StdVideoH265PpsFlags set(StdVideoH265PpsFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265PpsFlags malloc() {
        return new StdVideoH265PpsFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265PpsFlags calloc() {
        return new StdVideoH265PpsFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265PpsFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265PpsFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265PpsFlags create(long address) {
        return new StdVideoH265PpsFlags(address, null);
    }

    public static StdVideoH265PpsFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265PpsFlags(address, null);
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

    public static StdVideoH265PpsFlags malloc(MemoryStack stack) {
        return new StdVideoH265PpsFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265PpsFlags calloc(MemoryStack stack) {
        return new StdVideoH265PpsFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndependent_slice_segments_enabled_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int noutput_flag_present_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nsign_data_hiding_enabled_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int ncabac_init_present_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nconstrained_intra_pred_flag(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int ntransform_skip_enabled_flag(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int ncu_qp_delta_enabled_flag(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int npps_slice_chroma_qp_offsets_present_flag(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static int nweighted_pred_flag(long struct) {
        return (nbitfield0(struct) & 256) >>> 8;
    }

    public static int nweighted_bipred_flag(long struct) {
        return (nbitfield0(struct) & 512) >>> 9;
    }

    public static int ntransquant_bypass_enabled_flag(long struct) {
        return (nbitfield0(struct) & 1024) >>> 10;
    }

    public static int ntiles_enabled_flag(long struct) {
        return (nbitfield0(struct) & 2048) >>> 11;
    }

    public static int nentropy_coding_sync_enabled_flag(long struct) {
        return (nbitfield0(struct) & 4096) >>> 12;
    }

    public static int nuniform_spacing_flag(long struct) {
        return (nbitfield0(struct) & 8192) >>> 13;
    }

    public static int nloop_filter_across_tiles_enabled_flag(long struct) {
        return (nbitfield0(struct) & 16384) >>> 14;
    }

    public static int npps_loop_filter_across_slices_enabled_flag(long struct) {
        return (nbitfield0(struct) & 32768) >>> 15;
    }

    public static int ndeblocking_filter_control_present_flag(long struct) {
        return (nbitfield0(struct) & 65536) >>> 16;
    }

    public static int ndeblocking_filter_override_enabled_flag(long struct) {
        return (nbitfield0(struct) & 131072) >>> 17;
    }

    public static int npps_deblocking_filter_disabled_flag(long struct) {
        return (nbitfield0(struct) & 262144) >>> 18;
    }

    public static int npps_scaling_list_data_present_flag(long struct) {
        return (nbitfield0(struct) & 524288) >>> 19;
    }

    public static int nlists_modification_present_flag(long struct) {
        return (nbitfield0(struct) & 1048576) >>> 20;
    }

    public static int nslice_segment_header_extension_present_flag(long struct) {
        return (nbitfield0(struct) & 2097152) >>> 21;
    }

    public static int npps_extension_present_flag(long struct) {
        return (nbitfield0(struct) & 4194304) >>> 22;
    }

    public static int ncross_component_prediction_enabled_flag(long struct) {
        return (nbitfield0(struct) & 8388608) >>> 23;
    }

    public static int nchroma_qp_offset_list_enabled_flag(long struct) {
        return (nbitfield0(struct) & 16777216) >>> 24;
    }

    public static int npps_curr_pic_ref_enabled_flag(long struct) {
        return (nbitfield0(struct) & 33554432) >>> 25;
    }

    public static int nresidual_adaptive_colour_transform_enabled_flag(long struct) {
        return (nbitfield0(struct) & 67108864) >>> 26;
    }

    public static int npps_slice_act_qp_offsets_present_flag(long struct) {
        return (nbitfield0(struct) & 134217728) >>> 27;
    }

    public static int npps_palette_predictor_initializers_present_flag(long struct) {
        return (nbitfield0(struct) & 268435456) >>> 28;
    }

    public static int nmonochrome_palette_flag(long struct) {
        return (nbitfield0(struct) & 536870912) >>> 29;
    }

    public static int npps_range_extension_flag(long struct) {
        return (nbitfield0(struct) & 1073741824) >>> 30;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ndependent_slice_segments_enabled_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void noutput_flag_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nsign_data_hiding_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void ncabac_init_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nconstrained_intra_pred_flag(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void ntransform_skip_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void ncu_qp_delta_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void npps_slice_chroma_qp_offsets_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    public static void nweighted_pred_flag(long struct, int value) {
        nbitfield0(struct, ((value << 8) & 256) | (nbitfield0(struct) & (-257)));
    }

    public static void nweighted_bipred_flag(long struct, int value) {
        nbitfield0(struct, ((value << 9) & 512) | (nbitfield0(struct) & (-513)));
    }

    public static void ntransquant_bypass_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 10) & 1024) | (nbitfield0(struct) & (-1025)));
    }

    public static void ntiles_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 11) & 2048) | (nbitfield0(struct) & (-2049)));
    }

    public static void nentropy_coding_sync_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 12) & 4096) | (nbitfield0(struct) & (-4097)));
    }

    public static void nuniform_spacing_flag(long struct, int value) {
        nbitfield0(struct, ((value << 13) & 8192) | (nbitfield0(struct) & (-8193)));
    }

    public static void nloop_filter_across_tiles_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 14) & 16384) | (nbitfield0(struct) & (-16385)));
    }

    public static void npps_loop_filter_across_slices_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 15) & 32768) | (nbitfield0(struct) & (-32769)));
    }

    public static void ndeblocking_filter_control_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 16) & 65536) | (nbitfield0(struct) & (-65537)));
    }

    public static void ndeblocking_filter_override_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 17) & 131072) | (nbitfield0(struct) & (-131073)));
    }

    public static void npps_deblocking_filter_disabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 18) & 262144) | (nbitfield0(struct) & (-262145)));
    }

    public static void npps_scaling_list_data_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 19) & 524288) | (nbitfield0(struct) & (-524289)));
    }

    public static void nlists_modification_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 20) & 1048576) | (nbitfield0(struct) & (-1048577)));
    }

    public static void nslice_segment_header_extension_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 21) & 2097152) | (nbitfield0(struct) & (-2097153)));
    }

    public static void npps_extension_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 22) & 4194304) | (nbitfield0(struct) & (-4194305)));
    }

    public static void ncross_component_prediction_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 23) & 8388608) | (nbitfield0(struct) & (-8388609)));
    }

    public static void nchroma_qp_offset_list_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 24) & 16777216) | (nbitfield0(struct) & (-16777217)));
    }

    public static void npps_curr_pic_ref_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 25) & 33554432) | (nbitfield0(struct) & (-33554433)));
    }

    public static void nresidual_adaptive_colour_transform_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 26) & 67108864) | (nbitfield0(struct) & (-67108865)));
    }

    public static void npps_slice_act_qp_offsets_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 27) & 134217728) | (nbitfield0(struct) & (-134217729)));
    }

    public static void npps_palette_predictor_initializers_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 28) & 268435456) | (nbitfield0(struct) & (-268435457)));
    }

    public static void nmonochrome_palette_flag(long struct, int value) {
        nbitfield0(struct, ((value << 29) & 536870912) | (nbitfield0(struct) & (-536870913)));
    }

    public static void npps_range_extension_flag(long struct, int value) {
        nbitfield0(struct, ((value << 30) & 1073741824) | (nbitfield0(struct) & (-1073741825)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PpsFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PpsFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265PpsFlags, Buffer> implements NativeResource {
        private static final StdVideoH265PpsFlags ELEMENT_FACTORY = StdVideoH265PpsFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265PpsFlags.SIZEOF);
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
        public StdVideoH265PpsFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean dependent_slice_segments_enabled_flag() {
            return StdVideoH265PpsFlags.ndependent_slice_segments_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean output_flag_present_flag() {
            return StdVideoH265PpsFlags.noutput_flag_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sign_data_hiding_enabled_flag() {
            return StdVideoH265PpsFlags.nsign_data_hiding_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean cabac_init_present_flag() {
            return StdVideoH265PpsFlags.ncabac_init_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean constrained_intra_pred_flag() {
            return StdVideoH265PpsFlags.nconstrained_intra_pred_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean transform_skip_enabled_flag() {
            return StdVideoH265PpsFlags.ntransform_skip_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean cu_qp_delta_enabled_flag() {
            return StdVideoH265PpsFlags.ncu_qp_delta_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pps_slice_chroma_qp_offsets_present_flag() {
            return StdVideoH265PpsFlags.npps_slice_chroma_qp_offsets_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean weighted_pred_flag() {
            return StdVideoH265PpsFlags.nweighted_pred_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean weighted_bipred_flag() {
            return StdVideoH265PpsFlags.nweighted_bipred_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean transquant_bypass_enabled_flag() {
            return StdVideoH265PpsFlags.ntransquant_bypass_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean tiles_enabled_flag() {
            return StdVideoH265PpsFlags.ntiles_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean entropy_coding_sync_enabled_flag() {
            return StdVideoH265PpsFlags.nentropy_coding_sync_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean uniform_spacing_flag() {
            return StdVideoH265PpsFlags.nuniform_spacing_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean loop_filter_across_tiles_enabled_flag() {
            return StdVideoH265PpsFlags.nloop_filter_across_tiles_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pps_loop_filter_across_slices_enabled_flag() {
            return StdVideoH265PpsFlags.npps_loop_filter_across_slices_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean deblocking_filter_control_present_flag() {
            return StdVideoH265PpsFlags.ndeblocking_filter_control_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean deblocking_filter_override_enabled_flag() {
            return StdVideoH265PpsFlags.ndeblocking_filter_override_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pps_deblocking_filter_disabled_flag() {
            return StdVideoH265PpsFlags.npps_deblocking_filter_disabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pps_scaling_list_data_present_flag() {
            return StdVideoH265PpsFlags.npps_scaling_list_data_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean lists_modification_present_flag() {
            return StdVideoH265PpsFlags.nlists_modification_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean slice_segment_header_extension_present_flag() {
            return StdVideoH265PpsFlags.nslice_segment_header_extension_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pps_extension_present_flag() {
            return StdVideoH265PpsFlags.npps_extension_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean cross_component_prediction_enabled_flag() {
            return StdVideoH265PpsFlags.ncross_component_prediction_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean chroma_qp_offset_list_enabled_flag() {
            return StdVideoH265PpsFlags.nchroma_qp_offset_list_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pps_curr_pic_ref_enabled_flag() {
            return StdVideoH265PpsFlags.npps_curr_pic_ref_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean residual_adaptive_colour_transform_enabled_flag() {
            return StdVideoH265PpsFlags.nresidual_adaptive_colour_transform_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pps_slice_act_qp_offsets_present_flag() {
            return StdVideoH265PpsFlags.npps_slice_act_qp_offsets_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pps_palette_predictor_initializers_present_flag() {
            return StdVideoH265PpsFlags.npps_palette_predictor_initializers_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean monochrome_palette_flag() {
            return StdVideoH265PpsFlags.nmonochrome_palette_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pps_range_extension_flag() {
            return StdVideoH265PpsFlags.npps_range_extension_flag(address()) != 0;
        }

        public Buffer dependent_slice_segments_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.ndependent_slice_segments_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer output_flag_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.noutput_flag_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sign_data_hiding_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nsign_data_hiding_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cabac_init_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.ncabac_init_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer constrained_intra_pred_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nconstrained_intra_pred_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer transform_skip_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.ntransform_skip_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cu_qp_delta_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.ncu_qp_delta_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pps_slice_chroma_qp_offsets_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.npps_slice_chroma_qp_offsets_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer weighted_pred_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nweighted_pred_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer weighted_bipred_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nweighted_bipred_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer transquant_bypass_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.ntransquant_bypass_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tiles_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.ntiles_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer entropy_coding_sync_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nentropy_coding_sync_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer uniform_spacing_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nuniform_spacing_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer loop_filter_across_tiles_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nloop_filter_across_tiles_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pps_loop_filter_across_slices_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.npps_loop_filter_across_slices_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer deblocking_filter_control_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.ndeblocking_filter_control_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer deblocking_filter_override_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.ndeblocking_filter_override_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pps_deblocking_filter_disabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.npps_deblocking_filter_disabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pps_scaling_list_data_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.npps_scaling_list_data_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer lists_modification_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nlists_modification_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer slice_segment_header_extension_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nslice_segment_header_extension_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pps_extension_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.npps_extension_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cross_component_prediction_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.ncross_component_prediction_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer chroma_qp_offset_list_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nchroma_qp_offset_list_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pps_curr_pic_ref_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.npps_curr_pic_ref_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer residual_adaptive_colour_transform_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nresidual_adaptive_colour_transform_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pps_slice_act_qp_offsets_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.npps_slice_act_qp_offsets_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pps_palette_predictor_initializers_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.npps_palette_predictor_initializers_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer monochrome_palette_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.nmonochrome_palette_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pps_range_extension_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265PpsFlags.npps_range_extension_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
