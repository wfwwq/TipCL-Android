package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.class */
public class VkPhysicalDeviceVulkanMemoryModelFeaturesKHR extends VkPhysicalDeviceVulkanMemoryModelFeatures {
    protected VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR sType$Default() {
        return sType(1000211000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModel(@NativeType("VkBool32") boolean value) {
        nvulkanMemoryModel(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) {
        nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) {
        nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR set(int sType, long pNext, boolean vulkanMemoryModel, boolean vulkanMemoryModelDeviceScope, boolean vulkanMemoryModelAvailabilityVisibilityChains) {
        sType(sType);
        pNext(pNext);
        vulkanMemoryModel(vulkanMemoryModel);
        vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope);
        vulkanMemoryModelAvailabilityVisibilityChains(vulkanMemoryModelAvailabilityVisibilityChains);
        return this;
    }

    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR set(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR malloc() {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR calloc() {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkanMemoryModelFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkanMemoryModelFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer {
        private static final VkPhysicalDeviceVulkanMemoryModelFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000211000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer
        public Buffer vulkanMemoryModel(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nvulkanMemoryModel(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer
        public Buffer vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer
        public Buffer vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0);
            return this;
        }
    }
}
