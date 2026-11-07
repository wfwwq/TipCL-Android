package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBufferCopy2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy2KHR.class */
public class VkBufferCopy2KHR extends VkBufferCopy2 {
    protected VkBufferCopy2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBufferCopy2, org.lwjgl.system.Struct
    public VkBufferCopy2KHR create(long address, ByteBuffer container) {
        return new VkBufferCopy2KHR(address, container);
    }

    public VkBufferCopy2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public VkBufferCopy2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public VkBufferCopy2KHR sType$Default() {
        return sType(1000337006);
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public VkBufferCopy2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public VkBufferCopy2KHR srcOffset(@NativeType("VkDeviceSize") long value) {
        nsrcOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public VkBufferCopy2KHR dstOffset(@NativeType("VkDeviceSize") long value) {
        ndstOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public VkBufferCopy2KHR size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public VkBufferCopy2KHR set(int sType, long pNext, long srcOffset, long dstOffset, long size) {
        sType(sType);
        pNext(pNext);
        srcOffset(srcOffset);
        dstOffset(dstOffset);
        size(size);
        return this;
    }

    public VkBufferCopy2KHR set(VkBufferCopy2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferCopy2KHR malloc() {
        return new VkBufferCopy2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferCopy2KHR calloc() {
        return new VkBufferCopy2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferCopy2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferCopy2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferCopy2KHR create(long address) {
        return new VkBufferCopy2KHR(address, null);
    }

    public static VkBufferCopy2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferCopy2KHR(address, null);
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

    public static VkBufferCopy2KHR malloc(MemoryStack stack) {
        return new VkBufferCopy2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferCopy2KHR calloc(MemoryStack stack) {
        return new VkBufferCopy2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy2KHR$Buffer.class */
    public static class Buffer extends VkBufferCopy2.Buffer {
        private static final VkBufferCopy2KHR ELEMENT_FACTORY = VkBufferCopy2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer, org.lwjgl.system.StructBuffer
        public VkBufferCopy2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferCopy2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public Buffer sType$Default() {
            return sType(1000337006);
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferCopy2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public Buffer srcOffset(@NativeType("VkDeviceSize") long value) {
            VkBufferCopy2KHR.nsrcOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public Buffer dstOffset(@NativeType("VkDeviceSize") long value) {
            VkBufferCopy2KHR.ndstOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkBufferCopy2KHR.nsize(address(), value);
            return this;
        }
    }
}
