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
import org.lwjgl.vulkan.video.StdVideoDecodeAV1ReferenceInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeAV1DpbSlotInfoKHR.class */
public class VkVideoDecodeAV1DpbSlotInfoKHR extends Struct<VkVideoDecodeAV1DpbSlotInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDREFERENCEINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDREFERENCEINFO = layout.offsetof(2);
    }

    protected VkVideoDecodeAV1DpbSlotInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeAV1DpbSlotInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(address, container);
    }

    public VkVideoDecodeAV1DpbSlotInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoDecodeAV1ReferenceInfo const *")
    public StdVideoDecodeAV1ReferenceInfo pStdReferenceInfo() {
        return npStdReferenceInfo(address());
    }

    public VkVideoDecodeAV1DpbSlotInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeAV1DpbSlotInfoKHR sType$Default() {
        return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR);
    }

    public VkVideoDecodeAV1DpbSlotInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeAV1DpbSlotInfoKHR pStdReferenceInfo(@NativeType("StdVideoDecodeAV1ReferenceInfo const *") StdVideoDecodeAV1ReferenceInfo value) {
        npStdReferenceInfo(address(), value);
        return this;
    }

    public VkVideoDecodeAV1DpbSlotInfoKHR set(int sType, long pNext, StdVideoDecodeAV1ReferenceInfo pStdReferenceInfo) {
        sType(sType);
        pNext(pNext);
        pStdReferenceInfo(pStdReferenceInfo);
        return this;
    }

    public VkVideoDecodeAV1DpbSlotInfoKHR set(VkVideoDecodeAV1DpbSlotInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeAV1DpbSlotInfoKHR malloc() {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeAV1DpbSlotInfoKHR calloc() {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeAV1DpbSlotInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeAV1DpbSlotInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeAV1DpbSlotInfoKHR create(long address) {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(address, null);
    }

    public static VkVideoDecodeAV1DpbSlotInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeAV1DpbSlotInfoKHR(address, null);
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

    public static VkVideoDecodeAV1DpbSlotInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeAV1DpbSlotInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoDecodeAV1ReferenceInfo npStdReferenceInfo(long struct) {
        return StdVideoDecodeAV1ReferenceInfo.create(MemoryUtil.memGetAddress(struct + PSTDREFERENCEINFO));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdReferenceInfo(long struct, StdVideoDecodeAV1ReferenceInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDREFERENCEINFO, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSTDREFERENCEINFO));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeAV1DpbSlotInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeAV1DpbSlotInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeAV1DpbSlotInfoKHR ELEMENT_FACTORY = VkVideoDecodeAV1DpbSlotInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeAV1DpbSlotInfoKHR.SIZEOF);
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
        public VkVideoDecodeAV1DpbSlotInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeAV1DpbSlotInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeAV1DpbSlotInfoKHR.npNext(address());
        }

        @NativeType("StdVideoDecodeAV1ReferenceInfo const *")
        public StdVideoDecodeAV1ReferenceInfo pStdReferenceInfo() {
            return VkVideoDecodeAV1DpbSlotInfoKHR.npStdReferenceInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeAV1DpbSlotInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeAV1DpbSlotInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdReferenceInfo(@NativeType("StdVideoDecodeAV1ReferenceInfo const *") StdVideoDecodeAV1ReferenceInfo value) {
            VkVideoDecodeAV1DpbSlotInfoKHR.npStdReferenceInfo(address(), value);
            return this;
        }
    }
}
