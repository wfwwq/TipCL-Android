package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_UnitVector.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_UnitVector.class */
public class FT_UnitVector extends Struct<FT_UnitVector> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    protected FT_UnitVector(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_UnitVector create(long address, ByteBuffer container) {
        return new FT_UnitVector(address, container);
    }

    public FT_UnitVector(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_F2Dot14")
    public short x() {
        return nx(address());
    }

    @NativeType("FT_F2Dot14")
    public short y() {
        return ny(address());
    }

    public FT_UnitVector x(@NativeType("FT_F2Dot14") short value) {
        nx(address(), value);
        return this;
    }

    public FT_UnitVector y(@NativeType("FT_F2Dot14") short value) {
        ny(address(), value);
        return this;
    }

    public FT_UnitVector set(short x, short y) {
        x(x);
        y(y);
        return this;
    }

    public FT_UnitVector set(FT_UnitVector src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_UnitVector malloc() {
        return new FT_UnitVector(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_UnitVector calloc() {
        return new FT_UnitVector(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_UnitVector create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_UnitVector(MemoryUtil.memAddress(container), container);
    }

    public static FT_UnitVector create(long address) {
        return new FT_UnitVector(address, null);
    }

    public static FT_UnitVector createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_UnitVector(address, null);
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

    public static FT_UnitVector malloc(MemoryStack stack) {
        return new FT_UnitVector(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_UnitVector calloc(MemoryStack stack) {
        return new FT_UnitVector(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nx(long struct) {
        return MemoryUtil.memGetShort(struct + X);
    }

    public static short ny(long struct) {
        return MemoryUtil.memGetShort(struct + Y);
    }

    public static void nx(long struct, short value) {
        MemoryUtil.memPutShort(struct + X, value);
    }

    public static void ny(long struct, short value) {
        MemoryUtil.memPutShort(struct + Y, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_UnitVector$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_UnitVector$Buffer.class */
    public static class Buffer extends StructBuffer<FT_UnitVector, Buffer> implements NativeResource {
        private static final FT_UnitVector ELEMENT_FACTORY = FT_UnitVector.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_UnitVector.SIZEOF);
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
        public FT_UnitVector getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_F2Dot14")
        public short x() {
            return FT_UnitVector.nx(address());
        }

        @NativeType("FT_F2Dot14")
        public short y() {
            return FT_UnitVector.ny(address());
        }

        public Buffer x(@NativeType("FT_F2Dot14") short value) {
            FT_UnitVector.nx(address(), value);
            return this;
        }

        public Buffer y(@NativeType("FT_F2Dot14") short value) {
            FT_UnitVector.ny(address(), value);
            return this;
        }
    }
}
