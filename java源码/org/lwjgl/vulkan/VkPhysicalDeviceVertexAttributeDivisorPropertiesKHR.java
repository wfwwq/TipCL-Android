package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.class */
public class VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR extends VkPhysicalDeviceVertexAttributeDivisorProperties {
    protected VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties, org.lwjgl.system.Struct
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(address, container);
    }

    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR sType$Default() {
        return sType(1000525000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR set(VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR malloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR calloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR create(long address) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(address, null);
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

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceVertexAttributeDivisorProperties.Buffer {
        private static final VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000525000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
