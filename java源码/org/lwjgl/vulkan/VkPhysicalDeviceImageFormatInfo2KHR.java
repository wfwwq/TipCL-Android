package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageFormatInfo2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageFormatInfo2KHR.class */
public class VkPhysicalDeviceImageFormatInfo2KHR extends VkPhysicalDeviceImageFormatInfo2 {
    protected VkPhysicalDeviceImageFormatInfo2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2, org.lwjgl.system.Struct
    public VkPhysicalDeviceImageFormatInfo2KHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageFormatInfo2KHR(address, container);
    }

    public VkPhysicalDeviceImageFormatInfo2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2
    public VkPhysicalDeviceImageFormatInfo2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2
    public VkPhysicalDeviceImageFormatInfo2KHR sType$Default() {
        return sType(1000059004);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2
    public VkPhysicalDeviceImageFormatInfo2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2
    public VkPhysicalDeviceImageFormatInfo2KHR format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2
    public VkPhysicalDeviceImageFormatInfo2KHR type(@NativeType("VkImageType") int value) {
        ntype(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2
    public VkPhysicalDeviceImageFormatInfo2KHR tiling(@NativeType("VkImageTiling") int value) {
        ntiling(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2
    public VkPhysicalDeviceImageFormatInfo2KHR usage(@NativeType("VkImageUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2
    public VkPhysicalDeviceImageFormatInfo2KHR flags(@NativeType("VkImageCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2
    public VkPhysicalDeviceImageFormatInfo2KHR set(int sType, long pNext, int format, int type, int tiling, int usage, int flags) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        tiling(tiling);
        usage(usage);
        flags(flags);
        return this;
    }

    public VkPhysicalDeviceImageFormatInfo2KHR set(VkPhysicalDeviceImageFormatInfo2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageFormatInfo2KHR malloc() {
        return new VkPhysicalDeviceImageFormatInfo2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageFormatInfo2KHR calloc() {
        return new VkPhysicalDeviceImageFormatInfo2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageFormatInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageFormatInfo2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageFormatInfo2KHR create(long address) {
        return new VkPhysicalDeviceImageFormatInfo2KHR(address, null);
    }

    public static VkPhysicalDeviceImageFormatInfo2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageFormatInfo2KHR(address, null);
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

    public static VkPhysicalDeviceImageFormatInfo2KHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageFormatInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageFormatInfo2KHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageFormatInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageFormatInfo2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageFormatInfo2KHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceImageFormatInfo2.Buffer {
        private static final VkPhysicalDeviceImageFormatInfo2KHR ELEMENT_FACTORY = VkPhysicalDeviceImageFormatInfo2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceImageFormatInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageFormatInfo2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer
        public Buffer sType$Default() {
            return sType(1000059004);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceImageFormatInfo2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer
        public Buffer format(@NativeType("VkFormat") int value) {
            VkPhysicalDeviceImageFormatInfo2KHR.nformat(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer
        public Buffer type(@NativeType("VkImageType") int value) {
            VkPhysicalDeviceImageFormatInfo2KHR.ntype(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer
        public Buffer tiling(@NativeType("VkImageTiling") int value) {
            VkPhysicalDeviceImageFormatInfo2KHR.ntiling(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer
        public Buffer usage(@NativeType("VkImageUsageFlags") int value) {
            VkPhysicalDeviceImageFormatInfo2KHR.nusage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2.Buffer
        public Buffer flags(@NativeType("VkImageCreateFlags") int value) {
            VkPhysicalDeviceImageFormatInfo2KHR.nflags(address(), value);
            return this;
        }
    }
}
