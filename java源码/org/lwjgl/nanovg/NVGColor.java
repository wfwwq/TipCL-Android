package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGColor.class
 */
@NativeType("struct NVGcolor")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGColor.class */
public class NVGColor extends Struct<NVGColor> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RGBA;
    public static final int R;
    public static final int G;
    public static final int B;
    public static final int A;

    static {
        Struct.Layout layout = __struct(__union(__array(4, 4), __struct(__member(4), __member(4), __member(4), __member(4))));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RGBA = layout.offsetof(1);
        R = layout.offsetof(3);
        G = layout.offsetof(4);
        B = layout.offsetof(5);
        A = layout.offsetof(6);
    }

    protected NVGColor(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public NVGColor create(long address, ByteBuffer container) {
        return new NVGColor(address, container);
    }

    public NVGColor(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("float[4]")
    public FloatBuffer rgba() {
        return nrgba(address());
    }

    public float rgba(int index) {
        return nrgba(address(), index);
    }

    public float r() {
        return nr(address());
    }

    public float g() {
        return ng(address());
    }

    public float b() {
        return nb(address());
    }

    public float a() {
        return na(address());
    }

    public NVGColor rgba(@NativeType("float[4]") FloatBuffer value) {
        nrgba(address(), value);
        return this;
    }

    public NVGColor rgba(int index, float value) {
        nrgba(address(), index, value);
        return this;
    }

    public NVGColor r(float value) {
        nr(address(), value);
        return this;
    }

    public NVGColor g(float value) {
        ng(address(), value);
        return this;
    }

    public NVGColor b(float value) {
        nb(address(), value);
        return this;
    }

    public NVGColor a(float value) {
        na(address(), value);
        return this;
    }

    public NVGColor set(NVGColor src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static NVGColor malloc() {
        return new NVGColor(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGColor calloc() {
        return new NVGColor(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGColor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGColor(MemoryUtil.memAddress(container), container);
    }

    public static NVGColor create(long address) {
        return new NVGColor(address, null);
    }

    public static NVGColor createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new NVGColor(address, null);
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

    public static NVGColor malloc(MemoryStack stack) {
        return new NVGColor(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGColor calloc(MemoryStack stack) {
        return new NVGColor(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FloatBuffer nrgba(long struct) {
        return MemoryUtil.memFloatBuffer(struct + RGBA, 4);
    }

    public static float nrgba(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + RGBA + (Checks.check(index, 4) * 4));
    }

    public static float nr(long struct) {
        return MemoryUtil.memGetFloat(struct + R);
    }

    public static float ng(long struct) {
        return MemoryUtil.memGetFloat(struct + G);
    }

    public static float nb(long struct) {
        return MemoryUtil.memGetFloat(struct + B);
    }

    public static float na(long struct) {
        return MemoryUtil.memGetFloat(struct + A);
    }

    public static void nrgba(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RGBA, value.remaining() * 4);
    }

    public static void nrgba(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + RGBA + (Checks.check(index, 4) * 4), value);
    }

    public static void nr(long struct, float value) {
        MemoryUtil.memPutFloat(struct + R, value);
    }

    public static void ng(long struct, float value) {
        MemoryUtil.memPutFloat(struct + G, value);
    }

    public static void nb(long struct, float value) {
        MemoryUtil.memPutFloat(struct + B, value);
    }

    public static void na(long struct, float value) {
        MemoryUtil.memPutFloat(struct + A, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGColor$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NVGColor$Buffer.class */
    public static class Buffer extends StructBuffer<NVGColor, Buffer> implements NativeResource {
        private static final NVGColor ELEMENT_FACTORY = NVGColor.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / NVGColor.SIZEOF);
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
        public NVGColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("float[4]")
        public FloatBuffer rgba() {
            return NVGColor.nrgba(address());
        }

        public float rgba(int index) {
            return NVGColor.nrgba(address(), index);
        }

        public float r() {
            return NVGColor.nr(address());
        }

        public float g() {
            return NVGColor.ng(address());
        }

        public float b() {
            return NVGColor.nb(address());
        }

        public float a() {
            return NVGColor.na(address());
        }

        public Buffer rgba(@NativeType("float[4]") FloatBuffer value) {
            NVGColor.nrgba(address(), value);
            return this;
        }

        public Buffer rgba(int index, float value) {
            NVGColor.nrgba(address(), index, value);
            return this;
        }

        public Buffer r(float value) {
            NVGColor.nr(address(), value);
            return this;
        }

        public Buffer g(float value) {
            NVGColor.ng(address(), value);
            return this;
        }

        public Buffer b(float value) {
            NVGColor.nb(address(), value);
            return this;
        }

        public Buffer a(float value) {
            NVGColor.na(address(), value);
            return this;
        }
    }
}
