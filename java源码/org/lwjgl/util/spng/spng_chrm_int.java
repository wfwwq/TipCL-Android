package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_chrm_int")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_chrm_int.class */
public class spng_chrm_int extends Struct<spng_chrm_int> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WHITE_POINT_X;
    public static final int WHITE_POINT_Y;
    public static final int RED_X;
    public static final int RED_Y;
    public static final int GREEN_X;
    public static final int GREEN_Y;
    public static final int BLUE_X;
    public static final int BLUE_Y;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WHITE_POINT_X = layout.offsetof(0);
        WHITE_POINT_Y = layout.offsetof(1);
        RED_X = layout.offsetof(2);
        RED_Y = layout.offsetof(3);
        GREEN_X = layout.offsetof(4);
        GREEN_Y = layout.offsetof(5);
        BLUE_X = layout.offsetof(6);
        BLUE_Y = layout.offsetof(7);
    }

    protected spng_chrm_int(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_chrm_int create(long address, ByteBuffer container) {
        return new spng_chrm_int(address, container);
    }

    public spng_chrm_int(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int white_point_x() {
        return nwhite_point_x(address());
    }

    @NativeType("uint32_t")
    public int white_point_y() {
        return nwhite_point_y(address());
    }

    @NativeType("uint32_t")
    public int red_x() {
        return nred_x(address());
    }

    @NativeType("uint32_t")
    public int red_y() {
        return nred_y(address());
    }

    @NativeType("uint32_t")
    public int green_x() {
        return ngreen_x(address());
    }

    @NativeType("uint32_t")
    public int green_y() {
        return ngreen_y(address());
    }

    @NativeType("uint32_t")
    public int blue_x() {
        return nblue_x(address());
    }

    @NativeType("uint32_t")
    public int blue_y() {
        return nblue_y(address());
    }

    public spng_chrm_int white_point_x(@NativeType("uint32_t") int value) {
        nwhite_point_x(address(), value);
        return this;
    }

    public spng_chrm_int white_point_y(@NativeType("uint32_t") int value) {
        nwhite_point_y(address(), value);
        return this;
    }

    public spng_chrm_int red_x(@NativeType("uint32_t") int value) {
        nred_x(address(), value);
        return this;
    }

    public spng_chrm_int red_y(@NativeType("uint32_t") int value) {
        nred_y(address(), value);
        return this;
    }

    public spng_chrm_int green_x(@NativeType("uint32_t") int value) {
        ngreen_x(address(), value);
        return this;
    }

    public spng_chrm_int green_y(@NativeType("uint32_t") int value) {
        ngreen_y(address(), value);
        return this;
    }

    public spng_chrm_int blue_x(@NativeType("uint32_t") int value) {
        nblue_x(address(), value);
        return this;
    }

    public spng_chrm_int blue_y(@NativeType("uint32_t") int value) {
        nblue_y(address(), value);
        return this;
    }

    public spng_chrm_int set(int white_point_x, int white_point_y, int red_x, int red_y, int green_x, int green_y, int blue_x, int blue_y) {
        white_point_x(white_point_x);
        white_point_y(white_point_y);
        red_x(red_x);
        red_y(red_y);
        green_x(green_x);
        green_y(green_y);
        blue_x(blue_x);
        blue_y(blue_y);
        return this;
    }

    public spng_chrm_int set(spng_chrm_int src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_chrm_int malloc() {
        return new spng_chrm_int(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_chrm_int calloc() {
        return new spng_chrm_int(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_chrm_int create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_chrm_int(MemoryUtil.memAddress(container), container);
    }

    public static spng_chrm_int create(long address) {
        return new spng_chrm_int(address, null);
    }

    public static spng_chrm_int createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_chrm_int(address, null);
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

    public static spng_chrm_int malloc(MemoryStack stack) {
        return new spng_chrm_int(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_chrm_int calloc(MemoryStack stack) {
        return new spng_chrm_int(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nwhite_point_x(long struct) {
        return MemoryUtil.memGetInt(struct + WHITE_POINT_X);
    }

    public static int nwhite_point_y(long struct) {
        return MemoryUtil.memGetInt(struct + WHITE_POINT_Y);
    }

    public static int nred_x(long struct) {
        return MemoryUtil.memGetInt(struct + RED_X);
    }

    public static int nred_y(long struct) {
        return MemoryUtil.memGetInt(struct + RED_Y);
    }

    public static int ngreen_x(long struct) {
        return MemoryUtil.memGetInt(struct + GREEN_X);
    }

    public static int ngreen_y(long struct) {
        return MemoryUtil.memGetInt(struct + GREEN_Y);
    }

    public static int nblue_x(long struct) {
        return MemoryUtil.memGetInt(struct + BLUE_X);
    }

    public static int nblue_y(long struct) {
        return MemoryUtil.memGetInt(struct + BLUE_Y);
    }

    public static void nwhite_point_x(long struct, int value) {
        MemoryUtil.memPutInt(struct + WHITE_POINT_X, value);
    }

    public static void nwhite_point_y(long struct, int value) {
        MemoryUtil.memPutInt(struct + WHITE_POINT_Y, value);
    }

    public static void nred_x(long struct, int value) {
        MemoryUtil.memPutInt(struct + RED_X, value);
    }

    public static void nred_y(long struct, int value) {
        MemoryUtil.memPutInt(struct + RED_Y, value);
    }

    public static void ngreen_x(long struct, int value) {
        MemoryUtil.memPutInt(struct + GREEN_X, value);
    }

    public static void ngreen_y(long struct, int value) {
        MemoryUtil.memPutInt(struct + GREEN_Y, value);
    }

    public static void nblue_x(long struct, int value) {
        MemoryUtil.memPutInt(struct + BLUE_X, value);
    }

    public static void nblue_y(long struct, int value) {
        MemoryUtil.memPutInt(struct + BLUE_Y, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_chrm_int$Buffer.class */
    public static class Buffer extends StructBuffer<spng_chrm_int, Buffer> implements NativeResource {
        private static final spng_chrm_int ELEMENT_FACTORY = spng_chrm_int.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_chrm_int.SIZEOF);
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
        public spng_chrm_int getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int white_point_x() {
            return spng_chrm_int.nwhite_point_x(address());
        }

        @NativeType("uint32_t")
        public int white_point_y() {
            return spng_chrm_int.nwhite_point_y(address());
        }

        @NativeType("uint32_t")
        public int red_x() {
            return spng_chrm_int.nred_x(address());
        }

        @NativeType("uint32_t")
        public int red_y() {
            return spng_chrm_int.nred_y(address());
        }

        @NativeType("uint32_t")
        public int green_x() {
            return spng_chrm_int.ngreen_x(address());
        }

        @NativeType("uint32_t")
        public int green_y() {
            return spng_chrm_int.ngreen_y(address());
        }

        @NativeType("uint32_t")
        public int blue_x() {
            return spng_chrm_int.nblue_x(address());
        }

        @NativeType("uint32_t")
        public int blue_y() {
            return spng_chrm_int.nblue_y(address());
        }

        public Buffer white_point_x(@NativeType("uint32_t") int value) {
            spng_chrm_int.nwhite_point_x(address(), value);
            return this;
        }

        public Buffer white_point_y(@NativeType("uint32_t") int value) {
            spng_chrm_int.nwhite_point_y(address(), value);
            return this;
        }

        public Buffer red_x(@NativeType("uint32_t") int value) {
            spng_chrm_int.nred_x(address(), value);
            return this;
        }

        public Buffer red_y(@NativeType("uint32_t") int value) {
            spng_chrm_int.nred_y(address(), value);
            return this;
        }

        public Buffer green_x(@NativeType("uint32_t") int value) {
            spng_chrm_int.ngreen_x(address(), value);
            return this;
        }

        public Buffer green_y(@NativeType("uint32_t") int value) {
            spng_chrm_int.ngreen_y(address(), value);
            return this;
        }

        public Buffer blue_x(@NativeType("uint32_t") int value) {
            spng_chrm_int.nblue_x(address(), value);
            return this;
        }

        public Buffer blue_y(@NativeType("uint32_t") int value) {
            spng_chrm_int.nblue_y(address(), value);
            return this;
        }
    }
}
