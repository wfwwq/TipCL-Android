package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeAV1ReferenceInfoFlags.class */
public class StdVideoDecodeAV1ReferenceInfoFlags extends Struct<StdVideoDecodeAV1ReferenceInfoFlags> implements NativeResource {
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

    protected StdVideoDecodeAV1ReferenceInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeAV1ReferenceInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoDecodeAV1ReferenceInfoFlags(address, container);
    }

    public StdVideoDecodeAV1ReferenceInfoFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean disable_frame_end_update_cdf() {
        return ndisable_frame_end_update_cdf(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean segmentation_enabled() {
        return nsegmentation_enabled(address()) != 0;
    }

    public StdVideoDecodeAV1ReferenceInfoFlags disable_frame_end_update_cdf(@NativeType("uint32_t") boolean value) {
        ndisable_frame_end_update_cdf(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfoFlags segmentation_enabled(@NativeType("uint32_t") boolean value) {
        nsegmentation_enabled(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfoFlags set(boolean disable_frame_end_update_cdf, boolean segmentation_enabled) {
        disable_frame_end_update_cdf(disable_frame_end_update_cdf);
        segmentation_enabled(segmentation_enabled);
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfoFlags set(StdVideoDecodeAV1ReferenceInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags malloc() {
        return new StdVideoDecodeAV1ReferenceInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags calloc() {
        return new StdVideoDecodeAV1ReferenceInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeAV1ReferenceInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags create(long address) {
        return new StdVideoDecodeAV1ReferenceInfoFlags(address, null);
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeAV1ReferenceInfoFlags(address, null);
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

    public static StdVideoDecodeAV1ReferenceInfoFlags malloc(MemoryStack stack) {
        return new StdVideoDecodeAV1ReferenceInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags calloc(MemoryStack stack) {
        return new StdVideoDecodeAV1ReferenceInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndisable_frame_end_update_cdf(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nsegmentation_enabled(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ndisable_frame_end_update_cdf(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nsegmentation_enabled(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-1073741824)) | (value & LockFreeTaskQueueCore.MAX_CAPACITY_MASK));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeAV1ReferenceInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeAV1ReferenceInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoDecodeAV1ReferenceInfoFlags ELEMENT_FACTORY = StdVideoDecodeAV1ReferenceInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeAV1ReferenceInfoFlags.SIZEOF);
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
        public StdVideoDecodeAV1ReferenceInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean disable_frame_end_update_cdf() {
            return StdVideoDecodeAV1ReferenceInfoFlags.ndisable_frame_end_update_cdf(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean segmentation_enabled() {
            return StdVideoDecodeAV1ReferenceInfoFlags.nsegmentation_enabled(address()) != 0;
        }

        public Buffer disable_frame_end_update_cdf(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeAV1ReferenceInfoFlags.ndisable_frame_end_update_cdf(address(), value ? 1 : 0);
            return this;
        }

        public Buffer segmentation_enabled(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeAV1ReferenceInfoFlags.nsegmentation_enabled(address(), value ? 1 : 0);
            return this;
        }
    }
}
