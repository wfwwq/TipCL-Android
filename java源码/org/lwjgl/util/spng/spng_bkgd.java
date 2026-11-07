package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_bkgd")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_bkgd.class */
public class spng_bkgd extends Struct<spng_bkgd> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int GRAY;
    public static final int RED;
    public static final int GREEN;
    public static final int BLUE;
    public static final int PLTE_INDEX;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(2), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        GRAY = layout.offsetof(0);
        RED = layout.offsetof(1);
        GREEN = layout.offsetof(2);
        BLUE = layout.offsetof(3);
        PLTE_INDEX = layout.offsetof(4);
    }

    protected spng_bkgd(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_bkgd create(long address, ByteBuffer container) {
        return new spng_bkgd(address, container);
    }

    public spng_bkgd(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint16_t")
    public short gray() {
        return ngray(address());
    }

    @NativeType("uint16_t")
    public short red() {
        return nred(address());
    }

    @NativeType("uint16_t")
    public short green() {
        return ngreen(address());
    }

    @NativeType("uint16_t")
    public short blue() {
        return nblue(address());
    }

    @NativeType("uint16_t")
    public short plte_index() {
        return nplte_index(address());
    }

    public spng_bkgd gray(@NativeType("uint16_t") short value) {
        ngray(address(), value);
        return this;
    }

    public spng_bkgd red(@NativeType("uint16_t") short value) {
        nred(address(), value);
        return this;
    }

    public spng_bkgd green(@NativeType("uint16_t") short value) {
        ngreen(address(), value);
        return this;
    }

    public spng_bkgd blue(@NativeType("uint16_t") short value) {
        nblue(address(), value);
        return this;
    }

    public spng_bkgd plte_index(@NativeType("uint16_t") short value) {
        nplte_index(address(), value);
        return this;
    }

    public spng_bkgd set(short gray, short red, short green, short blue, short plte_index) {
        gray(gray);
        red(red);
        green(green);
        blue(blue);
        plte_index(plte_index);
        return this;
    }

    public spng_bkgd set(spng_bkgd src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_bkgd malloc() {
        return new spng_bkgd(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_bkgd calloc() {
        return new spng_bkgd(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_bkgd create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_bkgd(MemoryUtil.memAddress(container), container);
    }

    public static spng_bkgd create(long address) {
        return new spng_bkgd(address, null);
    }

    public static spng_bkgd createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_bkgd(address, null);
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

    public static spng_bkgd malloc(MemoryStack stack) {
        return new spng_bkgd(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_bkgd calloc(MemoryStack stack) {
        return new spng_bkgd(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short ngray(long struct) {
        return MemoryUtil.memGetShort(struct + GRAY);
    }

    public static short nred(long struct) {
        return MemoryUtil.memGetShort(struct + RED);
    }

    public static short ngreen(long struct) {
        return MemoryUtil.memGetShort(struct + GREEN);
    }

    public static short nblue(long struct) {
        return MemoryUtil.memGetShort(struct + BLUE);
    }

    public static short nplte_index(long struct) {
        return MemoryUtil.memGetShort(struct + PLTE_INDEX);
    }

    public static void ngray(long struct, short value) {
        MemoryUtil.memPutShort(struct + GRAY, value);
    }

    public static void nred(long struct, short value) {
        MemoryUtil.memPutShort(struct + RED, value);
    }

    public static void ngreen(long struct, short value) {
        MemoryUtil.memPutShort(struct + GREEN, value);
    }

    public static void nblue(long struct, short value) {
        MemoryUtil.memPutShort(struct + BLUE, value);
    }

    public static void nplte_index(long struct, short value) {
        MemoryUtil.memPutShort(struct + PLTE_INDEX, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_bkgd$Buffer.class */
    public static class Buffer extends StructBuffer<spng_bkgd, Buffer> implements NativeResource {
        private static final spng_bkgd ELEMENT_FACTORY = spng_bkgd.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_bkgd.SIZEOF);
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
        public spng_bkgd getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint16_t")
        public short gray() {
            return spng_bkgd.ngray(address());
        }

        @NativeType("uint16_t")
        public short red() {
            return spng_bkgd.nred(address());
        }

        @NativeType("uint16_t")
        public short green() {
            return spng_bkgd.ngreen(address());
        }

        @NativeType("uint16_t")
        public short blue() {
            return spng_bkgd.nblue(address());
        }

        @NativeType("uint16_t")
        public short plte_index() {
            return spng_bkgd.nplte_index(address());
        }

        public Buffer gray(@NativeType("uint16_t") short value) {
            spng_bkgd.ngray(address(), value);
            return this;
        }

        public Buffer red(@NativeType("uint16_t") short value) {
            spng_bkgd.nred(address(), value);
            return this;
        }

        public Buffer green(@NativeType("uint16_t") short value) {
            spng_bkgd.ngreen(address(), value);
            return this;
        }

        public Buffer blue(@NativeType("uint16_t") short value) {
            spng_bkgd.nblue(address(), value);
            return this;
        }

        public Buffer plte_index(@NativeType("uint16_t") short value) {
            spng_bkgd.nplte_index(address(), value);
            return this;
        }
    }
}
