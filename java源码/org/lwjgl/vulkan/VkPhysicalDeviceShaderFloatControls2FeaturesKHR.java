package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFloatControls2FeaturesKHR.class */
public class VkPhysicalDeviceShaderFloatControls2FeaturesKHR extends VkPhysicalDeviceShaderFloatControls2Features {
    protected VkPhysicalDeviceShaderFloatControls2FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features, org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR sType$Default() {
        return sType(1000528000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR shaderFloatControls2(@NativeType("VkBool32") boolean value) {
        nshaderFloatControls2(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR set(int sType, long pNext, boolean shaderFloatControls2) {
        sType(sType);
        pNext(pNext);
        shaderFloatControls2(shaderFloatControls2);
        return this;
    }

    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR set(VkPhysicalDeviceShaderFloatControls2FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFloatControls2FeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceShaderFloatControls2Features.Buffer {
        private static final VkPhysicalDeviceShaderFloatControls2FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderFloatControls2FeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceShaderFloatControls2FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderFloatControls2FeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.Buffer
        public Buffer sType$Default() {
            return sType(1000528000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderFloatControls2FeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloatControls2Features.Buffer
        public Buffer shaderFloatControls2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderFloatControls2FeaturesKHR.nshaderFloatControls2(address(), value ? 1 : 0);
            return this;
        }
    }
}
