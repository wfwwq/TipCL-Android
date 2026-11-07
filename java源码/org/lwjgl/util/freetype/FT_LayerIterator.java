package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_LayerIterator.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_LayerIterator.class */
public class FT_LayerIterator extends Struct<FT_LayerIterator> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NUM_LAYERS;
    public static final int LAYER;
    public static final int P;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NUM_LAYERS = layout.offsetof(0);
        LAYER = layout.offsetof(1);
        P = layout.offsetof(2);
    }

    protected FT_LayerIterator(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_LayerIterator create(long address, ByteBuffer container) {
        return new FT_LayerIterator(address, container);
    }

    public FT_LayerIterator(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UInt")
    public int num_layers() {
        return nnum_layers(address());
    }

    @NativeType("FT_UInt")
    public int layer() {
        return nlayer(address());
    }

    @NativeType("FT_Byte *")
    public ByteBuffer p(int capacity) {
        return np(address(), capacity);
    }

    public static FT_LayerIterator malloc() {
        return new FT_LayerIterator(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_LayerIterator calloc() {
        return new FT_LayerIterator(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_LayerIterator create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_LayerIterator(MemoryUtil.memAddress(container), container);
    }

    public static FT_LayerIterator create(long address) {
        return new FT_LayerIterator(address, null);
    }

    public static FT_LayerIterator createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_LayerIterator(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
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

    public static FT_LayerIterator malloc(MemoryStack stack) {
        return new FT_LayerIterator(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_LayerIterator calloc(MemoryStack stack) {
        return new FT_LayerIterator(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nnum_layers(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_LAYERS);
    }

    public static int nlayer(long struct) {
        return MemoryUtil.memGetInt(struct + LAYER);
    }

    public static ByteBuffer np(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + P), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_LayerIterator$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_LayerIterator$Buffer.class */
    public static class Buffer extends StructBuffer<FT_LayerIterator, Buffer> implements NativeResource {
        private static final FT_LayerIterator ELEMENT_FACTORY = FT_LayerIterator.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_LayerIterator.SIZEOF);
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
        public FT_LayerIterator getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UInt")
        public int num_layers() {
            return FT_LayerIterator.nnum_layers(address());
        }

        @NativeType("FT_UInt")
        public int layer() {
            return FT_LayerIterator.nlayer(address());
        }

        @NativeType("FT_Byte *")
        public ByteBuffer p(int capacity) {
            return FT_LayerIterator.np(address(), capacity);
        }
    }
}
