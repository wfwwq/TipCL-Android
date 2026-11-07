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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan14Properties.class */
public class VkPhysicalDeviceVulkan14Properties extends Struct<VkPhysicalDeviceVulkan14Properties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LINESUBPIXELPRECISIONBITS;
    public static final int MAXVERTEXATTRIBDIVISOR;
    public static final int SUPPORTSNONZEROFIRSTINSTANCE;
    public static final int MAXPUSHDESCRIPTORS;
    public static final int DYNAMICRENDERINGLOCALREADDEPTHSTENCILATTACHMENTS;
    public static final int DYNAMICRENDERINGLOCALREADMULTISAMPLEDATTACHMENTS;
    public static final int EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING;
    public static final int EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING;
    public static final int DEPTHSTENCILSWIZZLEONESUPPORT;
    public static final int POLYGONMODEPOINTSIZE;
    public static final int NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM;
    public static final int NONSTRICTWIDELINESUSEPARALLELOGRAM;
    public static final int BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS;
    public static final int MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT;
    public static final int FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS;
    public static final int DEFAULTROBUSTNESSSTORAGEBUFFERS;
    public static final int DEFAULTROBUSTNESSUNIFORMBUFFERS;
    public static final int DEFAULTROBUSTNESSVERTEXINPUTS;
    public static final int DEFAULTROBUSTNESSIMAGES;
    public static final int COPYSRCLAYOUTCOUNT;
    public static final int PCOPYSRCLAYOUTS;
    public static final int COPYDSTLAYOUTCOUNT;
    public static final int PCOPYDSTLAYOUTS;
    public static final int OPTIMALTILINGLAYOUTUUID;
    public static final int IDENTICALMEMORYTYPEREQUIREMENTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __array(1, 16), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LINESUBPIXELPRECISIONBITS = layout.offsetof(2);
        MAXVERTEXATTRIBDIVISOR = layout.offsetof(3);
        SUPPORTSNONZEROFIRSTINSTANCE = layout.offsetof(4);
        MAXPUSHDESCRIPTORS = layout.offsetof(5);
        DYNAMICRENDERINGLOCALREADDEPTHSTENCILATTACHMENTS = layout.offsetof(6);
        DYNAMICRENDERINGLOCALREADMULTISAMPLEDATTACHMENTS = layout.offsetof(7);
        EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING = layout.offsetof(8);
        EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING = layout.offsetof(9);
        DEPTHSTENCILSWIZZLEONESUPPORT = layout.offsetof(10);
        POLYGONMODEPOINTSIZE = layout.offsetof(11);
        NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM = layout.offsetof(12);
        NONSTRICTWIDELINESUSEPARALLELOGRAM = layout.offsetof(13);
        BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS = layout.offsetof(14);
        MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT = layout.offsetof(15);
        FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS = layout.offsetof(16);
        DEFAULTROBUSTNESSSTORAGEBUFFERS = layout.offsetof(17);
        DEFAULTROBUSTNESSUNIFORMBUFFERS = layout.offsetof(18);
        DEFAULTROBUSTNESSVERTEXINPUTS = layout.offsetof(19);
        DEFAULTROBUSTNESSIMAGES = layout.offsetof(20);
        COPYSRCLAYOUTCOUNT = layout.offsetof(21);
        PCOPYSRCLAYOUTS = layout.offsetof(22);
        COPYDSTLAYOUTCOUNT = layout.offsetof(23);
        PCOPYDSTLAYOUTS = layout.offsetof(24);
        OPTIMALTILINGLAYOUTUUID = layout.offsetof(25);
        IDENTICALMEMORYTYPEREQUIREMENTS = layout.offsetof(26);
    }

    protected VkPhysicalDeviceVulkan14Properties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVulkan14Properties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVulkan14Properties(address, container);
    }

    public VkPhysicalDeviceVulkan14Properties(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int lineSubPixelPrecisionBits() {
        return nlineSubPixelPrecisionBits(address());
    }

    @NativeType("uint32_t")
    public int maxVertexAttribDivisor() {
        return nmaxVertexAttribDivisor(address());
    }

    @NativeType("VkBool32")
    public boolean supportsNonZeroFirstInstance() {
        return nsupportsNonZeroFirstInstance(address()) != 0;
    }

    @NativeType("uint32_t")
    public int maxPushDescriptors() {
        return nmaxPushDescriptors(address());
    }

    @NativeType("VkBool32")
    public boolean dynamicRenderingLocalReadDepthStencilAttachments() {
        return ndynamicRenderingLocalReadDepthStencilAttachments(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dynamicRenderingLocalReadMultisampledAttachments() {
        return ndynamicRenderingLocalReadMultisampledAttachments(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean earlyFragmentMultisampleCoverageAfterSampleCounting() {
        return nearlyFragmentMultisampleCoverageAfterSampleCounting(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean earlyFragmentSampleMaskTestBeforeSampleCounting() {
        return nearlyFragmentSampleMaskTestBeforeSampleCounting(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean depthStencilSwizzleOneSupport() {
        return ndepthStencilSwizzleOneSupport(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean polygonModePointSize() {
        return npolygonModePointSize(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean nonStrictSinglePixelWideLinesUseParallelogram() {
        return nnonStrictSinglePixelWideLinesUseParallelogram(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean nonStrictWideLinesUseParallelogram() {
        return nnonStrictWideLinesUseParallelogram(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean blockTexelViewCompatibleMultipleLayers() {
        return nblockTexelViewCompatibleMultipleLayers(address()) != 0;
    }

    @NativeType("uint32_t")
    public int maxCombinedImageSamplerDescriptorCount() {
        return nmaxCombinedImageSamplerDescriptorCount(address());
    }

    @NativeType("VkBool32")
    public boolean fragmentShadingRateClampCombinerInputs() {
        return nfragmentShadingRateClampCombinerInputs(address()) != 0;
    }

    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessStorageBuffers() {
        return ndefaultRobustnessStorageBuffers(address());
    }

    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessUniformBuffers() {
        return ndefaultRobustnessUniformBuffers(address());
    }

    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessVertexInputs() {
        return ndefaultRobustnessVertexInputs(address());
    }

    @NativeType("VkPipelineRobustnessImageBehavior")
    public int defaultRobustnessImages() {
        return ndefaultRobustnessImages(address());
    }

    @NativeType("uint32_t")
    public int copySrcLayoutCount() {
        return ncopySrcLayoutCount(address());
    }

    @NativeType("VkImageLayout *")
    public IntBuffer pCopySrcLayouts() {
        return npCopySrcLayouts(address());
    }

    @NativeType("uint32_t")
    public int copyDstLayoutCount() {
        return ncopyDstLayoutCount(address());
    }

    @NativeType("VkImageLayout *")
    public IntBuffer pCopyDstLayouts() {
        return npCopyDstLayouts(address());
    }

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer optimalTilingLayoutUUID() {
        return noptimalTilingLayoutUUID(address());
    }

    @NativeType("uint8_t")
    public byte optimalTilingLayoutUUID(int index) {
        return noptimalTilingLayoutUUID(address(), index);
    }

    @NativeType("VkBool32")
    public boolean identicalMemoryTypeRequirements() {
        return nidenticalMemoryTypeRequirements(address()) != 0;
    }

    public VkPhysicalDeviceVulkan14Properties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan14Properties sType$Default() {
        return sType(56);
    }

    public VkPhysicalDeviceVulkan14Properties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan14Properties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceVulkan14Properties set(VkPhysicalDeviceVulkan14Properties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVulkan14Properties malloc() {
        return new VkPhysicalDeviceVulkan14Properties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan14Properties calloc() {
        return new VkPhysicalDeviceVulkan14Properties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan14Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan14Properties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVulkan14Properties create(long address) {
        return new VkPhysicalDeviceVulkan14Properties(address, null);
    }

    public static VkPhysicalDeviceVulkan14Properties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVulkan14Properties(address, null);
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

    public static VkPhysicalDeviceVulkan14Properties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan14Properties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan14Properties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan14Properties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlineSubPixelPrecisionBits(long struct) {
        return MemoryUtil.memGetInt(struct + LINESUBPIXELPRECISIONBITS);
    }

    public static int nmaxVertexAttribDivisor(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVERTEXATTRIBDIVISOR);
    }

    public static int nsupportsNonZeroFirstInstance(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTSNONZEROFIRSTINSTANCE);
    }

    public static int nmaxPushDescriptors(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPUSHDESCRIPTORS);
    }

    public static int ndynamicRenderingLocalReadDepthStencilAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + DYNAMICRENDERINGLOCALREADDEPTHSTENCILATTACHMENTS);
    }

    public static int ndynamicRenderingLocalReadMultisampledAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + DYNAMICRENDERINGLOCALREADMULTISAMPLEDATTACHMENTS);
    }

    public static int nearlyFragmentMultisampleCoverageAfterSampleCounting(long struct) {
        return MemoryUtil.memGetInt(struct + EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING);
    }

    public static int nearlyFragmentSampleMaskTestBeforeSampleCounting(long struct) {
        return MemoryUtil.memGetInt(struct + EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING);
    }

    public static int ndepthStencilSwizzleOneSupport(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHSTENCILSWIZZLEONESUPPORT);
    }

    public static int npolygonModePointSize(long struct) {
        return MemoryUtil.memGetInt(struct + POLYGONMODEPOINTSIZE);
    }

    public static int nnonStrictSinglePixelWideLinesUseParallelogram(long struct) {
        return MemoryUtil.memGetInt(struct + NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM);
    }

    public static int nnonStrictWideLinesUseParallelogram(long struct) {
        return MemoryUtil.memGetInt(struct + NONSTRICTWIDELINESUSEPARALLELOGRAM);
    }

    public static int nblockTexelViewCompatibleMultipleLayers(long struct) {
        return MemoryUtil.memGetInt(struct + BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS);
    }

    public static int nmaxCombinedImageSamplerDescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT);
    }

    public static int nfragmentShadingRateClampCombinerInputs(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS);
    }

    public static int ndefaultRobustnessStorageBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULTROBUSTNESSSTORAGEBUFFERS);
    }

    public static int ndefaultRobustnessUniformBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULTROBUSTNESSUNIFORMBUFFERS);
    }

    public static int ndefaultRobustnessVertexInputs(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULTROBUSTNESSVERTEXINPUTS);
    }

    public static int ndefaultRobustnessImages(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULTROBUSTNESSIMAGES);
    }

    public static int ncopySrcLayoutCount(long struct) {
        return MemoryUtil.memGetInt(struct + COPYSRCLAYOUTCOUNT);
    }

    public static IntBuffer npCopySrcLayouts(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCOPYSRCLAYOUTS), ncopySrcLayoutCount(struct));
    }

    public static int ncopyDstLayoutCount(long struct) {
        return MemoryUtil.memGetInt(struct + COPYDSTLAYOUTCOUNT);
    }

    public static IntBuffer npCopyDstLayouts(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCOPYDSTLAYOUTS), ncopyDstLayoutCount(struct));
    }

    public static ByteBuffer noptimalTilingLayoutUUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + OPTIMALTILINGLAYOUTUUID, 16);
    }

    public static byte noptimalTilingLayoutUUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + OPTIMALTILINGLAYOUTUUID + (Checks.check(index, 16) * 1));
    }

    public static int nidenticalMemoryTypeRequirements(long struct) {
        return MemoryUtil.memGetInt(struct + IDENTICALMEMORYTYPEREQUIREMENTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan14Properties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan14Properties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVulkan14Properties ELEMENT_FACTORY = VkPhysicalDeviceVulkan14Properties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVulkan14Properties.SIZEOF);
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
        public VkPhysicalDeviceVulkan14Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVulkan14Properties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVulkan14Properties.npNext(address());
        }

        @NativeType("uint32_t")
        public int lineSubPixelPrecisionBits() {
            return VkPhysicalDeviceVulkan14Properties.nlineSubPixelPrecisionBits(address());
        }

        @NativeType("uint32_t")
        public int maxVertexAttribDivisor() {
            return VkPhysicalDeviceVulkan14Properties.nmaxVertexAttribDivisor(address());
        }

        @NativeType("VkBool32")
        public boolean supportsNonZeroFirstInstance() {
            return VkPhysicalDeviceVulkan14Properties.nsupportsNonZeroFirstInstance(address()) != 0;
        }

        @NativeType("uint32_t")
        public int maxPushDescriptors() {
            return VkPhysicalDeviceVulkan14Properties.nmaxPushDescriptors(address());
        }

        @NativeType("VkBool32")
        public boolean dynamicRenderingLocalReadDepthStencilAttachments() {
            return VkPhysicalDeviceVulkan14Properties.ndynamicRenderingLocalReadDepthStencilAttachments(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dynamicRenderingLocalReadMultisampledAttachments() {
            return VkPhysicalDeviceVulkan14Properties.ndynamicRenderingLocalReadMultisampledAttachments(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean earlyFragmentMultisampleCoverageAfterSampleCounting() {
            return VkPhysicalDeviceVulkan14Properties.nearlyFragmentMultisampleCoverageAfterSampleCounting(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean earlyFragmentSampleMaskTestBeforeSampleCounting() {
            return VkPhysicalDeviceVulkan14Properties.nearlyFragmentSampleMaskTestBeforeSampleCounting(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean depthStencilSwizzleOneSupport() {
            return VkPhysicalDeviceVulkan14Properties.ndepthStencilSwizzleOneSupport(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean polygonModePointSize() {
            return VkPhysicalDeviceVulkan14Properties.npolygonModePointSize(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean nonStrictSinglePixelWideLinesUseParallelogram() {
            return VkPhysicalDeviceVulkan14Properties.nnonStrictSinglePixelWideLinesUseParallelogram(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean nonStrictWideLinesUseParallelogram() {
            return VkPhysicalDeviceVulkan14Properties.nnonStrictWideLinesUseParallelogram(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean blockTexelViewCompatibleMultipleLayers() {
            return VkPhysicalDeviceVulkan14Properties.nblockTexelViewCompatibleMultipleLayers(address()) != 0;
        }

        @NativeType("uint32_t")
        public int maxCombinedImageSamplerDescriptorCount() {
            return VkPhysicalDeviceVulkan14Properties.nmaxCombinedImageSamplerDescriptorCount(address());
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateClampCombinerInputs() {
            return VkPhysicalDeviceVulkan14Properties.nfragmentShadingRateClampCombinerInputs(address()) != 0;
        }

        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessStorageBuffers() {
            return VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessStorageBuffers(address());
        }

        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessUniformBuffers() {
            return VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessUniformBuffers(address());
        }

        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessVertexInputs() {
            return VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessVertexInputs(address());
        }

        @NativeType("VkPipelineRobustnessImageBehavior")
        public int defaultRobustnessImages() {
            return VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessImages(address());
        }

        @NativeType("uint32_t")
        public int copySrcLayoutCount() {
            return VkPhysicalDeviceVulkan14Properties.ncopySrcLayoutCount(address());
        }

        @NativeType("VkImageLayout *")
        public IntBuffer pCopySrcLayouts() {
            return VkPhysicalDeviceVulkan14Properties.npCopySrcLayouts(address());
        }

        @NativeType("uint32_t")
        public int copyDstLayoutCount() {
            return VkPhysicalDeviceVulkan14Properties.ncopyDstLayoutCount(address());
        }

        @NativeType("VkImageLayout *")
        public IntBuffer pCopyDstLayouts() {
            return VkPhysicalDeviceVulkan14Properties.npCopyDstLayouts(address());
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer optimalTilingLayoutUUID() {
            return VkPhysicalDeviceVulkan14Properties.noptimalTilingLayoutUUID(address());
        }

        @NativeType("uint8_t")
        public byte optimalTilingLayoutUUID(int index) {
            return VkPhysicalDeviceVulkan14Properties.noptimalTilingLayoutUUID(address(), index);
        }

        @NativeType("VkBool32")
        public boolean identicalMemoryTypeRequirements() {
            return VkPhysicalDeviceVulkan14Properties.nidenticalMemoryTypeRequirements(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVulkan14Properties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(56);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVulkan14Properties.npNext(address(), value);
            return this;
        }
    }
}
