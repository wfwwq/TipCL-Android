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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264ScalingLists.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264ScalingLists.class */
public class StdVideoH264ScalingLists extends Struct<StdVideoH264ScalingLists> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SCALING_LIST_PRESENT_MASK;
    public static final int USE_DEFAULT_SCALING_MATRIX_MASK;
    public static final int SCALINGLIST4X4;
    public static final int SCALINGLIST8X8;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __array(1, 16), __array(1, 64));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SCALING_LIST_PRESENT_MASK = layout.offsetof(0);
        USE_DEFAULT_SCALING_MATRIX_MASK = layout.offsetof(1);
        SCALINGLIST4X4 = layout.offsetof(2);
        SCALINGLIST8X8 = layout.offsetof(3);
    }

    protected StdVideoH264ScalingLists(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH264ScalingLists create(long address, ByteBuffer container) {
        return new StdVideoH264ScalingLists(address, container);
    }

    public StdVideoH264ScalingLists(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint16_t")
    public short scaling_list_present_mask() {
        return nscaling_list_present_mask(address());
    }

    @NativeType("uint16_t")
    public short use_default_scaling_matrix_mask() {
        return nuse_default_scaling_matrix_mask(address());
    }

    @NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS]")
    public ByteBuffer ScalingList4x4() {
        return nScalingList4x4(address());
    }

    @NativeType("uint8_t")
    public byte ScalingList4x4(int index) {
        return nScalingList4x4(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS]")
    public ByteBuffer ScalingList8x8() {
        return nScalingList8x8(address());
    }

    @NativeType("uint8_t")
    public byte ScalingList8x8(int index) {
        return nScalingList8x8(address(), index);
    }

    public StdVideoH264ScalingLists scaling_list_present_mask(@NativeType("uint16_t") short value) {
        nscaling_list_present_mask(address(), value);
        return this;
    }

    public StdVideoH264ScalingLists use_default_scaling_matrix_mask(@NativeType("uint16_t") short value) {
        nuse_default_scaling_matrix_mask(address(), value);
        return this;
    }

    public StdVideoH264ScalingLists ScalingList4x4(@NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS]") ByteBuffer value) {
        nScalingList4x4(address(), value);
        return this;
    }

    public StdVideoH264ScalingLists ScalingList4x4(int index, @NativeType("uint8_t") byte value) {
        nScalingList4x4(address(), index, value);
        return this;
    }

    public StdVideoH264ScalingLists ScalingList8x8(@NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS]") ByteBuffer value) {
        nScalingList8x8(address(), value);
        return this;
    }

    public StdVideoH264ScalingLists ScalingList8x8(int index, @NativeType("uint8_t") byte value) {
        nScalingList8x8(address(), index, value);
        return this;
    }

    public StdVideoH264ScalingLists set(short scaling_list_present_mask, short use_default_scaling_matrix_mask, ByteBuffer ScalingList4x4, ByteBuffer ScalingList8x8) {
        scaling_list_present_mask(scaling_list_present_mask);
        use_default_scaling_matrix_mask(use_default_scaling_matrix_mask);
        ScalingList4x4(ScalingList4x4);
        ScalingList8x8(ScalingList8x8);
        return this;
    }

    public StdVideoH264ScalingLists set(StdVideoH264ScalingLists src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH264ScalingLists malloc() {
        return new StdVideoH264ScalingLists(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH264ScalingLists calloc() {
        return new StdVideoH264ScalingLists(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH264ScalingLists create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH264ScalingLists(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH264ScalingLists create(long address) {
        return new StdVideoH264ScalingLists(address, null);
    }

    public static StdVideoH264ScalingLists createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH264ScalingLists(address, null);
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

    public static StdVideoH264ScalingLists malloc(MemoryStack stack) {
        return new StdVideoH264ScalingLists(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH264ScalingLists calloc(MemoryStack stack) {
        return new StdVideoH264ScalingLists(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nscaling_list_present_mask(long struct) {
        return MemoryUtil.memGetShort(struct + SCALING_LIST_PRESENT_MASK);
    }

    public static short nuse_default_scaling_matrix_mask(long struct) {
        return MemoryUtil.memGetShort(struct + USE_DEFAULT_SCALING_MATRIX_MASK);
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

    public static void nscaling_list_present_mask(long struct, short value) {
        MemoryUtil.memPutShort(struct + SCALING_LIST_PRESENT_MASK, value);
    }

    public static void nuse_default_scaling_matrix_mask(long struct, short value) {
        MemoryUtil.memPutShort(struct + USE_DEFAULT_SCALING_MATRIX_MASK, value);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264ScalingLists$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264ScalingLists$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH264ScalingLists, Buffer> implements NativeResource {
        private static final StdVideoH264ScalingLists ELEMENT_FACTORY = StdVideoH264ScalingLists.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH264ScalingLists.SIZEOF);
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
        public StdVideoH264ScalingLists getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint16_t")
        public short scaling_list_present_mask() {
            return StdVideoH264ScalingLists.nscaling_list_present_mask(address());
        }

        @NativeType("uint16_t")
        public short use_default_scaling_matrix_mask() {
            return StdVideoH264ScalingLists.nuse_default_scaling_matrix_mask(address());
        }

        @NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS]")
        public ByteBuffer ScalingList4x4() {
            return StdVideoH264ScalingLists.nScalingList4x4(address());
        }

        @NativeType("uint8_t")
        public byte ScalingList4x4(int index) {
            return StdVideoH264ScalingLists.nScalingList4x4(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS]")
        public ByteBuffer ScalingList8x8() {
            return StdVideoH264ScalingLists.nScalingList8x8(address());
        }

        @NativeType("uint8_t")
        public byte ScalingList8x8(int index) {
            return StdVideoH264ScalingLists.nScalingList8x8(address(), index);
        }

        public Buffer scaling_list_present_mask(@NativeType("uint16_t") short value) {
            StdVideoH264ScalingLists.nscaling_list_present_mask(address(), value);
            return this;
        }

        public Buffer use_default_scaling_matrix_mask(@NativeType("uint16_t") short value) {
            StdVideoH264ScalingLists.nuse_default_scaling_matrix_mask(address(), value);
            return this;
        }

        public Buffer ScalingList4x4(@NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS]") ByteBuffer value) {
            StdVideoH264ScalingLists.nScalingList4x4(address(), value);
            return this;
        }

        public Buffer ScalingList4x4(int index, @NativeType("uint8_t") byte value) {
            StdVideoH264ScalingLists.nScalingList4x4(address(), index, value);
            return this;
        }

        public Buffer ScalingList8x8(@NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS]") ByteBuffer value) {
            StdVideoH264ScalingLists.nScalingList8x8(address(), value);
            return this;
        }

        public Buffer ScalingList8x8(int index, @NativeType("uint8_t") byte value) {
            StdVideoH264ScalingLists.nScalingList8x8(address(), index, value);
            return this;
        }
    }
}
