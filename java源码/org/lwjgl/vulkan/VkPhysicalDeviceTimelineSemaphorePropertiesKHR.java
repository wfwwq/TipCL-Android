package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphorePropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphorePropertiesKHR.class */
public class VkPhysicalDeviceTimelineSemaphorePropertiesKHR extends VkPhysicalDeviceTimelineSemaphoreProperties {
    protected VkPhysicalDeviceTimelineSemaphorePropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties, org.lwjgl.system.Struct
    public VkPhysicalDeviceTimelineSemaphorePropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTimelineSemaphorePropertiesKHR(address, container);
    }

    public VkPhysicalDeviceTimelineSemaphorePropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties
    public VkPhysicalDeviceTimelineSemaphorePropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties
    public VkPhysicalDeviceTimelineSemaphorePropertiesKHR sType$Default() {
        return sType(1000207001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties
    public VkPhysicalDeviceTimelineSemaphorePropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties
    public VkPhysicalDeviceTimelineSemaphorePropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceTimelineSemaphorePropertiesKHR set(VkPhysicalDeviceTimelineSemaphorePropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTimelineSemaphorePropertiesKHR malloc() {
        return new VkPhysicalDeviceTimelineSemaphorePropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTimelineSemaphorePropertiesKHR calloc() {
        return new VkPhysicalDeviceTimelineSemaphorePropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTimelineSemaphorePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTimelineSemaphorePropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTimelineSemaphorePropertiesKHR create(long address) {
        return new VkPhysicalDeviceTimelineSemaphorePropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceTimelineSemaphorePropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTimelineSemaphorePropertiesKHR(address, null);
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

    public static VkPhysicalDeviceTimelineSemaphorePropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTimelineSemaphorePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTimelineSemaphorePropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTimelineSemaphorePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphorePropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphorePropertiesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceTimelineSemaphoreProperties.Buffer {
        private static final VkPhysicalDeviceTimelineSemaphorePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceTimelineSemaphorePropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceTimelineSemaphorePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTimelineSemaphorePropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000207001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTimelineSemaphorePropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
