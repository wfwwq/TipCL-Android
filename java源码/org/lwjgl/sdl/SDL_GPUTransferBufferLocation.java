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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUTransferBufferLocation.class */
public class SDL_GPUTransferBufferLocation extends Struct<SDL_GPUTransferBufferLocation> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TRANSFER_BUFFER;
    public static final int OFFSET;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TRANSFER_BUFFER = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    protected SDL_GPUTransferBufferLocation(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUTransferBufferLocation create(long address, ByteBuffer container) {
        return new SDL_GPUTransferBufferLocation(address, container);
    }

    public SDL_GPUTransferBufferLocation(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUTransferBuffer *")
    public long transfer_buffer() {
        return ntransfer_buffer(address());
    }

    @NativeType("Uint32")
    public int offset() {
        return noffset(address());
    }

    public SDL_GPUTransferBufferLocation transfer_buffer(@NativeType("SDL_GPUTransferBuffer *") long value) {
        ntransfer_buffer(address(), value);
        return this;
    }

    public SDL_GPUTransferBufferLocation offset(@NativeType("Uint32") int value) {
        noffset(address(), value);
        return this;
    }

    public SDL_GPUTransferBufferLocation set(long transfer_buffer, int offset) {
        transfer_buffer(transfer_buffer);
        offset(offset);
        return this;
    }

    public SDL_GPUTransferBufferLocation set(SDL_GPUTransferBufferLocation src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUTransferBufferLocation malloc() {
        return new SDL_GPUTransferBufferLocation(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUTransferBufferLocation calloc() {
        return new SDL_GPUTransferBufferLocation(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUTransferBufferLocation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTransferBufferLocation(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUTransferBufferLocation create(long address) {
        return new SDL_GPUTransferBufferLocation(address, null);
    }

    public static SDL_GPUTransferBufferLocation createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUTransferBufferLocation(address, null);
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

    public static SDL_GPUTransferBufferLocation malloc(MemoryStack stack) {
        return new SDL_GPUTransferBufferLocation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUTransferBufferLocation calloc(MemoryStack stack) {
        return new SDL_GPUTransferBufferLocation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ntransfer_buffer(long struct) {
        return MemoryUtil.memGetAddress(struct + TRANSFER_BUFFER);
    }

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
    }

    public static void ntransfer_buffer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TRANSFER_BUFFER, Checks.check(value));
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TRANSFER_BUFFER));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUTransferBufferLocation$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUTransferBufferLocation, Buffer> implements NativeResource {
        private static final SDL_GPUTransferBufferLocation ELEMENT_FACTORY = SDL_GPUTransferBufferLocation.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUTransferBufferLocation.SIZEOF);
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
        public SDL_GPUTransferBufferLocation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUTransferBuffer *")
        public long transfer_buffer() {
            return SDL_GPUTransferBufferLocation.ntransfer_buffer(address());
        }

        @NativeType("Uint32")
        public int offset() {
            return SDL_GPUTransferBufferLocation.noffset(address());
        }

        public Buffer transfer_buffer(@NativeType("SDL_GPUTransferBuffer *") long value) {
            SDL_GPUTransferBufferLocation.ntransfer_buffer(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("Uint32") int value) {
            SDL_GPUTransferBufferLocation.noffset(address(), value);
            return this;
        }
    }
}
