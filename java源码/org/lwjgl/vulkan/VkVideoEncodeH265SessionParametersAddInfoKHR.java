package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet;
import org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet;
import org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersAddInfoKHR.class */
public class VkVideoEncodeH265SessionParametersAddInfoKHR extends Struct<VkVideoEncodeH265SessionParametersAddInfoKHR> implements NativeResource {
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

    protected VkVideoEncodeH265SessionParametersAddInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265SessionParametersAddInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(address, container);
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR(ByteBuffer container) {
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

    public VkVideoEncodeH265SessionParametersAddInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR sType$Default() {
        return sType(1000039002);
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR stdVPSCount(@NativeType("uint32_t") int value) {
        nstdVPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR pStdVPSs(@NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet.Buffer value) {
        npStdVPSs(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR stdSPSCount(@NativeType("uint32_t") int value) {
        nstdSPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR pStdSPSs(@NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet.Buffer value) {
        npStdSPSs(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR stdPPSCount(@NativeType("uint32_t") int value) {
        nstdPPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR pStdPPSs(@NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet.Buffer value) {
        npStdPPSs(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR set(int sType, long pNext, int stdVPSCount, StdVideoH265VideoParameterSet.Buffer pStdVPSs, int stdSPSCount, StdVideoH265SequenceParameterSet.Buffer pStdSPSs, int stdPPSCount, StdVideoH265PictureParameterSet.Buffer pStdPPSs) {
        sType(sType);
        pNext(pNext);
        stdVPSCount(stdVPSCount);
        pStdVPSs(pStdVPSs);
        stdSPSCount(stdSPSCount);
        pStdSPSs(pStdSPSs);
        stdPPSCount(stdPPSCount);
        pStdPPSs(pStdPPSs);
        return this;
    }

    public VkVideoEncodeH265SessionParametersAddInfoKHR set(VkVideoEncodeH265SessionParametersAddInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265SessionParametersAddInfoKHR malloc() {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersAddInfoKHR calloc() {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersAddInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265SessionParametersAddInfoKHR create(long address) {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(address, null);
    }

    public static VkVideoEncodeH265SessionParametersAddInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(address, null);
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

    public static VkVideoEncodeH265SessionParametersAddInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersAddInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
        if (value != null) {
            nstdVPSCount(struct, value.remaining());
        }
    }

    public static void nstdSPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDSPSCOUNT, value);
    }

    public static void npStdSPSs(long struct, StdVideoH265SequenceParameterSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDSPSS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nstdSPSCount(struct, value.remaining());
        }
    }

    public static void nstdPPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDPPSCOUNT, value);
    }

    public static void npStdPPSs(long struct, StdVideoH265PictureParameterSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDPPSS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nstdPPSCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersAddInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersAddInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265SessionParametersAddInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersAddInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265SessionParametersAddInfoKHR.SIZEOF);
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
        public VkVideoEncodeH265SessionParametersAddInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265SessionParametersAddInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265SessionParametersAddInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int stdVPSCount() {
            return VkVideoEncodeH265SessionParametersAddInfoKHR.nstdVPSCount(address());
        }

        @NativeType("StdVideoH265VideoParameterSet const *")
        public StdVideoH265VideoParameterSet.Buffer pStdVPSs() {
            return VkVideoEncodeH265SessionParametersAddInfoKHR.npStdVPSs(address());
        }

        @NativeType("uint32_t")
        public int stdSPSCount() {
            return VkVideoEncodeH265SessionParametersAddInfoKHR.nstdSPSCount(address());
        }

        @NativeType("StdVideoH265SequenceParameterSet const *")
        public StdVideoH265SequenceParameterSet.Buffer pStdSPSs() {
            return VkVideoEncodeH265SessionParametersAddInfoKHR.npStdSPSs(address());
        }

        @NativeType("uint32_t")
        public int stdPPSCount() {
            return VkVideoEncodeH265SessionParametersAddInfoKHR.nstdPPSCount(address());
        }

        @NativeType("StdVideoH265PictureParameterSet const *")
        public StdVideoH265PictureParameterSet.Buffer pStdPPSs() {
            return VkVideoEncodeH265SessionParametersAddInfoKHR.npStdPPSs(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265SessionParametersAddInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265SessionParametersAddInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer stdVPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersAddInfoKHR.nstdVPSCount(address(), value);
            return this;
        }

        public Buffer pStdVPSs(@NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet.Buffer value) {
            VkVideoEncodeH265SessionParametersAddInfoKHR.npStdVPSs(address(), value);
            return this;
        }

        public Buffer stdSPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersAddInfoKHR.nstdSPSCount(address(), value);
            return this;
        }

        public Buffer pStdSPSs(@NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet.Buffer value) {
            VkVideoEncodeH265SessionParametersAddInfoKHR.npStdSPSs(address(), value);
            return this;
        }

        public Buffer stdPPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersAddInfoKHR.nstdPPSCount(address(), value);
            return this;
        }

        public Buffer pStdPPSs(@NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet.Buffer value) {
            VkVideoEncodeH265SessionParametersAddInfoKHR.npStdPPSs(address(), value);
            return this;
        }
    }
}
