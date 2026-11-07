package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264HrdParameters.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264HrdParameters.class */
public class StdVideoH264HrdParameters extends Struct<StdVideoH264HrdParameters> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CPB_CNT_MINUS1;
    public static final int BIT_RATE_SCALE;
    public static final int CPB_SIZE_SCALE;
    public static final int RESERVED1;
    public static final int BIT_RATE_VALUE_MINUS1;
    public static final int CPB_SIZE_VALUE_MINUS1;
    public static final int CBR_FLAG;
    public static final int INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1;
    public static final int CPB_REMOVAL_DELAY_LENGTH_MINUS1;
    public static final int DPB_OUTPUT_DELAY_LENGTH_MINUS1;
    public static final int TIME_OFFSET_LENGTH;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1), __member(1), __array(4, 32), __array(4, 32), __array(1, 32), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CPB_CNT_MINUS1 = layout.offsetof(0);
        BIT_RATE_SCALE = layout.offsetof(1);
        CPB_SIZE_SCALE = layout.offsetof(2);
        RESERVED1 = layout.offsetof(3);
        BIT_RATE_VALUE_MINUS1 = layout.offsetof(4);
        CPB_SIZE_VALUE_MINUS1 = layout.offsetof(5);
        CBR_FLAG = layout.offsetof(6);
        INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1 = layout.offsetof(7);
        CPB_REMOVAL_DELAY_LENGTH_MINUS1 = layout.offsetof(8);
        DPB_OUTPUT_DELAY_LENGTH_MINUS1 = layout.offsetof(9);
        TIME_OFFSET_LENGTH = layout.offsetof(10);
    }

    protected StdVideoH264HrdParameters(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH264HrdParameters create(long address, ByteBuffer container) {
        return new StdVideoH264HrdParameters(address, container);
    }

    public StdVideoH264HrdParameters(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t")
    public byte cpb_cnt_minus1() {
        return ncpb_cnt_minus1(address());
    }

    @NativeType("uint8_t")
    public byte bit_rate_scale() {
        return nbit_rate_scale(address());
    }

    @NativeType("uint8_t")
    public byte cpb_size_scale() {
        return ncpb_size_scale(address());
    }

    @NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
    public IntBuffer bit_rate_value_minus1() {
        return nbit_rate_value_minus1(address());
    }

    @NativeType("uint32_t")
    public int bit_rate_value_minus1(int index) {
        return nbit_rate_value_minus1(address(), index);
    }

    @NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
    public IntBuffer cpb_size_value_minus1() {
        return ncpb_size_value_minus1(address());
    }

    @NativeType("uint32_t")
    public int cpb_size_value_minus1(int index) {
        return ncpb_size_value_minus1(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
    public ByteBuffer cbr_flag() {
        return ncbr_flag(address());
    }

    @NativeType("uint8_t")
    public byte cbr_flag(int index) {
        return ncbr_flag(address(), index);
    }

    @NativeType("uint32_t")
    public int initial_cpb_removal_delay_length_minus1() {
        return ninitial_cpb_removal_delay_length_minus1(address());
    }

    @NativeType("uint32_t")
    public int cpb_removal_delay_length_minus1() {
        return ncpb_removal_delay_length_minus1(address());
    }

    @NativeType("uint32_t")
    public int dpb_output_delay_length_minus1() {
        return ndpb_output_delay_length_minus1(address());
    }

    @NativeType("uint32_t")
    public int time_offset_length() {
        return ntime_offset_length(address());
    }

    public StdVideoH264HrdParameters cpb_cnt_minus1(@NativeType("uint8_t") byte value) {
        ncpb_cnt_minus1(address(), value);
        return this;
    }

    public StdVideoH264HrdParameters bit_rate_scale(@NativeType("uint8_t") byte value) {
        nbit_rate_scale(address(), value);
        return this;
    }

    public StdVideoH264HrdParameters cpb_size_scale(@NativeType("uint8_t") byte value) {
        ncpb_size_scale(address(), value);
        return this;
    }

    public StdVideoH264HrdParameters bit_rate_value_minus1(@NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") IntBuffer value) {
        nbit_rate_value_minus1(address(), value);
        return this;
    }

    public StdVideoH264HrdParameters bit_rate_value_minus1(int index, @NativeType("uint32_t") int value) {
        nbit_rate_value_minus1(address(), index, value);
        return this;
    }

    public StdVideoH264HrdParameters cpb_size_value_minus1(@NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") IntBuffer value) {
        ncpb_size_value_minus1(address(), value);
        return this;
    }

    public StdVideoH264HrdParameters cpb_size_value_minus1(int index, @NativeType("uint32_t") int value) {
        ncpb_size_value_minus1(address(), index, value);
        return this;
    }

    public StdVideoH264HrdParameters cbr_flag(@NativeType("uint8_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") ByteBuffer value) {
        ncbr_flag(address(), value);
        return this;
    }

    public StdVideoH264HrdParameters cbr_flag(int index, @NativeType("uint8_t") byte value) {
        ncbr_flag(address(), index, value);
        return this;
    }

    public StdVideoH264HrdParameters initial_cpb_removal_delay_length_minus1(@NativeType("uint32_t") int value) {
        ninitial_cpb_removal_delay_length_minus1(address(), value);
        return this;
    }

    public StdVideoH264HrdParameters cpb_removal_delay_length_minus1(@NativeType("uint32_t") int value) {
        ncpb_removal_delay_length_minus1(address(), value);
        return this;
    }

    public StdVideoH264HrdParameters dpb_output_delay_length_minus1(@NativeType("uint32_t") int value) {
        ndpb_output_delay_length_minus1(address(), value);
        return this;
    }

    public StdVideoH264HrdParameters time_offset_length(@NativeType("uint32_t") int value) {
        ntime_offset_length(address(), value);
        return this;
    }

    public StdVideoH264HrdParameters set(byte cpb_cnt_minus1, byte bit_rate_scale, byte cpb_size_scale, IntBuffer bit_rate_value_minus1, IntBuffer cpb_size_value_minus1, ByteBuffer cbr_flag, int initial_cpb_removal_delay_length_minus1, int cpb_removal_delay_length_minus1, int dpb_output_delay_length_minus1, int time_offset_length) {
        cpb_cnt_minus1(cpb_cnt_minus1);
        bit_rate_scale(bit_rate_scale);
        cpb_size_scale(cpb_size_scale);
        bit_rate_value_minus1(bit_rate_value_minus1);
        cpb_size_value_minus1(cpb_size_value_minus1);
        cbr_flag(cbr_flag);
        initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1);
        cpb_removal_delay_length_minus1(cpb_removal_delay_length_minus1);
        dpb_output_delay_length_minus1(dpb_output_delay_length_minus1);
        time_offset_length(time_offset_length);
        return this;
    }

    public StdVideoH264HrdParameters set(StdVideoH264HrdParameters src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH264HrdParameters malloc() {
        return new StdVideoH264HrdParameters(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH264HrdParameters calloc() {
        return new StdVideoH264HrdParameters(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH264HrdParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH264HrdParameters(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH264HrdParameters create(long address) {
        return new StdVideoH264HrdParameters(address, null);
    }

    public static StdVideoH264HrdParameters createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH264HrdParameters(address, null);
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

    public static StdVideoH264HrdParameters malloc(MemoryStack stack) {
        return new StdVideoH264HrdParameters(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH264HrdParameters calloc(MemoryStack stack) {
        return new StdVideoH264HrdParameters(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte ncpb_cnt_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + CPB_CNT_MINUS1);
    }

    public static byte nbit_rate_scale(long struct) {
        return MemoryUtil.memGetByte(struct + BIT_RATE_SCALE);
    }

    public static byte ncpb_size_scale(long struct) {
        return MemoryUtil.memGetByte(struct + CPB_SIZE_SCALE);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static IntBuffer nbit_rate_value_minus1(long struct) {
        return MemoryUtil.memIntBuffer(struct + BIT_RATE_VALUE_MINUS1, 32);
    }

    public static int nbit_rate_value_minus1(long struct, int index) {
        return MemoryUtil.memGetInt(struct + BIT_RATE_VALUE_MINUS1 + (Checks.check(index, 32) * 4));
    }

    public static IntBuffer ncpb_size_value_minus1(long struct) {
        return MemoryUtil.memIntBuffer(struct + CPB_SIZE_VALUE_MINUS1, 32);
    }

    public static int ncpb_size_value_minus1(long struct, int index) {
        return MemoryUtil.memGetInt(struct + CPB_SIZE_VALUE_MINUS1 + (Checks.check(index, 32) * 4));
    }

    public static ByteBuffer ncbr_flag(long struct) {
        return MemoryUtil.memByteBuffer(struct + CBR_FLAG, 32);
    }

    public static byte ncbr_flag(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CBR_FLAG + (Checks.check(index, 32) * 1));
    }

    public static int ninitial_cpb_removal_delay_length_minus1(long struct) {
        return MemoryUtil.memGetInt(struct + INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1);
    }

    public static int ncpb_removal_delay_length_minus1(long struct) {
        return MemoryUtil.memGetInt(struct + CPB_REMOVAL_DELAY_LENGTH_MINUS1);
    }

    public static int ndpb_output_delay_length_minus1(long struct) {
        return MemoryUtil.memGetInt(struct + DPB_OUTPUT_DELAY_LENGTH_MINUS1);
    }

    public static int ntime_offset_length(long struct) {
        return MemoryUtil.memGetInt(struct + TIME_OFFSET_LENGTH);
    }

    public static void ncpb_cnt_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CPB_CNT_MINUS1, value);
    }

    public static void nbit_rate_scale(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BIT_RATE_SCALE, value);
    }

    public static void ncpb_size_scale(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CPB_SIZE_SCALE, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void nbit_rate_value_minus1(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + BIT_RATE_VALUE_MINUS1, value.remaining() * 4);
    }

    public static void nbit_rate_value_minus1(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + BIT_RATE_VALUE_MINUS1 + (Checks.check(index, 32) * 4), value);
    }

    public static void ncpb_size_value_minus1(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CPB_SIZE_VALUE_MINUS1, value.remaining() * 4);
    }

    public static void ncpb_size_value_minus1(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + CPB_SIZE_VALUE_MINUS1 + (Checks.check(index, 32) * 4), value);
    }

    public static void ncbr_flag(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CBR_FLAG, value.remaining() * 1);
    }

    public static void ncbr_flag(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CBR_FLAG + (Checks.check(index, 32) * 1), value);
    }

    public static void ninitial_cpb_removal_delay_length_minus1(long struct, int value) {
        MemoryUtil.memPutInt(struct + INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1, value);
    }

    public static void ncpb_removal_delay_length_minus1(long struct, int value) {
        MemoryUtil.memPutInt(struct + CPB_REMOVAL_DELAY_LENGTH_MINUS1, value);
    }

    public static void ndpb_output_delay_length_minus1(long struct, int value) {
        MemoryUtil.memPutInt(struct + DPB_OUTPUT_DELAY_LENGTH_MINUS1, value);
    }

    public static void ntime_offset_length(long struct, int value) {
        MemoryUtil.memPutInt(struct + TIME_OFFSET_LENGTH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264HrdParameters$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264HrdParameters$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH264HrdParameters, Buffer> implements NativeResource {
        private static final StdVideoH264HrdParameters ELEMENT_FACTORY = StdVideoH264HrdParameters.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH264HrdParameters.SIZEOF);
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
        public StdVideoH264HrdParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t")
        public byte cpb_cnt_minus1() {
            return StdVideoH264HrdParameters.ncpb_cnt_minus1(address());
        }

        @NativeType("uint8_t")
        public byte bit_rate_scale() {
            return StdVideoH264HrdParameters.nbit_rate_scale(address());
        }

        @NativeType("uint8_t")
        public byte cpb_size_scale() {
            return StdVideoH264HrdParameters.ncpb_size_scale(address());
        }

        @NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
        public IntBuffer bit_rate_value_minus1() {
            return StdVideoH264HrdParameters.nbit_rate_value_minus1(address());
        }

        @NativeType("uint32_t")
        public int bit_rate_value_minus1(int index) {
            return StdVideoH264HrdParameters.nbit_rate_value_minus1(address(), index);
        }

        @NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
        public IntBuffer cpb_size_value_minus1() {
            return StdVideoH264HrdParameters.ncpb_size_value_minus1(address());
        }

        @NativeType("uint32_t")
        public int cpb_size_value_minus1(int index) {
            return StdVideoH264HrdParameters.ncpb_size_value_minus1(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
        public ByteBuffer cbr_flag() {
            return StdVideoH264HrdParameters.ncbr_flag(address());
        }

        @NativeType("uint8_t")
        public byte cbr_flag(int index) {
            return StdVideoH264HrdParameters.ncbr_flag(address(), index);
        }

        @NativeType("uint32_t")
        public int initial_cpb_removal_delay_length_minus1() {
            return StdVideoH264HrdParameters.ninitial_cpb_removal_delay_length_minus1(address());
        }

        @NativeType("uint32_t")
        public int cpb_removal_delay_length_minus1() {
            return StdVideoH264HrdParameters.ncpb_removal_delay_length_minus1(address());
        }

        @NativeType("uint32_t")
        public int dpb_output_delay_length_minus1() {
            return StdVideoH264HrdParameters.ndpb_output_delay_length_minus1(address());
        }

        @NativeType("uint32_t")
        public int time_offset_length() {
            return StdVideoH264HrdParameters.ntime_offset_length(address());
        }

        public Buffer cpb_cnt_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH264HrdParameters.ncpb_cnt_minus1(address(), value);
            return this;
        }

        public Buffer bit_rate_scale(@NativeType("uint8_t") byte value) {
            StdVideoH264HrdParameters.nbit_rate_scale(address(), value);
            return this;
        }

        public Buffer cpb_size_scale(@NativeType("uint8_t") byte value) {
            StdVideoH264HrdParameters.ncpb_size_scale(address(), value);
            return this;
        }

        public Buffer bit_rate_value_minus1(@NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") IntBuffer value) {
            StdVideoH264HrdParameters.nbit_rate_value_minus1(address(), value);
            return this;
        }

        public Buffer bit_rate_value_minus1(int index, @NativeType("uint32_t") int value) {
            StdVideoH264HrdParameters.nbit_rate_value_minus1(address(), index, value);
            return this;
        }

        public Buffer cpb_size_value_minus1(@NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") IntBuffer value) {
            StdVideoH264HrdParameters.ncpb_size_value_minus1(address(), value);
            return this;
        }

        public Buffer cpb_size_value_minus1(int index, @NativeType("uint32_t") int value) {
            StdVideoH264HrdParameters.ncpb_size_value_minus1(address(), index, value);
            return this;
        }

        public Buffer cbr_flag(@NativeType("uint8_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") ByteBuffer value) {
            StdVideoH264HrdParameters.ncbr_flag(address(), value);
            return this;
        }

        public Buffer cbr_flag(int index, @NativeType("uint8_t") byte value) {
            StdVideoH264HrdParameters.ncbr_flag(address(), index, value);
            return this;
        }

        public Buffer initial_cpb_removal_delay_length_minus1(@NativeType("uint32_t") int value) {
            StdVideoH264HrdParameters.ninitial_cpb_removal_delay_length_minus1(address(), value);
            return this;
        }

        public Buffer cpb_removal_delay_length_minus1(@NativeType("uint32_t") int value) {
            StdVideoH264HrdParameters.ncpb_removal_delay_length_minus1(address(), value);
            return this;
        }

        public Buffer dpb_output_delay_length_minus1(@NativeType("uint32_t") int value) {
            StdVideoH264HrdParameters.ndpb_output_delay_length_minus1(address(), value);
            return this;
        }

        public Buffer time_offset_length(@NativeType("uint32_t") int value) {
            StdVideoH264HrdParameters.ntime_offset_length(address(), value);
            return this;
        }
    }
}
