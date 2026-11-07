package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_chunk")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_chunk.class */
public class spng_chunk extends Struct<spng_chunk> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFFSET;
    public static final int LENGTH;
    public static final int TYPE;
    public static final int CRC;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __array(1, 4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        CRC = layout.offsetof(3);
    }

    protected spng_chunk(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_chunk create(long address, ByteBuffer container) {
        return new spng_chunk(address, container);
    }

    public spng_chunk(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("size_t")
    public long offset() {
        return noffset(address());
    }

    @NativeType("uint32_t")
    public int length() {
        return nlength(address());
    }

    @NativeType("uint8_t[4]")
    public ByteBuffer type() {
        return ntype(address());
    }

    @NativeType("uint8_t")
    public byte type(int index) {
        return ntype(address(), index);
    }

    @NativeType("uint32_t")
    public int crc() {
        return ncrc(address());
    }

    public spng_chunk offset(@NativeType("size_t") long value) {
        noffset(address(), value);
        return this;
    }

    public spng_chunk length(@NativeType("uint32_t") int value) {
        nlength(address(), value);
        return this;
    }

    public spng_chunk type(@NativeType("uint8_t[4]") ByteBuffer value) {
        ntype(address(), value);
        return this;
    }

    public spng_chunk type(int index, @NativeType("uint8_t") byte value) {
        ntype(address(), index, value);
        return this;
    }

    public spng_chunk crc(@NativeType("uint32_t") int value) {
        ncrc(address(), value);
        return this;
    }

    public spng_chunk set(long offset, int length, ByteBuffer type, int crc) {
        offset(offset);
        length(length);
        type(type);
        crc(crc);
        return this;
    }

    public spng_chunk set(spng_chunk src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_chunk malloc() {
        return new spng_chunk(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_chunk calloc() {
        return new spng_chunk(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_chunk create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_chunk(MemoryUtil.memAddress(container), container);
    }

    public static spng_chunk create(long address) {
        return new spng_chunk(address, null);
    }

    public static spng_chunk createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_chunk(address, null);
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

    public static spng_chunk malloc(MemoryStack stack) {
        return new spng_chunk(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_chunk calloc(MemoryStack stack) {
        return new spng_chunk(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetAddress(struct + OFFSET);
    }

    public static int nlength(long struct) {
        return MemoryUtil.memGetInt(struct + LENGTH);
    }

    public static ByteBuffer ntype(long struct) {
        return MemoryUtil.memByteBuffer(struct + TYPE, 4);
    }

    public static byte ntype(long struct, int index) {
        return MemoryUtil.memGetByte(struct + TYPE + (Checks.check(index, 4) * 1));
    }

    public static int ncrc(long struct) {
        return MemoryUtil.memGetInt(struct + CRC);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutAddress(struct + OFFSET, value);
    }

    public static void nlength(long struct, int value) {
        MemoryUtil.memPutInt(struct + LENGTH, value);
    }

    public static void ntype(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + TYPE, value.remaining() * 1);
    }

    public static void ntype(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + TYPE + (Checks.check(index, 4) * 1), value);
    }

    public static void ncrc(long struct, int value) {
        MemoryUtil.memPutInt(struct + CRC, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_chunk$Buffer.class */
    public static class Buffer extends StructBuffer<spng_chunk, Buffer> implements NativeResource {
        private static final spng_chunk ELEMENT_FACTORY = spng_chunk.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_chunk.SIZEOF);
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
        public spng_chunk getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("size_t")
        public long offset() {
            return spng_chunk.noffset(address());
        }

        @NativeType("uint32_t")
        public int length() {
            return spng_chunk.nlength(address());
        }

        @NativeType("uint8_t[4]")
        public ByteBuffer type() {
            return spng_chunk.ntype(address());
        }

        @NativeType("uint8_t")
        public byte type(int index) {
            return spng_chunk.ntype(address(), index);
        }

        @NativeType("uint32_t")
        public int crc() {
            return spng_chunk.ncrc(address());
        }

        public Buffer offset(@NativeType("size_t") long value) {
            spng_chunk.noffset(address(), value);
            return this;
        }

        public Buffer length(@NativeType("uint32_t") int value) {
            spng_chunk.nlength(address(), value);
            return this;
        }

        public Buffer type(@NativeType("uint8_t[4]") ByteBuffer value) {
            spng_chunk.ntype(address(), value);
            return this;
        }

        public Buffer type(int index, @NativeType("uint8_t") byte value) {
            spng_chunk.ntype(address(), index, value);
            return this;
        }

        public Buffer crc(@NativeType("uint32_t") int value) {
            spng_chunk.ncrc(address(), value);
            return this;
        }
    }
}
