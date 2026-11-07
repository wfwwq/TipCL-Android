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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SpsFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SpsFlags.class */
public class StdVideoH265SpsFlags extends Struct<StdVideoH265SpsFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoH265SpsFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265SpsFlags create(long address, ByteBuffer container) {
        return new StdVideoH265SpsFlags(address, container);
    }

    public StdVideoH265SpsFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean sps_temporal_id_nesting_flag() {
        return nsps_temporal_id_nesting_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean separate_colour_plane_flag() {
        return nseparate_colour_plane_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean conformance_window_flag() {
        return nconformance_window_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sps_sub_layer_ordering_info_present_flag() {
        return nsps_sub_layer_ordering_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean scaling_list_enabled_flag() {
        return nscaling_list_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sps_scaling_list_data_present_flag() {
        return nsps_scaling_list_data_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean amp_enabled_flag() {
        return namp_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sample_adaptive_offset_enabled_flag() {
        return nsample_adaptive_offset_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pcm_enabled_flag() {
        return npcm_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean pcm_loop_filter_disabled_flag() {
        return npcm_loop_filter_disabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean long_term_ref_pics_present_flag() {
        return nlong_term_ref_pics_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sps_temporal_mvp_enabled_flag() {
        return nsps_temporal_mvp_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean strong_intra_smoothing_enabled_flag() {
        return nstrong_intra_smoothing_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean vui_parameters_present_flag() {
        return nvui_parameters_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sps_extension_present_flag() {
        return nsps_extension_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sps_range_extension_flag() {
        return nsps_range_extension_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean transform_skip_rotation_enabled_flag() {
        return ntransform_skip_rotation_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean transform_skip_context_enabled_flag() {
        return ntransform_skip_context_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean implicit_rdpcm_enabled_flag() {
        return nimplicit_rdpcm_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean explicit_rdpcm_enabled_flag() {
        return nexplicit_rdpcm_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean extended_precision_processing_flag() {
        return nextended_precision_processing_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean intra_smoothing_disabled_flag() {
        return nintra_smoothing_disabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean high_precision_offsets_enabled_flag() {
        return nhigh_precision_offsets_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean persistent_rice_adaptation_enabled_flag() {
        return npersistent_rice_adaptation_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean cabac_bypass_alignment_enabled_flag() {
        return ncabac_bypass_alignment_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sps_scc_extension_flag() {
        return nsps_scc_extension_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sps_curr_pic_ref_enabled_flag() {
        return nsps_curr_pic_ref_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean palette_mode_enabled_flag() {
        return npalette_mode_enabled_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sps_palette_predictor_initializers_present_flag() {
        return nsps_palette_predictor_initializers_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sps_palette_predictor_initializer_present_flag() {
        return nsps_palette_predictor_initializer_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean intra_boundary_filtering_disabled_flag() {
        return nintra_boundary_filtering_disabled_flag(address()) != 0;
    }

    public StdVideoH265SpsFlags sps_temporal_id_nesting_flag(@NativeType("uint32_t") boolean value) {
        nsps_temporal_id_nesting_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags separate_colour_plane_flag(@NativeType("uint32_t") boolean value) {
        nseparate_colour_plane_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags conformance_window_flag(@NativeType("uint32_t") boolean value) {
        nconformance_window_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags sps_sub_layer_ordering_info_present_flag(@NativeType("uint32_t") boolean value) {
        nsps_sub_layer_ordering_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags scaling_list_enabled_flag(@NativeType("uint32_t") boolean value) {
        nscaling_list_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags sps_scaling_list_data_present_flag(@NativeType("uint32_t") boolean value) {
        nsps_scaling_list_data_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags amp_enabled_flag(@NativeType("uint32_t") boolean value) {
        namp_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags sample_adaptive_offset_enabled_flag(@NativeType("uint32_t") boolean value) {
        nsample_adaptive_offset_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags pcm_enabled_flag(@NativeType("uint32_t") boolean value) {
        npcm_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags pcm_loop_filter_disabled_flag(@NativeType("uint32_t") boolean value) {
        npcm_loop_filter_disabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags long_term_ref_pics_present_flag(@NativeType("uint32_t") boolean value) {
        nlong_term_ref_pics_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags sps_temporal_mvp_enabled_flag(@NativeType("uint32_t") boolean value) {
        nsps_temporal_mvp_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags strong_intra_smoothing_enabled_flag(@NativeType("uint32_t") boolean value) {
        nstrong_intra_smoothing_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags vui_parameters_present_flag(@NativeType("uint32_t") boolean value) {
        nvui_parameters_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags sps_extension_present_flag(@NativeType("uint32_t") boolean value) {
        nsps_extension_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags sps_range_extension_flag(@NativeType("uint32_t") boolean value) {
        nsps_range_extension_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags transform_skip_rotation_enabled_flag(@NativeType("uint32_t") boolean value) {
        ntransform_skip_rotation_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags transform_skip_context_enabled_flag(@NativeType("uint32_t") boolean value) {
        ntransform_skip_context_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags implicit_rdpcm_enabled_flag(@NativeType("uint32_t") boolean value) {
        nimplicit_rdpcm_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags explicit_rdpcm_enabled_flag(@NativeType("uint32_t") boolean value) {
        nexplicit_rdpcm_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags extended_precision_processing_flag(@NativeType("uint32_t") boolean value) {
        nextended_precision_processing_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags intra_smoothing_disabled_flag(@NativeType("uint32_t") boolean value) {
        nintra_smoothing_disabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags high_precision_offsets_enabled_flag(@NativeType("uint32_t") boolean value) {
        nhigh_precision_offsets_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags persistent_rice_adaptation_enabled_flag(@NativeType("uint32_t") boolean value) {
        npersistent_rice_adaptation_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags cabac_bypass_alignment_enabled_flag(@NativeType("uint32_t") boolean value) {
        ncabac_bypass_alignment_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags sps_scc_extension_flag(@NativeType("uint32_t") boolean value) {
        nsps_scc_extension_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags sps_curr_pic_ref_enabled_flag(@NativeType("uint32_t") boolean value) {
        nsps_curr_pic_ref_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags palette_mode_enabled_flag(@NativeType("uint32_t") boolean value) {
        npalette_mode_enabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags sps_palette_predictor_initializers_present_flag(@NativeType("uint32_t") boolean value) {
        nsps_palette_predictor_initializers_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags sps_palette_predictor_initializer_present_flag(@NativeType("uint32_t") boolean value) {
        nsps_palette_predictor_initializer_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags intra_boundary_filtering_disabled_flag(@NativeType("uint32_t") boolean value) {
        nintra_boundary_filtering_disabled_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265SpsFlags set(boolean sps_temporal_id_nesting_flag, boolean separate_colour_plane_flag, boolean conformance_window_flag, boolean sps_sub_layer_ordering_info_present_flag, boolean scaling_list_enabled_flag, boolean sps_scaling_list_data_present_flag, boolean amp_enabled_flag, boolean sample_adaptive_offset_enabled_flag, boolean pcm_enabled_flag, boolean pcm_loop_filter_disabled_flag, boolean long_term_ref_pics_present_flag, boolean sps_temporal_mvp_enabled_flag, boolean strong_intra_smoothing_enabled_flag, boolean vui_parameters_present_flag, boolean sps_extension_present_flag, boolean sps_range_extension_flag, boolean transform_skip_rotation_enabled_flag, boolean transform_skip_context_enabled_flag, boolean implicit_rdpcm_enabled_flag, boolean explicit_rdpcm_enabled_flag, boolean extended_precision_processing_flag, boolean intra_smoothing_disabled_flag, boolean high_precision_offsets_enabled_flag, boolean persistent_rice_adaptation_enabled_flag, boolean cabac_bypass_alignment_enabled_flag, boolean sps_scc_extension_flag, boolean sps_curr_pic_ref_enabled_flag, boolean palette_mode_enabled_flag, boolean sps_palette_predictor_initializers_present_flag, boolean sps_palette_predictor_initializer_present_flag, boolean intra_boundary_filtering_disabled_flag) {
        sps_temporal_id_nesting_flag(sps_temporal_id_nesting_flag);
        separate_colour_plane_flag(separate_colour_plane_flag);
        conformance_window_flag(conformance_window_flag);
        sps_sub_layer_ordering_info_present_flag(sps_sub_layer_ordering_info_present_flag);
        scaling_list_enabled_flag(scaling_list_enabled_flag);
        sps_scaling_list_data_present_flag(sps_scaling_list_data_present_flag);
        amp_enabled_flag(amp_enabled_flag);
        sample_adaptive_offset_enabled_flag(sample_adaptive_offset_enabled_flag);
        pcm_enabled_flag(pcm_enabled_flag);
        pcm_loop_filter_disabled_flag(pcm_loop_filter_disabled_flag);
        long_term_ref_pics_present_flag(long_term_ref_pics_present_flag);
        sps_temporal_mvp_enabled_flag(sps_temporal_mvp_enabled_flag);
        strong_intra_smoothing_enabled_flag(strong_intra_smoothing_enabled_flag);
        vui_parameters_present_flag(vui_parameters_present_flag);
        sps_extension_present_flag(sps_extension_present_flag);
        sps_range_extension_flag(sps_range_extension_flag);
        transform_skip_rotation_enabled_flag(transform_skip_rotation_enabled_flag);
        transform_skip_context_enabled_flag(transform_skip_context_enabled_flag);
        implicit_rdpcm_enabled_flag(implicit_rdpcm_enabled_flag);
        explicit_rdpcm_enabled_flag(explicit_rdpcm_enabled_flag);
        extended_precision_processing_flag(extended_precision_processing_flag);
        intra_smoothing_disabled_flag(intra_smoothing_disabled_flag);
        high_precision_offsets_enabled_flag(high_precision_offsets_enabled_flag);
        persistent_rice_adaptation_enabled_flag(persistent_rice_adaptation_enabled_flag);
        cabac_bypass_alignment_enabled_flag(cabac_bypass_alignment_enabled_flag);
        sps_scc_extension_flag(sps_scc_extension_flag);
        sps_curr_pic_ref_enabled_flag(sps_curr_pic_ref_enabled_flag);
        palette_mode_enabled_flag(palette_mode_enabled_flag);
        sps_palette_predictor_initializers_present_flag(sps_palette_predictor_initializers_present_flag);
        sps_palette_predictor_initializer_present_flag(sps_palette_predictor_initializer_present_flag);
        intra_boundary_filtering_disabled_flag(intra_boundary_filtering_disabled_flag);
        return this;
    }

    public StdVideoH265SpsFlags set(StdVideoH265SpsFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265SpsFlags malloc() {
        return new StdVideoH265SpsFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265SpsFlags calloc() {
        return new StdVideoH265SpsFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265SpsFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265SpsFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265SpsFlags create(long address) {
        return new StdVideoH265SpsFlags(address, null);
    }

    public static StdVideoH265SpsFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265SpsFlags(address, null);
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

    public static StdVideoH265SpsFlags malloc(MemoryStack stack) {
        return new StdVideoH265SpsFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265SpsFlags calloc(MemoryStack stack) {
        return new StdVideoH265SpsFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsps_temporal_id_nesting_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nseparate_colour_plane_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nconformance_window_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nsps_sub_layer_ordering_info_present_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nscaling_list_enabled_flag(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int nsps_scaling_list_data_present_flag(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int namp_enabled_flag(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int nsample_adaptive_offset_enabled_flag(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static int npcm_enabled_flag(long struct) {
        return (nbitfield0(struct) & 256) >>> 8;
    }

    public static int npcm_loop_filter_disabled_flag(long struct) {
        return (nbitfield0(struct) & 512) >>> 9;
    }

    public static int nlong_term_ref_pics_present_flag(long struct) {
        return (nbitfield0(struct) & 1024) >>> 10;
    }

    public static int nsps_temporal_mvp_enabled_flag(long struct) {
        return (nbitfield0(struct) & 2048) >>> 11;
    }

    public static int nstrong_intra_smoothing_enabled_flag(long struct) {
        return (nbitfield0(struct) & 4096) >>> 12;
    }

    public static int nvui_parameters_present_flag(long struct) {
        return (nbitfield0(struct) & 8192) >>> 13;
    }

    public static int nsps_extension_present_flag(long struct) {
        return (nbitfield0(struct) & 16384) >>> 14;
    }

    public static int nsps_range_extension_flag(long struct) {
        return (nbitfield0(struct) & 32768) >>> 15;
    }

    public static int ntransform_skip_rotation_enabled_flag(long struct) {
        return (nbitfield0(struct) & 65536) >>> 16;
    }

    public static int ntransform_skip_context_enabled_flag(long struct) {
        return (nbitfield0(struct) & 131072) >>> 17;
    }

    public static int nimplicit_rdpcm_enabled_flag(long struct) {
        return (nbitfield0(struct) & 262144) >>> 18;
    }

    public static int nexplicit_rdpcm_enabled_flag(long struct) {
        return (nbitfield0(struct) & 524288) >>> 19;
    }

    public static int nextended_precision_processing_flag(long struct) {
        return (nbitfield0(struct) & 1048576) >>> 20;
    }

    public static int nintra_smoothing_disabled_flag(long struct) {
        return (nbitfield0(struct) & 2097152) >>> 21;
    }

    public static int nhigh_precision_offsets_enabled_flag(long struct) {
        return (nbitfield0(struct) & 4194304) >>> 22;
    }

    public static int npersistent_rice_adaptation_enabled_flag(long struct) {
        return (nbitfield0(struct) & 8388608) >>> 23;
    }

    public static int ncabac_bypass_alignment_enabled_flag(long struct) {
        return (nbitfield0(struct) & 16777216) >>> 24;
    }

    public static int nsps_scc_extension_flag(long struct) {
        return (nbitfield0(struct) & 33554432) >>> 25;
    }

    public static int nsps_curr_pic_ref_enabled_flag(long struct) {
        return (nbitfield0(struct) & 67108864) >>> 26;
    }

    public static int npalette_mode_enabled_flag(long struct) {
        return (nbitfield0(struct) & 134217728) >>> 27;
    }

    public static int nsps_palette_predictor_initializers_present_flag(long struct) {
        return (nbitfield0(struct) & 268435456) >>> 28;
    }

    public static int nsps_palette_predictor_initializer_present_flag(long struct) {
        return (nbitfield0(struct) & 536870912) >>> 29;
    }

    public static int nintra_boundary_filtering_disabled_flag(long struct) {
        return (nbitfield0(struct) & 1073741824) >>> 30;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nsps_temporal_id_nesting_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nseparate_colour_plane_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nconformance_window_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nsps_sub_layer_ordering_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nscaling_list_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void nsps_scaling_list_data_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void namp_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void nsample_adaptive_offset_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    public static void npcm_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 8) & 256) | (nbitfield0(struct) & (-257)));
    }

    public static void npcm_loop_filter_disabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 9) & 512) | (nbitfield0(struct) & (-513)));
    }

    public static void nlong_term_ref_pics_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 10) & 1024) | (nbitfield0(struct) & (-1025)));
    }

    public static void nsps_temporal_mvp_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 11) & 2048) | (nbitfield0(struct) & (-2049)));
    }

    public static void nstrong_intra_smoothing_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 12) & 4096) | (nbitfield0(struct) & (-4097)));
    }

    public static void nvui_parameters_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 13) & 8192) | (nbitfield0(struct) & (-8193)));
    }

    public static void nsps_extension_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 14) & 16384) | (nbitfield0(struct) & (-16385)));
    }

    public static void nsps_range_extension_flag(long struct, int value) {
        nbitfield0(struct, ((value << 15) & 32768) | (nbitfield0(struct) & (-32769)));
    }

    public static void ntransform_skip_rotation_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 16) & 65536) | (nbitfield0(struct) & (-65537)));
    }

    public static void ntransform_skip_context_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 17) & 131072) | (nbitfield0(struct) & (-131073)));
    }

    public static void nimplicit_rdpcm_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 18) & 262144) | (nbitfield0(struct) & (-262145)));
    }

    public static void nexplicit_rdpcm_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 19) & 524288) | (nbitfield0(struct) & (-524289)));
    }

    public static void nextended_precision_processing_flag(long struct, int value) {
        nbitfield0(struct, ((value << 20) & 1048576) | (nbitfield0(struct) & (-1048577)));
    }

    public static void nintra_smoothing_disabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 21) & 2097152) | (nbitfield0(struct) & (-2097153)));
    }

    public static void nhigh_precision_offsets_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 22) & 4194304) | (nbitfield0(struct) & (-4194305)));
    }

    public static void npersistent_rice_adaptation_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 23) & 8388608) | (nbitfield0(struct) & (-8388609)));
    }

    public static void ncabac_bypass_alignment_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 24) & 16777216) | (nbitfield0(struct) & (-16777217)));
    }

    public static void nsps_scc_extension_flag(long struct, int value) {
        nbitfield0(struct, ((value << 25) & 33554432) | (nbitfield0(struct) & (-33554433)));
    }

    public static void nsps_curr_pic_ref_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 26) & 67108864) | (nbitfield0(struct) & (-67108865)));
    }

    public static void npalette_mode_enabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 27) & 134217728) | (nbitfield0(struct) & (-134217729)));
    }

    public static void nsps_palette_predictor_initializers_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 28) & 268435456) | (nbitfield0(struct) & (-268435457)));
    }

    public static void nsps_palette_predictor_initializer_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 29) & 536870912) | (nbitfield0(struct) & (-536870913)));
    }

    public static void nintra_boundary_filtering_disabled_flag(long struct, int value) {
        nbitfield0(struct, ((value << 30) & 1073741824) | (nbitfield0(struct) & (-1073741825)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SpsFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SpsFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265SpsFlags, Buffer> implements NativeResource {
        private static final StdVideoH265SpsFlags ELEMENT_FACTORY = StdVideoH265SpsFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265SpsFlags.SIZEOF);
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
        public StdVideoH265SpsFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean sps_temporal_id_nesting_flag() {
            return StdVideoH265SpsFlags.nsps_temporal_id_nesting_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean separate_colour_plane_flag() {
            return StdVideoH265SpsFlags.nseparate_colour_plane_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean conformance_window_flag() {
            return StdVideoH265SpsFlags.nconformance_window_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sps_sub_layer_ordering_info_present_flag() {
            return StdVideoH265SpsFlags.nsps_sub_layer_ordering_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean scaling_list_enabled_flag() {
            return StdVideoH265SpsFlags.nscaling_list_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sps_scaling_list_data_present_flag() {
            return StdVideoH265SpsFlags.nsps_scaling_list_data_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean amp_enabled_flag() {
            return StdVideoH265SpsFlags.namp_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sample_adaptive_offset_enabled_flag() {
            return StdVideoH265SpsFlags.nsample_adaptive_offset_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pcm_enabled_flag() {
            return StdVideoH265SpsFlags.npcm_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean pcm_loop_filter_disabled_flag() {
            return StdVideoH265SpsFlags.npcm_loop_filter_disabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean long_term_ref_pics_present_flag() {
            return StdVideoH265SpsFlags.nlong_term_ref_pics_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sps_temporal_mvp_enabled_flag() {
            return StdVideoH265SpsFlags.nsps_temporal_mvp_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean strong_intra_smoothing_enabled_flag() {
            return StdVideoH265SpsFlags.nstrong_intra_smoothing_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean vui_parameters_present_flag() {
            return StdVideoH265SpsFlags.nvui_parameters_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sps_extension_present_flag() {
            return StdVideoH265SpsFlags.nsps_extension_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sps_range_extension_flag() {
            return StdVideoH265SpsFlags.nsps_range_extension_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean transform_skip_rotation_enabled_flag() {
            return StdVideoH265SpsFlags.ntransform_skip_rotation_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean transform_skip_context_enabled_flag() {
            return StdVideoH265SpsFlags.ntransform_skip_context_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean implicit_rdpcm_enabled_flag() {
            return StdVideoH265SpsFlags.nimplicit_rdpcm_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean explicit_rdpcm_enabled_flag() {
            return StdVideoH265SpsFlags.nexplicit_rdpcm_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean extended_precision_processing_flag() {
            return StdVideoH265SpsFlags.nextended_precision_processing_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean intra_smoothing_disabled_flag() {
            return StdVideoH265SpsFlags.nintra_smoothing_disabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean high_precision_offsets_enabled_flag() {
            return StdVideoH265SpsFlags.nhigh_precision_offsets_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean persistent_rice_adaptation_enabled_flag() {
            return StdVideoH265SpsFlags.npersistent_rice_adaptation_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean cabac_bypass_alignment_enabled_flag() {
            return StdVideoH265SpsFlags.ncabac_bypass_alignment_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sps_scc_extension_flag() {
            return StdVideoH265SpsFlags.nsps_scc_extension_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sps_curr_pic_ref_enabled_flag() {
            return StdVideoH265SpsFlags.nsps_curr_pic_ref_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean palette_mode_enabled_flag() {
            return StdVideoH265SpsFlags.npalette_mode_enabled_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sps_palette_predictor_initializers_present_flag() {
            return StdVideoH265SpsFlags.nsps_palette_predictor_initializers_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sps_palette_predictor_initializer_present_flag() {
            return StdVideoH265SpsFlags.nsps_palette_predictor_initializer_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean intra_boundary_filtering_disabled_flag() {
            return StdVideoH265SpsFlags.nintra_boundary_filtering_disabled_flag(address()) != 0;
        }

        public Buffer sps_temporal_id_nesting_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsps_temporal_id_nesting_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer separate_colour_plane_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nseparate_colour_plane_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer conformance_window_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nconformance_window_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sps_sub_layer_ordering_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsps_sub_layer_ordering_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer scaling_list_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nscaling_list_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sps_scaling_list_data_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsps_scaling_list_data_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer amp_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.namp_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sample_adaptive_offset_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsample_adaptive_offset_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pcm_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.npcm_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pcm_loop_filter_disabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.npcm_loop_filter_disabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer long_term_ref_pics_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nlong_term_ref_pics_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sps_temporal_mvp_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsps_temporal_mvp_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer strong_intra_smoothing_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nstrong_intra_smoothing_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vui_parameters_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nvui_parameters_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sps_extension_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsps_extension_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sps_range_extension_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsps_range_extension_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer transform_skip_rotation_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.ntransform_skip_rotation_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer transform_skip_context_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.ntransform_skip_context_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer implicit_rdpcm_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nimplicit_rdpcm_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer explicit_rdpcm_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nexplicit_rdpcm_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extended_precision_processing_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nextended_precision_processing_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer intra_smoothing_disabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nintra_smoothing_disabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer high_precision_offsets_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nhigh_precision_offsets_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer persistent_rice_adaptation_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.npersistent_rice_adaptation_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cabac_bypass_alignment_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.ncabac_bypass_alignment_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sps_scc_extension_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsps_scc_extension_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sps_curr_pic_ref_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsps_curr_pic_ref_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer palette_mode_enabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.npalette_mode_enabled_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sps_palette_predictor_initializers_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsps_palette_predictor_initializers_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sps_palette_predictor_initializer_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nsps_palette_predictor_initializer_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer intra_boundary_filtering_disabled_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265SpsFlags.nintra_boundary_filtering_disabled_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
