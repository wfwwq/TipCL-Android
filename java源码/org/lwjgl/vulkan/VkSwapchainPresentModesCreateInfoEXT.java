package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModesCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModesCreateInfoEXT.class */
public class VkSwapchainPresentModesCreateInfoEXT extends VkSwapchainPresentModesCreateInfoKHR {
    protected VkSwapchainPresentModesCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR, org.lwjgl.system.Struct
    public VkSwapchainPresentModesCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkSwapchainPresentModesCreateInfoEXT(address, container);
    }

    public VkSwapchainPresentModesCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR
    public VkSwapchainPresentModesCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR
    public VkSwapchainPresentModesCreateInfoEXT sType$Default() {
        return sType(1000275002);
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR
    public VkSwapchainPresentModesCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR
    public VkSwapchainPresentModesCreateInfoEXT pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) {
        npPresentModes(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR
    public VkSwapchainPresentModesCreateInfoEXT set(int sType, long pNext, IntBuffer pPresentModes) {
        sType(sType);
        pNext(pNext);
        pPresentModes(pPresentModes);
        return this;
    }

    public VkSwapchainPresentModesCreateInfoEXT set(VkSwapchainPresentModesCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainPresentModesCreateInfoEXT malloc() {
        return new VkSwapchainPresentModesCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainPresentModesCreateInfoEXT calloc() {
        return new VkSwapchainPresentModesCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainPresentModesCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentModesCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainPresentModesCreateInfoEXT create(long address) {
        return new VkSwapchainPresentModesCreateInfoEXT(address, null);
    }

    public static VkSwapchainPresentModesCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainPresentModesCreateInfoEXT(address, null);
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

    public static VkSwapchainPresentModesCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainPresentModesCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainPresentModesCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainPresentModesCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModesCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModesCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkSwapchainPresentModesCreateInfoKHR.Buffer {
        private static final VkSwapchainPresentModesCreateInfoEXT ELEMENT_FACTORY = VkSwapchainPresentModesCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkSwapchainPresentModesCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainPresentModesCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000275002);
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainPresentModesCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoKHR.Buffer
        public Buffer pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) {
            VkSwapchainPresentModesCreateInfoEXT.npPresentModes(address(), value);
            return this;
        }
    }
}
