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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265LongTermRefPicsSps.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265LongTermRefPicsSps.class */
public class StdVideoH265LongTermRefPicsSps extends Struct<StdVideoH265LongTermRefPicsSps> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int USED_BY_CURR_PIC_LT_SPS_FLAG;
    public static final int LT_REF_PIC_POC_LSB_SPS;

    static {
        Struct.Layout layout = __struct(__member(4), __array(4, 32));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        USED_BY_CURR_PIC_LT_SPS_FLAG = layout.offsetof(0);
        LT_REF_PIC_POC_LSB_SPS = layout.offsetof(1);
    }

    protected StdVideoH265LongTermRefPicsSps(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265LongTermRefPicsSps create(long address, ByteBuffer container) {
        return new StdVideoH265LongTermRefPicsSps(address, container);
    }

    public StdVideoH265LongTermRefPicsSps(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int used_by_curr_pic_lt_sps_flag() {
        return nused_by_curr_pic_lt_sps_flag(address());
    }

    @NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
    public IntBuffer lt_ref_pic_poc_lsb_sps() {
        return nlt_ref_pic_poc_lsb_sps(address());
    }

    @NativeType("uint32_t")
    public int lt_ref_pic_poc_lsb_sps(int index) {
        return nlt_ref_pic_poc_lsb_sps(address(), index);
    }

    public StdVideoH265LongTermRefPicsSps used_by_curr_pic_lt_sps_flag(@NativeType("uint32_t") int value) {
        nused_by_curr_pic_lt_sps_flag(address(), value);
        return this;
    }

    public StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(@NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") IntBuffer value) {
        nlt_ref_pic_poc_lsb_sps(address(), value);
        return this;
    }

    public StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(int index, @NativeType("uint32_t") int value) {
        nlt_ref_pic_poc_lsb_sps(address(), index, value);
        return this;
    }

    public StdVideoH265LongTermRefPicsSps set(int used_by_curr_pic_lt_sps_flag, IntBuffer lt_ref_pic_poc_lsb_sps) {
        used_by_curr_pic_lt_sps_flag(used_by_curr_pic_lt_sps_flag);
        lt_ref_pic_poc_lsb_sps(lt_ref_pic_poc_lsb_sps);
        return this;
    }

    public StdVideoH265LongTermRefPicsSps set(StdVideoH265LongTermRefPicsSps src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265LongTermRefPicsSps malloc() {
        return new StdVideoH265LongTermRefPicsSps(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265LongTermRefPicsSps calloc() {
        return new StdVideoH265LongTermRefPicsSps(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265LongTermRefPicsSps create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265LongTermRefPicsSps(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265LongTermRefPicsSps create(long address) {
        return new StdVideoH265LongTermRefPicsSps(address, null);
    }

    public static StdVideoH265LongTermRefPicsSps createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265LongTermRefPicsSps(address, null);
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

    public static StdVideoH265LongTermRefPicsSps malloc(MemoryStack stack) {
        return new StdVideoH265LongTermRefPicsSps(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265LongTermRefPicsSps calloc(MemoryStack stack) {
        return new StdVideoH265LongTermRefPicsSps(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nused_by_curr_pic_lt_sps_flag(long struct) {
        return MemoryUtil.memGetInt(struct + USED_BY_CURR_PIC_LT_SPS_FLAG);
    }

    public static IntBuffer nlt_ref_pic_poc_lsb_sps(long struct) {
        return MemoryUtil.memIntBuffer(struct + LT_REF_PIC_POC_LSB_SPS, 32);
    }

    public static int nlt_ref_pic_poc_lsb_sps(long struct, int index) {
        return MemoryUtil.memGetInt(struct + LT_REF_PIC_POC_LSB_SPS + (Checks.check(index, 32) * 4));
    }

    public static void nused_by_curr_pic_lt_sps_flag(long struct, int value) {
        MemoryUtil.memPutInt(struct + USED_BY_CURR_PIC_LT_SPS_FLAG, value);
    }

    public static void nlt_ref_pic_poc_lsb_sps(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LT_REF_PIC_POC_LSB_SPS, value.remaining() * 4);
    }

    public static void nlt_ref_pic_poc_lsb_sps(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + LT_REF_PIC_POC_LSB_SPS + (Checks.check(index, 32) * 4), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265LongTermRefPicsSps$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265LongTermRefPicsSps$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265LongTermRefPicsSps, Buffer> implements NativeResource {
        private static final StdVideoH265LongTermRefPicsSps ELEMENT_FACTORY = StdVideoH265LongTermRefPicsSps.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265LongTermRefPicsSps.SIZEOF);
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
        public StdVideoH265LongTermRefPicsSps getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int used_by_curr_pic_lt_sps_flag() {
            return StdVideoH265LongTermRefPicsSps.nused_by_curr_pic_lt_sps_flag(address());
        }

        @NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
        public IntBuffer lt_ref_pic_poc_lsb_sps() {
            return StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(address());
        }

        @NativeType("uint32_t")
        public int lt_ref_pic_poc_lsb_sps(int index) {
            return StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(address(), index);
        }

        public Buffer used_by_curr_pic_lt_sps_flag(@NativeType("uint32_t") int value) {
            StdVideoH265LongTermRefPicsSps.nused_by_curr_pic_lt_sps_flag(address(), value);
            return this;
        }

        public Buffer lt_ref_pic_poc_lsb_sps(@NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") IntBuffer value) {
            StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(address(), value);
            return this;
        }

        public Buffer lt_ref_pic_poc_lsb_sps(int index, @NativeType("uint32_t") int value) {
            StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(address(), index, value);
            return this;
        }
    }
}
