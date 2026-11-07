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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainCreateInfoKHR.class */
public class VkSwapchainCreateInfoKHR extends Struct<VkSwapchainCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int SURFACE;
    public static final int MINIMAGECOUNT;
    public static final int IMAGEFORMAT;
    public static final int IMAGECOLORSPACE;
    public static final int IMAGEEXTENT;
    public static final int IMAGEARRAYLAYERS;
    public static final int IMAGEUSAGE;
    public static final int IMAGESHARINGMODE;
    public static final int QUEUEFAMILYINDEXCOUNT;
    public static final int PQUEUEFAMILYINDICES;
    public static final int PRETRANSFORM;
    public static final int COMPOSITEALPHA;
    public static final int PRESENTMODE;
    public static final int CLIPPED;
    public static final int OLDSWAPCHAIN;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(4), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SURFACE = layout.offsetof(3);
        MINIMAGECOUNT = layout.offsetof(4);
        IMAGEFORMAT = layout.offsetof(5);
        IMAGECOLORSPACE = layout.offsetof(6);
        IMAGEEXTENT = layout.offsetof(7);
        IMAGEARRAYLAYERS = layout.offsetof(8);
        IMAGEUSAGE = layout.offsetof(9);
        IMAGESHARINGMODE = layout.offsetof(10);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(11);
        PQUEUEFAMILYINDICES = layout.offsetof(12);
        PRETRANSFORM = layout.offsetof(13);
        COMPOSITEALPHA = layout.offsetof(14);
        PRESENTMODE = layout.offsetof(15);
        CLIPPED = layout.offsetof(16);
        OLDSWAPCHAIN = layout.offsetof(17);
    }

    protected VkSwapchainCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkSwapchainCreateInfoKHR(address, container);
    }

    public VkSwapchainCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkSwapchainCreateFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkSurfaceKHR")
    public long surface() {
        return nsurface(address());
    }

    @NativeType("uint32_t")
    public int minImageCount() {
        return nminImageCount(address());
    }

    @NativeType("VkFormat")
    public int imageFormat() {
        return nimageFormat(address());
    }

    @NativeType("VkColorSpaceKHR")
    public int imageColorSpace() {
        return nimageColorSpace(address());
    }

    public VkExtent2D imageExtent() {
        return nimageExtent(address());
    }

    @NativeType("uint32_t")
    public int imageArrayLayers() {
        return nimageArrayLayers(address());
    }

    @NativeType("VkImageUsageFlags")
    public int imageUsage() {
        return nimageUsage(address());
    }

    @NativeType("VkSharingMode")
    public int imageSharingMode() {
        return nimageSharingMode(address());
    }

    @NativeType("uint32_t")
    public int queueFamilyIndexCount() {
        return nqueueFamilyIndexCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pQueueFamilyIndices() {
        return npQueueFamilyIndices(address());
    }

    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int preTransform() {
        return npreTransform(address());
    }

    @NativeType("VkCompositeAlphaFlagBitsKHR")
    public int compositeAlpha() {
        return ncompositeAlpha(address());
    }

    @NativeType("VkPresentModeKHR")
    public int presentMode() {
        return npresentMode(address());
    }

    @NativeType("VkBool32")
    public boolean clipped() {
        return nclipped(address()) != 0;
    }

    @NativeType("VkSwapchainKHR")
    public long oldSwapchain() {
        return noldSwapchain(address());
    }

    public VkSwapchainCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR sType$Default() {
        return sType(1000001000);
    }

    public VkSwapchainCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR pNext(VkDeviceGroupSwapchainCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkImageCompressionControlEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkImageFormatListCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkImageFormatListCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkSurfaceFullScreenExclusiveInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkSurfaceFullScreenExclusiveWin32InfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkSwapchainCounterCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkSwapchainDisplayNativeHdrCreateInfoAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkSwapchainLatencyCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkSwapchainPresentBarrierCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkSwapchainPresentModesCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkSwapchainPresentModesCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkSwapchainPresentScalingCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR pNext(VkSwapchainPresentScalingCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSwapchainCreateInfoKHR flags(@NativeType("VkSwapchainCreateFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR surface(@NativeType("VkSurfaceKHR") long value) {
        nsurface(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR minImageCount(@NativeType("uint32_t") int value) {
        nminImageCount(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR imageFormat(@NativeType("VkFormat") int value) {
        nimageFormat(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR imageColorSpace(@NativeType("VkColorSpaceKHR") int value) {
        nimageColorSpace(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR imageExtent(VkExtent2D value) {
        nimageExtent(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR imageExtent(Consumer<VkExtent2D> consumer) {
        consumer.accept(imageExtent());
        return this;
    }

    public VkSwapchainCreateInfoKHR imageArrayLayers(@NativeType("uint32_t") int value) {
        nimageArrayLayers(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR imageUsage(@NativeType("VkImageUsageFlags") int value) {
        nimageUsage(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR imageSharingMode(@NativeType("VkSharingMode") int value) {
        nimageSharingMode(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR queueFamilyIndexCount(@NativeType("uint32_t") int value) {
        nqueueFamilyIndexCount(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR pQueueFamilyIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npQueueFamilyIndices(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR preTransform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) {
        npreTransform(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR compositeAlpha(@NativeType("VkCompositeAlphaFlagBitsKHR") int value) {
        ncompositeAlpha(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR presentMode(@NativeType("VkPresentModeKHR") int value) {
        npresentMode(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR clipped(@NativeType("VkBool32") boolean value) {
        nclipped(address(), value ? 1 : 0);
        return this;
    }

    public VkSwapchainCreateInfoKHR oldSwapchain(@NativeType("VkSwapchainKHR") long value) {
        noldSwapchain(address(), value);
        return this;
    }

    public VkSwapchainCreateInfoKHR set(int sType, long pNext, int flags, long surface, int minImageCount, int imageFormat, int imageColorSpace, VkExtent2D imageExtent, int imageArrayLayers, int imageUsage, int imageSharingMode, int queueFamilyIndexCount, IntBuffer pQueueFamilyIndices, int preTransform, int compositeAlpha, int presentMode, boolean clipped, long oldSwapchain) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        surface(surface);
        minImageCount(minImageCount);
        imageFormat(imageFormat);
        imageColorSpace(imageColorSpace);
        imageExtent(imageExtent);
        imageArrayLayers(imageArrayLayers);
        imageUsage(imageUsage);
        imageSharingMode(imageSharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);
        preTransform(preTransform);
        compositeAlpha(compositeAlpha);
        presentMode(presentMode);
        clipped(clipped);
        oldSwapchain(oldSwapchain);
        return this;
    }

    public VkSwapchainCreateInfoKHR set(VkSwapchainCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainCreateInfoKHR malloc() {
        return new VkSwapchainCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainCreateInfoKHR calloc() {
        return new VkSwapchainCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainCreateInfoKHR create(long address) {
        return new VkSwapchainCreateInfoKHR(address, null);
    }

    public static VkSwapchainCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainCreateInfoKHR(address, null);
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

    public static VkSwapchainCreateInfoKHR malloc(MemoryStack stack) {
        return new VkSwapchainCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainCreateInfoKHR calloc(MemoryStack stack) {
        return new VkSwapchainCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsurface(long struct) {
        return MemoryUtil.memGetLong(struct + SURFACE);
    }

    public static int nminImageCount(long struct) {
        return MemoryUtil.memGetInt(struct + MINIMAGECOUNT);
    }

    public static int nimageFormat(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEFORMAT);
    }

    public static int nimageColorSpace(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGECOLORSPACE);
    }

    public static VkExtent2D nimageExtent(long struct) {
        return VkExtent2D.create(struct + IMAGEEXTENT);
    }

    public static int nimageArrayLayers(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEARRAYLAYERS);
    }

    public static int nimageUsage(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEUSAGE);
    }

    public static int nimageSharingMode(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGESHARINGMODE);
    }

    public static int nqueueFamilyIndexCount(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEFAMILYINDEXCOUNT);
    }

    public static IntBuffer npQueueFamilyIndices(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct));
    }

    public static int npreTransform(long struct) {
        return MemoryUtil.memGetInt(struct + PRETRANSFORM);
    }

    public static int ncompositeAlpha(long struct) {
        return MemoryUtil.memGetInt(struct + COMPOSITEALPHA);
    }

    public static int npresentMode(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTMODE);
    }

    public static int nclipped(long struct) {
        return MemoryUtil.memGetInt(struct + CLIPPED);
    }

    public static long noldSwapchain(long struct) {
        return MemoryUtil.memGetLong(struct + OLDSWAPCHAIN);
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

    public static void nsurface(long struct, long value) {
        MemoryUtil.memPutLong(struct + SURFACE, value);
    }

    public static void nminImageCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MINIMAGECOUNT, value);
    }

    public static void nimageFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEFORMAT, value);
    }

    public static void nimageColorSpace(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGECOLORSPACE, value);
    }

    public static void nimageExtent(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + IMAGEEXTENT, VkExtent2D.SIZEOF);
    }

    public static void nimageArrayLayers(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEARRAYLAYERS, value);
    }

    public static void nimageUsage(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEUSAGE, value);
    }

    public static void nimageSharingMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGESHARINGMODE, value);
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

    public static void npreTransform(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRETRANSFORM, value);
    }

    public static void ncompositeAlpha(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPOSITEALPHA, value);
    }

    public static void npresentMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTMODE, value);
    }

    public static void nclipped(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLIPPED, value);
    }

    public static void noldSwapchain(long struct, long value) {
        MemoryUtil.memPutLong(struct + OLDSWAPCHAIN, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkSwapchainCreateInfoKHR ELEMENT_FACTORY = VkSwapchainCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainCreateInfoKHR.SIZEOF);
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
        public VkSwapchainCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSwapchainCreateInfoKHR.npNext(address());
        }

        @NativeType("VkSwapchainCreateFlagsKHR")
        public int flags() {
            return VkSwapchainCreateInfoKHR.nflags(address());
        }

        @NativeType("VkSurfaceKHR")
        public long surface() {
            return VkSwapchainCreateInfoKHR.nsurface(address());
        }

        @NativeType("uint32_t")
        public int minImageCount() {
            return VkSwapchainCreateInfoKHR.nminImageCount(address());
        }

        @NativeType("VkFormat")
        public int imageFormat() {
            return VkSwapchainCreateInfoKHR.nimageFormat(address());
        }

        @NativeType("VkColorSpaceKHR")
        public int imageColorSpace() {
            return VkSwapchainCreateInfoKHR.nimageColorSpace(address());
        }

        public VkExtent2D imageExtent() {
            return VkSwapchainCreateInfoKHR.nimageExtent(address());
        }

        @NativeType("uint32_t")
        public int imageArrayLayers() {
            return VkSwapchainCreateInfoKHR.nimageArrayLayers(address());
        }

        @NativeType("VkImageUsageFlags")
        public int imageUsage() {
            return VkSwapchainCreateInfoKHR.nimageUsage(address());
        }

        @NativeType("VkSharingMode")
        public int imageSharingMode() {
            return VkSwapchainCreateInfoKHR.nimageSharingMode(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndexCount() {
            return VkSwapchainCreateInfoKHR.nqueueFamilyIndexCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pQueueFamilyIndices() {
            return VkSwapchainCreateInfoKHR.npQueueFamilyIndices(address());
        }

        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int preTransform() {
            return VkSwapchainCreateInfoKHR.npreTransform(address());
        }

        @NativeType("VkCompositeAlphaFlagBitsKHR")
        public int compositeAlpha() {
            return VkSwapchainCreateInfoKHR.ncompositeAlpha(address());
        }

        @NativeType("VkPresentModeKHR")
        public int presentMode() {
            return VkSwapchainCreateInfoKHR.npresentMode(address());
        }

        @NativeType("VkBool32")
        public boolean clipped() {
            return VkSwapchainCreateInfoKHR.nclipped(address()) != 0;
        }

        @NativeType("VkSwapchainKHR")
        public long oldSwapchain() {
            return VkSwapchainCreateInfoKHR.noldSwapchain(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000001000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDeviceGroupSwapchainCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageCompressionControlEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageFormatListCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageFormatListCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSurfaceFullScreenExclusiveInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSurfaceFullScreenExclusiveWin32InfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainCounterCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainDisplayNativeHdrCreateInfoAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainLatencyCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainPresentBarrierCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainPresentModesCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainPresentModesCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainPresentScalingCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainPresentScalingCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkSwapchainCreateFlagsKHR") int value) {
            VkSwapchainCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer surface(@NativeType("VkSurfaceKHR") long value) {
            VkSwapchainCreateInfoKHR.nsurface(address(), value);
            return this;
        }

        public Buffer minImageCount(@NativeType("uint32_t") int value) {
            VkSwapchainCreateInfoKHR.nminImageCount(address(), value);
            return this;
        }

        public Buffer imageFormat(@NativeType("VkFormat") int value) {
            VkSwapchainCreateInfoKHR.nimageFormat(address(), value);
            return this;
        }

        public Buffer imageColorSpace(@NativeType("VkColorSpaceKHR") int value) {
            VkSwapchainCreateInfoKHR.nimageColorSpace(address(), value);
            return this;
        }

        public Buffer imageExtent(VkExtent2D value) {
            VkSwapchainCreateInfoKHR.nimageExtent(address(), value);
            return this;
        }

        public Buffer imageExtent(Consumer<VkExtent2D> consumer) {
            consumer.accept(imageExtent());
            return this;
        }

        public Buffer imageArrayLayers(@NativeType("uint32_t") int value) {
            VkSwapchainCreateInfoKHR.nimageArrayLayers(address(), value);
            return this;
        }

        public Buffer imageUsage(@NativeType("VkImageUsageFlags") int value) {
            VkSwapchainCreateInfoKHR.nimageUsage(address(), value);
            return this;
        }

        public Buffer imageSharingMode(@NativeType("VkSharingMode") int value) {
            VkSwapchainCreateInfoKHR.nimageSharingMode(address(), value);
            return this;
        }

        public Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) {
            VkSwapchainCreateInfoKHR.nqueueFamilyIndexCount(address(), value);
            return this;
        }

        public Buffer pQueueFamilyIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkSwapchainCreateInfoKHR.npQueueFamilyIndices(address(), value);
            return this;
        }

        public Buffer preTransform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) {
            VkSwapchainCreateInfoKHR.npreTransform(address(), value);
            return this;
        }

        public Buffer compositeAlpha(@NativeType("VkCompositeAlphaFlagBitsKHR") int value) {
            VkSwapchainCreateInfoKHR.ncompositeAlpha(address(), value);
            return this;
        }

        public Buffer presentMode(@NativeType("VkPresentModeKHR") int value) {
            VkSwapchainCreateInfoKHR.npresentMode(address(), value);
            return this;
        }

        public Buffer clipped(@NativeType("VkBool32") boolean value) {
            VkSwapchainCreateInfoKHR.nclipped(address(), value ? 1 : 0);
            return this;
        }

        public Buffer oldSwapchain(@NativeType("VkSwapchainKHR") long value) {
            VkSwapchainCreateInfoKHR.noldSwapchain(address(), value);
            return this;
        }
    }
}
