package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCopyMemoryToImageInfo;
import org.lwjgl.vulkan.VkMemoryToImageCopy;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageInfoEXT.class */
public class VkCopyMemoryToImageInfoEXT extends VkCopyMemoryToImageInfo {
    protected VkCopyMemoryToImageInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo, org.lwjgl.system.Struct
    public VkCopyMemoryToImageInfoEXT create(long address, ByteBuffer container) {
        return new VkCopyMemoryToImageInfoEXT(address, container);
    }

    public VkCopyMemoryToImageInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo
    public VkCopyMemoryToImageInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo
    public VkCopyMemoryToImageInfoEXT sType$Default() {
        return sType(1000270005);
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo
    public VkCopyMemoryToImageInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo
    public VkCopyMemoryToImageInfoEXT flags(@NativeType("VkHostImageCopyFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo
    public VkCopyMemoryToImageInfoEXT dstImage(@NativeType("VkImage") long value) {
        ndstImage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo
    public VkCopyMemoryToImageInfoEXT dstImageLayout(@NativeType("VkImageLayout") int value) {
        ndstImageLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo
    public VkCopyMemoryToImageInfoEXT pRegions(@NativeType("VkMemoryToImageCopy const *") VkMemoryToImageCopy.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo
    public VkCopyMemoryToImageInfoEXT set(int sType, long pNext, int flags, long dstImage, int dstImageLayout, VkMemoryToImageCopy.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);
        return this;
    }

    public VkCopyMemoryToImageInfoEXT set(VkCopyMemoryToImageInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyMemoryToImageInfoEXT malloc() {
        return new VkCopyMemoryToImageInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyMemoryToImageInfoEXT calloc() {
        return new VkCopyMemoryToImageInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyMemoryToImageInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyMemoryToImageInfoEXT create(long address) {
        return new VkCopyMemoryToImageInfoEXT(address, null);
    }

    public static VkCopyMemoryToImageInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyMemoryToImageInfoEXT(address, null);
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

    public static VkCopyMemoryToImageInfoEXT malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyMemoryToImageInfoEXT calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageInfoEXT$Buffer.class */
    public static class Buffer extends VkCopyMemoryToImageInfo.Buffer {
        private static final VkCopyMemoryToImageInfoEXT ELEMENT_FACTORY = VkCopyMemoryToImageInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkCopyMemoryToImageInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyMemoryToImageInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000270005);
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyMemoryToImageInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo.Buffer
        public Buffer flags(@NativeType("VkHostImageCopyFlags") int value) {
            VkCopyMemoryToImageInfoEXT.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo.Buffer
        public Buffer dstImage(@NativeType("VkImage") long value) {
            VkCopyMemoryToImageInfoEXT.ndstImage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo.Buffer
        public Buffer dstImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyMemoryToImageInfoEXT.ndstImageLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageInfo.Buffer
        public Buffer pRegions(@NativeType("VkMemoryToImageCopy const *") VkMemoryToImageCopy.Buffer value) {
            VkCopyMemoryToImageInfoEXT.npRegions(address(), value);
            return this;
        }
    }
}
