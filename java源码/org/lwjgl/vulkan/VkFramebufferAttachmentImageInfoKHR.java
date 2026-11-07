package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfoKHR.class */
public class VkFramebufferAttachmentImageInfoKHR extends VkFramebufferAttachmentImageInfo {
    protected VkFramebufferAttachmentImageInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo, org.lwjgl.system.Struct
    public VkFramebufferAttachmentImageInfoKHR create(long address, ByteBuffer container) {
        return new VkFramebufferAttachmentImageInfoKHR(address, container);
    }

    public VkFramebufferAttachmentImageInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
    public VkFramebufferAttachmentImageInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
    public VkFramebufferAttachmentImageInfoKHR sType$Default() {
        return sType(1000108002);
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
    public VkFramebufferAttachmentImageInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
    public VkFramebufferAttachmentImageInfoKHR flags(@NativeType("VkImageCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
    public VkFramebufferAttachmentImageInfoKHR usage(@NativeType("VkImageUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
    public VkFramebufferAttachmentImageInfoKHR width(@NativeType("uint32_t") int value) {
        nwidth(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
    public VkFramebufferAttachmentImageInfoKHR height(@NativeType("uint32_t") int value) {
        nheight(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
    public VkFramebufferAttachmentImageInfoKHR layerCount(@NativeType("uint32_t") int value) {
        nlayerCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
    public VkFramebufferAttachmentImageInfoKHR pViewFormats(@NativeType("VkFormat const *") IntBuffer value) {
        npViewFormats(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
    public VkFramebufferAttachmentImageInfoKHR set(int sType, long pNext, int flags, int usage, int width, int height, int layerCount, IntBuffer pViewFormats) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        usage(usage);
        width(width);
        height(height);
        layerCount(layerCount);
        pViewFormats(pViewFormats);
        return this;
    }

    public VkFramebufferAttachmentImageInfoKHR set(VkFramebufferAttachmentImageInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFramebufferAttachmentImageInfoKHR malloc() {
        return new VkFramebufferAttachmentImageInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFramebufferAttachmentImageInfoKHR calloc() {
        return new VkFramebufferAttachmentImageInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFramebufferAttachmentImageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFramebufferAttachmentImageInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkFramebufferAttachmentImageInfoKHR create(long address) {
        return new VkFramebufferAttachmentImageInfoKHR(address, null);
    }

    public static VkFramebufferAttachmentImageInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFramebufferAttachmentImageInfoKHR(address, null);
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

    public static VkFramebufferAttachmentImageInfoKHR malloc(MemoryStack stack) {
        return new VkFramebufferAttachmentImageInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFramebufferAttachmentImageInfoKHR calloc(MemoryStack stack) {
        return new VkFramebufferAttachmentImageInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfoKHR$Buffer.class */
    public static class Buffer extends VkFramebufferAttachmentImageInfo.Buffer {
        private static final VkFramebufferAttachmentImageInfoKHR ELEMENT_FACTORY = VkFramebufferAttachmentImageInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkFramebufferAttachmentImageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFramebufferAttachmentImageInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000108002);
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkFramebufferAttachmentImageInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer
        public Buffer flags(@NativeType("VkImageCreateFlags") int value) {
            VkFramebufferAttachmentImageInfoKHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer
        public Buffer usage(@NativeType("VkImageUsageFlags") int value) {
            VkFramebufferAttachmentImageInfoKHR.nusage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer
        public Buffer width(@NativeType("uint32_t") int value) {
            VkFramebufferAttachmentImageInfoKHR.nwidth(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer
        public Buffer height(@NativeType("uint32_t") int value) {
            VkFramebufferAttachmentImageInfoKHR.nheight(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer
        public Buffer layerCount(@NativeType("uint32_t") int value) {
            VkFramebufferAttachmentImageInfoKHR.nlayerCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer
        public Buffer pViewFormats(@NativeType("VkFormat const *") IntBuffer value) {
            VkFramebufferAttachmentImageInfoKHR.npViewFormats(address(), value);
            return this;
        }
    }
}
