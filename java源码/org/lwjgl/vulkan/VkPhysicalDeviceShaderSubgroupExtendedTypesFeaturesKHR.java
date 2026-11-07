package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.class */
public class VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR extends VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures {
    protected VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR sType$Default() {
        return sType(1000175000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupExtendedTypes(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR set(int sType, long pNext, boolean shaderSubgroupExtendedTypes) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupExtendedTypes(shaderSubgroupExtendedTypes);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR set(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer {
        private static final VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000175000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer
        public Buffer shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.nshaderSubgroupExtendedTypes(address(), value ? 1 : 0);
            return this;
        }
    }
}
