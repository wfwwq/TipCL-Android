package org.lwjgl.system.macosx;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/CGPoint.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/CGPoint.class */
public class CGPoint extends Struct<CGPoint> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    protected CGPoint(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public CGPoint create(long address, ByteBuffer container) {
        return new CGPoint(address, container);
    }

    public CGPoint(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("CGFloat")
    public double x() {
        return nx(address());
    }

    @NativeType("CGFloat")
    public double y() {
        return ny(address());
    }

    public CGPoint x(@NativeType("CGFloat") double value) {
        nx(address(), value);
        return this;
    }

    public CGPoint y(@NativeType("CGFloat") double value) {
        ny(address(), value);
        return this;
    }

    public CGPoint set(double x, double y) {
        x(x);
        y(y);
        return this;
    }

    public CGPoint set(CGPoint src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static CGPoint malloc() {
        return new CGPoint(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static CGPoint calloc() {
        return new CGPoint(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static CGPoint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CGPoint(MemoryUtil.memAddress(container), container);
    }

    public static CGPoint create(long address) {
        return new CGPoint(address, null);
    }

    public static CGPoint createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new CGPoint(address, null);
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

    public static CGPoint malloc(MemoryStack stack) {
        return new CGPoint(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static CGPoint calloc(MemoryStack stack) {
        return new CGPoint(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static double nx(long struct) {
        return MemoryUtil.memGetDouble(struct + X);
    }

    public static double ny(long struct) {
        return MemoryUtil.memGetDouble(struct + Y);
    }

    public static void nx(long struct, double value) {
        MemoryUtil.memPutDouble(struct + X, value);
    }

    public static void ny(long struct, double value) {
        MemoryUtil.memPutDouble(struct + Y, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/CGPoint$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/CGPoint$Buffer.class */
    public static class Buffer extends StructBuffer<CGPoint, Buffer> implements NativeResource {
        private static final CGPoint ELEMENT_FACTORY = CGPoint.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / CGPoint.SIZEOF);
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
        public CGPoint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("CGFloat")
        public double x() {
            return CGPoint.nx(address());
        }

        @NativeType("CGFloat")
        public double y() {
            return CGPoint.ny(address());
        }

        public Buffer x(@NativeType("CGFloat") double value) {
            CGPoint.nx(address(), value);
            return this;
        }

        public Buffer y(@NativeType("CGFloat") double value) {
            CGPoint.ny(address(), value);
            return this;
        }
    }
}
