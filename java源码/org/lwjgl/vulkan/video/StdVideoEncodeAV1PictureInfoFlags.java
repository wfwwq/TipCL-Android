package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1PictureInfoFlags.class */
public class StdVideoEncodeAV1PictureInfoFlags extends Struct<StdVideoEncodeAV1PictureInfoFlags> implements NativeResource {
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

    protected StdVideoEncodeAV1PictureInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeAV1PictureInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoEncodeAV1PictureInfoFlags(address, container);
    }

    public StdVideoEncodeAV1PictureInfoFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean error_resilient_mode() {
        return nerror_resilient_mode(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean disable_cdf_update() {
        return ndisable_cdf_update(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean use_superres() {
        return nuse_superres(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean render_and_frame_size_different() {
        return nrender_and_frame_size_different(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean allow_screen_content_tools() {
        return nallow_screen_content_tools(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean is_filter_switchable() {
        return nis_filter_switchable(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean force_integer_mv() {
        return nforce_integer_mv(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean frame_size_override_flag() {
        return nframe_size_override_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean buffer_removal_time_present_flag() {
        return nbuffer_removal_time_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean allow_intrabc() {
        return nallow_intrabc(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean frame_refs_short_signaling() {
        return nframe_refs_short_signaling(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean allow_high_precision_mv() {
        return nallow_high_precision_mv(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean is_motion_mode_switchable() {
        return nis_motion_mode_switchable(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean use_ref_frame_mvs() {
        return nuse_ref_frame_mvs(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean disable_frame_end_update_cdf() {
        return ndisable_frame_end_update_cdf(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean allow_warped_motion() {
        return nallow_warped_motion(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean reduced_tx_set() {
        return nreduced_tx_set(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean skip_mode_present() {
        return nskip_mode_present(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean delta_q_present() {
        return ndelta_q_present(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean delta_lf_present() {
        return ndelta_lf_present(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean delta_lf_multi() {
        return ndelta_lf_multi(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean segmentation_enabled() {
        return nsegmentation_enabled(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean segmentation_update_map() {
        return nsegmentation_update_map(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean segmentation_temporal_update() {
        return nsegmentation_temporal_update(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean segmentation_update_data() {
        return nsegmentation_update_data(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean UsesLr() {
        return nUsesLr(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean usesChromaLr() {
        return nusesChromaLr(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean show_frame() {
        return nshow_frame(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean showable_frame() {
        return nshowable_frame(address()) != 0;
    }

    public StdVideoEncodeAV1PictureInfoFlags error_resilient_mode(@NativeType("uint32_t") boolean value) {
        nerror_resilient_mode(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags disable_cdf_update(@NativeType("uint32_t") boolean value) {
        ndisable_cdf_update(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags use_superres(@NativeType("uint32_t") boolean value) {
        nuse_superres(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags render_and_frame_size_different(@NativeType("uint32_t") boolean value) {
        nrender_and_frame_size_different(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags allow_screen_content_tools(@NativeType("uint32_t") boolean value) {
        nallow_screen_content_tools(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags is_filter_switchable(@NativeType("uint32_t") boolean value) {
        nis_filter_switchable(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags force_integer_mv(@NativeType("uint32_t") boolean value) {
        nforce_integer_mv(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags frame_size_override_flag(@NativeType("uint32_t") boolean value) {
        nframe_size_override_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags buffer_removal_time_present_flag(@NativeType("uint32_t") boolean value) {
        nbuffer_removal_time_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags allow_intrabc(@NativeType("uint32_t") boolean value) {
        nallow_intrabc(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags frame_refs_short_signaling(@NativeType("uint32_t") boolean value) {
        nframe_refs_short_signaling(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags allow_high_precision_mv(@NativeType("uint32_t") boolean value) {
        nallow_high_precision_mv(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags is_motion_mode_switchable(@NativeType("uint32_t") boolean value) {
        nis_motion_mode_switchable(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags use_ref_frame_mvs(@NativeType("uint32_t") boolean value) {
        nuse_ref_frame_mvs(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags disable_frame_end_update_cdf(@NativeType("uint32_t") boolean value) {
        ndisable_frame_end_update_cdf(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags allow_warped_motion(@NativeType("uint32_t") boolean value) {
        nallow_warped_motion(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags reduced_tx_set(@NativeType("uint32_t") boolean value) {
        nreduced_tx_set(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags skip_mode_present(@NativeType("uint32_t") boolean value) {
        nskip_mode_present(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags delta_q_present(@NativeType("uint32_t") boolean value) {
        ndelta_q_present(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags delta_lf_present(@NativeType("uint32_t") boolean value) {
        ndelta_lf_present(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags delta_lf_multi(@NativeType("uint32_t") boolean value) {
        ndelta_lf_multi(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags segmentation_enabled(@NativeType("uint32_t") boolean value) {
        nsegmentation_enabled(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags segmentation_update_map(@NativeType("uint32_t") boolean value) {
        nsegmentation_update_map(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags segmentation_temporal_update(@NativeType("uint32_t") boolean value) {
        nsegmentation_temporal_update(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags segmentation_update_data(@NativeType("uint32_t") boolean value) {
        nsegmentation_update_data(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags UsesLr(@NativeType("uint32_t") boolean value) {
        nUsesLr(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags usesChromaLr(@NativeType("uint32_t") boolean value) {
        nusesChromaLr(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags show_frame(@NativeType("uint32_t") boolean value) {
        nshow_frame(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags showable_frame(@NativeType("uint32_t") boolean value) {
        nshowable_frame(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags set(boolean error_resilient_mode, boolean disable_cdf_update, boolean use_superres, boolean render_and_frame_size_different, boolean allow_screen_content_tools, boolean is_filter_switchable, boolean force_integer_mv, boolean frame_size_override_flag, boolean buffer_removal_time_present_flag, boolean allow_intrabc, boolean frame_refs_short_signaling, boolean allow_high_precision_mv, boolean is_motion_mode_switchable, boolean use_ref_frame_mvs, boolean disable_frame_end_update_cdf, boolean allow_warped_motion, boolean reduced_tx_set, boolean skip_mode_present, boolean delta_q_present, boolean delta_lf_present, boolean delta_lf_multi, boolean segmentation_enabled, boolean segmentation_update_map, boolean segmentation_temporal_update, boolean segmentation_update_data, boolean UsesLr, boolean usesChromaLr, boolean show_frame, boolean showable_frame) {
        error_resilient_mode(error_resilient_mode);
        disable_cdf_update(disable_cdf_update);
        use_superres(use_superres);
        render_and_frame_size_different(render_and_frame_size_different);
        allow_screen_content_tools(allow_screen_content_tools);
        is_filter_switchable(is_filter_switchable);
        force_integer_mv(force_integer_mv);
        frame_size_override_flag(frame_size_override_flag);
        buffer_removal_time_present_flag(buffer_removal_time_present_flag);
        allow_intrabc(allow_intrabc);
        frame_refs_short_signaling(frame_refs_short_signaling);
        allow_high_precision_mv(allow_high_precision_mv);
        is_motion_mode_switchable(is_motion_mode_switchable);
        use_ref_frame_mvs(use_ref_frame_mvs);
        disable_frame_end_update_cdf(disable_frame_end_update_cdf);
        allow_warped_motion(allow_warped_motion);
        reduced_tx_set(reduced_tx_set);
        skip_mode_present(skip_mode_present);
        delta_q_present(delta_q_present);
        delta_lf_present(delta_lf_present);
        delta_lf_multi(delta_lf_multi);
        segmentation_enabled(segmentation_enabled);
        segmentation_update_map(segmentation_update_map);
        segmentation_temporal_update(segmentation_temporal_update);
        segmentation_update_data(segmentation_update_data);
        UsesLr(UsesLr);
        usesChromaLr(usesChromaLr);
        show_frame(show_frame);
        showable_frame(showable_frame);
        return this;
    }

    public StdVideoEncodeAV1PictureInfoFlags set(StdVideoEncodeAV1PictureInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeAV1PictureInfoFlags malloc() {
        return new StdVideoEncodeAV1PictureInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeAV1PictureInfoFlags calloc() {
        return new StdVideoEncodeAV1PictureInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeAV1PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1PictureInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeAV1PictureInfoFlags create(long address) {
        return new StdVideoEncodeAV1PictureInfoFlags(address, null);
    }

    public static StdVideoEncodeAV1PictureInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeAV1PictureInfoFlags(address, null);
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

    public static StdVideoEncodeAV1PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeAV1PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nerror_resilient_mode(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int ndisable_cdf_update(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nuse_superres(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nrender_and_frame_size_different(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nallow_screen_content_tools(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int nis_filter_switchable(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int nforce_integer_mv(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int nframe_size_override_flag(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static int nbuffer_removal_time_present_flag(long struct) {
        return (nbitfield0(struct) & 256) >>> 8;
    }

    public static int nallow_intrabc(long struct) {
        return (nbitfield0(struct) & 512) >>> 9;
    }

    public static int nframe_refs_short_signaling(long struct) {
        return (nbitfield0(struct) & 1024) >>> 10;
    }

    public static int nallow_high_precision_mv(long struct) {
        return (nbitfield0(struct) & 2048) >>> 11;
    }

    public static int nis_motion_mode_switchable(long struct) {
        return (nbitfield0(struct) & 4096) >>> 12;
    }

    public static int nuse_ref_frame_mvs(long struct) {
        return (nbitfield0(struct) & 8192) >>> 13;
    }

    public static int ndisable_frame_end_update_cdf(long struct) {
        return (nbitfield0(struct) & 16384) >>> 14;
    }

    public static int nallow_warped_motion(long struct) {
        return (nbitfield0(struct) & 32768) >>> 15;
    }

    public static int nreduced_tx_set(long struct) {
        return (nbitfield0(struct) & 65536) >>> 16;
    }

    public static int nskip_mode_present(long struct) {
        return (nbitfield0(struct) & 131072) >>> 17;
    }

    public static int ndelta_q_present(long struct) {
        return (nbitfield0(struct) & 262144) >>> 18;
    }

    public static int ndelta_lf_present(long struct) {
        return (nbitfield0(struct) & 524288) >>> 19;
    }

    public static int ndelta_lf_multi(long struct) {
        return (nbitfield0(struct) & 1048576) >>> 20;
    }

    public static int nsegmentation_enabled(long struct) {
        return (nbitfield0(struct) & 2097152) >>> 21;
    }

    public static int nsegmentation_update_map(long struct) {
        return (nbitfield0(struct) & 4194304) >>> 22;
    }

    public static int nsegmentation_temporal_update(long struct) {
        return (nbitfield0(struct) & 8388608) >>> 23;
    }

    public static int nsegmentation_update_data(long struct) {
        return (nbitfield0(struct) & 16777216) >>> 24;
    }

    public static int nUsesLr(long struct) {
        return (nbitfield0(struct) & 33554432) >>> 25;
    }

    public static int nusesChromaLr(long struct) {
        return (nbitfield0(struct) & 67108864) >>> 26;
    }

    public static int nshow_frame(long struct) {
        return (nbitfield0(struct) & 134217728) >>> 27;
    }

    public static int nshowable_frame(long struct) {
        return (nbitfield0(struct) & 268435456) >>> 28;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & 7;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nerror_resilient_mode(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void ndisable_cdf_update(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nuse_superres(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nrender_and_frame_size_different(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nallow_screen_content_tools(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void nis_filter_switchable(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void nforce_integer_mv(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void nframe_size_override_flag(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    public static void nbuffer_removal_time_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 8) & 256) | (nbitfield0(struct) & (-257)));
    }

    public static void nallow_intrabc(long struct, int value) {
        nbitfield0(struct, ((value << 9) & 512) | (nbitfield0(struct) & (-513)));
    }

    public static void nframe_refs_short_signaling(long struct, int value) {
        nbitfield0(struct, ((value << 10) & 1024) | (nbitfield0(struct) & (-1025)));
    }

    public static void nallow_high_precision_mv(long struct, int value) {
        nbitfield0(struct, ((value << 11) & 2048) | (nbitfield0(struct) & (-2049)));
    }

    public static void nis_motion_mode_switchable(long struct, int value) {
        nbitfield0(struct, ((value << 12) & 4096) | (nbitfield0(struct) & (-4097)));
    }

    public static void nuse_ref_frame_mvs(long struct, int value) {
        nbitfield0(struct, ((value << 13) & 8192) | (nbitfield0(struct) & (-8193)));
    }

    public static void ndisable_frame_end_update_cdf(long struct, int value) {
        nbitfield0(struct, ((value << 14) & 16384) | (nbitfield0(struct) & (-16385)));
    }

    public static void nallow_warped_motion(long struct, int value) {
        nbitfield0(struct, ((value << 15) & 32768) | (nbitfield0(struct) & (-32769)));
    }

    public static void nreduced_tx_set(long struct, int value) {
        nbitfield0(struct, ((value << 16) & 65536) | (nbitfield0(struct) & (-65537)));
    }

    public static void nskip_mode_present(long struct, int value) {
        nbitfield0(struct, ((value << 17) & 131072) | (nbitfield0(struct) & (-131073)));
    }

    public static void ndelta_q_present(long struct, int value) {
        nbitfield0(struct, ((value << 18) & 262144) | (nbitfield0(struct) & (-262145)));
    }

    public static void ndelta_lf_present(long struct, int value) {
        nbitfield0(struct, ((value << 19) & 524288) | (nbitfield0(struct) & (-524289)));
    }

    public static void ndelta_lf_multi(long struct, int value) {
        nbitfield0(struct, ((value << 20) & 1048576) | (nbitfield0(struct) & (-1048577)));
    }

    public static void nsegmentation_enabled(long struct, int value) {
        nbitfield0(struct, ((value << 21) & 2097152) | (nbitfield0(struct) & (-2097153)));
    }

    public static void nsegmentation_update_map(long struct, int value) {
        nbitfield0(struct, ((value << 22) & 4194304) | (nbitfield0(struct) & (-4194305)));
    }

    public static void nsegmentation_temporal_update(long struct, int value) {
        nbitfield0(struct, ((value << 23) & 8388608) | (nbitfield0(struct) & (-8388609)));
    }

    public static void nsegmentation_update_data(long struct, int value) {
        nbitfield0(struct, ((value << 24) & 16777216) | (nbitfield0(struct) & (-16777217)));
    }

    public static void nUsesLr(long struct, int value) {
        nbitfield0(struct, ((value << 25) & 33554432) | (nbitfield0(struct) & (-33554433)));
    }

    public static void nusesChromaLr(long struct, int value) {
        nbitfield0(struct, ((value << 26) & 67108864) | (nbitfield0(struct) & (-67108865)));
    }

    public static void nshow_frame(long struct, int value) {
        nbitfield0(struct, ((value << 27) & 134217728) | (nbitfield0(struct) & (-134217729)));
    }

    public static void nshowable_frame(long struct, int value) {
        nbitfield0(struct, ((value << 28) & 268435456) | (nbitfield0(struct) & (-268435457)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-8)) | (value & 7));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1PictureInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1PictureInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoEncodeAV1PictureInfoFlags ELEMENT_FACTORY = StdVideoEncodeAV1PictureInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeAV1PictureInfoFlags.SIZEOF);
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
        public StdVideoEncodeAV1PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean error_resilient_mode() {
            return StdVideoEncodeAV1PictureInfoFlags.nerror_resilient_mode(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean disable_cdf_update() {
            return StdVideoEncodeAV1PictureInfoFlags.ndisable_cdf_update(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean use_superres() {
            return StdVideoEncodeAV1PictureInfoFlags.nuse_superres(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean render_and_frame_size_different() {
            return StdVideoEncodeAV1PictureInfoFlags.nrender_and_frame_size_different(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean allow_screen_content_tools() {
            return StdVideoEncodeAV1PictureInfoFlags.nallow_screen_content_tools(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean is_filter_switchable() {
            return StdVideoEncodeAV1PictureInfoFlags.nis_filter_switchable(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean force_integer_mv() {
            return StdVideoEncodeAV1PictureInfoFlags.nforce_integer_mv(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean frame_size_override_flag() {
            return StdVideoEncodeAV1PictureInfoFlags.nframe_size_override_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean buffer_removal_time_present_flag() {
            return StdVideoEncodeAV1PictureInfoFlags.nbuffer_removal_time_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean allow_intrabc() {
            return StdVideoEncodeAV1PictureInfoFlags.nallow_intrabc(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean frame_refs_short_signaling() {
            return StdVideoEncodeAV1PictureInfoFlags.nframe_refs_short_signaling(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean allow_high_precision_mv() {
            return StdVideoEncodeAV1PictureInfoFlags.nallow_high_precision_mv(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean is_motion_mode_switchable() {
            return StdVideoEncodeAV1PictureInfoFlags.nis_motion_mode_switchable(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean use_ref_frame_mvs() {
            return StdVideoEncodeAV1PictureInfoFlags.nuse_ref_frame_mvs(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean disable_frame_end_update_cdf() {
            return StdVideoEncodeAV1PictureInfoFlags.ndisable_frame_end_update_cdf(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean allow_warped_motion() {
            return StdVideoEncodeAV1PictureInfoFlags.nallow_warped_motion(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean reduced_tx_set() {
            return StdVideoEncodeAV1PictureInfoFlags.nreduced_tx_set(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean skip_mode_present() {
            return StdVideoEncodeAV1PictureInfoFlags.nskip_mode_present(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean delta_q_present() {
            return StdVideoEncodeAV1PictureInfoFlags.ndelta_q_present(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean delta_lf_present() {
            return StdVideoEncodeAV1PictureInfoFlags.ndelta_lf_present(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean delta_lf_multi() {
            return StdVideoEncodeAV1PictureInfoFlags.ndelta_lf_multi(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean segmentation_enabled() {
            return StdVideoEncodeAV1PictureInfoFlags.nsegmentation_enabled(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean segmentation_update_map() {
            return StdVideoEncodeAV1PictureInfoFlags.nsegmentation_update_map(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean segmentation_temporal_update() {
            return StdVideoEncodeAV1PictureInfoFlags.nsegmentation_temporal_update(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean segmentation_update_data() {
            return StdVideoEncodeAV1PictureInfoFlags.nsegmentation_update_data(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean UsesLr() {
            return StdVideoEncodeAV1PictureInfoFlags.nUsesLr(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean usesChromaLr() {
            return StdVideoEncodeAV1PictureInfoFlags.nusesChromaLr(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean show_frame() {
            return StdVideoEncodeAV1PictureInfoFlags.nshow_frame(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean showable_frame() {
            return StdVideoEncodeAV1PictureInfoFlags.nshowable_frame(address()) != 0;
        }

        public Buffer error_resilient_mode(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nerror_resilient_mode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer disable_cdf_update(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.ndisable_cdf_update(address(), value ? 1 : 0);
            return this;
        }

        public Buffer use_superres(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nuse_superres(address(), value ? 1 : 0);
            return this;
        }

        public Buffer render_and_frame_size_different(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nrender_and_frame_size_different(address(), value ? 1 : 0);
            return this;
        }

        public Buffer allow_screen_content_tools(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nallow_screen_content_tools(address(), value ? 1 : 0);
            return this;
        }

        public Buffer is_filter_switchable(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nis_filter_switchable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer force_integer_mv(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nforce_integer_mv(address(), value ? 1 : 0);
            return this;
        }

        public Buffer frame_size_override_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nframe_size_override_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer buffer_removal_time_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nbuffer_removal_time_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer allow_intrabc(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nallow_intrabc(address(), value ? 1 : 0);
            return this;
        }

        public Buffer frame_refs_short_signaling(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nframe_refs_short_signaling(address(), value ? 1 : 0);
            return this;
        }

        public Buffer allow_high_precision_mv(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nallow_high_precision_mv(address(), value ? 1 : 0);
            return this;
        }

        public Buffer is_motion_mode_switchable(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nis_motion_mode_switchable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer use_ref_frame_mvs(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nuse_ref_frame_mvs(address(), value ? 1 : 0);
            return this;
        }

        public Buffer disable_frame_end_update_cdf(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.ndisable_frame_end_update_cdf(address(), value ? 1 : 0);
            return this;
        }

        public Buffer allow_warped_motion(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nallow_warped_motion(address(), value ? 1 : 0);
            return this;
        }

        public Buffer reduced_tx_set(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nreduced_tx_set(address(), value ? 1 : 0);
            return this;
        }

        public Buffer skip_mode_present(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nskip_mode_present(address(), value ? 1 : 0);
            return this;
        }

        public Buffer delta_q_present(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.ndelta_q_present(address(), value ? 1 : 0);
            return this;
        }

        public Buffer delta_lf_present(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.ndelta_lf_present(address(), value ? 1 : 0);
            return this;
        }

        public Buffer delta_lf_multi(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.ndelta_lf_multi(address(), value ? 1 : 0);
            return this;
        }

        public Buffer segmentation_enabled(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nsegmentation_enabled(address(), value ? 1 : 0);
            return this;
        }

        public Buffer segmentation_update_map(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nsegmentation_update_map(address(), value ? 1 : 0);
            return this;
        }

        public Buffer segmentation_temporal_update(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nsegmentation_temporal_update(address(), value ? 1 : 0);
            return this;
        }

        public Buffer segmentation_update_data(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nsegmentation_update_data(address(), value ? 1 : 0);
            return this;
        }

        public Buffer UsesLr(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nUsesLr(address(), value ? 1 : 0);
            return this;
        }

        public Buffer usesChromaLr(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nusesChromaLr(address(), value ? 1 : 0);
            return this;
        }

        public Buffer show_frame(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nshow_frame(address(), value ? 1 : 0);
            return this;
        }

        public Buffer showable_frame(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeAV1PictureInfoFlags.nshowable_frame(address(), value ? 1 : 0);
            return this;
        }
    }
}
