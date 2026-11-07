package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationStats.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationStats.class */
public class VmaDefragmentationStats extends Struct<VmaDefragmentationStats> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BYTESMOVED;
    public static final int BYTESFREED;
    public static final int ALLOCATIONSMOVED;
    public static final int DEVICEMEMORYBLOCKSFREED;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BYTESMOVED = layout.offsetof(0);
        BYTESFREED = layout.offsetof(1);
        ALLOCATIONSMOVED = layout.offsetof(2);
        DEVICEMEMORYBLOCKSFREED = layout.offsetof(3);
    }

    protected VmaDefragmentationStats(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaDefragmentationStats create(long address, ByteBuffer container) {
        return new VmaDefragmentationStats(address, container);
    }

    public VmaDefragmentationStats(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceSize")
    public long bytesMoved() {
        return nbytesMoved(address());
    }

    @NativeType("VkDeviceSize")
    public long bytesFreed() {
        return nbytesFreed(address());
    }

    @NativeType("uint32_t")
    public int allocationsMoved() {
        return nallocationsMoved(address());
    }

    @NativeType("uint32_t")
    public int deviceMemoryBlocksFreed() {
        return ndeviceMemoryBlocksFreed(address());
    }

    public static VmaDefragmentationStats malloc() {
        return new VmaDefragmentationStats(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaDefragmentationStats calloc() {
        return new VmaDefragmentationStats(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaDefragmentationStats create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaDefragmentationStats(MemoryUtil.memAddress(container), container);
    }

    public static VmaDefragmentationStats create(long address) {
        return new VmaDefragmentationStats(address, null);
    }

    public static VmaDefragmentationStats createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaDefragmentationStats(address, null);
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

    public static VmaDefragmentationStats malloc(MemoryStack stack) {
        return new VmaDefragmentationStats(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaDefragmentationStats calloc(MemoryStack stack) {
        return new VmaDefragmentationStats(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nbytesMoved(long struct) {
        return MemoryUtil.memGetLong(struct + BYTESMOVED);
    }

    public static long nbytesFreed(long struct) {
        return MemoryUtil.memGetLong(struct + BYTESFREED);
    }

    public static int nallocationsMoved(long struct) {
        return MemoryUtil.memGetInt(struct + ALLOCATIONSMOVED);
    }

    public static int ndeviceMemoryBlocksFreed(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEMEMORYBLOCKSFREED);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationStats$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationStats$Buffer.class */
    public static class Buffer extends StructBuffer<VmaDefragmentationStats, Buffer> implements NativeResource {
        private static final VmaDefragmentationStats ELEMENT_FACTORY = VmaDefragmentationStats.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaDefragmentationStats.SIZEOF);
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
        public VmaDefragmentationStats getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceSize")
        public long bytesMoved() {
            return VmaDefragmentationStats.nbytesMoved(address());
        }

        @NativeType("VkDeviceSize")
        public long bytesFreed() {
            return VmaDefragmentationStats.nbytesFreed(address());
        }

        @NativeType("uint32_t")
        public int allocationsMoved() {
            return VmaDefragmentationStats.nallocationsMoved(address());
        }

        @NativeType("uint32_t")
        public int deviceMemoryBlocksFreed() {
            return VmaDefragmentationStats.ndeviceMemoryBlocksFreed(address());
        }
    }
}
