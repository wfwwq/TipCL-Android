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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoCapabilitiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoCapabilitiesKHR.class */
public class VkVideoCapabilitiesKHR extends Struct<VkVideoCapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int MINBITSTREAMBUFFEROFFSETALIGNMENT;
    public static final int MINBITSTREAMBUFFERSIZEALIGNMENT;
    public static final int PICTUREACCESSGRANULARITY;
    public static final int MINCODEDEXTENT;
    public static final int MAXCODEDEXTENT;
    public static final int MAXDPBSLOTS;
    public static final int MAXACTIVEREFERENCEPICTURES;
    public static final int STDHEADERVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(VkExtensionProperties.SIZEOF, VkExtensionProperties.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MINBITSTREAMBUFFEROFFSETALIGNMENT = layout.offsetof(3);
        MINBITSTREAMBUFFERSIZEALIGNMENT = layout.offsetof(4);
        PICTUREACCESSGRANULARITY = layout.offsetof(5);
        MINCODEDEXTENT = layout.offsetof(6);
        MAXCODEDEXTENT = layout.offsetof(7);
        MAXDPBSLOTS = layout.offsetof(8);
        MAXACTIVEREFERENCEPICTURES = layout.offsetof(9);
        STDHEADERVERSION = layout.offsetof(10);
    }

    protected VkVideoCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoCapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkVideoCapabilitiesKHR(address, container);
    }

    public VkVideoCapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("VkVideoCapabilityFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkDeviceSize")
    public long minBitstreamBufferOffsetAlignment() {
        return nminBitstreamBufferOffsetAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long minBitstreamBufferSizeAlignment() {
        return nminBitstreamBufferSizeAlignment(address());
    }

    public VkExtent2D pictureAccessGranularity() {
        return npictureAccessGranularity(address());
    }

    public VkExtent2D minCodedExtent() {
        return nminCodedExtent(address());
    }

    public VkExtent2D maxCodedExtent() {
        return nmaxCodedExtent(address());
    }

    @NativeType("uint32_t")
    public int maxDpbSlots() {
        return nmaxDpbSlots(address());
    }

    @NativeType("uint32_t")
    public int maxActiveReferencePictures() {
        return nmaxActiveReferencePictures(address());
    }

    public VkExtensionProperties stdHeaderVersion() {
        return nstdHeaderVersion(address());
    }

    public VkVideoCapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoCapabilitiesKHR sType$Default() {
        return sType(1000023001);
    }

    public VkVideoCapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoDecodeAV1CapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoDecodeCapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoDecodeH264CapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoDecodeH265CapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoDecodeVP9CapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeAV1CapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeAV1QuantizationMapCapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeCapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeH264CapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeH264QuantizationMapCapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeH265CapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeH265QuantizationMapCapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeIntraRefreshCapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeQuantizationMapCapabilitiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeRgbConversionCapabilitiesVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoCapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoCapabilitiesKHR set(VkVideoCapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoCapabilitiesKHR malloc() {
        return new VkVideoCapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoCapabilitiesKHR calloc() {
        return new VkVideoCapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoCapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoCapabilitiesKHR create(long address) {
        return new VkVideoCapabilitiesKHR(address, null);
    }

    public static VkVideoCapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoCapabilitiesKHR(address, null);
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

    public static VkVideoCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nminBitstreamBufferOffsetAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + MINBITSTREAMBUFFEROFFSETALIGNMENT);
    }

    public static long nminBitstreamBufferSizeAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + MINBITSTREAMBUFFERSIZEALIGNMENT);
    }

    public static VkExtent2D npictureAccessGranularity(long struct) {
        return VkExtent2D.create(struct + PICTUREACCESSGRANULARITY);
    }

    public static VkExtent2D nminCodedExtent(long struct) {
        return VkExtent2D.create(struct + MINCODEDEXTENT);
    }

    public static VkExtent2D nmaxCodedExtent(long struct) {
        return VkExtent2D.create(struct + MAXCODEDEXTENT);
    }

    public static int nmaxDpbSlots(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDPBSLOTS);
    }

    public static int nmaxActiveReferencePictures(long struct) {
        return MemoryUtil.memGetInt(struct + MAXACTIVEREFERENCEPICTURES);
    }

    public static VkExtensionProperties nstdHeaderVersion(long struct) {
        return VkExtensionProperties.create(struct + STDHEADERVERSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoCapabilitiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoCapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoCapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkVideoCapabilitiesKHR ELEMENT_FACTORY = VkVideoCapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoCapabilitiesKHR.SIZEOF);
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
        public VkVideoCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoCapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoCapabilitiesKHR.npNext(address());
        }

        @NativeType("VkVideoCapabilityFlagsKHR")
        public int flags() {
            return VkVideoCapabilitiesKHR.nflags(address());
        }

        @NativeType("VkDeviceSize")
        public long minBitstreamBufferOffsetAlignment() {
            return VkVideoCapabilitiesKHR.nminBitstreamBufferOffsetAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long minBitstreamBufferSizeAlignment() {
            return VkVideoCapabilitiesKHR.nminBitstreamBufferSizeAlignment(address());
        }

        public VkExtent2D pictureAccessGranularity() {
            return VkVideoCapabilitiesKHR.npictureAccessGranularity(address());
        }

        public VkExtent2D minCodedExtent() {
            return VkVideoCapabilitiesKHR.nminCodedExtent(address());
        }

        public VkExtent2D maxCodedExtent() {
            return VkVideoCapabilitiesKHR.nmaxCodedExtent(address());
        }

        @NativeType("uint32_t")
        public int maxDpbSlots() {
            return VkVideoCapabilitiesKHR.nmaxDpbSlots(address());
        }

        @NativeType("uint32_t")
        public int maxActiveReferencePictures() {
            return VkVideoCapabilitiesKHR.nmaxActiveReferencePictures(address());
        }

        public VkExtensionProperties stdHeaderVersion() {
            return VkVideoCapabilitiesKHR.nstdHeaderVersion(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoCapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000023001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoCapabilitiesKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoDecodeAV1CapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeCapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH264CapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH265CapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeVP9CapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeAV1CapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeAV1QuantizationMapCapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeCapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264CapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264QuantizationMapCapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265CapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265QuantizationMapCapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeIntraRefreshCapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeQuantizationMapCapabilitiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeRgbConversionCapabilitiesVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
