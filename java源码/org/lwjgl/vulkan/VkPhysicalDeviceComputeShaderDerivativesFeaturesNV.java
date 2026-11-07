package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.class */
public class VkPhysicalDeviceComputeShaderDerivativesFeaturesNV extends VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR {
    protected VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR, org.lwjgl.system.Struct
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(address, container);
    }

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV sType$Default() {
        return sType(1000201000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV computeDerivativeGroupQuads(@NativeType("VkBool32") boolean value) {
        ncomputeDerivativeGroupQuads(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV computeDerivativeGroupLinear(@NativeType("VkBool32") boolean value) {
        ncomputeDerivativeGroupLinear(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV set(int sType, long pNext, boolean computeDerivativeGroupQuads, boolean computeDerivativeGroupLinear) {
        sType(sType);
        pNext(pNext);
        computeDerivativeGroupQuads(computeDerivativeGroupQuads);
        computeDerivativeGroupLinear(computeDerivativeGroupLinear);
        return this;
    }

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV set(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV malloc() {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV calloc() {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV create(long address) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(address, null);
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

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceComputeShaderDerivativesFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceComputeShaderDerivativesFeaturesNV$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer {
        private static final VkPhysicalDeviceComputeShaderDerivativesFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000201000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer
        public Buffer computeDerivativeGroupQuads(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.ncomputeDerivativeGroupQuads(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer
        public Buffer computeDerivativeGroupLinear(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.ncomputeDerivativeGroupLinear(address(), value ? 1 : 0);
            return this;
        }
    }
}
