package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_OutlineGlyph.class
 */
@NativeType("struct FT_OutlineGlyphRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_OutlineGlyph.class */
public class FT_OutlineGlyph extends Struct<FT_OutlineGlyph> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ROOT;
    public static final int OUTLINE;

    static {
        Struct.Layout layout = __struct(__member(FT_Glyph.SIZEOF, FT_Glyph.ALIGNOF), __member(FT_Outline.SIZEOF, FT_Outline.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ROOT = layout.offsetof(0);
        OUTLINE = layout.offsetof(1);
    }

    protected FT_OutlineGlyph(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_OutlineGlyph create(long address, ByteBuffer container) {
        return new FT_OutlineGlyph(address, container);
    }

    public FT_OutlineGlyph(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_GlyphRec")
    public FT_Glyph root() {
        return nroot(address());
    }

    public FT_Outline outline() {
        return noutline(address());
    }

    public static FT_OutlineGlyph create(long address) {
        return new FT_OutlineGlyph(address, null);
    }

    public static FT_OutlineGlyph createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_OutlineGlyph(address, null);
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

    public static FT_Glyph nroot(long struct) {
        return FT_Glyph.create(struct + ROOT);
    }

    public static FT_Outline noutline(long struct) {
        return FT_Outline.create(struct + OUTLINE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_OutlineGlyph$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_OutlineGlyph$Buffer.class */
    public static class Buffer extends StructBuffer<FT_OutlineGlyph, Buffer> {
        private static final FT_OutlineGlyph ELEMENT_FACTORY = FT_OutlineGlyph.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_OutlineGlyph.SIZEOF);
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
        public FT_OutlineGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_GlyphRec")
        public FT_Glyph root() {
            return FT_OutlineGlyph.nroot(address());
        }

        public FT_Outline outline() {
            return FT_OutlineGlyph.noutline(address());
        }
    }
}
