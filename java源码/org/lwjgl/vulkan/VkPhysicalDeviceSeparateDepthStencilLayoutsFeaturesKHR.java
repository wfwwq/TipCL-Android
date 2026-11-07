package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.class */
public class VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR extends VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures {
    protected VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR sType$Default() {
        return sType(1000241000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR separateDepthStencilLayouts(@NativeType("VkBool32") boolean value) {
        nseparateDepthStencilLayouts(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR set(int sType, long pNext, boolean separateDepthStencilLayouts) {
        sType(sType);
        pNext(pNext);
        separateDepthStencilLayouts(separateDepthStencilLayouts);
        return this;
    }

    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR set(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR malloc() {
        return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR calloc() {
        return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR create(long address) {
        return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.Buffer {
        private static final VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000241000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.Buffer
        public Buffer separateDepthStencilLayouts(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.nseparateDepthStencilLayouts(address(), value ? 1 : 0);
            return this;
        }
    }
}
