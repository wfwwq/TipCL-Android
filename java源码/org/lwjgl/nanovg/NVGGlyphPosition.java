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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGGlyphPosition.class
 */
@NativeType("struct NVGglyphPosition")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGGlyphPosition.class */
public class NVGGlyphPosition extends Struct<NVGGlyphPosition> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STR;
    public static final int X;
    public static final int MINX;
    public static final int MAXX;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STR = layout.offsetof(0);
        X = layout.offsetof(1);
        MINX = layout.offsetof(2);
        MAXX = layout.offsetof(3);
    }

    protected NVGGlyphPosition(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NVGGlyphPosition create(long address, ByteBuffer container) {
        return new NVGGlyphPosition(address, container);
    }

    public NVGGlyphPosition(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char *")
    public long str() {
        return nstr(address());
    }

    public float x() {
        return nx(address());
    }

    public float minx() {
        return nminx(address());
    }

    public float maxx() {
        return nmaxx(address());
    }

    public static NVGGlyphPosition malloc() {
        return new NVGGlyphPosition(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGGlyphPosition calloc() {
        return new NVGGlyphPosition(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGGlyphPosition create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGGlyphPosition(MemoryUtil.memAddress(container), container);
    }

    public static NVGGlyphPosition create(long address) {
        return new NVGGlyphPosition(address, null);
    }

    public static NVGGlyphPosition createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NVGGlyphPosition(address, null);
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

    public static NVGGlyphPosition malloc(MemoryStack stack) {
        return new NVGGlyphPosition(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGGlyphPosition calloc(MemoryStack stack) {
        return new NVGGlyphPosition(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nstr(long struct) {
        return MemoryUtil.memGetAddress(struct + STR);
    }

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float nminx(long struct) {
        return MemoryUtil.memGetFloat(struct + MINX);
    }

    public static float nmaxx(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXX);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGGlyphPosition$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGGlyphPosition$Buffer.class */
    public static class Buffer extends StructBuffer<NVGGlyphPosition, Buffer> implements NativeResource {
        private static final NVGGlyphPosition ELEMENT_FACTORY = NVGGlyphPosition.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NVGGlyphPosition.SIZEOF);
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
        public NVGGlyphPosition getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char *")
        public long str() {
            return NVGGlyphPosition.nstr(address());
        }

        public float x() {
            return NVGGlyphPosition.nx(address());
        }

        public float minx() {
            return NVGGlyphPosition.nminx(address());
        }

        public float maxx() {
            return NVGGlyphPosition.nmaxx(address());
        }
    }
}
