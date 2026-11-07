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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaStatistics.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaStatistics.class */
public class VmaStatistics extends Struct<VmaStatistics> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BLOCKCOUNT;
    public static final int ALLOCATIONCOUNT;
    public static final int BLOCKBYTES;
    public static final int ALLOCATIONBYTES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BLOCKCOUNT = layout.offsetof(0);
        ALLOCATIONCOUNT = layout.offsetof(1);
        BLOCKBYTES = layout.offsetof(2);
        ALLOCATIONBYTES = layout.offsetof(3);
    }

    protected VmaStatistics(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaStatistics create(long address, ByteBuffer container) {
        return new VmaStatistics(address, container);
    }

    public VmaStatistics(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int blockCount() {
        return nblockCount(address());
    }

    @NativeType("uint32_t")
    public int allocationCount() {
        return nallocationCount(address());
    }

    @NativeType("VkDeviceSize")
    public long blockBytes() {
        return nblockBytes(address());
    }

    @NativeType("VkDeviceSize")
    public long allocationBytes() {
        return nallocationBytes(address());
    }

    public static VmaStatistics malloc() {
        return new VmaStatistics(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaStatistics calloc() {
        return new VmaStatistics(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaStatistics(MemoryUtil.memAddress(container), container);
    }

    public static VmaStatistics create(long address) {
        return new VmaStatistics(address, null);
    }

    public static VmaStatistics createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaStatistics(address, null);
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

    public static VmaStatistics malloc(MemoryStack stack) {
        return new VmaStatistics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaStatistics calloc(MemoryStack stack) {
        return new VmaStatistics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nblockCount(long struct) {
        return MemoryUtil.memGetInt(struct + BLOCKCOUNT);
    }

    public static int nallocationCount(long struct) {
        return MemoryUtil.memGetInt(struct + ALLOCATIONCOUNT);
    }

    public static long nblockBytes(long struct) {
        return MemoryUtil.memGetLong(struct + BLOCKBYTES);
    }

    public static long nallocationBytes(long struct) {
        return MemoryUtil.memGetLong(struct + ALLOCATIONBYTES);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaStatistics$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaStatistics$Buffer.class */
    public static class Buffer extends StructBuffer<VmaStatistics, Buffer> implements NativeResource {
        private static final VmaStatistics ELEMENT_FACTORY = VmaStatistics.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaStatistics.SIZEOF);
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
        public VmaStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int blockCount() {
            return VmaStatistics.nblockCount(address());
        }

        @NativeType("uint32_t")
        public int allocationCount() {
            return VmaStatistics.nallocationCount(address());
        }

        @NativeType("VkDeviceSize")
        public long blockBytes() {
            return VmaStatistics.nblockBytes(address());
        }

        @NativeType("VkDeviceSize")
        public long allocationBytes() {
            return VmaStatistics.nallocationBytes(address());
        }
    }
}
