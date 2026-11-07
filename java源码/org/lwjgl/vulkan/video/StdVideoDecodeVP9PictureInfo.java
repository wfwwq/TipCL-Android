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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeVP9PictureInfo.class */
public class StdVideoDecodeVP9PictureInfo extends Struct<StdVideoDecodeVP9PictureInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int PROFILE;
    public static final int FRAME_TYPE;
    public static final int FRAME_CONTEXT_IDX;
    public static final int RESET_FRAME_CONTEXT;
    public static final int REFRESH_FRAME_FLAGS;
    public static final int REF_FRAME_SIGN_BIAS_MASK;
    public static final int INTERPOLATION_FILTER;
    public static final int BASE_Q_IDX;
    public static final int DELTA_Q_Y_DC;
    public static final int DELTA_Q_UV_DC;
    public static final int DELTA_Q_UV_AC;
    public static final int TILE_COLS_LOG2;
    public static final int TILE_ROWS_LOG2;
    public static final int RESERVED1;
    public static final int PCOLORCONFIG;
    public static final int PLOOPFILTER;
    public static final int PSEGMENTATION;

    static {
        Struct.Layout layout = __struct(__member(StdVideoDecodeVP9PictureInfoFlags.SIZEOF, StdVideoDecodeVP9PictureInfoFlags.ALIGNOF), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(4), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __array(2, 3), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        PROFILE = layout.offsetof(1);
        FRAME_TYPE = layout.offsetof(2);
        FRAME_CONTEXT_IDX = layout.offsetof(3);
        RESET_FRAME_CONTEXT = layout.offsetof(4);
        REFRESH_FRAME_FLAGS = layout.offsetof(5);
        REF_FRAME_SIGN_BIAS_MASK = layout.offsetof(6);
        INTERPOLATION_FILTER = layout.offsetof(7);
        BASE_Q_IDX = layout.offsetof(8);
        DELTA_Q_Y_DC = layout.offsetof(9);
        DELTA_Q_UV_DC = layout.offsetof(10);
        DELTA_Q_UV_AC = layout.offsetof(11);
        TILE_COLS_LOG2 = layout.offsetof(12);
        TILE_ROWS_LOG2 = layout.offsetof(13);
        RESERVED1 = layout.offsetof(14);
        PCOLORCONFIG = layout.offsetof(15);
        PLOOPFILTER = layout.offsetof(16);
        PSEGMENTATION = layout.offsetof(17);
    }

    protected StdVideoDecodeVP9PictureInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeVP9PictureInfo create(long address, ByteBuffer container) {
        return new StdVideoDecodeVP9PictureInfo(address, container);
    }

    public StdVideoDecodeVP9PictureInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoDecodeVP9PictureInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoVP9Profile")
    public int profile() {
        return nprofile(address());
    }

    @NativeType("StdVideoVP9FrameType")
    public int frame_type() {
        return nframe_type(address());
    }

    @NativeType("uint8_t")
    public byte frame_context_idx() {
        return nframe_context_idx(address());
    }

    @NativeType("uint8_t")
    public byte reset_frame_context() {
        return nreset_frame_context(address());
    }

    @NativeType("uint8_t")
    public byte refresh_frame_flags() {
        return nrefresh_frame_flags(address());
    }

    @NativeType("uint8_t")
    public byte ref_frame_sign_bias_mask() {
        return nref_frame_sign_bias_mask(address());
    }

    @NativeType("StdVideoVP9InterpolationFilter")
    public int interpolation_filter() {
        return ninterpolation_filter(address());
    }

    @NativeType("uint8_t")
    public byte base_q_idx() {
        return nbase_q_idx(address());
    }

    @NativeType("int8_t")
    public byte delta_q_y_dc() {
        return ndelta_q_y_dc(address());
    }

    @NativeType("int8_t")
    public byte delta_q_uv_dc() {
        return ndelta_q_uv_dc(address());
    }

    @NativeType("int8_t")
    public byte delta_q_uv_ac() {
        return ndelta_q_uv_ac(address());
    }

    @NativeType("uint8_t")
    public byte tile_cols_log2() {
        return ntile_cols_log2(address());
    }

    @NativeType("uint8_t")
    public byte tile_rows_log2() {
        return ntile_rows_log2(address());
    }

    @NativeType("StdVideoVP9ColorConfig const *")
    public StdVideoVP9ColorConfig pColorConfig() {
        return npColorConfig(address());
    }

    @NativeType("StdVideoVP9LoopFilter const *")
    public StdVideoVP9LoopFilter pLoopFilter() {
        return npLoopFilter(address());
    }

    @NativeType("StdVideoVP9Segmentation const *")
    public StdVideoVP9Segmentation pSegmentation() {
        return npSegmentation(address());
    }

    public StdVideoDecodeVP9PictureInfo flags(StdVideoDecodeVP9PictureInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo flags(Consumer<StdVideoDecodeVP9PictureInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoDecodeVP9PictureInfo profile(@NativeType("StdVideoVP9Profile") int value) {
        nprofile(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo frame_type(@NativeType("StdVideoVP9FrameType") int value) {
        nframe_type(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo frame_context_idx(@NativeType("uint8_t") byte value) {
        nframe_context_idx(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo reset_frame_context(@NativeType("uint8_t") byte value) {
        nreset_frame_context(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo refresh_frame_flags(@NativeType("uint8_t") byte value) {
        nrefresh_frame_flags(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo ref_frame_sign_bias_mask(@NativeType("uint8_t") byte value) {
        nref_frame_sign_bias_mask(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo interpolation_filter(@NativeType("StdVideoVP9InterpolationFilter") int value) {
        ninterpolation_filter(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo base_q_idx(@NativeType("uint8_t") byte value) {
        nbase_q_idx(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo delta_q_y_dc(@NativeType("int8_t") byte value) {
        ndelta_q_y_dc(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo delta_q_uv_dc(@NativeType("int8_t") byte value) {
        ndelta_q_uv_dc(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo delta_q_uv_ac(@NativeType("int8_t") byte value) {
        ndelta_q_uv_ac(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo tile_cols_log2(@NativeType("uint8_t") byte value) {
        ntile_cols_log2(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo tile_rows_log2(@NativeType("uint8_t") byte value) {
        ntile_rows_log2(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo pColorConfig(@NativeType("StdVideoVP9ColorConfig const *") StdVideoVP9ColorConfig value) {
        npColorConfig(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo pLoopFilter(@NativeType("StdVideoVP9LoopFilter const *") StdVideoVP9LoopFilter value) {
        npLoopFilter(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo pSegmentation(@NativeType("StdVideoVP9Segmentation const *") StdVideoVP9Segmentation value) {
        npSegmentation(address(), value);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo set(StdVideoDecodeVP9PictureInfoFlags flags, int profile, int frame_type, byte frame_context_idx, byte reset_frame_context, byte refresh_frame_flags, byte ref_frame_sign_bias_mask, int interpolation_filter, byte base_q_idx, byte delta_q_y_dc, byte delta_q_uv_dc, byte delta_q_uv_ac, byte tile_cols_log2, byte tile_rows_log2, StdVideoVP9ColorConfig pColorConfig, StdVideoVP9LoopFilter pLoopFilter, StdVideoVP9Segmentation pSegmentation) {
        flags(flags);
        profile(profile);
        frame_type(frame_type);
        frame_context_idx(frame_context_idx);
        reset_frame_context(reset_frame_context);
        refresh_frame_flags(refresh_frame_flags);
        ref_frame_sign_bias_mask(ref_frame_sign_bias_mask);
        interpolation_filter(interpolation_filter);
        base_q_idx(base_q_idx);
        delta_q_y_dc(delta_q_y_dc);
        delta_q_uv_dc(delta_q_uv_dc);
        delta_q_uv_ac(delta_q_uv_ac);
        tile_cols_log2(tile_cols_log2);
        tile_rows_log2(tile_rows_log2);
        pColorConfig(pColorConfig);
        pLoopFilter(pLoopFilter);
        pSegmentation(pSegmentation);
        return this;
    }

    public StdVideoDecodeVP9PictureInfo set(StdVideoDecodeVP9PictureInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeVP9PictureInfo malloc() {
        return new StdVideoDecodeVP9PictureInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeVP9PictureInfo calloc() {
        return new StdVideoDecodeVP9PictureInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeVP9PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeVP9PictureInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeVP9PictureInfo create(long address) {
        return new StdVideoDecodeVP9PictureInfo(address, null);
    }

    public static StdVideoDecodeVP9PictureInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeVP9PictureInfo(address, null);
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

    public static StdVideoDecodeVP9PictureInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeVP9PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeVP9PictureInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeVP9PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoDecodeVP9PictureInfoFlags nflags(long struct) {
        return StdVideoDecodeVP9PictureInfoFlags.create(struct + FLAGS);
    }

    public static int nprofile(long struct) {
        return MemoryUtil.memGetInt(struct + PROFILE);
    }

    public static int nframe_type(long struct) {
        return MemoryUtil.memGetInt(struct + FRAME_TYPE);
    }

    public static byte nframe_context_idx(long struct) {
        return MemoryUtil.memGetByte(struct + FRAME_CONTEXT_IDX);
    }

    public static byte nreset_frame_context(long struct) {
        return MemoryUtil.memGetByte(struct + RESET_FRAME_CONTEXT);
    }

    public static byte nrefresh_frame_flags(long struct) {
        return MemoryUtil.memGetByte(struct + REFRESH_FRAME_FLAGS);
    }

    public static byte nref_frame_sign_bias_mask(long struct) {
        return MemoryUtil.memGetByte(struct + REF_FRAME_SIGN_BIAS_MASK);
    }

    public static int ninterpolation_filter(long struct) {
        return MemoryUtil.memGetInt(struct + INTERPOLATION_FILTER);
    }

    public static byte nbase_q_idx(long struct) {
        return MemoryUtil.memGetByte(struct + BASE_Q_IDX);
    }

    public static byte ndelta_q_y_dc(long struct) {
        return MemoryUtil.memGetByte(struct + DELTA_Q_Y_DC);
    }

    public static byte ndelta_q_uv_dc(long struct) {
        return MemoryUtil.memGetByte(struct + DELTA_Q_UV_DC);
    }

    public static byte ndelta_q_uv_ac(long struct) {
        return MemoryUtil.memGetByte(struct + DELTA_Q_UV_AC);
    }

    public static byte ntile_cols_log2(long struct) {
        return MemoryUtil.memGetByte(struct + TILE_COLS_LOG2);
    }

    public static byte ntile_rows_log2(long struct) {
        return MemoryUtil.memGetByte(struct + TILE_ROWS_LOG2);
    }

    public static ShortBuffer nreserved1(long struct) {
        return MemoryUtil.memShortBuffer(struct + RESERVED1, 3);
    }

    public static short nreserved1(long struct, int index) {
        return MemoryUtil.memGetShort(struct + RESERVED1 + (Checks.check(index, 3) * 2));
    }

    public static StdVideoVP9ColorConfig npColorConfig(long struct) {
        return StdVideoVP9ColorConfig.create(MemoryUtil.memGetAddress(struct + PCOLORCONFIG));
    }

    public static StdVideoVP9LoopFilter npLoopFilter(long struct) {
        return StdVideoVP9LoopFilter.create(MemoryUtil.memGetAddress(struct + PLOOPFILTER));
    }

    public static StdVideoVP9Segmentation npSegmentation(long struct) {
        return StdVideoVP9Segmentation.create(MemoryUtil.memGetAddress(struct + PSEGMENTATION));
    }

    public static void nflags(long struct, StdVideoDecodeVP9PictureInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoDecodeVP9PictureInfoFlags.SIZEOF);
    }

    public static void nprofile(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROFILE, value);
    }

    public static void nframe_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAME_TYPE, value);
    }

    public static void nframe_context_idx(long struct, byte value) {
        MemoryUtil.memPutByte(struct + FRAME_CONTEXT_IDX, value);
    }

    public static void nreset_frame_context(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESET_FRAME_CONTEXT, value);
    }

    public static void nrefresh_frame_flags(long struct, byte value) {
        MemoryUtil.memPutByte(struct + REFRESH_FRAME_FLAGS, value);
    }

    public static void nref_frame_sign_bias_mask(long struct, byte value) {
        MemoryUtil.memPutByte(struct + REF_FRAME_SIGN_BIAS_MASK, value);
    }

    public static void ninterpolation_filter(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTERPOLATION_FILTER, value);
    }

    public static void nbase_q_idx(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BASE_Q_IDX, value);
    }

    public static void ndelta_q_y_dc(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_Q_Y_DC, value);
    }

    public static void ndelta_q_uv_dc(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_Q_UV_DC, value);
    }

    public static void ndelta_q_uv_ac(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_Q_UV_AC, value);
    }

    public static void ntile_cols_log2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TILE_COLS_LOG2, value);
    }

    public static void ntile_rows_log2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TILE_ROWS_LOG2, value);
    }

    public static void nreserved1(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESERVED1, value.remaining() * 2);
    }

    public static void nreserved1(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + RESERVED1 + (Checks.check(index, 3) * 2), value);
    }

    public static void npColorConfig(long struct, StdVideoVP9ColorConfig value) {
        MemoryUtil.memPutAddress(struct + PCOLORCONFIG, value.address());
    }

    public static void npLoopFilter(long struct, StdVideoVP9LoopFilter value) {
        MemoryUtil.memPutAddress(struct + PLOOPFILTER, value.address());
    }

    public static void npSegmentation(long struct, StdVideoVP9Segmentation value) {
        MemoryUtil.memPutAddress(struct + PSEGMENTATION, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PCOLORCONFIG));
        Checks.check(MemoryUtil.memGetAddress(struct + PLOOPFILTER));
        Checks.check(MemoryUtil.memGetAddress(struct + PSEGMENTATION));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeVP9PictureInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeVP9PictureInfo, Buffer> implements NativeResource {
        private static final StdVideoDecodeVP9PictureInfo ELEMENT_FACTORY = StdVideoDecodeVP9PictureInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeVP9PictureInfo.SIZEOF);
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
        public StdVideoDecodeVP9PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoDecodeVP9PictureInfoFlags flags() {
            return StdVideoDecodeVP9PictureInfo.nflags(address());
        }

        @NativeType("StdVideoVP9Profile")
        public int profile() {
            return StdVideoDecodeVP9PictureInfo.nprofile(address());
        }

        @NativeType("StdVideoVP9FrameType")
        public int frame_type() {
            return StdVideoDecodeVP9PictureInfo.nframe_type(address());
        }

        @NativeType("uint8_t")
        public byte frame_context_idx() {
            return StdVideoDecodeVP9PictureInfo.nframe_context_idx(address());
        }

        @NativeType("uint8_t")
        public byte reset_frame_context() {
            return StdVideoDecodeVP9PictureInfo.nreset_frame_context(address());
        }

        @NativeType("uint8_t")
        public byte refresh_frame_flags() {
            return StdVideoDecodeVP9PictureInfo.nrefresh_frame_flags(address());
        }

        @NativeType("uint8_t")
        public byte ref_frame_sign_bias_mask() {
            return StdVideoDecodeVP9PictureInfo.nref_frame_sign_bias_mask(address());
        }

        @NativeType("StdVideoVP9InterpolationFilter")
        public int interpolation_filter() {
            return StdVideoDecodeVP9PictureInfo.ninterpolation_filter(address());
        }

        @NativeType("uint8_t")
        public byte base_q_idx() {
            return StdVideoDecodeVP9PictureInfo.nbase_q_idx(address());
        }

        @NativeType("int8_t")
        public byte delta_q_y_dc() {
            return StdVideoDecodeVP9PictureInfo.ndelta_q_y_dc(address());
        }

        @NativeType("int8_t")
        public byte delta_q_uv_dc() {
            return StdVideoDecodeVP9PictureInfo.ndelta_q_uv_dc(address());
        }

        @NativeType("int8_t")
        public byte delta_q_uv_ac() {
            return StdVideoDecodeVP9PictureInfo.ndelta_q_uv_ac(address());
        }

        @NativeType("uint8_t")
        public byte tile_cols_log2() {
            return StdVideoDecodeVP9PictureInfo.ntile_cols_log2(address());
        }

        @NativeType("uint8_t")
        public byte tile_rows_log2() {
            return StdVideoDecodeVP9PictureInfo.ntile_rows_log2(address());
        }

        @NativeType("StdVideoVP9ColorConfig const *")
        public StdVideoVP9ColorConfig pColorConfig() {
            return StdVideoDecodeVP9PictureInfo.npColorConfig(address());
        }

        @NativeType("StdVideoVP9LoopFilter const *")
        public StdVideoVP9LoopFilter pLoopFilter() {
            return StdVideoDecodeVP9PictureInfo.npLoopFilter(address());
        }

        @NativeType("StdVideoVP9Segmentation const *")
        public StdVideoVP9Segmentation pSegmentation() {
            return StdVideoDecodeVP9PictureInfo.npSegmentation(address());
        }

        public Buffer flags(StdVideoDecodeVP9PictureInfoFlags value) {
            StdVideoDecodeVP9PictureInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoDecodeVP9PictureInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer profile(@NativeType("StdVideoVP9Profile") int value) {
            StdVideoDecodeVP9PictureInfo.nprofile(address(), value);
            return this;
        }

        public Buffer frame_type(@NativeType("StdVideoVP9FrameType") int value) {
            StdVideoDecodeVP9PictureInfo.nframe_type(address(), value);
            return this;
        }

        public Buffer frame_context_idx(@NativeType("uint8_t") byte value) {
            StdVideoDecodeVP9PictureInfo.nframe_context_idx(address(), value);
            return this;
        }

        public Buffer reset_frame_context(@NativeType("uint8_t") byte value) {
            StdVideoDecodeVP9PictureInfo.nreset_frame_context(address(), value);
            return this;
        }

        public Buffer refresh_frame_flags(@NativeType("uint8_t") byte value) {
            StdVideoDecodeVP9PictureInfo.nrefresh_frame_flags(address(), value);
            return this;
        }

        public Buffer ref_frame_sign_bias_mask(@NativeType("uint8_t") byte value) {
            StdVideoDecodeVP9PictureInfo.nref_frame_sign_bias_mask(address(), value);
            return this;
        }

        public Buffer interpolation_filter(@NativeType("StdVideoVP9InterpolationFilter") int value) {
            StdVideoDecodeVP9PictureInfo.ninterpolation_filter(address(), value);
            return this;
        }

        public Buffer base_q_idx(@NativeType("uint8_t") byte value) {
            StdVideoDecodeVP9PictureInfo.nbase_q_idx(address(), value);
            return this;
        }

        public Buffer delta_q_y_dc(@NativeType("int8_t") byte value) {
            StdVideoDecodeVP9PictureInfo.ndelta_q_y_dc(address(), value);
            return this;
        }

        public Buffer delta_q_uv_dc(@NativeType("int8_t") byte value) {
            StdVideoDecodeVP9PictureInfo.ndelta_q_uv_dc(address(), value);
            return this;
        }

        public Buffer delta_q_uv_ac(@NativeType("int8_t") byte value) {
            StdVideoDecodeVP9PictureInfo.ndelta_q_uv_ac(address(), value);
            return this;
        }

        public Buffer tile_cols_log2(@NativeType("uint8_t") byte value) {
            StdVideoDecodeVP9PictureInfo.ntile_cols_log2(address(), value);
            return this;
        }

        public Buffer tile_rows_log2(@NativeType("uint8_t") byte value) {
            StdVideoDecodeVP9PictureInfo.ntile_rows_log2(address(), value);
            return this;
        }

        public Buffer pColorConfig(@NativeType("StdVideoVP9ColorConfig const *") StdVideoVP9ColorConfig value) {
            StdVideoDecodeVP9PictureInfo.npColorConfig(address(), value);
            return this;
        }

        public Buffer pLoopFilter(@NativeType("StdVideoVP9LoopFilter const *") StdVideoVP9LoopFilter value) {
            StdVideoDecodeVP9PictureInfo.npLoopFilter(address(), value);
            return this;
        }

        public Buffer pSegmentation(@NativeType("StdVideoVP9Segmentation const *") StdVideoVP9Segmentation value) {
            StdVideoDecodeVP9PictureInfo.npSegmentation(address(), value);
            return this;
        }
    }
}
