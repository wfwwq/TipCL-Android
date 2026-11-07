package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGImage.class
 */
@NativeType("struct NSVGimage")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGImage.class */
public class NSVGImage extends Struct<NSVGImage> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int SHAPES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        SHAPES = layout.offsetof(2);
    }

    protected NSVGImage(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NSVGImage create(long address, ByteBuffer container) {
        return new NSVGImage(address, container);
    }

    public NSVGImage(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float width() {
        return nwidth(address());
    }

    public float height() {
        return nheight(address());
    }

    @NativeType("NSVGshape *")
    public NSVGShape shapes() {
        return nshapes(address());
    }

    public static NSVGImage create(long address) {
        return new NSVGImage(address, null);
    }

    public static NSVGImage createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NSVGImage(address, null);
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

    public static float nwidth(long struct) {
        return MemoryUtil.memGetFloat(struct + WIDTH);
    }

    public static float nheight(long struct) {
        return MemoryUtil.memGetFloat(struct + HEIGHT);
    }

    public static NSVGShape nshapes(long struct) {
        return NSVGShape.create(MemoryUtil.memGetAddress(struct + SHAPES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGImage$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGImage$Buffer.class */
    public static class Buffer extends StructBuffer<NSVGImage, Buffer> {
        private static final NSVGImage ELEMENT_FACTORY = NSVGImage.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NSVGImage.SIZEOF);
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
        public NSVGImage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float width() {
            return NSVGImage.nwidth(address());
        }

        public float height() {
            return NSVGImage.nheight(address());
        }

        @NativeType("NSVGshape *")
        public NSVGShape shapes() {
            return NSVGImage.nshapes(address());
        }
    }
}
