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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1FilmGrain.class */
public class StdVideoAV1FilmGrain extends Struct<StdVideoAV1FilmGrain> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int GRAIN_SCALING_MINUS_8;
    public static final int AR_COEFF_LAG;
    public static final int AR_COEFF_SHIFT_MINUS_6;
    public static final int GRAIN_SCALE_SHIFT;
    public static final int GRAIN_SEED;
    public static final int FILM_GRAIN_PARAMS_REF_IDX;
    public static final int NUM_Y_POINTS;
    public static final int POINT_Y_VALUE;
    public static final int POINT_Y_SCALING;
    public static final int NUM_CB_POINTS;
    public static final int POINT_CB_VALUE;
    public static final int POINT_CB_SCALING;
    public static final int NUM_CR_POINTS;
    public static final int POINT_CR_VALUE;
    public static final int POINT_CR_SCALING;
    public static final int AR_COEFFS_Y_PLUS_128;
    public static final int AR_COEFFS_CB_PLUS_128;
    public static final int AR_COEFFS_CR_PLUS_128;
    public static final int CB_MULT;
    public static final int CB_LUMA_MULT;
    public static final int CB_OFFSET;
    public static final int CR_MULT;
    public static final int CR_LUMA_MULT;
    public static final int CR_OFFSET;

    static {
        Struct.Layout layout = __struct(__member(StdVideoAV1FilmGrainFlags.SIZEOF, StdVideoAV1FilmGrainFlags.ALIGNOF), __member(1), __member(1), __member(1), __member(1), __member(2), __member(1), __member(1), __array(1, 14), __array(1, 14), __member(1), __array(1, 10), __array(1, 10), __member(1), __array(1, 10), __array(1, 10), __array(1, 24), __array(1, 25), __array(1, 25), __member(1), __member(1), __member(2), __member(1), __member(1), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        GRAIN_SCALING_MINUS_8 = layout.offsetof(1);
        AR_COEFF_LAG = layout.offsetof(2);
        AR_COEFF_SHIFT_MINUS_6 = layout.offsetof(3);
        GRAIN_SCALE_SHIFT = layout.offsetof(4);
        GRAIN_SEED = layout.offsetof(5);
        FILM_GRAIN_PARAMS_REF_IDX = layout.offsetof(6);
        NUM_Y_POINTS = layout.offsetof(7);
        POINT_Y_VALUE = layout.offsetof(8);
        POINT_Y_SCALING = layout.offsetof(9);
        NUM_CB_POINTS = layout.offsetof(10);
        POINT_CB_VALUE = layout.offsetof(11);
        POINT_CB_SCALING = layout.offsetof(12);
        NUM_CR_POINTS = layout.offsetof(13);
        POINT_CR_VALUE = layout.offsetof(14);
        POINT_CR_SCALING = layout.offsetof(15);
        AR_COEFFS_Y_PLUS_128 = layout.offsetof(16);
        AR_COEFFS_CB_PLUS_128 = layout.offsetof(17);
        AR_COEFFS_CR_PLUS_128 = layout.offsetof(18);
        CB_MULT = layout.offsetof(19);
        CB_LUMA_MULT = layout.offsetof(20);
        CB_OFFSET = layout.offsetof(21);
        CR_MULT = layout.offsetof(22);
        CR_LUMA_MULT = layout.offsetof(23);
        CR_OFFSET = layout.offsetof(24);
    }

    protected StdVideoAV1FilmGrain(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1FilmGrain create(long address, ByteBuffer container) {
        return new StdVideoAV1FilmGrain(address, container);
    }

    public StdVideoAV1FilmGrain(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoAV1FilmGrainFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte grain_scaling_minus_8() {
        return ngrain_scaling_minus_8(address());
    }

    @NativeType("uint8_t")
    public byte ar_coeff_lag() {
        return nar_coeff_lag(address());
    }

    @NativeType("uint8_t")
    public byte ar_coeff_shift_minus_6() {
        return nar_coeff_shift_minus_6(address());
    }

    @NativeType("uint8_t")
    public byte grain_scale_shift() {
        return ngrain_scale_shift(address());
    }

    @NativeType("uint16_t")
    public short grain_seed() {
        return ngrain_seed(address());
    }

    @NativeType("uint8_t")
    public byte film_grain_params_ref_idx() {
        return nfilm_grain_params_ref_idx(address());
    }

    @NativeType("uint8_t")
    public byte num_y_points() {
        return nnum_y_points(address());
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
    public ByteBuffer point_y_value() {
        return npoint_y_value(address());
    }

    @NativeType("uint8_t")
    public byte point_y_value(int index) {
        return npoint_y_value(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
    public ByteBuffer point_y_scaling() {
        return npoint_y_scaling(address());
    }

    @NativeType("uint8_t")
    public byte point_y_scaling(int index) {
        return npoint_y_scaling(address(), index);
    }

    @NativeType("uint8_t")
    public byte num_cb_points() {
        return nnum_cb_points(address());
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
    public ByteBuffer point_cb_value() {
        return npoint_cb_value(address());
    }

    @NativeType("uint8_t")
    public byte point_cb_value(int index) {
        return npoint_cb_value(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
    public ByteBuffer point_cb_scaling() {
        return npoint_cb_scaling(address());
    }

    @NativeType("uint8_t")
    public byte point_cb_scaling(int index) {
        return npoint_cb_scaling(address(), index);
    }

    @NativeType("uint8_t")
    public byte num_cr_points() {
        return nnum_cr_points(address());
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
    public ByteBuffer point_cr_value() {
        return npoint_cr_value(address());
    }

    @NativeType("uint8_t")
    public byte point_cr_value(int index) {
        return npoint_cr_value(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
    public ByteBuffer point_cr_scaling() {
        return npoint_cr_scaling(address());
    }

    @NativeType("uint8_t")
    public byte point_cr_scaling(int index) {
        return npoint_cr_scaling(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]")
    public ByteBuffer ar_coeffs_y_plus_128() {
        return nar_coeffs_y_plus_128(address());
    }

    @NativeType("int8_t")
    public byte ar_coeffs_y_plus_128(int index) {
        return nar_coeffs_y_plus_128(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
    public ByteBuffer ar_coeffs_cb_plus_128() {
        return nar_coeffs_cb_plus_128(address());
    }

    @NativeType("int8_t")
    public byte ar_coeffs_cb_plus_128(int index) {
        return nar_coeffs_cb_plus_128(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
    public ByteBuffer ar_coeffs_cr_plus_128() {
        return nar_coeffs_cr_plus_128(address());
    }

    @NativeType("int8_t")
    public byte ar_coeffs_cr_plus_128(int index) {
        return nar_coeffs_cr_plus_128(address(), index);
    }

    @NativeType("uint8_t")
    public byte cb_mult() {
        return ncb_mult(address());
    }

    @NativeType("uint8_t")
    public byte cb_luma_mult() {
        return ncb_luma_mult(address());
    }

    @NativeType("uint16_t")
    public short cb_offset() {
        return ncb_offset(address());
    }

    @NativeType("uint8_t")
    public byte cr_mult() {
        return ncr_mult(address());
    }

    @NativeType("uint8_t")
    public byte cr_luma_mult() {
        return ncr_luma_mult(address());
    }

    @NativeType("uint16_t")
    public short cr_offset() {
        return ncr_offset(address());
    }

    public StdVideoAV1FilmGrain flags(StdVideoAV1FilmGrainFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain flags(Consumer<StdVideoAV1FilmGrainFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoAV1FilmGrain grain_scaling_minus_8(@NativeType("uint8_t") byte value) {
        ngrain_scaling_minus_8(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain ar_coeff_lag(@NativeType("uint8_t") byte value) {
        nar_coeff_lag(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain ar_coeff_shift_minus_6(@NativeType("uint8_t") byte value) {
        nar_coeff_shift_minus_6(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain grain_scale_shift(@NativeType("uint8_t") byte value) {
        ngrain_scale_shift(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain grain_seed(@NativeType("uint16_t") short value) {
        ngrain_seed(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain film_grain_params_ref_idx(@NativeType("uint8_t") byte value) {
        nfilm_grain_params_ref_idx(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain num_y_points(@NativeType("uint8_t") byte value) {
        nnum_y_points(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain point_y_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") ByteBuffer value) {
        npoint_y_value(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain point_y_value(int index, @NativeType("uint8_t") byte value) {
        npoint_y_value(address(), index, value);
        return this;
    }

    public StdVideoAV1FilmGrain point_y_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") ByteBuffer value) {
        npoint_y_scaling(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain point_y_scaling(int index, @NativeType("uint8_t") byte value) {
        npoint_y_scaling(address(), index, value);
        return this;
    }

    public StdVideoAV1FilmGrain num_cb_points(@NativeType("uint8_t") byte value) {
        nnum_cb_points(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain point_cb_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") ByteBuffer value) {
        npoint_cb_value(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain point_cb_value(int index, @NativeType("uint8_t") byte value) {
        npoint_cb_value(address(), index, value);
        return this;
    }

    public StdVideoAV1FilmGrain point_cb_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") ByteBuffer value) {
        npoint_cb_scaling(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain point_cb_scaling(int index, @NativeType("uint8_t") byte value) {
        npoint_cb_scaling(address(), index, value);
        return this;
    }

    public StdVideoAV1FilmGrain num_cr_points(@NativeType("uint8_t") byte value) {
        nnum_cr_points(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain point_cr_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") ByteBuffer value) {
        npoint_cr_value(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain point_cr_value(int index, @NativeType("uint8_t") byte value) {
        npoint_cr_value(address(), index, value);
        return this;
    }

    public StdVideoAV1FilmGrain point_cr_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") ByteBuffer value) {
        npoint_cr_scaling(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain point_cr_scaling(int index, @NativeType("uint8_t") byte value) {
        npoint_cr_scaling(address(), index, value);
        return this;
    }

    public StdVideoAV1FilmGrain ar_coeffs_y_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]") ByteBuffer value) {
        nar_coeffs_y_plus_128(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain ar_coeffs_y_plus_128(int index, @NativeType("int8_t") byte value) {
        nar_coeffs_y_plus_128(address(), index, value);
        return this;
    }

    public StdVideoAV1FilmGrain ar_coeffs_cb_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") ByteBuffer value) {
        nar_coeffs_cb_plus_128(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain ar_coeffs_cb_plus_128(int index, @NativeType("int8_t") byte value) {
        nar_coeffs_cb_plus_128(address(), index, value);
        return this;
    }

    public StdVideoAV1FilmGrain ar_coeffs_cr_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") ByteBuffer value) {
        nar_coeffs_cr_plus_128(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain ar_coeffs_cr_plus_128(int index, @NativeType("int8_t") byte value) {
        nar_coeffs_cr_plus_128(address(), index, value);
        return this;
    }

    public StdVideoAV1FilmGrain cb_mult(@NativeType("uint8_t") byte value) {
        ncb_mult(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain cb_luma_mult(@NativeType("uint8_t") byte value) {
        ncb_luma_mult(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain cb_offset(@NativeType("uint16_t") short value) {
        ncb_offset(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain cr_mult(@NativeType("uint8_t") byte value) {
        ncr_mult(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain cr_luma_mult(@NativeType("uint8_t") byte value) {
        ncr_luma_mult(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain cr_offset(@NativeType("uint16_t") short value) {
        ncr_offset(address(), value);
        return this;
    }

    public StdVideoAV1FilmGrain set(StdVideoAV1FilmGrainFlags flags, byte grain_scaling_minus_8, byte ar_coeff_lag, byte ar_coeff_shift_minus_6, byte grain_scale_shift, short grain_seed, byte film_grain_params_ref_idx, byte num_y_points, ByteBuffer point_y_value, ByteBuffer point_y_scaling, byte num_cb_points, ByteBuffer point_cb_value, ByteBuffer point_cb_scaling, byte num_cr_points, ByteBuffer point_cr_value, ByteBuffer point_cr_scaling, ByteBuffer ar_coeffs_y_plus_128, ByteBuffer ar_coeffs_cb_plus_128, ByteBuffer ar_coeffs_cr_plus_128, byte cb_mult, byte cb_luma_mult, short cb_offset, byte cr_mult, byte cr_luma_mult, short cr_offset) {
        flags(flags);
        grain_scaling_minus_8(grain_scaling_minus_8);
        ar_coeff_lag(ar_coeff_lag);
        ar_coeff_shift_minus_6(ar_coeff_shift_minus_6);
        grain_scale_shift(grain_scale_shift);
        grain_seed(grain_seed);
        film_grain_params_ref_idx(film_grain_params_ref_idx);
        num_y_points(num_y_points);
        point_y_value(point_y_value);
        point_y_scaling(point_y_scaling);
        num_cb_points(num_cb_points);
        point_cb_value(point_cb_value);
        point_cb_scaling(point_cb_scaling);
        num_cr_points(num_cr_points);
        point_cr_value(point_cr_value);
        point_cr_scaling(point_cr_scaling);
        ar_coeffs_y_plus_128(ar_coeffs_y_plus_128);
        ar_coeffs_cb_plus_128(ar_coeffs_cb_plus_128);
        ar_coeffs_cr_plus_128(ar_coeffs_cr_plus_128);
        cb_mult(cb_mult);
        cb_luma_mult(cb_luma_mult);
        cb_offset(cb_offset);
        cr_mult(cr_mult);
        cr_luma_mult(cr_luma_mult);
        cr_offset(cr_offset);
        return this;
    }

    public StdVideoAV1FilmGrain set(StdVideoAV1FilmGrain src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1FilmGrain malloc() {
        return new StdVideoAV1FilmGrain(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1FilmGrain calloc() {
        return new StdVideoAV1FilmGrain(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1FilmGrain create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1FilmGrain(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1FilmGrain create(long address) {
        return new StdVideoAV1FilmGrain(address, null);
    }

    public static StdVideoAV1FilmGrain createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1FilmGrain(address, null);
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

    public static StdVideoAV1FilmGrain malloc(MemoryStack stack) {
        return new StdVideoAV1FilmGrain(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1FilmGrain calloc(MemoryStack stack) {
        return new StdVideoAV1FilmGrain(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoAV1FilmGrainFlags nflags(long struct) {
        return StdVideoAV1FilmGrainFlags.create(struct + FLAGS);
    }

    public static byte ngrain_scaling_minus_8(long struct) {
        return MemoryUtil.memGetByte(struct + GRAIN_SCALING_MINUS_8);
    }

    public static byte nar_coeff_lag(long struct) {
        return MemoryUtil.memGetByte(struct + AR_COEFF_LAG);
    }

    public static byte nar_coeff_shift_minus_6(long struct) {
        return MemoryUtil.memGetByte(struct + AR_COEFF_SHIFT_MINUS_6);
    }

    public static byte ngrain_scale_shift(long struct) {
        return MemoryUtil.memGetByte(struct + GRAIN_SCALE_SHIFT);
    }

    public static short ngrain_seed(long struct) {
        return MemoryUtil.memGetShort(struct + GRAIN_SEED);
    }

    public static byte nfilm_grain_params_ref_idx(long struct) {
        return MemoryUtil.memGetByte(struct + FILM_GRAIN_PARAMS_REF_IDX);
    }

    public static byte nnum_y_points(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_Y_POINTS);
    }

    public static ByteBuffer npoint_y_value(long struct) {
        return MemoryUtil.memByteBuffer(struct + POINT_Y_VALUE, 14);
    }

    public static byte npoint_y_value(long struct, int index) {
        return MemoryUtil.memGetByte(struct + POINT_Y_VALUE + (Checks.check(index, 14) * 1));
    }

    public static ByteBuffer npoint_y_scaling(long struct) {
        return MemoryUtil.memByteBuffer(struct + POINT_Y_SCALING, 14);
    }

    public static byte npoint_y_scaling(long struct, int index) {
        return MemoryUtil.memGetByte(struct + POINT_Y_SCALING + (Checks.check(index, 14) * 1));
    }

    public static byte nnum_cb_points(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_CB_POINTS);
    }

    public static ByteBuffer npoint_cb_value(long struct) {
        return MemoryUtil.memByteBuffer(struct + POINT_CB_VALUE, 10);
    }

    public static byte npoint_cb_value(long struct, int index) {
        return MemoryUtil.memGetByte(struct + POINT_CB_VALUE + (Checks.check(index, 10) * 1));
    }

    public static ByteBuffer npoint_cb_scaling(long struct) {
        return MemoryUtil.memByteBuffer(struct + POINT_CB_SCALING, 10);
    }

    public static byte npoint_cb_scaling(long struct, int index) {
        return MemoryUtil.memGetByte(struct + POINT_CB_SCALING + (Checks.check(index, 10) * 1));
    }

    public static byte nnum_cr_points(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_CR_POINTS);
    }

    public static ByteBuffer npoint_cr_value(long struct) {
        return MemoryUtil.memByteBuffer(struct + POINT_CR_VALUE, 10);
    }

    public static byte npoint_cr_value(long struct, int index) {
        return MemoryUtil.memGetByte(struct + POINT_CR_VALUE + (Checks.check(index, 10) * 1));
    }

    public static ByteBuffer npoint_cr_scaling(long struct) {
        return MemoryUtil.memByteBuffer(struct + POINT_CR_SCALING, 10);
    }

    public static byte npoint_cr_scaling(long struct, int index) {
        return MemoryUtil.memGetByte(struct + POINT_CR_SCALING + (Checks.check(index, 10) * 1));
    }

    public static ByteBuffer nar_coeffs_y_plus_128(long struct) {
        return MemoryUtil.memByteBuffer(struct + AR_COEFFS_Y_PLUS_128, 24);
    }

    public static byte nar_coeffs_y_plus_128(long struct, int index) {
        return MemoryUtil.memGetByte(struct + AR_COEFFS_Y_PLUS_128 + (Checks.check(index, 24) * 1));
    }

    public static ByteBuffer nar_coeffs_cb_plus_128(long struct) {
        return MemoryUtil.memByteBuffer(struct + AR_COEFFS_CB_PLUS_128, 25);
    }

    public static byte nar_coeffs_cb_plus_128(long struct, int index) {
        return MemoryUtil.memGetByte(struct + AR_COEFFS_CB_PLUS_128 + (Checks.check(index, 25) * 1));
    }

    public static ByteBuffer nar_coeffs_cr_plus_128(long struct) {
        return MemoryUtil.memByteBuffer(struct + AR_COEFFS_CR_PLUS_128, 25);
    }

    public static byte nar_coeffs_cr_plus_128(long struct, int index) {
        return MemoryUtil.memGetByte(struct + AR_COEFFS_CR_PLUS_128 + (Checks.check(index, 25) * 1));
    }

    public static byte ncb_mult(long struct) {
        return MemoryUtil.memGetByte(struct + CB_MULT);
    }

    public static byte ncb_luma_mult(long struct) {
        return MemoryUtil.memGetByte(struct + CB_LUMA_MULT);
    }

    public static short ncb_offset(long struct) {
        return MemoryUtil.memGetShort(struct + CB_OFFSET);
    }

    public static byte ncr_mult(long struct) {
        return MemoryUtil.memGetByte(struct + CR_MULT);
    }

    public static byte ncr_luma_mult(long struct) {
        return MemoryUtil.memGetByte(struct + CR_LUMA_MULT);
    }

    public static short ncr_offset(long struct) {
        return MemoryUtil.memGetShort(struct + CR_OFFSET);
    }

    public static void nflags(long struct, StdVideoAV1FilmGrainFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoAV1FilmGrainFlags.SIZEOF);
    }

    public static void ngrain_scaling_minus_8(long struct, byte value) {
        MemoryUtil.memPutByte(struct + GRAIN_SCALING_MINUS_8, value);
    }

    public static void nar_coeff_lag(long struct, byte value) {
        MemoryUtil.memPutByte(struct + AR_COEFF_LAG, value);
    }

    public static void nar_coeff_shift_minus_6(long struct, byte value) {
        MemoryUtil.memPutByte(struct + AR_COEFF_SHIFT_MINUS_6, value);
    }

    public static void ngrain_scale_shift(long struct, byte value) {
        MemoryUtil.memPutByte(struct + GRAIN_SCALE_SHIFT, value);
    }

    public static void ngrain_seed(long struct, short value) {
        MemoryUtil.memPutShort(struct + GRAIN_SEED, value);
    }

    public static void nfilm_grain_params_ref_idx(long struct, byte value) {
        MemoryUtil.memPutByte(struct + FILM_GRAIN_PARAMS_REF_IDX, value);
    }

    public static void nnum_y_points(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_Y_POINTS, value);
    }

    public static void npoint_y_value(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 14);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + POINT_Y_VALUE, value.remaining() * 1);
    }

    public static void npoint_y_value(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + POINT_Y_VALUE + (Checks.check(index, 14) * 1), value);
    }

    public static void npoint_y_scaling(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 14);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + POINT_Y_SCALING, value.remaining() * 1);
    }

    public static void npoint_y_scaling(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + POINT_Y_SCALING + (Checks.check(index, 14) * 1), value);
    }

    public static void nnum_cb_points(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_CB_POINTS, value);
    }

    public static void npoint_cb_value(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 10);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + POINT_CB_VALUE, value.remaining() * 1);
    }

    public static void npoint_cb_value(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + POINT_CB_VALUE + (Checks.check(index, 10) * 1), value);
    }

    public static void npoint_cb_scaling(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 10);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + POINT_CB_SCALING, value.remaining() * 1);
    }

    public static void npoint_cb_scaling(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + POINT_CB_SCALING + (Checks.check(index, 10) * 1), value);
    }

    public static void nnum_cr_points(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_CR_POINTS, value);
    }

    public static void npoint_cr_value(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 10);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + POINT_CR_VALUE, value.remaining() * 1);
    }

    public static void npoint_cr_value(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + POINT_CR_VALUE + (Checks.check(index, 10) * 1), value);
    }

    public static void npoint_cr_scaling(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 10);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + POINT_CR_SCALING, value.remaining() * 1);
    }

    public static void npoint_cr_scaling(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + POINT_CR_SCALING + (Checks.check(index, 10) * 1), value);
    }

    public static void nar_coeffs_y_plus_128(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 24);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + AR_COEFFS_Y_PLUS_128, value.remaining() * 1);
    }

    public static void nar_coeffs_y_plus_128(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + AR_COEFFS_Y_PLUS_128 + (Checks.check(index, 24) * 1), value);
    }

    public static void nar_coeffs_cb_plus_128(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 25);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + AR_COEFFS_CB_PLUS_128, value.remaining() * 1);
    }

    public static void nar_coeffs_cb_plus_128(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + AR_COEFFS_CB_PLUS_128 + (Checks.check(index, 25) * 1), value);
    }

    public static void nar_coeffs_cr_plus_128(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 25);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + AR_COEFFS_CR_PLUS_128, value.remaining() * 1);
    }

    public static void nar_coeffs_cr_plus_128(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + AR_COEFFS_CR_PLUS_128 + (Checks.check(index, 25) * 1), value);
    }

    public static void ncb_mult(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CB_MULT, value);
    }

    public static void ncb_luma_mult(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CB_LUMA_MULT, value);
    }

    public static void ncb_offset(long struct, short value) {
        MemoryUtil.memPutShort(struct + CB_OFFSET, value);
    }

    public static void ncr_mult(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CR_MULT, value);
    }

    public static void ncr_luma_mult(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CR_LUMA_MULT, value);
    }

    public static void ncr_offset(long struct, short value) {
        MemoryUtil.memPutShort(struct + CR_OFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1FilmGrain$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1FilmGrain, Buffer> implements NativeResource {
        private static final StdVideoAV1FilmGrain ELEMENT_FACTORY = StdVideoAV1FilmGrain.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1FilmGrain.SIZEOF);
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
        public StdVideoAV1FilmGrain getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoAV1FilmGrainFlags flags() {
            return StdVideoAV1FilmGrain.nflags(address());
        }

        @NativeType("uint8_t")
        public byte grain_scaling_minus_8() {
            return StdVideoAV1FilmGrain.ngrain_scaling_minus_8(address());
        }

        @NativeType("uint8_t")
        public byte ar_coeff_lag() {
            return StdVideoAV1FilmGrain.nar_coeff_lag(address());
        }

        @NativeType("uint8_t")
        public byte ar_coeff_shift_minus_6() {
            return StdVideoAV1FilmGrain.nar_coeff_shift_minus_6(address());
        }

        @NativeType("uint8_t")
        public byte grain_scale_shift() {
            return StdVideoAV1FilmGrain.ngrain_scale_shift(address());
        }

        @NativeType("uint16_t")
        public short grain_seed() {
            return StdVideoAV1FilmGrain.ngrain_seed(address());
        }

        @NativeType("uint8_t")
        public byte film_grain_params_ref_idx() {
            return StdVideoAV1FilmGrain.nfilm_grain_params_ref_idx(address());
        }

        @NativeType("uint8_t")
        public byte num_y_points() {
            return StdVideoAV1FilmGrain.nnum_y_points(address());
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
        public ByteBuffer point_y_value() {
            return StdVideoAV1FilmGrain.npoint_y_value(address());
        }

        @NativeType("uint8_t")
        public byte point_y_value(int index) {
            return StdVideoAV1FilmGrain.npoint_y_value(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
        public ByteBuffer point_y_scaling() {
            return StdVideoAV1FilmGrain.npoint_y_scaling(address());
        }

        @NativeType("uint8_t")
        public byte point_y_scaling(int index) {
            return StdVideoAV1FilmGrain.npoint_y_scaling(address(), index);
        }

        @NativeType("uint8_t")
        public byte num_cb_points() {
            return StdVideoAV1FilmGrain.nnum_cb_points(address());
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
        public ByteBuffer point_cb_value() {
            return StdVideoAV1FilmGrain.npoint_cb_value(address());
        }

        @NativeType("uint8_t")
        public byte point_cb_value(int index) {
            return StdVideoAV1FilmGrain.npoint_cb_value(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
        public ByteBuffer point_cb_scaling() {
            return StdVideoAV1FilmGrain.npoint_cb_scaling(address());
        }

        @NativeType("uint8_t")
        public byte point_cb_scaling(int index) {
            return StdVideoAV1FilmGrain.npoint_cb_scaling(address(), index);
        }

        @NativeType("uint8_t")
        public byte num_cr_points() {
            return StdVideoAV1FilmGrain.nnum_cr_points(address());
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
        public ByteBuffer point_cr_value() {
            return StdVideoAV1FilmGrain.npoint_cr_value(address());
        }

        @NativeType("uint8_t")
        public byte point_cr_value(int index) {
            return StdVideoAV1FilmGrain.npoint_cr_value(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
        public ByteBuffer point_cr_scaling() {
            return StdVideoAV1FilmGrain.npoint_cr_scaling(address());
        }

        @NativeType("uint8_t")
        public byte point_cr_scaling(int index) {
            return StdVideoAV1FilmGrain.npoint_cr_scaling(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]")
        public ByteBuffer ar_coeffs_y_plus_128() {
            return StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(address());
        }

        @NativeType("int8_t")
        public byte ar_coeffs_y_plus_128(int index) {
            return StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
        public ByteBuffer ar_coeffs_cb_plus_128() {
            return StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(address());
        }

        @NativeType("int8_t")
        public byte ar_coeffs_cb_plus_128(int index) {
            return StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
        public ByteBuffer ar_coeffs_cr_plus_128() {
            return StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(address());
        }

        @NativeType("int8_t")
        public byte ar_coeffs_cr_plus_128(int index) {
            return StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(address(), index);
        }

        @NativeType("uint8_t")
        public byte cb_mult() {
            return StdVideoAV1FilmGrain.ncb_mult(address());
        }

        @NativeType("uint8_t")
        public byte cb_luma_mult() {
            return StdVideoAV1FilmGrain.ncb_luma_mult(address());
        }

        @NativeType("uint16_t")
        public short cb_offset() {
            return StdVideoAV1FilmGrain.ncb_offset(address());
        }

        @NativeType("uint8_t")
        public byte cr_mult() {
            return StdVideoAV1FilmGrain.ncr_mult(address());
        }

        @NativeType("uint8_t")
        public byte cr_luma_mult() {
            return StdVideoAV1FilmGrain.ncr_luma_mult(address());
        }

        @NativeType("uint16_t")
        public short cr_offset() {
            return StdVideoAV1FilmGrain.ncr_offset(address());
        }

        public Buffer flags(StdVideoAV1FilmGrainFlags value) {
            StdVideoAV1FilmGrain.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoAV1FilmGrainFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer grain_scaling_minus_8(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.ngrain_scaling_minus_8(address(), value);
            return this;
        }

        public Buffer ar_coeff_lag(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.nar_coeff_lag(address(), value);
            return this;
        }

        public Buffer ar_coeff_shift_minus_6(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.nar_coeff_shift_minus_6(address(), value);
            return this;
        }

        public Buffer grain_scale_shift(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.ngrain_scale_shift(address(), value);
            return this;
        }

        public Buffer grain_seed(@NativeType("uint16_t") short value) {
            StdVideoAV1FilmGrain.ngrain_seed(address(), value);
            return this;
        }

        public Buffer film_grain_params_ref_idx(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.nfilm_grain_params_ref_idx(address(), value);
            return this;
        }

        public Buffer num_y_points(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.nnum_y_points(address(), value);
            return this;
        }

        public Buffer point_y_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") ByteBuffer value) {
            StdVideoAV1FilmGrain.npoint_y_value(address(), value);
            return this;
        }

        public Buffer point_y_value(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.npoint_y_value(address(), index, value);
            return this;
        }

        public Buffer point_y_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") ByteBuffer value) {
            StdVideoAV1FilmGrain.npoint_y_scaling(address(), value);
            return this;
        }

        public Buffer point_y_scaling(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.npoint_y_scaling(address(), index, value);
            return this;
        }

        public Buffer num_cb_points(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.nnum_cb_points(address(), value);
            return this;
        }

        public Buffer point_cb_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") ByteBuffer value) {
            StdVideoAV1FilmGrain.npoint_cb_value(address(), value);
            return this;
        }

        public Buffer point_cb_value(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.npoint_cb_value(address(), index, value);
            return this;
        }

        public Buffer point_cb_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") ByteBuffer value) {
            StdVideoAV1FilmGrain.npoint_cb_scaling(address(), value);
            return this;
        }

        public Buffer point_cb_scaling(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.npoint_cb_scaling(address(), index, value);
            return this;
        }

        public Buffer num_cr_points(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.nnum_cr_points(address(), value);
            return this;
        }

        public Buffer point_cr_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") ByteBuffer value) {
            StdVideoAV1FilmGrain.npoint_cr_value(address(), value);
            return this;
        }

        public Buffer point_cr_value(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.npoint_cr_value(address(), index, value);
            return this;
        }

        public Buffer point_cr_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") ByteBuffer value) {
            StdVideoAV1FilmGrain.npoint_cr_scaling(address(), value);
            return this;
        }

        public Buffer point_cr_scaling(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.npoint_cr_scaling(address(), index, value);
            return this;
        }

        public Buffer ar_coeffs_y_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]") ByteBuffer value) {
            StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(address(), value);
            return this;
        }

        public Buffer ar_coeffs_y_plus_128(int index, @NativeType("int8_t") byte value) {
            StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(address(), index, value);
            return this;
        }

        public Buffer ar_coeffs_cb_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") ByteBuffer value) {
            StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(address(), value);
            return this;
        }

        public Buffer ar_coeffs_cb_plus_128(int index, @NativeType("int8_t") byte value) {
            StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(address(), index, value);
            return this;
        }

        public Buffer ar_coeffs_cr_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") ByteBuffer value) {
            StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(address(), value);
            return this;
        }

        public Buffer ar_coeffs_cr_plus_128(int index, @NativeType("int8_t") byte value) {
            StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(address(), index, value);
            return this;
        }

        public Buffer cb_mult(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.ncb_mult(address(), value);
            return this;
        }

        public Buffer cb_luma_mult(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.ncb_luma_mult(address(), value);
            return this;
        }

        public Buffer cb_offset(@NativeType("uint16_t") short value) {
            StdVideoAV1FilmGrain.ncb_offset(address(), value);
            return this;
        }

        public Buffer cr_mult(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.ncr_mult(address(), value);
            return this;
        }

        public Buffer cr_luma_mult(@NativeType("uint8_t") byte value) {
            StdVideoAV1FilmGrain.ncr_luma_mult(address(), value);
            return this;
        }

        public Buffer cr_offset(@NativeType("uint16_t") short value) {
            StdVideoAV1FilmGrain.ncr_offset(address(), value);
            return this;
        }
    }
}
