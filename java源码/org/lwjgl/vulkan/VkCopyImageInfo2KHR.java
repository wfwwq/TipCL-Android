package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCopyImageInfo2;
import org.lwjgl.vulkan.VkImageCopy2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageInfo2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageInfo2KHR.class */
public class VkCopyImageInfo2KHR extends VkCopyImageInfo2 {
    protected VkCopyImageInfo2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkCopyImageInfo2, org.lwjgl.system.Struct
    public VkCopyImageInfo2KHR create(long address, ByteBuffer container) {
        return new VkCopyImageInfo2KHR(address, container);
    }

    public VkCopyImageInfo2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkCopyImageInfo2
    public VkCopyImageInfo2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageInfo2
    public VkCopyImageInfo2KHR sType$Default() {
        return sType(1000337001);
    }

    @Override // org.lwjgl.vulkan.VkCopyImageInfo2
    public VkCopyImageInfo2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageInfo2
    public VkCopyImageInfo2KHR srcImage(@NativeType("VkImage") long value) {
        nsrcImage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageInfo2
    public VkCopyImageInfo2KHR srcImageLayout(@NativeType("VkImageLayout") int value) {
        nsrcImageLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageInfo2
    public VkCopyImageInfo2KHR dstImage(@NativeType("VkImage") long value) {
        ndstImage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageInfo2
    public VkCopyImageInfo2KHR dstImageLayout(@NativeType("VkImageLayout") int value) {
        ndstImageLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageInfo2
    public VkCopyImageInfo2KHR pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageInfo2
    public VkCopyImageInfo2KHR set(int sType, long pNext, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageCopy2.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);
        return this;
    }

    public VkCopyImageInfo2KHR set(VkCopyImageInfo2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyImageInfo2KHR malloc() {
        return new VkCopyImageInfo2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyImageInfo2KHR calloc() {
        return new VkCopyImageInfo2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyImageInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageInfo2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyImageInfo2KHR create(long address) {
        return new VkCopyImageInfo2KHR(address, null);
    }

    public static VkCopyImageInfo2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyImageInfo2KHR(address, null);
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

    public static VkCopyImageInfo2KHR malloc(MemoryStack stack) {
        return new VkCopyImageInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyImageInfo2KHR calloc(MemoryStack stack) {
        return new VkCopyImageInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageInfo2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageInfo2KHR$Buffer.class */
    public static class Buffer extends VkCopyImageInfo2.Buffer {
        private static final VkCopyImageInfo2KHR ELEMENT_FACTORY = VkCopyImageInfo2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer, org.lwjgl.system.StructBuffer
        public VkCopyImageInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyImageInfo2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer
        public Buffer sType$Default() {
            return sType(1000337001);
        }

        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyImageInfo2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer
        public Buffer srcImage(@NativeType("VkImage") long value) {
            VkCopyImageInfo2KHR.nsrcImage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer
        public Buffer srcImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyImageInfo2KHR.nsrcImageLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer
        public Buffer dstImage(@NativeType("VkImage") long value) {
            VkCopyImageInfo2KHR.ndstImage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer
        public Buffer dstImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyImageInfo2KHR.ndstImageLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageInfo2.Buffer
        public Buffer pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) {
            VkCopyImageInfo2KHR.npRegions(address(), value);
            return this;
        }
    }
}
