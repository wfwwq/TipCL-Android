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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoReferenceSlotInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoReferenceSlotInfoKHR.class */
public class VkVideoReferenceSlotInfoKHR extends Struct<VkVideoReferenceSlotInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SLOTINDEX;
    public static final int PPICTURERESOURCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SLOTINDEX = layout.offsetof(2);
        PPICTURERESOURCE = layout.offsetof(3);
    }

    protected VkVideoReferenceSlotInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoReferenceSlotInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoReferenceSlotInfoKHR(address, container);
    }

    public VkVideoReferenceSlotInfoKHR(ByteBuffer container) {
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

    @NativeType("int32_t")
    public int slotIndex() {
        return nslotIndex(address());
    }

    @NativeType("VkVideoPictureResourceInfoKHR const *")
    public VkVideoPictureResourceInfoKHR pPictureResource() {
        return npPictureResource(address());
    }

    public VkVideoReferenceSlotInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoReferenceSlotInfoKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR);
    }

    public VkVideoReferenceSlotInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoReferenceSlotInfoKHR pNext(VkVideoDecodeAV1DpbSlotInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoReferenceSlotInfoKHR pNext(VkVideoDecodeH264DpbSlotInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoReferenceSlotInfoKHR pNext(VkVideoDecodeH265DpbSlotInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoReferenceSlotInfoKHR pNext(VkVideoEncodeAV1DpbSlotInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoReferenceSlotInfoKHR pNext(VkVideoEncodeH264DpbSlotInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoReferenceSlotInfoKHR pNext(VkVideoEncodeH265DpbSlotInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoReferenceSlotInfoKHR pNext(VkVideoReferenceIntraRefreshInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoReferenceSlotInfoKHR slotIndex(@NativeType("int32_t") int value) {
        nslotIndex(address(), value);
        return this;
    }

    public VkVideoReferenceSlotInfoKHR pPictureResource(@NativeType("VkVideoPictureResourceInfoKHR const *") VkVideoPictureResourceInfoKHR value) {
        npPictureResource(address(), value);
        return this;
    }

    public VkVideoReferenceSlotInfoKHR set(int sType, long pNext, int slotIndex, VkVideoPictureResourceInfoKHR pPictureResource) {
        sType(sType);
        pNext(pNext);
        slotIndex(slotIndex);
        pPictureResource(pPictureResource);
        return this;
    }

    public VkVideoReferenceSlotInfoKHR set(VkVideoReferenceSlotInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoReferenceSlotInfoKHR malloc() {
        return new VkVideoReferenceSlotInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoReferenceSlotInfoKHR calloc() {
        return new VkVideoReferenceSlotInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoReferenceSlotInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoReferenceSlotInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoReferenceSlotInfoKHR create(long address) {
        return new VkVideoReferenceSlotInfoKHR(address, null);
    }

    public static VkVideoReferenceSlotInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoReferenceSlotInfoKHR(address, null);
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

    public static VkVideoReferenceSlotInfoKHR malloc(MemoryStack stack) {
        return new VkVideoReferenceSlotInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoReferenceSlotInfoKHR calloc(MemoryStack stack) {
        return new VkVideoReferenceSlotInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nslotIndex(long struct) {
        return MemoryUtil.memGetInt(struct + SLOTINDEX);
    }

    public static VkVideoPictureResourceInfoKHR npPictureResource(long struct) {
        return VkVideoPictureResourceInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PPICTURERESOURCE));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nslotIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + SLOTINDEX, value);
    }

    public static void npPictureResource(long struct, VkVideoPictureResourceInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PPICTURERESOURCE, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoReferenceSlotInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoReferenceSlotInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoReferenceSlotInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoReferenceSlotInfoKHR ELEMENT_FACTORY = VkVideoReferenceSlotInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoReferenceSlotInfoKHR.SIZEOF);
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
        public VkVideoReferenceSlotInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoReferenceSlotInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoReferenceSlotInfoKHR.npNext(address());
        }

        @NativeType("int32_t")
        public int slotIndex() {
            return VkVideoReferenceSlotInfoKHR.nslotIndex(address());
        }

        @NativeType("VkVideoPictureResourceInfoKHR const *")
        public VkVideoPictureResourceInfoKHR pPictureResource() {
            return VkVideoReferenceSlotInfoKHR.npPictureResource(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoReferenceSlotInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoReferenceSlotInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoDecodeAV1DpbSlotInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH264DpbSlotInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH265DpbSlotInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeAV1DpbSlotInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264DpbSlotInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265DpbSlotInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoReferenceIntraRefreshInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer slotIndex(@NativeType("int32_t") int value) {
            VkVideoReferenceSlotInfoKHR.nslotIndex(address(), value);
            return this;
        }

        public Buffer pPictureResource(@NativeType("VkVideoPictureResourceInfoKHR const *") VkVideoPictureResourceInfoKHR value) {
            VkVideoReferenceSlotInfoKHR.npPictureResource(address(), value);
            return this;
        }
    }
}
