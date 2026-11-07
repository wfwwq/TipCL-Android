package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.class */
public class VkPhysicalDeviceTimelineSemaphoreFeaturesKHR extends VkPhysicalDeviceTimelineSemaphoreFeatures {
    protected VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR sType$Default() {
        return sType(1000207000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR timelineSemaphore(@NativeType("VkBool32") boolean value) {
        ntimelineSemaphore(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR set(int sType, long pNext, boolean timelineSemaphore) {
        sType(sType);
        pNext(pNext);
        timelineSemaphore(timelineSemaphore);
        return this;
    }

    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR set(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR malloc() {
        return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR calloc() {
        return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR create(long address) {
        return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphoreFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphoreFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceTimelineSemaphoreFeatures.Buffer {
        private static final VkPhysicalDeviceTimelineSemaphoreFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000207000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures.Buffer
        public Buffer timelineSemaphore(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.ntimelineSemaphore(address(), value ? 1 : 0);
            return this;
        }
    }
}
