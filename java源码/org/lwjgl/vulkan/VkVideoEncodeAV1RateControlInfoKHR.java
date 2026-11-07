package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1RateControlInfoKHR.class */
public class VkVideoEncodeAV1RateControlInfoKHR extends Struct<VkVideoEncodeAV1RateControlInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int GOPFRAMECOUNT;
    public static final int KEYFRAMEPERIOD;
    public static final int CONSECUTIVEBIPREDICTIVEFRAMECOUNT;
    public static final int TEMPORALLAYERCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        GOPFRAMECOUNT = layout.offsetof(3);
        KEYFRAMEPERIOD = layout.offsetof(4);
        CONSECUTIVEBIPREDICTIVEFRAMECOUNT = layout.offsetof(5);
        TEMPORALLAYERCOUNT = layout.offsetof(6);
    }

    protected VkVideoEncodeAV1RateControlInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1RateControlInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1RateControlInfoKHR(address, container);
    }

    public VkVideoEncodeAV1RateControlInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeAV1RateControlFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int gopFrameCount() {
        return ngopFrameCount(address());
    }

    @NativeType("uint32_t")
    public int keyFramePeriod() {
        return nkeyFramePeriod(address());
    }

    @NativeType("uint32_t")
    public int consecutiveBipredictiveFrameCount() {
        return nconsecutiveBipredictiveFrameCount(address());
    }

    @NativeType("uint32_t")
    public int temporalLayerCount() {
        return ntemporalLayerCount(address());
    }

    public VkVideoEncodeAV1RateControlInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlInfoKHR sType$Default() {
        return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR);
    }

    public VkVideoEncodeAV1RateControlInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlInfoKHR flags(@NativeType("VkVideoEncodeAV1RateControlFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlInfoKHR gopFrameCount(@NativeType("uint32_t") int value) {
        ngopFrameCount(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlInfoKHR keyFramePeriod(@NativeType("uint32_t") int value) {
        nkeyFramePeriod(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlInfoKHR consecutiveBipredictiveFrameCount(@NativeType("uint32_t") int value) {
        nconsecutiveBipredictiveFrameCount(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlInfoKHR temporalLayerCount(@NativeType("uint32_t") int value) {
        ntemporalLayerCount(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlInfoKHR set(int sType, long pNext, int flags, int gopFrameCount, int keyFramePeriod, int consecutiveBipredictiveFrameCount, int temporalLayerCount) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        gopFrameCount(gopFrameCount);
        keyFramePeriod(keyFramePeriod);
        consecutiveBipredictiveFrameCount(consecutiveBipredictiveFrameCount);
        temporalLayerCount(temporalLayerCount);
        return this;
    }

    public VkVideoEncodeAV1RateControlInfoKHR set(VkVideoEncodeAV1RateControlInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1RateControlInfoKHR malloc() {
        return new VkVideoEncodeAV1RateControlInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1RateControlInfoKHR calloc() {
        return new VkVideoEncodeAV1RateControlInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1RateControlInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1RateControlInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1RateControlInfoKHR create(long address) {
        return new VkVideoEncodeAV1RateControlInfoKHR(address, null);
    }

    public static VkVideoEncodeAV1RateControlInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1RateControlInfoKHR(address, null);
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

    public static VkVideoEncodeAV1RateControlInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1RateControlInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1RateControlInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1RateControlInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ngopFrameCount(long struct) {
        return MemoryUtil.memGetInt(struct + GOPFRAMECOUNT);
    }

    public static int nkeyFramePeriod(long struct) {
        return MemoryUtil.memGetInt(struct + KEYFRAMEPERIOD);
    }

    public static int nconsecutiveBipredictiveFrameCount(long struct) {
        return MemoryUtil.memGetInt(struct + CONSECUTIVEBIPREDICTIVEFRAMECOUNT);
    }

    public static int ntemporalLayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + TEMPORALLAYERCOUNT);
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

    public static void ngopFrameCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + GOPFRAMECOUNT, value);
    }

    public static void nkeyFramePeriod(long struct, int value) {
        MemoryUtil.memPutInt(struct + KEYFRAMEPERIOD, value);
    }

    public static void nconsecutiveBipredictiveFrameCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONSECUTIVEBIPREDICTIVEFRAMECOUNT, value);
    }

    public static void ntemporalLayerCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEMPORALLAYERCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1RateControlInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1RateControlInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1RateControlInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1RateControlInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1RateControlInfoKHR.SIZEOF);
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
        public VkVideoEncodeAV1RateControlInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeAV1RateControlInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeAV1RateControlInfoKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeAV1RateControlFlagsKHR")
        public int flags() {
            return VkVideoEncodeAV1RateControlInfoKHR.nflags(address());
        }

        @NativeType("uint32_t")
        public int gopFrameCount() {
            return VkVideoEncodeAV1RateControlInfoKHR.ngopFrameCount(address());
        }

        @NativeType("uint32_t")
        public int keyFramePeriod() {
            return VkVideoEncodeAV1RateControlInfoKHR.nkeyFramePeriod(address());
        }

        @NativeType("uint32_t")
        public int consecutiveBipredictiveFrameCount() {
            return VkVideoEncodeAV1RateControlInfoKHR.nconsecutiveBipredictiveFrameCount(address());
        }

        @NativeType("uint32_t")
        public int temporalLayerCount() {
            return VkVideoEncodeAV1RateControlInfoKHR.ntemporalLayerCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeAV1RateControlInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeAV1RateControlInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkVideoEncodeAV1RateControlFlagsKHR") int value) {
            VkVideoEncodeAV1RateControlInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer gopFrameCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1RateControlInfoKHR.ngopFrameCount(address(), value);
            return this;
        }

        public Buffer keyFramePeriod(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1RateControlInfoKHR.nkeyFramePeriod(address(), value);
            return this;
        }

        public Buffer consecutiveBipredictiveFrameCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1RateControlInfoKHR.nconsecutiveBipredictiveFrameCount(address(), value);
            return this;
        }

        public Buffer temporalLayerCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1RateControlInfoKHR.ntemporalLayerCount(address(), value);
            return this;
        }
    }
}
