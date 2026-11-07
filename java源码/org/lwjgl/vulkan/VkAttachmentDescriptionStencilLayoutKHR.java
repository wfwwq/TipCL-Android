package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayoutKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayoutKHR.class */
public class VkAttachmentDescriptionStencilLayoutKHR extends VkAttachmentDescriptionStencilLayout {
    protected VkAttachmentDescriptionStencilLayoutKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout, org.lwjgl.system.Struct
    public VkAttachmentDescriptionStencilLayoutKHR create(long address, ByteBuffer container) {
        return new VkAttachmentDescriptionStencilLayoutKHR(address, container);
    }

    public VkAttachmentDescriptionStencilLayoutKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public VkAttachmentDescriptionStencilLayoutKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public VkAttachmentDescriptionStencilLayoutKHR sType$Default() {
        return sType(1000241002);
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public VkAttachmentDescriptionStencilLayoutKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public VkAttachmentDescriptionStencilLayoutKHR stencilInitialLayout(@NativeType("VkImageLayout") int value) {
        nstencilInitialLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public VkAttachmentDescriptionStencilLayoutKHR stencilFinalLayout(@NativeType("VkImageLayout") int value) {
        nstencilFinalLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public VkAttachmentDescriptionStencilLayoutKHR set(int sType, long pNext, int stencilInitialLayout, int stencilFinalLayout) {
        sType(sType);
        pNext(pNext);
        stencilInitialLayout(stencilInitialLayout);
        stencilFinalLayout(stencilFinalLayout);
        return this;
    }

    public VkAttachmentDescriptionStencilLayoutKHR set(VkAttachmentDescriptionStencilLayoutKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentDescriptionStencilLayoutKHR malloc() {
        return new VkAttachmentDescriptionStencilLayoutKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentDescriptionStencilLayoutKHR calloc() {
        return new VkAttachmentDescriptionStencilLayoutKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentDescriptionStencilLayoutKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentDescriptionStencilLayoutKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentDescriptionStencilLayoutKHR create(long address) {
        return new VkAttachmentDescriptionStencilLayoutKHR(address, null);
    }

    public static VkAttachmentDescriptionStencilLayoutKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentDescriptionStencilLayoutKHR(address, null);
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

    public static VkAttachmentDescriptionStencilLayoutKHR malloc(MemoryStack stack) {
        return new VkAttachmentDescriptionStencilLayoutKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentDescriptionStencilLayoutKHR calloc(MemoryStack stack) {
        return new VkAttachmentDescriptionStencilLayoutKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayoutKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayoutKHR$Buffer.class */
    public static class Buffer extends VkAttachmentDescriptionStencilLayout.Buffer {
        private static final VkAttachmentDescriptionStencilLayoutKHR ELEMENT_FACTORY = VkAttachmentDescriptionStencilLayoutKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer, org.lwjgl.system.StructBuffer
        public VkAttachmentDescriptionStencilLayoutKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAttachmentDescriptionStencilLayoutKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public Buffer sType$Default() {
            return sType(1000241002);
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkAttachmentDescriptionStencilLayoutKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public Buffer stencilInitialLayout(@NativeType("VkImageLayout") int value) {
            VkAttachmentDescriptionStencilLayoutKHR.nstencilInitialLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public Buffer stencilFinalLayout(@NativeType("VkImageLayout") int value) {
            VkAttachmentDescriptionStencilLayoutKHR.nstencilFinalLayout(address(), value);
            return this;
        }
    }
}
