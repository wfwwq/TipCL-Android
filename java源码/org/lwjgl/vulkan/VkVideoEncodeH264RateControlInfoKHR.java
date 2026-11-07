package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264RateControlInfoKHR.class */
public class VkVideoEncodeH264RateControlInfoKHR extends Struct<VkVideoEncodeH264RateControlInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int GOPFRAMECOUNT;
    public static final int IDRPERIOD;
    public static final int CONSECUTIVEBFRAMECOUNT;
    public static final int TEMPORALLAYERCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        GOPFRAMECOUNT = layout.offsetof(3);
        IDRPERIOD = layout.offsetof(4);
        CONSECUTIVEBFRAMECOUNT = layout.offsetof(5);
        TEMPORALLAYERCOUNT = layout.offsetof(6);
    }

    protected VkVideoEncodeH264RateControlInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264RateControlInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH264RateControlInfoKHR(address, container);
    }

    public VkVideoEncodeH264RateControlInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeH264RateControlFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int gopFrameCount() {
        return ngopFrameCount(address());
    }

    @NativeType("uint32_t")
    public int idrPeriod() {
        return nidrPeriod(address());
    }

    @NativeType("uint32_t")
    public int consecutiveBFrameCount() {
        return nconsecutiveBFrameCount(address());
    }

    @NativeType("uint32_t")
    public int temporalLayerCount() {
        return ntemporalLayerCount(address());
    }

    public VkVideoEncodeH264RateControlInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoKHR sType$Default() {
        return sType(1000038008);
    }

    public VkVideoEncodeH264RateControlInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoKHR flags(@NativeType("VkVideoEncodeH264RateControlFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoKHR gopFrameCount(@NativeType("uint32_t") int value) {
        ngopFrameCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoKHR idrPeriod(@NativeType("uint32_t") int value) {
        nidrPeriod(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoKHR consecutiveBFrameCount(@NativeType("uint32_t") int value) {
        nconsecutiveBFrameCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoKHR temporalLayerCount(@NativeType("uint32_t") int value) {
        ntemporalLayerCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoKHR set(int sType, long pNext, int flags, int gopFrameCount, int idrPeriod, int consecutiveBFrameCount, int temporalLayerCount) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        gopFrameCount(gopFrameCount);
        idrPeriod(idrPeriod);
        consecutiveBFrameCount(consecutiveBFrameCount);
        temporalLayerCount(temporalLayerCount);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoKHR set(VkVideoEncodeH264RateControlInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264RateControlInfoKHR malloc() {
        return new VkVideoEncodeH264RateControlInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlInfoKHR calloc() {
        return new VkVideoEncodeH264RateControlInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264RateControlInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264RateControlInfoKHR create(long address) {
        return new VkVideoEncodeH264RateControlInfoKHR(address, null);
    }

    public static VkVideoEncodeH264RateControlInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264RateControlInfoKHR(address, null);
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

    public static VkVideoEncodeH264RateControlInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nidrPeriod(long struct) {
        return MemoryUtil.memGetInt(struct + IDRPERIOD);
    }

    public static int nconsecutiveBFrameCount(long struct) {
        return MemoryUtil.memGetInt(struct + CONSECUTIVEBFRAMECOUNT);
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

    public static void nidrPeriod(long struct, int value) {
        MemoryUtil.memPutInt(struct + IDRPERIOD, value);
    }

    public static void nconsecutiveBFrameCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONSECUTIVEBFRAMECOUNT, value);
    }

    public static void ntemporalLayerCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEMPORALLAYERCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264RateControlInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264RateControlInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264RateControlInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264RateControlInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264RateControlInfoKHR.SIZEOF);
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
        public VkVideoEncodeH264RateControlInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264RateControlInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264RateControlInfoKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeH264RateControlFlagsKHR")
        public int flags() {
            return VkVideoEncodeH264RateControlInfoKHR.nflags(address());
        }

        @NativeType("uint32_t")
        public int gopFrameCount() {
            return VkVideoEncodeH264RateControlInfoKHR.ngopFrameCount(address());
        }

        @NativeType("uint32_t")
        public int idrPeriod() {
            return VkVideoEncodeH264RateControlInfoKHR.nidrPeriod(address());
        }

        @NativeType("uint32_t")
        public int consecutiveBFrameCount() {
            return VkVideoEncodeH264RateControlInfoKHR.nconsecutiveBFrameCount(address());
        }

        @NativeType("uint32_t")
        public int temporalLayerCount() {
            return VkVideoEncodeH264RateControlInfoKHR.ntemporalLayerCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264RateControlInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038008);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264RateControlInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkVideoEncodeH264RateControlFlagsKHR") int value) {
            VkVideoEncodeH264RateControlInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer gopFrameCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264RateControlInfoKHR.ngopFrameCount(address(), value);
            return this;
        }

        public Buffer idrPeriod(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264RateControlInfoKHR.nidrPeriod(address(), value);
            return this;
        }

        public Buffer consecutiveBFrameCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264RateControlInfoKHR.nconsecutiveBFrameCount(address(), value);
            return this;
        }

        public Buffer temporalLayerCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264RateControlInfoKHR.ntemporalLayerCount(address(), value);
            return this;
        }
    }
}
