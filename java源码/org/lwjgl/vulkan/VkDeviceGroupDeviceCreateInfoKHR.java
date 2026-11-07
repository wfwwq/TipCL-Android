package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupDeviceCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupDeviceCreateInfoKHR.class */
public class VkDeviceGroupDeviceCreateInfoKHR extends VkDeviceGroupDeviceCreateInfo {
    protected VkDeviceGroupDeviceCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo, org.lwjgl.system.Struct
    public VkDeviceGroupDeviceCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkDeviceGroupDeviceCreateInfoKHR(address, container);
    }

    public VkDeviceGroupDeviceCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo
    public VkDeviceGroupDeviceCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo
    public VkDeviceGroupDeviceCreateInfoKHR sType$Default() {
        return sType(1000070001);
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo
    public VkDeviceGroupDeviceCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo
    public VkDeviceGroupDeviceCreateInfoKHR pPhysicalDevices(@NativeType("VkPhysicalDevice const *") PointerBuffer value) {
        npPhysicalDevices(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo
    public VkDeviceGroupDeviceCreateInfoKHR set(int sType, long pNext, PointerBuffer pPhysicalDevices) {
        sType(sType);
        pNext(pNext);
        pPhysicalDevices(pPhysicalDevices);
        return this;
    }

    public VkDeviceGroupDeviceCreateInfoKHR set(VkDeviceGroupDeviceCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupDeviceCreateInfoKHR malloc() {
        return new VkDeviceGroupDeviceCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupDeviceCreateInfoKHR calloc() {
        return new VkDeviceGroupDeviceCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupDeviceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupDeviceCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupDeviceCreateInfoKHR create(long address) {
        return new VkDeviceGroupDeviceCreateInfoKHR(address, null);
    }

    public static VkDeviceGroupDeviceCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupDeviceCreateInfoKHR(address, null);
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

    public static VkDeviceGroupDeviceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceGroupDeviceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupDeviceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupDeviceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupDeviceCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupDeviceCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkDeviceGroupDeviceCreateInfo.Buffer {
        private static final VkDeviceGroupDeviceCreateInfoKHR ELEMENT_FACTORY = VkDeviceGroupDeviceCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDeviceGroupDeviceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupDeviceCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000070001);
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupDeviceCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo.Buffer
        public Buffer pPhysicalDevices(@NativeType("VkPhysicalDevice const *") PointerBuffer value) {
            VkDeviceGroupDeviceCreateInfoKHR.npPhysicalDevices(address(), value);
            return this;
        }
    }
}
