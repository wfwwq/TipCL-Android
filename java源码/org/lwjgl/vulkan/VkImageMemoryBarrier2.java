package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2.class */
public class VkImageMemoryBarrier2 extends Struct<VkImageMemoryBarrier2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCSTAGEMASK;
    public static final int SRCACCESSMASK;
    public static final int DSTSTAGEMASK;
    public static final int DSTACCESSMASK;
    public static final int OLDLAYOUT;
    public static final int NEWLAYOUT;
    public static final int SRCQUEUEFAMILYINDEX;
    public static final int DSTQUEUEFAMILYINDEX;
    public static final int IMAGE;
    public static final int SUBRESOURCERANGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(8), __member(4), __member(4), __member(4), __member(4), __member(8), __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        SRCACCESSMASK = layout.offsetof(3);
        DSTSTAGEMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
        OLDLAYOUT = layout.offsetof(6);
        NEWLAYOUT = layout.offsetof(7);
        SRCQUEUEFAMILYINDEX = layout.offsetof(8);
        DSTQUEUEFAMILYINDEX = layout.offsetof(9);
        IMAGE = layout.offsetof(10);
        SUBRESOURCERANGE = layout.offsetof(11);
    }

    protected VkImageMemoryBarrier2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageMemoryBarrier2 create(long address, ByteBuffer container) {
        return new VkImageMemoryBarrier2(address, container);
    }

    public VkImageMemoryBarrier2(ByteBuffer container) {
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

    @NativeType("VkImageLayout")
    public int oldLayout() {
        return noldLayout(address());
    }

    @NativeType("VkImageLayout")
    public int newLayout() {
        return nnewLayout(address());
    }

    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() {
        return nsrcQueueFamilyIndex(address());
    }

    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() {
        return ndstQueueFamilyIndex(address());
    }

    @NativeType("VkImage")
    public long image() {
        return nimage(address());
    }

    public VkImageSubresourceRange subresourceRange() {
        return nsubresourceRange(address());
    }

    public VkImageMemoryBarrier2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 sType$Default() {
        return sType(1000314002);
    }

    public VkImageMemoryBarrier2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 pNext(VkExternalMemoryAcquireUnmodifiedEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageMemoryBarrier2 pNext(VkMemoryBarrierAccessFlags3KHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageMemoryBarrier2 pNext(VkSampleLocationsInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageMemoryBarrier2 srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        nsrcStageMask(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 srcAccessMask(@NativeType("VkAccessFlags2") long value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        ndstStageMask(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 dstAccessMask(@NativeType("VkAccessFlags2") long value) {
        ndstAccessMask(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 oldLayout(@NativeType("VkImageLayout") int value) {
        noldLayout(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 newLayout(@NativeType("VkImageLayout") int value) {
        nnewLayout(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
        nsrcQueueFamilyIndex(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
        ndstQueueFamilyIndex(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 subresourceRange(VkImageSubresourceRange value) {
        nsubresourceRange(address(), value);
        return this;
    }

    public VkImageMemoryBarrier2 subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
        consumer.accept(subresourceRange());
        return this;
    }

    public VkImageMemoryBarrier2 set(int sType, long pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int oldLayout, int newLayout, int srcQueueFamilyIndex, int dstQueueFamilyIndex, long image, VkImageSubresourceRange subresourceRange) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        oldLayout(oldLayout);
        newLayout(newLayout);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        image(image);
        subresourceRange(subresourceRange);
        return this;
    }

    public VkImageMemoryBarrier2 set(VkImageMemoryBarrier2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageMemoryBarrier2 malloc() {
        return new VkImageMemoryBarrier2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageMemoryBarrier2 calloc() {
        return new VkImageMemoryBarrier2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageMemoryBarrier2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageMemoryBarrier2(MemoryUtil.memAddress(container), container);
    }

    public static VkImageMemoryBarrier2 create(long address) {
        return new VkImageMemoryBarrier2(address, null);
    }

    public static VkImageMemoryBarrier2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageMemoryBarrier2(address, null);
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

    public static VkImageMemoryBarrier2 malloc(MemoryStack stack) {
        return new VkImageMemoryBarrier2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageMemoryBarrier2 calloc(MemoryStack stack) {
        return new VkImageMemoryBarrier2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int noldLayout(long struct) {
        return MemoryUtil.memGetInt(struct + OLDLAYOUT);
    }

    public static int nnewLayout(long struct) {
        return MemoryUtil.memGetInt(struct + NEWLAYOUT);
    }

    public static int nsrcQueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + SRCQUEUEFAMILYINDEX);
    }

    public static int ndstQueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + DSTQUEUEFAMILYINDEX);
    }

    public static long nimage(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGE);
    }

    public static VkImageSubresourceRange nsubresourceRange(long struct) {
        return VkImageSubresourceRange.create(struct + SUBRESOURCERANGE);
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

    public static void noldLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + OLDLAYOUT, value);
    }

    public static void nnewLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + NEWLAYOUT, value);
    }

    public static void nsrcQueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCQUEUEFAMILYINDEX, value);
    }

    public static void ndstQueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTQUEUEFAMILYINDEX, value);
    }

    public static void nimage(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGE, value);
    }

    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) {
        MemoryUtil.memCopy(value.address(), struct + SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageMemoryBarrier2, Buffer> implements NativeResource {
        private static final VkImageMemoryBarrier2 ELEMENT_FACTORY = VkImageMemoryBarrier2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageMemoryBarrier2.SIZEOF);
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
        public VkImageMemoryBarrier2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageMemoryBarrier2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageMemoryBarrier2.npNext(address());
        }

        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() {
            return VkImageMemoryBarrier2.nsrcStageMask(address());
        }

        @NativeType("VkAccessFlags2")
        public long srcAccessMask() {
            return VkImageMemoryBarrier2.nsrcAccessMask(address());
        }

        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() {
            return VkImageMemoryBarrier2.ndstStageMask(address());
        }

        @NativeType("VkAccessFlags2")
        public long dstAccessMask() {
            return VkImageMemoryBarrier2.ndstAccessMask(address());
        }

        @NativeType("VkImageLayout")
        public int oldLayout() {
            return VkImageMemoryBarrier2.noldLayout(address());
        }

        @NativeType("VkImageLayout")
        public int newLayout() {
            return VkImageMemoryBarrier2.nnewLayout(address());
        }

        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() {
            return VkImageMemoryBarrier2.nsrcQueueFamilyIndex(address());
        }

        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() {
            return VkImageMemoryBarrier2.ndstQueueFamilyIndex(address());
        }

        @NativeType("VkImage")
        public long image() {
            return VkImageMemoryBarrier2.nimage(address());
        }

        public VkImageSubresourceRange subresourceRange() {
            return VkImageMemoryBarrier2.nsubresourceRange(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageMemoryBarrier2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000314002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageMemoryBarrier2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkExternalMemoryAcquireUnmodifiedEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryBarrierAccessFlags3KHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSampleLocationsInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkImageMemoryBarrier2.nsrcStageMask(address(), value);
            return this;
        }

        public Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkImageMemoryBarrier2.nsrcAccessMask(address(), value);
            return this;
        }

        public Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkImageMemoryBarrier2.ndstStageMask(address(), value);
            return this;
        }

        public Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkImageMemoryBarrier2.ndstAccessMask(address(), value);
            return this;
        }

        public Buffer oldLayout(@NativeType("VkImageLayout") int value) {
            VkImageMemoryBarrier2.noldLayout(address(), value);
            return this;
        }

        public Buffer newLayout(@NativeType("VkImageLayout") int value) {
            VkImageMemoryBarrier2.nnewLayout(address(), value);
            return this;
        }

        public Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkImageMemoryBarrier2.nsrcQueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkImageMemoryBarrier2.ndstQueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkImageMemoryBarrier2.nimage(address(), value);
            return this;
        }

        public Buffer subresourceRange(VkImageSubresourceRange value) {
            VkImageMemoryBarrier2.nsubresourceRange(address(), value);
            return this;
        }

        public Buffer subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
            consumer.accept(subresourceRange());
            return this;
        }
    }
}
