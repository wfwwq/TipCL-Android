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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUBlitRegion.class */
public class SDL_GPUBlitRegion extends Struct<SDL_GPUBlitRegion> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TEXTURE;
    public static final int MIP_LEVEL;
    public static final int LAYER_OR_DEPTH_PLANE;
    public static final int X;
    public static final int Y;
    public static final int W;
    public static final int H;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TEXTURE = layout.offsetof(0);
        MIP_LEVEL = layout.offsetof(1);
        LAYER_OR_DEPTH_PLANE = layout.offsetof(2);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
        W = layout.offsetof(5);
        H = layout.offsetof(6);
    }

    protected SDL_GPUBlitRegion(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUBlitRegion create(long address, ByteBuffer container) {
        return new SDL_GPUBlitRegion(address, container);
    }

    public SDL_GPUBlitRegion(ByteBuffer container) {
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

    @NativeType("Uint32")
    public int x() {
        return nx(address());
    }

    @NativeType("Uint32")
    public int y() {
        return ny(address());
    }

    @NativeType("Uint32")
    public int w() {
        return nw(address());
    }

    @NativeType("Uint32")
    public int h() {
        return nh(address());
    }

    public SDL_GPUBlitRegion texture(@NativeType("SDL_GPUTexture *") long value) {
        ntexture(address(), value);
        return this;
    }

    public SDL_GPUBlitRegion mip_level(@NativeType("Uint32") int value) {
        nmip_level(address(), value);
        return this;
    }

    public SDL_GPUBlitRegion layer_or_depth_plane(@NativeType("Uint32") int value) {
        nlayer_or_depth_plane(address(), value);
        return this;
    }

    public SDL_GPUBlitRegion x(@NativeType("Uint32") int value) {
        nx(address(), value);
        return this;
    }

    public SDL_GPUBlitRegion y(@NativeType("Uint32") int value) {
        ny(address(), value);
        return this;
    }

    public SDL_GPUBlitRegion w(@NativeType("Uint32") int value) {
        nw(address(), value);
        return this;
    }

    public SDL_GPUBlitRegion h(@NativeType("Uint32") int value) {
        nh(address(), value);
        return this;
    }

    public SDL_GPUBlitRegion set(long texture, int mip_level, int layer_or_depth_plane, int x, int y, int w, int h) {
        texture(texture);
        mip_level(mip_level);
        layer_or_depth_plane(layer_or_depth_plane);
        x(x);
        y(y);
        w(w);
        h(h);
        return this;
    }

    public SDL_GPUBlitRegion set(SDL_GPUBlitRegion src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUBlitRegion malloc() {
        return new SDL_GPUBlitRegion(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUBlitRegion calloc() {
        return new SDL_GPUBlitRegion(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUBlitRegion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUBlitRegion(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUBlitRegion create(long address) {
        return new SDL_GPUBlitRegion(address, null);
    }

    public static SDL_GPUBlitRegion createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUBlitRegion(address, null);
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

    public static SDL_GPUBlitRegion malloc(MemoryStack stack) {
        return new SDL_GPUBlitRegion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUBlitRegion calloc(MemoryStack stack) {
        return new SDL_GPUBlitRegion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
    }

    public static int nw(long struct) {
        return MemoryUtil.memGetInt(struct + W);
    }

    public static int nh(long struct) {
        return MemoryUtil.memGetInt(struct + H);
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

    public static void nx(long struct, int value) {
        MemoryUtil.memPutInt(struct + X, value);
    }

    public static void ny(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y, value);
    }

    public static void nw(long struct, int value) {
        MemoryUtil.memPutInt(struct + W, value);
    }

    public static void nh(long struct, int value) {
        MemoryUtil.memPutInt(struct + H, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TEXTURE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUBlitRegion$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUBlitRegion, Buffer> implements NativeResource {
        private static final SDL_GPUBlitRegion ELEMENT_FACTORY = SDL_GPUBlitRegion.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUBlitRegion.SIZEOF);
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
        public SDL_GPUBlitRegion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUTexture *")
        public long texture() {
            return SDL_GPUBlitRegion.ntexture(address());
        }

        @NativeType("Uint32")
        public int mip_level() {
            return SDL_GPUBlitRegion.nmip_level(address());
        }

        @NativeType("Uint32")
        public int layer_or_depth_plane() {
            return SDL_GPUBlitRegion.nlayer_or_depth_plane(address());
        }

        @NativeType("Uint32")
        public int x() {
            return SDL_GPUBlitRegion.nx(address());
        }

        @NativeType("Uint32")
        public int y() {
            return SDL_GPUBlitRegion.ny(address());
        }

        @NativeType("Uint32")
        public int w() {
            return SDL_GPUBlitRegion.nw(address());
        }

        @NativeType("Uint32")
        public int h() {
            return SDL_GPUBlitRegion.nh(address());
        }

        public Buffer texture(@NativeType("SDL_GPUTexture *") long value) {
            SDL_GPUBlitRegion.ntexture(address(), value);
            return this;
        }

        public Buffer mip_level(@NativeType("Uint32") int value) {
            SDL_GPUBlitRegion.nmip_level(address(), value);
            return this;
        }

        public Buffer layer_or_depth_plane(@NativeType("Uint32") int value) {
            SDL_GPUBlitRegion.nlayer_or_depth_plane(address(), value);
            return this;
        }

        public Buffer x(@NativeType("Uint32") int value) {
            SDL_GPUBlitRegion.nx(address(), value);
            return this;
        }

        public Buffer y(@NativeType("Uint32") int value) {
            SDL_GPUBlitRegion.ny(address(), value);
            return this;
        }

        public Buffer w(@NativeType("Uint32") int value) {
            SDL_GPUBlitRegion.nw(address(), value);
            return this;
        }

        public Buffer h(@NativeType("Uint32") int value) {
            SDL_GPUBlitRegion.nh(address(), value);
            return this;
        }
    }
}
