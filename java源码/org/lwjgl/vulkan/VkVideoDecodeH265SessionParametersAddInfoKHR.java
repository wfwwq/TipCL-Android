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
import org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet;
import org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet;
import org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265SessionParametersAddInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265SessionParametersAddInfoKHR.class */
public class VkVideoDecodeH265SessionParametersAddInfoKHR extends Struct<VkVideoDecodeH265SessionParametersAddInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STDVPSCOUNT;
    public static final int PSTDVPSS;
    public static final int STDSPSCOUNT;
    public static final int PSTDSPSS;
    public static final int STDPPSCOUNT;
    public static final int PSTDPPSS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDVPSCOUNT = layout.offsetof(2);
        PSTDVPSS = layout.offsetof(3);
        STDSPSCOUNT = layout.offsetof(4);
        PSTDSPSS = layout.offsetof(5);
        STDPPSCOUNT = layout.offsetof(6);
        PSTDPPSS = layout.offsetof(7);
    }

    protected VkVideoDecodeH265SessionParametersAddInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH265SessionParametersAddInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(address, container);
    }

    public VkVideoDecodeH265SessionParametersAddInfoKHR(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int stdVPSCount() {
        return nstdVPSCount(address());
    }

    @NativeType("StdVideoH265VideoParameterSet const *")
    public StdVideoH265VideoParameterSet.Buffer pStdVPSs() {
        return npStdVPSs(address());
    }

    @NativeType("uint32_t")
    public int stdSPSCount() {
        return nstdSPSCount(address());
    }

    @NativeType("StdVideoH265SequenceParameterSet const *")
    public StdVideoH265SequenceParameterSet.Buffer pStdSPSs() {
        return npStdSPSs(address());
    }

    @NativeType("uint32_t")
    public int stdPPSCount() {
        return nstdPPSCount(address());
    }

    @NativeType("StdVideoH265PictureParameterSet const *")
    public StdVideoH265PictureParameterSet.Buffer pStdPPSs() {
        return npStdPPSs(address());
    }

    public VkVideoDecodeH265SessionParametersAddInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersAddInfoKHR sType$Default() {
        return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR);
    }

    public VkVideoDecodeH265SessionParametersAddInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdVPSs(@NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet.Buffer value) {
        npStdVPSs(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdSPSs(@NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet.Buffer value) {
        npStdSPSs(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdPPSs(@NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet.Buffer value) {
        npStdPPSs(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersAddInfoKHR set(int sType, long pNext, StdVideoH265VideoParameterSet.Buffer pStdVPSs, StdVideoH265SequenceParameterSet.Buffer pStdSPSs, StdVideoH265PictureParameterSet.Buffer pStdPPSs) {
        sType(sType);
        pNext(pNext);
        pStdVPSs(pStdVPSs);
        pStdSPSs(pStdSPSs);
        pStdPPSs(pStdPPSs);
        return this;
    }

    public VkVideoDecodeH265SessionParametersAddInfoKHR set(VkVideoDecodeH265SessionParametersAddInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH265SessionParametersAddInfoKHR malloc() {
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH265SessionParametersAddInfoKHR calloc() {
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH265SessionParametersAddInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH265SessionParametersAddInfoKHR create(long address) {
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(address, null);
    }

    public static VkVideoDecodeH265SessionParametersAddInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(address, null);
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

    public static VkVideoDecodeH265SessionParametersAddInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH265SessionParametersAddInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstdVPSCount(long struct) {
        return MemoryUtil.memGetInt(struct + STDVPSCOUNT);
    }

    public static StdVideoH265VideoParameterSet.Buffer npStdVPSs(long struct) {
        return StdVideoH265VideoParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDVPSS), nstdVPSCount(struct));
    }

    public static int nstdSPSCount(long struct) {
        return MemoryUtil.memGetInt(struct + STDSPSCOUNT);
    }

    public static StdVideoH265SequenceParameterSet.Buffer npStdSPSs(long struct) {
        return StdVideoH265SequenceParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDSPSS), nstdSPSCount(struct));
    }

    public static int nstdPPSCount(long struct) {
        return MemoryUtil.memGetInt(struct + STDPPSCOUNT);
    }

    public static StdVideoH265PictureParameterSet.Buffer npStdPPSs(long struct) {
        return StdVideoH265PictureParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDPPSS), nstdPPSCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstdVPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDVPSCOUNT, value);
    }

    public static void npStdVPSs(long struct, StdVideoH265VideoParameterSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDVPSS, MemoryUtil.memAddressSafe(value));
        nstdVPSCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nstdSPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDSPSCOUNT, value);
    }

    public static void npStdSPSs(long struct, StdVideoH265SequenceParameterSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDSPSS, MemoryUtil.memAddressSafe(value));
        nstdSPSCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nstdPPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDPPSCOUNT, value);
    }

    public static void npStdPPSs(long struct, StdVideoH265PictureParameterSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDPPSS, MemoryUtil.memAddressSafe(value));
        nstdPPSCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        int stdVPSCount = nstdVPSCount(struct);
        if (stdVPSCount != 0) {
            long pStdVPSs = MemoryUtil.memGetAddress(struct + PSTDVPSS);
            Checks.check(pStdVPSs);
            validate(pStdVPSs, stdVPSCount, StdVideoH265VideoParameterSet.SIZEOF, StdVideoH265VideoParameterSet::validate);
        }
        int stdSPSCount = nstdSPSCount(struct);
        if (stdSPSCount != 0) {
            long pStdSPSs = MemoryUtil.memGetAddress(struct + PSTDSPSS);
            Checks.check(pStdSPSs);
            validate(pStdSPSs, stdSPSCount, StdVideoH265SequenceParameterSet.SIZEOF, StdVideoH265SequenceParameterSet::validate);
        }
        int stdPPSCount = nstdPPSCount(struct);
        if (stdPPSCount != 0) {
            long pStdPPSs = MemoryUtil.memGetAddress(struct + PSTDPPSS);
            Checks.check(pStdPPSs);
            validate(pStdPPSs, stdPPSCount, StdVideoH265PictureParameterSet.SIZEOF, StdVideoH265PictureParameterSet::validate);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265SessionParametersAddInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265SessionParametersAddInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265SessionParametersAddInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH265SessionParametersAddInfoKHR ELEMENT_FACTORY = VkVideoDecodeH265SessionParametersAddInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH265SessionParametersAddInfoKHR.SIZEOF);
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
        public VkVideoDecodeH265SessionParametersAddInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH265SessionParametersAddInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeH265SessionParametersAddInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int stdVPSCount() {
            return VkVideoDecodeH265SessionParametersAddInfoKHR.nstdVPSCount(address());
        }

        @NativeType("StdVideoH265VideoParameterSet const *")
        public StdVideoH265VideoParameterSet.Buffer pStdVPSs() {
            return VkVideoDecodeH265SessionParametersAddInfoKHR.npStdVPSs(address());
        }

        @NativeType("uint32_t")
        public int stdSPSCount() {
            return VkVideoDecodeH265SessionParametersAddInfoKHR.nstdSPSCount(address());
        }

        @NativeType("StdVideoH265SequenceParameterSet const *")
        public StdVideoH265SequenceParameterSet.Buffer pStdSPSs() {
            return VkVideoDecodeH265SessionParametersAddInfoKHR.npStdSPSs(address());
        }

        @NativeType("uint32_t")
        public int stdPPSCount() {
            return VkVideoDecodeH265SessionParametersAddInfoKHR.nstdPPSCount(address());
        }

        @NativeType("StdVideoH265PictureParameterSet const *")
        public StdVideoH265PictureParameterSet.Buffer pStdPPSs() {
            return VkVideoDecodeH265SessionParametersAddInfoKHR.npStdPPSs(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH265SessionParametersAddInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeH265SessionParametersAddInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdVPSs(@NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet.Buffer value) {
            VkVideoDecodeH265SessionParametersAddInfoKHR.npStdVPSs(address(), value);
            return this;
        }

        public Buffer pStdSPSs(@NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet.Buffer value) {
            VkVideoDecodeH265SessionParametersAddInfoKHR.npStdSPSs(address(), value);
            return this;
        }

        public Buffer pStdPPSs(@NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet.Buffer value) {
            VkVideoDecodeH265SessionParametersAddInfoKHR.npStdPPSs(address(), value);
            return this;
        }
    }
}
