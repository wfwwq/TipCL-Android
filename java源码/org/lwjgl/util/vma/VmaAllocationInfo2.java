package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocationInfo2.class */
public class VmaAllocationInfo2 extends Struct<VmaAllocationInfo2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ALLOCATIONINFO;
    public static final int BLOCKSIZE;
    public static final int DEDICATEDMEMORY;

    static {
        Struct.Layout layout = __struct(__member(VmaAllocationInfo.SIZEOF, VmaAllocationInfo.ALIGNOF), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ALLOCATIONINFO = layout.offsetof(0);
        BLOCKSIZE = layout.offsetof(1);
        DEDICATEDMEMORY = layout.offsetof(2);
    }

    protected VmaAllocationInfo2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaAllocationInfo2 create(long address, ByteBuffer container) {
        return new VmaAllocationInfo2(address, container);
    }

    public VmaAllocationInfo2(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VmaAllocationInfo allocationInfo() {
        return nallocationInfo(address());
    }

    @NativeType("VkDeviceSize")
    public long blockSize() {
        return nblockSize(address());
    }

    @NativeType("VkBool32")
    public boolean dedicatedMemory() {
        return ndedicatedMemory(address()) != 0;
    }

    public static VmaAllocationInfo2 malloc() {
        return new VmaAllocationInfo2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaAllocationInfo2 calloc() {
        return new VmaAllocationInfo2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaAllocationInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaAllocationInfo2(MemoryUtil.memAddress(container), container);
    }

    public static VmaAllocationInfo2 create(long address) {
        return new VmaAllocationInfo2(address, null);
    }

    public static VmaAllocationInfo2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaAllocationInfo2(address, null);
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

    public static VmaAllocationInfo2 malloc(MemoryStack stack) {
        return new VmaAllocationInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaAllocationInfo2 calloc(MemoryStack stack) {
        return new VmaAllocationInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VmaAllocationInfo nallocationInfo(long struct) {
        return VmaAllocationInfo.create(struct + ALLOCATIONINFO);
    }

    public static long nblockSize(long struct) {
        return MemoryUtil.memGetLong(struct + BLOCKSIZE);
    }

    public static int ndedicatedMemory(long struct) {
        return MemoryUtil.memGetInt(struct + DEDICATEDMEMORY);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocationInfo2$Buffer.class */
    public static class Buffer extends StructBuffer<VmaAllocationInfo2, Buffer> implements NativeResource {
        private static final VmaAllocationInfo2 ELEMENT_FACTORY = VmaAllocationInfo2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaAllocationInfo2.SIZEOF);
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
        public VmaAllocationInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VmaAllocationInfo allocationInfo() {
            return VmaAllocationInfo2.nallocationInfo(address());
        }

        @NativeType("VkDeviceSize")
        public long blockSize() {
            return VmaAllocationInfo2.nblockSize(address());
        }

        @NativeType("VkBool32")
        public boolean dedicatedMemory() {
            return VmaAllocationInfo2.ndedicatedMemory(address()) != 0;
        }
    }
}
