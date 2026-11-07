package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCopyImageToMemoryInfo;
import org.lwjgl.vulkan.VkImageToMemoryCopy;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfoEXT.class */
public class VkCopyImageToMemoryInfoEXT extends VkCopyImageToMemoryInfo {
    protected VkCopyImageToMemoryInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo, org.lwjgl.system.Struct
    public VkCopyImageToMemoryInfoEXT create(long address, ByteBuffer container) {
        return new VkCopyImageToMemoryInfoEXT(address, container);
    }

    public VkCopyImageToMemoryInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo
    public VkCopyImageToMemoryInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo
    public VkCopyImageToMemoryInfoEXT sType$Default() {
        return sType(1000270004);
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo
    public VkCopyImageToMemoryInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo
    public VkCopyImageToMemoryInfoEXT flags(@NativeType("VkHostImageCopyFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo
    public VkCopyImageToMemoryInfoEXT srcImage(@NativeType("VkImage") long value) {
        nsrcImage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo
    public VkCopyImageToMemoryInfoEXT srcImageLayout(@NativeType("VkImageLayout") int value) {
        nsrcImageLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo
    public VkCopyImageToMemoryInfoEXT pRegions(@NativeType("VkImageToMemoryCopy const *") VkImageToMemoryCopy.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo
    public VkCopyImageToMemoryInfoEXT set(int sType, long pNext, int flags, long srcImage, int srcImageLayout, VkImageToMemoryCopy.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        pRegions(pRegions);
        return this;
    }

    public VkCopyImageToMemoryInfoEXT set(VkCopyImageToMemoryInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyImageToMemoryInfoEXT malloc() {
        return new VkCopyImageToMemoryInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyImageToMemoryInfoEXT calloc() {
        return new VkCopyImageToMemoryInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyImageToMemoryInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageToMemoryInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyImageToMemoryInfoEXT create(long address) {
        return new VkCopyImageToMemoryInfoEXT(address, null);
    }

    public static VkCopyImageToMemoryInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyImageToMemoryInfoEXT(address, null);
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

    public static VkCopyImageToMemoryInfoEXT malloc(MemoryStack stack) {
        return new VkCopyImageToMemoryInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyImageToMemoryInfoEXT calloc(MemoryStack stack) {
        return new VkCopyImageToMemoryInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfoEXT$Buffer.class */
    public static class Buffer extends VkCopyImageToMemoryInfo.Buffer {
        private static final VkCopyImageToMemoryInfoEXT ELEMENT_FACTORY = VkCopyImageToMemoryInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkCopyImageToMemoryInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyImageToMemoryInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000270004);
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyImageToMemoryInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo.Buffer
        public Buffer flags(@NativeType("VkHostImageCopyFlags") int value) {
            VkCopyImageToMemoryInfoEXT.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo.Buffer
        public Buffer srcImage(@NativeType("VkImage") long value) {
            VkCopyImageToMemoryInfoEXT.nsrcImage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo.Buffer
        public Buffer srcImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyImageToMemoryInfoEXT.nsrcImageLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToMemoryInfo.Buffer
        public Buffer pRegions(@NativeType("VkImageToMemoryCopy const *") VkImageToMemoryCopy.Buffer value) {
            VkCopyImageToMemoryInfoEXT.npRegions(address(), value);
            return this;
        }
    }
}
