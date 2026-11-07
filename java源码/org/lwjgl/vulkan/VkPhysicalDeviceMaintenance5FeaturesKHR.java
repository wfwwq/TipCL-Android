package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance5FeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance5FeaturesKHR.class */
public class VkPhysicalDeviceMaintenance5FeaturesKHR extends VkPhysicalDeviceMaintenance5Features {
    protected VkPhysicalDeviceMaintenance5FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features, org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance5FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance5FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceMaintenance5FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features
    public VkPhysicalDeviceMaintenance5FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features
    public VkPhysicalDeviceMaintenance5FeaturesKHR sType$Default() {
        return sType(1000470000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features
    public VkPhysicalDeviceMaintenance5FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features
    public VkPhysicalDeviceMaintenance5FeaturesKHR maintenance5(@NativeType("VkBool32") boolean value) {
        nmaintenance5(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features
    public VkPhysicalDeviceMaintenance5FeaturesKHR set(int sType, long pNext, boolean maintenance5) {
        sType(sType);
        pNext(pNext);
        maintenance5(maintenance5);
        return this;
    }

    public VkPhysicalDeviceMaintenance5FeaturesKHR set(VkPhysicalDeviceMaintenance5FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance5FeaturesKHR malloc() {
        return new VkPhysicalDeviceMaintenance5FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance5FeaturesKHR calloc() {
        return new VkPhysicalDeviceMaintenance5FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance5FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance5FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance5FeaturesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance5FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceMaintenance5FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance5FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceMaintenance5FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance5FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance5FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance5FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance5FeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance5FeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceMaintenance5Features.Buffer {
        private static final VkPhysicalDeviceMaintenance5FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance5FeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceMaintenance5FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance5FeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.Buffer
        public Buffer sType$Default() {
            return sType(1000470000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance5FeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Features.Buffer
        public Buffer maintenance5(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMaintenance5FeaturesKHR.nmaintenance5(address(), value ? 1 : 0);
            return this;
        }
    }
}
