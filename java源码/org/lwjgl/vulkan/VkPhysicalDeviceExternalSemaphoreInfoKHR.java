package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalSemaphoreInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalSemaphoreInfoKHR.class */
public class VkPhysicalDeviceExternalSemaphoreInfoKHR extends VkPhysicalDeviceExternalSemaphoreInfo {
    protected VkPhysicalDeviceExternalSemaphoreInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo, org.lwjgl.system.Struct
    public VkPhysicalDeviceExternalSemaphoreInfoKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExternalSemaphoreInfoKHR(address, container);
    }

    public VkPhysicalDeviceExternalSemaphoreInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo
    public VkPhysicalDeviceExternalSemaphoreInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo
    public VkPhysicalDeviceExternalSemaphoreInfoKHR sType$Default() {
        return sType(1000076000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo
    public VkPhysicalDeviceExternalSemaphoreInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo
    public VkPhysicalDeviceExternalSemaphoreInfoKHR handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo
    public VkPhysicalDeviceExternalSemaphoreInfoKHR set(int sType, long pNext, int handleType) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        return this;
    }

    public VkPhysicalDeviceExternalSemaphoreInfoKHR set(VkPhysicalDeviceExternalSemaphoreInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExternalSemaphoreInfoKHR malloc() {
        return new VkPhysicalDeviceExternalSemaphoreInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalSemaphoreInfoKHR calloc() {
        return new VkPhysicalDeviceExternalSemaphoreInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalSemaphoreInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalSemaphoreInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExternalSemaphoreInfoKHR create(long address) {
        return new VkPhysicalDeviceExternalSemaphoreInfoKHR(address, null);
    }

    public static VkPhysicalDeviceExternalSemaphoreInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExternalSemaphoreInfoKHR(address, null);
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

    public static VkPhysicalDeviceExternalSemaphoreInfoKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalSemaphoreInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalSemaphoreInfoKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalSemaphoreInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalSemaphoreInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalSemaphoreInfoKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceExternalSemaphoreInfo.Buffer {
        private static final VkPhysicalDeviceExternalSemaphoreInfoKHR ELEMENT_FACTORY = VkPhysicalDeviceExternalSemaphoreInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceExternalSemaphoreInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExternalSemaphoreInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000076000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceExternalSemaphoreInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo.Buffer
        public Buffer handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) {
            VkPhysicalDeviceExternalSemaphoreInfoKHR.nhandleType(address(), value);
            return this;
        }
    }
}
