package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintRadialGradient.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintRadialGradient.class */
public class FT_PaintRadialGradient extends Struct<FT_PaintRadialGradient> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COLORLINE;
    public static final int C0;
    public static final int R0;
    public static final int C1;
    public static final int R1;

    static {
        Struct.Layout layout = __struct(__member(FT_ColorLine.SIZEOF, FT_ColorLine.ALIGNOF), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF), __member(CLONG_SIZE), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COLORLINE = layout.offsetof(0);
        C0 = layout.offsetof(1);
        R0 = layout.offsetof(2);
        C1 = layout.offsetof(3);
        R1 = layout.offsetof(4);
    }

    protected FT_PaintRadialGradient(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintRadialGradient create(long address, ByteBuffer container) {
        return new FT_PaintRadialGradient(address, container);
    }

    public FT_PaintRadialGradient(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_ColorLine colorline() {
        return ncolorline(address());
    }

    public FT_Vector c0() {
        return nc0(address());
    }

    @NativeType("FT_Pos")
    public long r0() {
        return nr0(address());
    }

    public FT_Vector c1() {
        return nc1(address());
    }

    @NativeType("FT_Pos")
    public long r1() {
        return nr1(address());
    }

    public static FT_PaintRadialGradient create(long address) {
        return new FT_PaintRadialGradient(address, null);
    }

    public static FT_PaintRadialGradient createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintRadialGradient(address, null);
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

    public static FT_Vector nc0(long struct) {
        return FT_Vector.create(struct + C0);
    }

    public static long nr0(long struct) {
        return MemoryUtil.memGetCLong(struct + R0);
    }

    public static FT_Vector nc1(long struct) {
        return FT_Vector.create(struct + C1);
    }

    public static long nr1(long struct) {
        return MemoryUtil.memGetCLong(struct + R1);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintRadialGradient$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintRadialGradient$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintRadialGradient, Buffer> {
        private static final FT_PaintRadialGradient ELEMENT_FACTORY = FT_PaintRadialGradient.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintRadialGradient.SIZEOF);
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
        public FT_PaintRadialGradient getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_ColorLine colorline() {
            return FT_PaintRadialGradient.ncolorline(address());
        }

        public FT_Vector c0() {
            return FT_PaintRadialGradient.nc0(address());
        }

        @NativeType("FT_Pos")
        public long r0() {
            return FT_PaintRadialGradient.nr0(address());
        }

        public FT_Vector c1() {
            return FT_PaintRadialGradient.nc1(address());
        }

        @NativeType("FT_Pos")
        public long r1() {
            return FT_PaintRadialGradient.nr1(address());
        }
    }
}
