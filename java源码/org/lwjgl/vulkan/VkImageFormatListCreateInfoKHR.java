package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageFormatListCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatListCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatListCreateInfoKHR.class */
public class VkImageFormatListCreateInfoKHR extends VkImageFormatListCreateInfo {
    protected VkImageFormatListCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo, org.lwjgl.system.Struct
    public VkImageFormatListCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkImageFormatListCreateInfoKHR(address, container);
    }

    public VkImageFormatListCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo
    public VkImageFormatListCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo
    public VkImageFormatListCreateInfoKHR sType$Default() {
        return sType(1000147000);
    }

    @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo
    public VkImageFormatListCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo
    public VkImageFormatListCreateInfoKHR pViewFormats(@NativeType("VkFormat const *") IntBuffer value) {
        npViewFormats(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo
    public VkImageFormatListCreateInfoKHR set(int sType, long pNext, IntBuffer pViewFormats) {
        sType(sType);
        pNext(pNext);
        pViewFormats(pViewFormats);
        return this;
    }

    public VkImageFormatListCreateInfoKHR set(VkImageFormatListCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageFormatListCreateInfoKHR malloc() {
        return new VkImageFormatListCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageFormatListCreateInfoKHR calloc() {
        return new VkImageFormatListCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageFormatListCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageFormatListCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImageFormatListCreateInfoKHR create(long address) {
        return new VkImageFormatListCreateInfoKHR(address, null);
    }

    public static VkImageFormatListCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageFormatListCreateInfoKHR(address, null);
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

    public static VkImageFormatListCreateInfoKHR malloc(MemoryStack stack) {
        return new VkImageFormatListCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageFormatListCreateInfoKHR calloc(MemoryStack stack) {
        return new VkImageFormatListCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatListCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatListCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkImageFormatListCreateInfo.Buffer {
        private static final VkImageFormatListCreateInfoKHR ELEMENT_FACTORY = VkImageFormatListCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkImageFormatListCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageFormatListCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000147000);
        }

        @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageFormatListCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageFormatListCreateInfo.Buffer
        public Buffer pViewFormats(@NativeType("VkFormat const *") IntBuffer value) {
            VkImageFormatListCreateInfoKHR.npViewFormats(address(), value);
            return this;
        }
    }
}
