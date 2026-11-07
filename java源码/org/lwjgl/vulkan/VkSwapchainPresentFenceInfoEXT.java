package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentFenceInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentFenceInfoEXT.class */
public class VkSwapchainPresentFenceInfoEXT extends VkSwapchainPresentFenceInfoKHR {
    protected VkSwapchainPresentFenceInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR, org.lwjgl.system.Struct
    public VkSwapchainPresentFenceInfoEXT create(long address, ByteBuffer container) {
        return new VkSwapchainPresentFenceInfoEXT(address, container);
    }

    public VkSwapchainPresentFenceInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR
    public VkSwapchainPresentFenceInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR
    public VkSwapchainPresentFenceInfoEXT sType$Default() {
        return sType(1000275001);
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR
    public VkSwapchainPresentFenceInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR
    public VkSwapchainPresentFenceInfoEXT swapchainCount(@NativeType("uint32_t") int value) {
        nswapchainCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR
    public VkSwapchainPresentFenceInfoEXT pFences(@NativeType("VkFence const *") LongBuffer value) {
        npFences(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR
    public VkSwapchainPresentFenceInfoEXT set(int sType, long pNext, int swapchainCount, LongBuffer pFences) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pFences(pFences);
        return this;
    }

    public VkSwapchainPresentFenceInfoEXT set(VkSwapchainPresentFenceInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainPresentFenceInfoEXT malloc() {
        return new VkSwapchainPresentFenceInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainPresentFenceInfoEXT calloc() {
        return new VkSwapchainPresentFenceInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainPresentFenceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentFenceInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainPresentFenceInfoEXT create(long address) {
        return new VkSwapchainPresentFenceInfoEXT(address, null);
    }

    public static VkSwapchainPresentFenceInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainPresentFenceInfoEXT(address, null);
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

    public static VkSwapchainPresentFenceInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainPresentFenceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainPresentFenceInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainPresentFenceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentFenceInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentFenceInfoEXT$Buffer.class */
    public static class Buffer extends VkSwapchainPresentFenceInfoKHR.Buffer {
        private static final VkSwapchainPresentFenceInfoEXT ELEMENT_FACTORY = VkSwapchainPresentFenceInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkSwapchainPresentFenceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainPresentFenceInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000275001);
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainPresentFenceInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR.Buffer
        public Buffer swapchainCount(@NativeType("uint32_t") int value) {
            VkSwapchainPresentFenceInfoEXT.nswapchainCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentFenceInfoKHR.Buffer
        public Buffer pFences(@NativeType("VkFence const *") LongBuffer value) {
            VkSwapchainPresentFenceInfoEXT.npFences(address(), value);
            return this;
        }
    }
}
