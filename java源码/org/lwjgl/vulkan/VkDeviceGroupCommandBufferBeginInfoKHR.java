package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfoKHR.class */
public class VkDeviceGroupCommandBufferBeginInfoKHR extends VkDeviceGroupCommandBufferBeginInfo {
    protected VkDeviceGroupCommandBufferBeginInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo, org.lwjgl.system.Struct
    public VkDeviceGroupCommandBufferBeginInfoKHR create(long address, ByteBuffer container) {
        return new VkDeviceGroupCommandBufferBeginInfoKHR(address, container);
    }

    public VkDeviceGroupCommandBufferBeginInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public VkDeviceGroupCommandBufferBeginInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public VkDeviceGroupCommandBufferBeginInfoKHR sType$Default() {
        return sType(1000060004);
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public VkDeviceGroupCommandBufferBeginInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public VkDeviceGroupCommandBufferBeginInfoKHR deviceMask(@NativeType("uint32_t") int value) {
        ndeviceMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public VkDeviceGroupCommandBufferBeginInfoKHR set(int sType, long pNext, int deviceMask) {
        sType(sType);
        pNext(pNext);
        deviceMask(deviceMask);
        return this;
    }

    public VkDeviceGroupCommandBufferBeginInfoKHR set(VkDeviceGroupCommandBufferBeginInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupCommandBufferBeginInfoKHR malloc() {
        return new VkDeviceGroupCommandBufferBeginInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupCommandBufferBeginInfoKHR calloc() {
        return new VkDeviceGroupCommandBufferBeginInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupCommandBufferBeginInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupCommandBufferBeginInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupCommandBufferBeginInfoKHR create(long address) {
        return new VkDeviceGroupCommandBufferBeginInfoKHR(address, null);
    }

    public static VkDeviceGroupCommandBufferBeginInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupCommandBufferBeginInfoKHR(address, null);
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

    public static VkDeviceGroupCommandBufferBeginInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceGroupCommandBufferBeginInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupCommandBufferBeginInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupCommandBufferBeginInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfoKHR$Buffer.class */
    public static class Buffer extends VkDeviceGroupCommandBufferBeginInfo.Buffer {
        private static final VkDeviceGroupCommandBufferBeginInfoKHR ELEMENT_FACTORY = VkDeviceGroupCommandBufferBeginInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDeviceGroupCommandBufferBeginInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupCommandBufferBeginInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000060004);
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupCommandBufferBeginInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public Buffer deviceMask(@NativeType("uint32_t") int value) {
            VkDeviceGroupCommandBufferBeginInfoKHR.ndeviceMask(address(), value);
            return this;
        }
    }
}
