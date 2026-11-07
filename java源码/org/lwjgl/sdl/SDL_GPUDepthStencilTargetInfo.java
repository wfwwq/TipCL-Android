package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUDepthStencilTargetInfo.class */
public class SDL_GPUDepthStencilTargetInfo extends Struct<SDL_GPUDepthStencilTargetInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TEXTURE;
    public static final int CLEAR_DEPTH;
    public static final int LOAD_OP;
    public static final int STORE_OP;
    public static final int STENCIL_LOAD_OP;
    public static final int STENCIL_STORE_OP;
    public static final int CYCLE;
    public static final int CLEAR_STENCIL;
    public static final int MIP_LEVEL;
    public static final int LAYER;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TEXTURE = layout.offsetof(0);
        CLEAR_DEPTH = layout.offsetof(1);
        LOAD_OP = layout.offsetof(2);
        STORE_OP = layout.offsetof(3);
        STENCIL_LOAD_OP = layout.offsetof(4);
        STENCIL_STORE_OP = layout.offsetof(5);
        CYCLE = layout.offsetof(6);
        CLEAR_STENCIL = layout.offsetof(7);
        MIP_LEVEL = layout.offsetof(8);
        LAYER = layout.offsetof(9);
    }

    protected SDL_GPUDepthStencilTargetInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUDepthStencilTargetInfo create(long address, ByteBuffer container) {
        return new SDL_GPUDepthStencilTargetInfo(address, container);
    }

    public SDL_GPUDepthStencilTargetInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUTexture *")
    public long texture() {
        return ntexture(address());
    }

    public float clear_depth() {
        return nclear_depth(address());
    }

    @NativeType("SDL_GPULoadOp")
    public int load_op() {
        return nload_op(address());
    }

    @NativeType("SDL_GPUStoreOp")
    public int store_op() {
        return nstore_op(address());
    }

    @NativeType("SDL_GPULoadOp")
    public int stencil_load_op() {
        return nstencil_load_op(address());
    }

    @NativeType("SDL_GPUStoreOp")
    public int stencil_store_op() {
        return nstencil_store_op(address());
    }

    @NativeType("bool")
    public boolean cycle() {
        return ncycle(address());
    }

    @NativeType("Uint8")
    public byte clear_stencil() {
        return nclear_stencil(address());
    }

    @NativeType("Uint8")
    public byte mip_level() {
        return nmip_level(address());
    }

    @NativeType("Uint8")
    public byte layer() {
        return nlayer(address());
    }

    public SDL_GPUDepthStencilTargetInfo texture(@NativeType("SDL_GPUTexture *") long value) {
        ntexture(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo clear_depth(float value) {
        nclear_depth(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo load_op(@NativeType("SDL_GPULoadOp") int value) {
        nload_op(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo store_op(@NativeType("SDL_GPUStoreOp") int value) {
        nstore_op(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo stencil_load_op(@NativeType("SDL_GPULoadOp") int value) {
        nstencil_load_op(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo stencil_store_op(@NativeType("SDL_GPUStoreOp") int value) {
        nstencil_store_op(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo cycle(@NativeType("bool") boolean value) {
        ncycle(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo clear_stencil(@NativeType("Uint8") byte value) {
        nclear_stencil(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo mip_level(@NativeType("Uint8") byte value) {
        nmip_level(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo layer(@NativeType("Uint8") byte value) {
        nlayer(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo set(long texture, float clear_depth, int load_op, int store_op, int stencil_load_op, int stencil_store_op, boolean cycle, byte clear_stencil, byte mip_level, byte layer) {
        texture(texture);
        clear_depth(clear_depth);
        load_op(load_op);
        store_op(store_op);
        stencil_load_op(stencil_load_op);
        stencil_store_op(stencil_store_op);
        cycle(cycle);
        clear_stencil(clear_stencil);
        mip_level(mip_level);
        layer(layer);
        return this;
    }

    public SDL_GPUDepthStencilTargetInfo set(SDL_GPUDepthStencilTargetInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUDepthStencilTargetInfo malloc() {
        return new SDL_GPUDepthStencilTargetInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUDepthStencilTargetInfo calloc() {
        return new SDL_GPUDepthStencilTargetInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUDepthStencilTargetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUDepthStencilTargetInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUDepthStencilTargetInfo create(long address) {
        return new SDL_GPUDepthStencilTargetInfo(address, null);
    }

    public static SDL_GPUDepthStencilTargetInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUDepthStencilTargetInfo(address, null);
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

    public static SDL_GPUDepthStencilTargetInfo malloc(MemoryStack stack) {
        return new SDL_GPUDepthStencilTargetInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUDepthStencilTargetInfo calloc(MemoryStack stack) {
        return new SDL_GPUDepthStencilTargetInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ntexture(long struct) {
        return MemoryUtil.memGetAddress(struct + TEXTURE);
    }

    public static float nclear_depth(long struct) {
        return MemoryUtil.memGetFloat(struct + CLEAR_DEPTH);
    }

    public static int nload_op(long struct) {
        return MemoryUtil.memGetInt(struct + LOAD_OP);
    }

    public static int nstore_op(long struct) {
        return MemoryUtil.memGetInt(struct + STORE_OP);
    }

    public static int nstencil_load_op(long struct) {
        return MemoryUtil.memGetInt(struct + STENCIL_LOAD_OP);
    }

    public static int nstencil_store_op(long struct) {
        return MemoryUtil.memGetInt(struct + STENCIL_STORE_OP);
    }

    public static boolean ncycle(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) CYCLE)) != 0;
    }

    public static byte nclear_stencil(long struct) {
        return MemoryUtil.memGetByte(struct + CLEAR_STENCIL);
    }

    public static byte nmip_level(long struct) {
        return MemoryUtil.memGetByte(struct + MIP_LEVEL);
    }

    public static byte nlayer(long struct) {
        return MemoryUtil.memGetByte(struct + LAYER);
    }

    public static void ntexture(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TEXTURE, Checks.check(value));
    }

    public static void nclear_depth(long struct, float value) {
        MemoryUtil.memPutFloat(struct + CLEAR_DEPTH, value);
    }

    public static void nload_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOAD_OP, value);
    }

    public static void nstore_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORE_OP, value);
    }

    public static void nstencil_load_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCIL_LOAD_OP, value);
    }

    public static void nstencil_store_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCIL_STORE_OP, value);
    }

    public static void ncycle(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + CYCLE, value ? (byte) 1 : (byte) 0);
    }

    public static void nclear_stencil(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CLEAR_STENCIL, value);
    }

    public static void nmip_level(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MIP_LEVEL, value);
    }

    public static void nlayer(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LAYER, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TEXTURE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUDepthStencilTargetInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUDepthStencilTargetInfo, Buffer> implements NativeResource {
        private static final SDL_GPUDepthStencilTargetInfo ELEMENT_FACTORY = SDL_GPUDepthStencilTargetInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUDepthStencilTargetInfo.SIZEOF);
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
        public SDL_GPUDepthStencilTargetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUTexture *")
        public long texture() {
            return SDL_GPUDepthStencilTargetInfo.ntexture(address());
        }

        public float clear_depth() {
            return SDL_GPUDepthStencilTargetInfo.nclear_depth(address());
        }

        @NativeType("SDL_GPULoadOp")
        public int load_op() {
            return SDL_GPUDepthStencilTargetInfo.nload_op(address());
        }

        @NativeType("SDL_GPUStoreOp")
        public int store_op() {
            return SDL_GPUDepthStencilTargetInfo.nstore_op(address());
        }

        @NativeType("SDL_GPULoadOp")
        public int stencil_load_op() {
            return SDL_GPUDepthStencilTargetInfo.nstencil_load_op(address());
        }

        @NativeType("SDL_GPUStoreOp")
        public int stencil_store_op() {
            return SDL_GPUDepthStencilTargetInfo.nstencil_store_op(address());
        }

        @NativeType("bool")
        public boolean cycle() {
            return SDL_GPUDepthStencilTargetInfo.ncycle(address());
        }

        @NativeType("Uint8")
        public byte clear_stencil() {
            return SDL_GPUDepthStencilTargetInfo.nclear_stencil(address());
        }

        @NativeType("Uint8")
        public byte mip_level() {
            return SDL_GPUDepthStencilTargetInfo.nmip_level(address());
        }

        @NativeType("Uint8")
        public byte layer() {
            return SDL_GPUDepthStencilTargetInfo.nlayer(address());
        }

        public Buffer texture(@NativeType("SDL_GPUTexture *") long value) {
            SDL_GPUDepthStencilTargetInfo.ntexture(address(), value);
            return this;
        }

        public Buffer clear_depth(float value) {
            SDL_GPUDepthStencilTargetInfo.nclear_depth(address(), value);
            return this;
        }

        public Buffer load_op(@NativeType("SDL_GPULoadOp") int value) {
            SDL_GPUDepthStencilTargetInfo.nload_op(address(), value);
            return this;
        }

        public Buffer store_op(@NativeType("SDL_GPUStoreOp") int value) {
            SDL_GPUDepthStencilTargetInfo.nstore_op(address(), value);
            return this;
        }

        public Buffer stencil_load_op(@NativeType("SDL_GPULoadOp") int value) {
            SDL_GPUDepthStencilTargetInfo.nstencil_load_op(address(), value);
            return this;
        }

        public Buffer stencil_store_op(@NativeType("SDL_GPUStoreOp") int value) {
            SDL_GPUDepthStencilTargetInfo.nstencil_store_op(address(), value);
            return this;
        }

        public Buffer cycle(@NativeType("bool") boolean value) {
            SDL_GPUDepthStencilTargetInfo.ncycle(address(), value);
            return this;
        }

        public Buffer clear_stencil(@NativeType("Uint8") byte value) {
            SDL_GPUDepthStencilTargetInfo.nclear_stencil(address(), value);
            return this;
        }

        public Buffer mip_level(@NativeType("Uint8") byte value) {
            SDL_GPUDepthStencilTargetInfo.nmip_level(address(), value);
            return this;
        }

        public Buffer layer(@NativeType("Uint8") byte value) {
            SDL_GPUDepthStencilTargetInfo.nlayer(address(), value);
            return this;
        }
    }
}
