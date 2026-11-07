package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance6FeaturesKHR.class */
public class VkPhysicalDeviceMaintenance6FeaturesKHR extends VkPhysicalDeviceMaintenance6Features {
    protected VkPhysicalDeviceMaintenance6FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features, org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance6FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceMaintenance6FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features
    public VkPhysicalDeviceMaintenance6FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features
    public VkPhysicalDeviceMaintenance6FeaturesKHR sType$Default() {
        return sType(1000545000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features
    public VkPhysicalDeviceMaintenance6FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features
    public VkPhysicalDeviceMaintenance6FeaturesKHR maintenance6(@NativeType("VkBool32") boolean value) {
        nmaintenance6(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features
    public VkPhysicalDeviceMaintenance6FeaturesKHR set(int sType, long pNext, boolean maintenance6) {
        sType(sType);
        pNext(pNext);
        maintenance6(maintenance6);
        return this;
    }

    public VkPhysicalDeviceMaintenance6FeaturesKHR set(VkPhysicalDeviceMaintenance6FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance6FeaturesKHR malloc() {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance6FeaturesKHR calloc() {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance6FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance6FeaturesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceMaintenance6FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceMaintenance6FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance6FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance6FeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceMaintenance6Features.Buffer {
        private static final VkPhysicalDeviceMaintenance6FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance6FeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceMaintenance6FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance6FeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.Buffer
        public Buffer sType$Default() {
            return sType(1000545000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance6FeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance6Features.Buffer
        public Buffer maintenance6(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMaintenance6FeaturesKHR.nmaintenance6(address(), value ? 1 : 0);
            return this;
        }
    }
}
