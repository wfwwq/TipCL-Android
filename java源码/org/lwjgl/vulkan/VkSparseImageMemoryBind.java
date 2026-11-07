package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryBind.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryBind.class */
public class VkSparseImageMemoryBind extends Struct<VkSparseImageMemoryBind> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SUBRESOURCE;
    public static final int OFFSET;
    public static final int EXTENT;
    public static final int MEMORY;
    public static final int MEMORYOFFSET;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(VkImageSubresource.SIZEOF, VkImageSubresource.ALIGNOF), __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF), __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SUBRESOURCE = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        EXTENT = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
    }

    protected VkSparseImageMemoryBind(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSparseImageMemoryBind create(long address, ByteBuffer container) {
        return new VkSparseImageMemoryBind(address, container);
    }

    public VkSparseImageMemoryBind(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkImageSubresource subresource() {
        return nsubresource(address());
    }

    public VkOffset3D offset() {
        return noffset(address());
    }

    public VkExtent3D extent() {
        return nextent(address());
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

    public VkSparseImageMemoryBind subresource(VkImageSubresource value) {
        nsubresource(address(), value);
        return this;
    }

    public VkSparseImageMemoryBind subresource(Consumer<VkImageSubresource> consumer) {
        consumer.accept(subresource());
        return this;
    }

    public VkSparseImageMemoryBind offset(VkOffset3D value) {
        noffset(address(), value);
        return this;
    }

    public VkSparseImageMemoryBind offset(Consumer<VkOffset3D> consumer) {
        consumer.accept(offset());
        return this;
    }

    public VkSparseImageMemoryBind extent(VkExtent3D value) {
        nextent(address(), value);
        return this;
    }

    public VkSparseImageMemoryBind extent(Consumer<VkExtent3D> consumer) {
        consumer.accept(extent());
        return this;
    }

    public VkSparseImageMemoryBind memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkSparseImageMemoryBind memoryOffset(@NativeType("VkDeviceSize") long value) {
        nmemoryOffset(address(), value);
        return this;
    }

    public VkSparseImageMemoryBind flags(@NativeType("VkSparseMemoryBindFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkSparseImageMemoryBind set(VkImageSubresource subresource, VkOffset3D offset, VkExtent3D extent, long memory, long memoryOffset, int flags) {
        subresource(subresource);
        offset(offset);
        extent(extent);
        memory(memory);
        memoryOffset(memoryOffset);
        flags(flags);
        return this;
    }

    public VkSparseImageMemoryBind set(VkSparseImageMemoryBind src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSparseImageMemoryBind malloc() {
        return new VkSparseImageMemoryBind(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSparseImageMemoryBind calloc() {
        return new VkSparseImageMemoryBind(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSparseImageMemoryBind create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageMemoryBind(MemoryUtil.memAddress(container), container);
    }

    public static VkSparseImageMemoryBind create(long address) {
        return new VkSparseImageMemoryBind(address, null);
    }

    public static VkSparseImageMemoryBind createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSparseImageMemoryBind(address, null);
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

    public static VkSparseImageMemoryBind malloc(MemoryStack stack) {
        return new VkSparseImageMemoryBind(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSparseImageMemoryBind calloc(MemoryStack stack) {
        return new VkSparseImageMemoryBind(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkImageSubresource nsubresource(long struct) {
        return VkImageSubresource.create(struct + SUBRESOURCE);
    }

    public static VkOffset3D noffset(long struct) {
        return VkOffset3D.create(struct + OFFSET);
    }

    public static VkExtent3D nextent(long struct) {
        return VkExtent3D.create(struct + EXTENT);
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

    public static void nsubresource(long struct, VkImageSubresource value) {
        MemoryUtil.memCopy(value.address(), struct + SUBRESOURCE, VkImageSubresource.SIZEOF);
    }

    public static void noffset(long struct, VkOffset3D value) {
        MemoryUtil.memCopy(value.address(), struct + OFFSET, VkOffset3D.SIZEOF);
    }

    public static void nextent(long struct, VkExtent3D value) {
        MemoryUtil.memCopy(value.address(), struct + EXTENT, VkExtent3D.SIZEOF);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryBind$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryBind$Buffer.class */
    public static class Buffer extends StructBuffer<VkSparseImageMemoryBind, Buffer> implements NativeResource {
        private static final VkSparseImageMemoryBind ELEMENT_FACTORY = VkSparseImageMemoryBind.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSparseImageMemoryBind.SIZEOF);
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
        public VkSparseImageMemoryBind getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkImageSubresource subresource() {
            return VkSparseImageMemoryBind.nsubresource(address());
        }

        public VkOffset3D offset() {
            return VkSparseImageMemoryBind.noffset(address());
        }

        public VkExtent3D extent() {
            return VkSparseImageMemoryBind.nextent(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkSparseImageMemoryBind.nmemory(address());
        }

        @NativeType("VkDeviceSize")
        public long memoryOffset() {
            return VkSparseImageMemoryBind.nmemoryOffset(address());
        }

        @NativeType("VkSparseMemoryBindFlags")
        public int flags() {
            return VkSparseImageMemoryBind.nflags(address());
        }

        public Buffer subresource(VkImageSubresource value) {
            VkSparseImageMemoryBind.nsubresource(address(), value);
            return this;
        }

        public Buffer subresource(Consumer<VkImageSubresource> consumer) {
            consumer.accept(subresource());
            return this;
        }

        public Buffer offset(VkOffset3D value) {
            VkSparseImageMemoryBind.noffset(address(), value);
            return this;
        }

        public Buffer offset(Consumer<VkOffset3D> consumer) {
            consumer.accept(offset());
            return this;
        }

        public Buffer extent(VkExtent3D value) {
            VkSparseImageMemoryBind.nextent(address(), value);
            return this;
        }

        public Buffer extent(Consumer<VkExtent3D> consumer) {
            consumer.accept(extent());
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkSparseImageMemoryBind.nmemory(address(), value);
            return this;
        }

        public Buffer memoryOffset(@NativeType("VkDeviceSize") long value) {
            VkSparseImageMemoryBind.nmemoryOffset(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkSparseMemoryBindFlags") int value) {
            VkSparseImageMemoryBind.nflags(address(), value);
            return this;
        }
    }
}
