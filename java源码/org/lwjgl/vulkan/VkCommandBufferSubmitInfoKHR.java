package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCommandBufferSubmitInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferSubmitInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferSubmitInfoKHR.class */
public class VkCommandBufferSubmitInfoKHR extends VkCommandBufferSubmitInfo {
    protected VkCommandBufferSubmitInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo, org.lwjgl.system.Struct
    public VkCommandBufferSubmitInfoKHR create(long address, ByteBuffer container) {
        return new VkCommandBufferSubmitInfoKHR(address, container);
    }

    public VkCommandBufferSubmitInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo
    public VkCommandBufferSubmitInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo
    public VkCommandBufferSubmitInfoKHR sType$Default() {
        return sType(1000314006);
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo
    public VkCommandBufferSubmitInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo
    public VkCommandBufferSubmitInfoKHR commandBuffer(VkCommandBuffer value) {
        ncommandBuffer(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo
    public VkCommandBufferSubmitInfoKHR deviceMask(@NativeType("uint32_t") int value) {
        ndeviceMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo
    public VkCommandBufferSubmitInfoKHR set(int sType, long pNext, VkCommandBuffer commandBuffer, int deviceMask) {
        sType(sType);
        pNext(pNext);
        commandBuffer(commandBuffer);
        deviceMask(deviceMask);
        return this;
    }

    public VkCommandBufferSubmitInfoKHR set(VkCommandBufferSubmitInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferSubmitInfoKHR malloc() {
        return new VkCommandBufferSubmitInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferSubmitInfoKHR calloc() {
        return new VkCommandBufferSubmitInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferSubmitInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferSubmitInfoKHR create(long address) {
        return new VkCommandBufferSubmitInfoKHR(address, null);
    }

    public static VkCommandBufferSubmitInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferSubmitInfoKHR(address, null);
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

    public static VkCommandBufferSubmitInfoKHR malloc(MemoryStack stack) {
        return new VkCommandBufferSubmitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferSubmitInfoKHR calloc(MemoryStack stack) {
        return new VkCommandBufferSubmitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferSubmitInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferSubmitInfoKHR$Buffer.class */
    public static class Buffer extends VkCommandBufferSubmitInfo.Buffer {
        private static final VkCommandBufferSubmitInfoKHR ELEMENT_FACTORY = VkCommandBufferSubmitInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkCommandBufferSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferSubmitInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000314006);
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferSubmitInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo.Buffer
        public Buffer commandBuffer(VkCommandBuffer value) {
            VkCommandBufferSubmitInfoKHR.ncommandBuffer(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferSubmitInfo.Buffer
        public Buffer deviceMask(@NativeType("uint32_t") int value) {
            VkCommandBufferSubmitInfoKHR.ndeviceMask(address(), value);
            return this;
        }
    }
}
