package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassAttachmentBeginInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassAttachmentBeginInfoKHR.class */
public class VkRenderPassAttachmentBeginInfoKHR extends VkRenderPassAttachmentBeginInfo {
    protected VkRenderPassAttachmentBeginInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo, org.lwjgl.system.Struct
    public VkRenderPassAttachmentBeginInfoKHR create(long address, ByteBuffer container) {
        return new VkRenderPassAttachmentBeginInfoKHR(address, container);
    }

    public VkRenderPassAttachmentBeginInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo
    public VkRenderPassAttachmentBeginInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo
    public VkRenderPassAttachmentBeginInfoKHR sType$Default() {
        return sType(1000108003);
    }

    @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo
    public VkRenderPassAttachmentBeginInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo
    public VkRenderPassAttachmentBeginInfoKHR pAttachments(@NativeType("VkImageView const *") LongBuffer value) {
        npAttachments(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo
    public VkRenderPassAttachmentBeginInfoKHR set(int sType, long pNext, LongBuffer pAttachments) {
        sType(sType);
        pNext(pNext);
        pAttachments(pAttachments);
        return this;
    }

    public VkRenderPassAttachmentBeginInfoKHR set(VkRenderPassAttachmentBeginInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassAttachmentBeginInfoKHR malloc() {
        return new VkRenderPassAttachmentBeginInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassAttachmentBeginInfoKHR calloc() {
        return new VkRenderPassAttachmentBeginInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassAttachmentBeginInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassAttachmentBeginInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassAttachmentBeginInfoKHR create(long address) {
        return new VkRenderPassAttachmentBeginInfoKHR(address, null);
    }

    public static VkRenderPassAttachmentBeginInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassAttachmentBeginInfoKHR(address, null);
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

    public static VkRenderPassAttachmentBeginInfoKHR malloc(MemoryStack stack) {
        return new VkRenderPassAttachmentBeginInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassAttachmentBeginInfoKHR calloc(MemoryStack stack) {
        return new VkRenderPassAttachmentBeginInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassAttachmentBeginInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassAttachmentBeginInfoKHR$Buffer.class */
    public static class Buffer extends VkRenderPassAttachmentBeginInfo.Buffer {
        private static final VkRenderPassAttachmentBeginInfoKHR ELEMENT_FACTORY = VkRenderPassAttachmentBeginInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkRenderPassAttachmentBeginInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassAttachmentBeginInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000108003);
        }

        @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassAttachmentBeginInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo.Buffer
        public Buffer pAttachments(@NativeType("VkImageView const *") LongBuffer value) {
            VkRenderPassAttachmentBeginInfoKHR.npAttachments(address(), value);
            return this;
        }
    }
}
