package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkAttachmentReference2;
import org.lwjgl.vulkan.VkSubpassDescription2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription2KHR.class */
public class VkSubpassDescription2KHR extends VkSubpassDescription2 {
    protected VkSubpassDescription2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSubpassDescription2, org.lwjgl.system.Struct
    public VkSubpassDescription2KHR create(long address, ByteBuffer container) {
        return new VkSubpassDescription2KHR(address, container);
    }

    public VkSubpassDescription2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR sType$Default() {
        return sType(1000109002);
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR flags(@NativeType("VkSubpassDescriptionFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
        npipelineBindPoint(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR viewMask(@NativeType("uint32_t") int value) {
        nviewMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR pInputAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
        npInputAttachments(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR pColorAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
        npColorAttachments(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR pResolveAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
        npResolveAttachments(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR pDepthStencilAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) {
        npDepthStencilAttachment(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR pPreserveAttachments(@NativeType("uint32_t const *") IntBuffer value) {
        npPreserveAttachments(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public VkSubpassDescription2KHR set(int sType, long pNext, int flags, int pipelineBindPoint, int viewMask, VkAttachmentReference2.Buffer pInputAttachments, int colorAttachmentCount, VkAttachmentReference2.Buffer pColorAttachments, VkAttachmentReference2.Buffer pResolveAttachments, VkAttachmentReference2 pDepthStencilAttachment, IntBuffer pPreserveAttachments) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        viewMask(viewMask);
        pInputAttachments(pInputAttachments);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachments(pColorAttachments);
        pResolveAttachments(pResolveAttachments);
        pDepthStencilAttachment(pDepthStencilAttachment);
        pPreserveAttachments(pPreserveAttachments);
        return this;
    }

    public VkSubpassDescription2KHR set(VkSubpassDescription2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassDescription2KHR malloc() {
        return new VkSubpassDescription2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassDescription2KHR calloc() {
        return new VkSubpassDescription2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassDescription2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDescription2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassDescription2KHR create(long address) {
        return new VkSubpassDescription2KHR(address, null);
    }

    public static VkSubpassDescription2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassDescription2KHR(address, null);
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

    public static VkSubpassDescription2KHR malloc(MemoryStack stack) {
        return new VkSubpassDescription2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassDescription2KHR calloc(MemoryStack stack) {
        return new VkSubpassDescription2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription2KHR$Buffer.class */
    public static class Buffer extends VkSubpassDescription2.Buffer {
        private static final VkSubpassDescription2KHR ELEMENT_FACTORY = VkSubpassDescription2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer, org.lwjgl.system.StructBuffer
        public VkSubpassDescription2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassDescription2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer sType$Default() {
            return sType(1000109002);
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassDescription2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer flags(@NativeType("VkSubpassDescriptionFlags") int value) {
            VkSubpassDescription2KHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
            VkSubpassDescription2KHR.npipelineBindPoint(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer viewMask(@NativeType("uint32_t") int value) {
            VkSubpassDescription2KHR.nviewMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer pInputAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
            VkSubpassDescription2KHR.npInputAttachments(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkSubpassDescription2KHR.ncolorAttachmentCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer pColorAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
            VkSubpassDescription2KHR.npColorAttachments(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer pResolveAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
            VkSubpassDescription2KHR.npResolveAttachments(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer pDepthStencilAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) {
            VkSubpassDescription2KHR.npDepthStencilAttachment(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public Buffer pPreserveAttachments(@NativeType("uint32_t const *") IntBuffer value) {
            VkSubpassDescription2KHR.npPreserveAttachments(address(), value);
            return this;
        }
    }
}
