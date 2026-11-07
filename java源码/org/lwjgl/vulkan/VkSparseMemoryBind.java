package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseMemoryBind.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseMemoryBind.class */
public class VkSparseMemoryBind extends Struct<VkSparseMemoryBind> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RESOURCEOFFSET;
    public static final int SIZE;
    public static final int MEMORY;
    public static final int MEMORYOFFSET;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RESOURCEOFFSET = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        MEMORYOFFSET = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    protected VkSparseMemoryBind(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSparseMemoryBind create(long address, ByteBuffer container) {
        return new VkSparseMemoryBind(address, container);
    }

    public VkSparseMemoryBind(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceSize")
    public long resourceOffset() {
        return nresourceOffset(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    @NativeType("VkDeviceSize")
    public long memoryOffset() {
        return nmemoryOffset(address());
    }

    @NativeType("VkSparseMemoryBindFlags")
    public int flags() {
        return nflags(address());
    }

    public VkSparseMemoryBind resourceOffset(@NativeType("VkDeviceSize") long value) {
        nresourceOffset(address(), value);
        return this;
    }

    public VkSparseMemoryBind size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkSparseMemoryBind memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkSparseMemoryBind memoryOffset(@NativeType("VkDeviceSize") long value) {
        nmemoryOffset(address(), value);
        return this;
    }

    public VkSparseMemoryBind flags(@NativeType("VkSparseMemoryBindFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkSparseMemoryBind set(long resourceOffset, long size, long memory, long memoryOffset, int flags) {
        resourceOffset(resourceOffset);
        size(size);
        memory(memory);
        memoryOffset(memoryOffset);
        flags(flags);
        return this;
    }

    public VkSparseMemoryBind set(VkSparseMemoryBind src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSparseMemoryBind malloc() {
        return new VkSparseMemoryBind(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSparseMemoryBind calloc() {
        return new VkSparseMemoryBind(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSparseMemoryBind create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseMemoryBind(MemoryUtil.memAddress(container), container);
    }

    public static VkSparseMemoryBind create(long address) {
        return new VkSparseMemoryBind(address, null);
    }

    public static VkSparseMemoryBind createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSparseMemoryBind(address, null);
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

    public static VkSparseMemoryBind malloc(MemoryStack stack) {
        return new VkSparseMemoryBind(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSparseMemoryBind calloc(MemoryStack stack) {
        return new VkSparseMemoryBind(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nresourceOffset(long struct) {
        return MemoryUtil.memGetLong(struct + RESOURCEOFFSET);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static long nmemory(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORY);
    }

    public static long nmemoryOffset(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORYOFFSET);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static void nresourceOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + RESOURCEOFFSET, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    public static void nmemoryOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORYOFFSET, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseMemoryBind$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseMemoryBind$Buffer.class */
    public static class Buffer extends StructBuffer<VkSparseMemoryBind, Buffer> implements NativeResource {
        private static final VkSparseMemoryBind ELEMENT_FACTORY = VkSparseMemoryBind.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSparseMemoryBind.SIZEOF);
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
        public VkSparseMemoryBind getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceSize")
        public long resourceOffset() {
            return VkSparseMemoryBind.nresourceOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkSparseMemoryBind.nsize(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkSparseMemoryBind.nmemory(address());
        }

        @NativeType("VkDeviceSize")
        public long memoryOffset() {
            return VkSparseMemoryBind.nmemoryOffset(address());
        }

        @NativeType("VkSparseMemoryBindFlags")
        public int flags() {
            return VkSparseMemoryBind.nflags(address());
        }

        public Buffer resourceOffset(@NativeType("VkDeviceSize") long value) {
            VkSparseMemoryBind.nresourceOffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkSparseMemoryBind.nsize(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkSparseMemoryBind.nmemory(address(), value);
            return this;
        }

        public Buffer memoryOffset(@NativeType("VkDeviceSize") long value) {
            VkSparseMemoryBind.nmemoryOffset(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkSparseMemoryBindFlags") int value) {
            VkSparseMemoryBind.nflags(address(), value);
            return this;
        }
    }
}
