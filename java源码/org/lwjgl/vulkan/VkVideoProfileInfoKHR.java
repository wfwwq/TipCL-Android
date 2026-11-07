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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoProfileInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoProfileInfoKHR.class */
public class VkVideoProfileInfoKHR extends Struct<VkVideoProfileInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIDEOCODECOPERATION;
    public static final int CHROMASUBSAMPLING;
    public static final int LUMABITDEPTH;
    public static final int CHROMABITDEPTH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOCODECOPERATION = layout.offsetof(2);
        CHROMASUBSAMPLING = layout.offsetof(3);
        LUMABITDEPTH = layout.offsetof(4);
        CHROMABITDEPTH = layout.offsetof(5);
    }

    protected VkVideoProfileInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoProfileInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoProfileInfoKHR(address, container);
    }

    public VkVideoProfileInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoCodecOperationFlagBitsKHR")
    public int videoCodecOperation() {
        return nvideoCodecOperation(address());
    }

    @NativeType("VkVideoChromaSubsamplingFlagsKHR")
    public int chromaSubsampling() {
        return nchromaSubsampling(address());
    }

    @NativeType("VkVideoComponentBitDepthFlagsKHR")
    public int lumaBitDepth() {
        return nlumaBitDepth(address());
    }

    @NativeType("VkVideoComponentBitDepthFlagsKHR")
    public int chromaBitDepth() {
        return nchromaBitDepth(address());
    }

    public VkVideoProfileInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoProfileInfoKHR sType$Default() {
        return sType(1000023000);
    }

    public VkVideoProfileInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoProfileInfoKHR pNext(VkVideoDecodeAV1ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoProfileInfoKHR pNext(VkVideoDecodeH264ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoProfileInfoKHR pNext(VkVideoDecodeH265ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoProfileInfoKHR pNext(VkVideoDecodeUsageInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoProfileInfoKHR pNext(VkVideoDecodeVP9ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoProfileInfoKHR pNext(VkVideoEncodeAV1ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoProfileInfoKHR pNext(VkVideoEncodeH264ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoProfileInfoKHR pNext(VkVideoEncodeH265ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoProfileInfoKHR pNext(VkVideoEncodeProfileRgbConversionInfoVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoProfileInfoKHR pNext(VkVideoEncodeUsageInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoProfileInfoKHR videoCodecOperation(@NativeType("VkVideoCodecOperationFlagBitsKHR") int value) {
        nvideoCodecOperation(address(), value);
        return this;
    }

    public VkVideoProfileInfoKHR chromaSubsampling(@NativeType("VkVideoChromaSubsamplingFlagsKHR") int value) {
        nchromaSubsampling(address(), value);
        return this;
    }

    public VkVideoProfileInfoKHR lumaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) {
        nlumaBitDepth(address(), value);
        return this;
    }

    public VkVideoProfileInfoKHR chromaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) {
        nchromaBitDepth(address(), value);
        return this;
    }

    public VkVideoProfileInfoKHR set(int sType, long pNext, int videoCodecOperation, int chromaSubsampling, int lumaBitDepth, int chromaBitDepth) {
        sType(sType);
        pNext(pNext);
        videoCodecOperation(videoCodecOperation);
        chromaSubsampling(chromaSubsampling);
        lumaBitDepth(lumaBitDepth);
        chromaBitDepth(chromaBitDepth);
        return this;
    }

    public VkVideoProfileInfoKHR set(VkVideoProfileInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoProfileInfoKHR malloc() {
        return new VkVideoProfileInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoProfileInfoKHR calloc() {
        return new VkVideoProfileInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoProfileInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoProfileInfoKHR create(long address) {
        return new VkVideoProfileInfoKHR(address, null);
    }

    public static VkVideoProfileInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoProfileInfoKHR(address, null);
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

    public static VkVideoProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvideoCodecOperation(long struct) {
        return MemoryUtil.memGetInt(struct + VIDEOCODECOPERATION);
    }

    public static int nchromaSubsampling(long struct) {
        return MemoryUtil.memGetInt(struct + CHROMASUBSAMPLING);
    }

    public static int nlumaBitDepth(long struct) {
        return MemoryUtil.memGetInt(struct + LUMABITDEPTH);
    }

    public static int nchromaBitDepth(long struct) {
        return MemoryUtil.memGetInt(struct + CHROMABITDEPTH);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvideoCodecOperation(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIDEOCODECOPERATION, value);
    }

    public static void nchromaSubsampling(long struct, int value) {
        MemoryUtil.memPutInt(struct + CHROMASUBSAMPLING, value);
    }

    public static void nlumaBitDepth(long struct, int value) {
        MemoryUtil.memPutInt(struct + LUMABITDEPTH, value);
    }

    public static void nchromaBitDepth(long struct, int value) {
        MemoryUtil.memPutInt(struct + CHROMABITDEPTH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoProfileInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoProfileInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoProfileInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoProfileInfoKHR ELEMENT_FACTORY = VkVideoProfileInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoProfileInfoKHR.SIZEOF);
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
        public VkVideoProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoProfileInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoProfileInfoKHR.npNext(address());
        }

        @NativeType("VkVideoCodecOperationFlagBitsKHR")
        public int videoCodecOperation() {
            return VkVideoProfileInfoKHR.nvideoCodecOperation(address());
        }

        @NativeType("VkVideoChromaSubsamplingFlagsKHR")
        public int chromaSubsampling() {
            return VkVideoProfileInfoKHR.nchromaSubsampling(address());
        }

        @NativeType("VkVideoComponentBitDepthFlagsKHR")
        public int lumaBitDepth() {
            return VkVideoProfileInfoKHR.nlumaBitDepth(address());
        }

        @NativeType("VkVideoComponentBitDepthFlagsKHR")
        public int chromaBitDepth() {
            return VkVideoProfileInfoKHR.nchromaBitDepth(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoProfileInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000023000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoProfileInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoDecodeAV1ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH264ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH265ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeUsageInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeVP9ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeAV1ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeProfileRgbConversionInfoVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeUsageInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer videoCodecOperation(@NativeType("VkVideoCodecOperationFlagBitsKHR") int value) {
            VkVideoProfileInfoKHR.nvideoCodecOperation(address(), value);
            return this;
        }

        public Buffer chromaSubsampling(@NativeType("VkVideoChromaSubsamplingFlagsKHR") int value) {
            VkVideoProfileInfoKHR.nchromaSubsampling(address(), value);
            return this;
        }

        public Buffer lumaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) {
            VkVideoProfileInfoKHR.nlumaBitDepth(address(), value);
            return this;
        }

        public Buffer chromaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) {
            VkVideoProfileInfoKHR.nchromaBitDepth(address(), value);
            return this;
        }
    }
}
