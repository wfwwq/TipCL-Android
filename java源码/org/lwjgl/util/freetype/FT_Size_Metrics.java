package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Metrics.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Metrics.class */
public class FT_Size_Metrics extends Struct<FT_Size_Metrics> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X_PPEM;
    public static final int Y_PPEM;
    public static final int X_SCALE;
    public static final int Y_SCALE;
    public static final int ASCENDER;
    public static final int DESCENDER;
    public static final int HEIGHT;
    public static final int MAX_ADVANCE;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X_PPEM = layout.offsetof(0);
        Y_PPEM = layout.offsetof(1);
        X_SCALE = layout.offsetof(2);
        Y_SCALE = layout.offsetof(3);
        ASCENDER = layout.offsetof(4);
        DESCENDER = layout.offsetof(5);
        HEIGHT = layout.offsetof(6);
        MAX_ADVANCE = layout.offsetof(7);
    }

    protected FT_Size_Metrics(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Size_Metrics create(long address, ByteBuffer container) {
        return new FT_Size_Metrics(address, container);
    }

    public FT_Size_Metrics(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UShort")
    public short x_ppem() {
        return nx_ppem(address());
    }

    @NativeType("FT_UShort")
    public short y_ppem() {
        return ny_ppem(address());
    }

    @NativeType("FT_Fixed")
    public long x_scale() {
        return nx_scale(address());
    }

    @NativeType("FT_Fixed")
    public long y_scale() {
        return ny_scale(address());
    }

    @NativeType("FT_Pos")
    public long ascender() {
        return nascender(address());
    }

    @NativeType("FT_Pos")
    public long descender() {
        return ndescender(address());
    }

    @NativeType("FT_Pos")
    public long height() {
        return nheight(address());
    }

    @NativeType("FT_Pos")
    public long max_advance() {
        return nmax_advance(address());
    }

    public static FT_Size_Metrics create(long address) {
        return new FT_Size_Metrics(address, null);
    }

    public static FT_Size_Metrics createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Size_Metrics(address, null);
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

    public static short nx_ppem(long struct) {
        return MemoryUtil.memGetShort(struct + X_PPEM);
    }

    public static short ny_ppem(long struct) {
        return MemoryUtil.memGetShort(struct + Y_PPEM);
    }

    public static long nx_scale(long struct) {
        return MemoryUtil.memGetCLong(struct + X_SCALE);
    }

    public static long ny_scale(long struct) {
        return MemoryUtil.memGetCLong(struct + Y_SCALE);
    }

    public static long nascender(long struct) {
        return MemoryUtil.memGetCLong(struct + ASCENDER);
    }

    public static long ndescender(long struct) {
        return MemoryUtil.memGetCLong(struct + DESCENDER);
    }

    public static long nheight(long struct) {
        return MemoryUtil.memGetCLong(struct + HEIGHT);
    }

    public static long nmax_advance(long struct) {
        return MemoryUtil.memGetCLong(struct + MAX_ADVANCE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Metrics$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Metrics$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Size_Metrics, Buffer> {
        private static final FT_Size_Metrics ELEMENT_FACTORY = FT_Size_Metrics.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Size_Metrics.SIZEOF);
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
        public FT_Size_Metrics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UShort")
        public short x_ppem() {
            return FT_Size_Metrics.nx_ppem(address());
        }

        @NativeType("FT_UShort")
        public short y_ppem() {
            return FT_Size_Metrics.ny_ppem(address());
        }

        @NativeType("FT_Fixed")
        public long x_scale() {
            return FT_Size_Metrics.nx_scale(address());
        }

        @NativeType("FT_Fixed")
        public long y_scale() {
            return FT_Size_Metrics.ny_scale(address());
        }

        @NativeType("FT_Pos")
        public long ascender() {
            return FT_Size_Metrics.nascender(address());
        }

        @NativeType("FT_Pos")
        public long descender() {
            return FT_Size_Metrics.ndescender(address());
        }

        @NativeType("FT_Pos")
        public long height() {
            return FT_Size_Metrics.nheight(address());
        }

        @NativeType("FT_Pos")
        public long max_advance() {
            return FT_Size_Metrics.nmax_advance(address());
        }
    }
}
