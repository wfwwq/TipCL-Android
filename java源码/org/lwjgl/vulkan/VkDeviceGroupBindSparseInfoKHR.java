package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupBindSparseInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupBindSparseInfoKHR.class */
public class VkDeviceGroupBindSparseInfoKHR extends VkDeviceGroupBindSparseInfo {
    protected VkDeviceGroupBindSparseInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo, org.lwjgl.system.Struct
    public VkDeviceGroupBindSparseInfoKHR create(long address, ByteBuffer container) {
        return new VkDeviceGroupBindSparseInfoKHR(address, container);
    }

    public VkDeviceGroupBindSparseInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo
    public VkDeviceGroupBindSparseInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo
    public VkDeviceGroupBindSparseInfoKHR sType$Default() {
        return sType(1000060006);
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo
    public VkDeviceGroupBindSparseInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo
    public VkDeviceGroupBindSparseInfoKHR resourceDeviceIndex(@NativeType("uint32_t") int value) {
        nresourceDeviceIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo
    public VkDeviceGroupBindSparseInfoKHR memoryDeviceIndex(@NativeType("uint32_t") int value) {
        nmemoryDeviceIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo
    public VkDeviceGroupBindSparseInfoKHR set(int sType, long pNext, int resourceDeviceIndex, int memoryDeviceIndex) {
        sType(sType);
        pNext(pNext);
        resourceDeviceIndex(resourceDeviceIndex);
        memoryDeviceIndex(memoryDeviceIndex);
        return this;
    }

    public VkDeviceGroupBindSparseInfoKHR set(VkDeviceGroupBindSparseInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupBindSparseInfoKHR malloc() {
        return new VkDeviceGroupBindSparseInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupBindSparseInfoKHR calloc() {
        return new VkDeviceGroupBindSparseInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupBindSparseInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupBindSparseInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupBindSparseInfoKHR create(long address) {
        return new VkDeviceGroupBindSparseInfoKHR(address, null);
    }

    public static VkDeviceGroupBindSparseInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupBindSparseInfoKHR(address, null);
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

    public static VkDeviceGroupBindSparseInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceGroupBindSparseInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupBindSparseInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupBindSparseInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupBindSparseInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupBindSparseInfoKHR$Buffer.class */
    public static class Buffer extends VkDeviceGroupBindSparseInfo.Buffer {
        private static final VkDeviceGroupBindSparseInfoKHR ELEMENT_FACTORY = VkDeviceGroupBindSparseInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDeviceGroupBindSparseInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupBindSparseInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000060006);
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupBindSparseInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.Buffer
        public Buffer resourceDeviceIndex(@NativeType("uint32_t") int value) {
            VkDeviceGroupBindSparseInfoKHR.nresourceDeviceIndex(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo.Buffer
        public Buffer memoryDeviceIndex(@NativeType("uint32_t") int value) {
            VkDeviceGroupBindSparseInfoKHR.nmemoryDeviceIndex(address(), value);
            return this;
        }
    }
}
