package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.class */
public class VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR extends VkPhysicalDeviceSamplerYcbcrConversionFeatures {
    protected VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR sType$Default() {
        return sType(1000156004);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR samplerYcbcrConversion(@NativeType("VkBool32") boolean value) {
        nsamplerYcbcrConversion(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR set(int sType, long pNext, boolean samplerYcbcrConversion) {
        sType(sType);
        pNext(pNext);
        samplerYcbcrConversion(samplerYcbcrConversion);
        return this;
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR set(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR malloc() {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR calloc() {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR create(long address) {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer {
        private static final VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000156004);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer
        public Buffer samplerYcbcrConversion(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.nsamplerYcbcrConversion(address(), value ? 1 : 0);
            return this;
        }
    }
}
