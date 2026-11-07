package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeAV1PictureInfoKHR.class */
public class VkVideoDecodeAV1PictureInfoKHR extends Struct<VkVideoDecodeAV1PictureInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDPICTUREINFO;
    public static final int REFERENCENAMESLOTINDICES;
    public static final int FRAMEHEADEROFFSET;
    public static final int TILECOUNT;
    public static final int PTILEOFFSETS;
    public static final int PTILESIZES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __array(4, 7), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDPICTUREINFO = layout.offsetof(2);
        REFERENCENAMESLOTINDICES = layout.offsetof(3);
        FRAMEHEADEROFFSET = layout.offsetof(4);
        TILECOUNT = layout.offsetof(5);
        PTILEOFFSETS = layout.offsetof(6);
        PTILESIZES = layout.offsetof(7);
    }

    protected VkVideoDecodeAV1PictureInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeAV1PictureInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeAV1PictureInfoKHR(address, container);
    }

    public VkVideoDecodeAV1PictureInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoDecodeAV1PictureInfo const *")
    public StdVideoDecodeAV1PictureInfo pStdPictureInfo() {
        return npStdPictureInfo(address());
    }

    @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
    public IntBuffer referenceNameSlotIndices() {
        return nreferenceNameSlotIndices(address());
    }

    @NativeType("int32_t")
    public int referenceNameSlotIndices(int index) {
        return nreferenceNameSlotIndices(address(), index);
    }

    @NativeType("uint32_t")
    public int frameHeaderOffset() {
        return nframeHeaderOffset(address());
    }

    @NativeType("uint32_t")
    public int tileCount() {
        return ntileCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pTileOffsets() {
        return npTileOffsets(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pTileSizes() {
        return npTileSizes(address());
    }

    public VkVideoDecodeAV1PictureInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeAV1PictureInfoKHR sType$Default() {
        return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR);
    }

    public VkVideoDecodeAV1PictureInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeAV1PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoDecodeAV1PictureInfo const *") StdVideoDecodeAV1PictureInfo value) {
        npStdPictureInfo(address(), value);
        return this;
    }

    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) {
        nreferenceNameSlotIndices(address(), value);
        return this;
    }

    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(int index, @NativeType("int32_t") int value) {
        nreferenceNameSlotIndices(address(), index, value);
        return this;
    }

    public VkVideoDecodeAV1PictureInfoKHR frameHeaderOffset(@NativeType("uint32_t") int value) {
        nframeHeaderOffset(address(), value);
        return this;
    }

    public VkVideoDecodeAV1PictureInfoKHR tileCount(@NativeType("uint32_t") int value) {
        ntileCount(address(), value);
        return this;
    }

    public VkVideoDecodeAV1PictureInfoKHR pTileOffsets(@NativeType("uint32_t const *") IntBuffer value) {
        npTileOffsets(address(), value);
        return this;
    }

    public VkVideoDecodeAV1PictureInfoKHR pTileSizes(@NativeType("uint32_t const *") IntBuffer value) {
        npTileSizes(address(), value);
        return this;
    }

    public VkVideoDecodeAV1PictureInfoKHR set(int sType, long pNext, StdVideoDecodeAV1PictureInfo pStdPictureInfo, IntBuffer referenceNameSlotIndices, int frameHeaderOffset, int tileCount, IntBuffer pTileOffsets, IntBuffer pTileSizes) {
        sType(sType);
        pNext(pNext);
        pStdPictureInfo(pStdPictureInfo);
        referenceNameSlotIndices(referenceNameSlotIndices);
        frameHeaderOffset(frameHeaderOffset);
        tileCount(tileCount);
        pTileOffsets(pTileOffsets);
        pTileSizes(pTileSizes);
        return this;
    }

    public VkVideoDecodeAV1PictureInfoKHR set(VkVideoDecodeAV1PictureInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeAV1PictureInfoKHR malloc() {
        return new VkVideoDecodeAV1PictureInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeAV1PictureInfoKHR calloc() {
        return new VkVideoDecodeAV1PictureInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeAV1PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeAV1PictureInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeAV1PictureInfoKHR create(long address) {
        return new VkVideoDecodeAV1PictureInfoKHR(address, null);
    }

    public static VkVideoDecodeAV1PictureInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeAV1PictureInfoKHR(address, null);
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

    public static VkVideoDecodeAV1PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeAV1PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeAV1PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeAV1PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoDecodeAV1PictureInfo npStdPictureInfo(long struct) {
        return StdVideoDecodeAV1PictureInfo.create(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
    }

    public static IntBuffer nreferenceNameSlotIndices(long struct) {
        return MemoryUtil.memIntBuffer(struct + REFERENCENAMESLOTINDICES, 7);
    }

    public static int nreferenceNameSlotIndices(long struct, int index) {
        return MemoryUtil.memGetInt(struct + REFERENCENAMESLOTINDICES + (Checks.check(index, 7) * 4));
    }

    public static int nframeHeaderOffset(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMEHEADEROFFSET);
    }

    public static int ntileCount(long struct) {
        return MemoryUtil.memGetInt(struct + TILECOUNT);
    }

    public static IntBuffer npTileOffsets(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PTILEOFFSETS), ntileCount(struct));
    }

    public static IntBuffer npTileSizes(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PTILESIZES), ntileCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdPictureInfo(long struct, StdVideoDecodeAV1PictureInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDPICTUREINFO, value.address());
    }

    public static void nreferenceNameSlotIndices(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REFERENCENAMESLOTINDICES, value.remaining() * 4);
    }

    public static void nreferenceNameSlotIndices(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + REFERENCENAMESLOTINDICES + (Checks.check(index, 7) * 4), value);
    }

    public static void nframeHeaderOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAMEHEADEROFFSET, value);
    }

    public static void ntileCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILECOUNT, value);
    }

    public static void npTileOffsets(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PTILEOFFSETS, MemoryUtil.memAddress(value));
    }

    public static void npTileSizes(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PTILESIZES, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        long pStdPictureInfo = MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO);
        Checks.check(pStdPictureInfo);
        StdVideoDecodeAV1PictureInfo.validate(pStdPictureInfo);
        Checks.check(MemoryUtil.memGetAddress(struct + PTILEOFFSETS));
        Checks.check(MemoryUtil.memGetAddress(struct + PTILESIZES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeAV1PictureInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeAV1PictureInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeAV1PictureInfoKHR ELEMENT_FACTORY = VkVideoDecodeAV1PictureInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeAV1PictureInfoKHR.SIZEOF);
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
        public VkVideoDecodeAV1PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeAV1PictureInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeAV1PictureInfoKHR.npNext(address());
        }

        @NativeType("StdVideoDecodeAV1PictureInfo const *")
        public StdVideoDecodeAV1PictureInfo pStdPictureInfo() {
            return VkVideoDecodeAV1PictureInfoKHR.npStdPictureInfo(address());
        }

        @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
        public IntBuffer referenceNameSlotIndices() {
            return VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address());
        }

        @NativeType("int32_t")
        public int referenceNameSlotIndices(int index) {
            return VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index);
        }

        @NativeType("uint32_t")
        public int frameHeaderOffset() {
            return VkVideoDecodeAV1PictureInfoKHR.nframeHeaderOffset(address());
        }

        @NativeType("uint32_t")
        public int tileCount() {
            return VkVideoDecodeAV1PictureInfoKHR.ntileCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pTileOffsets() {
            return VkVideoDecodeAV1PictureInfoKHR.npTileOffsets(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pTileSizes() {
            return VkVideoDecodeAV1PictureInfoKHR.npTileSizes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeAV1PictureInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeAV1PictureInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdPictureInfo(@NativeType("StdVideoDecodeAV1PictureInfo const *") StdVideoDecodeAV1PictureInfo value) {
            VkVideoDecodeAV1PictureInfoKHR.npStdPictureInfo(address(), value);
            return this;
        }

        public Buffer referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) {
            VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), value);
            return this;
        }

        public Buffer referenceNameSlotIndices(int index, @NativeType("int32_t") int value) {
            VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index, value);
            return this;
        }

        public Buffer frameHeaderOffset(@NativeType("uint32_t") int value) {
            VkVideoDecodeAV1PictureInfoKHR.nframeHeaderOffset(address(), value);
            return this;
        }

        public Buffer tileCount(@NativeType("uint32_t") int value) {
            VkVideoDecodeAV1PictureInfoKHR.ntileCount(address(), value);
            return this;
        }

        public Buffer pTileOffsets(@NativeType("uint32_t const *") IntBuffer value) {
            VkVideoDecodeAV1PictureInfoKHR.npTileOffsets(address(), value);
            return this;
        }

        public Buffer pTileSizes(@NativeType("uint32_t const *") IntBuffer value) {
            VkVideoDecodeAV1PictureInfoKHR.npTileSizes(address(), value);
            return this;
        }
    }
}
