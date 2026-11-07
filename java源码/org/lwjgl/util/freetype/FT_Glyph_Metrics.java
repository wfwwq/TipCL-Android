package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Glyph_Metrics.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Glyph_Metrics.class */
public class FT_Glyph_Metrics extends Struct<FT_Glyph_Metrics> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int HORIBEARINGX;
    public static final int HORIBEARINGY;
    public static final int HORIADVANCE;
    public static final int VERTBEARINGX;
    public static final int VERTBEARINGY;
    public static final int VERTADVANCE;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        HORIBEARINGX = layout.offsetof(2);
        HORIBEARINGY = layout.offsetof(3);
        HORIADVANCE = layout.offsetof(4);
        VERTBEARINGX = layout.offsetof(5);
        VERTBEARINGY = layout.offsetof(6);
        VERTADVANCE = layout.offsetof(7);
    }

    protected FT_Glyph_Metrics(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Glyph_Metrics create(long address, ByteBuffer container) {
        return new FT_Glyph_Metrics(address, container);
    }

    public FT_Glyph_Metrics(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Pos")
    public long width() {
        return nwidth(address());
    }

    @NativeType("FT_Pos")
    public long height() {
        return nheight(address());
    }

    @NativeType("FT_Pos")
    public long horiBearingX() {
        return nhoriBearingX(address());
    }

    @NativeType("FT_Pos")
    public long horiBearingY() {
        return nhoriBearingY(address());
    }

    @NativeType("FT_Pos")
    public long horiAdvance() {
        return nhoriAdvance(address());
    }

    @NativeType("FT_Pos")
    public long vertBearingX() {
        return nvertBearingX(address());
    }

    @NativeType("FT_Pos")
    public long vertBearingY() {
        return nvertBearingY(address());
    }

    @NativeType("FT_Pos")
    public long vertAdvance() {
        return nvertAdvance(address());
    }

    public static FT_Glyph_Metrics create(long address) {
        return new FT_Glyph_Metrics(address, null);
    }

    public static FT_Glyph_Metrics createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Glyph_Metrics(address, null);
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

    public static long nwidth(long struct) {
        return MemoryUtil.memGetCLong(struct + WIDTH);
    }

    public static long nheight(long struct) {
        return MemoryUtil.memGetCLong(struct + HEIGHT);
    }

    public static long nhoriBearingX(long struct) {
        return MemoryUtil.memGetCLong(struct + HORIBEARINGX);
    }

    public static long nhoriBearingY(long struct) {
        return MemoryUtil.memGetCLong(struct + HORIBEARINGY);
    }

    public static long nhoriAdvance(long struct) {
        return MemoryUtil.memGetCLong(struct + HORIADVANCE);
    }

    public static long nvertBearingX(long struct) {
        return MemoryUtil.memGetCLong(struct + VERTBEARINGX);
    }

    public static long nvertBearingY(long struct) {
        return MemoryUtil.memGetCLong(struct + VERTBEARINGY);
    }

    public static long nvertAdvance(long struct) {
        return MemoryUtil.memGetCLong(struct + VERTADVANCE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Glyph_Metrics$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Glyph_Metrics$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Glyph_Metrics, Buffer> {
        private static final FT_Glyph_Metrics ELEMENT_FACTORY = FT_Glyph_Metrics.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Glyph_Metrics.SIZEOF);
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
        public FT_Glyph_Metrics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Pos")
        public long width() {
            return FT_Glyph_Metrics.nwidth(address());
        }

        @NativeType("FT_Pos")
        public long height() {
            return FT_Glyph_Metrics.nheight(address());
        }

        @NativeType("FT_Pos")
        public long horiBearingX() {
            return FT_Glyph_Metrics.nhoriBearingX(address());
        }

        @NativeType("FT_Pos")
        public long horiBearingY() {
            return FT_Glyph_Metrics.nhoriBearingY(address());
        }

        @NativeType("FT_Pos")
        public long horiAdvance() {
            return FT_Glyph_Metrics.nhoriAdvance(address());
        }

        @NativeType("FT_Pos")
        public long vertBearingX() {
            return FT_Glyph_Metrics.nvertBearingX(address());
        }

        @NativeType("FT_Pos")
        public long vertBearingY() {
            return FT_Glyph_Metrics.nvertBearingY(address());
        }

        @NativeType("FT_Pos")
        public long vertAdvance() {
            return FT_Glyph_Metrics.nvertAdvance(address());
        }
    }
}
