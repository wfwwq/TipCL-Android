package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet;
import org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersAddInfoEXT.class */
public class VkVideoEncodeH264SessionParametersAddInfoEXT extends Struct<VkVideoEncodeH264SessionParametersAddInfoEXT> implements NativeResource {
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

    protected VkVideoEncodeH264SessionParametersAddInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264SessionParametersAddInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(address, container);
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT(ByteBuffer container) {
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

    @Nullable
    @NativeType("StdVideoH264SequenceParameterSet const *")
    public StdVideoH264SequenceParameterSet.Buffer pStdSPSs() {
        return npStdSPSs(address());
    }

    @NativeType("uint32_t")
    public int stdPPSCount() {
        return nstdPPSCount(address());
    }

    @Nullable
    @NativeType("StdVideoH264PictureParameterSet const *")
    public StdVideoH264PictureParameterSet.Buffer pStdPPSs() {
        return npStdPPSs(address());
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT sType$Default() {
        return sType(1000038002);
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT stdSPSCount(@NativeType("uint32_t") int value) {
        nstdSPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT pStdSPSs(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) {
        npStdSPSs(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT stdPPSCount(@NativeType("uint32_t") int value) {
        nstdPPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT pStdPPSs(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) {
        npStdPPSs(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT set(int sType, long pNext, int stdSPSCount, @Nullable StdVideoH264SequenceParameterSet.Buffer pStdSPSs, int stdPPSCount, @Nullable StdVideoH264PictureParameterSet.Buffer pStdPPSs) {
        sType(sType);
        pNext(pNext);
        stdSPSCount(stdSPSCount);
        pStdSPSs(pStdSPSs);
        stdPPSCount(stdPPSCount);
        pStdPPSs(pStdPPSs);
        return this;
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT set(VkVideoEncodeH264SessionParametersAddInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264SessionParametersAddInfoEXT malloc() {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersAddInfoEXT calloc() {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersAddInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264SessionParametersAddInfoEXT create(long address) {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264SessionParametersAddInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkVideoEncodeH264SessionParametersAddInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersAddInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return UNSAFE.getInt((Object) null, struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nstdSPSCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + STDSPSCOUNT);
    }

    @Nullable
    public static StdVideoH264SequenceParameterSet.Buffer npStdSPSs(long struct) {
        return StdVideoH264SequenceParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDSPSS), nstdSPSCount(struct));
    }

    public static int nstdPPSCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + STDPPSCOUNT);
    }

    @Nullable
    public static StdVideoH264PictureParameterSet.Buffer npStdPPSs(long struct) {
        return StdVideoH264PictureParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDPPSS), nstdPPSCount(struct));
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstdSPSCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STDSPSCOUNT, value);
    }

    public static void npStdSPSs(long struct, @Nullable StdVideoH264SequenceParameterSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDSPSS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nstdSPSCount(struct, value.remaining());
        }
    }

    public static void nstdPPSCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STDPPSCOUNT, value);
    }

    public static void npStdPPSs(long struct, @Nullable StdVideoH264PictureParameterSet.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTDPPSS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nstdPPSCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersAddInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264SessionParametersAddInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersAddInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkVideoEncodeH264SessionParametersAddInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264SessionParametersAddInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264SessionParametersAddInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int stdSPSCount() {
            return VkVideoEncodeH264SessionParametersAddInfoEXT.nstdSPSCount(address());
        }

        @Nullable
        @NativeType("StdVideoH264SequenceParameterSet const *")
        public StdVideoH264SequenceParameterSet.Buffer pStdSPSs() {
            return VkVideoEncodeH264SessionParametersAddInfoEXT.npStdSPSs(address());
        }

        @NativeType("uint32_t")
        public int stdPPSCount() {
            return VkVideoEncodeH264SessionParametersAddInfoEXT.nstdPPSCount(address());
        }

        @Nullable
        @NativeType("StdVideoH264PictureParameterSet const *")
        public StdVideoH264PictureParameterSet.Buffer pStdPPSs() {
            return VkVideoEncodeH264SessionParametersAddInfoEXT.npStdPPSs(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264SessionParametersAddInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264SessionParametersAddInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer stdSPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264SessionParametersAddInfoEXT.nstdSPSCount(address(), value);
            return this;
        }

        public Buffer pStdSPSs(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) {
            VkVideoEncodeH264SessionParametersAddInfoEXT.npStdSPSs(address(), value);
            return this;
        }

        public Buffer stdPPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264SessionParametersAddInfoEXT.nstdPPSCount(address(), value);
            return this;
        }

        public Buffer pStdPPSs(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) {
            VkVideoEncodeH264SessionParametersAddInfoEXT.npStdPPSs(address(), value);
            return this;
        }
    }
}
