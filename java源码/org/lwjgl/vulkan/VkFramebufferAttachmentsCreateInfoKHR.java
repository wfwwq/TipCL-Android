package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo;
import org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentsCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentsCreateInfoKHR.class */
public class VkFramebufferAttachmentsCreateInfoKHR extends VkFramebufferAttachmentsCreateInfo {
    protected VkFramebufferAttachmentsCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo, org.lwjgl.system.Struct
    public VkFramebufferAttachmentsCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkFramebufferAttachmentsCreateInfoKHR(address, container);
    }

    public VkFramebufferAttachmentsCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo
    public VkFramebufferAttachmentsCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo
    public VkFramebufferAttachmentsCreateInfoKHR sType$Default() {
        return sType(1000108001);
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo
    public VkFramebufferAttachmentsCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo
    public VkFramebufferAttachmentsCreateInfoKHR pAttachmentImageInfos(@NativeType("VkFramebufferAttachmentImageInfo const *") VkFramebufferAttachmentImageInfo.Buffer value) {
        npAttachmentImageInfos(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo
    public VkFramebufferAttachmentsCreateInfoKHR set(int sType, long pNext, VkFramebufferAttachmentImageInfo.Buffer pAttachmentImageInfos) {
        sType(sType);
        pNext(pNext);
        pAttachmentImageInfos(pAttachmentImageInfos);
        return this;
    }

    public VkFramebufferAttachmentsCreateInfoKHR set(VkFramebufferAttachmentsCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFramebufferAttachmentsCreateInfoKHR malloc() {
        return new VkFramebufferAttachmentsCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFramebufferAttachmentsCreateInfoKHR calloc() {
        return new VkFramebufferAttachmentsCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFramebufferAttachmentsCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFramebufferAttachmentsCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkFramebufferAttachmentsCreateInfoKHR create(long address) {
        return new VkFramebufferAttachmentsCreateInfoKHR(address, null);
    }

    public static VkFramebufferAttachmentsCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFramebufferAttachmentsCreateInfoKHR(address, null);
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

    public static VkFramebufferAttachmentsCreateInfoKHR malloc(MemoryStack stack) {
        return new VkFramebufferAttachmentsCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFramebufferAttachmentsCreateInfoKHR calloc(MemoryStack stack) {
        return new VkFramebufferAttachmentsCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentsCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentsCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkFramebufferAttachmentsCreateInfo.Buffer {
        private static final VkFramebufferAttachmentsCreateInfoKHR ELEMENT_FACTORY = VkFramebufferAttachmentsCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkFramebufferAttachmentsCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFramebufferAttachmentsCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000108001);
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkFramebufferAttachmentsCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkFramebufferAttachmentsCreateInfo.Buffer
        public Buffer pAttachmentImageInfos(@NativeType("VkFramebufferAttachmentImageInfo const *") VkFramebufferAttachmentImageInfo.Buffer value) {
            VkFramebufferAttachmentsCreateInfoKHR.npAttachmentImageInfos(address(), value);
            return this;
        }
    }
}
