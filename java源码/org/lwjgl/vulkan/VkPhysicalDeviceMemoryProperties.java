package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkMemoryHeap;
import org.lwjgl.vulkan.VkMemoryType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryProperties.class */
public class VkPhysicalDeviceMemoryProperties extends Struct<VkPhysicalDeviceMemoryProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MEMORYTYPECOUNT;
    public static final int MEMORYTYPES;
    public static final int MEMORYHEAPCOUNT;
    public static final int MEMORYHEAPS;

    static {
        Struct.Layout layout = __struct(__member(4), __array(VkMemoryType.SIZEOF, VkMemoryType.ALIGNOF, 32), __member(4), __array(VkMemoryHeap.SIZEOF, VkMemoryHeap.ALIGNOF, 16));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MEMORYTYPECOUNT = layout.offsetof(0);
        MEMORYTYPES = layout.offsetof(1);
        MEMORYHEAPCOUNT = layout.offsetof(2);
        MEMORYHEAPS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceMemoryProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMemoryProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMemoryProperties(address, container);
    }

    public VkPhysicalDeviceMemoryProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int memoryTypeCount() {
        return nmemoryTypeCount(address());
    }

    @NativeType("VkMemoryType[VK_MAX_MEMORY_TYPES]")
    public VkMemoryType.Buffer memoryTypes() {
        return nmemoryTypes(address());
    }

    public VkMemoryType memoryTypes(int index) {
        return nmemoryTypes(address(), index);
    }

    @NativeType("uint32_t")
    public int memoryHeapCount() {
        return nmemoryHeapCount(address());
    }

    @NativeType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]")
    public VkMemoryHeap.Buffer memoryHeaps() {
        return nmemoryHeaps(address());
    }

    public VkMemoryHeap memoryHeaps(int index) {
        return nmemoryHeaps(address(), index);
    }

    public static VkPhysicalDeviceMemoryProperties malloc() {
        return new VkPhysicalDeviceMemoryProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryProperties calloc() {
        return new VkPhysicalDeviceMemoryProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMemoryProperties create(long address) {
        return new VkPhysicalDeviceMemoryProperties(address, null);
    }

    public static VkPhysicalDeviceMemoryProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMemoryProperties(address, null);
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

    public static VkPhysicalDeviceMemoryProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmemoryTypeCount(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYTYPECOUNT);
    }

    public static VkMemoryType.Buffer nmemoryTypes(long struct) {
        return VkMemoryType.create(struct + MEMORYTYPES, nmemoryTypeCount(struct));
    }

    public static VkMemoryType nmemoryTypes(long struct, int index) {
        return VkMemoryType.create(struct + MEMORYTYPES + (Checks.check(index, nmemoryTypeCount(struct)) * VkMemoryType.SIZEOF));
    }

    public static int nmemoryHeapCount(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYHEAPCOUNT);
    }

    public static VkMemoryHeap.Buffer nmemoryHeaps(long struct) {
        return VkMemoryHeap.create(struct + MEMORYHEAPS, nmemoryHeapCount(struct));
    }

    public static VkMemoryHeap nmemoryHeaps(long struct, int index) {
        return VkMemoryHeap.create(struct + MEMORYHEAPS + (Checks.check(index, nmemoryHeapCount(struct)) * VkMemoryHeap.SIZEOF));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMemoryProperties ELEMENT_FACTORY = VkPhysicalDeviceMemoryProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMemoryProperties.SIZEOF);
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
        public VkPhysicalDeviceMemoryProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int memoryTypeCount() {
            return VkPhysicalDeviceMemoryProperties.nmemoryTypeCount(address());
        }

        @NativeType("VkMemoryType[VK_MAX_MEMORY_TYPES]")
        public VkMemoryType.Buffer memoryTypes() {
            return VkPhysicalDeviceMemoryProperties.nmemoryTypes(address());
        }

        public VkMemoryType memoryTypes(int index) {
            return VkPhysicalDeviceMemoryProperties.nmemoryTypes(address(), index);
        }

        @NativeType("uint32_t")
        public int memoryHeapCount() {
            return VkPhysicalDeviceMemoryProperties.nmemoryHeapCount(address());
        }

        @NativeType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]")
        public VkMemoryHeap.Buffer memoryHeaps() {
            return VkPhysicalDeviceMemoryProperties.nmemoryHeaps(address());
        }

        public VkMemoryHeap memoryHeaps(int index) {
            return VkPhysicalDeviceMemoryProperties.nmemoryHeaps(address(), index);
        }
    }
}
