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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Matrix.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Matrix.class */
public class FT_Matrix extends Struct<FT_Matrix> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int XX;
    public static final int XY;
    public static final int YX;
    public static final int YY;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        XX = layout.offsetof(0);
        XY = layout.offsetof(1);
        YX = layout.offsetof(2);
        YY = layout.offsetof(3);
    }

    protected FT_Matrix(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Matrix create(long address, ByteBuffer container) {
        return new FT_Matrix(address, container);
    }

    public FT_Matrix(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Fixed")
    public long xx() {
        return nxx(address());
    }

    @NativeType("FT_Fixed")
    public long xy() {
        return nxy(address());
    }

    @NativeType("FT_Fixed")
    public long yx() {
        return nyx(address());
    }

    @NativeType("FT_Fixed")
    public long yy() {
        return nyy(address());
    }

    public FT_Matrix xx(@NativeType("FT_Fixed") long value) {
        nxx(address(), value);
        return this;
    }

    public FT_Matrix xy(@NativeType("FT_Fixed") long value) {
        nxy(address(), value);
        return this;
    }

    public FT_Matrix yx(@NativeType("FT_Fixed") long value) {
        nyx(address(), value);
        return this;
    }

    public FT_Matrix yy(@NativeType("FT_Fixed") long value) {
        nyy(address(), value);
        return this;
    }

    public FT_Matrix set(long xx, long xy, long yx, long yy) {
        xx(xx);
        xy(xy);
        yx(yx);
        yy(yy);
        return this;
    }

    public FT_Matrix set(FT_Matrix src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Matrix malloc() {
        return new FT_Matrix(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Matrix calloc() {
        return new FT_Matrix(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Matrix create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Matrix(MemoryUtil.memAddress(container), container);
    }

    public static FT_Matrix create(long address) {
        return new FT_Matrix(address, null);
    }

    public static FT_Matrix createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Matrix(address, null);
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

    public static FT_Matrix malloc(MemoryStack stack) {
        return new FT_Matrix(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Matrix calloc(MemoryStack stack) {
        return new FT_Matrix(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nxx(long struct) {
        return MemoryUtil.memGetCLong(struct + XX);
    }

    public static long nxy(long struct) {
        return MemoryUtil.memGetCLong(struct + XY);
    }

    public static long nyx(long struct) {
        return MemoryUtil.memGetCLong(struct + YX);
    }

    public static long nyy(long struct) {
        return MemoryUtil.memGetCLong(struct + YY);
    }

    public static void nxx(long struct, long value) {
        MemoryUtil.memPutCLong(struct + XX, value);
    }

    public static void nxy(long struct, long value) {
        MemoryUtil.memPutCLong(struct + XY, value);
    }

    public static void nyx(long struct, long value) {
        MemoryUtil.memPutCLong(struct + YX, value);
    }

    public static void nyy(long struct, long value) {
        MemoryUtil.memPutCLong(struct + YY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Matrix$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Matrix$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Matrix, Buffer> implements NativeResource {
        private static final FT_Matrix ELEMENT_FACTORY = FT_Matrix.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Matrix.SIZEOF);
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
        public FT_Matrix getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Fixed")
        public long xx() {
            return FT_Matrix.nxx(address());
        }

        @NativeType("FT_Fixed")
        public long xy() {
            return FT_Matrix.nxy(address());
        }

        @NativeType("FT_Fixed")
        public long yx() {
            return FT_Matrix.nyx(address());
        }

        @NativeType("FT_Fixed")
        public long yy() {
            return FT_Matrix.nyy(address());
        }

        public Buffer xx(@NativeType("FT_Fixed") long value) {
            FT_Matrix.nxx(address(), value);
            return this;
        }

        public Buffer xy(@NativeType("FT_Fixed") long value) {
            FT_Matrix.nxy(address(), value);
            return this;
        }

        public Buffer yx(@NativeType("FT_Fixed") long value) {
            FT_Matrix.nyx(address(), value);
            return this;
        }

        public Buffer yy(@NativeType("FT_Fixed") long value) {
            FT_Matrix.nyy(address(), value);
            return this;
        }
    }
}
