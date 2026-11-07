package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ScalingLists.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ScalingLists.class */
public class StdVideoH265ScalingLists extends Struct<StdVideoH265ScalingLists> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SCALINGLIST4X4;
    public static final int SCALINGLIST8X8;
    public static final int SCALINGLIST16X16;
    public static final int SCALINGLIST32X32;
    public static final int SCALINGLISTDCCOEF16X16;
    public static final int SCALINGLISTDCCOEF32X32;

    static {
        Struct.Layout layout = __struct(__array(1, 16), __array(1, 64), __array(1, 64), __array(1, 64), __array(1, 6), __array(1, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SCALINGLIST4X4 = layout.offsetof(0);
        SCALINGLIST8X8 = layout.offsetof(1);
        SCALINGLIST16X16 = layout.offsetof(2);
        SCALINGLIST32X32 = layout.offsetof(3);
        SCALINGLISTDCCOEF16X16 = layout.offsetof(4);
        SCALINGLISTDCCOEF32X32 = layout.offsetof(5);
    }

    protected StdVideoH265ScalingLists(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265ScalingLists create(long address, ByteBuffer container) {
        return new StdVideoH265ScalingLists(address, container);
    }

    public StdVideoH265ScalingLists(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]")
    public ByteBuffer ScalingList4x4() {
        return nScalingList4x4(address());
    }

    @NativeType("uint8_t")
    public byte ScalingList4x4(int index) {
        return nScalingList4x4(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]")
    public ByteBuffer ScalingList8x8() {
        return nScalingList8x8(address());
    }

    @NativeType("uint8_t")
    public byte ScalingList8x8(int index) {
        return nScalingList8x8(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]")
    public ByteBuffer ScalingList16x16() {
        return nScalingList16x16(address());
    }

    @NativeType("uint8_t")
    public byte ScalingList16x16(int index) {
        return nScalingList16x16(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]")
    public ByteBuffer ScalingList32x32() {
        return nScalingList32x32(address());
    }

    @NativeType("uint8_t")
    public byte ScalingList32x32(int index) {
        return nScalingList32x32(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]")
    public ByteBuffer ScalingListDCCoef16x16() {
        return nScalingListDCCoef16x16(address());
    }

    @NativeType("uint8_t")
    public byte ScalingListDCCoef16x16(int index) {
        return nScalingListDCCoef16x16(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]")
    public ByteBuffer ScalingListDCCoef32x32() {
        return nScalingListDCCoef32x32(address());
    }

    @NativeType("uint8_t")
    public byte ScalingListDCCoef32x32(int index) {
        return nScalingListDCCoef32x32(address(), index);
    }

    public StdVideoH265ScalingLists ScalingList4x4(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]") ByteBuffer value) {
        nScalingList4x4(address(), value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingList4x4(int index, @NativeType("uint8_t") byte value) {
        nScalingList4x4(address(), index, value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingList8x8(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]") ByteBuffer value) {
        nScalingList8x8(address(), value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingList8x8(int index, @NativeType("uint8_t") byte value) {
        nScalingList8x8(address(), index, value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingList16x16(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]") ByteBuffer value) {
        nScalingList16x16(address(), value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingList16x16(int index, @NativeType("uint8_t") byte value) {
        nScalingList16x16(address(), index, value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingList32x32(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]") ByteBuffer value) {
        nScalingList32x32(address(), value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingList32x32(int index, @NativeType("uint8_t") byte value) {
        nScalingList32x32(address(), index, value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingListDCCoef16x16(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]") ByteBuffer value) {
        nScalingListDCCoef16x16(address(), value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingListDCCoef16x16(int index, @NativeType("uint8_t") byte value) {
        nScalingListDCCoef16x16(address(), index, value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingListDCCoef32x32(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]") ByteBuffer value) {
        nScalingListDCCoef32x32(address(), value);
        return this;
    }

    public StdVideoH265ScalingLists ScalingListDCCoef32x32(int index, @NativeType("uint8_t") byte value) {
        nScalingListDCCoef32x32(address(), index, value);
        return this;
    }

    public StdVideoH265ScalingLists set(ByteBuffer ScalingList4x4, ByteBuffer ScalingList8x8, ByteBuffer ScalingList16x16, ByteBuffer ScalingList32x32, ByteBuffer ScalingListDCCoef16x16, ByteBuffer ScalingListDCCoef32x32) {
        ScalingList4x4(ScalingList4x4);
        ScalingList8x8(ScalingList8x8);
        ScalingList16x16(ScalingList16x16);
        ScalingList32x32(ScalingList32x32);
        ScalingListDCCoef16x16(ScalingListDCCoef16x16);
        ScalingListDCCoef32x32(ScalingListDCCoef32x32);
        return this;
    }

    public StdVideoH265ScalingLists set(StdVideoH265ScalingLists src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265ScalingLists malloc() {
        return new StdVideoH265ScalingLists(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265ScalingLists calloc() {
        return new StdVideoH265ScalingLists(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265ScalingLists create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265ScalingLists(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265ScalingLists create(long address) {
        return new StdVideoH265ScalingLists(address, null);
    }

    public static StdVideoH265ScalingLists createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265ScalingLists(address, null);
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

    public static StdVideoH265ScalingLists malloc(MemoryStack stack) {
        return new StdVideoH265ScalingLists(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265ScalingLists calloc(MemoryStack stack) {
        return new StdVideoH265ScalingLists(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nScalingList4x4(long struct) {
        return MemoryUtil.memByteBuffer(struct + SCALINGLIST4X4, 16);
    }

    public static byte nScalingList4x4(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SCALINGLIST4X4 + (Checks.check(index, 16) * 1));
    }

    public static ByteBuffer nScalingList8x8(long struct) {
        return MemoryUtil.memByteBuffer(struct + SCALINGLIST8X8, 64);
    }

    public static byte nScalingList8x8(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SCALINGLIST8X8 + (Checks.check(index, 64) * 1));
    }

    public static ByteBuffer nScalingList16x16(long struct) {
        return MemoryUtil.memByteBuffer(struct + SCALINGLIST16X16, 64);
    }

    public static byte nScalingList16x16(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SCALINGLIST16X16 + (Checks.check(index, 64) * 1));
    }

    public static ByteBuffer nScalingList32x32(long struct) {
        return MemoryUtil.memByteBuffer(struct + SCALINGLIST32X32, 64);
    }

    public static byte nScalingList32x32(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SCALINGLIST32X32 + (Checks.check(index, 64) * 1));
    }

    public static ByteBuffer nScalingListDCCoef16x16(long struct) {
        return MemoryUtil.memByteBuffer(struct + SCALINGLISTDCCOEF16X16, 6);
    }

    public static byte nScalingListDCCoef16x16(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SCALINGLISTDCCOEF16X16 + (Checks.check(index, 6) * 1));
    }

    public static ByteBuffer nScalingListDCCoef32x32(long struct) {
        return MemoryUtil.memByteBuffer(struct + SCALINGLISTDCCOEF32X32, 2);
    }

    public static byte nScalingListDCCoef32x32(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SCALINGLISTDCCOEF32X32 + (Checks.check(index, 2) * 1));
    }

    public static void nScalingList4x4(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 16);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SCALINGLIST4X4, value.remaining() * 1);
    }

    public static void nScalingList4x4(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SCALINGLIST4X4 + (Checks.check(index, 16) * 1), value);
    }

    public static void nScalingList8x8(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 64);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SCALINGLIST8X8, value.remaining() * 1);
    }

    public static void nScalingList8x8(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SCALINGLIST8X8 + (Checks.check(index, 64) * 1), value);
    }

    public static void nScalingList16x16(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 64);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SCALINGLIST16X16, value.remaining() * 1);
    }

    public static void nScalingList16x16(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SCALINGLIST16X16 + (Checks.check(index, 64) * 1), value);
    }

    public static void nScalingList32x32(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 64);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SCALINGLIST32X32, value.remaining() * 1);
    }

    public static void nScalingList32x32(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SCALINGLIST32X32 + (Checks.check(index, 64) * 1), value);
    }

    public static void nScalingListDCCoef16x16(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 6);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SCALINGLISTDCCOEF16X16, value.remaining() * 1);
    }

    public static void nScalingListDCCoef16x16(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SCALINGLISTDCCOEF16X16 + (Checks.check(index, 6) * 1), value);
    }

    public static void nScalingListDCCoef32x32(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SCALINGLISTDCCOEF32X32, value.remaining() * 1);
    }

    public static void nScalingListDCCoef32x32(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SCALINGLISTDCCOEF32X32 + (Checks.check(index, 2) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ScalingLists$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ScalingLists$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265ScalingLists, Buffer> implements NativeResource {
        private static final StdVideoH265ScalingLists ELEMENT_FACTORY = StdVideoH265ScalingLists.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265ScalingLists.SIZEOF);
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
        public StdVideoH265ScalingLists getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]")
        public ByteBuffer ScalingList4x4() {
            return StdVideoH265ScalingLists.nScalingList4x4(address());
        }

        @NativeType("uint8_t")
        public byte ScalingList4x4(int index) {
            return StdVideoH265ScalingLists.nScalingList4x4(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]")
        public ByteBuffer ScalingList8x8() {
            return StdVideoH265ScalingLists.nScalingList8x8(address());
        }

        @NativeType("uint8_t")
        public byte ScalingList8x8(int index) {
            return StdVideoH265ScalingLists.nScalingList8x8(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]")
        public ByteBuffer ScalingList16x16() {
            return StdVideoH265ScalingLists.nScalingList16x16(address());
        }

        @NativeType("uint8_t")
        public byte ScalingList16x16(int index) {
            return StdVideoH265ScalingLists.nScalingList16x16(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]")
        public ByteBuffer ScalingList32x32() {
            return StdVideoH265ScalingLists.nScalingList32x32(address());
        }

        @NativeType("uint8_t")
        public byte ScalingList32x32(int index) {
            return StdVideoH265ScalingLists.nScalingList32x32(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]")
        public ByteBuffer ScalingListDCCoef16x16() {
            return StdVideoH265ScalingLists.nScalingListDCCoef16x16(address());
        }

        @NativeType("uint8_t")
        public byte ScalingListDCCoef16x16(int index) {
            return StdVideoH265ScalingLists.nScalingListDCCoef16x16(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]")
        public ByteBuffer ScalingListDCCoef32x32() {
            return StdVideoH265ScalingLists.nScalingListDCCoef32x32(address());
        }

        @NativeType("uint8_t")
        public byte ScalingListDCCoef32x32(int index) {
            return StdVideoH265ScalingLists.nScalingListDCCoef32x32(address(), index);
        }

        public Buffer ScalingList4x4(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]") ByteBuffer value) {
            StdVideoH265ScalingLists.nScalingList4x4(address(), value);
            return this;
        }

        public Buffer ScalingList4x4(int index, @NativeType("uint8_t") byte value) {
            StdVideoH265ScalingLists.nScalingList4x4(address(), index, value);
            return this;
        }

        public Buffer ScalingList8x8(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]") ByteBuffer value) {
            StdVideoH265ScalingLists.nScalingList8x8(address(), value);
            return this;
        }

        public Buffer ScalingList8x8(int index, @NativeType("uint8_t") byte value) {
            StdVideoH265ScalingLists.nScalingList8x8(address(), index, value);
            return this;
        }

        public Buffer ScalingList16x16(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]") ByteBuffer value) {
            StdVideoH265ScalingLists.nScalingList16x16(address(), value);
            return this;
        }

        public Buffer ScalingList16x16(int index, @NativeType("uint8_t") byte value) {
            StdVideoH265ScalingLists.nScalingList16x16(address(), index, value);
            return this;
        }

        public Buffer ScalingList32x32(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]") ByteBuffer value) {
            StdVideoH265ScalingLists.nScalingList32x32(address(), value);
            return this;
        }

        public Buffer ScalingList32x32(int index, @NativeType("uint8_t") byte value) {
            StdVideoH265ScalingLists.nScalingList32x32(address(), index, value);
            return this;
        }

        public Buffer ScalingListDCCoef16x16(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]") ByteBuffer value) {
            StdVideoH265ScalingLists.nScalingListDCCoef16x16(address(), value);
            return this;
        }

        public Buffer ScalingListDCCoef16x16(int index, @NativeType("uint8_t") byte value) {
            StdVideoH265ScalingLists.nScalingListDCCoef16x16(address(), index, value);
            return this;
        }

        public Buffer ScalingListDCCoef32x32(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]") ByteBuffer value) {
            StdVideoH265ScalingLists.nScalingListDCCoef32x32(address(), value);
            return this;
        }

        public Buffer ScalingListDCCoef32x32(int index, @NativeType("uint8_t") byte value) {
            StdVideoH265ScalingLists.nScalingListDCCoef32x32(address(), index, value);
            return this;
        }
    }
}
