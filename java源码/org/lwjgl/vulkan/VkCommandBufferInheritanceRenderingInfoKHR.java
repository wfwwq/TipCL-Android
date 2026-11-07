package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfoKHR.class */
public class VkCommandBufferInheritanceRenderingInfoKHR extends VkCommandBufferInheritanceRenderingInfo {
    protected VkCommandBufferInheritanceRenderingInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo, org.lwjgl.system.Struct
    public VkCommandBufferInheritanceRenderingInfoKHR create(long address, ByteBuffer container) {
        return new VkCommandBufferInheritanceRenderingInfoKHR(address, container);
    }

    public VkCommandBufferInheritanceRenderingInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public VkCommandBufferInheritanceRenderingInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public VkCommandBufferInheritanceRenderingInfoKHR sType$Default() {
        return sType(1000044004);
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public VkCommandBufferInheritanceRenderingInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public VkCommandBufferInheritanceRenderingInfoKHR flags(@NativeType("VkRenderingFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public VkCommandBufferInheritanceRenderingInfoKHR viewMask(@NativeType("uint32_t") int value) {
        nviewMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public VkCommandBufferInheritanceRenderingInfoKHR pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) {
        npColorAttachmentFormats(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public VkCommandBufferInheritanceRenderingInfoKHR depthAttachmentFormat(@NativeType("VkFormat") int value) {
        ndepthAttachmentFormat(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public VkCommandBufferInheritanceRenderingInfoKHR stencilAttachmentFormat(@NativeType("VkFormat") int value) {
        nstencilAttachmentFormat(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public VkCommandBufferInheritanceRenderingInfoKHR rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) {
        nrasterizationSamples(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public VkCommandBufferInheritanceRenderingInfoKHR set(int sType, long pNext, int flags, int viewMask, IntBuffer pColorAttachmentFormats, int depthAttachmentFormat, int stencilAttachmentFormat, int rasterizationSamples) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        viewMask(viewMask);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);
        rasterizationSamples(rasterizationSamples);
        return this;
    }

    public VkCommandBufferInheritanceRenderingInfoKHR set(VkCommandBufferInheritanceRenderingInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferInheritanceRenderingInfoKHR malloc() {
        return new VkCommandBufferInheritanceRenderingInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferInheritanceRenderingInfoKHR calloc() {
        return new VkCommandBufferInheritanceRenderingInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceRenderingInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceRenderingInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferInheritanceRenderingInfoKHR create(long address) {
        return new VkCommandBufferInheritanceRenderingInfoKHR(address, null);
    }

    public static VkCommandBufferInheritanceRenderingInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferInheritanceRenderingInfoKHR(address, null);
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

    public static VkCommandBufferInheritanceRenderingInfoKHR malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceRenderingInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceRenderingInfoKHR calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceRenderingInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfoKHR$Buffer.class */
    public static class Buffer extends VkCommandBufferInheritanceRenderingInfo.Buffer {
        private static final VkCommandBufferInheritanceRenderingInfoKHR ELEMENT_FACTORY = VkCommandBufferInheritanceRenderingInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkCommandBufferInheritanceRenderingInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferInheritanceRenderingInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000044004);
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferInheritanceRenderingInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public Buffer flags(@NativeType("VkRenderingFlags") int value) {
            VkCommandBufferInheritanceRenderingInfoKHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public Buffer viewMask(@NativeType("uint32_t") int value) {
            VkCommandBufferInheritanceRenderingInfoKHR.nviewMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public Buffer pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) {
            VkCommandBufferInheritanceRenderingInfoKHR.npColorAttachmentFormats(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) {
            VkCommandBufferInheritanceRenderingInfoKHR.ndepthAttachmentFormat(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) {
            VkCommandBufferInheritanceRenderingInfoKHR.nstencilAttachmentFormat(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public Buffer rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) {
            VkCommandBufferInheritanceRenderingInfoKHR.nrasterizationSamples(address(), value);
            return this;
        }
    }
}
