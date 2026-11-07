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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_BBox.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_BBox.class */
public class FT_BBox extends Struct<FT_BBox> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int XMIN;
    public static final int YMIN;
    public static final int XMAX;
    public static final int YMAX;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        XMIN = layout.offsetof(0);
        YMIN = layout.offsetof(1);
        XMAX = layout.offsetof(2);
        YMAX = layout.offsetof(3);
    }

    protected FT_BBox(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_BBox create(long address, ByteBuffer container) {
        return new FT_BBox(address, container);
    }

    public FT_BBox(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Pos")
    public long xMin() {
        return nxMin(address());
    }

    @NativeType("FT_Pos")
    public long yMin() {
        return nyMin(address());
    }

    @NativeType("FT_Pos")
    public long xMax() {
        return nxMax(address());
    }

    @NativeType("FT_Pos")
    public long yMax() {
        return nyMax(address());
    }

    public FT_BBox xMin(@NativeType("FT_Pos") long value) {
        nxMin(address(), value);
        return this;
    }

    public FT_BBox yMin(@NativeType("FT_Pos") long value) {
        nyMin(address(), value);
        return this;
    }

    public FT_BBox xMax(@NativeType("FT_Pos") long value) {
        nxMax(address(), value);
        return this;
    }

    public FT_BBox yMax(@NativeType("FT_Pos") long value) {
        nyMax(address(), value);
        return this;
    }

    public FT_BBox set(long xMin, long yMin, long xMax, long yMax) {
        xMin(xMin);
        yMin(yMin);
        xMax(xMax);
        yMax(yMax);
        return this;
    }

    public FT_BBox set(FT_BBox src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_BBox malloc() {
        return new FT_BBox(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_BBox calloc() {
        return new FT_BBox(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_BBox create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_BBox(MemoryUtil.memAddress(container), container);
    }

    public static FT_BBox create(long address) {
        return new FT_BBox(address, null);
    }

    public static FT_BBox createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_BBox(address, null);
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

    public static FT_BBox malloc(MemoryStack stack) {
        return new FT_BBox(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_BBox calloc(MemoryStack stack) {
        return new FT_BBox(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nxMin(long struct) {
        return MemoryUtil.memGetCLong(struct + XMIN);
    }

    public static long nyMin(long struct) {
        return MemoryUtil.memGetCLong(struct + YMIN);
    }

    public static long nxMax(long struct) {
        return MemoryUtil.memGetCLong(struct + XMAX);
    }

    public static long nyMax(long struct) {
        return MemoryUtil.memGetCLong(struct + YMAX);
    }

    public static void nxMin(long struct, long value) {
        MemoryUtil.memPutCLong(struct + XMIN, value);
    }

    public static void nyMin(long struct, long value) {
        MemoryUtil.memPutCLong(struct + YMIN, value);
    }

    public static void nxMax(long struct, long value) {
        MemoryUtil.memPutCLong(struct + XMAX, value);
    }

    public static void nyMax(long struct, long value) {
        MemoryUtil.memPutCLong(struct + YMAX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_BBox$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_BBox$Buffer.class */
    public static class Buffer extends StructBuffer<FT_BBox, Buffer> implements NativeResource {
        private static final FT_BBox ELEMENT_FACTORY = FT_BBox.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_BBox.SIZEOF);
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
        public FT_BBox getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Pos")
        public long xMin() {
            return FT_BBox.nxMin(address());
        }

        @NativeType("FT_Pos")
        public long yMin() {
            return FT_BBox.nyMin(address());
        }

        @NativeType("FT_Pos")
        public long xMax() {
            return FT_BBox.nxMax(address());
        }

        @NativeType("FT_Pos")
        public long yMax() {
            return FT_BBox.nyMax(address());
        }

        public Buffer xMin(@NativeType("FT_Pos") long value) {
            FT_BBox.nxMin(address(), value);
            return this;
        }

        public Buffer yMin(@NativeType("FT_Pos") long value) {
            FT_BBox.nyMin(address(), value);
            return this;
        }

        public Buffer xMax(@NativeType("FT_Pos") long value) {
            FT_BBox.nxMax(address(), value);
            return this;
        }

        public Buffer yMax(@NativeType("FT_Pos") long value) {
            FT_BBox.nyMax(address(), value);
            return this;
        }
    }
}
