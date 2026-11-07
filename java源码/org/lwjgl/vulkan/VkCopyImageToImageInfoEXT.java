package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCopyImageToImageInfo;
import org.lwjgl.vulkan.VkImageCopy2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToImageInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToImageInfoEXT.class */
public class VkCopyImageToImageInfoEXT extends VkCopyImageToImageInfo {
    protected VkCopyImageToImageInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo, org.lwjgl.system.Struct
    public VkCopyImageToImageInfoEXT create(long address, ByteBuffer container) {
        return new VkCopyImageToImageInfoEXT(address, container);
    }

    public VkCopyImageToImageInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo
    public VkCopyImageToImageInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo
    public VkCopyImageToImageInfoEXT sType$Default() {
        return sType(1000270007);
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo
    public VkCopyImageToImageInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo
    public VkCopyImageToImageInfoEXT flags(@NativeType("VkHostImageCopyFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo
    public VkCopyImageToImageInfoEXT srcImage(@NativeType("VkImage") long value) {
        nsrcImage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo
    public VkCopyImageToImageInfoEXT srcImageLayout(@NativeType("VkImageLayout") int value) {
        nsrcImageLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo
    public VkCopyImageToImageInfoEXT dstImage(@NativeType("VkImage") long value) {
        ndstImage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo
    public VkCopyImageToImageInfoEXT dstImageLayout(@NativeType("VkImageLayout") int value) {
        ndstImageLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo
    public VkCopyImageToImageInfoEXT pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo
    public VkCopyImageToImageInfoEXT set(int sType, long pNext, int flags, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageCopy2.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);
        return this;
    }

    public VkCopyImageToImageInfoEXT set(VkCopyImageToImageInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyImageToImageInfoEXT malloc() {
        return new VkCopyImageToImageInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyImageToImageInfoEXT calloc() {
        return new VkCopyImageToImageInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyImageToImageInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageToImageInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyImageToImageInfoEXT create(long address) {
        return new VkCopyImageToImageInfoEXT(address, null);
    }

    public static VkCopyImageToImageInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyImageToImageInfoEXT(address, null);
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

    public static VkCopyImageToImageInfoEXT malloc(MemoryStack stack) {
        return new VkCopyImageToImageInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyImageToImageInfoEXT calloc(MemoryStack stack) {
        return new VkCopyImageToImageInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToImageInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToImageInfoEXT$Buffer.class */
    public static class Buffer extends VkCopyImageToImageInfo.Buffer {
        private static final VkCopyImageToImageInfoEXT ELEMENT_FACTORY = VkCopyImageToImageInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkCopyImageToImageInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyImageToImageInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000270007);
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyImageToImageInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer
        public Buffer flags(@NativeType("VkHostImageCopyFlags") int value) {
            VkCopyImageToImageInfoEXT.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer
        public Buffer srcImage(@NativeType("VkImage") long value) {
            VkCopyImageToImageInfoEXT.nsrcImage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer
        public Buffer srcImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyImageToImageInfoEXT.nsrcImageLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer
        public Buffer dstImage(@NativeType("VkImage") long value) {
            VkCopyImageToImageInfoEXT.ndstImage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer
        public Buffer dstImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyImageToImageInfoEXT.ndstImageLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToImageInfo.Buffer
        public Buffer pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) {
            VkCopyImageToImageInfoEXT.npRegions(address(), value);
            return this;
        }
    }
}
