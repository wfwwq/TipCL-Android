package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader;
import org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo;
import org.lwjgl.vulkan.video.StdVideoEncodeAV1OperatingPointInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1SessionParametersCreateInfoKHR.class */
public class VkVideoEncodeAV1SessionParametersCreateInfoKHR extends Struct<VkVideoEncodeAV1SessionParametersCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDSEQUENCEHEADER;
    public static final int PSTDDECODERMODELINFO;
    public static final int STDOPERATINGPOINTCOUNT;
    public static final int PSTDOPERATINGPOINTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDSEQUENCEHEADER = layout.offsetof(2);
        PSTDDECODERMODELINFO = layout.offsetof(3);
        STDOPERATINGPOINTCOUNT = layout.offsetof(4);
        PSTDOPERATINGPOINTS = layout.offsetof(5);
    }

    protected VkVideoEncodeAV1SessionParametersCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(address, container);
    }

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoAV1SequenceHeader const *")
    public StdVideoAV1SequenceHeader pStdSequenceHeader() {
        return npStdSequenceHeader(address());
    }

    @NativeType("StdVideoEncodeAV1DecoderModelInfo const *")
    public StdVideoEncodeAV1DecoderModelInfo pStdDecoderModelInfo() {
        return npStdDecoderModelInfo(address());
    }

    @NativeType("uint32_t")
    public int stdOperatingPointCount() {
        return nstdOperatingPointCount(address());
    }

    @NativeType("StdVideoEncodeAV1OperatingPointInfo const *")
    public StdVideoEncodeAV1OperatingPointInfo.Buffer pStdOperatingPoints() {
        return npStdOperatingPoints(address());
    }

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR sType$Default() {
        return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR);
    }

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdSequenceHeader(@NativeType("StdVideoAV1SequenceHeader const *") StdVideoAV1SequenceHeader value) {
        npStdSequenceHeader(address(), value);
        return this;
    }

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdDecoderModelInfo(@NativeType("StdVideoEncodeAV1DecoderModelInfo const *") StdVideoEncodeAV1DecoderModelInfo value) {
        npStdDecoderModelInfo(address(), value);
        return this;
    }

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR stdOperatingPointCount(@NativeType("uint32_t") int value) {
        nstdOperatingPointCount(address(), value);
        return this;
    }

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdOperatingPoints(@NativeType("StdVideoEncodeAV1OperatingPointInfo const *") StdVideoEncodeAV1OperatingPointInfo.Buffer value) {
        npStdOperatingPoints(address(), value);
        return this;
    }

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR set(int sType, long pNext, StdVideoAV1SequenceHeader pStdSequenceHeader, StdVideoEncodeAV1DecoderModelInfo pStdDecoderModelInfo, int stdOperatingPointCount, StdVideoEncodeAV1OperatingPointInfo.Buffer pStdOperatingPoints) {
        sType(sType);
        pNext(pNext);
        pStdSequenceHeader(pStdSequenceHeader);
        pStdDecoderModelInfo(pStdDecoderModelInfo);
        stdOperatingPointCount(stdOperatingPointCount);
        pStdOperatingPoints(pStdOperatingPoints);
        return this;
    }

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR set(VkVideoEncodeAV1SessionParametersCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR malloc() {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR calloc() {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR create(long address) {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(address, null);
    }

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(address, null);
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

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoAV1SequenceHeader npStdSequenceHeader(long struct) {
        return StdVideoAV1SequenceHeader.create(MemoryUtil.memGetAddress(struct + PSTDSEQUENCEHEADER));
    }

    public static StdVideoEncodeAV1DecoderModelInfo npStdDecoderModelInfo(long struct) {
        return StdVideoEncodeAV1DecoderModelInfo.createSafe(MemoryUtil.memGetAddress(struct + PSTDDECODERMODELINFO));
    }

    public static int nstdOperatingPointCount(long struct) {
        return MemoryUtil.memGetInt(struct + STDOPERATINGPOINTCOUNT);
    }

    public static StdVideoEncodeAV1OperatingPointInfo.Buffer npStdOperatingPoints(long struct) {
        return StdVideoEncodeAV1OperatingPointInfo.createSafe(MemoryUtil.memGetAddress(struct + PSTDOPERATINGPOINTS), nstdOperatingPointCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdSequenceHeader(long struct, StdVideoAV1SequenceHeader value) {
        MemoryUtil.memPutAddress(struct + PSTDSEQUENCEHEADER, value.address());
    }

    public static void npStdDecoderModelInfo(long struct, StdVideoEncodeAV1DecoderModelInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDDECODERMODELINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void nstdOperatingPointCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDOPERATINGPOINTCOUNT, value);
    }

    public static void npStdOperatingPoints(long struct, StdVideoEncodeAV1OperatingPointInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDOPERATINGPOINTS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nstdOperatingPointCount(struct, value.remaining());
        }
    }

    public static void validate(long struct) {
        long pStdSequenceHeader = MemoryUtil.memGetAddress(struct + PSTDSEQUENCEHEADER);
        Checks.check(pStdSequenceHeader);
        StdVideoAV1SequenceHeader.validate(pStdSequenceHeader);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1SessionParametersCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1SessionParametersCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1SessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1SessionParametersCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1SessionParametersCreateInfoKHR.SIZEOF);
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
        public VkVideoEncodeAV1SessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeAV1SessionParametersCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeAV1SessionParametersCreateInfoKHR.npNext(address());
        }

        @NativeType("StdVideoAV1SequenceHeader const *")
        public StdVideoAV1SequenceHeader pStdSequenceHeader() {
            return VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdSequenceHeader(address());
        }

        @NativeType("StdVideoEncodeAV1DecoderModelInfo const *")
        public StdVideoEncodeAV1DecoderModelInfo pStdDecoderModelInfo() {
            return VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdDecoderModelInfo(address());
        }

        @NativeType("uint32_t")
        public int stdOperatingPointCount() {
            return VkVideoEncodeAV1SessionParametersCreateInfoKHR.nstdOperatingPointCount(address());
        }

        @NativeType("StdVideoEncodeAV1OperatingPointInfo const *")
        public StdVideoEncodeAV1OperatingPointInfo.Buffer pStdOperatingPoints() {
            return VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdOperatingPoints(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeAV1SessionParametersCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeAV1SessionParametersCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdSequenceHeader(@NativeType("StdVideoAV1SequenceHeader const *") StdVideoAV1SequenceHeader value) {
            VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdSequenceHeader(address(), value);
            return this;
        }

        public Buffer pStdDecoderModelInfo(@NativeType("StdVideoEncodeAV1DecoderModelInfo const *") StdVideoEncodeAV1DecoderModelInfo value) {
            VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdDecoderModelInfo(address(), value);
            return this;
        }

        public Buffer stdOperatingPointCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1SessionParametersCreateInfoKHR.nstdOperatingPointCount(address(), value);
            return this;
        }

        public Buffer pStdOperatingPoints(@NativeType("StdVideoEncodeAV1OperatingPointInfo const *") StdVideoEncodeAV1OperatingPointInfo.Buffer value) {
            VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdOperatingPoints(address(), value);
            return this;
        }
    }
}
