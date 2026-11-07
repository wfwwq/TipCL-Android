package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointersFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointersFeaturesKHR.class */
public class VkPhysicalDeviceVariablePointersFeaturesKHR extends VkPhysicalDeviceVariablePointersFeatures {
    protected VkPhysicalDeviceVariablePointersFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceVariablePointersFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVariablePointersFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceVariablePointersFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointersFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointersFeaturesKHR sType$Default() {
        return sType(1000120000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointersFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointersFeaturesKHR variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) {
        nvariablePointersStorageBuffer(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointersFeaturesKHR variablePointers(@NativeType("VkBool32") boolean value) {
        nvariablePointers(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures
    public VkPhysicalDeviceVariablePointersFeaturesKHR set(int sType, long pNext, boolean variablePointersStorageBuffer, boolean variablePointers) {
        sType(sType);
        pNext(pNext);
        variablePointersStorageBuffer(variablePointersStorageBuffer);
        variablePointers(variablePointers);
        return this;
    }

    public VkPhysicalDeviceVariablePointersFeaturesKHR set(VkPhysicalDeviceVariablePointersFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVariablePointersFeaturesKHR malloc() {
        return new VkPhysicalDeviceVariablePointersFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVariablePointersFeaturesKHR calloc() {
        return new VkPhysicalDeviceVariablePointersFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVariablePointersFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVariablePointersFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVariablePointersFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVariablePointersFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceVariablePointersFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVariablePointersFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceVariablePointersFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVariablePointersFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVariablePointersFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVariablePointersFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointersFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointersFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceVariablePointersFeatures.Buffer {
        private static final VkPhysicalDeviceVariablePointersFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVariablePointersFeaturesKHR.create(-1L);

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
        public VkPhysicalDeviceVariablePointersFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVariablePointersFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000120000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVariablePointersFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer
        public Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVariablePointersFeaturesKHR.nvariablePointersStorageBuffer(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures.Buffer
        public Buffer variablePointers(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVariablePointersFeaturesKHR.nvariablePointers(address(), value ? 1 : 0);
            return this;
        }
    }
}
