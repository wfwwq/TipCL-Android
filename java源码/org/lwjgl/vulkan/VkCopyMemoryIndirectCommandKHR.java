package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryIndirectCommandKHR.class */
public class VkCopyMemoryIndirectCommandKHR extends Struct<VkCopyMemoryIndirectCommandKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRCADDRESS;
    public static final int DSTADDRESS;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRCADDRESS = layout.offsetof(0);
        DSTADDRESS = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkCopyMemoryIndirectCommandKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyMemoryIndirectCommandKHR create(long address, ByteBuffer container) {
        return new VkCopyMemoryIndirectCommandKHR(address, container);
    }

    public VkCopyMemoryIndirectCommandKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long srcAddress() {
        return nsrcAddress(address());
    }

    @NativeType("VkDeviceAddress")
    public long dstAddress() {
        return ndstAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    public VkCopyMemoryIndirectCommandKHR srcAddress(@NativeType("VkDeviceAddress") long value) {
        nsrcAddress(address(), value);
        return this;
    }

    public VkCopyMemoryIndirectCommandKHR dstAddress(@NativeType("VkDeviceAddress") long value) {
        ndstAddress(address(), value);
        return this;
    }

    public VkCopyMemoryIndirectCommandKHR size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkCopyMemoryIndirectCommandKHR set(long srcAddress, long dstAddress, long size) {
        srcAddress(srcAddress);
        dstAddress(dstAddress);
        size(size);
        return this;
    }

    public VkCopyMemoryIndirectCommandKHR set(VkCopyMemoryIndirectCommandKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyMemoryIndirectCommandKHR malloc() {
        return new VkCopyMemoryIndirectCommandKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyMemoryIndirectCommandKHR calloc() {
        return new VkCopyMemoryIndirectCommandKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyMemoryIndirectCommandKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryIndirectCommandKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyMemoryIndirectCommandKHR create(long address) {
        return new VkCopyMemoryIndirectCommandKHR(address, null);
    }

    public static VkCopyMemoryIndirectCommandKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyMemoryIndirectCommandKHR(address, null);
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

    public static VkCopyMemoryIndirectCommandKHR malloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectCommandKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyMemoryIndirectCommandKHR calloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectCommandKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nsrcAddress(long struct) {
        return MemoryUtil.memGetLong(struct + SRCADDRESS);
    }

    public static long ndstAddress(long struct) {
        return MemoryUtil.memGetLong(struct + DSTADDRESS);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static void nsrcAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCADDRESS, value);
    }

    public static void ndstAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTADDRESS, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryIndirectCommandKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyMemoryIndirectCommandKHR, Buffer> implements NativeResource {
        private static final VkCopyMemoryIndirectCommandKHR ELEMENT_FACTORY = VkCopyMemoryIndirectCommandKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyMemoryIndirectCommandKHR.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkCopyMemoryIndirectCommandKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long srcAddress() {
            return VkCopyMemoryIndirectCommandKHR.nsrcAddress(address());
        }

        @NativeType("VkDeviceAddress")
        public long dstAddress() {
            return VkCopyMemoryIndirectCommandKHR.ndstAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkCopyMemoryIndirectCommandKHR.nsize(address());
        }

        public Buffer srcAddress(@NativeType("VkDeviceAddress") long value) {
            VkCopyMemoryIndirectCommandKHR.nsrcAddress(address(), value);
            return this;
        }

        public Buffer dstAddress(@NativeType("VkDeviceAddress") long value) {
            VkCopyMemoryIndirectCommandKHR.ndstAddress(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkCopyMemoryIndirectCommandKHR.nsize(address(), value);
            return this;
        }
    }
}
