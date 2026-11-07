package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.class */
public class VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR extends VkPhysicalDeviceVertexAttributeDivisorFeatures {
    protected VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR sType$Default() {
        return sType(1000190002);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) {
        nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) {
        nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR set(int sType, long pNext, boolean vertexAttributeInstanceRateDivisor, boolean vertexAttributeInstanceRateZeroDivisor) {
        sType(sType);
        pNext(pNext);
        vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor);
        vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR set(VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR malloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR calloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer {
        private static final VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000190002);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer
        public Buffer vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer
        public Buffer vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0);
            return this;
        }
    }
}
