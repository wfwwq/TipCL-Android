package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264ProfileInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264ProfileInfoKHR.class */
public class VkVideoDecodeH264ProfileInfoKHR extends Struct<VkVideoDecodeH264ProfileInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STDPROFILEIDC;
    public static final int PICTURELAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDPROFILEIDC = layout.offsetof(2);
        PICTURELAYOUT = layout.offsetof(3);
    }

    protected VkVideoDecodeH264ProfileInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH264ProfileInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH264ProfileInfoKHR(address, container);
    }

    public VkVideoDecodeH264ProfileInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoH264ProfileIdc")
    public int stdProfileIdc() {
        return nstdProfileIdc(address());
    }

    @NativeType("VkVideoDecodeH264PictureLayoutFlagBitsKHR")
    public int pictureLayout() {
        return npictureLayout(address());
    }

    public VkVideoDecodeH264ProfileInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH264ProfileInfoKHR sType$Default() {
        return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR);
    }

    public VkVideoDecodeH264ProfileInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH264ProfileInfoKHR stdProfileIdc(@NativeType("StdVideoH264ProfileIdc") int value) {
        nstdProfileIdc(address(), value);
        return this;
    }

    public VkVideoDecodeH264ProfileInfoKHR pictureLayout(@NativeType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int value) {
        npictureLayout(address(), value);
        return this;
    }

    public VkVideoDecodeH264ProfileInfoKHR set(int sType, long pNext, int stdProfileIdc, int pictureLayout) {
        sType(sType);
        pNext(pNext);
        stdProfileIdc(stdProfileIdc);
        pictureLayout(pictureLayout);
        return this;
    }

    public VkVideoDecodeH264ProfileInfoKHR set(VkVideoDecodeH264ProfileInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH264ProfileInfoKHR malloc() {
        return new VkVideoDecodeH264ProfileInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH264ProfileInfoKHR calloc() {
        return new VkVideoDecodeH264ProfileInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH264ProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264ProfileInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH264ProfileInfoKHR create(long address) {
        return new VkVideoDecodeH264ProfileInfoKHR(address, null);
    }

    public static VkVideoDecodeH264ProfileInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH264ProfileInfoKHR(address, null);
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

    public static VkVideoDecodeH264ProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264ProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH264ProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264ProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstdProfileIdc(long struct) {
        return MemoryUtil.memGetInt(struct + STDPROFILEIDC);
    }

    public static int npictureLayout(long struct) {
        return MemoryUtil.memGetInt(struct + PICTURELAYOUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstdProfileIdc(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDPROFILEIDC, value);
    }

    public static void npictureLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + PICTURELAYOUT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264ProfileInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264ProfileInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264ProfileInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH264ProfileInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264ProfileInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH264ProfileInfoKHR.SIZEOF);
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
        public VkVideoDecodeH264ProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH264ProfileInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeH264ProfileInfoKHR.npNext(address());
        }

        @NativeType("StdVideoH264ProfileIdc")
        public int stdProfileIdc() {
            return VkVideoDecodeH264ProfileInfoKHR.nstdProfileIdc(address());
        }

        @NativeType("VkVideoDecodeH264PictureLayoutFlagBitsKHR")
        public int pictureLayout() {
            return VkVideoDecodeH264ProfileInfoKHR.npictureLayout(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH264ProfileInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeH264ProfileInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer stdProfileIdc(@NativeType("StdVideoH264ProfileIdc") int value) {
            VkVideoDecodeH264ProfileInfoKHR.nstdProfileIdc(address(), value);
            return this;
        }

        public Buffer pictureLayout(@NativeType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int value) {
            VkVideoDecodeH264ProfileInfoKHR.npictureLayout(address(), value);
            return this;
        }
    }
}
