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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindVideoSessionMemoryInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindVideoSessionMemoryInfoKHR.class */
public class VkBindVideoSessionMemoryInfoKHR extends Struct<VkBindVideoSessionMemoryInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORYBINDINDEX;
    public static final int MEMORY;
    public static final int MEMORYOFFSET;
    public static final int MEMORYSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYBINDINDEX = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        MEMORYSIZE = layout.offsetof(5);
    }

    protected VkBindVideoSessionMemoryInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindVideoSessionMemoryInfoKHR create(long address, ByteBuffer container) {
        return new VkBindVideoSessionMemoryInfoKHR(address, container);
    }

    public VkBindVideoSessionMemoryInfoKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int memoryBindIndex() {
        return nmemoryBindIndex(address());
    }

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    @NativeType("VkDeviceSize")
    public long memoryOffset() {
        return nmemoryOffset(address());
    }

    @NativeType("VkDeviceSize")
    public long memorySize() {
        return nmemorySize(address());
    }

    public VkBindVideoSessionMemoryInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindVideoSessionMemoryInfoKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR);
    }

    public VkBindVideoSessionMemoryInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindVideoSessionMemoryInfoKHR memoryBindIndex(@NativeType("uint32_t") int value) {
        nmemoryBindIndex(address(), value);
        return this;
    }

    public VkBindVideoSessionMemoryInfoKHR memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkBindVideoSessionMemoryInfoKHR memoryOffset(@NativeType("VkDeviceSize") long value) {
        nmemoryOffset(address(), value);
        return this;
    }

    public VkBindVideoSessionMemoryInfoKHR memorySize(@NativeType("VkDeviceSize") long value) {
        nmemorySize(address(), value);
        return this;
    }

    public VkBindVideoSessionMemoryInfoKHR set(int sType, long pNext, int memoryBindIndex, long memory, long memoryOffset, long memorySize) {
        sType(sType);
        pNext(pNext);
        memoryBindIndex(memoryBindIndex);
        memory(memory);
        memoryOffset(memoryOffset);
        memorySize(memorySize);
        return this;
    }

    public VkBindVideoSessionMemoryInfoKHR set(VkBindVideoSessionMemoryInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindVideoSessionMemoryInfoKHR malloc() {
        return new VkBindVideoSessionMemoryInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindVideoSessionMemoryInfoKHR calloc() {
        return new VkBindVideoSessionMemoryInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindVideoSessionMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindVideoSessionMemoryInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBindVideoSessionMemoryInfoKHR create(long address) {
        return new VkBindVideoSessionMemoryInfoKHR(address, null);
    }

    public static VkBindVideoSessionMemoryInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindVideoSessionMemoryInfoKHR(address, null);
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

    public static VkBindVideoSessionMemoryInfoKHR malloc(MemoryStack stack) {
        return new VkBindVideoSessionMemoryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindVideoSessionMemoryInfoKHR calloc(MemoryStack stack) {
        return new VkBindVideoSessionMemoryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nmemoryBindIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYBINDINDEX);
    }

    public static long nmemory(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORY);
    }

    public static long nmemoryOffset(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORYOFFSET);
    }

    public static long nmemorySize(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORYSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmemoryBindIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYBINDINDEX, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    public static void nmemoryOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORYOFFSET, value);
    }

    public static void nmemorySize(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORYSIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindVideoSessionMemoryInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindVideoSessionMemoryInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindVideoSessionMemoryInfoKHR, Buffer> implements NativeResource {
        private static final VkBindVideoSessionMemoryInfoKHR ELEMENT_FACTORY = VkBindVideoSessionMemoryInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindVideoSessionMemoryInfoKHR.SIZEOF);
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
        public VkBindVideoSessionMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindVideoSessionMemoryInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindVideoSessionMemoryInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int memoryBindIndex() {
            return VkBindVideoSessionMemoryInfoKHR.nmemoryBindIndex(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkBindVideoSessionMemoryInfoKHR.nmemory(address());
        }

        @NativeType("VkDeviceSize")
        public long memoryOffset() {
            return VkBindVideoSessionMemoryInfoKHR.nmemoryOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long memorySize() {
            return VkBindVideoSessionMemoryInfoKHR.nmemorySize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindVideoSessionMemoryInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindVideoSessionMemoryInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer memoryBindIndex(@NativeType("uint32_t") int value) {
            VkBindVideoSessionMemoryInfoKHR.nmemoryBindIndex(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkBindVideoSessionMemoryInfoKHR.nmemory(address(), value);
            return this;
        }

        public Buffer memoryOffset(@NativeType("VkDeviceSize") long value) {
            VkBindVideoSessionMemoryInfoKHR.nmemoryOffset(address(), value);
            return this;
        }

        public Buffer memorySize(@NativeType("VkDeviceSize") long value) {
            VkBindVideoSessionMemoryInfoKHR.nmemorySize(address(), value);
            return this;
        }
    }
}
