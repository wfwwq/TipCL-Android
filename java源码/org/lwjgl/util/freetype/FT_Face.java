package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.util.freetype.FT_Bitmap_Size;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Face.class
 */
@NativeType("struct FT_FaceRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Face.class */
public class FT_Face extends Struct<FT_Face> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NUM_FACES;
    public static final int FACE_INDEX;
    public static final int FACE_FLAGS;
    public static final int STYLE_FLAGS;
    public static final int NUM_GLYPHS;
    public static final int FAMILY_NAME;
    public static final int STYLE_NAME;
    public static final int NUM_FIXED_SIZES;
    public static final int AVAILABLE_SIZES;
    public static final int NUM_CHARMAPS;
    public static final int CHARMAPS;
    public static final int GENERIC;
    public static final int BBOX;
    public static final int UNITS_PER_EM;
    public static final int ASCENDER;
    public static final int DESCENDER;
    public static final int HEIGHT;
    public static final int MAX_ADVANCE_WIDTH;
    public static final int MAX_ADVANCE_HEIGHT;
    public static final int UNDERLINE_POSITION;
    public static final int UNDERLINE_THICKNESS;
    public static final int GLYPH;
    public static final int SIZE;
    public static final int CHARMAP;
    public static final int DRIVER;
    public static final int MEMORY;
    public static final int STREAM;
    public static final int SIZES_LIST;
    public static final int AUTOHINT;
    public static final int EXTENSIONS;
    public static final int INTERNAL;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(FT_Generic.SIZEOF, FT_Generic.ALIGNOF), __member(FT_BBox.SIZEOF, FT_BBox.ALIGNOF), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(FT_List.SIZEOF, FT_List.ALIGNOF), __member(FT_Generic.SIZEOF, FT_Generic.ALIGNOF), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NUM_FACES = layout.offsetof(0);
        FACE_INDEX = layout.offsetof(1);
        FACE_FLAGS = layout.offsetof(2);
        STYLE_FLAGS = layout.offsetof(3);
        NUM_GLYPHS = layout.offsetof(4);
        FAMILY_NAME = layout.offsetof(5);
        STYLE_NAME = layout.offsetof(6);
        NUM_FIXED_SIZES = layout.offsetof(7);
        AVAILABLE_SIZES = layout.offsetof(8);
        NUM_CHARMAPS = layout.offsetof(9);
        CHARMAPS = layout.offsetof(10);
        GENERIC = layout.offsetof(11);
        BBOX = layout.offsetof(12);
        UNITS_PER_EM = layout.offsetof(13);
        ASCENDER = layout.offsetof(14);
        DESCENDER = layout.offsetof(15);
        HEIGHT = layout.offsetof(16);
        MAX_ADVANCE_WIDTH = layout.offsetof(17);
        MAX_ADVANCE_HEIGHT = layout.offsetof(18);
        UNDERLINE_POSITION = layout.offsetof(19);
        UNDERLINE_THICKNESS = layout.offsetof(20);
        GLYPH = layout.offsetof(21);
        SIZE = layout.offsetof(22);
        CHARMAP = layout.offsetof(23);
        DRIVER = layout.offsetof(24);
        MEMORY = layout.offsetof(25);
        STREAM = layout.offsetof(26);
        SIZES_LIST = layout.offsetof(27);
        AUTOHINT = layout.offsetof(28);
        EXTENSIONS = layout.offsetof(29);
        INTERNAL = layout.offsetof(30);
    }

    protected FT_Face(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Face create(long address, ByteBuffer container) {
        return new FT_Face(address, container);
    }

    public FT_Face(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Long")
    public long num_faces() {
        return nnum_faces(address());
    }

    @NativeType("FT_Long")
    public long face_index() {
        return nface_index(address());
    }

    @NativeType("FT_Long")
    public long face_flags() {
        return nface_flags(address());
    }

    @NativeType("FT_Long")
    public long style_flags() {
        return nstyle_flags(address());
    }

    @NativeType("FT_Long")
    public long num_glyphs() {
        return nnum_glyphs(address());
    }

    @NativeType("FT_String *")
    public ByteBuffer family_name() {
        return nfamily_name(address());
    }

    @NativeType("FT_String *")
    public String family_nameString() {
        return nfamily_nameString(address());
    }

    @NativeType("FT_String *")
    public ByteBuffer style_name() {
        return nstyle_name(address());
    }

    @NativeType("FT_String *")
    public String style_nameString() {
        return nstyle_nameString(address());
    }

    @NativeType("FT_Int")
    public int num_fixed_sizes() {
        return nnum_fixed_sizes(address());
    }

    @NativeType("FT_Bitmap_Size *")
    public FT_Bitmap_Size.Buffer available_sizes() {
        return navailable_sizes(address());
    }

    @NativeType("FT_Int")
    public int num_charmaps() {
        return nnum_charmaps(address());
    }

    @NativeType("FT_CharMap *")
    public PointerBuffer charmaps() {
        return ncharmaps(address());
    }

    public FT_Generic generic() {
        return ngeneric(address());
    }

    public FT_BBox bbox() {
        return nbbox(address());
    }

    @NativeType("FT_UShort")
    public short units_per_EM() {
        return nunits_per_EM(address());
    }

    @NativeType("FT_Short")
    public short ascender() {
        return nascender(address());
    }

    @NativeType("FT_Short")
    public short descender() {
        return ndescender(address());
    }

    @NativeType("FT_Short")
    public short height() {
        return nheight(address());
    }

    @NativeType("FT_Short")
    public short max_advance_width() {
        return nmax_advance_width(address());
    }

    @NativeType("FT_Short")
    public short max_advance_height() {
        return nmax_advance_height(address());
    }

    @NativeType("FT_Short")
    public short underline_position() {
        return nunderline_position(address());
    }

    @NativeType("FT_Short")
    public short underline_thickness() {
        return nunderline_thickness(address());
    }

    public FT_GlyphSlot glyph() {
        return nglyph(address());
    }

    public FT_Size size() {
        return nsize(address());
    }

    public FT_CharMap charmap() {
        return ncharmap(address());
    }

    public static FT_Face create(long address) {
        return new FT_Face(address, null);
    }

    public static FT_Face createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Face(address, null);
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

    public static long nnum_faces(long struct) {
        return MemoryUtil.memGetCLong(struct + NUM_FACES);
    }

    public static long nface_index(long struct) {
        return MemoryUtil.memGetCLong(struct + FACE_INDEX);
    }

    public static long nface_flags(long struct) {
        return MemoryUtil.memGetCLong(struct + FACE_FLAGS);
    }

    public static long nstyle_flags(long struct) {
        return MemoryUtil.memGetCLong(struct + STYLE_FLAGS);
    }

    public static long nnum_glyphs(long struct) {
        return MemoryUtil.memGetCLong(struct + NUM_GLYPHS);
    }

    public static ByteBuffer nfamily_name(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + FAMILY_NAME));
    }

    public static String nfamily_nameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + FAMILY_NAME));
    }

    public static ByteBuffer nstyle_name(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + STYLE_NAME));
    }

    public static String nstyle_nameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + STYLE_NAME));
    }

    public static int nnum_fixed_sizes(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_FIXED_SIZES);
    }

    public static FT_Bitmap_Size.Buffer navailable_sizes(long struct) {
        return FT_Bitmap_Size.createSafe(MemoryUtil.memGetAddress(struct + AVAILABLE_SIZES), nnum_fixed_sizes(struct));
    }

    public static int nnum_charmaps(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_CHARMAPS);
    }

    public static PointerBuffer ncharmaps(long struct) {
        return MemoryUtil.memPointerBuffer(MemoryUtil.memGetAddress(struct + CHARMAPS), nnum_charmaps(struct));
    }

    public static FT_Generic ngeneric(long struct) {
        return FT_Generic.create(struct + GENERIC);
    }

    public static FT_BBox nbbox(long struct) {
        return FT_BBox.create(struct + BBOX);
    }

    public static short nunits_per_EM(long struct) {
        return MemoryUtil.memGetShort(struct + UNITS_PER_EM);
    }

    public static short nascender(long struct) {
        return MemoryUtil.memGetShort(struct + ASCENDER);
    }

    public static short ndescender(long struct) {
        return MemoryUtil.memGetShort(struct + DESCENDER);
    }

    public static short nheight(long struct) {
        return MemoryUtil.memGetShort(struct + HEIGHT);
    }

    public static short nmax_advance_width(long struct) {
        return MemoryUtil.memGetShort(struct + MAX_ADVANCE_WIDTH);
    }

    public static short nmax_advance_height(long struct) {
        return MemoryUtil.memGetShort(struct + MAX_ADVANCE_HEIGHT);
    }

    public static short nunderline_position(long struct) {
        return MemoryUtil.memGetShort(struct + UNDERLINE_POSITION);
    }

    public static short nunderline_thickness(long struct) {
        return MemoryUtil.memGetShort(struct + UNDERLINE_THICKNESS);
    }

    public static FT_GlyphSlot nglyph(long struct) {
        return FT_GlyphSlot.createSafe(MemoryUtil.memGetAddress(struct + GLYPH));
    }

    public static FT_Size nsize(long struct) {
        return FT_Size.createSafe(MemoryUtil.memGetAddress(struct + SIZE));
    }

    public static FT_CharMap ncharmap(long struct) {
        return FT_CharMap.createSafe(MemoryUtil.memGetAddress(struct + CHARMAP));
    }

    public static long ndriver(long struct) {
        return MemoryUtil.memGetAddress(struct + DRIVER);
    }

    public static FT_Memory nmemory(long struct) {
        return FT_Memory.createSafe(MemoryUtil.memGetAddress(struct + MEMORY));
    }

    public static FT_List nsizes_list(long struct) {
        return FT_List.create(struct + SIZES_LIST);
    }

    public static FT_Generic nautohint(long struct) {
        return FT_Generic.create(struct + AUTOHINT);
    }

    public static long nextensions(long struct) {
        return MemoryUtil.memGetAddress(struct + EXTENSIONS);
    }

    public static long ninternal(long struct) {
        return MemoryUtil.memGetAddress(struct + INTERNAL);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Face$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Face$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Face, Buffer> {
        private static final FT_Face ELEMENT_FACTORY = FT_Face.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Face.SIZEOF);
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
        public FT_Face getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Long")
        public long num_faces() {
            return FT_Face.nnum_faces(address());
        }

        @NativeType("FT_Long")
        public long face_index() {
            return FT_Face.nface_index(address());
        }

        @NativeType("FT_Long")
        public long face_flags() {
            return FT_Face.nface_flags(address());
        }

        @NativeType("FT_Long")
        public long style_flags() {
            return FT_Face.nstyle_flags(address());
        }

        @NativeType("FT_Long")
        public long num_glyphs() {
            return FT_Face.nnum_glyphs(address());
        }

        @NativeType("FT_String *")
        public ByteBuffer family_name() {
            return FT_Face.nfamily_name(address());
        }

        @NativeType("FT_String *")
        public String family_nameString() {
            return FT_Face.nfamily_nameString(address());
        }

        @NativeType("FT_String *")
        public ByteBuffer style_name() {
            return FT_Face.nstyle_name(address());
        }

        @NativeType("FT_String *")
        public String style_nameString() {
            return FT_Face.nstyle_nameString(address());
        }

        @NativeType("FT_Int")
        public int num_fixed_sizes() {
            return FT_Face.nnum_fixed_sizes(address());
        }

        @NativeType("FT_Bitmap_Size *")
        public FT_Bitmap_Size.Buffer available_sizes() {
            return FT_Face.navailable_sizes(address());
        }

        @NativeType("FT_Int")
        public int num_charmaps() {
            return FT_Face.nnum_charmaps(address());
        }

        @NativeType("FT_CharMap *")
        public PointerBuffer charmaps() {
            return FT_Face.ncharmaps(address());
        }

        public FT_Generic generic() {
            return FT_Face.ngeneric(address());
        }

        public FT_BBox bbox() {
            return FT_Face.nbbox(address());
        }

        @NativeType("FT_UShort")
        public short units_per_EM() {
            return FT_Face.nunits_per_EM(address());
        }

        @NativeType("FT_Short")
        public short ascender() {
            return FT_Face.nascender(address());
        }

        @NativeType("FT_Short")
        public short descender() {
            return FT_Face.ndescender(address());
        }

        @NativeType("FT_Short")
        public short height() {
            return FT_Face.nheight(address());
        }

        @NativeType("FT_Short")
        public short max_advance_width() {
            return FT_Face.nmax_advance_width(address());
        }

        @NativeType("FT_Short")
        public short max_advance_height() {
            return FT_Face.nmax_advance_height(address());
        }

        @NativeType("FT_Short")
        public short underline_position() {
            return FT_Face.nunderline_position(address());
        }

        @NativeType("FT_Short")
        public short underline_thickness() {
            return FT_Face.nunderline_thickness(address());
        }

        public FT_GlyphSlot glyph() {
            return FT_Face.nglyph(address());
        }

        public FT_Size size() {
            return FT_Face.nsize(address());
        }

        public FT_CharMap charmap() {
            return FT_Face.ncharmap(address());
        }
    }
}
