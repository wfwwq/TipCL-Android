package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBlitImageInfo2;
import org.lwjgl.vulkan.VkImageBlit2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBlitImageInfo2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBlitImageInfo2KHR.class */
public class VkBlitImageInfo2KHR extends VkBlitImageInfo2 {
    protected VkBlitImageInfo2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBlitImageInfo2, org.lwjgl.system.Struct
    public VkBlitImageInfo2KHR create(long address, ByteBuffer container) {
        return new VkBlitImageInfo2KHR(address, container);
    }

    public VkBlitImageInfo2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBlitImageInfo2
    public VkBlitImageInfo2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBlitImageInfo2
    public VkBlitImageInfo2KHR sType$Default() {
        return sType(1000337004);
    }

    @Override // org.lwjgl.vulkan.VkBlitImageInfo2
    public VkBlitImageInfo2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBlitImageInfo2
    public VkBlitImageInfo2KHR srcImage(@NativeType("VkImage") long value) {
        nsrcImage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBlitImageInfo2
    public VkBlitImageInfo2KHR srcImageLayout(@NativeType("VkImageLayout") int value) {
        nsrcImageLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBlitImageInfo2
    public VkBlitImageInfo2KHR dstImage(@NativeType("VkImage") long value) {
        ndstImage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBlitImageInfo2
    public VkBlitImageInfo2KHR dstImageLayout(@NativeType("VkImageLayout") int value) {
        ndstImageLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBlitImageInfo2
    public VkBlitImageInfo2KHR pRegions(@NativeType("VkImageBlit2 const *") VkImageBlit2.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBlitImageInfo2
    public VkBlitImageInfo2KHR filter(@NativeType("VkFilter") int value) {
        nfilter(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBlitImageInfo2
    public VkBlitImageInfo2KHR set(int sType, long pNext, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageBlit2.Buffer pRegions, int filter) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);
        filter(filter);
        return this;
    }

    public VkBlitImageInfo2KHR set(VkBlitImageInfo2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBlitImageInfo2KHR malloc() {
        return new VkBlitImageInfo2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBlitImageInfo2KHR calloc() {
        return new VkBlitImageInfo2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBlitImageInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBlitImageInfo2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBlitImageInfo2KHR create(long address) {
        return new VkBlitImageInfo2KHR(address, null);
    }

    public static VkBlitImageInfo2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBlitImageInfo2KHR(address, null);
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

    public static VkBlitImageInfo2KHR malloc(MemoryStack stack) {
        return new VkBlitImageInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBlitImageInfo2KHR calloc(MemoryStack stack) {
        return new VkBlitImageInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBlitImageInfo2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBlitImageInfo2KHR$Buffer.class */
    public static class Buffer extends VkBlitImageInfo2.Buffer {
        private static final VkBlitImageInfo2KHR ELEMENT_FACTORY = VkBlitImageInfo2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer, org.lwjgl.system.StructBuffer
        public VkBlitImageInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBlitImageInfo2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer
        public Buffer sType$Default() {
            return sType(1000337004);
        }

        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBlitImageInfo2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer
        public Buffer srcImage(@NativeType("VkImage") long value) {
            VkBlitImageInfo2KHR.nsrcImage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer
        public Buffer srcImageLayout(@NativeType("VkImageLayout") int value) {
            VkBlitImageInfo2KHR.nsrcImageLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer
        public Buffer dstImage(@NativeType("VkImage") long value) {
            VkBlitImageInfo2KHR.ndstImage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer
        public Buffer dstImageLayout(@NativeType("VkImageLayout") int value) {
            VkBlitImageInfo2KHR.ndstImageLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer
        public Buffer pRegions(@NativeType("VkImageBlit2 const *") VkImageBlit2.Buffer value) {
            VkBlitImageInfo2KHR.npRegions(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBlitImageInfo2.Buffer
        public Buffer filter(@NativeType("VkFilter") int value) {
            VkBlitImageInfo2KHR.nfilter(address(), value);
            return this;
        }
    }
}
