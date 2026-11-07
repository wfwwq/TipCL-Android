package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintColrLayers.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintColrLayers.class */
public class FT_PaintColrLayers extends Struct<FT_PaintColrLayers> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LAYER_ITERATOR;

    static {
        Struct.Layout layout = __struct(__member(FT_LayerIterator.SIZEOF, FT_LayerIterator.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LAYER_ITERATOR = layout.offsetof(0);
    }

    protected FT_PaintColrLayers(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintColrLayers create(long address, ByteBuffer container) {
        return new FT_PaintColrLayers(address, container);
    }

    public FT_PaintColrLayers(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_LayerIterator layer_iterator() {
        return nlayer_iterator(address());
    }

    public static FT_PaintColrLayers create(long address) {
        return new FT_PaintColrLayers(address, null);
    }

    public static FT_PaintColrLayers createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintColrLayers(address, null);
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

    public static FT_LayerIterator nlayer_iterator(long struct) {
        return FT_LayerIterator.create(struct + LAYER_ITERATOR);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintColrLayers$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintColrLayers$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintColrLayers, Buffer> {
        private static final FT_PaintColrLayers ELEMENT_FACTORY = FT_PaintColrLayers.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintColrLayers.SIZEOF);
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
        public FT_PaintColrLayers getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_LayerIterator layer_iterator() {
            return FT_PaintColrLayers.nlayer_iterator(address());
        }
    }
}
