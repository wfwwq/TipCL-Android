package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo;
import org.lwjgl.vulkan.VkRect2D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupRenderPassBeginInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupRenderPassBeginInfoKHR.class */
public class VkDeviceGroupRenderPassBeginInfoKHR extends VkDeviceGroupRenderPassBeginInfo {
    protected VkDeviceGroupRenderPassBeginInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo, org.lwjgl.system.Struct
    public VkDeviceGroupRenderPassBeginInfoKHR create(long address, ByteBuffer container) {
        return new VkDeviceGroupRenderPassBeginInfoKHR(address, container);
    }

    public VkDeviceGroupRenderPassBeginInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo
    public VkDeviceGroupRenderPassBeginInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo
    public VkDeviceGroupRenderPassBeginInfoKHR sType$Default() {
        return sType(1000060003);
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo
    public VkDeviceGroupRenderPassBeginInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo
    public VkDeviceGroupRenderPassBeginInfoKHR deviceMask(@NativeType("uint32_t") int value) {
        ndeviceMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo
    public VkDeviceGroupRenderPassBeginInfoKHR pDeviceRenderAreas(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
        npDeviceRenderAreas(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo
    public VkDeviceGroupRenderPassBeginInfoKHR set(int sType, long pNext, int deviceMask, VkRect2D.Buffer pDeviceRenderAreas) {
        sType(sType);
        pNext(pNext);
        deviceMask(deviceMask);
        pDeviceRenderAreas(pDeviceRenderAreas);
        return this;
    }

    public VkDeviceGroupRenderPassBeginInfoKHR set(VkDeviceGroupRenderPassBeginInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupRenderPassBeginInfoKHR malloc() {
        return new VkDeviceGroupRenderPassBeginInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupRenderPassBeginInfoKHR calloc() {
        return new VkDeviceGroupRenderPassBeginInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupRenderPassBeginInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupRenderPassBeginInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupRenderPassBeginInfoKHR create(long address) {
        return new VkDeviceGroupRenderPassBeginInfoKHR(address, null);
    }

    public static VkDeviceGroupRenderPassBeginInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupRenderPassBeginInfoKHR(address, null);
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

    public static VkDeviceGroupRenderPassBeginInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceGroupRenderPassBeginInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupRenderPassBeginInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupRenderPassBeginInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupRenderPassBeginInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupRenderPassBeginInfoKHR$Buffer.class */
    public static class Buffer extends VkDeviceGroupRenderPassBeginInfo.Buffer {
        private static final VkDeviceGroupRenderPassBeginInfoKHR ELEMENT_FACTORY = VkDeviceGroupRenderPassBeginInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDeviceGroupRenderPassBeginInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupRenderPassBeginInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000060003);
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupRenderPassBeginInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.Buffer
        public Buffer deviceMask(@NativeType("uint32_t") int value) {
            VkDeviceGroupRenderPassBeginInfoKHR.ndeviceMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo.Buffer
        public Buffer pDeviceRenderAreas(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
            VkDeviceGroupRenderPassBeginInfoKHR.npDeviceRenderAreas(address(), value);
            return this;
        }
    }
}
