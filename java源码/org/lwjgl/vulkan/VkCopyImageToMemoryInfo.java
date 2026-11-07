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
import org.lwjgl.vulkan.VkImageToMemoryCopy;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfo.class */
public class VkCopyImageToMemoryInfo extends Struct<VkCopyImageToMemoryInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int SRCIMAGE;
    public static final int SRCIMAGELAYOUT;
    public static final int REGIONCOUNT;
    public static final int PREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SRCIMAGE = layout.offsetof(3);
        SRCIMAGELAYOUT = layout.offsetof(4);
        REGIONCOUNT = layout.offsetof(5);
        PREGIONS = layout.offsetof(6);
    }

    protected VkCopyImageToMemoryInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyImageToMemoryInfo create(long address, ByteBuffer container) {
        return new VkCopyImageToMemoryInfo(address, container);
    }

    public VkCopyImageToMemoryInfo(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int regionCount() {
        return nregionCount(address());
    }

    @NativeType("VkImageToMemoryCopy const *")
    public VkImageToMemoryCopy.Buffer pRegions() {
        return npRegions(address());
    }

    public VkCopyImageToMemoryInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyImageToMemoryInfo sType$Default() {
        return sType(1000270004);
    }

    public VkCopyImageToMemoryInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyImageToMemoryInfo flags(@NativeType("VkHostImageCopyFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkCopyImageToMemoryInfo srcImage(@NativeType("VkImage") long value) {
        nsrcImage(address(), value);
        return this;
    }

    public VkCopyImageToMemoryInfo srcImageLayout(@NativeType("VkImageLayout") int value) {
        nsrcImageLayout(address(), value);
        return this;
    }

    public VkCopyImageToMemoryInfo pRegions(@NativeType("VkImageToMemoryCopy const *") VkImageToMemoryCopy.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    public VkCopyImageToMemoryInfo set(int sType, long pNext, int flags, long srcImage, int srcImageLayout, VkImageToMemoryCopy.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        pRegions(pRegions);
        return this;
    }

    public VkCopyImageToMemoryInfo set(VkCopyImageToMemoryInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyImageToMemoryInfo malloc() {
        return new VkCopyImageToMemoryInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyImageToMemoryInfo calloc() {
        return new VkCopyImageToMemoryInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyImageToMemoryInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageToMemoryInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyImageToMemoryInfo create(long address) {
        return new VkCopyImageToMemoryInfo(address, null);
    }

    public static VkCopyImageToMemoryInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyImageToMemoryInfo(address, null);
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

    public static VkCopyImageToMemoryInfo malloc(MemoryStack stack) {
        return new VkCopyImageToMemoryInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyImageToMemoryInfo calloc(MemoryStack stack) {
        return new VkCopyImageToMemoryInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nregionCount(long struct) {
        return MemoryUtil.memGetInt(struct + REGIONCOUNT);
    }

    public static VkImageToMemoryCopy.Buffer npRegions(long struct) {
        return VkImageToMemoryCopy.create(MemoryUtil.memGetAddress(struct + PREGIONS), nregionCount(struct));
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

    public static void nregionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + REGIONCOUNT, value);
    }

    public static void npRegions(long struct, VkImageToMemoryCopy.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREGIONS, value.address());
        nregionCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        int regionCount = nregionCount(struct);
        long pRegions = MemoryUtil.memGetAddress(struct + PREGIONS);
        Checks.check(pRegions);
        validate(pRegions, regionCount, VkImageToMemoryCopy.SIZEOF, VkImageToMemoryCopy::validate);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyImageToMemoryInfo, Buffer> implements NativeResource {
        private static final VkCopyImageToMemoryInfo ELEMENT_FACTORY = VkCopyImageToMemoryInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyImageToMemoryInfo.SIZEOF);
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
        public VkCopyImageToMemoryInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyImageToMemoryInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyImageToMemoryInfo.npNext(address());
        }

        @NativeType("VkHostImageCopyFlags")
        public int flags() {
            return VkCopyImageToMemoryInfo.nflags(address());
        }

        @NativeType("VkImage")
        public long srcImage() {
            return VkCopyImageToMemoryInfo.nsrcImage(address());
        }

        @NativeType("VkImageLayout")
        public int srcImageLayout() {
            return VkCopyImageToMemoryInfo.nsrcImageLayout(address());
        }

        @NativeType("uint32_t")
        public int regionCount() {
            return VkCopyImageToMemoryInfo.nregionCount(address());
        }

        @NativeType("VkImageToMemoryCopy const *")
        public VkImageToMemoryCopy.Buffer pRegions() {
            return VkCopyImageToMemoryInfo.npRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyImageToMemoryInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000270004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyImageToMemoryInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkHostImageCopyFlags") int value) {
            VkCopyImageToMemoryInfo.nflags(address(), value);
            return this;
        }

        public Buffer srcImage(@NativeType("VkImage") long value) {
            VkCopyImageToMemoryInfo.nsrcImage(address(), value);
            return this;
        }

        public Buffer srcImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyImageToMemoryInfo.nsrcImageLayout(address(), value);
            return this;
        }

        public Buffer pRegions(@NativeType("VkImageToMemoryCopy const *") VkImageToMemoryCopy.Buffer value) {
            VkCopyImageToMemoryInfo.npRegions(address(), value);
            return this;
        }
    }
}
