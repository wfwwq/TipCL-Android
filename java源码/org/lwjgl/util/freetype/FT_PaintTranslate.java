package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintTranslate.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintTranslate.class */
public class FT_PaintTranslate extends Struct<FT_PaintTranslate> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PAINT;
    public static final int DX;
    public static final int DY;

    static {
        Struct.Layout layout = __struct(__member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PAINT = layout.offsetof(0);
        DX = layout.offsetof(1);
        DY = layout.offsetof(2);
    }

    protected FT_PaintTranslate(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintTranslate create(long address, ByteBuffer container) {
        return new FT_PaintTranslate(address, container);
    }

    public FT_PaintTranslate(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint paint() {
        return npaint(address());
    }

    @NativeType("FT_Fixed")
    public long dx() {
        return ndx(address());
    }

    @NativeType("FT_Fixed")
    public long dy() {
        return ndy(address());
    }

    public static FT_PaintTranslate create(long address) {
        return new FT_PaintTranslate(address, null);
    }

    public static FT_PaintTranslate createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintTranslate(address, null);
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

    public static FT_OpaquePaint npaint(long struct) {
        return FT_OpaquePaint.create(struct + PAINT);
    }

    public static long ndx(long struct) {
        return MemoryUtil.memGetCLong(struct + DX);
    }

    public static long ndy(long struct) {
        return MemoryUtil.memGetCLong(struct + DY);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintTranslate$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintTranslate$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintTranslate, Buffer> {
        private static final FT_PaintTranslate ELEMENT_FACTORY = FT_PaintTranslate.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintTranslate.SIZEOF);
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
        public FT_PaintTranslate getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() {
            return FT_PaintTranslate.npaint(address());
        }

        @NativeType("FT_Fixed")
        public long dx() {
            return FT_PaintTranslate.ndx(address());
        }

        @NativeType("FT_Fixed")
        public long dy() {
            return FT_PaintTranslate.ndy(address());
        }
    }
}
