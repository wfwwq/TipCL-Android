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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class */
public class VkPhysicalDeviceFragmentShadingRatePropertiesKHR extends Struct<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE;
    public static final int MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE;
    public static final int MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO;
    public static final int PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS;
    public static final int LAYEREDSHADINGRATEATTACHMENTS;
    public static final int FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS;
    public static final int MAXFRAGMENTSIZE;
    public static final int MAXFRAGMENTSIZEASPECTRATIO;
    public static final int MAXFRAGMENTSHADINGRATECOVERAGESAMPLES;
    public static final int MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES;
    public static final int FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES;
    public static final int FRAGMENTSHADINGRATEWITHSAMPLEMASK;
    public static final int FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK;
    public static final int FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION;
    public static final int FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK;
    public static final int FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS;
    public static final int FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE = layout.offsetof(2);
        MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE = layout.offsetof(3);
        MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO = layout.offsetof(4);
        PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS = layout.offsetof(5);
        LAYEREDSHADINGRATEATTACHMENTS = layout.offsetof(6);
        FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS = layout.offsetof(7);
        MAXFRAGMENTSIZE = layout.offsetof(8);
        MAXFRAGMENTSIZEASPECTRATIO = layout.offsetof(9);
        MAXFRAGMENTSHADINGRATECOVERAGESAMPLES = layout.offsetof(10);
        MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES = layout.offsetof(11);
        FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES = layout.offsetof(12);
        FRAGMENTSHADINGRATEWITHSAMPLEMASK = layout.offsetof(13);
        FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK = layout.offsetof(14);
        FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION = layout.offsetof(15);
        FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK = layout.offsetof(16);
        FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS = layout.offsetof(17);
        FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER = layout.offsetof(18);
    }

    protected VkPhysicalDeviceFragmentShadingRatePropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(address, container);
    }

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(ByteBuffer container) {
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

    public VkExtent2D minFragmentShadingRateAttachmentTexelSize() {
        return nminFragmentShadingRateAttachmentTexelSize(address());
    }

    public VkExtent2D maxFragmentShadingRateAttachmentTexelSize() {
        return nmaxFragmentShadingRateAttachmentTexelSize(address());
    }

    @NativeType("uint32_t")
    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() {
        return nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(address());
    }

    @NativeType("VkBool32")
    public boolean primitiveFragmentShadingRateWithMultipleViewports() {
        return nprimitiveFragmentShadingRateWithMultipleViewports(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean layeredShadingRateAttachments() {
        return nlayeredShadingRateAttachments(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fragmentShadingRateNonTrivialCombinerOps() {
        return nfragmentShadingRateNonTrivialCombinerOps(address()) != 0;
    }

    public VkExtent2D maxFragmentSize() {
        return nmaxFragmentSize(address());
    }

    @NativeType("uint32_t")
    public int maxFragmentSizeAspectRatio() {
        return nmaxFragmentSizeAspectRatio(address());
    }

    @NativeType("uint32_t")
    public int maxFragmentShadingRateCoverageSamples() {
        return nmaxFragmentShadingRateCoverageSamples(address());
    }

    @NativeType("VkSampleCountFlagBits")
    public int maxFragmentShadingRateRasterizationSamples() {
        return nmaxFragmentShadingRateRasterizationSamples(address());
    }

    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithShaderDepthStencilWrites() {
        return nfragmentShadingRateWithShaderDepthStencilWrites(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithSampleMask() {
        return nfragmentShadingRateWithSampleMask(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithShaderSampleMask() {
        return nfragmentShadingRateWithShaderSampleMask(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithConservativeRasterization() {
        return nfragmentShadingRateWithConservativeRasterization(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithFragmentShaderInterlock() {
        return nfragmentShadingRateWithFragmentShaderInterlock(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithCustomSampleLocations() {
        return nfragmentShadingRateWithCustomSampleLocations(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fragmentShadingRateStrictMultiplyCombiner() {
        return nfragmentShadingRateStrictMultiplyCombiner(address()) != 0;
    }

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType$Default() {
        return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR);
    }

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR set(VkPhysicalDeviceFragmentShadingRatePropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR malloc() {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR calloc() {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR create(long address) {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(address, null);
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

    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent2D nminFragmentShadingRateAttachmentTexelSize(long struct) {
        return VkExtent2D.create(struct + MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE);
    }

    public static VkExtent2D nmaxFragmentShadingRateAttachmentTexelSize(long struct) {
        return VkExtent2D.create(struct + MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE);
    }

    public static int nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO);
    }

    public static int nprimitiveFragmentShadingRateWithMultipleViewports(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS);
    }

    public static int nlayeredShadingRateAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + LAYEREDSHADINGRATEATTACHMENTS);
    }

    public static int nfragmentShadingRateNonTrivialCombinerOps(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS);
    }

    public static VkExtent2D nmaxFragmentSize(long struct) {
        return VkExtent2D.create(struct + MAXFRAGMENTSIZE);
    }

    public static int nmaxFragmentSizeAspectRatio(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAGMENTSIZEASPECTRATIO);
    }

    public static int nmaxFragmentShadingRateCoverageSamples(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAGMENTSHADINGRATECOVERAGESAMPLES);
    }

    public static int nmaxFragmentShadingRateRasterizationSamples(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES);
    }

    public static int nfragmentShadingRateWithShaderDepthStencilWrites(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES);
    }

    public static int nfragmentShadingRateWithSampleMask(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATEWITHSAMPLEMASK);
    }

    public static int nfragmentShadingRateWithShaderSampleMask(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK);
    }

    public static int nfragmentShadingRateWithConservativeRasterization(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION);
    }

    public static int nfragmentShadingRateWithFragmentShaderInterlock(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK);
    }

    public static int nfragmentShadingRateWithCustomSampleLocations(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS);
    }

    public static int nfragmentShadingRateStrictMultiplyCombiner(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRatePropertiesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFragmentShadingRatePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRatePropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF);
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
        public VkPhysicalDeviceFragmentShadingRatePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.npNext(address());
        }

        public VkExtent2D minFragmentShadingRateAttachmentTexelSize() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nminFragmentShadingRateAttachmentTexelSize(address());
        }

        public VkExtent2D maxFragmentShadingRateAttachmentTexelSize() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateAttachmentTexelSize(address());
        }

        @NativeType("uint32_t")
        public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(address());
        }

        @NativeType("VkBool32")
        public boolean primitiveFragmentShadingRateWithMultipleViewports() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nprimitiveFragmentShadingRateWithMultipleViewports(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean layeredShadingRateAttachments() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nlayeredShadingRateAttachments(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateNonTrivialCombinerOps() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateNonTrivialCombinerOps(address()) != 0;
        }

        public VkExtent2D maxFragmentSize() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentSize(address());
        }

        @NativeType("uint32_t")
        public int maxFragmentSizeAspectRatio() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentSizeAspectRatio(address());
        }

        @NativeType("uint32_t")
        public int maxFragmentShadingRateCoverageSamples() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateCoverageSamples(address());
        }

        @NativeType("VkSampleCountFlagBits")
        public int maxFragmentShadingRateRasterizationSamples() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateRasterizationSamples(address());
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithShaderDepthStencilWrites() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithShaderDepthStencilWrites(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithSampleMask() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithSampleMask(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithShaderSampleMask() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithShaderSampleMask(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithConservativeRasterization() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithConservativeRasterization(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithFragmentShaderInterlock() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithFragmentShaderInterlock(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithCustomSampleLocations() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithCustomSampleLocations(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateStrictMultiplyCombiner() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateStrictMultiplyCombiner(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentShadingRatePropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
