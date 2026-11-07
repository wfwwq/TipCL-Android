package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationPropertiesKHR.class */
public class VkPhysicalDeviceLineRasterizationPropertiesKHR extends VkPhysicalDeviceLineRasterizationProperties {
    protected VkPhysicalDeviceLineRasterizationPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties, org.lwjgl.system.Struct
    public VkPhysicalDeviceLineRasterizationPropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceLineRasterizationPropertiesKHR(address, container);
    }

    public VkPhysicalDeviceLineRasterizationPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties
    public VkPhysicalDeviceLineRasterizationPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties
    public VkPhysicalDeviceLineRasterizationPropertiesKHR sType$Default() {
        return sType(1000259002);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties
    public VkPhysicalDeviceLineRasterizationPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties
    public VkPhysicalDeviceLineRasterizationPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationPropertiesKHR set(VkPhysicalDeviceLineRasterizationPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceLineRasterizationPropertiesKHR malloc() {
        return new VkPhysicalDeviceLineRasterizationPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationPropertiesKHR calloc() {
        return new VkPhysicalDeviceLineRasterizationPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLineRasterizationPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceLineRasterizationPropertiesKHR create(long address) {
        return new VkPhysicalDeviceLineRasterizationPropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceLineRasterizationPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceLineRasterizationPropertiesKHR(address, null);
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

    public static VkPhysicalDeviceLineRasterizationPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationPropertiesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceLineRasterizationProperties.Buffer {
        private static final VkPhysicalDeviceLineRasterizationPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceLineRasterizationPropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceLineRasterizationPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceLineRasterizationPropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000259002);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceLineRasterizationPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
