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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy2.class */
public class VkBufferCopy2 extends Struct<VkBufferCopy2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCOFFSET;
    public static final int DSTOFFSET;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCOFFSET = layout.offsetof(2);
        DSTOFFSET = layout.offsetof(3);
        SIZE = layout.offsetof(4);
    }

    protected VkBufferCopy2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferCopy2 create(long address, ByteBuffer container) {
        return new VkBufferCopy2(address, container);
    }

    public VkBufferCopy2(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
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

    public VkBufferCopy2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferCopy2 sType$Default() {
        return sType(1000337006);
    }

    public VkBufferCopy2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferCopy2 srcOffset(@NativeType("VkDeviceSize") long value) {
        nsrcOffset(address(), value);
        return this;
    }

    public VkBufferCopy2 dstOffset(@NativeType("VkDeviceSize") long value) {
        ndstOffset(address(), value);
        return this;
    }

    public VkBufferCopy2 size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkBufferCopy2 set(int sType, long pNext, long srcOffset, long dstOffset, long size) {
        sType(sType);
        pNext(pNext);
        srcOffset(srcOffset);
        dstOffset(dstOffset);
        size(size);
        return this;
    }

    public VkBufferCopy2 set(VkBufferCopy2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferCopy2 malloc() {
        return new VkBufferCopy2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferCopy2 calloc() {
        return new VkBufferCopy2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferCopy2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferCopy2(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferCopy2 create(long address) {
        return new VkBufferCopy2(address, null);
    }

    public static VkBufferCopy2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferCopy2(address, null);
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

    public static VkBufferCopy2 malloc(MemoryStack stack) {
        return new VkBufferCopy2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferCopy2 calloc(MemoryStack stack) {
        return new VkBufferCopy2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCopy2$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferCopy2, Buffer> implements NativeResource {
        private static final VkBufferCopy2 ELEMENT_FACTORY = VkBufferCopy2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferCopy2.SIZEOF);
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
        public VkBufferCopy2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferCopy2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferCopy2.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long srcOffset() {
            return VkBufferCopy2.nsrcOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long dstOffset() {
            return VkBufferCopy2.ndstOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkBufferCopy2.nsize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferCopy2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000337006);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferCopy2.npNext(address(), value);
            return this;
        }

        public Buffer srcOffset(@NativeType("VkDeviceSize") long value) {
            VkBufferCopy2.nsrcOffset(address(), value);
            return this;
        }

        public Buffer dstOffset(@NativeType("VkDeviceSize") long value) {
            VkBufferCopy2.ndstOffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkBufferCopy2.nsize(address(), value);
            return this;
        }
    }
}
