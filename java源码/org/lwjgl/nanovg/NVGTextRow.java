package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGTextRow.class
 */
@NativeType("struct NVGtextRow")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGTextRow.class */
public class NVGTextRow extends Struct<NVGTextRow> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int START;
    public static final int END;
    public static final int NEXT;
    public static final int WIDTH;
    public static final int MINX;
    public static final int MAXX;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        START = layout.offsetof(0);
        END = layout.offsetof(1);
        NEXT = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        MINX = layout.offsetof(4);
        MAXX = layout.offsetof(5);
    }

    protected NVGTextRow(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NVGTextRow create(long address, ByteBuffer container) {
        return new NVGTextRow(address, container);
    }

    public NVGTextRow(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char *")
    public long start() {
        return nstart(address());
    }

    @NativeType("char *")
    public long end() {
        return nend(address());
    }

    @NativeType("char *")
    public long next() {
        return nnext(address());
    }

    public float width() {
        return nwidth(address());
    }

    public float minx() {
        return nminx(address());
    }

    public float maxx() {
        return nmaxx(address());
    }

    public static NVGTextRow malloc() {
        return new NVGTextRow(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGTextRow calloc() {
        return new NVGTextRow(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGTextRow create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGTextRow(MemoryUtil.memAddress(container), container);
    }

    public static NVGTextRow create(long address) {
        return new NVGTextRow(address, null);
    }

    public static NVGTextRow createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NVGTextRow(address, null);
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

    public static NVGTextRow malloc(MemoryStack stack) {
        return new NVGTextRow(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGTextRow calloc(MemoryStack stack) {
        return new NVGTextRow(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nstart(long struct) {
        return MemoryUtil.memGetAddress(struct + START);
    }

    public static long nend(long struct) {
        return MemoryUtil.memGetAddress(struct + END);
    }

    public static long nnext(long struct) {
        return MemoryUtil.memGetAddress(struct + NEXT);
    }

    public static float nwidth(long struct) {
        return MemoryUtil.memGetFloat(struct + WIDTH);
    }

    public static float nminx(long struct) {
        return MemoryUtil.memGetFloat(struct + MINX);
    }

    public static float nmaxx(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXX);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGTextRow$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGTextRow$Buffer.class */
    public static class Buffer extends StructBuffer<NVGTextRow, Buffer> implements NativeResource {
        private static final NVGTextRow ELEMENT_FACTORY = NVGTextRow.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NVGTextRow.SIZEOF);
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
        public NVGTextRow getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char *")
        public long start() {
            return NVGTextRow.nstart(address());
        }

        @NativeType("char *")
        public long end() {
            return NVGTextRow.nend(address());
        }

        @NativeType("char *")
        public long next() {
            return NVGTextRow.nnext(address());
        }

        public float width() {
            return NVGTextRow.nwidth(address());
        }

        public float minx() {
            return NVGTextRow.nminx(address());
        }

        public float maxx() {
            return NVGTextRow.nmaxx(address());
        }
    }
}
