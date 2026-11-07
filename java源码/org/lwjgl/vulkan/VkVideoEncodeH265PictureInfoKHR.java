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
import org.lwjgl.vulkan.VkVideoEncodeH265NaluSliceSegmentInfoKHR;
import org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265PictureInfoKHR.class */
public class VkVideoEncodeH265PictureInfoKHR extends Struct<VkVideoEncodeH265PictureInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int NALUSLICESEGMENTENTRYCOUNT;
    public static final int PNALUSLICESEGMENTENTRIES;
    public static final int PSTDPICTUREINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NALUSLICESEGMENTENTRYCOUNT = layout.offsetof(2);
        PNALUSLICESEGMENTENTRIES = layout.offsetof(3);
        PSTDPICTUREINFO = layout.offsetof(4);
    }

    protected VkVideoEncodeH265PictureInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265PictureInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265PictureInfoKHR(address, container);
    }

    public VkVideoEncodeH265PictureInfoKHR(ByteBuffer container) {
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
    public int naluSliceSegmentEntryCount() {
        return nnaluSliceSegmentEntryCount(address());
    }

    @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *")
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pNaluSliceSegmentEntries() {
        return npNaluSliceSegmentEntries(address());
    }

    @NativeType("StdVideoEncodeH265PictureInfo const *")
    public StdVideoEncodeH265PictureInfo pStdPictureInfo() {
        return npStdPictureInfo(address());
    }

    public VkVideoEncodeH265PictureInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265PictureInfoKHR sType$Default() {
        return sType(1000039003);
    }

    public VkVideoEncodeH265PictureInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *") VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer value) {
        npNaluSliceSegmentEntries(address(), value);
        return this;
    }

    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) {
        npStdPictureInfo(address(), value);
        return this;
    }

    public VkVideoEncodeH265PictureInfoKHR set(int sType, long pNext, VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pNaluSliceSegmentEntries, StdVideoEncodeH265PictureInfo pStdPictureInfo) {
        sType(sType);
        pNext(pNext);
        pNaluSliceSegmentEntries(pNaluSliceSegmentEntries);
        pStdPictureInfo(pStdPictureInfo);
        return this;
    }

    public VkVideoEncodeH265PictureInfoKHR set(VkVideoEncodeH265PictureInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265PictureInfoKHR malloc() {
        return new VkVideoEncodeH265PictureInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265PictureInfoKHR calloc() {
        return new VkVideoEncodeH265PictureInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265PictureInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265PictureInfoKHR create(long address) {
        return new VkVideoEncodeH265PictureInfoKHR(address, null);
    }

    public static VkVideoEncodeH265PictureInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265PictureInfoKHR(address, null);
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

    public static VkVideoEncodeH265PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nnaluSliceSegmentEntryCount(long struct) {
        return MemoryUtil.memGetInt(struct + NALUSLICESEGMENTENTRYCOUNT);
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer npNaluSliceSegmentEntries(long struct) {
        return VkVideoEncodeH265NaluSliceSegmentInfoKHR.create(MemoryUtil.memGetAddress(struct + PNALUSLICESEGMENTENTRIES), nnaluSliceSegmentEntryCount(struct));
    }

    public static StdVideoEncodeH265PictureInfo npStdPictureInfo(long struct) {
        return StdVideoEncodeH265PictureInfo.create(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nnaluSliceSegmentEntryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + NALUSLICESEGMENTENTRYCOUNT, value);
    }

    public static void npNaluSliceSegmentEntries(long struct, VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PNALUSLICESEGMENTENTRIES, value.address());
        nnaluSliceSegmentEntryCount(struct, value.remaining());
    }

    public static void npStdPictureInfo(long struct, StdVideoEncodeH265PictureInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDPICTUREINFO, value.address());
    }

    public static void validate(long struct) {
        int naluSliceSegmentEntryCount = nnaluSliceSegmentEntryCount(struct);
        long pNaluSliceSegmentEntries = MemoryUtil.memGetAddress(struct + PNALUSLICESEGMENTENTRIES);
        Checks.check(pNaluSliceSegmentEntries);
        validate(pNaluSliceSegmentEntries, naluSliceSegmentEntryCount, VkVideoEncodeH265NaluSliceSegmentInfoKHR.SIZEOF, VkVideoEncodeH265NaluSliceSegmentInfoKHR::validate);
        long pStdPictureInfo = MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO);
        Checks.check(pStdPictureInfo);
        StdVideoEncodeH265PictureInfo.validate(pStdPictureInfo);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265PictureInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265PictureInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265PictureInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265PictureInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265PictureInfoKHR.SIZEOF);
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
        public VkVideoEncodeH265PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265PictureInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265PictureInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int naluSliceSegmentEntryCount() {
            return VkVideoEncodeH265PictureInfoKHR.nnaluSliceSegmentEntryCount(address());
        }

        @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *")
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pNaluSliceSegmentEntries() {
            return VkVideoEncodeH265PictureInfoKHR.npNaluSliceSegmentEntries(address());
        }

        @NativeType("StdVideoEncodeH265PictureInfo const *")
        public StdVideoEncodeH265PictureInfo pStdPictureInfo() {
            return VkVideoEncodeH265PictureInfoKHR.npStdPictureInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265PictureInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265PictureInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *") VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer value) {
            VkVideoEncodeH265PictureInfoKHR.npNaluSliceSegmentEntries(address(), value);
            return this;
        }

        public Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) {
            VkVideoEncodeH265PictureInfoKHR.npStdPictureInfo(address(), value);
            return this;
        }
    }
}
