package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkImageCopy2;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToImageInfo.class */
public class VkCopyImageToImageInfo extends Struct<VkCopyImageToImageInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int SRCIMAGE;
    public static final int SRCIMAGELAYOUT;
    public static final int DSTIMAGE;
    public static final int DSTIMAGELAYOUT;
    public static final int REGIONCOUNT;
    public static final int PREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(8), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SRCIMAGE = layout.offsetof(3);
        SRCIMAGELAYOUT = layout.offsetof(4);
        DSTIMAGE = layout.offsetof(5);
        DSTIMAGELAYOUT = layout.offsetof(6);
        REGIONCOUNT = layout.offsetof(7);
        PREGIONS = layout.offsetof(8);
    }

    protected VkCopyImageToImageInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyImageToImageInfo create(long address, ByteBuffer container) {
        return new VkCopyImageToImageInfo(address, container);
    }

    public VkCopyImageToImageInfo(ByteBuffer container) {
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

    @NativeType("VkHostImageCopyFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkImage")
    public long srcImage() {
        return nsrcImage(address());
    }

    @NativeType("VkImageLayout")
    public int srcImageLayout() {
        return nsrcImageLayout(address());
    }

    @NativeType("VkImage")
    public long dstImage() {
        return ndstImage(address());
    }

    @NativeType("VkImageLayout")
    public int dstImageLayout() {
        return ndstImageLayout(address());
    }

    @NativeType("uint32_t")
    public int regionCount() {
        return nregionCount(address());
    }

    @NativeType("VkImageCopy2 const *")
    public VkImageCopy2.Buffer pRegions() {
        return npRegions(address());
    }

    public VkCopyImageToImageInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyImageToImageInfo sType$Default() {
        return sType(1000270007);
    }

    public VkCopyImageToImageInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyImageToImageInfo flags(@NativeType("VkHostImageCopyFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkCopyImageToImageInfo srcImage(@NativeType("VkImage") long value) {
        nsrcImage(address(), value);
        return this;
    }

    public VkCopyImageToImageInfo srcImageLayout(@NativeType("VkImageLayout") int value) {
        nsrcImageLayout(address(), value);
        return this;
    }

    public VkCopyImageToImageInfo dstImage(@NativeType("VkImage") long value) {
        ndstImage(address(), value);
        return this;
    }

    public VkCopyImageToImageInfo dstImageLayout(@NativeType("VkImageLayout") int value) {
        ndstImageLayout(address(), value);
        return this;
    }

    public VkCopyImageToImageInfo pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    public VkCopyImageToImageInfo set(int sType, long pNext, int flags, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageCopy2.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);
        return this;
    }

    public VkCopyImageToImageInfo set(VkCopyImageToImageInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyImageToImageInfo malloc() {
        return new VkCopyImageToImageInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyImageToImageInfo calloc() {
        return new VkCopyImageToImageInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyImageToImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageToImageInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyImageToImageInfo create(long address) {
        return new VkCopyImageToImageInfo(address, null);
    }

    public static VkCopyImageToImageInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyImageToImageInfo(address, null);
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

    public static VkCopyImageToImageInfo malloc(MemoryStack stack) {
        return new VkCopyImageToImageInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyImageToImageInfo calloc(MemoryStack stack) {
        return new VkCopyImageToImageInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nsrcImage(long struct) {
        return MemoryUtil.memGetLong(struct + SRCIMAGE);
    }

    public static int nsrcImageLayout(long struct) {
        return MemoryUtil.memGetInt(struct + SRCIMAGELAYOUT);
    }

    public static long ndstImage(long struct) {
        return MemoryUtil.memGetLong(struct + DSTIMAGE);
    }

    public static int ndstImageLayout(long struct) {
        return MemoryUtil.memGetInt(struct + DSTIMAGELAYOUT);
    }

    public static int nregionCount(long struct) {
        return MemoryUtil.memGetInt(struct + REGIONCOUNT);
    }

    public static VkImageCopy2.Buffer npRegions(long struct) {
        return VkImageCopy2.create(MemoryUtil.memGetAddress(struct + PREGIONS), nregionCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nsrcImage(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCIMAGE, value);
    }

    public static void nsrcImageLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCIMAGELAYOUT, value);
    }

    public static void ndstImage(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTIMAGE, value);
    }

    public static void ndstImageLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTIMAGELAYOUT, value);
    }

    public static void nregionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + REGIONCOUNT, value);
    }

    public static void npRegions(long struct, VkImageCopy2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREGIONS, value.address());
        nregionCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PREGIONS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToImageInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyImageToImageInfo, Buffer> implements NativeResource {
        private static final VkCopyImageToImageInfo ELEMENT_FACTORY = VkCopyImageToImageInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyImageToImageInfo.SIZEOF);
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
        public VkCopyImageToImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyImageToImageInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyImageToImageInfo.npNext(address());
        }

        @NativeType("VkHostImageCopyFlags")
        public int flags() {
            return VkCopyImageToImageInfo.nflags(address());
        }

        @NativeType("VkImage")
        public long srcImage() {
            return VkCopyImageToImageInfo.nsrcImage(address());
        }

        @NativeType("VkImageLayout")
        public int srcImageLayout() {
            return VkCopyImageToImageInfo.nsrcImageLayout(address());
        }

        @NativeType("VkImage")
        public long dstImage() {
            return VkCopyImageToImageInfo.ndstImage(address());
        }

        @NativeType("VkImageLayout")
        public int dstImageLayout() {
            return VkCopyImageToImageInfo.ndstImageLayout(address());
        }

        @NativeType("uint32_t")
        public int regionCount() {
            return VkCopyImageToImageInfo.nregionCount(address());
        }

        @NativeType("VkImageCopy2 const *")
        public VkImageCopy2.Buffer pRegions() {
            return VkCopyImageToImageInfo.npRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyImageToImageInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000270007);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyImageToImageInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkHostImageCopyFlags") int value) {
            VkCopyImageToImageInfo.nflags(address(), value);
            return this;
        }

        public Buffer srcImage(@NativeType("VkImage") long value) {
            VkCopyImageToImageInfo.nsrcImage(address(), value);
            return this;
        }

        public Buffer srcImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyImageToImageInfo.nsrcImageLayout(address(), value);
            return this;
        }

        public Buffer dstImage(@NativeType("VkImage") long value) {
            VkCopyImageToImageInfo.ndstImage(address(), value);
            return this;
        }

        public Buffer dstImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyImageToImageInfo.ndstImageLayout(address(), value);
            return this;
        }

        public Buffer pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) {
            VkCopyImageToImageInfo.npRegions(address(), value);
            return this;
        }
    }
}
