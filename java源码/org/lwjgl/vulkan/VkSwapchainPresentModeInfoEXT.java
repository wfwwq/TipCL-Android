package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModeInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModeInfoEXT.class */
public class VkSwapchainPresentModeInfoEXT extends VkSwapchainPresentModeInfoKHR {
    protected VkSwapchainPresentModeInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR, org.lwjgl.system.Struct
    public VkSwapchainPresentModeInfoEXT create(long address, ByteBuffer container) {
        return new VkSwapchainPresentModeInfoEXT(address, container);
    }

    public VkSwapchainPresentModeInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR
    public VkSwapchainPresentModeInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR
    public VkSwapchainPresentModeInfoEXT sType$Default() {
        return sType(1000275003);
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR
    public VkSwapchainPresentModeInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR
    public VkSwapchainPresentModeInfoEXT pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) {
        npPresentModes(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR
    public VkSwapchainPresentModeInfoEXT set(int sType, long pNext, IntBuffer pPresentModes) {
        sType(sType);
        pNext(pNext);
        pPresentModes(pPresentModes);
        return this;
    }

    public VkSwapchainPresentModeInfoEXT set(VkSwapchainPresentModeInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainPresentModeInfoEXT malloc() {
        return new VkSwapchainPresentModeInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainPresentModeInfoEXT calloc() {
        return new VkSwapchainPresentModeInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainPresentModeInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentModeInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainPresentModeInfoEXT create(long address) {
        return new VkSwapchainPresentModeInfoEXT(address, null);
    }

    public static VkSwapchainPresentModeInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainPresentModeInfoEXT(address, null);
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

    public static VkSwapchainPresentModeInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainPresentModeInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainPresentModeInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainPresentModeInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModeInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModeInfoEXT$Buffer.class */
    public static class Buffer extends VkSwapchainPresentModeInfoKHR.Buffer {
        private static final VkSwapchainPresentModeInfoEXT ELEMENT_FACTORY = VkSwapchainPresentModeInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkSwapchainPresentModeInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainPresentModeInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000275003);
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainPresentModeInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentModeInfoKHR.Buffer
        public Buffer pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) {
            VkSwapchainPresentModeInfoEXT.npPresentModes(address(), value);
            return this;
        }
    }
}
