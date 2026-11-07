package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_trns")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_trns.class */
public class spng_trns extends Struct<spng_trns> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int GRAY;
    public static final int RED;
    public static final int GREEN;
    public static final int BLUE;
    public static final int N_TYPE3_ENTRIES;
    public static final int TYPE3_ALPHA;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(2), __member(2), __member(4), __array(1, 256));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        GRAY = layout.offsetof(0);
        RED = layout.offsetof(1);
        GREEN = layout.offsetof(2);
        BLUE = layout.offsetof(3);
        N_TYPE3_ENTRIES = layout.offsetof(4);
        TYPE3_ALPHA = layout.offsetof(5);
    }

    protected spng_trns(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_trns create(long address, ByteBuffer container) {
        return new spng_trns(address, container);
    }

    public spng_trns(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int n_type3_entries() {
        return nn_type3_entries(address());
    }

    @NativeType("uint8_t[256]")
    public ByteBuffer type3_alpha() {
        return ntype3_alpha(address());
    }

    @NativeType("uint8_t")
    public byte type3_alpha(int index) {
        return ntype3_alpha(address(), index);
    }

    public spng_trns gray(@NativeType("uint16_t") short value) {
        ngray(address(), value);
        return this;
    }

    public spng_trns red(@NativeType("uint16_t") short value) {
        nred(address(), value);
        return this;
    }

    public spng_trns green(@NativeType("uint16_t") short value) {
        ngreen(address(), value);
        return this;
    }

    public spng_trns blue(@NativeType("uint16_t") short value) {
        nblue(address(), value);
        return this;
    }

    public spng_trns type3_alpha(@NativeType("uint8_t[256]") ByteBuffer value) {
        ntype3_alpha(address(), value);
        return this;
    }

    public spng_trns type3_alpha(int index, @NativeType("uint8_t") byte value) {
        ntype3_alpha(address(), index, value);
        return this;
    }

    public spng_trns set(short gray, short red, short green, short blue, ByteBuffer type3_alpha) {
        gray(gray);
        red(red);
        green(green);
        blue(blue);
        type3_alpha(type3_alpha);
        return this;
    }

    public spng_trns set(spng_trns src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_trns malloc() {
        return new spng_trns(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_trns calloc() {
        return new spng_trns(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_trns create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_trns(MemoryUtil.memAddress(container), container);
    }

    public static spng_trns create(long address) {
        return new spng_trns(address, null);
    }

    public static spng_trns createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_trns(address, null);
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

    public static spng_trns malloc(MemoryStack stack) {
        return new spng_trns(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_trns calloc(MemoryStack stack) {
        return new spng_trns(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nn_type3_entries(long struct) {
        return MemoryUtil.memGetInt(struct + N_TYPE3_ENTRIES);
    }

    public static ByteBuffer ntype3_alpha(long struct) {
        return MemoryUtil.memByteBuffer(struct + TYPE3_ALPHA, nn_type3_entries(struct));
    }

    public static byte ntype3_alpha(long struct, int index) {
        return MemoryUtil.memGetByte(struct + TYPE3_ALPHA + (Checks.check(index, 256) * 1));
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

    public static void nn_type3_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + N_TYPE3_ENTRIES, value);
    }

    public static void ntype3_alpha(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 256);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + TYPE3_ALPHA, value.remaining() * 1);
        nn_type3_entries(struct, value.remaining());
    }

    public static void ntype3_alpha(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + TYPE3_ALPHA + (Checks.check(index, 256) * 1), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_trns$Buffer.class */
    public static class Buffer extends StructBuffer<spng_trns, Buffer> implements NativeResource {
        private static final spng_trns ELEMENT_FACTORY = spng_trns.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_trns.SIZEOF);
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
        public spng_trns getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint16_t")
        public short gray() {
            return spng_trns.ngray(address());
        }

        @NativeType("uint16_t")
        public short red() {
            return spng_trns.nred(address());
        }

        @NativeType("uint16_t")
        public short green() {
            return spng_trns.ngreen(address());
        }

        @NativeType("uint16_t")
        public short blue() {
            return spng_trns.nblue(address());
        }

        @NativeType("uint32_t")
        public int n_type3_entries() {
            return spng_trns.nn_type3_entries(address());
        }

        @NativeType("uint8_t[256]")
        public ByteBuffer type3_alpha() {
            return spng_trns.ntype3_alpha(address());
        }

        @NativeType("uint8_t")
        public byte type3_alpha(int index) {
            return spng_trns.ntype3_alpha(address(), index);
        }

        public Buffer gray(@NativeType("uint16_t") short value) {
            spng_trns.ngray(address(), value);
            return this;
        }

        public Buffer red(@NativeType("uint16_t") short value) {
            spng_trns.nred(address(), value);
            return this;
        }

        public Buffer green(@NativeType("uint16_t") short value) {
            spng_trns.ngreen(address(), value);
            return this;
        }

        public Buffer blue(@NativeType("uint16_t") short value) {
            spng_trns.nblue(address(), value);
            return this;
        }

        public Buffer type3_alpha(@NativeType("uint8_t[256]") ByteBuffer value) {
            spng_trns.ntype3_alpha(address(), value);
            return this;
        }

        public Buffer type3_alpha(int index, @NativeType("uint8_t") byte value) {
            spng_trns.ntype3_alpha(address(), index, value);
            return this;
        }
    }
}
