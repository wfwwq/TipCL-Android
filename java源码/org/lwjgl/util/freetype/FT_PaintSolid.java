package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSolid.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSolid.class */
public class FT_PaintSolid extends Struct<FT_PaintSolid> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COLOR;

    static {
        Struct.Layout layout = __struct(__member(FT_ColorIndex.SIZEOF, FT_ColorIndex.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COLOR = layout.offsetof(0);
    }

    protected FT_PaintSolid(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintSolid create(long address, ByteBuffer container) {
        return new FT_PaintSolid(address, container);
    }

    public FT_PaintSolid(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_ColorIndex color() {
        return ncolor(address());
    }

    public static FT_PaintSolid create(long address) {
        return new FT_PaintSolid(address, null);
    }

    public static FT_PaintSolid createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintSolid(address, null);
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

    public static FT_ColorIndex ncolor(long struct) {
        return FT_ColorIndex.create(struct + COLOR);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSolid$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintSolid$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintSolid, Buffer> {
        private static final FT_PaintSolid ELEMENT_FACTORY = FT_PaintSolid.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintSolid.SIZEOF);
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
        public FT_PaintSolid getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_ColorIndex color() {
            return FT_PaintSolid.ncolor(address());
        }
    }
}
