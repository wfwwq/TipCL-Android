package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlLayerInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlLayerInfoKHR.class */
public class VkVideoEncodeRateControlLayerInfoKHR extends Struct<VkVideoEncodeRateControlLayerInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int AVERAGEBITRATE;
    public static final int MAXBITRATE;
    public static final int FRAMERATENUMERATOR;
    public static final int FRAMERATEDENOMINATOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        AVERAGEBITRATE = layout.offsetof(2);
        MAXBITRATE = layout.offsetof(3);
        FRAMERATENUMERATOR = layout.offsetof(4);
        FRAMERATEDENOMINATOR = layout.offsetof(5);
    }

    protected VkVideoEncodeRateControlLayerInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeRateControlLayerInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeRateControlLayerInfoKHR(address, container);
    }

    public VkVideoEncodeRateControlLayerInfoKHR(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long averageBitrate() {
        return naverageBitrate(address());
    }

    @NativeType("uint64_t")
    public long maxBitrate() {
        return nmaxBitrate(address());
    }

    @NativeType("uint32_t")
    public int frameRateNumerator() {
        return nframeRateNumerator(address());
    }

    @NativeType("uint32_t")
    public int frameRateDenominator() {
        return nframeRateDenominator(address());
    }

    public VkVideoEncodeRateControlLayerInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlLayerInfoKHR sType$Default() {
        return sType(1000299002);
    }

    public VkVideoEncodeRateControlLayerInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlLayerInfoKHR pNext(VkVideoEncodeAV1RateControlLayerInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeRateControlLayerInfoKHR pNext(VkVideoEncodeH264RateControlLayerInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeRateControlLayerInfoKHR pNext(VkVideoEncodeH265RateControlLayerInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeRateControlLayerInfoKHR averageBitrate(@NativeType("uint64_t") long value) {
        naverageBitrate(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlLayerInfoKHR maxBitrate(@NativeType("uint64_t") long value) {
        nmaxBitrate(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlLayerInfoKHR frameRateNumerator(@NativeType("uint32_t") int value) {
        nframeRateNumerator(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlLayerInfoKHR frameRateDenominator(@NativeType("uint32_t") int value) {
        nframeRateDenominator(address(), value);
        return this;
    }

    public VkVideoEncodeRateControlLayerInfoKHR set(int sType, long pNext, long averageBitrate, long maxBitrate, int frameRateNumerator, int frameRateDenominator) {
        sType(sType);
        pNext(pNext);
        averageBitrate(averageBitrate);
        maxBitrate(maxBitrate);
        frameRateNumerator(frameRateNumerator);
        frameRateDenominator(frameRateDenominator);
        return this;
    }

    public VkVideoEncodeRateControlLayerInfoKHR set(VkVideoEncodeRateControlLayerInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeRateControlLayerInfoKHR malloc() {
        return new VkVideoEncodeRateControlLayerInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeRateControlLayerInfoKHR calloc() {
        return new VkVideoEncodeRateControlLayerInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeRateControlLayerInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeRateControlLayerInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeRateControlLayerInfoKHR create(long address) {
        return new VkVideoEncodeRateControlLayerInfoKHR(address, null);
    }

    public static VkVideoEncodeRateControlLayerInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeRateControlLayerInfoKHR(address, null);
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

    public static VkVideoEncodeRateControlLayerInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeRateControlLayerInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeRateControlLayerInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeRateControlLayerInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long naverageBitrate(long struct) {
        return MemoryUtil.memGetLong(struct + AVERAGEBITRATE);
    }

    public static long nmaxBitrate(long struct) {
        return MemoryUtil.memGetLong(struct + MAXBITRATE);
    }

    public static int nframeRateNumerator(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMERATENUMERATOR);
    }

    public static int nframeRateDenominator(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMERATEDENOMINATOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naverageBitrate(long struct, long value) {
        MemoryUtil.memPutLong(struct + AVERAGEBITRATE, value);
    }

    public static void nmaxBitrate(long struct, long value) {
        MemoryUtil.memPutLong(struct + MAXBITRATE, value);
    }

    public static void nframeRateNumerator(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAMERATENUMERATOR, value);
    }

    public static void nframeRateDenominator(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAMERATEDENOMINATOR, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlLayerInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlLayerInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeRateControlLayerInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeRateControlLayerInfoKHR ELEMENT_FACTORY = VkVideoEncodeRateControlLayerInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeRateControlLayerInfoKHR.SIZEOF);
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
        public VkVideoEncodeRateControlLayerInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeRateControlLayerInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeRateControlLayerInfoKHR.npNext(address());
        }

        @NativeType("uint64_t")
        public long averageBitrate() {
            return VkVideoEncodeRateControlLayerInfoKHR.naverageBitrate(address());
        }

        @NativeType("uint64_t")
        public long maxBitrate() {
            return VkVideoEncodeRateControlLayerInfoKHR.nmaxBitrate(address());
        }

        @NativeType("uint32_t")
        public int frameRateNumerator() {
            return VkVideoEncodeRateControlLayerInfoKHR.nframeRateNumerator(address());
        }

        @NativeType("uint32_t")
        public int frameRateDenominator() {
            return VkVideoEncodeRateControlLayerInfoKHR.nframeRateDenominator(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeRateControlLayerInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000299002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeRateControlLayerInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoEncodeAV1RateControlLayerInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264RateControlLayerInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265RateControlLayerInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer averageBitrate(@NativeType("uint64_t") long value) {
            VkVideoEncodeRateControlLayerInfoKHR.naverageBitrate(address(), value);
            return this;
        }

        public Buffer maxBitrate(@NativeType("uint64_t") long value) {
            VkVideoEncodeRateControlLayerInfoKHR.nmaxBitrate(address(), value);
            return this;
        }

        public Buffer frameRateNumerator(@NativeType("uint32_t") int value) {
            VkVideoEncodeRateControlLayerInfoKHR.nframeRateNumerator(address(), value);
            return this;
        }

        public Buffer frameRateDenominator(@NativeType("uint32_t") int value) {
            VkVideoEncodeRateControlLayerInfoKHR.nframeRateDenominator(address(), value);
            return this;
        }
    }
}
