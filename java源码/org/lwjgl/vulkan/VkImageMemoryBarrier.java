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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier.class */
public class VkImageMemoryBarrier extends Struct<VkImageMemoryBarrier> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCACCESSMASK;
    public static final int DSTACCESSMASK;
    public static final int OLDLAYOUT;
    public static final int NEWLAYOUT;
    public static final int SRCQUEUEFAMILYINDEX;
    public static final int DSTQUEUEFAMILYINDEX;
    public static final int IMAGE;
    public static final int SUBRESOURCERANGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(8), __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCACCESSMASK = layout.offsetof(2);
        DSTACCESSMASK = layout.offsetof(3);
        OLDLAYOUT = layout.offsetof(4);
        NEWLAYOUT = layout.offsetof(5);
        SRCQUEUEFAMILYINDEX = layout.offsetof(6);
        DSTQUEUEFAMILYINDEX = layout.offsetof(7);
        IMAGE = layout.offsetof(8);
        SUBRESOURCERANGE = layout.offsetof(9);
    }

    protected VkImageMemoryBarrier(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageMemoryBarrier create(long address, ByteBuffer container) {
        return new VkImageMemoryBarrier(address, container);
    }

    public VkImageMemoryBarrier(ByteBuffer container) {
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

    public VkImageMemoryBarrier sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageMemoryBarrier sType$Default() {
        return sType(45);
    }

    public VkImageMemoryBarrier pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageMemoryBarrier pNext(VkExternalMemoryAcquireUnmodifiedEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageMemoryBarrier pNext(VkSampleLocationsInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageMemoryBarrier srcAccessMask(@NativeType("VkAccessFlags") int value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    public VkImageMemoryBarrier dstAccessMask(@NativeType("VkAccessFlags") int value) {
        ndstAccessMask(address(), value);
        return this;
    }

    public VkImageMemoryBarrier oldLayout(@NativeType("VkImageLayout") int value) {
        noldLayout(address(), value);
        return this;
    }

    public VkImageMemoryBarrier newLayout(@NativeType("VkImageLayout") int value) {
        nnewLayout(address(), value);
        return this;
    }

    public VkImageMemoryBarrier srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
        nsrcQueueFamilyIndex(address(), value);
        return this;
    }

    public VkImageMemoryBarrier dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
        ndstQueueFamilyIndex(address(), value);
        return this;
    }

    public VkImageMemoryBarrier image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkImageMemoryBarrier subresourceRange(VkImageSubresourceRange value) {
        nsubresourceRange(address(), value);
        return this;
    }

    public VkImageMemoryBarrier subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
        consumer.accept(subresourceRange());
        return this;
    }

    public VkImageMemoryBarrier set(int sType, long pNext, int srcAccessMask, int dstAccessMask, int oldLayout, int newLayout, int srcQueueFamilyIndex, int dstQueueFamilyIndex, long image, VkImageSubresourceRange subresourceRange) {
        sType(sType);
        pNext(pNext);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        oldLayout(oldLayout);
        newLayout(newLayout);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        image(image);
        subresourceRange(subresourceRange);
        return this;
    }

    public VkImageMemoryBarrier set(VkImageMemoryBarrier src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageMemoryBarrier malloc() {
        return new VkImageMemoryBarrier(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageMemoryBarrier calloc() {
        return new VkImageMemoryBarrier(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageMemoryBarrier create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageMemoryBarrier(MemoryUtil.memAddress(container), container);
    }

    public static VkImageMemoryBarrier create(long address) {
        return new VkImageMemoryBarrier(address, null);
    }

    public static VkImageMemoryBarrier createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageMemoryBarrier(address, null);
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

    public static VkImageMemoryBarrier malloc(MemoryStack stack) {
        return new VkImageMemoryBarrier(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageMemoryBarrier calloc(MemoryStack stack) {
        return new VkImageMemoryBarrier(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsrcAccessMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCACCESSMASK, value);
    }

    public static void ndstAccessMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTACCESSMASK, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryBarrier$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageMemoryBarrier, Buffer> implements NativeResource {
        private static final VkImageMemoryBarrier ELEMENT_FACTORY = VkImageMemoryBarrier.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageMemoryBarrier.SIZEOF);
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
        public VkImageMemoryBarrier getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageMemoryBarrier.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageMemoryBarrier.npNext(address());
        }

        @NativeType("VkAccessFlags")
        public int srcAccessMask() {
            return VkImageMemoryBarrier.nsrcAccessMask(address());
        }

        @NativeType("VkAccessFlags")
        public int dstAccessMask() {
            return VkImageMemoryBarrier.ndstAccessMask(address());
        }

        @NativeType("VkImageLayout")
        public int oldLayout() {
            return VkImageMemoryBarrier.noldLayout(address());
        }

        @NativeType("VkImageLayout")
        public int newLayout() {
            return VkImageMemoryBarrier.nnewLayout(address());
        }

        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() {
            return VkImageMemoryBarrier.nsrcQueueFamilyIndex(address());
        }

        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() {
            return VkImageMemoryBarrier.ndstQueueFamilyIndex(address());
        }

        @NativeType("VkImage")
        public long image() {
            return VkImageMemoryBarrier.nimage(address());
        }

        public VkImageSubresourceRange subresourceRange() {
            return VkImageMemoryBarrier.nsubresourceRange(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageMemoryBarrier.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(45);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageMemoryBarrier.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkExternalMemoryAcquireUnmodifiedEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSampleLocationsInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) {
            VkImageMemoryBarrier.nsrcAccessMask(address(), value);
            return this;
        }

        public Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) {
            VkImageMemoryBarrier.ndstAccessMask(address(), value);
            return this;
        }

        public Buffer oldLayout(@NativeType("VkImageLayout") int value) {
            VkImageMemoryBarrier.noldLayout(address(), value);
            return this;
        }

        public Buffer newLayout(@NativeType("VkImageLayout") int value) {
            VkImageMemoryBarrier.nnewLayout(address(), value);
            return this;
        }

        public Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkImageMemoryBarrier.nsrcQueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkImageMemoryBarrier.ndstQueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkImageMemoryBarrier.nimage(address(), value);
            return this;
        }

        public Buffer subresourceRange(VkImageSubresourceRange value) {
            VkImageMemoryBarrier.nsubresourceRange(address(), value);
            return this;
        }

        public Buffer subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
            consumer.accept(subresourceRange());
            return this;
        }
    }
}
