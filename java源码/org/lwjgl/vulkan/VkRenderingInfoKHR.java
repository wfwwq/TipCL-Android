package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkRenderingAttachmentInfo;
import org.lwjgl.vulkan.VkRenderingInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInfoKHR.class */
public class VkRenderingInfoKHR extends VkRenderingInfo {
    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ VkRenderingInfo renderArea(Consumer consumer) {
        return renderArea((Consumer<VkRect2D>) consumer);
    }

    protected VkRenderingInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkRenderingInfo, org.lwjgl.system.Struct
    public VkRenderingInfoKHR create(long address, ByteBuffer container) {
        return new VkRenderingInfoKHR(address, container);
    }

    public VkRenderingInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR sType$Default() {
        return sType(1000044000);
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR flags(@NativeType("VkRenderingFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR renderArea(VkRect2D value) {
        nrenderArea(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR renderArea(Consumer<VkRect2D> consumer) {
        consumer.accept(renderArea());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR layerCount(@NativeType("uint32_t") int value) {
        nlayerCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR viewMask(@NativeType("uint32_t") int value) {
        nviewMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR pColorAttachments(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo.Buffer value) {
        npColorAttachments(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR pDepthAttachment(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) {
        npDepthAttachment(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR pStencilAttachment(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) {
        npStencilAttachment(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public VkRenderingInfoKHR set(int sType, long pNext, int flags, VkRect2D renderArea, int layerCount, int viewMask, VkRenderingAttachmentInfo.Buffer pColorAttachments, VkRenderingAttachmentInfo pDepthAttachment, VkRenderingAttachmentInfo pStencilAttachment) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        renderArea(renderArea);
        layerCount(layerCount);
        viewMask(viewMask);
        pColorAttachments(pColorAttachments);
        pDepthAttachment(pDepthAttachment);
        pStencilAttachment(pStencilAttachment);
        return this;
    }

    public VkRenderingInfoKHR set(VkRenderingInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingInfoKHR malloc() {
        return new VkRenderingInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingInfoKHR calloc() {
        return new VkRenderingInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingInfoKHR create(long address) {
        return new VkRenderingInfoKHR(address, null);
    }

    public static VkRenderingInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingInfoKHR(address, null);
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

    public static VkRenderingInfoKHR malloc(MemoryStack stack) {
        return new VkRenderingInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingInfoKHR calloc(MemoryStack stack) {
        return new VkRenderingInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInfoKHR$Buffer.class */
    public static class Buffer extends VkRenderingInfo.Buffer {
        private static final VkRenderingInfoKHR ELEMENT_FACTORY = VkRenderingInfoKHR.create(-1L);

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ VkRenderingInfo.Buffer renderArea(Consumer consumer) {
            return renderArea((Consumer<VkRect2D>) consumer);
        }

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
        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkRenderingInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000044000);
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer flags(@NativeType("VkRenderingFlags") int value) {
            VkRenderingInfoKHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer renderArea(VkRect2D value) {
            VkRenderingInfoKHR.nrenderArea(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer renderArea(Consumer<VkRect2D> consumer) {
            consumer.accept(renderArea());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer layerCount(@NativeType("uint32_t") int value) {
            VkRenderingInfoKHR.nlayerCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer viewMask(@NativeType("uint32_t") int value) {
            VkRenderingInfoKHR.nviewMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer pColorAttachments(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo.Buffer value) {
            VkRenderingInfoKHR.npColorAttachments(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer pDepthAttachment(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) {
            VkRenderingInfoKHR.npDepthAttachment(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public Buffer pStencilAttachment(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) {
            VkRenderingInfoKHR.npStencilAttachment(address(), value);
            return this;
        }
    }
}
