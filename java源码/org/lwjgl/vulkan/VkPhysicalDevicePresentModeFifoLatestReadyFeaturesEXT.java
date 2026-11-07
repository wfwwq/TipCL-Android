package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT.class */
public class VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT extends VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR {
    protected VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR, org.lwjgl.system.Struct
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT(address, container);
    }

    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT sType$Default() {
        return sType(1000361000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT presentModeFifoLatestReady(@NativeType("VkBool32") boolean value) {
        npresentModeFifoLatestReady(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT set(int sType, long pNext, boolean presentModeFifoLatestReady) {
        sType(sType);
        pNext(pNext);
        presentModeFifoLatestReady(presentModeFifoLatestReady);
        return this;
    }

    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT set(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT malloc() {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT calloc() {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT create(long address) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT(address, null);
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT(address, null);
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

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer {
        private static final VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000361000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer
        public Buffer presentModeFifoLatestReady(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT.npresentModeFifoLatestReady(address(), value ? 1 : 0);
            return this;
        }
    }
}
