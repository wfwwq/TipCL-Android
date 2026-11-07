package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoVP9ColorConfig.class */
public class StdVideoVP9ColorConfig extends Struct<StdVideoVP9ColorConfig> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int BITDEPTH;
    public static final int SUBSAMPLING_X;
    public static final int SUBSAMPLING_Y;
    public static final int RESERVED1;
    public static final int COLOR_SPACE;

    static {
        Struct.Layout layout = __struct(__member(StdVideoVP9ColorConfigFlags.SIZEOF, StdVideoVP9ColorConfigFlags.ALIGNOF), __member(1), __member(1), __member(1), __member(1), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        BITDEPTH = layout.offsetof(1);
        SUBSAMPLING_X = layout.offsetof(2);
        SUBSAMPLING_Y = layout.offsetof(3);
        RESERVED1 = layout.offsetof(4);
        COLOR_SPACE = layout.offsetof(5);
    }

    protected StdVideoVP9ColorConfig(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoVP9ColorConfig create(long address, ByteBuffer container) {
        return new StdVideoVP9ColorConfig(address, container);
    }

    public StdVideoVP9ColorConfig(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoVP9ColorConfigFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte BitDepth() {
        return nBitDepth(address());
    }

    @NativeType("uint8_t")
    public byte subsampling_x() {
        return nsubsampling_x(address());
    }

    @NativeType("uint8_t")
    public byte subsampling_y() {
        return nsubsampling_y(address());
    }

    @NativeType("StdVideoVP9ColorSpace")
    public int color_space() {
        return ncolor_space(address());
    }

    public StdVideoVP9ColorConfig flags(StdVideoVP9ColorConfigFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoVP9ColorConfig flags(Consumer<StdVideoVP9ColorConfigFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoVP9ColorConfig BitDepth(@NativeType("uint8_t") byte value) {
        nBitDepth(address(), value);
        return this;
    }

    public StdVideoVP9ColorConfig subsampling_x(@NativeType("uint8_t") byte value) {
        nsubsampling_x(address(), value);
        return this;
    }

    public StdVideoVP9ColorConfig subsampling_y(@NativeType("uint8_t") byte value) {
        nsubsampling_y(address(), value);
        return this;
    }

    public StdVideoVP9ColorConfig color_space(@NativeType("StdVideoVP9ColorSpace") int value) {
        ncolor_space(address(), value);
        return this;
    }

    public StdVideoVP9ColorConfig set(StdVideoVP9ColorConfigFlags flags, byte BitDepth, byte subsampling_x, byte subsampling_y, int color_space) {
        flags(flags);
        BitDepth(BitDepth);
        subsampling_x(subsampling_x);
        subsampling_y(subsampling_y);
        color_space(color_space);
        return this;
    }

    public StdVideoVP9ColorConfig set(StdVideoVP9ColorConfig src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoVP9ColorConfig malloc() {
        return new StdVideoVP9ColorConfig(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoVP9ColorConfig calloc() {
        return new StdVideoVP9ColorConfig(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoVP9ColorConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoVP9ColorConfig(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoVP9ColorConfig create(long address) {
        return new StdVideoVP9ColorConfig(address, null);
    }

    public static StdVideoVP9ColorConfig createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoVP9ColorConfig(address, null);
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

    public static StdVideoVP9ColorConfig malloc(MemoryStack stack) {
        return new StdVideoVP9ColorConfig(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoVP9ColorConfig calloc(MemoryStack stack) {
        return new StdVideoVP9ColorConfig(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoVP9ColorConfigFlags nflags(long struct) {
        return StdVideoVP9ColorConfigFlags.create(struct + FLAGS);
    }

    public static byte nBitDepth(long struct) {
        return MemoryUtil.memGetByte(struct + BITDEPTH);
    }

    public static byte nsubsampling_x(long struct) {
        return MemoryUtil.memGetByte(struct + SUBSAMPLING_X);
    }

    public static byte nsubsampling_y(long struct) {
        return MemoryUtil.memGetByte(struct + SUBSAMPLING_Y);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static int ncolor_space(long struct) {
        return MemoryUtil.memGetInt(struct + COLOR_SPACE);
    }

    public static void nflags(long struct, StdVideoVP9ColorConfigFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoVP9ColorConfigFlags.SIZEOF);
    }

    public static void nBitDepth(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BITDEPTH, value);
    }

    public static void nsubsampling_x(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SUBSAMPLING_X, value);
    }

    public static void nsubsampling_y(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SUBSAMPLING_Y, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void ncolor_space(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLOR_SPACE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoVP9ColorConfig$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoVP9ColorConfig, Buffer> implements NativeResource {
        private static final StdVideoVP9ColorConfig ELEMENT_FACTORY = StdVideoVP9ColorConfig.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoVP9ColorConfig.SIZEOF);
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
        public StdVideoVP9ColorConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoVP9ColorConfigFlags flags() {
            return StdVideoVP9ColorConfig.nflags(address());
        }

        @NativeType("uint8_t")
        public byte BitDepth() {
            return StdVideoVP9ColorConfig.nBitDepth(address());
        }

        @NativeType("uint8_t")
        public byte subsampling_x() {
            return StdVideoVP9ColorConfig.nsubsampling_x(address());
        }

        @NativeType("uint8_t")
        public byte subsampling_y() {
            return StdVideoVP9ColorConfig.nsubsampling_y(address());
        }

        @NativeType("StdVideoVP9ColorSpace")
        public int color_space() {
            return StdVideoVP9ColorConfig.ncolor_space(address());
        }

        public Buffer flags(StdVideoVP9ColorConfigFlags value) {
            StdVideoVP9ColorConfig.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoVP9ColorConfigFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer BitDepth(@NativeType("uint8_t") byte value) {
            StdVideoVP9ColorConfig.nBitDepth(address(), value);
            return this;
        }

        public Buffer subsampling_x(@NativeType("uint8_t") byte value) {
            StdVideoVP9ColorConfig.nsubsampling_x(address(), value);
            return this;
        }

        public Buffer subsampling_y(@NativeType("uint8_t") byte value) {
            StdVideoVP9ColorConfig.nsubsampling_y(address(), value);
            return this;
        }

        public Buffer color_space(@NativeType("StdVideoVP9ColorSpace") int value) {
            StdVideoVP9ColorConfig.ncolor_space(address(), value);
            return this;
        }
    }
}
