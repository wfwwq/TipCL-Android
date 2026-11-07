package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintGlyph.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintGlyph.class */
public class FT_PaintGlyph extends Struct<FT_PaintGlyph> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PAINT;
    public static final int GLYPHID;

    static {
        Struct.Layout layout = __struct(__member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PAINT = layout.offsetof(0);
        GLYPHID = layout.offsetof(1);
    }

    protected FT_PaintGlyph(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintGlyph create(long address, ByteBuffer container) {
        return new FT_PaintGlyph(address, container);
    }

    public FT_PaintGlyph(ByteBuffer container) {
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

    @NativeType("FT_UInt")
    public int glyphID() {
        return nglyphID(address());
    }

    public static FT_PaintGlyph create(long address) {
        return new FT_PaintGlyph(address, null);
    }

    public static FT_PaintGlyph createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintGlyph(address, null);
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

    public static int nglyphID(long struct) {
        return MemoryUtil.memGetInt(struct + GLYPHID);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintGlyph$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintGlyph$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintGlyph, Buffer> {
        private static final FT_PaintGlyph ELEMENT_FACTORY = FT_PaintGlyph.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintGlyph.SIZEOF);
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
        public FT_PaintGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() {
            return FT_PaintGlyph.npaint(address());
        }

        @NativeType("FT_UInt")
        public int glyphID() {
            return FT_PaintGlyph.nglyphID(address());
        }
    }
}
