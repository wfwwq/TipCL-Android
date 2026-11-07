package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSet.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSet.class */
public class StdVideoH264SequenceParameterSet extends Struct<StdVideoH264SequenceParameterSet> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int PROFILE_IDC;
    public static final int LEVEL_IDC;
    public static final int CHROMA_FORMAT_IDC;
    public static final int SEQ_PARAMETER_SET_ID;
    public static final int BIT_DEPTH_LUMA_MINUS8;
    public static final int BIT_DEPTH_CHROMA_MINUS8;
    public static final int LOG2_MAX_FRAME_NUM_MINUS4;
    public static final int PIC_ORDER_CNT_TYPE;
    public static final int OFFSET_FOR_NON_REF_PIC;
    public static final int OFFSET_FOR_TOP_TO_BOTTOM_FIELD;
    public static final int LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4;
    public static final int NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE;
    public static final int MAX_NUM_REF_FRAMES;
    public static final int RESERVED1;
    public static final int PIC_WIDTH_IN_MBS_MINUS1;
    public static final int PIC_HEIGHT_IN_MAP_UNITS_MINUS1;
    public static final int FRAME_CROP_LEFT_OFFSET;
    public static final int FRAME_CROP_RIGHT_OFFSET;
    public static final int FRAME_CROP_TOP_OFFSET;
    public static final int FRAME_CROP_BOTTOM_OFFSET;
    public static final int RESERVED2;
    public static final int POFFSETFORREFFRAME;
    public static final int PSCALINGLISTS;
    public static final int PSEQUENCEPARAMETERSETVUI;

    static {
        Struct.Layout layout = __struct(__member(StdVideoH264SpsFlags.SIZEOF, StdVideoH264SpsFlags.ALIGNOF), __member(4), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(4), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        PROFILE_IDC = layout.offsetof(1);
        LEVEL_IDC = layout.offsetof(2);
        CHROMA_FORMAT_IDC = layout.offsetof(3);
        SEQ_PARAMETER_SET_ID = layout.offsetof(4);
        BIT_DEPTH_LUMA_MINUS8 = layout.offsetof(5);
        BIT_DEPTH_CHROMA_MINUS8 = layout.offsetof(6);
        LOG2_MAX_FRAME_NUM_MINUS4 = layout.offsetof(7);
        PIC_ORDER_CNT_TYPE = layout.offsetof(8);
        OFFSET_FOR_NON_REF_PIC = layout.offsetof(9);
        OFFSET_FOR_TOP_TO_BOTTOM_FIELD = layout.offsetof(10);
        LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4 = layout.offsetof(11);
        NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE = layout.offsetof(12);
        MAX_NUM_REF_FRAMES = layout.offsetof(13);
        RESERVED1 = layout.offsetof(14);
        PIC_WIDTH_IN_MBS_MINUS1 = layout.offsetof(15);
        PIC_HEIGHT_IN_MAP_UNITS_MINUS1 = layout.offsetof(16);
        FRAME_CROP_LEFT_OFFSET = layout.offsetof(17);
        FRAME_CROP_RIGHT_OFFSET = layout.offsetof(18);
        FRAME_CROP_TOP_OFFSET = layout.offsetof(19);
        FRAME_CROP_BOTTOM_OFFSET = layout.offsetof(20);
        RESERVED2 = layout.offsetof(21);
        POFFSETFORREFFRAME = layout.offsetof(22);
        PSCALINGLISTS = layout.offsetof(23);
        PSEQUENCEPARAMETERSETVUI = layout.offsetof(24);
    }

    protected StdVideoH264SequenceParameterSet(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH264SequenceParameterSet create(long address, ByteBuffer container) {
        return new StdVideoH264SequenceParameterSet(address, container);
    }

    public StdVideoH264SequenceParameterSet(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoH264SpsFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH264ProfileIdc")
    public int profile_idc() {
        return nprofile_idc(address());
    }

    @NativeType("StdVideoH264LevelIdc")
    public int level_idc() {
        return nlevel_idc(address());
    }

    @NativeType("StdVideoH264ChromaFormatIdc")
    public int chroma_format_idc() {
        return nchroma_format_idc(address());
    }

    @NativeType("uint8_t")
    public byte seq_parameter_set_id() {
        return nseq_parameter_set_id(address());
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
    public byte log2_max_frame_num_minus4() {
        return nlog2_max_frame_num_minus4(address());
    }

    @NativeType("StdVideoH264PocType")
    public int pic_order_cnt_type() {
        return npic_order_cnt_type(address());
    }

    @NativeType("int32_t")
    public int offset_for_non_ref_pic() {
        return noffset_for_non_ref_pic(address());
    }

    @NativeType("int32_t")
    public int offset_for_top_to_bottom_field() {
        return noffset_for_top_to_bottom_field(address());
    }

    @NativeType("uint8_t")
    public byte log2_max_pic_order_cnt_lsb_minus4() {
        return nlog2_max_pic_order_cnt_lsb_minus4(address());
    }

    @NativeType("uint8_t")
    public byte num_ref_frames_in_pic_order_cnt_cycle() {
        return nnum_ref_frames_in_pic_order_cnt_cycle(address());
    }

    @NativeType("uint8_t")
    public byte max_num_ref_frames() {
        return nmax_num_ref_frames(address());
    }

    @NativeType("uint32_t")
    public int pic_width_in_mbs_minus1() {
        return npic_width_in_mbs_minus1(address());
    }

    @NativeType("uint32_t")
    public int pic_height_in_map_units_minus1() {
        return npic_height_in_map_units_minus1(address());
    }

    @NativeType("uint32_t")
    public int frame_crop_left_offset() {
        return nframe_crop_left_offset(address());
    }

    @NativeType("uint32_t")
    public int frame_crop_right_offset() {
        return nframe_crop_right_offset(address());
    }

    @NativeType("uint32_t")
    public int frame_crop_top_offset() {
        return nframe_crop_top_offset(address());
    }

    @NativeType("uint32_t")
    public int frame_crop_bottom_offset() {
        return nframe_crop_bottom_offset(address());
    }

    @NativeType("int32_t const *")
    public IntBuffer pOffsetForRefFrame() {
        return npOffsetForRefFrame(address());
    }

    @NativeType("StdVideoH264ScalingLists const *")
    public StdVideoH264ScalingLists pScalingLists() {
        return npScalingLists(address());
    }

    @NativeType("StdVideoH264SequenceParameterSetVui const *")
    public StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui() {
        return npSequenceParameterSetVui(address());
    }

    public StdVideoH264SequenceParameterSet flags(StdVideoH264SpsFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet flags(Consumer<StdVideoH264SpsFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoH264SequenceParameterSet profile_idc(@NativeType("StdVideoH264ProfileIdc") int value) {
        nprofile_idc(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet level_idc(@NativeType("StdVideoH264LevelIdc") int value) {
        nlevel_idc(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet chroma_format_idc(@NativeType("StdVideoH264ChromaFormatIdc") int value) {
        nchroma_format_idc(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet seq_parameter_set_id(@NativeType("uint8_t") byte value) {
        nseq_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet bit_depth_luma_minus8(@NativeType("uint8_t") byte value) {
        nbit_depth_luma_minus8(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet bit_depth_chroma_minus8(@NativeType("uint8_t") byte value) {
        nbit_depth_chroma_minus8(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet log2_max_frame_num_minus4(@NativeType("uint8_t") byte value) {
        nlog2_max_frame_num_minus4(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet pic_order_cnt_type(@NativeType("StdVideoH264PocType") int value) {
        npic_order_cnt_type(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet offset_for_non_ref_pic(@NativeType("int32_t") int value) {
        noffset_for_non_ref_pic(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet offset_for_top_to_bottom_field(@NativeType("int32_t") int value) {
        noffset_for_top_to_bottom_field(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(@NativeType("uint8_t") byte value) {
        nlog2_max_pic_order_cnt_lsb_minus4(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet num_ref_frames_in_pic_order_cnt_cycle(@NativeType("uint8_t") byte value) {
        nnum_ref_frames_in_pic_order_cnt_cycle(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet max_num_ref_frames(@NativeType("uint8_t") byte value) {
        nmax_num_ref_frames(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet pic_width_in_mbs_minus1(@NativeType("uint32_t") int value) {
        npic_width_in_mbs_minus1(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet pic_height_in_map_units_minus1(@NativeType("uint32_t") int value) {
        npic_height_in_map_units_minus1(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet frame_crop_left_offset(@NativeType("uint32_t") int value) {
        nframe_crop_left_offset(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet frame_crop_right_offset(@NativeType("uint32_t") int value) {
        nframe_crop_right_offset(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet frame_crop_top_offset(@NativeType("uint32_t") int value) {
        nframe_crop_top_offset(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet frame_crop_bottom_offset(@NativeType("uint32_t") int value) {
        nframe_crop_bottom_offset(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet pOffsetForRefFrame(@NativeType("int32_t const *") IntBuffer value) {
        npOffsetForRefFrame(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet pScalingLists(@NativeType("StdVideoH264ScalingLists const *") StdVideoH264ScalingLists value) {
        npScalingLists(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet pSequenceParameterSetVui(@NativeType("StdVideoH264SequenceParameterSetVui const *") StdVideoH264SequenceParameterSetVui value) {
        npSequenceParameterSetVui(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSet set(StdVideoH264SpsFlags flags, int profile_idc, int level_idc, int chroma_format_idc, byte seq_parameter_set_id, byte bit_depth_luma_minus8, byte bit_depth_chroma_minus8, byte log2_max_frame_num_minus4, int pic_order_cnt_type, int offset_for_non_ref_pic, int offset_for_top_to_bottom_field, byte log2_max_pic_order_cnt_lsb_minus4, byte num_ref_frames_in_pic_order_cnt_cycle, byte max_num_ref_frames, int pic_width_in_mbs_minus1, int pic_height_in_map_units_minus1, int frame_crop_left_offset, int frame_crop_right_offset, int frame_crop_top_offset, int frame_crop_bottom_offset, IntBuffer pOffsetForRefFrame, StdVideoH264ScalingLists pScalingLists, StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui) {
        flags(flags);
        profile_idc(profile_idc);
        level_idc(level_idc);
        chroma_format_idc(chroma_format_idc);
        seq_parameter_set_id(seq_parameter_set_id);
        bit_depth_luma_minus8(bit_depth_luma_minus8);
        bit_depth_chroma_minus8(bit_depth_chroma_minus8);
        log2_max_frame_num_minus4(log2_max_frame_num_minus4);
        pic_order_cnt_type(pic_order_cnt_type);
        offset_for_non_ref_pic(offset_for_non_ref_pic);
        offset_for_top_to_bottom_field(offset_for_top_to_bottom_field);
        log2_max_pic_order_cnt_lsb_minus4(log2_max_pic_order_cnt_lsb_minus4);
        num_ref_frames_in_pic_order_cnt_cycle(num_ref_frames_in_pic_order_cnt_cycle);
        max_num_ref_frames(max_num_ref_frames);
        pic_width_in_mbs_minus1(pic_width_in_mbs_minus1);
        pic_height_in_map_units_minus1(pic_height_in_map_units_minus1);
        frame_crop_left_offset(frame_crop_left_offset);
        frame_crop_right_offset(frame_crop_right_offset);
        frame_crop_top_offset(frame_crop_top_offset);
        frame_crop_bottom_offset(frame_crop_bottom_offset);
        pOffsetForRefFrame(pOffsetForRefFrame);
        pScalingLists(pScalingLists);
        pSequenceParameterSetVui(pSequenceParameterSetVui);
        return this;
    }

    public StdVideoH264SequenceParameterSet set(StdVideoH264SequenceParameterSet src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH264SequenceParameterSet malloc() {
        return new StdVideoH264SequenceParameterSet(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH264SequenceParameterSet calloc() {
        return new StdVideoH264SequenceParameterSet(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH264SequenceParameterSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH264SequenceParameterSet(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH264SequenceParameterSet create(long address) {
        return new StdVideoH264SequenceParameterSet(address, null);
    }

    public static StdVideoH264SequenceParameterSet createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH264SequenceParameterSet(address, null);
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

    public static StdVideoH264SequenceParameterSet malloc(MemoryStack stack) {
        return new StdVideoH264SequenceParameterSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH264SequenceParameterSet calloc(MemoryStack stack) {
        return new StdVideoH264SequenceParameterSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoH264SpsFlags nflags(long struct) {
        return StdVideoH264SpsFlags.create(struct + FLAGS);
    }

    public static int nprofile_idc(long struct) {
        return MemoryUtil.memGetInt(struct + PROFILE_IDC);
    }

    public static int nlevel_idc(long struct) {
        return MemoryUtil.memGetInt(struct + LEVEL_IDC);
    }

    public static int nchroma_format_idc(long struct) {
        return MemoryUtil.memGetInt(struct + CHROMA_FORMAT_IDC);
    }

    public static byte nseq_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + SEQ_PARAMETER_SET_ID);
    }

    public static byte nbit_depth_luma_minus8(long struct) {
        return MemoryUtil.memGetByte(struct + BIT_DEPTH_LUMA_MINUS8);
    }

    public static byte nbit_depth_chroma_minus8(long struct) {
        return MemoryUtil.memGetByte(struct + BIT_DEPTH_CHROMA_MINUS8);
    }

    public static byte nlog2_max_frame_num_minus4(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_MAX_FRAME_NUM_MINUS4);
    }

    public static int npic_order_cnt_type(long struct) {
        return MemoryUtil.memGetInt(struct + PIC_ORDER_CNT_TYPE);
    }

    public static int noffset_for_non_ref_pic(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET_FOR_NON_REF_PIC);
    }

    public static int noffset_for_top_to_bottom_field(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET_FOR_TOP_TO_BOTTOM_FIELD);
    }

    public static byte nlog2_max_pic_order_cnt_lsb_minus4(long struct) {
        return MemoryUtil.memGetByte(struct + LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4);
    }

    public static byte nnum_ref_frames_in_pic_order_cnt_cycle(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE);
    }

    public static byte nmax_num_ref_frames(long struct) {
        return MemoryUtil.memGetByte(struct + MAX_NUM_REF_FRAMES);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static int npic_width_in_mbs_minus1(long struct) {
        return MemoryUtil.memGetInt(struct + PIC_WIDTH_IN_MBS_MINUS1);
    }

    public static int npic_height_in_map_units_minus1(long struct) {
        return MemoryUtil.memGetInt(struct + PIC_HEIGHT_IN_MAP_UNITS_MINUS1);
    }

    public static int nframe_crop_left_offset(long struct) {
        return MemoryUtil.memGetInt(struct + FRAME_CROP_LEFT_OFFSET);
    }

    public static int nframe_crop_right_offset(long struct) {
        return MemoryUtil.memGetInt(struct + FRAME_CROP_RIGHT_OFFSET);
    }

    public static int nframe_crop_top_offset(long struct) {
        return MemoryUtil.memGetInt(struct + FRAME_CROP_TOP_OFFSET);
    }

    public static int nframe_crop_bottom_offset(long struct) {
        return MemoryUtil.memGetInt(struct + FRAME_CROP_BOTTOM_OFFSET);
    }

    public static int nreserved2(long struct) {
        return MemoryUtil.memGetInt(struct + RESERVED2);
    }

    public static IntBuffer npOffsetForRefFrame(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + POFFSETFORREFFRAME), Byte.toUnsignedInt(nnum_ref_frames_in_pic_order_cnt_cycle(struct)));
    }

    public static StdVideoH264ScalingLists npScalingLists(long struct) {
        return StdVideoH264ScalingLists.create(MemoryUtil.memGetAddress(struct + PSCALINGLISTS));
    }

    public static StdVideoH264SequenceParameterSetVui npSequenceParameterSetVui(long struct) {
        return StdVideoH264SequenceParameterSetVui.create(MemoryUtil.memGetAddress(struct + PSEQUENCEPARAMETERSETVUI));
    }

    public static void nflags(long struct, StdVideoH264SpsFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoH264SpsFlags.SIZEOF);
    }

    public static void nprofile_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROFILE_IDC, value);
    }

    public static void nlevel_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEVEL_IDC, value);
    }

    public static void nchroma_format_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + CHROMA_FORMAT_IDC, value);
    }

    public static void nseq_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SEQ_PARAMETER_SET_ID, value);
    }

    public static void nbit_depth_luma_minus8(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BIT_DEPTH_LUMA_MINUS8, value);
    }

    public static void nbit_depth_chroma_minus8(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BIT_DEPTH_CHROMA_MINUS8, value);
    }

    public static void nlog2_max_frame_num_minus4(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_MAX_FRAME_NUM_MINUS4, value);
    }

    public static void npic_order_cnt_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIC_ORDER_CNT_TYPE, value);
    }

    public static void noffset_for_non_ref_pic(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET_FOR_NON_REF_PIC, value);
    }

    public static void noffset_for_top_to_bottom_field(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET_FOR_TOP_TO_BOTTOM_FIELD, value);
    }

    public static void nlog2_max_pic_order_cnt_lsb_minus4(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4, value);
    }

    public static void nnum_ref_frames_in_pic_order_cnt_cycle(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE, value);
    }

    public static void nmax_num_ref_frames(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MAX_NUM_REF_FRAMES, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void npic_width_in_mbs_minus1(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIC_WIDTH_IN_MBS_MINUS1, value);
    }

    public static void npic_height_in_map_units_minus1(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIC_HEIGHT_IN_MAP_UNITS_MINUS1, value);
    }

    public static void nframe_crop_left_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAME_CROP_LEFT_OFFSET, value);
    }

    public static void nframe_crop_right_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAME_CROP_RIGHT_OFFSET, value);
    }

    public static void nframe_crop_top_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAME_CROP_TOP_OFFSET, value);
    }

    public static void nframe_crop_bottom_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAME_CROP_BOTTOM_OFFSET, value);
    }

    public static void nreserved2(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESERVED2, value);
    }

    public static void npOffsetForRefFrame(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + POFFSETFORREFFRAME, MemoryUtil.memAddressSafe(value));
        nnum_ref_frames_in_pic_order_cnt_cycle(struct, value == null ? (byte) 0 : (byte) value.remaining());
    }

    public static void npScalingLists(long struct, StdVideoH264ScalingLists value) {
        MemoryUtil.memPutAddress(struct + PSCALINGLISTS, value.address());
    }

    public static void npSequenceParameterSetVui(long struct, StdVideoH264SequenceParameterSetVui value) {
        MemoryUtil.memPutAddress(struct + PSEQUENCEPARAMETERSETVUI, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSCALINGLISTS));
        long pSequenceParameterSetVui = MemoryUtil.memGetAddress(struct + PSEQUENCEPARAMETERSETVUI);
        Checks.check(pSequenceParameterSetVui);
        StdVideoH264SequenceParameterSetVui.validate(pSequenceParameterSetVui);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSet$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSet$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH264SequenceParameterSet, Buffer> implements NativeResource {
        private static final StdVideoH264SequenceParameterSet ELEMENT_FACTORY = StdVideoH264SequenceParameterSet.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH264SequenceParameterSet.SIZEOF);
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
        public StdVideoH264SequenceParameterSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoH264SpsFlags flags() {
            return StdVideoH264SequenceParameterSet.nflags(address());
        }

        @NativeType("StdVideoH264ProfileIdc")
        public int profile_idc() {
            return StdVideoH264SequenceParameterSet.nprofile_idc(address());
        }

        @NativeType("StdVideoH264LevelIdc")
        public int level_idc() {
            return StdVideoH264SequenceParameterSet.nlevel_idc(address());
        }

        @NativeType("StdVideoH264ChromaFormatIdc")
        public int chroma_format_idc() {
            return StdVideoH264SequenceParameterSet.nchroma_format_idc(address());
        }

        @NativeType("uint8_t")
        public byte seq_parameter_set_id() {
            return StdVideoH264SequenceParameterSet.nseq_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte bit_depth_luma_minus8() {
            return StdVideoH264SequenceParameterSet.nbit_depth_luma_minus8(address());
        }

        @NativeType("uint8_t")
        public byte bit_depth_chroma_minus8() {
            return StdVideoH264SequenceParameterSet.nbit_depth_chroma_minus8(address());
        }

        @NativeType("uint8_t")
        public byte log2_max_frame_num_minus4() {
            return StdVideoH264SequenceParameterSet.nlog2_max_frame_num_minus4(address());
        }

        @NativeType("StdVideoH264PocType")
        public int pic_order_cnt_type() {
            return StdVideoH264SequenceParameterSet.npic_order_cnt_type(address());
        }

        @NativeType("int32_t")
        public int offset_for_non_ref_pic() {
            return StdVideoH264SequenceParameterSet.noffset_for_non_ref_pic(address());
        }

        @NativeType("int32_t")
        public int offset_for_top_to_bottom_field() {
            return StdVideoH264SequenceParameterSet.noffset_for_top_to_bottom_field(address());
        }

        @NativeType("uint8_t")
        public byte log2_max_pic_order_cnt_lsb_minus4() {
            return StdVideoH264SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(address());
        }

        @NativeType("uint8_t")
        public byte num_ref_frames_in_pic_order_cnt_cycle() {
            return StdVideoH264SequenceParameterSet.nnum_ref_frames_in_pic_order_cnt_cycle(address());
        }

        @NativeType("uint8_t")
        public byte max_num_ref_frames() {
            return StdVideoH264SequenceParameterSet.nmax_num_ref_frames(address());
        }

        @NativeType("uint32_t")
        public int pic_width_in_mbs_minus1() {
            return StdVideoH264SequenceParameterSet.npic_width_in_mbs_minus1(address());
        }

        @NativeType("uint32_t")
        public int pic_height_in_map_units_minus1() {
            return StdVideoH264SequenceParameterSet.npic_height_in_map_units_minus1(address());
        }

        @NativeType("uint32_t")
        public int frame_crop_left_offset() {
            return StdVideoH264SequenceParameterSet.nframe_crop_left_offset(address());
        }

        @NativeType("uint32_t")
        public int frame_crop_right_offset() {
            return StdVideoH264SequenceParameterSet.nframe_crop_right_offset(address());
        }

        @NativeType("uint32_t")
        public int frame_crop_top_offset() {
            return StdVideoH264SequenceParameterSet.nframe_crop_top_offset(address());
        }

        @NativeType("uint32_t")
        public int frame_crop_bottom_offset() {
            return StdVideoH264SequenceParameterSet.nframe_crop_bottom_offset(address());
        }

        @NativeType("int32_t const *")
        public IntBuffer pOffsetForRefFrame() {
            return StdVideoH264SequenceParameterSet.npOffsetForRefFrame(address());
        }

        @NativeType("StdVideoH264ScalingLists const *")
        public StdVideoH264ScalingLists pScalingLists() {
            return StdVideoH264SequenceParameterSet.npScalingLists(address());
        }

        @NativeType("StdVideoH264SequenceParameterSetVui const *")
        public StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui() {
            return StdVideoH264SequenceParameterSet.npSequenceParameterSetVui(address());
        }

        public Buffer flags(StdVideoH264SpsFlags value) {
            StdVideoH264SequenceParameterSet.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoH264SpsFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer profile_idc(@NativeType("StdVideoH264ProfileIdc") int value) {
            StdVideoH264SequenceParameterSet.nprofile_idc(address(), value);
            return this;
        }

        public Buffer level_idc(@NativeType("StdVideoH264LevelIdc") int value) {
            StdVideoH264SequenceParameterSet.nlevel_idc(address(), value);
            return this;
        }

        public Buffer chroma_format_idc(@NativeType("StdVideoH264ChromaFormatIdc") int value) {
            StdVideoH264SequenceParameterSet.nchroma_format_idc(address(), value);
            return this;
        }

        public Buffer seq_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSet.nseq_parameter_set_id(address(), value);
            return this;
        }

        public Buffer bit_depth_luma_minus8(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSet.nbit_depth_luma_minus8(address(), value);
            return this;
        }

        public Buffer bit_depth_chroma_minus8(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSet.nbit_depth_chroma_minus8(address(), value);
            return this;
        }

        public Buffer log2_max_frame_num_minus4(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSet.nlog2_max_frame_num_minus4(address(), value);
            return this;
        }

        public Buffer pic_order_cnt_type(@NativeType("StdVideoH264PocType") int value) {
            StdVideoH264SequenceParameterSet.npic_order_cnt_type(address(), value);
            return this;
        }

        public Buffer offset_for_non_ref_pic(@NativeType("int32_t") int value) {
            StdVideoH264SequenceParameterSet.noffset_for_non_ref_pic(address(), value);
            return this;
        }

        public Buffer offset_for_top_to_bottom_field(@NativeType("int32_t") int value) {
            StdVideoH264SequenceParameterSet.noffset_for_top_to_bottom_field(address(), value);
            return this;
        }

        public Buffer log2_max_pic_order_cnt_lsb_minus4(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(address(), value);
            return this;
        }

        public Buffer num_ref_frames_in_pic_order_cnt_cycle(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSet.nnum_ref_frames_in_pic_order_cnt_cycle(address(), value);
            return this;
        }

        public Buffer max_num_ref_frames(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSet.nmax_num_ref_frames(address(), value);
            return this;
        }

        public Buffer pic_width_in_mbs_minus1(@NativeType("uint32_t") int value) {
            StdVideoH264SequenceParameterSet.npic_width_in_mbs_minus1(address(), value);
            return this;
        }

        public Buffer pic_height_in_map_units_minus1(@NativeType("uint32_t") int value) {
            StdVideoH264SequenceParameterSet.npic_height_in_map_units_minus1(address(), value);
            return this;
        }

        public Buffer frame_crop_left_offset(@NativeType("uint32_t") int value) {
            StdVideoH264SequenceParameterSet.nframe_crop_left_offset(address(), value);
            return this;
        }

        public Buffer frame_crop_right_offset(@NativeType("uint32_t") int value) {
            StdVideoH264SequenceParameterSet.nframe_crop_right_offset(address(), value);
            return this;
        }

        public Buffer frame_crop_top_offset(@NativeType("uint32_t") int value) {
            StdVideoH264SequenceParameterSet.nframe_crop_top_offset(address(), value);
            return this;
        }

        public Buffer frame_crop_bottom_offset(@NativeType("uint32_t") int value) {
            StdVideoH264SequenceParameterSet.nframe_crop_bottom_offset(address(), value);
            return this;
        }

        public Buffer pOffsetForRefFrame(@NativeType("int32_t const *") IntBuffer value) {
            StdVideoH264SequenceParameterSet.npOffsetForRefFrame(address(), value);
            return this;
        }

        public Buffer pScalingLists(@NativeType("StdVideoH264ScalingLists const *") StdVideoH264ScalingLists value) {
            StdVideoH264SequenceParameterSet.npScalingLists(address(), value);
            return this;
        }

        public Buffer pSequenceParameterSetVui(@NativeType("StdVideoH264SequenceParameterSetVui const *") StdVideoH264SequenceParameterSetVui value) {
            StdVideoH264SequenceParameterSet.npSequenceParameterSetVui(address(), value);
            return this;
        }
    }
}
