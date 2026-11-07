package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265CapabilitiesKHR.class */
public class VkVideoEncodeH265CapabilitiesKHR extends Struct<VkVideoEncodeH265CapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int MAXLEVELIDC;
    public static final int MAXSLICESEGMENTCOUNT;
    public static final int MAXTILES;
    public static final int CTBSIZES;
    public static final int TRANSFORMBLOCKSIZES;
    public static final int MAXPPICTUREL0REFERENCECOUNT;
    public static final int MAXBPICTUREL0REFERENCECOUNT;
    public static final int MAXL1REFERENCECOUNT;
    public static final int MAXSUBLAYERCOUNT;
    public static final int EXPECTDYADICTEMPORALSUBLAYERPATTERN;
    public static final int MINQP;
    public static final int MAXQP;
    public static final int PREFERSGOPREMAININGFRAMES;
    public static final int REQUIRESGOPREMAININGFRAMES;
    public static final int STDSYNTAXFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAXLEVELIDC = layout.offsetof(3);
        MAXSLICESEGMENTCOUNT = layout.offsetof(4);
        MAXTILES = layout.offsetof(5);
        CTBSIZES = layout.offsetof(6);
        TRANSFORMBLOCKSIZES = layout.offsetof(7);
        MAXPPICTUREL0REFERENCECOUNT = layout.offsetof(8);
        MAXBPICTUREL0REFERENCECOUNT = layout.offsetof(9);
        MAXL1REFERENCECOUNT = layout.offsetof(10);
        MAXSUBLAYERCOUNT = layout.offsetof(11);
        EXPECTDYADICTEMPORALSUBLAYERPATTERN = layout.offsetof(12);
        MINQP = layout.offsetof(13);
        MAXQP = layout.offsetof(14);
        PREFERSGOPREMAININGFRAMES = layout.offsetof(15);
        REQUIRESGOPREMAININGFRAMES = layout.offsetof(16);
        STDSYNTAXFLAGS = layout.offsetof(17);
    }

    protected VkVideoEncodeH265CapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265CapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265CapabilitiesKHR(address, container);
    }

    public VkVideoEncodeH265CapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkVideoEncodeH265CapabilityFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH265LevelIdc")
    public int maxLevelIdc() {
        return nmaxLevelIdc(address());
    }

    @NativeType("uint32_t")
    public int maxSliceSegmentCount() {
        return nmaxSliceSegmentCount(address());
    }

    public VkExtent2D maxTiles() {
        return nmaxTiles(address());
    }

    @NativeType("VkVideoEncodeH265CtbSizeFlagsKHR")
    public int ctbSizes() {
        return nctbSizes(address());
    }

    @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsKHR")
    public int transformBlockSizes() {
        return ntransformBlockSizes(address());
    }

    @NativeType("uint32_t")
    public int maxPPictureL0ReferenceCount() {
        return nmaxPPictureL0ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxBPictureL0ReferenceCount() {
        return nmaxBPictureL0ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxL1ReferenceCount() {
        return nmaxL1ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxSubLayerCount() {
        return nmaxSubLayerCount(address());
    }

    @NativeType("VkBool32")
    public boolean expectDyadicTemporalSubLayerPattern() {
        return nexpectDyadicTemporalSubLayerPattern(address()) != 0;
    }

    @NativeType("int32_t")
    public int minQp() {
        return nminQp(address());
    }

    @NativeType("int32_t")
    public int maxQp() {
        return nmaxQp(address());
    }

    @NativeType("VkBool32")
    public boolean prefersGopRemainingFrames() {
        return nprefersGopRemainingFrames(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean requiresGopRemainingFrames() {
        return nrequiresGopRemainingFrames(address()) != 0;
    }

    @NativeType("VkVideoEncodeH265StdFlagsKHR")
    public int stdSyntaxFlags() {
        return nstdSyntaxFlags(address());
    }

    public VkVideoEncodeH265CapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265CapabilitiesKHR sType$Default() {
        return sType(1000039000);
    }

    public VkVideoEncodeH265CapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265CapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeH265CapabilitiesKHR set(VkVideoEncodeH265CapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265CapabilitiesKHR malloc() {
        return new VkVideoEncodeH265CapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265CapabilitiesKHR calloc() {
        return new VkVideoEncodeH265CapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265CapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265CapabilitiesKHR create(long address) {
        return new VkVideoEncodeH265CapabilitiesKHR(address, null);
    }

    public static VkVideoEncodeH265CapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265CapabilitiesKHR(address, null);
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

    public static VkVideoEncodeH265CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxLevelIdc(long struct) {
        return MemoryUtil.memGetInt(struct + MAXLEVELIDC);
    }

    public static int nmaxSliceSegmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSLICESEGMENTCOUNT);
    }

    public static VkExtent2D nmaxTiles(long struct) {
        return VkExtent2D.create(struct + MAXTILES);
    }

    public static int nctbSizes(long struct) {
        return MemoryUtil.memGetInt(struct + CTBSIZES);
    }

    public static int ntransformBlockSizes(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFORMBLOCKSIZES);
    }

    public static int nmaxPPictureL0ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPPICTUREL0REFERENCECOUNT);
    }

    public static int nmaxBPictureL0ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXBPICTUREL0REFERENCECOUNT);
    }

    public static int nmaxL1ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXL1REFERENCECOUNT);
    }

    public static int nmaxSubLayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSUBLAYERCOUNT);
    }

    public static int nexpectDyadicTemporalSubLayerPattern(long struct) {
        return MemoryUtil.memGetInt(struct + EXPECTDYADICTEMPORALSUBLAYERPATTERN);
    }

    public static int nminQp(long struct) {
        return MemoryUtil.memGetInt(struct + MINQP);
    }

    public static int nmaxQp(long struct) {
        return MemoryUtil.memGetInt(struct + MAXQP);
    }

    public static int nprefersGopRemainingFrames(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERSGOPREMAININGFRAMES);
    }

    public static int nrequiresGopRemainingFrames(long struct) {
        return MemoryUtil.memGetInt(struct + REQUIRESGOPREMAININGFRAMES);
    }

    public static int nstdSyntaxFlags(long struct) {
        return MemoryUtil.memGetInt(struct + STDSYNTAXFLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265CapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265CapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265CapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeH265CapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265CapabilitiesKHR.SIZEOF);
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
        public VkVideoEncodeH265CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265CapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeH265CapabilitiesKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeH265CapabilityFlagsKHR")
        public int flags() {
            return VkVideoEncodeH265CapabilitiesKHR.nflags(address());
        }

        @NativeType("StdVideoH265LevelIdc")
        public int maxLevelIdc() {
            return VkVideoEncodeH265CapabilitiesKHR.nmaxLevelIdc(address());
        }

        @NativeType("uint32_t")
        public int maxSliceSegmentCount() {
            return VkVideoEncodeH265CapabilitiesKHR.nmaxSliceSegmentCount(address());
        }

        public VkExtent2D maxTiles() {
            return VkVideoEncodeH265CapabilitiesKHR.nmaxTiles(address());
        }

        @NativeType("VkVideoEncodeH265CtbSizeFlagsKHR")
        public int ctbSizes() {
            return VkVideoEncodeH265CapabilitiesKHR.nctbSizes(address());
        }

        @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsKHR")
        public int transformBlockSizes() {
            return VkVideoEncodeH265CapabilitiesKHR.ntransformBlockSizes(address());
        }

        @NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() {
            return VkVideoEncodeH265CapabilitiesKHR.nmaxPPictureL0ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() {
            return VkVideoEncodeH265CapabilitiesKHR.nmaxBPictureL0ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxL1ReferenceCount() {
            return VkVideoEncodeH265CapabilitiesKHR.nmaxL1ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxSubLayerCount() {
            return VkVideoEncodeH265CapabilitiesKHR.nmaxSubLayerCount(address());
        }

        @NativeType("VkBool32")
        public boolean expectDyadicTemporalSubLayerPattern() {
            return VkVideoEncodeH265CapabilitiesKHR.nexpectDyadicTemporalSubLayerPattern(address()) != 0;
        }

        @NativeType("int32_t")
        public int minQp() {
            return VkVideoEncodeH265CapabilitiesKHR.nminQp(address());
        }

        @NativeType("int32_t")
        public int maxQp() {
            return VkVideoEncodeH265CapabilitiesKHR.nmaxQp(address());
        }

        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() {
            return VkVideoEncodeH265CapabilitiesKHR.nprefersGopRemainingFrames(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() {
            return VkVideoEncodeH265CapabilitiesKHR.nrequiresGopRemainingFrames(address()) != 0;
        }

        @NativeType("VkVideoEncodeH265StdFlagsKHR")
        public int stdSyntaxFlags() {
            return VkVideoEncodeH265CapabilitiesKHR.nstdSyntaxFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265CapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeH265CapabilitiesKHR.npNext(address(), value);
            return this;
        }
    }
}
