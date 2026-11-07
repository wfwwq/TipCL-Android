package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGPaint.class
 */
@NativeType("struct NSVGpaint")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGPaint.class */
public class NSVGPaint extends Struct<NSVGPaint> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int COLOR;
    public static final int GRADIENT;

    static {
        Struct.Layout layout = __struct(__member(1), __union(__member(4), __member(POINTER_SIZE)));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        COLOR = layout.offsetof(2);
        GRADIENT = layout.offsetof(3);
    }

    protected NSVGPaint(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NSVGPaint create(long address, ByteBuffer container) {
        return new NSVGPaint(address, container);
    }

    public NSVGPaint(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("signed char")
    public byte type() {
        return ntype(address());
    }

    @NativeType("unsigned int")
    public int color() {
        return ncolor(address());
    }

    @NativeType("NSVGgradient *")
    public NSVGGradient gradient() {
        return ngradient(address());
    }

    public static NSVGPaint create(long address) {
        return new NSVGPaint(address, null);
    }

    public static NSVGPaint createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NSVGPaint(address, null);
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

    public static byte ntype(long struct) {
        return MemoryUtil.memGetByte(struct + TYPE);
    }

    public static int ncolor(long struct) {
        return MemoryUtil.memGetInt(struct + COLOR);
    }

    public static NSVGGradient ngradient(long struct) {
        return NSVGGradient.create(MemoryUtil.memGetAddress(struct + GRADIENT));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGPaint$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGPaint$Buffer.class */
    public static class Buffer extends StructBuffer<NSVGPaint, Buffer> {
        private static final NSVGPaint ELEMENT_FACTORY = NSVGPaint.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NSVGPaint.SIZEOF);
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
        public NSVGPaint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("signed char")
        public byte type() {
            return NSVGPaint.ntype(address());
        }

        @NativeType("unsigned int")
        public int color() {
            return NSVGPaint.ncolor(address());
        }

        @NativeType("NSVGgradient *")
        public NSVGGradient gradient() {
            return NSVGPaint.ngradient(address());
        }
    }
}
