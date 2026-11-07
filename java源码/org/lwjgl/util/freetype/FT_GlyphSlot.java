package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_GlyphSlot.class
 */
@NativeType("struct FT_GlyphSlotRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_GlyphSlot.class */
public class FT_GlyphSlot extends Struct<FT_GlyphSlot> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LIBRARY;
    public static final int FACE;
    public static final int NEXT;
    public static final int GLYPH_INDEX;
    public static final int GENERIC;
    public static final int METRICS;
    public static final int LINEARHORIADVANCE;
    public static final int LINEARVERTADVANCE;
    public static final int ADVANCE;
    public static final int FORMAT;
    public static final int BITMAP;
    public static final int BITMAP_LEFT;
    public static final int BITMAP_TOP;
    public static final int OUTLINE;
    public static final int NUM_SUBGLYPHS;
    public static final int SUBGLYPHS;
    public static final int CONTROL_DATA;
    public static final int CONTROL_LEN;
    public static final int LSB_DELTA;
    public static final int RSB_DELTA;
    public static final int OTHER;
    public static final int INTERNAL;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(FT_Generic.SIZEOF, FT_Generic.ALIGNOF), __member(FT_Glyph_Metrics.SIZEOF, FT_Glyph_Metrics.ALIGNOF), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF), __member(4), __member(FT_Bitmap.SIZEOF, FT_Bitmap.ALIGNOF), __member(4), __member(4), __member(FT_Outline.SIZEOF, FT_Outline.ALIGNOF), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LIBRARY = layout.offsetof(0);
        FACE = layout.offsetof(1);
        NEXT = layout.offsetof(2);
        GLYPH_INDEX = layout.offsetof(3);
        GENERIC = layout.offsetof(4);
        METRICS = layout.offsetof(5);
        LINEARHORIADVANCE = layout.offsetof(6);
        LINEARVERTADVANCE = layout.offsetof(7);
        ADVANCE = layout.offsetof(8);
        FORMAT = layout.offsetof(9);
        BITMAP = layout.offsetof(10);
        BITMAP_LEFT = layout.offsetof(11);
        BITMAP_TOP = layout.offsetof(12);
        OUTLINE = layout.offsetof(13);
        NUM_SUBGLYPHS = layout.offsetof(14);
        SUBGLYPHS = layout.offsetof(15);
        CONTROL_DATA = layout.offsetof(16);
        CONTROL_LEN = layout.offsetof(17);
        LSB_DELTA = layout.offsetof(18);
        RSB_DELTA = layout.offsetof(19);
        OTHER = layout.offsetof(20);
        INTERNAL = layout.offsetof(21);
    }

    protected FT_GlyphSlot(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_GlyphSlot create(long address, ByteBuffer container) {
        return new FT_GlyphSlot(address, container);
    }

    public FT_GlyphSlot(ByteBuffer container) {
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

    public FT_Face face() {
        return nface(address());
    }

    public FT_GlyphSlot next() {
        return nnext(address());
    }

    @NativeType("FT_UInt")
    public int glyph_index() {
        return nglyph_index(address());
    }

    public FT_Generic generic() {
        return ngeneric(address());
    }

    public FT_Glyph_Metrics metrics() {
        return nmetrics(address());
    }

    @NativeType("FT_Fixed")
    public long linearHoriAdvance() {
        return nlinearHoriAdvance(address());
    }

    @NativeType("FT_Fixed")
    public long linearVertAdvance() {
        return nlinearVertAdvance(address());
    }

    public FT_Vector advance() {
        return nadvance(address());
    }

    @NativeType("FT_Glyph_Format")
    public int format() {
        return nformat(address());
    }

    public FT_Bitmap bitmap() {
        return nbitmap(address());
    }

    @NativeType("FT_Int")
    public int bitmap_left() {
        return nbitmap_left(address());
    }

    @NativeType("FT_Int")
    public int bitmap_top() {
        return nbitmap_top(address());
    }

    public FT_Outline outline() {
        return noutline(address());
    }

    @NativeType("FT_Pos")
    public long lsb_delta() {
        return nlsb_delta(address());
    }

    @NativeType("FT_Pos")
    public long rsb_delta() {
        return nrsb_delta(address());
    }

    public static FT_GlyphSlot create(long address) {
        return new FT_GlyphSlot(address, null);
    }

    public static FT_GlyphSlot createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_GlyphSlot(address, null);
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

    public static FT_Face nface(long struct) {
        return FT_Face.create(MemoryUtil.memGetAddress(struct + FACE));
    }

    public static FT_GlyphSlot nnext(long struct) {
        return createSafe(MemoryUtil.memGetAddress(struct + NEXT));
    }

    public static int nglyph_index(long struct) {
        return MemoryUtil.memGetInt(struct + GLYPH_INDEX);
    }

    public static FT_Generic ngeneric(long struct) {
        return FT_Generic.create(struct + GENERIC);
    }

    public static FT_Glyph_Metrics nmetrics(long struct) {
        return FT_Glyph_Metrics.create(struct + METRICS);
    }

    public static long nlinearHoriAdvance(long struct) {
        return MemoryUtil.memGetCLong(struct + LINEARHORIADVANCE);
    }

    public static long nlinearVertAdvance(long struct) {
        return MemoryUtil.memGetCLong(struct + LINEARVERTADVANCE);
    }

    public static FT_Vector nadvance(long struct) {
        return FT_Vector.create(struct + ADVANCE);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static FT_Bitmap nbitmap(long struct) {
        return FT_Bitmap.create(struct + BITMAP);
    }

    public static int nbitmap_left(long struct) {
        return MemoryUtil.memGetInt(struct + BITMAP_LEFT);
    }

    public static int nbitmap_top(long struct) {
        return MemoryUtil.memGetInt(struct + BITMAP_TOP);
    }

    public static FT_Outline noutline(long struct) {
        return FT_Outline.create(struct + OUTLINE);
    }

    public static int nnum_subglyphs(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_SUBGLYPHS);
    }

    public static long nsubglyphs(long struct) {
        return MemoryUtil.memGetAddress(struct + SUBGLYPHS);
    }

    public static ByteBuffer ncontrol_data(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + CONTROL_DATA), (int) ncontrol_len(struct));
    }

    public static long ncontrol_len(long struct) {
        return MemoryUtil.memGetCLong(struct + CONTROL_LEN);
    }

    public static long nlsb_delta(long struct) {
        return MemoryUtil.memGetCLong(struct + LSB_DELTA);
    }

    public static long nrsb_delta(long struct) {
        return MemoryUtil.memGetCLong(struct + RSB_DELTA);
    }

    public static long nother(long struct) {
        return MemoryUtil.memGetAddress(struct + OTHER);
    }

    public static long ninternal(long struct) {
        return MemoryUtil.memGetAddress(struct + INTERNAL);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_GlyphSlot$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_GlyphSlot$Buffer.class */
    public static class Buffer extends StructBuffer<FT_GlyphSlot, Buffer> {
        private static final FT_GlyphSlot ELEMENT_FACTORY = FT_GlyphSlot.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_GlyphSlot.SIZEOF);
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
        public FT_GlyphSlot getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Library")
        public long library() {
            return FT_GlyphSlot.nlibrary(address());
        }

        public FT_Face face() {
            return FT_GlyphSlot.nface(address());
        }

        public FT_GlyphSlot next() {
            return FT_GlyphSlot.nnext(address());
        }

        @NativeType("FT_UInt")
        public int glyph_index() {
            return FT_GlyphSlot.nglyph_index(address());
        }

        public FT_Generic generic() {
            return FT_GlyphSlot.ngeneric(address());
        }

        public FT_Glyph_Metrics metrics() {
            return FT_GlyphSlot.nmetrics(address());
        }

        @NativeType("FT_Fixed")
        public long linearHoriAdvance() {
            return FT_GlyphSlot.nlinearHoriAdvance(address());
        }

        @NativeType("FT_Fixed")
        public long linearVertAdvance() {
            return FT_GlyphSlot.nlinearVertAdvance(address());
        }

        public FT_Vector advance() {
            return FT_GlyphSlot.nadvance(address());
        }

        @NativeType("FT_Glyph_Format")
        public int format() {
            return FT_GlyphSlot.nformat(address());
        }

        public FT_Bitmap bitmap() {
            return FT_GlyphSlot.nbitmap(address());
        }

        @NativeType("FT_Int")
        public int bitmap_left() {
            return FT_GlyphSlot.nbitmap_left(address());
        }

        @NativeType("FT_Int")
        public int bitmap_top() {
            return FT_GlyphSlot.nbitmap_top(address());
        }

        public FT_Outline outline() {
            return FT_GlyphSlot.noutline(address());
        }

        @NativeType("FT_Pos")
        public long lsb_delta() {
            return FT_GlyphSlot.nlsb_delta(address());
        }

        @NativeType("FT_Pos")
        public long rsb_delta() {
            return FT_GlyphSlot.nrsb_delta(address());
        }
    }
}
