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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorStopIterator.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorStopIterator.class */
public class FT_ColorStopIterator extends Struct<FT_ColorStopIterator> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NUM_COLOR_STOPS;
    public static final int CURRENT_COLOR_STOP;
    public static final int P;
    public static final int READ_VARIABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NUM_COLOR_STOPS = layout.offsetof(0);
        CURRENT_COLOR_STOP = layout.offsetof(1);
        P = layout.offsetof(2);
        READ_VARIABLE = layout.offsetof(3);
    }

    protected FT_ColorStopIterator(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_ColorStopIterator create(long address, ByteBuffer container) {
        return new FT_ColorStopIterator(address, container);
    }

    public FT_ColorStopIterator(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UInt")
    public int num_color_stops() {
        return nnum_color_stops(address());
    }

    @NativeType("FT_UInt")
    public int current_color_stop() {
        return ncurrent_color_stop(address());
    }

    @NativeType("FT_Byte *")
    public ByteBuffer p(int capacity) {
        return np(address(), capacity);
    }

    @NativeType("FT_Bool")
    public boolean read_variable() {
        return nread_variable(address());
    }

    public static FT_ColorStopIterator malloc() {
        return new FT_ColorStopIterator(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_ColorStopIterator calloc() {
        return new FT_ColorStopIterator(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_ColorStopIterator create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_ColorStopIterator(MemoryUtil.memAddress(container), container);
    }

    public static FT_ColorStopIterator create(long address) {
        return new FT_ColorStopIterator(address, null);
    }

    public static FT_ColorStopIterator createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_ColorStopIterator(address, null);
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

    public static FT_ColorStopIterator malloc(MemoryStack stack) {
        return new FT_ColorStopIterator(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_ColorStopIterator calloc(MemoryStack stack) {
        return new FT_ColorStopIterator(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nnum_color_stops(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_COLOR_STOPS);
    }

    public static int ncurrent_color_stop(long struct) {
        return MemoryUtil.memGetInt(struct + CURRENT_COLOR_STOP);
    }

    public static ByteBuffer np(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + P), capacity);
    }

    public static boolean nread_variable(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) READ_VARIABLE)) != 0;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorStopIterator$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorStopIterator$Buffer.class */
    public static class Buffer extends StructBuffer<FT_ColorStopIterator, Buffer> implements NativeResource {
        private static final FT_ColorStopIterator ELEMENT_FACTORY = FT_ColorStopIterator.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_ColorStopIterator.SIZEOF);
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
        public FT_ColorStopIterator getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UInt")
        public int num_color_stops() {
            return FT_ColorStopIterator.nnum_color_stops(address());
        }

        @NativeType("FT_UInt")
        public int current_color_stop() {
            return FT_ColorStopIterator.ncurrent_color_stop(address());
        }

        @NativeType("FT_Byte *")
        public ByteBuffer p(int capacity) {
            return FT_ColorStopIterator.np(address(), capacity);
        }

        @NativeType("FT_Bool")
        public boolean read_variable() {
            return FT_ColorStopIterator.nread_variable(address());
        }
    }
}
