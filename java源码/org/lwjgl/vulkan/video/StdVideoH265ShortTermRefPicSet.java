package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSet.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSet.class */
public class StdVideoH265ShortTermRefPicSet extends Struct<StdVideoH265ShortTermRefPicSet> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int DELTA_IDX_MINUS1;
    public static final int USE_DELTA_FLAG;
    public static final int ABS_DELTA_RPS_MINUS1;
    public static final int USED_BY_CURR_PIC_FLAG;
    public static final int USED_BY_CURR_PIC_S0_FLAG;
    public static final int USED_BY_CURR_PIC_S1_FLAG;
    public static final int RESERVED1;
    public static final int RESERVED2;
    public static final int RESERVED3;
    public static final int NUM_NEGATIVE_PICS;
    public static final int NUM_POSITIVE_PICS;
    public static final int DELTA_POC_S0_MINUS1;
    public static final int DELTA_POC_S1_MINUS1;

    static {
        Struct.Layout layout = __struct(__member(StdVideoH265ShortTermRefPicSetFlags.SIZEOF, StdVideoH265ShortTermRefPicSetFlags.ALIGNOF), __member(4), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(1), __member(1), __member(1), __member(1), __array(2, 16), __array(2, 16));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        DELTA_IDX_MINUS1 = layout.offsetof(1);
        USE_DELTA_FLAG = layout.offsetof(2);
        ABS_DELTA_RPS_MINUS1 = layout.offsetof(3);
        USED_BY_CURR_PIC_FLAG = layout.offsetof(4);
        USED_BY_CURR_PIC_S0_FLAG = layout.offsetof(5);
        USED_BY_CURR_PIC_S1_FLAG = layout.offsetof(6);
        RESERVED1 = layout.offsetof(7);
        RESERVED2 = layout.offsetof(8);
        RESERVED3 = layout.offsetof(9);
        NUM_NEGATIVE_PICS = layout.offsetof(10);
        NUM_POSITIVE_PICS = layout.offsetof(11);
        DELTA_POC_S0_MINUS1 = layout.offsetof(12);
        DELTA_POC_S1_MINUS1 = layout.offsetof(13);
    }

    protected StdVideoH265ShortTermRefPicSet(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265ShortTermRefPicSet create(long address, ByteBuffer container) {
        return new StdVideoH265ShortTermRefPicSet(address, container);
    }

    public StdVideoH265ShortTermRefPicSet(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoH265ShortTermRefPicSetFlags flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int delta_idx_minus1() {
        return ndelta_idx_minus1(address());
    }

    @NativeType("uint16_t")
    public short use_delta_flag() {
        return nuse_delta_flag(address());
    }

    @NativeType("uint16_t")
    public short abs_delta_rps_minus1() {
        return nabs_delta_rps_minus1(address());
    }

    @NativeType("uint16_t")
    public short used_by_curr_pic_flag() {
        return nused_by_curr_pic_flag(address());
    }

    @NativeType("uint16_t")
    public short used_by_curr_pic_s0_flag() {
        return nused_by_curr_pic_s0_flag(address());
    }

    @NativeType("uint16_t")
    public short used_by_curr_pic_s1_flag() {
        return nused_by_curr_pic_s1_flag(address());
    }

    @NativeType("uint8_t")
    public byte num_negative_pics() {
        return nnum_negative_pics(address());
    }

    @NativeType("uint8_t")
    public byte num_positive_pics() {
        return nnum_positive_pics(address());
    }

    @NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
    public ShortBuffer delta_poc_s0_minus1() {
        return ndelta_poc_s0_minus1(address());
    }

    @NativeType("uint16_t")
    public short delta_poc_s0_minus1(int index) {
        return ndelta_poc_s0_minus1(address(), index);
    }

    @NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
    public ShortBuffer delta_poc_s1_minus1() {
        return ndelta_poc_s1_minus1(address());
    }

    @NativeType("uint16_t")
    public short delta_poc_s1_minus1(int index) {
        return ndelta_poc_s1_minus1(address(), index);
    }

    public StdVideoH265ShortTermRefPicSet flags(StdVideoH265ShortTermRefPicSetFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet flags(Consumer<StdVideoH265ShortTermRefPicSetFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoH265ShortTermRefPicSet delta_idx_minus1(@NativeType("uint32_t") int value) {
        ndelta_idx_minus1(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet use_delta_flag(@NativeType("uint16_t") short value) {
        nuse_delta_flag(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet abs_delta_rps_minus1(@NativeType("uint16_t") short value) {
        nabs_delta_rps_minus1(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_flag(@NativeType("uint16_t") short value) {
        nused_by_curr_pic_flag(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s0_flag(@NativeType("uint16_t") short value) {
        nused_by_curr_pic_s0_flag(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s1_flag(@NativeType("uint16_t") short value) {
        nused_by_curr_pic_s1_flag(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet num_negative_pics(@NativeType("uint8_t") byte value) {
        nnum_negative_pics(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet num_positive_pics(@NativeType("uint8_t") byte value) {
        nnum_positive_pics(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1(@NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") ShortBuffer value) {
        ndelta_poc_s0_minus1(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1(int index, @NativeType("uint16_t") short value) {
        ndelta_poc_s0_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1(@NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") ShortBuffer value) {
        ndelta_poc_s1_minus1(address(), value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1(int index, @NativeType("uint16_t") short value) {
        ndelta_poc_s1_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet set(StdVideoH265ShortTermRefPicSetFlags flags, int delta_idx_minus1, short use_delta_flag, short abs_delta_rps_minus1, short used_by_curr_pic_flag, short used_by_curr_pic_s0_flag, short used_by_curr_pic_s1_flag, byte num_negative_pics, byte num_positive_pics, ShortBuffer delta_poc_s0_minus1, ShortBuffer delta_poc_s1_minus1) {
        flags(flags);
        delta_idx_minus1(delta_idx_minus1);
        use_delta_flag(use_delta_flag);
        abs_delta_rps_minus1(abs_delta_rps_minus1);
        used_by_curr_pic_flag(used_by_curr_pic_flag);
        used_by_curr_pic_s0_flag(used_by_curr_pic_s0_flag);
        used_by_curr_pic_s1_flag(used_by_curr_pic_s1_flag);
        num_negative_pics(num_negative_pics);
        num_positive_pics(num_positive_pics);
        delta_poc_s0_minus1(delta_poc_s0_minus1);
        delta_poc_s1_minus1(delta_poc_s1_minus1);
        return this;
    }

    public StdVideoH265ShortTermRefPicSet set(StdVideoH265ShortTermRefPicSet src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265ShortTermRefPicSet malloc() {
        return new StdVideoH265ShortTermRefPicSet(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265ShortTermRefPicSet calloc() {
        return new StdVideoH265ShortTermRefPicSet(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265ShortTermRefPicSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265ShortTermRefPicSet(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265ShortTermRefPicSet create(long address) {
        return new StdVideoH265ShortTermRefPicSet(address, null);
    }

    public static StdVideoH265ShortTermRefPicSet createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265ShortTermRefPicSet(address, null);
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

    public static StdVideoH265ShortTermRefPicSet malloc(MemoryStack stack) {
        return new StdVideoH265ShortTermRefPicSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265ShortTermRefPicSet calloc(MemoryStack stack) {
        return new StdVideoH265ShortTermRefPicSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoH265ShortTermRefPicSetFlags nflags(long struct) {
        return StdVideoH265ShortTermRefPicSetFlags.create(struct + FLAGS);
    }

    public static int ndelta_idx_minus1(long struct) {
        return MemoryUtil.memGetInt(struct + DELTA_IDX_MINUS1);
    }

    public static short nuse_delta_flag(long struct) {
        return MemoryUtil.memGetShort(struct + USE_DELTA_FLAG);
    }

    public static short nabs_delta_rps_minus1(long struct) {
        return MemoryUtil.memGetShort(struct + ABS_DELTA_RPS_MINUS1);
    }

    public static short nused_by_curr_pic_flag(long struct) {
        return MemoryUtil.memGetShort(struct + USED_BY_CURR_PIC_FLAG);
    }

    public static short nused_by_curr_pic_s0_flag(long struct) {
        return MemoryUtil.memGetShort(struct + USED_BY_CURR_PIC_S0_FLAG);
    }

    public static short nused_by_curr_pic_s1_flag(long struct) {
        return MemoryUtil.memGetShort(struct + USED_BY_CURR_PIC_S1_FLAG);
    }

    public static short nreserved1(long struct) {
        return MemoryUtil.memGetShort(struct + RESERVED1);
    }

    public static byte nreserved2(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED2);
    }

    public static byte nreserved3(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED3);
    }

    public static byte nnum_negative_pics(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_NEGATIVE_PICS);
    }

    public static byte nnum_positive_pics(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_POSITIVE_PICS);
    }

    public static ShortBuffer ndelta_poc_s0_minus1(long struct) {
        return MemoryUtil.memShortBuffer(struct + DELTA_POC_S0_MINUS1, 16);
    }

    public static short ndelta_poc_s0_minus1(long struct, int index) {
        return MemoryUtil.memGetShort(struct + DELTA_POC_S0_MINUS1 + (Checks.check(index, 16) * 2));
    }

    public static ShortBuffer ndelta_poc_s1_minus1(long struct) {
        return MemoryUtil.memShortBuffer(struct + DELTA_POC_S1_MINUS1, 16);
    }

    public static short ndelta_poc_s1_minus1(long struct, int index) {
        return MemoryUtil.memGetShort(struct + DELTA_POC_S1_MINUS1 + (Checks.check(index, 16) * 2));
    }

    public static void nflags(long struct, StdVideoH265ShortTermRefPicSetFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoH265ShortTermRefPicSetFlags.SIZEOF);
    }

    public static void ndelta_idx_minus1(long struct, int value) {
        MemoryUtil.memPutInt(struct + DELTA_IDX_MINUS1, value);
    }

    public static void nuse_delta_flag(long struct, short value) {
        MemoryUtil.memPutShort(struct + USE_DELTA_FLAG, value);
    }

    public static void nabs_delta_rps_minus1(long struct, short value) {
        MemoryUtil.memPutShort(struct + ABS_DELTA_RPS_MINUS1, value);
    }

    public static void nused_by_curr_pic_flag(long struct, short value) {
        MemoryUtil.memPutShort(struct + USED_BY_CURR_PIC_FLAG, value);
    }

    public static void nused_by_curr_pic_s0_flag(long struct, short value) {
        MemoryUtil.memPutShort(struct + USED_BY_CURR_PIC_S0_FLAG, value);
    }

    public static void nused_by_curr_pic_s1_flag(long struct, short value) {
        MemoryUtil.memPutShort(struct + USED_BY_CURR_PIC_S1_FLAG, value);
    }

    public static void nreserved1(long struct, short value) {
        MemoryUtil.memPutShort(struct + RESERVED1, value);
    }

    public static void nreserved2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED2, value);
    }

    public static void nreserved3(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED3, value);
    }

    public static void nnum_negative_pics(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_NEGATIVE_PICS, value);
    }

    public static void nnum_positive_pics(long struct, byte value) {
        MemoryUtil.memPutByte(struct + NUM_POSITIVE_PICS, value);
    }

    public static void ndelta_poc_s0_minus1(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 16);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_POC_S0_MINUS1, value.remaining() * 2);
    }

    public static void ndelta_poc_s0_minus1(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + DELTA_POC_S0_MINUS1 + (Checks.check(index, 16) * 2), value);
    }

    public static void ndelta_poc_s1_minus1(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 16);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DELTA_POC_S1_MINUS1, value.remaining() * 2);
    }

    public static void ndelta_poc_s1_minus1(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + DELTA_POC_S1_MINUS1 + (Checks.check(index, 16) * 2), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSet$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSet$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265ShortTermRefPicSet, Buffer> implements NativeResource {
        private static final StdVideoH265ShortTermRefPicSet ELEMENT_FACTORY = StdVideoH265ShortTermRefPicSet.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265ShortTermRefPicSet.SIZEOF);
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
        public StdVideoH265ShortTermRefPicSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoH265ShortTermRefPicSetFlags flags() {
            return StdVideoH265ShortTermRefPicSet.nflags(address());
        }

        @NativeType("uint32_t")
        public int delta_idx_minus1() {
            return StdVideoH265ShortTermRefPicSet.ndelta_idx_minus1(address());
        }

        @NativeType("uint16_t")
        public short use_delta_flag() {
            return StdVideoH265ShortTermRefPicSet.nuse_delta_flag(address());
        }

        @NativeType("uint16_t")
        public short abs_delta_rps_minus1() {
            return StdVideoH265ShortTermRefPicSet.nabs_delta_rps_minus1(address());
        }

        @NativeType("uint16_t")
        public short used_by_curr_pic_flag() {
            return StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_flag(address());
        }

        @NativeType("uint16_t")
        public short used_by_curr_pic_s0_flag() {
            return StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s0_flag(address());
        }

        @NativeType("uint16_t")
        public short used_by_curr_pic_s1_flag() {
            return StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s1_flag(address());
        }

        @NativeType("uint8_t")
        public byte num_negative_pics() {
            return StdVideoH265ShortTermRefPicSet.nnum_negative_pics(address());
        }

        @NativeType("uint8_t")
        public byte num_positive_pics() {
            return StdVideoH265ShortTermRefPicSet.nnum_positive_pics(address());
        }

        @NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
        public ShortBuffer delta_poc_s0_minus1() {
            return StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(address());
        }

        @NativeType("uint16_t")
        public short delta_poc_s0_minus1(int index) {
            return StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(address(), index);
        }

        @NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
        public ShortBuffer delta_poc_s1_minus1() {
            return StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(address());
        }

        @NativeType("uint16_t")
        public short delta_poc_s1_minus1(int index) {
            return StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(address(), index);
        }

        public Buffer flags(StdVideoH265ShortTermRefPicSetFlags value) {
            StdVideoH265ShortTermRefPicSet.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoH265ShortTermRefPicSetFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer delta_idx_minus1(@NativeType("uint32_t") int value) {
            StdVideoH265ShortTermRefPicSet.ndelta_idx_minus1(address(), value);
            return this;
        }

        public Buffer use_delta_flag(@NativeType("uint16_t") short value) {
            StdVideoH265ShortTermRefPicSet.nuse_delta_flag(address(), value);
            return this;
        }

        public Buffer abs_delta_rps_minus1(@NativeType("uint16_t") short value) {
            StdVideoH265ShortTermRefPicSet.nabs_delta_rps_minus1(address(), value);
            return this;
        }

        public Buffer used_by_curr_pic_flag(@NativeType("uint16_t") short value) {
            StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_flag(address(), value);
            return this;
        }

        public Buffer used_by_curr_pic_s0_flag(@NativeType("uint16_t") short value) {
            StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s0_flag(address(), value);
            return this;
        }

        public Buffer used_by_curr_pic_s1_flag(@NativeType("uint16_t") short value) {
            StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s1_flag(address(), value);
            return this;
        }

        public Buffer num_negative_pics(@NativeType("uint8_t") byte value) {
            StdVideoH265ShortTermRefPicSet.nnum_negative_pics(address(), value);
            return this;
        }

        public Buffer num_positive_pics(@NativeType("uint8_t") byte value) {
            StdVideoH265ShortTermRefPicSet.nnum_positive_pics(address(), value);
            return this;
        }

        public Buffer delta_poc_s0_minus1(@NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") ShortBuffer value) {
            StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(address(), value);
            return this;
        }

        public Buffer delta_poc_s0_minus1(int index, @NativeType("uint16_t") short value) {
            StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(address(), index, value);
            return this;
        }

        public Buffer delta_poc_s1_minus1(@NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") ShortBuffer value) {
            StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(address(), value);
            return this;
        }

        public Buffer delta_poc_s1_minus1(int index, @NativeType("uint16_t") short value) {
            StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(address(), index, value);
            return this;
        }
    }
}
