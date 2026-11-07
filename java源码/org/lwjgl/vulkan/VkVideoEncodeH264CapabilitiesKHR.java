package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264CapabilitiesKHR.class */
public class VkVideoEncodeH264CapabilitiesKHR extends Struct<VkVideoEncodeH264CapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int MAXLEVELIDC;
    public static final int MAXSLICECOUNT;
    public static final int MAXPPICTUREL0REFERENCECOUNT;
    public static final int MAXBPICTUREL0REFERENCECOUNT;
    public static final int MAXL1REFERENCECOUNT;
    public static final int MAXTEMPORALLAYERCOUNT;
    public static final int EXPECTDYADICTEMPORALLAYERPATTERN;
    public static final int MINQP;
    public static final int MAXQP;
    public static final int PREFERSGOPREMAININGFRAMES;
    public static final int REQUIRESGOPREMAININGFRAMES;
    public static final int STDSYNTAXFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAXLEVELIDC = layout.offsetof(3);
        MAXSLICECOUNT = layout.offsetof(4);
        MAXPPICTUREL0REFERENCECOUNT = layout.offsetof(5);
        MAXBPICTUREL0REFERENCECOUNT = layout.offsetof(6);
        MAXL1REFERENCECOUNT = layout.offsetof(7);
        MAXTEMPORALLAYERCOUNT = layout.offsetof(8);
        EXPECTDYADICTEMPORALLAYERPATTERN = layout.offsetof(9);
        MINQP = layout.offsetof(10);
        MAXQP = layout.offsetof(11);
        PREFERSGOPREMAININGFRAMES = layout.offsetof(12);
        REQUIRESGOPREMAININGFRAMES = layout.offsetof(13);
        STDSYNTAXFLAGS = layout.offsetof(14);
    }

    protected VkVideoEncodeH264CapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264CapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH264CapabilitiesKHR(address, container);
    }

    public VkVideoEncodeH264CapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeH264CapabilityFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH264LevelIdc")
    public int maxLevelIdc() {
        return nmaxLevelIdc(address());
    }

    @NativeType("uint32_t")
    public int maxSliceCount() {
        return nmaxSliceCount(address());
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
    public int maxTemporalLayerCount() {
        return nmaxTemporalLayerCount(address());
    }

    @NativeType("VkBool32")
    public boolean expectDyadicTemporalLayerPattern() {
        return nexpectDyadicTemporalLayerPattern(address()) != 0;
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

    @NativeType("VkVideoEncodeH264StdFlagsKHR")
    public int stdSyntaxFlags() {
        return nstdSyntaxFlags(address());
    }

    public VkVideoEncodeH264CapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264CapabilitiesKHR sType$Default() {
        return sType(1000038000);
    }

    public VkVideoEncodeH264CapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264CapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeH264CapabilitiesKHR set(VkVideoEncodeH264CapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264CapabilitiesKHR malloc() {
        return new VkVideoEncodeH264CapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264CapabilitiesKHR calloc() {
        return new VkVideoEncodeH264CapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264CapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264CapabilitiesKHR create(long address) {
        return new VkVideoEncodeH264CapabilitiesKHR(address, null);
    }

    public static VkVideoEncodeH264CapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264CapabilitiesKHR(address, null);
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

    public static VkVideoEncodeH264CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxSliceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSLICECOUNT);
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

    public static int nmaxTemporalLayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTEMPORALLAYERCOUNT);
    }

    public static int nexpectDyadicTemporalLayerPattern(long struct) {
        return MemoryUtil.memGetInt(struct + EXPECTDYADICTEMPORALLAYERPATTERN);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264CapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264CapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264CapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeH264CapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264CapabilitiesKHR.SIZEOF);
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
        public VkVideoEncodeH264CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264CapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeH264CapabilitiesKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeH264CapabilityFlagsKHR")
        public int flags() {
            return VkVideoEncodeH264CapabilitiesKHR.nflags(address());
        }

        @NativeType("StdVideoH264LevelIdc")
        public int maxLevelIdc() {
            return VkVideoEncodeH264CapabilitiesKHR.nmaxLevelIdc(address());
        }

        @NativeType("uint32_t")
        public int maxSliceCount() {
            return VkVideoEncodeH264CapabilitiesKHR.nmaxSliceCount(address());
        }

        @NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() {
            return VkVideoEncodeH264CapabilitiesKHR.nmaxPPictureL0ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() {
            return VkVideoEncodeH264CapabilitiesKHR.nmaxBPictureL0ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxL1ReferenceCount() {
            return VkVideoEncodeH264CapabilitiesKHR.nmaxL1ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxTemporalLayerCount() {
            return VkVideoEncodeH264CapabilitiesKHR.nmaxTemporalLayerCount(address());
        }

        @NativeType("VkBool32")
        public boolean expectDyadicTemporalLayerPattern() {
            return VkVideoEncodeH264CapabilitiesKHR.nexpectDyadicTemporalLayerPattern(address()) != 0;
        }

        @NativeType("int32_t")
        public int minQp() {
            return VkVideoEncodeH264CapabilitiesKHR.nminQp(address());
        }

        @NativeType("int32_t")
        public int maxQp() {
            return VkVideoEncodeH264CapabilitiesKHR.nmaxQp(address());
        }

        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() {
            return VkVideoEncodeH264CapabilitiesKHR.nprefersGopRemainingFrames(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() {
            return VkVideoEncodeH264CapabilitiesKHR.nrequiresGopRemainingFrames(address()) != 0;
        }

        @NativeType("VkVideoEncodeH264StdFlagsKHR")
        public int stdSyntaxFlags() {
            return VkVideoEncodeH264CapabilitiesKHR.nstdSyntaxFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264CapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeH264CapabilitiesKHR.npNext(address(), value);
            return this;
        }
    }
}
