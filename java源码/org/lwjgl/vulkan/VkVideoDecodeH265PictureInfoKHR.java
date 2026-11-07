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
import org.lwjgl.vulkan.video.StdVideoDecodeH265PictureInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265PictureInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265PictureInfoKHR.class */
public class VkVideoDecodeH265PictureInfoKHR extends Struct<VkVideoDecodeH265PictureInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDPICTUREINFO;
    public static final int SLICESEGMENTCOUNT;
    public static final int PSLICESEGMENTOFFSETS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDPICTUREINFO = layout.offsetof(2);
        SLICESEGMENTCOUNT = layout.offsetof(3);
        PSLICESEGMENTOFFSETS = layout.offsetof(4);
    }

    protected VkVideoDecodeH265PictureInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH265PictureInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH265PictureInfoKHR(address, container);
    }

    public VkVideoDecodeH265PictureInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoDecodeH265PictureInfo const *")
    public StdVideoDecodeH265PictureInfo pStdPictureInfo() {
        return npStdPictureInfo(address());
    }

    @NativeType("uint32_t")
    public int sliceSegmentCount() {
        return nsliceSegmentCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pSliceSegmentOffsets() {
        return npSliceSegmentOffsets(address());
    }

    public VkVideoDecodeH265PictureInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH265PictureInfoKHR sType$Default() {
        return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR);
    }

    public VkVideoDecodeH265PictureInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH265PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoDecodeH265PictureInfo const *") StdVideoDecodeH265PictureInfo value) {
        npStdPictureInfo(address(), value);
        return this;
    }

    public VkVideoDecodeH265PictureInfoKHR pSliceSegmentOffsets(@NativeType("uint32_t const *") IntBuffer value) {
        npSliceSegmentOffsets(address(), value);
        return this;
    }

    public VkVideoDecodeH265PictureInfoKHR set(int sType, long pNext, StdVideoDecodeH265PictureInfo pStdPictureInfo, IntBuffer pSliceSegmentOffsets) {
        sType(sType);
        pNext(pNext);
        pStdPictureInfo(pStdPictureInfo);
        pSliceSegmentOffsets(pSliceSegmentOffsets);
        return this;
    }

    public VkVideoDecodeH265PictureInfoKHR set(VkVideoDecodeH265PictureInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH265PictureInfoKHR malloc() {
        return new VkVideoDecodeH265PictureInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH265PictureInfoKHR calloc() {
        return new VkVideoDecodeH265PictureInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH265PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH265PictureInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH265PictureInfoKHR create(long address) {
        return new VkVideoDecodeH265PictureInfoKHR(address, null);
    }

    public static VkVideoDecodeH265PictureInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH265PictureInfoKHR(address, null);
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

    public static VkVideoDecodeH265PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH265PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH265PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH265PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoDecodeH265PictureInfo npStdPictureInfo(long struct) {
        return StdVideoDecodeH265PictureInfo.create(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
    }

    public static int nsliceSegmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + SLICESEGMENTCOUNT);
    }

    public static IntBuffer npSliceSegmentOffsets(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PSLICESEGMENTOFFSETS), nsliceSegmentCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdPictureInfo(long struct, StdVideoDecodeH265PictureInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDPICTUREINFO, value.address());
    }

    public static void nsliceSegmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SLICESEGMENTCOUNT, value);
    }

    public static void npSliceSegmentOffsets(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PSLICESEGMENTOFFSETS, MemoryUtil.memAddress(value));
        nsliceSegmentCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
        Checks.check(MemoryUtil.memGetAddress(struct + PSLICESEGMENTOFFSETS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265PictureInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265PictureInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265PictureInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH265PictureInfoKHR ELEMENT_FACTORY = VkVideoDecodeH265PictureInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH265PictureInfoKHR.SIZEOF);
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
        public VkVideoDecodeH265PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH265PictureInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeH265PictureInfoKHR.npNext(address());
        }

        @NativeType("StdVideoDecodeH265PictureInfo const *")
        public StdVideoDecodeH265PictureInfo pStdPictureInfo() {
            return VkVideoDecodeH265PictureInfoKHR.npStdPictureInfo(address());
        }

        @NativeType("uint32_t")
        public int sliceSegmentCount() {
            return VkVideoDecodeH265PictureInfoKHR.nsliceSegmentCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pSliceSegmentOffsets() {
            return VkVideoDecodeH265PictureInfoKHR.npSliceSegmentOffsets(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH265PictureInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeH265PictureInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdPictureInfo(@NativeType("StdVideoDecodeH265PictureInfo const *") StdVideoDecodeH265PictureInfo value) {
            VkVideoDecodeH265PictureInfoKHR.npStdPictureInfo(address(), value);
            return this;
        }

        public Buffer pSliceSegmentOffsets(@NativeType("uint32_t const *") IntBuffer value) {
            VkVideoDecodeH265PictureInfoKHR.npSliceSegmentOffsets(address(), value);
            return this;
        }
    }
}
