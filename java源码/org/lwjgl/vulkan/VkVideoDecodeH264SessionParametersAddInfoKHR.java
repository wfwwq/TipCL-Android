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
import org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet;
import org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264SessionParametersAddInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264SessionParametersAddInfoKHR.class */
public class VkVideoDecodeH264SessionParametersAddInfoKHR extends Struct<VkVideoDecodeH264SessionParametersAddInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STDSPSCOUNT;
    public static final int PSTDSPSS;
    public static final int STDPPSCOUNT;
    public static final int PSTDPPSS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDSPSCOUNT = layout.offsetof(2);
        PSTDSPSS = layout.offsetof(3);
        STDPPSCOUNT = layout.offsetof(4);
        PSTDPPSS = layout.offsetof(5);
    }

    protected VkVideoDecodeH264SessionParametersAddInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH264SessionParametersAddInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(address, container);
    }

    public VkVideoDecodeH264SessionParametersAddInfoKHR(ByteBuffer container) {
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
    public int stdSPSCount() {
        return nstdSPSCount(address());
    }

    @NativeType("StdVideoH264SequenceParameterSet const *")
    public StdVideoH264SequenceParameterSet.Buffer pStdSPSs() {
        return npStdSPSs(address());
    }

    @NativeType("uint32_t")
    public int stdPPSCount() {
        return nstdPPSCount(address());
    }

    @NativeType("StdVideoH264PictureParameterSet const *")
    public StdVideoH264PictureParameterSet.Buffer pStdPPSs() {
        return npStdPPSs(address());
    }

    public VkVideoDecodeH264SessionParametersAddInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH264SessionParametersAddInfoKHR sType$Default() {
        return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR);
    }

    public VkVideoDecodeH264SessionParametersAddInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH264SessionParametersAddInfoKHR pStdSPSs(@NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) {
        npStdSPSs(address(), value);
        return this;
    }

    public VkVideoDecodeH264SessionParametersAddInfoKHR pStdPPSs(@NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) {
        npStdPPSs(address(), value);
        return this;
    }

    public VkVideoDecodeH264SessionParametersAddInfoKHR set(int sType, long pNext, StdVideoH264SequenceParameterSet.Buffer pStdSPSs, StdVideoH264PictureParameterSet.Buffer pStdPPSs) {
        sType(sType);
        pNext(pNext);
        pStdSPSs(pStdSPSs);
        pStdPPSs(pStdPPSs);
        return this;
    }

    public VkVideoDecodeH264SessionParametersAddInfoKHR set(VkVideoDecodeH264SessionParametersAddInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH264SessionParametersAddInfoKHR malloc() {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH264SessionParametersAddInfoKHR calloc() {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH264SessionParametersAddInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH264SessionParametersAddInfoKHR create(long address) {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(address, null);
    }

    public static VkVideoDecodeH264SessionParametersAddInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(address, null);
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

    public static VkVideoDecodeH264SessionParametersAddInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH264SessionParametersAddInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstdSPSCount(long struct) {
        return MemoryUtil.memGetInt(struct + STDSPSCOUNT);
    }

    public static StdVideoH264SequenceParameterSet.Buffer npStdSPSs(long struct) {
        return StdVideoH264SequenceParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDSPSS), nstdSPSCount(struct));
    }

    public static int nstdPPSCount(long struct) {
        return MemoryUtil.memGetInt(struct + STDPPSCOUNT);
    }

    public static StdVideoH264PictureParameterSet.Buffer npStdPPSs(long struct) {
        return StdVideoH264PictureParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDPPSS), nstdPPSCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstdSPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDSPSCOUNT, value);
    }

    public static void npStdSPSs(long struct, StdVideoH264SequenceParameterSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDSPSS, MemoryUtil.memAddressSafe(value));
        nstdSPSCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nstdPPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDPPSCOUNT, value);
    }

    public static void npStdPPSs(long struct, StdVideoH264PictureParameterSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDPPSS, MemoryUtil.memAddressSafe(value));
        nstdPPSCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        int stdSPSCount = nstdSPSCount(struct);
        if (stdSPSCount != 0) {
            long pStdSPSs = MemoryUtil.memGetAddress(struct + PSTDSPSS);
            Checks.check(pStdSPSs);
            validate(pStdSPSs, stdSPSCount, StdVideoH264SequenceParameterSet.SIZEOF, StdVideoH264SequenceParameterSet::validate);
        }
        int stdPPSCount = nstdPPSCount(struct);
        if (stdPPSCount != 0) {
            long pStdPPSs = MemoryUtil.memGetAddress(struct + PSTDPPSS);
            Checks.check(pStdPPSs);
            validate(pStdPPSs, stdPPSCount, StdVideoH264PictureParameterSet.SIZEOF, StdVideoH264PictureParameterSet::validate);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264SessionParametersAddInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264SessionParametersAddInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264SessionParametersAddInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH264SessionParametersAddInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264SessionParametersAddInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH264SessionParametersAddInfoKHR.SIZEOF);
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
        public VkVideoDecodeH264SessionParametersAddInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH264SessionParametersAddInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeH264SessionParametersAddInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int stdSPSCount() {
            return VkVideoDecodeH264SessionParametersAddInfoKHR.nstdSPSCount(address());
        }

        @NativeType("StdVideoH264SequenceParameterSet const *")
        public StdVideoH264SequenceParameterSet.Buffer pStdSPSs() {
            return VkVideoDecodeH264SessionParametersAddInfoKHR.npStdSPSs(address());
        }

        @NativeType("uint32_t")
        public int stdPPSCount() {
            return VkVideoDecodeH264SessionParametersAddInfoKHR.nstdPPSCount(address());
        }

        @NativeType("StdVideoH264PictureParameterSet const *")
        public StdVideoH264PictureParameterSet.Buffer pStdPPSs() {
            return VkVideoDecodeH264SessionParametersAddInfoKHR.npStdPPSs(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH264SessionParametersAddInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeH264SessionParametersAddInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdSPSs(@NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) {
            VkVideoDecodeH264SessionParametersAddInfoKHR.npStdSPSs(address(), value);
            return this;
        }

        public Buffer pStdPPSs(@NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) {
            VkVideoDecodeH264SessionParametersAddInfoKHR.npStdPPSs(address(), value);
            return this;
        }
    }
}
