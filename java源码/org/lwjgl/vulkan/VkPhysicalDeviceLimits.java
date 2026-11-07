package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLimits.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLimits.class */
public class VkPhysicalDeviceLimits extends Struct<VkPhysicalDeviceLimits> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MAXIMAGEDIMENSION1D;
    public static final int MAXIMAGEDIMENSION2D;
    public static final int MAXIMAGEDIMENSION3D;
    public static final int MAXIMAGEDIMENSIONCUBE;
    public static final int MAXIMAGEARRAYLAYERS;
    public static final int MAXTEXELBUFFERELEMENTS;
    public static final int MAXUNIFORMBUFFERRANGE;
    public static final int MAXSTORAGEBUFFERRANGE;
    public static final int MAXPUSHCONSTANTSSIZE;
    public static final int MAXMEMORYALLOCATIONCOUNT;
    public static final int MAXSAMPLERALLOCATIONCOUNT;
    public static final int BUFFERIMAGEGRANULARITY;
    public static final int SPARSEADDRESSSPACESIZE;
    public static final int MAXBOUNDDESCRIPTORSETS;
    public static final int MAXPERSTAGEDESCRIPTORSAMPLERS;
    public static final int MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS;
    public static final int MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS;
    public static final int MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES;
    public static final int MAXPERSTAGEDESCRIPTORSTORAGEIMAGES;
    public static final int MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS;
    public static final int MAXPERSTAGERESOURCES;
    public static final int MAXDESCRIPTORSETSAMPLERS;
    public static final int MAXDESCRIPTORSETUNIFORMBUFFERS;
    public static final int MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETSTORAGEBUFFERS;
    public static final int MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETSAMPLEDIMAGES;
    public static final int MAXDESCRIPTORSETSTORAGEIMAGES;
    public static final int MAXDESCRIPTORSETINPUTATTACHMENTS;
    public static final int MAXVERTEXINPUTATTRIBUTES;
    public static final int MAXVERTEXINPUTBINDINGS;
    public static final int MAXVERTEXINPUTATTRIBUTEOFFSET;
    public static final int MAXVERTEXINPUTBINDINGSTRIDE;
    public static final int MAXVERTEXOUTPUTCOMPONENTS;
    public static final int MAXTESSELLATIONGENERATIONLEVEL;
    public static final int MAXTESSELLATIONPATCHSIZE;
    public static final int MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS;
    public static final int MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS;
    public static final int MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS;
    public static final int MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS;
    public static final int MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS;
    public static final int MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS;
    public static final int MAXGEOMETRYSHADERINVOCATIONS;
    public static final int MAXGEOMETRYINPUTCOMPONENTS;
    public static final int MAXGEOMETRYOUTPUTCOMPONENTS;
    public static final int MAXGEOMETRYOUTPUTVERTICES;
    public static final int MAXGEOMETRYTOTALOUTPUTCOMPONENTS;
    public static final int MAXFRAGMENTINPUTCOMPONENTS;
    public static final int MAXFRAGMENTOUTPUTATTACHMENTS;
    public static final int MAXFRAGMENTDUALSRCATTACHMENTS;
    public static final int MAXFRAGMENTCOMBINEDOUTPUTRESOURCES;
    public static final int MAXCOMPUTESHAREDMEMORYSIZE;
    public static final int MAXCOMPUTEWORKGROUPCOUNT;
    public static final int MAXCOMPUTEWORKGROUPINVOCATIONS;
    public static final int MAXCOMPUTEWORKGROUPSIZE;
    public static final int SUBPIXELPRECISIONBITS;
    public static final int SUBTEXELPRECISIONBITS;
    public static final int MIPMAPPRECISIONBITS;
    public static final int MAXDRAWINDEXEDINDEXVALUE;
    public static final int MAXDRAWINDIRECTCOUNT;
    public static final int MAXSAMPLERLODBIAS;
    public static final int MAXSAMPLERANISOTROPY;
    public static final int MAXVIEWPORTS;
    public static final int MAXVIEWPORTDIMENSIONS;
    public static final int VIEWPORTBOUNDSRANGE;
    public static final int VIEWPORTSUBPIXELBITS;
    public static final int MINMEMORYMAPALIGNMENT;
    public static final int MINTEXELBUFFEROFFSETALIGNMENT;
    public static final int MINUNIFORMBUFFEROFFSETALIGNMENT;
    public static final int MINSTORAGEBUFFEROFFSETALIGNMENT;
    public static final int MINTEXELOFFSET;
    public static final int MAXTEXELOFFSET;
    public static final int MINTEXELGATHEROFFSET;
    public static final int MAXTEXELGATHEROFFSET;
    public static final int MININTERPOLATIONOFFSET;
    public static final int MAXINTERPOLATIONOFFSET;
    public static final int SUBPIXELINTERPOLATIONOFFSETBITS;
    public static final int MAXFRAMEBUFFERWIDTH;
    public static final int MAXFRAMEBUFFERHEIGHT;
    public static final int MAXFRAMEBUFFERLAYERS;
    public static final int FRAMEBUFFERCOLORSAMPLECOUNTS;
    public static final int FRAMEBUFFERDEPTHSAMPLECOUNTS;
    public static final int FRAMEBUFFERSTENCILSAMPLECOUNTS;
    public static final int FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS;
    public static final int MAXCOLORATTACHMENTS;
    public static final int SAMPLEDIMAGECOLORSAMPLECOUNTS;
    public static final int SAMPLEDIMAGEINTEGERSAMPLECOUNTS;
    public static final int SAMPLEDIMAGEDEPTHSAMPLECOUNTS;
    public static final int SAMPLEDIMAGESTENCILSAMPLECOUNTS;
    public static final int STORAGEIMAGESAMPLECOUNTS;
    public static final int MAXSAMPLEMASKWORDS;
    public static final int TIMESTAMPCOMPUTEANDGRAPHICS;
    public static final int TIMESTAMPPERIOD;
    public static final int MAXCLIPDISTANCES;
    public static final int MAXCULLDISTANCES;
    public static final int MAXCOMBINEDCLIPANDCULLDISTANCES;
    public static final int DISCRETEQUEUEPRIORITIES;
    public static final int POINTSIZERANGE;
    public static final int LINEWIDTHRANGE;
    public static final int POINTSIZEGRANULARITY;
    public static final int LINEWIDTHGRANULARITY;
    public static final int STRICTLINES;
    public static final int STANDARDSAMPLELOCATIONS;
    public static final int OPTIMALBUFFERCOPYOFFSETALIGNMENT;
    public static final int OPTIMALBUFFERCOPYROWPITCHALIGNMENT;
    public static final int NONCOHERENTATOMSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(8), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __array(4, 3), __member(4), __array(4, 3), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __array(4, 2), __array(4, 2), __member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __array(4, 2), __array(4, 2), __member(4), __member(4), __member(4), __member(4), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MAXIMAGEDIMENSION1D = layout.offsetof(0);
        MAXIMAGEDIMENSION2D = layout.offsetof(1);
        MAXIMAGEDIMENSION3D = layout.offsetof(2);
        MAXIMAGEDIMENSIONCUBE = layout.offsetof(3);
        MAXIMAGEARRAYLAYERS = layout.offsetof(4);
        MAXTEXELBUFFERELEMENTS = layout.offsetof(5);
        MAXUNIFORMBUFFERRANGE = layout.offsetof(6);
        MAXSTORAGEBUFFERRANGE = layout.offsetof(7);
        MAXPUSHCONSTANTSSIZE = layout.offsetof(8);
        MAXMEMORYALLOCATIONCOUNT = layout.offsetof(9);
        MAXSAMPLERALLOCATIONCOUNT = layout.offsetof(10);
        BUFFERIMAGEGRANULARITY = layout.offsetof(11);
        SPARSEADDRESSSPACESIZE = layout.offsetof(12);
        MAXBOUNDDESCRIPTORSETS = layout.offsetof(13);
        MAXPERSTAGEDESCRIPTORSAMPLERS = layout.offsetof(14);
        MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS = layout.offsetof(15);
        MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS = layout.offsetof(16);
        MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES = layout.offsetof(17);
        MAXPERSTAGEDESCRIPTORSTORAGEIMAGES = layout.offsetof(18);
        MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS = layout.offsetof(19);
        MAXPERSTAGERESOURCES = layout.offsetof(20);
        MAXDESCRIPTORSETSAMPLERS = layout.offsetof(21);
        MAXDESCRIPTORSETUNIFORMBUFFERS = layout.offsetof(22);
        MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC = layout.offsetof(23);
        MAXDESCRIPTORSETSTORAGEBUFFERS = layout.offsetof(24);
        MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC = layout.offsetof(25);
        MAXDESCRIPTORSETSAMPLEDIMAGES = layout.offsetof(26);
        MAXDESCRIPTORSETSTORAGEIMAGES = layout.offsetof(27);
        MAXDESCRIPTORSETINPUTATTACHMENTS = layout.offsetof(28);
        MAXVERTEXINPUTATTRIBUTES = layout.offsetof(29);
        MAXVERTEXINPUTBINDINGS = layout.offsetof(30);
        MAXVERTEXINPUTATTRIBUTEOFFSET = layout.offsetof(31);
        MAXVERTEXINPUTBINDINGSTRIDE = layout.offsetof(32);
        MAXVERTEXOUTPUTCOMPONENTS = layout.offsetof(33);
        MAXTESSELLATIONGENERATIONLEVEL = layout.offsetof(34);
        MAXTESSELLATIONPATCHSIZE = layout.offsetof(35);
        MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS = layout.offsetof(36);
        MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS = layout.offsetof(37);
        MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS = layout.offsetof(38);
        MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS = layout.offsetof(39);
        MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS = layout.offsetof(40);
        MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS = layout.offsetof(41);
        MAXGEOMETRYSHADERINVOCATIONS = layout.offsetof(42);
        MAXGEOMETRYINPUTCOMPONENTS = layout.offsetof(43);
        MAXGEOMETRYOUTPUTCOMPONENTS = layout.offsetof(44);
        MAXGEOMETRYOUTPUTVERTICES = layout.offsetof(45);
        MAXGEOMETRYTOTALOUTPUTCOMPONENTS = layout.offsetof(46);
        MAXFRAGMENTINPUTCOMPONENTS = layout.offsetof(47);
        MAXFRAGMENTOUTPUTATTACHMENTS = layout.offsetof(48);
        MAXFRAGMENTDUALSRCATTACHMENTS = layout.offsetof(49);
        MAXFRAGMENTCOMBINEDOUTPUTRESOURCES = layout.offsetof(50);
        MAXCOMPUTESHAREDMEMORYSIZE = layout.offsetof(51);
        MAXCOMPUTEWORKGROUPCOUNT = layout.offsetof(52);
        MAXCOMPUTEWORKGROUPINVOCATIONS = layout.offsetof(53);
        MAXCOMPUTEWORKGROUPSIZE = layout.offsetof(54);
        SUBPIXELPRECISIONBITS = layout.offsetof(55);
        SUBTEXELPRECISIONBITS = layout.offsetof(56);
        MIPMAPPRECISIONBITS = layout.offsetof(57);
        MAXDRAWINDEXEDINDEXVALUE = layout.offsetof(58);
        MAXDRAWINDIRECTCOUNT = layout.offsetof(59);
        MAXSAMPLERLODBIAS = layout.offsetof(60);
        MAXSAMPLERANISOTROPY = layout.offsetof(61);
        MAXVIEWPORTS = layout.offsetof(62);
        MAXVIEWPORTDIMENSIONS = layout.offsetof(63);
        VIEWPORTBOUNDSRANGE = layout.offsetof(64);
        VIEWPORTSUBPIXELBITS = layout.offsetof(65);
        MINMEMORYMAPALIGNMENT = layout.offsetof(66);
        MINTEXELBUFFEROFFSETALIGNMENT = layout.offsetof(67);
        MINUNIFORMBUFFEROFFSETALIGNMENT = layout.offsetof(68);
        MINSTORAGEBUFFEROFFSETALIGNMENT = layout.offsetof(69);
        MINTEXELOFFSET = layout.offsetof(70);
        MAXTEXELOFFSET = layout.offsetof(71);
        MINTEXELGATHEROFFSET = layout.offsetof(72);
        MAXTEXELGATHEROFFSET = layout.offsetof(73);
        MININTERPOLATIONOFFSET = layout.offsetof(74);
        MAXINTERPOLATIONOFFSET = layout.offsetof(75);
        SUBPIXELINTERPOLATIONOFFSETBITS = layout.offsetof(76);
        MAXFRAMEBUFFERWIDTH = layout.offsetof(77);
        MAXFRAMEBUFFERHEIGHT = layout.offsetof(78);
        MAXFRAMEBUFFERLAYERS = layout.offsetof(79);
        FRAMEBUFFERCOLORSAMPLECOUNTS = layout.offsetof(80);
        FRAMEBUFFERDEPTHSAMPLECOUNTS = layout.offsetof(81);
        FRAMEBUFFERSTENCILSAMPLECOUNTS = layout.offsetof(82);
        FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS = layout.offsetof(83);
        MAXCOLORATTACHMENTS = layout.offsetof(84);
        SAMPLEDIMAGECOLORSAMPLECOUNTS = layout.offsetof(85);
        SAMPLEDIMAGEINTEGERSAMPLECOUNTS = layout.offsetof(86);
        SAMPLEDIMAGEDEPTHSAMPLECOUNTS = layout.offsetof(87);
        SAMPLEDIMAGESTENCILSAMPLECOUNTS = layout.offsetof(88);
        STORAGEIMAGESAMPLECOUNTS = layout.offsetof(89);
        MAXSAMPLEMASKWORDS = layout.offsetof(90);
        TIMESTAMPCOMPUTEANDGRAPHICS = layout.offsetof(91);
        TIMESTAMPPERIOD = layout.offsetof(92);
        MAXCLIPDISTANCES = layout.offsetof(93);
        MAXCULLDISTANCES = layout.offsetof(94);
        MAXCOMBINEDCLIPANDCULLDISTANCES = layout.offsetof(95);
        DISCRETEQUEUEPRIORITIES = layout.offsetof(96);
        POINTSIZERANGE = layout.offsetof(97);
        LINEWIDTHRANGE = layout.offsetof(98);
        POINTSIZEGRANULARITY = layout.offsetof(99);
        LINEWIDTHGRANULARITY = layout.offsetof(100);
        STRICTLINES = layout.offsetof(101);
        STANDARDSAMPLELOCATIONS = layout.offsetof(102);
        OPTIMALBUFFERCOPYOFFSETALIGNMENT = layout.offsetof(103);
        OPTIMALBUFFERCOPYROWPITCHALIGNMENT = layout.offsetof(104);
        NONCOHERENTATOMSIZE = layout.offsetof(105);
    }

    protected VkPhysicalDeviceLimits(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceLimits create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceLimits(address, container);
    }

    public VkPhysicalDeviceLimits(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int maxImageDimension1D() {
        return nmaxImageDimension1D(address());
    }

    @NativeType("uint32_t")
    public int maxImageDimension2D() {
        return nmaxImageDimension2D(address());
    }

    @NativeType("uint32_t")
    public int maxImageDimension3D() {
        return nmaxImageDimension3D(address());
    }

    @NativeType("uint32_t")
    public int maxImageDimensionCube() {
        return nmaxImageDimensionCube(address());
    }

    @NativeType("uint32_t")
    public int maxImageArrayLayers() {
        return nmaxImageArrayLayers(address());
    }

    @NativeType("uint32_t")
    public int maxTexelBufferElements() {
        return nmaxTexelBufferElements(address());
    }

    @NativeType("uint32_t")
    public int maxUniformBufferRange() {
        return nmaxUniformBufferRange(address());
    }

    @NativeType("uint32_t")
    public int maxStorageBufferRange() {
        return nmaxStorageBufferRange(address());
    }

    @NativeType("uint32_t")
    public int maxPushConstantsSize() {
        return nmaxPushConstantsSize(address());
    }

    @NativeType("uint32_t")
    public int maxMemoryAllocationCount() {
        return nmaxMemoryAllocationCount(address());
    }

    @NativeType("uint32_t")
    public int maxSamplerAllocationCount() {
        return nmaxSamplerAllocationCount(address());
    }

    @NativeType("VkDeviceSize")
    public long bufferImageGranularity() {
        return nbufferImageGranularity(address());
    }

    @NativeType("VkDeviceSize")
    public long sparseAddressSpaceSize() {
        return nsparseAddressSpaceSize(address());
    }

    @NativeType("uint32_t")
    public int maxBoundDescriptorSets() {
        return nmaxBoundDescriptorSets(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorSamplers() {
        return nmaxPerStageDescriptorSamplers(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUniformBuffers() {
        return nmaxPerStageDescriptorUniformBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorStorageBuffers() {
        return nmaxPerStageDescriptorStorageBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorSampledImages() {
        return nmaxPerStageDescriptorSampledImages(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorStorageImages() {
        return nmaxPerStageDescriptorStorageImages(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorInputAttachments() {
        return nmaxPerStageDescriptorInputAttachments(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageResources() {
        return nmaxPerStageResources(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetSamplers() {
        return nmaxDescriptorSetSamplers(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUniformBuffers() {
        return nmaxDescriptorSetUniformBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUniformBuffersDynamic() {
        return nmaxDescriptorSetUniformBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetStorageBuffers() {
        return nmaxDescriptorSetStorageBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetStorageBuffersDynamic() {
        return nmaxDescriptorSetStorageBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetSampledImages() {
        return nmaxDescriptorSetSampledImages(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetStorageImages() {
        return nmaxDescriptorSetStorageImages(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetInputAttachments() {
        return nmaxDescriptorSetInputAttachments(address());
    }

    @NativeType("uint32_t")
    public int maxVertexInputAttributes() {
        return nmaxVertexInputAttributes(address());
    }

    @NativeType("uint32_t")
    public int maxVertexInputBindings() {
        return nmaxVertexInputBindings(address());
    }

    @NativeType("uint32_t")
    public int maxVertexInputAttributeOffset() {
        return nmaxVertexInputAttributeOffset(address());
    }

    @NativeType("uint32_t")
    public int maxVertexInputBindingStride() {
        return nmaxVertexInputBindingStride(address());
    }

    @NativeType("uint32_t")
    public int maxVertexOutputComponents() {
        return nmaxVertexOutputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxTessellationGenerationLevel() {
        return nmaxTessellationGenerationLevel(address());
    }

    @NativeType("uint32_t")
    public int maxTessellationPatchSize() {
        return nmaxTessellationPatchSize(address());
    }

    @NativeType("uint32_t")
    public int maxTessellationControlPerVertexInputComponents() {
        return nmaxTessellationControlPerVertexInputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxTessellationControlPerVertexOutputComponents() {
        return nmaxTessellationControlPerVertexOutputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxTessellationControlPerPatchOutputComponents() {
        return nmaxTessellationControlPerPatchOutputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxTessellationControlTotalOutputComponents() {
        return nmaxTessellationControlTotalOutputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxTessellationEvaluationInputComponents() {
        return nmaxTessellationEvaluationInputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxTessellationEvaluationOutputComponents() {
        return nmaxTessellationEvaluationOutputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxGeometryShaderInvocations() {
        return nmaxGeometryShaderInvocations(address());
    }

    @NativeType("uint32_t")
    public int maxGeometryInputComponents() {
        return nmaxGeometryInputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxGeometryOutputComponents() {
        return nmaxGeometryOutputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxGeometryOutputVertices() {
        return nmaxGeometryOutputVertices(address());
    }

    @NativeType("uint32_t")
    public int maxGeometryTotalOutputComponents() {
        return nmaxGeometryTotalOutputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxFragmentInputComponents() {
        return nmaxFragmentInputComponents(address());
    }

    @NativeType("uint32_t")
    public int maxFragmentOutputAttachments() {
        return nmaxFragmentOutputAttachments(address());
    }

    @NativeType("uint32_t")
    public int maxFragmentDualSrcAttachments() {
        return nmaxFragmentDualSrcAttachments(address());
    }

    @NativeType("uint32_t")
    public int maxFragmentCombinedOutputResources() {
        return nmaxFragmentCombinedOutputResources(address());
    }

    @NativeType("uint32_t")
    public int maxComputeSharedMemorySize() {
        return nmaxComputeSharedMemorySize(address());
    }

    @NativeType("uint32_t[3]")
    public IntBuffer maxComputeWorkGroupCount() {
        return nmaxComputeWorkGroupCount(address());
    }

    @NativeType("uint32_t")
    public int maxComputeWorkGroupCount(int index) {
        return nmaxComputeWorkGroupCount(address(), index);
    }

    @NativeType("uint32_t")
    public int maxComputeWorkGroupInvocations() {
        return nmaxComputeWorkGroupInvocations(address());
    }

    @NativeType("uint32_t[3]")
    public IntBuffer maxComputeWorkGroupSize() {
        return nmaxComputeWorkGroupSize(address());
    }

    @NativeType("uint32_t")
    public int maxComputeWorkGroupSize(int index) {
        return nmaxComputeWorkGroupSize(address(), index);
    }

    @NativeType("uint32_t")
    public int subPixelPrecisionBits() {
        return nsubPixelPrecisionBits(address());
    }

    @NativeType("uint32_t")
    public int subTexelPrecisionBits() {
        return nsubTexelPrecisionBits(address());
    }

    @NativeType("uint32_t")
    public int mipmapPrecisionBits() {
        return nmipmapPrecisionBits(address());
    }

    @NativeType("uint32_t")
    public int maxDrawIndexedIndexValue() {
        return nmaxDrawIndexedIndexValue(address());
    }

    @NativeType("uint32_t")
    public int maxDrawIndirectCount() {
        return nmaxDrawIndirectCount(address());
    }

    public float maxSamplerLodBias() {
        return nmaxSamplerLodBias(address());
    }

    public float maxSamplerAnisotropy() {
        return nmaxSamplerAnisotropy(address());
    }

    @NativeType("uint32_t")
    public int maxViewports() {
        return nmaxViewports(address());
    }

    @NativeType("uint32_t[2]")
    public IntBuffer maxViewportDimensions() {
        return nmaxViewportDimensions(address());
    }

    @NativeType("uint32_t")
    public int maxViewportDimensions(int index) {
        return nmaxViewportDimensions(address(), index);
    }

    @NativeType("float[2]")
    public FloatBuffer viewportBoundsRange() {
        return nviewportBoundsRange(address());
    }

    public float viewportBoundsRange(int index) {
        return nviewportBoundsRange(address(), index);
    }

    @NativeType("uint32_t")
    public int viewportSubPixelBits() {
        return nviewportSubPixelBits(address());
    }

    @NativeType("size_t")
    public long minMemoryMapAlignment() {
        return nminMemoryMapAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long minTexelBufferOffsetAlignment() {
        return nminTexelBufferOffsetAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long minUniformBufferOffsetAlignment() {
        return nminUniformBufferOffsetAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long minStorageBufferOffsetAlignment() {
        return nminStorageBufferOffsetAlignment(address());
    }

    @NativeType("int32_t")
    public int minTexelOffset() {
        return nminTexelOffset(address());
    }

    @NativeType("uint32_t")
    public int maxTexelOffset() {
        return nmaxTexelOffset(address());
    }

    @NativeType("int32_t")
    public int minTexelGatherOffset() {
        return nminTexelGatherOffset(address());
    }

    @NativeType("uint32_t")
    public int maxTexelGatherOffset() {
        return nmaxTexelGatherOffset(address());
    }

    public float minInterpolationOffset() {
        return nminInterpolationOffset(address());
    }

    public float maxInterpolationOffset() {
        return nmaxInterpolationOffset(address());
    }

    @NativeType("uint32_t")
    public int subPixelInterpolationOffsetBits() {
        return nsubPixelInterpolationOffsetBits(address());
    }

    @NativeType("uint32_t")
    public int maxFramebufferWidth() {
        return nmaxFramebufferWidth(address());
    }

    @NativeType("uint32_t")
    public int maxFramebufferHeight() {
        return nmaxFramebufferHeight(address());
    }

    @NativeType("uint32_t")
    public int maxFramebufferLayers() {
        return nmaxFramebufferLayers(address());
    }

    @NativeType("VkSampleCountFlags")
    public int framebufferColorSampleCounts() {
        return nframebufferColorSampleCounts(address());
    }

    @NativeType("VkSampleCountFlags")
    public int framebufferDepthSampleCounts() {
        return nframebufferDepthSampleCounts(address());
    }

    @NativeType("VkSampleCountFlags")
    public int framebufferStencilSampleCounts() {
        return nframebufferStencilSampleCounts(address());
    }

    @NativeType("VkSampleCountFlags")
    public int framebufferNoAttachmentsSampleCounts() {
        return nframebufferNoAttachmentsSampleCounts(address());
    }

    @NativeType("uint32_t")
    public int maxColorAttachments() {
        return nmaxColorAttachments(address());
    }

    @NativeType("VkSampleCountFlags")
    public int sampledImageColorSampleCounts() {
        return nsampledImageColorSampleCounts(address());
    }

    @NativeType("VkSampleCountFlags")
    public int sampledImageIntegerSampleCounts() {
        return nsampledImageIntegerSampleCounts(address());
    }

    @NativeType("VkSampleCountFlags")
    public int sampledImageDepthSampleCounts() {
        return nsampledImageDepthSampleCounts(address());
    }

    @NativeType("VkSampleCountFlags")
    public int sampledImageStencilSampleCounts() {
        return nsampledImageStencilSampleCounts(address());
    }

    @NativeType("VkSampleCountFlags")
    public int storageImageSampleCounts() {
        return nstorageImageSampleCounts(address());
    }

    @NativeType("uint32_t")
    public int maxSampleMaskWords() {
        return nmaxSampleMaskWords(address());
    }

    @NativeType("VkBool32")
    public boolean timestampComputeAndGraphics() {
        return ntimestampComputeAndGraphics(address()) != 0;
    }

    public float timestampPeriod() {
        return ntimestampPeriod(address());
    }

    @NativeType("uint32_t")
    public int maxClipDistances() {
        return nmaxClipDistances(address());
    }

    @NativeType("uint32_t")
    public int maxCullDistances() {
        return nmaxCullDistances(address());
    }

    @NativeType("uint32_t")
    public int maxCombinedClipAndCullDistances() {
        return nmaxCombinedClipAndCullDistances(address());
    }

    @NativeType("uint32_t")
    public int discreteQueuePriorities() {
        return ndiscreteQueuePriorities(address());
    }

    @NativeType("float[2]")
    public FloatBuffer pointSizeRange() {
        return npointSizeRange(address());
    }

    public float pointSizeRange(int index) {
        return npointSizeRange(address(), index);
    }

    @NativeType("float[2]")
    public FloatBuffer lineWidthRange() {
        return nlineWidthRange(address());
    }

    public float lineWidthRange(int index) {
        return nlineWidthRange(address(), index);
    }

    public float pointSizeGranularity() {
        return npointSizeGranularity(address());
    }

    public float lineWidthGranularity() {
        return nlineWidthGranularity(address());
    }

    @NativeType("VkBool32")
    public boolean strictLines() {
        return nstrictLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean standardSampleLocations() {
        return nstandardSampleLocations(address()) != 0;
    }

    @NativeType("VkDeviceSize")
    public long optimalBufferCopyOffsetAlignment() {
        return noptimalBufferCopyOffsetAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long optimalBufferCopyRowPitchAlignment() {
        return noptimalBufferCopyRowPitchAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long nonCoherentAtomSize() {
        return nnonCoherentAtomSize(address());
    }

    public static VkPhysicalDeviceLimits create(long address) {
        return new VkPhysicalDeviceLimits(address, null);
    }

    public static VkPhysicalDeviceLimits createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceLimits(address, null);
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

    public static int nmaxImageDimension1D(long struct) {
        return MemoryUtil.memGetInt(struct + MAXIMAGEDIMENSION1D);
    }

    public static int nmaxImageDimension2D(long struct) {
        return MemoryUtil.memGetInt(struct + MAXIMAGEDIMENSION2D);
    }

    public static int nmaxImageDimension3D(long struct) {
        return MemoryUtil.memGetInt(struct + MAXIMAGEDIMENSION3D);
    }

    public static int nmaxImageDimensionCube(long struct) {
        return MemoryUtil.memGetInt(struct + MAXIMAGEDIMENSIONCUBE);
    }

    public static int nmaxImageArrayLayers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXIMAGEARRAYLAYERS);
    }

    public static int nmaxTexelBufferElements(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTEXELBUFFERELEMENTS);
    }

    public static int nmaxUniformBufferRange(long struct) {
        return MemoryUtil.memGetInt(struct + MAXUNIFORMBUFFERRANGE);
    }

    public static int nmaxStorageBufferRange(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSTORAGEBUFFERRANGE);
    }

    public static int nmaxPushConstantsSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPUSHCONSTANTSSIZE);
    }

    public static int nmaxMemoryAllocationCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMEMORYALLOCATIONCOUNT);
    }

    public static int nmaxSamplerAllocationCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSAMPLERALLOCATIONCOUNT);
    }

    public static long nbufferImageGranularity(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFERIMAGEGRANULARITY);
    }

    public static long nsparseAddressSpaceSize(long struct) {
        return MemoryUtil.memGetLong(struct + SPARSEADDRESSSPACESIZE);
    }

    public static int nmaxBoundDescriptorSets(long struct) {
        return MemoryUtil.memGetInt(struct + MAXBOUNDDESCRIPTORSETS);
    }

    public static int nmaxPerStageDescriptorSamplers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORSAMPLERS);
    }

    public static int nmaxPerStageDescriptorUniformBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS);
    }

    public static int nmaxPerStageDescriptorStorageBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS);
    }

    public static int nmaxPerStageDescriptorSampledImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES);
    }

    public static int nmaxPerStageDescriptorStorageImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORSTORAGEIMAGES);
    }

    public static int nmaxPerStageDescriptorInputAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS);
    }

    public static int nmaxPerStageResources(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGERESOURCES);
    }

    public static int nmaxDescriptorSetSamplers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETSAMPLERS);
    }

    public static int nmaxDescriptorSetUniformBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUNIFORMBUFFERS);
    }

    public static int nmaxDescriptorSetUniformBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetStorageBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETSTORAGEBUFFERS);
    }

    public static int nmaxDescriptorSetStorageBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetSampledImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETSAMPLEDIMAGES);
    }

    public static int nmaxDescriptorSetStorageImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETSTORAGEIMAGES);
    }

    public static int nmaxDescriptorSetInputAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETINPUTATTACHMENTS);
    }

    public static int nmaxVertexInputAttributes(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVERTEXINPUTATTRIBUTES);
    }

    public static int nmaxVertexInputBindings(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVERTEXINPUTBINDINGS);
    }

    public static int nmaxVertexInputAttributeOffset(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVERTEXINPUTATTRIBUTEOFFSET);
    }

    public static int nmaxVertexInputBindingStride(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVERTEXINPUTBINDINGSTRIDE);
    }

    public static int nmaxVertexOutputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVERTEXOUTPUTCOMPONENTS);
    }

    public static int nmaxTessellationGenerationLevel(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTESSELLATIONGENERATIONLEVEL);
    }

    public static int nmaxTessellationPatchSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTESSELLATIONPATCHSIZE);
    }

    public static int nmaxTessellationControlPerVertexInputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS);
    }

    public static int nmaxTessellationControlPerVertexOutputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS);
    }

    public static int nmaxTessellationControlPerPatchOutputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS);
    }

    public static int nmaxTessellationControlTotalOutputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS);
    }

    public static int nmaxTessellationEvaluationInputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS);
    }

    public static int nmaxTessellationEvaluationOutputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS);
    }

    public static int nmaxGeometryShaderInvocations(long struct) {
        return MemoryUtil.memGetInt(struct + MAXGEOMETRYSHADERINVOCATIONS);
    }

    public static int nmaxGeometryInputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXGEOMETRYINPUTCOMPONENTS);
    }

    public static int nmaxGeometryOutputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXGEOMETRYOUTPUTCOMPONENTS);
    }

    public static int nmaxGeometryOutputVertices(long struct) {
        return MemoryUtil.memGetInt(struct + MAXGEOMETRYOUTPUTVERTICES);
    }

    public static int nmaxGeometryTotalOutputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXGEOMETRYTOTALOUTPUTCOMPONENTS);
    }

    public static int nmaxFragmentInputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAGMENTINPUTCOMPONENTS);
    }

    public static int nmaxFragmentOutputAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAGMENTOUTPUTATTACHMENTS);
    }

    public static int nmaxFragmentDualSrcAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAGMENTDUALSRCATTACHMENTS);
    }

    public static int nmaxFragmentCombinedOutputResources(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAGMENTCOMBINEDOUTPUTRESOURCES);
    }

    public static int nmaxComputeSharedMemorySize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOMPUTESHAREDMEMORYSIZE);
    }

    public static IntBuffer nmaxComputeWorkGroupCount(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAXCOMPUTEWORKGROUPCOUNT, 3);
    }

    public static int nmaxComputeWorkGroupCount(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAXCOMPUTEWORKGROUPCOUNT + (Checks.check(index, 3) * 4));
    }

    public static int nmaxComputeWorkGroupInvocations(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOMPUTEWORKGROUPINVOCATIONS);
    }

    public static IntBuffer nmaxComputeWorkGroupSize(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAXCOMPUTEWORKGROUPSIZE, 3);
    }

    public static int nmaxComputeWorkGroupSize(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAXCOMPUTEWORKGROUPSIZE + (Checks.check(index, 3) * 4));
    }

    public static int nsubPixelPrecisionBits(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPIXELPRECISIONBITS);
    }

    public static int nsubTexelPrecisionBits(long struct) {
        return MemoryUtil.memGetInt(struct + SUBTEXELPRECISIONBITS);
    }

    public static int nmipmapPrecisionBits(long struct) {
        return MemoryUtil.memGetInt(struct + MIPMAPPRECISIONBITS);
    }

    public static int nmaxDrawIndexedIndexValue(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDRAWINDEXEDINDEXVALUE);
    }

    public static int nmaxDrawIndirectCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDRAWINDIRECTCOUNT);
    }

    public static float nmaxSamplerLodBias(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXSAMPLERLODBIAS);
    }

    public static float nmaxSamplerAnisotropy(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXSAMPLERANISOTROPY);
    }

    public static int nmaxViewports(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVIEWPORTS);
    }

    public static IntBuffer nmaxViewportDimensions(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAXVIEWPORTDIMENSIONS, 2);
    }

    public static int nmaxViewportDimensions(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAXVIEWPORTDIMENSIONS + (Checks.check(index, 2) * 4));
    }

    public static FloatBuffer nviewportBoundsRange(long struct) {
        return MemoryUtil.memFloatBuffer(struct + VIEWPORTBOUNDSRANGE, 2);
    }

    public static float nviewportBoundsRange(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + VIEWPORTBOUNDSRANGE + (Checks.check(index, 2) * 4));
    }

    public static int nviewportSubPixelBits(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWPORTSUBPIXELBITS);
    }

    public static long nminMemoryMapAlignment(long struct) {
        return MemoryUtil.memGetAddress(struct + MINMEMORYMAPALIGNMENT);
    }

    public static long nminTexelBufferOffsetAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + MINTEXELBUFFEROFFSETALIGNMENT);
    }

    public static long nminUniformBufferOffsetAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + MINUNIFORMBUFFEROFFSETALIGNMENT);
    }

    public static long nminStorageBufferOffsetAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + MINSTORAGEBUFFEROFFSETALIGNMENT);
    }

    public static int nminTexelOffset(long struct) {
        return MemoryUtil.memGetInt(struct + MINTEXELOFFSET);
    }

    public static int nmaxTexelOffset(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTEXELOFFSET);
    }

    public static int nminTexelGatherOffset(long struct) {
        return MemoryUtil.memGetInt(struct + MINTEXELGATHEROFFSET);
    }

    public static int nmaxTexelGatherOffset(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTEXELGATHEROFFSET);
    }

    public static float nminInterpolationOffset(long struct) {
        return MemoryUtil.memGetFloat(struct + MININTERPOLATIONOFFSET);
    }

    public static float nmaxInterpolationOffset(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXINTERPOLATIONOFFSET);
    }

    public static int nsubPixelInterpolationOffsetBits(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPIXELINTERPOLATIONOFFSETBITS);
    }

    public static int nmaxFramebufferWidth(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAMEBUFFERWIDTH);
    }

    public static int nmaxFramebufferHeight(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAMEBUFFERHEIGHT);
    }

    public static int nmaxFramebufferLayers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFRAMEBUFFERLAYERS);
    }

    public static int nframebufferColorSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMEBUFFERCOLORSAMPLECOUNTS);
    }

    public static int nframebufferDepthSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMEBUFFERDEPTHSAMPLECOUNTS);
    }

    public static int nframebufferStencilSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMEBUFFERSTENCILSAMPLECOUNTS);
    }

    public static int nframebufferNoAttachmentsSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS);
    }

    public static int nmaxColorAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOLORATTACHMENTS);
    }

    public static int nsampledImageColorSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLEDIMAGECOLORSAMPLECOUNTS);
    }

    public static int nsampledImageIntegerSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLEDIMAGEINTEGERSAMPLECOUNTS);
    }

    public static int nsampledImageDepthSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLEDIMAGEDEPTHSAMPLECOUNTS);
    }

    public static int nsampledImageStencilSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLEDIMAGESTENCILSAMPLECOUNTS);
    }

    public static int nstorageImageSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEIMAGESAMPLECOUNTS);
    }

    public static int nmaxSampleMaskWords(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSAMPLEMASKWORDS);
    }

    public static int ntimestampComputeAndGraphics(long struct) {
        return MemoryUtil.memGetInt(struct + TIMESTAMPCOMPUTEANDGRAPHICS);
    }

    public static float ntimestampPeriod(long struct) {
        return MemoryUtil.memGetFloat(struct + TIMESTAMPPERIOD);
    }

    public static int nmaxClipDistances(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCLIPDISTANCES);
    }

    public static int nmaxCullDistances(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCULLDISTANCES);
    }

    public static int nmaxCombinedClipAndCullDistances(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOMBINEDCLIPANDCULLDISTANCES);
    }

    public static int ndiscreteQueuePriorities(long struct) {
        return MemoryUtil.memGetInt(struct + DISCRETEQUEUEPRIORITIES);
    }

    public static FloatBuffer npointSizeRange(long struct) {
        return MemoryUtil.memFloatBuffer(struct + POINTSIZERANGE, 2);
    }

    public static float npointSizeRange(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + POINTSIZERANGE + (Checks.check(index, 2) * 4));
    }

    public static FloatBuffer nlineWidthRange(long struct) {
        return MemoryUtil.memFloatBuffer(struct + LINEWIDTHRANGE, 2);
    }

    public static float nlineWidthRange(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + LINEWIDTHRANGE + (Checks.check(index, 2) * 4));
    }

    public static float npointSizeGranularity(long struct) {
        return MemoryUtil.memGetFloat(struct + POINTSIZEGRANULARITY);
    }

    public static float nlineWidthGranularity(long struct) {
        return MemoryUtil.memGetFloat(struct + LINEWIDTHGRANULARITY);
    }

    public static int nstrictLines(long struct) {
        return MemoryUtil.memGetInt(struct + STRICTLINES);
    }

    public static int nstandardSampleLocations(long struct) {
        return MemoryUtil.memGetInt(struct + STANDARDSAMPLELOCATIONS);
    }

    public static long noptimalBufferCopyOffsetAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + OPTIMALBUFFERCOPYOFFSETALIGNMENT);
    }

    public static long noptimalBufferCopyRowPitchAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + OPTIMALBUFFERCOPYROWPITCHALIGNMENT);
    }

    public static long nnonCoherentAtomSize(long struct) {
        return MemoryUtil.memGetLong(struct + NONCOHERENTATOMSIZE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLimits$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLimits$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLimits, Buffer> {
        private static final VkPhysicalDeviceLimits ELEMENT_FACTORY = VkPhysicalDeviceLimits.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceLimits.SIZEOF);
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
        public VkPhysicalDeviceLimits getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int maxImageDimension1D() {
            return VkPhysicalDeviceLimits.nmaxImageDimension1D(address());
        }

        @NativeType("uint32_t")
        public int maxImageDimension2D() {
            return VkPhysicalDeviceLimits.nmaxImageDimension2D(address());
        }

        @NativeType("uint32_t")
        public int maxImageDimension3D() {
            return VkPhysicalDeviceLimits.nmaxImageDimension3D(address());
        }

        @NativeType("uint32_t")
        public int maxImageDimensionCube() {
            return VkPhysicalDeviceLimits.nmaxImageDimensionCube(address());
        }

        @NativeType("uint32_t")
        public int maxImageArrayLayers() {
            return VkPhysicalDeviceLimits.nmaxImageArrayLayers(address());
        }

        @NativeType("uint32_t")
        public int maxTexelBufferElements() {
            return VkPhysicalDeviceLimits.nmaxTexelBufferElements(address());
        }

        @NativeType("uint32_t")
        public int maxUniformBufferRange() {
            return VkPhysicalDeviceLimits.nmaxUniformBufferRange(address());
        }

        @NativeType("uint32_t")
        public int maxStorageBufferRange() {
            return VkPhysicalDeviceLimits.nmaxStorageBufferRange(address());
        }

        @NativeType("uint32_t")
        public int maxPushConstantsSize() {
            return VkPhysicalDeviceLimits.nmaxPushConstantsSize(address());
        }

        @NativeType("uint32_t")
        public int maxMemoryAllocationCount() {
            return VkPhysicalDeviceLimits.nmaxMemoryAllocationCount(address());
        }

        @NativeType("uint32_t")
        public int maxSamplerAllocationCount() {
            return VkPhysicalDeviceLimits.nmaxSamplerAllocationCount(address());
        }

        @NativeType("VkDeviceSize")
        public long bufferImageGranularity() {
            return VkPhysicalDeviceLimits.nbufferImageGranularity(address());
        }

        @NativeType("VkDeviceSize")
        public long sparseAddressSpaceSize() {
            return VkPhysicalDeviceLimits.nsparseAddressSpaceSize(address());
        }

        @NativeType("uint32_t")
        public int maxBoundDescriptorSets() {
            return VkPhysicalDeviceLimits.nmaxBoundDescriptorSets(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorSamplers() {
            return VkPhysicalDeviceLimits.nmaxPerStageDescriptorSamplers(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUniformBuffers() {
            return VkPhysicalDeviceLimits.nmaxPerStageDescriptorUniformBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorStorageBuffers() {
            return VkPhysicalDeviceLimits.nmaxPerStageDescriptorStorageBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorSampledImages() {
            return VkPhysicalDeviceLimits.nmaxPerStageDescriptorSampledImages(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorStorageImages() {
            return VkPhysicalDeviceLimits.nmaxPerStageDescriptorStorageImages(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorInputAttachments() {
            return VkPhysicalDeviceLimits.nmaxPerStageDescriptorInputAttachments(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageResources() {
            return VkPhysicalDeviceLimits.nmaxPerStageResources(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetSamplers() {
            return VkPhysicalDeviceLimits.nmaxDescriptorSetSamplers(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUniformBuffers() {
            return VkPhysicalDeviceLimits.nmaxDescriptorSetUniformBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUniformBuffersDynamic() {
            return VkPhysicalDeviceLimits.nmaxDescriptorSetUniformBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetStorageBuffers() {
            return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetStorageBuffersDynamic() {
            return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetSampledImages() {
            return VkPhysicalDeviceLimits.nmaxDescriptorSetSampledImages(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetStorageImages() {
            return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageImages(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetInputAttachments() {
            return VkPhysicalDeviceLimits.nmaxDescriptorSetInputAttachments(address());
        }

        @NativeType("uint32_t")
        public int maxVertexInputAttributes() {
            return VkPhysicalDeviceLimits.nmaxVertexInputAttributes(address());
        }

        @NativeType("uint32_t")
        public int maxVertexInputBindings() {
            return VkPhysicalDeviceLimits.nmaxVertexInputBindings(address());
        }

        @NativeType("uint32_t")
        public int maxVertexInputAttributeOffset() {
            return VkPhysicalDeviceLimits.nmaxVertexInputAttributeOffset(address());
        }

        @NativeType("uint32_t")
        public int maxVertexInputBindingStride() {
            return VkPhysicalDeviceLimits.nmaxVertexInputBindingStride(address());
        }

        @NativeType("uint32_t")
        public int maxVertexOutputComponents() {
            return VkPhysicalDeviceLimits.nmaxVertexOutputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxTessellationGenerationLevel() {
            return VkPhysicalDeviceLimits.nmaxTessellationGenerationLevel(address());
        }

        @NativeType("uint32_t")
        public int maxTessellationPatchSize() {
            return VkPhysicalDeviceLimits.nmaxTessellationPatchSize(address());
        }

        @NativeType("uint32_t")
        public int maxTessellationControlPerVertexInputComponents() {
            return VkPhysicalDeviceLimits.nmaxTessellationControlPerVertexInputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxTessellationControlPerVertexOutputComponents() {
            return VkPhysicalDeviceLimits.nmaxTessellationControlPerVertexOutputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxTessellationControlPerPatchOutputComponents() {
            return VkPhysicalDeviceLimits.nmaxTessellationControlPerPatchOutputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxTessellationControlTotalOutputComponents() {
            return VkPhysicalDeviceLimits.nmaxTessellationControlTotalOutputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxTessellationEvaluationInputComponents() {
            return VkPhysicalDeviceLimits.nmaxTessellationEvaluationInputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxTessellationEvaluationOutputComponents() {
            return VkPhysicalDeviceLimits.nmaxTessellationEvaluationOutputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxGeometryShaderInvocations() {
            return VkPhysicalDeviceLimits.nmaxGeometryShaderInvocations(address());
        }

        @NativeType("uint32_t")
        public int maxGeometryInputComponents() {
            return VkPhysicalDeviceLimits.nmaxGeometryInputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxGeometryOutputComponents() {
            return VkPhysicalDeviceLimits.nmaxGeometryOutputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxGeometryOutputVertices() {
            return VkPhysicalDeviceLimits.nmaxGeometryOutputVertices(address());
        }

        @NativeType("uint32_t")
        public int maxGeometryTotalOutputComponents() {
            return VkPhysicalDeviceLimits.nmaxGeometryTotalOutputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxFragmentInputComponents() {
            return VkPhysicalDeviceLimits.nmaxFragmentInputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxFragmentOutputAttachments() {
            return VkPhysicalDeviceLimits.nmaxFragmentOutputAttachments(address());
        }

        @NativeType("uint32_t")
        public int maxFragmentDualSrcAttachments() {
            return VkPhysicalDeviceLimits.nmaxFragmentDualSrcAttachments(address());
        }

        @NativeType("uint32_t")
        public int maxFragmentCombinedOutputResources() {
            return VkPhysicalDeviceLimits.nmaxFragmentCombinedOutputResources(address());
        }

        @NativeType("uint32_t")
        public int maxComputeSharedMemorySize() {
            return VkPhysicalDeviceLimits.nmaxComputeSharedMemorySize(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxComputeWorkGroupCount() {
            return VkPhysicalDeviceLimits.nmaxComputeWorkGroupCount(address());
        }

        @NativeType("uint32_t")
        public int maxComputeWorkGroupCount(int index) {
            return VkPhysicalDeviceLimits.nmaxComputeWorkGroupCount(address(), index);
        }

        @NativeType("uint32_t")
        public int maxComputeWorkGroupInvocations() {
            return VkPhysicalDeviceLimits.nmaxComputeWorkGroupInvocations(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxComputeWorkGroupSize() {
            return VkPhysicalDeviceLimits.nmaxComputeWorkGroupSize(address());
        }

        @NativeType("uint32_t")
        public int maxComputeWorkGroupSize(int index) {
            return VkPhysicalDeviceLimits.nmaxComputeWorkGroupSize(address(), index);
        }

        @NativeType("uint32_t")
        public int subPixelPrecisionBits() {
            return VkPhysicalDeviceLimits.nsubPixelPrecisionBits(address());
        }

        @NativeType("uint32_t")
        public int subTexelPrecisionBits() {
            return VkPhysicalDeviceLimits.nsubTexelPrecisionBits(address());
        }

        @NativeType("uint32_t")
        public int mipmapPrecisionBits() {
            return VkPhysicalDeviceLimits.nmipmapPrecisionBits(address());
        }

        @NativeType("uint32_t")
        public int maxDrawIndexedIndexValue() {
            return VkPhysicalDeviceLimits.nmaxDrawIndexedIndexValue(address());
        }

        @NativeType("uint32_t")
        public int maxDrawIndirectCount() {
            return VkPhysicalDeviceLimits.nmaxDrawIndirectCount(address());
        }

        public float maxSamplerLodBias() {
            return VkPhysicalDeviceLimits.nmaxSamplerLodBias(address());
        }

        public float maxSamplerAnisotropy() {
            return VkPhysicalDeviceLimits.nmaxSamplerAnisotropy(address());
        }

        @NativeType("uint32_t")
        public int maxViewports() {
            return VkPhysicalDeviceLimits.nmaxViewports(address());
        }

        @NativeType("uint32_t[2]")
        public IntBuffer maxViewportDimensions() {
            return VkPhysicalDeviceLimits.nmaxViewportDimensions(address());
        }

        @NativeType("uint32_t")
        public int maxViewportDimensions(int index) {
            return VkPhysicalDeviceLimits.nmaxViewportDimensions(address(), index);
        }

        @NativeType("float[2]")
        public FloatBuffer viewportBoundsRange() {
            return VkPhysicalDeviceLimits.nviewportBoundsRange(address());
        }

        public float viewportBoundsRange(int index) {
            return VkPhysicalDeviceLimits.nviewportBoundsRange(address(), index);
        }

        @NativeType("uint32_t")
        public int viewportSubPixelBits() {
            return VkPhysicalDeviceLimits.nviewportSubPixelBits(address());
        }

        @NativeType("size_t")
        public long minMemoryMapAlignment() {
            return VkPhysicalDeviceLimits.nminMemoryMapAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long minTexelBufferOffsetAlignment() {
            return VkPhysicalDeviceLimits.nminTexelBufferOffsetAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long minUniformBufferOffsetAlignment() {
            return VkPhysicalDeviceLimits.nminUniformBufferOffsetAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long minStorageBufferOffsetAlignment() {
            return VkPhysicalDeviceLimits.nminStorageBufferOffsetAlignment(address());
        }

        @NativeType("int32_t")
        public int minTexelOffset() {
            return VkPhysicalDeviceLimits.nminTexelOffset(address());
        }

        @NativeType("uint32_t")
        public int maxTexelOffset() {
            return VkPhysicalDeviceLimits.nmaxTexelOffset(address());
        }

        @NativeType("int32_t")
        public int minTexelGatherOffset() {
            return VkPhysicalDeviceLimits.nminTexelGatherOffset(address());
        }

        @NativeType("uint32_t")
        public int maxTexelGatherOffset() {
            return VkPhysicalDeviceLimits.nmaxTexelGatherOffset(address());
        }

        public float minInterpolationOffset() {
            return VkPhysicalDeviceLimits.nminInterpolationOffset(address());
        }

        public float maxInterpolationOffset() {
            return VkPhysicalDeviceLimits.nmaxInterpolationOffset(address());
        }

        @NativeType("uint32_t")
        public int subPixelInterpolationOffsetBits() {
            return VkPhysicalDeviceLimits.nsubPixelInterpolationOffsetBits(address());
        }

        @NativeType("uint32_t")
        public int maxFramebufferWidth() {
            return VkPhysicalDeviceLimits.nmaxFramebufferWidth(address());
        }

        @NativeType("uint32_t")
        public int maxFramebufferHeight() {
            return VkPhysicalDeviceLimits.nmaxFramebufferHeight(address());
        }

        @NativeType("uint32_t")
        public int maxFramebufferLayers() {
            return VkPhysicalDeviceLimits.nmaxFramebufferLayers(address());
        }

        @NativeType("VkSampleCountFlags")
        public int framebufferColorSampleCounts() {
            return VkPhysicalDeviceLimits.nframebufferColorSampleCounts(address());
        }

        @NativeType("VkSampleCountFlags")
        public int framebufferDepthSampleCounts() {
            return VkPhysicalDeviceLimits.nframebufferDepthSampleCounts(address());
        }

        @NativeType("VkSampleCountFlags")
        public int framebufferStencilSampleCounts() {
            return VkPhysicalDeviceLimits.nframebufferStencilSampleCounts(address());
        }

        @NativeType("VkSampleCountFlags")
        public int framebufferNoAttachmentsSampleCounts() {
            return VkPhysicalDeviceLimits.nframebufferNoAttachmentsSampleCounts(address());
        }

        @NativeType("uint32_t")
        public int maxColorAttachments() {
            return VkPhysicalDeviceLimits.nmaxColorAttachments(address());
        }

        @NativeType("VkSampleCountFlags")
        public int sampledImageColorSampleCounts() {
            return VkPhysicalDeviceLimits.nsampledImageColorSampleCounts(address());
        }

        @NativeType("VkSampleCountFlags")
        public int sampledImageIntegerSampleCounts() {
            return VkPhysicalDeviceLimits.nsampledImageIntegerSampleCounts(address());
        }

        @NativeType("VkSampleCountFlags")
        public int sampledImageDepthSampleCounts() {
            return VkPhysicalDeviceLimits.nsampledImageDepthSampleCounts(address());
        }

        @NativeType("VkSampleCountFlags")
        public int sampledImageStencilSampleCounts() {
            return VkPhysicalDeviceLimits.nsampledImageStencilSampleCounts(address());
        }

        @NativeType("VkSampleCountFlags")
        public int storageImageSampleCounts() {
            return VkPhysicalDeviceLimits.nstorageImageSampleCounts(address());
        }

        @NativeType("uint32_t")
        public int maxSampleMaskWords() {
            return VkPhysicalDeviceLimits.nmaxSampleMaskWords(address());
        }

        @NativeType("VkBool32")
        public boolean timestampComputeAndGraphics() {
            return VkPhysicalDeviceLimits.ntimestampComputeAndGraphics(address()) != 0;
        }

        public float timestampPeriod() {
            return VkPhysicalDeviceLimits.ntimestampPeriod(address());
        }

        @NativeType("uint32_t")
        public int maxClipDistances() {
            return VkPhysicalDeviceLimits.nmaxClipDistances(address());
        }

        @NativeType("uint32_t")
        public int maxCullDistances() {
            return VkPhysicalDeviceLimits.nmaxCullDistances(address());
        }

        @NativeType("uint32_t")
        public int maxCombinedClipAndCullDistances() {
            return VkPhysicalDeviceLimits.nmaxCombinedClipAndCullDistances(address());
        }

        @NativeType("uint32_t")
        public int discreteQueuePriorities() {
            return VkPhysicalDeviceLimits.ndiscreteQueuePriorities(address());
        }

        @NativeType("float[2]")
        public FloatBuffer pointSizeRange() {
            return VkPhysicalDeviceLimits.npointSizeRange(address());
        }

        public float pointSizeRange(int index) {
            return VkPhysicalDeviceLimits.npointSizeRange(address(), index);
        }

        @NativeType("float[2]")
        public FloatBuffer lineWidthRange() {
            return VkPhysicalDeviceLimits.nlineWidthRange(address());
        }

        public float lineWidthRange(int index) {
            return VkPhysicalDeviceLimits.nlineWidthRange(address(), index);
        }

        public float pointSizeGranularity() {
            return VkPhysicalDeviceLimits.npointSizeGranularity(address());
        }

        public float lineWidthGranularity() {
            return VkPhysicalDeviceLimits.nlineWidthGranularity(address());
        }

        @NativeType("VkBool32")
        public boolean strictLines() {
            return VkPhysicalDeviceLimits.nstrictLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean standardSampleLocations() {
            return VkPhysicalDeviceLimits.nstandardSampleLocations(address()) != 0;
        }

        @NativeType("VkDeviceSize")
        public long optimalBufferCopyOffsetAlignment() {
            return VkPhysicalDeviceLimits.noptimalBufferCopyOffsetAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long optimalBufferCopyRowPitchAlignment() {
            return VkPhysicalDeviceLimits.noptimalBufferCopyRowPitchAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long nonCoherentAtomSize() {
            return VkPhysicalDeviceLimits.nnonCoherentAtomSize(address());
        }
    }
}
