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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUStorageBufferReadWriteBinding.class */
public class SDL_GPUStorageBufferReadWriteBinding extends Struct<SDL_GPUStorageBufferReadWriteBinding> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUFFER;
    public static final int CYCLE;
    public static final int PADDING1;
    public static final int PADDING2;
    public static final int PADDING3;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUFFER = layout.offsetof(0);
        CYCLE = layout.offsetof(1);
        PADDING1 = layout.offsetof(2);
        PADDING2 = layout.offsetof(3);
        PADDING3 = layout.offsetof(4);
    }

    protected SDL_GPUStorageBufferReadWriteBinding(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUStorageBufferReadWriteBinding create(long address, ByteBuffer container) {
        return new SDL_GPUStorageBufferReadWriteBinding(address, container);
    }

    public SDL_GPUStorageBufferReadWriteBinding(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUBuffer *")
    public long buffer() {
        return nbuffer(address());
    }

    @NativeType("bool")
    public boolean cycle() {
        return ncycle(address());
    }

    public SDL_GPUStorageBufferReadWriteBinding buffer(@NativeType("SDL_GPUBuffer *") long value) {
        nbuffer(address(), value);
        return this;
    }

    public SDL_GPUStorageBufferReadWriteBinding cycle(@NativeType("bool") boolean value) {
        ncycle(address(), value);
        return this;
    }

    public SDL_GPUStorageBufferReadWriteBinding set(long buffer, boolean cycle) {
        buffer(buffer);
        cycle(cycle);
        return this;
    }

    public SDL_GPUStorageBufferReadWriteBinding set(SDL_GPUStorageBufferReadWriteBinding src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUStorageBufferReadWriteBinding malloc() {
        return new SDL_GPUStorageBufferReadWriteBinding(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUStorageBufferReadWriteBinding calloc() {
        return new SDL_GPUStorageBufferReadWriteBinding(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUStorageBufferReadWriteBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUStorageBufferReadWriteBinding(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUStorageBufferReadWriteBinding create(long address) {
        return new SDL_GPUStorageBufferReadWriteBinding(address, null);
    }

    public static SDL_GPUStorageBufferReadWriteBinding createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUStorageBufferReadWriteBinding(address, null);
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

    public static SDL_GPUStorageBufferReadWriteBinding malloc(MemoryStack stack) {
        return new SDL_GPUStorageBufferReadWriteBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUStorageBufferReadWriteBinding calloc(MemoryStack stack) {
        return new SDL_GPUStorageBufferReadWriteBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetAddress(struct + BUFFER);
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

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + BUFFER, Checks.check(value));
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
        Checks.check(MemoryUtil.memGetAddress(struct + BUFFER));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUStorageBufferReadWriteBinding$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUStorageBufferReadWriteBinding, Buffer> implements NativeResource {
        private static final SDL_GPUStorageBufferReadWriteBinding ELEMENT_FACTORY = SDL_GPUStorageBufferReadWriteBinding.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUStorageBufferReadWriteBinding.SIZEOF);
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
        public SDL_GPUStorageBufferReadWriteBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUBuffer *")
        public long buffer() {
            return SDL_GPUStorageBufferReadWriteBinding.nbuffer(address());
        }

        @NativeType("bool")
        public boolean cycle() {
            return SDL_GPUStorageBufferReadWriteBinding.ncycle(address());
        }

        public Buffer buffer(@NativeType("SDL_GPUBuffer *") long value) {
            SDL_GPUStorageBufferReadWriteBinding.nbuffer(address(), value);
            return this;
        }

        public Buffer cycle(@NativeType("bool") boolean value) {
            SDL_GPUStorageBufferReadWriteBinding.ncycle(address(), value);
            return this;
        }
    }
}
