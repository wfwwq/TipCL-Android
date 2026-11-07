package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Glyph.class
 */
@NativeType("struct FT_GlyphRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Glyph.class */
public class FT_Glyph extends Struct<FT_Glyph> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LIBRARY;
    public static final int CLAZZ;
    public static final int FORMAT;
    public static final int ADVANCE;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LIBRARY = layout.offsetof(0);
        CLAZZ = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        ADVANCE = layout.offsetof(3);
    }

    protected FT_Glyph(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Glyph create(long address, ByteBuffer container) {
        return new FT_Glyph(address, container);
    }

    public FT_Glyph(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Library")
    public long library() {
        return nlibrary(address());
    }

    @NativeType("FT_Glyph_Format")
    public int format() {
        return nformat(address());
    }

    public FT_Vector advance() {
        return nadvance(address());
    }

    public static FT_Glyph create(long address) {
        return new FT_Glyph(address, null);
    }

    public static FT_Glyph createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Glyph(address, null);
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

    public static long nlibrary(long struct) {
        return MemoryUtil.memGetAddress(struct + LIBRARY);
    }

    public static long nclazz(long struct) {
        return MemoryUtil.memGetAddress(struct + CLAZZ);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static FT_Vector nadvance(long struct) {
        return FT_Vector.create(struct + ADVANCE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Glyph$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Glyph$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Glyph, Buffer> {
        private static final FT_Glyph ELEMENT_FACTORY = FT_Glyph.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Glyph.SIZEOF);
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
        public FT_Glyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Library")
        public long library() {
            return FT_Glyph.nlibrary(address());
        }

        @NativeType("FT_Glyph_Format")
        public int format() {
            return FT_Glyph.nformat(address());
        }

        public FT_Vector advance() {
            return FT_Glyph.nadvance(address());
        }
    }
}
