package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReleaseSwapchainImagesInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReleaseSwapchainImagesInfoEXT.class */
public class VkReleaseSwapchainImagesInfoEXT extends VkReleaseSwapchainImagesInfoKHR {
    protected VkReleaseSwapchainImagesInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR, org.lwjgl.system.Struct
    public VkReleaseSwapchainImagesInfoEXT create(long address, ByteBuffer container) {
        return new VkReleaseSwapchainImagesInfoEXT(address, container);
    }

    public VkReleaseSwapchainImagesInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR
    public VkReleaseSwapchainImagesInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR
    public VkReleaseSwapchainImagesInfoEXT sType$Default() {
        return sType(1000275005);
    }

    @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR
    public VkReleaseSwapchainImagesInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR
    public VkReleaseSwapchainImagesInfoEXT swapchain(@NativeType("VkSwapchainKHR") long value) {
        nswapchain(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR
    public VkReleaseSwapchainImagesInfoEXT pImageIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npImageIndices(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR
    public VkReleaseSwapchainImagesInfoEXT set(int sType, long pNext, long swapchain, IntBuffer pImageIndices) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        pImageIndices(pImageIndices);
        return this;
    }

    public VkReleaseSwapchainImagesInfoEXT set(VkReleaseSwapchainImagesInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkReleaseSwapchainImagesInfoEXT malloc() {
        return new VkReleaseSwapchainImagesInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkReleaseSwapchainImagesInfoEXT calloc() {
        return new VkReleaseSwapchainImagesInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkReleaseSwapchainImagesInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkReleaseSwapchainImagesInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkReleaseSwapchainImagesInfoEXT create(long address) {
        return new VkReleaseSwapchainImagesInfoEXT(address, null);
    }

    public static VkReleaseSwapchainImagesInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkReleaseSwapchainImagesInfoEXT(address, null);
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

    public static VkReleaseSwapchainImagesInfoEXT malloc(MemoryStack stack) {
        return new VkReleaseSwapchainImagesInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkReleaseSwapchainImagesInfoEXT calloc(MemoryStack stack) {
        return new VkReleaseSwapchainImagesInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReleaseSwapchainImagesInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReleaseSwapchainImagesInfoEXT$Buffer.class */
    public static class Buffer extends VkReleaseSwapchainImagesInfoKHR.Buffer {
        private static final VkReleaseSwapchainImagesInfoEXT ELEMENT_FACTORY = VkReleaseSwapchainImagesInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkReleaseSwapchainImagesInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkReleaseSwapchainImagesInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000275005);
        }

        @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkReleaseSwapchainImagesInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR.Buffer
        public Buffer swapchain(@NativeType("VkSwapchainKHR") long value) {
            VkReleaseSwapchainImagesInfoEXT.nswapchain(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR.Buffer
        public Buffer pImageIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkReleaseSwapchainImagesInfoEXT.npImageIndices(address(), value);
            return this;
        }
    }
}
