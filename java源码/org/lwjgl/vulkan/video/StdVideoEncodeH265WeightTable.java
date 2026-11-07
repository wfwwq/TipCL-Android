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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265WeightTable.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265WeightTable.class */
public class StdVideoEncodeH265WeightTable extends Struct<StdVideoEncodeH265WeightTable> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int LUMA_LOG2_WEIGHT_DENOM;
    public static final int DELTA_CHROMA_LOG2_WEIGHT_DENOM;
    public static final int DELTA_LUMA_WEIGHT_L0;
    public static final int LUMA_OFFSET_L0;
    public static final int DELTA_CHROMA_WEIGHT_L0;
    public static final int DELTA_CHROMA_OFFSET_L0;
    public static final int DELTA_LUMA_WEIGHT_L1;
    public static final int LUMA_OFFSET_L1;
    public static final int DELTA_CHROMA_WEIGHT_L1;
    public static final int DELTA_CHROMA_OFFSET_L1;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeH265WeightTableFlags.SIZEOF, StdVideoEncodeH265WeightTableFlags.ALIGNOF), __member(1), __member(1), __array(1, 15), __array(1, 15), __array(1, 2), __array(1, 2), __array(1, 15), __array(1, 15), __array(1, 2), __array(1, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        LUMA_LOG2_WEIGHT_DENOM = layout.offsetof(1);
        DELTA_CHROMA_LOG2_WEIGHT_DENOM = layout.offsetof(2);
        DELTA_LUMA_WEIGHT_L0 = layout.offsetof(3);
        LUMA_OFFSET_L0 = layout.offsetof(4);
        DELTA_CHROMA_WEIGHT_L0 = layout.offsetof(5);
        DELTA_CHROMA_OFFSET_L0 = layout.offsetof(6);
        DELTA_LUMA_WEIGHT_L1 = layout.offsetof(7);
        LUMA_OFFSET_L1 = layout.offsetof(8);
        DELTA_CHROMA_WEIGHT_L1 = layout.offsetof(9);
        DELTA_CHROMA_OFFSET_L1 = layout.offsetof(10);
    }

    protected StdVideoEncodeH265WeightTable(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH265WeightTable create(long address, ByteBuffer container) {
        return new StdVideoEncodeH265WeightTable(address, container);
    }

    public StdVideoEncodeH265WeightTable(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeH265WeightTableFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte luma_log2_weight_denom() {
        return nluma_log2_weight_denom(address());
    }

    @NativeType("int8_t")
    public byte delta_chroma_log2_weight_denom() {
        return ndelta_chroma_log2_weight_denom(address());
    }

    @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer delta_luma_weight_l0() {
        return ndelta_luma_weight_l0(address());
    }

    @NativeType("int8_t")
    public byte delta_luma_weight_l0(int index) {
        return ndelta_luma_weight_l0(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_offset_l0() {
        return nluma_offset_l0(address());
    }

    @NativeType("int8_t")
    public byte luma_offset_l0(int index) {
        return nluma_offset_l0(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public ByteBuffer delta_chroma_weight_l0() {
        return ndelta_chroma_weight_l0(address());
    }

    @NativeType("int8_t")
    public byte delta_chroma_weight_l0(int index) {
        return ndelta_chroma_weight_l0(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public ByteBuffer delta_chroma_offset_l0() {
        return ndelta_chroma_offset_l0(address());
    }

    @NativeType("int8_t")
    public byte delta_chroma_offset_l0(int index) {
        return ndelta_chroma_offset_l0(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer delta_luma_weight_l1() {
        return ndelta_luma_weight_l1(address());
    }

    @NativeType("int8_t")
    public byte delta_luma_weight_l1(int index) {
        return ndelta_luma_weight_l1(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_offset_l1() {
        return nluma_offset_l1(address());
    }

    @NativeType("int8_t")
    public byte luma_offset_l1(int index) {
        return nluma_offset_l1(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public ByteBuffer delta_chroma_weight_l1() {
        return ndelta_chroma_weight_l1(address());
    }

    @NativeType("int8_t")
    public byte delta_chroma_weight_l1(int index) {
        return ndelta_chroma_weight_l1(address(), index);
    }

    @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public ByteBuffer delta_chroma_offset_l1() {
        return ndelta_chroma_offset_l1(address());
    }

    @NativeType("int8_t")
    public byte delta_chroma_offset_l1(int index) {
        return ndelta_chroma_offset_l1(address(), index);
    }

    public StdVideoEncodeH265WeightTable flags(StdVideoEncodeH265WeightTableFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable flags(Consumer<StdVideoEncodeH265WeightTableFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeH265WeightTable luma_log2_weight_denom(@NativeType("uint8_t") byte value) {
        nluma_log2_weight_denom(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_chroma_log2_weight_denom(@NativeType("int8_t") byte value) {
        ndelta_chroma_log2_weight_denom(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_luma_weight_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
        ndelta_luma_weight_l0(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_luma_weight_l0(int index, @NativeType("int8_t") byte value) {
        ndelta_luma_weight_l0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265WeightTable luma_offset_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nluma_offset_l0(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable luma_offset_l0(int index, @NativeType("int8_t") byte value) {
        nluma_offset_l0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_chroma_weight_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) {
        ndelta_chroma_weight_l0(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_chroma_weight_l0(int index, @NativeType("int8_t") byte value) {
        ndelta_chroma_weight_l0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_chroma_offset_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) {
        ndelta_chroma_offset_l0(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_chroma_offset_l0(int index, @NativeType("int8_t") byte value) {
        ndelta_chroma_offset_l0(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_luma_weight_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
        ndelta_luma_weight_l1(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_luma_weight_l1(int index, @NativeType("int8_t") byte value) {
        ndelta_luma_weight_l1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265WeightTable luma_offset_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
        nluma_offset_l1(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable luma_offset_l1(int index, @NativeType("int8_t") byte value) {
        nluma_offset_l1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_chroma_weight_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) {
        ndelta_chroma_weight_l1(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_chroma_weight_l1(int index, @NativeType("int8_t") byte value) {
        ndelta_chroma_weight_l1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_chroma_offset_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) {
        ndelta_chroma_offset_l1(address(), value);
        return this;
    }

    public StdVideoEncodeH265WeightTable delta_chroma_offset_l1(int index, @NativeType("int8_t") byte value) {
        ndelta_chroma_offset_l1(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265WeightTable set(StdVideoEncodeH265WeightTableFlags flags, byte luma_log2_weight_denom, byte delta_chroma_log2_weight_denom, ByteBuffer delta_luma_weight_l0, ByteBuffer luma_offset_l0, ByteBuffer delta_chroma_weight_l0, ByteBuffer delta_chroma_offset_l0, ByteBuffer delta_luma_weight_l1, ByteBuffer luma_offset_l1, ByteBuffer delta_chroma_weight_l1, ByteBuffer delta_chroma_offset_l1) {
        flags(flags);
        luma_log2_weight_denom(luma_log2_weight_denom);
        delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom);
        delta_luma_weight_l0(delta_luma_weight_l0);
        luma_offset_l0(luma_offset_l0);
        delta_chroma_weight_l0(delta_chroma_weight_l0);
        delta_chroma_offset_l0(delta_chroma_offset_l0);
        delta_luma_weight_l1(delta_luma_weight_l1);
        luma_offset_l1(luma_offset_l1);
        delta_chroma_weight_l1(delta_chroma_weight_l1);
        delta_chroma_offset_l1(delta_chroma_offset_l1);
        return this;
    }

    public StdVideoEncodeH265WeightTable set(StdVideoEncodeH265WeightTable src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH265WeightTable malloc() {
        return new StdVideoEncodeH265WeightTable(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH265WeightTable calloc() {
        return new StdVideoEncodeH265WeightTable(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH265WeightTable create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265WeightTable(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH265WeightTable create(long address) {
        return new StdVideoEncodeH265WeightTable(address, null);
    }

    public static StdVideoEncodeH265WeightTable createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH265WeightTable(address, null);
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

    public static StdVideoEncodeH265WeightTable malloc(MemoryStack stack) {
        return new StdVideoEncodeH265WeightTable(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH265WeightTable calloc(MemoryStack stack) {
        return new StdVideoEncodeH265WeightTable(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeH265WeightTableFlags nflags(long struct) {
        return StdVideoEncodeH265WeightTableFlags.create(struct + FLAGS);
    }

    public static byte nluma_log2_weight_denom(long struct) {
        return MemoryUtil.memGetByte(struct + LUMA_LOG2_WEIGHT_DENOM);
    }

    public static byte ndelta_chroma_log2_weight_denom(long struct) {
        return MemoryUtil.memGetByte(struct + DELTA_CHROMA_LOG2_WEIGHT_DENOM);
    }

    public static ByteBuffer ndelta_luma_weight_l0(long struct) {
        return MemoryUtil.memByteBuffer(struct + DELTA_LUMA_WEIGHT_L0, 15);
    }

    public static byte ndelta_luma_weight_l0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DELTA_LUMA_WEIGHT_L0 + (Checks.check(index, 15) * 1));
    }

    public static ByteBuffer nluma_offset_l0(long struct) {
        return MemoryUtil.memByteBuffer(struct + LUMA_OFFSET_L0, 15);
    }

    public static byte nluma_offset_l0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LUMA_OFFSET_L0 + (Checks.check(index, 15) * 1));
    }

    public static ByteBuffer ndelta_chroma_weight_l0(long struct) {
        return MemoryUtil.memByteBuffer(struct + DELTA_CHROMA_WEIGHT_L0, 2);
    }

    public static byte ndelta_chroma_weight_l0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DELTA_CHROMA_WEIGHT_L0 + (Checks.check(index, 2) * 1));
    }

    public static ByteBuffer ndelta_chroma_offset_l0(long struct) {
        return MemoryUtil.memByteBuffer(struct + DELTA_CHROMA_OFFSET_L0, 2);
    }

    public static byte ndelta_chroma_offset_l0(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DELTA_CHROMA_OFFSET_L0 + (Checks.check(index, 2) * 1));
    }

    public static ByteBuffer ndelta_luma_weight_l1(long struct) {
        return MemoryUtil.memByteBuffer(struct + DELTA_LUMA_WEIGHT_L1, 15);
    }

    public static byte ndelta_luma_weight_l1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DELTA_LUMA_WEIGHT_L1 + (Checks.check(index, 15) * 1));
    }

    public static ByteBuffer nluma_offset_l1(long struct) {
        return MemoryUtil.memByteBuffer(struct + LUMA_OFFSET_L1, 15);
    }

    public static byte nluma_offset_l1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LUMA_OFFSET_L1 + (Checks.check(index, 15) * 1));
    }

    public static ByteBuffer ndelta_chroma_weight_l1(long struct) {
        return MemoryUtil.memByteBuffer(struct + DELTA_CHROMA_WEIGHT_L1, 2);
    }

    public static byte ndelta_chroma_weight_l1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DELTA_CHROMA_WEIGHT_L1 + (Checks.check(index, 2) * 1));
    }

    public static ByteBuffer ndelta_chroma_offset_l1(long struct) {
        return MemoryUtil.memByteBuffer(struct + DELTA_CHROMA_OFFSET_L1, 2);
    }

    public static byte ndelta_chroma_offset_l1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DELTA_CHROMA_OFFSET_L1 + (Checks.check(index, 2) * 1));
    }

    public static void nflags(long struct, StdVideoEncodeH265WeightTableFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeH265WeightTableFlags.SIZEOF);
    }

    public static void nluma_log2_weight_denom(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LUMA_LOG2_WEIGHT_DENOM, value);
    }

    public static void ndelta_chroma_log2_weight_denom(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_CHROMA_LOG2_WEIGHT_DENOM, value);
    }

    public static void ndelta_luma_weight_l0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 15);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_LUMA_WEIGHT_L0, value.remaining() * 1);
    }

    public static void ndelta_luma_weight_l0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_LUMA_WEIGHT_L0 + (Checks.check(index, 15) * 1), value);
    }

    public static void nluma_offset_l0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 15);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LUMA_OFFSET_L0, value.remaining() * 1);
    }

    public static void nluma_offset_l0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LUMA_OFFSET_L0 + (Checks.check(index, 15) * 1), value);
    }

    public static void ndelta_chroma_weight_l0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_CHROMA_WEIGHT_L0, value.remaining() * 1);
    }

    public static void ndelta_chroma_weight_l0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_CHROMA_WEIGHT_L0 + (Checks.check(index, 2) * 1), value);
    }

    public static void ndelta_chroma_offset_l0(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_CHROMA_OFFSET_L0, value.remaining() * 1);
    }

    public static void ndelta_chroma_offset_l0(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_CHROMA_OFFSET_L0 + (Checks.check(index, 2) * 1), value);
    }

    public static void ndelta_luma_weight_l1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 15);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_LUMA_WEIGHT_L1, value.remaining() * 1);
    }

    public static void ndelta_luma_weight_l1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_LUMA_WEIGHT_L1 + (Checks.check(index, 15) * 1), value);
    }

    public static void nluma_offset_l1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 15);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LUMA_OFFSET_L1, value.remaining() * 1);
    }

    public static void nluma_offset_l1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LUMA_OFFSET_L1 + (Checks.check(index, 15) * 1), value);
    }

    public static void ndelta_chroma_weight_l1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_CHROMA_WEIGHT_L1, value.remaining() * 1);
    }

    public static void ndelta_chroma_weight_l1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_CHROMA_WEIGHT_L1 + (Checks.check(index, 2) * 1), value);
    }

    public static void ndelta_chroma_offset_l1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_CHROMA_OFFSET_L1, value.remaining() * 1);
    }

    public static void ndelta_chroma_offset_l1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_CHROMA_OFFSET_L1 + (Checks.check(index, 2) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265WeightTable$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265WeightTable$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265WeightTable, Buffer> implements NativeResource {
        private static final StdVideoEncodeH265WeightTable ELEMENT_FACTORY = StdVideoEncodeH265WeightTable.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH265WeightTable.SIZEOF);
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
        public StdVideoEncodeH265WeightTable getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeH265WeightTableFlags flags() {
            return StdVideoEncodeH265WeightTable.nflags(address());
        }

        @NativeType("uint8_t")
        public byte luma_log2_weight_denom() {
            return StdVideoEncodeH265WeightTable.nluma_log2_weight_denom(address());
        }

        @NativeType("int8_t")
        public byte delta_chroma_log2_weight_denom() {
            return StdVideoEncodeH265WeightTable.ndelta_chroma_log2_weight_denom(address());
        }

        @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer delta_luma_weight_l0() {
            return StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(address());
        }

        @NativeType("int8_t")
        public byte delta_luma_weight_l0(int index) {
            return StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_offset_l0() {
            return StdVideoEncodeH265WeightTable.nluma_offset_l0(address());
        }

        @NativeType("int8_t")
        public byte luma_offset_l0(int index) {
            return StdVideoEncodeH265WeightTable.nluma_offset_l0(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public ByteBuffer delta_chroma_weight_l0() {
            return StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(address());
        }

        @NativeType("int8_t")
        public byte delta_chroma_weight_l0(int index) {
            return StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public ByteBuffer delta_chroma_offset_l0() {
            return StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(address());
        }

        @NativeType("int8_t")
        public byte delta_chroma_offset_l0(int index) {
            return StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer delta_luma_weight_l1() {
            return StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(address());
        }

        @NativeType("int8_t")
        public byte delta_luma_weight_l1(int index) {
            return StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_offset_l1() {
            return StdVideoEncodeH265WeightTable.nluma_offset_l1(address());
        }

        @NativeType("int8_t")
        public byte luma_offset_l1(int index) {
            return StdVideoEncodeH265WeightTable.nluma_offset_l1(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public ByteBuffer delta_chroma_weight_l1() {
            return StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(address());
        }

        @NativeType("int8_t")
        public byte delta_chroma_weight_l1(int index) {
            return StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(address(), index);
        }

        @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public ByteBuffer delta_chroma_offset_l1() {
            return StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(address());
        }

        @NativeType("int8_t")
        public byte delta_chroma_offset_l1(int index) {
            return StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(address(), index);
        }

        public Buffer flags(StdVideoEncodeH265WeightTableFlags value) {
            StdVideoEncodeH265WeightTable.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeH265WeightTableFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer luma_log2_weight_denom(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265WeightTable.nluma_log2_weight_denom(address(), value);
            return this;
        }

        public Buffer delta_chroma_log2_weight_denom(@NativeType("int8_t") byte value) {
            StdVideoEncodeH265WeightTable.ndelta_chroma_log2_weight_denom(address(), value);
            return this;
        }

        public Buffer delta_luma_weight_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(address(), value);
            return this;
        }

        public Buffer delta_luma_weight_l0(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(address(), index, value);
            return this;
        }

        public Buffer luma_offset_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH265WeightTable.nluma_offset_l0(address(), value);
            return this;
        }

        public Buffer luma_offset_l0(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH265WeightTable.nluma_offset_l0(address(), index, value);
            return this;
        }

        public Buffer delta_chroma_weight_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) {
            StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(address(), value);
            return this;
        }

        public Buffer delta_chroma_weight_l0(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(address(), index, value);
            return this;
        }

        public Buffer delta_chroma_offset_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) {
            StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(address(), value);
            return this;
        }

        public Buffer delta_chroma_offset_l0(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(address(), index, value);
            return this;
        }

        public Buffer delta_luma_weight_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(address(), value);
            return this;
        }

        public Buffer delta_luma_weight_l1(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(address(), index, value);
            return this;
        }

        public Buffer luma_offset_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) {
            StdVideoEncodeH265WeightTable.nluma_offset_l1(address(), value);
            return this;
        }

        public Buffer luma_offset_l1(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH265WeightTable.nluma_offset_l1(address(), index, value);
            return this;
        }

        public Buffer delta_chroma_weight_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) {
            StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(address(), value);
            return this;
        }

        public Buffer delta_chroma_weight_l1(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(address(), index, value);
            return this;
        }

        public Buffer delta_chroma_offset_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) {
            StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(address(), value);
            return this;
        }

        public Buffer delta_chroma_offset_l1(int index, @NativeType("int8_t") byte value) {
            StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(address(), index, value);
            return this;
        }
    }
}
