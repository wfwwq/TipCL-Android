package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.class */
public class VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR extends VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures {
    protected VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR sType$Default() {
        return sType(1000325000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) {
        nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR set(int sType, long pNext, boolean shaderZeroInitializeWorkgroupMemory) {
        sType(sType);
        pNext(pNext);
        shaderZeroInitializeWorkgroupMemory(shaderZeroInitializeWorkgroupMemory);
        return this;
    }

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR set(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR malloc() {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR calloc() {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR create(long address) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer {
        private static final VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000325000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer
        public Buffer shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0);
            return this;
        }
    }
}
