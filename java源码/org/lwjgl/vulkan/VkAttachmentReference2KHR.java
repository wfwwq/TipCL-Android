package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkAttachmentReference2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference2KHR.class */
public class VkAttachmentReference2KHR extends VkAttachmentReference2 {
    protected VkAttachmentReference2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkAttachmentReference2, org.lwjgl.system.Struct
    public VkAttachmentReference2KHR create(long address, ByteBuffer container) {
        return new VkAttachmentReference2KHR(address, container);
    }

    public VkAttachmentReference2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReference2
    public VkAttachmentReference2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReference2
    public VkAttachmentReference2KHR sType$Default() {
        return sType(1000109001);
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReference2
    public VkAttachmentReference2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReference2
    public VkAttachmentReference2KHR attachment(@NativeType("uint32_t") int value) {
        nattachment(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReference2
    public VkAttachmentReference2KHR layout(@NativeType("VkImageLayout") int value) {
        nlayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReference2
    public VkAttachmentReference2KHR aspectMask(@NativeType("VkImageAspectFlags") int value) {
        naspectMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReference2
    public VkAttachmentReference2KHR set(int sType, long pNext, int attachment, int layout, int aspectMask) {
        sType(sType);
        pNext(pNext);
        attachment(attachment);
        layout(layout);
        aspectMask(aspectMask);
        return this;
    }

    public VkAttachmentReference2KHR set(VkAttachmentReference2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentReference2KHR malloc() {
        return new VkAttachmentReference2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentReference2KHR calloc() {
        return new VkAttachmentReference2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentReference2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentReference2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentReference2KHR create(long address) {
        return new VkAttachmentReference2KHR(address, null);
    }

    public static VkAttachmentReference2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentReference2KHR(address, null);
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

    public static VkAttachmentReference2KHR malloc(MemoryStack stack) {
        return new VkAttachmentReference2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentReference2KHR calloc(MemoryStack stack) {
        return new VkAttachmentReference2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference2KHR$Buffer.class */
    public static class Buffer extends VkAttachmentReference2.Buffer {
        private static final VkAttachmentReference2KHR ELEMENT_FACTORY = VkAttachmentReference2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkAttachmentReference2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAttachmentReference2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAttachmentReference2.Buffer, org.lwjgl.system.StructBuffer
        public VkAttachmentReference2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentReference2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAttachmentReference2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentReference2.Buffer
        public Buffer sType$Default() {
            return sType(1000109001);
        }

        @Override // org.lwjgl.vulkan.VkAttachmentReference2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkAttachmentReference2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentReference2.Buffer
        public Buffer attachment(@NativeType("uint32_t") int value) {
            VkAttachmentReference2KHR.nattachment(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentReference2.Buffer
        public Buffer layout(@NativeType("VkImageLayout") int value) {
            VkAttachmentReference2KHR.nlayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentReference2.Buffer
        public Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) {
            VkAttachmentReference2KHR.naspectMask(address(), value);
            return this;
        }
    }
}
