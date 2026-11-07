package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUColorTargetBlendState.class */
public class SDL_GPUColorTargetBlendState extends Struct<SDL_GPUColorTargetBlendState> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRC_COLOR_BLENDFACTOR;
    public static final int DST_COLOR_BLENDFACTOR;
    public static final int COLOR_BLEND_OP;
    public static final int SRC_ALPHA_BLENDFACTOR;
    public static final int DST_ALPHA_BLENDFACTOR;
    public static final int ALPHA_BLEND_OP;
    public static final int COLOR_WRITE_MASK;
    public static final int ENABLE_BLEND;
    public static final int ENABLE_COLOR_WRITE_MASK;
    public static final int PADDING1;
    public static final int PADDING2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRC_COLOR_BLENDFACTOR = layout.offsetof(0);
        DST_COLOR_BLENDFACTOR = layout.offsetof(1);
        COLOR_BLEND_OP = layout.offsetof(2);
        SRC_ALPHA_BLENDFACTOR = layout.offsetof(3);
        DST_ALPHA_BLENDFACTOR = layout.offsetof(4);
        ALPHA_BLEND_OP = layout.offsetof(5);
        COLOR_WRITE_MASK = layout.offsetof(6);
        ENABLE_BLEND = layout.offsetof(7);
        ENABLE_COLOR_WRITE_MASK = layout.offsetof(8);
        PADDING1 = layout.offsetof(9);
        PADDING2 = layout.offsetof(10);
    }

    protected SDL_GPUColorTargetBlendState(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUColorTargetBlendState create(long address, ByteBuffer container) {
        return new SDL_GPUColorTargetBlendState(address, container);
    }

    public SDL_GPUColorTargetBlendState(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUBlendFactor")
    public int src_color_blendfactor() {
        return nsrc_color_blendfactor(address());
    }

    @NativeType("SDL_GPUBlendFactor")
    public int dst_color_blendfactor() {
        return ndst_color_blendfactor(address());
    }

    @NativeType("SDL_GPUBlendOp")
    public int color_blend_op() {
        return ncolor_blend_op(address());
    }

    @NativeType("SDL_GPUBlendFactor")
    public int src_alpha_blendfactor() {
        return nsrc_alpha_blendfactor(address());
    }

    @NativeType("SDL_GPUBlendFactor")
    public int dst_alpha_blendfactor() {
        return ndst_alpha_blendfactor(address());
    }

    @NativeType("SDL_GPUBlendOp")
    public int alpha_blend_op() {
        return nalpha_blend_op(address());
    }

    @NativeType("SDL_GPUColorComponentFlags")
    public byte color_write_mask() {
        return ncolor_write_mask(address());
    }

    @NativeType("bool")
    public boolean enable_blend() {
        return nenable_blend(address());
    }

    @NativeType("bool")
    public boolean enable_color_write_mask() {
        return nenable_color_write_mask(address());
    }

    public SDL_GPUColorTargetBlendState src_color_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) {
        nsrc_color_blendfactor(address(), value);
        return this;
    }

    public SDL_GPUColorTargetBlendState dst_color_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) {
        ndst_color_blendfactor(address(), value);
        return this;
    }

    public SDL_GPUColorTargetBlendState color_blend_op(@NativeType("SDL_GPUBlendOp") int value) {
        ncolor_blend_op(address(), value);
        return this;
    }

    public SDL_GPUColorTargetBlendState src_alpha_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) {
        nsrc_alpha_blendfactor(address(), value);
        return this;
    }

    public SDL_GPUColorTargetBlendState dst_alpha_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) {
        ndst_alpha_blendfactor(address(), value);
        return this;
    }

    public SDL_GPUColorTargetBlendState alpha_blend_op(@NativeType("SDL_GPUBlendOp") int value) {
        nalpha_blend_op(address(), value);
        return this;
    }

    public SDL_GPUColorTargetBlendState color_write_mask(@NativeType("SDL_GPUColorComponentFlags") byte value) {
        ncolor_write_mask(address(), value);
        return this;
    }

    public SDL_GPUColorTargetBlendState enable_blend(@NativeType("bool") boolean value) {
        nenable_blend(address(), value);
        return this;
    }

    public SDL_GPUColorTargetBlendState enable_color_write_mask(@NativeType("bool") boolean value) {
        nenable_color_write_mask(address(), value);
        return this;
    }

    public SDL_GPUColorTargetBlendState set(int src_color_blendfactor, int dst_color_blendfactor, int color_blend_op, int src_alpha_blendfactor, int dst_alpha_blendfactor, int alpha_blend_op, byte color_write_mask, boolean enable_blend, boolean enable_color_write_mask) {
        src_color_blendfactor(src_color_blendfactor);
        dst_color_blendfactor(dst_color_blendfactor);
        color_blend_op(color_blend_op);
        src_alpha_blendfactor(src_alpha_blendfactor);
        dst_alpha_blendfactor(dst_alpha_blendfactor);
        alpha_blend_op(alpha_blend_op);
        color_write_mask(color_write_mask);
        enable_blend(enable_blend);
        enable_color_write_mask(enable_color_write_mask);
        return this;
    }

    public SDL_GPUColorTargetBlendState set(SDL_GPUColorTargetBlendState src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUColorTargetBlendState malloc() {
        return new SDL_GPUColorTargetBlendState(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUColorTargetBlendState calloc() {
        return new SDL_GPUColorTargetBlendState(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUColorTargetBlendState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUColorTargetBlendState(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUColorTargetBlendState create(long address) {
        return new SDL_GPUColorTargetBlendState(address, null);
    }

    public static SDL_GPUColorTargetBlendState createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUColorTargetBlendState(address, null);
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

    public static SDL_GPUColorTargetBlendState malloc(MemoryStack stack) {
        return new SDL_GPUColorTargetBlendState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUColorTargetBlendState calloc(MemoryStack stack) {
        return new SDL_GPUColorTargetBlendState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsrc_color_blendfactor(long struct) {
        return MemoryUtil.memGetInt(struct + SRC_COLOR_BLENDFACTOR);
    }

    public static int ndst_color_blendfactor(long struct) {
        return MemoryUtil.memGetInt(struct + DST_COLOR_BLENDFACTOR);
    }

    public static int ncolor_blend_op(long struct) {
        return MemoryUtil.memGetInt(struct + COLOR_BLEND_OP);
    }

    public static int nsrc_alpha_blendfactor(long struct) {
        return MemoryUtil.memGetInt(struct + SRC_ALPHA_BLENDFACTOR);
    }

    public static int ndst_alpha_blendfactor(long struct) {
        return MemoryUtil.memGetInt(struct + DST_ALPHA_BLENDFACTOR);
    }

    public static int nalpha_blend_op(long struct) {
        return MemoryUtil.memGetInt(struct + ALPHA_BLEND_OP);
    }

    public static byte ncolor_write_mask(long struct) {
        return MemoryUtil.memGetByte(struct + COLOR_WRITE_MASK);
    }

    public static boolean nenable_blend(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_BLEND)) != 0;
    }

    public static boolean nenable_color_write_mask(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_COLOR_WRITE_MASK)) != 0;
    }

    public static byte npadding1(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING1);
    }

    public static byte npadding2(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING2);
    }

    public static void nsrc_color_blendfactor(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRC_COLOR_BLENDFACTOR, value);
    }

    public static void ndst_color_blendfactor(long struct, int value) {
        MemoryUtil.memPutInt(struct + DST_COLOR_BLENDFACTOR, value);
    }

    public static void ncolor_blend_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLOR_BLEND_OP, value);
    }

    public static void nsrc_alpha_blendfactor(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRC_ALPHA_BLENDFACTOR, value);
    }

    public static void ndst_alpha_blendfactor(long struct, int value) {
        MemoryUtil.memPutInt(struct + DST_ALPHA_BLENDFACTOR, value);
    }

    public static void nalpha_blend_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + ALPHA_BLEND_OP, value);
    }

    public static void ncolor_write_mask(long struct, byte value) {
        MemoryUtil.memPutByte(struct + COLOR_WRITE_MASK, value);
    }

    public static void nenable_blend(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_BLEND, value ? (byte) 1 : (byte) 0);
    }

    public static void nenable_color_write_mask(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_COLOR_WRITE_MASK, value ? (byte) 1 : (byte) 0);
    }

    public static void npadding1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING1, value);
    }

    public static void npadding2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING2, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUColorTargetBlendState$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUColorTargetBlendState, Buffer> implements NativeResource {
        private static final SDL_GPUColorTargetBlendState ELEMENT_FACTORY = SDL_GPUColorTargetBlendState.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUColorTargetBlendState.SIZEOF);
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
        public SDL_GPUColorTargetBlendState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUBlendFactor")
        public int src_color_blendfactor() {
            return SDL_GPUColorTargetBlendState.nsrc_color_blendfactor(address());
        }

        @NativeType("SDL_GPUBlendFactor")
        public int dst_color_blendfactor() {
            return SDL_GPUColorTargetBlendState.ndst_color_blendfactor(address());
        }

        @NativeType("SDL_GPUBlendOp")
        public int color_blend_op() {
            return SDL_GPUColorTargetBlendState.ncolor_blend_op(address());
        }

        @NativeType("SDL_GPUBlendFactor")
        public int src_alpha_blendfactor() {
            return SDL_GPUColorTargetBlendState.nsrc_alpha_blendfactor(address());
        }

        @NativeType("SDL_GPUBlendFactor")
        public int dst_alpha_blendfactor() {
            return SDL_GPUColorTargetBlendState.ndst_alpha_blendfactor(address());
        }

        @NativeType("SDL_GPUBlendOp")
        public int alpha_blend_op() {
            return SDL_GPUColorTargetBlendState.nalpha_blend_op(address());
        }

        @NativeType("SDL_GPUColorComponentFlags")
        public byte color_write_mask() {
            return SDL_GPUColorTargetBlendState.ncolor_write_mask(address());
        }

        @NativeType("bool")
        public boolean enable_blend() {
            return SDL_GPUColorTargetBlendState.nenable_blend(address());
        }

        @NativeType("bool")
        public boolean enable_color_write_mask() {
            return SDL_GPUColorTargetBlendState.nenable_color_write_mask(address());
        }

        public Buffer src_color_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) {
            SDL_GPUColorTargetBlendState.nsrc_color_blendfactor(address(), value);
            return this;
        }

        public Buffer dst_color_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) {
            SDL_GPUColorTargetBlendState.ndst_color_blendfactor(address(), value);
            return this;
        }

        public Buffer color_blend_op(@NativeType("SDL_GPUBlendOp") int value) {
            SDL_GPUColorTargetBlendState.ncolor_blend_op(address(), value);
            return this;
        }

        public Buffer src_alpha_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) {
            SDL_GPUColorTargetBlendState.nsrc_alpha_blendfactor(address(), value);
            return this;
        }

        public Buffer dst_alpha_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) {
            SDL_GPUColorTargetBlendState.ndst_alpha_blendfactor(address(), value);
            return this;
        }

        public Buffer alpha_blend_op(@NativeType("SDL_GPUBlendOp") int value) {
            SDL_GPUColorTargetBlendState.nalpha_blend_op(address(), value);
            return this;
        }

        public Buffer color_write_mask(@NativeType("SDL_GPUColorComponentFlags") byte value) {
            SDL_GPUColorTargetBlendState.ncolor_write_mask(address(), value);
            return this;
        }

        public Buffer enable_blend(@NativeType("bool") boolean value) {
            SDL_GPUColorTargetBlendState.nenable_blend(address(), value);
            return this;
        }

        public Buffer enable_color_write_mask(@NativeType("bool") boolean value) {
            SDL_GPUColorTargetBlendState.nenable_color_write_mask(address(), value);
            return this;
        }
    }
}
