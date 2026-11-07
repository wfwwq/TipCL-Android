package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReferenceStencilLayoutKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReferenceStencilLayoutKHR.class */
public class VkAttachmentReferenceStencilLayoutKHR extends VkAttachmentReferenceStencilLayout {
    protected VkAttachmentReferenceStencilLayoutKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout, org.lwjgl.system.Struct
    public VkAttachmentReferenceStencilLayoutKHR create(long address, ByteBuffer container) {
        return new VkAttachmentReferenceStencilLayoutKHR(address, container);
    }

    public VkAttachmentReferenceStencilLayoutKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout
    public VkAttachmentReferenceStencilLayoutKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout
    public VkAttachmentReferenceStencilLayoutKHR sType$Default() {
        return sType(1000241001);
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout
    public VkAttachmentReferenceStencilLayoutKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout
    public VkAttachmentReferenceStencilLayoutKHR stencilLayout(@NativeType("VkImageLayout") int value) {
        nstencilLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout
    public VkAttachmentReferenceStencilLayoutKHR set(int sType, long pNext, int stencilLayout) {
        sType(sType);
        pNext(pNext);
        stencilLayout(stencilLayout);
        return this;
    }

    public VkAttachmentReferenceStencilLayoutKHR set(VkAttachmentReferenceStencilLayoutKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentReferenceStencilLayoutKHR malloc() {
        return new VkAttachmentReferenceStencilLayoutKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentReferenceStencilLayoutKHR calloc() {
        return new VkAttachmentReferenceStencilLayoutKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentReferenceStencilLayoutKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentReferenceStencilLayoutKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentReferenceStencilLayoutKHR create(long address) {
        return new VkAttachmentReferenceStencilLayoutKHR(address, null);
    }

    public static VkAttachmentReferenceStencilLayoutKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentReferenceStencilLayoutKHR(address, null);
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

    public static VkAttachmentReferenceStencilLayoutKHR malloc(MemoryStack stack) {
        return new VkAttachmentReferenceStencilLayoutKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentReferenceStencilLayoutKHR calloc(MemoryStack stack) {
        return new VkAttachmentReferenceStencilLayoutKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReferenceStencilLayoutKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReferenceStencilLayoutKHR$Buffer.class */
    public static class Buffer extends VkAttachmentReferenceStencilLayout.Buffer {
        private static final VkAttachmentReferenceStencilLayoutKHR ELEMENT_FACTORY = VkAttachmentReferenceStencilLayoutKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.Buffer, org.lwjgl.system.StructBuffer
        public VkAttachmentReferenceStencilLayoutKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAttachmentReferenceStencilLayoutKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.Buffer
        public Buffer sType$Default() {
            return sType(1000241001);
        }

        @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkAttachmentReferenceStencilLayoutKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentReferenceStencilLayout.Buffer
        public Buffer stencilLayout(@NativeType("VkImageLayout") int value) {
            VkAttachmentReferenceStencilLayoutKHR.nstencilLayout(address(), value);
            return this;
        }
    }
}
