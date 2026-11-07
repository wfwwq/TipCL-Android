package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.CLongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_Header.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_Header.class */
public class TT_Header extends Struct<TT_Header> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TABLE_VERSION;
    public static final int FONT_REVISION;
    public static final int CHECKSUM_ADJUST;
    public static final int MAGIC_NUMBER;
    public static final int FLAGS;
    public static final int UNITS_PER_EM;
    public static final int CREATED;
    public static final int MODIFIED;
    public static final int XMIN;
    public static final int YMIN;
    public static final int XMAX;
    public static final int YMAX;
    public static final int MAC_STYLE;
    public static final int LOWEST_REC_PPEM;
    public static final int FONT_DIRECTION;
    public static final int INDEX_TO_LOC_FORMAT;
    public static final int GLYPH_DATA_FORMAT;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(2), __member(2), __array(CLONG_SIZE, 2), __array(CLONG_SIZE, 2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TABLE_VERSION = layout.offsetof(0);
        FONT_REVISION = layout.offsetof(1);
        CHECKSUM_ADJUST = layout.offsetof(2);
        MAGIC_NUMBER = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
        UNITS_PER_EM = layout.offsetof(5);
        CREATED = layout.offsetof(6);
        MODIFIED = layout.offsetof(7);
        XMIN = layout.offsetof(8);
        YMIN = layout.offsetof(9);
        XMAX = layout.offsetof(10);
        YMAX = layout.offsetof(11);
        MAC_STYLE = layout.offsetof(12);
        LOWEST_REC_PPEM = layout.offsetof(13);
        FONT_DIRECTION = layout.offsetof(14);
        INDEX_TO_LOC_FORMAT = layout.offsetof(15);
        GLYPH_DATA_FORMAT = layout.offsetof(16);
    }

    protected TT_Header(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public TT_Header create(long address, ByteBuffer container) {
        return new TT_Header(address, container);
    }

    public TT_Header(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Fixed")
    public long Table_Version() {
        return nTable_Version(address());
    }

    @NativeType("FT_Fixed")
    public long Font_Revision() {
        return nFont_Revision(address());
    }

    @NativeType("FT_Long")
    public long CheckSum_Adjust() {
        return nCheckSum_Adjust(address());
    }

    @NativeType("FT_Long")
    public long Magic_Number() {
        return nMagic_Number(address());
    }

    @NativeType("FT_UShort")
    public short Flags() {
        return nFlags(address());
    }

    @NativeType("FT_UShort")
    public short Units_Per_EM() {
        return nUnits_Per_EM(address());
    }

    @NativeType("FT_ULong[2]")
    public CLongBuffer Created() {
        return nCreated(address());
    }

    @NativeType("FT_ULong")
    public long Created(int index) {
        return nCreated(address(), index);
    }

    @NativeType("FT_ULong[2]")
    public CLongBuffer Modified() {
        return nModified(address());
    }

    @NativeType("FT_ULong")
    public long Modified(int index) {
        return nModified(address(), index);
    }

    @NativeType("FT_Short")
    public short xMin() {
        return nxMin(address());
    }

    @NativeType("FT_Short")
    public short yMin() {
        return nyMin(address());
    }

    @NativeType("FT_Short")
    public short xMax() {
        return nxMax(address());
    }

    @NativeType("FT_Short")
    public short yMax() {
        return nyMax(address());
    }

    @NativeType("FT_UShort")
    public short Mac_Style() {
        return nMac_Style(address());
    }

    @NativeType("FT_UShort")
    public short Lowest_Rec_PPEM() {
        return nLowest_Rec_PPEM(address());
    }

    @NativeType("FT_Short")
    public short Font_Direction() {
        return nFont_Direction(address());
    }

    @NativeType("FT_Short")
    public short Index_To_Loc_Format() {
        return nIndex_To_Loc_Format(address());
    }

    @NativeType("FT_Short")
    public short Glyph_Data_Format() {
        return nGlyph_Data_Format(address());
    }

    public static TT_Header create(long address) {
        return new TT_Header(address, null);
    }

    public static TT_Header createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new TT_Header(address, null);
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

    public static long nTable_Version(long struct) {
        return MemoryUtil.memGetCLong(struct + TABLE_VERSION);
    }

    public static long nFont_Revision(long struct) {
        return MemoryUtil.memGetCLong(struct + FONT_REVISION);
    }

    public static long nCheckSum_Adjust(long struct) {
        return MemoryUtil.memGetCLong(struct + CHECKSUM_ADJUST);
    }

    public static long nMagic_Number(long struct) {
        return MemoryUtil.memGetCLong(struct + MAGIC_NUMBER);
    }

    public static short nFlags(long struct) {
        return MemoryUtil.memGetShort(struct + FLAGS);
    }

    public static short nUnits_Per_EM(long struct) {
        return MemoryUtil.memGetShort(struct + UNITS_PER_EM);
    }

    public static CLongBuffer nCreated(long struct) {
        return MemoryUtil.memCLongBuffer(struct + CREATED, 2);
    }

    public static long nCreated(long struct, int index) {
        return MemoryUtil.memGetCLong(struct + CREATED + (Checks.check(index, 2) * CLONG_SIZE));
    }

    public static CLongBuffer nModified(long struct) {
        return MemoryUtil.memCLongBuffer(struct + MODIFIED, 2);
    }

    public static long nModified(long struct, int index) {
        return MemoryUtil.memGetCLong(struct + MODIFIED + (Checks.check(index, 2) * CLONG_SIZE));
    }

    public static short nxMin(long struct) {
        return MemoryUtil.memGetShort(struct + XMIN);
    }

    public static short nyMin(long struct) {
        return MemoryUtil.memGetShort(struct + YMIN);
    }

    public static short nxMax(long struct) {
        return MemoryUtil.memGetShort(struct + XMAX);
    }

    public static short nyMax(long struct) {
        return MemoryUtil.memGetShort(struct + YMAX);
    }

    public static short nMac_Style(long struct) {
        return MemoryUtil.memGetShort(struct + MAC_STYLE);
    }

    public static short nLowest_Rec_PPEM(long struct) {
        return MemoryUtil.memGetShort(struct + LOWEST_REC_PPEM);
    }

    public static short nFont_Direction(long struct) {
        return MemoryUtil.memGetShort(struct + FONT_DIRECTION);
    }

    public static short nIndex_To_Loc_Format(long struct) {
        return MemoryUtil.memGetShort(struct + INDEX_TO_LOC_FORMAT);
    }

    public static short nGlyph_Data_Format(long struct) {
        return MemoryUtil.memGetShort(struct + GLYPH_DATA_FORMAT);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_Header$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_Header$Buffer.class */
    public static class Buffer extends StructBuffer<TT_Header, Buffer> {
        private static final TT_Header ELEMENT_FACTORY = TT_Header.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / TT_Header.SIZEOF);
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
        public TT_Header getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Fixed")
        public long Table_Version() {
            return TT_Header.nTable_Version(address());
        }

        @NativeType("FT_Fixed")
        public long Font_Revision() {
            return TT_Header.nFont_Revision(address());
        }

        @NativeType("FT_Long")
        public long CheckSum_Adjust() {
            return TT_Header.nCheckSum_Adjust(address());
        }

        @NativeType("FT_Long")
        public long Magic_Number() {
            return TT_Header.nMagic_Number(address());
        }

        @NativeType("FT_UShort")
        public short Flags() {
            return TT_Header.nFlags(address());
        }

        @NativeType("FT_UShort")
        public short Units_Per_EM() {
            return TT_Header.nUnits_Per_EM(address());
        }

        @NativeType("FT_ULong[2]")
        public CLongBuffer Created() {
            return TT_Header.nCreated(address());
        }

        @NativeType("FT_ULong")
        public long Created(int index) {
            return TT_Header.nCreated(address(), index);
        }

        @NativeType("FT_ULong[2]")
        public CLongBuffer Modified() {
            return TT_Header.nModified(address());
        }

        @NativeType("FT_ULong")
        public long Modified(int index) {
            return TT_Header.nModified(address(), index);
        }

        @NativeType("FT_Short")
        public short xMin() {
            return TT_Header.nxMin(address());
        }

        @NativeType("FT_Short")
        public short yMin() {
            return TT_Header.nyMin(address());
        }

        @NativeType("FT_Short")
        public short xMax() {
            return TT_Header.nxMax(address());
        }

        @NativeType("FT_Short")
        public short yMax() {
            return TT_Header.nyMax(address());
        }

        @NativeType("FT_UShort")
        public short Mac_Style() {
            return TT_Header.nMac_Style(address());
        }

        @NativeType("FT_UShort")
        public short Lowest_Rec_PPEM() {
            return TT_Header.nLowest_Rec_PPEM(address());
        }

        @NativeType("FT_Short")
        public short Font_Direction() {
            return TT_Header.nFont_Direction(address());
        }

        @NativeType("FT_Short")
        public short Index_To_Loc_Format() {
            return TT_Header.nIndex_To_Loc_Format(address());
        }

        @NativeType("FT_Short")
        public short Glyph_Data_Format() {
            return TT_Header.nGlyph_Data_Format(address());
        }
    }
}
