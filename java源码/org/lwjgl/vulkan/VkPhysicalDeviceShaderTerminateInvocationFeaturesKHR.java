package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.class */
public class VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR extends VkPhysicalDeviceShaderTerminateInvocationFeatures {
    protected VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR sType$Default() {
        return sType(1000215000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR shaderTerminateInvocation(@NativeType("VkBool32") boolean value) {
        nshaderTerminateInvocation(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR set(int sType, long pNext, boolean shaderTerminateInvocation) {
        sType(sType);
        pNext(pNext);
        shaderTerminateInvocation(shaderTerminateInvocation);
        return this;
    }

    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR set(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer {
        private static final VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000215000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer
        public Buffer shaderTerminateInvocation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.nshaderTerminateInvocation(address(), value ? 1 : 0);
            return this;
        }
    }
}
