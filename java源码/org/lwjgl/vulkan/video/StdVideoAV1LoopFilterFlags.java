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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1LoopFilterFlags.class */
public class StdVideoAV1LoopFilterFlags extends Struct<StdVideoAV1LoopFilterFlags> implements NativeResource {
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

    protected StdVideoAV1LoopFilterFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1LoopFilterFlags create(long address, ByteBuffer container) {
        return new StdVideoAV1LoopFilterFlags(address, container);
    }

    public StdVideoAV1LoopFilterFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean loop_filter_delta_enabled() {
        return nloop_filter_delta_enabled(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean loop_filter_delta_update() {
        return nloop_filter_delta_update(address()) != 0;
    }

    public StdVideoAV1LoopFilterFlags loop_filter_delta_enabled(@NativeType("uint32_t") boolean value) {
        nloop_filter_delta_enabled(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1LoopFilterFlags loop_filter_delta_update(@NativeType("uint32_t") boolean value) {
        nloop_filter_delta_update(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1LoopFilterFlags set(boolean loop_filter_delta_enabled, boolean loop_filter_delta_update) {
        loop_filter_delta_enabled(loop_filter_delta_enabled);
        loop_filter_delta_update(loop_filter_delta_update);
        return this;
    }

    public StdVideoAV1LoopFilterFlags set(StdVideoAV1LoopFilterFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1LoopFilterFlags malloc() {
        return new StdVideoAV1LoopFilterFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1LoopFilterFlags calloc() {
        return new StdVideoAV1LoopFilterFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1LoopFilterFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1LoopFilterFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1LoopFilterFlags create(long address) {
        return new StdVideoAV1LoopFilterFlags(address, null);
    }

    public static StdVideoAV1LoopFilterFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1LoopFilterFlags(address, null);
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

    public static StdVideoAV1LoopFilterFlags malloc(MemoryStack stack) {
        return new StdVideoAV1LoopFilterFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1LoopFilterFlags calloc(MemoryStack stack) {
        return new StdVideoAV1LoopFilterFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nloop_filter_delta_enabled(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nloop_filter_delta_update(long struct) {
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

    public static void nloop_filter_delta_enabled(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nloop_filter_delta_update(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-1073741824)) | (value & LockFreeTaskQueueCore.MAX_CAPACITY_MASK));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1LoopFilterFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1LoopFilterFlags, Buffer> implements NativeResource {
        private static final StdVideoAV1LoopFilterFlags ELEMENT_FACTORY = StdVideoAV1LoopFilterFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1LoopFilterFlags.SIZEOF);
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
        public StdVideoAV1LoopFilterFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean loop_filter_delta_enabled() {
            return StdVideoAV1LoopFilterFlags.nloop_filter_delta_enabled(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean loop_filter_delta_update() {
            return StdVideoAV1LoopFilterFlags.nloop_filter_delta_update(address()) != 0;
        }

        public Buffer loop_filter_delta_enabled(@NativeType("uint32_t") boolean value) {
            StdVideoAV1LoopFilterFlags.nloop_filter_delta_enabled(address(), value ? 1 : 0);
            return this;
        }

        public Buffer loop_filter_delta_update(@NativeType("uint32_t") boolean value) {
            StdVideoAV1LoopFilterFlags.nloop_filter_delta_update(address(), value ? 1 : 0);
            return this;
        }
    }
}
