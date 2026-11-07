package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.class */
public class VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR extends VkPhysicalDeviceShaderSubgroupRotateFeatures {
    protected VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR sType$Default() {
        return sType(1000416000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotate(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupRotate(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupRotateClustered(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR set(int sType, long pNext, boolean shaderSubgroupRotate, boolean shaderSubgroupRotateClustered) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupRotate(shaderSubgroupRotate);
        shaderSubgroupRotateClustered(shaderSubgroupRotateClustered);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR set(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer {
        private static final VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000416000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public Buffer shaderSubgroupRotate(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nshaderSubgroupRotate(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public Buffer shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nshaderSubgroupRotateClustered(address(), value ? 1 : 0);
            return this;
        }
    }
}
