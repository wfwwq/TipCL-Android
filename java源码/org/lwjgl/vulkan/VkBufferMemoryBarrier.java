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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier.class */
public class VkBufferMemoryBarrier extends Struct<VkBufferMemoryBarrier> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCACCESSMASK;
    public static final int DSTACCESSMASK;
    public static final int SRCQUEUEFAMILYINDEX;
    public static final int DSTQUEUEFAMILYINDEX;
    public static final int BUFFER;
    public static final int OFFSET;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCACCESSMASK = layout.offsetof(2);
        DSTACCESSMASK = layout.offsetof(3);
        SRCQUEUEFAMILYINDEX = layout.offsetof(4);
        DSTQUEUEFAMILYINDEX = layout.offsetof(5);
        BUFFER = layout.offsetof(6);
        OFFSET = layout.offsetof(7);
        SIZE = layout.offsetof(8);
    }

    protected VkBufferMemoryBarrier(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferMemoryBarrier create(long address, ByteBuffer container) {
        return new VkBufferMemoryBarrier(address, container);
    }

    public VkBufferMemoryBarrier(ByteBuffer container) {
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

    @NativeType("VkAccessFlags")
    public int srcAccessMask() {
        return nsrcAccessMask(address());
    }

    @NativeType("VkAccessFlags")
    public int dstAccessMask() {
        return ndstAccessMask(address());
    }

    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() {
        return nsrcQueueFamilyIndex(address());
    }

    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() {
        return ndstQueueFamilyIndex(address());
    }

    @NativeType("VkBuffer")
    public long buffer() {
        return nbuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long offset() {
        return noffset(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    public VkBufferMemoryBarrier sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier sType$Default() {
        return sType(44);
    }

    public VkBufferMemoryBarrier pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier pNext(VkExternalMemoryAcquireUnmodifiedEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferMemoryBarrier srcAccessMask(@NativeType("VkAccessFlags") int value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier dstAccessMask(@NativeType("VkAccessFlags") int value) {
        ndstAccessMask(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
        nsrcQueueFamilyIndex(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
        ndstQueueFamilyIndex(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier set(int sType, long pNext, int srcAccessMask, int dstAccessMask, int srcQueueFamilyIndex, int dstQueueFamilyIndex, long buffer, long offset, long size) {
        sType(sType);
        pNext(pNext);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        buffer(buffer);
        offset(offset);
        size(size);
        return this;
    }

    public VkBufferMemoryBarrier set(VkBufferMemoryBarrier src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferMemoryBarrier malloc() {
        return new VkBufferMemoryBarrier(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferMemoryBarrier calloc() {
        return new VkBufferMemoryBarrier(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferMemoryBarrier create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferMemoryBarrier(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferMemoryBarrier create(long address) {
        return new VkBufferMemoryBarrier(address, null);
    }

    public static VkBufferMemoryBarrier createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferMemoryBarrier(address, null);
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

    public static VkBufferMemoryBarrier malloc(MemoryStack stack) {
        return new VkBufferMemoryBarrier(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferMemoryBarrier calloc(MemoryStack stack) {
        return new VkBufferMemoryBarrier(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsrcAccessMask(long struct) {
        return MemoryUtil.memGetInt(struct + SRCACCESSMASK);
    }

    public static int ndstAccessMask(long struct) {
        return MemoryUtil.memGetInt(struct + DSTACCESSMASK);
    }

    public static int nsrcQueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + SRCQUEUEFAMILYINDEX);
    }

    public static int ndstQueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + DSTQUEUEFAMILYINDEX);
    }

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFER);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetLong(struct + OFFSET);
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

    public static void nsrcAccessMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCACCESSMASK, value);
    }

    public static void ndstAccessMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTACCESSMASK, value);
    }

    public static void nsrcQueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCQUEUEFAMILYINDEX, value);
    }

    public static void ndstQueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTQUEUEFAMILYINDEX, value);
    }

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFER, value);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFFSET, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferMemoryBarrier, Buffer> implements NativeResource {
        private static final VkBufferMemoryBarrier ELEMENT_FACTORY = VkBufferMemoryBarrier.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferMemoryBarrier.SIZEOF);
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
        public VkBufferMemoryBarrier getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferMemoryBarrier.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferMemoryBarrier.npNext(address());
        }

        @NativeType("VkAccessFlags")
        public int srcAccessMask() {
            return VkBufferMemoryBarrier.nsrcAccessMask(address());
        }

        @NativeType("VkAccessFlags")
        public int dstAccessMask() {
            return VkBufferMemoryBarrier.ndstAccessMask(address());
        }

        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() {
            return VkBufferMemoryBarrier.nsrcQueueFamilyIndex(address());
        }

        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() {
            return VkBufferMemoryBarrier.ndstQueueFamilyIndex(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkBufferMemoryBarrier.nbuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VkBufferMemoryBarrier.noffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkBufferMemoryBarrier.nsize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferMemoryBarrier.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(44);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferMemoryBarrier.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkExternalMemoryAcquireUnmodifiedEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) {
            VkBufferMemoryBarrier.nsrcAccessMask(address(), value);
            return this;
        }

        public Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) {
            VkBufferMemoryBarrier.ndstAccessMask(address(), value);
            return this;
        }

        public Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkBufferMemoryBarrier.nsrcQueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkBufferMemoryBarrier.ndstQueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBufferMemoryBarrier.nbuffer(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkBufferMemoryBarrier.noffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkBufferMemoryBarrier.nsize(address(), value);
            return this;
        }
    }
}
