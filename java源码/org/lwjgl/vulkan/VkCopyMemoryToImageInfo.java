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
import org.lwjgl.vulkan.VkMemoryToImageCopy;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageInfo.class */
public class VkCopyMemoryToImageInfo extends Struct<VkCopyMemoryToImageInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DSTIMAGE;
    public static final int DSTIMAGELAYOUT;
    public static final int REGIONCOUNT;
    public static final int PREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DSTIMAGE = layout.offsetof(3);
        DSTIMAGELAYOUT = layout.offsetof(4);
        REGIONCOUNT = layout.offsetof(5);
        PREGIONS = layout.offsetof(6);
    }

    protected VkCopyMemoryToImageInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyMemoryToImageInfo create(long address, ByteBuffer container) {
        return new VkCopyMemoryToImageInfo(address, container);
    }

    public VkCopyMemoryToImageInfo(ByteBuffer container) {
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

    @NativeType("VkMemoryToImageCopy const *")
    public VkMemoryToImageCopy.Buffer pRegions() {
        return npRegions(address());
    }

    public VkCopyMemoryToImageInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyMemoryToImageInfo sType$Default() {
        return sType(1000270005);
    }

    public VkCopyMemoryToImageInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyMemoryToImageInfo flags(@NativeType("VkHostImageCopyFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkCopyMemoryToImageInfo dstImage(@NativeType("VkImage") long value) {
        ndstImage(address(), value);
        return this;
    }

    public VkCopyMemoryToImageInfo dstImageLayout(@NativeType("VkImageLayout") int value) {
        ndstImageLayout(address(), value);
        return this;
    }

    public VkCopyMemoryToImageInfo pRegions(@NativeType("VkMemoryToImageCopy const *") VkMemoryToImageCopy.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    public VkCopyMemoryToImageInfo set(int sType, long pNext, int flags, long dstImage, int dstImageLayout, VkMemoryToImageCopy.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);
        return this;
    }

    public VkCopyMemoryToImageInfo set(VkCopyMemoryToImageInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyMemoryToImageInfo malloc() {
        return new VkCopyMemoryToImageInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyMemoryToImageInfo calloc() {
        return new VkCopyMemoryToImageInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyMemoryToImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyMemoryToImageInfo create(long address) {
        return new VkCopyMemoryToImageInfo(address, null);
    }

    public static VkCopyMemoryToImageInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyMemoryToImageInfo(address, null);
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

    public static VkCopyMemoryToImageInfo malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyMemoryToImageInfo calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndstImage(long struct) {
        return MemoryUtil.memGetLong(struct + DSTIMAGE);
    }

    public static int ndstImageLayout(long struct) {
        return MemoryUtil.memGetInt(struct + DSTIMAGELAYOUT);
    }

    public static int nregionCount(long struct) {
        return MemoryUtil.memGetInt(struct + REGIONCOUNT);
    }

    public static VkMemoryToImageCopy.Buffer npRegions(long struct) {
        return VkMemoryToImageCopy.create(MemoryUtil.memGetAddress(struct + PREGIONS), nregionCount(struct));
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

    public static void ndstImage(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTIMAGE, value);
    }

    public static void ndstImageLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTIMAGELAYOUT, value);
    }

    public static void nregionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + REGIONCOUNT, value);
    }

    public static void npRegions(long struct, VkMemoryToImageCopy.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREGIONS, value.address());
        nregionCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        int regionCount = nregionCount(struct);
        long pRegions = MemoryUtil.memGetAddress(struct + PREGIONS);
        Checks.check(pRegions);
        validate(pRegions, regionCount, VkMemoryToImageCopy.SIZEOF, VkMemoryToImageCopy::validate);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyMemoryToImageInfo, Buffer> implements NativeResource {
        private static final VkCopyMemoryToImageInfo ELEMENT_FACTORY = VkCopyMemoryToImageInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyMemoryToImageInfo.SIZEOF);
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
        public VkCopyMemoryToImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyMemoryToImageInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyMemoryToImageInfo.npNext(address());
        }

        @NativeType("VkHostImageCopyFlags")
        public int flags() {
            return VkCopyMemoryToImageInfo.nflags(address());
        }

        @NativeType("VkImage")
        public long dstImage() {
            return VkCopyMemoryToImageInfo.ndstImage(address());
        }

        @NativeType("VkImageLayout")
        public int dstImageLayout() {
            return VkCopyMemoryToImageInfo.ndstImageLayout(address());
        }

        @NativeType("uint32_t")
        public int regionCount() {
            return VkCopyMemoryToImageInfo.nregionCount(address());
        }

        @NativeType("VkMemoryToImageCopy const *")
        public VkMemoryToImageCopy.Buffer pRegions() {
            return VkCopyMemoryToImageInfo.npRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyMemoryToImageInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000270005);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyMemoryToImageInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkHostImageCopyFlags") int value) {
            VkCopyMemoryToImageInfo.nflags(address(), value);
            return this;
        }

        public Buffer dstImage(@NativeType("VkImage") long value) {
            VkCopyMemoryToImageInfo.ndstImage(address(), value);
            return this;
        }

        public Buffer dstImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyMemoryToImageInfo.ndstImageLayout(address(), value);
            return this;
        }

        public Buffer pRegions(@NativeType("VkMemoryToImageCopy const *") VkMemoryToImageCopy.Buffer value) {
            VkCopyMemoryToImageInfo.npRegions(address(), value);
            return this;
        }
    }
}
