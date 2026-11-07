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
import org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1PictureInfoKHR.class */
public class VkVideoEncodeAV1PictureInfoKHR extends Struct<VkVideoEncodeAV1PictureInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PREDICTIONMODE;
    public static final int RATECONTROLGROUP;
    public static final int CONSTANTQINDEX;
    public static final int PSTDPICTUREINFO;
    public static final int REFERENCENAMESLOTINDICES;
    public static final int PRIMARYREFERENCECDFONLY;
    public static final int GENERATEOBUEXTENSIONHEADER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __array(4, 7), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREDICTIONMODE = layout.offsetof(2);
        RATECONTROLGROUP = layout.offsetof(3);
        CONSTANTQINDEX = layout.offsetof(4);
        PSTDPICTUREINFO = layout.offsetof(5);
        REFERENCENAMESLOTINDICES = layout.offsetof(6);
        PRIMARYREFERENCECDFONLY = layout.offsetof(7);
        GENERATEOBUEXTENSIONHEADER = layout.offsetof(8);
    }

    protected VkVideoEncodeAV1PictureInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1PictureInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1PictureInfoKHR(address, container);
    }

    public VkVideoEncodeAV1PictureInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeAV1PredictionModeKHR")
    public int predictionMode() {
        return npredictionMode(address());
    }

    @NativeType("VkVideoEncodeAV1RateControlGroupKHR")
    public int rateControlGroup() {
        return nrateControlGroup(address());
    }

    @NativeType("uint32_t")
    public int constantQIndex() {
        return nconstantQIndex(address());
    }

    @NativeType("StdVideoEncodeAV1PictureInfo const *")
    public StdVideoEncodeAV1PictureInfo pStdPictureInfo() {
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

    @NativeType("VkBool32")
    public boolean primaryReferenceCdfOnly() {
        return nprimaryReferenceCdfOnly(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean generateObuExtensionHeader() {
        return ngenerateObuExtensionHeader(address()) != 0;
    }

    public VkVideoEncodeAV1PictureInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR sType$Default() {
        return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR);
    }

    public VkVideoEncodeAV1PictureInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR predictionMode(@NativeType("VkVideoEncodeAV1PredictionModeKHR") int value) {
        npredictionMode(address(), value);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR rateControlGroup(@NativeType("VkVideoEncodeAV1RateControlGroupKHR") int value) {
        nrateControlGroup(address(), value);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR constantQIndex(@NativeType("uint32_t") int value) {
        nconstantQIndex(address(), value);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoEncodeAV1PictureInfo const *") StdVideoEncodeAV1PictureInfo value) {
        npStdPictureInfo(address(), value);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) {
        nreferenceNameSlotIndices(address(), value);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(int index, @NativeType("int32_t") int value) {
        nreferenceNameSlotIndices(address(), index, value);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnly(@NativeType("VkBool32") boolean value) {
        nprimaryReferenceCdfOnly(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeader(@NativeType("VkBool32") boolean value) {
        ngenerateObuExtensionHeader(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR set(int sType, long pNext, int predictionMode, int rateControlGroup, int constantQIndex, StdVideoEncodeAV1PictureInfo pStdPictureInfo, IntBuffer referenceNameSlotIndices, boolean primaryReferenceCdfOnly, boolean generateObuExtensionHeader) {
        sType(sType);
        pNext(pNext);
        predictionMode(predictionMode);
        rateControlGroup(rateControlGroup);
        constantQIndex(constantQIndex);
        pStdPictureInfo(pStdPictureInfo);
        referenceNameSlotIndices(referenceNameSlotIndices);
        primaryReferenceCdfOnly(primaryReferenceCdfOnly);
        generateObuExtensionHeader(generateObuExtensionHeader);
        return this;
    }

    public VkVideoEncodeAV1PictureInfoKHR set(VkVideoEncodeAV1PictureInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1PictureInfoKHR malloc() {
        return new VkVideoEncodeAV1PictureInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1PictureInfoKHR calloc() {
        return new VkVideoEncodeAV1PictureInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1PictureInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1PictureInfoKHR create(long address) {
        return new VkVideoEncodeAV1PictureInfoKHR(address, null);
    }

    public static VkVideoEncodeAV1PictureInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1PictureInfoKHR(address, null);
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

    public static VkVideoEncodeAV1PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npredictionMode(long struct) {
        return MemoryUtil.memGetInt(struct + PREDICTIONMODE);
    }

    public static int nrateControlGroup(long struct) {
        return MemoryUtil.memGetInt(struct + RATECONTROLGROUP);
    }

    public static int nconstantQIndex(long struct) {
        return MemoryUtil.memGetInt(struct + CONSTANTQINDEX);
    }

    public static StdVideoEncodeAV1PictureInfo npStdPictureInfo(long struct) {
        return StdVideoEncodeAV1PictureInfo.create(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
    }

    public static IntBuffer nreferenceNameSlotIndices(long struct) {
        return MemoryUtil.memIntBuffer(struct + REFERENCENAMESLOTINDICES, 7);
    }

    public static int nreferenceNameSlotIndices(long struct, int index) {
        return MemoryUtil.memGetInt(struct + REFERENCENAMESLOTINDICES + (Checks.check(index, 7) * 4));
    }

    public static int nprimaryReferenceCdfOnly(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMARYREFERENCECDFONLY);
    }

    public static int ngenerateObuExtensionHeader(long struct) {
        return MemoryUtil.memGetInt(struct + GENERATEOBUEXTENSIONHEADER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npredictionMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + PREDICTIONMODE, value);
    }

    public static void nrateControlGroup(long struct, int value) {
        MemoryUtil.memPutInt(struct + RATECONTROLGROUP, value);
    }

    public static void nconstantQIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONSTANTQINDEX, value);
    }

    public static void npStdPictureInfo(long struct, StdVideoEncodeAV1PictureInfo value) {
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

    public static void nprimaryReferenceCdfOnly(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMARYREFERENCECDFONLY, value);
    }

    public static void ngenerateObuExtensionHeader(long struct, int value) {
        MemoryUtil.memPutInt(struct + GENERATEOBUEXTENSIONHEADER, value);
    }

    public static void validate(long struct) {
        long pStdPictureInfo = MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO);
        Checks.check(pStdPictureInfo);
        StdVideoEncodeAV1PictureInfo.validate(pStdPictureInfo);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1PictureInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1PictureInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1PictureInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1PictureInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1PictureInfoKHR.SIZEOF);
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
        public VkVideoEncodeAV1PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeAV1PictureInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeAV1PictureInfoKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeAV1PredictionModeKHR")
        public int predictionMode() {
            return VkVideoEncodeAV1PictureInfoKHR.npredictionMode(address());
        }

        @NativeType("VkVideoEncodeAV1RateControlGroupKHR")
        public int rateControlGroup() {
            return VkVideoEncodeAV1PictureInfoKHR.nrateControlGroup(address());
        }

        @NativeType("uint32_t")
        public int constantQIndex() {
            return VkVideoEncodeAV1PictureInfoKHR.nconstantQIndex(address());
        }

        @NativeType("StdVideoEncodeAV1PictureInfo const *")
        public StdVideoEncodeAV1PictureInfo pStdPictureInfo() {
            return VkVideoEncodeAV1PictureInfoKHR.npStdPictureInfo(address());
        }

        @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
        public IntBuffer referenceNameSlotIndices() {
            return VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address());
        }

        @NativeType("int32_t")
        public int referenceNameSlotIndices(int index) {
            return VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index);
        }

        @NativeType("VkBool32")
        public boolean primaryReferenceCdfOnly() {
            return VkVideoEncodeAV1PictureInfoKHR.nprimaryReferenceCdfOnly(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean generateObuExtensionHeader() {
            return VkVideoEncodeAV1PictureInfoKHR.ngenerateObuExtensionHeader(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeAV1PictureInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeAV1PictureInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer predictionMode(@NativeType("VkVideoEncodeAV1PredictionModeKHR") int value) {
            VkVideoEncodeAV1PictureInfoKHR.npredictionMode(address(), value);
            return this;
        }

        public Buffer rateControlGroup(@NativeType("VkVideoEncodeAV1RateControlGroupKHR") int value) {
            VkVideoEncodeAV1PictureInfoKHR.nrateControlGroup(address(), value);
            return this;
        }

        public Buffer constantQIndex(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1PictureInfoKHR.nconstantQIndex(address(), value);
            return this;
        }

        public Buffer pStdPictureInfo(@NativeType("StdVideoEncodeAV1PictureInfo const *") StdVideoEncodeAV1PictureInfo value) {
            VkVideoEncodeAV1PictureInfoKHR.npStdPictureInfo(address(), value);
            return this;
        }

        public Buffer referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) {
            VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), value);
            return this;
        }

        public Buffer referenceNameSlotIndices(int index, @NativeType("int32_t") int value) {
            VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index, value);
            return this;
        }

        public Buffer primaryReferenceCdfOnly(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeAV1PictureInfoKHR.nprimaryReferenceCdfOnly(address(), value ? 1 : 0);
            return this;
        }

        public Buffer generateObuExtensionHeader(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeAV1PictureInfoKHR.ngenerateObuExtensionHeader(address(), value ? 1 : 0);
            return this;
        }
    }
}
