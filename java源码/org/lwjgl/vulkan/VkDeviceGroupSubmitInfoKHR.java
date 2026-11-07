package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDeviceGroupSubmitInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSubmitInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSubmitInfoKHR.class */
public class VkDeviceGroupSubmitInfoKHR extends VkDeviceGroupSubmitInfo {
    protected VkDeviceGroupSubmitInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo, org.lwjgl.system.Struct
    public VkDeviceGroupSubmitInfoKHR create(long address, ByteBuffer container) {
        return new VkDeviceGroupSubmitInfoKHR(address, container);
    }

    public VkDeviceGroupSubmitInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo
    public VkDeviceGroupSubmitInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo
    public VkDeviceGroupSubmitInfoKHR sType$Default() {
        return sType(1000060005);
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo
    public VkDeviceGroupSubmitInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo
    public VkDeviceGroupSubmitInfoKHR pWaitSemaphoreDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npWaitSemaphoreDeviceIndices(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo
    public VkDeviceGroupSubmitInfoKHR pCommandBufferDeviceMasks(@NativeType("uint32_t const *") IntBuffer value) {
        npCommandBufferDeviceMasks(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo
    public VkDeviceGroupSubmitInfoKHR pSignalSemaphoreDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npSignalSemaphoreDeviceIndices(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo
    public VkDeviceGroupSubmitInfoKHR set(int sType, long pNext, IntBuffer pWaitSemaphoreDeviceIndices, IntBuffer pCommandBufferDeviceMasks, IntBuffer pSignalSemaphoreDeviceIndices) {
        sType(sType);
        pNext(pNext);
        pWaitSemaphoreDeviceIndices(pWaitSemaphoreDeviceIndices);
        pCommandBufferDeviceMasks(pCommandBufferDeviceMasks);
        pSignalSemaphoreDeviceIndices(pSignalSemaphoreDeviceIndices);
        return this;
    }

    public VkDeviceGroupSubmitInfoKHR set(VkDeviceGroupSubmitInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupSubmitInfoKHR malloc() {
        return new VkDeviceGroupSubmitInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupSubmitInfoKHR calloc() {
        return new VkDeviceGroupSubmitInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupSubmitInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupSubmitInfoKHR create(long address) {
        return new VkDeviceGroupSubmitInfoKHR(address, null);
    }

    public static VkDeviceGroupSubmitInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupSubmitInfoKHR(address, null);
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

    public static VkDeviceGroupSubmitInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceGroupSubmitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupSubmitInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupSubmitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSubmitInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSubmitInfoKHR$Buffer.class */
    public static class Buffer extends VkDeviceGroupSubmitInfo.Buffer {
        private static final VkDeviceGroupSubmitInfoKHR ELEMENT_FACTORY = VkDeviceGroupSubmitInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDeviceGroupSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupSubmitInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000060005);
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupSubmitInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.Buffer
        public Buffer pWaitSemaphoreDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkDeviceGroupSubmitInfoKHR.npWaitSemaphoreDeviceIndices(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.Buffer
        public Buffer pCommandBufferDeviceMasks(@NativeType("uint32_t const *") IntBuffer value) {
            VkDeviceGroupSubmitInfoKHR.npCommandBufferDeviceMasks(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupSubmitInfo.Buffer
        public Buffer pSignalSemaphoreDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkDeviceGroupSubmitInfoKHR.npSignalSemaphoreDeviceIndices(address(), value);
            return this;
        }
    }
}
