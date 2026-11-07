package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGGradientStop.class
 */
@NativeType("struct NSVGgradientStop")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGGradientStop.class */
public class NSVGGradientStop extends Struct<NSVGGradientStop> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COLOR;
    public static final int OFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COLOR = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    protected NSVGGradientStop(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NSVGGradientStop create(long address, ByteBuffer container) {
        return new NSVGGradientStop(address, container);
    }

    public NSVGGradientStop(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned int")
    public int color() {
        return ncolor(address());
    }

    public float offset() {
        return noffset(address());
    }

    public static NSVGGradientStop create(long address) {
        return new NSVGGradientStop(address, null);
    }

    public static NSVGGradientStop createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NSVGGradientStop(address, null);
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

    public static int ncolor(long struct) {
        return MemoryUtil.memGetInt(struct + COLOR);
    }

    public static float noffset(long struct) {
        return MemoryUtil.memGetFloat(struct + OFFSET);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGGradientStop$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NSVGGradientStop$Buffer.class */
    public static class Buffer extends StructBuffer<NSVGGradientStop, Buffer> {
        private static final NSVGGradientStop ELEMENT_FACTORY = NSVGGradientStop.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NSVGGradientStop.SIZEOF);
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
        public NSVGGradientStop getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned int")
        public int color() {
            return NSVGGradientStop.ncolor(address());
        }

        public float offset() {
            return NSVGGradientStop.noffset(address());
        }
    }
}
