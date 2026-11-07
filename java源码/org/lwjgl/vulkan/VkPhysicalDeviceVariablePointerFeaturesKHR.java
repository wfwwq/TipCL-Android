package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointerFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointerFeaturesKHR.class */
public class VkPhysicalDeviceVariablePointerFeaturesKHR extends VkPhysicalDeviceVariablePointersFeatures {
    protected VkPhysicalDeviceVariablePointerFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceVariablePointerFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceVariablePointerFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointerFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointerFeaturesKHR sType$Default() {
        return sType(1000120000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointerFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointerFeaturesKHR variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) {
        nvariablePointersStorageBuffer(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointerFeaturesKHR variablePointers(@NativeType("VkBool32") boolean value) {
        nvariablePointers(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointerFeaturesKHR set(int sType, long pNext, boolean variablePointersStorageBuffer, boolean variablePointers) {
        sType(sType);
        pNext(pNext);
        variablePointersStorageBuffer(variablePointersStorageBuffer);
        variablePointers(variablePointers);
        return this;
    }

    public VkPhysicalDeviceVariablePointerFeaturesKHR set(VkPhysicalDeviceVariablePointerFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVariablePointerFeaturesKHR malloc() {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVariablePointerFeaturesKHR calloc() {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVariablePointerFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVariablePointerFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceVariablePointerFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceVariablePointerFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVariablePointerFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointerFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointerFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceVariablePointersFeatures.Buffer {
        private static final VkPhysicalDeviceVariablePointerFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVariablePointerFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceVariablePointerFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVariablePointerFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000120000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVariablePointerFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer
        public Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVariablePointerFeaturesKHR.nvariablePointersStorageBuffer(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer
        public Buffer variablePointers(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVariablePointerFeaturesKHR.nvariablePointers(address(), value ? 1 : 0);
            return this;
        }
    }
}
