package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSkew.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSkew.class */
public class FT_PaintSkew extends Struct<FT_PaintSkew> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PAINT;
    public static final int X_SKEW_ANGLE;
    public static final int Y_SKEW_ANGLE;
    public static final int CENTER_X;
    public static final int CENTER_Y;

    static {
        Struct.Layout layout = __struct(__member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PAINT = layout.offsetof(0);
        X_SKEW_ANGLE = layout.offsetof(1);
        Y_SKEW_ANGLE = layout.offsetof(2);
        CENTER_X = layout.offsetof(3);
        CENTER_Y = layout.offsetof(4);
    }

    protected FT_PaintSkew(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintSkew create(long address, ByteBuffer container) {
        return new FT_PaintSkew(address, container);
    }

    public FT_PaintSkew(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint paint() {
        return npaint(address());
    }

    @NativeType("FT_Fixed")
    public long x_skew_angle() {
        return nx_skew_angle(address());
    }

    @NativeType("FT_Fixed")
    public long y_skew_angle() {
        return ny_skew_angle(address());
    }

    @NativeType("FT_Fixed")
    public long center_x() {
        return ncenter_x(address());
    }

    @NativeType("FT_Fixed")
    public long center_y() {
        return ncenter_y(address());
    }

    public static FT_PaintSkew create(long address) {
        return new FT_PaintSkew(address, null);
    }

    public static FT_PaintSkew createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintSkew(address, null);
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

    public static FT_OpaquePaint npaint(long struct) {
        return FT_OpaquePaint.create(struct + PAINT);
    }

    public static long nx_skew_angle(long struct) {
        return MemoryUtil.memGetCLong(struct + X_SKEW_ANGLE);
    }

    public static long ny_skew_angle(long struct) {
        return MemoryUtil.memGetCLong(struct + Y_SKEW_ANGLE);
    }

    public static long ncenter_x(long struct) {
        return MemoryUtil.memGetCLong(struct + CENTER_X);
    }

    public static long ncenter_y(long struct) {
        return MemoryUtil.memGetCLong(struct + CENTER_Y);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSkew$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSkew$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintSkew, Buffer> {
        private static final FT_PaintSkew ELEMENT_FACTORY = FT_PaintSkew.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintSkew.SIZEOF);
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
        public FT_PaintSkew getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() {
            return FT_PaintSkew.npaint(address());
        }

        @NativeType("FT_Fixed")
        public long x_skew_angle() {
            return FT_PaintSkew.nx_skew_angle(address());
        }

        @NativeType("FT_Fixed")
        public long y_skew_angle() {
            return FT_PaintSkew.ny_skew_angle(address());
        }

        @NativeType("FT_Fixed")
        public long center_x() {
            return FT_PaintSkew.ncenter_x(address());
        }

        @NativeType("FT_Fixed")
        public long center_y() {
            return FT_PaintSkew.ncenter_y(address());
        }
    }
}
