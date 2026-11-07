package org.lwjgl.vulkan.video;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265HrdFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265HrdFlags.class */
public class StdVideoH265HrdFlags extends Struct<StdVideoH265HrdFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;
    public static final int BITFIELD1;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoH265HrdFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265HrdFlags create(long address, ByteBuffer container) {
        return new StdVideoH265HrdFlags(address, container);
    }

    public StdVideoH265HrdFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean nal_hrd_parameters_present_flag() {
        return nnal_hrd_parameters_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean vcl_hrd_parameters_present_flag() {
        return nvcl_hrd_parameters_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sub_pic_hrd_params_present_flag() {
        return nsub_pic_hrd_params_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean sub_pic_cpb_params_in_pic_timing_sei_flag() {
        return nsub_pic_cpb_params_in_pic_timing_sei_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public int fixed_pic_rate_general_flag() {
        return nfixed_pic_rate_general_flag(address());
    }

    @NativeType("uint32_t")
    public int fixed_pic_rate_within_cvs_flag() {
        return nfixed_pic_rate_within_cvs_flag(address());
    }

    @NativeType("uint32_t")
    public int low_delay_hrd_flag() {
        return nlow_delay_hrd_flag(address());
    }

    public StdVideoH265HrdFlags nal_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) {
        nnal_hrd_parameters_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265HrdFlags vcl_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) {
        nvcl_hrd_parameters_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265HrdFlags sub_pic_hrd_params_present_flag(@NativeType("uint32_t") boolean value) {
        nsub_pic_hrd_params_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265HrdFlags sub_pic_cpb_params_in_pic_timing_sei_flag(@NativeType("uint32_t") boolean value) {
        nsub_pic_cpb_params_in_pic_timing_sei_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265HrdFlags fixed_pic_rate_general_flag(@NativeType("uint32_t") int value) {
        nfixed_pic_rate_general_flag(address(), value);
        return this;
    }

    public StdVideoH265HrdFlags fixed_pic_rate_within_cvs_flag(@NativeType("uint32_t") int value) {
        nfixed_pic_rate_within_cvs_flag(address(), value);
        return this;
    }

    public StdVideoH265HrdFlags low_delay_hrd_flag(@NativeType("uint32_t") int value) {
        nlow_delay_hrd_flag(address(), value);
        return this;
    }

    public StdVideoH265HrdFlags set(boolean nal_hrd_parameters_present_flag, boolean vcl_hrd_parameters_present_flag, boolean sub_pic_hrd_params_present_flag, boolean sub_pic_cpb_params_in_pic_timing_sei_flag, int fixed_pic_rate_general_flag, int fixed_pic_rate_within_cvs_flag, int low_delay_hrd_flag) {
        nal_hrd_parameters_present_flag(nal_hrd_parameters_present_flag);
        vcl_hrd_parameters_present_flag(vcl_hrd_parameters_present_flag);
        sub_pic_hrd_params_present_flag(sub_pic_hrd_params_present_flag);
        sub_pic_cpb_params_in_pic_timing_sei_flag(sub_pic_cpb_params_in_pic_timing_sei_flag);
        fixed_pic_rate_general_flag(fixed_pic_rate_general_flag);
        fixed_pic_rate_within_cvs_flag(fixed_pic_rate_within_cvs_flag);
        low_delay_hrd_flag(low_delay_hrd_flag);
        return this;
    }

    public StdVideoH265HrdFlags set(StdVideoH265HrdFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265HrdFlags malloc() {
        return new StdVideoH265HrdFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265HrdFlags calloc() {
        return new StdVideoH265HrdFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265HrdFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265HrdFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265HrdFlags create(long address) {
        return new StdVideoH265HrdFlags(address, null);
    }

    public static StdVideoH265HrdFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265HrdFlags(address, null);
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

    public static StdVideoH265HrdFlags malloc(MemoryStack stack) {
        return new StdVideoH265HrdFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265HrdFlags calloc(MemoryStack stack) {
        return new StdVideoH265HrdFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbitfield0(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD0);
    }

    public static int nnal_hrd_parameters_present_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nvcl_hrd_parameters_present_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nsub_pic_hrd_params_present_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nsub_pic_cpb_params_in_pic_timing_sei_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nfixed_pic_rate_general_flag(long struct) {
        return nbitfield1(struct) & 255;
    }

    public static int nfixed_pic_rate_within_cvs_flag(long struct) {
        return (nbitfield1(struct) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
    }

    public static int nlow_delay_hrd_flag(long struct) {
        return (nbitfield1(struct) & 16711680) >>> 16;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nnal_hrd_parameters_present_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nvcl_hrd_parameters_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nsub_pic_hrd_params_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nsub_pic_cpb_params_in_pic_timing_sei_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nfixed_pic_rate_general_flag(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & InputDeviceCompat.SOURCE_ANY) | (value & 255));
    }

    public static void nfixed_pic_rate_within_cvs_flag(long struct, int value) {
        nbitfield1(struct, ((value << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (nbitfield1(struct) & (-65281)));
    }

    public static void nlow_delay_hrd_flag(long struct, int value) {
        nbitfield1(struct, ((value << 16) & 16711680) | (nbitfield1(struct) & (-16711681)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265HrdFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265HrdFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265HrdFlags, Buffer> implements NativeResource {
        private static final StdVideoH265HrdFlags ELEMENT_FACTORY = StdVideoH265HrdFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265HrdFlags.SIZEOF);
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
        public StdVideoH265HrdFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean nal_hrd_parameters_present_flag() {
            return StdVideoH265HrdFlags.nnal_hrd_parameters_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean vcl_hrd_parameters_present_flag() {
            return StdVideoH265HrdFlags.nvcl_hrd_parameters_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sub_pic_hrd_params_present_flag() {
            return StdVideoH265HrdFlags.nsub_pic_hrd_params_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean sub_pic_cpb_params_in_pic_timing_sei_flag() {
            return StdVideoH265HrdFlags.nsub_pic_cpb_params_in_pic_timing_sei_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public int fixed_pic_rate_general_flag() {
            return StdVideoH265HrdFlags.nfixed_pic_rate_general_flag(address());
        }

        @NativeType("uint32_t")
        public int fixed_pic_rate_within_cvs_flag() {
            return StdVideoH265HrdFlags.nfixed_pic_rate_within_cvs_flag(address());
        }

        @NativeType("uint32_t")
        public int low_delay_hrd_flag() {
            return StdVideoH265HrdFlags.nlow_delay_hrd_flag(address());
        }

        public Buffer nal_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265HrdFlags.nnal_hrd_parameters_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vcl_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265HrdFlags.nvcl_hrd_parameters_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sub_pic_hrd_params_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265HrdFlags.nsub_pic_hrd_params_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sub_pic_cpb_params_in_pic_timing_sei_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265HrdFlags.nsub_pic_cpb_params_in_pic_timing_sei_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer fixed_pic_rate_general_flag(@NativeType("uint32_t") int value) {
            StdVideoH265HrdFlags.nfixed_pic_rate_general_flag(address(), value);
            return this;
        }

        public Buffer fixed_pic_rate_within_cvs_flag(@NativeType("uint32_t") int value) {
            StdVideoH265HrdFlags.nfixed_pic_rate_within_cvs_flag(address(), value);
            return this;
        }

        public Buffer low_delay_hrd_flag(@NativeType("uint32_t") int value) {
            StdVideoH265HrdFlags.nlow_delay_hrd_flag(address(), value);
            return this;
        }
    }
}
