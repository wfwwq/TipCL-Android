package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AsyncIOOutcome.class */
public class SDL_AsyncIOOutcome extends Struct<SDL_AsyncIOOutcome> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ASYNCIO;
    public static final int TYPE;
    public static final int RESULT;
    public static final int BUFFER;
    public static final int OFFSET;
    public static final int BYTES_REQUESTED;
    public static final int BYTES_TRANSFERRED;
    public static final int USERDATA;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ASYNCIO = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        RESULT = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        BYTES_REQUESTED = layout.offsetof(5);
        BYTES_TRANSFERRED = layout.offsetof(6);
        USERDATA = layout.offsetof(7);
    }

    protected SDL_AsyncIOOutcome(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_AsyncIOOutcome create(long address, ByteBuffer container) {
        return new SDL_AsyncIOOutcome(address, container);
    }

    public SDL_AsyncIOOutcome(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_AsyncIO *")
    public long asyncio() {
        return nasyncio(address());
    }

    @NativeType("SDL_AsyncIOTaskType")
    public int type() {
        return ntype(address());
    }

    @NativeType("SDL_AsyncIOResult")
    public int result() {
        return nresult(address());
    }

    @NativeType("void *")
    public ByteBuffer buffer(int capacity) {
        return nbuffer(address(), capacity);
    }

    @NativeType("Uint64")
    public long offset() {
        return noffset(address());
    }

    @NativeType("Uint64")
    public long bytes_requested() {
        return nbytes_requested(address());
    }

    @NativeType("Uint64")
    public long bytes_transferred() {
        return nbytes_transferred(address());
    }

    @NativeType("void *")
    public long userdata() {
        return nuserdata(address());
    }

    public static SDL_AsyncIOOutcome malloc() {
        return new SDL_AsyncIOOutcome(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_AsyncIOOutcome calloc() {
        return new SDL_AsyncIOOutcome(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_AsyncIOOutcome create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_AsyncIOOutcome(MemoryUtil.memAddress(container), container);
    }

    public static SDL_AsyncIOOutcome create(long address) {
        return new SDL_AsyncIOOutcome(address, null);
    }

    public static SDL_AsyncIOOutcome createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_AsyncIOOutcome(address, null);
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

    public static SDL_AsyncIOOutcome malloc(MemoryStack stack) {
        return new SDL_AsyncIOOutcome(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_AsyncIOOutcome calloc(MemoryStack stack) {
        return new SDL_AsyncIOOutcome(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nasyncio(long struct) {
        return MemoryUtil.memGetAddress(struct + ASYNCIO);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nresult(long struct) {
        return MemoryUtil.memGetInt(struct + RESULT);
    }

    public static ByteBuffer nbuffer(long struct, int capacity) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + BUFFER), capacity);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetLong(struct + OFFSET);
    }

    public static long nbytes_requested(long struct) {
        return MemoryUtil.memGetLong(struct + BYTES_REQUESTED);
    }

    public static long nbytes_transferred(long struct) {
        return MemoryUtil.memGetLong(struct + BYTES_TRANSFERRED);
    }

    public static long nuserdata(long struct) {
        return MemoryUtil.memGetAddress(struct + USERDATA);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AsyncIOOutcome$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_AsyncIOOutcome, Buffer> implements NativeResource {
        private static final SDL_AsyncIOOutcome ELEMENT_FACTORY = SDL_AsyncIOOutcome.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_AsyncIOOutcome.SIZEOF);
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
        public SDL_AsyncIOOutcome getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_AsyncIO *")
        public long asyncio() {
            return SDL_AsyncIOOutcome.nasyncio(address());
        }

        @NativeType("SDL_AsyncIOTaskType")
        public int type() {
            return SDL_AsyncIOOutcome.ntype(address());
        }

        @NativeType("SDL_AsyncIOResult")
        public int result() {
            return SDL_AsyncIOOutcome.nresult(address());
        }

        @NativeType("void *")
        public ByteBuffer buffer(int capacity) {
            return SDL_AsyncIOOutcome.nbuffer(address(), capacity);
        }

        @NativeType("Uint64")
        public long offset() {
            return SDL_AsyncIOOutcome.noffset(address());
        }

        @NativeType("Uint64")
        public long bytes_requested() {
            return SDL_AsyncIOOutcome.nbytes_requested(address());
        }

        @NativeType("Uint64")
        public long bytes_transferred() {
            return SDL_AsyncIOOutcome.nbytes_transferred(address());
        }

        @NativeType("void *")
        public long userdata() {
            return SDL_AsyncIOOutcome.nuserdata(address());
        }
    }
}
