package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthStencilResolvePropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthStencilResolvePropertiesKHR.class */
public class VkPhysicalDeviceDepthStencilResolvePropertiesKHR extends VkPhysicalDeviceDepthStencilResolveProperties {
    protected VkPhysicalDeviceDepthStencilResolvePropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties, org.lwjgl.system.Struct
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDepthStencilResolvePropertiesKHR(address, container);
    }

    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR sType$Default() {
        return sType(1000199000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR set(VkPhysicalDeviceDepthStencilResolvePropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR malloc() {
        return new VkPhysicalDeviceDepthStencilResolvePropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR calloc() {
        return new VkPhysicalDeviceDepthStencilResolvePropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDepthStencilResolvePropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR create(long address) {
        return new VkPhysicalDeviceDepthStencilResolvePropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDepthStencilResolvePropertiesKHR(address, null);
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

    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthStencilResolvePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthStencilResolvePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthStencilResolvePropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthStencilResolvePropertiesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceDepthStencilResolveProperties.Buffer {
        private static final VkPhysicalDeviceDepthStencilResolvePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceDepthStencilResolvePropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceDepthStencilResolvePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDepthStencilResolvePropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000199000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDepthStencilResolvePropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
