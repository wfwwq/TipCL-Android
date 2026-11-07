package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageStencilUsageCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageStencilUsageCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageStencilUsageCreateInfoEXT.class */
public class VkImageStencilUsageCreateInfoEXT extends VkImageStencilUsageCreateInfo {
    protected VkImageStencilUsageCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo, org.lwjgl.system.Struct
    public VkImageStencilUsageCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkImageStencilUsageCreateInfoEXT(address, container);
    }

    public VkImageStencilUsageCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo
    public VkImageStencilUsageCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo
    public VkImageStencilUsageCreateInfoEXT sType$Default() {
        return sType(1000246000);
    }

    @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo
    public VkImageStencilUsageCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo
    public VkImageStencilUsageCreateInfoEXT stencilUsage(@NativeType("VkImageUsageFlags") int value) {
        nstencilUsage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo
    public VkImageStencilUsageCreateInfoEXT set(int sType, long pNext, int stencilUsage) {
        sType(sType);
        pNext(pNext);
        stencilUsage(stencilUsage);
        return this;
    }

    public VkImageStencilUsageCreateInfoEXT set(VkImageStencilUsageCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageStencilUsageCreateInfoEXT malloc() {
        return new VkImageStencilUsageCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageStencilUsageCreateInfoEXT calloc() {
        return new VkImageStencilUsageCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageStencilUsageCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageStencilUsageCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageStencilUsageCreateInfoEXT create(long address) {
        return new VkImageStencilUsageCreateInfoEXT(address, null);
    }

    public static VkImageStencilUsageCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageStencilUsageCreateInfoEXT(address, null);
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

    public static VkImageStencilUsageCreateInfoEXT malloc(MemoryStack stack) {
        return new VkImageStencilUsageCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageStencilUsageCreateInfoEXT calloc(MemoryStack stack) {
        return new VkImageStencilUsageCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageStencilUsageCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageStencilUsageCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkImageStencilUsageCreateInfo.Buffer {
        private static final VkImageStencilUsageCreateInfoEXT ELEMENT_FACTORY = VkImageStencilUsageCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkImageStencilUsageCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageStencilUsageCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000246000);
        }

        @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageStencilUsageCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageStencilUsageCreateInfo.Buffer
        public Buffer stencilUsage(@NativeType("VkImageUsageFlags") int value) {
            VkImageStencilUsageCreateInfoEXT.nstencilUsage(address(), value);
            return this;
        }
    }
}
