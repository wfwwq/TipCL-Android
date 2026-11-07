package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDeviceImageSubresourceInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageSubresourceInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageSubresourceInfoKHR.class */
public class VkDeviceImageSubresourceInfoKHR extends VkDeviceImageSubresourceInfo {
    protected VkDeviceImageSubresourceInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo, org.lwjgl.system.Struct
    public VkDeviceImageSubresourceInfoKHR create(long address, ByteBuffer container) {
        return new VkDeviceImageSubresourceInfoKHR(address, container);
    }

    public VkDeviceImageSubresourceInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo
    public VkDeviceImageSubresourceInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo
    public VkDeviceImageSubresourceInfoKHR sType$Default() {
        return sType(1000470004);
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo
    public VkDeviceImageSubresourceInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo
    public VkDeviceImageSubresourceInfoKHR pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) {
        npCreateInfo(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo
    public VkDeviceImageSubresourceInfoKHR pSubresource(@NativeType("VkImageSubresource2 const *") VkImageSubresource2 value) {
        npSubresource(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo
    public VkDeviceImageSubresourceInfoKHR set(int sType, long pNext, VkImageCreateInfo pCreateInfo, VkImageSubresource2 pSubresource) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        pSubresource(pSubresource);
        return this;
    }

    public VkDeviceImageSubresourceInfoKHR set(VkDeviceImageSubresourceInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceImageSubresourceInfoKHR malloc() {
        return new VkDeviceImageSubresourceInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceImageSubresourceInfoKHR calloc() {
        return new VkDeviceImageSubresourceInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceImageSubresourceInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceImageSubresourceInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceImageSubresourceInfoKHR create(long address) {
        return new VkDeviceImageSubresourceInfoKHR(address, null);
    }

    public static VkDeviceImageSubresourceInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceImageSubresourceInfoKHR(address, null);
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

    public static VkDeviceImageSubresourceInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceImageSubresourceInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceImageSubresourceInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceImageSubresourceInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageSubresourceInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageSubresourceInfoKHR$Buffer.class */
    public static class Buffer extends VkDeviceImageSubresourceInfo.Buffer {
        private static final VkDeviceImageSubresourceInfoKHR ELEMENT_FACTORY = VkDeviceImageSubresourceInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDeviceImageSubresourceInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceImageSubresourceInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000470004);
        }

        @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceImageSubresourceInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.Buffer
        public Buffer pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) {
            VkDeviceImageSubresourceInfoKHR.npCreateInfo(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.Buffer
        public Buffer pSubresource(@NativeType("VkImageSubresource2 const *") VkImageSubresource2 value) {
            VkDeviceImageSubresourceInfoKHR.npSubresource(address(), value);
            return this;
        }
    }
}
