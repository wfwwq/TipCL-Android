package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.class */
public class VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV extends VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR {
    protected VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR, org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(address, container);
    }

    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV sType$Default() {
        return sType(1000203000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV fragmentShaderBarycentric(@NativeType("VkBool32") boolean value) {
        nfragmentShaderBarycentric(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV set(int sType, long pNext, boolean fragmentShaderBarycentric) {
        sType(sType);
        pNext(pNext);
        fragmentShaderBarycentric(fragmentShaderBarycentric);
        return this;
    }

    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV set(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV malloc() {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV calloc() {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV create(long address) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(address, null);
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

    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer {
        private static final VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000203000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer
        public Buffer fragmentShaderBarycentric(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.nfragmentShaderBarycentric(address(), value ? 1 : 0);
            return this;
        }
    }
}
