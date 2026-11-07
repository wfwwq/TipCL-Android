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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265VideoParameterSet.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265VideoParameterSet.class */
public class StdVideoH265VideoParameterSet extends Struct<StdVideoH265VideoParameterSet> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int VPS_VIDEO_PARAMETER_SET_ID;
    public static final int VPS_MAX_SUB_LAYERS_MINUS1;
    public static final int RESERVED1;
    public static final int RESERVED2;
    public static final int VPS_NUM_UNITS_IN_TICK;
    public static final int VPS_TIME_SCALE;
    public static final int VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1;
    public static final int RESERVED3;
    public static final int PDECPICBUFMGR;
    public static final int PHRDPARAMETERS;
    public static final int PPROFILETIERLEVEL;

    static {
        Struct.Layout layout = __struct(__member(StdVideoH265VpsFlags.SIZEOF, StdVideoH265VpsFlags.ALIGNOF), __member(1), __member(1), __member(1), __member(1), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        VPS_VIDEO_PARAMETER_SET_ID = layout.offsetof(1);
        VPS_MAX_SUB_LAYERS_MINUS1 = layout.offsetof(2);
        RESERVED1 = layout.offsetof(3);
        RESERVED2 = layout.offsetof(4);
        VPS_NUM_UNITS_IN_TICK = layout.offsetof(5);
        VPS_TIME_SCALE = layout.offsetof(6);
        VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1 = layout.offsetof(7);
        RESERVED3 = layout.offsetof(8);
        PDECPICBUFMGR = layout.offsetof(9);
        PHRDPARAMETERS = layout.offsetof(10);
        PPROFILETIERLEVEL = layout.offsetof(11);
    }

    protected StdVideoH265VideoParameterSet(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265VideoParameterSet create(long address, ByteBuffer container) {
        return new StdVideoH265VideoParameterSet(address, container);
    }

    public StdVideoH265VideoParameterSet(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoH265VpsFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte vps_video_parameter_set_id() {
        return nvps_video_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte vps_max_sub_layers_minus1() {
        return nvps_max_sub_layers_minus1(address());
    }

    @NativeType("uint32_t")
    public int vps_num_units_in_tick() {
        return nvps_num_units_in_tick(address());
    }

    @NativeType("uint32_t")
    public int vps_time_scale() {
        return nvps_time_scale(address());
    }

    @NativeType("uint32_t")
    public int vps_num_ticks_poc_diff_one_minus1() {
        return nvps_num_ticks_poc_diff_one_minus1(address());
    }

    @NativeType("StdVideoH265DecPicBufMgr const *")
    public StdVideoH265DecPicBufMgr pDecPicBufMgr() {
        return npDecPicBufMgr(address());
    }

    @NativeType("StdVideoH265HrdParameters const *")
    public StdVideoH265HrdParameters pHrdParameters() {
        return npHrdParameters(address());
    }

    @NativeType("StdVideoH265ProfileTierLevel const *")
    public StdVideoH265ProfileTierLevel pProfileTierLevel() {
        return npProfileTierLevel(address());
    }

    public StdVideoH265VideoParameterSet flags(StdVideoH265VpsFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoH265VideoParameterSet flags(Consumer<StdVideoH265VpsFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoH265VideoParameterSet vps_video_parameter_set_id(@NativeType("uint8_t") byte value) {
        nvps_video_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoH265VideoParameterSet vps_max_sub_layers_minus1(@NativeType("uint8_t") byte value) {
        nvps_max_sub_layers_minus1(address(), value);
        return this;
    }

    public StdVideoH265VideoParameterSet vps_num_units_in_tick(@NativeType("uint32_t") int value) {
        nvps_num_units_in_tick(address(), value);
        return this;
    }

    public StdVideoH265VideoParameterSet vps_time_scale(@NativeType("uint32_t") int value) {
        nvps_time_scale(address(), value);
        return this;
    }

    public StdVideoH265VideoParameterSet vps_num_ticks_poc_diff_one_minus1(@NativeType("uint32_t") int value) {
        nvps_num_ticks_poc_diff_one_minus1(address(), value);
        return this;
    }

    public StdVideoH265VideoParameterSet pDecPicBufMgr(@NativeType("StdVideoH265DecPicBufMgr const *") StdVideoH265DecPicBufMgr value) {
        npDecPicBufMgr(address(), value);
        return this;
    }

    public StdVideoH265VideoParameterSet pHrdParameters(@NativeType("StdVideoH265HrdParameters const *") StdVideoH265HrdParameters value) {
        npHrdParameters(address(), value);
        return this;
    }

    public StdVideoH265VideoParameterSet pProfileTierLevel(@NativeType("StdVideoH265ProfileTierLevel const *") StdVideoH265ProfileTierLevel value) {
        npProfileTierLevel(address(), value);
        return this;
    }

    public StdVideoH265VideoParameterSet set(StdVideoH265VpsFlags flags, byte vps_video_parameter_set_id, byte vps_max_sub_layers_minus1, int vps_num_units_in_tick, int vps_time_scale, int vps_num_ticks_poc_diff_one_minus1, StdVideoH265DecPicBufMgr pDecPicBufMgr, StdVideoH265HrdParameters pHrdParameters, StdVideoH265ProfileTierLevel pProfileTierLevel) {
        flags(flags);
        vps_video_parameter_set_id(vps_video_parameter_set_id);
        vps_max_sub_layers_minus1(vps_max_sub_layers_minus1);
        vps_num_units_in_tick(vps_num_units_in_tick);
        vps_time_scale(vps_time_scale);
        vps_num_ticks_poc_diff_one_minus1(vps_num_ticks_poc_diff_one_minus1);
        pDecPicBufMgr(pDecPicBufMgr);
        pHrdParameters(pHrdParameters);
        pProfileTierLevel(pProfileTierLevel);
        return this;
    }

    public StdVideoH265VideoParameterSet set(StdVideoH265VideoParameterSet src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265VideoParameterSet malloc() {
        return new StdVideoH265VideoParameterSet(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265VideoParameterSet calloc() {
        return new StdVideoH265VideoParameterSet(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265VideoParameterSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265VideoParameterSet(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265VideoParameterSet create(long address) {
        return new StdVideoH265VideoParameterSet(address, null);
    }

    public static StdVideoH265VideoParameterSet createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265VideoParameterSet(address, null);
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

    public static StdVideoH265VideoParameterSet malloc(MemoryStack stack) {
        return new StdVideoH265VideoParameterSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265VideoParameterSet calloc(MemoryStack stack) {
        return new StdVideoH265VideoParameterSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoH265VpsFlags nflags(long struct) {
        return StdVideoH265VpsFlags.create(struct + FLAGS);
    }

    public static byte nvps_video_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + VPS_VIDEO_PARAMETER_SET_ID);
    }

    public static byte nvps_max_sub_layers_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + VPS_MAX_SUB_LAYERS_MINUS1);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static byte nreserved2(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED2);
    }

    public static int nvps_num_units_in_tick(long struct) {
        return MemoryUtil.memGetInt(struct + VPS_NUM_UNITS_IN_TICK);
    }

    public static int nvps_time_scale(long struct) {
        return MemoryUtil.memGetInt(struct + VPS_TIME_SCALE);
    }

    public static int nvps_num_ticks_poc_diff_one_minus1(long struct) {
        return MemoryUtil.memGetInt(struct + VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1);
    }

    public static int nreserved3(long struct) {
        return MemoryUtil.memGetInt(struct + RESERVED3);
    }

    public static StdVideoH265DecPicBufMgr npDecPicBufMgr(long struct) {
        return StdVideoH265DecPicBufMgr.create(MemoryUtil.memGetAddress(struct + PDECPICBUFMGR));
    }

    public static StdVideoH265HrdParameters npHrdParameters(long struct) {
        return StdVideoH265HrdParameters.create(MemoryUtil.memGetAddress(struct + PHRDPARAMETERS));
    }

    public static StdVideoH265ProfileTierLevel npProfileTierLevel(long struct) {
        return StdVideoH265ProfileTierLevel.create(MemoryUtil.memGetAddress(struct + PPROFILETIERLEVEL));
    }

    public static void nflags(long struct, StdVideoH265VpsFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoH265VpsFlags.SIZEOF);
    }

    public static void nvps_video_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + VPS_VIDEO_PARAMETER_SET_ID, value);
    }

    public static void nvps_max_sub_layers_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + VPS_MAX_SUB_LAYERS_MINUS1, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void nreserved2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED2, value);
    }

    public static void nvps_num_units_in_tick(long struct, int value) {
        MemoryUtil.memPutInt(struct + VPS_NUM_UNITS_IN_TICK, value);
    }

    public static void nvps_time_scale(long struct, int value) {
        MemoryUtil.memPutInt(struct + VPS_TIME_SCALE, value);
    }

    public static void nvps_num_ticks_poc_diff_one_minus1(long struct, int value) {
        MemoryUtil.memPutInt(struct + VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1, value);
    }

    public static void nreserved3(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESERVED3, value);
    }

    public static void npDecPicBufMgr(long struct, StdVideoH265DecPicBufMgr value) {
        MemoryUtil.memPutAddress(struct + PDECPICBUFMGR, value.address());
    }

    public static void npHrdParameters(long struct, StdVideoH265HrdParameters value) {
        MemoryUtil.memPutAddress(struct + PHRDPARAMETERS, value.address());
    }

    public static void npProfileTierLevel(long struct, StdVideoH265ProfileTierLevel value) {
        MemoryUtil.memPutAddress(struct + PPROFILETIERLEVEL, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDECPICBUFMGR));
        long pHrdParameters = MemoryUtil.memGetAddress(struct + PHRDPARAMETERS);
        Checks.check(pHrdParameters);
        StdVideoH265HrdParameters.validate(pHrdParameters);
        Checks.check(MemoryUtil.memGetAddress(struct + PPROFILETIERLEVEL));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265VideoParameterSet$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265VideoParameterSet$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265VideoParameterSet, Buffer> implements NativeResource {
        private static final StdVideoH265VideoParameterSet ELEMENT_FACTORY = StdVideoH265VideoParameterSet.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265VideoParameterSet.SIZEOF);
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
        public StdVideoH265VideoParameterSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoH265VpsFlags flags() {
            return StdVideoH265VideoParameterSet.nflags(address());
        }

        @NativeType("uint8_t")
        public byte vps_video_parameter_set_id() {
            return StdVideoH265VideoParameterSet.nvps_video_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte vps_max_sub_layers_minus1() {
            return StdVideoH265VideoParameterSet.nvps_max_sub_layers_minus1(address());
        }

        @NativeType("uint32_t")
        public int vps_num_units_in_tick() {
            return StdVideoH265VideoParameterSet.nvps_num_units_in_tick(address());
        }

        @NativeType("uint32_t")
        public int vps_time_scale() {
            return StdVideoH265VideoParameterSet.nvps_time_scale(address());
        }

        @NativeType("uint32_t")
        public int vps_num_ticks_poc_diff_one_minus1() {
            return StdVideoH265VideoParameterSet.nvps_num_ticks_poc_diff_one_minus1(address());
        }

        @NativeType("StdVideoH265DecPicBufMgr const *")
        public StdVideoH265DecPicBufMgr pDecPicBufMgr() {
            return StdVideoH265VideoParameterSet.npDecPicBufMgr(address());
        }

        @NativeType("StdVideoH265HrdParameters const *")
        public StdVideoH265HrdParameters pHrdParameters() {
            return StdVideoH265VideoParameterSet.npHrdParameters(address());
        }

        @NativeType("StdVideoH265ProfileTierLevel const *")
        public StdVideoH265ProfileTierLevel pProfileTierLevel() {
            return StdVideoH265VideoParameterSet.npProfileTierLevel(address());
        }

        public Buffer flags(StdVideoH265VpsFlags value) {
            StdVideoH265VideoParameterSet.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoH265VpsFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer vps_video_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoH265VideoParameterSet.nvps_video_parameter_set_id(address(), value);
            return this;
        }

        public Buffer vps_max_sub_layers_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265VideoParameterSet.nvps_max_sub_layers_minus1(address(), value);
            return this;
        }

        public Buffer vps_num_units_in_tick(@NativeType("uint32_t") int value) {
            StdVideoH265VideoParameterSet.nvps_num_units_in_tick(address(), value);
            return this;
        }

        public Buffer vps_time_scale(@NativeType("uint32_t") int value) {
            StdVideoH265VideoParameterSet.nvps_time_scale(address(), value);
            return this;
        }

        public Buffer vps_num_ticks_poc_diff_one_minus1(@NativeType("uint32_t") int value) {
            StdVideoH265VideoParameterSet.nvps_num_ticks_poc_diff_one_minus1(address(), value);
            return this;
        }

        public Buffer pDecPicBufMgr(@NativeType("StdVideoH265DecPicBufMgr const *") StdVideoH265DecPicBufMgr value) {
            StdVideoH265VideoParameterSet.npDecPicBufMgr(address(), value);
            return this;
        }

        public Buffer pHrdParameters(@NativeType("StdVideoH265HrdParameters const *") StdVideoH265HrdParameters value) {
            StdVideoH265VideoParameterSet.npHrdParameters(address(), value);
            return this;
        }

        public Buffer pProfileTierLevel(@NativeType("StdVideoH265ProfileTierLevel const *") StdVideoH265ProfileTierLevel value) {
            StdVideoH265VideoParameterSet.npProfileTierLevel(address(), value);
            return this;
        }
    }
}
