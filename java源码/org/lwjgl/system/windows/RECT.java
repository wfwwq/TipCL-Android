package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/RECT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/RECT.class */
public class RECT extends Struct<RECT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LEFT;
    public static final int TOP;
    public static final int RIGHT;
    public static final int BOTTOM;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LEFT = layout.offsetof(0);
        TOP = layout.offsetof(1);
        RIGHT = layout.offsetof(2);
        BOTTOM = layout.offsetof(3);
    }

    protected RECT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public RECT create(long address, ByteBuffer container) {
        return new RECT(address, container);
    }

    public RECT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("LONG")
    public int left() {
        return nleft(address());
    }

    @NativeType("LONG")
    public int top() {
        return ntop(address());
    }

    @NativeType("LONG")
    public int right() {
        return nright(address());
    }

    @NativeType("LONG")
    public int bottom() {
        return nbottom(address());
    }

    public RECT left(@NativeType("LONG") int value) {
        nleft(address(), value);
        return this;
    }

    public RECT top(@NativeType("LONG") int value) {
        ntop(address(), value);
        return this;
    }

    public RECT right(@NativeType("LONG") int value) {
        nright(address(), value);
        return this;
    }

    public RECT bottom(@NativeType("LONG") int value) {
        nbottom(address(), value);
        return this;
    }

    public RECT set(int left, int top2, int right, int bottom) {
        left(left);
        top(top2);
        right(right);
        bottom(bottom);
        return this;
    }

    public RECT set(RECT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static RECT malloc() {
        return new RECT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static RECT calloc() {
        return new RECT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static RECT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RECT(MemoryUtil.memAddress(container), container);
    }

    public static RECT create(long address) {
        return new RECT(address, null);
    }

    public static RECT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new RECT(address, null);
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

    public static RECT malloc(MemoryStack stack) {
        return new RECT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static RECT calloc(MemoryStack stack) {
        return new RECT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nleft(long struct) {
        return MemoryUtil.memGetInt(struct + LEFT);
    }

    public static int ntop(long struct) {
        return MemoryUtil.memGetInt(struct + TOP);
    }

    public static int nright(long struct) {
        return MemoryUtil.memGetInt(struct + RIGHT);
    }

    public static int nbottom(long struct) {
        return MemoryUtil.memGetInt(struct + BOTTOM);
    }

    public static void nleft(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEFT, value);
    }

    public static void ntop(long struct, int value) {
        MemoryUtil.memPutInt(struct + TOP, value);
    }

    public static void nright(long struct, int value) {
        MemoryUtil.memPutInt(struct + RIGHT, value);
    }

    public static void nbottom(long struct, int value) {
        MemoryUtil.memPutInt(struct + BOTTOM, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/RECT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/RECT$Buffer.class */
    public static class Buffer extends StructBuffer<RECT, Buffer> implements NativeResource {
        private static final RECT ELEMENT_FACTORY = RECT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / RECT.SIZEOF);
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
        public RECT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("LONG")
        public int left() {
            return RECT.nleft(address());
        }

        @NativeType("LONG")
        public int top() {
            return RECT.ntop(address());
        }

        @NativeType("LONG")
        public int right() {
            return RECT.nright(address());
        }

        @NativeType("LONG")
        public int bottom() {
            return RECT.nbottom(address());
        }

        public Buffer left(@NativeType("LONG") int value) {
            RECT.nleft(address(), value);
            return this;
        }

        public Buffer top(@NativeType("LONG") int value) {
            RECT.ntop(address(), value);
            return this;
        }

        public Buffer right(@NativeType("LONG") int value) {
            RECT.nright(address(), value);
            return this;
        }

        public Buffer bottom(@NativeType("LONG") int value) {
            RECT.nbottom(address(), value);
            return this;
        }
    }
}
