package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintLinearGradient.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintLinearGradient.class */
public class FT_PaintLinearGradient extends Struct<FT_PaintLinearGradient> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COLORLINE;
    public static final int P0;
    public static final int P1;
    public static final int P2;

    static {
        Struct.Layout layout = __struct(__member(FT_ColorLine.SIZEOF, FT_ColorLine.ALIGNOF), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COLORLINE = layout.offsetof(0);
        P0 = layout.offsetof(1);
        P1 = layout.offsetof(2);
        P2 = layout.offsetof(3);
    }

    protected FT_PaintLinearGradient(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintLinearGradient create(long address, ByteBuffer container) {
        return new FT_PaintLinearGradient(address, container);
    }

    public FT_PaintLinearGradient(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_ColorLine colorline() {
        return ncolorline(address());
    }

    public FT_Vector p0() {
        return np0(address());
    }

    public FT_Vector p1() {
        return np1(address());
    }

    public FT_Vector p2() {
        return np2(address());
    }

    public static FT_PaintLinearGradient create(long address) {
        return new FT_PaintLinearGradient(address, null);
    }

    public static FT_PaintLinearGradient createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintLinearGradient(address, null);
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

    public static FT_Vector np0(long struct) {
        return FT_Vector.create(struct + P0);
    }

    public static FT_Vector np1(long struct) {
        return FT_Vector.create(struct + P1);
    }

    public static FT_Vector np2(long struct) {
        return FT_Vector.create(struct + P2);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintLinearGradient$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintLinearGradient$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintLinearGradient, Buffer> {
        private static final FT_PaintLinearGradient ELEMENT_FACTORY = FT_PaintLinearGradient.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintLinearGradient.SIZEOF);
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
        public FT_PaintLinearGradient getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_ColorLine colorline() {
            return FT_PaintLinearGradient.ncolorline(address());
        }

        public FT_Vector p0() {
            return FT_PaintLinearGradient.np0(address());
        }

        public FT_Vector p1() {
            return FT_PaintLinearGradient.np1(address());
        }

        public FT_Vector p2() {
            return FT_PaintLinearGradient.np2(address());
        }
    }
}
