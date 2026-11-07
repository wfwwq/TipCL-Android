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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSet.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSet.class */
public class StdVideoH265SequenceParameterSet extends Struct<StdVideoH265SequenceParameterSet> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int CHROMA_FORMAT_IDC;
    public static final int PIC_WIDTH_IN_LUMA_SAMPLES;
    public static final int PIC_HEIGHT_IN_LUMA_SAMPLES;
    public static final int SPS_VIDEO_PARAMETER_SET_ID;
    public static final int SPS_MAX_SUB_LAYERS_MINUS1;
    public static final int SPS_SEQ_PARAMETER_SET_ID;
    public static final int BIT_DEPTH_LUMA_MINUS8;
    public static final int BIT_DEPTH_CHROMA_MINUS8;
    public static final int LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4;
    public static final int SPS_MAX_DEC_PIC_BUFFERING_MINUS1;
    public static final int LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3;
    public static final int LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE;
    public static final int LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2;
    public static final int LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE;
    public static final int MAX_TRANSFORM_HIERARCHY_DEPTH_INTER;
    public static final int MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA;
    public static final int NUM_SHORT_TERM_REF_PIC_SETS;
    public static final int NUM_LONG_TERM_REF_PICS_SPS;
    public static final int PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1;
    public static final int PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1;
    public static final int LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3;
    public static final int LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE;
    public static final int RESERVED1;
    public static final int RESERVED2;
    public static final int PALETTE_MAX_SIZE;
    public static final int DELTA_PALETTE_MAX_PREDICTOR_SIZE;
    public static final int MOTION_VECTOR_RESOLUTION_CONTROL_IDC;
    public static final int SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1;
    public static final int CONF_WIN_LEFT_OFFSET;
    public static final int CONF_WIN_RIGHT_OFFSET;
    public static final int CONF_WIN_TOP_OFFSET;
    public static final int CONF_WIN_BOTTOM_OFFSET;
    public static final int PPROFILETIERLEVEL;
    public static final int PDECPICBUFMGR;
    public static final int PSCALINGLISTS;
    public static final int PSHORTTERMREFPICSET;
    public static final int PLONGTERMREFPICSSPS;
    public static final int PSEQUENCEPARAMETERSETVUI;
    public static final int PPREDICTORPALETTEENTRIES;

    static {
        Struct.Layout layout = __struct(__member(StdVideoH265SpsFlags.SIZEOF, StdVideoH265SpsFlags.ALIGNOF), __member(4), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        CHROMA_FORMAT_IDC = layout.offsetof(1);
        PIC_WIDTH_IN_LUMA_SAMPLES = layout.offsetof(2);
        PIC_HEIGHT_IN_LUMA_SAMPLES = layout.offsetof(3);
        SPS_VIDEO_PARAMETER_SET_ID = layout.offsetof(4);
        SPS_MAX_SUB_LAYERS_MINUS1 = layout.offsetof(5);
        SPS_SEQ_PARAMETER_SET_ID = layout.offsetof(6);
        BIT_DEPTH_LUMA_MINUS8 = layout.offsetof(7);
        BIT_DEPTH_CHROMA_MINUS8 = layout.offsetof(8);
        LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4 = layout.offsetof(9);
        SPS_MAX_DEC_PIC_BUFFERING_MINUS1 = layout.offsetof(10);
        LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3 = layout.offsetof(11);
        LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE = layout.offsetof(12);
        LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2 = layout.offsetof(13);
        LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE = layout.offsetof(14);
        MAX_TRANSFORM_HIERARCHY_DEPTH_INTER = layout.offsetof(15);
        MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA = layout.offsetof(16);
        NUM_SHORT_TERM_REF_PIC_SETS = layout.offsetof(17);
        NUM_LONG_TERM_REF_PICS_SPS = layout.offsetof(18);
        PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1 = layout.offsetof(19);
        PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1 = layout.offsetof(20);
        LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3 = layout.offsetof(21);
        LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE = layout.offsetof(22);
        RESERVED1 = layout.offsetof(23);
        RESERVED2 = layout.offsetof(24);
        PALETTE_MAX_SIZE = layout.offsetof(25);
        DELTA_PALETTE_MAX_PREDICTOR_SIZE = layout.offsetof(26);
        MOTION_VECTOR_RESOLUTION_CONTROL_IDC = layout.offsetof(27);
        SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1 = layout.offsetof(28);
        CONF_WIN_LEFT_OFFSET = layout.offsetof(29);
        CONF_WIN_RIGHT_OFFSET = layout.offsetof(30);
        CONF_WIN_TOP_OFFSET = layout.offsetof(31);
        CONF_WIN_BOTTOM_OFFSET = layout.offsetof(32);
        PPROFILETIERLEVEL = layout.offsetof(33);
        PDECPICBUFMGR = layout.offsetof(34);
        PSCALINGLISTS = layout.offsetof(35);
        PSHORTTERMREFPICSET = layout.offsetof(36);
        PLONGTERMREFPICSSPS = layout.offsetof(37);
        PSEQUENCEPARAMETERSETVUI = layout.offsetof(38);
        PPREDICTORPALETTEENTRIES = layout.offsetof(39);
    }

    protected StdVideoH265SequenceParameterSet(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265SequenceParameterSet create(long address, ByteBuffer container) {
        return new StdVideoH265SequenceParameterSet(address, container);
    }

    public StdVideoH265SequenceParameterSet(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoH265SpsFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH265ChromaFormatIdc")
    public int chroma_format_idc() {
        return nchroma_format_idc(address());
    }

    @NativeType("uint32_t")
    public int pic_width_in_luma_samples() {
        return npic_width_in_luma_samples(address());
    }

    @NativeType("uint32_t")
    public int pic_height_in_luma_samples() {
        return npic_height_in_luma_samples(address());
    }

    @NativeType("uint8_t")
    public byte sps_video_parameter_set_id() {
        return nsps_video_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte sps_max_sub_layers_minus1() {
        return nsps_max_sub_layers_minus1(address());
    }

    @NativeType("uint8_t")
    public byte sps_seq_parameter_set_id() {
        return nsps_seq_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte bit_depth_luma_minus8() {
        return nbit_depth_luma_minus8(address());
    }

    @NativeType("uint8_t")
    public byte bit_depth_chroma_minus8() {
        return nbit_depth_chroma_minus8(address());
    }

    @NativeType("uint8_t")
    public byte log2_max_pic_order_cnt_lsb_minus4() {
        return nlog2_max_pic_order_cnt_lsb_minus4(address());
    }

    @NativeType("uint8_t")
    public byte sps_max_dec_pic_buffering_minus1() {
        return nsps_max_dec_pic_buffering_minus1(address());
    }

    @NativeType("uint8_t")
    public byte log2_min_luma_coding_block_size_minus3() {
        return nlog2_min_luma_coding_block_size_minus3(address());
    }

    @NativeType("uint8_t")
    public byte log2_diff_max_min_luma_coding_block_size() {
        return nlog2_diff_max_min_luma_coding_block_size(address());
    }

    @NativeType("uint8_t")
    public byte log2_min_luma_transform_block_size_minus2() {
        return nlog2_min_luma_transform_block_size_minus2(address());
    }

    @NativeType("uint8_t")
    public byte log2_diff_max_min_luma_transform_block_size() {
        return nlog2_diff_max_min_luma_transform_block_size(address());
    }

    @NativeType("uint8_t")
    public byte max_transform_hierarchy_depth_inter() {
        return nmax_transform_hierarchy_depth_inter(address());
    }

    @NativeType("uint8_t")
    public byte max_transform_hierarchy_depth_intra() {
        return nmax_transform_hierarchy_depth_intra(address());
    }

    @NativeType("uint8_t")
    public byte num_short_term_ref_pic_sets() {
        return nnum_short_term_ref_pic_sets(address());
    }

    @NativeType("uint8_t")
    public byte num_long_term_ref_pics_sps() {
        return nnum_long_term_ref_pics_sps(address());
    }

    @NativeType("uint8_t")
    public byte pcm_sample_bit_depth_luma_minus1() {
        return npcm_sample_bit_depth_luma_minus1(address());
    }

    @NativeType("uint8_t")
    public byte pcm_sample_bit_depth_chroma_minus1() {
        return npcm_sample_bit_depth_chroma_minus1(address());
    }

    @NativeType("uint8_t")
    public byte log2_min_pcm_luma_coding_block_size_minus3() {
        return nlog2_min_pcm_luma_coding_block_size_minus3(address());
    }

    @NativeType("uint8_t")
    public byte log2_diff_max_min_pcm_luma_coding_block_size() {
        return nlog2_diff_max_min_pcm_luma_coding_block_size(address());
    }

    @NativeType("uint8_t")
    public byte palette_max_size() {
        return npalette_max_size(address());
    }

    @NativeType("uint8_t")
    public byte delta_palette_max_predictor_size() {
        return ndelta_palette_max_predictor_size(address());
    }

    @NativeType("uint8_t")
    public byte motion_vector_resolution_control_idc() {
        return nmotion_vector_resolution_control_idc(address());
    }

    @NativeType("uint8_t")
    public byte sps_num_palette_predictor_initializer_minus1() {
        return nsps_num_palette_predictor_initializer_minus1(address());
    }

    @NativeType("uint32_t")
    public int conf_win_left_offset() {
        return nconf_win_left_offset(address());
    }

    @NativeType("uint32_t")
    public int conf_win_right_offset() {
        return nconf_win_right_offset(address());
    }

    @NativeType("uint32_t")
    public int conf_win_top_offset() {
        return nconf_win_top_offset(address());
    }

    @NativeType("uint32_t")
    public int conf_win_bottom_offset() {
        return nconf_win_bottom_offset(address());
    }

    @NativeType("StdVideoH265ProfileTierLevel const *")
    public StdVideoH265ProfileTierLevel pProfileTierLevel() {
        return npProfileTierLevel(address());
    }

    @NativeType("StdVideoH265DecPicBufMgr const *")
    public StdVideoH265DecPicBufMgr pDecPicBufMgr() {
        return npDecPicBufMgr(address());
    }

    @NativeType("StdVideoH265ScalingLists const *")
    public StdVideoH265ScalingLists pScalingLists() {
        return npScalingLists(address());
    }

    @NativeType("StdVideoH265ShortTermRefPicSet const *")
    public StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
        return npShortTermRefPicSet(address());
    }

    @NativeType("StdVideoH265LongTermRefPicsSps const *")
    public StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps() {
        return npLongTermRefPicsSps(address());
    }

    @NativeType("StdVideoH265SequenceParameterSetVui const *")
    public StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui() {
        return npSequenceParameterSetVui(address());
    }

    @NativeType("StdVideoH265PredictorPaletteEntries const *")
    public StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() {
        return npPredictorPaletteEntries(address());
    }

    public StdVideoH265SequenceParameterSet flags(StdVideoH265SpsFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet flags(Consumer<StdVideoH265SpsFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoH265SequenceParameterSet chroma_format_idc(@NativeType("StdVideoH265ChromaFormatIdc") int value) {
        nchroma_format_idc(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pic_width_in_luma_samples(@NativeType("uint32_t") int value) {
        npic_width_in_luma_samples(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pic_height_in_luma_samples(@NativeType("uint32_t") int value) {
        npic_height_in_luma_samples(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet sps_video_parameter_set_id(@NativeType("uint8_t") byte value) {
        nsps_video_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet sps_max_sub_layers_minus1(@NativeType("uint8_t") byte value) {
        nsps_max_sub_layers_minus1(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet sps_seq_parameter_set_id(@NativeType("uint8_t") byte value) {
        nsps_seq_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet bit_depth_luma_minus8(@NativeType("uint8_t") byte value) {
        nbit_depth_luma_minus8(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet bit_depth_chroma_minus8(@NativeType("uint8_t") byte value) {
        nbit_depth_chroma_minus8(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(@NativeType("uint8_t") byte value) {
        nlog2_max_pic_order_cnt_lsb_minus4(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet sps_max_dec_pic_buffering_minus1(@NativeType("uint8_t") byte value) {
        nsps_max_dec_pic_buffering_minus1(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet log2_min_luma_coding_block_size_minus3(@NativeType("uint8_t") byte value) {
        nlog2_min_luma_coding_block_size_minus3(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet log2_diff_max_min_luma_coding_block_size(@NativeType("uint8_t") byte value) {
        nlog2_diff_max_min_luma_coding_block_size(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet log2_min_luma_transform_block_size_minus2(@NativeType("uint8_t") byte value) {
        nlog2_min_luma_transform_block_size_minus2(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet log2_diff_max_min_luma_transform_block_size(@NativeType("uint8_t") byte value) {
        nlog2_diff_max_min_luma_transform_block_size(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_inter(@NativeType("uint8_t") byte value) {
        nmax_transform_hierarchy_depth_inter(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_intra(@NativeType("uint8_t") byte value) {
        nmax_transform_hierarchy_depth_intra(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet num_short_term_ref_pic_sets(@NativeType("uint8_t") byte value) {
        nnum_short_term_ref_pic_sets(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet num_long_term_ref_pics_sps(@NativeType("uint8_t") byte value) {
        nnum_long_term_ref_pics_sps(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pcm_sample_bit_depth_luma_minus1(@NativeType("uint8_t") byte value) {
        npcm_sample_bit_depth_luma_minus1(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pcm_sample_bit_depth_chroma_minus1(@NativeType("uint8_t") byte value) {
        npcm_sample_bit_depth_chroma_minus1(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet log2_min_pcm_luma_coding_block_size_minus3(@NativeType("uint8_t") byte value) {
        nlog2_min_pcm_luma_coding_block_size_minus3(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet log2_diff_max_min_pcm_luma_coding_block_size(@NativeType("uint8_t") byte value) {
        nlog2_diff_max_min_pcm_luma_coding_block_size(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet palette_max_size(@NativeType("uint8_t") byte value) {
        npalette_max_size(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet delta_palette_max_predictor_size(@NativeType("uint8_t") byte value) {
        ndelta_palette_max_predictor_size(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet motion_vector_resolution_control_idc(@NativeType("uint8_t") byte value) {
        nmotion_vector_resolution_control_idc(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet sps_num_palette_predictor_initializer_minus1(@NativeType("uint8_t") byte value) {
        nsps_num_palette_predictor_initializer_minus1(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet conf_win_left_offset(@NativeType("uint32_t") int value) {
        nconf_win_left_offset(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet conf_win_right_offset(@NativeType("uint32_t") int value) {
        nconf_win_right_offset(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet conf_win_top_offset(@NativeType("uint32_t") int value) {
        nconf_win_top_offset(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet conf_win_bottom_offset(@NativeType("uint32_t") int value) {
        nconf_win_bottom_offset(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pProfileTierLevel(@NativeType("StdVideoH265ProfileTierLevel const *") StdVideoH265ProfileTierLevel value) {
        npProfileTierLevel(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pDecPicBufMgr(@NativeType("StdVideoH265DecPicBufMgr const *") StdVideoH265DecPicBufMgr value) {
        npDecPicBufMgr(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pScalingLists(@NativeType("StdVideoH265ScalingLists const *") StdVideoH265ScalingLists value) {
        npScalingLists(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pShortTermRefPicSet(@NativeType("StdVideoH265ShortTermRefPicSet const *") StdVideoH265ShortTermRefPicSet value) {
        npShortTermRefPicSet(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pLongTermRefPicsSps(@NativeType("StdVideoH265LongTermRefPicsSps const *") StdVideoH265LongTermRefPicsSps value) {
        npLongTermRefPicsSps(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pSequenceParameterSetVui(@NativeType("StdVideoH265SequenceParameterSetVui const *") StdVideoH265SequenceParameterSetVui value) {
        npSequenceParameterSetVui(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet pPredictorPaletteEntries(@NativeType("StdVideoH265PredictorPaletteEntries const *") StdVideoH265PredictorPaletteEntries value) {
        npPredictorPaletteEntries(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSet set(StdVideoH265SpsFlags flags, int chroma_format_idc, int pic_width_in_luma_samples, int pic_height_in_luma_samples, byte sps_video_parameter_set_id, byte sps_max_sub_layers_minus1, byte sps_seq_parameter_set_id, byte bit_depth_luma_minus8, byte bit_depth_chroma_minus8, byte log2_max_pic_order_cnt_lsb_minus4, byte sps_max_dec_pic_buffering_minus1, byte log2_min_luma_coding_block_size_minus3, byte log2_diff_max_min_luma_coding_block_size, byte log2_min_luma_transform_block_size_minus2, byte log2_diff_max_min_luma_transform_block_size, byte max_transform_hierarchy_depth_inter, byte max_transform_hierarchy_depth_intra, byte num_short_term_ref_pic_sets, byte num_long_term_ref_pics_sps, byte pcm_sample_bit_depth_luma_minus1, byte pcm_sample_bit_depth_chroma_minus1, byte log2_min_pcm_luma_coding_block_size_minus3, byte log2_diff_max_min_pcm_luma_coding_block_size, byte palette_max_size, byte delta_palette_max_predictor_size, byte motion_vector_resolution_control_idc, byte sps_num_palette_predictor_initializer_minus1, int conf_win_left_offset, int conf_win_right_offset, int conf_win_top_offset, int conf_win_bottom_offset, StdVideoH265ProfileTierLevel pProfileTierLevel, StdVideoH265DecPicBufMgr pDecPicBufMgr, StdVideoH265ScalingLists pScalingLists, StdVideoH265ShortTermRefPicSet pShortTermRefPicSet, StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps, StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui, StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries) {
        flags(flags);
        chroma_format_idc(chroma_format_idc);
        pic_width_in_luma_samples(pic_width_in_luma_samples);
        pic_height_in_luma_samples(pic_height_in_luma_samples);
        sps_video_parameter_set_id(sps_video_parameter_set_id);
        sps_max_sub_layers_minus1(sps_max_sub_layers_minus1);
        sps_seq_parameter_set_id(sps_seq_parameter_set_id);
        bit_depth_luma_minus8(bit_depth_luma_minus8);
        bit_depth_chroma_minus8(bit_depth_chroma_minus8);
        log2_max_pic_order_cnt_lsb_minus4(log2_max_pic_order_cnt_lsb_minus4);
        sps_max_dec_pic_buffering_minus1(sps_max_dec_pic_buffering_minus1);
        log2_min_luma_coding_block_size_minus3(log2_min_luma_coding_block_size_minus3);
        log2_diff_max_min_luma_coding_block_size(log2_diff_max_min_luma_coding_block_size);
        log2_min_luma_transform_block_size_minus2(log2_min_luma_transform_block_size_minus2);
        log2_diff_max_min_luma_transform_block_size(log2_diff_max_min_luma_transform_block_size);
        max_transform_hierarchy_depth_inter(max_transform_hierarchy_depth_inter);
        max_transform_hierarchy_depth_intra(max_transform_hierarchy_depth_intra);
        num_short_term_ref_pic_sets(num_short_term_ref_pic_sets);
        num_long_term_ref_pics_sps(num_long_term_ref_pics_sps);
        pcm_sample_bit_depth_luma_minus1(pcm_sample_bit_depth_luma_minus1);
        pcm_sample_bit_depth_chroma_minus1(pcm_sample_bit_depth_chroma_minus1);
        log2_min_pcm_luma_coding_block_size_minus3(log2_min_pcm_luma_coding_block_size_minus3);
        log2_diff_max_min_pcm_luma_coding_block_size(log2_diff_max_min_pcm_luma_coding_block_size);
        palette_max_size(palette_max_size);
        delta_palette_max_predictor_size(delta_palette_max_predictor_size);
        motion_vector_resolution_control_idc(motion_vector_resolution_control_idc);
        sps_num_palette_predictor_initializer_minus1(sps_num_palette_predictor_initializer_minus1);
        conf_win_left_offset(conf_win_left_offset);
        conf_win_right_offset(conf_win_right_offset);
        conf_win_top_offset(conf_win_top_offset);
        conf_win_bottom_offset(conf_win_bottom_offset);
        pProfileTierLevel(pProfileTierLevel);
        pDecPicBufMgr(pDecPicBufMgr);
        pScalingLists(pScalingLists);
        pShortTermRefPicSet(pShortTermRefPicSet);
        pLongTermRefPicsSps(pLongTermRefPicsSps);
        pSequenceParameterSetVui(pSequenceParameterSetVui);
        pPredictorPaletteEntries(pPredictorPaletteEntries);
        return this;
    }

    public StdVideoH265SequenceParameterSet set(StdVideoH265SequenceParameterSet src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265SequenceParameterSet malloc() {
        return new StdVideoH265SequenceParameterSet(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265SequenceParameterSet calloc() {
        return new StdVideoH265SequenceParameterSet(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265SequenceParameterSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265SequenceParameterSet(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265SequenceParameterSet create(long address) {
        return new StdVideoH265SequenceParameterSet(address, null);
    }

    public static StdVideoH265SequenceParameterSet createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265SequenceParameterSet(address, null);
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

    public static StdVideoH265SequenceParameterSet malloc(MemoryStack stack) {
        return new StdVideoH265SequenceParameterSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265SequenceParameterSet calloc(MemoryStack stack) {
        return new StdVideoH265SequenceParameterSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoH265SpsFlags nflags(long struct) {
        return StdVideoH265SpsFlags.create(struct + FLAGS);
    }

    public static int nchroma_format_idc(long struct) {
        return MemoryUtil.memGetInt(struct + CHROMA_FORMAT_IDC);
    }

    public static int npic_width_in_luma_samples(long struct) {
        return MemoryUtil.memGetInt(struct + PIC_WIDTH_IN_LUMA_SAMPLES);
    }

    public static int npic_height_in_luma_samples(long struct) {
        return MemoryUtil.memGetInt(struct + PIC_HEIGHT_IN_LUMA_SAMPLES);
    }

    public static byte nsps_video_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + SPS_VIDEO_PARAMETER_SET_ID);
    }

    public static byte nsps_max_sub_layers_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + SPS_MAX_SUB_LAYERS_MINUS1);
    }

    public static byte nsps_seq_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + SPS_SEQ_PARAMETER_SET_ID);
    }

    public static byte nbit_depth_luma_minus8(long struct) {
        return MemoryUtil.memGetByte(struct + BIT_DEPTH_LUMA_MINUS8);
    }

    public static byte nbit_depth_chroma_minus8(long struct) {
        return MemoryUtil.memGetByte(struct + BIT_DEPTH_CHROMA_MINUS8);
    }

    public static byte nlog2_max_pic_order_cnt_lsb_minus4(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4);
    }

    public static byte nsps_max_dec_pic_buffering_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + SPS_MAX_DEC_PIC_BUFFERING_MINUS1);
    }

    public static byte nlog2_min_luma_coding_block_size_minus3(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3);
    }

    public static byte nlog2_diff_max_min_luma_coding_block_size(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE);
    }

    public static byte nlog2_min_luma_transform_block_size_minus2(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2);
    }

    public static byte nlog2_diff_max_min_luma_transform_block_size(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE);
    }

    public static byte nmax_transform_hierarchy_depth_inter(long struct) {
        return MemoryUtil.memGetByte(struct + MAX_TRANSFORM_HIERARCHY_DEPTH_INTER);
    }

    public static byte nmax_transform_hierarchy_depth_intra(long struct) {
        return MemoryUtil.memGetByte(struct + MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA);
    }

    public static byte nnum_short_term_ref_pic_sets(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_SHORT_TERM_REF_PIC_SETS);
    }

    public static byte nnum_long_term_ref_pics_sps(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_LONG_TERM_REF_PICS_SPS);
    }

    public static byte npcm_sample_bit_depth_luma_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1);
    }

    public static byte npcm_sample_bit_depth_chroma_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1);
    }

    public static byte nlog2_min_pcm_luma_coding_block_size_minus3(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3);
    }

    public static byte nlog2_diff_max_min_pcm_luma_coding_block_size(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static byte nreserved2(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED2);
    }

    public static byte npalette_max_size(long struct) {
        return MemoryUtil.memGetByte(struct + PALETTE_MAX_SIZE);
    }

    public static byte ndelta_palette_max_predictor_size(long struct) {
        return MemoryUtil.memGetByte(struct + DELTA_PALETTE_MAX_PREDICTOR_SIZE);
    }

    public static byte nmotion_vector_resolution_control_idc(long struct) {
        return MemoryUtil.memGetByte(struct + MOTION_VECTOR_RESOLUTION_CONTROL_IDC);
    }

    public static byte nsps_num_palette_predictor_initializer_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1);
    }

    public static int nconf_win_left_offset(long struct) {
        return MemoryUtil.memGetInt(struct + CONF_WIN_LEFT_OFFSET);
    }

    public static int nconf_win_right_offset(long struct) {
        return MemoryUtil.memGetInt(struct + CONF_WIN_RIGHT_OFFSET);
    }

    public static int nconf_win_top_offset(long struct) {
        return MemoryUtil.memGetInt(struct + CONF_WIN_TOP_OFFSET);
    }

    public static int nconf_win_bottom_offset(long struct) {
        return MemoryUtil.memGetInt(struct + CONF_WIN_BOTTOM_OFFSET);
    }

    public static StdVideoH265ProfileTierLevel npProfileTierLevel(long struct) {
        return StdVideoH265ProfileTierLevel.create(MemoryUtil.memGetAddress(struct + PPROFILETIERLEVEL));
    }

    public static StdVideoH265DecPicBufMgr npDecPicBufMgr(long struct) {
        return StdVideoH265DecPicBufMgr.create(MemoryUtil.memGetAddress(struct + PDECPICBUFMGR));
    }

    public static StdVideoH265ScalingLists npScalingLists(long struct) {
        return StdVideoH265ScalingLists.create(MemoryUtil.memGetAddress(struct + PSCALINGLISTS));
    }

    public static StdVideoH265ShortTermRefPicSet npShortTermRefPicSet(long struct) {
        return StdVideoH265ShortTermRefPicSet.create(MemoryUtil.memGetAddress(struct + PSHORTTERMREFPICSET));
    }

    public static StdVideoH265LongTermRefPicsSps npLongTermRefPicsSps(long struct) {
        return StdVideoH265LongTermRefPicsSps.create(MemoryUtil.memGetAddress(struct + PLONGTERMREFPICSSPS));
    }

    public static StdVideoH265SequenceParameterSetVui npSequenceParameterSetVui(long struct) {
        return StdVideoH265SequenceParameterSetVui.create(MemoryUtil.memGetAddress(struct + PSEQUENCEPARAMETERSETVUI));
    }

    public static StdVideoH265PredictorPaletteEntries npPredictorPaletteEntries(long struct) {
        return StdVideoH265PredictorPaletteEntries.create(MemoryUtil.memGetAddress(struct + PPREDICTORPALETTEENTRIES));
    }

    public static void nflags(long struct, StdVideoH265SpsFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoH265SpsFlags.SIZEOF);
    }

    public static void nchroma_format_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + CHROMA_FORMAT_IDC, value);
    }

    public static void npic_width_in_luma_samples(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIC_WIDTH_IN_LUMA_SAMPLES, value);
    }

    public static void npic_height_in_luma_samples(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIC_HEIGHT_IN_LUMA_SAMPLES, value);
    }

    public static void nsps_video_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SPS_VIDEO_PARAMETER_SET_ID, value);
    }

    public static void nsps_max_sub_layers_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SPS_MAX_SUB_LAYERS_MINUS1, value);
    }

    public static void nsps_seq_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SPS_SEQ_PARAMETER_SET_ID, value);
    }

    public static void nbit_depth_luma_minus8(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BIT_DEPTH_LUMA_MINUS8, value);
    }

    public static void nbit_depth_chroma_minus8(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BIT_DEPTH_CHROMA_MINUS8, value);
    }

    public static void nlog2_max_pic_order_cnt_lsb_minus4(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4, value);
    }

    public static void nsps_max_dec_pic_buffering_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SPS_MAX_DEC_PIC_BUFFERING_MINUS1, value);
    }

    public static void nlog2_min_luma_coding_block_size_minus3(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3, value);
    }

    public static void nlog2_diff_max_min_luma_coding_block_size(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE, value);
    }

    public static void nlog2_min_luma_transform_block_size_minus2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2, value);
    }

    public static void nlog2_diff_max_min_luma_transform_block_size(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE, value);
    }

    public static void nmax_transform_hierarchy_depth_inter(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MAX_TRANSFORM_HIERARCHY_DEPTH_INTER, value);
    }

    public static void nmax_transform_hierarchy_depth_intra(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA, value);
    }

    public static void nnum_short_term_ref_pic_sets(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_SHORT_TERM_REF_PIC_SETS, value);
    }

    public static void nnum_long_term_ref_pics_sps(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_LONG_TERM_REF_PICS_SPS, value);
    }

    public static void npcm_sample_bit_depth_luma_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1, value);
    }

    public static void npcm_sample_bit_depth_chroma_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1, value);
    }

    public static void nlog2_min_pcm_luma_coding_block_size_minus3(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3, value);
    }

    public static void nlog2_diff_max_min_pcm_luma_coding_block_size(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void nreserved2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED2, value);
    }

    public static void npalette_max_size(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PALETTE_MAX_SIZE, value);
    }

    public static void ndelta_palette_max_predictor_size(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_PALETTE_MAX_PREDICTOR_SIZE, value);
    }

    public static void nmotion_vector_resolution_control_idc(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MOTION_VECTOR_RESOLUTION_CONTROL_IDC, value);
    }

    public static void nsps_num_palette_predictor_initializer_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1, value);
    }

    public static void nconf_win_left_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONF_WIN_LEFT_OFFSET, value);
    }

    public static void nconf_win_right_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONF_WIN_RIGHT_OFFSET, value);
    }

    public static void nconf_win_top_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONF_WIN_TOP_OFFSET, value);
    }

    public static void nconf_win_bottom_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONF_WIN_BOTTOM_OFFSET, value);
    }

    public static void npProfileTierLevel(long struct, StdVideoH265ProfileTierLevel value) {
        MemoryUtil.memPutAddress(struct + PPROFILETIERLEVEL, value.address());
    }

    public static void npDecPicBufMgr(long struct, StdVideoH265DecPicBufMgr value) {
        MemoryUtil.memPutAddress(struct + PDECPICBUFMGR, value.address());
    }

    public static void npScalingLists(long struct, StdVideoH265ScalingLists value) {
        MemoryUtil.memPutAddress(struct + PSCALINGLISTS, value.address());
    }

    public static void npShortTermRefPicSet(long struct, StdVideoH265ShortTermRefPicSet value) {
        MemoryUtil.memPutAddress(struct + PSHORTTERMREFPICSET, value.address());
    }

    public static void npLongTermRefPicsSps(long struct, StdVideoH265LongTermRefPicsSps value) {
        MemoryUtil.memPutAddress(struct + PLONGTERMREFPICSSPS, value.address());
    }

    public static void npSequenceParameterSetVui(long struct, StdVideoH265SequenceParameterSetVui value) {
        MemoryUtil.memPutAddress(struct + PSEQUENCEPARAMETERSETVUI, value.address());
    }

    public static void npPredictorPaletteEntries(long struct, StdVideoH265PredictorPaletteEntries value) {
        MemoryUtil.memPutAddress(struct + PPREDICTORPALETTEENTRIES, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PPROFILETIERLEVEL));
        Checks.check(MemoryUtil.memGetAddress(struct + PDECPICBUFMGR));
        Checks.check(MemoryUtil.memGetAddress(struct + PSCALINGLISTS));
        Checks.check(MemoryUtil.memGetAddress(struct + PSHORTTERMREFPICSET));
        Checks.check(MemoryUtil.memGetAddress(struct + PLONGTERMREFPICSSPS));
        long pSequenceParameterSetVui = MemoryUtil.memGetAddress(struct + PSEQUENCEPARAMETERSETVUI);
        Checks.check(pSequenceParameterSetVui);
        StdVideoH265SequenceParameterSetVui.validate(pSequenceParameterSetVui);
        Checks.check(MemoryUtil.memGetAddress(struct + PPREDICTORPALETTEENTRIES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSet$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSet$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265SequenceParameterSet, Buffer> implements NativeResource {
        private static final StdVideoH265SequenceParameterSet ELEMENT_FACTORY = StdVideoH265SequenceParameterSet.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265SequenceParameterSet.SIZEOF);
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
        public StdVideoH265SequenceParameterSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoH265SpsFlags flags() {
            return StdVideoH265SequenceParameterSet.nflags(address());
        }

        @NativeType("StdVideoH265ChromaFormatIdc")
        public int chroma_format_idc() {
            return StdVideoH265SequenceParameterSet.nchroma_format_idc(address());
        }

        @NativeType("uint32_t")
        public int pic_width_in_luma_samples() {
            return StdVideoH265SequenceParameterSet.npic_width_in_luma_samples(address());
        }

        @NativeType("uint32_t")
        public int pic_height_in_luma_samples() {
            return StdVideoH265SequenceParameterSet.npic_height_in_luma_samples(address());
        }

        @NativeType("uint8_t")
        public byte sps_video_parameter_set_id() {
            return StdVideoH265SequenceParameterSet.nsps_video_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte sps_max_sub_layers_minus1() {
            return StdVideoH265SequenceParameterSet.nsps_max_sub_layers_minus1(address());
        }

        @NativeType("uint8_t")
        public byte sps_seq_parameter_set_id() {
            return StdVideoH265SequenceParameterSet.nsps_seq_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte bit_depth_luma_minus8() {
            return StdVideoH265SequenceParameterSet.nbit_depth_luma_minus8(address());
        }

        @NativeType("uint8_t")
        public byte bit_depth_chroma_minus8() {
            return StdVideoH265SequenceParameterSet.nbit_depth_chroma_minus8(address());
        }

        @NativeType("uint8_t")
        public byte log2_max_pic_order_cnt_lsb_minus4() {
            return StdVideoH265SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(address());
        }

        @NativeType("uint8_t")
        public byte sps_max_dec_pic_buffering_minus1() {
            return StdVideoH265SequenceParameterSet.nsps_max_dec_pic_buffering_minus1(address());
        }

        @NativeType("uint8_t")
        public byte log2_min_luma_coding_block_size_minus3() {
            return StdVideoH265SequenceParameterSet.nlog2_min_luma_coding_block_size_minus3(address());
        }

        @NativeType("uint8_t")
        public byte log2_diff_max_min_luma_coding_block_size() {
            return StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_coding_block_size(address());
        }

        @NativeType("uint8_t")
        public byte log2_min_luma_transform_block_size_minus2() {
            return StdVideoH265SequenceParameterSet.nlog2_min_luma_transform_block_size_minus2(address());
        }

        @NativeType("uint8_t")
        public byte log2_diff_max_min_luma_transform_block_size() {
            return StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_transform_block_size(address());
        }

        @NativeType("uint8_t")
        public byte max_transform_hierarchy_depth_inter() {
            return StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_inter(address());
        }

        @NativeType("uint8_t")
        public byte max_transform_hierarchy_depth_intra() {
            return StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_intra(address());
        }

        @NativeType("uint8_t")
        public byte num_short_term_ref_pic_sets() {
            return StdVideoH265SequenceParameterSet.nnum_short_term_ref_pic_sets(address());
        }

        @NativeType("uint8_t")
        public byte num_long_term_ref_pics_sps() {
            return StdVideoH265SequenceParameterSet.nnum_long_term_ref_pics_sps(address());
        }

        @NativeType("uint8_t")
        public byte pcm_sample_bit_depth_luma_minus1() {
            return StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_luma_minus1(address());
        }

        @NativeType("uint8_t")
        public byte pcm_sample_bit_depth_chroma_minus1() {
            return StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_chroma_minus1(address());
        }

        @NativeType("uint8_t")
        public byte log2_min_pcm_luma_coding_block_size_minus3() {
            return StdVideoH265SequenceParameterSet.nlog2_min_pcm_luma_coding_block_size_minus3(address());
        }

        @NativeType("uint8_t")
        public byte log2_diff_max_min_pcm_luma_coding_block_size() {
            return StdVideoH265SequenceParameterSet.nlog2_diff_max_min_pcm_luma_coding_block_size(address());
        }

        @NativeType("uint8_t")
        public byte palette_max_size() {
            return StdVideoH265SequenceParameterSet.npalette_max_size(address());
        }

        @NativeType("uint8_t")
        public byte delta_palette_max_predictor_size() {
            return StdVideoH265SequenceParameterSet.ndelta_palette_max_predictor_size(address());
        }

        @NativeType("uint8_t")
        public byte motion_vector_resolution_control_idc() {
            return StdVideoH265SequenceParameterSet.nmotion_vector_resolution_control_idc(address());
        }

        @NativeType("uint8_t")
        public byte sps_num_palette_predictor_initializer_minus1() {
            return StdVideoH265SequenceParameterSet.nsps_num_palette_predictor_initializer_minus1(address());
        }

        @NativeType("uint32_t")
        public int conf_win_left_offset() {
            return StdVideoH265SequenceParameterSet.nconf_win_left_offset(address());
        }

        @NativeType("uint32_t")
        public int conf_win_right_offset() {
            return StdVideoH265SequenceParameterSet.nconf_win_right_offset(address());
        }

        @NativeType("uint32_t")
        public int conf_win_top_offset() {
            return StdVideoH265SequenceParameterSet.nconf_win_top_offset(address());
        }

        @NativeType("uint32_t")
        public int conf_win_bottom_offset() {
            return StdVideoH265SequenceParameterSet.nconf_win_bottom_offset(address());
        }

        @NativeType("StdVideoH265ProfileTierLevel const *")
        public StdVideoH265ProfileTierLevel pProfileTierLevel() {
            return StdVideoH265SequenceParameterSet.npProfileTierLevel(address());
        }

        @NativeType("StdVideoH265DecPicBufMgr const *")
        public StdVideoH265DecPicBufMgr pDecPicBufMgr() {
            return StdVideoH265SequenceParameterSet.npDecPicBufMgr(address());
        }

        @NativeType("StdVideoH265ScalingLists const *")
        public StdVideoH265ScalingLists pScalingLists() {
            return StdVideoH265SequenceParameterSet.npScalingLists(address());
        }

        @NativeType("StdVideoH265ShortTermRefPicSet const *")
        public StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
            return StdVideoH265SequenceParameterSet.npShortTermRefPicSet(address());
        }

        @NativeType("StdVideoH265LongTermRefPicsSps const *")
        public StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps() {
            return StdVideoH265SequenceParameterSet.npLongTermRefPicsSps(address());
        }

        @NativeType("StdVideoH265SequenceParameterSetVui const *")
        public StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui() {
            return StdVideoH265SequenceParameterSet.npSequenceParameterSetVui(address());
        }

        @NativeType("StdVideoH265PredictorPaletteEntries const *")
        public StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() {
            return StdVideoH265SequenceParameterSet.npPredictorPaletteEntries(address());
        }

        public Buffer flags(StdVideoH265SpsFlags value) {
            StdVideoH265SequenceParameterSet.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoH265SpsFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer chroma_format_idc(@NativeType("StdVideoH265ChromaFormatIdc") int value) {
            StdVideoH265SequenceParameterSet.nchroma_format_idc(address(), value);
            return this;
        }

        public Buffer pic_width_in_luma_samples(@NativeType("uint32_t") int value) {
            StdVideoH265SequenceParameterSet.npic_width_in_luma_samples(address(), value);
            return this;
        }

        public Buffer pic_height_in_luma_samples(@NativeType("uint32_t") int value) {
            StdVideoH265SequenceParameterSet.npic_height_in_luma_samples(address(), value);
            return this;
        }

        public Buffer sps_video_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nsps_video_parameter_set_id(address(), value);
            return this;
        }

        public Buffer sps_max_sub_layers_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nsps_max_sub_layers_minus1(address(), value);
            return this;
        }

        public Buffer sps_seq_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nsps_seq_parameter_set_id(address(), value);
            return this;
        }

        public Buffer bit_depth_luma_minus8(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nbit_depth_luma_minus8(address(), value);
            return this;
        }

        public Buffer bit_depth_chroma_minus8(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nbit_depth_chroma_minus8(address(), value);
            return this;
        }

        public Buffer log2_max_pic_order_cnt_lsb_minus4(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(address(), value);
            return this;
        }

        public Buffer sps_max_dec_pic_buffering_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nsps_max_dec_pic_buffering_minus1(address(), value);
            return this;
        }

        public Buffer log2_min_luma_coding_block_size_minus3(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nlog2_min_luma_coding_block_size_minus3(address(), value);
            return this;
        }

        public Buffer log2_diff_max_min_luma_coding_block_size(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_coding_block_size(address(), value);
            return this;
        }

        public Buffer log2_min_luma_transform_block_size_minus2(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nlog2_min_luma_transform_block_size_minus2(address(), value);
            return this;
        }

        public Buffer log2_diff_max_min_luma_transform_block_size(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_transform_block_size(address(), value);
            return this;
        }

        public Buffer max_transform_hierarchy_depth_inter(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_inter(address(), value);
            return this;
        }

        public Buffer max_transform_hierarchy_depth_intra(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_intra(address(), value);
            return this;
        }

        public Buffer num_short_term_ref_pic_sets(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nnum_short_term_ref_pic_sets(address(), value);
            return this;
        }

        public Buffer num_long_term_ref_pics_sps(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nnum_long_term_ref_pics_sps(address(), value);
            return this;
        }

        public Buffer pcm_sample_bit_depth_luma_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_luma_minus1(address(), value);
            return this;
        }

        public Buffer pcm_sample_bit_depth_chroma_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_chroma_minus1(address(), value);
            return this;
        }

        public Buffer log2_min_pcm_luma_coding_block_size_minus3(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nlog2_min_pcm_luma_coding_block_size_minus3(address(), value);
            return this;
        }

        public Buffer log2_diff_max_min_pcm_luma_coding_block_size(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nlog2_diff_max_min_pcm_luma_coding_block_size(address(), value);
            return this;
        }

        public Buffer palette_max_size(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.npalette_max_size(address(), value);
            return this;
        }

        public Buffer delta_palette_max_predictor_size(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.ndelta_palette_max_predictor_size(address(), value);
            return this;
        }

        public Buffer motion_vector_resolution_control_idc(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nmotion_vector_resolution_control_idc(address(), value);
            return this;
        }

        public Buffer sps_num_palette_predictor_initializer_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSet.nsps_num_palette_predictor_initializer_minus1(address(), value);
            return this;
        }

        public Buffer conf_win_left_offset(@NativeType("uint32_t") int value) {
            StdVideoH265SequenceParameterSet.nconf_win_left_offset(address(), value);
            return this;
        }

        public Buffer conf_win_right_offset(@NativeType("uint32_t") int value) {
            StdVideoH265SequenceParameterSet.nconf_win_right_offset(address(), value);
            return this;
        }

        public Buffer conf_win_top_offset(@NativeType("uint32_t") int value) {
            StdVideoH265SequenceParameterSet.nconf_win_top_offset(address(), value);
            return this;
        }

        public Buffer conf_win_bottom_offset(@NativeType("uint32_t") int value) {
            StdVideoH265SequenceParameterSet.nconf_win_bottom_offset(address(), value);
            return this;
        }

        public Buffer pProfileTierLevel(@NativeType("StdVideoH265ProfileTierLevel const *") StdVideoH265ProfileTierLevel value) {
            StdVideoH265SequenceParameterSet.npProfileTierLevel(address(), value);
            return this;
        }

        public Buffer pDecPicBufMgr(@NativeType("StdVideoH265DecPicBufMgr const *") StdVideoH265DecPicBufMgr value) {
            StdVideoH265SequenceParameterSet.npDecPicBufMgr(address(), value);
            return this;
        }

        public Buffer pScalingLists(@NativeType("StdVideoH265ScalingLists const *") StdVideoH265ScalingLists value) {
            StdVideoH265SequenceParameterSet.npScalingLists(address(), value);
            return this;
        }

        public Buffer pShortTermRefPicSet(@NativeType("StdVideoH265ShortTermRefPicSet const *") StdVideoH265ShortTermRefPicSet value) {
            StdVideoH265SequenceParameterSet.npShortTermRefPicSet(address(), value);
            return this;
        }

        public Buffer pLongTermRefPicsSps(@NativeType("StdVideoH265LongTermRefPicsSps const *") StdVideoH265LongTermRefPicsSps value) {
            StdVideoH265SequenceParameterSet.npLongTermRefPicsSps(address(), value);
            return this;
        }

        public Buffer pSequenceParameterSetVui(@NativeType("StdVideoH265SequenceParameterSetVui const *") StdVideoH265SequenceParameterSetVui value) {
            StdVideoH265SequenceParameterSet.npSequenceParameterSetVui(address(), value);
            return this;
        }

        public Buffer pPredictorPaletteEntries(@NativeType("StdVideoH265PredictorPaletteEntries const *") StdVideoH265PredictorPaletteEntries value) {
            StdVideoH265SequenceParameterSet.npPredictorPaletteEntries(address(), value);
            return this;
        }
    }
}
