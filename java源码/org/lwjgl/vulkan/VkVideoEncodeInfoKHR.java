package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeInfoKHR.class */
public class VkVideoEncodeInfoKHR extends Struct<VkVideoEncodeInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DSTBUFFER;
    public static final int DSTBUFFEROFFSET;
    public static final int DSTBUFFERRANGE;
    public static final int SRCPICTURERESOURCE;
    public static final int PSETUPREFERENCESLOT;
    public static final int REFERENCESLOTCOUNT;
    public static final int PREFERENCESLOTS;
    public static final int PRECEDINGEXTERNALLYENCODEDBYTES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(8), __member(VkVideoPictureResourceInfoKHR.SIZEOF, VkVideoPictureResourceInfoKHR.ALIGNOF), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DSTBUFFER = layout.offsetof(3);
        DSTBUFFEROFFSET = layout.offsetof(4);
        DSTBUFFERRANGE = layout.offsetof(5);
        SRCPICTURERESOURCE = layout.offsetof(6);
        PSETUPREFERENCESLOT = layout.offsetof(7);
        REFERENCESLOTCOUNT = layout.offsetof(8);
        PREFERENCESLOTS = layout.offsetof(9);
        PRECEDINGEXTERNALLYENCODEDBYTES = layout.offsetof(10);
    }

    protected VkVideoEncodeInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeInfoKHR(address, container);
    }

    public VkVideoEncodeInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBuffer")
    public long dstBuffer() {
        return ndstBuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long dstBufferOffset() {
        return ndstBufferOffset(address());
    }

    @NativeType("VkDeviceSize")
    public long dstBufferRange() {
        return ndstBufferRange(address());
    }

    public VkVideoPictureResourceInfoKHR srcPictureResource() {
        return nsrcPictureResource(address());
    }

    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() {
        return npSetupReferenceSlot(address());
    }

    @NativeType("uint32_t")
    public int referenceSlotCount() {
        return nreferenceSlotCount(address());
    }

    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() {
        return npReferenceSlots(address());
    }

    @NativeType("uint32_t")
    public int precedingExternallyEncodedBytes() {
        return nprecedingExternallyEncodedBytes(address());
    }

    public VkVideoEncodeInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeInfoKHR sType$Default() {
        return sType(1000299000);
    }

    public VkVideoEncodeInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeAV1PictureInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeH264PictureInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeH265PictureInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeIntraRefreshInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeQuantizationMapInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeInfoKHR pNext(VkVideoInlineQueryInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeInfoKHR flags(@NativeType("VkVideoEncodeFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoEncodeInfoKHR dstBuffer(@NativeType("VkBuffer") long value) {
        ndstBuffer(address(), value);
        return this;
    }

    public VkVideoEncodeInfoKHR dstBufferOffset(@NativeType("VkDeviceSize") long value) {
        ndstBufferOffset(address(), value);
        return this;
    }

    public VkVideoEncodeInfoKHR dstBufferRange(@NativeType("VkDeviceSize") long value) {
        ndstBufferRange(address(), value);
        return this;
    }

    public VkVideoEncodeInfoKHR srcPictureResource(VkVideoPictureResourceInfoKHR value) {
        nsrcPictureResource(address(), value);
        return this;
    }

    public VkVideoEncodeInfoKHR srcPictureResource(Consumer<VkVideoPictureResourceInfoKHR> consumer) {
        consumer.accept(srcPictureResource());
        return this;
    }

    public VkVideoEncodeInfoKHR pSetupReferenceSlot(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR value) {
        npSetupReferenceSlot(address(), value);
        return this;
    }

    public VkVideoEncodeInfoKHR pReferenceSlots(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) {
        npReferenceSlots(address(), value);
        return this;
    }

    public VkVideoEncodeInfoKHR precedingExternallyEncodedBytes(@NativeType("uint32_t") int value) {
        nprecedingExternallyEncodedBytes(address(), value);
        return this;
    }

    public VkVideoEncodeInfoKHR set(int sType, long pNext, int flags, long dstBuffer, long dstBufferOffset, long dstBufferRange, VkVideoPictureResourceInfoKHR srcPictureResource, VkVideoReferenceSlotInfoKHR pSetupReferenceSlot, VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots, int precedingExternallyEncodedBytes) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        dstBuffer(dstBuffer);
        dstBufferOffset(dstBufferOffset);
        dstBufferRange(dstBufferRange);
        srcPictureResource(srcPictureResource);
        pSetupReferenceSlot(pSetupReferenceSlot);
        pReferenceSlots(pReferenceSlots);
        precedingExternallyEncodedBytes(precedingExternallyEncodedBytes);
        return this;
    }

    public VkVideoEncodeInfoKHR set(VkVideoEncodeInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeInfoKHR malloc() {
        return new VkVideoEncodeInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeInfoKHR calloc() {
        return new VkVideoEncodeInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeInfoKHR create(long address) {
        return new VkVideoEncodeInfoKHR(address, null);
    }

    public static VkVideoEncodeInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeInfoKHR(address, null);
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

    public static VkVideoEncodeInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long ndstBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + DSTBUFFER);
    }

    public static long ndstBufferOffset(long struct) {
        return MemoryUtil.memGetLong(struct + DSTBUFFEROFFSET);
    }

    public static long ndstBufferRange(long struct) {
        return MemoryUtil.memGetLong(struct + DSTBUFFERRANGE);
    }

    public static VkVideoPictureResourceInfoKHR nsrcPictureResource(long struct) {
        return VkVideoPictureResourceInfoKHR.create(struct + SRCPICTURERESOURCE);
    }

    public static VkVideoReferenceSlotInfoKHR npSetupReferenceSlot(long struct) {
        return VkVideoReferenceSlotInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PSETUPREFERENCESLOT));
    }

    public static int nreferenceSlotCount(long struct) {
        return MemoryUtil.memGetInt(struct + REFERENCESLOTCOUNT);
    }

    public static VkVideoReferenceSlotInfoKHR.Buffer npReferenceSlots(long struct) {
        return VkVideoReferenceSlotInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PREFERENCESLOTS), nreferenceSlotCount(struct));
    }

    public static int nprecedingExternallyEncodedBytes(long struct) {
        return MemoryUtil.memGetInt(struct + PRECEDINGEXTERNALLYENCODEDBYTES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ndstBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTBUFFER, value);
    }

    public static void ndstBufferOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTBUFFEROFFSET, value);
    }

    public static void ndstBufferRange(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTBUFFERRANGE, value);
    }

    public static void nsrcPictureResource(long struct, VkVideoPictureResourceInfoKHR value) {
        MemoryUtil.memCopy(value.address(), struct + SRCPICTURERESOURCE, VkVideoPictureResourceInfoKHR.SIZEOF);
    }

    public static void npSetupReferenceSlot(long struct, VkVideoReferenceSlotInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PSETUPREFERENCESLOT, MemoryUtil.memAddressSafe(value));
    }

    public static void nreferenceSlotCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + REFERENCESLOTCOUNT, value);
    }

    public static void npReferenceSlots(long struct, VkVideoReferenceSlotInfoKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREFERENCESLOTS, MemoryUtil.memAddressSafe(value));
        nreferenceSlotCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nprecedingExternallyEncodedBytes(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRECEDINGEXTERNALLYENCODEDBYTES, value);
    }

    public static void validate(long struct) {
        if (nreferenceSlotCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PREFERENCESLOTS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeInfoKHR ELEMENT_FACTORY = VkVideoEncodeInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeInfoKHR.SIZEOF);
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
        public VkVideoEncodeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeInfoKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeFlagsKHR")
        public int flags() {
            return VkVideoEncodeInfoKHR.nflags(address());
        }

        @NativeType("VkBuffer")
        public long dstBuffer() {
            return VkVideoEncodeInfoKHR.ndstBuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long dstBufferOffset() {
            return VkVideoEncodeInfoKHR.ndstBufferOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long dstBufferRange() {
            return VkVideoEncodeInfoKHR.ndstBufferRange(address());
        }

        public VkVideoPictureResourceInfoKHR srcPictureResource() {
            return VkVideoEncodeInfoKHR.nsrcPictureResource(address());
        }

        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() {
            return VkVideoEncodeInfoKHR.npSetupReferenceSlot(address());
        }

        @NativeType("uint32_t")
        public int referenceSlotCount() {
            return VkVideoEncodeInfoKHR.nreferenceSlotCount(address());
        }

        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() {
            return VkVideoEncodeInfoKHR.npReferenceSlots(address());
        }

        @NativeType("uint32_t")
        public int precedingExternallyEncodedBytes() {
            return VkVideoEncodeInfoKHR.nprecedingExternallyEncodedBytes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000299000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoEncodeAV1PictureInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264PictureInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265PictureInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeIntraRefreshInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeQuantizationMapInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoInlineQueryInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkVideoEncodeFlagsKHR") int value) {
            VkVideoEncodeInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer dstBuffer(@NativeType("VkBuffer") long value) {
            VkVideoEncodeInfoKHR.ndstBuffer(address(), value);
            return this;
        }

        public Buffer dstBufferOffset(@NativeType("VkDeviceSize") long value) {
            VkVideoEncodeInfoKHR.ndstBufferOffset(address(), value);
            return this;
        }

        public Buffer dstBufferRange(@NativeType("VkDeviceSize") long value) {
            VkVideoEncodeInfoKHR.ndstBufferRange(address(), value);
            return this;
        }

        public Buffer srcPictureResource(VkVideoPictureResourceInfoKHR value) {
            VkVideoEncodeInfoKHR.nsrcPictureResource(address(), value);
            return this;
        }

        public Buffer srcPictureResource(Consumer<VkVideoPictureResourceInfoKHR> consumer) {
            consumer.accept(srcPictureResource());
            return this;
        }

        public Buffer pSetupReferenceSlot(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR value) {
            VkVideoEncodeInfoKHR.npSetupReferenceSlot(address(), value);
            return this;
        }

        public Buffer pReferenceSlots(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) {
            VkVideoEncodeInfoKHR.npReferenceSlots(address(), value);
            return this;
        }

        public Buffer precedingExternallyEncodedBytes(@NativeType("uint32_t") int value) {
            VkVideoEncodeInfoKHR.nprecedingExternallyEncodedBytes(address(), value);
            return this;
        }
    }
}
