package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkInputAttachmentAspectReference;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInputAttachmentAspectReferenceKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInputAttachmentAspectReferenceKHR.class */
public class VkInputAttachmentAspectReferenceKHR extends VkInputAttachmentAspectReference {
    protected VkInputAttachmentAspectReferenceKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference, org.lwjgl.system.Struct
    public VkInputAttachmentAspectReferenceKHR create(long address, ByteBuffer container) {
        return new VkInputAttachmentAspectReferenceKHR(address, container);
    }

    public VkInputAttachmentAspectReferenceKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference
    public VkInputAttachmentAspectReferenceKHR subpass(@NativeType("uint32_t") int value) {
        nsubpass(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference
    public VkInputAttachmentAspectReferenceKHR inputAttachmentIndex(@NativeType("uint32_t") int value) {
        ninputAttachmentIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference
    public VkInputAttachmentAspectReferenceKHR aspectMask(@NativeType("VkImageAspectFlags") int value) {
        naspectMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference
    public VkInputAttachmentAspectReferenceKHR set(int subpass, int inputAttachmentIndex, int aspectMask) {
        subpass(subpass);
        inputAttachmentIndex(inputAttachmentIndex);
        aspectMask(aspectMask);
        return this;
    }

    public VkInputAttachmentAspectReferenceKHR set(VkInputAttachmentAspectReferenceKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkInputAttachmentAspectReferenceKHR malloc() {
        return new VkInputAttachmentAspectReferenceKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkInputAttachmentAspectReferenceKHR calloc() {
        return new VkInputAttachmentAspectReferenceKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkInputAttachmentAspectReferenceKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkInputAttachmentAspectReferenceKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkInputAttachmentAspectReferenceKHR create(long address) {
        return new VkInputAttachmentAspectReferenceKHR(address, null);
    }

    public static VkInputAttachmentAspectReferenceKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkInputAttachmentAspectReferenceKHR(address, null);
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

    public static VkInputAttachmentAspectReferenceKHR malloc(MemoryStack stack) {
        return new VkInputAttachmentAspectReferenceKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkInputAttachmentAspectReferenceKHR calloc(MemoryStack stack) {
        return new VkInputAttachmentAspectReferenceKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInputAttachmentAspectReferenceKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInputAttachmentAspectReferenceKHR$Buffer.class */
    public static class Buffer extends VkInputAttachmentAspectReference.Buffer {
        private static final VkInputAttachmentAspectReferenceKHR ELEMENT_FACTORY = VkInputAttachmentAspectReferenceKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference.Buffer, org.lwjgl.system.StructBuffer
        public VkInputAttachmentAspectReferenceKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference.Buffer
        public Buffer subpass(@NativeType("uint32_t") int value) {
            VkInputAttachmentAspectReferenceKHR.nsubpass(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference.Buffer
        public Buffer inputAttachmentIndex(@NativeType("uint32_t") int value) {
            VkInputAttachmentAspectReferenceKHR.ninputAttachmentIndex(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkInputAttachmentAspectReference.Buffer
        public Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) {
            VkInputAttachmentAspectReferenceKHR.naspectMask(address(), value);
            return this;
        }
    }
}
