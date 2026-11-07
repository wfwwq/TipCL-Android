package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class */
public class VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR extends VkPhysicalDeviceUniformBufferStandardLayoutFeatures {
    protected VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR sType$Default() {
        return sType(1000253000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) {
        nuniformBufferStandardLayout(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR set(int sType, long pNext, boolean uniformBufferStandardLayout) {
        sType(sType);
        pNext(pNext);
        uniformBufferStandardLayout(uniformBufferStandardLayout);
        return this;
    }

    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR set(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR malloc() {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR calloc() {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR create(long address) {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer {
        private static final VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000253000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer
        public Buffer uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.nuniformBufferStandardLayout(address(), value ? 1 : 0);
            return this;
        }
    }
}
