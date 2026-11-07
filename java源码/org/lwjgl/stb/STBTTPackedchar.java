package org.lwjgl.stb;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackedchar.class
 */
@NativeType("struct stbtt_packedchar")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackedchar.class */
public class STBTTPackedchar extends Struct<STBTTPackedchar> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X0;
    public static final int Y0;
    public static final int X1;
    public static final int Y1;
    public static final int XOFF;
    public static final int YOFF;
    public static final int XADVANCE;
    public static final int XOFF2;
    public static final int YOFF2;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(2), __member(2), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X0 = layout.offsetof(0);
        Y0 = layout.offsetof(1);
        X1 = layout.offsetof(2);
        Y1 = layout.offsetof(3);
        XOFF = layout.offsetof(4);
        YOFF = layout.offsetof(5);
        XADVANCE = layout.offsetof(6);
        XOFF2 = layout.offsetof(7);
        YOFF2 = layout.offsetof(8);
    }

    protected STBTTPackedchar(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBTTPackedchar create(long address, ByteBuffer container) {
        return new STBTTPackedchar(address, container);
    }

    public STBTTPackedchar(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned short")
    public short x0() {
        return nx0(address());
    }

    @NativeType("unsigned short")
    public short y0() {
        return ny0(address());
    }

    @NativeType("unsigned short")
    public short x1() {
        return nx1(address());
    }

    @NativeType("unsigned short")
    public short y1() {
        return ny1(address());
    }

    public float xoff() {
        return nxoff(address());
    }

    public float yoff() {
        return nyoff(address());
    }

    public float xadvance() {
        return nxadvance(address());
    }

    public float xoff2() {
        return nxoff2(address());
    }

    public float yoff2() {
        return nyoff2(address());
    }

    public STBTTPackedchar x0(@NativeType("unsigned short") short value) {
        nx0(address(), value);
        return this;
    }

    public STBTTPackedchar y0(@NativeType("unsigned short") short value) {
        ny0(address(), value);
        return this;
    }

    public STBTTPackedchar x1(@NativeType("unsigned short") short value) {
        nx1(address(), value);
        return this;
    }

    public STBTTPackedchar y1(@NativeType("unsigned short") short value) {
        ny1(address(), value);
        return this;
    }

    public STBTTPackedchar xoff(float value) {
        nxoff(address(), value);
        return this;
    }

    public STBTTPackedchar yoff(float value) {
        nyoff(address(), value);
        return this;
    }

    public STBTTPackedchar xadvance(float value) {
        nxadvance(address(), value);
        return this;
    }

    public STBTTPackedchar xoff2(float value) {
        nxoff2(address(), value);
        return this;
    }

    public STBTTPackedchar yoff2(float value) {
        nyoff2(address(), value);
        return this;
    }

    public STBTTPackedchar set(short x0, short y0, short x1, short y1, float xoff, float yoff, float xadvance, float xoff2, float yoff2) {
        x0(x0);
        y0(y0);
        x1(x1);
        y1(y1);
        xoff(xoff);
        yoff(yoff);
        xadvance(xadvance);
        xoff2(xoff2);
        yoff2(yoff2);
        return this;
    }

    public STBTTPackedchar set(STBTTPackedchar src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static STBTTPackedchar malloc() {
        return new STBTTPackedchar(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBTTPackedchar calloc() {
        return new STBTTPackedchar(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBTTPackedchar create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBTTPackedchar(MemoryUtil.memAddress(container), container);
    }

    public static STBTTPackedchar create(long address) {
        return new STBTTPackedchar(address, null);
    }

    public static STBTTPackedchar createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBTTPackedchar(address, null);
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

    public static STBTTPackedchar malloc(MemoryStack stack) {
        return new STBTTPackedchar(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBTTPackedchar calloc(MemoryStack stack) {
        return new STBTTPackedchar(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nx0(long struct) {
        return MemoryUtil.memGetShort(struct + X0);
    }

    public static short ny0(long struct) {
        return MemoryUtil.memGetShort(struct + Y0);
    }

    public static short nx1(long struct) {
        return MemoryUtil.memGetShort(struct + X1);
    }

    public static short ny1(long struct) {
        return MemoryUtil.memGetShort(struct + Y1);
    }

    public static float nxoff(long struct) {
        return MemoryUtil.memGetFloat(struct + XOFF);
    }

    public static float nyoff(long struct) {
        return MemoryUtil.memGetFloat(struct + YOFF);
    }

    public static float nxadvance(long struct) {
        return MemoryUtil.memGetFloat(struct + XADVANCE);
    }

    public static float nxoff2(long struct) {
        return MemoryUtil.memGetFloat(struct + XOFF2);
    }

    public static float nyoff2(long struct) {
        return MemoryUtil.memGetFloat(struct + YOFF2);
    }

    public static void nx0(long struct, short value) {
        MemoryUtil.memPutShort(struct + X0, value);
    }

    public static void ny0(long struct, short value) {
        MemoryUtil.memPutShort(struct + Y0, value);
    }

    public static void nx1(long struct, short value) {
        MemoryUtil.memPutShort(struct + X1, value);
    }

    public static void ny1(long struct, short value) {
        MemoryUtil.memPutShort(struct + Y1, value);
    }

    public static void nxoff(long struct, float value) {
        MemoryUtil.memPutFloat(struct + XOFF, value);
    }

    public static void nyoff(long struct, float value) {
        MemoryUtil.memPutFloat(struct + YOFF, value);
    }

    public static void nxadvance(long struct, float value) {
        MemoryUtil.memPutFloat(struct + XADVANCE, value);
    }

    public static void nxoff2(long struct, float value) {
        MemoryUtil.memPutFloat(struct + XOFF2, value);
    }

    public static void nyoff2(long struct, float value) {
        MemoryUtil.memPutFloat(struct + YOFF2, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackedchar$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackedchar$Buffer.class */
    public static class Buffer extends StructBuffer<STBTTPackedchar, Buffer> implements NativeResource {
        private static final STBTTPackedchar ELEMENT_FACTORY = STBTTPackedchar.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBTTPackedchar.SIZEOF);
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
        public STBTTPackedchar getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned short")
        public short x0() {
            return STBTTPackedchar.nx0(address());
        }

        @NativeType("unsigned short")
        public short y0() {
            return STBTTPackedchar.ny0(address());
        }

        @NativeType("unsigned short")
        public short x1() {
            return STBTTPackedchar.nx1(address());
        }

        @NativeType("unsigned short")
        public short y1() {
            return STBTTPackedchar.ny1(address());
        }

        public float xoff() {
            return STBTTPackedchar.nxoff(address());
        }

        public float yoff() {
            return STBTTPackedchar.nyoff(address());
        }

        public float xadvance() {
            return STBTTPackedchar.nxadvance(address());
        }

        public float xoff2() {
            return STBTTPackedchar.nxoff2(address());
        }

        public float yoff2() {
            return STBTTPackedchar.nyoff2(address());
        }

        public Buffer x0(@NativeType("unsigned short") short value) {
            STBTTPackedchar.nx0(address(), value);
            return this;
        }

        public Buffer y0(@NativeType("unsigned short") short value) {
            STBTTPackedchar.ny0(address(), value);
            return this;
        }

        public Buffer x1(@NativeType("unsigned short") short value) {
            STBTTPackedchar.nx1(address(), value);
            return this;
        }

        public Buffer y1(@NativeType("unsigned short") short value) {
            STBTTPackedchar.ny1(address(), value);
            return this;
        }

        public Buffer xoff(float value) {
            STBTTPackedchar.nxoff(address(), value);
            return this;
        }

        public Buffer yoff(float value) {
            STBTTPackedchar.nyoff(address(), value);
            return this;
        }

        public Buffer xadvance(float value) {
            STBTTPackedchar.nxadvance(address(), value);
            return this;
        }

        public Buffer xoff2(float value) {
            STBTTPackedchar.nxoff2(address(), value);
            return this;
        }

        public Buffer yoff2(float value) {
            STBTTPackedchar.nyoff2(address(), value);
            return this;
        }
    }
}
