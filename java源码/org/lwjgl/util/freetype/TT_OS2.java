package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_OS2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_OS2.class */
public class TT_OS2 extends Struct<TT_OS2> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERSION;
    public static final int XAVGCHARWIDTH;
    public static final int USWEIGHTCLASS;
    public static final int USWIDTHCLASS;
    public static final int FSTYPE;
    public static final int YSUBSCRIPTXSIZE;
    public static final int YSUBSCRIPTYSIZE;
    public static final int YSUBSCRIPTXOFFSET;
    public static final int YSUBSCRIPTYOFFSET;
    public static final int YSUPERSCRIPTXSIZE;
    public static final int YSUPERSCRIPTYSIZE;
    public static final int YSUPERSCRIPTXOFFSET;
    public static final int YSUPERSCRIPTYOFFSET;
    public static final int YSTRIKEOUTSIZE;
    public static final int YSTRIKEOUTPOSITION;
    public static final int SFAMILYCLASS;
    public static final int PANOSE;
    public static final int ULUNICODERANGE1;
    public static final int ULUNICODERANGE2;
    public static final int ULUNICODERANGE3;
    public static final int ULUNICODERANGE4;
    public static final int ACHVENDID;
    public static final int FSSELECTION;
    public static final int USFIRSTCHARINDEX;
    public static final int USLASTCHARINDEX;
    public static final int STYPOASCENDER;
    public static final int STYPODESCENDER;
    public static final int STYPOLINEGAP;
    public static final int USWINASCENT;
    public static final int USWINDESCENT;
    public static final int ULCODEPAGERANGE1;
    public static final int ULCODEPAGERANGE2;
    public static final int SXHEIGHT;
    public static final int SCAPHEIGHT;
    public static final int USDEFAULTCHAR;
    public static final int USBREAKCHAR;
    public static final int USMAXCONTEXT;
    public static final int USLOWEROPTICALPOINTSIZE;
    public static final int USUPPEROPTICALPOINTSIZE;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __array(1, 10), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __array(1, 4), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERSION = layout.offsetof(0);
        XAVGCHARWIDTH = layout.offsetof(1);
        USWEIGHTCLASS = layout.offsetof(2);
        USWIDTHCLASS = layout.offsetof(3);
        FSTYPE = layout.offsetof(4);
        YSUBSCRIPTXSIZE = layout.offsetof(5);
        YSUBSCRIPTYSIZE = layout.offsetof(6);
        YSUBSCRIPTXOFFSET = layout.offsetof(7);
        YSUBSCRIPTYOFFSET = layout.offsetof(8);
        YSUPERSCRIPTXSIZE = layout.offsetof(9);
        YSUPERSCRIPTYSIZE = layout.offsetof(10);
        YSUPERSCRIPTXOFFSET = layout.offsetof(11);
        YSUPERSCRIPTYOFFSET = layout.offsetof(12);
        YSTRIKEOUTSIZE = layout.offsetof(13);
        YSTRIKEOUTPOSITION = layout.offsetof(14);
        SFAMILYCLASS = layout.offsetof(15);
        PANOSE = layout.offsetof(16);
        ULUNICODERANGE1 = layout.offsetof(17);
        ULUNICODERANGE2 = layout.offsetof(18);
        ULUNICODERANGE3 = layout.offsetof(19);
        ULUNICODERANGE4 = layout.offsetof(20);
        ACHVENDID = layout.offsetof(21);
        FSSELECTION = layout.offsetof(22);
        USFIRSTCHARINDEX = layout.offsetof(23);
        USLASTCHARINDEX = layout.offsetof(24);
        STYPOASCENDER = layout.offsetof(25);
        STYPODESCENDER = layout.offsetof(26);
        STYPOLINEGAP = layout.offsetof(27);
        USWINASCENT = layout.offsetof(28);
        USWINDESCENT = layout.offsetof(29);
        ULCODEPAGERANGE1 = layout.offsetof(30);
        ULCODEPAGERANGE2 = layout.offsetof(31);
        SXHEIGHT = layout.offsetof(32);
        SCAPHEIGHT = layout.offsetof(33);
        USDEFAULTCHAR = layout.offsetof(34);
        USBREAKCHAR = layout.offsetof(35);
        USMAXCONTEXT = layout.offsetof(36);
        USLOWEROPTICALPOINTSIZE = layout.offsetof(37);
        USUPPEROPTICALPOINTSIZE = layout.offsetof(38);
    }

    protected TT_OS2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public TT_OS2 create(long address, ByteBuffer container) {
        return new TT_OS2(address, container);
    }

    public TT_OS2(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UShort")
    public short version() {
        return nversion(address());
    }

    @NativeType("FT_Short")
    public short xAvgCharWidth() {
        return nxAvgCharWidth(address());
    }

    @NativeType("FT_UShort")
    public short usWeightClass() {
        return nusWeightClass(address());
    }

    @NativeType("FT_UShort")
    public short usWidthClass() {
        return nusWidthClass(address());
    }

    @NativeType("FT_UShort")
    public short fsType() {
        return nfsType(address());
    }

    @NativeType("FT_Short")
    public short ySubscriptXSize() {
        return nySubscriptXSize(address());
    }

    @NativeType("FT_Short")
    public short ySubscriptYSize() {
        return nySubscriptYSize(address());
    }

    @NativeType("FT_Short")
    public short ySubscriptXOffset() {
        return nySubscriptXOffset(address());
    }

    @NativeType("FT_Short")
    public short ySubscriptYOffset() {
        return nySubscriptYOffset(address());
    }

    @NativeType("FT_Short")
    public short ySuperscriptXSize() {
        return nySuperscriptXSize(address());
    }

    @NativeType("FT_Short")
    public short ySuperscriptYSize() {
        return nySuperscriptYSize(address());
    }

    @NativeType("FT_Short")
    public short ySuperscriptXOffset() {
        return nySuperscriptXOffset(address());
    }

    @NativeType("FT_Short")
    public short ySuperscriptYOffset() {
        return nySuperscriptYOffset(address());
    }

    @NativeType("FT_Short")
    public short yStrikeoutSize() {
        return nyStrikeoutSize(address());
    }

    @NativeType("FT_Short")
    public short yStrikeoutPosition() {
        return nyStrikeoutPosition(address());
    }

    @NativeType("FT_Short")
    public short sFamilyClass() {
        return nsFamilyClass(address());
    }

    @NativeType("FT_Byte[10]")
    public ByteBuffer panose() {
        return npanose(address());
    }

    @NativeType("FT_Byte")
    public byte panose(int index) {
        return npanose(address(), index);
    }

    @NativeType("FT_ULong")
    public long ulUnicodeRange1() {
        return nulUnicodeRange1(address());
    }

    @NativeType("FT_ULong")
    public long ulUnicodeRange2() {
        return nulUnicodeRange2(address());
    }

    @NativeType("FT_ULong")
    public long ulUnicodeRange3() {
        return nulUnicodeRange3(address());
    }

    @NativeType("FT_ULong")
    public long ulUnicodeRange4() {
        return nulUnicodeRange4(address());
    }

    @NativeType("FT_Char[4]")
    public ByteBuffer achVendID() {
        return nachVendID(address());
    }

    @NativeType("FT_Char")
    public byte achVendID(int index) {
        return nachVendID(address(), index);
    }

    @NativeType("FT_UShort")
    public short fsSelection() {
        return nfsSelection(address());
    }

    @NativeType("FT_UShort")
    public short usFirstCharIndex() {
        return nusFirstCharIndex(address());
    }

    @NativeType("FT_UShort")
    public short usLastCharIndex() {
        return nusLastCharIndex(address());
    }

    @NativeType("FT_Short")
    public short sTypoAscender() {
        return nsTypoAscender(address());
    }

    @NativeType("FT_Short")
    public short sTypoDescender() {
        return nsTypoDescender(address());
    }

    @NativeType("FT_Short")
    public short sTypoLineGap() {
        return nsTypoLineGap(address());
    }

    @NativeType("FT_UShort")
    public short usWinAscent() {
        return nusWinAscent(address());
    }

    @NativeType("FT_UShort")
    public short usWinDescent() {
        return nusWinDescent(address());
    }

    @NativeType("FT_ULong")
    public long ulCodePageRange1() {
        return nulCodePageRange1(address());
    }

    @NativeType("FT_ULong")
    public long ulCodePageRange2() {
        return nulCodePageRange2(address());
    }

    @NativeType("FT_Short")
    public short sxHeight() {
        return nsxHeight(address());
    }

    @NativeType("FT_Short")
    public short sCapHeight() {
        return nsCapHeight(address());
    }

    @NativeType("FT_UShort")
    public short usDefaultChar() {
        return nusDefaultChar(address());
    }

    @NativeType("FT_UShort")
    public short usBreakChar() {
        return nusBreakChar(address());
    }

    @NativeType("FT_UShort")
    public short usMaxContext() {
        return nusMaxContext(address());
    }

    @NativeType("FT_UShort")
    public short usLowerOpticalPointSize() {
        return nusLowerOpticalPointSize(address());
    }

    @NativeType("FT_UShort")
    public short usUpperOpticalPointSize() {
        return nusUpperOpticalPointSize(address());
    }

    public static TT_OS2 create(long address) {
        return new TT_OS2(address, null);
    }

    public static TT_OS2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new TT_OS2(address, null);
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

    public static short nversion(long struct) {
        return MemoryUtil.memGetShort(struct + VERSION);
    }

    public static short nxAvgCharWidth(long struct) {
        return MemoryUtil.memGetShort(struct + XAVGCHARWIDTH);
    }

    public static short nusWeightClass(long struct) {
        return MemoryUtil.memGetShort(struct + USWEIGHTCLASS);
    }

    public static short nusWidthClass(long struct) {
        return MemoryUtil.memGetShort(struct + USWIDTHCLASS);
    }

    public static short nfsType(long struct) {
        return MemoryUtil.memGetShort(struct + FSTYPE);
    }

    public static short nySubscriptXSize(long struct) {
        return MemoryUtil.memGetShort(struct + YSUBSCRIPTXSIZE);
    }

    public static short nySubscriptYSize(long struct) {
        return MemoryUtil.memGetShort(struct + YSUBSCRIPTYSIZE);
    }

    public static short nySubscriptXOffset(long struct) {
        return MemoryUtil.memGetShort(struct + YSUBSCRIPTXOFFSET);
    }

    public static short nySubscriptYOffset(long struct) {
        return MemoryUtil.memGetShort(struct + YSUBSCRIPTYOFFSET);
    }

    public static short nySuperscriptXSize(long struct) {
        return MemoryUtil.memGetShort(struct + YSUPERSCRIPTXSIZE);
    }

    public static short nySuperscriptYSize(long struct) {
        return MemoryUtil.memGetShort(struct + YSUPERSCRIPTYSIZE);
    }

    public static short nySuperscriptXOffset(long struct) {
        return MemoryUtil.memGetShort(struct + YSUPERSCRIPTXOFFSET);
    }

    public static short nySuperscriptYOffset(long struct) {
        return MemoryUtil.memGetShort(struct + YSUPERSCRIPTYOFFSET);
    }

    public static short nyStrikeoutSize(long struct) {
        return MemoryUtil.memGetShort(struct + YSTRIKEOUTSIZE);
    }

    public static short nyStrikeoutPosition(long struct) {
        return MemoryUtil.memGetShort(struct + YSTRIKEOUTPOSITION);
    }

    public static short nsFamilyClass(long struct) {
        return MemoryUtil.memGetShort(struct + SFAMILYCLASS);
    }

    public static ByteBuffer npanose(long struct) {
        return MemoryUtil.memByteBuffer(struct + PANOSE, 10);
    }

    public static byte npanose(long struct, int index) {
        return MemoryUtil.memGetByte(struct + PANOSE + (Checks.check(index, 10) * 1));
    }

    public static long nulUnicodeRange1(long struct) {
        return MemoryUtil.memGetCLong(struct + ULUNICODERANGE1);
    }

    public static long nulUnicodeRange2(long struct) {
        return MemoryUtil.memGetCLong(struct + ULUNICODERANGE2);
    }

    public static long nulUnicodeRange3(long struct) {
        return MemoryUtil.memGetCLong(struct + ULUNICODERANGE3);
    }

    public static long nulUnicodeRange4(long struct) {
        return MemoryUtil.memGetCLong(struct + ULUNICODERANGE4);
    }

    public static ByteBuffer nachVendID(long struct) {
        return MemoryUtil.memByteBuffer(struct + ACHVENDID, 4);
    }

    public static byte nachVendID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + ACHVENDID + (Checks.check(index, 4) * 1));
    }

    public static short nfsSelection(long struct) {
        return MemoryUtil.memGetShort(struct + FSSELECTION);
    }

    public static short nusFirstCharIndex(long struct) {
        return MemoryUtil.memGetShort(struct + USFIRSTCHARINDEX);
    }

    public static short nusLastCharIndex(long struct) {
        return MemoryUtil.memGetShort(struct + USLASTCHARINDEX);
    }

    public static short nsTypoAscender(long struct) {
        return MemoryUtil.memGetShort(struct + STYPOASCENDER);
    }

    public static short nsTypoDescender(long struct) {
        return MemoryUtil.memGetShort(struct + STYPODESCENDER);
    }

    public static short nsTypoLineGap(long struct) {
        return MemoryUtil.memGetShort(struct + STYPOLINEGAP);
    }

    public static short nusWinAscent(long struct) {
        return MemoryUtil.memGetShort(struct + USWINASCENT);
    }

    public static short nusWinDescent(long struct) {
        return MemoryUtil.memGetShort(struct + USWINDESCENT);
    }

    public static long nulCodePageRange1(long struct) {
        return MemoryUtil.memGetCLong(struct + ULCODEPAGERANGE1);
    }

    public static long nulCodePageRange2(long struct) {
        return MemoryUtil.memGetCLong(struct + ULCODEPAGERANGE2);
    }

    public static short nsxHeight(long struct) {
        return MemoryUtil.memGetShort(struct + SXHEIGHT);
    }

    public static short nsCapHeight(long struct) {
        return MemoryUtil.memGetShort(struct + SCAPHEIGHT);
    }

    public static short nusDefaultChar(long struct) {
        return MemoryUtil.memGetShort(struct + USDEFAULTCHAR);
    }

    public static short nusBreakChar(long struct) {
        return MemoryUtil.memGetShort(struct + USBREAKCHAR);
    }

    public static short nusMaxContext(long struct) {
        return MemoryUtil.memGetShort(struct + USMAXCONTEXT);
    }

    public static short nusLowerOpticalPointSize(long struct) {
        return MemoryUtil.memGetShort(struct + USLOWEROPTICALPOINTSIZE);
    }

    public static short nusUpperOpticalPointSize(long struct) {
        return MemoryUtil.memGetShort(struct + USUPPEROPTICALPOINTSIZE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_OS2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_OS2$Buffer.class */
    public static class Buffer extends StructBuffer<TT_OS2, Buffer> {
        private static final TT_OS2 ELEMENT_FACTORY = TT_OS2.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / TT_OS2.SIZEOF);
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
        public TT_OS2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UShort")
        public short version() {
            return TT_OS2.nversion(address());
        }

        @NativeType("FT_Short")
        public short xAvgCharWidth() {
            return TT_OS2.nxAvgCharWidth(address());
        }

        @NativeType("FT_UShort")
        public short usWeightClass() {
            return TT_OS2.nusWeightClass(address());
        }

        @NativeType("FT_UShort")
        public short usWidthClass() {
            return TT_OS2.nusWidthClass(address());
        }

        @NativeType("FT_UShort")
        public short fsType() {
            return TT_OS2.nfsType(address());
        }

        @NativeType("FT_Short")
        public short ySubscriptXSize() {
            return TT_OS2.nySubscriptXSize(address());
        }

        @NativeType("FT_Short")
        public short ySubscriptYSize() {
            return TT_OS2.nySubscriptYSize(address());
        }

        @NativeType("FT_Short")
        public short ySubscriptXOffset() {
            return TT_OS2.nySubscriptXOffset(address());
        }

        @NativeType("FT_Short")
        public short ySubscriptYOffset() {
            return TT_OS2.nySubscriptYOffset(address());
        }

        @NativeType("FT_Short")
        public short ySuperscriptXSize() {
            return TT_OS2.nySuperscriptXSize(address());
        }

        @NativeType("FT_Short")
        public short ySuperscriptYSize() {
            return TT_OS2.nySuperscriptYSize(address());
        }

        @NativeType("FT_Short")
        public short ySuperscriptXOffset() {
            return TT_OS2.nySuperscriptXOffset(address());
        }

        @NativeType("FT_Short")
        public short ySuperscriptYOffset() {
            return TT_OS2.nySuperscriptYOffset(address());
        }

        @NativeType("FT_Short")
        public short yStrikeoutSize() {
            return TT_OS2.nyStrikeoutSize(address());
        }

        @NativeType("FT_Short")
        public short yStrikeoutPosition() {
            return TT_OS2.nyStrikeoutPosition(address());
        }

        @NativeType("FT_Short")
        public short sFamilyClass() {
            return TT_OS2.nsFamilyClass(address());
        }

        @NativeType("FT_Byte[10]")
        public ByteBuffer panose() {
            return TT_OS2.npanose(address());
        }

        @NativeType("FT_Byte")
        public byte panose(int index) {
            return TT_OS2.npanose(address(), index);
        }

        @NativeType("FT_ULong")
        public long ulUnicodeRange1() {
            return TT_OS2.nulUnicodeRange1(address());
        }

        @NativeType("FT_ULong")
        public long ulUnicodeRange2() {
            return TT_OS2.nulUnicodeRange2(address());
        }

        @NativeType("FT_ULong")
        public long ulUnicodeRange3() {
            return TT_OS2.nulUnicodeRange3(address());
        }

        @NativeType("FT_ULong")
        public long ulUnicodeRange4() {
            return TT_OS2.nulUnicodeRange4(address());
        }

        @NativeType("FT_Char[4]")
        public ByteBuffer achVendID() {
            return TT_OS2.nachVendID(address());
        }

        @NativeType("FT_Char")
        public byte achVendID(int index) {
            return TT_OS2.nachVendID(address(), index);
        }

        @NativeType("FT_UShort")
        public short fsSelection() {
            return TT_OS2.nfsSelection(address());
        }

        @NativeType("FT_UShort")
        public short usFirstCharIndex() {
            return TT_OS2.nusFirstCharIndex(address());
        }

        @NativeType("FT_UShort")
        public short usLastCharIndex() {
            return TT_OS2.nusLastCharIndex(address());
        }

        @NativeType("FT_Short")
        public short sTypoAscender() {
            return TT_OS2.nsTypoAscender(address());
        }

        @NativeType("FT_Short")
        public short sTypoDescender() {
            return TT_OS2.nsTypoDescender(address());
        }

        @NativeType("FT_Short")
        public short sTypoLineGap() {
            return TT_OS2.nsTypoLineGap(address());
        }

        @NativeType("FT_UShort")
        public short usWinAscent() {
            return TT_OS2.nusWinAscent(address());
        }

        @NativeType("FT_UShort")
        public short usWinDescent() {
            return TT_OS2.nusWinDescent(address());
        }

        @NativeType("FT_ULong")
        public long ulCodePageRange1() {
            return TT_OS2.nulCodePageRange1(address());
        }

        @NativeType("FT_ULong")
        public long ulCodePageRange2() {
            return TT_OS2.nulCodePageRange2(address());
        }

        @NativeType("FT_Short")
        public short sxHeight() {
            return TT_OS2.nsxHeight(address());
        }

        @NativeType("FT_Short")
        public short sCapHeight() {
            return TT_OS2.nsCapHeight(address());
        }

        @NativeType("FT_UShort")
        public short usDefaultChar() {
            return TT_OS2.nusDefaultChar(address());
        }

        @NativeType("FT_UShort")
        public short usBreakChar() {
            return TT_OS2.nusBreakChar(address());
        }

        @NativeType("FT_UShort")
        public short usMaxContext() {
            return TT_OS2.nusMaxContext(address());
        }

        @NativeType("FT_UShort")
        public short usLowerOpticalPointSize() {
            return TT_OS2.nusLowerOpticalPointSize(address());
        }

        @NativeType("FT_UShort")
        public short usUpperOpticalPointSize() {
            return TT_OS2.nusUpperOpticalPointSize(address());
        }
    }
}
