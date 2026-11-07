package org.lwjgl.stb;

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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTBitmap.class
 */
@NativeType("struct stbtt__bitmap")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTBitmap.class */
public class STBTTBitmap extends Struct<STBTTBitmap> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int W;
    public static final int H;
    public static final int STRIDE;
    public static final int PIXELS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        W = layout.offsetof(0);
        H = layout.offsetof(1);
        STRIDE = layout.offsetof(2);
        PIXELS = layout.offsetof(3);
    }

    protected STBTTBitmap(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBTTBitmap create(long address, ByteBuffer container) {
        return new STBTTBitmap(address, container);
    }

    public STBTTBitmap(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int w() {
        return nw(address());
    }

    public int h() {
        return nh(address());
    }

    public int stride() {
        return nstride(address());
    }

    @NativeType("unsigned char *")
    public ByteBuffer pixels(int capacity) {
        return npixels(address(), capacity);
    }

    public STBTTBitmap w(int value) {
        nw(address(), value);
        return this;
    }

    public STBTTBitmap h(int value) {
        nh(address(), value);
        return this;
    }

    public STBTTBitmap stride(int value) {
        nstride(address(), value);
        return this;
    }

    public STBTTBitmap pixels(@NativeType("unsigned char *") ByteBuffer value) {
        npixels(address(), value);
        return this;
    }

    public STBTTBitmap set(int w, int h, int stride, ByteBuffer pixels) {
        w(w);
        h(h);
        stride(stride);
        pixels(pixels);
        return this;
    }

    public STBTTBitmap set(STBTTBitmap src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static STBTTBitmap malloc() {
        return new STBTTBitmap(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBTTBitmap calloc() {
        return new STBTTBitmap(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBTTBitmap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBTTBitmap(MemoryUtil.memAddress(container), container);
    }

    public static STBTTBitmap create(long address) {
        return new STBTTBitmap(address, null);
    }

    public static STBTTBitmap createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBTTBitmap(address, null);
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

    public static STBTTBitmap malloc(MemoryStack stack) {
        return new STBTTBitmap(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBTTBitmap calloc(MemoryStack stack) {
        return new STBTTBitmap(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nw(long struct) {
        return MemoryUtil.memGetInt(struct + W);
    }

    public static int nh(long struct) {
        return MemoryUtil.memGetInt(struct + H);
    }

    public static int nstride(long struct) {
        return MemoryUtil.memGetInt(struct + STRIDE);
    }

    public static ByteBuffer npixels(long struct, int capacity) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PIXELS), capacity);
    }

    public static void nw(long struct, int value) {
        MemoryUtil.memPutInt(struct + W, value);
    }

    public static void nh(long struct, int value) {
        MemoryUtil.memPutInt(struct + H, value);
    }

    public static void nstride(long struct, int value) {
        MemoryUtil.memPutInt(struct + STRIDE, value);
    }

    public static void npixels(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PIXELS, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PIXELS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTBitmap$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTBitmap$Buffer.class */
    public static class Buffer extends StructBuffer<STBTTBitmap, Buffer> implements NativeResource {
        private static final STBTTBitmap ELEMENT_FACTORY = STBTTBitmap.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBTTBitmap.SIZEOF);
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
        public STBTTBitmap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int w() {
            return STBTTBitmap.nw(address());
        }

        public int h() {
            return STBTTBitmap.nh(address());
        }

        public int stride() {
            return STBTTBitmap.nstride(address());
        }

        @NativeType("unsigned char *")
        public ByteBuffer pixels(int capacity) {
            return STBTTBitmap.npixels(address(), capacity);
        }

        public Buffer w(int value) {
            STBTTBitmap.nw(address(), value);
            return this;
        }

        public Buffer h(int value) {
            STBTTBitmap.nh(address(), value);
            return this;
        }

        public Buffer stride(int value) {
            STBTTBitmap.nstride(address(), value);
            return this;
        }

        public Buffer pixels(@NativeType("unsigned char *") ByteBuffer value) {
            STBTTBitmap.npixels(address(), value);
            return this;
        }
    }
}
