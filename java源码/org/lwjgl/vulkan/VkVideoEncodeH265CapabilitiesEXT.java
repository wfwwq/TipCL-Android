package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265CapabilitiesEXT.class */
public class VkVideoEncodeH265CapabilitiesEXT extends Struct<VkVideoEncodeH265CapabilitiesEXT> implements NativeResource {
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

    protected VkVideoEncodeH265CapabilitiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265CapabilitiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265CapabilitiesEXT(address, container);
    }

    public VkVideoEncodeH265CapabilitiesEXT(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
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

    @NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
    public int ctbSizes() {
        return nctbSizes(address());
    }

    @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT")
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

    @NativeType("VkVideoEncodeH265StdFlagsEXT")
    public int stdSyntaxFlags() {
        return nstdSyntaxFlags(address());
    }

    public VkVideoEncodeH265CapabilitiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265CapabilitiesEXT sType$Default() {
        return sType(1000039000);
    }

    public VkVideoEncodeH265CapabilitiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265CapabilitiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeH265CapabilitiesEXT set(VkVideoEncodeH265CapabilitiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265CapabilitiesEXT malloc() {
        return new VkVideoEncodeH265CapabilitiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265CapabilitiesEXT calloc() {
        return new VkVideoEncodeH265CapabilitiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265CapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265CapabilitiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265CapabilitiesEXT create(long address) {
        return new VkVideoEncodeH265CapabilitiesEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265CapabilitiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265CapabilitiesEXT(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkVideoEncodeH265CapabilitiesEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265CapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265CapabilitiesEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265CapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return UNSAFE.getInt((Object) null, struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nflags(long struct) {
        return UNSAFE.getInt((Object) null, struct + FLAGS);
    }

    public static int nmaxLevelIdc(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXLEVELIDC);
    }

    public static int nmaxSliceSegmentCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXSLICESEGMENTCOUNT);
    }

    public static VkExtent2D nmaxTiles(long struct) {
        return VkExtent2D.create(struct + MAXTILES);
    }

    public static int nctbSizes(long struct) {
        return UNSAFE.getInt((Object) null, struct + CTBSIZES);
    }

    public static int ntransformBlockSizes(long struct) {
        return UNSAFE.getInt((Object) null, struct + TRANSFORMBLOCKSIZES);
    }

    public static int nmaxPPictureL0ReferenceCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXPPICTUREL0REFERENCECOUNT);
    }

    public static int nmaxBPictureL0ReferenceCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXBPICTUREL0REFERENCECOUNT);
    }

    public static int nmaxL1ReferenceCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXL1REFERENCECOUNT);
    }

    public static int nmaxSubLayerCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXSUBLAYERCOUNT);
    }

    public static int nexpectDyadicTemporalSubLayerPattern(long struct) {
        return UNSAFE.getInt((Object) null, struct + EXPECTDYADICTEMPORALSUBLAYERPATTERN);
    }

    public static int nminQp(long struct) {
        return UNSAFE.getInt((Object) null, struct + MINQP);
    }

    public static int nmaxQp(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXQP);
    }

    public static int nprefersGopRemainingFrames(long struct) {
        return UNSAFE.getInt((Object) null, struct + PREFERSGOPREMAININGFRAMES);
    }

    public static int nrequiresGopRemainingFrames(long struct) {
        return UNSAFE.getInt((Object) null, struct + REQUIRESGOPREMAININGFRAMES);
    }

    public static int nstdSyntaxFlags(long struct) {
        return UNSAFE.getInt((Object) null, struct + STDSYNTAXFLAGS);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265CapabilitiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265CapabilitiesEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265CapabilitiesEXT ELEMENT_FACTORY = VkVideoEncodeH265CapabilitiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265CapabilitiesEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkVideoEncodeH265CapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265CapabilitiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeH265CapabilitiesEXT.npNext(address());
        }

        @NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
        public int flags() {
            return VkVideoEncodeH265CapabilitiesEXT.nflags(address());
        }

        @NativeType("StdVideoH265LevelIdc")
        public int maxLevelIdc() {
            return VkVideoEncodeH265CapabilitiesEXT.nmaxLevelIdc(address());
        }

        @NativeType("uint32_t")
        public int maxSliceSegmentCount() {
            return VkVideoEncodeH265CapabilitiesEXT.nmaxSliceSegmentCount(address());
        }

        public VkExtent2D maxTiles() {
            return VkVideoEncodeH265CapabilitiesEXT.nmaxTiles(address());
        }

        @NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
        public int ctbSizes() {
            return VkVideoEncodeH265CapabilitiesEXT.nctbSizes(address());
        }

        @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT")
        public int transformBlockSizes() {
            return VkVideoEncodeH265CapabilitiesEXT.ntransformBlockSizes(address());
        }

        @NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() {
            return VkVideoEncodeH265CapabilitiesEXT.nmaxPPictureL0ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() {
            return VkVideoEncodeH265CapabilitiesEXT.nmaxBPictureL0ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxL1ReferenceCount() {
            return VkVideoEncodeH265CapabilitiesEXT.nmaxL1ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxSubLayerCount() {
            return VkVideoEncodeH265CapabilitiesEXT.nmaxSubLayerCount(address());
        }

        @NativeType("VkBool32")
        public boolean expectDyadicTemporalSubLayerPattern() {
            return VkVideoEncodeH265CapabilitiesEXT.nexpectDyadicTemporalSubLayerPattern(address()) != 0;
        }

        @NativeType("int32_t")
        public int minQp() {
            return VkVideoEncodeH265CapabilitiesEXT.nminQp(address());
        }

        @NativeType("int32_t")
        public int maxQp() {
            return VkVideoEncodeH265CapabilitiesEXT.nmaxQp(address());
        }

        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() {
            return VkVideoEncodeH265CapabilitiesEXT.nprefersGopRemainingFrames(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() {
            return VkVideoEncodeH265CapabilitiesEXT.nrequiresGopRemainingFrames(address()) != 0;
        }

        @NativeType("VkVideoEncodeH265StdFlagsEXT")
        public int stdSyntaxFlags() {
            return VkVideoEncodeH265CapabilitiesEXT.nstdSyntaxFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265CapabilitiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeH265CapabilitiesEXT.npNext(address(), value);
            return this;
        }
    }
}
