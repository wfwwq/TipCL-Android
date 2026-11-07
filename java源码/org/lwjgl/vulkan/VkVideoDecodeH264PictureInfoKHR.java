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
import org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264PictureInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264PictureInfoKHR.class */
public class VkVideoDecodeH264PictureInfoKHR extends Struct<VkVideoDecodeH264PictureInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDPICTUREINFO;
    public static final int SLICECOUNT;
    public static final int PSLICEOFFSETS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDPICTUREINFO = layout.offsetof(2);
        SLICECOUNT = layout.offsetof(3);
        PSLICEOFFSETS = layout.offsetof(4);
    }

    protected VkVideoDecodeH264PictureInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH264PictureInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH264PictureInfoKHR(address, container);
    }

    public VkVideoDecodeH264PictureInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoDecodeH264PictureInfo const *")
    public StdVideoDecodeH264PictureInfo pStdPictureInfo() {
        return npStdPictureInfo(address());
    }

    @NativeType("uint32_t")
    public int sliceCount() {
        return nsliceCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pSliceOffsets() {
        return npSliceOffsets(address());
    }

    public VkVideoDecodeH264PictureInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH264PictureInfoKHR sType$Default() {
        return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR);
    }

    public VkVideoDecodeH264PictureInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH264PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoDecodeH264PictureInfo const *") StdVideoDecodeH264PictureInfo value) {
        npStdPictureInfo(address(), value);
        return this;
    }

    public VkVideoDecodeH264PictureInfoKHR pSliceOffsets(@NativeType("uint32_t const *") IntBuffer value) {
        npSliceOffsets(address(), value);
        return this;
    }

    public VkVideoDecodeH264PictureInfoKHR set(int sType, long pNext, StdVideoDecodeH264PictureInfo pStdPictureInfo, IntBuffer pSliceOffsets) {
        sType(sType);
        pNext(pNext);
        pStdPictureInfo(pStdPictureInfo);
        pSliceOffsets(pSliceOffsets);
        return this;
    }

    public VkVideoDecodeH264PictureInfoKHR set(VkVideoDecodeH264PictureInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH264PictureInfoKHR malloc() {
        return new VkVideoDecodeH264PictureInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH264PictureInfoKHR calloc() {
        return new VkVideoDecodeH264PictureInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH264PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264PictureInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH264PictureInfoKHR create(long address) {
        return new VkVideoDecodeH264PictureInfoKHR(address, null);
    }

    public static VkVideoDecodeH264PictureInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH264PictureInfoKHR(address, null);
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

    public static VkVideoDecodeH264PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH264PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoDecodeH264PictureInfo npStdPictureInfo(long struct) {
        return StdVideoDecodeH264PictureInfo.create(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
    }

    public static int nsliceCount(long struct) {
        return MemoryUtil.memGetInt(struct + SLICECOUNT);
    }

    public static IntBuffer npSliceOffsets(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PSLICEOFFSETS), nsliceCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdPictureInfo(long struct, StdVideoDecodeH264PictureInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDPICTUREINFO, value.address());
    }

    public static void nsliceCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SLICECOUNT, value);
    }

    public static void npSliceOffsets(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PSLICEOFFSETS, MemoryUtil.memAddress(value));
        nsliceCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
        Checks.check(MemoryUtil.memGetAddress(struct + PSLICEOFFSETS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264PictureInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264PictureInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264PictureInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH264PictureInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264PictureInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH264PictureInfoKHR.SIZEOF);
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
        public VkVideoDecodeH264PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH264PictureInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeH264PictureInfoKHR.npNext(address());
        }

        @NativeType("StdVideoDecodeH264PictureInfo const *")
        public StdVideoDecodeH264PictureInfo pStdPictureInfo() {
            return VkVideoDecodeH264PictureInfoKHR.npStdPictureInfo(address());
        }

        @NativeType("uint32_t")
        public int sliceCount() {
            return VkVideoDecodeH264PictureInfoKHR.nsliceCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pSliceOffsets() {
            return VkVideoDecodeH264PictureInfoKHR.npSliceOffsets(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH264PictureInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeH264PictureInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdPictureInfo(@NativeType("StdVideoDecodeH264PictureInfo const *") StdVideoDecodeH264PictureInfo value) {
            VkVideoDecodeH264PictureInfoKHR.npStdPictureInfo(address(), value);
            return this;
        }

        public Buffer pSliceOffsets(@NativeType("uint32_t const *") IntBuffer value) {
            VkVideoDecodeH264PictureInfoKHR.npSliceOffsets(address(), value);
            return this;
        }
    }
}
