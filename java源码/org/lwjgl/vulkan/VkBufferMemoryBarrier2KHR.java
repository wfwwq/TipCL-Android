package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBufferMemoryBarrier2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier2KHR.class */
public class VkBufferMemoryBarrier2KHR extends VkBufferMemoryBarrier2 {
    protected VkBufferMemoryBarrier2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2, org.lwjgl.system.Struct
    public VkBufferMemoryBarrier2KHR create(long address, ByteBuffer container) {
        return new VkBufferMemoryBarrier2KHR(address, container);
    }

    public VkBufferMemoryBarrier2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR sType$Default() {
        return sType(1000314001);
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        nsrcStageMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR srcAccessMask(@NativeType("VkAccessFlags2") long value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        ndstStageMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR dstAccessMask(@NativeType("VkAccessFlags2") long value) {
        ndstAccessMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
        nsrcQueueFamilyIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
        ndstQueueFamilyIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2
    public VkBufferMemoryBarrier2KHR set(int sType, long pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int srcQueueFamilyIndex, int dstQueueFamilyIndex, long buffer, long offset, long size) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        buffer(buffer);
        offset(offset);
        size(size);
        return this;
    }

    public VkBufferMemoryBarrier2KHR set(VkBufferMemoryBarrier2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferMemoryBarrier2KHR malloc() {
        return new VkBufferMemoryBarrier2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferMemoryBarrier2KHR calloc() {
        return new VkBufferMemoryBarrier2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferMemoryBarrier2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferMemoryBarrier2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferMemoryBarrier2KHR create(long address) {
        return new VkBufferMemoryBarrier2KHR(address, null);
    }

    public static VkBufferMemoryBarrier2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferMemoryBarrier2KHR(address, null);
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

    public static VkBufferMemoryBarrier2KHR malloc(MemoryStack stack) {
        return new VkBufferMemoryBarrier2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferMemoryBarrier2KHR calloc(MemoryStack stack) {
        return new VkBufferMemoryBarrier2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier2KHR$Buffer.class */
    public static class Buffer extends VkBufferMemoryBarrier2.Buffer {
        private static final VkBufferMemoryBarrier2KHR ELEMENT_FACTORY = VkBufferMemoryBarrier2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer, org.lwjgl.system.StructBuffer
        public VkBufferMemoryBarrier2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferMemoryBarrier2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer sType$Default() {
            return sType(1000314001);
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferMemoryBarrier2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkBufferMemoryBarrier2KHR.nsrcStageMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkBufferMemoryBarrier2KHR.nsrcAccessMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkBufferMemoryBarrier2KHR.ndstStageMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkBufferMemoryBarrier2KHR.ndstAccessMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkBufferMemoryBarrier2KHR.nsrcQueueFamilyIndex(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkBufferMemoryBarrier2KHR.ndstQueueFamilyIndex(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBufferMemoryBarrier2KHR.nbuffer(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkBufferMemoryBarrier2KHR.noffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer
        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkBufferMemoryBarrier2KHR.nsize(address(), value);
            return this;
        }
    }
}
