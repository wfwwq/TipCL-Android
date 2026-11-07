package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineRenderingCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRenderingCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRenderingCreateInfoKHR.class */
public class VkPipelineRenderingCreateInfoKHR extends VkPipelineRenderingCreateInfo {
    protected VkPipelineRenderingCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo, org.lwjgl.system.Struct
    public VkPipelineRenderingCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineRenderingCreateInfoKHR(address, container);
    }

    public VkPipelineRenderingCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo
    public VkPipelineRenderingCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo
    public VkPipelineRenderingCreateInfoKHR sType$Default() {
        return sType(1000044002);
    }

    @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo
    public VkPipelineRenderingCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo
    public VkPipelineRenderingCreateInfoKHR viewMask(@NativeType("uint32_t") int value) {
        nviewMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo
    public VkPipelineRenderingCreateInfoKHR colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo
    public VkPipelineRenderingCreateInfoKHR pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) {
        npColorAttachmentFormats(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo
    public VkPipelineRenderingCreateInfoKHR depthAttachmentFormat(@NativeType("VkFormat") int value) {
        ndepthAttachmentFormat(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo
    public VkPipelineRenderingCreateInfoKHR stencilAttachmentFormat(@NativeType("VkFormat") int value) {
        nstencilAttachmentFormat(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo
    public VkPipelineRenderingCreateInfoKHR set(int sType, long pNext, int viewMask, int colorAttachmentCount, IntBuffer pColorAttachmentFormats, int depthAttachmentFormat, int stencilAttachmentFormat) {
        sType(sType);
        pNext(pNext);
        viewMask(viewMask);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);
        return this;
    }

    public VkPipelineRenderingCreateInfoKHR set(VkPipelineRenderingCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRenderingCreateInfoKHR malloc() {
        return new VkPipelineRenderingCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRenderingCreateInfoKHR calloc() {
        return new VkPipelineRenderingCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRenderingCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRenderingCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRenderingCreateInfoKHR create(long address) {
        return new VkPipelineRenderingCreateInfoKHR(address, null);
    }

    public static VkPipelineRenderingCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRenderingCreateInfoKHR(address, null);
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

    public static VkPipelineRenderingCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineRenderingCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRenderingCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineRenderingCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRenderingCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRenderingCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkPipelineRenderingCreateInfo.Buffer {
        private static final VkPipelineRenderingCreateInfoKHR ELEMENT_FACTORY = VkPipelineRenderingCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPipelineRenderingCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRenderingCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000044002);
        }

        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRenderingCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer
        public Buffer viewMask(@NativeType("uint32_t") int value) {
            VkPipelineRenderingCreateInfoKHR.nviewMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer
        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkPipelineRenderingCreateInfoKHR.ncolorAttachmentCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer
        public Buffer pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) {
            VkPipelineRenderingCreateInfoKHR.npColorAttachmentFormats(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer
        public Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) {
            VkPipelineRenderingCreateInfoKHR.ndepthAttachmentFormat(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRenderingCreateInfo.Buffer
        public Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) {
            VkPipelineRenderingCreateInfoKHR.nstencilAttachmentFormat(address(), value);
            return this;
        }
    }
}
