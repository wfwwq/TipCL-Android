package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_chrm")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_chrm.class */
public class spng_chrm extends Struct<spng_chrm> implements NativeResource {
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
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8));
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

    protected spng_chrm(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_chrm create(long address, ByteBuffer container) {
        return new spng_chrm(address, container);
    }

    public spng_chrm(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public double white_point_x() {
        return nwhite_point_x(address());
    }

    public double white_point_y() {
        return nwhite_point_y(address());
    }

    public double red_x() {
        return nred_x(address());
    }

    public double red_y() {
        return nred_y(address());
    }

    public double green_x() {
        return ngreen_x(address());
    }

    public double green_y() {
        return ngreen_y(address());
    }

    public double blue_x() {
        return nblue_x(address());
    }

    public double blue_y() {
        return nblue_y(address());
    }

    public spng_chrm white_point_x(double value) {
        nwhite_point_x(address(), value);
        return this;
    }

    public spng_chrm white_point_y(double value) {
        nwhite_point_y(address(), value);
        return this;
    }

    public spng_chrm red_x(double value) {
        nred_x(address(), value);
        return this;
    }

    public spng_chrm red_y(double value) {
        nred_y(address(), value);
        return this;
    }

    public spng_chrm green_x(double value) {
        ngreen_x(address(), value);
        return this;
    }

    public spng_chrm green_y(double value) {
        ngreen_y(address(), value);
        return this;
    }

    public spng_chrm blue_x(double value) {
        nblue_x(address(), value);
        return this;
    }

    public spng_chrm blue_y(double value) {
        nblue_y(address(), value);
        return this;
    }

    public spng_chrm set(double white_point_x, double white_point_y, double red_x, double red_y, double green_x, double green_y, double blue_x, double blue_y) {
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

    public spng_chrm set(spng_chrm src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_chrm malloc() {
        return new spng_chrm(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_chrm calloc() {
        return new spng_chrm(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_chrm create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_chrm(MemoryUtil.memAddress(container), container);
    }

    public static spng_chrm create(long address) {
        return new spng_chrm(address, null);
    }

    public static spng_chrm createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_chrm(address, null);
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

    public static spng_chrm malloc(MemoryStack stack) {
        return new spng_chrm(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_chrm calloc(MemoryStack stack) {
        return new spng_chrm(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static double nwhite_point_x(long struct) {
        return MemoryUtil.memGetDouble(struct + WHITE_POINT_X);
    }

    public static double nwhite_point_y(long struct) {
        return MemoryUtil.memGetDouble(struct + WHITE_POINT_Y);
    }

    public static double nred_x(long struct) {
        return MemoryUtil.memGetDouble(struct + RED_X);
    }

    public static double nred_y(long struct) {
        return MemoryUtil.memGetDouble(struct + RED_Y);
    }

    public static double ngreen_x(long struct) {
        return MemoryUtil.memGetDouble(struct + GREEN_X);
    }

    public static double ngreen_y(long struct) {
        return MemoryUtil.memGetDouble(struct + GREEN_Y);
    }

    public static double nblue_x(long struct) {
        return MemoryUtil.memGetDouble(struct + BLUE_X);
    }

    public static double nblue_y(long struct) {
        return MemoryUtil.memGetDouble(struct + BLUE_Y);
    }

    public static void nwhite_point_x(long struct, double value) {
        MemoryUtil.memPutDouble(struct + WHITE_POINT_X, value);
    }

    public static void nwhite_point_y(long struct, double value) {
        MemoryUtil.memPutDouble(struct + WHITE_POINT_Y, value);
    }

    public static void nred_x(long struct, double value) {
        MemoryUtil.memPutDouble(struct + RED_X, value);
    }

    public static void nred_y(long struct, double value) {
        MemoryUtil.memPutDouble(struct + RED_Y, value);
    }

    public static void ngreen_x(long struct, double value) {
        MemoryUtil.memPutDouble(struct + GREEN_X, value);
    }

    public static void ngreen_y(long struct, double value) {
        MemoryUtil.memPutDouble(struct + GREEN_Y, value);
    }

    public static void nblue_x(long struct, double value) {
        MemoryUtil.memPutDouble(struct + BLUE_X, value);
    }

    public static void nblue_y(long struct, double value) {
        MemoryUtil.memPutDouble(struct + BLUE_Y, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_chrm$Buffer.class */
    public static class Buffer extends StructBuffer<spng_chrm, Buffer> implements NativeResource {
        private static final spng_chrm ELEMENT_FACTORY = spng_chrm.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_chrm.SIZEOF);
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
        public spng_chrm getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public double white_point_x() {
            return spng_chrm.nwhite_point_x(address());
        }

        public double white_point_y() {
            return spng_chrm.nwhite_point_y(address());
        }

        public double red_x() {
            return spng_chrm.nred_x(address());
        }

        public double red_y() {
            return spng_chrm.nred_y(address());
        }

        public double green_x() {
            return spng_chrm.ngreen_x(address());
        }

        public double green_y() {
            return spng_chrm.ngreen_y(address());
        }

        public double blue_x() {
            return spng_chrm.nblue_x(address());
        }

        public double blue_y() {
            return spng_chrm.nblue_y(address());
        }

        public Buffer white_point_x(double value) {
            spng_chrm.nwhite_point_x(address(), value);
            return this;
        }

        public Buffer white_point_y(double value) {
            spng_chrm.nwhite_point_y(address(), value);
            return this;
        }

        public Buffer red_x(double value) {
            spng_chrm.nred_x(address(), value);
            return this;
        }

        public Buffer red_y(double value) {
            spng_chrm.nred_y(address(), value);
            return this;
        }

        public Buffer green_x(double value) {
            spng_chrm.ngreen_x(address(), value);
            return this;
        }

        public Buffer green_y(double value) {
            spng_chrm.ngreen_y(address(), value);
            return this;
        }

        public Buffer blue_x(double value) {
            spng_chrm.nblue_x(address(), value);
            return this;
        }

        public Buffer blue_y(double value) {
            spng_chrm.nblue_y(address(), value);
            return this;
        }
    }
}
