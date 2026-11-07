package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDrawParameterFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDrawParameterFeatures.class */
public class VkPhysicalDeviceShaderDrawParameterFeatures extends VkPhysicalDeviceShaderDrawParametersFeatures {
    protected VkPhysicalDeviceShaderDrawParameterFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderDrawParameterFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderDrawParameterFeatures(address, container);
    }

    public VkPhysicalDeviceShaderDrawParameterFeatures(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures
    public VkPhysicalDeviceShaderDrawParameterFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures
    public VkPhysicalDeviceShaderDrawParameterFeatures sType$Default() {
        return sType(1000063000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures
    public VkPhysicalDeviceShaderDrawParameterFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures
    public VkPhysicalDeviceShaderDrawParameterFeatures shaderDrawParameters(@NativeType("VkBool32") boolean value) {
        nshaderDrawParameters(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures
    public VkPhysicalDeviceShaderDrawParameterFeatures set(int sType, long pNext, boolean shaderDrawParameters) {
        sType(sType);
        pNext(pNext);
        shaderDrawParameters(shaderDrawParameters);
        return this;
    }

    public VkPhysicalDeviceShaderDrawParameterFeatures set(VkPhysicalDeviceShaderDrawParameterFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderDrawParameterFeatures malloc() {
        return new VkPhysicalDeviceShaderDrawParameterFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDrawParameterFeatures calloc() {
        return new VkPhysicalDeviceShaderDrawParameterFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDrawParameterFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderDrawParameterFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderDrawParameterFeatures create(long address) {
        return new VkPhysicalDeviceShaderDrawParameterFeatures(address, null);
    }

    public static VkPhysicalDeviceShaderDrawParameterFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderDrawParameterFeatures(address, null);
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

    public static VkPhysicalDeviceShaderDrawParameterFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderDrawParameterFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDrawParameterFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderDrawParameterFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDrawParameterFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDrawParameterFeatures$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceShaderDrawParametersFeatures.Buffer {
        private static final VkPhysicalDeviceShaderDrawParameterFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderDrawParameterFeatures.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceShaderDrawParameterFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderDrawParameterFeatures.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000063000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderDrawParameterFeatures.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures.Buffer
        public Buffer shaderDrawParameters(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderDrawParameterFeatures.nshaderDrawParameters(address(), value ? 1 : 0);
            return this;
        }
    }
}
