package org.lwjgl.system.linux;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XVisualInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XVisualInfo.class */
public class XVisualInfo extends Struct<XVisualInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VISUAL;
    public static final int VISUALID;
    public static final int SCREEN;
    public static final int DEPTH;
    public static final int CLASS;
    public static final int RED_MASK;
    public static final int GREEN_MASK;
    public static final int BLUE_MASK;
    public static final int COLORMAP_SIZE;
    public static final int BITS_PER_RGB;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(CLONG_SIZE), __member(4), __member(4), __member(4), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VISUAL = layout.offsetof(0);
        VISUALID = layout.offsetof(1);
        SCREEN = layout.offsetof(2);
        DEPTH = layout.offsetof(3);
        CLASS = layout.offsetof(4);
        RED_MASK = layout.offsetof(5);
        GREEN_MASK = layout.offsetof(6);
        BLUE_MASK = layout.offsetof(7);
        COLORMAP_SIZE = layout.offsetof(8);
        BITS_PER_RGB = layout.offsetof(9);
    }

    protected XVisualInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XVisualInfo create(long address, ByteBuffer container) {
        return new XVisualInfo(address, container);
    }

    public XVisualInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Visual *")
    public Visual visual() {
        return nvisual(address());
    }

    @NativeType("VisualID")
    public long visualid() {
        return nvisualid(address());
    }

    public int screen() {
        return nscreen(address());
    }

    public int depth() {
        return ndepth(address());
    }

    public int class$() {
        return nclass$(address());
    }

    @NativeType("unsigned long")
    public long red_mask() {
        return nred_mask(address());
    }

    @NativeType("unsigned long")
    public long green_mask() {
        return ngreen_mask(address());
    }

    @NativeType("unsigned long")
    public long blue_mask() {
        return nblue_mask(address());
    }

    public int colormap_size() {
        return ncolormap_size(address());
    }

    public int bits_per_rgb() {
        return nbits_per_rgb(address());
    }

    public XVisualInfo visual(@NativeType("Visual *") Visual value) {
        nvisual(address(), value);
        return this;
    }

    public XVisualInfo visualid(@NativeType("VisualID") long value) {
        nvisualid(address(), value);
        return this;
    }

    public XVisualInfo screen(int value) {
        nscreen(address(), value);
        return this;
    }

    public XVisualInfo depth(int value) {
        ndepth(address(), value);
        return this;
    }

    public XVisualInfo class$(int value) {
        nclass$(address(), value);
        return this;
    }

    public XVisualInfo red_mask(@NativeType("unsigned long") long value) {
        nred_mask(address(), value);
        return this;
    }

    public XVisualInfo green_mask(@NativeType("unsigned long") long value) {
        ngreen_mask(address(), value);
        return this;
    }

    public XVisualInfo blue_mask(@NativeType("unsigned long") long value) {
        nblue_mask(address(), value);
        return this;
    }

    public XVisualInfo colormap_size(int value) {
        ncolormap_size(address(), value);
        return this;
    }

    public XVisualInfo bits_per_rgb(int value) {
        nbits_per_rgb(address(), value);
        return this;
    }

    public XVisualInfo set(Visual visual, long visualid, int screen, int depth, int class$, long red_mask, long green_mask, long blue_mask, int colormap_size, int bits_per_rgb) {
        visual(visual);
        visualid(visualid);
        screen(screen);
        depth(depth);
        class$(class$);
        red_mask(red_mask);
        green_mask(green_mask);
        blue_mask(blue_mask);
        colormap_size(colormap_size);
        bits_per_rgb(bits_per_rgb);
        return this;
    }

    public XVisualInfo set(XVisualInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XVisualInfo malloc() {
        return new XVisualInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XVisualInfo calloc() {
        return new XVisualInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XVisualInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XVisualInfo(MemoryUtil.memAddress(container), container);
    }

    public static XVisualInfo create(long address) {
        return new XVisualInfo(address, null);
    }

    public static XVisualInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XVisualInfo(address, null);
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

    public static XVisualInfo malloc(MemoryStack stack) {
        return new XVisualInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XVisualInfo calloc(MemoryStack stack) {
        return new XVisualInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static Visual nvisual(long struct) {
        return Visual.create(MemoryUtil.memGetAddress(struct + VISUAL));
    }

    public static long nvisualid(long struct) {
        return MemoryUtil.memGetCLong(struct + VISUALID);
    }

    public static int nscreen(long struct) {
        return MemoryUtil.memGetInt(struct + SCREEN);
    }

    public static int ndepth(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTH);
    }

    public static int nclass$(long struct) {
        return MemoryUtil.memGetInt(struct + CLASS);
    }

    public static long nred_mask(long struct) {
        return MemoryUtil.memGetCLong(struct + RED_MASK);
    }

    public static long ngreen_mask(long struct) {
        return MemoryUtil.memGetCLong(struct + GREEN_MASK);
    }

    public static long nblue_mask(long struct) {
        return MemoryUtil.memGetCLong(struct + BLUE_MASK);
    }

    public static int ncolormap_size(long struct) {
        return MemoryUtil.memGetInt(struct + COLORMAP_SIZE);
    }

    public static int nbits_per_rgb(long struct) {
        return MemoryUtil.memGetInt(struct + BITS_PER_RGB);
    }

    public static void nvisual(long struct, Visual value) {
        MemoryUtil.memPutAddress(struct + VISUAL, value.address());
    }

    public static void nvisualid(long struct, long value) {
        MemoryUtil.memPutCLong(struct + VISUALID, value);
    }

    public static void nscreen(long struct, int value) {
        MemoryUtil.memPutInt(struct + SCREEN, value);
    }

    public static void ndepth(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTH, value);
    }

    public static void nclass$(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLASS, value);
    }

    public static void nred_mask(long struct, long value) {
        MemoryUtil.memPutCLong(struct + RED_MASK, value);
    }

    public static void ngreen_mask(long struct, long value) {
        MemoryUtil.memPutCLong(struct + GREEN_MASK, value);
    }

    public static void nblue_mask(long struct, long value) {
        MemoryUtil.memPutCLong(struct + BLUE_MASK, value);
    }

    public static void ncolormap_size(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORMAP_SIZE, value);
    }

    public static void nbits_per_rgb(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITS_PER_RGB, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + VISUAL));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XVisualInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XVisualInfo$Buffer.class */
    public static class Buffer extends StructBuffer<XVisualInfo, Buffer> implements NativeResource {
        private static final XVisualInfo ELEMENT_FACTORY = XVisualInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XVisualInfo.SIZEOF);
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
        public XVisualInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Visual *")
        public Visual visual() {
            return XVisualInfo.nvisual(address());
        }

        @NativeType("VisualID")
        public long visualid() {
            return XVisualInfo.nvisualid(address());
        }

        public int screen() {
            return XVisualInfo.nscreen(address());
        }

        public int depth() {
            return XVisualInfo.ndepth(address());
        }

        public int class$() {
            return XVisualInfo.nclass$(address());
        }

        @NativeType("unsigned long")
        public long red_mask() {
            return XVisualInfo.nred_mask(address());
        }

        @NativeType("unsigned long")
        public long green_mask() {
            return XVisualInfo.ngreen_mask(address());
        }

        @NativeType("unsigned long")
        public long blue_mask() {
            return XVisualInfo.nblue_mask(address());
        }

        public int colormap_size() {
            return XVisualInfo.ncolormap_size(address());
        }

        public int bits_per_rgb() {
            return XVisualInfo.nbits_per_rgb(address());
        }

        public Buffer visual(@NativeType("Visual *") Visual value) {
            XVisualInfo.nvisual(address(), value);
            return this;
        }

        public Buffer visualid(@NativeType("VisualID") long value) {
            XVisualInfo.nvisualid(address(), value);
            return this;
        }

        public Buffer screen(int value) {
            XVisualInfo.nscreen(address(), value);
            return this;
        }

        public Buffer depth(int value) {
            XVisualInfo.ndepth(address(), value);
            return this;
        }

        public Buffer class$(int value) {
            XVisualInfo.nclass$(address(), value);
            return this;
        }

        public Buffer red_mask(@NativeType("unsigned long") long value) {
            XVisualInfo.nred_mask(address(), value);
            return this;
        }

        public Buffer green_mask(@NativeType("unsigned long") long value) {
            XVisualInfo.ngreen_mask(address(), value);
            return this;
        }

        public Buffer blue_mask(@NativeType("unsigned long") long value) {
            XVisualInfo.nblue_mask(address(), value);
            return this;
        }

        public Buffer colormap_size(int value) {
            XVisualInfo.ncolormap_size(address(), value);
            return this;
        }

        public Buffer bits_per_rgb(int value) {
            XVisualInfo.nbits_per_rgb(address(), value);
            return this;
        }
    }
}
