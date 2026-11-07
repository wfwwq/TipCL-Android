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
import org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoBeginCodingInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoBeginCodingInfoKHR.class */
public class VkVideoBeginCodingInfoKHR extends Struct<VkVideoBeginCodingInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int VIDEOSESSION;
    public static final int VIDEOSESSIONPARAMETERS;
    public static final int REFERENCESLOTCOUNT;
    public static final int PREFERENCESLOTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIDEOSESSION = layout.offsetof(3);
        VIDEOSESSIONPARAMETERS = layout.offsetof(4);
        REFERENCESLOTCOUNT = layout.offsetof(5);
        PREFERENCESLOTS = layout.offsetof(6);
    }

    protected VkVideoBeginCodingInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoBeginCodingInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoBeginCodingInfoKHR(address, container);
    }

    public VkVideoBeginCodingInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoBeginCodingFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkVideoSessionKHR")
    public long videoSession() {
        return nvideoSession(address());
    }

    @NativeType("VkVideoSessionParametersKHR")
    public long videoSessionParameters() {
        return nvideoSessionParameters(address());
    }

    @NativeType("uint32_t")
    public int referenceSlotCount() {
        return nreferenceSlotCount(address());
    }

    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() {
        return npReferenceSlots(address());
    }

    public VkVideoBeginCodingInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoBeginCodingInfoKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR);
    }

    public VkVideoBeginCodingInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeAV1GopRemainingFrameInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeAV1RateControlInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH264GopRemainingFrameInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH264RateControlInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH265GopRemainingFrameInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH265RateControlInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeRateControlInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoBeginCodingInfoKHR flags(@NativeType("VkVideoBeginCodingFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoBeginCodingInfoKHR videoSession(@NativeType("VkVideoSessionKHR") long value) {
        nvideoSession(address(), value);
        return this;
    }

    public VkVideoBeginCodingInfoKHR videoSessionParameters(@NativeType("VkVideoSessionParametersKHR") long value) {
        nvideoSessionParameters(address(), value);
        return this;
    }

    public VkVideoBeginCodingInfoKHR pReferenceSlots(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) {
        npReferenceSlots(address(), value);
        return this;
    }

    public VkVideoBeginCodingInfoKHR set(int sType, long pNext, int flags, long videoSession, long videoSessionParameters, VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        videoSession(videoSession);
        videoSessionParameters(videoSessionParameters);
        pReferenceSlots(pReferenceSlots);
        return this;
    }

    public VkVideoBeginCodingInfoKHR set(VkVideoBeginCodingInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoBeginCodingInfoKHR malloc() {
        return new VkVideoBeginCodingInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoBeginCodingInfoKHR calloc() {
        return new VkVideoBeginCodingInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoBeginCodingInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoBeginCodingInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoBeginCodingInfoKHR create(long address) {
        return new VkVideoBeginCodingInfoKHR(address, null);
    }

    public static VkVideoBeginCodingInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoBeginCodingInfoKHR(address, null);
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

    public static VkVideoBeginCodingInfoKHR malloc(MemoryStack stack) {
        return new VkVideoBeginCodingInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoBeginCodingInfoKHR calloc(MemoryStack stack) {
        return new VkVideoBeginCodingInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nvideoSession(long struct) {
        return MemoryUtil.memGetLong(struct + VIDEOSESSION);
    }

    public static long nvideoSessionParameters(long struct) {
        return MemoryUtil.memGetLong(struct + VIDEOSESSIONPARAMETERS);
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

    public static void nvideoSession(long struct, long value) {
        MemoryUtil.memPutLong(struct + VIDEOSESSION, value);
    }

    public static void nvideoSessionParameters(long struct, long value) {
        MemoryUtil.memPutLong(struct + VIDEOSESSIONPARAMETERS, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoBeginCodingInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoBeginCodingInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoBeginCodingInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoBeginCodingInfoKHR ELEMENT_FACTORY = VkVideoBeginCodingInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoBeginCodingInfoKHR.SIZEOF);
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
        public VkVideoBeginCodingInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoBeginCodingInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoBeginCodingInfoKHR.npNext(address());
        }

        @NativeType("VkVideoBeginCodingFlagsKHR")
        public int flags() {
            return VkVideoBeginCodingInfoKHR.nflags(address());
        }

        @NativeType("VkVideoSessionKHR")
        public long videoSession() {
            return VkVideoBeginCodingInfoKHR.nvideoSession(address());
        }

        @NativeType("VkVideoSessionParametersKHR")
        public long videoSessionParameters() {
            return VkVideoBeginCodingInfoKHR.nvideoSessionParameters(address());
        }

        @NativeType("uint32_t")
        public int referenceSlotCount() {
            return VkVideoBeginCodingInfoKHR.nreferenceSlotCount(address());
        }

        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() {
            return VkVideoBeginCodingInfoKHR.npReferenceSlots(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoBeginCodingInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoBeginCodingInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoEncodeAV1GopRemainingFrameInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeAV1RateControlInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264GopRemainingFrameInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264RateControlInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265GopRemainingFrameInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265RateControlInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeRateControlInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkVideoBeginCodingFlagsKHR") int value) {
            VkVideoBeginCodingInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer videoSession(@NativeType("VkVideoSessionKHR") long value) {
            VkVideoBeginCodingInfoKHR.nvideoSession(address(), value);
            return this;
        }

        public Buffer videoSessionParameters(@NativeType("VkVideoSessionParametersKHR") long value) {
            VkVideoBeginCodingInfoKHR.nvideoSessionParameters(address(), value);
            return this;
        }

        public Buffer pReferenceSlots(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) {
            VkVideoBeginCodingInfoKHR.npReferenceSlots(address(), value);
            return this;
        }
    }
}
