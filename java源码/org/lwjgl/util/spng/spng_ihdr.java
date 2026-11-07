package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_ihdr")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_ihdr.class */
public class spng_ihdr extends Struct<spng_ihdr> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int BIT_DEPTH;
    public static final int COLOR_TYPE;
    public static final int COMPRESSION_METHOD;
    public static final int FILTER_METHOD;
    public static final int INTERLACE_METHOD;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        BIT_DEPTH = layout.offsetof(2);
        COLOR_TYPE = layout.offsetof(3);
        COMPRESSION_METHOD = layout.offsetof(4);
        FILTER_METHOD = layout.offsetof(5);
        INTERLACE_METHOD = layout.offsetof(6);
    }

    protected spng_ihdr(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_ihdr create(long address, ByteBuffer container) {
        return new spng_ihdr(address, container);
    }

    public spng_ihdr(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int width() {
        return nwidth(address());
    }

    @NativeType("uint32_t")
    public int height() {
        return nheight(address());
    }

    @NativeType("uint8_t")
    public byte bit_depth() {
        return nbit_depth(address());
    }

    @NativeType("uint8_t")
    public byte color_type() {
        return ncolor_type(address());
    }

    @NativeType("uint8_t")
    public byte compression_method() {
        return ncompression_method(address());
    }

    @NativeType("uint8_t")
    public byte filter_method() {
        return nfilter_method(address());
    }

    @NativeType("uint8_t")
    public byte interlace_method() {
        return ninterlace_method(address());
    }

    public spng_ihdr width(@NativeType("uint32_t") int value) {
        nwidth(address(), value);
        return this;
    }

    public spng_ihdr height(@NativeType("uint32_t") int value) {
        nheight(address(), value);
        return this;
    }

    public spng_ihdr bit_depth(@NativeType("uint8_t") byte value) {
        nbit_depth(address(), value);
        return this;
    }

    public spng_ihdr color_type(@NativeType("uint8_t") byte value) {
        ncolor_type(address(), value);
        return this;
    }

    public spng_ihdr compression_method(@NativeType("uint8_t") byte value) {
        ncompression_method(address(), value);
        return this;
    }

    public spng_ihdr filter_method(@NativeType("uint8_t") byte value) {
        nfilter_method(address(), value);
        return this;
    }

    public spng_ihdr interlace_method(@NativeType("uint8_t") byte value) {
        ninterlace_method(address(), value);
        return this;
    }

    public spng_ihdr set(int width, int height, byte bit_depth, byte color_type, byte compression_method, byte filter_method, byte interlace_method) {
        width(width);
        height(height);
        bit_depth(bit_depth);
        color_type(color_type);
        compression_method(compression_method);
        filter_method(filter_method);
        interlace_method(interlace_method);
        return this;
    }

    public spng_ihdr set(spng_ihdr src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_ihdr malloc() {
        return new spng_ihdr(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_ihdr calloc() {
        return new spng_ihdr(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_ihdr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_ihdr(MemoryUtil.memAddress(container), container);
    }

    public static spng_ihdr create(long address) {
        return new spng_ihdr(address, null);
    }

    public static spng_ihdr createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_ihdr(address, null);
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

    public static spng_ihdr malloc(MemoryStack stack) {
        return new spng_ihdr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_ihdr calloc(MemoryStack stack) {
        return new spng_ihdr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static byte nbit_depth(long struct) {
        return MemoryUtil.memGetByte(struct + BIT_DEPTH);
    }

    public static byte ncolor_type(long struct) {
        return MemoryUtil.memGetByte(struct + COLOR_TYPE);
    }

    public static byte ncompression_method(long struct) {
        return MemoryUtil.memGetByte(struct + COMPRESSION_METHOD);
    }

    public static byte nfilter_method(long struct) {
        return MemoryUtil.memGetByte(struct + FILTER_METHOD);
    }

    public static byte ninterlace_method(long struct) {
        return MemoryUtil.memGetByte(struct + INTERLACE_METHOD);
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void nbit_depth(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BIT_DEPTH, value);
    }

    public static void ncolor_type(long struct, byte value) {
        MemoryUtil.memPutByte(struct + COLOR_TYPE, value);
    }

    public static void ncompression_method(long struct, byte value) {
        MemoryUtil.memPutByte(struct + COMPRESSION_METHOD, value);
    }

    public static void nfilter_method(long struct, byte value) {
        MemoryUtil.memPutByte(struct + FILTER_METHOD, value);
    }

    public static void ninterlace_method(long struct, byte value) {
        MemoryUtil.memPutByte(struct + INTERLACE_METHOD, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_ihdr$Buffer.class */
    public static class Buffer extends StructBuffer<spng_ihdr, Buffer> implements NativeResource {
        private static final spng_ihdr ELEMENT_FACTORY = spng_ihdr.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_ihdr.SIZEOF);
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
        public spng_ihdr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int width() {
            return spng_ihdr.nwidth(address());
        }

        @NativeType("uint32_t")
        public int height() {
            return spng_ihdr.nheight(address());
        }

        @NativeType("uint8_t")
        public byte bit_depth() {
            return spng_ihdr.nbit_depth(address());
        }

        @NativeType("uint8_t")
        public byte color_type() {
            return spng_ihdr.ncolor_type(address());
        }

        @NativeType("uint8_t")
        public byte compression_method() {
            return spng_ihdr.ncompression_method(address());
        }

        @NativeType("uint8_t")
        public byte filter_method() {
            return spng_ihdr.nfilter_method(address());
        }

        @NativeType("uint8_t")
        public byte interlace_method() {
            return spng_ihdr.ninterlace_method(address());
        }

        public Buffer width(@NativeType("uint32_t") int value) {
            spng_ihdr.nwidth(address(), value);
            return this;
        }

        public Buffer height(@NativeType("uint32_t") int value) {
            spng_ihdr.nheight(address(), value);
            return this;
        }

        public Buffer bit_depth(@NativeType("uint8_t") byte value) {
            spng_ihdr.nbit_depth(address(), value);
            return this;
        }

        public Buffer color_type(@NativeType("uint8_t") byte value) {
            spng_ihdr.ncolor_type(address(), value);
            return this;
        }

        public Buffer compression_method(@NativeType("uint8_t") byte value) {
            spng_ihdr.ncompression_method(address(), value);
            return this;
        }

        public Buffer filter_method(@NativeType("uint8_t") byte value) {
            spng_ihdr.nfilter_method(address(), value);
            return this;
        }

        public Buffer interlace_method(@NativeType("uint8_t") byte value) {
            spng_ihdr.ninterlace_method(address(), value);
            return this;
        }
    }
}
