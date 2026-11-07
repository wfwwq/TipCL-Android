package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_plte_entry")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_plte_entry.class */
public class spng_plte_entry extends Struct<spng_plte_entry> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RED;
    public static final int GREEN;
    public static final int BLUE;
    public static final int ALPHA;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RED = layout.offsetof(0);
        GREEN = layout.offsetof(1);
        BLUE = layout.offsetof(2);
        ALPHA = layout.offsetof(3);
    }

    protected spng_plte_entry(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_plte_entry create(long address, ByteBuffer container) {
        return new spng_plte_entry(address, container);
    }

    public spng_plte_entry(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t")
    public byte red() {
        return nred(address());
    }

    @NativeType("uint8_t")
    public byte green() {
        return ngreen(address());
    }

    @NativeType("uint8_t")
    public byte blue() {
        return nblue(address());
    }

    @NativeType("uint8_t")
    public byte alpha() {
        return nalpha(address());
    }

    public spng_plte_entry red(@NativeType("uint8_t") byte value) {
        nred(address(), value);
        return this;
    }

    public spng_plte_entry green(@NativeType("uint8_t") byte value) {
        ngreen(address(), value);
        return this;
    }

    public spng_plte_entry blue(@NativeType("uint8_t") byte value) {
        nblue(address(), value);
        return this;
    }

    public spng_plte_entry alpha(@NativeType("uint8_t") byte value) {
        nalpha(address(), value);
        return this;
    }

    public spng_plte_entry set(byte red, byte green, byte blue, byte alpha) {
        red(red);
        green(green);
        blue(blue);
        alpha(alpha);
        return this;
    }

    public spng_plte_entry set(spng_plte_entry src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_plte_entry malloc() {
        return new spng_plte_entry(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_plte_entry calloc() {
        return new spng_plte_entry(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_plte_entry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_plte_entry(MemoryUtil.memAddress(container), container);
    }

    public static spng_plte_entry create(long address) {
        return new spng_plte_entry(address, null);
    }

    public static spng_plte_entry createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_plte_entry(address, null);
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

    public static spng_plte_entry malloc(MemoryStack stack) {
        return new spng_plte_entry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_plte_entry calloc(MemoryStack stack) {
        return new spng_plte_entry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte nred(long struct) {
        return MemoryUtil.memGetByte(struct + RED);
    }

    public static byte ngreen(long struct) {
        return MemoryUtil.memGetByte(struct + GREEN);
    }

    public static byte nblue(long struct) {
        return MemoryUtil.memGetByte(struct + BLUE);
    }

    public static byte nalpha(long struct) {
        return MemoryUtil.memGetByte(struct + ALPHA);
    }

    public static void nred(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RED, value);
    }

    public static void ngreen(long struct, byte value) {
        MemoryUtil.memPutByte(struct + GREEN, value);
    }

    public static void nblue(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BLUE, value);
    }

    public static void nalpha(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ALPHA, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_plte_entry$Buffer.class */
    public static class Buffer extends StructBuffer<spng_plte_entry, Buffer> implements NativeResource {
        private static final spng_plte_entry ELEMENT_FACTORY = spng_plte_entry.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_plte_entry.SIZEOF);
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
        public spng_plte_entry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t")
        public byte red() {
            return spng_plte_entry.nred(address());
        }

        @NativeType("uint8_t")
        public byte green() {
            return spng_plte_entry.ngreen(address());
        }

        @NativeType("uint8_t")
        public byte blue() {
            return spng_plte_entry.nblue(address());
        }

        @NativeType("uint8_t")
        public byte alpha() {
            return spng_plte_entry.nalpha(address());
        }

        public Buffer red(@NativeType("uint8_t") byte value) {
            spng_plte_entry.nred(address(), value);
            return this;
        }

        public Buffer green(@NativeType("uint8_t") byte value) {
            spng_plte_entry.ngreen(address(), value);
            return this;
        }

        public Buffer blue(@NativeType("uint8_t") byte value) {
            spng_plte_entry.nblue(address(), value);
            return this;
        }

        public Buffer alpha(@NativeType("uint8_t") byte value) {
            spng_plte_entry.nalpha(address(), value);
            return this;
        }
    }
}
