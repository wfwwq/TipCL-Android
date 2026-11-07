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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265VpsFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265VpsFlags.class */
public class StdVideoH265VpsFlags extends Struct<StdVideoH265VpsFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoH265VpsFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265VpsFlags create(long address, ByteBuffer container) {
        return new StdVideoH265VpsFlags(address, container);
    }

    public StdVideoH265VpsFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean vps_temporal_id_nesting_flag() {
        return nvps_temporal_id_nesting_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean vps_sub_layer_ordering_info_present_flag() {
        return nvps_sub_layer_ordering_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean vps_timing_info_present_flag() {
        return nvps_timing_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean vps_poc_proportional_to_timing_flag() {
        return nvps_poc_proportional_to_timing_flag(address()) != 0;
    }

    public StdVideoH265VpsFlags vps_temporal_id_nesting_flag(@NativeType("uint32_t") boolean value) {
        nvps_temporal_id_nesting_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265VpsFlags vps_sub_layer_ordering_info_present_flag(@NativeType("uint32_t") boolean value) {
        nvps_sub_layer_ordering_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265VpsFlags vps_timing_info_present_flag(@NativeType("uint32_t") boolean value) {
        nvps_timing_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265VpsFlags vps_poc_proportional_to_timing_flag(@NativeType("uint32_t") boolean value) {
        nvps_poc_proportional_to_timing_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265VpsFlags set(boolean vps_temporal_id_nesting_flag, boolean vps_sub_layer_ordering_info_present_flag, boolean vps_timing_info_present_flag, boolean vps_poc_proportional_to_timing_flag) {
        vps_temporal_id_nesting_flag(vps_temporal_id_nesting_flag);
        vps_sub_layer_ordering_info_present_flag(vps_sub_layer_ordering_info_present_flag);
        vps_timing_info_present_flag(vps_timing_info_present_flag);
        vps_poc_proportional_to_timing_flag(vps_poc_proportional_to_timing_flag);
        return this;
    }

    public StdVideoH265VpsFlags set(StdVideoH265VpsFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265VpsFlags malloc() {
        return new StdVideoH265VpsFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265VpsFlags calloc() {
        return new StdVideoH265VpsFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265VpsFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265VpsFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265VpsFlags create(long address) {
        return new StdVideoH265VpsFlags(address, null);
    }

    public static StdVideoH265VpsFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265VpsFlags(address, null);
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

    public static StdVideoH265VpsFlags malloc(MemoryStack stack) {
        return new StdVideoH265VpsFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265VpsFlags calloc(MemoryStack stack) {
        return new StdVideoH265VpsFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvps_temporal_id_nesting_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nvps_sub_layer_ordering_info_present_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nvps_timing_info_present_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nvps_poc_proportional_to_timing_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nvps_temporal_id_nesting_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nvps_sub_layer_ordering_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nvps_timing_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nvps_poc_proportional_to_timing_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265VpsFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265VpsFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265VpsFlags, Buffer> implements NativeResource {
        private static final StdVideoH265VpsFlags ELEMENT_FACTORY = StdVideoH265VpsFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265VpsFlags.SIZEOF);
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
        public StdVideoH265VpsFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean vps_temporal_id_nesting_flag() {
            return StdVideoH265VpsFlags.nvps_temporal_id_nesting_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean vps_sub_layer_ordering_info_present_flag() {
            return StdVideoH265VpsFlags.nvps_sub_layer_ordering_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean vps_timing_info_present_flag() {
            return StdVideoH265VpsFlags.nvps_timing_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean vps_poc_proportional_to_timing_flag() {
            return StdVideoH265VpsFlags.nvps_poc_proportional_to_timing_flag(address()) != 0;
        }

        public Buffer vps_temporal_id_nesting_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265VpsFlags.nvps_temporal_id_nesting_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vps_sub_layer_ordering_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265VpsFlags.nvps_sub_layer_ordering_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vps_timing_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265VpsFlags.nvps_timing_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vps_poc_proportional_to_timing_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265VpsFlags.nvps_poc_proportional_to_timing_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
