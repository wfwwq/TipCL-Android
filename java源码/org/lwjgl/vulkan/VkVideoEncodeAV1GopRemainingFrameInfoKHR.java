package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1GopRemainingFrameInfoKHR.class */
public class VkVideoEncodeAV1GopRemainingFrameInfoKHR extends Struct<VkVideoEncodeAV1GopRemainingFrameInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int USEGOPREMAININGFRAMES;
    public static final int GOPREMAININGINTRA;
    public static final int GOPREMAININGPREDICTIVE;
    public static final int GOPREMAININGBIPREDICTIVE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEGOPREMAININGFRAMES = layout.offsetof(2);
        GOPREMAININGINTRA = layout.offsetof(3);
        GOPREMAININGPREDICTIVE = layout.offsetof(4);
        GOPREMAININGBIPREDICTIVE = layout.offsetof(5);
    }

    protected VkVideoEncodeAV1GopRemainingFrameInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(address, container);
    }

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean useGopRemainingFrames() {
        return nuseGopRemainingFrames(address()) != 0;
    }

    @NativeType("uint32_t")
    public int gopRemainingIntra() {
        return ngopRemainingIntra(address());
    }

    @NativeType("uint32_t")
    public int gopRemainingPredictive() {
        return ngopRemainingPredictive(address());
    }

    @NativeType("uint32_t")
    public int gopRemainingBipredictive() {
        return ngopRemainingBipredictive(address());
    }

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR sType$Default() {
        return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR);
    }

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR useGopRemainingFrames(@NativeType("VkBool32") boolean value) {
        nuseGopRemainingFrames(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingIntra(@NativeType("uint32_t") int value) {
        ngopRemainingIntra(address(), value);
        return this;
    }

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingPredictive(@NativeType("uint32_t") int value) {
        ngopRemainingPredictive(address(), value);
        return this;
    }

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingBipredictive(@NativeType("uint32_t") int value) {
        ngopRemainingBipredictive(address(), value);
        return this;
    }

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR set(int sType, long pNext, boolean useGopRemainingFrames, int gopRemainingIntra, int gopRemainingPredictive, int gopRemainingBipredictive) {
        sType(sType);
        pNext(pNext);
        useGopRemainingFrames(useGopRemainingFrames);
        gopRemainingIntra(gopRemainingIntra);
        gopRemainingPredictive(gopRemainingPredictive);
        gopRemainingBipredictive(gopRemainingBipredictive);
        return this;
    }

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR set(VkVideoEncodeAV1GopRemainingFrameInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR malloc() {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR calloc() {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR create(long address) {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(address, null);
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(address, null);
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

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nuseGopRemainingFrames(long struct) {
        return MemoryUtil.memGetInt(struct + USEGOPREMAININGFRAMES);
    }

    public static int ngopRemainingIntra(long struct) {
        return MemoryUtil.memGetInt(struct + GOPREMAININGINTRA);
    }

    public static int ngopRemainingPredictive(long struct) {
        return MemoryUtil.memGetInt(struct + GOPREMAININGPREDICTIVE);
    }

    public static int ngopRemainingBipredictive(long struct) {
        return MemoryUtil.memGetInt(struct + GOPREMAININGBIPREDICTIVE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nuseGopRemainingFrames(long struct, int value) {
        MemoryUtil.memPutInt(struct + USEGOPREMAININGFRAMES, value);
    }

    public static void ngopRemainingIntra(long struct, int value) {
        MemoryUtil.memPutInt(struct + GOPREMAININGINTRA, value);
    }

    public static void ngopRemainingPredictive(long struct, int value) {
        MemoryUtil.memPutInt(struct + GOPREMAININGPREDICTIVE, value);
    }

    public static void ngopRemainingBipredictive(long struct, int value) {
        MemoryUtil.memPutInt(struct + GOPREMAININGBIPREDICTIVE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1GopRemainingFrameInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1GopRemainingFrameInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1GopRemainingFrameInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1GopRemainingFrameInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1GopRemainingFrameInfoKHR.SIZEOF);
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
        public VkVideoEncodeAV1GopRemainingFrameInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeAV1GopRemainingFrameInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeAV1GopRemainingFrameInfoKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useGopRemainingFrames() {
            return VkVideoEncodeAV1GopRemainingFrameInfoKHR.nuseGopRemainingFrames(address()) != 0;
        }

        @NativeType("uint32_t")
        public int gopRemainingIntra() {
            return VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingIntra(address());
        }

        @NativeType("uint32_t")
        public int gopRemainingPredictive() {
            return VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingPredictive(address());
        }

        @NativeType("uint32_t")
        public int gopRemainingBipredictive() {
            return VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingBipredictive(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeAV1GopRemainingFrameInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeAV1GopRemainingFrameInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer useGopRemainingFrames(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeAV1GopRemainingFrameInfoKHR.nuseGopRemainingFrames(address(), value ? 1 : 0);
            return this;
        }

        public Buffer gopRemainingIntra(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingIntra(address(), value);
            return this;
        }

        public Buffer gopRemainingPredictive(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingPredictive(address(), value);
            return this;
        }

        public Buffer gopRemainingBipredictive(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingBipredictive(address(), value);
            return this;
        }
    }
}
