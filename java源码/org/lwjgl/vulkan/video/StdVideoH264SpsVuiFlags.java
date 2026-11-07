package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SpsVuiFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SpsVuiFlags.class */
public class StdVideoH264SpsVuiFlags extends Struct<StdVideoH264SpsVuiFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoH264SpsVuiFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH264SpsVuiFlags create(long address, ByteBuffer container) {
        return new StdVideoH264SpsVuiFlags(address, container);
    }

    public StdVideoH264SpsVuiFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean aspect_ratio_info_present_flag() {
        return naspect_ratio_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean overscan_info_present_flag() {
        return noverscan_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean overscan_appropriate_flag() {
        return noverscan_appropriate_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean video_signal_type_present_flag() {
        return nvideo_signal_type_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean video_full_range_flag() {
        return nvideo_full_range_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean color_description_present_flag() {
        return ncolor_description_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean chroma_loc_info_present_flag() {
        return nchroma_loc_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean timing_info_present_flag() {
        return ntiming_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean fixed_frame_rate_flag() {
        return nfixed_frame_rate_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean bitstream_restriction_flag() {
        return nbitstream_restriction_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean nal_hrd_parameters_present_flag() {
        return nnal_hrd_parameters_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean vcl_hrd_parameters_present_flag() {
        return nvcl_hrd_parameters_present_flag(address()) != 0;
    }

    public StdVideoH264SpsVuiFlags aspect_ratio_info_present_flag(@NativeType("uint32_t") boolean value) {
        naspect_ratio_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags overscan_info_present_flag(@NativeType("uint32_t") boolean value) {
        noverscan_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags overscan_appropriate_flag(@NativeType("uint32_t") boolean value) {
        noverscan_appropriate_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags video_signal_type_present_flag(@NativeType("uint32_t") boolean value) {
        nvideo_signal_type_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags video_full_range_flag(@NativeType("uint32_t") boolean value) {
        nvideo_full_range_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags color_description_present_flag(@NativeType("uint32_t") boolean value) {
        ncolor_description_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags chroma_loc_info_present_flag(@NativeType("uint32_t") boolean value) {
        nchroma_loc_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags timing_info_present_flag(@NativeType("uint32_t") boolean value) {
        ntiming_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags fixed_frame_rate_flag(@NativeType("uint32_t") boolean value) {
        nfixed_frame_rate_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags bitstream_restriction_flag(@NativeType("uint32_t") boolean value) {
        nbitstream_restriction_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags nal_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) {
        nnal_hrd_parameters_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags vcl_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) {
        nvcl_hrd_parameters_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH264SpsVuiFlags set(boolean aspect_ratio_info_present_flag, boolean overscan_info_present_flag, boolean overscan_appropriate_flag, boolean video_signal_type_present_flag, boolean video_full_range_flag, boolean color_description_present_flag, boolean chroma_loc_info_present_flag, boolean timing_info_present_flag, boolean fixed_frame_rate_flag, boolean bitstream_restriction_flag, boolean nal_hrd_parameters_present_flag, boolean vcl_hrd_parameters_present_flag) {
        aspect_ratio_info_present_flag(aspect_ratio_info_present_flag);
        overscan_info_present_flag(overscan_info_present_flag);
        overscan_appropriate_flag(overscan_appropriate_flag);
        video_signal_type_present_flag(video_signal_type_present_flag);
        video_full_range_flag(video_full_range_flag);
        color_description_present_flag(color_description_present_flag);
        chroma_loc_info_present_flag(chroma_loc_info_present_flag);
        timing_info_present_flag(timing_info_present_flag);
        fixed_frame_rate_flag(fixed_frame_rate_flag);
        bitstream_restriction_flag(bitstream_restriction_flag);
        nal_hrd_parameters_present_flag(nal_hrd_parameters_present_flag);
        vcl_hrd_parameters_present_flag(vcl_hrd_parameters_present_flag);
        return this;
    }

    public StdVideoH264SpsVuiFlags set(StdVideoH264SpsVuiFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH264SpsVuiFlags malloc() {
        return new StdVideoH264SpsVuiFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH264SpsVuiFlags calloc() {
        return new StdVideoH264SpsVuiFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH264SpsVuiFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH264SpsVuiFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH264SpsVuiFlags create(long address) {
        return new StdVideoH264SpsVuiFlags(address, null);
    }

    public static StdVideoH264SpsVuiFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH264SpsVuiFlags(address, null);
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

    public static StdVideoH264SpsVuiFlags malloc(MemoryStack stack) {
        return new StdVideoH264SpsVuiFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH264SpsVuiFlags calloc(MemoryStack stack) {
        return new StdVideoH264SpsVuiFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int naspect_ratio_info_present_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int noverscan_info_present_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int noverscan_appropriate_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nvideo_signal_type_present_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nvideo_full_range_flag(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int ncolor_description_present_flag(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int nchroma_loc_info_present_flag(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int ntiming_info_present_flag(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static int nfixed_frame_rate_flag(long struct) {
        return (nbitfield0(struct) & 256) >>> 8;
    }

    public static int nbitstream_restriction_flag(long struct) {
        return (nbitfield0(struct) & 512) >>> 9;
    }

    public static int nnal_hrd_parameters_present_flag(long struct) {
        return (nbitfield0(struct) & 1024) >>> 10;
    }

    public static int nvcl_hrd_parameters_present_flag(long struct) {
        return (nbitfield0(struct) & 2048) >>> 11;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void naspect_ratio_info_present_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void noverscan_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void noverscan_appropriate_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nvideo_signal_type_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nvideo_full_range_flag(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void ncolor_description_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void nchroma_loc_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void ntiming_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    public static void nfixed_frame_rate_flag(long struct, int value) {
        nbitfield0(struct, ((value << 8) & 256) | (nbitfield0(struct) & (-257)));
    }

    public static void nbitstream_restriction_flag(long struct, int value) {
        nbitfield0(struct, ((value << 9) & 512) | (nbitfield0(struct) & (-513)));
    }

    public static void nnal_hrd_parameters_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 10) & 1024) | (nbitfield0(struct) & (-1025)));
    }

    public static void nvcl_hrd_parameters_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 11) & 2048) | (nbitfield0(struct) & (-2049)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SpsVuiFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH264SpsVuiFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH264SpsVuiFlags, Buffer> implements NativeResource {
        private static final StdVideoH264SpsVuiFlags ELEMENT_FACTORY = StdVideoH264SpsVuiFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH264SpsVuiFlags.SIZEOF);
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
        public StdVideoH264SpsVuiFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean aspect_ratio_info_present_flag() {
            return StdVideoH264SpsVuiFlags.naspect_ratio_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean overscan_info_present_flag() {
            return StdVideoH264SpsVuiFlags.noverscan_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean overscan_appropriate_flag() {
            return StdVideoH264SpsVuiFlags.noverscan_appropriate_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean video_signal_type_present_flag() {
            return StdVideoH264SpsVuiFlags.nvideo_signal_type_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean video_full_range_flag() {
            return StdVideoH264SpsVuiFlags.nvideo_full_range_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean color_description_present_flag() {
            return StdVideoH264SpsVuiFlags.ncolor_description_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean chroma_loc_info_present_flag() {
            return StdVideoH264SpsVuiFlags.nchroma_loc_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean timing_info_present_flag() {
            return StdVideoH264SpsVuiFlags.ntiming_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean fixed_frame_rate_flag() {
            return StdVideoH264SpsVuiFlags.nfixed_frame_rate_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean bitstream_restriction_flag() {
            return StdVideoH264SpsVuiFlags.nbitstream_restriction_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean nal_hrd_parameters_present_flag() {
            return StdVideoH264SpsVuiFlags.nnal_hrd_parameters_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean vcl_hrd_parameters_present_flag() {
            return StdVideoH264SpsVuiFlags.nvcl_hrd_parameters_present_flag(address()) != 0;
        }

        public Buffer aspect_ratio_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.naspect_ratio_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer overscan_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.noverscan_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer overscan_appropriate_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.noverscan_appropriate_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer video_signal_type_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.nvideo_signal_type_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer video_full_range_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.nvideo_full_range_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer color_description_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.ncolor_description_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer chroma_loc_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.nchroma_loc_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer timing_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.ntiming_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer fixed_frame_rate_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.nfixed_frame_rate_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bitstream_restriction_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.nbitstream_restriction_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer nal_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.nnal_hrd_parameters_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vcl_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH264SpsVuiFlags.nvcl_hrd_parameters_present_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
