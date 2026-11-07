package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PictureParameterSet.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PictureParameterSet.class */
public class StdVideoH265PictureParameterSet extends Struct<StdVideoH265PictureParameterSet> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int PPS_PIC_PARAMETER_SET_ID;
    public static final int PPS_SEQ_PARAMETER_SET_ID;
    public static final int SPS_VIDEO_PARAMETER_SET_ID;
    public static final int NUM_EXTRA_SLICE_HEADER_BITS;
    public static final int NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1;
    public static final int NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1;
    public static final int INIT_QP_MINUS26;
    public static final int DIFF_CU_QP_DELTA_DEPTH;
    public static final int PPS_CB_QP_OFFSET;
    public static final int PPS_CR_QP_OFFSET;
    public static final int PPS_BETA_OFFSET_DIV2;
    public static final int PPS_TC_OFFSET_DIV2;
    public static final int LOG2_PARALLEL_MERGE_LEVEL_MINUS2;
    public static final int LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2;
    public static final int DIFF_CU_CHROMA_QP_OFFSET_DEPTH;
    public static final int CHROMA_QP_OFFSET_LIST_LEN_MINUS1;
    public static final int CB_QP_OFFSET_LIST;
    public static final int CR_QP_OFFSET_LIST;
    public static final int LOG2_SAO_OFFSET_SCALE_LUMA;
    public static final int LOG2_SAO_OFFSET_SCALE_CHROMA;
    public static final int PPS_ACT_Y_QP_OFFSET_PLUS5;
    public static final int PPS_ACT_CB_QP_OFFSET_PLUS5;
    public static final int PPS_ACT_CR_QP_OFFSET_PLUS3;
    public static final int PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS;
    public static final int LUMA_BIT_DEPTH_ENTRY_MINUS8;
    public static final int CHROMA_BIT_DEPTH_ENTRY_MINUS8;
    public static final int NUM_TILE_COLUMNS_MINUS1;
    public static final int NUM_TILE_ROWS_MINUS1;
    public static final int RESERVED1;
    public static final int RESERVED2;
    public static final int COLUMN_WIDTH_MINUS1;
    public static final int ROW_HEIGHT_MINUS1;
    public static final int RESERVED3;
    public static final int PSCALINGLISTS;
    public static final int PPREDICTORPALETTEENTRIES;

    static {
        Struct.Layout layout = __struct(__member(StdVideoH265PpsFlags.SIZEOF, StdVideoH265PpsFlags.ALIGNOF), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __array(1, 6), __array(1, 6), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __array(2, 19), __array(2, 21), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        PPS_PIC_PARAMETER_SET_ID = layout.offsetof(1);
        PPS_SEQ_PARAMETER_SET_ID = layout.offsetof(2);
        SPS_VIDEO_PARAMETER_SET_ID = layout.offsetof(3);
        NUM_EXTRA_SLICE_HEADER_BITS = layout.offsetof(4);
        NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1 = layout.offsetof(5);
        NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1 = layout.offsetof(6);
        INIT_QP_MINUS26 = layout.offsetof(7);
        DIFF_CU_QP_DELTA_DEPTH = layout.offsetof(8);
        PPS_CB_QP_OFFSET = layout.offsetof(9);
        PPS_CR_QP_OFFSET = layout.offsetof(10);
        PPS_BETA_OFFSET_DIV2 = layout.offsetof(11);
        PPS_TC_OFFSET_DIV2 = layout.offsetof(12);
        LOG2_PARALLEL_MERGE_LEVEL_MINUS2 = layout.offsetof(13);
        LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2 = layout.offsetof(14);
        DIFF_CU_CHROMA_QP_OFFSET_DEPTH = layout.offsetof(15);
        CHROMA_QP_OFFSET_LIST_LEN_MINUS1 = layout.offsetof(16);
        CB_QP_OFFSET_LIST = layout.offsetof(17);
        CR_QP_OFFSET_LIST = layout.offsetof(18);
        LOG2_SAO_OFFSET_SCALE_LUMA = layout.offsetof(19);
        LOG2_SAO_OFFSET_SCALE_CHROMA = layout.offsetof(20);
        PPS_ACT_Y_QP_OFFSET_PLUS5 = layout.offsetof(21);
        PPS_ACT_CB_QP_OFFSET_PLUS5 = layout.offsetof(22);
        PPS_ACT_CR_QP_OFFSET_PLUS3 = layout.offsetof(23);
        PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS = layout.offsetof(24);
        LUMA_BIT_DEPTH_ENTRY_MINUS8 = layout.offsetof(25);
        CHROMA_BIT_DEPTH_ENTRY_MINUS8 = layout.offsetof(26);
        NUM_TILE_COLUMNS_MINUS1 = layout.offsetof(27);
        NUM_TILE_ROWS_MINUS1 = layout.offsetof(28);
        RESERVED1 = layout.offsetof(29);
        RESERVED2 = layout.offsetof(30);
        COLUMN_WIDTH_MINUS1 = layout.offsetof(31);
        ROW_HEIGHT_MINUS1 = layout.offsetof(32);
        RESERVED3 = layout.offsetof(33);
        PSCALINGLISTS = layout.offsetof(34);
        PPREDICTORPALETTEENTRIES = layout.offsetof(35);
    }

    protected StdVideoH265PictureParameterSet(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265PictureParameterSet create(long address, ByteBuffer container) {
        return new StdVideoH265PictureParameterSet(address, container);
    }

    public StdVideoH265PictureParameterSet(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoH265PpsFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte pps_pic_parameter_set_id() {
        return npps_pic_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte pps_seq_parameter_set_id() {
        return npps_seq_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte sps_video_parameter_set_id() {
        return nsps_video_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte num_extra_slice_header_bits() {
        return nnum_extra_slice_header_bits(address());
    }

    @NativeType("uint8_t")
    public byte num_ref_idx_l0_default_active_minus1() {
        return nnum_ref_idx_l0_default_active_minus1(address());
    }

    @NativeType("uint8_t")
    public byte num_ref_idx_l1_default_active_minus1() {
        return nnum_ref_idx_l1_default_active_minus1(address());
    }

    @NativeType("int8_t")
    public byte init_qp_minus26() {
        return ninit_qp_minus26(address());
    }

    @NativeType("uint8_t")
    public byte diff_cu_qp_delta_depth() {
        return ndiff_cu_qp_delta_depth(address());
    }

    @NativeType("int8_t")
    public byte pps_cb_qp_offset() {
        return npps_cb_qp_offset(address());
    }

    @NativeType("int8_t")
    public byte pps_cr_qp_offset() {
        return npps_cr_qp_offset(address());
    }

    @NativeType("int8_t")
    public byte pps_beta_offset_div2() {
        return npps_beta_offset_div2(address());
    }

    @NativeType("int8_t")
    public byte pps_tc_offset_div2() {
        return npps_tc_offset_div2(address());
    }

    @NativeType("uint8_t")
    public byte log2_parallel_merge_level_minus2() {
        return nlog2_parallel_merge_level_minus2(address());
    }

    @NativeType("uint8_t")
    public byte log2_max_transform_skip_block_size_minus2() {
        return nlog2_max_transform_skip_block_size_minus2(address());
    }

    @NativeType("uint8_t")
    public byte diff_cu_chroma_qp_offset_depth() {
        return ndiff_cu_chroma_qp_offset_depth(address());
    }

    @NativeType("uint8_t")
    public byte chroma_qp_offset_list_len_minus1() {
        return nchroma_qp_offset_list_len_minus1(address());
    }

    @NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
    public ByteBuffer cb_qp_offset_list() {
        return ncb_qp_offset_list(address());
    }

    @NativeType("int8_t")
    public byte cb_qp_offset_list(int index) {
        return ncb_qp_offset_list(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
    public ByteBuffer cr_qp_offset_list() {
        return ncr_qp_offset_list(address());
    }

    @NativeType("int8_t")
    public byte cr_qp_offset_list(int index) {
        return ncr_qp_offset_list(address(), index);
    }

    @NativeType("uint8_t")
    public byte log2_sao_offset_scale_luma() {
        return nlog2_sao_offset_scale_luma(address());
    }

    @NativeType("uint8_t")
    public byte log2_sao_offset_scale_chroma() {
        return nlog2_sao_offset_scale_chroma(address());
    }

    @NativeType("int8_t")
    public byte pps_act_y_qp_offset_plus5() {
        return npps_act_y_qp_offset_plus5(address());
    }

    @NativeType("int8_t")
    public byte pps_act_cb_qp_offset_plus5() {
        return npps_act_cb_qp_offset_plus5(address());
    }

    @NativeType("int8_t")
    public byte pps_act_cr_qp_offset_plus3() {
        return npps_act_cr_qp_offset_plus3(address());
    }

    @NativeType("uint8_t")
    public byte pps_num_palette_predictor_initializers() {
        return npps_num_palette_predictor_initializers(address());
    }

    @NativeType("uint8_t")
    public byte luma_bit_depth_entry_minus8() {
        return nluma_bit_depth_entry_minus8(address());
    }

    @NativeType("uint8_t")
    public byte chroma_bit_depth_entry_minus8() {
        return nchroma_bit_depth_entry_minus8(address());
    }

    @NativeType("uint8_t")
    public byte num_tile_columns_minus1() {
        return nnum_tile_columns_minus1(address());
    }

    @NativeType("uint8_t")
    public byte num_tile_rows_minus1() {
        return nnum_tile_rows_minus1(address());
    }

    @NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]")
    public ShortBuffer column_width_minus1() {
        return ncolumn_width_minus1(address());
    }

    @NativeType("uint16_t")
    public short column_width_minus1(int index) {
        return ncolumn_width_minus1(address(), index);
    }

    @NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]")
    public ShortBuffer row_height_minus1() {
        return nrow_height_minus1(address());
    }

    @NativeType("uint16_t")
    public short row_height_minus1(int index) {
        return nrow_height_minus1(address(), index);
    }

    @NativeType("StdVideoH265ScalingLists const *")
    public StdVideoH265ScalingLists pScalingLists() {
        return npScalingLists(address());
    }

    @NativeType("StdVideoH265PredictorPaletteEntries const *")
    public StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() {
        return npPredictorPaletteEntries(address());
    }

    public StdVideoH265PictureParameterSet flags(StdVideoH265PpsFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet flags(Consumer<StdVideoH265PpsFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoH265PictureParameterSet pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) {
        npps_pic_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet pps_seq_parameter_set_id(@NativeType("uint8_t") byte value) {
        npps_seq_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet sps_video_parameter_set_id(@NativeType("uint8_t") byte value) {
        nsps_video_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet num_extra_slice_header_bits(@NativeType("uint8_t") byte value) {
        nnum_extra_slice_header_bits(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet num_ref_idx_l0_default_active_minus1(@NativeType("uint8_t") byte value) {
        nnum_ref_idx_l0_default_active_minus1(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet num_ref_idx_l1_default_active_minus1(@NativeType("uint8_t") byte value) {
        nnum_ref_idx_l1_default_active_minus1(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet init_qp_minus26(@NativeType("int8_t") byte value) {
        ninit_qp_minus26(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet diff_cu_qp_delta_depth(@NativeType("uint8_t") byte value) {
        ndiff_cu_qp_delta_depth(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet pps_cb_qp_offset(@NativeType("int8_t") byte value) {
        npps_cb_qp_offset(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet pps_cr_qp_offset(@NativeType("int8_t") byte value) {
        npps_cr_qp_offset(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet pps_beta_offset_div2(@NativeType("int8_t") byte value) {
        npps_beta_offset_div2(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet pps_tc_offset_div2(@NativeType("int8_t") byte value) {
        npps_tc_offset_div2(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet log2_parallel_merge_level_minus2(@NativeType("uint8_t") byte value) {
        nlog2_parallel_merge_level_minus2(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet log2_max_transform_skip_block_size_minus2(@NativeType("uint8_t") byte value) {
        nlog2_max_transform_skip_block_size_minus2(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet diff_cu_chroma_qp_offset_depth(@NativeType("uint8_t") byte value) {
        ndiff_cu_chroma_qp_offset_depth(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet chroma_qp_offset_list_len_minus1(@NativeType("uint8_t") byte value) {
        nchroma_qp_offset_list_len_minus1(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet cb_qp_offset_list(@NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") ByteBuffer value) {
        ncb_qp_offset_list(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet cb_qp_offset_list(int index, @NativeType("int8_t") byte value) {
        ncb_qp_offset_list(address(), index, value);
        return this;
    }

    public StdVideoH265PictureParameterSet cr_qp_offset_list(@NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") ByteBuffer value) {
        ncr_qp_offset_list(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet cr_qp_offset_list(int index, @NativeType("int8_t") byte value) {
        ncr_qp_offset_list(address(), index, value);
        return this;
    }

    public StdVideoH265PictureParameterSet log2_sao_offset_scale_luma(@NativeType("uint8_t") byte value) {
        nlog2_sao_offset_scale_luma(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet log2_sao_offset_scale_chroma(@NativeType("uint8_t") byte value) {
        nlog2_sao_offset_scale_chroma(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet pps_act_y_qp_offset_plus5(@NativeType("int8_t") byte value) {
        npps_act_y_qp_offset_plus5(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet pps_act_cb_qp_offset_plus5(@NativeType("int8_t") byte value) {
        npps_act_cb_qp_offset_plus5(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet pps_act_cr_qp_offset_plus3(@NativeType("int8_t") byte value) {
        npps_act_cr_qp_offset_plus3(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet pps_num_palette_predictor_initializers(@NativeType("uint8_t") byte value) {
        npps_num_palette_predictor_initializers(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet luma_bit_depth_entry_minus8(@NativeType("uint8_t") byte value) {
        nluma_bit_depth_entry_minus8(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet chroma_bit_depth_entry_minus8(@NativeType("uint8_t") byte value) {
        nchroma_bit_depth_entry_minus8(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet num_tile_columns_minus1(@NativeType("uint8_t") byte value) {
        nnum_tile_columns_minus1(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet num_tile_rows_minus1(@NativeType("uint8_t") byte value) {
        nnum_tile_rows_minus1(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet column_width_minus1(@NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]") ShortBuffer value) {
        ncolumn_width_minus1(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet column_width_minus1(int index, @NativeType("uint16_t") short value) {
        ncolumn_width_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265PictureParameterSet row_height_minus1(@NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]") ShortBuffer value) {
        nrow_height_minus1(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet row_height_minus1(int index, @NativeType("uint16_t") short value) {
        nrow_height_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265PictureParameterSet pScalingLists(@NativeType("StdVideoH265ScalingLists const *") StdVideoH265ScalingLists value) {
        npScalingLists(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet pPredictorPaletteEntries(@NativeType("StdVideoH265PredictorPaletteEntries const *") StdVideoH265PredictorPaletteEntries value) {
        npPredictorPaletteEntries(address(), value);
        return this;
    }

    public StdVideoH265PictureParameterSet set(StdVideoH265PpsFlags flags, byte pps_pic_parameter_set_id, byte pps_seq_parameter_set_id, byte sps_video_parameter_set_id, byte num_extra_slice_header_bits, byte num_ref_idx_l0_default_active_minus1, byte num_ref_idx_l1_default_active_minus1, byte init_qp_minus26, byte diff_cu_qp_delta_depth, byte pps_cb_qp_offset, byte pps_cr_qp_offset, byte pps_beta_offset_div2, byte pps_tc_offset_div2, byte log2_parallel_merge_level_minus2, byte log2_max_transform_skip_block_size_minus2, byte diff_cu_chroma_qp_offset_depth, byte chroma_qp_offset_list_len_minus1, ByteBuffer cb_qp_offset_list, ByteBuffer cr_qp_offset_list, byte log2_sao_offset_scale_luma, byte log2_sao_offset_scale_chroma, byte pps_act_y_qp_offset_plus5, byte pps_act_cb_qp_offset_plus5, byte pps_act_cr_qp_offset_plus3, byte pps_num_palette_predictor_initializers, byte luma_bit_depth_entry_minus8, byte chroma_bit_depth_entry_minus8, byte num_tile_columns_minus1, byte num_tile_rows_minus1, ShortBuffer column_width_minus1, ShortBuffer row_height_minus1, StdVideoH265ScalingLists pScalingLists, StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries) {
        flags(flags);
        pps_pic_parameter_set_id(pps_pic_parameter_set_id);
        pps_seq_parameter_set_id(pps_seq_parameter_set_id);
        sps_video_parameter_set_id(sps_video_parameter_set_id);
        num_extra_slice_header_bits(num_extra_slice_header_bits);
        num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1);
        num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1);
        init_qp_minus26(init_qp_minus26);
        diff_cu_qp_delta_depth(diff_cu_qp_delta_depth);
        pps_cb_qp_offset(pps_cb_qp_offset);
        pps_cr_qp_offset(pps_cr_qp_offset);
        pps_beta_offset_div2(pps_beta_offset_div2);
        pps_tc_offset_div2(pps_tc_offset_div2);
        log2_parallel_merge_level_minus2(log2_parallel_merge_level_minus2);
        log2_max_transform_skip_block_size_minus2(log2_max_transform_skip_block_size_minus2);
        diff_cu_chroma_qp_offset_depth(diff_cu_chroma_qp_offset_depth);
        chroma_qp_offset_list_len_minus1(chroma_qp_offset_list_len_minus1);
        cb_qp_offset_list(cb_qp_offset_list);
        cr_qp_offset_list(cr_qp_offset_list);
        log2_sao_offset_scale_luma(log2_sao_offset_scale_luma);
        log2_sao_offset_scale_chroma(log2_sao_offset_scale_chroma);
        pps_act_y_qp_offset_plus5(pps_act_y_qp_offset_plus5);
        pps_act_cb_qp_offset_plus5(pps_act_cb_qp_offset_plus5);
        pps_act_cr_qp_offset_plus3(pps_act_cr_qp_offset_plus3);
        pps_num_palette_predictor_initializers(pps_num_palette_predictor_initializers);
        luma_bit_depth_entry_minus8(luma_bit_depth_entry_minus8);
        chroma_bit_depth_entry_minus8(chroma_bit_depth_entry_minus8);
        num_tile_columns_minus1(num_tile_columns_minus1);
        num_tile_rows_minus1(num_tile_rows_minus1);
        column_width_minus1(column_width_minus1);
        row_height_minus1(row_height_minus1);
        pScalingLists(pScalingLists);
        pPredictorPaletteEntries(pPredictorPaletteEntries);
        return this;
    }

    public StdVideoH265PictureParameterSet set(StdVideoH265PictureParameterSet src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265PictureParameterSet malloc() {
        return new StdVideoH265PictureParameterSet(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265PictureParameterSet calloc() {
        return new StdVideoH265PictureParameterSet(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265PictureParameterSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265PictureParameterSet(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265PictureParameterSet create(long address) {
        return new StdVideoH265PictureParameterSet(address, null);
    }

    public static StdVideoH265PictureParameterSet createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265PictureParameterSet(address, null);
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

    public static StdVideoH265PictureParameterSet malloc(MemoryStack stack) {
        return new StdVideoH265PictureParameterSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265PictureParameterSet calloc(MemoryStack stack) {
        return new StdVideoH265PictureParameterSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoH265PpsFlags nflags(long struct) {
        return StdVideoH265PpsFlags.create(struct + FLAGS);
    }

    public static byte npps_pic_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_PIC_PARAMETER_SET_ID);
    }

    public static byte npps_seq_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_SEQ_PARAMETER_SET_ID);
    }

    public static byte nsps_video_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + SPS_VIDEO_PARAMETER_SET_ID);
    }

    public static byte nnum_extra_slice_header_bits(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_EXTRA_SLICE_HEADER_BITS);
    }

    public static byte nnum_ref_idx_l0_default_active_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1);
    }

    public static byte nnum_ref_idx_l1_default_active_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1);
    }

    public static byte ninit_qp_minus26(long struct) {
        return MemoryUtil.memGetByte(struct + INIT_QP_MINUS26);
    }

    public static byte ndiff_cu_qp_delta_depth(long struct) {
        return MemoryUtil.memGetByte(struct + DIFF_CU_QP_DELTA_DEPTH);
    }

    public static byte npps_cb_qp_offset(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_CB_QP_OFFSET);
    }

    public static byte npps_cr_qp_offset(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_CR_QP_OFFSET);
    }

    public static byte npps_beta_offset_div2(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_BETA_OFFSET_DIV2);
    }

    public static byte npps_tc_offset_div2(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_TC_OFFSET_DIV2);
    }

    public static byte nlog2_parallel_merge_level_minus2(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_PARALLEL_MERGE_LEVEL_MINUS2);
    }

    public static byte nlog2_max_transform_skip_block_size_minus2(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2);
    }

    public static byte ndiff_cu_chroma_qp_offset_depth(long struct) {
        return MemoryUtil.memGetByte(struct + DIFF_CU_CHROMA_QP_OFFSET_DEPTH);
    }

    public static byte nchroma_qp_offset_list_len_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + CHROMA_QP_OFFSET_LIST_LEN_MINUS1);
    }

    public static ByteBuffer ncb_qp_offset_list(long struct) {
        return MemoryUtil.memByteBuffer(struct + CB_QP_OFFSET_LIST, 6);
    }

    public static byte ncb_qp_offset_list(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CB_QP_OFFSET_LIST + (Checks.check(index, 6) * 1));
    }

    public static ByteBuffer ncr_qp_offset_list(long struct) {
        return MemoryUtil.memByteBuffer(struct + CR_QP_OFFSET_LIST, 6);
    }

    public static byte ncr_qp_offset_list(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CR_QP_OFFSET_LIST + (Checks.check(index, 6) * 1));
    }

    public static byte nlog2_sao_offset_scale_luma(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_SAO_OFFSET_SCALE_LUMA);
    }

    public static byte nlog2_sao_offset_scale_chroma(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_SAO_OFFSET_SCALE_CHROMA);
    }

    public static byte npps_act_y_qp_offset_plus5(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_ACT_Y_QP_OFFSET_PLUS5);
    }

    public static byte npps_act_cb_qp_offset_plus5(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_ACT_CB_QP_OFFSET_PLUS5);
    }

    public static byte npps_act_cr_qp_offset_plus3(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_ACT_CR_QP_OFFSET_PLUS3);
    }

    public static byte npps_num_palette_predictor_initializers(long struct) {
        return MemoryUtil.memGetByte(struct + PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS);
    }

    public static byte nluma_bit_depth_entry_minus8(long struct) {
        return MemoryUtil.memGetByte(struct + LUMA_BIT_DEPTH_ENTRY_MINUS8);
    }

    public static byte nchroma_bit_depth_entry_minus8(long struct) {
        return MemoryUtil.memGetByte(struct + CHROMA_BIT_DEPTH_ENTRY_MINUS8);
    }

    public static byte nnum_tile_columns_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_TILE_COLUMNS_MINUS1);
    }

    public static byte nnum_tile_rows_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_TILE_ROWS_MINUS1);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static byte nreserved2(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED2);
    }

    public static ShortBuffer ncolumn_width_minus1(long struct) {
        return MemoryUtil.memShortBuffer(struct + COLUMN_WIDTH_MINUS1, 19);
    }

    public static short ncolumn_width_minus1(long struct, int index) {
        return MemoryUtil.memGetShort(struct + COLUMN_WIDTH_MINUS1 + (Checks.check(index, 19) * 2));
    }

    public static ShortBuffer nrow_height_minus1(long struct) {
        return MemoryUtil.memShortBuffer(struct + ROW_HEIGHT_MINUS1, 21);
    }

    public static short nrow_height_minus1(long struct, int index) {
        return MemoryUtil.memGetShort(struct + ROW_HEIGHT_MINUS1 + (Checks.check(index, 21) * 2));
    }

    public static int nreserved3(long struct) {
        return MemoryUtil.memGetInt(struct + RESERVED3);
    }

    public static StdVideoH265ScalingLists npScalingLists(long struct) {
        return StdVideoH265ScalingLists.create(MemoryUtil.memGetAddress(struct + PSCALINGLISTS));
    }

    public static StdVideoH265PredictorPaletteEntries npPredictorPaletteEntries(long struct) {
        return StdVideoH265PredictorPaletteEntries.create(MemoryUtil.memGetAddress(struct + PPREDICTORPALETTEENTRIES));
    }

    public static void nflags(long struct, StdVideoH265PpsFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoH265PpsFlags.SIZEOF);
    }

    public static void npps_pic_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_PIC_PARAMETER_SET_ID, value);
    }

    public static void npps_seq_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_SEQ_PARAMETER_SET_ID, value);
    }

    public static void nsps_video_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SPS_VIDEO_PARAMETER_SET_ID, value);
    }

    public static void nnum_extra_slice_header_bits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_EXTRA_SLICE_HEADER_BITS, value);
    }

    public static void nnum_ref_idx_l0_default_active_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1, value);
    }

    public static void nnum_ref_idx_l1_default_active_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1, value);
    }

    public static void ninit_qp_minus26(long struct, byte value) {
        MemoryUtil.memPutByte(struct + INIT_QP_MINUS26, value);
    }

    public static void ndiff_cu_qp_delta_depth(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DIFF_CU_QP_DELTA_DEPTH, value);
    }

    public static void npps_cb_qp_offset(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_CB_QP_OFFSET, value);
    }

    public static void npps_cr_qp_offset(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_CR_QP_OFFSET, value);
    }

    public static void npps_beta_offset_div2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_BETA_OFFSET_DIV2, value);
    }

    public static void npps_tc_offset_div2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_TC_OFFSET_DIV2, value);
    }

    public static void nlog2_parallel_merge_level_minus2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_PARALLEL_MERGE_LEVEL_MINUS2, value);
    }

    public static void nlog2_max_transform_skip_block_size_minus2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2, value);
    }

    public static void ndiff_cu_chroma_qp_offset_depth(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DIFF_CU_CHROMA_QP_OFFSET_DEPTH, value);
    }

    public static void nchroma_qp_offset_list_len_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_QP_OFFSET_LIST_LEN_MINUS1, value);
    }

    public static void ncb_qp_offset_list(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 6);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CB_QP_OFFSET_LIST, value.remaining() * 1);
    }

    public static void ncb_qp_offset_list(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CB_QP_OFFSET_LIST + (Checks.check(index, 6) * 1), value);
    }

    public static void ncr_qp_offset_list(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 6);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CR_QP_OFFSET_LIST, value.remaining() * 1);
    }

    public static void ncr_qp_offset_list(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CR_QP_OFFSET_LIST + (Checks.check(index, 6) * 1), value);
    }

    public static void nlog2_sao_offset_scale_luma(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_SAO_OFFSET_SCALE_LUMA, value);
    }

    public static void nlog2_sao_offset_scale_chroma(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_SAO_OFFSET_SCALE_CHROMA, value);
    }

    public static void npps_act_y_qp_offset_plus5(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_ACT_Y_QP_OFFSET_PLUS5, value);
    }

    public static void npps_act_cb_qp_offset_plus5(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_ACT_CB_QP_OFFSET_PLUS5, value);
    }

    public static void npps_act_cr_qp_offset_plus3(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_ACT_CR_QP_OFFSET_PLUS3, value);
    }

    public static void npps_num_palette_predictor_initializers(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS, value);
    }

    public static void nluma_bit_depth_entry_minus8(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LUMA_BIT_DEPTH_ENTRY_MINUS8, value);
    }

    public static void nchroma_bit_depth_entry_minus8(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_BIT_DEPTH_ENTRY_MINUS8, value);
    }

    public static void nnum_tile_columns_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_TILE_COLUMNS_MINUS1, value);
    }

    public static void nnum_tile_rows_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_TILE_ROWS_MINUS1, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void nreserved2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED2, value);
    }

    public static void ncolumn_width_minus1(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 19);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + COLUMN_WIDTH_MINUS1, value.remaining() * 2);
    }

    public static void ncolumn_width_minus1(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + COLUMN_WIDTH_MINUS1 + (Checks.check(index, 19) * 2), value);
    }

    public static void nrow_height_minus1(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 21);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + ROW_HEIGHT_MINUS1, value.remaining() * 2);
    }

    public static void nrow_height_minus1(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + ROW_HEIGHT_MINUS1 + (Checks.check(index, 21) * 2), value);
    }

    public static void nreserved3(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESERVED3, value);
    }

    public static void npScalingLists(long struct, StdVideoH265ScalingLists value) {
        MemoryUtil.memPutAddress(struct + PSCALINGLISTS, value.address());
    }

    public static void npPredictorPaletteEntries(long struct, StdVideoH265PredictorPaletteEntries value) {
        MemoryUtil.memPutAddress(struct + PPREDICTORPALETTEENTRIES, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSCALINGLISTS));
        Checks.check(MemoryUtil.memGetAddress(struct + PPREDICTORPALETTEENTRIES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PictureParameterSet$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265PictureParameterSet$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265PictureParameterSet, Buffer> implements NativeResource {
        private static final StdVideoH265PictureParameterSet ELEMENT_FACTORY = StdVideoH265PictureParameterSet.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265PictureParameterSet.SIZEOF);
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
        public StdVideoH265PictureParameterSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoH265PpsFlags flags() {
            return StdVideoH265PictureParameterSet.nflags(address());
        }

        @NativeType("uint8_t")
        public byte pps_pic_parameter_set_id() {
            return StdVideoH265PictureParameterSet.npps_pic_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte pps_seq_parameter_set_id() {
            return StdVideoH265PictureParameterSet.npps_seq_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte sps_video_parameter_set_id() {
            return StdVideoH265PictureParameterSet.nsps_video_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte num_extra_slice_header_bits() {
            return StdVideoH265PictureParameterSet.nnum_extra_slice_header_bits(address());
        }

        @NativeType("uint8_t")
        public byte num_ref_idx_l0_default_active_minus1() {
            return StdVideoH265PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(address());
        }

        @NativeType("uint8_t")
        public byte num_ref_idx_l1_default_active_minus1() {
            return StdVideoH265PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(address());
        }

        @NativeType("int8_t")
        public byte init_qp_minus26() {
            return StdVideoH265PictureParameterSet.ninit_qp_minus26(address());
        }

        @NativeType("uint8_t")
        public byte diff_cu_qp_delta_depth() {
            return StdVideoH265PictureParameterSet.ndiff_cu_qp_delta_depth(address());
        }

        @NativeType("int8_t")
        public byte pps_cb_qp_offset() {
            return StdVideoH265PictureParameterSet.npps_cb_qp_offset(address());
        }

        @NativeType("int8_t")
        public byte pps_cr_qp_offset() {
            return StdVideoH265PictureParameterSet.npps_cr_qp_offset(address());
        }

        @NativeType("int8_t")
        public byte pps_beta_offset_div2() {
            return StdVideoH265PictureParameterSet.npps_beta_offset_div2(address());
        }

        @NativeType("int8_t")
        public byte pps_tc_offset_div2() {
            return StdVideoH265PictureParameterSet.npps_tc_offset_div2(address());
        }

        @NativeType("uint8_t")
        public byte log2_parallel_merge_level_minus2() {
            return StdVideoH265PictureParameterSet.nlog2_parallel_merge_level_minus2(address());
        }

        @NativeType("uint8_t")
        public byte log2_max_transform_skip_block_size_minus2() {
            return StdVideoH265PictureParameterSet.nlog2_max_transform_skip_block_size_minus2(address());
        }

        @NativeType("uint8_t")
        public byte diff_cu_chroma_qp_offset_depth() {
            return StdVideoH265PictureParameterSet.ndiff_cu_chroma_qp_offset_depth(address());
        }

        @NativeType("uint8_t")
        public byte chroma_qp_offset_list_len_minus1() {
            return StdVideoH265PictureParameterSet.nchroma_qp_offset_list_len_minus1(address());
        }

        @NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
        public ByteBuffer cb_qp_offset_list() {
            return StdVideoH265PictureParameterSet.ncb_qp_offset_list(address());
        }

        @NativeType("int8_t")
        public byte cb_qp_offset_list(int index) {
            return StdVideoH265PictureParameterSet.ncb_qp_offset_list(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
        public ByteBuffer cr_qp_offset_list() {
            return StdVideoH265PictureParameterSet.ncr_qp_offset_list(address());
        }

        @NativeType("int8_t")
        public byte cr_qp_offset_list(int index) {
            return StdVideoH265PictureParameterSet.ncr_qp_offset_list(address(), index);
        }

        @NativeType("uint8_t")
        public byte log2_sao_offset_scale_luma() {
            return StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_luma(address());
        }

        @NativeType("uint8_t")
        public byte log2_sao_offset_scale_chroma() {
            return StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_chroma(address());
        }

        @NativeType("int8_t")
        public byte pps_act_y_qp_offset_plus5() {
            return StdVideoH265PictureParameterSet.npps_act_y_qp_offset_plus5(address());
        }

        @NativeType("int8_t")
        public byte pps_act_cb_qp_offset_plus5() {
            return StdVideoH265PictureParameterSet.npps_act_cb_qp_offset_plus5(address());
        }

        @NativeType("int8_t")
        public byte pps_act_cr_qp_offset_plus3() {
            return StdVideoH265PictureParameterSet.npps_act_cr_qp_offset_plus3(address());
        }

        @NativeType("uint8_t")
        public byte pps_num_palette_predictor_initializers() {
            return StdVideoH265PictureParameterSet.npps_num_palette_predictor_initializers(address());
        }

        @NativeType("uint8_t")
        public byte luma_bit_depth_entry_minus8() {
            return StdVideoH265PictureParameterSet.nluma_bit_depth_entry_minus8(address());
        }

        @NativeType("uint8_t")
        public byte chroma_bit_depth_entry_minus8() {
            return StdVideoH265PictureParameterSet.nchroma_bit_depth_entry_minus8(address());
        }

        @NativeType("uint8_t")
        public byte num_tile_columns_minus1() {
            return StdVideoH265PictureParameterSet.nnum_tile_columns_minus1(address());
        }

        @NativeType("uint8_t")
        public byte num_tile_rows_minus1() {
            return StdVideoH265PictureParameterSet.nnum_tile_rows_minus1(address());
        }

        @NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]")
        public ShortBuffer column_width_minus1() {
            return StdVideoH265PictureParameterSet.ncolumn_width_minus1(address());
        }

        @NativeType("uint16_t")
        public short column_width_minus1(int index) {
            return StdVideoH265PictureParameterSet.ncolumn_width_minus1(address(), index);
        }

        @NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]")
        public ShortBuffer row_height_minus1() {
            return StdVideoH265PictureParameterSet.nrow_height_minus1(address());
        }

        @NativeType("uint16_t")
        public short row_height_minus1(int index) {
            return StdVideoH265PictureParameterSet.nrow_height_minus1(address(), index);
        }

        @NativeType("StdVideoH265ScalingLists const *")
        public StdVideoH265ScalingLists pScalingLists() {
            return StdVideoH265PictureParameterSet.npScalingLists(address());
        }

        @NativeType("StdVideoH265PredictorPaletteEntries const *")
        public StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() {
            return StdVideoH265PictureParameterSet.npPredictorPaletteEntries(address());
        }

        public Buffer flags(StdVideoH265PpsFlags value) {
            StdVideoH265PictureParameterSet.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoH265PpsFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.npps_pic_parameter_set_id(address(), value);
            return this;
        }

        public Buffer pps_seq_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.npps_seq_parameter_set_id(address(), value);
            return this;
        }

        public Buffer sps_video_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nsps_video_parameter_set_id(address(), value);
            return this;
        }

        public Buffer num_extra_slice_header_bits(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nnum_extra_slice_header_bits(address(), value);
            return this;
        }

        public Buffer num_ref_idx_l0_default_active_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(address(), value);
            return this;
        }

        public Buffer num_ref_idx_l1_default_active_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(address(), value);
            return this;
        }

        public Buffer init_qp_minus26(@NativeType("int8_t") byte value) {
            StdVideoH265PictureParameterSet.ninit_qp_minus26(address(), value);
            return this;
        }

        public Buffer diff_cu_qp_delta_depth(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.ndiff_cu_qp_delta_depth(address(), value);
            return this;
        }

        public Buffer pps_cb_qp_offset(@NativeType("int8_t") byte value) {
            StdVideoH265PictureParameterSet.npps_cb_qp_offset(address(), value);
            return this;
        }

        public Buffer pps_cr_qp_offset(@NativeType("int8_t") byte value) {
            StdVideoH265PictureParameterSet.npps_cr_qp_offset(address(), value);
            return this;
        }

        public Buffer pps_beta_offset_div2(@NativeType("int8_t") byte value) {
            StdVideoH265PictureParameterSet.npps_beta_offset_div2(address(), value);
            return this;
        }

        public Buffer pps_tc_offset_div2(@NativeType("int8_t") byte value) {
            StdVideoH265PictureParameterSet.npps_tc_offset_div2(address(), value);
            return this;
        }

        public Buffer log2_parallel_merge_level_minus2(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nlog2_parallel_merge_level_minus2(address(), value);
            return this;
        }

        public Buffer log2_max_transform_skip_block_size_minus2(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nlog2_max_transform_skip_block_size_minus2(address(), value);
            return this;
        }

        public Buffer diff_cu_chroma_qp_offset_depth(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.ndiff_cu_chroma_qp_offset_depth(address(), value);
            return this;
        }

        public Buffer chroma_qp_offset_list_len_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nchroma_qp_offset_list_len_minus1(address(), value);
            return this;
        }

        public Buffer cb_qp_offset_list(@NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") ByteBuffer value) {
            StdVideoH265PictureParameterSet.ncb_qp_offset_list(address(), value);
            return this;
        }

        public Buffer cb_qp_offset_list(int index, @NativeType("int8_t") byte value) {
            StdVideoH265PictureParameterSet.ncb_qp_offset_list(address(), index, value);
            return this;
        }

        public Buffer cr_qp_offset_list(@NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") ByteBuffer value) {
            StdVideoH265PictureParameterSet.ncr_qp_offset_list(address(), value);
            return this;
        }

        public Buffer cr_qp_offset_list(int index, @NativeType("int8_t") byte value) {
            StdVideoH265PictureParameterSet.ncr_qp_offset_list(address(), index, value);
            return this;
        }

        public Buffer log2_sao_offset_scale_luma(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_luma(address(), value);
            return this;
        }

        public Buffer log2_sao_offset_scale_chroma(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_chroma(address(), value);
            return this;
        }

        public Buffer pps_act_y_qp_offset_plus5(@NativeType("int8_t") byte value) {
            StdVideoH265PictureParameterSet.npps_act_y_qp_offset_plus5(address(), value);
            return this;
        }

        public Buffer pps_act_cb_qp_offset_plus5(@NativeType("int8_t") byte value) {
            StdVideoH265PictureParameterSet.npps_act_cb_qp_offset_plus5(address(), value);
            return this;
        }

        public Buffer pps_act_cr_qp_offset_plus3(@NativeType("int8_t") byte value) {
            StdVideoH265PictureParameterSet.npps_act_cr_qp_offset_plus3(address(), value);
            return this;
        }

        public Buffer pps_num_palette_predictor_initializers(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.npps_num_palette_predictor_initializers(address(), value);
            return this;
        }

        public Buffer luma_bit_depth_entry_minus8(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nluma_bit_depth_entry_minus8(address(), value);
            return this;
        }

        public Buffer chroma_bit_depth_entry_minus8(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nchroma_bit_depth_entry_minus8(address(), value);
            return this;
        }

        public Buffer num_tile_columns_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nnum_tile_columns_minus1(address(), value);
            return this;
        }

        public Buffer num_tile_rows_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265PictureParameterSet.nnum_tile_rows_minus1(address(), value);
            return this;
        }

        public Buffer column_width_minus1(@NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]") ShortBuffer value) {
            StdVideoH265PictureParameterSet.ncolumn_width_minus1(address(), value);
            return this;
        }

        public Buffer column_width_minus1(int index, @NativeType("uint16_t") short value) {
            StdVideoH265PictureParameterSet.ncolumn_width_minus1(address(), index, value);
            return this;
        }

        public Buffer row_height_minus1(@NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]") ShortBuffer value) {
            StdVideoH265PictureParameterSet.nrow_height_minus1(address(), value);
            return this;
        }

        public Buffer row_height_minus1(int index, @NativeType("uint16_t") short value) {
            StdVideoH265PictureParameterSet.nrow_height_minus1(address(), index, value);
            return this;
        }

        public Buffer pScalingLists(@NativeType("StdVideoH265ScalingLists const *") StdVideoH265ScalingLists value) {
            StdVideoH265PictureParameterSet.npScalingLists(address(), value);
            return this;
        }

        public Buffer pPredictorPaletteEntries(@NativeType("StdVideoH265PredictorPaletteEntries const *") StdVideoH265PredictorPaletteEntries value) {
            StdVideoH265PictureParameterSet.npPredictorPaletteEntries(address(), value);
            return this;
        }
    }
}
