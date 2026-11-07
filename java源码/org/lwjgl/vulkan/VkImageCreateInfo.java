package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCreateInfo.class */
public class VkImageCreateInfo extends Struct<VkImageCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int IMAGETYPE;
    public static final int FORMAT;
    public static final int EXTENT;
    public static final int MIPLEVELS;
    public static final int ARRAYLAYERS;
    public static final int SAMPLES;
    public static final int TILING;
    public static final int USAGE;
    public static final int SHARINGMODE;
    public static final int QUEUEFAMILYINDEXCOUNT;
    public static final int PQUEUEFAMILYINDICES;
    public static final int INITIALLAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        IMAGETYPE = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        EXTENT = layout.offsetof(5);
        MIPLEVELS = layout.offsetof(6);
        ARRAYLAYERS = layout.offsetof(7);
        SAMPLES = layout.offsetof(8);
        TILING = layout.offsetof(9);
        USAGE = layout.offsetof(10);
        SHARINGMODE = layout.offsetof(11);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(12);
        PQUEUEFAMILYINDICES = layout.offsetof(13);
        INITIALLAYOUT = layout.offsetof(14);
    }

    protected VkImageCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageCreateInfo create(long address, ByteBuffer container) {
        return new VkImageCreateInfo(address, container);
    }

    public VkImageCreateInfo(ByteBuffer container) {
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

    @NativeType("VkImageCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkImageType")
    public int imageType() {
        return nimageType(address());
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    public VkExtent3D extent() {
        return nextent(address());
    }

    @NativeType("uint32_t")
    public int mipLevels() {
        return nmipLevels(address());
    }

    @NativeType("uint32_t")
    public int arrayLayers() {
        return narrayLayers(address());
    }

    @NativeType("VkSampleCountFlagBits")
    public int samples() {
        return nsamples(address());
    }

    @NativeType("VkImageTiling")
    public int tiling() {
        return ntiling(address());
    }

    @NativeType("VkImageUsageFlags")
    public int usage() {
        return nusage(address());
    }

    @NativeType("VkSharingMode")
    public int sharingMode() {
        return nsharingMode(address());
    }

    @NativeType("uint32_t")
    public int queueFamilyIndexCount() {
        return nqueueFamilyIndexCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pQueueFamilyIndices() {
        return npQueueFamilyIndices(address());
    }

    @NativeType("VkImageLayout")
    public int initialLayout() {
        return ninitialLayout(address());
    }

    public VkImageCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageCreateInfo sType$Default() {
        return sType(14);
    }

    public VkImageCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageCreateInfo pNext(VkDedicatedAllocationImageCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkExportMetalObjectCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkExternalFormatANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkExternalMemoryImageCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkExternalMemoryImageCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkExternalMemoryImageCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImageAlignmentControlCreateInfoMESA value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImageCompressionControlEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImageDrmFormatModifierExplicitCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImageDrmFormatModifierListCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImageFormatListCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImageFormatListCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImageStencilUsageCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImageStencilUsageCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImageSwapchainCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImportMetalIOSurfaceInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkImportMetalTextureInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkOpaqueCaptureDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkOpticalFlowImageFormatInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo pNext(VkVideoProfileListInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageCreateInfo flags(@NativeType("VkImageCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkImageCreateInfo imageType(@NativeType("VkImageType") int value) {
        nimageType(address(), value);
        return this;
    }

    public VkImageCreateInfo format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkImageCreateInfo extent(VkExtent3D value) {
        nextent(address(), value);
        return this;
    }

    public VkImageCreateInfo extent(Consumer<VkExtent3D> consumer) {
        consumer.accept(extent());
        return this;
    }

    public VkImageCreateInfo mipLevels(@NativeType("uint32_t") int value) {
        nmipLevels(address(), value);
        return this;
    }

    public VkImageCreateInfo arrayLayers(@NativeType("uint32_t") int value) {
        narrayLayers(address(), value);
        return this;
    }

    public VkImageCreateInfo samples(@NativeType("VkSampleCountFlagBits") int value) {
        nsamples(address(), value);
        return this;
    }

    public VkImageCreateInfo tiling(@NativeType("VkImageTiling") int value) {
        ntiling(address(), value);
        return this;
    }

    public VkImageCreateInfo usage(@NativeType("VkImageUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    public VkImageCreateInfo sharingMode(@NativeType("VkSharingMode") int value) {
        nsharingMode(address(), value);
        return this;
    }

    public VkImageCreateInfo queueFamilyIndexCount(@NativeType("uint32_t") int value) {
        nqueueFamilyIndexCount(address(), value);
        return this;
    }

    public VkImageCreateInfo pQueueFamilyIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npQueueFamilyIndices(address(), value);
        return this;
    }

    public VkImageCreateInfo initialLayout(@NativeType("VkImageLayout") int value) {
        ninitialLayout(address(), value);
        return this;
    }

    public VkImageCreateInfo set(int sType, long pNext, int flags, int imageType, int format, VkExtent3D extent, int mipLevels, int arrayLayers, int samples, int tiling, int usage, int sharingMode, int queueFamilyIndexCount, IntBuffer pQueueFamilyIndices, int initialLayout) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        imageType(imageType);
        format(format);
        extent(extent);
        mipLevels(mipLevels);
        arrayLayers(arrayLayers);
        samples(samples);
        tiling(tiling);
        usage(usage);
        sharingMode(sharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);
        initialLayout(initialLayout);
        return this;
    }

    public VkImageCreateInfo set(VkImageCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageCreateInfo malloc() {
        return new VkImageCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageCreateInfo calloc() {
        return new VkImageCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkImageCreateInfo create(long address) {
        return new VkImageCreateInfo(address, null);
    }

    public static VkImageCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageCreateInfo(address, null);
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

    public static VkImageCreateInfo malloc(MemoryStack stack) {
        return new VkImageCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageCreateInfo calloc(MemoryStack stack) {
        return new VkImageCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimageType(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGETYPE);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static VkExtent3D nextent(long struct) {
        return VkExtent3D.create(struct + EXTENT);
    }

    public static int nmipLevels(long struct) {
        return MemoryUtil.memGetInt(struct + MIPLEVELS);
    }

    public static int narrayLayers(long struct) {
        return MemoryUtil.memGetInt(struct + ARRAYLAYERS);
    }

    public static int nsamples(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLES);
    }

    public static int ntiling(long struct) {
        return MemoryUtil.memGetInt(struct + TILING);
    }

    public static int nusage(long struct) {
        return MemoryUtil.memGetInt(struct + USAGE);
    }

    public static int nsharingMode(long struct) {
        return MemoryUtil.memGetInt(struct + SHARINGMODE);
    }

    public static int nqueueFamilyIndexCount(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEFAMILYINDEXCOUNT);
    }

    public static IntBuffer npQueueFamilyIndices(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct));
    }

    public static int ninitialLayout(long struct) {
        return MemoryUtil.memGetInt(struct + INITIALLAYOUT);
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

    public static void nimageType(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGETYPE, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nextent(long struct, VkExtent3D value) {
        MemoryUtil.memCopy(value.address(), struct + EXTENT, VkExtent3D.SIZEOF);
    }

    public static void nmipLevels(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIPLEVELS, value);
    }

    public static void narrayLayers(long struct, int value) {
        MemoryUtil.memPutInt(struct + ARRAYLAYERS, value);
    }

    public static void nsamples(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLES, value);
    }

    public static void ntiling(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILING, value);
    }

    public static void nusage(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGE, value);
    }

    public static void nsharingMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHARINGMODE, value);
    }

    public static void nqueueFamilyIndexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUEFAMILYINDEXCOUNT, value);
    }

    public static void npQueueFamilyIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PQUEUEFAMILYINDICES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nqueueFamilyIndexCount(struct, value.remaining());
        }
    }

    public static void ninitialLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + INITIALLAYOUT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageCreateInfo, Buffer> implements NativeResource {
        private static final VkImageCreateInfo ELEMENT_FACTORY = VkImageCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageCreateInfo.SIZEOF);
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
        public VkImageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageCreateInfo.npNext(address());
        }

        @NativeType("VkImageCreateFlags")
        public int flags() {
            return VkImageCreateInfo.nflags(address());
        }

        @NativeType("VkImageType")
        public int imageType() {
            return VkImageCreateInfo.nimageType(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkImageCreateInfo.nformat(address());
        }

        public VkExtent3D extent() {
            return VkImageCreateInfo.nextent(address());
        }

        @NativeType("uint32_t")
        public int mipLevels() {
            return VkImageCreateInfo.nmipLevels(address());
        }

        @NativeType("uint32_t")
        public int arrayLayers() {
            return VkImageCreateInfo.narrayLayers(address());
        }

        @NativeType("VkSampleCountFlagBits")
        public int samples() {
            return VkImageCreateInfo.nsamples(address());
        }

        @NativeType("VkImageTiling")
        public int tiling() {
            return VkImageCreateInfo.ntiling(address());
        }

        @NativeType("VkImageUsageFlags")
        public int usage() {
            return VkImageCreateInfo.nusage(address());
        }

        @NativeType("VkSharingMode")
        public int sharingMode() {
            return VkImageCreateInfo.nsharingMode(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndexCount() {
            return VkImageCreateInfo.nqueueFamilyIndexCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pQueueFamilyIndices() {
            return VkImageCreateInfo.npQueueFamilyIndices(address());
        }

        @NativeType("VkImageLayout")
        public int initialLayout() {
            return VkImageCreateInfo.ninitialLayout(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(14);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDedicatedAllocationImageCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportMetalObjectCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalFormatANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalMemoryImageCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalMemoryImageCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalMemoryImageCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageAlignmentControlCreateInfoMESA value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageCompressionControlEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageDrmFormatModifierExplicitCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageDrmFormatModifierListCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageFormatListCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageFormatListCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageStencilUsageCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageStencilUsageCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageSwapchainCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportMetalIOSurfaceInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportMetalTextureInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkOpaqueCaptureDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkOpticalFlowImageFormatInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoProfileListInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkImageCreateFlags") int value) {
            VkImageCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer imageType(@NativeType("VkImageType") int value) {
            VkImageCreateInfo.nimageType(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkImageCreateInfo.nformat(address(), value);
            return this;
        }

        public Buffer extent(VkExtent3D value) {
            VkImageCreateInfo.nextent(address(), value);
            return this;
        }

        public Buffer extent(Consumer<VkExtent3D> consumer) {
            consumer.accept(extent());
            return this;
        }

        public Buffer mipLevels(@NativeType("uint32_t") int value) {
            VkImageCreateInfo.nmipLevels(address(), value);
            return this;
        }

        public Buffer arrayLayers(@NativeType("uint32_t") int value) {
            VkImageCreateInfo.narrayLayers(address(), value);
            return this;
        }

        public Buffer samples(@NativeType("VkSampleCountFlagBits") int value) {
            VkImageCreateInfo.nsamples(address(), value);
            return this;
        }

        public Buffer tiling(@NativeType("VkImageTiling") int value) {
            VkImageCreateInfo.ntiling(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("VkImageUsageFlags") int value) {
            VkImageCreateInfo.nusage(address(), value);
            return this;
        }

        public Buffer sharingMode(@NativeType("VkSharingMode") int value) {
            VkImageCreateInfo.nsharingMode(address(), value);
            return this;
        }

        public Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) {
            VkImageCreateInfo.nqueueFamilyIndexCount(address(), value);
            return this;
        }

        public Buffer pQueueFamilyIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkImageCreateInfo.npQueueFamilyIndices(address(), value);
            return this;
        }

        public Buffer initialLayout(@NativeType("VkImageLayout") int value) {
            VkImageCreateInfo.ninitialLayout(address(), value);
            return this;
        }
    }
}
