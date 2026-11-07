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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageInfo2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageInfo2.class */
public class VkCopyImageInfo2 extends Struct<VkCopyImageInfo2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCIMAGE;
    public static final int SRCIMAGELAYOUT;
    public static final int DSTIMAGE;
    public static final int DSTIMAGELAYOUT;
    public static final int REGIONCOUNT;
    public static final int PREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(8), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCIMAGE = layout.offsetof(2);
        SRCIMAGELAYOUT = layout.offsetof(3);
        DSTIMAGE = layout.offsetof(4);
        DSTIMAGELAYOUT = layout.offsetof(5);
        REGIONCOUNT = layout.offsetof(6);
        PREGIONS = layout.offsetof(7);
    }

    protected VkCopyImageInfo2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyImageInfo2 create(long address, ByteBuffer container) {
        return new VkCopyImageInfo2(address, container);
    }

    public VkCopyImageInfo2(ByteBuffer container) {
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

    public VkCopyImageInfo2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyImageInfo2 sType$Default() {
        return sType(1000337001);
    }

    public VkCopyImageInfo2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyImageInfo2 srcImage(@NativeType("VkImage") long value) {
        nsrcImage(address(), value);
        return this;
    }

    public VkCopyImageInfo2 srcImageLayout(@NativeType("VkImageLayout") int value) {
        nsrcImageLayout(address(), value);
        return this;
    }

    public VkCopyImageInfo2 dstImage(@NativeType("VkImage") long value) {
        ndstImage(address(), value);
        return this;
    }

    public VkCopyImageInfo2 dstImageLayout(@NativeType("VkImageLayout") int value) {
        ndstImageLayout(address(), value);
        return this;
    }

    public VkCopyImageInfo2 pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    public VkCopyImageInfo2 set(int sType, long pNext, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, VkImageCopy2.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);
        return this;
    }

    public VkCopyImageInfo2 set(VkCopyImageInfo2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyImageInfo2 malloc() {
        return new VkCopyImageInfo2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyImageInfo2 calloc() {
        return new VkCopyImageInfo2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyImageInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageInfo2(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyImageInfo2 create(long address) {
        return new VkCopyImageInfo2(address, null);
    }

    public static VkCopyImageInfo2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyImageInfo2(address, null);
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

    public static VkCopyImageInfo2 malloc(MemoryStack stack) {
        return new VkCopyImageInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyImageInfo2 calloc(MemoryStack stack) {
        return new VkCopyImageInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageInfo2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyImageInfo2$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyImageInfo2, Buffer> implements NativeResource {
        private static final VkCopyImageInfo2 ELEMENT_FACTORY = VkCopyImageInfo2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyImageInfo2.SIZEOF);
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
        public VkCopyImageInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyImageInfo2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyImageInfo2.npNext(address());
        }

        @NativeType("VkImage")
        public long srcImage() {
            return VkCopyImageInfo2.nsrcImage(address());
        }

        @NativeType("VkImageLayout")
        public int srcImageLayout() {
            return VkCopyImageInfo2.nsrcImageLayout(address());
        }

        @NativeType("VkImage")
        public long dstImage() {
            return VkCopyImageInfo2.ndstImage(address());
        }

        @NativeType("VkImageLayout")
        public int dstImageLayout() {
            return VkCopyImageInfo2.ndstImageLayout(address());
        }

        @NativeType("uint32_t")
        public int regionCount() {
            return VkCopyImageInfo2.nregionCount(address());
        }

        @NativeType("VkImageCopy2 const *")
        public VkImageCopy2.Buffer pRegions() {
            return VkCopyImageInfo2.npRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyImageInfo2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000337001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyImageInfo2.npNext(address(), value);
            return this;
        }

        public Buffer srcImage(@NativeType("VkImage") long value) {
            VkCopyImageInfo2.nsrcImage(address(), value);
            return this;
        }

        public Buffer srcImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyImageInfo2.nsrcImageLayout(address(), value);
            return this;
        }

        public Buffer dstImage(@NativeType("VkImage") long value) {
            VkCopyImageInfo2.ndstImage(address(), value);
            return this;
        }

        public Buffer dstImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyImageInfo2.ndstImageLayout(address(), value);
            return this;
        }

        public Buffer pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) {
            VkCopyImageInfo2.npRegions(address(), value);
            return this;
        }
    }
}
