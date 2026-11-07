package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet;
import org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersAddInfoKHR.class */
public class VkVideoEncodeH264SessionParametersAddInfoKHR extends Struct<VkVideoEncodeH264SessionParametersAddInfoKHR> implements NativeResource {
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

    protected VkVideoEncodeH264SessionParametersAddInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264SessionParametersAddInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersAddInfoKHR(address, container);
    }

    public VkVideoEncodeH264SessionParametersAddInfoKHR(ByteBuffer container) {
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

    public VkVideoEncodeH264SessionParametersAddInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoKHR sType$Default() {
        return sType(1000038002);
    }

    public VkVideoEncodeH264SessionParametersAddInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoKHR stdSPSCount(@NativeType("uint32_t") int value) {
        nstdSPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoKHR pStdSPSs(@NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) {
        npStdSPSs(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoKHR stdPPSCount(@NativeType("uint32_t") int value) {
        nstdPPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoKHR pStdPPSs(@NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) {
        npStdPPSs(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoKHR set(int sType, long pNext, int stdSPSCount, StdVideoH264SequenceParameterSet.Buffer pStdSPSs, int stdPPSCount, StdVideoH264PictureParameterSet.Buffer pStdPPSs) {
        sType(sType);
        pNext(pNext);
        stdSPSCount(stdSPSCount);
        pStdSPSs(pStdSPSs);
        stdPPSCount(stdPPSCount);
        pStdPPSs(pStdPPSs);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoKHR set(VkVideoEncodeH264SessionParametersAddInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264SessionParametersAddInfoKHR malloc() {
        return new VkVideoEncodeH264SessionParametersAddInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersAddInfoKHR calloc() {
        return new VkVideoEncodeH264SessionParametersAddInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersAddInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersAddInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264SessionParametersAddInfoKHR create(long address) {
        return new VkVideoEncodeH264SessionParametersAddInfoKHR(address, null);
    }

    public static VkVideoEncodeH264SessionParametersAddInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264SessionParametersAddInfoKHR(address, null);
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

    public static VkVideoEncodeH264SessionParametersAddInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersAddInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersAddInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersAddInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
        if (value != null) {
            nstdSPSCount(struct, value.remaining());
        }
    }

    public static void nstdPPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDPPSCOUNT, value);
    }

    public static void npStdPPSs(long struct, StdVideoH264PictureParameterSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDPPSS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nstdPPSCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersAddInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersAddInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264SessionParametersAddInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersAddInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264SessionParametersAddInfoKHR.SIZEOF);
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
        public VkVideoEncodeH264SessionParametersAddInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264SessionParametersAddInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264SessionParametersAddInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int stdSPSCount() {
            return VkVideoEncodeH264SessionParametersAddInfoKHR.nstdSPSCount(address());
        }

        @NativeType("StdVideoH264SequenceParameterSet const *")
        public StdVideoH264SequenceParameterSet.Buffer pStdSPSs() {
            return VkVideoEncodeH264SessionParametersAddInfoKHR.npStdSPSs(address());
        }

        @NativeType("uint32_t")
        public int stdPPSCount() {
            return VkVideoEncodeH264SessionParametersAddInfoKHR.nstdPPSCount(address());
        }

        @NativeType("StdVideoH264PictureParameterSet const *")
        public StdVideoH264PictureParameterSet.Buffer pStdPPSs() {
            return VkVideoEncodeH264SessionParametersAddInfoKHR.npStdPPSs(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264SessionParametersAddInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264SessionParametersAddInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer stdSPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264SessionParametersAddInfoKHR.nstdSPSCount(address(), value);
            return this;
        }

        public Buffer pStdSPSs(@NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) {
            VkVideoEncodeH264SessionParametersAddInfoKHR.npStdSPSs(address(), value);
            return this;
        }

        public Buffer stdPPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264SessionParametersAddInfoKHR.nstdPPSCount(address(), value);
            return this;
        }

        public Buffer pStdPPSs(@NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) {
            VkVideoEncodeH264SessionParametersAddInfoKHR.npStdPPSs(address(), value);
            return this;
        }
    }
}
