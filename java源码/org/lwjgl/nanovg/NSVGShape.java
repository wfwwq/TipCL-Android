package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGShape.class
 */
@NativeType("struct NSVGshape")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGShape.class */
public class NSVGShape extends Struct<NSVGShape> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ID;
    public static final int FILL;
    public static final int STROKE;
    public static final int OPACITY;
    public static final int STROKEWIDTH;
    public static final int STROKEDASHOFFSET;
    public static final int STROKEDASHARRAY;
    public static final int STROKEDASHCOUNT;
    public static final int STROKELINEJOIN;
    public static final int STROKELINECAP;
    public static final int MITERLIMIT;
    public static final int FILLRULE;
    public static final int PAINTORDER;
    public static final int FLAGS;
    public static final int BOUNDS;
    public static final int FILLGRADIENT;
    public static final int STROKEGRADIENT;
    public static final int XFORM;
    public static final int PATHS;
    public static final int NEXT;

    static {
        Struct.Layout layout = __struct(__array(1, 64), __member(NSVGPaint.SIZEOF, NSVGPaint.ALIGNOF), __member(NSVGPaint.SIZEOF, NSVGPaint.ALIGNOF), __member(4), __member(4), __member(4), __array(4, 8), __member(1), __member(1), __member(1), __member(4), __member(1), __member(1), __member(1), __array(4, 4), __array(1, 64), __array(1, 64), __array(4, 6), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ID = layout.offsetof(0);
        FILL = layout.offsetof(1);
        STROKE = layout.offsetof(2);
        OPACITY = layout.offsetof(3);
        STROKEWIDTH = layout.offsetof(4);
        STROKEDASHOFFSET = layout.offsetof(5);
        STROKEDASHARRAY = layout.offsetof(6);
        STROKEDASHCOUNT = layout.offsetof(7);
        STROKELINEJOIN = layout.offsetof(8);
        STROKELINECAP = layout.offsetof(9);
        MITERLIMIT = layout.offsetof(10);
        FILLRULE = layout.offsetof(11);
        PAINTORDER = layout.offsetof(12);
        FLAGS = layout.offsetof(13);
        BOUNDS = layout.offsetof(14);
        FILLGRADIENT = layout.offsetof(15);
        STROKEGRADIENT = layout.offsetof(16);
        XFORM = layout.offsetof(17);
        PATHS = layout.offsetof(18);
        NEXT = layout.offsetof(19);
    }

    protected NSVGShape(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NSVGShape create(long address, ByteBuffer container) {
        return new NSVGShape(address, container);
    }

    public NSVGShape(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char[64]")
    public ByteBuffer id() {
        return nid(address());
    }

    @NativeType("char[64]")
    public String idString() {
        return nidString(address());
    }

    @NativeType("NSVGpaint")
    public NSVGPaint fill() {
        return nfill(address());
    }

    @NativeType("NSVGpaint")
    public NSVGPaint stroke() {
        return nstroke(address());
    }

    public float opacity() {
        return nopacity(address());
    }

    public float strokeWidth() {
        return nstrokeWidth(address());
    }

    public float strokeDashOffset() {
        return nstrokeDashOffset(address());
    }

    @NativeType("float[8]")
    public FloatBuffer strokeDashArray() {
        return nstrokeDashArray(address());
    }

    public float strokeDashArray(int index) {
        return nstrokeDashArray(address(), index);
    }

    @NativeType("char")
    public byte strokeDashCount() {
        return nstrokeDashCount(address());
    }

    @NativeType("char")
    public byte strokeLineJoin() {
        return nstrokeLineJoin(address());
    }

    @NativeType("char")
    public byte strokeLineCap() {
        return nstrokeLineCap(address());
    }

    public float miterLimit() {
        return nmiterLimit(address());
    }

    @NativeType("char")
    public byte fillRule() {
        return nfillRule(address());
    }

    @NativeType("unsigned char")
    public byte paintOrder() {
        return npaintOrder(address());
    }

    @NativeType("unsigned char")
    public byte flags() {
        return nflags(address());
    }

    @NativeType("float[4]")
    public FloatBuffer bounds() {
        return nbounds(address());
    }

    public float bounds(int index) {
        return nbounds(address(), index);
    }

    @NativeType("char[64]")
    public ByteBuffer fillGradient() {
        return nfillGradient(address());
    }

    @NativeType("char[64]")
    public String fillGradientString() {
        return nfillGradientString(address());
    }

    @NativeType("char[64]")
    public ByteBuffer strokeGradient() {
        return nstrokeGradient(address());
    }

    @NativeType("char[64]")
    public String strokeGradientString() {
        return nstrokeGradientString(address());
    }

    @NativeType("float[6]")
    public FloatBuffer xform() {
        return nxform(address());
    }

    public float xform(int index) {
        return nxform(address(), index);
    }

    @NativeType("NSVGpath *")
    public NSVGPath paths() {
        return npaths(address());
    }

    @NativeType("NSVGshape *")
    public NSVGShape next() {
        return nnext(address());
    }

    public static NSVGShape create(long address) {
        return new NSVGShape(address, null);
    }

    public static NSVGShape createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NSVGShape(address, null);
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

    public static ByteBuffer nid(long struct) {
        return MemoryUtil.memByteBuffer(struct + ID, 64);
    }

    public static String nidString(long struct) {
        return MemoryUtil.memASCII(struct + ID);
    }

    public static NSVGPaint nfill(long struct) {
        return NSVGPaint.create(struct + FILL);
    }

    public static NSVGPaint nstroke(long struct) {
        return NSVGPaint.create(struct + STROKE);
    }

    public static float nopacity(long struct) {
        return MemoryUtil.memGetFloat(struct + OPACITY);
    }

    public static float nstrokeWidth(long struct) {
        return MemoryUtil.memGetFloat(struct + STROKEWIDTH);
    }

    public static float nstrokeDashOffset(long struct) {
        return MemoryUtil.memGetFloat(struct + STROKEDASHOFFSET);
    }

    public static FloatBuffer nstrokeDashArray(long struct) {
        return MemoryUtil.memFloatBuffer(struct + STROKEDASHARRAY, 8);
    }

    public static float nstrokeDashArray(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + STROKEDASHARRAY + (Checks.check(index, 8) * 4));
    }

    public static byte nstrokeDashCount(long struct) {
        return MemoryUtil.memGetByte(struct + STROKEDASHCOUNT);
    }

    public static byte nstrokeLineJoin(long struct) {
        return MemoryUtil.memGetByte(struct + STROKELINEJOIN);
    }

    public static byte nstrokeLineCap(long struct) {
        return MemoryUtil.memGetByte(struct + STROKELINECAP);
    }

    public static float nmiterLimit(long struct) {
        return MemoryUtil.memGetFloat(struct + MITERLIMIT);
    }

    public static byte nfillRule(long struct) {
        return MemoryUtil.memGetByte(struct + FILLRULE);
    }

    public static byte npaintOrder(long struct) {
        return MemoryUtil.memGetByte(struct + PAINTORDER);
    }

    public static byte nflags(long struct) {
        return MemoryUtil.memGetByte(struct + FLAGS);
    }

    public static FloatBuffer nbounds(long struct) {
        return MemoryUtil.memFloatBuffer(struct + BOUNDS, 4);
    }

    public static float nbounds(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + BOUNDS + (Checks.check(index, 4) * 4));
    }

    public static ByteBuffer nfillGradient(long struct) {
        return MemoryUtil.memByteBuffer(struct + FILLGRADIENT, 64);
    }

    public static String nfillGradientString(long struct) {
        return MemoryUtil.memASCII(struct + FILLGRADIENT);
    }

    public static ByteBuffer nstrokeGradient(long struct) {
        return MemoryUtil.memByteBuffer(struct + STROKEGRADIENT, 64);
    }

    public static String nstrokeGradientString(long struct) {
        return MemoryUtil.memASCII(struct + STROKEGRADIENT);
    }

    public static FloatBuffer nxform(long struct) {
        return MemoryUtil.memFloatBuffer(struct + XFORM, 6);
    }

    public static float nxform(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + XFORM + (Checks.check(index, 6) * 4));
    }

    public static NSVGPath npaths(long struct) {
        return NSVGPath.create(MemoryUtil.memGetAddress(struct + PATHS));
    }

    public static NSVGShape nnext(long struct) {
        return create(MemoryUtil.memGetAddress(struct + NEXT));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGShape$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGShape$Buffer.class */
    public static class Buffer extends StructBuffer<NSVGShape, Buffer> {
        private static final NSVGShape ELEMENT_FACTORY = NSVGShape.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NSVGShape.SIZEOF);
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
        public NSVGShape getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char[64]")
        public ByteBuffer id() {
            return NSVGShape.nid(address());
        }

        @NativeType("char[64]")
        public String idString() {
            return NSVGShape.nidString(address());
        }

        @NativeType("NSVGpaint")
        public NSVGPaint fill() {
            return NSVGShape.nfill(address());
        }

        @NativeType("NSVGpaint")
        public NSVGPaint stroke() {
            return NSVGShape.nstroke(address());
        }

        public float opacity() {
            return NSVGShape.nopacity(address());
        }

        public float strokeWidth() {
            return NSVGShape.nstrokeWidth(address());
        }

        public float strokeDashOffset() {
            return NSVGShape.nstrokeDashOffset(address());
        }

        @NativeType("float[8]")
        public FloatBuffer strokeDashArray() {
            return NSVGShape.nstrokeDashArray(address());
        }

        public float strokeDashArray(int index) {
            return NSVGShape.nstrokeDashArray(address(), index);
        }

        @NativeType("char")
        public byte strokeDashCount() {
            return NSVGShape.nstrokeDashCount(address());
        }

        @NativeType("char")
        public byte strokeLineJoin() {
            return NSVGShape.nstrokeLineJoin(address());
        }

        @NativeType("char")
        public byte strokeLineCap() {
            return NSVGShape.nstrokeLineCap(address());
        }

        public float miterLimit() {
            return NSVGShape.nmiterLimit(address());
        }

        @NativeType("char")
        public byte fillRule() {
            return NSVGShape.nfillRule(address());
        }

        @NativeType("unsigned char")
        public byte paintOrder() {
            return NSVGShape.npaintOrder(address());
        }

        @NativeType("unsigned char")
        public byte flags() {
            return NSVGShape.nflags(address());
        }

        @NativeType("float[4]")
        public FloatBuffer bounds() {
            return NSVGShape.nbounds(address());
        }

        public float bounds(int index) {
            return NSVGShape.nbounds(address(), index);
        }

        @NativeType("char[64]")
        public ByteBuffer fillGradient() {
            return NSVGShape.nfillGradient(address());
        }

        @NativeType("char[64]")
        public String fillGradientString() {
            return NSVGShape.nfillGradientString(address());
        }

        @NativeType("char[64]")
        public ByteBuffer strokeGradient() {
            return NSVGShape.nstrokeGradient(address());
        }

        @NativeType("char[64]")
        public String strokeGradientString() {
            return NSVGShape.nstrokeGradientString(address());
        }

        @NativeType("float[6]")
        public FloatBuffer xform() {
            return NSVGShape.nxform(address());
        }

        public float xform(int index) {
            return NSVGShape.nxform(address(), index);
        }

        @NativeType("NSVGpath *")
        public NSVGPath paths() {
            return NSVGShape.npaths(address());
        }

        @NativeType("NSVGshape *")
        public NSVGShape next() {
            return NSVGShape.nnext(address());
        }
    }
}
