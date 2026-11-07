package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_VertHeader.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_VertHeader.class */
public class TT_VertHeader extends Struct<TT_VertHeader> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERSION;
    public static final int ASCENDER;
    public static final int DESCENDER;
    public static final int LINE_GAP;
    public static final int ADVANCE_HEIGHT_MAX;
    public static final int MIN_TOP_SIDE_BEARING;
    public static final int MIN_BOTTOM_SIDE_BEARING;
    public static final int YMAX_EXTENT;
    public static final int CARET_SLOPE_RISE;
    public static final int CARET_SLOPE_RUN;
    public static final int CARET_OFFSET;
    public static final int RESERVED;
    public static final int METRIC_DATA_FORMAT;
    public static final int NUMBER_OF_VMETRICS;
    public static final int LONG_METRICS;
    public static final int SHORT_METRICS;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __array(2, 4), __member(2), __member(2), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERSION = layout.offsetof(0);
        ASCENDER = layout.offsetof(1);
        DESCENDER = layout.offsetof(2);
        LINE_GAP = layout.offsetof(3);
        ADVANCE_HEIGHT_MAX = layout.offsetof(4);
        MIN_TOP_SIDE_BEARING = layout.offsetof(5);
        MIN_BOTTOM_SIDE_BEARING = layout.offsetof(6);
        YMAX_EXTENT = layout.offsetof(7);
        CARET_SLOPE_RISE = layout.offsetof(8);
        CARET_SLOPE_RUN = layout.offsetof(9);
        CARET_OFFSET = layout.offsetof(10);
        RESERVED = layout.offsetof(11);
        METRIC_DATA_FORMAT = layout.offsetof(12);
        NUMBER_OF_VMETRICS = layout.offsetof(13);
        LONG_METRICS = layout.offsetof(14);
        SHORT_METRICS = layout.offsetof(15);
    }

    protected TT_VertHeader(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public TT_VertHeader create(long address, ByteBuffer container) {
        return new TT_VertHeader(address, container);
    }

    public TT_VertHeader(ByteBuffer container) {
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

    @NativeType("FT_Short")
    public short Ascender() {
        return nAscender(address());
    }

    @NativeType("FT_Short")
    public short Descender() {
        return nDescender(address());
    }

    @NativeType("FT_Short")
    public short Line_Gap() {
        return nLine_Gap(address());
    }

    @NativeType("FT_UShort")
    public short advance_Height_Max() {
        return nadvance_Height_Max(address());
    }

    @NativeType("FT_Short")
    public short min_Top_Side_Bearing() {
        return nmin_Top_Side_Bearing(address());
    }

    @NativeType("FT_Short")
    public short min_Bottom_Side_Bearing() {
        return nmin_Bottom_Side_Bearing(address());
    }

    @NativeType("FT_Short")
    public short yMax_Extent() {
        return nyMax_Extent(address());
    }

    @NativeType("FT_Short")
    public short caret_Slope_Rise() {
        return ncaret_Slope_Rise(address());
    }

    @NativeType("FT_Short")
    public short caret_Slope_Run() {
        return ncaret_Slope_Run(address());
    }

    @NativeType("FT_Short")
    public short caret_Offset() {
        return ncaret_Offset(address());
    }

    @NativeType("FT_Short[4]")
    public ShortBuffer Reserved() {
        return nReserved(address());
    }

    @NativeType("FT_Short")
    public short Reserved(int index) {
        return nReserved(address(), index);
    }

    @NativeType("FT_Short")
    public short metric_Data_Format() {
        return nmetric_Data_Format(address());
    }

    @NativeType("FT_UShort")
    public short number_Of_VMetrics() {
        return nnumber_Of_VMetrics(address());
    }

    @NativeType("void *")
    public ByteBuffer long_metrics(int capacity) {
        return nlong_metrics(address(), capacity);
    }

    @NativeType("void *")
    public ByteBuffer short_metrics(int capacity) {
        return nshort_metrics(address(), capacity);
    }

    public static TT_VertHeader create(long address) {
        return new TT_VertHeader(address, null);
    }

    public static TT_VertHeader createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new TT_VertHeader(address, null);
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

    public static short nAscender(long struct) {
        return MemoryUtil.memGetShort(struct + ASCENDER);
    }

    public static short nDescender(long struct) {
        return MemoryUtil.memGetShort(struct + DESCENDER);
    }

    public static short nLine_Gap(long struct) {
        return MemoryUtil.memGetShort(struct + LINE_GAP);
    }

    public static short nadvance_Height_Max(long struct) {
        return MemoryUtil.memGetShort(struct + ADVANCE_HEIGHT_MAX);
    }

    public static short nmin_Top_Side_Bearing(long struct) {
        return MemoryUtil.memGetShort(struct + MIN_TOP_SIDE_BEARING);
    }

    public static short nmin_Bottom_Side_Bearing(long struct) {
        return MemoryUtil.memGetShort(struct + MIN_BOTTOM_SIDE_BEARING);
    }

    public static short nyMax_Extent(long struct) {
        return MemoryUtil.memGetShort(struct + YMAX_EXTENT);
    }

    public static short ncaret_Slope_Rise(long struct) {
        return MemoryUtil.memGetShort(struct + CARET_SLOPE_RISE);
    }

    public static short ncaret_Slope_Run(long struct) {
        return MemoryUtil.memGetShort(struct + CARET_SLOPE_RUN);
    }

    public static short ncaret_Offset(long struct) {
        return MemoryUtil.memGetShort(struct + CARET_OFFSET);
    }

    public static ShortBuffer nReserved(long struct) {
        return MemoryUtil.memShortBuffer(struct + RESERVED, 4);
    }

    public static short nReserved(long struct, int index) {
        return MemoryUtil.memGetShort(struct + RESERVED + (Checks.check(index, 4) * 2));
    }

    public static short nmetric_Data_Format(long struct) {
        return MemoryUtil.memGetShort(struct + METRIC_DATA_FORMAT);
    }

    public static short nnumber_Of_VMetrics(long struct) {
        return MemoryUtil.memGetShort(struct + NUMBER_OF_VMETRICS);
    }

    public static ByteBuffer nlong_metrics(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + LONG_METRICS), capacity);
    }

    public static ByteBuffer nshort_metrics(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + SHORT_METRICS), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_VertHeader$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_VertHeader$Buffer.class */
    public static class Buffer extends StructBuffer<TT_VertHeader, Buffer> {
        private static final TT_VertHeader ELEMENT_FACTORY = TT_VertHeader.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / TT_VertHeader.SIZEOF);
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
        public TT_VertHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Fixed")
        public long Version() {
            return TT_VertHeader.nVersion(address());
        }

        @NativeType("FT_Short")
        public short Ascender() {
            return TT_VertHeader.nAscender(address());
        }

        @NativeType("FT_Short")
        public short Descender() {
            return TT_VertHeader.nDescender(address());
        }

        @NativeType("FT_Short")
        public short Line_Gap() {
            return TT_VertHeader.nLine_Gap(address());
        }

        @NativeType("FT_UShort")
        public short advance_Height_Max() {
            return TT_VertHeader.nadvance_Height_Max(address());
        }

        @NativeType("FT_Short")
        public short min_Top_Side_Bearing() {
            return TT_VertHeader.nmin_Top_Side_Bearing(address());
        }

        @NativeType("FT_Short")
        public short min_Bottom_Side_Bearing() {
            return TT_VertHeader.nmin_Bottom_Side_Bearing(address());
        }

        @NativeType("FT_Short")
        public short yMax_Extent() {
            return TT_VertHeader.nyMax_Extent(address());
        }

        @NativeType("FT_Short")
        public short caret_Slope_Rise() {
            return TT_VertHeader.ncaret_Slope_Rise(address());
        }

        @NativeType("FT_Short")
        public short caret_Slope_Run() {
            return TT_VertHeader.ncaret_Slope_Run(address());
        }

        @NativeType("FT_Short")
        public short caret_Offset() {
            return TT_VertHeader.ncaret_Offset(address());
        }

        @NativeType("FT_Short[4]")
        public ShortBuffer Reserved() {
            return TT_VertHeader.nReserved(address());
        }

        @NativeType("FT_Short")
        public short Reserved(int index) {
            return TT_VertHeader.nReserved(address(), index);
        }

        @NativeType("FT_Short")
        public short metric_Data_Format() {
            return TT_VertHeader.nmetric_Data_Format(address());
        }

        @NativeType("FT_UShort")
        public short number_Of_VMetrics() {
            return TT_VertHeader.nnumber_Of_VMetrics(address());
        }

        @NativeType("void *")
        public ByteBuffer long_metrics(int capacity) {
            return TT_VertHeader.nlong_metrics(address(), capacity);
        }

        @NativeType("void *")
        public ByteBuffer short_metrics(int capacity) {
            return TT_VertHeader.nshort_metrics(address(), capacity);
        }
    }
}
