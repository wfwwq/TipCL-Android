package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_sbit")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_sbit.class */
public class spng_sbit extends Struct<spng_sbit> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int GRAYSCALE_BITS;
    public static final int RED_BITS;
    public static final int GREEN_BITS;
    public static final int BLUE_BITS;
    public static final int ALPHA_BITS;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        GRAYSCALE_BITS = layout.offsetof(0);
        RED_BITS = layout.offsetof(1);
        GREEN_BITS = layout.offsetof(2);
        BLUE_BITS = layout.offsetof(3);
        ALPHA_BITS = layout.offsetof(4);
    }

    protected spng_sbit(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_sbit create(long address, ByteBuffer container) {
        return new spng_sbit(address, container);
    }

    public spng_sbit(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t")
    public byte grayscale_bits() {
        return ngrayscale_bits(address());
    }

    @NativeType("uint8_t")
    public byte red_bits() {
        return nred_bits(address());
    }

    @NativeType("uint8_t")
    public byte green_bits() {
        return ngreen_bits(address());
    }

    @NativeType("uint8_t")
    public byte blue_bits() {
        return nblue_bits(address());
    }

    @NativeType("uint8_t")
    public byte alpha_bits() {
        return nalpha_bits(address());
    }

    public spng_sbit grayscale_bits(@NativeType("uint8_t") byte value) {
        ngrayscale_bits(address(), value);
        return this;
    }

    public spng_sbit red_bits(@NativeType("uint8_t") byte value) {
        nred_bits(address(), value);
        return this;
    }

    public spng_sbit green_bits(@NativeType("uint8_t") byte value) {
        ngreen_bits(address(), value);
        return this;
    }

    public spng_sbit blue_bits(@NativeType("uint8_t") byte value) {
        nblue_bits(address(), value);
        return this;
    }

    public spng_sbit alpha_bits(@NativeType("uint8_t") byte value) {
        nalpha_bits(address(), value);
        return this;
    }

    public spng_sbit set(byte grayscale_bits, byte red_bits, byte green_bits, byte blue_bits, byte alpha_bits) {
        grayscale_bits(grayscale_bits);
        red_bits(red_bits);
        green_bits(green_bits);
        blue_bits(blue_bits);
        alpha_bits(alpha_bits);
        return this;
    }

    public spng_sbit set(spng_sbit src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_sbit malloc() {
        return new spng_sbit(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_sbit calloc() {
        return new spng_sbit(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_sbit create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_sbit(MemoryUtil.memAddress(container), container);
    }

    public static spng_sbit create(long address) {
        return new spng_sbit(address, null);
    }

    public static spng_sbit createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_sbit(address, null);
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

    public static spng_sbit malloc(MemoryStack stack) {
        return new spng_sbit(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_sbit calloc(MemoryStack stack) {
        return new spng_sbit(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte ngrayscale_bits(long struct) {
        return MemoryUtil.memGetByte(struct + GRAYSCALE_BITS);
    }

    public static byte nred_bits(long struct) {
        return MemoryUtil.memGetByte(struct + RED_BITS);
    }

    public static byte ngreen_bits(long struct) {
        return MemoryUtil.memGetByte(struct + GREEN_BITS);
    }

    public static byte nblue_bits(long struct) {
        return MemoryUtil.memGetByte(struct + BLUE_BITS);
    }

    public static byte nalpha_bits(long struct) {
        return MemoryUtil.memGetByte(struct + ALPHA_BITS);
    }

    public static void ngrayscale_bits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + GRAYSCALE_BITS, value);
    }

    public static void nred_bits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RED_BITS, value);
    }

    public static void ngreen_bits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + GREEN_BITS, value);
    }

    public static void nblue_bits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BLUE_BITS, value);
    }

    public static void nalpha_bits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ALPHA_BITS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_sbit$Buffer.class */
    public static class Buffer extends StructBuffer<spng_sbit, Buffer> implements NativeResource {
        private static final spng_sbit ELEMENT_FACTORY = spng_sbit.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_sbit.SIZEOF);
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
        public spng_sbit getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t")
        public byte grayscale_bits() {
            return spng_sbit.ngrayscale_bits(address());
        }

        @NativeType("uint8_t")
        public byte red_bits() {
            return spng_sbit.nred_bits(address());
        }

        @NativeType("uint8_t")
        public byte green_bits() {
            return spng_sbit.ngreen_bits(address());
        }

        @NativeType("uint8_t")
        public byte blue_bits() {
            return spng_sbit.nblue_bits(address());
        }

        @NativeType("uint8_t")
        public byte alpha_bits() {
            return spng_sbit.nalpha_bits(address());
        }

        public Buffer grayscale_bits(@NativeType("uint8_t") byte value) {
            spng_sbit.ngrayscale_bits(address(), value);
            return this;
        }

        public Buffer red_bits(@NativeType("uint8_t") byte value) {
            spng_sbit.nred_bits(address(), value);
            return this;
        }

        public Buffer green_bits(@NativeType("uint8_t") byte value) {
            spng_sbit.ngreen_bits(address(), value);
            return this;
        }

        public Buffer blue_bits(@NativeType("uint8_t") byte value) {
            spng_sbit.nblue_bits(address(), value);
            return this;
        }

        public Buffer alpha_bits(@NativeType("uint8_t") byte value) {
            spng_sbit.nalpha_bits(address(), value);
            return this;
        }
    }
}
