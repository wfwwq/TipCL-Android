package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryDecompressionFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryDecompressionFeaturesNV.class */
public class VkPhysicalDeviceMemoryDecompressionFeaturesNV extends VkPhysicalDeviceMemoryDecompressionFeaturesEXT {
    protected VkPhysicalDeviceMemoryDecompressionFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT, org.lwjgl.system.Struct
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(address, container);
    }

    public VkPhysicalDeviceMemoryDecompressionFeaturesNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV sType$Default() {
        return sType(1000427000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV memoryDecompression(@NativeType("VkBool32") boolean value) {
        nmemoryDecompression(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV set(int sType, long pNext, boolean memoryDecompression) {
        sType(sType);
        pNext(pNext);
        memoryDecompression(memoryDecompression);
        return this;
    }

    public VkPhysicalDeviceMemoryDecompressionFeaturesNV set(VkPhysicalDeviceMemoryDecompressionFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV malloc() {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV calloc() {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV create(long address) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(address, null);
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

    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryDecompressionFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryDecompressionFeaturesNV$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer {
        private static final VkPhysicalDeviceMemoryDecompressionFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceMemoryDecompressionFeaturesNV.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceMemoryDecompressionFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMemoryDecompressionFeaturesNV.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer
        public Buffer sType$Default() {
            return sType(1000427000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMemoryDecompressionFeaturesNV.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer
        public Buffer memoryDecompression(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMemoryDecompressionFeaturesNV.nmemoryDecompression(address(), value ? 1 : 0);
            return this;
        }
    }
}
