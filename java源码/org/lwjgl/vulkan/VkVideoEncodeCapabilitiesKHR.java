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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeCapabilitiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeCapabilitiesKHR.class */
public class VkVideoEncodeCapabilitiesKHR extends Struct<VkVideoEncodeCapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int RATECONTROLMODES;
    public static final int MAXRATECONTROLLAYERS;
    public static final int MAXBITRATE;
    public static final int MAXQUALITYLEVELS;
    public static final int ENCODEINPUTPICTUREGRANULARITY;
    public static final int SUPPORTEDENCODEFEEDBACKFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(8), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RATECONTROLMODES = layout.offsetof(3);
        MAXRATECONTROLLAYERS = layout.offsetof(4);
        MAXBITRATE = layout.offsetof(5);
        MAXQUALITYLEVELS = layout.offsetof(6);
        ENCODEINPUTPICTUREGRANULARITY = layout.offsetof(7);
        SUPPORTEDENCODEFEEDBACKFLAGS = layout.offsetof(8);
    }

    protected VkVideoEncodeCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeCapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeCapabilitiesKHR(address, container);
    }

    public VkVideoEncodeCapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkVideoEncodeCapabilityFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkVideoEncodeRateControlModeFlagsKHR")
    public int rateControlModes() {
        return nrateControlModes(address());
    }

    @NativeType("uint32_t")
    public int maxRateControlLayers() {
        return nmaxRateControlLayers(address());
    }

    @NativeType("uint64_t")
    public long maxBitrate() {
        return nmaxBitrate(address());
    }

    @NativeType("uint32_t")
    public int maxQualityLevels() {
        return nmaxQualityLevels(address());
    }

    public VkExtent2D encodeInputPictureGranularity() {
        return nencodeInputPictureGranularity(address());
    }

    @NativeType("VkVideoEncodeFeedbackFlagsKHR")
    public int supportedEncodeFeedbackFlags() {
        return nsupportedEncodeFeedbackFlags(address());
    }

    public VkVideoEncodeCapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeCapabilitiesKHR sType$Default() {
        return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR);
    }

    public VkVideoEncodeCapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeCapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeCapabilitiesKHR set(VkVideoEncodeCapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeCapabilitiesKHR malloc() {
        return new VkVideoEncodeCapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeCapabilitiesKHR calloc() {
        return new VkVideoEncodeCapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeCapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeCapabilitiesKHR create(long address) {
        return new VkVideoEncodeCapabilitiesKHR(address, null);
    }

    public static VkVideoEncodeCapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeCapabilitiesKHR(address, null);
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

    public static VkVideoEncodeCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrateControlModes(long struct) {
        return MemoryUtil.memGetInt(struct + RATECONTROLMODES);
    }

    public static int nmaxRateControlLayers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXRATECONTROLLAYERS);
    }

    public static long nmaxBitrate(long struct) {
        return MemoryUtil.memGetLong(struct + MAXBITRATE);
    }

    public static int nmaxQualityLevels(long struct) {
        return MemoryUtil.memGetInt(struct + MAXQUALITYLEVELS);
    }

    public static VkExtent2D nencodeInputPictureGranularity(long struct) {
        return VkExtent2D.create(struct + ENCODEINPUTPICTUREGRANULARITY);
    }

    public static int nsupportedEncodeFeedbackFlags(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDENCODEFEEDBACKFLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeCapabilitiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeCapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeCapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeCapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeCapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeCapabilitiesKHR.SIZEOF);
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
        public VkVideoEncodeCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeCapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeCapabilitiesKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeCapabilityFlagsKHR")
        public int flags() {
            return VkVideoEncodeCapabilitiesKHR.nflags(address());
        }

        @NativeType("VkVideoEncodeRateControlModeFlagsKHR")
        public int rateControlModes() {
            return VkVideoEncodeCapabilitiesKHR.nrateControlModes(address());
        }

        @NativeType("uint32_t")
        public int maxRateControlLayers() {
            return VkVideoEncodeCapabilitiesKHR.nmaxRateControlLayers(address());
        }

        @NativeType("uint64_t")
        public long maxBitrate() {
            return VkVideoEncodeCapabilitiesKHR.nmaxBitrate(address());
        }

        @NativeType("uint32_t")
        public int maxQualityLevels() {
            return VkVideoEncodeCapabilitiesKHR.nmaxQualityLevels(address());
        }

        public VkExtent2D encodeInputPictureGranularity() {
            return VkVideoEncodeCapabilitiesKHR.nencodeInputPictureGranularity(address());
        }

        @NativeType("VkVideoEncodeFeedbackFlagsKHR")
        public int supportedEncodeFeedbackFlags() {
            return VkVideoEncodeCapabilitiesKHR.nsupportedEncodeFeedbackFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeCapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeCapabilitiesKHR.npNext(address(), value);
            return this;
        }
    }
}
