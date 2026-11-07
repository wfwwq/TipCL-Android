package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintTransform.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintTransform.class */
public class FT_PaintTransform extends Struct<FT_PaintTransform> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PAINT;
    public static final int AFFINE;

    static {
        Struct.Layout layout = __struct(__member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF), __member(FT_Affine23.SIZEOF, FT_Affine23.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PAINT = layout.offsetof(0);
        AFFINE = layout.offsetof(1);
    }

    protected FT_PaintTransform(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintTransform create(long address, ByteBuffer container) {
        return new FT_PaintTransform(address, container);
    }

    public FT_PaintTransform(ByteBuffer container) {
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

    public FT_Affine23 affine() {
        return naffine(address());
    }

    public static FT_PaintTransform create(long address) {
        return new FT_PaintTransform(address, null);
    }

    public static FT_PaintTransform createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintTransform(address, null);
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

    public static FT_Affine23 naffine(long struct) {
        return FT_Affine23.create(struct + AFFINE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintTransform$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintTransform$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintTransform, Buffer> {
        private static final FT_PaintTransform ELEMENT_FACTORY = FT_PaintTransform.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintTransform.SIZEOF);
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
        public FT_PaintTransform getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() {
            return FT_PaintTransform.npaint(address());
        }

        public FT_Affine23 affine() {
            return FT_PaintTransform.naffine(address());
        }
    }
}
