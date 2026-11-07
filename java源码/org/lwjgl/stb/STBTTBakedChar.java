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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTBakedChar.class
 */
@NativeType("struct stbtt_bakedchar")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTBakedChar.class */
public class STBTTBakedChar extends Struct<STBTTBakedChar> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X0;
    public static final int Y0;
    public static final int X1;
    public static final int Y1;
    public static final int XOFF;
    public static final int YOFF;
    public static final int XADVANCE;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(2), __member(2), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X0 = layout.offsetof(0);
        Y0 = layout.offsetof(1);
        X1 = layout.offsetof(2);
        Y1 = layout.offsetof(3);
        XOFF = layout.offsetof(4);
        YOFF = layout.offsetof(5);
        XADVANCE = layout.offsetof(6);
    }

    protected STBTTBakedChar(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBTTBakedChar create(long address, ByteBuffer container) {
        return new STBTTBakedChar(address, container);
    }

    public STBTTBakedChar(ByteBuffer container) {
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

    public static STBTTBakedChar malloc() {
        return new STBTTBakedChar(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBTTBakedChar calloc() {
        return new STBTTBakedChar(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBTTBakedChar create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBTTBakedChar(MemoryUtil.memAddress(container), container);
    }

    public static STBTTBakedChar create(long address) {
        return new STBTTBakedChar(address, null);
    }

    public static STBTTBakedChar createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBTTBakedChar(address, null);
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

    public static STBTTBakedChar malloc(MemoryStack stack) {
        return new STBTTBakedChar(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBTTBakedChar calloc(MemoryStack stack) {
        return new STBTTBakedChar(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTBakedChar$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTBakedChar$Buffer.class */
    public static class Buffer extends StructBuffer<STBTTBakedChar, Buffer> implements NativeResource {
        private static final STBTTBakedChar ELEMENT_FACTORY = STBTTBakedChar.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBTTBakedChar.SIZEOF);
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
        public STBTTBakedChar getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned short")
        public short x0() {
            return STBTTBakedChar.nx0(address());
        }

        @NativeType("unsigned short")
        public short y0() {
            return STBTTBakedChar.ny0(address());
        }

        @NativeType("unsigned short")
        public short x1() {
            return STBTTBakedChar.nx1(address());
        }

        @NativeType("unsigned short")
        public short y1() {
            return STBTTBakedChar.ny1(address());
        }

        public float xoff() {
            return STBTTBakedChar.nxoff(address());
        }

        public float yoff() {
            return STBTTBakedChar.nyoff(address());
        }

        public float xadvance() {
            return STBTTBakedChar.nxadvance(address());
        }
    }
}
