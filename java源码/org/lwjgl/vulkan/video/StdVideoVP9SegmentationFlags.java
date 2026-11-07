package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoVP9SegmentationFlags.class */
public class StdVideoVP9SegmentationFlags extends Struct<StdVideoVP9SegmentationFlags> implements NativeResource {
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

    protected StdVideoVP9SegmentationFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoVP9SegmentationFlags create(long address, ByteBuffer container) {
        return new StdVideoVP9SegmentationFlags(address, container);
    }

    public StdVideoVP9SegmentationFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean segmentation_update_map() {
        return nsegmentation_update_map(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean segmentation_temporal_update() {
        return nsegmentation_temporal_update(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean segmentation_update_data() {
        return nsegmentation_update_data(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean segmentation_abs_or_delta_update() {
        return nsegmentation_abs_or_delta_update(address()) != 0;
    }

    public StdVideoVP9SegmentationFlags segmentation_update_map(@NativeType("uint32_t") boolean value) {
        nsegmentation_update_map(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoVP9SegmentationFlags segmentation_temporal_update(@NativeType("uint32_t") boolean value) {
        nsegmentation_temporal_update(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoVP9SegmentationFlags segmentation_update_data(@NativeType("uint32_t") boolean value) {
        nsegmentation_update_data(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoVP9SegmentationFlags segmentation_abs_or_delta_update(@NativeType("uint32_t") boolean value) {
        nsegmentation_abs_or_delta_update(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoVP9SegmentationFlags set(boolean segmentation_update_map, boolean segmentation_temporal_update, boolean segmentation_update_data, boolean segmentation_abs_or_delta_update) {
        segmentation_update_map(segmentation_update_map);
        segmentation_temporal_update(segmentation_temporal_update);
        segmentation_update_data(segmentation_update_data);
        segmentation_abs_or_delta_update(segmentation_abs_or_delta_update);
        return this;
    }

    public StdVideoVP9SegmentationFlags set(StdVideoVP9SegmentationFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoVP9SegmentationFlags malloc() {
        return new StdVideoVP9SegmentationFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoVP9SegmentationFlags calloc() {
        return new StdVideoVP9SegmentationFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoVP9SegmentationFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoVP9SegmentationFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoVP9SegmentationFlags create(long address) {
        return new StdVideoVP9SegmentationFlags(address, null);
    }

    public static StdVideoVP9SegmentationFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoVP9SegmentationFlags(address, null);
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

    public static StdVideoVP9SegmentationFlags malloc(MemoryStack stack) {
        return new StdVideoVP9SegmentationFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoVP9SegmentationFlags calloc(MemoryStack stack) {
        return new StdVideoVP9SegmentationFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsegmentation_update_map(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nsegmentation_temporal_update(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nsegmentation_update_data(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nsegmentation_abs_or_delta_update(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & 268435455;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nsegmentation_update_map(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nsegmentation_temporal_update(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nsegmentation_update_data(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nsegmentation_abs_or_delta_update(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-268435456)) | (value & 268435455));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoVP9SegmentationFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoVP9SegmentationFlags, Buffer> implements NativeResource {
        private static final StdVideoVP9SegmentationFlags ELEMENT_FACTORY = StdVideoVP9SegmentationFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoVP9SegmentationFlags.SIZEOF);
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
        public StdVideoVP9SegmentationFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean segmentation_update_map() {
            return StdVideoVP9SegmentationFlags.nsegmentation_update_map(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean segmentation_temporal_update() {
            return StdVideoVP9SegmentationFlags.nsegmentation_temporal_update(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean segmentation_update_data() {
            return StdVideoVP9SegmentationFlags.nsegmentation_update_data(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean segmentation_abs_or_delta_update() {
            return StdVideoVP9SegmentationFlags.nsegmentation_abs_or_delta_update(address()) != 0;
        }

        public Buffer segmentation_update_map(@NativeType("uint32_t") boolean value) {
            StdVideoVP9SegmentationFlags.nsegmentation_update_map(address(), value ? 1 : 0);
            return this;
        }

        public Buffer segmentation_temporal_update(@NativeType("uint32_t") boolean value) {
            StdVideoVP9SegmentationFlags.nsegmentation_temporal_update(address(), value ? 1 : 0);
            return this;
        }

        public Buffer segmentation_update_data(@NativeType("uint32_t") boolean value) {
            StdVideoVP9SegmentationFlags.nsegmentation_update_data(address(), value ? 1 : 0);
            return this;
        }

        public Buffer segmentation_abs_or_delta_update(@NativeType("uint32_t") boolean value) {
            StdVideoVP9SegmentationFlags.nsegmentation_abs_or_delta_update(address(), value ? 1 : 0);
            return this;
        }
    }
}
