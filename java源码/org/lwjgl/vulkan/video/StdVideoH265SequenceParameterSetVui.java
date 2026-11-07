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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSetVui.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSetVui.class */
public class StdVideoH265SequenceParameterSetVui extends Struct<StdVideoH265SequenceParameterSetVui> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int ASPECT_RATIO_IDC;
    public static final int SAR_WIDTH;
    public static final int SAR_HEIGHT;
    public static final int VIDEO_FORMAT;
    public static final int COLOUR_PRIMARIES;
    public static final int TRANSFER_CHARACTERISTICS;
    public static final int MATRIX_COEFFS;
    public static final int CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD;
    public static final int CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD;
    public static final int RESERVED1;
    public static final int RESERVED2;
    public static final int DEF_DISP_WIN_LEFT_OFFSET;
    public static final int DEF_DISP_WIN_RIGHT_OFFSET;
    public static final int DEF_DISP_WIN_TOP_OFFSET;
    public static final int DEF_DISP_WIN_BOTTOM_OFFSET;
    public static final int VUI_NUM_UNITS_IN_TICK;
    public static final int VUI_TIME_SCALE;
    public static final int VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1;
    public static final int MIN_SPATIAL_SEGMENTATION_IDC;
    public static final int RESERVED3;
    public static final int MAX_BYTES_PER_PIC_DENOM;
    public static final int MAX_BITS_PER_MIN_CU_DENOM;
    public static final int LOG2_MAX_MV_LENGTH_HORIZONTAL;
    public static final int LOG2_MAX_MV_LENGTH_VERTICAL;
    public static final int PHRDPARAMETERS;

    static {
        Struct.Layout layout = __struct(__member(StdVideoH265SpsVuiFlags.SIZEOF, StdVideoH265SpsVuiFlags.ALIGNOF), __member(4), __member(2), __member(2), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(2), __member(2), __member(2), __member(2), __member(4), __member(4), __member(4), __member(2), __member(2), __member(1), __member(1), __member(1), __member(1), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        ASPECT_RATIO_IDC = layout.offsetof(1);
        SAR_WIDTH = layout.offsetof(2);
        SAR_HEIGHT = layout.offsetof(3);
        VIDEO_FORMAT = layout.offsetof(4);
        COLOUR_PRIMARIES = layout.offsetof(5);
        TRANSFER_CHARACTERISTICS = layout.offsetof(6);
        MATRIX_COEFFS = layout.offsetof(7);
        CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD = layout.offsetof(8);
        CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD = layout.offsetof(9);
        RESERVED1 = layout.offsetof(10);
        RESERVED2 = layout.offsetof(11);
        DEF_DISP_WIN_LEFT_OFFSET = layout.offsetof(12);
        DEF_DISP_WIN_RIGHT_OFFSET = layout.offsetof(13);
        DEF_DISP_WIN_TOP_OFFSET = layout.offsetof(14);
        DEF_DISP_WIN_BOTTOM_OFFSET = layout.offsetof(15);
        VUI_NUM_UNITS_IN_TICK = layout.offsetof(16);
        VUI_TIME_SCALE = layout.offsetof(17);
        VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1 = layout.offsetof(18);
        MIN_SPATIAL_SEGMENTATION_IDC = layout.offsetof(19);
        RESERVED3 = layout.offsetof(20);
        MAX_BYTES_PER_PIC_DENOM = layout.offsetof(21);
        MAX_BITS_PER_MIN_CU_DENOM = layout.offsetof(22);
        LOG2_MAX_MV_LENGTH_HORIZONTAL = layout.offsetof(23);
        LOG2_MAX_MV_LENGTH_VERTICAL = layout.offsetof(24);
        PHRDPARAMETERS = layout.offsetof(25);
    }

    protected StdVideoH265SequenceParameterSetVui(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265SequenceParameterSetVui create(long address, ByteBuffer container) {
        return new StdVideoH265SequenceParameterSetVui(address, container);
    }

    public StdVideoH265SequenceParameterSetVui(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoH265SpsVuiFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH265AspectRatioIdc")
    public int aspect_ratio_idc() {
        return naspect_ratio_idc(address());
    }

    @NativeType("uint16_t")
    public short sar_width() {
        return nsar_width(address());
    }

    @NativeType("uint16_t")
    public short sar_height() {
        return nsar_height(address());
    }

    @NativeType("uint8_t")
    public byte video_format() {
        return nvideo_format(address());
    }

    @NativeType("uint8_t")
    public byte colour_primaries() {
        return ncolour_primaries(address());
    }

    @NativeType("uint8_t")
    public byte transfer_characteristics() {
        return ntransfer_characteristics(address());
    }

    @NativeType("uint8_t")
    public byte matrix_coeffs() {
        return nmatrix_coeffs(address());
    }

    @NativeType("uint8_t")
    public byte chroma_sample_loc_type_top_field() {
        return nchroma_sample_loc_type_top_field(address());
    }

    @NativeType("uint8_t")
    public byte chroma_sample_loc_type_bottom_field() {
        return nchroma_sample_loc_type_bottom_field(address());
    }

    @NativeType("uint16_t")
    public short def_disp_win_left_offset() {
        return ndef_disp_win_left_offset(address());
    }

    @NativeType("uint16_t")
    public short def_disp_win_right_offset() {
        return ndef_disp_win_right_offset(address());
    }

    @NativeType("uint16_t")
    public short def_disp_win_top_offset() {
        return ndef_disp_win_top_offset(address());
    }

    @NativeType("uint16_t")
    public short def_disp_win_bottom_offset() {
        return ndef_disp_win_bottom_offset(address());
    }

    @NativeType("uint32_t")
    public int vui_num_units_in_tick() {
        return nvui_num_units_in_tick(address());
    }

    @NativeType("uint32_t")
    public int vui_time_scale() {
        return nvui_time_scale(address());
    }

    @NativeType("uint32_t")
    public int vui_num_ticks_poc_diff_one_minus1() {
        return nvui_num_ticks_poc_diff_one_minus1(address());
    }

    @NativeType("uint16_t")
    public short min_spatial_segmentation_idc() {
        return nmin_spatial_segmentation_idc(address());
    }

    @NativeType("uint8_t")
    public byte max_bytes_per_pic_denom() {
        return nmax_bytes_per_pic_denom(address());
    }

    @NativeType("uint8_t")
    public byte max_bits_per_min_cu_denom() {
        return nmax_bits_per_min_cu_denom(address());
    }

    @NativeType("uint8_t")
    public byte log2_max_mv_length_horizontal() {
        return nlog2_max_mv_length_horizontal(address());
    }

    @NativeType("uint8_t")
    public byte log2_max_mv_length_vertical() {
        return nlog2_max_mv_length_vertical(address());
    }

    @NativeType("StdVideoH265HrdParameters const *")
    public StdVideoH265HrdParameters pHrdParameters() {
        return npHrdParameters(address());
    }

    public StdVideoH265SequenceParameterSetVui flags(StdVideoH265SpsVuiFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui flags(Consumer<StdVideoH265SpsVuiFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoH265SequenceParameterSetVui aspect_ratio_idc(@NativeType("StdVideoH265AspectRatioIdc") int value) {
        naspect_ratio_idc(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui sar_width(@NativeType("uint16_t") short value) {
        nsar_width(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui sar_height(@NativeType("uint16_t") short value) {
        nsar_height(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui video_format(@NativeType("uint8_t") byte value) {
        nvideo_format(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui colour_primaries(@NativeType("uint8_t") byte value) {
        ncolour_primaries(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui transfer_characteristics(@NativeType("uint8_t") byte value) {
        ntransfer_characteristics(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui matrix_coeffs(@NativeType("uint8_t") byte value) {
        nmatrix_coeffs(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_top_field(@NativeType("uint8_t") byte value) {
        nchroma_sample_loc_type_top_field(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_bottom_field(@NativeType("uint8_t") byte value) {
        nchroma_sample_loc_type_bottom_field(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui def_disp_win_left_offset(@NativeType("uint16_t") short value) {
        ndef_disp_win_left_offset(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui def_disp_win_right_offset(@NativeType("uint16_t") short value) {
        ndef_disp_win_right_offset(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui def_disp_win_top_offset(@NativeType("uint16_t") short value) {
        ndef_disp_win_top_offset(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui def_disp_win_bottom_offset(@NativeType("uint16_t") short value) {
        ndef_disp_win_bottom_offset(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui vui_num_units_in_tick(@NativeType("uint32_t") int value) {
        nvui_num_units_in_tick(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui vui_time_scale(@NativeType("uint32_t") int value) {
        nvui_time_scale(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui vui_num_ticks_poc_diff_one_minus1(@NativeType("uint32_t") int value) {
        nvui_num_ticks_poc_diff_one_minus1(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui min_spatial_segmentation_idc(@NativeType("uint16_t") short value) {
        nmin_spatial_segmentation_idc(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui max_bytes_per_pic_denom(@NativeType("uint8_t") byte value) {
        nmax_bytes_per_pic_denom(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui max_bits_per_min_cu_denom(@NativeType("uint8_t") byte value) {
        nmax_bits_per_min_cu_denom(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui log2_max_mv_length_horizontal(@NativeType("uint8_t") byte value) {
        nlog2_max_mv_length_horizontal(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui log2_max_mv_length_vertical(@NativeType("uint8_t") byte value) {
        nlog2_max_mv_length_vertical(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui pHrdParameters(@NativeType("StdVideoH265HrdParameters const *") StdVideoH265HrdParameters value) {
        npHrdParameters(address(), value);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui set(StdVideoH265SpsVuiFlags flags, int aspect_ratio_idc, short sar_width, short sar_height, byte video_format, byte colour_primaries, byte transfer_characteristics, byte matrix_coeffs, byte chroma_sample_loc_type_top_field, byte chroma_sample_loc_type_bottom_field, short def_disp_win_left_offset, short def_disp_win_right_offset, short def_disp_win_top_offset, short def_disp_win_bottom_offset, int vui_num_units_in_tick, int vui_time_scale, int vui_num_ticks_poc_diff_one_minus1, short min_spatial_segmentation_idc, byte max_bytes_per_pic_denom, byte max_bits_per_min_cu_denom, byte log2_max_mv_length_horizontal, byte log2_max_mv_length_vertical, StdVideoH265HrdParameters pHrdParameters) {
        flags(flags);
        aspect_ratio_idc(aspect_ratio_idc);
        sar_width(sar_width);
        sar_height(sar_height);
        video_format(video_format);
        colour_primaries(colour_primaries);
        transfer_characteristics(transfer_characteristics);
        matrix_coeffs(matrix_coeffs);
        chroma_sample_loc_type_top_field(chroma_sample_loc_type_top_field);
        chroma_sample_loc_type_bottom_field(chroma_sample_loc_type_bottom_field);
        def_disp_win_left_offset(def_disp_win_left_offset);
        def_disp_win_right_offset(def_disp_win_right_offset);
        def_disp_win_top_offset(def_disp_win_top_offset);
        def_disp_win_bottom_offset(def_disp_win_bottom_offset);
        vui_num_units_in_tick(vui_num_units_in_tick);
        vui_time_scale(vui_time_scale);
        vui_num_ticks_poc_diff_one_minus1(vui_num_ticks_poc_diff_one_minus1);
        min_spatial_segmentation_idc(min_spatial_segmentation_idc);
        max_bytes_per_pic_denom(max_bytes_per_pic_denom);
        max_bits_per_min_cu_denom(max_bits_per_min_cu_denom);
        log2_max_mv_length_horizontal(log2_max_mv_length_horizontal);
        log2_max_mv_length_vertical(log2_max_mv_length_vertical);
        pHrdParameters(pHrdParameters);
        return this;
    }

    public StdVideoH265SequenceParameterSetVui set(StdVideoH265SequenceParameterSetVui src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265SequenceParameterSetVui malloc() {
        return new StdVideoH265SequenceParameterSetVui(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265SequenceParameterSetVui calloc() {
        return new StdVideoH265SequenceParameterSetVui(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265SequenceParameterSetVui create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265SequenceParameterSetVui(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265SequenceParameterSetVui create(long address) {
        return new StdVideoH265SequenceParameterSetVui(address, null);
    }

    public static StdVideoH265SequenceParameterSetVui createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265SequenceParameterSetVui(address, null);
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

    public static StdVideoH265SequenceParameterSetVui malloc(MemoryStack stack) {
        return new StdVideoH265SequenceParameterSetVui(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265SequenceParameterSetVui calloc(MemoryStack stack) {
        return new StdVideoH265SequenceParameterSetVui(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoH265SpsVuiFlags nflags(long struct) {
        return StdVideoH265SpsVuiFlags.create(struct + FLAGS);
    }

    public static int naspect_ratio_idc(long struct) {
        return MemoryUtil.memGetInt(struct + ASPECT_RATIO_IDC);
    }

    public static short nsar_width(long struct) {
        return MemoryUtil.memGetShort(struct + SAR_WIDTH);
    }

    public static short nsar_height(long struct) {
        return MemoryUtil.memGetShort(struct + SAR_HEIGHT);
    }

    public static byte nvideo_format(long struct) {
        return MemoryUtil.memGetByte(struct + VIDEO_FORMAT);
    }

    public static byte ncolour_primaries(long struct) {
        return MemoryUtil.memGetByte(struct + COLOUR_PRIMARIES);
    }

    public static byte ntransfer_characteristics(long struct) {
        return MemoryUtil.memGetByte(struct + TRANSFER_CHARACTERISTICS);
    }

    public static byte nmatrix_coeffs(long struct) {
        return MemoryUtil.memGetByte(struct + MATRIX_COEFFS);
    }

    public static byte nchroma_sample_loc_type_top_field(long struct) {
        return MemoryUtil.memGetByte(struct + CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD);
    }

    public static byte nchroma_sample_loc_type_bottom_field(long struct) {
        return MemoryUtil.memGetByte(struct + CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static byte nreserved2(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED2);
    }

    public static short ndef_disp_win_left_offset(long struct) {
        return MemoryUtil.memGetShort(struct + DEF_DISP_WIN_LEFT_OFFSET);
    }

    public static short ndef_disp_win_right_offset(long struct) {
        return MemoryUtil.memGetShort(struct + DEF_DISP_WIN_RIGHT_OFFSET);
    }

    public static short ndef_disp_win_top_offset(long struct) {
        return MemoryUtil.memGetShort(struct + DEF_DISP_WIN_TOP_OFFSET);
    }

    public static short ndef_disp_win_bottom_offset(long struct) {
        return MemoryUtil.memGetShort(struct + DEF_DISP_WIN_BOTTOM_OFFSET);
    }

    public static int nvui_num_units_in_tick(long struct) {
        return MemoryUtil.memGetInt(struct + VUI_NUM_UNITS_IN_TICK);
    }

    public static int nvui_time_scale(long struct) {
        return MemoryUtil.memGetInt(struct + VUI_TIME_SCALE);
    }

    public static int nvui_num_ticks_poc_diff_one_minus1(long struct) {
        return MemoryUtil.memGetInt(struct + VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1);
    }

    public static short nmin_spatial_segmentation_idc(long struct) {
        return MemoryUtil.memGetShort(struct + MIN_SPATIAL_SEGMENTATION_IDC);
    }

    public static short nreserved3(long struct) {
        return MemoryUtil.memGetShort(struct + RESERVED3);
    }

    public static byte nmax_bytes_per_pic_denom(long struct) {
        return MemoryUtil.memGetByte(struct + MAX_BYTES_PER_PIC_DENOM);
    }

    public static byte nmax_bits_per_min_cu_denom(long struct) {
        return MemoryUtil.memGetByte(struct + MAX_BITS_PER_MIN_CU_DENOM);
    }

    public static byte nlog2_max_mv_length_horizontal(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_MAX_MV_LENGTH_HORIZONTAL);
    }

    public static byte nlog2_max_mv_length_vertical(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_MAX_MV_LENGTH_VERTICAL);
    }

    public static StdVideoH265HrdParameters npHrdParameters(long struct) {
        return StdVideoH265HrdParameters.create(MemoryUtil.memGetAddress(struct + PHRDPARAMETERS));
    }

    public static void nflags(long struct, StdVideoH265SpsVuiFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoH265SpsVuiFlags.SIZEOF);
    }

    public static void naspect_ratio_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + ASPECT_RATIO_IDC, value);
    }

    public static void nsar_width(long struct, short value) {
        MemoryUtil.memPutShort(struct + SAR_WIDTH, value);
    }

    public static void nsar_height(long struct, short value) {
        MemoryUtil.memPutShort(struct + SAR_HEIGHT, value);
    }

    public static void nvideo_format(long struct, byte value) {
        MemoryUtil.memPutByte(struct + VIDEO_FORMAT, value);
    }

    public static void ncolour_primaries(long struct, byte value) {
        MemoryUtil.memPutByte(struct + COLOUR_PRIMARIES, value);
    }

    public static void ntransfer_characteristics(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TRANSFER_CHARACTERISTICS, value);
    }

    public static void nmatrix_coeffs(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MATRIX_COEFFS, value);
    }

    public static void nchroma_sample_loc_type_top_field(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD, value);
    }

    public static void nchroma_sample_loc_type_bottom_field(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void nreserved2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED2, value);
    }

    public static void ndef_disp_win_left_offset(long struct, short value) {
        MemoryUtil.memPutShort(struct + DEF_DISP_WIN_LEFT_OFFSET, value);
    }

    public static void ndef_disp_win_right_offset(long struct, short value) {
        MemoryUtil.memPutShort(struct + DEF_DISP_WIN_RIGHT_OFFSET, value);
    }

    public static void ndef_disp_win_top_offset(long struct, short value) {
        MemoryUtil.memPutShort(struct + DEF_DISP_WIN_TOP_OFFSET, value);
    }

    public static void ndef_disp_win_bottom_offset(long struct, short value) {
        MemoryUtil.memPutShort(struct + DEF_DISP_WIN_BOTTOM_OFFSET, value);
    }

    public static void nvui_num_units_in_tick(long struct, int value) {
        MemoryUtil.memPutInt(struct + VUI_NUM_UNITS_IN_TICK, value);
    }

    public static void nvui_time_scale(long struct, int value) {
        MemoryUtil.memPutInt(struct + VUI_TIME_SCALE, value);
    }

    public static void nvui_num_ticks_poc_diff_one_minus1(long struct, int value) {
        MemoryUtil.memPutInt(struct + VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1, value);
    }

    public static void nmin_spatial_segmentation_idc(long struct, short value) {
        MemoryUtil.memPutShort(struct + MIN_SPATIAL_SEGMENTATION_IDC, value);
    }

    public static void nreserved3(long struct, short value) {
        MemoryUtil.memPutShort(struct + RESERVED3, value);
    }

    public static void nmax_bytes_per_pic_denom(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MAX_BYTES_PER_PIC_DENOM, value);
    }

    public static void nmax_bits_per_min_cu_denom(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MAX_BITS_PER_MIN_CU_DENOM, value);
    }

    public static void nlog2_max_mv_length_horizontal(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_MAX_MV_LENGTH_HORIZONTAL, value);
    }

    public static void nlog2_max_mv_length_vertical(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_MAX_MV_LENGTH_VERTICAL, value);
    }

    public static void npHrdParameters(long struct, StdVideoH265HrdParameters value) {
        MemoryUtil.memPutAddress(struct + PHRDPARAMETERS, value.address());
    }

    public static void validate(long struct) {
        long pHrdParameters = MemoryUtil.memGetAddress(struct + PHRDPARAMETERS);
        Checks.check(pHrdParameters);
        StdVideoH265HrdParameters.validate(pHrdParameters);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSetVui$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSetVui$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265SequenceParameterSetVui, Buffer> implements NativeResource {
        private static final StdVideoH265SequenceParameterSetVui ELEMENT_FACTORY = StdVideoH265SequenceParameterSetVui.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265SequenceParameterSetVui.SIZEOF);
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
        public StdVideoH265SequenceParameterSetVui getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoH265SpsVuiFlags flags() {
            return StdVideoH265SequenceParameterSetVui.nflags(address());
        }

        @NativeType("StdVideoH265AspectRatioIdc")
        public int aspect_ratio_idc() {
            return StdVideoH265SequenceParameterSetVui.naspect_ratio_idc(address());
        }

        @NativeType("uint16_t")
        public short sar_width() {
            return StdVideoH265SequenceParameterSetVui.nsar_width(address());
        }

        @NativeType("uint16_t")
        public short sar_height() {
            return StdVideoH265SequenceParameterSetVui.nsar_height(address());
        }

        @NativeType("uint8_t")
        public byte video_format() {
            return StdVideoH265SequenceParameterSetVui.nvideo_format(address());
        }

        @NativeType("uint8_t")
        public byte colour_primaries() {
            return StdVideoH265SequenceParameterSetVui.ncolour_primaries(address());
        }

        @NativeType("uint8_t")
        public byte transfer_characteristics() {
            return StdVideoH265SequenceParameterSetVui.ntransfer_characteristics(address());
        }

        @NativeType("uint8_t")
        public byte matrix_coeffs() {
            return StdVideoH265SequenceParameterSetVui.nmatrix_coeffs(address());
        }

        @NativeType("uint8_t")
        public byte chroma_sample_loc_type_top_field() {
            return StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_top_field(address());
        }

        @NativeType("uint8_t")
        public byte chroma_sample_loc_type_bottom_field() {
            return StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_bottom_field(address());
        }

        @NativeType("uint16_t")
        public short def_disp_win_left_offset() {
            return StdVideoH265SequenceParameterSetVui.ndef_disp_win_left_offset(address());
        }

        @NativeType("uint16_t")
        public short def_disp_win_right_offset() {
            return StdVideoH265SequenceParameterSetVui.ndef_disp_win_right_offset(address());
        }

        @NativeType("uint16_t")
        public short def_disp_win_top_offset() {
            return StdVideoH265SequenceParameterSetVui.ndef_disp_win_top_offset(address());
        }

        @NativeType("uint16_t")
        public short def_disp_win_bottom_offset() {
            return StdVideoH265SequenceParameterSetVui.ndef_disp_win_bottom_offset(address());
        }

        @NativeType("uint32_t")
        public int vui_num_units_in_tick() {
            return StdVideoH265SequenceParameterSetVui.nvui_num_units_in_tick(address());
        }

        @NativeType("uint32_t")
        public int vui_time_scale() {
            return StdVideoH265SequenceParameterSetVui.nvui_time_scale(address());
        }

        @NativeType("uint32_t")
        public int vui_num_ticks_poc_diff_one_minus1() {
            return StdVideoH265SequenceParameterSetVui.nvui_num_ticks_poc_diff_one_minus1(address());
        }

        @NativeType("uint16_t")
        public short min_spatial_segmentation_idc() {
            return StdVideoH265SequenceParameterSetVui.nmin_spatial_segmentation_idc(address());
        }

        @NativeType("uint8_t")
        public byte max_bytes_per_pic_denom() {
            return StdVideoH265SequenceParameterSetVui.nmax_bytes_per_pic_denom(address());
        }

        @NativeType("uint8_t")
        public byte max_bits_per_min_cu_denom() {
            return StdVideoH265SequenceParameterSetVui.nmax_bits_per_min_cu_denom(address());
        }

        @NativeType("uint8_t")
        public byte log2_max_mv_length_horizontal() {
            return StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_horizontal(address());
        }

        @NativeType("uint8_t")
        public byte log2_max_mv_length_vertical() {
            return StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_vertical(address());
        }

        @NativeType("StdVideoH265HrdParameters const *")
        public StdVideoH265HrdParameters pHrdParameters() {
            return StdVideoH265SequenceParameterSetVui.npHrdParameters(address());
        }

        public Buffer flags(StdVideoH265SpsVuiFlags value) {
            StdVideoH265SequenceParameterSetVui.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoH265SpsVuiFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer aspect_ratio_idc(@NativeType("StdVideoH265AspectRatioIdc") int value) {
            StdVideoH265SequenceParameterSetVui.naspect_ratio_idc(address(), value);
            return this;
        }

        public Buffer sar_width(@NativeType("uint16_t") short value) {
            StdVideoH265SequenceParameterSetVui.nsar_width(address(), value);
            return this;
        }

        public Buffer sar_height(@NativeType("uint16_t") short value) {
            StdVideoH265SequenceParameterSetVui.nsar_height(address(), value);
            return this;
        }

        public Buffer video_format(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSetVui.nvideo_format(address(), value);
            return this;
        }

        public Buffer colour_primaries(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSetVui.ncolour_primaries(address(), value);
            return this;
        }

        public Buffer transfer_characteristics(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSetVui.ntransfer_characteristics(address(), value);
            return this;
        }

        public Buffer matrix_coeffs(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSetVui.nmatrix_coeffs(address(), value);
            return this;
        }

        public Buffer chroma_sample_loc_type_top_field(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_top_field(address(), value);
            return this;
        }

        public Buffer chroma_sample_loc_type_bottom_field(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_bottom_field(address(), value);
            return this;
        }

        public Buffer def_disp_win_left_offset(@NativeType("uint16_t") short value) {
            StdVideoH265SequenceParameterSetVui.ndef_disp_win_left_offset(address(), value);
            return this;
        }

        public Buffer def_disp_win_right_offset(@NativeType("uint16_t") short value) {
            StdVideoH265SequenceParameterSetVui.ndef_disp_win_right_offset(address(), value);
            return this;
        }

        public Buffer def_disp_win_top_offset(@NativeType("uint16_t") short value) {
            StdVideoH265SequenceParameterSetVui.ndef_disp_win_top_offset(address(), value);
            return this;
        }

        public Buffer def_disp_win_bottom_offset(@NativeType("uint16_t") short value) {
            StdVideoH265SequenceParameterSetVui.ndef_disp_win_bottom_offset(address(), value);
            return this;
        }

        public Buffer vui_num_units_in_tick(@NativeType("uint32_t") int value) {
            StdVideoH265SequenceParameterSetVui.nvui_num_units_in_tick(address(), value);
            return this;
        }

        public Buffer vui_time_scale(@NativeType("uint32_t") int value) {
            StdVideoH265SequenceParameterSetVui.nvui_time_scale(address(), value);
            return this;
        }

        public Buffer vui_num_ticks_poc_diff_one_minus1(@NativeType("uint32_t") int value) {
            StdVideoH265SequenceParameterSetVui.nvui_num_ticks_poc_diff_one_minus1(address(), value);
            return this;
        }

        public Buffer min_spatial_segmentation_idc(@NativeType("uint16_t") short value) {
            StdVideoH265SequenceParameterSetVui.nmin_spatial_segmentation_idc(address(), value);
            return this;
        }

        public Buffer max_bytes_per_pic_denom(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSetVui.nmax_bytes_per_pic_denom(address(), value);
            return this;
        }

        public Buffer max_bits_per_min_cu_denom(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSetVui.nmax_bits_per_min_cu_denom(address(), value);
            return this;
        }

        public Buffer log2_max_mv_length_horizontal(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_horizontal(address(), value);
            return this;
        }

        public Buffer log2_max_mv_length_vertical(@NativeType("uint8_t") byte value) {
            StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_vertical(address(), value);
            return this;
        }

        public Buffer pHrdParameters(@NativeType("StdVideoH265HrdParameters const *") StdVideoH265HrdParameters value) {
            StdVideoH265SequenceParameterSetVui.npHrdParameters(address(), value);
            return this;
        }
    }
}
