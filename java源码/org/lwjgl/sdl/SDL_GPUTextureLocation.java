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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUTextureLocation.class */
public class SDL_GPUTextureLocation extends Struct<SDL_GPUTextureLocation> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TEXTURE;
    public static final int MIP_LEVEL;
    public static final int LAYER;
    public static final int X;
    public static final int Y;
    public static final int Z;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TEXTURE = layout.offsetof(0);
        MIP_LEVEL = layout.offsetof(1);
        LAYER = layout.offsetof(2);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
        Z = layout.offsetof(5);
    }

    protected SDL_GPUTextureLocation(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUTextureLocation create(long address, ByteBuffer container) {
        return new SDL_GPUTextureLocation(address, container);
    }

    public SDL_GPUTextureLocation(ByteBuffer container) {
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
    public int layer() {
        return nlayer(address());
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
    public int z() {
        return nz(address());
    }

    public SDL_GPUTextureLocation texture(@NativeType("SDL_GPUTexture *") long value) {
        ntexture(address(), value);
        return this;
    }

    public SDL_GPUTextureLocation mip_level(@NativeType("Uint32") int value) {
        nmip_level(address(), value);
        return this;
    }

    public SDL_GPUTextureLocation layer(@NativeType("Uint32") int value) {
        nlayer(address(), value);
        return this;
    }

    public SDL_GPUTextureLocation x(@NativeType("Uint32") int value) {
        nx(address(), value);
        return this;
    }

    public SDL_GPUTextureLocation y(@NativeType("Uint32") int value) {
        ny(address(), value);
        return this;
    }

    public SDL_GPUTextureLocation z(@NativeType("Uint32") int value) {
        nz(address(), value);
        return this;
    }

    public SDL_GPUTextureLocation set(long texture, int mip_level, int layer, int x, int y, int z) {
        texture(texture);
        mip_level(mip_level);
        layer(layer);
        x(x);
        y(y);
        z(z);
        return this;
    }

    public SDL_GPUTextureLocation set(SDL_GPUTextureLocation src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUTextureLocation malloc() {
        return new SDL_GPUTextureLocation(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUTextureLocation calloc() {
        return new SDL_GPUTextureLocation(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUTextureLocation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTextureLocation(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUTextureLocation create(long address) {
        return new SDL_GPUTextureLocation(address, null);
    }

    public static SDL_GPUTextureLocation createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUTextureLocation(address, null);
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

    public static SDL_GPUTextureLocation malloc(MemoryStack stack) {
        return new SDL_GPUTextureLocation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUTextureLocation calloc(MemoryStack stack) {
        return new SDL_GPUTextureLocation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlayer(long struct) {
        return MemoryUtil.memGetInt(struct + LAYER);
    }

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
    }

    public static int nz(long struct) {
        return MemoryUtil.memGetInt(struct + Z);
    }

    public static void ntexture(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TEXTURE, Checks.check(value));
    }

    public static void nmip_level(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIP_LEVEL, value);
    }

    public static void nlayer(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYER, value);
    }

    public static void nx(long struct, int value) {
        MemoryUtil.memPutInt(struct + X, value);
    }

    public static void ny(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y, value);
    }

    public static void nz(long struct, int value) {
        MemoryUtil.memPutInt(struct + Z, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TEXTURE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUTextureLocation$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUTextureLocation, Buffer> implements NativeResource {
        private static final SDL_GPUTextureLocation ELEMENT_FACTORY = SDL_GPUTextureLocation.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUTextureLocation.SIZEOF);
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
        public SDL_GPUTextureLocation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUTexture *")
        public long texture() {
            return SDL_GPUTextureLocation.ntexture(address());
        }

        @NativeType("Uint32")
        public int mip_level() {
            return SDL_GPUTextureLocation.nmip_level(address());
        }

        @NativeType("Uint32")
        public int layer() {
            return SDL_GPUTextureLocation.nlayer(address());
        }

        @NativeType("Uint32")
        public int x() {
            return SDL_GPUTextureLocation.nx(address());
        }

        @NativeType("Uint32")
        public int y() {
            return SDL_GPUTextureLocation.ny(address());
        }

        @NativeType("Uint32")
        public int z() {
            return SDL_GPUTextureLocation.nz(address());
        }

        public Buffer texture(@NativeType("SDL_GPUTexture *") long value) {
            SDL_GPUTextureLocation.ntexture(address(), value);
            return this;
        }

        public Buffer mip_level(@NativeType("Uint32") int value) {
            SDL_GPUTextureLocation.nmip_level(address(), value);
            return this;
        }

        public Buffer layer(@NativeType("Uint32") int value) {
            SDL_GPUTextureLocation.nlayer(address(), value);
            return this;
        }

        public Buffer x(@NativeType("Uint32") int value) {
            SDL_GPUTextureLocation.nx(address(), value);
            return this;
        }

        public Buffer y(@NativeType("Uint32") int value) {
            SDL_GPUTextureLocation.ny(address(), value);
            return this;
        }

        public Buffer z(@NativeType("Uint32") int value) {
            SDL_GPUTextureLocation.nz(address(), value);
            return this;
        }
    }
}
