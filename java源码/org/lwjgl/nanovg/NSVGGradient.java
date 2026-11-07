package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.nanovg.NSVGGradientStop;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGGradient.class
 */
@NativeType("struct NSVGgradient")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGGradient.class */
public class NSVGGradient extends Struct<NSVGGradient> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int XFORM;
    public static final int SPREAD;
    public static final int FX;
    public static final int FY;
    public static final int NSTOPS;
    public static final int PSTOPS;

    static {
        Struct.Layout layout = __struct(__array(4, 6), __member(1), __member(4), __member(4), __member(4), __array(NSVGGradientStop.SIZEOF, NSVGGradientStop.ALIGNOF, 1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        XFORM = layout.offsetof(0);
        SPREAD = layout.offsetof(1);
        FX = layout.offsetof(2);
        FY = layout.offsetof(3);
        NSTOPS = layout.offsetof(4);
        PSTOPS = layout.offsetof(5);
    }

    protected NSVGGradient(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NSVGGradient create(long address, ByteBuffer container) {
        return new NSVGGradient(address, container);
    }

    public NSVGGradient(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("float[6]")
    public FloatBuffer xform() {
        return nxform(address());
    }

    public float xform(int index) {
        return nxform(address(), index);
    }

    @NativeType("char")
    public byte spread() {
        return nspread(address());
    }

    public float fx() {
        return nfx(address());
    }

    public float fy() {
        return nfy(address());
    }

    public int nstops() {
        return nnstops(address());
    }

    @NativeType("NSVGgradientStop[1]")
    public NSVGGradientStop.Buffer pstops() {
        return npstops(address());
    }

    @NativeType("NSVGgradientStop")
    public NSVGGradientStop pstops(int index) {
        return npstops(address(), index);
    }

    public static NSVGGradient create(long address) {
        return new NSVGGradient(address, null);
    }

    public static NSVGGradient createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NSVGGradient(address, null);
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

    public static FloatBuffer nxform(long struct) {
        return MemoryUtil.memFloatBuffer(struct + XFORM, 6);
    }

    public static float nxform(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + XFORM + (Checks.check(index, 6) * 4));
    }

    public static byte nspread(long struct) {
        return MemoryUtil.memGetByte(struct + SPREAD);
    }

    public static float nfx(long struct) {
        return MemoryUtil.memGetFloat(struct + FX);
    }

    public static float nfy(long struct) {
        return MemoryUtil.memGetFloat(struct + FY);
    }

    public static int nnstops(long struct) {
        return MemoryUtil.memGetInt(struct + NSTOPS);
    }

    public static NSVGGradientStop.Buffer npstops(long struct) {
        return NSVGGradientStop.create(struct + PSTOPS, nnstops(struct));
    }

    public static NSVGGradientStop npstops(long struct, int index) {
        return NSVGGradientStop.create(struct + PSTOPS + (Checks.check(index, nnstops(struct)) * NSVGGradientStop.SIZEOF));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGGradient$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGGradient$Buffer.class */
    public static class Buffer extends StructBuffer<NSVGGradient, Buffer> {
        private static final NSVGGradient ELEMENT_FACTORY = NSVGGradient.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NSVGGradient.SIZEOF);
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
        public NSVGGradient getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("float[6]")
        public FloatBuffer xform() {
            return NSVGGradient.nxform(address());
        }

        public float xform(int index) {
            return NSVGGradient.nxform(address(), index);
        }

        @NativeType("char")
        public byte spread() {
            return NSVGGradient.nspread(address());
        }

        public float fx() {
            return NSVGGradient.nfx(address());
        }

        public float fy() {
            return NSVGGradient.nfy(address());
        }

        public int nstops() {
            return NSVGGradient.nnstops(address());
        }

        @NativeType("NSVGgradientStop[1]")
        public NSVGGradientStop.Buffer pstops() {
            return NSVGGradient.npstops(address());
        }

        @NativeType("NSVGgradientStop")
        public NSVGGradientStop pstops(int index) {
            return NSVGGradient.npstops(address(), index);
        }
    }
}
