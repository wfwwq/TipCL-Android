package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPURasterizerState.class */
public class SDL_GPURasterizerState extends Struct<SDL_GPURasterizerState> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FILL_MODE;
    public static final int CULL_MODE;
    public static final int FRONT_FACE;
    public static final int DEPTH_BIAS_CONSTANT_FACTOR;
    public static final int DEPTH_BIAS_CLAMP;
    public static final int DEPTH_BIAS_SLOPE_FACTOR;
    public static final int ENABLE_DEPTH_BIAS;
    public static final int ENABLE_DEPTH_CLIP;
    public static final int PADDING1;
    public static final int PADDING2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FILL_MODE = layout.offsetof(0);
        CULL_MODE = layout.offsetof(1);
        FRONT_FACE = layout.offsetof(2);
        DEPTH_BIAS_CONSTANT_FACTOR = layout.offsetof(3);
        DEPTH_BIAS_CLAMP = layout.offsetof(4);
        DEPTH_BIAS_SLOPE_FACTOR = layout.offsetof(5);
        ENABLE_DEPTH_BIAS = layout.offsetof(6);
        ENABLE_DEPTH_CLIP = layout.offsetof(7);
        PADDING1 = layout.offsetof(8);
        PADDING2 = layout.offsetof(9);
    }

    protected SDL_GPURasterizerState(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPURasterizerState create(long address, ByteBuffer container) {
        return new SDL_GPURasterizerState(address, container);
    }

    public SDL_GPURasterizerState(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUFillMode")
    public int fill_mode() {
        return nfill_mode(address());
    }

    @NativeType("SDL_GPUCullMode")
    public int cull_mode() {
        return ncull_mode(address());
    }

    @NativeType("SDL_GPUFrontFace")
    public int front_face() {
        return nfront_face(address());
    }

    public float depth_bias_constant_factor() {
        return ndepth_bias_constant_factor(address());
    }

    public float depth_bias_clamp() {
        return ndepth_bias_clamp(address());
    }

    public float depth_bias_slope_factor() {
        return ndepth_bias_slope_factor(address());
    }

    @NativeType("bool")
    public boolean enable_depth_bias() {
        return nenable_depth_bias(address());
    }

    @NativeType("bool")
    public boolean enable_depth_clip() {
        return nenable_depth_clip(address());
    }

    public SDL_GPURasterizerState fill_mode(@NativeType("SDL_GPUFillMode") int value) {
        nfill_mode(address(), value);
        return this;
    }

    public SDL_GPURasterizerState cull_mode(@NativeType("SDL_GPUCullMode") int value) {
        ncull_mode(address(), value);
        return this;
    }

    public SDL_GPURasterizerState front_face(@NativeType("SDL_GPUFrontFace") int value) {
        nfront_face(address(), value);
        return this;
    }

    public SDL_GPURasterizerState depth_bias_constant_factor(float value) {
        ndepth_bias_constant_factor(address(), value);
        return this;
    }

    public SDL_GPURasterizerState depth_bias_clamp(float value) {
        ndepth_bias_clamp(address(), value);
        return this;
    }

    public SDL_GPURasterizerState depth_bias_slope_factor(float value) {
        ndepth_bias_slope_factor(address(), value);
        return this;
    }

    public SDL_GPURasterizerState enable_depth_bias(@NativeType("bool") boolean value) {
        nenable_depth_bias(address(), value);
        return this;
    }

    public SDL_GPURasterizerState enable_depth_clip(@NativeType("bool") boolean value) {
        nenable_depth_clip(address(), value);
        return this;
    }

    public SDL_GPURasterizerState set(int fill_mode, int cull_mode, int front_face, float depth_bias_constant_factor, float depth_bias_clamp, float depth_bias_slope_factor, boolean enable_depth_bias, boolean enable_depth_clip) {
        fill_mode(fill_mode);
        cull_mode(cull_mode);
        front_face(front_face);
        depth_bias_constant_factor(depth_bias_constant_factor);
        depth_bias_clamp(depth_bias_clamp);
        depth_bias_slope_factor(depth_bias_slope_factor);
        enable_depth_bias(enable_depth_bias);
        enable_depth_clip(enable_depth_clip);
        return this;
    }

    public SDL_GPURasterizerState set(SDL_GPURasterizerState src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPURasterizerState malloc() {
        return new SDL_GPURasterizerState(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPURasterizerState calloc() {
        return new SDL_GPURasterizerState(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPURasterizerState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPURasterizerState(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPURasterizerState create(long address) {
        return new SDL_GPURasterizerState(address, null);
    }

    public static SDL_GPURasterizerState createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPURasterizerState(address, null);
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

    public static SDL_GPURasterizerState malloc(MemoryStack stack) {
        return new SDL_GPURasterizerState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPURasterizerState calloc(MemoryStack stack) {
        return new SDL_GPURasterizerState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nfill_mode(long struct) {
        return MemoryUtil.memGetInt(struct + FILL_MODE);
    }

    public static int ncull_mode(long struct) {
        return MemoryUtil.memGetInt(struct + CULL_MODE);
    }

    public static int nfront_face(long struct) {
        return MemoryUtil.memGetInt(struct + FRONT_FACE);
    }

    public static float ndepth_bias_constant_factor(long struct) {
        return MemoryUtil.memGetFloat(struct + DEPTH_BIAS_CONSTANT_FACTOR);
    }

    public static float ndepth_bias_clamp(long struct) {
        return MemoryUtil.memGetFloat(struct + DEPTH_BIAS_CLAMP);
    }

    public static float ndepth_bias_slope_factor(long struct) {
        return MemoryUtil.memGetFloat(struct + DEPTH_BIAS_SLOPE_FACTOR);
    }

    public static boolean nenable_depth_bias(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_DEPTH_BIAS)) != 0;
    }

    public static boolean nenable_depth_clip(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_DEPTH_CLIP)) != 0;
    }

    public static byte npadding1(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING1);
    }

    public static byte npadding2(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING2);
    }

    public static void nfill_mode(long struct, int value) {
        MemoryUtil.memPutInt(struct + FILL_MODE, value);
    }

    public static void ncull_mode(long struct, int value) {
        MemoryUtil.memPutInt(struct + CULL_MODE, value);
    }

    public static void nfront_face(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRONT_FACE, value);
    }

    public static void ndepth_bias_constant_factor(long struct, float value) {
        MemoryUtil.memPutFloat(struct + DEPTH_BIAS_CONSTANT_FACTOR, value);
    }

    public static void ndepth_bias_clamp(long struct, float value) {
        MemoryUtil.memPutFloat(struct + DEPTH_BIAS_CLAMP, value);
    }

    public static void ndepth_bias_slope_factor(long struct, float value) {
        MemoryUtil.memPutFloat(struct + DEPTH_BIAS_SLOPE_FACTOR, value);
    }

    public static void nenable_depth_bias(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_DEPTH_BIAS, value ? (byte) 1 : (byte) 0);
    }

    public static void nenable_depth_clip(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_DEPTH_CLIP, value ? (byte) 1 : (byte) 0);
    }

    public static void npadding1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING1, value);
    }

    public static void npadding2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING2, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPURasterizerState$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPURasterizerState, Buffer> implements NativeResource {
        private static final SDL_GPURasterizerState ELEMENT_FACTORY = SDL_GPURasterizerState.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPURasterizerState.SIZEOF);
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
        public SDL_GPURasterizerState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUFillMode")
        public int fill_mode() {
            return SDL_GPURasterizerState.nfill_mode(address());
        }

        @NativeType("SDL_GPUCullMode")
        public int cull_mode() {
            return SDL_GPURasterizerState.ncull_mode(address());
        }

        @NativeType("SDL_GPUFrontFace")
        public int front_face() {
            return SDL_GPURasterizerState.nfront_face(address());
        }

        public float depth_bias_constant_factor() {
            return SDL_GPURasterizerState.ndepth_bias_constant_factor(address());
        }

        public float depth_bias_clamp() {
            return SDL_GPURasterizerState.ndepth_bias_clamp(address());
        }

        public float depth_bias_slope_factor() {
            return SDL_GPURasterizerState.ndepth_bias_slope_factor(address());
        }

        @NativeType("bool")
        public boolean enable_depth_bias() {
            return SDL_GPURasterizerState.nenable_depth_bias(address());
        }

        @NativeType("bool")
        public boolean enable_depth_clip() {
            return SDL_GPURasterizerState.nenable_depth_clip(address());
        }

        public Buffer fill_mode(@NativeType("SDL_GPUFillMode") int value) {
            SDL_GPURasterizerState.nfill_mode(address(), value);
            return this;
        }

        public Buffer cull_mode(@NativeType("SDL_GPUCullMode") int value) {
            SDL_GPURasterizerState.ncull_mode(address(), value);
            return this;
        }

        public Buffer front_face(@NativeType("SDL_GPUFrontFace") int value) {
            SDL_GPURasterizerState.nfront_face(address(), value);
            return this;
        }

        public Buffer depth_bias_constant_factor(float value) {
            SDL_GPURasterizerState.ndepth_bias_constant_factor(address(), value);
            return this;
        }

        public Buffer depth_bias_clamp(float value) {
            SDL_GPURasterizerState.ndepth_bias_clamp(address(), value);
            return this;
        }

        public Buffer depth_bias_slope_factor(float value) {
            SDL_GPURasterizerState.ndepth_bias_slope_factor(address(), value);
            return this;
        }

        public Buffer enable_depth_bias(@NativeType("bool") boolean value) {
            SDL_GPURasterizerState.nenable_depth_bias(address(), value);
            return this;
        }

        public Buffer enable_depth_clip(@NativeType("bool") boolean value) {
            SDL_GPURasterizerState.nenable_depth_clip(address(), value);
            return this;
        }
    }
}
