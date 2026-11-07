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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SubLayerHrdParameters.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SubLayerHrdParameters.class */
public class StdVideoH265SubLayerHrdParameters extends Struct<StdVideoH265SubLayerHrdParameters> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BIT_RATE_VALUE_MINUS1;
    public static final int CPB_SIZE_VALUE_MINUS1;
    public static final int CPB_SIZE_DU_VALUE_MINUS1;
    public static final int BIT_RATE_DU_VALUE_MINUS1;
    public static final int CBR_FLAG;

    static {
        Struct.Layout layout = __struct(__array(4, 32), __array(4, 32), __array(4, 32), __array(4, 32), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BIT_RATE_VALUE_MINUS1 = layout.offsetof(0);
        CPB_SIZE_VALUE_MINUS1 = layout.offsetof(1);
        CPB_SIZE_DU_VALUE_MINUS1 = layout.offsetof(2);
        BIT_RATE_DU_VALUE_MINUS1 = layout.offsetof(3);
        CBR_FLAG = layout.offsetof(4);
    }

    protected StdVideoH265SubLayerHrdParameters(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265SubLayerHrdParameters create(long address, ByteBuffer container) {
        return new StdVideoH265SubLayerHrdParameters(address, container);
    }

    public StdVideoH265SubLayerHrdParameters(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
    public IntBuffer bit_rate_value_minus1() {
        return nbit_rate_value_minus1(address());
    }

    @NativeType("uint32_t")
    public int bit_rate_value_minus1(int index) {
        return nbit_rate_value_minus1(address(), index);
    }

    @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
    public IntBuffer cpb_size_value_minus1() {
        return ncpb_size_value_minus1(address());
    }

    @NativeType("uint32_t")
    public int cpb_size_value_minus1(int index) {
        return ncpb_size_value_minus1(address(), index);
    }

    @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
    public IntBuffer cpb_size_du_value_minus1() {
        return ncpb_size_du_value_minus1(address());
    }

    @NativeType("uint32_t")
    public int cpb_size_du_value_minus1(int index) {
        return ncpb_size_du_value_minus1(address(), index);
    }

    @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
    public IntBuffer bit_rate_du_value_minus1() {
        return nbit_rate_du_value_minus1(address());
    }

    @NativeType("uint32_t")
    public int bit_rate_du_value_minus1(int index) {
        return nbit_rate_du_value_minus1(address(), index);
    }

    @NativeType("uint32_t")
    public int cbr_flag() {
        return ncbr_flag(address());
    }

    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) {
        nbit_rate_value_minus1(address(), value);
        return this;
    }

    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1(int index, @NativeType("uint32_t") int value) {
        nbit_rate_value_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) {
        ncpb_size_value_minus1(address(), value);
        return this;
    }

    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1(int index, @NativeType("uint32_t") int value) {
        ncpb_size_value_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) {
        ncpb_size_du_value_minus1(address(), value);
        return this;
    }

    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1(int index, @NativeType("uint32_t") int value) {
        ncpb_size_du_value_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) {
        nbit_rate_du_value_minus1(address(), value);
        return this;
    }

    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1(int index, @NativeType("uint32_t") int value) {
        nbit_rate_du_value_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265SubLayerHrdParameters cbr_flag(@NativeType("uint32_t") int value) {
        ncbr_flag(address(), value);
        return this;
    }

    public StdVideoH265SubLayerHrdParameters set(IntBuffer bit_rate_value_minus1, IntBuffer cpb_size_value_minus1, IntBuffer cpb_size_du_value_minus1, IntBuffer bit_rate_du_value_minus1, int cbr_flag) {
        bit_rate_value_minus1(bit_rate_value_minus1);
        cpb_size_value_minus1(cpb_size_value_minus1);
        cpb_size_du_value_minus1(cpb_size_du_value_minus1);
        bit_rate_du_value_minus1(bit_rate_du_value_minus1);
        cbr_flag(cbr_flag);
        return this;
    }

    public StdVideoH265SubLayerHrdParameters set(StdVideoH265SubLayerHrdParameters src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265SubLayerHrdParameters malloc() {
        return new StdVideoH265SubLayerHrdParameters(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265SubLayerHrdParameters calloc() {
        return new StdVideoH265SubLayerHrdParameters(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265SubLayerHrdParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265SubLayerHrdParameters(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265SubLayerHrdParameters create(long address) {
        return new StdVideoH265SubLayerHrdParameters(address, null);
    }

    public static StdVideoH265SubLayerHrdParameters createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265SubLayerHrdParameters(address, null);
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

    public static StdVideoH265SubLayerHrdParameters malloc(MemoryStack stack) {
        return new StdVideoH265SubLayerHrdParameters(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265SubLayerHrdParameters calloc(MemoryStack stack) {
        return new StdVideoH265SubLayerHrdParameters(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

    public static IntBuffer ncpb_size_du_value_minus1(long struct) {
        return MemoryUtil.memIntBuffer(struct + CPB_SIZE_DU_VALUE_MINUS1, 32);
    }

    public static int ncpb_size_du_value_minus1(long struct, int index) {
        return MemoryUtil.memGetInt(struct + CPB_SIZE_DU_VALUE_MINUS1 + (Checks.check(index, 32) * 4));
    }

    public static IntBuffer nbit_rate_du_value_minus1(long struct) {
        return MemoryUtil.memIntBuffer(struct + BIT_RATE_DU_VALUE_MINUS1, 32);
    }

    public static int nbit_rate_du_value_minus1(long struct, int index) {
        return MemoryUtil.memGetInt(struct + BIT_RATE_DU_VALUE_MINUS1 + (Checks.check(index, 32) * 4));
    }

    public static int ncbr_flag(long struct) {
        return MemoryUtil.memGetInt(struct + CBR_FLAG);
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

    public static void ncpb_size_du_value_minus1(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CPB_SIZE_DU_VALUE_MINUS1, value.remaining() * 4);
    }

    public static void ncpb_size_du_value_minus1(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + CPB_SIZE_DU_VALUE_MINUS1 + (Checks.check(index, 32) * 4), value);
    }

    public static void nbit_rate_du_value_minus1(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + BIT_RATE_DU_VALUE_MINUS1, value.remaining() * 4);
    }

    public static void nbit_rate_du_value_minus1(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + BIT_RATE_DU_VALUE_MINUS1 + (Checks.check(index, 32) * 4), value);
    }

    public static void ncbr_flag(long struct, int value) {
        MemoryUtil.memPutInt(struct + CBR_FLAG, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SubLayerHrdParameters$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265SubLayerHrdParameters$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265SubLayerHrdParameters, Buffer> implements NativeResource {
        private static final StdVideoH265SubLayerHrdParameters ELEMENT_FACTORY = StdVideoH265SubLayerHrdParameters.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265SubLayerHrdParameters.SIZEOF);
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
        public StdVideoH265SubLayerHrdParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
        public IntBuffer bit_rate_value_minus1() {
            return StdVideoH265SubLayerHrdParameters.nbit_rate_value_minus1(address());
        }

        @NativeType("uint32_t")
        public int bit_rate_value_minus1(int index) {
            return StdVideoH265SubLayerHrdParameters.nbit_rate_value_minus1(address(), index);
        }

        @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
        public IntBuffer cpb_size_value_minus1() {
            return StdVideoH265SubLayerHrdParameters.ncpb_size_value_minus1(address());
        }

        @NativeType("uint32_t")
        public int cpb_size_value_minus1(int index) {
            return StdVideoH265SubLayerHrdParameters.ncpb_size_value_minus1(address(), index);
        }

        @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
        public IntBuffer cpb_size_du_value_minus1() {
            return StdVideoH265SubLayerHrdParameters.ncpb_size_du_value_minus1(address());
        }

        @NativeType("uint32_t")
        public int cpb_size_du_value_minus1(int index) {
            return StdVideoH265SubLayerHrdParameters.ncpb_size_du_value_minus1(address(), index);
        }

        @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
        public IntBuffer bit_rate_du_value_minus1() {
            return StdVideoH265SubLayerHrdParameters.nbit_rate_du_value_minus1(address());
        }

        @NativeType("uint32_t")
        public int bit_rate_du_value_minus1(int index) {
            return StdVideoH265SubLayerHrdParameters.nbit_rate_du_value_minus1(address(), index);
        }

        @NativeType("uint32_t")
        public int cbr_flag() {
            return StdVideoH265SubLayerHrdParameters.ncbr_flag(address());
        }

        public Buffer bit_rate_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) {
            StdVideoH265SubLayerHrdParameters.nbit_rate_value_minus1(address(), value);
            return this;
        }

        public Buffer bit_rate_value_minus1(int index, @NativeType("uint32_t") int value) {
            StdVideoH265SubLayerHrdParameters.nbit_rate_value_minus1(address(), index, value);
            return this;
        }

        public Buffer cpb_size_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) {
            StdVideoH265SubLayerHrdParameters.ncpb_size_value_minus1(address(), value);
            return this;
        }

        public Buffer cpb_size_value_minus1(int index, @NativeType("uint32_t") int value) {
            StdVideoH265SubLayerHrdParameters.ncpb_size_value_minus1(address(), index, value);
            return this;
        }

        public Buffer cpb_size_du_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) {
            StdVideoH265SubLayerHrdParameters.ncpb_size_du_value_minus1(address(), value);
            return this;
        }

        public Buffer cpb_size_du_value_minus1(int index, @NativeType("uint32_t") int value) {
            StdVideoH265SubLayerHrdParameters.ncpb_size_du_value_minus1(address(), index, value);
            return this;
        }

        public Buffer bit_rate_du_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) {
            StdVideoH265SubLayerHrdParameters.nbit_rate_du_value_minus1(address(), value);
            return this;
        }

        public Buffer bit_rate_du_value_minus1(int index, @NativeType("uint32_t") int value) {
            StdVideoH265SubLayerHrdParameters.nbit_rate_du_value_minus1(address(), index, value);
            return this;
        }

        public Buffer cbr_flag(@NativeType("uint32_t") int value) {
            StdVideoH265SubLayerHrdParameters.ncbr_flag(address(), value);
            return this;
        }
    }
}
