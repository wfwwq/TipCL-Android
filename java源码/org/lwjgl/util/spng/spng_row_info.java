package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_row_info")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_row_info.class */
public class spng_row_info extends Struct<spng_row_info> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SCANLINE_IDX;
    public static final int ROW_NUM;
    public static final int PASS;
    public static final int FILTER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SCANLINE_IDX = layout.offsetof(0);
        ROW_NUM = layout.offsetof(1);
        PASS = layout.offsetof(2);
        FILTER = layout.offsetof(3);
    }

    protected spng_row_info(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_row_info create(long address, ByteBuffer container) {
        return new spng_row_info(address, container);
    }

    public spng_row_info(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int scanline_idx() {
        return nscanline_idx(address());
    }

    @NativeType("uint32_t")
    public int row_num() {
        return nrow_num(address());
    }

    public int pass() {
        return npass(address());
    }

    @NativeType("uint8_t")
    public byte filter() {
        return nfilter(address());
    }

    public static spng_row_info malloc() {
        return new spng_row_info(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_row_info calloc() {
        return new spng_row_info(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_row_info create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_row_info(MemoryUtil.memAddress(container), container);
    }

    public static spng_row_info create(long address) {
        return new spng_row_info(address, null);
    }

    public static spng_row_info createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_row_info(address, null);
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

    public static spng_row_info malloc(MemoryStack stack) {
        return new spng_row_info(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_row_info calloc(MemoryStack stack) {
        return new spng_row_info(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nscanline_idx(long struct) {
        return MemoryUtil.memGetInt(struct + SCANLINE_IDX);
    }

    public static int nrow_num(long struct) {
        return MemoryUtil.memGetInt(struct + ROW_NUM);
    }

    public static int npass(long struct) {
        return MemoryUtil.memGetInt(struct + PASS);
    }

    public static byte nfilter(long struct) {
        return MemoryUtil.memGetByte(struct + FILTER);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_row_info$Buffer.class */
    public static class Buffer extends StructBuffer<spng_row_info, Buffer> implements NativeResource {
        private static final spng_row_info ELEMENT_FACTORY = spng_row_info.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_row_info.SIZEOF);
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
        public spng_row_info getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int scanline_idx() {
            return spng_row_info.nscanline_idx(address());
        }

        @NativeType("uint32_t")
        public int row_num() {
            return spng_row_info.nrow_num(address());
        }

        public int pass() {
            return spng_row_info.npass(address());
        }

        @NativeType("uint8_t")
        public byte filter() {
            return spng_row_info.nfilter(address());
        }
    }
}
