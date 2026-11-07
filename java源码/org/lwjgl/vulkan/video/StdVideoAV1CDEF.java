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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1CDEF.class */
public class StdVideoAV1CDEF extends Struct<StdVideoAV1CDEF> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CDEF_DAMPING_MINUS_3;
    public static final int CDEF_BITS;
    public static final int CDEF_Y_PRI_STRENGTH;
    public static final int CDEF_Y_SEC_STRENGTH;
    public static final int CDEF_UV_PRI_STRENGTH;
    public static final int CDEF_UV_SEC_STRENGTH;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __array(1, 8), __array(1, 8), __array(1, 8), __array(1, 8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CDEF_DAMPING_MINUS_3 = layout.offsetof(0);
        CDEF_BITS = layout.offsetof(1);
        CDEF_Y_PRI_STRENGTH = layout.offsetof(2);
        CDEF_Y_SEC_STRENGTH = layout.offsetof(3);
        CDEF_UV_PRI_STRENGTH = layout.offsetof(4);
        CDEF_UV_SEC_STRENGTH = layout.offsetof(5);
    }

    protected StdVideoAV1CDEF(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1CDEF create(long address, ByteBuffer container) {
        return new StdVideoAV1CDEF(address, container);
    }

    public StdVideoAV1CDEF(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t")
    public byte cdef_damping_minus_3() {
        return ncdef_damping_minus_3(address());
    }

    @NativeType("uint8_t")
    public byte cdef_bits() {
        return ncdef_bits(address());
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public ByteBuffer cdef_y_pri_strength() {
        return ncdef_y_pri_strength(address());
    }

    @NativeType("uint8_t")
    public byte cdef_y_pri_strength(int index) {
        return ncdef_y_pri_strength(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public ByteBuffer cdef_y_sec_strength() {
        return ncdef_y_sec_strength(address());
    }

    @NativeType("uint8_t")
    public byte cdef_y_sec_strength(int index) {
        return ncdef_y_sec_strength(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public ByteBuffer cdef_uv_pri_strength() {
        return ncdef_uv_pri_strength(address());
    }

    @NativeType("uint8_t")
    public byte cdef_uv_pri_strength(int index) {
        return ncdef_uv_pri_strength(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public ByteBuffer cdef_uv_sec_strength() {
        return ncdef_uv_sec_strength(address());
    }

    @NativeType("uint8_t")
    public byte cdef_uv_sec_strength(int index) {
        return ncdef_uv_sec_strength(address(), index);
    }

    public StdVideoAV1CDEF cdef_damping_minus_3(@NativeType("uint8_t") byte value) {
        ncdef_damping_minus_3(address(), value);
        return this;
    }

    public StdVideoAV1CDEF cdef_bits(@NativeType("uint8_t") byte value) {
        ncdef_bits(address(), value);
        return this;
    }

    public StdVideoAV1CDEF cdef_y_pri_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) {
        ncdef_y_pri_strength(address(), value);
        return this;
    }

    public StdVideoAV1CDEF cdef_y_pri_strength(int index, @NativeType("uint8_t") byte value) {
        ncdef_y_pri_strength(address(), index, value);
        return this;
    }

    public StdVideoAV1CDEF cdef_y_sec_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) {
        ncdef_y_sec_strength(address(), value);
        return this;
    }

    public StdVideoAV1CDEF cdef_y_sec_strength(int index, @NativeType("uint8_t") byte value) {
        ncdef_y_sec_strength(address(), index, value);
        return this;
    }

    public StdVideoAV1CDEF cdef_uv_pri_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) {
        ncdef_uv_pri_strength(address(), value);
        return this;
    }

    public StdVideoAV1CDEF cdef_uv_pri_strength(int index, @NativeType("uint8_t") byte value) {
        ncdef_uv_pri_strength(address(), index, value);
        return this;
    }

    public StdVideoAV1CDEF cdef_uv_sec_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) {
        ncdef_uv_sec_strength(address(), value);
        return this;
    }

    public StdVideoAV1CDEF cdef_uv_sec_strength(int index, @NativeType("uint8_t") byte value) {
        ncdef_uv_sec_strength(address(), index, value);
        return this;
    }

    public StdVideoAV1CDEF set(byte cdef_damping_minus_3, byte cdef_bits, ByteBuffer cdef_y_pri_strength, ByteBuffer cdef_y_sec_strength, ByteBuffer cdef_uv_pri_strength, ByteBuffer cdef_uv_sec_strength) {
        cdef_damping_minus_3(cdef_damping_minus_3);
        cdef_bits(cdef_bits);
        cdef_y_pri_strength(cdef_y_pri_strength);
        cdef_y_sec_strength(cdef_y_sec_strength);
        cdef_uv_pri_strength(cdef_uv_pri_strength);
        cdef_uv_sec_strength(cdef_uv_sec_strength);
        return this;
    }

    public StdVideoAV1CDEF set(StdVideoAV1CDEF src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1CDEF malloc() {
        return new StdVideoAV1CDEF(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1CDEF calloc() {
        return new StdVideoAV1CDEF(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1CDEF create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1CDEF(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1CDEF create(long address) {
        return new StdVideoAV1CDEF(address, null);
    }

    public static StdVideoAV1CDEF createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1CDEF(address, null);
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

    public static StdVideoAV1CDEF malloc(MemoryStack stack) {
        return new StdVideoAV1CDEF(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1CDEF calloc(MemoryStack stack) {
        return new StdVideoAV1CDEF(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte ncdef_damping_minus_3(long struct) {
        return MemoryUtil.memGetByte(struct + CDEF_DAMPING_MINUS_3);
    }

    public static byte ncdef_bits(long struct) {
        return MemoryUtil.memGetByte(struct + CDEF_BITS);
    }

    public static ByteBuffer ncdef_y_pri_strength(long struct) {
        return MemoryUtil.memByteBuffer(struct + CDEF_Y_PRI_STRENGTH, 8);
    }

    public static byte ncdef_y_pri_strength(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CDEF_Y_PRI_STRENGTH + (Checks.check(index, 8) * 1));
    }

    public static ByteBuffer ncdef_y_sec_strength(long struct) {
        return MemoryUtil.memByteBuffer(struct + CDEF_Y_SEC_STRENGTH, 8);
    }

    public static byte ncdef_y_sec_strength(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CDEF_Y_SEC_STRENGTH + (Checks.check(index, 8) * 1));
    }

    public static ByteBuffer ncdef_uv_pri_strength(long struct) {
        return MemoryUtil.memByteBuffer(struct + CDEF_UV_PRI_STRENGTH, 8);
    }

    public static byte ncdef_uv_pri_strength(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CDEF_UV_PRI_STRENGTH + (Checks.check(index, 8) * 1));
    }

    public static ByteBuffer ncdef_uv_sec_strength(long struct) {
        return MemoryUtil.memByteBuffer(struct + CDEF_UV_SEC_STRENGTH, 8);
    }

    public static byte ncdef_uv_sec_strength(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CDEF_UV_SEC_STRENGTH + (Checks.check(index, 8) * 1));
    }

    public static void ncdef_damping_minus_3(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CDEF_DAMPING_MINUS_3, value);
    }

    public static void ncdef_bits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CDEF_BITS, value);
    }

    public static void ncdef_y_pri_strength(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CDEF_Y_PRI_STRENGTH, value.remaining() * 1);
    }

    public static void ncdef_y_pri_strength(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CDEF_Y_PRI_STRENGTH + (Checks.check(index, 8) * 1), value);
    }

    public static void ncdef_y_sec_strength(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CDEF_Y_SEC_STRENGTH, value.remaining() * 1);
    }

    public static void ncdef_y_sec_strength(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CDEF_Y_SEC_STRENGTH + (Checks.check(index, 8) * 1), value);
    }

    public static void ncdef_uv_pri_strength(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CDEF_UV_PRI_STRENGTH, value.remaining() * 1);
    }

    public static void ncdef_uv_pri_strength(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CDEF_UV_PRI_STRENGTH + (Checks.check(index, 8) * 1), value);
    }

    public static void ncdef_uv_sec_strength(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CDEF_UV_SEC_STRENGTH, value.remaining() * 1);
    }

    public static void ncdef_uv_sec_strength(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CDEF_UV_SEC_STRENGTH + (Checks.check(index, 8) * 1), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1CDEF$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1CDEF, Buffer> implements NativeResource {
        private static final StdVideoAV1CDEF ELEMENT_FACTORY = StdVideoAV1CDEF.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1CDEF.SIZEOF);
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
        public StdVideoAV1CDEF getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t")
        public byte cdef_damping_minus_3() {
            return StdVideoAV1CDEF.ncdef_damping_minus_3(address());
        }

        @NativeType("uint8_t")
        public byte cdef_bits() {
            return StdVideoAV1CDEF.ncdef_bits(address());
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public ByteBuffer cdef_y_pri_strength() {
            return StdVideoAV1CDEF.ncdef_y_pri_strength(address());
        }

        @NativeType("uint8_t")
        public byte cdef_y_pri_strength(int index) {
            return StdVideoAV1CDEF.ncdef_y_pri_strength(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public ByteBuffer cdef_y_sec_strength() {
            return StdVideoAV1CDEF.ncdef_y_sec_strength(address());
        }

        @NativeType("uint8_t")
        public byte cdef_y_sec_strength(int index) {
            return StdVideoAV1CDEF.ncdef_y_sec_strength(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public ByteBuffer cdef_uv_pri_strength() {
            return StdVideoAV1CDEF.ncdef_uv_pri_strength(address());
        }

        @NativeType("uint8_t")
        public byte cdef_uv_pri_strength(int index) {
            return StdVideoAV1CDEF.ncdef_uv_pri_strength(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public ByteBuffer cdef_uv_sec_strength() {
            return StdVideoAV1CDEF.ncdef_uv_sec_strength(address());
        }

        @NativeType("uint8_t")
        public byte cdef_uv_sec_strength(int index) {
            return StdVideoAV1CDEF.ncdef_uv_sec_strength(address(), index);
        }

        public Buffer cdef_damping_minus_3(@NativeType("uint8_t") byte value) {
            StdVideoAV1CDEF.ncdef_damping_minus_3(address(), value);
            return this;
        }

        public Buffer cdef_bits(@NativeType("uint8_t") byte value) {
            StdVideoAV1CDEF.ncdef_bits(address(), value);
            return this;
        }

        public Buffer cdef_y_pri_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) {
            StdVideoAV1CDEF.ncdef_y_pri_strength(address(), value);
            return this;
        }

        public Buffer cdef_y_pri_strength(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1CDEF.ncdef_y_pri_strength(address(), index, value);
            return this;
        }

        public Buffer cdef_y_sec_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) {
            StdVideoAV1CDEF.ncdef_y_sec_strength(address(), value);
            return this;
        }

        public Buffer cdef_y_sec_strength(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1CDEF.ncdef_y_sec_strength(address(), index, value);
            return this;
        }

        public Buffer cdef_uv_pri_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) {
            StdVideoAV1CDEF.ncdef_uv_pri_strength(address(), value);
            return this;
        }

        public Buffer cdef_uv_pri_strength(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1CDEF.ncdef_uv_pri_strength(address(), index, value);
            return this;
        }

        public Buffer cdef_uv_sec_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) {
            StdVideoAV1CDEF.ncdef_uv_sec_strength(address(), value);
            return this;
        }

        public Buffer cdef_uv_sec_strength(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1CDEF.ncdef_uv_sec_strength(address(), index, value);
            return this;
        }
    }
}
