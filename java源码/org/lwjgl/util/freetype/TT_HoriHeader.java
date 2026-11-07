package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_HoriHeader.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_HoriHeader.class */
public class TT_HoriHeader extends Struct<TT_HoriHeader> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERSION;
    public static final int ASCENDER;
    public static final int DESCENDER;
    public static final int LINE_GAP;
    public static final int ADVANCE_WIDTH_MAX;
    public static final int MIN_LEFT_SIDE_BEARING;
    public static final int MIN_RIGHT_SIDE_BEARING;
    public static final int XMAX_EXTENT;
    public static final int CARET_SLOPE_RISE;
    public static final int CARET_SLOPE_RUN;
    public static final int CARET_OFFSET;
    public static final int RESERVED;
    public static final int METRIC_DATA_FORMAT;
    public static final int NUMBER_OF_HMETRICS;
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
        ADVANCE_WIDTH_MAX = layout.offsetof(4);
        MIN_LEFT_SIDE_BEARING = layout.offsetof(5);
        MIN_RIGHT_SIDE_BEARING = layout.offsetof(6);
        XMAX_EXTENT = layout.offsetof(7);
        CARET_SLOPE_RISE = layout.offsetof(8);
        CARET_SLOPE_RUN = layout.offsetof(9);
        CARET_OFFSET = layout.offsetof(10);
        RESERVED = layout.offsetof(11);
        METRIC_DATA_FORMAT = layout.offsetof(12);
        NUMBER_OF_HMETRICS = layout.offsetof(13);
        LONG_METRICS = layout.offsetof(14);
        SHORT_METRICS = layout.offsetof(15);
    }

    protected TT_HoriHeader(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public TT_HoriHeader create(long address, ByteBuffer container) {
        return new TT_HoriHeader(address, container);
    }

    public TT_HoriHeader(ByteBuffer container) {
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
    public short advance_Width_Max() {
        return nadvance_Width_Max(address());
    }

    @NativeType("FT_Short")
    public short min_Left_Side_Bearing() {
        return nmin_Left_Side_Bearing(address());
    }

    @NativeType("FT_Short")
    public short min_Right_Side_Bearing() {
        return nmin_Right_Side_Bearing(address());
    }

    @NativeType("FT_Short")
    public short xMax_Extent() {
        return nxMax_Extent(address());
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
    public short number_Of_HMetrics() {
        return nnumber_Of_HMetrics(address());
    }

    @NativeType("void *")
    public ByteBuffer long_metrics(int capacity) {
        return nlong_metrics(address(), capacity);
    }

    @NativeType("void *")
    public ByteBuffer short_metrics(int capacity) {
        return nshort_metrics(address(), capacity);
    }

    public static TT_HoriHeader create(long address) {
        return new TT_HoriHeader(address, null);
    }

    public static TT_HoriHeader createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new TT_HoriHeader(address, null);
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

    public static short nadvance_Width_Max(long struct) {
        return MemoryUtil.memGetShort(struct + ADVANCE_WIDTH_MAX);
    }

    public static short nmin_Left_Side_Bearing(long struct) {
        return MemoryUtil.memGetShort(struct + MIN_LEFT_SIDE_BEARING);
    }

    public static short nmin_Right_Side_Bearing(long struct) {
        return MemoryUtil.memGetShort(struct + MIN_RIGHT_SIDE_BEARING);
    }

    public static short nxMax_Extent(long struct) {
        return MemoryUtil.memGetShort(struct + XMAX_EXTENT);
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

    public static short nnumber_Of_HMetrics(long struct) {
        return MemoryUtil.memGetShort(struct + NUMBER_OF_HMETRICS);
    }

    public static ByteBuffer nlong_metrics(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + LONG_METRICS), capacity);
    }

    public static ByteBuffer nshort_metrics(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + SHORT_METRICS), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_HoriHeader$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/TT_HoriHeader$Buffer.class */
    public static class Buffer extends StructBuffer<TT_HoriHeader, Buffer> {
        private static final TT_HoriHeader ELEMENT_FACTORY = TT_HoriHeader.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / TT_HoriHeader.SIZEOF);
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
        public TT_HoriHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Fixed")
        public long Version() {
            return TT_HoriHeader.nVersion(address());
        }

        @NativeType("FT_Short")
        public short Ascender() {
            return TT_HoriHeader.nAscender(address());
        }

        @NativeType("FT_Short")
        public short Descender() {
            return TT_HoriHeader.nDescender(address());
        }

        @NativeType("FT_Short")
        public short Line_Gap() {
            return TT_HoriHeader.nLine_Gap(address());
        }

        @NativeType("FT_UShort")
        public short advance_Width_Max() {
            return TT_HoriHeader.nadvance_Width_Max(address());
        }

        @NativeType("FT_Short")
        public short min_Left_Side_Bearing() {
            return TT_HoriHeader.nmin_Left_Side_Bearing(address());
        }

        @NativeType("FT_Short")
        public short min_Right_Side_Bearing() {
            return TT_HoriHeader.nmin_Right_Side_Bearing(address());
        }

        @NativeType("FT_Short")
        public short xMax_Extent() {
            return TT_HoriHeader.nxMax_Extent(address());
        }

        @NativeType("FT_Short")
        public short caret_Slope_Rise() {
            return TT_HoriHeader.ncaret_Slope_Rise(address());
        }

        @NativeType("FT_Short")
        public short caret_Slope_Run() {
            return TT_HoriHeader.ncaret_Slope_Run(address());
        }

        @NativeType("FT_Short")
        public short caret_Offset() {
            return TT_HoriHeader.ncaret_Offset(address());
        }

        @NativeType("FT_Short[4]")
        public ShortBuffer Reserved() {
            return TT_HoriHeader.nReserved(address());
        }

        @NativeType("FT_Short")
        public short Reserved(int index) {
            return TT_HoriHeader.nReserved(address(), index);
        }

        @NativeType("FT_Short")
        public short metric_Data_Format() {
            return TT_HoriHeader.nmetric_Data_Format(address());
        }

        @NativeType("FT_UShort")
        public short number_Of_HMetrics() {
            return TT_HoriHeader.nnumber_Of_HMetrics(address());
        }

        @NativeType("void *")
        public ByteBuffer long_metrics(int capacity) {
            return TT_HoriHeader.nlong_metrics(address(), capacity);
        }

        @NativeType("void *")
        public ByteBuffer short_metrics(int capacity) {
            return TT_HoriHeader.nshort_metrics(address(), capacity);
        }
    }
}
