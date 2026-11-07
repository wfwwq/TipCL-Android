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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier2.class */
public class VkBufferMemoryBarrier2 extends Struct<VkBufferMemoryBarrier2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCSTAGEMASK;
    public static final int SRCACCESSMASK;
    public static final int DSTSTAGEMASK;
    public static final int DSTACCESSMASK;
    public static final int SRCQUEUEFAMILYINDEX;
    public static final int DSTQUEUEFAMILYINDEX;
    public static final int BUFFER;
    public static final int OFFSET;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(8), __member(4), __member(4), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        SRCACCESSMASK = layout.offsetof(3);
        DSTSTAGEMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
        SRCQUEUEFAMILYINDEX = layout.offsetof(6);
        DSTQUEUEFAMILYINDEX = layout.offsetof(7);
        BUFFER = layout.offsetof(8);
        OFFSET = layout.offsetof(9);
        SIZE = layout.offsetof(10);
    }

    protected VkBufferMemoryBarrier2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferMemoryBarrier2 create(long address, ByteBuffer container) {
        return new VkBufferMemoryBarrier2(address, container);
    }

    public VkBufferMemoryBarrier2(ByteBuffer container) {
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

    @NativeType("VkPipelineStageFlags2")
    public long srcStageMask() {
        return nsrcStageMask(address());
    }

    @NativeType("VkAccessFlags2")
    public long srcAccessMask() {
        return nsrcAccessMask(address());
    }

    @NativeType("VkPipelineStageFlags2")
    public long dstStageMask() {
        return ndstStageMask(address());
    }

    @NativeType("VkAccessFlags2")
    public long dstAccessMask() {
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

    public VkBufferMemoryBarrier2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 sType$Default() {
        return sType(1000314001);
    }

    public VkBufferMemoryBarrier2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 pNext(VkExternalMemoryAcquireUnmodifiedEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferMemoryBarrier2 pNext(VkMemoryBarrierAccessFlags3KHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferMemoryBarrier2 srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        nsrcStageMask(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 srcAccessMask(@NativeType("VkAccessFlags2") long value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        ndstStageMask(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 dstAccessMask(@NativeType("VkAccessFlags2") long value) {
        ndstAccessMask(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
        nsrcQueueFamilyIndex(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
        ndstQueueFamilyIndex(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkBufferMemoryBarrier2 set(int sType, long pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int srcQueueFamilyIndex, int dstQueueFamilyIndex, long buffer, long offset, long size) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        buffer(buffer);
        offset(offset);
        size(size);
        return this;
    }

    public VkBufferMemoryBarrier2 set(VkBufferMemoryBarrier2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferMemoryBarrier2 malloc() {
        return new VkBufferMemoryBarrier2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferMemoryBarrier2 calloc() {
        return new VkBufferMemoryBarrier2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferMemoryBarrier2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferMemoryBarrier2(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferMemoryBarrier2 create(long address) {
        return new VkBufferMemoryBarrier2(address, null);
    }

    public static VkBufferMemoryBarrier2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferMemoryBarrier2(address, null);
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

    public static VkBufferMemoryBarrier2 malloc(MemoryStack stack) {
        return new VkBufferMemoryBarrier2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferMemoryBarrier2 calloc(MemoryStack stack) {
        return new VkBufferMemoryBarrier2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsrcStageMask(long struct) {
        return MemoryUtil.memGetLong(struct + SRCSTAGEMASK);
    }

    public static long nsrcAccessMask(long struct) {
        return MemoryUtil.memGetLong(struct + SRCACCESSMASK);
    }

    public static long ndstStageMask(long struct) {
        return MemoryUtil.memGetLong(struct + DSTSTAGEMASK);
    }

    public static long ndstAccessMask(long struct) {
        return MemoryUtil.memGetLong(struct + DSTACCESSMASK);
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

    public static void nsrcStageMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCSTAGEMASK, value);
    }

    public static void nsrcAccessMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCACCESSMASK, value);
    }

    public static void ndstStageMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTSTAGEMASK, value);
    }

    public static void ndstAccessMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTACCESSMASK, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryBarrier2$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferMemoryBarrier2, Buffer> implements NativeResource {
        private static final VkBufferMemoryBarrier2 ELEMENT_FACTORY = VkBufferMemoryBarrier2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferMemoryBarrier2.SIZEOF);
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
        public VkBufferMemoryBarrier2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferMemoryBarrier2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferMemoryBarrier2.npNext(address());
        }

        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() {
            return VkBufferMemoryBarrier2.nsrcStageMask(address());
        }

        @NativeType("VkAccessFlags2")
        public long srcAccessMask() {
            return VkBufferMemoryBarrier2.nsrcAccessMask(address());
        }

        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() {
            return VkBufferMemoryBarrier2.ndstStageMask(address());
        }

        @NativeType("VkAccessFlags2")
        public long dstAccessMask() {
            return VkBufferMemoryBarrier2.ndstAccessMask(address());
        }

        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() {
            return VkBufferMemoryBarrier2.nsrcQueueFamilyIndex(address());
        }

        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() {
            return VkBufferMemoryBarrier2.ndstQueueFamilyIndex(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkBufferMemoryBarrier2.nbuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VkBufferMemoryBarrier2.noffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkBufferMemoryBarrier2.nsize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferMemoryBarrier2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000314001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferMemoryBarrier2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkExternalMemoryAcquireUnmodifiedEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryBarrierAccessFlags3KHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkBufferMemoryBarrier2.nsrcStageMask(address(), value);
            return this;
        }

        public Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkBufferMemoryBarrier2.nsrcAccessMask(address(), value);
            return this;
        }

        public Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkBufferMemoryBarrier2.ndstStageMask(address(), value);
            return this;
        }

        public Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkBufferMemoryBarrier2.ndstAccessMask(address(), value);
            return this;
        }

        public Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkBufferMemoryBarrier2.nsrcQueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkBufferMemoryBarrier2.ndstQueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBufferMemoryBarrier2.nbuffer(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkBufferMemoryBarrier2.noffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkBufferMemoryBarrier2.nsize(address(), value);
            return this;
        }
    }
}
