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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeInfoKHR.class */
public class VkVideoDecodeInfoKHR extends Struct<VkVideoDecodeInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int SRCBUFFER;
    public static final int SRCBUFFEROFFSET;
    public static final int SRCBUFFERRANGE;
    public static final int DSTPICTURERESOURCE;
    public static final int PSETUPREFERENCESLOT;
    public static final int REFERENCESLOTCOUNT;
    public static final int PREFERENCESLOTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(8), __member(VkVideoPictureResourceInfoKHR.SIZEOF, VkVideoPictureResourceInfoKHR.ALIGNOF), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SRCBUFFER = layout.offsetof(3);
        SRCBUFFEROFFSET = layout.offsetof(4);
        SRCBUFFERRANGE = layout.offsetof(5);
        DSTPICTURERESOURCE = layout.offsetof(6);
        PSETUPREFERENCESLOT = layout.offsetof(7);
        REFERENCESLOTCOUNT = layout.offsetof(8);
        PREFERENCESLOTS = layout.offsetof(9);
    }

    protected VkVideoDecodeInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeInfoKHR(address, container);
    }

    public VkVideoDecodeInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoDecodeFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBuffer")
    public long srcBuffer() {
        return nsrcBuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long srcBufferOffset() {
        return nsrcBufferOffset(address());
    }

    @NativeType("VkDeviceSize")
    public long srcBufferRange() {
        return nsrcBufferRange(address());
    }

    public VkVideoPictureResourceInfoKHR dstPictureResource() {
        return ndstPictureResource(address());
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

    public VkVideoDecodeInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeInfoKHR sType$Default() {
        return sType(1000024000);
    }

    public VkVideoDecodeInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeAV1InlineSessionParametersInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeAV1PictureInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeH264InlineSessionParametersInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeH264PictureInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeH265InlineSessionParametersInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeH265PictureInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeVP9PictureInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoDecodeInfoKHR pNext(VkVideoInlineQueryInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoDecodeInfoKHR flags(@NativeType("VkVideoDecodeFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoDecodeInfoKHR srcBuffer(@NativeType("VkBuffer") long value) {
        nsrcBuffer(address(), value);
        return this;
    }

    public VkVideoDecodeInfoKHR srcBufferOffset(@NativeType("VkDeviceSize") long value) {
        nsrcBufferOffset(address(), value);
        return this;
    }

    public VkVideoDecodeInfoKHR srcBufferRange(@NativeType("VkDeviceSize") long value) {
        nsrcBufferRange(address(), value);
        return this;
    }

    public VkVideoDecodeInfoKHR dstPictureResource(VkVideoPictureResourceInfoKHR value) {
        ndstPictureResource(address(), value);
        return this;
    }

    public VkVideoDecodeInfoKHR dstPictureResource(Consumer<VkVideoPictureResourceInfoKHR> consumer) {
        consumer.accept(dstPictureResource());
        return this;
    }

    public VkVideoDecodeInfoKHR pSetupReferenceSlot(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR value) {
        npSetupReferenceSlot(address(), value);
        return this;
    }

    public VkVideoDecodeInfoKHR pReferenceSlots(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) {
        npReferenceSlots(address(), value);
        return this;
    }

    public VkVideoDecodeInfoKHR set(int sType, long pNext, int flags, long srcBuffer, long srcBufferOffset, long srcBufferRange, VkVideoPictureResourceInfoKHR dstPictureResource, VkVideoReferenceSlotInfoKHR pSetupReferenceSlot, VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        srcBuffer(srcBuffer);
        srcBufferOffset(srcBufferOffset);
        srcBufferRange(srcBufferRange);
        dstPictureResource(dstPictureResource);
        pSetupReferenceSlot(pSetupReferenceSlot);
        pReferenceSlots(pReferenceSlots);
        return this;
    }

    public VkVideoDecodeInfoKHR set(VkVideoDecodeInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeInfoKHR malloc() {
        return new VkVideoDecodeInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeInfoKHR calloc() {
        return new VkVideoDecodeInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeInfoKHR create(long address) {
        return new VkVideoDecodeInfoKHR(address, null);
    }

    public static VkVideoDecodeInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeInfoKHR(address, null);
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

    public static VkVideoDecodeInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsrcBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + SRCBUFFER);
    }

    public static long nsrcBufferOffset(long struct) {
        return MemoryUtil.memGetLong(struct + SRCBUFFEROFFSET);
    }

    public static long nsrcBufferRange(long struct) {
        return MemoryUtil.memGetLong(struct + SRCBUFFERRANGE);
    }

    public static VkVideoPictureResourceInfoKHR ndstPictureResource(long struct) {
        return VkVideoPictureResourceInfoKHR.create(struct + DSTPICTURERESOURCE);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nsrcBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCBUFFER, value);
    }

    public static void nsrcBufferOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCBUFFEROFFSET, value);
    }

    public static void nsrcBufferRange(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCBUFFERRANGE, value);
    }

    public static void ndstPictureResource(long struct, VkVideoPictureResourceInfoKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DSTPICTURERESOURCE, VkVideoPictureResourceInfoKHR.SIZEOF);
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

    public static void validate(long struct) {
        if (nreferenceSlotCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PREFERENCESLOTS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeInfoKHR ELEMENT_FACTORY = VkVideoDecodeInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeInfoKHR.SIZEOF);
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
        public VkVideoDecodeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeInfoKHR.npNext(address());
        }

        @NativeType("VkVideoDecodeFlagsKHR")
        public int flags() {
            return VkVideoDecodeInfoKHR.nflags(address());
        }

        @NativeType("VkBuffer")
        public long srcBuffer() {
            return VkVideoDecodeInfoKHR.nsrcBuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long srcBufferOffset() {
            return VkVideoDecodeInfoKHR.nsrcBufferOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long srcBufferRange() {
            return VkVideoDecodeInfoKHR.nsrcBufferRange(address());
        }

        public VkVideoPictureResourceInfoKHR dstPictureResource() {
            return VkVideoDecodeInfoKHR.ndstPictureResource(address());
        }

        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() {
            return VkVideoDecodeInfoKHR.npSetupReferenceSlot(address());
        }

        @NativeType("uint32_t")
        public int referenceSlotCount() {
            return VkVideoDecodeInfoKHR.nreferenceSlotCount(address());
        }

        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() {
            return VkVideoDecodeInfoKHR.npReferenceSlots(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000024000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoDecodeAV1InlineSessionParametersInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeAV1PictureInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH264InlineSessionParametersInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH264PictureInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH265InlineSessionParametersInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH265PictureInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeVP9PictureInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoInlineQueryInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkVideoDecodeFlagsKHR") int value) {
            VkVideoDecodeInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer srcBuffer(@NativeType("VkBuffer") long value) {
            VkVideoDecodeInfoKHR.nsrcBuffer(address(), value);
            return this;
        }

        public Buffer srcBufferOffset(@NativeType("VkDeviceSize") long value) {
            VkVideoDecodeInfoKHR.nsrcBufferOffset(address(), value);
            return this;
        }

        public Buffer srcBufferRange(@NativeType("VkDeviceSize") long value) {
            VkVideoDecodeInfoKHR.nsrcBufferRange(address(), value);
            return this;
        }

        public Buffer dstPictureResource(VkVideoPictureResourceInfoKHR value) {
            VkVideoDecodeInfoKHR.ndstPictureResource(address(), value);
            return this;
        }

        public Buffer dstPictureResource(Consumer<VkVideoPictureResourceInfoKHR> consumer) {
            consumer.accept(dstPictureResource());
            return this;
        }

        public Buffer pSetupReferenceSlot(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR value) {
            VkVideoDecodeInfoKHR.npSetupReferenceSlot(address(), value);
            return this;
        }

        public Buffer pReferenceSlots(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) {
            VkVideoDecodeInfoKHR.npReferenceSlots(address(), value);
            return this;
        }
    }
}
