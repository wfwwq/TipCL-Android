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
import org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeVP9PictureInfoKHR.class */
public class VkVideoDecodeVP9PictureInfoKHR extends Struct<VkVideoDecodeVP9PictureInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDPICTUREINFO;
    public static final int REFERENCENAMESLOTINDICES;
    public static final int UNCOMPRESSEDHEADEROFFSET;
    public static final int COMPRESSEDHEADEROFFSET;
    public static final int TILESOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __array(4, 3), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDPICTUREINFO = layout.offsetof(2);
        REFERENCENAMESLOTINDICES = layout.offsetof(3);
        UNCOMPRESSEDHEADEROFFSET = layout.offsetof(4);
        COMPRESSEDHEADEROFFSET = layout.offsetof(5);
        TILESOFFSET = layout.offsetof(6);
    }

    protected VkVideoDecodeVP9PictureInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeVP9PictureInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeVP9PictureInfoKHR(address, container);
    }

    public VkVideoDecodeVP9PictureInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoDecodeVP9PictureInfo const *")
    public StdVideoDecodeVP9PictureInfo pStdPictureInfo() {
        return npStdPictureInfo(address());
    }

    @NativeType("int32_t[VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR]")
    public IntBuffer referenceNameSlotIndices() {
        return nreferenceNameSlotIndices(address());
    }

    @NativeType("int32_t")
    public int referenceNameSlotIndices(int index) {
        return nreferenceNameSlotIndices(address(), index);
    }

    @NativeType("uint32_t")
    public int uncompressedHeaderOffset() {
        return nuncompressedHeaderOffset(address());
    }

    @NativeType("uint32_t")
    public int compressedHeaderOffset() {
        return ncompressedHeaderOffset(address());
    }

    @NativeType("uint32_t")
    public int tilesOffset() {
        return ntilesOffset(address());
    }

    public VkVideoDecodeVP9PictureInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeVP9PictureInfoKHR sType$Default() {
        return sType(KHRVideoDecodeVP9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR);
    }

    public VkVideoDecodeVP9PictureInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeVP9PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoDecodeVP9PictureInfo const *") StdVideoDecodeVP9PictureInfo value) {
        npStdPictureInfo(address(), value);
        return this;
    }

    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR]") IntBuffer value) {
        nreferenceNameSlotIndices(address(), value);
        return this;
    }

    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndices(int index, @NativeType("int32_t") int value) {
        nreferenceNameSlotIndices(address(), index, value);
        return this;
    }

    public VkVideoDecodeVP9PictureInfoKHR uncompressedHeaderOffset(@NativeType("uint32_t") int value) {
        nuncompressedHeaderOffset(address(), value);
        return this;
    }

    public VkVideoDecodeVP9PictureInfoKHR compressedHeaderOffset(@NativeType("uint32_t") int value) {
        ncompressedHeaderOffset(address(), value);
        return this;
    }

    public VkVideoDecodeVP9PictureInfoKHR tilesOffset(@NativeType("uint32_t") int value) {
        ntilesOffset(address(), value);
        return this;
    }

    public VkVideoDecodeVP9PictureInfoKHR set(int sType, long pNext, StdVideoDecodeVP9PictureInfo pStdPictureInfo, IntBuffer referenceNameSlotIndices, int uncompressedHeaderOffset, int compressedHeaderOffset, int tilesOffset) {
        sType(sType);
        pNext(pNext);
        pStdPictureInfo(pStdPictureInfo);
        referenceNameSlotIndices(referenceNameSlotIndices);
        uncompressedHeaderOffset(uncompressedHeaderOffset);
        compressedHeaderOffset(compressedHeaderOffset);
        tilesOffset(tilesOffset);
        return this;
    }

    public VkVideoDecodeVP9PictureInfoKHR set(VkVideoDecodeVP9PictureInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeVP9PictureInfoKHR malloc() {
        return new VkVideoDecodeVP9PictureInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeVP9PictureInfoKHR calloc() {
        return new VkVideoDecodeVP9PictureInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeVP9PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeVP9PictureInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeVP9PictureInfoKHR create(long address) {
        return new VkVideoDecodeVP9PictureInfoKHR(address, null);
    }

    public static VkVideoDecodeVP9PictureInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeVP9PictureInfoKHR(address, null);
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

    public static VkVideoDecodeVP9PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeVP9PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeVP9PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeVP9PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoDecodeVP9PictureInfo npStdPictureInfo(long struct) {
        return StdVideoDecodeVP9PictureInfo.create(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
    }

    public static IntBuffer nreferenceNameSlotIndices(long struct) {
        return MemoryUtil.memIntBuffer(struct + REFERENCENAMESLOTINDICES, 3);
    }

    public static int nreferenceNameSlotIndices(long struct, int index) {
        return MemoryUtil.memGetInt(struct + REFERENCENAMESLOTINDICES + (Checks.check(index, 3) * 4));
    }

    public static int nuncompressedHeaderOffset(long struct) {
        return MemoryUtil.memGetInt(struct + UNCOMPRESSEDHEADEROFFSET);
    }

    public static int ncompressedHeaderOffset(long struct) {
        return MemoryUtil.memGetInt(struct + COMPRESSEDHEADEROFFSET);
    }

    public static int ntilesOffset(long struct) {
        return MemoryUtil.memGetInt(struct + TILESOFFSET);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdPictureInfo(long struct, StdVideoDecodeVP9PictureInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDPICTUREINFO, value.address());
    }

    public static void nreferenceNameSlotIndices(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + REFERENCENAMESLOTINDICES, value.remaining() * 4);
    }

    public static void nreferenceNameSlotIndices(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + REFERENCENAMESLOTINDICES + (Checks.check(index, 3) * 4), value);
    }

    public static void nuncompressedHeaderOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNCOMPRESSEDHEADEROFFSET, value);
    }

    public static void ncompressedHeaderOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPRESSEDHEADEROFFSET, value);
    }

    public static void ntilesOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESOFFSET, value);
    }

    public static void validate(long struct) {
        long pStdPictureInfo = MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO);
        Checks.check(pStdPictureInfo);
        StdVideoDecodeVP9PictureInfo.validate(pStdPictureInfo);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeVP9PictureInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeVP9PictureInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeVP9PictureInfoKHR ELEMENT_FACTORY = VkVideoDecodeVP9PictureInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeVP9PictureInfoKHR.SIZEOF);
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
        public VkVideoDecodeVP9PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeVP9PictureInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeVP9PictureInfoKHR.npNext(address());
        }

        @NativeType("StdVideoDecodeVP9PictureInfo const *")
        public StdVideoDecodeVP9PictureInfo pStdPictureInfo() {
            return VkVideoDecodeVP9PictureInfoKHR.npStdPictureInfo(address());
        }

        @NativeType("int32_t[VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR]")
        public IntBuffer referenceNameSlotIndices() {
            return VkVideoDecodeVP9PictureInfoKHR.nreferenceNameSlotIndices(address());
        }

        @NativeType("int32_t")
        public int referenceNameSlotIndices(int index) {
            return VkVideoDecodeVP9PictureInfoKHR.nreferenceNameSlotIndices(address(), index);
        }

        @NativeType("uint32_t")
        public int uncompressedHeaderOffset() {
            return VkVideoDecodeVP9PictureInfoKHR.nuncompressedHeaderOffset(address());
        }

        @NativeType("uint32_t")
        public int compressedHeaderOffset() {
            return VkVideoDecodeVP9PictureInfoKHR.ncompressedHeaderOffset(address());
        }

        @NativeType("uint32_t")
        public int tilesOffset() {
            return VkVideoDecodeVP9PictureInfoKHR.ntilesOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeVP9PictureInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeVP9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeVP9PictureInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdPictureInfo(@NativeType("StdVideoDecodeVP9PictureInfo const *") StdVideoDecodeVP9PictureInfo value) {
            VkVideoDecodeVP9PictureInfoKHR.npStdPictureInfo(address(), value);
            return this;
        }

        public Buffer referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR]") IntBuffer value) {
            VkVideoDecodeVP9PictureInfoKHR.nreferenceNameSlotIndices(address(), value);
            return this;
        }

        public Buffer referenceNameSlotIndices(int index, @NativeType("int32_t") int value) {
            VkVideoDecodeVP9PictureInfoKHR.nreferenceNameSlotIndices(address(), index, value);
            return this;
        }

        public Buffer uncompressedHeaderOffset(@NativeType("uint32_t") int value) {
            VkVideoDecodeVP9PictureInfoKHR.nuncompressedHeaderOffset(address(), value);
            return this;
        }

        public Buffer compressedHeaderOffset(@NativeType("uint32_t") int value) {
            VkVideoDecodeVP9PictureInfoKHR.ncompressedHeaderOffset(address(), value);
            return this;
        }

        public Buffer tilesOffset(@NativeType("uint32_t") int value) {
            VkVideoDecodeVP9PictureInfoKHR.ntilesOffset(address(), value);
            return this;
        }
    }
}
