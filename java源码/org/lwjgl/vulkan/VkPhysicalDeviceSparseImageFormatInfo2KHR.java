package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseImageFormatInfo2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseImageFormatInfo2KHR.class */
public class VkPhysicalDeviceSparseImageFormatInfo2KHR extends VkPhysicalDeviceSparseImageFormatInfo2 {
    protected VkPhysicalDeviceSparseImageFormatInfo2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2, org.lwjgl.system.Struct
    public VkPhysicalDeviceSparseImageFormatInfo2KHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(address, container);
    }

    public VkPhysicalDeviceSparseImageFormatInfo2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2
    public VkPhysicalDeviceSparseImageFormatInfo2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2
    public VkPhysicalDeviceSparseImageFormatInfo2KHR sType$Default() {
        return sType(1000059008);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2
    public VkPhysicalDeviceSparseImageFormatInfo2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2
    public VkPhysicalDeviceSparseImageFormatInfo2KHR format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2
    public VkPhysicalDeviceSparseImageFormatInfo2KHR type(@NativeType("VkImageType") int value) {
        ntype(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2
    public VkPhysicalDeviceSparseImageFormatInfo2KHR samples(@NativeType("VkSampleCountFlagBits") int value) {
        nsamples(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2
    public VkPhysicalDeviceSparseImageFormatInfo2KHR usage(@NativeType("VkImageUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2
    public VkPhysicalDeviceSparseImageFormatInfo2KHR tiling(@NativeType("VkImageTiling") int value) {
        ntiling(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2
    public VkPhysicalDeviceSparseImageFormatInfo2KHR set(int sType, long pNext, int format, int type, int samples, int usage, int tiling) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        samples(samples);
        usage(usage);
        tiling(tiling);
        return this;
    }

    public VkPhysicalDeviceSparseImageFormatInfo2KHR set(VkPhysicalDeviceSparseImageFormatInfo2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2KHR malloc() {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2KHR calloc() {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2KHR create(long address) {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(address, null);
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(address, null);
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

    public static VkPhysicalDeviceSparseImageFormatInfo2KHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2KHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseImageFormatInfo2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseImageFormatInfo2KHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceSparseImageFormatInfo2.Buffer {
        private static final VkPhysicalDeviceSparseImageFormatInfo2KHR ELEMENT_FACTORY = VkPhysicalDeviceSparseImageFormatInfo2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceSparseImageFormatInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer
        public Buffer sType$Default() {
            return sType(1000059008);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceSparseImageFormatInfo2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer
        public Buffer format(@NativeType("VkFormat") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2KHR.nformat(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer
        public Buffer type(@NativeType("VkImageType") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2KHR.ntype(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer
        public Buffer samples(@NativeType("VkSampleCountFlagBits") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2KHR.nsamples(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer
        public Buffer usage(@NativeType("VkImageUsageFlags") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2KHR.nusage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2.Buffer
        public Buffer tiling(@NativeType("VkImageTiling") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2KHR.ntiling(address(), value);
            return this;
        }
    }
}
