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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1PictureInfo.class */
public class StdVideoEncodeAV1PictureInfo extends Struct<StdVideoEncodeAV1PictureInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int FRAME_TYPE;
    public static final int FRAME_PRESENTATION_TIME;
    public static final int CURRENT_FRAME_ID;
    public static final int ORDER_HINT;
    public static final int PRIMARY_REF_FRAME;
    public static final int REFRESH_FRAME_FLAGS;
    public static final int CODED_DENOM;
    public static final int RENDER_WIDTH_MINUS_1;
    public static final int RENDER_HEIGHT_MINUS_1;
    public static final int INTERPOLATION_FILTER;
    public static final int TXMODE;
    public static final int DELTA_Q_RES;
    public static final int DELTA_LF_RES;
    public static final int REF_ORDER_HINT;
    public static final int REF_FRAME_IDX;
    public static final int RESERVED1;
    public static final int DELTA_FRAME_ID_MINUS_1;
    public static final int PTILEINFO;
    public static final int PQUANTIZATION;
    public static final int PSEGMENTATION;
    public static final int PLOOPFILTER;
    public static final int PCDEF;
    public static final int PLOOPRESTORATION;
    public static final int PGLOBALMOTION;
    public static final int PEXTENSIONHEADER;
    public static final int PBUFFERREMOVALTIMES;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeAV1PictureInfoFlags.SIZEOF, StdVideoEncodeAV1PictureInfoFlags.ALIGNOF), __member(4), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(2), __member(2), __member(4), __member(4), __member(1), __member(1), __array(1, 8), __array(1, 7), __array(1, 3), __array(4, 7), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        FRAME_TYPE = layout.offsetof(1);
        FRAME_PRESENTATION_TIME = layout.offsetof(2);
        CURRENT_FRAME_ID = layout.offsetof(3);
        ORDER_HINT = layout.offsetof(4);
        PRIMARY_REF_FRAME = layout.offsetof(5);
        REFRESH_FRAME_FLAGS = layout.offsetof(6);
        CODED_DENOM = layout.offsetof(7);
        RENDER_WIDTH_MINUS_1 = layout.offsetof(8);
        RENDER_HEIGHT_MINUS_1 = layout.offsetof(9);
        INTERPOLATION_FILTER = layout.offsetof(10);
        TXMODE = layout.offsetof(11);
        DELTA_Q_RES = layout.offsetof(12);
        DELTA_LF_RES = layout.offsetof(13);
        REF_ORDER_HINT = layout.offsetof(14);
        REF_FRAME_IDX = layout.offsetof(15);
        RESERVED1 = layout.offsetof(16);
        DELTA_FRAME_ID_MINUS_1 = layout.offsetof(17);
        PTILEINFO = layout.offsetof(18);
        PQUANTIZATION = layout.offsetof(19);
        PSEGMENTATION = layout.offsetof(20);
        PLOOPFILTER = layout.offsetof(21);
        PCDEF = layout.offsetof(22);
        PLOOPRESTORATION = layout.offsetof(23);
        PGLOBALMOTION = layout.offsetof(24);
        PEXTENSIONHEADER = layout.offsetof(25);
        PBUFFERREMOVALTIMES = layout.offsetof(26);
    }

    protected StdVideoEncodeAV1PictureInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeAV1PictureInfo create(long address, ByteBuffer container) {
        return new StdVideoEncodeAV1PictureInfo(address, container);
    }

    public StdVideoEncodeAV1PictureInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeAV1PictureInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoAV1FrameType")
    public int frame_type() {
        return nframe_type(address());
    }

    @NativeType("uint32_t")
    public int frame_presentation_time() {
        return nframe_presentation_time(address());
    }

    @NativeType("uint32_t")
    public int current_frame_id() {
        return ncurrent_frame_id(address());
    }

    @NativeType("uint8_t")
    public byte order_hint() {
        return norder_hint(address());
    }

    @NativeType("uint8_t")
    public byte primary_ref_frame() {
        return nprimary_ref_frame(address());
    }

    @NativeType("uint8_t")
    public byte refresh_frame_flags() {
        return nrefresh_frame_flags(address());
    }

    @NativeType("uint8_t")
    public byte coded_denom() {
        return ncoded_denom(address());
    }

    @NativeType("uint16_t")
    public short render_width_minus_1() {
        return nrender_width_minus_1(address());
    }

    @NativeType("uint16_t")
    public short render_height_minus_1() {
        return nrender_height_minus_1(address());
    }

    @NativeType("StdVideoAV1InterpolationFilter")
    public int interpolation_filter() {
        return ninterpolation_filter(address());
    }

    @NativeType("StdVideoAV1TxMode")
    public int TxMode() {
        return nTxMode(address());
    }

    @NativeType("uint8_t")
    public byte delta_q_res() {
        return ndelta_q_res(address());
    }

    @NativeType("uint8_t")
    public byte delta_lf_res() {
        return ndelta_lf_res(address());
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public ByteBuffer ref_order_hint() {
        return nref_order_hint(address());
    }

    @NativeType("uint8_t")
    public byte ref_order_hint(int index) {
        return nref_order_hint(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_AV1_REFS_PER_FRAME]")
    public ByteBuffer ref_frame_idx() {
        return nref_frame_idx(address());
    }

    @NativeType("int8_t")
    public byte ref_frame_idx(int index) {
        return nref_frame_idx(address(), index);
    }

    @NativeType("uint32_t[STD_VIDEO_AV1_REFS_PER_FRAME]")
    public IntBuffer delta_frame_id_minus_1() {
        return ndelta_frame_id_minus_1(address());
    }

    @NativeType("uint32_t")
    public int delta_frame_id_minus_1(int index) {
        return ndelta_frame_id_minus_1(address(), index);
    }

    @NativeType("StdVideoAV1TileInfo const *")
    public StdVideoAV1TileInfo pTileInfo() {
        return npTileInfo(address());
    }

    @NativeType("StdVideoAV1Quantization const *")
    public StdVideoAV1Quantization pQuantization() {
        return npQuantization(address());
    }

    @NativeType("StdVideoAV1Segmentation const *")
    public StdVideoAV1Segmentation pSegmentation() {
        return npSegmentation(address());
    }

    @NativeType("StdVideoAV1LoopFilter const *")
    public StdVideoAV1LoopFilter pLoopFilter() {
        return npLoopFilter(address());
    }

    @NativeType("StdVideoAV1CDEF const *")
    public StdVideoAV1CDEF pCDEF() {
        return npCDEF(address());
    }

    @NativeType("StdVideoAV1LoopRestoration const *")
    public StdVideoAV1LoopRestoration pLoopRestoration() {
        return npLoopRestoration(address());
    }

    @NativeType("StdVideoAV1GlobalMotion const *")
    public StdVideoAV1GlobalMotion pGlobalMotion() {
        return npGlobalMotion(address());
    }

    @NativeType("StdVideoEncodeAV1ExtensionHeader const *")
    public StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
        return npExtensionHeader(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pBufferRemovalTimes(int capacity) {
        return npBufferRemovalTimes(address(), capacity);
    }

    public StdVideoEncodeAV1PictureInfo flags(StdVideoEncodeAV1PictureInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo flags(Consumer<StdVideoEncodeAV1PictureInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeAV1PictureInfo frame_type(@NativeType("StdVideoAV1FrameType") int value) {
        nframe_type(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo frame_presentation_time(@NativeType("uint32_t") int value) {
        nframe_presentation_time(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo current_frame_id(@NativeType("uint32_t") int value) {
        ncurrent_frame_id(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo order_hint(@NativeType("uint8_t") byte value) {
        norder_hint(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo primary_ref_frame(@NativeType("uint8_t") byte value) {
        nprimary_ref_frame(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo refresh_frame_flags(@NativeType("uint8_t") byte value) {
        nrefresh_frame_flags(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo coded_denom(@NativeType("uint8_t") byte value) {
        ncoded_denom(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo render_width_minus_1(@NativeType("uint16_t") short value) {
        nrender_width_minus_1(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo render_height_minus_1(@NativeType("uint16_t") short value) {
        nrender_height_minus_1(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo interpolation_filter(@NativeType("StdVideoAV1InterpolationFilter") int value) {
        ninterpolation_filter(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo TxMode(@NativeType("StdVideoAV1TxMode") int value) {
        nTxMode(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo delta_q_res(@NativeType("uint8_t") byte value) {
        ndelta_q_res(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo delta_lf_res(@NativeType("uint8_t") byte value) {
        ndelta_lf_res(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo ref_order_hint(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) {
        nref_order_hint(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo ref_order_hint(int index, @NativeType("uint8_t") byte value) {
        nref_order_hint(address(), index, value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo ref_frame_idx(@NativeType("int8_t[STD_VIDEO_AV1_REFS_PER_FRAME]") ByteBuffer value) {
        nref_frame_idx(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo ref_frame_idx(int index, @NativeType("int8_t") byte value) {
        nref_frame_idx(address(), index, value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo delta_frame_id_minus_1(@NativeType("uint32_t[STD_VIDEO_AV1_REFS_PER_FRAME]") IntBuffer value) {
        ndelta_frame_id_minus_1(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo delta_frame_id_minus_1(int index, @NativeType("uint32_t") int value) {
        ndelta_frame_id_minus_1(address(), index, value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo pTileInfo(@NativeType("StdVideoAV1TileInfo const *") StdVideoAV1TileInfo value) {
        npTileInfo(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo pQuantization(@NativeType("StdVideoAV1Quantization const *") StdVideoAV1Quantization value) {
        npQuantization(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo pSegmentation(@NativeType("StdVideoAV1Segmentation const *") StdVideoAV1Segmentation value) {
        npSegmentation(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo pLoopFilter(@NativeType("StdVideoAV1LoopFilter const *") StdVideoAV1LoopFilter value) {
        npLoopFilter(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo pCDEF(@NativeType("StdVideoAV1CDEF const *") StdVideoAV1CDEF value) {
        npCDEF(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo pLoopRestoration(@NativeType("StdVideoAV1LoopRestoration const *") StdVideoAV1LoopRestoration value) {
        npLoopRestoration(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo pGlobalMotion(@NativeType("StdVideoAV1GlobalMotion const *") StdVideoAV1GlobalMotion value) {
        npGlobalMotion(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo pExtensionHeader(@NativeType("StdVideoEncodeAV1ExtensionHeader const *") StdVideoEncodeAV1ExtensionHeader value) {
        npExtensionHeader(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo pBufferRemovalTimes(@NativeType("uint32_t const *") IntBuffer value) {
        npBufferRemovalTimes(address(), value);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo set(StdVideoEncodeAV1PictureInfoFlags flags, int frame_type, int frame_presentation_time, int current_frame_id, byte order_hint, byte primary_ref_frame, byte refresh_frame_flags, byte coded_denom, short render_width_minus_1, short render_height_minus_1, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, ByteBuffer ref_order_hint, ByteBuffer ref_frame_idx, IntBuffer delta_frame_id_minus_1, StdVideoAV1TileInfo pTileInfo, StdVideoAV1Quantization pQuantization, StdVideoAV1Segmentation pSegmentation, StdVideoAV1LoopFilter pLoopFilter, StdVideoAV1CDEF pCDEF, StdVideoAV1LoopRestoration pLoopRestoration, StdVideoAV1GlobalMotion pGlobalMotion, StdVideoEncodeAV1ExtensionHeader pExtensionHeader, IntBuffer pBufferRemovalTimes) {
        flags(flags);
        frame_type(frame_type);
        frame_presentation_time(frame_presentation_time);
        current_frame_id(current_frame_id);
        order_hint(order_hint);
        primary_ref_frame(primary_ref_frame);
        refresh_frame_flags(refresh_frame_flags);
        coded_denom(coded_denom);
        render_width_minus_1(render_width_minus_1);
        render_height_minus_1(render_height_minus_1);
        interpolation_filter(interpolation_filter);
        TxMode(TxMode);
        delta_q_res(delta_q_res);
        delta_lf_res(delta_lf_res);
        ref_order_hint(ref_order_hint);
        ref_frame_idx(ref_frame_idx);
        delta_frame_id_minus_1(delta_frame_id_minus_1);
        pTileInfo(pTileInfo);
        pQuantization(pQuantization);
        pSegmentation(pSegmentation);
        pLoopFilter(pLoopFilter);
        pCDEF(pCDEF);
        pLoopRestoration(pLoopRestoration);
        pGlobalMotion(pGlobalMotion);
        pExtensionHeader(pExtensionHeader);
        pBufferRemovalTimes(pBufferRemovalTimes);
        return this;
    }

    public StdVideoEncodeAV1PictureInfo set(StdVideoEncodeAV1PictureInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeAV1PictureInfo malloc() {
        return new StdVideoEncodeAV1PictureInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeAV1PictureInfo calloc() {
        return new StdVideoEncodeAV1PictureInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeAV1PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1PictureInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeAV1PictureInfo create(long address) {
        return new StdVideoEncodeAV1PictureInfo(address, null);
    }

    public static StdVideoEncodeAV1PictureInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeAV1PictureInfo(address, null);
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

    public static StdVideoEncodeAV1PictureInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeAV1PictureInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeAV1PictureInfoFlags nflags(long struct) {
        return StdVideoEncodeAV1PictureInfoFlags.create(struct + FLAGS);
    }

    public static int nframe_type(long struct) {
        return MemoryUtil.memGetInt(struct + FRAME_TYPE);
    }

    public static int nframe_presentation_time(long struct) {
        return MemoryUtil.memGetInt(struct + FRAME_PRESENTATION_TIME);
    }

    public static int ncurrent_frame_id(long struct) {
        return MemoryUtil.memGetInt(struct + CURRENT_FRAME_ID);
    }

    public static byte norder_hint(long struct) {
        return MemoryUtil.memGetByte(struct + ORDER_HINT);
    }

    public static byte nprimary_ref_frame(long struct) {
        return MemoryUtil.memGetByte(struct + PRIMARY_REF_FRAME);
    }

    public static byte nrefresh_frame_flags(long struct) {
        return MemoryUtil.memGetByte(struct + REFRESH_FRAME_FLAGS);
    }

    public static byte ncoded_denom(long struct) {
        return MemoryUtil.memGetByte(struct + CODED_DENOM);
    }

    public static short nrender_width_minus_1(long struct) {
        return MemoryUtil.memGetShort(struct + RENDER_WIDTH_MINUS_1);
    }

    public static short nrender_height_minus_1(long struct) {
        return MemoryUtil.memGetShort(struct + RENDER_HEIGHT_MINUS_1);
    }

    public static int ninterpolation_filter(long struct) {
        return MemoryUtil.memGetInt(struct + INTERPOLATION_FILTER);
    }

    public static int nTxMode(long struct) {
        return MemoryUtil.memGetInt(struct + TXMODE);
    }

    public static byte ndelta_q_res(long struct) {
        return MemoryUtil.memGetByte(struct + DELTA_Q_RES);
    }

    public static byte ndelta_lf_res(long struct) {
        return MemoryUtil.memGetByte(struct + DELTA_LF_RES);
    }

    public static ByteBuffer nref_order_hint(long struct) {
        return MemoryUtil.memByteBuffer(struct + REF_ORDER_HINT, 8);
    }

    public static byte nref_order_hint(long struct, int index) {
        return MemoryUtil.memGetByte(struct + REF_ORDER_HINT + (Checks.check(index, 8) * 1));
    }

    public static ByteBuffer nref_frame_idx(long struct) {
        return MemoryUtil.memByteBuffer(struct + REF_FRAME_IDX, 7);
    }

    public static byte nref_frame_idx(long struct, int index) {
        return MemoryUtil.memGetByte(struct + REF_FRAME_IDX + (Checks.check(index, 7) * 1));
    }

    public static ByteBuffer nreserved1(long struct) {
        return MemoryUtil.memByteBuffer(struct + RESERVED1, 3);
    }

    public static byte nreserved1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + RESERVED1 + (Checks.check(index, 3) * 1));
    }

    public static IntBuffer ndelta_frame_id_minus_1(long struct) {
        return MemoryUtil.memIntBuffer(struct + DELTA_FRAME_ID_MINUS_1, 7);
    }

    public static int ndelta_frame_id_minus_1(long struct, int index) {
        return MemoryUtil.memGetInt(struct + DELTA_FRAME_ID_MINUS_1 + (Checks.check(index, 7) * 4));
    }

    public static StdVideoAV1TileInfo npTileInfo(long struct) {
        return StdVideoAV1TileInfo.create(MemoryUtil.memGetAddress(struct + PTILEINFO));
    }

    public static StdVideoAV1Quantization npQuantization(long struct) {
        return StdVideoAV1Quantization.create(MemoryUtil.memGetAddress(struct + PQUANTIZATION));
    }

    public static StdVideoAV1Segmentation npSegmentation(long struct) {
        return StdVideoAV1Segmentation.create(MemoryUtil.memGetAddress(struct + PSEGMENTATION));
    }

    public static StdVideoAV1LoopFilter npLoopFilter(long struct) {
        return StdVideoAV1LoopFilter.create(MemoryUtil.memGetAddress(struct + PLOOPFILTER));
    }

    public static StdVideoAV1CDEF npCDEF(long struct) {
        return StdVideoAV1CDEF.create(MemoryUtil.memGetAddress(struct + PCDEF));
    }

    public static StdVideoAV1LoopRestoration npLoopRestoration(long struct) {
        return StdVideoAV1LoopRestoration.create(MemoryUtil.memGetAddress(struct + PLOOPRESTORATION));
    }

    public static StdVideoAV1GlobalMotion npGlobalMotion(long struct) {
        return StdVideoAV1GlobalMotion.create(MemoryUtil.memGetAddress(struct + PGLOBALMOTION));
    }

    public static StdVideoEncodeAV1ExtensionHeader npExtensionHeader(long struct) {
        return StdVideoEncodeAV1ExtensionHeader.create(MemoryUtil.memGetAddress(struct + PEXTENSIONHEADER));
    }

    public static IntBuffer npBufferRemovalTimes(long struct, int capacity) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PBUFFERREMOVALTIMES), capacity);
    }

    public static void nflags(long struct, StdVideoEncodeAV1PictureInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeAV1PictureInfoFlags.SIZEOF);
    }

    public static void nframe_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAME_TYPE, value);
    }

    public static void nframe_presentation_time(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAME_PRESENTATION_TIME, value);
    }

    public static void ncurrent_frame_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + CURRENT_FRAME_ID, value);
    }

    public static void norder_hint(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ORDER_HINT, value);
    }

    public static void nprimary_ref_frame(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PRIMARY_REF_FRAME, value);
    }

    public static void nrefresh_frame_flags(long struct, byte value) {
        MemoryUtil.memPutByte(struct + REFRESH_FRAME_FLAGS, value);
    }

    public static void ncoded_denom(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CODED_DENOM, value);
    }

    public static void nrender_width_minus_1(long struct, short value) {
        MemoryUtil.memPutShort(struct + RENDER_WIDTH_MINUS_1, value);
    }

    public static void nrender_height_minus_1(long struct, short value) {
        MemoryUtil.memPutShort(struct + RENDER_HEIGHT_MINUS_1, value);
    }

    public static void ninterpolation_filter(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTERPOLATION_FILTER, value);
    }

    public static void nTxMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + TXMODE, value);
    }

    public static void ndelta_q_res(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_Q_RES, value);
    }

    public static void ndelta_lf_res(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_LF_RES, value);
    }

    public static void nref_order_hint(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REF_ORDER_HINT, value.remaining() * 1);
    }

    public static void nref_order_hint(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + REF_ORDER_HINT + (Checks.check(index, 8) * 1), value);
    }

    public static void nref_frame_idx(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REF_FRAME_IDX, value.remaining() * 1);
    }

    public static void nref_frame_idx(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + REF_FRAME_IDX + (Checks.check(index, 7) * 1), value);
    }

    public static void nreserved1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESERVED1, value.remaining() * 1);
    }

    public static void nreserved1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1 + (Checks.check(index, 3) * 1), value);
    }

    public static void ndelta_frame_id_minus_1(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_FRAME_ID_MINUS_1, value.remaining() * 4);
    }

    public static void ndelta_frame_id_minus_1(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + DELTA_FRAME_ID_MINUS_1 + (Checks.check(index, 7) * 4), value);
    }

    public static void npTileInfo(long struct, StdVideoAV1TileInfo value) {
        MemoryUtil.memPutAddress(struct + PTILEINFO, value.address());
    }

    public static void npQuantization(long struct, StdVideoAV1Quantization value) {
        MemoryUtil.memPutAddress(struct + PQUANTIZATION, value.address());
    }

    public static void npSegmentation(long struct, StdVideoAV1Segmentation value) {
        MemoryUtil.memPutAddress(struct + PSEGMENTATION, value.address());
    }

    public static void npLoopFilter(long struct, StdVideoAV1LoopFilter value) {
        MemoryUtil.memPutAddress(struct + PLOOPFILTER, value.address());
    }

    public static void npCDEF(long struct, StdVideoAV1CDEF value) {
        MemoryUtil.memPutAddress(struct + PCDEF, value.address());
    }

    public static void npLoopRestoration(long struct, StdVideoAV1LoopRestoration value) {
        MemoryUtil.memPutAddress(struct + PLOOPRESTORATION, value.address());
    }

    public static void npGlobalMotion(long struct, StdVideoAV1GlobalMotion value) {
        MemoryUtil.memPutAddress(struct + PGLOBALMOTION, value.address());
    }

    public static void npExtensionHeader(long struct, StdVideoEncodeAV1ExtensionHeader value) {
        MemoryUtil.memPutAddress(struct + PEXTENSIONHEADER, value.address());
    }

    public static void npBufferRemovalTimes(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PBUFFERREMOVALTIMES, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        long pTileInfo = MemoryUtil.memGetAddress(struct + PTILEINFO);
        Checks.check(pTileInfo);
        StdVideoAV1TileInfo.validate(pTileInfo);
        Checks.check(MemoryUtil.memGetAddress(struct + PQUANTIZATION));
        Checks.check(MemoryUtil.memGetAddress(struct + PSEGMENTATION));
        Checks.check(MemoryUtil.memGetAddress(struct + PLOOPFILTER));
        Checks.check(MemoryUtil.memGetAddress(struct + PCDEF));
        Checks.check(MemoryUtil.memGetAddress(struct + PLOOPRESTORATION));
        Checks.check(MemoryUtil.memGetAddress(struct + PGLOBALMOTION));
        Checks.check(MemoryUtil.memGetAddress(struct + PEXTENSIONHEADER));
        Checks.check(MemoryUtil.memGetAddress(struct + PBUFFERREMOVALTIMES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1PictureInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1PictureInfo, Buffer> implements NativeResource {
        private static final StdVideoEncodeAV1PictureInfo ELEMENT_FACTORY = StdVideoEncodeAV1PictureInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeAV1PictureInfo.SIZEOF);
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
        public StdVideoEncodeAV1PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeAV1PictureInfoFlags flags() {
            return StdVideoEncodeAV1PictureInfo.nflags(address());
        }

        @NativeType("StdVideoAV1FrameType")
        public int frame_type() {
            return StdVideoEncodeAV1PictureInfo.nframe_type(address());
        }

        @NativeType("uint32_t")
        public int frame_presentation_time() {
            return StdVideoEncodeAV1PictureInfo.nframe_presentation_time(address());
        }

        @NativeType("uint32_t")
        public int current_frame_id() {
            return StdVideoEncodeAV1PictureInfo.ncurrent_frame_id(address());
        }

        @NativeType("uint8_t")
        public byte order_hint() {
            return StdVideoEncodeAV1PictureInfo.norder_hint(address());
        }

        @NativeType("uint8_t")
        public byte primary_ref_frame() {
            return StdVideoEncodeAV1PictureInfo.nprimary_ref_frame(address());
        }

        @NativeType("uint8_t")
        public byte refresh_frame_flags() {
            return StdVideoEncodeAV1PictureInfo.nrefresh_frame_flags(address());
        }

        @NativeType("uint8_t")
        public byte coded_denom() {
            return StdVideoEncodeAV1PictureInfo.ncoded_denom(address());
        }

        @NativeType("uint16_t")
        public short render_width_minus_1() {
            return StdVideoEncodeAV1PictureInfo.nrender_width_minus_1(address());
        }

        @NativeType("uint16_t")
        public short render_height_minus_1() {
            return StdVideoEncodeAV1PictureInfo.nrender_height_minus_1(address());
        }

        @NativeType("StdVideoAV1InterpolationFilter")
        public int interpolation_filter() {
            return StdVideoEncodeAV1PictureInfo.ninterpolation_filter(address());
        }

        @NativeType("StdVideoAV1TxMode")
        public int TxMode() {
            return StdVideoEncodeAV1PictureInfo.nTxMode(address());
        }

        @NativeType("uint8_t")
        public byte delta_q_res() {
            return StdVideoEncodeAV1PictureInfo.ndelta_q_res(address());
        }

        @NativeType("uint8_t")
        public byte delta_lf_res() {
            return StdVideoEncodeAV1PictureInfo.ndelta_lf_res(address());
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public ByteBuffer ref_order_hint() {
            return StdVideoEncodeAV1PictureInfo.nref_order_hint(address());
        }

        @NativeType("uint8_t")
        public byte ref_order_hint(int index) {
            return StdVideoEncodeAV1PictureInfo.nref_order_hint(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_AV1_REFS_PER_FRAME]")
        public ByteBuffer ref_frame_idx() {
            return StdVideoEncodeAV1PictureInfo.nref_frame_idx(address());
        }

        @NativeType("int8_t")
        public byte ref_frame_idx(int index) {
            return StdVideoEncodeAV1PictureInfo.nref_frame_idx(address(), index);
        }

        @NativeType("uint32_t[STD_VIDEO_AV1_REFS_PER_FRAME]")
        public IntBuffer delta_frame_id_minus_1() {
            return StdVideoEncodeAV1PictureInfo.ndelta_frame_id_minus_1(address());
        }

        @NativeType("uint32_t")
        public int delta_frame_id_minus_1(int index) {
            return StdVideoEncodeAV1PictureInfo.ndelta_frame_id_minus_1(address(), index);
        }

        @NativeType("StdVideoAV1TileInfo const *")
        public StdVideoAV1TileInfo pTileInfo() {
            return StdVideoEncodeAV1PictureInfo.npTileInfo(address());
        }

        @NativeType("StdVideoAV1Quantization const *")
        public StdVideoAV1Quantization pQuantization() {
            return StdVideoEncodeAV1PictureInfo.npQuantization(address());
        }

        @NativeType("StdVideoAV1Segmentation const *")
        public StdVideoAV1Segmentation pSegmentation() {
            return StdVideoEncodeAV1PictureInfo.npSegmentation(address());
        }

        @NativeType("StdVideoAV1LoopFilter const *")
        public StdVideoAV1LoopFilter pLoopFilter() {
            return StdVideoEncodeAV1PictureInfo.npLoopFilter(address());
        }

        @NativeType("StdVideoAV1CDEF const *")
        public StdVideoAV1CDEF pCDEF() {
            return StdVideoEncodeAV1PictureInfo.npCDEF(address());
        }

        @NativeType("StdVideoAV1LoopRestoration const *")
        public StdVideoAV1LoopRestoration pLoopRestoration() {
            return StdVideoEncodeAV1PictureInfo.npLoopRestoration(address());
        }

        @NativeType("StdVideoAV1GlobalMotion const *")
        public StdVideoAV1GlobalMotion pGlobalMotion() {
            return StdVideoEncodeAV1PictureInfo.npGlobalMotion(address());
        }

        @NativeType("StdVideoEncodeAV1ExtensionHeader const *")
        public StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
            return StdVideoEncodeAV1PictureInfo.npExtensionHeader(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pBufferRemovalTimes(int capacity) {
            return StdVideoEncodeAV1PictureInfo.npBufferRemovalTimes(address(), capacity);
        }

        public Buffer flags(StdVideoEncodeAV1PictureInfoFlags value) {
            StdVideoEncodeAV1PictureInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeAV1PictureInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer frame_type(@NativeType("StdVideoAV1FrameType") int value) {
            StdVideoEncodeAV1PictureInfo.nframe_type(address(), value);
            return this;
        }

        public Buffer frame_presentation_time(@NativeType("uint32_t") int value) {
            StdVideoEncodeAV1PictureInfo.nframe_presentation_time(address(), value);
            return this;
        }

        public Buffer current_frame_id(@NativeType("uint32_t") int value) {
            StdVideoEncodeAV1PictureInfo.ncurrent_frame_id(address(), value);
            return this;
        }

        public Buffer order_hint(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1PictureInfo.norder_hint(address(), value);
            return this;
        }

        public Buffer primary_ref_frame(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1PictureInfo.nprimary_ref_frame(address(), value);
            return this;
        }

        public Buffer refresh_frame_flags(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1PictureInfo.nrefresh_frame_flags(address(), value);
            return this;
        }

        public Buffer coded_denom(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1PictureInfo.ncoded_denom(address(), value);
            return this;
        }

        public Buffer render_width_minus_1(@NativeType("uint16_t") short value) {
            StdVideoEncodeAV1PictureInfo.nrender_width_minus_1(address(), value);
            return this;
        }

        public Buffer render_height_minus_1(@NativeType("uint16_t") short value) {
            StdVideoEncodeAV1PictureInfo.nrender_height_minus_1(address(), value);
            return this;
        }

        public Buffer interpolation_filter(@NativeType("StdVideoAV1InterpolationFilter") int value) {
            StdVideoEncodeAV1PictureInfo.ninterpolation_filter(address(), value);
            return this;
        }

        public Buffer TxMode(@NativeType("StdVideoAV1TxMode") int value) {
            StdVideoEncodeAV1PictureInfo.nTxMode(address(), value);
            return this;
        }

        public Buffer delta_q_res(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1PictureInfo.ndelta_q_res(address(), value);
            return this;
        }

        public Buffer delta_lf_res(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1PictureInfo.ndelta_lf_res(address(), value);
            return this;
        }

        public Buffer ref_order_hint(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) {
            StdVideoEncodeAV1PictureInfo.nref_order_hint(address(), value);
            return this;
        }

        public Buffer ref_order_hint(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1PictureInfo.nref_order_hint(address(), index, value);
            return this;
        }

        public Buffer ref_frame_idx(@NativeType("int8_t[STD_VIDEO_AV1_REFS_PER_FRAME]") ByteBuffer value) {
            StdVideoEncodeAV1PictureInfo.nref_frame_idx(address(), value);
            return this;
        }

        public Buffer ref_frame_idx(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeAV1PictureInfo.nref_frame_idx(address(), index, value);
            return this;
        }

        public Buffer delta_frame_id_minus_1(@NativeType("uint32_t[STD_VIDEO_AV1_REFS_PER_FRAME]") IntBuffer value) {
            StdVideoEncodeAV1PictureInfo.ndelta_frame_id_minus_1(address(), value);
            return this;
        }

        public Buffer delta_frame_id_minus_1(int index, @NativeType("uint32_t") int value) {
            StdVideoEncodeAV1PictureInfo.ndelta_frame_id_minus_1(address(), index, value);
            return this;
        }

        public Buffer pTileInfo(@NativeType("StdVideoAV1TileInfo const *") StdVideoAV1TileInfo value) {
            StdVideoEncodeAV1PictureInfo.npTileInfo(address(), value);
            return this;
        }

        public Buffer pQuantization(@NativeType("StdVideoAV1Quantization const *") StdVideoAV1Quantization value) {
            StdVideoEncodeAV1PictureInfo.npQuantization(address(), value);
            return this;
        }

        public Buffer pSegmentation(@NativeType("StdVideoAV1Segmentation const *") StdVideoAV1Segmentation value) {
            StdVideoEncodeAV1PictureInfo.npSegmentation(address(), value);
            return this;
        }

        public Buffer pLoopFilter(@NativeType("StdVideoAV1LoopFilter const *") StdVideoAV1LoopFilter value) {
            StdVideoEncodeAV1PictureInfo.npLoopFilter(address(), value);
            return this;
        }

        public Buffer pCDEF(@NativeType("StdVideoAV1CDEF const *") StdVideoAV1CDEF value) {
            StdVideoEncodeAV1PictureInfo.npCDEF(address(), value);
            return this;
        }

        public Buffer pLoopRestoration(@NativeType("StdVideoAV1LoopRestoration const *") StdVideoAV1LoopRestoration value) {
            StdVideoEncodeAV1PictureInfo.npLoopRestoration(address(), value);
            return this;
        }

        public Buffer pGlobalMotion(@NativeType("StdVideoAV1GlobalMotion const *") StdVideoAV1GlobalMotion value) {
            StdVideoEncodeAV1PictureInfo.npGlobalMotion(address(), value);
            return this;
        }

        public Buffer pExtensionHeader(@NativeType("StdVideoEncodeAV1ExtensionHeader const *") StdVideoEncodeAV1ExtensionHeader value) {
            StdVideoEncodeAV1PictureInfo.npExtensionHeader(address(), value);
            return this;
        }

        public Buffer pBufferRemovalTimes(@NativeType("uint32_t const *") IntBuffer value) {
            StdVideoEncodeAV1PictureInfo.npBufferRemovalTimes(address(), value);
            return this;
        }
    }
}
