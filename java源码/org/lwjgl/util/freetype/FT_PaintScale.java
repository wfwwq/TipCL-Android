package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintScale.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintScale.class */
public class FT_PaintScale extends Struct<FT_PaintScale> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PAINT;
    public static final int SCALE_X;
    public static final int SCALE_Y;
    public static final int CENTER_X;
    public static final int CENTER_Y;

    static {
        Struct.Layout layout = __struct(__member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PAINT = layout.offsetof(0);
        SCALE_X = layout.offsetof(1);
        SCALE_Y = layout.offsetof(2);
        CENTER_X = layout.offsetof(3);
        CENTER_Y = layout.offsetof(4);
    }

    protected FT_PaintScale(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintScale create(long address, ByteBuffer container) {
        return new FT_PaintScale(address, container);
    }

    public FT_PaintScale(ByteBuffer container) {
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
    public long scale_x() {
        return nscale_x(address());
    }

    @NativeType("FT_Fixed")
    public long scale_y() {
        return nscale_y(address());
    }

    @NativeType("FT_Fixed")
    public long center_x() {
        return ncenter_x(address());
    }

    @NativeType("FT_Fixed")
    public long center_y() {
        return ncenter_y(address());
    }

    public static FT_PaintScale create(long address) {
        return new FT_PaintScale(address, null);
    }

    public static FT_PaintScale createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintScale(address, null);
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

    public static long nscale_x(long struct) {
        return MemoryUtil.memGetCLong(struct + SCALE_X);
    }

    public static long nscale_y(long struct) {
        return MemoryUtil.memGetCLong(struct + SCALE_Y);
    }

    public static long ncenter_x(long struct) {
        return MemoryUtil.memGetCLong(struct + CENTER_X);
    }

    public static long ncenter_y(long struct) {
        return MemoryUtil.memGetCLong(struct + CENTER_Y);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintScale$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintScale$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintScale, Buffer> {
        private static final FT_PaintScale ELEMENT_FACTORY = FT_PaintScale.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintScale.SIZEOF);
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
        public FT_PaintScale getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() {
            return FT_PaintScale.npaint(address());
        }

        @NativeType("FT_Fixed")
        public long scale_x() {
            return FT_PaintScale.nscale_x(address());
        }

        @NativeType("FT_Fixed")
        public long scale_y() {
            return FT_PaintScale.nscale_y(address());
        }

        @NativeType("FT_Fixed")
        public long center_x() {
            return FT_PaintScale.ncenter_x(address());
        }

        @NativeType("FT_Fixed")
        public long center_y() {
            return FT_PaintScale.ncenter_y(address());
        }
    }
}
