package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_PCLT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_PCLT.class */
public class TT_PCLT extends Struct<TT_PCLT> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERSION;
    public static final int FONTNUMBER;
    public static final int PITCH;
    public static final int XHEIGHT;
    public static final int STYLE;
    public static final int TYPEFAMILY;
    public static final int CAPHEIGHT;
    public static final int SYMBOLSET;
    public static final int TYPEFACE;
    public static final int CHARACTERCOMPLEMENT;
    public static final int FILENAME;
    public static final int STROKEWEIGHT;
    public static final int WIDTHTYPE;
    public static final int SERIFSTYLE;
    public static final int RESERVED;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __array(1, 16), __array(1, 8), __array(1, 6), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERSION = layout.offsetof(0);
        FONTNUMBER = layout.offsetof(1);
        PITCH = layout.offsetof(2);
        XHEIGHT = layout.offsetof(3);
        STYLE = layout.offsetof(4);
        TYPEFAMILY = layout.offsetof(5);
        CAPHEIGHT = layout.offsetof(6);
        SYMBOLSET = layout.offsetof(7);
        TYPEFACE = layout.offsetof(8);
        CHARACTERCOMPLEMENT = layout.offsetof(9);
        FILENAME = layout.offsetof(10);
        STROKEWEIGHT = layout.offsetof(11);
        WIDTHTYPE = layout.offsetof(12);
        SERIFSTYLE = layout.offsetof(13);
        RESERVED = layout.offsetof(14);
    }

    protected TT_PCLT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public TT_PCLT create(long address, ByteBuffer container) {
        return new TT_PCLT(address, container);
    }

    public TT_PCLT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Fixed")
    public long Version() {
        return nVersion(address());
    }

    @NativeType("FT_ULong")
    public long FontNumber() {
        return nFontNumber(address());
    }

    @NativeType("FT_UShort")
    public short Pitch() {
        return nPitch(address());
    }

    @NativeType("FT_UShort")
    public short xHeight() {
        return nxHeight(address());
    }

    @NativeType("FT_UShort")
    public short Style() {
        return nStyle(address());
    }

    @NativeType("FT_UShort")
    public short TypeFamily() {
        return nTypeFamily(address());
    }

    @NativeType("FT_UShort")
    public short CapHeight() {
        return nCapHeight(address());
    }

    @NativeType("FT_UShort")
    public short SymbolSet() {
        return nSymbolSet(address());
    }

    @NativeType("FT_Char[16]")
    public ByteBuffer TypeFace() {
        return nTypeFace(address());
    }

    @NativeType("FT_Char")
    public byte TypeFace(int index) {
        return nTypeFace(address(), index);
    }

    @NativeType("FT_Char[8]")
    public ByteBuffer CharacterComplement() {
        return nCharacterComplement(address());
    }

    @NativeType("FT_Char")
    public byte CharacterComplement(int index) {
        return nCharacterComplement(address(), index);
    }

    @NativeType("FT_Char[6]")
    public ByteBuffer FileName() {
        return nFileName(address());
    }

    @NativeType("FT_Char")
    public byte FileName(int index) {
        return nFileName(address(), index);
    }

    @NativeType("FT_Char")
    public byte StrokeWeight() {
        return nStrokeWeight(address());
    }

    @NativeType("FT_Char")
    public byte WidthType() {
        return nWidthType(address());
    }

    @NativeType("FT_Byte")
    public byte SerifStyle() {
        return nSerifStyle(address());
    }

    @NativeType("FT_Byte")
    public byte Reserved() {
        return nReserved(address());
    }

    public static TT_PCLT create(long address) {
        return new TT_PCLT(address, null);
    }

    public static TT_PCLT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new TT_PCLT(address, null);
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

    public static long nVersion(long struct) {
        return MemoryUtil.memGetCLong(struct + VERSION);
    }

    public static long nFontNumber(long struct) {
        return MemoryUtil.memGetCLong(struct + FONTNUMBER);
    }

    public static short nPitch(long struct) {
        return MemoryUtil.memGetShort(struct + PITCH);
    }

    public static short nxHeight(long struct) {
        return MemoryUtil.memGetShort(struct + XHEIGHT);
    }

    public static short nStyle(long struct) {
        return MemoryUtil.memGetShort(struct + STYLE);
    }

    public static short nTypeFamily(long struct) {
        return MemoryUtil.memGetShort(struct + TYPEFAMILY);
    }

    public static short nCapHeight(long struct) {
        return MemoryUtil.memGetShort(struct + CAPHEIGHT);
    }

    public static short nSymbolSet(long struct) {
        return MemoryUtil.memGetShort(struct + SYMBOLSET);
    }

    public static ByteBuffer nTypeFace(long struct) {
        return MemoryUtil.memByteBuffer(struct + TYPEFACE, 16);
    }

    public static byte nTypeFace(long struct, int index) {
        return MemoryUtil.memGetByte(struct + TYPEFACE + (Checks.check(index, 16) * 1));
    }

    public static ByteBuffer nCharacterComplement(long struct) {
        return MemoryUtil.memByteBuffer(struct + CHARACTERCOMPLEMENT, 8);
    }

    public static byte nCharacterComplement(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CHARACTERCOMPLEMENT + (Checks.check(index, 8) * 1));
    }

    public static ByteBuffer nFileName(long struct) {
        return MemoryUtil.memByteBuffer(struct + FILENAME, 6);
    }

    public static byte nFileName(long struct, int index) {
        return MemoryUtil.memGetByte(struct + FILENAME + (Checks.check(index, 6) * 1));
    }

    public static byte nStrokeWeight(long struct) {
        return MemoryUtil.memGetByte(struct + STROKEWEIGHT);
    }

    public static byte nWidthType(long struct) {
        return MemoryUtil.memGetByte(struct + WIDTHTYPE);
    }

    public static byte nSerifStyle(long struct) {
        return MemoryUtil.memGetByte(struct + SERIFSTYLE);
    }

    public static byte nReserved(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_PCLT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_PCLT$Buffer.class */
    public static class Buffer extends StructBuffer<TT_PCLT, Buffer> {
        private static final TT_PCLT ELEMENT_FACTORY = TT_PCLT.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / TT_PCLT.SIZEOF);
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
        public TT_PCLT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Fixed")
        public long Version() {
            return TT_PCLT.nVersion(address());
        }

        @NativeType("FT_ULong")
        public long FontNumber() {
            return TT_PCLT.nFontNumber(address());
        }

        @NativeType("FT_UShort")
        public short Pitch() {
            return TT_PCLT.nPitch(address());
        }

        @NativeType("FT_UShort")
        public short xHeight() {
            return TT_PCLT.nxHeight(address());
        }

        @NativeType("FT_UShort")
        public short Style() {
            return TT_PCLT.nStyle(address());
        }

        @NativeType("FT_UShort")
        public short TypeFamily() {
            return TT_PCLT.nTypeFamily(address());
        }

        @NativeType("FT_UShort")
        public short CapHeight() {
            return TT_PCLT.nCapHeight(address());
        }

        @NativeType("FT_UShort")
        public short SymbolSet() {
            return TT_PCLT.nSymbolSet(address());
        }

        @NativeType("FT_Char[16]")
        public ByteBuffer TypeFace() {
            return TT_PCLT.nTypeFace(address());
        }

        @NativeType("FT_Char")
        public byte TypeFace(int index) {
            return TT_PCLT.nTypeFace(address(), index);
        }

        @NativeType("FT_Char[8]")
        public ByteBuffer CharacterComplement() {
            return TT_PCLT.nCharacterComplement(address());
        }

        @NativeType("FT_Char")
        public byte CharacterComplement(int index) {
            return TT_PCLT.nCharacterComplement(address(), index);
        }

        @NativeType("FT_Char[6]")
        public ByteBuffer FileName() {
            return TT_PCLT.nFileName(address());
        }

        @NativeType("FT_Char")
        public byte FileName(int index) {
            return TT_PCLT.nFileName(address(), index);
        }

        @NativeType("FT_Char")
        public byte StrokeWeight() {
            return TT_PCLT.nStrokeWeight(address());
        }

        @NativeType("FT_Char")
        public byte WidthType() {
            return TT_PCLT.nWidthType(address());
        }

        @NativeType("FT_Byte")
        public byte SerifStyle() {
            return TT_PCLT.nSerifStyle(address());
        }

        @NativeType("FT_Byte")
        public byte Reserved() {
            return TT_PCLT.nReserved(address());
        }
    }
}
