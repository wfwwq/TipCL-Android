package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryIndirectCommandNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryIndirectCommandNV.class */
public class VkCopyMemoryIndirectCommandNV extends VkCopyMemoryIndirectCommandKHR {
    protected VkCopyMemoryIndirectCommandNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR, org.lwjgl.system.Struct
    public VkCopyMemoryIndirectCommandNV create(long address, ByteBuffer container) {
        return new VkCopyMemoryIndirectCommandNV(address, container);
    }

    public VkCopyMemoryIndirectCommandNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR
    public VkCopyMemoryIndirectCommandNV srcAddress(@NativeType("VkDeviceAddress") long value) {
        nsrcAddress(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR
    public VkCopyMemoryIndirectCommandNV dstAddress(@NativeType("VkDeviceAddress") long value) {
        ndstAddress(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR
    public VkCopyMemoryIndirectCommandNV size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR
    public VkCopyMemoryIndirectCommandNV set(long srcAddress, long dstAddress, long size) {
        srcAddress(srcAddress);
        dstAddress(dstAddress);
        size(size);
        return this;
    }

    public VkCopyMemoryIndirectCommandNV set(VkCopyMemoryIndirectCommandNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyMemoryIndirectCommandNV malloc() {
        return new VkCopyMemoryIndirectCommandNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyMemoryIndirectCommandNV calloc() {
        return new VkCopyMemoryIndirectCommandNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyMemoryIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryIndirectCommandNV(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyMemoryIndirectCommandNV create(long address) {
        return new VkCopyMemoryIndirectCommandNV(address, null);
    }

    public static VkCopyMemoryIndirectCommandNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyMemoryIndirectCommandNV(address, null);
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

    public static VkCopyMemoryIndirectCommandNV malloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyMemoryIndirectCommandNV calloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryIndirectCommandNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryIndirectCommandNV$Buffer.class */
    public static class Buffer extends VkCopyMemoryIndirectCommandKHR.Buffer {
        private static final VkCopyMemoryIndirectCommandNV ELEMENT_FACTORY = VkCopyMemoryIndirectCommandNV.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkCopyMemoryIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR.Buffer
        public Buffer srcAddress(@NativeType("VkDeviceAddress") long value) {
            VkCopyMemoryIndirectCommandNV.nsrcAddress(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR.Buffer
        public Buffer dstAddress(@NativeType("VkDeviceAddress") long value) {
            VkCopyMemoryIndirectCommandNV.ndstAddress(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryIndirectCommandKHR.Buffer
        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkCopyMemoryIndirectCommandNV.nsize(address(), value);
            return this;
        }
    }
}
