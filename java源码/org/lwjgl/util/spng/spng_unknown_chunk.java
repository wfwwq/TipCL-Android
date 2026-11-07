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

@NativeType("struct spng_unknown_chunk")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_unknown_chunk.class */
public class spng_unknown_chunk extends Struct<spng_unknown_chunk> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int LENGTH;
    public static final int DATA;
    public static final int LOCATION;

    static {
        Struct.Layout layout = __struct(__array(1, 4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
        DATA = layout.offsetof(2);
        LOCATION = layout.offsetof(3);
    }

    protected spng_unknown_chunk(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_unknown_chunk create(long address, ByteBuffer container) {
        return new spng_unknown_chunk(address, container);
    }

    public spng_unknown_chunk(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t[4]")
    public ByteBuffer type() {
        return ntype(address());
    }

    @NativeType("uint8_t")
    public byte type(int index) {
        return ntype(address(), index);
    }

    @NativeType("size_t")
    public long length() {
        return nlength(address());
    }

    @NativeType("void *")
    public ByteBuffer data() {
        return ndata(address());
    }

    @NativeType("spng_location")
    public int location() {
        return nlocation(address());
    }

    public spng_unknown_chunk type(@NativeType("uint8_t[4]") ByteBuffer value) {
        ntype(address(), value);
        return this;
    }

    public spng_unknown_chunk type(int index, @NativeType("uint8_t") byte value) {
        ntype(address(), index, value);
        return this;
    }

    public spng_unknown_chunk data(@NativeType("void *") ByteBuffer value) {
        ndata(address(), value);
        return this;
    }

    public spng_unknown_chunk location(@NativeType("spng_location") int value) {
        nlocation(address(), value);
        return this;
    }

    public spng_unknown_chunk set(ByteBuffer type, ByteBuffer data, int location) {
        type(type);
        data(data);
        location(location);
        return this;
    }

    public spng_unknown_chunk set(spng_unknown_chunk src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_unknown_chunk malloc() {
        return new spng_unknown_chunk(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_unknown_chunk calloc() {
        return new spng_unknown_chunk(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_unknown_chunk create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_unknown_chunk(MemoryUtil.memAddress(container), container);
    }

    public static spng_unknown_chunk create(long address) {
        return new spng_unknown_chunk(address, null);
    }

    public static spng_unknown_chunk createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_unknown_chunk(address, null);
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

    public static spng_unknown_chunk malloc(MemoryStack stack) {
        return new spng_unknown_chunk(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_unknown_chunk calloc(MemoryStack stack) {
        return new spng_unknown_chunk(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer ntype(long struct) {
        return MemoryUtil.memByteBuffer(struct + TYPE, 4);
    }

    public static byte ntype(long struct, int index) {
        return MemoryUtil.memGetByte(struct + TYPE + (Checks.check(index, 4) * 1));
    }

    public static long nlength(long struct) {
        return MemoryUtil.memGetAddress(struct + LENGTH);
    }

    public static ByteBuffer ndata(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + DATA), (int) nlength(struct));
    }

    public static int nlocation(long struct) {
        return MemoryUtil.memGetInt(struct + LOCATION);
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

    public static void nlength(long struct, long value) {
        MemoryUtil.memPutAddress(struct + LENGTH, value);
    }

    public static void ndata(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + DATA, MemoryUtil.memAddress(value));
        nlength(struct, value.remaining());
    }

    public static void nlocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOCATION, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DATA));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_unknown_chunk$Buffer.class */
    public static class Buffer extends StructBuffer<spng_unknown_chunk, Buffer> implements NativeResource {
        private static final spng_unknown_chunk ELEMENT_FACTORY = spng_unknown_chunk.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_unknown_chunk.SIZEOF);
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
        public spng_unknown_chunk getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t[4]")
        public ByteBuffer type() {
            return spng_unknown_chunk.ntype(address());
        }

        @NativeType("uint8_t")
        public byte type(int index) {
            return spng_unknown_chunk.ntype(address(), index);
        }

        @NativeType("size_t")
        public long length() {
            return spng_unknown_chunk.nlength(address());
        }

        @NativeType("void *")
        public ByteBuffer data() {
            return spng_unknown_chunk.ndata(address());
        }

        @NativeType("spng_location")
        public int location() {
            return spng_unknown_chunk.nlocation(address());
        }

        public Buffer type(@NativeType("uint8_t[4]") ByteBuffer value) {
            spng_unknown_chunk.ntype(address(), value);
            return this;
        }

        public Buffer type(int index, @NativeType("uint8_t") byte value) {
            spng_unknown_chunk.ntype(address(), index, value);
            return this;
        }

        public Buffer data(@NativeType("void *") ByteBuffer value) {
            spng_unknown_chunk.ndata(address(), value);
            return this;
        }

        public Buffer location(@NativeType("spng_location") int value) {
            spng_unknown_chunk.nlocation(address(), value);
            return this;
        }
    }
}
