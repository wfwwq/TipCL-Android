package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264WeightTable.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264WeightTable.class */
public class StdVideoEncodeH264WeightTable extends Struct<StdVideoEncodeH264WeightTable> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int LUMA_LOG2_WEIGHT_DENOM;
    public static final int CHROMA_LOG2_WEIGHT_DENOM;
    public static final int LUMA_WEIGHT_L0;
    public static final int LUMA_OFFSET_L0;
    public static final int CHROMA_WEIGHT_L0;
    public static final int CHROMA_OFFSET_L0;
    public static final int LUMA_WEIGHT_L1;
    public static final int LUMA_OFFSET_L1;
    public static final int CHROMA_WEIGHT_L1;
    public static final int CHROMA_OFFSET_L1;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeH264WeightTableFlags.SIZEOF, StdVideoEncodeH264WeightTableFlags.ALIGNOF), __member(1), __member(1), __array(1, 32), __array(1, 32), __array(1, 2), __array(1, 2), __array(1, 32), __array(1, 32), __array(1, 2), __array(1, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        LUMA_LOG2_WEIGHT_DENOM = layout.offsetof(1);
        CHROMA_LOG2_WEIGHT_DENOM = layout.offsetof(2);
        LUMA_WEIGHT_L0 = layout.offsetof(3);
        LUMA_OFFSET_L0 = layout.offsetof(4);
        CHROMA_WEIGHT_L0 = layout.offsetof(5);
        CHROMA_OFFSET_L0 = layout.offsetof(6);
        LUMA_WEIGHT_L1 = layout.offsetof(7);
        LUMA_OFFSET_L1 = layout.offsetof(8);
        CHROMA_WEIGHT_L1 = layout.offsetof(9);
        CHROMA_OFFSET_L1 = layout.offsetof(10);
    }

    protected StdVideoEncodeH264WeightTable(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264WeightTable create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264WeightTable(address, container);
    }

    public StdVideoEncodeH264WeightTable(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeH264WeightTableFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte luma_log2_weight_denom() {
        return nluma_log2_weight_denom(address());
    }

    @NativeType("uint8_t")
    public byte chroma_log2_weight_denom() {
        return nchroma_log2_weight_denom(address());
    }

    @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_weight_l0() {
        return nluma_weight_l0(address());
    }

    @NativeType("int8_t")
    public byte luma_weight_l0(int index) {
        return nluma_weight_l0(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_offset_l0() {
        return nluma_offset_l0(address());
    }

    @NativeType("int8_t")
    public byte luma_offset_l0(int index) {
        return nluma_offset_l0(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
    public ByteBuffer chroma_weight_l0() {
        return nchroma_weight_l0(address());
    }

    @NativeType("int8_t")
    public byte chroma_weight_l0(int index) {
        return nchroma_weight_l0(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
    public ByteBuffer chroma_offset_l0() {
        return nchroma_offset_l0(address());
    }

    @NativeType("int8_t")
    public byte chroma_offset_l0(int index) {
        return nchroma_offset_l0(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_weight_l1() {
        return nluma_weight_l1(address());
    }

    @NativeType("int8_t")
    public byte luma_weight_l1(int index) {
        return nluma_weight_l1(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_offset_l1() {
        return nluma_offset_l1(address());
    }

    @NativeType("int8_t")
    public byte luma_offset_l1(int index) {
        return nluma_offset_l1(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
    public ByteBuffer chroma_weight_l1() {
        return nchroma_weight_l1(address());
    }

    @NativeType("int8_t")
    public byte chroma_weight_l1(int index) {
        return nchroma_weight_l1(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
    public ByteBuffer chroma_offset_l1() {
        return nchroma_offset_l1(address());
    }

    @NativeType("int8_t")
    public byte chroma_offset_l1(int index) {
        return nchroma_offset_l1(address(), index);
    }

    public StdVideoEncodeH264WeightTable flags(StdVideoEncodeH264WeightTableFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable flags(Consumer<StdVideoEncodeH264WeightTableFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeH264WeightTable luma_log2_weight_denom(@NativeType("uint8_t") byte value) {
        nluma_log2_weight_denom(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable chroma_log2_weight_denom(@NativeType("uint8_t") byte value) {
        nchroma_log2_weight_denom(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable luma_weight_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nluma_weight_l0(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable luma_weight_l0(int index, @NativeType("int8_t") byte value) {
        nluma_weight_l0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH264WeightTable luma_offset_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nluma_offset_l0(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable luma_offset_l0(int index, @NativeType("int8_t") byte value) {
        nluma_offset_l0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH264WeightTable chroma_weight_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) {
        nchroma_weight_l0(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable chroma_weight_l0(int index, @NativeType("int8_t") byte value) {
        nchroma_weight_l0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH264WeightTable chroma_offset_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) {
        nchroma_offset_l0(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable chroma_offset_l0(int index, @NativeType("int8_t") byte value) {
        nchroma_offset_l0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH264WeightTable luma_weight_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nluma_weight_l1(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable luma_weight_l1(int index, @NativeType("int8_t") byte value) {
        nluma_weight_l1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH264WeightTable luma_offset_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nluma_offset_l1(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable luma_offset_l1(int index, @NativeType("int8_t") byte value) {
        nluma_offset_l1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH264WeightTable chroma_weight_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) {
        nchroma_weight_l1(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable chroma_weight_l1(int index, @NativeType("int8_t") byte value) {
        nchroma_weight_l1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH264WeightTable chroma_offset_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) {
        nchroma_offset_l1(address(), value);
        return this;
    }

    public StdVideoEncodeH264WeightTable chroma_offset_l1(int index, @NativeType("int8_t") byte value) {
        nchroma_offset_l1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH264WeightTable set(StdVideoEncodeH264WeightTableFlags flags, byte luma_log2_weight_denom, byte chroma_log2_weight_denom, ByteBuffer luma_weight_l0, ByteBuffer luma_offset_l0, ByteBuffer chroma_weight_l0, ByteBuffer chroma_offset_l0, ByteBuffer luma_weight_l1, ByteBuffer luma_offset_l1, ByteBuffer chroma_weight_l1, ByteBuffer chroma_offset_l1) {
        flags(flags);
        luma_log2_weight_denom(luma_log2_weight_denom);
        chroma_log2_weight_denom(chroma_log2_weight_denom);
        luma_weight_l0(luma_weight_l0);
        luma_offset_l0(luma_offset_l0);
        chroma_weight_l0(chroma_weight_l0);
        chroma_offset_l0(chroma_offset_l0);
        luma_weight_l1(luma_weight_l1);
        luma_offset_l1(luma_offset_l1);
        chroma_weight_l1(chroma_weight_l1);
        chroma_offset_l1(chroma_offset_l1);
        return this;
    }

    public StdVideoEncodeH264WeightTable set(StdVideoEncodeH264WeightTable src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264WeightTable malloc() {
        return new StdVideoEncodeH264WeightTable(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264WeightTable calloc() {
        return new StdVideoEncodeH264WeightTable(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264WeightTable create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264WeightTable(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264WeightTable create(long address) {
        return new StdVideoEncodeH264WeightTable(address, null);
    }

    public static StdVideoEncodeH264WeightTable createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264WeightTable(address, null);
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

    public static StdVideoEncodeH264WeightTable malloc(MemoryStack stack) {
        return new StdVideoEncodeH264WeightTable(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264WeightTable calloc(MemoryStack stack) {
        return new StdVideoEncodeH264WeightTable(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeH264WeightTableFlags nflags(long struct) {
        return StdVideoEncodeH264WeightTableFlags.create(struct + FLAGS);
    }

    public static byte nluma_log2_weight_denom(long struct) {
        return MemoryUtil.memGetByte(struct + LUMA_LOG2_WEIGHT_DENOM);
    }

    public static byte nchroma_log2_weight_denom(long struct) {
        return MemoryUtil.memGetByte(struct + CHROMA_LOG2_WEIGHT_DENOM);
    }

    public static ByteBuffer nluma_weight_l0(long struct) {
        return MemoryUtil.memByteBuffer(struct + LUMA_WEIGHT_L0, 32);
    }

    public static byte nluma_weight_l0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LUMA_WEIGHT_L0 + (Checks.check(index, 32) * 1));
    }

    public static ByteBuffer nluma_offset_l0(long struct) {
        return MemoryUtil.memByteBuffer(struct + LUMA_OFFSET_L0, 32);
    }

    public static byte nluma_offset_l0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LUMA_OFFSET_L0 + (Checks.check(index, 32) * 1));
    }

    public static ByteBuffer nchroma_weight_l0(long struct) {
        return MemoryUtil.memByteBuffer(struct + CHROMA_WEIGHT_L0, 2);
    }

    public static byte nchroma_weight_l0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CHROMA_WEIGHT_L0 + (Checks.check(index, 2) * 1));
    }

    public static ByteBuffer nchroma_offset_l0(long struct) {
        return MemoryUtil.memByteBuffer(struct + CHROMA_OFFSET_L0, 2);
    }

    public static byte nchroma_offset_l0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CHROMA_OFFSET_L0 + (Checks.check(index, 2) * 1));
    }

    public static ByteBuffer nluma_weight_l1(long struct) {
        return MemoryUtil.memByteBuffer(struct + LUMA_WEIGHT_L1, 32);
    }

    public static byte nluma_weight_l1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LUMA_WEIGHT_L1 + (Checks.check(index, 32) * 1));
    }

    public static ByteBuffer nluma_offset_l1(long struct) {
        return MemoryUtil.memByteBuffer(struct + LUMA_OFFSET_L1, 32);
    }

    public static byte nluma_offset_l1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LUMA_OFFSET_L1 + (Checks.check(index, 32) * 1));
    }

    public static ByteBuffer nchroma_weight_l1(long struct) {
        return MemoryUtil.memByteBuffer(struct + CHROMA_WEIGHT_L1, 2);
    }

    public static byte nchroma_weight_l1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CHROMA_WEIGHT_L1 + (Checks.check(index, 2) * 1));
    }

    public static ByteBuffer nchroma_offset_l1(long struct) {
        return MemoryUtil.memByteBuffer(struct + CHROMA_OFFSET_L1, 2);
    }

    public static byte nchroma_offset_l1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CHROMA_OFFSET_L1 + (Checks.check(index, 2) * 1));
    }

    public static void nflags(long struct, StdVideoEncodeH264WeightTableFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeH264WeightTableFlags.SIZEOF);
    }

    public static void nluma_log2_weight_denom(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LUMA_LOG2_WEIGHT_DENOM, value);
    }

    public static void nchroma_log2_weight_denom(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_LOG2_WEIGHT_DENOM, value);
    }

    public static void nluma_weight_l0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LUMA_WEIGHT_L0, value.remaining() * 1);
    }

    public static void nluma_weight_l0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LUMA_WEIGHT_L0 + (Checks.check(index, 32) * 1), value);
    }

    public static void nluma_offset_l0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LUMA_OFFSET_L0, value.remaining() * 1);
    }

    public static void nluma_offset_l0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LUMA_OFFSET_L0 + (Checks.check(index, 32) * 1), value);
    }

    public static void nchroma_weight_l0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CHROMA_WEIGHT_L0, value.remaining() * 1);
    }

    public static void nchroma_weight_l0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_WEIGHT_L0 + (Checks.check(index, 2) * 1), value);
    }

    public static void nchroma_offset_l0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CHROMA_OFFSET_L0, value.remaining() * 1);
    }

    public static void nchroma_offset_l0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_OFFSET_L0 + (Checks.check(index, 2) * 1), value);
    }

    public static void nluma_weight_l1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LUMA_WEIGHT_L1, value.remaining() * 1);
    }

    public static void nluma_weight_l1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LUMA_WEIGHT_L1 + (Checks.check(index, 32) * 1), value);
    }

    public static void nluma_offset_l1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LUMA_OFFSET_L1, value.remaining() * 1);
    }

    public static void nluma_offset_l1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LUMA_OFFSET_L1 + (Checks.check(index, 32) * 1), value);
    }

    public static void nchroma_weight_l1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CHROMA_WEIGHT_L1, value.remaining() * 1);
    }

    public static void nchroma_weight_l1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_WEIGHT_L1 + (Checks.check(index, 2) * 1), value);
    }

    public static void nchroma_offset_l1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CHROMA_OFFSET_L1, value.remaining() * 1);
    }

    public static void nchroma_offset_l1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CHROMA_OFFSET_L1 + (Checks.check(index, 2) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264WeightTable$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264WeightTable$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264WeightTable, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264WeightTable ELEMENT_FACTORY = StdVideoEncodeH264WeightTable.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264WeightTable.SIZEOF);
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
        public StdVideoEncodeH264WeightTable getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeH264WeightTableFlags flags() {
            return StdVideoEncodeH264WeightTable.nflags(address());
        }

        @NativeType("uint8_t")
        public byte luma_log2_weight_denom() {
            return StdVideoEncodeH264WeightTable.nluma_log2_weight_denom(address());
        }

        @NativeType("uint8_t")
        public byte chroma_log2_weight_denom() {
            return StdVideoEncodeH264WeightTable.nchroma_log2_weight_denom(address());
        }

        @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_weight_l0() {
            return StdVideoEncodeH264WeightTable.nluma_weight_l0(address());
        }

        @NativeType("int8_t")
        public byte luma_weight_l0(int index) {
            return StdVideoEncodeH264WeightTable.nluma_weight_l0(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_offset_l0() {
            return StdVideoEncodeH264WeightTable.nluma_offset_l0(address());
        }

        @NativeType("int8_t")
        public byte luma_offset_l0(int index) {
            return StdVideoEncodeH264WeightTable.nluma_offset_l0(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
        public ByteBuffer chroma_weight_l0() {
            return StdVideoEncodeH264WeightTable.nchroma_weight_l0(address());
        }

        @NativeType("int8_t")
        public byte chroma_weight_l0(int index) {
            return StdVideoEncodeH264WeightTable.nchroma_weight_l0(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
        public ByteBuffer chroma_offset_l0() {
            return StdVideoEncodeH264WeightTable.nchroma_offset_l0(address());
        }

        @NativeType("int8_t")
        public byte chroma_offset_l0(int index) {
            return StdVideoEncodeH264WeightTable.nchroma_offset_l0(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_weight_l1() {
            return StdVideoEncodeH264WeightTable.nluma_weight_l1(address());
        }

        @NativeType("int8_t")
        public byte luma_weight_l1(int index) {
            return StdVideoEncodeH264WeightTable.nluma_weight_l1(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_offset_l1() {
            return StdVideoEncodeH264WeightTable.nluma_offset_l1(address());
        }

        @NativeType("int8_t")
        public byte luma_offset_l1(int index) {
            return StdVideoEncodeH264WeightTable.nluma_offset_l1(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
        public ByteBuffer chroma_weight_l1() {
            return StdVideoEncodeH264WeightTable.nchroma_weight_l1(address());
        }

        @NativeType("int8_t")
        public byte chroma_weight_l1(int index) {
            return StdVideoEncodeH264WeightTable.nchroma_weight_l1(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
        public ByteBuffer chroma_offset_l1() {
            return StdVideoEncodeH264WeightTable.nchroma_offset_l1(address());
        }

        @NativeType("int8_t")
        public byte chroma_offset_l1(int index) {
            return StdVideoEncodeH264WeightTable.nchroma_offset_l1(address(), index);
        }

        public Buffer flags(StdVideoEncodeH264WeightTableFlags value) {
            StdVideoEncodeH264WeightTable.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeH264WeightTableFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer luma_log2_weight_denom(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH264WeightTable.nluma_log2_weight_denom(address(), value);
            return this;
        }

        public Buffer chroma_log2_weight_denom(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH264WeightTable.nchroma_log2_weight_denom(address(), value);
            return this;
        }

        public Buffer luma_weight_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH264WeightTable.nluma_weight_l0(address(), value);
            return this;
        }

        public Buffer luma_weight_l0(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH264WeightTable.nluma_weight_l0(address(), index, value);
            return this;
        }

        public Buffer luma_offset_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH264WeightTable.nluma_offset_l0(address(), value);
            return this;
        }

        public Buffer luma_offset_l0(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH264WeightTable.nluma_offset_l0(address(), index, value);
            return this;
        }

        public Buffer chroma_weight_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) {
            StdVideoEncodeH264WeightTable.nchroma_weight_l0(address(), value);
            return this;
        }

        public Buffer chroma_weight_l0(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH264WeightTable.nchroma_weight_l0(address(), index, value);
            return this;
        }

        public Buffer chroma_offset_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) {
            StdVideoEncodeH264WeightTable.nchroma_offset_l0(address(), value);
            return this;
        }

        public Buffer chroma_offset_l0(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH264WeightTable.nchroma_offset_l0(address(), index, value);
            return this;
        }

        public Buffer luma_weight_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH264WeightTable.nluma_weight_l1(address(), value);
            return this;
        }

        public Buffer luma_weight_l1(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH264WeightTable.nluma_weight_l1(address(), index, value);
            return this;
        }

        public Buffer luma_offset_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH264WeightTable.nluma_offset_l1(address(), value);
            return this;
        }

        public Buffer luma_offset_l1(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH264WeightTable.nluma_offset_l1(address(), index, value);
            return this;
        }

        public Buffer chroma_weight_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) {
            StdVideoEncodeH264WeightTable.nchroma_weight_l1(address(), value);
            return this;
        }

        public Buffer chroma_weight_l1(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH264WeightTable.nchroma_weight_l1(address(), index, value);
            return this;
        }

        public Buffer chroma_offset_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) {
            StdVideoEncodeH264WeightTable.nchroma_offset_l1(address(), value);
            return this;
        }

        public Buffer chroma_offset_l1(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH264WeightTable.nchroma_offset_l1(address(), index, value);
            return this;
        }
    }
}
