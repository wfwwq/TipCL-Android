package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageViewUsageCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewUsageCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewUsageCreateInfoKHR.class */
public class VkImageViewUsageCreateInfoKHR extends VkImageViewUsageCreateInfo {
    protected VkImageViewUsageCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo, org.lwjgl.system.Struct
    public VkImageViewUsageCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkImageViewUsageCreateInfoKHR(address, container);
    }

    public VkImageViewUsageCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo
    public VkImageViewUsageCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo
    public VkImageViewUsageCreateInfoKHR sType$Default() {
        return sType(1000117002);
    }

    @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo
    public VkImageViewUsageCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo
    public VkImageViewUsageCreateInfoKHR usage(@NativeType("VkImageUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo
    public VkImageViewUsageCreateInfoKHR set(int sType, long pNext, int usage) {
        sType(sType);
        pNext(pNext);
        usage(usage);
        return this;
    }

    public VkImageViewUsageCreateInfoKHR set(VkImageViewUsageCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageViewUsageCreateInfoKHR malloc() {
        return new VkImageViewUsageCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageViewUsageCreateInfoKHR calloc() {
        return new VkImageViewUsageCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageViewUsageCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewUsageCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImageViewUsageCreateInfoKHR create(long address) {
        return new VkImageViewUsageCreateInfoKHR(address, null);
    }

    public static VkImageViewUsageCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageViewUsageCreateInfoKHR(address, null);
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

    public static VkImageViewUsageCreateInfoKHR malloc(MemoryStack stack) {
        return new VkImageViewUsageCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageViewUsageCreateInfoKHR calloc(MemoryStack stack) {
        return new VkImageViewUsageCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewUsageCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewUsageCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkImageViewUsageCreateInfo.Buffer {
        private static final VkImageViewUsageCreateInfoKHR ELEMENT_FACTORY = VkImageViewUsageCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkImageViewUsageCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageViewUsageCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000117002);
        }

        @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageViewUsageCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageViewUsageCreateInfo.Buffer
        public Buffer usage(@NativeType("VkImageUsageFlags") int value) {
            VkImageViewUsageCreateInfoKHR.nusage(address(), value);
            return this;
        }
    }
}
