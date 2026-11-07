package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingFeaturesKHR.class */
public class VkPhysicalDeviceDynamicRenderingFeaturesKHR extends VkPhysicalDeviceDynamicRenderingFeatures {
    protected VkPhysicalDeviceDynamicRenderingFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDynamicRenderingFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceDynamicRenderingFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR sType$Default() {
        return sType(1000044003);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR dynamicRendering(@NativeType("VkBool32") boolean value) {
        ndynamicRendering(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR set(int sType, long pNext, boolean dynamicRendering) {
        sType(sType);
        pNext(pNext);
        dynamicRendering(dynamicRendering);
        return this;
    }

    public VkPhysicalDeviceDynamicRenderingFeaturesKHR set(VkPhysicalDeviceDynamicRenderingFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR malloc() {
        return new VkPhysicalDeviceDynamicRenderingFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR calloc() {
        return new VkPhysicalDeviceDynamicRenderingFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDynamicRenderingFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR create(long address) {
        return new VkPhysicalDeviceDynamicRenderingFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDynamicRenderingFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceDynamicRenderingFeatures.Buffer {
        private static final VkPhysicalDeviceDynamicRenderingFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceDynamicRenderingFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceDynamicRenderingFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDynamicRenderingFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000044003);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDynamicRenderingFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures.Buffer
        public Buffer dynamicRendering(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDynamicRenderingFeaturesKHR.ndynamicRendering(address(), value ? 1 : 0);
            return this;
        }
    }
}
