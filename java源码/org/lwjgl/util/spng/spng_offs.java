package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_offs")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_offs.class */
public class spng_offs extends Struct<spng_offs> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;
    public static final int UNIT_SPECIFIER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        UNIT_SPECIFIER = layout.offsetof(2);
    }

    protected spng_offs(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_offs create(long address, ByteBuffer container) {
        return new spng_offs(address, container);
    }

    public spng_offs(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("int32_t")
    public int x() {
        return nx(address());
    }

    @NativeType("int32_t")
    public int y() {
        return ny(address());
    }

    @NativeType("uint8_t")
    public byte unit_specifier() {
        return nunit_specifier(address());
    }

    public spng_offs x(@NativeType("int32_t") int value) {
        nx(address(), value);
        return this;
    }

    public spng_offs y(@NativeType("int32_t") int value) {
        ny(address(), value);
        return this;
    }

    public spng_offs unit_specifier(@NativeType("uint8_t") byte value) {
        nunit_specifier(address(), value);
        return this;
    }

    public spng_offs set(int x, int y, byte unit_specifier) {
        x(x);
        y(y);
        unit_specifier(unit_specifier);
        return this;
    }

    public spng_offs set(spng_offs src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_offs malloc() {
        return new spng_offs(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_offs calloc() {
        return new spng_offs(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_offs create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_offs(MemoryUtil.memAddress(container), container);
    }

    public static spng_offs create(long address) {
        return new spng_offs(address, null);
    }

    public static spng_offs createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_offs(address, null);
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

    public static spng_offs malloc(MemoryStack stack) {
        return new spng_offs(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_offs calloc(MemoryStack stack) {
        return new spng_offs(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
    }

    public static byte nunit_specifier(long struct) {
        return MemoryUtil.memGetByte(struct + UNIT_SPECIFIER);
    }

    public static void nx(long struct, int value) {
        MemoryUtil.memPutInt(struct + X, value);
    }

    public static void ny(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y, value);
    }

    public static void nunit_specifier(long struct, byte value) {
        MemoryUtil.memPutByte(struct + UNIT_SPECIFIER, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_offs$Buffer.class */
    public static class Buffer extends StructBuffer<spng_offs, Buffer> implements NativeResource {
        private static final spng_offs ELEMENT_FACTORY = spng_offs.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_offs.SIZEOF);
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
        public spng_offs getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int32_t")
        public int x() {
            return spng_offs.nx(address());
        }

        @NativeType("int32_t")
        public int y() {
            return spng_offs.ny(address());
        }

        @NativeType("uint8_t")
        public byte unit_specifier() {
            return spng_offs.nunit_specifier(address());
        }

        public Buffer x(@NativeType("int32_t") int value) {
            spng_offs.nx(address(), value);
            return this;
        }

        public Buffer y(@NativeType("int32_t") int value) {
            spng_offs.ny(address(), value);
            return this;
        }

        public Buffer unit_specifier(@NativeType("uint8_t") byte value) {
            spng_offs.nunit_specifier(address(), value);
            return this;
        }
    }
}
