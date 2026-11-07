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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Vector.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Vector.class */
public class FT_Vector extends Struct<FT_Vector> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    protected FT_Vector(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Vector create(long address, ByteBuffer container) {
        return new FT_Vector(address, container);
    }

    public FT_Vector(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Pos")
    public long x() {
        return nx(address());
    }

    @NativeType("FT_Pos")
    public long y() {
        return ny(address());
    }

    public FT_Vector x(@NativeType("FT_Pos") long value) {
        nx(address(), value);
        return this;
    }

    public FT_Vector y(@NativeType("FT_Pos") long value) {
        ny(address(), value);
        return this;
    }

    public FT_Vector set(long x, long y) {
        x(x);
        y(y);
        return this;
    }

    public FT_Vector set(FT_Vector src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Vector malloc() {
        return new FT_Vector(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Vector calloc() {
        return new FT_Vector(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Vector create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Vector(MemoryUtil.memAddress(container), container);
    }

    public static FT_Vector create(long address) {
        return new FT_Vector(address, null);
    }

    public static FT_Vector createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Vector(address, null);
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

    public static FT_Vector malloc(MemoryStack stack) {
        return new FT_Vector(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Vector calloc(MemoryStack stack) {
        return new FT_Vector(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nx(long struct) {
        return MemoryUtil.memGetCLong(struct + X);
    }

    public static long ny(long struct) {
        return MemoryUtil.memGetCLong(struct + Y);
    }

    public static void nx(long struct, long value) {
        MemoryUtil.memPutCLong(struct + X, value);
    }

    public static void ny(long struct, long value) {
        MemoryUtil.memPutCLong(struct + Y, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Vector$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Vector$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Vector, Buffer> implements NativeResource {
        private static final FT_Vector ELEMENT_FACTORY = FT_Vector.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Vector.SIZEOF);
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
        public FT_Vector getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Pos")
        public long x() {
            return FT_Vector.nx(address());
        }

        @NativeType("FT_Pos")
        public long y() {
            return FT_Vector.ny(address());
        }

        public Buffer x(@NativeType("FT_Pos") long value) {
            FT_Vector.nx(address(), value);
            return this;
        }

        public Buffer y(@NativeType("FT_Pos") long value) {
            FT_Vector.ny(address(), value);
            return this;
        }
    }
}
