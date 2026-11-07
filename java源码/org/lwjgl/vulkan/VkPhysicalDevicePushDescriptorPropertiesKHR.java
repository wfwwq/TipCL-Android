package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePushDescriptorPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePushDescriptorPropertiesKHR.class */
public class VkPhysicalDevicePushDescriptorPropertiesKHR extends VkPhysicalDevicePushDescriptorProperties {
    protected VkPhysicalDevicePushDescriptorPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties, org.lwjgl.system.Struct
    public VkPhysicalDevicePushDescriptorPropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePushDescriptorPropertiesKHR(address, container);
    }

    public VkPhysicalDevicePushDescriptorPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties
    public VkPhysicalDevicePushDescriptorPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties
    public VkPhysicalDevicePushDescriptorPropertiesKHR sType$Default() {
        return sType(1000080000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties
    public VkPhysicalDevicePushDescriptorPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties
    public VkPhysicalDevicePushDescriptorPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDevicePushDescriptorPropertiesKHR set(VkPhysicalDevicePushDescriptorPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePushDescriptorPropertiesKHR malloc() {
        return new VkPhysicalDevicePushDescriptorPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePushDescriptorPropertiesKHR calloc() {
        return new VkPhysicalDevicePushDescriptorPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePushDescriptorPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePushDescriptorPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePushDescriptorPropertiesKHR create(long address) {
        return new VkPhysicalDevicePushDescriptorPropertiesKHR(address, null);
    }

    public static VkPhysicalDevicePushDescriptorPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePushDescriptorPropertiesKHR(address, null);
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

    public static VkPhysicalDevicePushDescriptorPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePushDescriptorPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePushDescriptorPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePushDescriptorPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePushDescriptorPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePushDescriptorPropertiesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDevicePushDescriptorProperties.Buffer {
        private static final VkPhysicalDevicePushDescriptorPropertiesKHR ELEMENT_FACTORY = VkPhysicalDevicePushDescriptorPropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDevicePushDescriptorPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePushDescriptorPropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000080000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePushDescriptorPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
