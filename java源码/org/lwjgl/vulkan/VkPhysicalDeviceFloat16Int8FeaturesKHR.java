package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloat16Int8FeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloat16Int8FeaturesKHR.class */
public class VkPhysicalDeviceFloat16Int8FeaturesKHR extends VkPhysicalDeviceShaderFloat16Int8Features {
    protected VkPhysicalDeviceFloat16Int8FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features, org.lwjgl.system.Struct
    public VkPhysicalDeviceFloat16Int8FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceFloat16Int8FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features
    public VkPhysicalDeviceFloat16Int8FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features
    public VkPhysicalDeviceFloat16Int8FeaturesKHR sType$Default() {
        return sType(1000082000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features
    public VkPhysicalDeviceFloat16Int8FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features
    public VkPhysicalDeviceFloat16Int8FeaturesKHR shaderFloat16(@NativeType("VkBool32") boolean value) {
        nshaderFloat16(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features
    public VkPhysicalDeviceFloat16Int8FeaturesKHR shaderInt8(@NativeType("VkBool32") boolean value) {
        nshaderInt8(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features
    public VkPhysicalDeviceFloat16Int8FeaturesKHR set(int sType, long pNext, boolean shaderFloat16, boolean shaderInt8) {
        sType(sType);
        pNext(pNext);
        shaderFloat16(shaderFloat16);
        shaderInt8(shaderInt8);
        return this;
    }

    public VkPhysicalDeviceFloat16Int8FeaturesKHR set(VkPhysicalDeviceFloat16Int8FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFloat16Int8FeaturesKHR malloc() {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFloat16Int8FeaturesKHR calloc() {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFloat16Int8FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFloat16Int8FeaturesKHR create(long address) {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceFloat16Int8FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceFloat16Int8FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFloat16Int8FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloat16Int8FeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloat16Int8FeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceShaderFloat16Int8Features.Buffer {
        private static final VkPhysicalDeviceFloat16Int8FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceFloat16Int8FeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceFloat16Int8FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFloat16Int8FeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.Buffer
        public Buffer sType$Default() {
            return sType(1000082000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFloat16Int8FeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.Buffer
        public Buffer shaderFloat16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFloat16Int8FeaturesKHR.nshaderFloat16(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features.Buffer
        public Buffer shaderInt8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFloat16Int8FeaturesKHR.nshaderInt8(address(), value ? 1 : 0);
            return this;
        }
    }
}
