package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageMemoryBarrier2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2KHR.class */
public class VkImageMemoryBarrier2KHR extends VkImageMemoryBarrier2 {
    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ VkImageMemoryBarrier2 subresourceRange(Consumer consumer) {
        return subresourceRange((Consumer<VkImageSubresourceRange>) consumer);
    }

    protected VkImageMemoryBarrier2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2, org.lwjgl.system.Struct
    public VkImageMemoryBarrier2KHR create(long address, ByteBuffer container) {
        return new VkImageMemoryBarrier2KHR(address, container);
    }

    public VkImageMemoryBarrier2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR sType$Default() {
        return sType(1000314002);
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        nsrcStageMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR srcAccessMask(@NativeType("VkAccessFlags2") long value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        ndstStageMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR dstAccessMask(@NativeType("VkAccessFlags2") long value) {
        ndstAccessMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR oldLayout(@NativeType("VkImageLayout") int value) {
        noldLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR newLayout(@NativeType("VkImageLayout") int value) {
        nnewLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
        nsrcQueueFamilyIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
        ndstQueueFamilyIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR subresourceRange(VkImageSubresourceRange value) {
        nsubresourceRange(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
        consumer.accept(subresourceRange());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public VkImageMemoryBarrier2KHR set(int sType, long pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int oldLayout, int newLayout, int srcQueueFamilyIndex, int dstQueueFamilyIndex, long image, VkImageSubresourceRange subresourceRange) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        oldLayout(oldLayout);
        newLayout(newLayout);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        image(image);
        subresourceRange(subresourceRange);
        return this;
    }

    public VkImageMemoryBarrier2KHR set(VkImageMemoryBarrier2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageMemoryBarrier2KHR malloc() {
        return new VkImageMemoryBarrier2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageMemoryBarrier2KHR calloc() {
        return new VkImageMemoryBarrier2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageMemoryBarrier2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageMemoryBarrier2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImageMemoryBarrier2KHR create(long address) {
        return new VkImageMemoryBarrier2KHR(address, null);
    }

    public static VkImageMemoryBarrier2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageMemoryBarrier2KHR(address, null);
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

    public static VkImageMemoryBarrier2KHR malloc(MemoryStack stack) {
        return new VkImageMemoryBarrier2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageMemoryBarrier2KHR calloc(MemoryStack stack) {
        return new VkImageMemoryBarrier2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2KHR$Buffer.class */
    public static class Buffer extends VkImageMemoryBarrier2.Buffer {
        private static final VkImageMemoryBarrier2KHR ELEMENT_FACTORY = VkImageMemoryBarrier2KHR.create(-1L);

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ VkImageMemoryBarrier2.Buffer subresourceRange(Consumer consumer) {
            return subresourceRange((Consumer<VkImageSubresourceRange>) consumer);
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
        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer, org.lwjgl.system.StructBuffer
        public VkImageMemoryBarrier2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageMemoryBarrier2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer sType$Default() {
            return sType(1000314002);
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageMemoryBarrier2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkImageMemoryBarrier2KHR.nsrcStageMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkImageMemoryBarrier2KHR.nsrcAccessMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkImageMemoryBarrier2KHR.ndstStageMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkImageMemoryBarrier2KHR.ndstAccessMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer oldLayout(@NativeType("VkImageLayout") int value) {
            VkImageMemoryBarrier2KHR.noldLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer newLayout(@NativeType("VkImageLayout") int value) {
            VkImageMemoryBarrier2KHR.nnewLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkImageMemoryBarrier2KHR.nsrcQueueFamilyIndex(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkImageMemoryBarrier2KHR.ndstQueueFamilyIndex(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer image(@NativeType("VkImage") long value) {
            VkImageMemoryBarrier2KHR.nimage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer subresourceRange(VkImageSubresourceRange value) {
            VkImageMemoryBarrier2KHR.nsubresourceRange(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public Buffer subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
            consumer.accept(subresourceRange());
            return this;
        }
    }
}
