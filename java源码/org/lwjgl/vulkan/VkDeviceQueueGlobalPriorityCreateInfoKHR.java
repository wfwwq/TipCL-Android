package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueGlobalPriorityCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueGlobalPriorityCreateInfoKHR.class */
public class VkDeviceQueueGlobalPriorityCreateInfoKHR extends VkDeviceQueueGlobalPriorityCreateInfo {
    protected VkDeviceQueueGlobalPriorityCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo, org.lwjgl.system.Struct
    public VkDeviceQueueGlobalPriorityCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkDeviceQueueGlobalPriorityCreateInfoKHR(address, container);
    }

    public VkDeviceQueueGlobalPriorityCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo
    public VkDeviceQueueGlobalPriorityCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo
    public VkDeviceQueueGlobalPriorityCreateInfoKHR sType$Default() {
        return sType(1000174000);
    }

    @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo
    public VkDeviceQueueGlobalPriorityCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo
    public VkDeviceQueueGlobalPriorityCreateInfoKHR globalPriority(@NativeType("VkQueueGlobalPriority") int value) {
        nglobalPriority(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo
    public VkDeviceQueueGlobalPriorityCreateInfoKHR set(int sType, long pNext, int globalPriority) {
        sType(sType);
        pNext(pNext);
        globalPriority(globalPriority);
        return this;
    }

    public VkDeviceQueueGlobalPriorityCreateInfoKHR set(VkDeviceQueueGlobalPriorityCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR malloc() {
        return new VkDeviceQueueGlobalPriorityCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR calloc() {
        return new VkDeviceQueueGlobalPriorityCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceQueueGlobalPriorityCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR create(long address) {
        return new VkDeviceQueueGlobalPriorityCreateInfoKHR(address, null);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceQueueGlobalPriorityCreateInfoKHR(address, null);
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

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceQueueGlobalPriorityCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceQueueGlobalPriorityCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueGlobalPriorityCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueGlobalPriorityCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkDeviceQueueGlobalPriorityCreateInfo.Buffer {
        private static final VkDeviceQueueGlobalPriorityCreateInfoKHR ELEMENT_FACTORY = VkDeviceQueueGlobalPriorityCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDeviceQueueGlobalPriorityCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceQueueGlobalPriorityCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000174000);
        }

        @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceQueueGlobalPriorityCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceQueueGlobalPriorityCreateInfo.Buffer
        public Buffer globalPriority(@NativeType("VkQueueGlobalPriority") int value) {
            VkDeviceQueueGlobalPriorityCreateInfoKHR.nglobalPriority(address(), value);
            return this;
        }
    }
}
