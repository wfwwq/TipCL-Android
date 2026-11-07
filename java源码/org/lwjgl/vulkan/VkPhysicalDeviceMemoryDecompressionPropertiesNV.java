package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryDecompressionPropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryDecompressionPropertiesNV.class */
public class VkPhysicalDeviceMemoryDecompressionPropertiesNV extends VkPhysicalDeviceMemoryDecompressionPropertiesEXT {
    protected VkPhysicalDeviceMemoryDecompressionPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT, org.lwjgl.system.Struct
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(address, container);
    }

    public VkPhysicalDeviceMemoryDecompressionPropertiesNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sType$Default() {
        return sType(1000427001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceMemoryDecompressionPropertiesNV set(VkPhysicalDeviceMemoryDecompressionPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV malloc() {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV calloc() {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV create(long address) {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(address, null);
    }

    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(address, null);
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

    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryDecompressionPropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryDecompressionPropertiesNV$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceMemoryDecompressionPropertiesEXT.Buffer {
        private static final VkPhysicalDeviceMemoryDecompressionPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceMemoryDecompressionPropertiesNV.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceMemoryDecompressionPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMemoryDecompressionPropertiesNV.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT.Buffer
        public Buffer sType$Default() {
            return sType(1000427001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesEXT.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMemoryDecompressionPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
