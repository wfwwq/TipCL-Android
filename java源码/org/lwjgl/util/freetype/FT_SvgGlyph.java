package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SvgGlyph.class
 */
@NativeType("struct FT_SvgGlyphRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SvgGlyph.class */
public class FT_SvgGlyph extends Struct<FT_SvgGlyph> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ROOT;
    public static final int SVG_DOCUMENT;
    public static final int SVG_DOCUMENT_LENGTH;
    public static final int GLYPH_INDEX;
    public static final int METRICS;
    public static final int UNITS_PER_EM;
    public static final int START_GLYPH_ID;
    public static final int END_GLYPH_ID;
    public static final int TRANSFORM;
    public static final int DELTA;

    static {
        Struct.Layout layout = __struct(__member(FT_Glyph.SIZEOF, FT_Glyph.ALIGNOF), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(4), __member(FT_Size_Metrics.SIZEOF, FT_Size_Metrics.ALIGNOF), __member(2), __member(2), __member(2), __member(FT_Matrix.SIZEOF, FT_Matrix.ALIGNOF), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ROOT = layout.offsetof(0);
        SVG_DOCUMENT = layout.offsetof(1);
        SVG_DOCUMENT_LENGTH = layout.offsetof(2);
        GLYPH_INDEX = layout.offsetof(3);
        METRICS = layout.offsetof(4);
        UNITS_PER_EM = layout.offsetof(5);
        START_GLYPH_ID = layout.offsetof(6);
        END_GLYPH_ID = layout.offsetof(7);
        TRANSFORM = layout.offsetof(8);
        DELTA = layout.offsetof(9);
    }

    protected FT_SvgGlyph(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_SvgGlyph create(long address, ByteBuffer container) {
        return new FT_SvgGlyph(address, container);
    }

    public FT_SvgGlyph(ByteBuffer container) {
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

    @NativeType("FT_Byte *")
    public ByteBuffer svg_document() {
        return nsvg_document(address());
    }

    @NativeType("FT_ULong")
    public long svg_document_length() {
        return nsvg_document_length(address());
    }

    @NativeType("FT_UInt")
    public int glyph_index() {
        return nglyph_index(address());
    }

    public FT_Size_Metrics metrics() {
        return nmetrics(address());
    }

    @NativeType("FT_UShort")
    public short units_per_EM() {
        return nunits_per_EM(address());
    }

    @NativeType("FT_UShort")
    public short start_glyph_id() {
        return nstart_glyph_id(address());
    }

    @NativeType("FT_UShort")
    public short end_glyph_id() {
        return nend_glyph_id(address());
    }

    public FT_Matrix transform() {
        return ntransform(address());
    }

    public FT_Vector delta() {
        return ndelta(address());
    }

    public static FT_SvgGlyph create(long address) {
        return new FT_SvgGlyph(address, null);
    }

    public static FT_SvgGlyph createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_SvgGlyph(address, null);
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

    public static ByteBuffer nsvg_document(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + SVG_DOCUMENT), (int) nsvg_document_length(struct));
    }

    public static long nsvg_document_length(long struct) {
        return MemoryUtil.memGetCLong(struct + SVG_DOCUMENT_LENGTH);
    }

    public static int nglyph_index(long struct) {
        return MemoryUtil.memGetInt(struct + GLYPH_INDEX);
    }

    public static FT_Size_Metrics nmetrics(long struct) {
        return FT_Size_Metrics.create(struct + METRICS);
    }

    public static short nunits_per_EM(long struct) {
        return MemoryUtil.memGetShort(struct + UNITS_PER_EM);
    }

    public static short nstart_glyph_id(long struct) {
        return MemoryUtil.memGetShort(struct + START_GLYPH_ID);
    }

    public static short nend_glyph_id(long struct) {
        return MemoryUtil.memGetShort(struct + END_GLYPH_ID);
    }

    public static FT_Matrix ntransform(long struct) {
        return FT_Matrix.create(struct + TRANSFORM);
    }

    public static FT_Vector ndelta(long struct) {
        return FT_Vector.create(struct + DELTA);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SvgGlyph$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SvgGlyph$Buffer.class */
    public static class Buffer extends StructBuffer<FT_SvgGlyph, Buffer> {
        private static final FT_SvgGlyph ELEMENT_FACTORY = FT_SvgGlyph.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_SvgGlyph.SIZEOF);
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
        public FT_SvgGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_GlyphRec")
        public FT_Glyph root() {
            return FT_SvgGlyph.nroot(address());
        }

        @NativeType("FT_Byte *")
        public ByteBuffer svg_document() {
            return FT_SvgGlyph.nsvg_document(address());
        }

        @NativeType("FT_ULong")
        public long svg_document_length() {
            return FT_SvgGlyph.nsvg_document_length(address());
        }

        @NativeType("FT_UInt")
        public int glyph_index() {
            return FT_SvgGlyph.nglyph_index(address());
        }

        public FT_Size_Metrics metrics() {
            return FT_SvgGlyph.nmetrics(address());
        }

        @NativeType("FT_UShort")
        public short units_per_EM() {
            return FT_SvgGlyph.nunits_per_EM(address());
        }

        @NativeType("FT_UShort")
        public short start_glyph_id() {
            return FT_SvgGlyph.nstart_glyph_id(address());
        }

        @NativeType("FT_UShort")
        public short end_glyph_id() {
            return FT_SvgGlyph.nend_glyph_id(address());
        }

        public FT_Matrix transform() {
            return FT_SvgGlyph.ntransform(address());
        }

        public FT_Vector delta() {
            return FT_SvgGlyph.ndelta(address());
        }
    }
}
