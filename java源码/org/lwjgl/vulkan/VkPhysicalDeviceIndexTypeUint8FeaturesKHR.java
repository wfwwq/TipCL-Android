package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIndexTypeUint8FeaturesKHR.class */
public class VkPhysicalDeviceIndexTypeUint8FeaturesKHR extends VkPhysicalDeviceIndexTypeUint8Features {
    protected VkPhysicalDeviceIndexTypeUint8FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features, org.lwjgl.system.Struct
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR sType$Default() {
        return sType(1000265000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR indexTypeUint8(@NativeType("VkBool32") boolean value) {
        nindexTypeUint8(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR set(int sType, long pNext, boolean indexTypeUint8) {
        sType(sType);
        pNext(pNext);
        indexTypeUint8(indexTypeUint8);
        return this;
    }

    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR set(VkPhysicalDeviceIndexTypeUint8FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR malloc() {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR calloc() {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR create(long address) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIndexTypeUint8FeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceIndexTypeUint8Features.Buffer {
        private static final VkPhysicalDeviceIndexTypeUint8FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceIndexTypeUint8FeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceIndexTypeUint8FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceIndexTypeUint8FeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer
        public Buffer sType$Default() {
            return sType(1000265000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceIndexTypeUint8FeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer
        public Buffer indexTypeUint8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceIndexTypeUint8FeaturesKHR.nindexTypeUint8(address(), value ? 1 : 0);
            return this;
        }
    }
}
