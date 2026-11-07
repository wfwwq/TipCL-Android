package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePointClippingPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePointClippingPropertiesKHR.class */
public class VkPhysicalDevicePointClippingPropertiesKHR extends VkPhysicalDevicePointClippingProperties {
    protected VkPhysicalDevicePointClippingPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties, org.lwjgl.system.Struct
    public VkPhysicalDevicePointClippingPropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePointClippingPropertiesKHR(address, container);
    }

    public VkPhysicalDevicePointClippingPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties
    public VkPhysicalDevicePointClippingPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties
    public VkPhysicalDevicePointClippingPropertiesKHR sType$Default() {
        return sType(1000117000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties
    public VkPhysicalDevicePointClippingPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties
    public VkPhysicalDevicePointClippingPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDevicePointClippingPropertiesKHR set(VkPhysicalDevicePointClippingPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePointClippingPropertiesKHR malloc() {
        return new VkPhysicalDevicePointClippingPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePointClippingPropertiesKHR calloc() {
        return new VkPhysicalDevicePointClippingPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePointClippingPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePointClippingPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePointClippingPropertiesKHR create(long address) {
        return new VkPhysicalDevicePointClippingPropertiesKHR(address, null);
    }

    public static VkPhysicalDevicePointClippingPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePointClippingPropertiesKHR(address, null);
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

    public static VkPhysicalDevicePointClippingPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePointClippingPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePointClippingPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePointClippingPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePointClippingPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePointClippingPropertiesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDevicePointClippingProperties.Buffer {
        private static final VkPhysicalDevicePointClippingPropertiesKHR ELEMENT_FACTORY = VkPhysicalDevicePointClippingPropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDevicePointClippingPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePointClippingPropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000117000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePointClippingPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
