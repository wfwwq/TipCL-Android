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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUTextureTransferInfo.class */
public class SDL_GPUTextureTransferInfo extends Struct<SDL_GPUTextureTransferInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TRANSFER_BUFFER;
    public static final int OFFSET;
    public static final int PIXELS_PER_ROW;
    public static final int ROWS_PER_LAYER;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TRANSFER_BUFFER = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        PIXELS_PER_ROW = layout.offsetof(2);
        ROWS_PER_LAYER = layout.offsetof(3);
    }

    protected SDL_GPUTextureTransferInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUTextureTransferInfo create(long address, ByteBuffer container) {
        return new SDL_GPUTextureTransferInfo(address, container);
    }

    public SDL_GPUTextureTransferInfo(ByteBuffer container) {
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

    @NativeType("Uint32")
    public int pixels_per_row() {
        return npixels_per_row(address());
    }

    @NativeType("Uint32")
    public int rows_per_layer() {
        return nrows_per_layer(address());
    }

    public SDL_GPUTextureTransferInfo transfer_buffer(@NativeType("SDL_GPUTransferBuffer *") long value) {
        ntransfer_buffer(address(), value);
        return this;
    }

    public SDL_GPUTextureTransferInfo offset(@NativeType("Uint32") int value) {
        noffset(address(), value);
        return this;
    }

    public SDL_GPUTextureTransferInfo pixels_per_row(@NativeType("Uint32") int value) {
        npixels_per_row(address(), value);
        return this;
    }

    public SDL_GPUTextureTransferInfo rows_per_layer(@NativeType("Uint32") int value) {
        nrows_per_layer(address(), value);
        return this;
    }

    public SDL_GPUTextureTransferInfo set(long transfer_buffer, int offset, int pixels_per_row, int rows_per_layer) {
        transfer_buffer(transfer_buffer);
        offset(offset);
        pixels_per_row(pixels_per_row);
        rows_per_layer(rows_per_layer);
        return this;
    }

    public SDL_GPUTextureTransferInfo set(SDL_GPUTextureTransferInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUTextureTransferInfo malloc() {
        return new SDL_GPUTextureTransferInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUTextureTransferInfo calloc() {
        return new SDL_GPUTextureTransferInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUTextureTransferInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTextureTransferInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUTextureTransferInfo create(long address) {
        return new SDL_GPUTextureTransferInfo(address, null);
    }

    public static SDL_GPUTextureTransferInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUTextureTransferInfo(address, null);
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

    public static SDL_GPUTextureTransferInfo malloc(MemoryStack stack) {
        return new SDL_GPUTextureTransferInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUTextureTransferInfo calloc(MemoryStack stack) {
        return new SDL_GPUTextureTransferInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npixels_per_row(long struct) {
        return MemoryUtil.memGetInt(struct + PIXELS_PER_ROW);
    }

    public static int nrows_per_layer(long struct) {
        return MemoryUtil.memGetInt(struct + ROWS_PER_LAYER);
    }

    public static void ntransfer_buffer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TRANSFER_BUFFER, Checks.check(value));
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    public static void npixels_per_row(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIXELS_PER_ROW, value);
    }

    public static void nrows_per_layer(long struct, int value) {
        MemoryUtil.memPutInt(struct + ROWS_PER_LAYER, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TRANSFER_BUFFER));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUTextureTransferInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUTextureTransferInfo, Buffer> implements NativeResource {
        private static final SDL_GPUTextureTransferInfo ELEMENT_FACTORY = SDL_GPUTextureTransferInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUTextureTransferInfo.SIZEOF);
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
        public SDL_GPUTextureTransferInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUTransferBuffer *")
        public long transfer_buffer() {
            return SDL_GPUTextureTransferInfo.ntransfer_buffer(address());
        }

        @NativeType("Uint32")
        public int offset() {
            return SDL_GPUTextureTransferInfo.noffset(address());
        }

        @NativeType("Uint32")
        public int pixels_per_row() {
            return SDL_GPUTextureTransferInfo.npixels_per_row(address());
        }

        @NativeType("Uint32")
        public int rows_per_layer() {
            return SDL_GPUTextureTransferInfo.nrows_per_layer(address());
        }

        public Buffer transfer_buffer(@NativeType("SDL_GPUTransferBuffer *") long value) {
            SDL_GPUTextureTransferInfo.ntransfer_buffer(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("Uint32") int value) {
            SDL_GPUTextureTransferInfo.noffset(address(), value);
            return this;
        }

        public Buffer pixels_per_row(@NativeType("Uint32") int value) {
            SDL_GPUTextureTransferInfo.npixels_per_row(address(), value);
            return this;
        }

        public Buffer rows_per_layer(@NativeType("Uint32") int value) {
            SDL_GPUTextureTransferInfo.nrows_per_layer(address(), value);
            return this;
        }
    }
}
