package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintColrGlyph.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintColrGlyph.class */
public class FT_PaintColrGlyph extends Struct<FT_PaintColrGlyph> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int GLYPHID;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        GLYPHID = layout.offsetof(0);
    }

    protected FT_PaintColrGlyph(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintColrGlyph create(long address, ByteBuffer container) {
        return new FT_PaintColrGlyph(address, container);
    }

    public FT_PaintColrGlyph(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UInt")
    public int glyphID() {
        return nglyphID(address());
    }

    public static FT_PaintColrGlyph create(long address) {
        return new FT_PaintColrGlyph(address, null);
    }

    public static FT_PaintColrGlyph createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintColrGlyph(address, null);
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

    public static int nglyphID(long struct) {
        return MemoryUtil.memGetInt(struct + GLYPHID);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintColrGlyph$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintColrGlyph$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintColrGlyph, Buffer> {
        private static final FT_PaintColrGlyph ELEMENT_FACTORY = FT_PaintColrGlyph.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintColrGlyph.SIZEOF);
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
        public FT_PaintColrGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UInt")
        public int glyphID() {
            return FT_PaintColrGlyph.nglyphID(address());
        }
    }
}
