package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImagelessFramebufferFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImagelessFramebufferFeaturesKHR.class */
public class VkPhysicalDeviceImagelessFramebufferFeaturesKHR extends VkPhysicalDeviceImagelessFramebufferFeatures {
    protected VkPhysicalDeviceImagelessFramebufferFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImagelessFramebufferFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR sType$Default() {
        return sType(1000108000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR imagelessFramebuffer(@NativeType("VkBool32") boolean value) {
        nimagelessFramebuffer(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR set(int sType, long pNext, boolean imagelessFramebuffer) {
        sType(sType);
        pNext(pNext);
        imagelessFramebuffer(imagelessFramebuffer);
        return this;
    }

    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR set(VkPhysicalDeviceImagelessFramebufferFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR malloc() {
        return new VkPhysicalDeviceImagelessFramebufferFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR calloc() {
        return new VkPhysicalDeviceImagelessFramebufferFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImagelessFramebufferFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR create(long address) {
        return new VkPhysicalDeviceImagelessFramebufferFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImagelessFramebufferFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImagelessFramebufferFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImagelessFramebufferFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImagelessFramebufferFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImagelessFramebufferFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceImagelessFramebufferFeatures.Buffer {
        private static final VkPhysicalDeviceImagelessFramebufferFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceImagelessFramebufferFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceImagelessFramebufferFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImagelessFramebufferFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000108000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImagelessFramebufferFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures.Buffer
        public Buffer imagelessFramebuffer(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImagelessFramebufferFeaturesKHR.nimagelessFramebuffer(address(), value ? 1 : 0);
            return this;
        }
    }
}
