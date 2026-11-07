package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265QualityLevelPropertiesKHR.class */
public class VkVideoEncodeH265QualityLevelPropertiesKHR extends Struct<VkVideoEncodeH265QualityLevelPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PREFERREDRATECONTROLFLAGS;
    public static final int PREFERREDGOPFRAMECOUNT;
    public static final int PREFERREDIDRPERIOD;
    public static final int PREFERREDCONSECUTIVEBFRAMECOUNT;
    public static final int PREFERREDSUBLAYERCOUNT;
    public static final int PREFERREDCONSTANTQP;
    public static final int PREFERREDMAXL0REFERENCECOUNT;
    public static final int PREFERREDMAXL1REFERENCECOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(VkVideoEncodeH265QpKHR.SIZEOF, VkVideoEncodeH265QpKHR.ALIGNOF), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERREDRATECONTROLFLAGS = layout.offsetof(2);
        PREFERREDGOPFRAMECOUNT = layout.offsetof(3);
        PREFERREDIDRPERIOD = layout.offsetof(4);
        PREFERREDCONSECUTIVEBFRAMECOUNT = layout.offsetof(5);
        PREFERREDSUBLAYERCOUNT = layout.offsetof(6);
        PREFERREDCONSTANTQP = layout.offsetof(7);
        PREFERREDMAXL0REFERENCECOUNT = layout.offsetof(8);
        PREFERREDMAXL1REFERENCECOUNT = layout.offsetof(9);
    }

    protected VkVideoEncodeH265QualityLevelPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265QualityLevelPropertiesKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(address, container);
    }

    public VkVideoEncodeH265QualityLevelPropertiesKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeH265RateControlFlagsKHR")
    public int preferredRateControlFlags() {
        return npreferredRateControlFlags(address());
    }

    @NativeType("uint32_t")
    public int preferredGopFrameCount() {
        return npreferredGopFrameCount(address());
    }

    @NativeType("uint32_t")
    public int preferredIdrPeriod() {
        return npreferredIdrPeriod(address());
    }

    @NativeType("uint32_t")
    public int preferredConsecutiveBFrameCount() {
        return npreferredConsecutiveBFrameCount(address());
    }

    @NativeType("uint32_t")
    public int preferredSubLayerCount() {
        return npreferredSubLayerCount(address());
    }

    public VkVideoEncodeH265QpKHR preferredConstantQp() {
        return npreferredConstantQp(address());
    }

    @NativeType("uint32_t")
    public int preferredMaxL0ReferenceCount() {
        return npreferredMaxL0ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int preferredMaxL1ReferenceCount() {
        return npreferredMaxL1ReferenceCount(address());
    }

    public VkVideoEncodeH265QualityLevelPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265QualityLevelPropertiesKHR sType$Default() {
        return sType(1000039012);
    }

    public VkVideoEncodeH265QualityLevelPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265QualityLevelPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeH265QualityLevelPropertiesKHR set(VkVideoEncodeH265QualityLevelPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265QualityLevelPropertiesKHR malloc() {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265QualityLevelPropertiesKHR calloc() {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265QualityLevelPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265QualityLevelPropertiesKHR create(long address) {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(address, null);
    }

    public static VkVideoEncodeH265QualityLevelPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(address, null);
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

    public static VkVideoEncodeH265QualityLevelPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265QualityLevelPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npreferredIdrPeriod(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDIDRPERIOD);
    }

    public static int npreferredConsecutiveBFrameCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDCONSECUTIVEBFRAMECOUNT);
    }

    public static int npreferredSubLayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDSUBLAYERCOUNT);
    }

    public static VkVideoEncodeH265QpKHR npreferredConstantQp(long struct) {
        return VkVideoEncodeH265QpKHR.create(struct + PREFERREDCONSTANTQP);
    }

    public static int npreferredMaxL0ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDMAXL0REFERENCECOUNT);
    }

    public static int npreferredMaxL1ReferenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDMAXL1REFERENCECOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265QualityLevelPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265QualityLevelPropertiesKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265QualityLevelPropertiesKHR ELEMENT_FACTORY = VkVideoEncodeH265QualityLevelPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265QualityLevelPropertiesKHR.SIZEOF);
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
        public VkVideoEncodeH265QualityLevelPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265QualityLevelPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeH265QualityLevelPropertiesKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeH265RateControlFlagsKHR")
        public int preferredRateControlFlags() {
            return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredRateControlFlags(address());
        }

        @NativeType("uint32_t")
        public int preferredGopFrameCount() {
            return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredGopFrameCount(address());
        }

        @NativeType("uint32_t")
        public int preferredIdrPeriod() {
            return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredIdrPeriod(address());
        }

        @NativeType("uint32_t")
        public int preferredConsecutiveBFrameCount() {
            return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredConsecutiveBFrameCount(address());
        }

        @NativeType("uint32_t")
        public int preferredSubLayerCount() {
            return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredSubLayerCount(address());
        }

        public VkVideoEncodeH265QpKHR preferredConstantQp() {
            return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredConstantQp(address());
        }

        @NativeType("uint32_t")
        public int preferredMaxL0ReferenceCount() {
            return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredMaxL0ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int preferredMaxL1ReferenceCount() {
            return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredMaxL1ReferenceCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265QualityLevelPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039012);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeH265QualityLevelPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
