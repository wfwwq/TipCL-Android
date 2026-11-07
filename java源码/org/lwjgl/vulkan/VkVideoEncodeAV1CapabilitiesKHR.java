package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1CapabilitiesKHR.class */
public class VkVideoEncodeAV1CapabilitiesKHR extends Struct<VkVideoEncodeAV1CapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int MAXLEVEL;
    public static final int CODEDPICTUREALIGNMENT;
    public static final int MAXTILES;
    public static final int MINTILESIZE;
    public static final int MAXTILESIZE;
    public static final int SUPERBLOCKSIZES;
    public static final int MAXSINGLEREFERENCECOUNT;
    public static final int SINGLEREFERENCENAMEMASK;
    public static final int MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT;
    public static final int MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT;
    public static final int UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK;
    public static final int MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT;
    public static final int MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT;
    public static final int MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT;
    public static final int BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK;
    public static final int MAXTEMPORALLAYERCOUNT;
    public static final int MAXSPATIALLAYERCOUNT;
    public static final int MAXOPERATINGPOINTS;
    public static final int MINQINDEX;
    public static final int MAXQINDEX;
    public static final int PREFERSGOPREMAININGFRAMES;
    public static final int REQUIRESGOPREMAININGFRAMES;
    public static final int STDSYNTAXFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAXLEVEL = layout.offsetof(3);
        CODEDPICTUREALIGNMENT = layout.offsetof(4);
        MAXTILES = layout.offsetof(5);
        MINTILESIZE = layout.offsetof(6);
        MAXTILESIZE = layout.offsetof(7);
        SUPERBLOCKSIZES = layout.offsetof(8);
        MAXSINGLEREFERENCECOUNT = layout.offsetof(9);
        SINGLEREFERENCENAMEMASK = layout.offsetof(10);
        MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT = layout.offsetof(11);
        MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = layout.offsetof(12);
        UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = layout.offsetof(13);
        MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT = layout.offsetof(14);
        MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = layout.offsetof(15);
        MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT = layout.offsetof(16);
        BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = layout.offsetof(17);
        MAXTEMPORALLAYERCOUNT = layout.offsetof(18);
        MAXSPATIALLAYERCOUNT = layout.offsetof(19);
        MAXOPERATINGPOINTS = layout.offsetof(20);
        MINQINDEX = layout.offsetof(21);
        MAXQINDEX = layout.offsetof(22);
        PREFERSGOPREMAININGFRAMES = layout.offsetof(23);
        REQUIRESGOPREMAININGFRAMES = layout.offsetof(24);
        STDSYNTAXFLAGS = layout.offsetof(25);
    }

    protected VkVideoEncodeAV1CapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1CapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1CapabilitiesKHR(address, container);
    }

    public VkVideoEncodeAV1CapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeAV1CapabilityFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("StdVideoAV1Level")
    public int maxLevel() {
        return nmaxLevel(address());
    }

    public VkExtent2D codedPictureAlignment() {
        return ncodedPictureAlignment(address());
    }

    public VkExtent2D maxTiles() {
        return nmaxTiles(address());
    }

    public VkExtent2D minTileSize() {
        return nminTileSize(address());
    }

    public VkExtent2D maxTileSize() {
        return nmaxTileSize(address());
    }

    @NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
    public int superblockSizes() {
        return nsuperblockSizes(address());
    }

    @NativeType("uint32_t")
    public int maxSingleReferenceCount() {
        return nmaxSingleReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int singleReferenceNameMask() {
        return nsingleReferenceNameMask(address());
    }

    @NativeType("uint32_t")
    public int maxUnidirectionalCompoundReferenceCount() {
        return nmaxUnidirectionalCompoundReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxUnidirectionalCompoundGroup1ReferenceCount() {
        return nmaxUnidirectionalCompoundGroup1ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int unidirectionalCompoundReferenceNameMask() {
        return nunidirectionalCompoundReferenceNameMask(address());
    }

    @NativeType("uint32_t")
    public int maxBidirectionalCompoundReferenceCount() {
        return nmaxBidirectionalCompoundReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxBidirectionalCompoundGroup1ReferenceCount() {
        return nmaxBidirectionalCompoundGroup1ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxBidirectionalCompoundGroup2ReferenceCount() {
        return nmaxBidirectionalCompoundGroup2ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int bidirectionalCompoundReferenceNameMask() {
        return nbidirectionalCompoundReferenceNameMask(address());
    }

    @NativeType("uint32_t")
    public int maxTemporalLayerCount() {
        return nmaxTemporalLayerCount(address());
    }

    @NativeType("uint32_t")
    public int maxSpatialLayerCount() {
        return nmaxSpatialLayerCount(address());
    }

    @NativeType("uint32_t")
    public int maxOperatingPoints() {
        return nmaxOperatingPoints(address());
    }

    @NativeType("uint32_t")
    public int minQIndex() {
        return nminQIndex(address());
    }

    @NativeType("uint32_t")
    public int maxQIndex() {
        return nmaxQIndex(address());
    }

    @NativeType("VkBool32")
    public boolean prefersGopRemainingFrames() {
        return nprefersGopRemainingFrames(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean requiresGopRemainingFrames() {
        return nrequiresGopRemainingFrames(address()) != 0;
    }

    @NativeType("VkVideoEncodeAV1StdFlagsKHR")
    public int stdSyntaxFlags() {
        return nstdSyntaxFlags(address());
    }

    public VkVideoEncodeAV1CapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeAV1CapabilitiesKHR sType$Default() {
        return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR);
    }

    public VkVideoEncodeAV1CapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeAV1CapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeAV1CapabilitiesKHR set(VkVideoEncodeAV1CapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1CapabilitiesKHR malloc() {
        return new VkVideoEncodeAV1CapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1CapabilitiesKHR calloc() {
        return new VkVideoEncodeAV1CapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1CapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1CapabilitiesKHR create(long address) {
        return new VkVideoEncodeAV1CapabilitiesKHR(address, null);
    }

    public static VkVideoEncodeAV1CapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1CapabilitiesKHR(address, null);
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

    public static VkVideoEncodeAV1CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxLevel(long struct) {
        return MemoryUtil.memGetInt(struct + MAXLEVEL);
    }

    public static VkExtent2D ncodedPictureAlignment(long struct) {
        return VkExtent2D.create(struct + CODEDPICTUREALIGNMENT);
    }

    public static VkExtent2D nmaxTiles(long struct) {
        return VkExtent2D.create(struct + MAXTILES);
    }

    public static VkExtent2D nminTileSize(long struct) {
        return VkExtent2D.create(struct + MINTILESIZE);
    }

    public static VkExtent2D nmaxTileSize(long struct) {
        return VkExtent2D.create(struct + MAXTILESIZE);
    }

    public static int nsuperblockSizes(long struct) {
        return MemoryUtil.memGetInt(struct + SUPERBLOCKSIZES);
    }

    public static int nmaxSingleReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSINGLEREFERENCECOUNT);
    }

    public static int nsingleReferenceNameMask(long struct) {
        return MemoryUtil.memGetInt(struct + SINGLEREFERENCENAMEMASK);
    }

    public static int nmaxUnidirectionalCompoundReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT);
    }

    public static int nmaxUnidirectionalCompoundGroup1ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT);
    }

    public static int nunidirectionalCompoundReferenceNameMask(long struct) {
        return MemoryUtil.memGetInt(struct + UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK);
    }

    public static int nmaxBidirectionalCompoundReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT);
    }

    public static int nmaxBidirectionalCompoundGroup1ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT);
    }

    public static int nmaxBidirectionalCompoundGroup2ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT);
    }

    public static int nbidirectionalCompoundReferenceNameMask(long struct) {
        return MemoryUtil.memGetInt(struct + BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK);
    }

    public static int nmaxTemporalLayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTEMPORALLAYERCOUNT);
    }

    public static int nmaxSpatialLayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSPATIALLAYERCOUNT);
    }

    public static int nmaxOperatingPoints(long struct) {
        return MemoryUtil.memGetInt(struct + MAXOPERATINGPOINTS);
    }

    public static int nminQIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MINQINDEX);
    }

    public static int nmaxQIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MAXQINDEX);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1CapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1CapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1CapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeAV1CapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1CapabilitiesKHR.SIZEOF);
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
        public VkVideoEncodeAV1CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeAV1CapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeAV1CapabilitiesKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeAV1CapabilityFlagsKHR")
        public int flags() {
            return VkVideoEncodeAV1CapabilitiesKHR.nflags(address());
        }

        @NativeType("StdVideoAV1Level")
        public int maxLevel() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxLevel(address());
        }

        public VkExtent2D codedPictureAlignment() {
            return VkVideoEncodeAV1CapabilitiesKHR.ncodedPictureAlignment(address());
        }

        public VkExtent2D maxTiles() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxTiles(address());
        }

        public VkExtent2D minTileSize() {
            return VkVideoEncodeAV1CapabilitiesKHR.nminTileSize(address());
        }

        public VkExtent2D maxTileSize() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxTileSize(address());
        }

        @NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
        public int superblockSizes() {
            return VkVideoEncodeAV1CapabilitiesKHR.nsuperblockSizes(address());
        }

        @NativeType("uint32_t")
        public int maxSingleReferenceCount() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxSingleReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int singleReferenceNameMask() {
            return VkVideoEncodeAV1CapabilitiesKHR.nsingleReferenceNameMask(address());
        }

        @NativeType("uint32_t")
        public int maxUnidirectionalCompoundReferenceCount() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxUnidirectionalCompoundReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxUnidirectionalCompoundGroup1ReferenceCount() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxUnidirectionalCompoundGroup1ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int unidirectionalCompoundReferenceNameMask() {
            return VkVideoEncodeAV1CapabilitiesKHR.nunidirectionalCompoundReferenceNameMask(address());
        }

        @NativeType("uint32_t")
        public int maxBidirectionalCompoundReferenceCount() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxBidirectionalCompoundGroup1ReferenceCount() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundGroup1ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxBidirectionalCompoundGroup2ReferenceCount() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundGroup2ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int bidirectionalCompoundReferenceNameMask() {
            return VkVideoEncodeAV1CapabilitiesKHR.nbidirectionalCompoundReferenceNameMask(address());
        }

        @NativeType("uint32_t")
        public int maxTemporalLayerCount() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxTemporalLayerCount(address());
        }

        @NativeType("uint32_t")
        public int maxSpatialLayerCount() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxSpatialLayerCount(address());
        }

        @NativeType("uint32_t")
        public int maxOperatingPoints() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxOperatingPoints(address());
        }

        @NativeType("uint32_t")
        public int minQIndex() {
            return VkVideoEncodeAV1CapabilitiesKHR.nminQIndex(address());
        }

        @NativeType("uint32_t")
        public int maxQIndex() {
            return VkVideoEncodeAV1CapabilitiesKHR.nmaxQIndex(address());
        }

        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() {
            return VkVideoEncodeAV1CapabilitiesKHR.nprefersGopRemainingFrames(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() {
            return VkVideoEncodeAV1CapabilitiesKHR.nrequiresGopRemainingFrames(address()) != 0;
        }

        @NativeType("VkVideoEncodeAV1StdFlagsKHR")
        public int stdSyntaxFlags() {
            return VkVideoEncodeAV1CapabilitiesKHR.nstdSyntaxFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeAV1CapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeAV1CapabilitiesKHR.npNext(address(), value);
            return this;
        }
    }
}
