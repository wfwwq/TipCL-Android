package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSurfacePresentModeKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeEXT.class */
public class VkSurfacePresentModeEXT extends VkSurfacePresentModeKHR {
    protected VkSurfacePresentModeEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR, org.lwjgl.system.Struct
    public VkSurfacePresentModeEXT create(long address, ByteBuffer container) {
        return new VkSurfacePresentModeEXT(address, container);
    }

    public VkSurfacePresentModeEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR
    public VkSurfacePresentModeEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR
    public VkSurfacePresentModeEXT sType$Default() {
        return sType(1000274000);
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR
    public VkSurfacePresentModeEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR
    public VkSurfacePresentModeEXT presentMode(@NativeType("VkPresentModeKHR") int value) {
        npresentMode(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR
    public VkSurfacePresentModeEXT set(int sType, long pNext, int presentMode) {
        sType(sType);
        pNext(pNext);
        presentMode(presentMode);
        return this;
    }

    public VkSurfacePresentModeEXT set(VkSurfacePresentModeEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSurfacePresentModeEXT malloc() {
        return new VkSurfacePresentModeEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfacePresentModeEXT calloc() {
        return new VkSurfacePresentModeEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfacePresentModeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentModeEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfacePresentModeEXT create(long address) {
        return new VkSurfacePresentModeEXT(address, null);
    }

    public static VkSurfacePresentModeEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfacePresentModeEXT(address, null);
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

    public static VkSurfacePresentModeEXT malloc(MemoryStack stack) {
        return new VkSurfacePresentModeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfacePresentModeEXT calloc(MemoryStack stack) {
        return new VkSurfacePresentModeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeEXT$Buffer.class */
    public static class Buffer extends VkSurfacePresentModeKHR.Buffer {
        private static final VkSurfacePresentModeEXT ELEMENT_FACTORY = VkSurfacePresentModeEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkSurfacePresentModeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSurfacePresentModeEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000274000);
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkSurfacePresentModeEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentModeKHR.Buffer
        public Buffer presentMode(@NativeType("VkPresentModeKHR") int value) {
            VkSurfacePresentModeEXT.npresentMode(address(), value);
            return this;
        }
    }
}
