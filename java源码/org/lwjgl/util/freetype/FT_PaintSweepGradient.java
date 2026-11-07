package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSweepGradient.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSweepGradient.class */
public class FT_PaintSweepGradient extends Struct<FT_PaintSweepGradient> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COLORLINE;
    public static final int CENTER;
    public static final int START_ANGLE;
    public static final int END_ANGLE;

    static {
        Struct.Layout layout = __struct(__member(FT_ColorLine.SIZEOF, FT_ColorLine.ALIGNOF), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COLORLINE = layout.offsetof(0);
        CENTER = layout.offsetof(1);
        START_ANGLE = layout.offsetof(2);
        END_ANGLE = layout.offsetof(3);
    }

    protected FT_PaintSweepGradient(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintSweepGradient create(long address, ByteBuffer container) {
        return new FT_PaintSweepGradient(address, container);
    }

    public FT_PaintSweepGradient(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_ColorLine colorline() {
        return ncolorline(address());
    }

    public FT_Vector center() {
        return ncenter(address());
    }

    @NativeType("FT_Fixed")
    public long start_angle() {
        return nstart_angle(address());
    }

    @NativeType("FT_Fixed")
    public long end_angle() {
        return nend_angle(address());
    }

    public static FT_PaintSweepGradient create(long address) {
        return new FT_PaintSweepGradient(address, null);
    }

    public static FT_PaintSweepGradient createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintSweepGradient(address, null);
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

    public static FT_ColorLine ncolorline(long struct) {
        return FT_ColorLine.create(struct + COLORLINE);
    }

    public static FT_Vector ncenter(long struct) {
        return FT_Vector.create(struct + CENTER);
    }

    public static long nstart_angle(long struct) {
        return MemoryUtil.memGetCLong(struct + START_ANGLE);
    }

    public static long nend_angle(long struct) {
        return MemoryUtil.memGetCLong(struct + END_ANGLE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSweepGradient$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSweepGradient$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintSweepGradient, Buffer> {
        private static final FT_PaintSweepGradient ELEMENT_FACTORY = FT_PaintSweepGradient.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintSweepGradient.SIZEOF);
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
        public FT_PaintSweepGradient getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_ColorLine colorline() {
            return FT_PaintSweepGradient.ncolorline(address());
        }

        public FT_Vector center() {
            return FT_PaintSweepGradient.ncenter(address());
        }

        @NativeType("FT_Fixed")
        public long start_angle() {
            return FT_PaintSweepGradient.nstart_angle(address());
        }

        @NativeType("FT_Fixed")
        public long end_angle() {
            return FT_PaintSweepGradient.nend_angle(address());
        }
    }
}
