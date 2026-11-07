package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.class */
public class VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT extends VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures {
    protected VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT sType$Default() {
        return sType(1000276000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) {
        nshaderDemoteToHelperInvocation(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT set(int sType, long pNext, boolean shaderDemoteToHelperInvocation) {
        sType(sType);
        pNext(pNext);
        shaderDemoteToHelperInvocation(shaderDemoteToHelperInvocation);
        return this;
    }

    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT set(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer {
        private static final VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000276000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer
        public Buffer shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.nshaderDemoteToHelperInvocation(address(), value ? 1 : 0);
            return this;
        }
    }
}
