package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorLine.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorLine.class */
public class FT_ColorLine extends Struct<FT_ColorLine> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int EXTEND;
    public static final int COLOR_STOP_ITERATOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(FT_ColorStopIterator.SIZEOF, FT_ColorStopIterator.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        EXTEND = layout.offsetof(0);
        COLOR_STOP_ITERATOR = layout.offsetof(1);
    }

    protected FT_ColorLine(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_ColorLine create(long address, ByteBuffer container) {
        return new FT_ColorLine(address, container);
    }

    public FT_ColorLine(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_PaintExtend")
    public int extend() {
        return nextend(address());
    }

    public FT_ColorStopIterator color_stop_iterator() {
        return ncolor_stop_iterator(address());
    }

    public static FT_ColorLine create(long address) {
        return new FT_ColorLine(address, null);
    }

    public static FT_ColorLine createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_ColorLine(address, null);
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

    public static int nextend(long struct) {
        return MemoryUtil.memGetInt(struct + EXTEND);
    }

    public static FT_ColorStopIterator ncolor_stop_iterator(long struct) {
        return FT_ColorStopIterator.create(struct + COLOR_STOP_ITERATOR);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorLine$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorLine$Buffer.class */
    public static class Buffer extends StructBuffer<FT_ColorLine, Buffer> {
        private static final FT_ColorLine ELEMENT_FACTORY = FT_ColorLine.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_ColorLine.SIZEOF);
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
        public FT_ColorLine getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_PaintExtend")
        public int extend() {
            return FT_ColorLine.nextend(address());
        }

        public FT_ColorStopIterator color_stop_iterator() {
            return FT_ColorLine.ncolor_stop_iterator(address());
        }
    }
}
