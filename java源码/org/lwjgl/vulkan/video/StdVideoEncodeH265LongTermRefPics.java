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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265LongTermRefPics.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265LongTermRefPics.class */
public class StdVideoEncodeH265LongTermRefPics extends Struct<StdVideoEncodeH265LongTermRefPics> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NUM_LONG_TERM_SPS;
    public static final int NUM_LONG_TERM_PICS;
    public static final int LT_IDX_SPS;
    public static final int POC_LSB_LT;
    public static final int USED_BY_CURR_PIC_LT_FLAG;
    public static final int DELTA_POC_MSB_PRESENT_FLAG;
    public static final int DELTA_POC_MSB_CYCLE_LT;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __array(1, 32), __array(1, 16), __member(2), __array(1, 48), __array(1, 48));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NUM_LONG_TERM_SPS = layout.offsetof(0);
        NUM_LONG_TERM_PICS = layout.offsetof(1);
        LT_IDX_SPS = layout.offsetof(2);
        POC_LSB_LT = layout.offsetof(3);
        USED_BY_CURR_PIC_LT_FLAG = layout.offsetof(4);
        DELTA_POC_MSB_PRESENT_FLAG = layout.offsetof(5);
        DELTA_POC_MSB_CYCLE_LT = layout.offsetof(6);
    }

    protected StdVideoEncodeH265LongTermRefPics(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH265LongTermRefPics create(long address, ByteBuffer container) {
        return new StdVideoEncodeH265LongTermRefPics(address, container);
    }

    public StdVideoEncodeH265LongTermRefPics(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t")
    public byte num_long_term_sps() {
        return nnum_long_term_sps(address());
    }

    @NativeType("uint8_t")
    public byte num_long_term_pics() {
        return nnum_long_term_pics(address());
    }

    @NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
    public ByteBuffer lt_idx_sps() {
        return nlt_idx_sps(address());
    }

    @NativeType("uint8_t")
    public byte lt_idx_sps(int index) {
        return nlt_idx_sps(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]")
    public ByteBuffer poc_lsb_lt() {
        return npoc_lsb_lt(address());
    }

    @NativeType("uint8_t")
    public byte poc_lsb_lt(int index) {
        return npoc_lsb_lt(address(), index);
    }

    @NativeType("uint16_t")
    public short used_by_curr_pic_lt_flag() {
        return nused_by_curr_pic_lt_flag(address());
    }

    @NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
    public ByteBuffer delta_poc_msb_present_flag() {
        return ndelta_poc_msb_present_flag(address());
    }

    @NativeType("uint8_t")
    public byte delta_poc_msb_present_flag(int index) {
        return ndelta_poc_msb_present_flag(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
    public ByteBuffer delta_poc_msb_cycle_lt() {
        return ndelta_poc_msb_cycle_lt(address());
    }

    @NativeType("uint8_t")
    public byte delta_poc_msb_cycle_lt(int index) {
        return ndelta_poc_msb_cycle_lt(address(), index);
    }

    public StdVideoEncodeH265LongTermRefPics num_long_term_sps(@NativeType("uint8_t") byte value) {
        nnum_long_term_sps(address(), value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics num_long_term_pics(@NativeType("uint8_t") byte value) {
        nnum_long_term_pics(address(), value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics lt_idx_sps(@NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") ByteBuffer value) {
        nlt_idx_sps(address(), value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics lt_idx_sps(int index, @NativeType("uint8_t") byte value) {
        nlt_idx_sps(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics poc_lsb_lt(@NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]") ByteBuffer value) {
        npoc_lsb_lt(address(), value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics poc_lsb_lt(int index, @NativeType("uint8_t") byte value) {
        npoc_lsb_lt(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics used_by_curr_pic_lt_flag(@NativeType("uint16_t") short value) {
        nused_by_curr_pic_lt_flag(address(), value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flag(@NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") ByteBuffer value) {
        ndelta_poc_msb_present_flag(address(), value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flag(int index, @NativeType("uint8_t") byte value) {
        ndelta_poc_msb_present_flag(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_lt(@NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") ByteBuffer value) {
        ndelta_poc_msb_cycle_lt(address(), value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_lt(int index, @NativeType("uint8_t") byte value) {
        ndelta_poc_msb_cycle_lt(address(), index, value);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics set(byte num_long_term_sps, byte num_long_term_pics, ByteBuffer lt_idx_sps, ByteBuffer poc_lsb_lt, short used_by_curr_pic_lt_flag, ByteBuffer delta_poc_msb_present_flag, ByteBuffer delta_poc_msb_cycle_lt) {
        num_long_term_sps(num_long_term_sps);
        num_long_term_pics(num_long_term_pics);
        lt_idx_sps(lt_idx_sps);
        poc_lsb_lt(poc_lsb_lt);
        used_by_curr_pic_lt_flag(used_by_curr_pic_lt_flag);
        delta_poc_msb_present_flag(delta_poc_msb_present_flag);
        delta_poc_msb_cycle_lt(delta_poc_msb_cycle_lt);
        return this;
    }

    public StdVideoEncodeH265LongTermRefPics set(StdVideoEncodeH265LongTermRefPics src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH265LongTermRefPics malloc() {
        return new StdVideoEncodeH265LongTermRefPics(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH265LongTermRefPics calloc() {
        return new StdVideoEncodeH265LongTermRefPics(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH265LongTermRefPics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265LongTermRefPics(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH265LongTermRefPics create(long address) {
        return new StdVideoEncodeH265LongTermRefPics(address, null);
    }

    public static StdVideoEncodeH265LongTermRefPics createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH265LongTermRefPics(address, null);
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

    public static StdVideoEncodeH265LongTermRefPics malloc(MemoryStack stack) {
        return new StdVideoEncodeH265LongTermRefPics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH265LongTermRefPics calloc(MemoryStack stack) {
        return new StdVideoEncodeH265LongTermRefPics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte nnum_long_term_sps(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_LONG_TERM_SPS);
    }

    public static byte nnum_long_term_pics(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_LONG_TERM_PICS);
    }

    public static ByteBuffer nlt_idx_sps(long struct) {
        return MemoryUtil.memByteBuffer(struct + LT_IDX_SPS, 32);
    }

    public static byte nlt_idx_sps(long struct, int index) {
        return MemoryUtil.memGetByte(struct + LT_IDX_SPS + (Checks.check(index, 32) * 1));
    }

    public static ByteBuffer npoc_lsb_lt(long struct) {
        return MemoryUtil.memByteBuffer(struct + POC_LSB_LT, 16);
    }

    public static byte npoc_lsb_lt(long struct, int index) {
        return MemoryUtil.memGetByte(struct + POC_LSB_LT + (Checks.check(index, 16) * 1));
    }

    public static short nused_by_curr_pic_lt_flag(long struct) {
        return MemoryUtil.memGetShort(struct + USED_BY_CURR_PIC_LT_FLAG);
    }

    public static ByteBuffer ndelta_poc_msb_present_flag(long struct) {
        return MemoryUtil.memByteBuffer(struct + DELTA_POC_MSB_PRESENT_FLAG, 48);
    }

    public static byte ndelta_poc_msb_present_flag(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DELTA_POC_MSB_PRESENT_FLAG + (Checks.check(index, 48) * 1));
    }

    public static ByteBuffer ndelta_poc_msb_cycle_lt(long struct) {
        return MemoryUtil.memByteBuffer(struct + DELTA_POC_MSB_CYCLE_LT, 48);
    }

    public static byte ndelta_poc_msb_cycle_lt(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DELTA_POC_MSB_CYCLE_LT + (Checks.check(index, 48) * 1));
    }

    public static void nnum_long_term_sps(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_LONG_TERM_SPS, value);
    }

    public static void nnum_long_term_pics(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_LONG_TERM_PICS, value);
    }

    public static void nlt_idx_sps(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LT_IDX_SPS, value.remaining() * 1);
    }

    public static void nlt_idx_sps(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + LT_IDX_SPS + (Checks.check(index, 32) * 1), value);
    }

    public static void npoc_lsb_lt(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 16);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + POC_LSB_LT, value.remaining() * 1);
    }

    public static void npoc_lsb_lt(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + POC_LSB_LT + (Checks.check(index, 16) * 1), value);
    }

    public static void nused_by_curr_pic_lt_flag(long struct, short value) {
        MemoryUtil.memPutShort(struct + USED_BY_CURR_PIC_LT_FLAG, value);
    }

    public static void ndelta_poc_msb_present_flag(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 48);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_POC_MSB_PRESENT_FLAG, value.remaining() * 1);
    }

    public static void ndelta_poc_msb_present_flag(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_POC_MSB_PRESENT_FLAG + (Checks.check(index, 48) * 1), value);
    }

    public static void ndelta_poc_msb_cycle_lt(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 48);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_POC_MSB_CYCLE_LT, value.remaining() * 1);
    }

    public static void ndelta_poc_msb_cycle_lt(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + DELTA_POC_MSB_CYCLE_LT + (Checks.check(index, 48) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265LongTermRefPics$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265LongTermRefPics$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265LongTermRefPics, Buffer> implements NativeResource {
        private static final StdVideoEncodeH265LongTermRefPics ELEMENT_FACTORY = StdVideoEncodeH265LongTermRefPics.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH265LongTermRefPics.SIZEOF);
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
        public StdVideoEncodeH265LongTermRefPics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t")
        public byte num_long_term_sps() {
            return StdVideoEncodeH265LongTermRefPics.nnum_long_term_sps(address());
        }

        @NativeType("uint8_t")
        public byte num_long_term_pics() {
            return StdVideoEncodeH265LongTermRefPics.nnum_long_term_pics(address());
        }

        @NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
        public ByteBuffer lt_idx_sps() {
            return StdVideoEncodeH265LongTermRefPics.nlt_idx_sps(address());
        }

        @NativeType("uint8_t")
        public byte lt_idx_sps(int index) {
            return StdVideoEncodeH265LongTermRefPics.nlt_idx_sps(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]")
        public ByteBuffer poc_lsb_lt() {
            return StdVideoEncodeH265LongTermRefPics.npoc_lsb_lt(address());
        }

        @NativeType("uint8_t")
        public byte poc_lsb_lt(int index) {
            return StdVideoEncodeH265LongTermRefPics.npoc_lsb_lt(address(), index);
        }

        @NativeType("uint16_t")
        public short used_by_curr_pic_lt_flag() {
            return StdVideoEncodeH265LongTermRefPics.nused_by_curr_pic_lt_flag(address());
        }

        @NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
        public ByteBuffer delta_poc_msb_present_flag() {
            return StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_present_flag(address());
        }

        @NativeType("uint8_t")
        public byte delta_poc_msb_present_flag(int index) {
            return StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_present_flag(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
        public ByteBuffer delta_poc_msb_cycle_lt() {
            return StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_cycle_lt(address());
        }

        @NativeType("uint8_t")
        public byte delta_poc_msb_cycle_lt(int index) {
            return StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_cycle_lt(address(), index);
        }

        public Buffer num_long_term_sps(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265LongTermRefPics.nnum_long_term_sps(address(), value);
            return this;
        }

        public Buffer num_long_term_pics(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265LongTermRefPics.nnum_long_term_pics(address(), value);
            return this;
        }

        public Buffer lt_idx_sps(@NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") ByteBuffer value) {
            StdVideoEncodeH265LongTermRefPics.nlt_idx_sps(address(), value);
            return this;
        }

        public Buffer lt_idx_sps(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeH265LongTermRefPics.nlt_idx_sps(address(), index, value);
            return this;
        }

        public Buffer poc_lsb_lt(@NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]") ByteBuffer value) {
            StdVideoEncodeH265LongTermRefPics.npoc_lsb_lt(address(), value);
            return this;
        }

        public Buffer poc_lsb_lt(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeH265LongTermRefPics.npoc_lsb_lt(address(), index, value);
            return this;
        }

        public Buffer used_by_curr_pic_lt_flag(@NativeType("uint16_t") short value) {
            StdVideoEncodeH265LongTermRefPics.nused_by_curr_pic_lt_flag(address(), value);
            return this;
        }

        public Buffer delta_poc_msb_present_flag(@NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") ByteBuffer value) {
            StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_present_flag(address(), value);
            return this;
        }

        public Buffer delta_poc_msb_present_flag(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_present_flag(address(), index, value);
            return this;
        }

        public Buffer delta_poc_msb_cycle_lt(@NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") ByteBuffer value) {
            StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_cycle_lt(address(), value);
            return this;
        }

        public Buffer delta_poc_msb_cycle_lt(int index, @NativeType("uint8_t") byte value) {
            StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_cycle_lt(address(), index, value);
            return this;
        }
    }
}
