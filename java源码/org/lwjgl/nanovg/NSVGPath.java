package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGPath.class
 */
@NativeType("struct NSVGpath")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGPath.class */
public class NSVGPath extends Struct<NSVGPath> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PTS;
    public static final int NPTS;
    public static final int CLOSED;
    public static final int BOUNDS;
    public static final int NEXT;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(1), __array(4, 4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PTS = layout.offsetof(0);
        NPTS = layout.offsetof(1);
        CLOSED = layout.offsetof(2);
        BOUNDS = layout.offsetof(3);
        NEXT = layout.offsetof(4);
    }

    protected NSVGPath(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NSVGPath create(long address, ByteBuffer container) {
        return new NSVGPath(address, container);
    }

    public NSVGPath(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("float *")
    public FloatBuffer pts() {
        return npts(address());
    }

    public int npts() {
        return nnpts(address());
    }

    @NativeType("char")
    public byte closed() {
        return nclosed(address());
    }

    @NativeType("float[4]")
    public FloatBuffer bounds() {
        return nbounds(address());
    }

    public float bounds(int index) {
        return nbounds(address(), index);
    }

    @NativeType("NSVGpath *")
    public NSVGPath next() {
        return nnext(address());
    }

    public static NSVGPath create(long address) {
        return new NSVGPath(address, null);
    }

    public static NSVGPath createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NSVGPath(address, null);
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

    public static FloatBuffer npts(long struct) {
        return MemoryUtil.memFloatBuffer(MemoryUtil.memGetAddress(struct + PTS), nnpts(struct) << 1);
    }

    public static int nnpts(long struct) {
        return MemoryUtil.memGetInt(struct + NPTS);
    }

    public static byte nclosed(long struct) {
        return MemoryUtil.memGetByte(struct + CLOSED);
    }

    public static FloatBuffer nbounds(long struct) {
        return MemoryUtil.memFloatBuffer(struct + BOUNDS, 4);
    }

    public static float nbounds(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + BOUNDS + (Checks.check(index, 4) * 4));
    }

    public static NSVGPath nnext(long struct) {
        return create(MemoryUtil.memGetAddress(struct + NEXT));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGPath$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGPath$Buffer.class */
    public static class Buffer extends StructBuffer<NSVGPath, Buffer> {
        private static final NSVGPath ELEMENT_FACTORY = NSVGPath.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NSVGPath.SIZEOF);
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
        public NSVGPath getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("float *")
        public FloatBuffer pts() {
            return NSVGPath.npts(address());
        }

        public int npts() {
            return NSVGPath.nnpts(address());
        }

        @NativeType("char")
        public byte closed() {
            return NSVGPath.nclosed(address());
        }

        @NativeType("float[4]")
        public FloatBuffer bounds() {
            return NSVGPath.nbounds(address());
        }

        public float bounds(int index) {
            return NSVGPath.nbounds(address(), index);
        }

        @NativeType("NSVGpath *")
        public NSVGPath next() {
            return NSVGPath.nnext(address());
        }
    }
}
