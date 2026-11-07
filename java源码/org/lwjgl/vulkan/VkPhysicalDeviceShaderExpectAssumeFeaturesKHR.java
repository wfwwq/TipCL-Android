package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.class */
public class VkPhysicalDeviceShaderExpectAssumeFeaturesKHR extends VkPhysicalDeviceShaderExpectAssumeFeatures {
    protected VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR sType$Default() {
        return sType(1000544000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR shaderExpectAssume(@NativeType("VkBool32") boolean value) {
        nshaderExpectAssume(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR set(int sType, long pNext, boolean shaderExpectAssume) {
        sType(sType);
        pNext(pNext);
        shaderExpectAssume(shaderExpectAssume);
        return this;
    }

    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR set(VkPhysicalDeviceShaderExpectAssumeFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderExpectAssumeFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer {
        private static final VkPhysicalDeviceShaderExpectAssumeFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000544000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer
        public Buffer shaderExpectAssume(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.nshaderExpectAssume(address(), value ? 1 : 0);
            return this;
        }
    }
}
