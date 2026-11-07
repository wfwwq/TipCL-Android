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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUBufferLocation.class */
public class SDL_GPUBufferLocation extends Struct<SDL_GPUBufferLocation> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUFFER;
    public static final int OFFSET;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUFFER = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    protected SDL_GPUBufferLocation(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUBufferLocation create(long address, ByteBuffer container) {
        return new SDL_GPUBufferLocation(address, container);
    }

    public SDL_GPUBufferLocation(ByteBuffer container) {
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

    @NativeType("Uint32")
    public int offset() {
        return noffset(address());
    }

    public SDL_GPUBufferLocation buffer(@NativeType("SDL_GPUBuffer *") long value) {
        nbuffer(address(), value);
        return this;
    }

    public SDL_GPUBufferLocation offset(@NativeType("Uint32") int value) {
        noffset(address(), value);
        return this;
    }

    public SDL_GPUBufferLocation set(long buffer, int offset) {
        buffer(buffer);
        offset(offset);
        return this;
    }

    public SDL_GPUBufferLocation set(SDL_GPUBufferLocation src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUBufferLocation malloc() {
        return new SDL_GPUBufferLocation(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUBufferLocation calloc() {
        return new SDL_GPUBufferLocation(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUBufferLocation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUBufferLocation(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUBufferLocation create(long address) {
        return new SDL_GPUBufferLocation(address, null);
    }

    public static SDL_GPUBufferLocation createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUBufferLocation(address, null);
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

    public static SDL_GPUBufferLocation malloc(MemoryStack stack) {
        return new SDL_GPUBufferLocation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUBufferLocation calloc(MemoryStack stack) {
        return new SDL_GPUBufferLocation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
    }

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + BUFFER, Checks.check(value));
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + BUFFER));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUBufferLocation$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUBufferLocation, Buffer> implements NativeResource {
        private static final SDL_GPUBufferLocation ELEMENT_FACTORY = SDL_GPUBufferLocation.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUBufferLocation.SIZEOF);
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
        public SDL_GPUBufferLocation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUBuffer *")
        public long buffer() {
            return SDL_GPUBufferLocation.nbuffer(address());
        }

        @NativeType("Uint32")
        public int offset() {
            return SDL_GPUBufferLocation.noffset(address());
        }

        public Buffer buffer(@NativeType("SDL_GPUBuffer *") long value) {
            SDL_GPUBufferLocation.nbuffer(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("Uint32") int value) {
            SDL_GPUBufferLocation.noffset(address(), value);
            return this;
        }
    }
}
