package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGPaint.class
 */
@NativeType("struct NVGpaint")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGPaint.class */
public class NVGPaint extends Struct<NVGPaint> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int XFORM;
    public static final int EXTENT;
    public static final int RADIUS;
    public static final int FEATHER;
    public static final int INNERCOLOR;
    public static final int OUTERCOLOR;
    public static final int IMAGE;

    static {
        Struct.Layout layout = __struct(__array(4, 6), __array(4, 2), __member(4), __member(4), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        XFORM = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
        RADIUS = layout.offsetof(2);
        FEATHER = layout.offsetof(3);
        INNERCOLOR = layout.offsetof(4);
        OUTERCOLOR = layout.offsetof(5);
        IMAGE = layout.offsetof(6);
    }

    protected NVGPaint(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NVGPaint create(long address, ByteBuffer container) {
        return new NVGPaint(address, container);
    }

    public NVGPaint(ByteBuffer container) {
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

    @NativeType("float[2]")
    public FloatBuffer extent() {
        return nextent(address());
    }

    public float extent(int index) {
        return nextent(address(), index);
    }

    public float radius() {
        return nradius(address());
    }

    public float feather() {
        return nfeather(address());
    }

    @NativeType("NVGcolor")
    public NVGColor innerColor() {
        return ninnerColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor outerColor() {
        return nouterColor(address());
    }

    public int image() {
        return nimage(address());
    }

    public NVGPaint xform(@NativeType("float[6]") FloatBuffer value) {
        nxform(address(), value);
        return this;
    }

    public NVGPaint xform(int index, float value) {
        nxform(address(), index, value);
        return this;
    }

    public NVGPaint extent(@NativeType("float[2]") FloatBuffer value) {
        nextent(address(), value);
        return this;
    }

    public NVGPaint extent(int index, float value) {
        nextent(address(), index, value);
        return this;
    }

    public NVGPaint radius(float value) {
        nradius(address(), value);
        return this;
    }

    public NVGPaint feather(float value) {
        nfeather(address(), value);
        return this;
    }

    public NVGPaint innerColor(@NativeType("NVGcolor") NVGColor value) {
        ninnerColor(address(), value);
        return this;
    }

    public NVGPaint innerColor(Consumer<NVGColor> consumer) {
        consumer.accept(innerColor());
        return this;
    }

    public NVGPaint outerColor(@NativeType("NVGcolor") NVGColor value) {
        nouterColor(address(), value);
        return this;
    }

    public NVGPaint outerColor(Consumer<NVGColor> consumer) {
        consumer.accept(outerColor());
        return this;
    }

    public NVGPaint image(int value) {
        nimage(address(), value);
        return this;
    }

    public NVGPaint set(FloatBuffer xform, FloatBuffer extent, float radius, float feather, NVGColor innerColor, NVGColor outerColor, int image) {
        xform(xform);
        extent(extent);
        radius(radius);
        feather(feather);
        innerColor(innerColor);
        outerColor(outerColor);
        image(image);
        return this;
    }

    public NVGPaint set(NVGPaint src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static NVGPaint malloc() {
        return new NVGPaint(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGPaint calloc() {
        return new NVGPaint(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGPaint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGPaint(MemoryUtil.memAddress(container), container);
    }

    public static NVGPaint create(long address) {
        return new NVGPaint(address, null);
    }

    public static NVGPaint createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NVGPaint(address, null);
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

    public static NVGPaint malloc(MemoryStack stack) {
        return new NVGPaint(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGPaint calloc(MemoryStack stack) {
        return new NVGPaint(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FloatBuffer nxform(long struct) {
        return MemoryUtil.memFloatBuffer(struct + XFORM, 6);
    }

    public static float nxform(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + XFORM + (Checks.check(index, 6) * 4));
    }

    public static FloatBuffer nextent(long struct) {
        return MemoryUtil.memFloatBuffer(struct + EXTENT, 2);
    }

    public static float nextent(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + EXTENT + (Checks.check(index, 2) * 4));
    }

    public static float nradius(long struct) {
        return MemoryUtil.memGetFloat(struct + RADIUS);
    }

    public static float nfeather(long struct) {
        return MemoryUtil.memGetFloat(struct + FEATHER);
    }

    public static NVGColor ninnerColor(long struct) {
        return NVGColor.create(struct + INNERCOLOR);
    }

    public static NVGColor nouterColor(long struct) {
        return NVGColor.create(struct + OUTERCOLOR);
    }

    public static int nimage(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGE);
    }

    public static void nxform(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 6);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + XFORM, value.remaining() * 4);
    }

    public static void nxform(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + XFORM + (Checks.check(index, 6) * 4), value);
    }

    public static void nextent(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + EXTENT, value.remaining() * 4);
    }

    public static void nextent(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + EXTENT + (Checks.check(index, 2) * 4), value);
    }

    public static void nradius(long struct, float value) {
        MemoryUtil.memPutFloat(struct + RADIUS, value);
    }

    public static void nfeather(long struct, float value) {
        MemoryUtil.memPutFloat(struct + FEATHER, value);
    }

    public static void ninnerColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + INNERCOLOR, NVGColor.SIZEOF);
    }

    public static void nouterColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + OUTERCOLOR, NVGColor.SIZEOF);
    }

    public static void nimage(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGPaint$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGPaint$Buffer.class */
    public static class Buffer extends StructBuffer<NVGPaint, Buffer> implements NativeResource {
        private static final NVGPaint ELEMENT_FACTORY = NVGPaint.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NVGPaint.SIZEOF);
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
        public NVGPaint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("float[6]")
        public FloatBuffer xform() {
            return NVGPaint.nxform(address());
        }

        public float xform(int index) {
            return NVGPaint.nxform(address(), index);
        }

        @NativeType("float[2]")
        public FloatBuffer extent() {
            return NVGPaint.nextent(address());
        }

        public float extent(int index) {
            return NVGPaint.nextent(address(), index);
        }

        public float radius() {
            return NVGPaint.nradius(address());
        }

        public float feather() {
            return NVGPaint.nfeather(address());
        }

        @NativeType("NVGcolor")
        public NVGColor innerColor() {
            return NVGPaint.ninnerColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor outerColor() {
            return NVGPaint.nouterColor(address());
        }

        public int image() {
            return NVGPaint.nimage(address());
        }

        public Buffer xform(@NativeType("float[6]") FloatBuffer value) {
            NVGPaint.nxform(address(), value);
            return this;
        }

        public Buffer xform(int index, float value) {
            NVGPaint.nxform(address(), index, value);
            return this;
        }

        public Buffer extent(@NativeType("float[2]") FloatBuffer value) {
            NVGPaint.nextent(address(), value);
            return this;
        }

        public Buffer extent(int index, float value) {
            NVGPaint.nextent(address(), index, value);
            return this;
        }

        public Buffer radius(float value) {
            NVGPaint.nradius(address(), value);
            return this;
        }

        public Buffer feather(float value) {
            NVGPaint.nfeather(address(), value);
            return this;
        }

        public Buffer innerColor(@NativeType("NVGcolor") NVGColor value) {
            NVGPaint.ninnerColor(address(), value);
            return this;
        }

        public Buffer innerColor(Consumer<NVGColor> consumer) {
            consumer.accept(innerColor());
            return this;
        }

        public Buffer outerColor(@NativeType("NVGcolor") NVGColor value) {
            NVGPaint.nouterColor(address(), value);
            return this;
        }

        public Buffer outerColor(Consumer<NVGColor> consumer) {
            consumer.accept(outerColor());
            return this;
        }

        public Buffer image(int value) {
            NVGPaint.nimage(address(), value);
            return this;
        }
    }
}
