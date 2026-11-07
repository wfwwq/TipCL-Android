package org.lwjgl.sdl;

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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUColorTargetInfo.class */
public class SDL_GPUColorTargetInfo extends Struct<SDL_GPUColorTargetInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TEXTURE;
    public static final int MIP_LEVEL;
    public static final int LAYER_OR_DEPTH_PLANE;
    public static final int CLEAR_COLOR;
    public static final int LOAD_OP;
    public static final int STORE_OP;
    public static final int RESOLVE_TEXTURE;
    public static final int RESOLVE_MIP_LEVEL;
    public static final int RESOLVE_LAYER;
    public static final int CYCLE;
    public static final int CYCLE_RESOLVE_TEXTURE;
    public static final int PADDING1;
    public static final int PADDING2;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(SDL_FColor.SIZEOF, SDL_FColor.ALIGNOF), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TEXTURE = layout.offsetof(0);
        MIP_LEVEL = layout.offsetof(1);
        LAYER_OR_DEPTH_PLANE = layout.offsetof(2);
        CLEAR_COLOR = layout.offsetof(3);
        LOAD_OP = layout.offsetof(4);
        STORE_OP = layout.offsetof(5);
        RESOLVE_TEXTURE = layout.offsetof(6);
        RESOLVE_MIP_LEVEL = layout.offsetof(7);
        RESOLVE_LAYER = layout.offsetof(8);
        CYCLE = layout.offsetof(9);
        CYCLE_RESOLVE_TEXTURE = layout.offsetof(10);
        PADDING1 = layout.offsetof(11);
        PADDING2 = layout.offsetof(12);
    }

    protected SDL_GPUColorTargetInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUColorTargetInfo create(long address, ByteBuffer container) {
        return new SDL_GPUColorTargetInfo(address, container);
    }

    public SDL_GPUColorTargetInfo(ByteBuffer container) {
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

    @NativeType("Uint32")
    public int mip_level() {
        return nmip_level(address());
    }

    @NativeType("Uint32")
    public int layer_or_depth_plane() {
        return nlayer_or_depth_plane(address());
    }

    public SDL_FColor clear_color() {
        return nclear_color(address());
    }

    @NativeType("SDL_GPULoadOp")
    public int load_op() {
        return nload_op(address());
    }

    @NativeType("SDL_GPUStoreOp")
    public int store_op() {
        return nstore_op(address());
    }

    @NativeType("SDL_GPUTexture *")
    public long resolve_texture() {
        return nresolve_texture(address());
    }

    @NativeType("Uint32")
    public int resolve_mip_level() {
        return nresolve_mip_level(address());
    }

    @NativeType("Uint32")
    public int resolve_layer() {
        return nresolve_layer(address());
    }

    @NativeType("bool")
    public boolean cycle() {
        return ncycle(address());
    }

    @NativeType("bool")
    public boolean cycle_resolve_texture() {
        return ncycle_resolve_texture(address());
    }

    public SDL_GPUColorTargetInfo texture(@NativeType("SDL_GPUTexture *") long value) {
        ntexture(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo mip_level(@NativeType("Uint32") int value) {
        nmip_level(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo layer_or_depth_plane(@NativeType("Uint32") int value) {
        nlayer_or_depth_plane(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo clear_color(SDL_FColor value) {
        nclear_color(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo clear_color(Consumer<SDL_FColor> consumer) {
        consumer.accept(clear_color());
        return this;
    }

    public SDL_GPUColorTargetInfo load_op(@NativeType("SDL_GPULoadOp") int value) {
        nload_op(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo store_op(@NativeType("SDL_GPUStoreOp") int value) {
        nstore_op(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo resolve_texture(@NativeType("SDL_GPUTexture *") long value) {
        nresolve_texture(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo resolve_mip_level(@NativeType("Uint32") int value) {
        nresolve_mip_level(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo resolve_layer(@NativeType("Uint32") int value) {
        nresolve_layer(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo cycle(@NativeType("bool") boolean value) {
        ncycle(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo cycle_resolve_texture(@NativeType("bool") boolean value) {
        ncycle_resolve_texture(address(), value);
        return this;
    }

    public SDL_GPUColorTargetInfo set(long texture, int mip_level, int layer_or_depth_plane, SDL_FColor clear_color, int load_op, int store_op, long resolve_texture, int resolve_mip_level, int resolve_layer, boolean cycle, boolean cycle_resolve_texture) {
        texture(texture);
        mip_level(mip_level);
        layer_or_depth_plane(layer_or_depth_plane);
        clear_color(clear_color);
        load_op(load_op);
        store_op(store_op);
        resolve_texture(resolve_texture);
        resolve_mip_level(resolve_mip_level);
        resolve_layer(resolve_layer);
        cycle(cycle);
        cycle_resolve_texture(cycle_resolve_texture);
        return this;
    }

    public SDL_GPUColorTargetInfo set(SDL_GPUColorTargetInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUColorTargetInfo malloc() {
        return new SDL_GPUColorTargetInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUColorTargetInfo calloc() {
        return new SDL_GPUColorTargetInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUColorTargetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUColorTargetInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUColorTargetInfo create(long address) {
        return new SDL_GPUColorTargetInfo(address, null);
    }

    public static SDL_GPUColorTargetInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUColorTargetInfo(address, null);
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

    public static SDL_GPUColorTargetInfo malloc(MemoryStack stack) {
        return new SDL_GPUColorTargetInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUColorTargetInfo calloc(MemoryStack stack) {
        return new SDL_GPUColorTargetInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmip_level(long struct) {
        return MemoryUtil.memGetInt(struct + MIP_LEVEL);
    }

    public static int nlayer_or_depth_plane(long struct) {
        return MemoryUtil.memGetInt(struct + LAYER_OR_DEPTH_PLANE);
    }

    public static SDL_FColor nclear_color(long struct) {
        return SDL_FColor.create(struct + CLEAR_COLOR);
    }

    public static int nload_op(long struct) {
        return MemoryUtil.memGetInt(struct + LOAD_OP);
    }

    public static int nstore_op(long struct) {
        return MemoryUtil.memGetInt(struct + STORE_OP);
    }

    public static long nresolve_texture(long struct) {
        return MemoryUtil.memGetAddress(struct + RESOLVE_TEXTURE);
    }

    public static int nresolve_mip_level(long struct) {
        return MemoryUtil.memGetInt(struct + RESOLVE_MIP_LEVEL);
    }

    public static int nresolve_layer(long struct) {
        return MemoryUtil.memGetInt(struct + RESOLVE_LAYER);
    }

    public static boolean ncycle(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) CYCLE)) != 0;
    }

    public static boolean ncycle_resolve_texture(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) CYCLE_RESOLVE_TEXTURE)) != 0;
    }

    public static byte npadding1(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING1);
    }

    public static byte npadding2(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING2);
    }

    public static void ntexture(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TEXTURE, Checks.check(value));
    }

    public static void nmip_level(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIP_LEVEL, value);
    }

    public static void nlayer_or_depth_plane(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYER_OR_DEPTH_PLANE, value);
    }

    public static void nclear_color(long struct, SDL_FColor value) {
        MemoryUtil.memCopy(value.address(), struct + CLEAR_COLOR, SDL_FColor.SIZEOF);
    }

    public static void nload_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOAD_OP, value);
    }

    public static void nstore_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORE_OP, value);
    }

    public static void nresolve_texture(long struct, long value) {
        MemoryUtil.memPutAddress(struct + RESOLVE_TEXTURE, value);
    }

    public static void nresolve_mip_level(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESOLVE_MIP_LEVEL, value);
    }

    public static void nresolve_layer(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESOLVE_LAYER, value);
    }

    public static void ncycle(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + CYCLE, value ? (byte) 1 : (byte) 0);
    }

    public static void ncycle_resolve_texture(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + CYCLE_RESOLVE_TEXTURE, value ? (byte) 1 : (byte) 0);
    }

    public static void npadding1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING1, value);
    }

    public static void npadding2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING2, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TEXTURE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUColorTargetInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUColorTargetInfo, Buffer> implements NativeResource {
        private static final SDL_GPUColorTargetInfo ELEMENT_FACTORY = SDL_GPUColorTargetInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUColorTargetInfo.SIZEOF);
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
        public SDL_GPUColorTargetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUTexture *")
        public long texture() {
            return SDL_GPUColorTargetInfo.ntexture(address());
        }

        @NativeType("Uint32")
        public int mip_level() {
            return SDL_GPUColorTargetInfo.nmip_level(address());
        }

        @NativeType("Uint32")
        public int layer_or_depth_plane() {
            return SDL_GPUColorTargetInfo.nlayer_or_depth_plane(address());
        }

        public SDL_FColor clear_color() {
            return SDL_GPUColorTargetInfo.nclear_color(address());
        }

        @NativeType("SDL_GPULoadOp")
        public int load_op() {
            return SDL_GPUColorTargetInfo.nload_op(address());
        }

        @NativeType("SDL_GPUStoreOp")
        public int store_op() {
            return SDL_GPUColorTargetInfo.nstore_op(address());
        }

        @NativeType("SDL_GPUTexture *")
        public long resolve_texture() {
            return SDL_GPUColorTargetInfo.nresolve_texture(address());
        }

        @NativeType("Uint32")
        public int resolve_mip_level() {
            return SDL_GPUColorTargetInfo.nresolve_mip_level(address());
        }

        @NativeType("Uint32")
        public int resolve_layer() {
            return SDL_GPUColorTargetInfo.nresolve_layer(address());
        }

        @NativeType("bool")
        public boolean cycle() {
            return SDL_GPUColorTargetInfo.ncycle(address());
        }

        @NativeType("bool")
        public boolean cycle_resolve_texture() {
            return SDL_GPUColorTargetInfo.ncycle_resolve_texture(address());
        }

        public Buffer texture(@NativeType("SDL_GPUTexture *") long value) {
            SDL_GPUColorTargetInfo.ntexture(address(), value);
            return this;
        }

        public Buffer mip_level(@NativeType("Uint32") int value) {
            SDL_GPUColorTargetInfo.nmip_level(address(), value);
            return this;
        }

        public Buffer layer_or_depth_plane(@NativeType("Uint32") int value) {
            SDL_GPUColorTargetInfo.nlayer_or_depth_plane(address(), value);
            return this;
        }

        public Buffer clear_color(SDL_FColor value) {
            SDL_GPUColorTargetInfo.nclear_color(address(), value);
            return this;
        }

        public Buffer clear_color(Consumer<SDL_FColor> consumer) {
            consumer.accept(clear_color());
            return this;
        }

        public Buffer load_op(@NativeType("SDL_GPULoadOp") int value) {
            SDL_GPUColorTargetInfo.nload_op(address(), value);
            return this;
        }

        public Buffer store_op(@NativeType("SDL_GPUStoreOp") int value) {
            SDL_GPUColorTargetInfo.nstore_op(address(), value);
            return this;
        }

        public Buffer resolve_texture(@NativeType("SDL_GPUTexture *") long value) {
            SDL_GPUColorTargetInfo.nresolve_texture(address(), value);
            return this;
        }

        public Buffer resolve_mip_level(@NativeType("Uint32") int value) {
            SDL_GPUColorTargetInfo.nresolve_mip_level(address(), value);
            return this;
        }

        public Buffer resolve_layer(@NativeType("Uint32") int value) {
            SDL_GPUColorTargetInfo.nresolve_layer(address(), value);
            return this;
        }

        public Buffer cycle(@NativeType("bool") boolean value) {
            SDL_GPUColorTargetInfo.ncycle(address(), value);
            return this;
        }

        public Buffer cycle_resolve_texture(@NativeType("bool") boolean value) {
            SDL_GPUColorTargetInfo.ncycle_resolve_texture(address(), value);
            return this;
        }
    }
}
