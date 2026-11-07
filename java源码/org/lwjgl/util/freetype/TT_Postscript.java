package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_Postscript.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_Postscript.class */
public class TT_Postscript extends Struct<TT_Postscript> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FORMATTYPE;
    public static final int ITALICANGLE;
    public static final int UNDERLINEPOSITION;
    public static final int UNDERLINETHICKNESS;
    public static final int ISFIXEDPITCH;
    public static final int MINMEMTYPE42;
    public static final int MAXMEMTYPE42;
    public static final int MINMEMTYPE1;
    public static final int MAXMEMTYPE1;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE), __member(2), __member(2), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FORMATTYPE = layout.offsetof(0);
        ITALICANGLE = layout.offsetof(1);
        UNDERLINEPOSITION = layout.offsetof(2);
        UNDERLINETHICKNESS = layout.offsetof(3);
        ISFIXEDPITCH = layout.offsetof(4);
        MINMEMTYPE42 = layout.offsetof(5);
        MAXMEMTYPE42 = layout.offsetof(6);
        MINMEMTYPE1 = layout.offsetof(7);
        MAXMEMTYPE1 = layout.offsetof(8);
    }

    protected TT_Postscript(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public TT_Postscript create(long address, ByteBuffer container) {
        return new TT_Postscript(address, container);
    }

    public TT_Postscript(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Fixed")
    public long FormatType() {
        return nFormatType(address());
    }

    @NativeType("FT_Fixed")
    public long italicAngle() {
        return nitalicAngle(address());
    }

    @NativeType("FT_Short")
    public short underlinePosition() {
        return nunderlinePosition(address());
    }

    @NativeType("FT_Short")
    public short underlineThickness() {
        return nunderlineThickness(address());
    }

    @NativeType("FT_ULong")
    public long isFixedPitch() {
        return nisFixedPitch(address());
    }

    @NativeType("FT_ULong")
    public long minMemType42() {
        return nminMemType42(address());
    }

    @NativeType("FT_ULong")
    public long maxMemType42() {
        return nmaxMemType42(address());
    }

    @NativeType("FT_ULong")
    public long minMemType1() {
        return nminMemType1(address());
    }

    @NativeType("FT_ULong")
    public long maxMemType1() {
        return nmaxMemType1(address());
    }

    public static TT_Postscript create(long address) {
        return new TT_Postscript(address, null);
    }

    public static TT_Postscript createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new TT_Postscript(address, null);
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

    public static long nFormatType(long struct) {
        return MemoryUtil.memGetCLong(struct + FORMATTYPE);
    }

    public static long nitalicAngle(long struct) {
        return MemoryUtil.memGetCLong(struct + ITALICANGLE);
    }

    public static short nunderlinePosition(long struct) {
        return MemoryUtil.memGetShort(struct + UNDERLINEPOSITION);
    }

    public static short nunderlineThickness(long struct) {
        return MemoryUtil.memGetShort(struct + UNDERLINETHICKNESS);
    }

    public static long nisFixedPitch(long struct) {
        return MemoryUtil.memGetCLong(struct + ISFIXEDPITCH);
    }

    public static long nminMemType42(long struct) {
        return MemoryUtil.memGetCLong(struct + MINMEMTYPE42);
    }

    public static long nmaxMemType42(long struct) {
        return MemoryUtil.memGetCLong(struct + MAXMEMTYPE42);
    }

    public static long nminMemType1(long struct) {
        return MemoryUtil.memGetCLong(struct + MINMEMTYPE1);
    }

    public static long nmaxMemType1(long struct) {
        return MemoryUtil.memGetCLong(struct + MAXMEMTYPE1);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_Postscript$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_Postscript$Buffer.class */
    public static class Buffer extends StructBuffer<TT_Postscript, Buffer> {
        private static final TT_Postscript ELEMENT_FACTORY = TT_Postscript.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / TT_Postscript.SIZEOF);
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
        public TT_Postscript getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Fixed")
        public long FormatType() {
            return TT_Postscript.nFormatType(address());
        }

        @NativeType("FT_Fixed")
        public long italicAngle() {
            return TT_Postscript.nitalicAngle(address());
        }

        @NativeType("FT_Short")
        public short underlinePosition() {
            return TT_Postscript.nunderlinePosition(address());
        }

        @NativeType("FT_Short")
        public short underlineThickness() {
            return TT_Postscript.nunderlineThickness(address());
        }

        @NativeType("FT_ULong")
        public long isFixedPitch() {
            return TT_Postscript.nisFixedPitch(address());
        }

        @NativeType("FT_ULong")
        public long minMemType42() {
            return TT_Postscript.nminMemType42(address());
        }

        @NativeType("FT_ULong")
        public long maxMemType42() {
            return TT_Postscript.nmaxMemType42(address());
        }

        @NativeType("FT_ULong")
        public long minMemType1() {
            return TT_Postscript.nminMemType1(address());
        }

        @NativeType("FT_ULong")
        public long maxMemType1() {
            return TT_Postscript.nmaxMemType1(address());
        }
    }
}
