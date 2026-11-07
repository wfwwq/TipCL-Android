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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUStorageTextureReadWriteBinding.class */
public class SDL_GPUStorageTextureReadWriteBinding extends Struct<SDL_GPUStorageTextureReadWriteBinding> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TEXTURE;
    public static final int MIP_LEVEL;
    public static final int LAYER;
    public static final int CYCLE;
    public static final int PADDING1;
    public static final int PADDING2;
    public static final int PADDING3;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TEXTURE = layout.offsetof(0);
        MIP_LEVEL = layout.offsetof(1);
        LAYER = layout.offsetof(2);
        CYCLE = layout.offsetof(3);
        PADDING1 = layout.offsetof(4);
        PADDING2 = layout.offsetof(5);
        PADDING3 = layout.offsetof(6);
    }

    protected SDL_GPUStorageTextureReadWriteBinding(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUStorageTextureReadWriteBinding create(long address, ByteBuffer container) {
        return new SDL_GPUStorageTextureReadWriteBinding(address, container);
    }

    public SDL_GPUStorageTextureReadWriteBinding(ByteBuffer container) {
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

    @NativeType("bool")
    public boolean cycle() {
        return ncycle(address());
    }

    public SDL_GPUStorageTextureReadWriteBinding texture(@NativeType("SDL_GPUTexture *") long value) {
        ntexture(address(), value);
        return this;
    }

    public SDL_GPUStorageTextureReadWriteBinding mip_level(@NativeType("Uint32") int value) {
        nmip_level(address(), value);
        return this;
    }

    public SDL_GPUStorageTextureReadWriteBinding layer(@NativeType("Uint32") int value) {
        nlayer(address(), value);
        return this;
    }

    public SDL_GPUStorageTextureReadWriteBinding cycle(@NativeType("bool") boolean value) {
        ncycle(address(), value);
        return this;
    }

    public SDL_GPUStorageTextureReadWriteBinding set(long texture, int mip_level, int layer, boolean cycle) {
        texture(texture);
        mip_level(mip_level);
        layer(layer);
        cycle(cycle);
        return this;
    }

    public SDL_GPUStorageTextureReadWriteBinding set(SDL_GPUStorageTextureReadWriteBinding src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUStorageTextureReadWriteBinding malloc() {
        return new SDL_GPUStorageTextureReadWriteBinding(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUStorageTextureReadWriteBinding calloc() {
        return new SDL_GPUStorageTextureReadWriteBinding(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUStorageTextureReadWriteBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUStorageTextureReadWriteBinding(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUStorageTextureReadWriteBinding create(long address) {
        return new SDL_GPUStorageTextureReadWriteBinding(address, null);
    }

    public static SDL_GPUStorageTextureReadWriteBinding createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUStorageTextureReadWriteBinding(address, null);
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

    public static SDL_GPUStorageTextureReadWriteBinding malloc(MemoryStack stack) {
        return new SDL_GPUStorageTextureReadWriteBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUStorageTextureReadWriteBinding calloc(MemoryStack stack) {
        return new SDL_GPUStorageTextureReadWriteBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static boolean ncycle(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) CYCLE)) != 0;
    }

    public static byte npadding1(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING1);
    }

    public static byte npadding2(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING2);
    }

    public static byte npadding3(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING3);
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

    public static void ncycle(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + CYCLE, value ? (byte) 1 : (byte) 0);
    }

    public static void npadding1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING1, value);
    }

    public static void npadding2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING2, value);
    }

    public static void npadding3(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING3, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TEXTURE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUStorageTextureReadWriteBinding$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUStorageTextureReadWriteBinding, Buffer> implements NativeResource {
        private static final SDL_GPUStorageTextureReadWriteBinding ELEMENT_FACTORY = SDL_GPUStorageTextureReadWriteBinding.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUStorageTextureReadWriteBinding.SIZEOF);
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
        public SDL_GPUStorageTextureReadWriteBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUTexture *")
        public long texture() {
            return SDL_GPUStorageTextureReadWriteBinding.ntexture(address());
        }

        @NativeType("Uint32")
        public int mip_level() {
            return SDL_GPUStorageTextureReadWriteBinding.nmip_level(address());
        }

        @NativeType("Uint32")
        public int layer() {
            return SDL_GPUStorageTextureReadWriteBinding.nlayer(address());
        }

        @NativeType("bool")
        public boolean cycle() {
            return SDL_GPUStorageTextureReadWriteBinding.ncycle(address());
        }

        public Buffer texture(@NativeType("SDL_GPUTexture *") long value) {
            SDL_GPUStorageTextureReadWriteBinding.ntexture(address(), value);
            return this;
        }

        public Buffer mip_level(@NativeType("Uint32") int value) {
            SDL_GPUStorageTextureReadWriteBinding.nmip_level(address(), value);
            return this;
        }

        public Buffer layer(@NativeType("Uint32") int value) {
            SDL_GPUStorageTextureReadWriteBinding.nlayer(address(), value);
            return this;
        }

        public Buffer cycle(@NativeType("bool") boolean value) {
            SDL_GPUStorageTextureReadWriteBinding.ncycle(address(), value);
            return this;
        }
    }
}
