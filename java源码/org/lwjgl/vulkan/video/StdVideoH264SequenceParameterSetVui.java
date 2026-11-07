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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSetVui.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSetVui.class */
public class StdVideoH264SequenceParameterSetVui extends Struct<StdVideoH264SequenceParameterSetVui> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int ASPECT_RATIO_IDC;
    public static final int SAR_WIDTH;
    public static final int SAR_HEIGHT;
    public static final int VIDEO_FORMAT;
    public static final int COLOUR_PRIMARIES;
    public static final int TRANSFER_CHARACTERISTICS;
    public static final int MATRIX_COEFFICIENTS;
    public static final int NUM_UNITS_IN_TICK;
    public static final int TIME_SCALE;
    public static final int MAX_NUM_REORDER_FRAMES;
    public static final int MAX_DEC_FRAME_BUFFERING;
    public static final int CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD;
    public static final int CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD;
    public static final int RESERVED1;
    public static final int PHRDPARAMETERS;

    static {
        Struct.Layout layout = __struct(__member(StdVideoH264SpsVuiFlags.SIZEOF, StdVideoH264SpsVuiFlags.ALIGNOF), __member(4), __member(2), __member(2), __member(1), __member(1), __member(1), __member(1), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        ASPECT_RATIO_IDC = layout.offsetof(1);
        SAR_WIDTH = layout.offsetof(2);
        SAR_HEIGHT = layout.offsetof(3);
        VIDEO_FORMAT = layout.offsetof(4);
        COLOUR_PRIMARIES = layout.offsetof(5);
        TRANSFER_CHARACTERISTICS = layout.offsetof(6);
        MATRIX_COEFFICIENTS = layout.offsetof(7);
        NUM_UNITS_IN_TICK = layout.offsetof(8);
        TIME_SCALE = layout.offsetof(9);
        MAX_NUM_REORDER_FRAMES = layout.offsetof(10);
        MAX_DEC_FRAME_BUFFERING = layout.offsetof(11);
        CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD = layout.offsetof(12);
        CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD = layout.offsetof(13);
        RESERVED1 = layout.offsetof(14);
        PHRDPARAMETERS = layout.offsetof(15);
    }

    protected StdVideoH264SequenceParameterSetVui(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH264SequenceParameterSetVui create(long address, ByteBuffer container) {
        return new StdVideoH264SequenceParameterSetVui(address, container);
    }

    public StdVideoH264SequenceParameterSetVui(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoH264SpsVuiFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH264AspectRatioIdc")
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
    public byte matrix_coefficients() {
        return nmatrix_coefficients(address());
    }

    @NativeType("uint32_t")
    public int num_units_in_tick() {
        return nnum_units_in_tick(address());
    }

    @NativeType("uint32_t")
    public int time_scale() {
        return ntime_scale(address());
    }

    @NativeType("uint8_t")
    public byte max_num_reorder_frames() {
        return nmax_num_reorder_frames(address());
    }

    @NativeType("uint8_t")
    public byte max_dec_frame_buffering() {
        return nmax_dec_frame_buffering(address());
    }

    @NativeType("uint8_t")
    public byte chroma_sample_loc_type_top_field() {
        return nchroma_sample_loc_type_top_field(address());
    }

    @NativeType("uint8_t")
    public byte chroma_sample_loc_type_bottom_field() {
        return nchroma_sample_loc_type_bottom_field(address());
    }

    @NativeType("StdVideoH264HrdParameters const *")
    public StdVideoH264HrdParameters pHrdParameters() {
        return npHrdParameters(address());
    }

    public StdVideoH264SequenceParameterSetVui flags(StdVideoH264SpsVuiFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui flags(Consumer<StdVideoH264SpsVuiFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoH264SequenceParameterSetVui aspect_ratio_idc(@NativeType("StdVideoH264AspectRatioIdc") int value) {
        naspect_ratio_idc(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui sar_width(@NativeType("uint16_t") short value) {
        nsar_width(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui sar_height(@NativeType("uint16_t") short value) {
        nsar_height(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui video_format(@NativeType("uint8_t") byte value) {
        nvideo_format(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui colour_primaries(@NativeType("uint8_t") byte value) {
        ncolour_primaries(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui transfer_characteristics(@NativeType("uint8_t") byte value) {
        ntransfer_characteristics(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui matrix_coefficients(@NativeType("uint8_t") byte value) {
        nmatrix_coefficients(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui num_units_in_tick(@NativeType("uint32_t") int value) {
        nnum_units_in_tick(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui time_scale(@NativeType("uint32_t") int value) {
        ntime_scale(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui max_num_reorder_frames(@NativeType("uint8_t") byte value) {
        nmax_num_reorder_frames(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui max_dec_frame_buffering(@NativeType("uint8_t") byte value) {
        nmax_dec_frame_buffering(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_top_field(@NativeType("uint8_t") byte value) {
        nchroma_sample_loc_type_top_field(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_bottom_field(@NativeType("uint8_t") byte value) {
        nchroma_sample_loc_type_bottom_field(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui pHrdParameters(@NativeType("StdVideoH264HrdParameters const *") StdVideoH264HrdParameters value) {
        npHrdParameters(address(), value);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui set(StdVideoH264SpsVuiFlags flags, int aspect_ratio_idc, short sar_width, short sar_height, byte video_format, byte colour_primaries, byte transfer_characteristics, byte matrix_coefficients, int num_units_in_tick, int time_scale, byte max_num_reorder_frames, byte max_dec_frame_buffering, byte chroma_sample_loc_type_top_field, byte chroma_sample_loc_type_bottom_field, StdVideoH264HrdParameters pHrdParameters) {
        flags(flags);
        aspect_ratio_idc(aspect_ratio_idc);
        sar_width(sar_width);
        sar_height(sar_height);
        video_format(video_format);
        colour_primaries(colour_primaries);
        transfer_characteristics(transfer_characteristics);
        matrix_coefficients(matrix_coefficients);
        num_units_in_tick(num_units_in_tick);
        time_scale(time_scale);
        max_num_reorder_frames(max_num_reorder_frames);
        max_dec_frame_buffering(max_dec_frame_buffering);
        chroma_sample_loc_type_top_field(chroma_sample_loc_type_top_field);
        chroma_sample_loc_type_bottom_field(chroma_sample_loc_type_bottom_field);
        pHrdParameters(pHrdParameters);
        return this;
    }

    public StdVideoH264SequenceParameterSetVui set(StdVideoH264SequenceParameterSetVui src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH264SequenceParameterSetVui malloc() {
        return new StdVideoH264SequenceParameterSetVui(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH264SequenceParameterSetVui calloc() {
        return new StdVideoH264SequenceParameterSetVui(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH264SequenceParameterSetVui create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH264SequenceParameterSetVui(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH264SequenceParameterSetVui create(long address) {
        return new StdVideoH264SequenceParameterSetVui(address, null);
    }

    public static StdVideoH264SequenceParameterSetVui createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH264SequenceParameterSetVui(address, null);
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

    public static StdVideoH264SequenceParameterSetVui malloc(MemoryStack stack) {
        return new StdVideoH264SequenceParameterSetVui(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH264SequenceParameterSetVui calloc(MemoryStack stack) {
        return new StdVideoH264SequenceParameterSetVui(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoH264SpsVuiFlags nflags(long struct) {
        return StdVideoH264SpsVuiFlags.create(struct + FLAGS);
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

    public static byte nmatrix_coefficients(long struct) {
        return MemoryUtil.memGetByte(struct + MATRIX_COEFFICIENTS);
    }

    public static int nnum_units_in_tick(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_UNITS_IN_TICK);
    }

    public static int ntime_scale(long struct) {
        return MemoryUtil.memGetInt(struct + TIME_SCALE);
    }

    public static byte nmax_num_reorder_frames(long struct) {
        return MemoryUtil.memGetByte(struct + MAX_NUM_REORDER_FRAMES);
    }

    public static byte nmax_dec_frame_buffering(long struct) {
        return MemoryUtil.memGetByte(struct + MAX_DEC_FRAME_BUFFERING);
    }

    public static byte nchroma_sample_loc_type_top_field(long struct) {
        return MemoryUtil.memGetByte(struct + CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD);
    }

    public static byte nchroma_sample_loc_type_bottom_field(long struct) {
        return MemoryUtil.memGetByte(struct + CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD);
    }

    public static int nreserved1(long struct) {
        return MemoryUtil.memGetInt(struct + RESERVED1);
    }

    public static StdVideoH264HrdParameters npHrdParameters(long struct) {
        return StdVideoH264HrdParameters.create(MemoryUtil.memGetAddress(struct + PHRDPARAMETERS));
    }

    public static void nflags(long struct, StdVideoH264SpsVuiFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoH264SpsVuiFlags.SIZEOF);
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

    public static void nmatrix_coefficients(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MATRIX_COEFFICIENTS, value);
    }

    public static void nnum_units_in_tick(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_UNITS_IN_TICK, value);
    }

    public static void ntime_scale(long struct, int value) {
        MemoryUtil.memPutInt(struct + TIME_SCALE, value);
    }

    public static void nmax_num_reorder_frames(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MAX_NUM_REORDER_FRAMES, value);
    }

    public static void nmax_dec_frame_buffering(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MAX_DEC_FRAME_BUFFERING, value);
    }

    public static void nchroma_sample_loc_type_top_field(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD, value);
    }

    public static void nchroma_sample_loc_type_bottom_field(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD, value);
    }

    public static void nreserved1(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESERVED1, value);
    }

    public static void npHrdParameters(long struct, StdVideoH264HrdParameters value) {
        MemoryUtil.memPutAddress(struct + PHRDPARAMETERS, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PHRDPARAMETERS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSetVui$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSetVui$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH264SequenceParameterSetVui, Buffer> implements NativeResource {
        private static final StdVideoH264SequenceParameterSetVui ELEMENT_FACTORY = StdVideoH264SequenceParameterSetVui.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH264SequenceParameterSetVui.SIZEOF);
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
        public StdVideoH264SequenceParameterSetVui getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoH264SpsVuiFlags flags() {
            return StdVideoH264SequenceParameterSetVui.nflags(address());
        }

        @NativeType("StdVideoH264AspectRatioIdc")
        public int aspect_ratio_idc() {
            return StdVideoH264SequenceParameterSetVui.naspect_ratio_idc(address());
        }

        @NativeType("uint16_t")
        public short sar_width() {
            return StdVideoH264SequenceParameterSetVui.nsar_width(address());
        }

        @NativeType("uint16_t")
        public short sar_height() {
            return StdVideoH264SequenceParameterSetVui.nsar_height(address());
        }

        @NativeType("uint8_t")
        public byte video_format() {
            return StdVideoH264SequenceParameterSetVui.nvideo_format(address());
        }

        @NativeType("uint8_t")
        public byte colour_primaries() {
            return StdVideoH264SequenceParameterSetVui.ncolour_primaries(address());
        }

        @NativeType("uint8_t")
        public byte transfer_characteristics() {
            return StdVideoH264SequenceParameterSetVui.ntransfer_characteristics(address());
        }

        @NativeType("uint8_t")
        public byte matrix_coefficients() {
            return StdVideoH264SequenceParameterSetVui.nmatrix_coefficients(address());
        }

        @NativeType("uint32_t")
        public int num_units_in_tick() {
            return StdVideoH264SequenceParameterSetVui.nnum_units_in_tick(address());
        }

        @NativeType("uint32_t")
        public int time_scale() {
            return StdVideoH264SequenceParameterSetVui.ntime_scale(address());
        }

        @NativeType("uint8_t")
        public byte max_num_reorder_frames() {
            return StdVideoH264SequenceParameterSetVui.nmax_num_reorder_frames(address());
        }

        @NativeType("uint8_t")
        public byte max_dec_frame_buffering() {
            return StdVideoH264SequenceParameterSetVui.nmax_dec_frame_buffering(address());
        }

        @NativeType("uint8_t")
        public byte chroma_sample_loc_type_top_field() {
            return StdVideoH264SequenceParameterSetVui.nchroma_sample_loc_type_top_field(address());
        }

        @NativeType("uint8_t")
        public byte chroma_sample_loc_type_bottom_field() {
            return StdVideoH264SequenceParameterSetVui.nchroma_sample_loc_type_bottom_field(address());
        }

        @NativeType("StdVideoH264HrdParameters const *")
        public StdVideoH264HrdParameters pHrdParameters() {
            return StdVideoH264SequenceParameterSetVui.npHrdParameters(address());
        }

        public Buffer flags(StdVideoH264SpsVuiFlags value) {
            StdVideoH264SequenceParameterSetVui.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoH264SpsVuiFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer aspect_ratio_idc(@NativeType("StdVideoH264AspectRatioIdc") int value) {
            StdVideoH264SequenceParameterSetVui.naspect_ratio_idc(address(), value);
            return this;
        }

        public Buffer sar_width(@NativeType("uint16_t") short value) {
            StdVideoH264SequenceParameterSetVui.nsar_width(address(), value);
            return this;
        }

        public Buffer sar_height(@NativeType("uint16_t") short value) {
            StdVideoH264SequenceParameterSetVui.nsar_height(address(), value);
            return this;
        }

        public Buffer video_format(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSetVui.nvideo_format(address(), value);
            return this;
        }

        public Buffer colour_primaries(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSetVui.ncolour_primaries(address(), value);
            return this;
        }

        public Buffer transfer_characteristics(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSetVui.ntransfer_characteristics(address(), value);
            return this;
        }

        public Buffer matrix_coefficients(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSetVui.nmatrix_coefficients(address(), value);
            return this;
        }

        public Buffer num_units_in_tick(@NativeType("uint32_t") int value) {
            StdVideoH264SequenceParameterSetVui.nnum_units_in_tick(address(), value);
            return this;
        }

        public Buffer time_scale(@NativeType("uint32_t") int value) {
            StdVideoH264SequenceParameterSetVui.ntime_scale(address(), value);
            return this;
        }

        public Buffer max_num_reorder_frames(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSetVui.nmax_num_reorder_frames(address(), value);
            return this;
        }

        public Buffer max_dec_frame_buffering(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSetVui.nmax_dec_frame_buffering(address(), value);
            return this;
        }

        public Buffer chroma_sample_loc_type_top_field(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSetVui.nchroma_sample_loc_type_top_field(address(), value);
            return this;
        }

        public Buffer chroma_sample_loc_type_bottom_field(@NativeType("uint8_t") byte value) {
            StdVideoH264SequenceParameterSetVui.nchroma_sample_loc_type_bottom_field(address(), value);
            return this;
        }

        public Buffer pHrdParameters(@NativeType("StdVideoH264HrdParameters const *") StdVideoH264HrdParameters value) {
            StdVideoH264SequenceParameterSetVui.npHrdParameters(address(), value);
            return this;
        }
    }
}
