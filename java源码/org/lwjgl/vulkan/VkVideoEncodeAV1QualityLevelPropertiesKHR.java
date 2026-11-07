package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1QualityLevelPropertiesKHR.class */
public class VkVideoEncodeAV1QualityLevelPropertiesKHR extends Struct<VkVideoEncodeAV1QualityLevelPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PREFERREDRATECONTROLFLAGS;
    public static final int PREFERREDGOPFRAMECOUNT;
    public static final int PREFERREDKEYFRAMEPERIOD;
    public static final int PREFERREDCONSECUTIVEBIPREDICTIVEFRAMECOUNT;
    public static final int PREFERREDTEMPORALLAYERCOUNT;
    public static final int PREFERREDCONSTANTQINDEX;
    public static final int PREFERREDMAXSINGLEREFERENCECOUNT;
    public static final int PREFERREDSINGLEREFERENCENAMEMASK;
    public static final int PREFERREDMAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT;
    public static final int PREFERREDMAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT;
    public static final int PREFERREDUNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK;
    public static final int PREFERREDMAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT;
    public static final int PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT;
    public static final int PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT;
    public static final int PREFERREDBIDIRECTIONALCOMPOUNDREFERENCENAMEMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(VkVideoEncodeAV1QIndexKHR.SIZEOF, VkVideoEncodeAV1QIndexKHR.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERREDRATECONTROLFLAGS = layout.offsetof(2);
        PREFERREDGOPFRAMECOUNT = layout.offsetof(3);
        PREFERREDKEYFRAMEPERIOD = layout.offsetof(4);
        PREFERREDCONSECUTIVEBIPREDICTIVEFRAMECOUNT = layout.offsetof(5);
        PREFERREDTEMPORALLAYERCOUNT = layout.offsetof(6);
        PREFERREDCONSTANTQINDEX = layout.offsetof(7);
        PREFERREDMAXSINGLEREFERENCECOUNT = layout.offsetof(8);
        PREFERREDSINGLEREFERENCENAMEMASK = layout.offsetof(9);
        PREFERREDMAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT = layout.offsetof(10);
        PREFERREDMAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = layout.offsetof(11);
        PREFERREDUNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = layout.offsetof(12);
        PREFERREDMAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT = layout.offsetof(13);
        PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = layout.offsetof(14);
        PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT = layout.offsetof(15);
        PREFERREDBIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = layout.offsetof(16);
    }

    protected VkVideoEncodeAV1QualityLevelPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1QualityLevelPropertiesKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(address, container);
    }

    public VkVideoEncodeAV1QualityLevelPropertiesKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeAV1RateControlFlagsKHR")
    public int preferredRateControlFlags() {
        return npreferredRateControlFlags(address());
    }

    @NativeType("uint32_t")
    public int preferredGopFrameCount() {
        return npreferredGopFrameCount(address());
    }

    @NativeType("uint32_t")
    public int preferredKeyFramePeriod() {
        return npreferredKeyFramePeriod(address());
    }

    @NativeType("uint32_t")
    public int preferredConsecutiveBipredictiveFrameCount() {
        return npreferredConsecutiveBipredictiveFrameCount(address());
    }

    @NativeType("uint32_t")
    public int preferredTemporalLayerCount() {
        return npreferredTemporalLayerCount(address());
    }

    public VkVideoEncodeAV1QIndexKHR preferredConstantQIndex() {
        return npreferredConstantQIndex(address());
    }

    @NativeType("uint32_t")
    public int preferredMaxSingleReferenceCount() {
        return npreferredMaxSingleReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int preferredSingleReferenceNameMask() {
        return npreferredSingleReferenceNameMask(address());
    }

    @NativeType("uint32_t")
    public int preferredMaxUnidirectionalCompoundReferenceCount() {
        return npreferredMaxUnidirectionalCompoundReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int preferredMaxUnidirectionalCompoundGroup1ReferenceCount() {
        return npreferredMaxUnidirectionalCompoundGroup1ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int preferredUnidirectionalCompoundReferenceNameMask() {
        return npreferredUnidirectionalCompoundReferenceNameMask(address());
    }

    @NativeType("uint32_t")
    public int preferredMaxBidirectionalCompoundReferenceCount() {
        return npreferredMaxBidirectionalCompoundReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int preferredMaxBidirectionalCompoundGroup1ReferenceCount() {
        return npreferredMaxBidirectionalCompoundGroup1ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int preferredMaxBidirectionalCompoundGroup2ReferenceCount() {
        return npreferredMaxBidirectionalCompoundGroup2ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int preferredBidirectionalCompoundReferenceNameMask() {
        return npreferredBidirectionalCompoundReferenceNameMask(address());
    }

    public VkVideoEncodeAV1QualityLevelPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeAV1QualityLevelPropertiesKHR sType$Default() {
        return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR);
    }

    public VkVideoEncodeAV1QualityLevelPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeAV1QualityLevelPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeAV1QualityLevelPropertiesKHR set(VkVideoEncodeAV1QualityLevelPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR malloc() {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR calloc() {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR create(long address) {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(address, null);
    }

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(address, null);
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

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npreferredRateControlFlags(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDRATECONTROLFLAGS);
    }

    public static int npreferredGopFrameCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDGOPFRAMECOUNT);
    }

    public static int npreferredKeyFramePeriod(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDKEYFRAMEPERIOD);
    }

    public static int npreferredConsecutiveBipredictiveFrameCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDCONSECUTIVEBIPREDICTIVEFRAMECOUNT);
    }

    public static int npreferredTemporalLayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDTEMPORALLAYERCOUNT);
    }

    public static VkVideoEncodeAV1QIndexKHR npreferredConstantQIndex(long struct) {
        return VkVideoEncodeAV1QIndexKHR.create(struct + PREFERREDCONSTANTQINDEX);
    }

    public static int npreferredMaxSingleReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDMAXSINGLEREFERENCECOUNT);
    }

    public static int npreferredSingleReferenceNameMask(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDSINGLEREFERENCENAMEMASK);
    }

    public static int npreferredMaxUnidirectionalCompoundReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDMAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT);
    }

    public static int npreferredMaxUnidirectionalCompoundGroup1ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDMAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT);
    }

    public static int npreferredUnidirectionalCompoundReferenceNameMask(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDUNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK);
    }

    public static int npreferredMaxBidirectionalCompoundReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDMAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT);
    }

    public static int npreferredMaxBidirectionalCompoundGroup1ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT);
    }

    public static int npreferredMaxBidirectionalCompoundGroup2ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT);
    }

    public static int npreferredBidirectionalCompoundReferenceNameMask(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDBIDIRECTIONALCOMPOUNDREFERENCENAMEMASK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1QualityLevelPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1QualityLevelPropertiesKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1QualityLevelPropertiesKHR ELEMENT_FACTORY = VkVideoEncodeAV1QualityLevelPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1QualityLevelPropertiesKHR.SIZEOF);
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
        public VkVideoEncodeAV1QualityLevelPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeAV1RateControlFlagsKHR")
        public int preferredRateControlFlags() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredRateControlFlags(address());
        }

        @NativeType("uint32_t")
        public int preferredGopFrameCount() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredGopFrameCount(address());
        }

        @NativeType("uint32_t")
        public int preferredKeyFramePeriod() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredKeyFramePeriod(address());
        }

        @NativeType("uint32_t")
        public int preferredConsecutiveBipredictiveFrameCount() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredConsecutiveBipredictiveFrameCount(address());
        }

        @NativeType("uint32_t")
        public int preferredTemporalLayerCount() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredTemporalLayerCount(address());
        }

        public VkVideoEncodeAV1QIndexKHR preferredConstantQIndex() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredConstantQIndex(address());
        }

        @NativeType("uint32_t")
        public int preferredMaxSingleReferenceCount() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxSingleReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int preferredSingleReferenceNameMask() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredSingleReferenceNameMask(address());
        }

        @NativeType("uint32_t")
        public int preferredMaxUnidirectionalCompoundReferenceCount() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxUnidirectionalCompoundReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int preferredMaxUnidirectionalCompoundGroup1ReferenceCount() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxUnidirectionalCompoundGroup1ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int preferredUnidirectionalCompoundReferenceNameMask() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredUnidirectionalCompoundReferenceNameMask(address());
        }

        @NativeType("uint32_t")
        public int preferredMaxBidirectionalCompoundReferenceCount() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxBidirectionalCompoundReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int preferredMaxBidirectionalCompoundGroup1ReferenceCount() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxBidirectionalCompoundGroup1ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int preferredMaxBidirectionalCompoundGroup2ReferenceCount() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxBidirectionalCompoundGroup2ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int preferredBidirectionalCompoundReferenceNameMask() {
            return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredBidirectionalCompoundReferenceNameMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeAV1QualityLevelPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeAV1QualityLevelPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
