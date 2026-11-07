package org.lwjgl.stb;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIR_RESIZE.class */
public class STBIR_RESIZE extends Struct<STBIR_RESIZE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int USER_DATA;
    public static final int INPUT_PIXELS;
    public static final int INPUT_W;
    public static final int INPUT_H;
    public static final int INPUT_S0;
    public static final int INPUT_T0;
    public static final int INPUT_S1;
    public static final int INPUT_T1;
    public static final int INPUT_CB;
    public static final int OUTPUT_PIXELS;
    public static final int OUTPUT_W;
    public static final int OUTPUT_H;
    public static final int OUTPUT_SUBX;
    public static final int OUTPUT_SUBY;
    public static final int OUTPUT_SUBW;
    public static final int OUTPUT_SUBH;
    public static final int OUTPUT_CB;
    public static final int INPUT_STRIDE_IN_BYTES;
    public static final int OUTPUT_STRIDE_IN_BYTES;
    public static final int SPLITS;
    public static final int FAST_ALPHA;
    public static final int NEEDS_REBUILD;
    public static final int CALLED_ALLOC;
    public static final int INPUT_PIXEL_LAYOUT_PUBLIC;
    public static final int OUTPUT_PIXEL_LAYOUT_PUBLIC;
    public static final int INPUT_DATA_TYPE;
    public static final int OUTPUT_DATA_TYPE;
    public static final int HORIZONTAL_FILTER;
    public static final int VERTICAL_FILTER;
    public static final int HORIZONTAL_EDGE;
    public static final int VERTICAL_EDGE;
    public static final int HORIZONTAL_FILTER_KERNEL;
    public static final int HORIZONTAL_FILTER_SUPPORT;
    public static final int VERTICAL_FILTER_KERNEL;
    public static final int VERTICAL_FILTER_SUPPORT;
    public static final int SAMPLERS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(8), __member(8), __member(8), __member(8), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        USER_DATA = layout.offsetof(0);
        INPUT_PIXELS = layout.offsetof(1);
        INPUT_W = layout.offsetof(2);
        INPUT_H = layout.offsetof(3);
        INPUT_S0 = layout.offsetof(4);
        INPUT_T0 = layout.offsetof(5);
        INPUT_S1 = layout.offsetof(6);
        INPUT_T1 = layout.offsetof(7);
        INPUT_CB = layout.offsetof(8);
        OUTPUT_PIXELS = layout.offsetof(9);
        OUTPUT_W = layout.offsetof(10);
        OUTPUT_H = layout.offsetof(11);
        OUTPUT_SUBX = layout.offsetof(12);
        OUTPUT_SUBY = layout.offsetof(13);
        OUTPUT_SUBW = layout.offsetof(14);
        OUTPUT_SUBH = layout.offsetof(15);
        OUTPUT_CB = layout.offsetof(16);
        INPUT_STRIDE_IN_BYTES = layout.offsetof(17);
        OUTPUT_STRIDE_IN_BYTES = layout.offsetof(18);
        SPLITS = layout.offsetof(19);
        FAST_ALPHA = layout.offsetof(20);
        NEEDS_REBUILD = layout.offsetof(21);
        CALLED_ALLOC = layout.offsetof(22);
        INPUT_PIXEL_LAYOUT_PUBLIC = layout.offsetof(23);
        OUTPUT_PIXEL_LAYOUT_PUBLIC = layout.offsetof(24);
        INPUT_DATA_TYPE = layout.offsetof(25);
        OUTPUT_DATA_TYPE = layout.offsetof(26);
        HORIZONTAL_FILTER = layout.offsetof(27);
        VERTICAL_FILTER = layout.offsetof(28);
        HORIZONTAL_EDGE = layout.offsetof(29);
        VERTICAL_EDGE = layout.offsetof(30);
        HORIZONTAL_FILTER_KERNEL = layout.offsetof(31);
        HORIZONTAL_FILTER_SUPPORT = layout.offsetof(32);
        VERTICAL_FILTER_KERNEL = layout.offsetof(33);
        VERTICAL_FILTER_SUPPORT = layout.offsetof(34);
        SAMPLERS = layout.offsetof(35);
    }

    protected STBIR_RESIZE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBIR_RESIZE create(long address, ByteBuffer container) {
        return new STBIR_RESIZE(address, container);
    }

    public STBIR_RESIZE(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public long user_data() {
        return nuser_data(address());
    }

    @NativeType("void const *")
    public ByteBuffer input_pixels(int capacity) {
        return ninput_pixels(address(), capacity);
    }

    public int input_w() {
        return ninput_w(address());
    }

    public int input_h() {
        return ninput_h(address());
    }

    public double input_s0() {
        return ninput_s0(address());
    }

    public double input_t0() {
        return ninput_t0(address());
    }

    public double input_s1() {
        return ninput_s1(address());
    }

    public double input_t1() {
        return ninput_t1(address());
    }

    @NativeType("stbir_input_callback **")
    public PointerBuffer input_cb(int capacity) {
        return ninput_cb(address(), capacity);
    }

    @NativeType("void *")
    public ByteBuffer output_pixels(int capacity) {
        return noutput_pixels(address(), capacity);
    }

    public int output_w() {
        return noutput_w(address());
    }

    public int output_h() {
        return noutput_h(address());
    }

    public int output_subx() {
        return noutput_subx(address());
    }

    public int output_suby() {
        return noutput_suby(address());
    }

    public int output_subw() {
        return noutput_subw(address());
    }

    public int output_subh() {
        return noutput_subh(address());
    }

    @NativeType("stbir_output_callback **")
    public PointerBuffer output_cb(int capacity) {
        return noutput_cb(address(), capacity);
    }

    public int input_stride_in_bytes() {
        return ninput_stride_in_bytes(address());
    }

    public int output_stride_in_bytes() {
        return noutput_stride_in_bytes(address());
    }

    public int splits() {
        return nsplits(address());
    }

    @NativeType("int")
    public boolean fast_alpha() {
        return nfast_alpha(address()) != 0;
    }

    @NativeType("int")
    public boolean needs_rebuild() {
        return nneeds_rebuild(address()) != 0;
    }

    @NativeType("int")
    public boolean called_alloc() {
        return ncalled_alloc(address()) != 0;
    }

    @NativeType("stbir_pixel_layout")
    public int input_pixel_layout_public() {
        return ninput_pixel_layout_public(address());
    }

    @NativeType("stbir_pixel_layout")
    public int output_pixel_layout_public() {
        return noutput_pixel_layout_public(address());
    }

    @NativeType("stbir_datatype")
    public int input_data_type() {
        return ninput_data_type(address());
    }

    @NativeType("stbir_datatype")
    public int output_data_type() {
        return noutput_data_type(address());
    }

    @NativeType("stbir_filter")
    public int horizontal_filter() {
        return nhorizontal_filter(address());
    }

    @NativeType("stbir_filter")
    public int vertical_filter() {
        return nvertical_filter(address());
    }

    @NativeType("stbir_edge")
    public int horizontal_edge() {
        return nhorizontal_edge(address());
    }

    @NativeType("stbir_edge")
    public int vertical_edge() {
        return nvertical_edge(address());
    }

    @NativeType("stbir__kernel_callback **")
    public PointerBuffer horizontal_filter_kernel(int capacity) {
        return nhorizontal_filter_kernel(address(), capacity);
    }

    @NativeType("stbir__support_callback **")
    public PointerBuffer horizontal_filter_support(int capacity) {
        return nhorizontal_filter_support(address(), capacity);
    }

    @NativeType("stbir__kernel_callback **")
    public PointerBuffer vertical_filter_kernel(int capacity) {
        return nvertical_filter_kernel(address(), capacity);
    }

    @NativeType("stbir__support_callback **")
    public PointerBuffer vertical_filter_support(int capacity) {
        return nvertical_filter_support(address(), capacity);
    }

    @NativeType("stbir__info *")
    public long samplers() {
        return nsamplers(address());
    }

    public STBIR_RESIZE user_data(@NativeType("void *") long value) {
        nuser_data(address(), value);
        return this;
    }

    public STBIR_RESIZE input_pixels(@NativeType("void const *") ByteBuffer value) {
        ninput_pixels(address(), value);
        return this;
    }

    public STBIR_RESIZE input_w(int value) {
        ninput_w(address(), value);
        return this;
    }

    public STBIR_RESIZE input_h(int value) {
        ninput_h(address(), value);
        return this;
    }

    public STBIR_RESIZE input_s0(double value) {
        ninput_s0(address(), value);
        return this;
    }

    public STBIR_RESIZE input_t0(double value) {
        ninput_t0(address(), value);
        return this;
    }

    public STBIR_RESIZE input_s1(double value) {
        ninput_s1(address(), value);
        return this;
    }

    public STBIR_RESIZE input_t1(double value) {
        ninput_t1(address(), value);
        return this;
    }

    public STBIR_RESIZE input_cb(@NativeType("stbir_input_callback **") PointerBuffer value) {
        ninput_cb(address(), value);
        return this;
    }

    public STBIR_RESIZE output_pixels(@NativeType("void *") ByteBuffer value) {
        noutput_pixels(address(), value);
        return this;
    }

    public STBIR_RESIZE output_w(int value) {
        noutput_w(address(), value);
        return this;
    }

    public STBIR_RESIZE output_h(int value) {
        noutput_h(address(), value);
        return this;
    }

    public STBIR_RESIZE output_subx(int value) {
        noutput_subx(address(), value);
        return this;
    }

    public STBIR_RESIZE output_suby(int value) {
        noutput_suby(address(), value);
        return this;
    }

    public STBIR_RESIZE output_subw(int value) {
        noutput_subw(address(), value);
        return this;
    }

    public STBIR_RESIZE output_subh(int value) {
        noutput_subh(address(), value);
        return this;
    }

    public STBIR_RESIZE output_cb(@NativeType("stbir_output_callback **") PointerBuffer value) {
        noutput_cb(address(), value);
        return this;
    }

    public STBIR_RESIZE input_stride_in_bytes(int value) {
        ninput_stride_in_bytes(address(), value);
        return this;
    }

    public STBIR_RESIZE output_stride_in_bytes(int value) {
        noutput_stride_in_bytes(address(), value);
        return this;
    }

    public STBIR_RESIZE splits(int value) {
        nsplits(address(), value);
        return this;
    }

    public STBIR_RESIZE fast_alpha(@NativeType("int") boolean value) {
        nfast_alpha(address(), value ? 1 : 0);
        return this;
    }

    public STBIR_RESIZE needs_rebuild(@NativeType("int") boolean value) {
        nneeds_rebuild(address(), value ? 1 : 0);
        return this;
    }

    public STBIR_RESIZE called_alloc(@NativeType("int") boolean value) {
        ncalled_alloc(address(), value ? 1 : 0);
        return this;
    }

    public STBIR_RESIZE input_pixel_layout_public(@NativeType("stbir_pixel_layout") int value) {
        ninput_pixel_layout_public(address(), value);
        return this;
    }

    public STBIR_RESIZE output_pixel_layout_public(@NativeType("stbir_pixel_layout") int value) {
        noutput_pixel_layout_public(address(), value);
        return this;
    }

    public STBIR_RESIZE input_data_type(@NativeType("stbir_datatype") int value) {
        ninput_data_type(address(), value);
        return this;
    }

    public STBIR_RESIZE output_data_type(@NativeType("stbir_datatype") int value) {
        noutput_data_type(address(), value);
        return this;
    }

    public STBIR_RESIZE horizontal_filter(@NativeType("stbir_filter") int value) {
        nhorizontal_filter(address(), value);
        return this;
    }

    public STBIR_RESIZE vertical_filter(@NativeType("stbir_filter") int value) {
        nvertical_filter(address(), value);
        return this;
    }

    public STBIR_RESIZE horizontal_edge(@NativeType("stbir_edge") int value) {
        nhorizontal_edge(address(), value);
        return this;
    }

    public STBIR_RESIZE vertical_edge(@NativeType("stbir_edge") int value) {
        nvertical_edge(address(), value);
        return this;
    }

    public STBIR_RESIZE horizontal_filter_kernel(@NativeType("stbir__kernel_callback **") PointerBuffer value) {
        nhorizontal_filter_kernel(address(), value);
        return this;
    }

    public STBIR_RESIZE horizontal_filter_support(@NativeType("stbir__support_callback **") PointerBuffer value) {
        nhorizontal_filter_support(address(), value);
        return this;
    }

    public STBIR_RESIZE vertical_filter_kernel(@NativeType("stbir__kernel_callback **") PointerBuffer value) {
        nvertical_filter_kernel(address(), value);
        return this;
    }

    public STBIR_RESIZE vertical_filter_support(@NativeType("stbir__support_callback **") PointerBuffer value) {
        nvertical_filter_support(address(), value);
        return this;
    }

    public STBIR_RESIZE samplers(@NativeType("stbir__info *") long value) {
        nsamplers(address(), value);
        return this;
    }

    public STBIR_RESIZE set(long user_data, ByteBuffer input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, PointerBuffer input_cb, ByteBuffer output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, PointerBuffer output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, boolean fast_alpha, boolean needs_rebuild, boolean called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type, int horizontal_filter, int vertical_filter, int horizontal_edge, int vertical_edge, PointerBuffer horizontal_filter_kernel, PointerBuffer horizontal_filter_support, PointerBuffer vertical_filter_kernel, PointerBuffer vertical_filter_support, long samplers) {
        user_data(user_data);
        input_pixels(input_pixels);
        input_w(input_w);
        input_h(input_h);
        input_s0(input_s0);
        input_t0(input_t0);
        input_s1(input_s1);
        input_t1(input_t1);
        input_cb(input_cb);
        output_pixels(output_pixels);
        output_w(output_w);
        output_h(output_h);
        output_subx(output_subx);
        output_suby(output_suby);
        output_subw(output_subw);
        output_subh(output_subh);
        output_cb(output_cb);
        input_stride_in_bytes(input_stride_in_bytes);
        output_stride_in_bytes(output_stride_in_bytes);
        splits(splits);
        fast_alpha(fast_alpha);
        needs_rebuild(needs_rebuild);
        called_alloc(called_alloc);
        input_pixel_layout_public(input_pixel_layout_public);
        output_pixel_layout_public(output_pixel_layout_public);
        input_data_type(input_data_type);
        output_data_type(output_data_type);
        horizontal_filter(horizontal_filter);
        vertical_filter(vertical_filter);
        horizontal_edge(horizontal_edge);
        vertical_edge(vertical_edge);
        horizontal_filter_kernel(horizontal_filter_kernel);
        horizontal_filter_support(horizontal_filter_support);
        vertical_filter_kernel(vertical_filter_kernel);
        vertical_filter_support(vertical_filter_support);
        samplers(samplers);
        return this;
    }

    public STBIR_RESIZE set(STBIR_RESIZE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static STBIR_RESIZE malloc() {
        return new STBIR_RESIZE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBIR_RESIZE calloc() {
        return new STBIR_RESIZE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBIR_RESIZE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBIR_RESIZE(MemoryUtil.memAddress(container), container);
    }

    public static STBIR_RESIZE create(long address) {
        return new STBIR_RESIZE(address, null);
    }

    public static STBIR_RESIZE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBIR_RESIZE(address, null);
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

    public static STBIR_RESIZE malloc(MemoryStack stack) {
        return new STBIR_RESIZE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBIR_RESIZE calloc(MemoryStack stack) {
        return new STBIR_RESIZE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nuser_data(long struct) {
        return MemoryUtil.memGetAddress(struct + USER_DATA);
    }

    public static ByteBuffer ninput_pixels(long struct, int capacity) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + INPUT_PIXELS), capacity);
    }

    public static int ninput_w(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_W);
    }

    public static int ninput_h(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_H);
    }

    public static double ninput_s0(long struct) {
        return MemoryUtil.memGetDouble(struct + INPUT_S0);
    }

    public static double ninput_t0(long struct) {
        return MemoryUtil.memGetDouble(struct + INPUT_T0);
    }

    public static double ninput_s1(long struct) {
        return MemoryUtil.memGetDouble(struct + INPUT_S1);
    }

    public static double ninput_t1(long struct) {
        return MemoryUtil.memGetDouble(struct + INPUT_T1);
    }

    public static PointerBuffer ninput_cb(long struct, int capacity) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + INPUT_CB), capacity);
    }

    public static ByteBuffer noutput_pixels(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + OUTPUT_PIXELS), capacity);
    }

    public static int noutput_w(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_W);
    }

    public static int noutput_h(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_H);
    }

    public static int noutput_subx(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_SUBX);
    }

    public static int noutput_suby(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_SUBY);
    }

    public static int noutput_subw(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_SUBW);
    }

    public static int noutput_subh(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_SUBH);
    }

    public static PointerBuffer noutput_cb(long struct, int capacity) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + OUTPUT_CB), capacity);
    }

    public static int ninput_stride_in_bytes(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_STRIDE_IN_BYTES);
    }

    public static int noutput_stride_in_bytes(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_STRIDE_IN_BYTES);
    }

    public static int nsplits(long struct) {
        return MemoryUtil.memGetInt(struct + SPLITS);
    }

    public static int nfast_alpha(long struct) {
        return MemoryUtil.memGetInt(struct + FAST_ALPHA);
    }

    public static int nneeds_rebuild(long struct) {
        return MemoryUtil.memGetInt(struct + NEEDS_REBUILD);
    }

    public static int ncalled_alloc(long struct) {
        return MemoryUtil.memGetInt(struct + CALLED_ALLOC);
    }

    public static int ninput_pixel_layout_public(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_PIXEL_LAYOUT_PUBLIC);
    }

    public static int noutput_pixel_layout_public(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_PIXEL_LAYOUT_PUBLIC);
    }

    public static int ninput_data_type(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_DATA_TYPE);
    }

    public static int noutput_data_type(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_DATA_TYPE);
    }

    public static int nhorizontal_filter(long struct) {
        return MemoryUtil.memGetInt(struct + HORIZONTAL_FILTER);
    }

    public static int nvertical_filter(long struct) {
        return MemoryUtil.memGetInt(struct + VERTICAL_FILTER);
    }

    public static int nhorizontal_edge(long struct) {
        return MemoryUtil.memGetInt(struct + HORIZONTAL_EDGE);
    }

    public static int nvertical_edge(long struct) {
        return MemoryUtil.memGetInt(struct + VERTICAL_EDGE);
    }

    public static PointerBuffer nhorizontal_filter_kernel(long struct, int capacity) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + HORIZONTAL_FILTER_KERNEL), capacity);
    }

    public static PointerBuffer nhorizontal_filter_support(long struct, int capacity) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + HORIZONTAL_FILTER_SUPPORT), capacity);
    }

    public static PointerBuffer nvertical_filter_kernel(long struct, int capacity) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + VERTICAL_FILTER_KERNEL), capacity);
    }

    public static PointerBuffer nvertical_filter_support(long struct, int capacity) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + VERTICAL_FILTER_SUPPORT), capacity);
    }

    public static long nsamplers(long struct) {
        return MemoryUtil.memGetAddress(struct + SAMPLERS);
    }

    public static void nuser_data(long struct, long value) {
        MemoryUtil.memPutAddress(struct + USER_DATA, value);
    }

    public static void ninput_pixels(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + INPUT_PIXELS, MemoryUtil.memAddress(value));
    }

    public static void ninput_w(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_W, value);
    }

    public static void ninput_h(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_H, value);
    }

    public static void ninput_s0(long struct, double value) {
        MemoryUtil.memPutDouble(struct + INPUT_S0, value);
    }

    public static void ninput_t0(long struct, double value) {
        MemoryUtil.memPutDouble(struct + INPUT_T0, value);
    }

    public static void ninput_s1(long struct, double value) {
        MemoryUtil.memPutDouble(struct + INPUT_S1, value);
    }

    public static void ninput_t1(long struct, double value) {
        MemoryUtil.memPutDouble(struct + INPUT_T1, value);
    }

    public static void ninput_cb(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + INPUT_CB, MemoryUtil.memAddressSafe(value));
    }

    public static void noutput_pixels(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + OUTPUT_PIXELS, MemoryUtil.memAddressSafe(value));
    }

    public static void noutput_w(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_W, value);
    }

    public static void noutput_h(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_H, value);
    }

    public static void noutput_subx(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_SUBX, value);
    }

    public static void noutput_suby(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_SUBY, value);
    }

    public static void noutput_subw(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_SUBW, value);
    }

    public static void noutput_subh(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_SUBH, value);
    }

    public static void noutput_cb(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + OUTPUT_CB, MemoryUtil.memAddressSafe(value));
    }

    public static void ninput_stride_in_bytes(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_STRIDE_IN_BYTES, value);
    }

    public static void noutput_stride_in_bytes(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_STRIDE_IN_BYTES, value);
    }

    public static void nsplits(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPLITS, value);
    }

    public static void nfast_alpha(long struct, int value) {
        MemoryUtil.memPutInt(struct + FAST_ALPHA, value);
    }

    public static void nneeds_rebuild(long struct, int value) {
        MemoryUtil.memPutInt(struct + NEEDS_REBUILD, value);
    }

    public static void ncalled_alloc(long struct, int value) {
        MemoryUtil.memPutInt(struct + CALLED_ALLOC, value);
    }

    public static void ninput_pixel_layout_public(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_PIXEL_LAYOUT_PUBLIC, value);
    }

    public static void noutput_pixel_layout_public(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_PIXEL_LAYOUT_PUBLIC, value);
    }

    public static void ninput_data_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_DATA_TYPE, value);
    }

    public static void noutput_data_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_DATA_TYPE, value);
    }

    public static void nhorizontal_filter(long struct, int value) {
        MemoryUtil.memPutInt(struct + HORIZONTAL_FILTER, value);
    }

    public static void nvertical_filter(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTICAL_FILTER, value);
    }

    public static void nhorizontal_edge(long struct, int value) {
        MemoryUtil.memPutInt(struct + HORIZONTAL_EDGE, value);
    }

    public static void nvertical_edge(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTICAL_EDGE, value);
    }

    public static void nhorizontal_filter_kernel(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + HORIZONTAL_FILTER_KERNEL, MemoryUtil.memAddressSafe(value));
    }

    public static void nhorizontal_filter_support(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + HORIZONTAL_FILTER_SUPPORT, MemoryUtil.memAddressSafe(value));
    }

    public static void nvertical_filter_kernel(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + VERTICAL_FILTER_KERNEL, MemoryUtil.memAddressSafe(value));
    }

    public static void nvertical_filter_support(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + VERTICAL_FILTER_SUPPORT, MemoryUtil.memAddressSafe(value));
    }

    public static void nsamplers(long struct, long value) {
        MemoryUtil.memPutAddress(struct + SAMPLERS, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + INPUT_PIXELS));
        Checks.check(MemoryUtil.memGetAddress(struct + SAMPLERS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIR_RESIZE$Buffer.class */
    public static class Buffer extends StructBuffer<STBIR_RESIZE, Buffer> implements NativeResource {
        private static final STBIR_RESIZE ELEMENT_FACTORY = STBIR_RESIZE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBIR_RESIZE.SIZEOF);
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
        public STBIR_RESIZE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public long user_data() {
            return STBIR_RESIZE.nuser_data(address());
        }

        @NativeType("void const *")
        public ByteBuffer input_pixels(int capacity) {
            return STBIR_RESIZE.ninput_pixels(address(), capacity);
        }

        public int input_w() {
            return STBIR_RESIZE.ninput_w(address());
        }

        public int input_h() {
            return STBIR_RESIZE.ninput_h(address());
        }

        public double input_s0() {
            return STBIR_RESIZE.ninput_s0(address());
        }

        public double input_t0() {
            return STBIR_RESIZE.ninput_t0(address());
        }

        public double input_s1() {
            return STBIR_RESIZE.ninput_s1(address());
        }

        public double input_t1() {
            return STBIR_RESIZE.ninput_t1(address());
        }

        @NativeType("stbir_input_callback **")
        public PointerBuffer input_cb(int capacity) {
            return STBIR_RESIZE.ninput_cb(address(), capacity);
        }

        @NativeType("void *")
        public ByteBuffer output_pixels(int capacity) {
            return STBIR_RESIZE.noutput_pixels(address(), capacity);
        }

        public int output_w() {
            return STBIR_RESIZE.noutput_w(address());
        }

        public int output_h() {
            return STBIR_RESIZE.noutput_h(address());
        }

        public int output_subx() {
            return STBIR_RESIZE.noutput_subx(address());
        }

        public int output_suby() {
            return STBIR_RESIZE.noutput_suby(address());
        }

        public int output_subw() {
            return STBIR_RESIZE.noutput_subw(address());
        }

        public int output_subh() {
            return STBIR_RESIZE.noutput_subh(address());
        }

        @NativeType("stbir_output_callback **")
        public PointerBuffer output_cb(int capacity) {
            return STBIR_RESIZE.noutput_cb(address(), capacity);
        }

        public int input_stride_in_bytes() {
            return STBIR_RESIZE.ninput_stride_in_bytes(address());
        }

        public int output_stride_in_bytes() {
            return STBIR_RESIZE.noutput_stride_in_bytes(address());
        }

        public int splits() {
            return STBIR_RESIZE.nsplits(address());
        }

        @NativeType("int")
        public boolean fast_alpha() {
            return STBIR_RESIZE.nfast_alpha(address()) != 0;
        }

        @NativeType("int")
        public boolean needs_rebuild() {
            return STBIR_RESIZE.nneeds_rebuild(address()) != 0;
        }

        @NativeType("int")
        public boolean called_alloc() {
            return STBIR_RESIZE.ncalled_alloc(address()) != 0;
        }

        @NativeType("stbir_pixel_layout")
        public int input_pixel_layout_public() {
            return STBIR_RESIZE.ninput_pixel_layout_public(address());
        }

        @NativeType("stbir_pixel_layout")
        public int output_pixel_layout_public() {
            return STBIR_RESIZE.noutput_pixel_layout_public(address());
        }

        @NativeType("stbir_datatype")
        public int input_data_type() {
            return STBIR_RESIZE.ninput_data_type(address());
        }

        @NativeType("stbir_datatype")
        public int output_data_type() {
            return STBIR_RESIZE.noutput_data_type(address());
        }

        @NativeType("stbir_filter")
        public int horizontal_filter() {
            return STBIR_RESIZE.nhorizontal_filter(address());
        }

        @NativeType("stbir_filter")
        public int vertical_filter() {
            return STBIR_RESIZE.nvertical_filter(address());
        }

        @NativeType("stbir_edge")
        public int horizontal_edge() {
            return STBIR_RESIZE.nhorizontal_edge(address());
        }

        @NativeType("stbir_edge")
        public int vertical_edge() {
            return STBIR_RESIZE.nvertical_edge(address());
        }

        @NativeType("stbir__kernel_callback **")
        public PointerBuffer horizontal_filter_kernel(int capacity) {
            return STBIR_RESIZE.nhorizontal_filter_kernel(address(), capacity);
        }

        @NativeType("stbir__support_callback **")
        public PointerBuffer horizontal_filter_support(int capacity) {
            return STBIR_RESIZE.nhorizontal_filter_support(address(), capacity);
        }

        @NativeType("stbir__kernel_callback **")
        public PointerBuffer vertical_filter_kernel(int capacity) {
            return STBIR_RESIZE.nvertical_filter_kernel(address(), capacity);
        }

        @NativeType("stbir__support_callback **")
        public PointerBuffer vertical_filter_support(int capacity) {
            return STBIR_RESIZE.nvertical_filter_support(address(), capacity);
        }

        @NativeType("stbir__info *")
        public long samplers() {
            return STBIR_RESIZE.nsamplers(address());
        }

        public Buffer user_data(@NativeType("void *") long value) {
            STBIR_RESIZE.nuser_data(address(), value);
            return this;
        }

        public Buffer input_pixels(@NativeType("void const *") ByteBuffer value) {
            STBIR_RESIZE.ninput_pixels(address(), value);
            return this;
        }

        public Buffer input_w(int value) {
            STBIR_RESIZE.ninput_w(address(), value);
            return this;
        }

        public Buffer input_h(int value) {
            STBIR_RESIZE.ninput_h(address(), value);
            return this;
        }

        public Buffer input_s0(double value) {
            STBIR_RESIZE.ninput_s0(address(), value);
            return this;
        }

        public Buffer input_t0(double value) {
            STBIR_RESIZE.ninput_t0(address(), value);
            return this;
        }

        public Buffer input_s1(double value) {
            STBIR_RESIZE.ninput_s1(address(), value);
            return this;
        }

        public Buffer input_t1(double value) {
            STBIR_RESIZE.ninput_t1(address(), value);
            return this;
        }

        public Buffer input_cb(@NativeType("stbir_input_callback **") PointerBuffer value) {
            STBIR_RESIZE.ninput_cb(address(), value);
            return this;
        }

        public Buffer output_pixels(@NativeType("void *") ByteBuffer value) {
            STBIR_RESIZE.noutput_pixels(address(), value);
            return this;
        }

        public Buffer output_w(int value) {
            STBIR_RESIZE.noutput_w(address(), value);
            return this;
        }

        public Buffer output_h(int value) {
            STBIR_RESIZE.noutput_h(address(), value);
            return this;
        }

        public Buffer output_subx(int value) {
            STBIR_RESIZE.noutput_subx(address(), value);
            return this;
        }

        public Buffer output_suby(int value) {
            STBIR_RESIZE.noutput_suby(address(), value);
            return this;
        }

        public Buffer output_subw(int value) {
            STBIR_RESIZE.noutput_subw(address(), value);
            return this;
        }

        public Buffer output_subh(int value) {
            STBIR_RESIZE.noutput_subh(address(), value);
            return this;
        }

        public Buffer output_cb(@NativeType("stbir_output_callback **") PointerBuffer value) {
            STBIR_RESIZE.noutput_cb(address(), value);
            return this;
        }

        public Buffer input_stride_in_bytes(int value) {
            STBIR_RESIZE.ninput_stride_in_bytes(address(), value);
            return this;
        }

        public Buffer output_stride_in_bytes(int value) {
            STBIR_RESIZE.noutput_stride_in_bytes(address(), value);
            return this;
        }

        public Buffer splits(int value) {
            STBIR_RESIZE.nsplits(address(), value);
            return this;
        }

        public Buffer fast_alpha(@NativeType("int") boolean value) {
            STBIR_RESIZE.nfast_alpha(address(), value ? 1 : 0);
            return this;
        }

        public Buffer needs_rebuild(@NativeType("int") boolean value) {
            STBIR_RESIZE.nneeds_rebuild(address(), value ? 1 : 0);
            return this;
        }

        public Buffer called_alloc(@NativeType("int") boolean value) {
            STBIR_RESIZE.ncalled_alloc(address(), value ? 1 : 0);
            return this;
        }

        public Buffer input_pixel_layout_public(@NativeType("stbir_pixel_layout") int value) {
            STBIR_RESIZE.ninput_pixel_layout_public(address(), value);
            return this;
        }

        public Buffer output_pixel_layout_public(@NativeType("stbir_pixel_layout") int value) {
            STBIR_RESIZE.noutput_pixel_layout_public(address(), value);
            return this;
        }

        public Buffer input_data_type(@NativeType("stbir_datatype") int value) {
            STBIR_RESIZE.ninput_data_type(address(), value);
            return this;
        }

        public Buffer output_data_type(@NativeType("stbir_datatype") int value) {
            STBIR_RESIZE.noutput_data_type(address(), value);
            return this;
        }

        public Buffer horizontal_filter(@NativeType("stbir_filter") int value) {
            STBIR_RESIZE.nhorizontal_filter(address(), value);
            return this;
        }

        public Buffer vertical_filter(@NativeType("stbir_filter") int value) {
            STBIR_RESIZE.nvertical_filter(address(), value);
            return this;
        }

        public Buffer horizontal_edge(@NativeType("stbir_edge") int value) {
            STBIR_RESIZE.nhorizontal_edge(address(), value);
            return this;
        }

        public Buffer vertical_edge(@NativeType("stbir_edge") int value) {
            STBIR_RESIZE.nvertical_edge(address(), value);
            return this;
        }

        public Buffer horizontal_filter_kernel(@NativeType("stbir__kernel_callback **") PointerBuffer value) {
            STBIR_RESIZE.nhorizontal_filter_kernel(address(), value);
            return this;
        }

        public Buffer horizontal_filter_support(@NativeType("stbir__support_callback **") PointerBuffer value) {
            STBIR_RESIZE.nhorizontal_filter_support(address(), value);
            return this;
        }

        public Buffer vertical_filter_kernel(@NativeType("stbir__kernel_callback **") PointerBuffer value) {
            STBIR_RESIZE.nvertical_filter_kernel(address(), value);
            return this;
        }

        public Buffer vertical_filter_support(@NativeType("stbir__support_callback **") PointerBuffer value) {
            STBIR_RESIZE.nvertical_filter_support(address(), value);
            return this;
        }

        public Buffer samplers(@NativeType("stbir__info *") long value) {
            STBIR_RESIZE.nsamplers(address(), value);
            return this;
        }
    }
}
