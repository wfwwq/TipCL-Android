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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeAV1PictureInfo.class */
public class StdVideoDecodeAV1PictureInfo extends Struct<StdVideoDecodeAV1PictureInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int FRAME_TYPE;
    public static final int CURRENT_FRAME_ID;
    public static final int ORDERHINT;
    public static final int PRIMARY_REF_FRAME;
    public static final int REFRESH_FRAME_FLAGS;
    public static final int RESERVED1;
    public static final int INTERPOLATION_FILTER;
    public static final int TXMODE;
    public static final int DELTA_Q_RES;
    public static final int DELTA_LF_RES;
    public static final int SKIPMODEFRAME;
    public static final int CODED_DENOM;
    public static final int RESERVED2;
    public static final int ORDERHINTS;
    public static final int EXPECTEDFRAMEID;
    public static final int PTILEINFO;
    public static final int PQUANTIZATION;
    public static final int PSEGMENTATION;
    public static final int PLOOPFILTER;
    public static final int PCDEF;
    public static final int PLOOPRESTORATION;
    public static final int PGLOBALMOTION;
    public static final int PFILMGRAIN;

    static {
        Struct.Layout layout = __struct(__member(StdVideoDecodeAV1PictureInfoFlags.SIZEOF, StdVideoDecodeAV1PictureInfoFlags.ALIGNOF), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(4), __member(4), __member(1), __member(1), __array(1, 2), __member(1), __array(1, 3), __array(1, 8), __array(4, 8), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        FRAME_TYPE = layout.offsetof(1);
        CURRENT_FRAME_ID = layout.offsetof(2);
        ORDERHINT = layout.offsetof(3);
        PRIMARY_REF_FRAME = layout.offsetof(4);
        REFRESH_FRAME_FLAGS = layout.offsetof(5);
        RESERVED1 = layout.offsetof(6);
        INTERPOLATION_FILTER = layout.offsetof(7);
        TXMODE = layout.offsetof(8);
        DELTA_Q_RES = layout.offsetof(9);
        DELTA_LF_RES = layout.offsetof(10);
        SKIPMODEFRAME = layout.offsetof(11);
        CODED_DENOM = layout.offsetof(12);
        RESERVED2 = layout.offsetof(13);
        ORDERHINTS = layout.offsetof(14);
        EXPECTEDFRAMEID = layout.offsetof(15);
        PTILEINFO = layout.offsetof(16);
        PQUANTIZATION = layout.offsetof(17);
        PSEGMENTATION = layout.offsetof(18);
        PLOOPFILTER = layout.offsetof(19);
        PCDEF = layout.offsetof(20);
        PLOOPRESTORATION = layout.offsetof(21);
        PGLOBALMOTION = layout.offsetof(22);
        PFILMGRAIN = layout.offsetof(23);
    }

    protected StdVideoDecodeAV1PictureInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeAV1PictureInfo create(long address, ByteBuffer container) {
        return new StdVideoDecodeAV1PictureInfo(address, container);
    }

    public StdVideoDecodeAV1PictureInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoDecodeAV1PictureInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoAV1FrameType")
    public int frame_type() {
        return nframe_type(address());
    }

    @NativeType("uint32_t")
    public int current_frame_id() {
        return ncurrent_frame_id(address());
    }

    @NativeType("uint8_t")
    public byte OrderHint() {
        return nOrderHint(address());
    }

    @NativeType("uint8_t")
    public byte primary_ref_frame() {
        return nprimary_ref_frame(address());
    }

    @NativeType("uint8_t")
    public byte refresh_frame_flags() {
        return nrefresh_frame_flags(address());
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

    @NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]")
    public ByteBuffer SkipModeFrame() {
        return nSkipModeFrame(address());
    }

    @NativeType("uint8_t")
    public byte SkipModeFrame(int index) {
        return nSkipModeFrame(address(), index);
    }

    @NativeType("uint8_t")
    public byte coded_denom() {
        return ncoded_denom(address());
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public ByteBuffer OrderHints() {
        return nOrderHints(address());
    }

    @NativeType("uint8_t")
    public byte OrderHints(int index) {
        return nOrderHints(address(), index);
    }

    @NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public IntBuffer expectedFrameId() {
        return nexpectedFrameId(address());
    }

    @NativeType("uint32_t")
    public int expectedFrameId(int index) {
        return nexpectedFrameId(address(), index);
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

    @NativeType("StdVideoAV1FilmGrain const *")
    public StdVideoAV1FilmGrain pFilmGrain() {
        return npFilmGrain(address());
    }

    public StdVideoDecodeAV1PictureInfo flags(StdVideoDecodeAV1PictureInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo flags(Consumer<StdVideoDecodeAV1PictureInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoDecodeAV1PictureInfo frame_type(@NativeType("StdVideoAV1FrameType") int value) {
        nframe_type(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo current_frame_id(@NativeType("uint32_t") int value) {
        ncurrent_frame_id(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo OrderHint(@NativeType("uint8_t") byte value) {
        nOrderHint(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo primary_ref_frame(@NativeType("uint8_t") byte value) {
        nprimary_ref_frame(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo refresh_frame_flags(@NativeType("uint8_t") byte value) {
        nrefresh_frame_flags(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo interpolation_filter(@NativeType("StdVideoAV1InterpolationFilter") int value) {
        ninterpolation_filter(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo TxMode(@NativeType("StdVideoAV1TxMode") int value) {
        nTxMode(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo delta_q_res(@NativeType("uint8_t") byte value) {
        ndelta_q_res(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo delta_lf_res(@NativeType("uint8_t") byte value) {
        ndelta_lf_res(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo SkipModeFrame(@NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]") ByteBuffer value) {
        nSkipModeFrame(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo SkipModeFrame(int index, @NativeType("uint8_t") byte value) {
        nSkipModeFrame(address(), index, value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo coded_denom(@NativeType("uint8_t") byte value) {
        ncoded_denom(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo OrderHints(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) {
        nOrderHints(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo OrderHints(int index, @NativeType("uint8_t") byte value) {
        nOrderHints(address(), index, value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo expectedFrameId(@NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") IntBuffer value) {
        nexpectedFrameId(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo expectedFrameId(int index, @NativeType("uint32_t") int value) {
        nexpectedFrameId(address(), index, value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo pTileInfo(@NativeType("StdVideoAV1TileInfo const *") StdVideoAV1TileInfo value) {
        npTileInfo(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo pQuantization(@NativeType("StdVideoAV1Quantization const *") StdVideoAV1Quantization value) {
        npQuantization(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo pSegmentation(@NativeType("StdVideoAV1Segmentation const *") StdVideoAV1Segmentation value) {
        npSegmentation(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo pLoopFilter(@NativeType("StdVideoAV1LoopFilter const *") StdVideoAV1LoopFilter value) {
        npLoopFilter(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo pCDEF(@NativeType("StdVideoAV1CDEF const *") StdVideoAV1CDEF value) {
        npCDEF(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo pLoopRestoration(@NativeType("StdVideoAV1LoopRestoration const *") StdVideoAV1LoopRestoration value) {
        npLoopRestoration(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo pGlobalMotion(@NativeType("StdVideoAV1GlobalMotion const *") StdVideoAV1GlobalMotion value) {
        npGlobalMotion(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo pFilmGrain(@NativeType("StdVideoAV1FilmGrain const *") StdVideoAV1FilmGrain value) {
        npFilmGrain(address(), value);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo set(StdVideoDecodeAV1PictureInfoFlags flags, int frame_type, int current_frame_id, byte OrderHint, byte primary_ref_frame, byte refresh_frame_flags, int interpolation_filter, int TxMode, byte delta_q_res, byte delta_lf_res, ByteBuffer SkipModeFrame, byte coded_denom, ByteBuffer OrderHints, IntBuffer expectedFrameId, StdVideoAV1TileInfo pTileInfo, StdVideoAV1Quantization pQuantization, StdVideoAV1Segmentation pSegmentation, StdVideoAV1LoopFilter pLoopFilter, StdVideoAV1CDEF pCDEF, StdVideoAV1LoopRestoration pLoopRestoration, StdVideoAV1GlobalMotion pGlobalMotion, StdVideoAV1FilmGrain pFilmGrain) {
        flags(flags);
        frame_type(frame_type);
        current_frame_id(current_frame_id);
        OrderHint(OrderHint);
        primary_ref_frame(primary_ref_frame);
        refresh_frame_flags(refresh_frame_flags);
        interpolation_filter(interpolation_filter);
        TxMode(TxMode);
        delta_q_res(delta_q_res);
        delta_lf_res(delta_lf_res);
        SkipModeFrame(SkipModeFrame);
        coded_denom(coded_denom);
        OrderHints(OrderHints);
        expectedFrameId(expectedFrameId);
        pTileInfo(pTileInfo);
        pQuantization(pQuantization);
        pSegmentation(pSegmentation);
        pLoopFilter(pLoopFilter);
        pCDEF(pCDEF);
        pLoopRestoration(pLoopRestoration);
        pGlobalMotion(pGlobalMotion);
        pFilmGrain(pFilmGrain);
        return this;
    }

    public StdVideoDecodeAV1PictureInfo set(StdVideoDecodeAV1PictureInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeAV1PictureInfo malloc() {
        return new StdVideoDecodeAV1PictureInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeAV1PictureInfo calloc() {
        return new StdVideoDecodeAV1PictureInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeAV1PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeAV1PictureInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeAV1PictureInfo create(long address) {
        return new StdVideoDecodeAV1PictureInfo(address, null);
    }

    public static StdVideoDecodeAV1PictureInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeAV1PictureInfo(address, null);
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

    public static StdVideoDecodeAV1PictureInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeAV1PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeAV1PictureInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeAV1PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoDecodeAV1PictureInfoFlags nflags(long struct) {
        return StdVideoDecodeAV1PictureInfoFlags.create(struct + FLAGS);
    }

    public static int nframe_type(long struct) {
        return MemoryUtil.memGetInt(struct + FRAME_TYPE);
    }

    public static int ncurrent_frame_id(long struct) {
        return MemoryUtil.memGetInt(struct + CURRENT_FRAME_ID);
    }

    public static byte nOrderHint(long struct) {
        return MemoryUtil.memGetByte(struct + ORDERHINT);
    }

    public static byte nprimary_ref_frame(long struct) {
        return MemoryUtil.memGetByte(struct + PRIMARY_REF_FRAME);
    }

    public static byte nrefresh_frame_flags(long struct) {
        return MemoryUtil.memGetByte(struct + REFRESH_FRAME_FLAGS);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
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

    public static ByteBuffer nSkipModeFrame(long struct) {
        return MemoryUtil.memByteBuffer(struct + SKIPMODEFRAME, 2);
    }

    public static byte nSkipModeFrame(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SKIPMODEFRAME + (Checks.check(index, 2) * 1));
    }

    public static byte ncoded_denom(long struct) {
        return MemoryUtil.memGetByte(struct + CODED_DENOM);
    }

    public static ByteBuffer nreserved2(long struct) {
        return MemoryUtil.memByteBuffer(struct + RESERVED2, 3);
    }

    public static byte nreserved2(long struct, int index) {
        return MemoryUtil.memGetByte(struct + RESERVED2 + (Checks.check(index, 3) * 1));
    }

    public static ByteBuffer nOrderHints(long struct) {
        return MemoryUtil.memByteBuffer(struct + ORDERHINTS, 8);
    }

    public static byte nOrderHints(long struct, int index) {
        return MemoryUtil.memGetByte(struct + ORDERHINTS + (Checks.check(index, 8) * 1));
    }

    public static IntBuffer nexpectedFrameId(long struct) {
        return MemoryUtil.memIntBuffer(struct + EXPECTEDFRAMEID, 8);
    }

    public static int nexpectedFrameId(long struct, int index) {
        return MemoryUtil.memGetInt(struct + EXPECTEDFRAMEID + (Checks.check(index, 8) * 4));
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

    public static StdVideoAV1FilmGrain npFilmGrain(long struct) {
        return StdVideoAV1FilmGrain.create(MemoryUtil.memGetAddress(struct + PFILMGRAIN));
    }

    public static void nflags(long struct, StdVideoDecodeAV1PictureInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoDecodeAV1PictureInfoFlags.SIZEOF);
    }

    public static void nframe_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAME_TYPE, value);
    }

    public static void ncurrent_frame_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + CURRENT_FRAME_ID, value);
    }

    public static void nOrderHint(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ORDERHINT, value);
    }

    public static void nprimary_ref_frame(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PRIMARY_REF_FRAME, value);
    }

    public static void nrefresh_frame_flags(long struct, byte value) {
        MemoryUtil.memPutByte(struct + REFRESH_FRAME_FLAGS, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
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

    public static void nSkipModeFrame(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SKIPMODEFRAME, value.remaining() * 1);
    }

    public static void nSkipModeFrame(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SKIPMODEFRAME + (Checks.check(index, 2) * 1), value);
    }

    public static void ncoded_denom(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CODED_DENOM, value);
    }

    public static void nreserved2(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESERVED2, value.remaining() * 1);
    }

    public static void nreserved2(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED2 + (Checks.check(index, 3) * 1), value);
    }

    public static void nOrderHints(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + ORDERHINTS, value.remaining() * 1);
    }

    public static void nOrderHints(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + ORDERHINTS + (Checks.check(index, 8) * 1), value);
    }

    public static void nexpectedFrameId(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + EXPECTEDFRAMEID, value.remaining() * 4);
    }

    public static void nexpectedFrameId(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + EXPECTEDFRAMEID + (Checks.check(index, 8) * 4), value);
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

    public static void npFilmGrain(long struct, StdVideoAV1FilmGrain value) {
        MemoryUtil.memPutAddress(struct + PFILMGRAIN, value.address());
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
        Checks.check(MemoryUtil.memGetAddress(struct + PFILMGRAIN));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeAV1PictureInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeAV1PictureInfo, Buffer> implements NativeResource {
        private static final StdVideoDecodeAV1PictureInfo ELEMENT_FACTORY = StdVideoDecodeAV1PictureInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeAV1PictureInfo.SIZEOF);
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
        public StdVideoDecodeAV1PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoDecodeAV1PictureInfoFlags flags() {
            return StdVideoDecodeAV1PictureInfo.nflags(address());
        }

        @NativeType("StdVideoAV1FrameType")
        public int frame_type() {
            return StdVideoDecodeAV1PictureInfo.nframe_type(address());
        }

        @NativeType("uint32_t")
        public int current_frame_id() {
            return StdVideoDecodeAV1PictureInfo.ncurrent_frame_id(address());
        }

        @NativeType("uint8_t")
        public byte OrderHint() {
            return StdVideoDecodeAV1PictureInfo.nOrderHint(address());
        }

        @NativeType("uint8_t")
        public byte primary_ref_frame() {
            return StdVideoDecodeAV1PictureInfo.nprimary_ref_frame(address());
        }

        @NativeType("uint8_t")
        public byte refresh_frame_flags() {
            return StdVideoDecodeAV1PictureInfo.nrefresh_frame_flags(address());
        }

        @NativeType("StdVideoAV1InterpolationFilter")
        public int interpolation_filter() {
            return StdVideoDecodeAV1PictureInfo.ninterpolation_filter(address());
        }

        @NativeType("StdVideoAV1TxMode")
        public int TxMode() {
            return StdVideoDecodeAV1PictureInfo.nTxMode(address());
        }

        @NativeType("uint8_t")
        public byte delta_q_res() {
            return StdVideoDecodeAV1PictureInfo.ndelta_q_res(address());
        }

        @NativeType("uint8_t")
        public byte delta_lf_res() {
            return StdVideoDecodeAV1PictureInfo.ndelta_lf_res(address());
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]")
        public ByteBuffer SkipModeFrame() {
            return StdVideoDecodeAV1PictureInfo.nSkipModeFrame(address());
        }

        @NativeType("uint8_t")
        public byte SkipModeFrame(int index) {
            return StdVideoDecodeAV1PictureInfo.nSkipModeFrame(address(), index);
        }

        @NativeType("uint8_t")
        public byte coded_denom() {
            return StdVideoDecodeAV1PictureInfo.ncoded_denom(address());
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public ByteBuffer OrderHints() {
            return StdVideoDecodeAV1PictureInfo.nOrderHints(address());
        }

        @NativeType("uint8_t")
        public byte OrderHints(int index) {
            return StdVideoDecodeAV1PictureInfo.nOrderHints(address(), index);
        }

        @NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public IntBuffer expectedFrameId() {
            return StdVideoDecodeAV1PictureInfo.nexpectedFrameId(address());
        }

        @NativeType("uint32_t")
        public int expectedFrameId(int index) {
            return StdVideoDecodeAV1PictureInfo.nexpectedFrameId(address(), index);
        }

        @NativeType("StdVideoAV1TileInfo const *")
        public StdVideoAV1TileInfo pTileInfo() {
            return StdVideoDecodeAV1PictureInfo.npTileInfo(address());
        }

        @NativeType("StdVideoAV1Quantization const *")
        public StdVideoAV1Quantization pQuantization() {
            return StdVideoDecodeAV1PictureInfo.npQuantization(address());
        }

        @NativeType("StdVideoAV1Segmentation const *")
        public StdVideoAV1Segmentation pSegmentation() {
            return StdVideoDecodeAV1PictureInfo.npSegmentation(address());
        }

        @NativeType("StdVideoAV1LoopFilter const *")
        public StdVideoAV1LoopFilter pLoopFilter() {
            return StdVideoDecodeAV1PictureInfo.npLoopFilter(address());
        }

        @NativeType("StdVideoAV1CDEF const *")
        public StdVideoAV1CDEF pCDEF() {
            return StdVideoDecodeAV1PictureInfo.npCDEF(address());
        }

        @NativeType("StdVideoAV1LoopRestoration const *")
        public StdVideoAV1LoopRestoration pLoopRestoration() {
            return StdVideoDecodeAV1PictureInfo.npLoopRestoration(address());
        }

        @NativeType("StdVideoAV1GlobalMotion const *")
        public StdVideoAV1GlobalMotion pGlobalMotion() {
            return StdVideoDecodeAV1PictureInfo.npGlobalMotion(address());
        }

        @NativeType("StdVideoAV1FilmGrain const *")
        public StdVideoAV1FilmGrain pFilmGrain() {
            return StdVideoDecodeAV1PictureInfo.npFilmGrain(address());
        }

        public Buffer flags(StdVideoDecodeAV1PictureInfoFlags value) {
            StdVideoDecodeAV1PictureInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoDecodeAV1PictureInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer frame_type(@NativeType("StdVideoAV1FrameType") int value) {
            StdVideoDecodeAV1PictureInfo.nframe_type(address(), value);
            return this;
        }

        public Buffer current_frame_id(@NativeType("uint32_t") int value) {
            StdVideoDecodeAV1PictureInfo.ncurrent_frame_id(address(), value);
            return this;
        }

        public Buffer OrderHint(@NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1PictureInfo.nOrderHint(address(), value);
            return this;
        }

        public Buffer primary_ref_frame(@NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1PictureInfo.nprimary_ref_frame(address(), value);
            return this;
        }

        public Buffer refresh_frame_flags(@NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1PictureInfo.nrefresh_frame_flags(address(), value);
            return this;
        }

        public Buffer interpolation_filter(@NativeType("StdVideoAV1InterpolationFilter") int value) {
            StdVideoDecodeAV1PictureInfo.ninterpolation_filter(address(), value);
            return this;
        }

        public Buffer TxMode(@NativeType("StdVideoAV1TxMode") int value) {
            StdVideoDecodeAV1PictureInfo.nTxMode(address(), value);
            return this;
        }

        public Buffer delta_q_res(@NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1PictureInfo.ndelta_q_res(address(), value);
            return this;
        }

        public Buffer delta_lf_res(@NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1PictureInfo.ndelta_lf_res(address(), value);
            return this;
        }

        public Buffer SkipModeFrame(@NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]") ByteBuffer value) {
            StdVideoDecodeAV1PictureInfo.nSkipModeFrame(address(), value);
            return this;
        }

        public Buffer SkipModeFrame(int index, @NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1PictureInfo.nSkipModeFrame(address(), index, value);
            return this;
        }

        public Buffer coded_denom(@NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1PictureInfo.ncoded_denom(address(), value);
            return this;
        }

        public Buffer OrderHints(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) {
            StdVideoDecodeAV1PictureInfo.nOrderHints(address(), value);
            return this;
        }

        public Buffer OrderHints(int index, @NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1PictureInfo.nOrderHints(address(), index, value);
            return this;
        }

        public Buffer expectedFrameId(@NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") IntBuffer value) {
            StdVideoDecodeAV1PictureInfo.nexpectedFrameId(address(), value);
            return this;
        }

        public Buffer expectedFrameId(int index, @NativeType("uint32_t") int value) {
            StdVideoDecodeAV1PictureInfo.nexpectedFrameId(address(), index, value);
            return this;
        }

        public Buffer pTileInfo(@NativeType("StdVideoAV1TileInfo const *") StdVideoAV1TileInfo value) {
            StdVideoDecodeAV1PictureInfo.npTileInfo(address(), value);
            return this;
        }

        public Buffer pQuantization(@NativeType("StdVideoAV1Quantization const *") StdVideoAV1Quantization value) {
            StdVideoDecodeAV1PictureInfo.npQuantization(address(), value);
            return this;
        }

        public Buffer pSegmentation(@NativeType("StdVideoAV1Segmentation const *") StdVideoAV1Segmentation value) {
            StdVideoDecodeAV1PictureInfo.npSegmentation(address(), value);
            return this;
        }

        public Buffer pLoopFilter(@NativeType("StdVideoAV1LoopFilter const *") StdVideoAV1LoopFilter value) {
            StdVideoDecodeAV1PictureInfo.npLoopFilter(address(), value);
            return this;
        }

        public Buffer pCDEF(@NativeType("StdVideoAV1CDEF const *") StdVideoAV1CDEF value) {
            StdVideoDecodeAV1PictureInfo.npCDEF(address(), value);
            return this;
        }

        public Buffer pLoopRestoration(@NativeType("StdVideoAV1LoopRestoration const *") StdVideoAV1LoopRestoration value) {
            StdVideoDecodeAV1PictureInfo.npLoopRestoration(address(), value);
            return this;
        }

        public Buffer pGlobalMotion(@NativeType("StdVideoAV1GlobalMotion const *") StdVideoAV1GlobalMotion value) {
            StdVideoDecodeAV1PictureInfo.npGlobalMotion(address(), value);
            return this;
        }

        public Buffer pFilmGrain(@NativeType("StdVideoAV1FilmGrain const *") StdVideoAV1FilmGrain value) {
            StdVideoDecodeAV1PictureInfo.npFilmGrain(address(), value);
            return this;
        }
    }
}
