package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy.class */
public class VkBufferCopy extends Struct<VkBufferCopy> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRCOFFSET;
    public static final int DSTOFFSET;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRCOFFSET = layout.offsetof(0);
        DSTOFFSET = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkBufferCopy(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferCopy create(long address, ByteBuffer container) {
        return new VkBufferCopy(address, container);
    }

    public VkBufferCopy(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceSize")
    public long srcOffset() {
        return nsrcOffset(address());
    }

    @NativeType("VkDeviceSize")
    public long dstOffset() {
        return ndstOffset(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    public VkBufferCopy srcOffset(@NativeType("VkDeviceSize") long value) {
        nsrcOffset(address(), value);
        return this;
    }

    public VkBufferCopy dstOffset(@NativeType("VkDeviceSize") long value) {
        ndstOffset(address(), value);
        return this;
    }

    public VkBufferCopy size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkBufferCopy set(long srcOffset, long dstOffset, long size) {
        srcOffset(srcOffset);
        dstOffset(dstOffset);
        size(size);
        return this;
    }

    public VkBufferCopy set(VkBufferCopy src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferCopy malloc() {
        return new VkBufferCopy(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferCopy calloc() {
        return new VkBufferCopy(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferCopy create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferCopy(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferCopy create(long address) {
        return new VkBufferCopy(address, null);
    }

    public static VkBufferCopy createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferCopy(address, null);
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

    public static VkBufferCopy malloc(MemoryStack stack) {
        return new VkBufferCopy(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferCopy calloc(MemoryStack stack) {
        return new VkBufferCopy(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nsrcOffset(long struct) {
        return MemoryUtil.memGetLong(struct + SRCOFFSET);
    }

    public static long ndstOffset(long struct) {
        return MemoryUtil.memGetLong(struct + DSTOFFSET);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static void nsrcOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCOFFSET, value);
    }

    public static void ndstOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTOFFSET, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferCopy, Buffer> implements NativeResource {
        private static final VkBufferCopy ELEMENT_FACTORY = VkBufferCopy.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferCopy.SIZEOF);
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
        public VkBufferCopy getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceSize")
        public long srcOffset() {
            return VkBufferCopy.nsrcOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long dstOffset() {
            return VkBufferCopy.ndstOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkBufferCopy.nsize(address());
        }

        public Buffer srcOffset(@NativeType("VkDeviceSize") long value) {
            VkBufferCopy.nsrcOffset(address(), value);
            return this;
        }

        public Buffer dstOffset(@NativeType("VkDeviceSize") long value) {
            VkBufferCopy.ndstOffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkBufferCopy.nsize(address(), value);
            return this;
        }
    }
}
