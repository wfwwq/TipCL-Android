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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFeatures.class */
public class VkPhysicalDeviceFeatures extends Struct<VkPhysicalDeviceFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ROBUSTBUFFERACCESS;
    public static final int FULLDRAWINDEXUINT32;
    public static final int IMAGECUBEARRAY;
    public static final int INDEPENDENTBLEND;
    public static final int GEOMETRYSHADER;
    public static final int TESSELLATIONSHADER;
    public static final int SAMPLERATESHADING;
    public static final int DUALSRCBLEND;
    public static final int LOGICOP;
    public static final int MULTIDRAWINDIRECT;
    public static final int DRAWINDIRECTFIRSTINSTANCE;
    public static final int DEPTHCLAMP;
    public static final int DEPTHBIASCLAMP;
    public static final int FILLMODENONSOLID;
    public static final int DEPTHBOUNDS;
    public static final int WIDELINES;
    public static final int LARGEPOINTS;
    public static final int ALPHATOONE;
    public static final int MULTIVIEWPORT;
    public static final int SAMPLERANISOTROPY;
    public static final int TEXTURECOMPRESSIONETC2;
    public static final int TEXTURECOMPRESSIONASTC_LDR;
    public static final int TEXTURECOMPRESSIONBC;
    public static final int OCCLUSIONQUERYPRECISE;
    public static final int PIPELINESTATISTICSQUERY;
    public static final int VERTEXPIPELINESTORESANDATOMICS;
    public static final int FRAGMENTSTORESANDATOMICS;
    public static final int SHADERTESSELLATIONANDGEOMETRYPOINTSIZE;
    public static final int SHADERIMAGEGATHEREXTENDED;
    public static final int SHADERSTORAGEIMAGEEXTENDEDFORMATS;
    public static final int SHADERSTORAGEIMAGEMULTISAMPLE;
    public static final int SHADERSTORAGEIMAGEREADWITHOUTFORMAT;
    public static final int SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT;
    public static final int SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING;
    public static final int SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING;
    public static final int SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING;
    public static final int SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING;
    public static final int SHADERCLIPDISTANCE;
    public static final int SHADERCULLDISTANCE;
    public static final int SHADERFLOAT64;
    public static final int SHADERINT64;
    public static final int SHADERINT16;
    public static final int SHADERRESOURCERESIDENCY;
    public static final int SHADERRESOURCEMINLOD;
    public static final int SPARSEBINDING;
    public static final int SPARSERESIDENCYBUFFER;
    public static final int SPARSERESIDENCYIMAGE2D;
    public static final int SPARSERESIDENCYIMAGE3D;
    public static final int SPARSERESIDENCY2SAMPLES;
    public static final int SPARSERESIDENCY4SAMPLES;
    public static final int SPARSERESIDENCY8SAMPLES;
    public static final int SPARSERESIDENCY16SAMPLES;
    public static final int SPARSERESIDENCYALIASED;
    public static final int VARIABLEMULTISAMPLERATE;
    public static final int INHERITEDQUERIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ROBUSTBUFFERACCESS = layout.offsetof(0);
        FULLDRAWINDEXUINT32 = layout.offsetof(1);
        IMAGECUBEARRAY = layout.offsetof(2);
        INDEPENDENTBLEND = layout.offsetof(3);
        GEOMETRYSHADER = layout.offsetof(4);
        TESSELLATIONSHADER = layout.offsetof(5);
        SAMPLERATESHADING = layout.offsetof(6);
        DUALSRCBLEND = layout.offsetof(7);
        LOGICOP = layout.offsetof(8);
        MULTIDRAWINDIRECT = layout.offsetof(9);
        DRAWINDIRECTFIRSTINSTANCE = layout.offsetof(10);
        DEPTHCLAMP = layout.offsetof(11);
        DEPTHBIASCLAMP = layout.offsetof(12);
        FILLMODENONSOLID = layout.offsetof(13);
        DEPTHBOUNDS = layout.offsetof(14);
        WIDELINES = layout.offsetof(15);
        LARGEPOINTS = layout.offsetof(16);
        ALPHATOONE = layout.offsetof(17);
        MULTIVIEWPORT = layout.offsetof(18);
        SAMPLERANISOTROPY = layout.offsetof(19);
        TEXTURECOMPRESSIONETC2 = layout.offsetof(20);
        TEXTURECOMPRESSIONASTC_LDR = layout.offsetof(21);
        TEXTURECOMPRESSIONBC = layout.offsetof(22);
        OCCLUSIONQUERYPRECISE = layout.offsetof(23);
        PIPELINESTATISTICSQUERY = layout.offsetof(24);
        VERTEXPIPELINESTORESANDATOMICS = layout.offsetof(25);
        FRAGMENTSTORESANDATOMICS = layout.offsetof(26);
        SHADERTESSELLATIONANDGEOMETRYPOINTSIZE = layout.offsetof(27);
        SHADERIMAGEGATHEREXTENDED = layout.offsetof(28);
        SHADERSTORAGEIMAGEEXTENDEDFORMATS = layout.offsetof(29);
        SHADERSTORAGEIMAGEMULTISAMPLE = layout.offsetof(30);
        SHADERSTORAGEIMAGEREADWITHOUTFORMAT = layout.offsetof(31);
        SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT = layout.offsetof(32);
        SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING = layout.offsetof(33);
        SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING = layout.offsetof(34);
        SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING = layout.offsetof(35);
        SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING = layout.offsetof(36);
        SHADERCLIPDISTANCE = layout.offsetof(37);
        SHADERCULLDISTANCE = layout.offsetof(38);
        SHADERFLOAT64 = layout.offsetof(39);
        SHADERINT64 = layout.offsetof(40);
        SHADERINT16 = layout.offsetof(41);
        SHADERRESOURCERESIDENCY = layout.offsetof(42);
        SHADERRESOURCEMINLOD = layout.offsetof(43);
        SPARSEBINDING = layout.offsetof(44);
        SPARSERESIDENCYBUFFER = layout.offsetof(45);
        SPARSERESIDENCYIMAGE2D = layout.offsetof(46);
        SPARSERESIDENCYIMAGE3D = layout.offsetof(47);
        SPARSERESIDENCY2SAMPLES = layout.offsetof(48);
        SPARSERESIDENCY4SAMPLES = layout.offsetof(49);
        SPARSERESIDENCY8SAMPLES = layout.offsetof(50);
        SPARSERESIDENCY16SAMPLES = layout.offsetof(51);
        SPARSERESIDENCYALIASED = layout.offsetof(52);
        VARIABLEMULTISAMPLERATE = layout.offsetof(53);
        INHERITEDQUERIES = layout.offsetof(54);
    }

    protected VkPhysicalDeviceFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFeatures(address, container);
    }

    public VkPhysicalDeviceFeatures(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkBool32")
    public boolean robustBufferAccess() {
        return nrobustBufferAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fullDrawIndexUint32() {
        return nfullDrawIndexUint32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean imageCubeArray() {
        return nimageCubeArray(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean independentBlend() {
        return nindependentBlend(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean geometryShader() {
        return ngeometryShader(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tessellationShader() {
        return ntessellationShader(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sampleRateShading() {
        return nsampleRateShading(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dualSrcBlend() {
        return ndualSrcBlend(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean logicOp() {
        return nlogicOp(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean multiDrawIndirect() {
        return nmultiDrawIndirect(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean drawIndirectFirstInstance() {
        return ndrawIndirectFirstInstance(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean depthClamp() {
        return ndepthClamp(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean depthBiasClamp() {
        return ndepthBiasClamp(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fillModeNonSolid() {
        return nfillModeNonSolid(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean depthBounds() {
        return ndepthBounds(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean wideLines() {
        return nwideLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean largePoints() {
        return nlargePoints(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean alphaToOne() {
        return nalphaToOne(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean multiViewport() {
        return nmultiViewport(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean samplerAnisotropy() {
        return nsamplerAnisotropy(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean textureCompressionETC2() {
        return ntextureCompressionETC2(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean textureCompressionASTC_LDR() {
        return ntextureCompressionASTC_LDR(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean textureCompressionBC() {
        return ntextureCompressionBC(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean occlusionQueryPrecise() {
        return nocclusionQueryPrecise(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean pipelineStatisticsQuery() {
        return npipelineStatisticsQuery(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean vertexPipelineStoresAndAtomics() {
        return nvertexPipelineStoresAndAtomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fragmentStoresAndAtomics() {
        return nfragmentStoresAndAtomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderTessellationAndGeometryPointSize() {
        return nshaderTessellationAndGeometryPointSize(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderImageGatherExtended() {
        return nshaderImageGatherExtended(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageImageExtendedFormats() {
        return nshaderStorageImageExtendedFormats(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageImageMultisample() {
        return nshaderStorageImageMultisample(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageImageReadWithoutFormat() {
        return nshaderStorageImageReadWithoutFormat(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageImageWriteWithoutFormat() {
        return nshaderStorageImageWriteWithoutFormat(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayDynamicIndexing() {
        return nshaderUniformBufferArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayDynamicIndexing() {
        return nshaderSampledImageArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayDynamicIndexing() {
        return nshaderStorageBufferArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayDynamicIndexing() {
        return nshaderStorageImageArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderClipDistance() {
        return nshaderClipDistance(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderCullDistance() {
        return nshaderCullDistance(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderFloat64() {
        return nshaderFloat64(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderInt64() {
        return nshaderInt64(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderInt16() {
        return nshaderInt16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderResourceResidency() {
        return nshaderResourceResidency(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderResourceMinLod() {
        return nshaderResourceMinLod(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseBinding() {
        return nsparseBinding(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseResidencyBuffer() {
        return nsparseResidencyBuffer(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseResidencyImage2D() {
        return nsparseResidencyImage2D(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseResidencyImage3D() {
        return nsparseResidencyImage3D(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseResidency2Samples() {
        return nsparseResidency2Samples(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseResidency4Samples() {
        return nsparseResidency4Samples(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseResidency8Samples() {
        return nsparseResidency8Samples(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseResidency16Samples() {
        return nsparseResidency16Samples(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseResidencyAliased() {
        return nsparseResidencyAliased(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean variableMultisampleRate() {
        return nvariableMultisampleRate(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean inheritedQueries() {
        return ninheritedQueries(address()) != 0;
    }

    public VkPhysicalDeviceFeatures robustBufferAccess(@NativeType("VkBool32") boolean value) {
        nrobustBufferAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures fullDrawIndexUint32(@NativeType("VkBool32") boolean value) {
        nfullDrawIndexUint32(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures imageCubeArray(@NativeType("VkBool32") boolean value) {
        nimageCubeArray(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures independentBlend(@NativeType("VkBool32") boolean value) {
        nindependentBlend(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures geometryShader(@NativeType("VkBool32") boolean value) {
        ngeometryShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures tessellationShader(@NativeType("VkBool32") boolean value) {
        ntessellationShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures sampleRateShading(@NativeType("VkBool32") boolean value) {
        nsampleRateShading(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures dualSrcBlend(@NativeType("VkBool32") boolean value) {
        ndualSrcBlend(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures logicOp(@NativeType("VkBool32") boolean value) {
        nlogicOp(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures multiDrawIndirect(@NativeType("VkBool32") boolean value) {
        nmultiDrawIndirect(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures drawIndirectFirstInstance(@NativeType("VkBool32") boolean value) {
        ndrawIndirectFirstInstance(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures depthClamp(@NativeType("VkBool32") boolean value) {
        ndepthClamp(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures depthBiasClamp(@NativeType("VkBool32") boolean value) {
        ndepthBiasClamp(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures fillModeNonSolid(@NativeType("VkBool32") boolean value) {
        nfillModeNonSolid(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures depthBounds(@NativeType("VkBool32") boolean value) {
        ndepthBounds(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures wideLines(@NativeType("VkBool32") boolean value) {
        nwideLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures largePoints(@NativeType("VkBool32") boolean value) {
        nlargePoints(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures alphaToOne(@NativeType("VkBool32") boolean value) {
        nalphaToOne(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures multiViewport(@NativeType("VkBool32") boolean value) {
        nmultiViewport(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures samplerAnisotropy(@NativeType("VkBool32") boolean value) {
        nsamplerAnisotropy(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures textureCompressionETC2(@NativeType("VkBool32") boolean value) {
        ntextureCompressionETC2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures textureCompressionASTC_LDR(@NativeType("VkBool32") boolean value) {
        ntextureCompressionASTC_LDR(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures textureCompressionBC(@NativeType("VkBool32") boolean value) {
        ntextureCompressionBC(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures occlusionQueryPrecise(@NativeType("VkBool32") boolean value) {
        nocclusionQueryPrecise(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures pipelineStatisticsQuery(@NativeType("VkBool32") boolean value) {
        npipelineStatisticsQuery(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(@NativeType("VkBool32") boolean value) {
        nvertexPipelineStoresAndAtomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures fragmentStoresAndAtomics(@NativeType("VkBool32") boolean value) {
        nfragmentStoresAndAtomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(@NativeType("VkBool32") boolean value) {
        nshaderTessellationAndGeometryPointSize(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderImageGatherExtended(@NativeType("VkBool32") boolean value) {
        nshaderImageGatherExtended(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(@NativeType("VkBool32") boolean value) {
        nshaderStorageImageExtendedFormats(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderStorageImageMultisample(@NativeType("VkBool32") boolean value) {
        nshaderStorageImageMultisample(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(@NativeType("VkBool32") boolean value) {
        nshaderStorageImageReadWithoutFormat(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(@NativeType("VkBool32") boolean value) {
        nshaderStorageImageWriteWithoutFormat(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderUniformBufferArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderSampledImageArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageBufferArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageImageArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderClipDistance(@NativeType("VkBool32") boolean value) {
        nshaderClipDistance(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderCullDistance(@NativeType("VkBool32") boolean value) {
        nshaderCullDistance(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderFloat64(@NativeType("VkBool32") boolean value) {
        nshaderFloat64(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderInt64(@NativeType("VkBool32") boolean value) {
        nshaderInt64(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderInt16(@NativeType("VkBool32") boolean value) {
        nshaderInt16(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderResourceResidency(@NativeType("VkBool32") boolean value) {
        nshaderResourceResidency(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures shaderResourceMinLod(@NativeType("VkBool32") boolean value) {
        nshaderResourceMinLod(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures sparseBinding(@NativeType("VkBool32") boolean value) {
        nsparseBinding(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures sparseResidencyBuffer(@NativeType("VkBool32") boolean value) {
        nsparseResidencyBuffer(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures sparseResidencyImage2D(@NativeType("VkBool32") boolean value) {
        nsparseResidencyImage2D(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures sparseResidencyImage3D(@NativeType("VkBool32") boolean value) {
        nsparseResidencyImage3D(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures sparseResidency2Samples(@NativeType("VkBool32") boolean value) {
        nsparseResidency2Samples(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures sparseResidency4Samples(@NativeType("VkBool32") boolean value) {
        nsparseResidency4Samples(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures sparseResidency8Samples(@NativeType("VkBool32") boolean value) {
        nsparseResidency8Samples(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures sparseResidency16Samples(@NativeType("VkBool32") boolean value) {
        nsparseResidency16Samples(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures sparseResidencyAliased(@NativeType("VkBool32") boolean value) {
        nsparseResidencyAliased(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures variableMultisampleRate(@NativeType("VkBool32") boolean value) {
        nvariableMultisampleRate(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures inheritedQueries(@NativeType("VkBool32") boolean value) {
        ninheritedQueries(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFeatures set(boolean robustBufferAccess, boolean fullDrawIndexUint32, boolean imageCubeArray, boolean independentBlend, boolean geometryShader, boolean tessellationShader, boolean sampleRateShading, boolean dualSrcBlend, boolean logicOp, boolean multiDrawIndirect, boolean drawIndirectFirstInstance, boolean depthClamp, boolean depthBiasClamp, boolean fillModeNonSolid, boolean depthBounds, boolean wideLines, boolean largePoints, boolean alphaToOne, boolean multiViewport, boolean samplerAnisotropy, boolean textureCompressionETC2, boolean textureCompressionASTC_LDR, boolean textureCompressionBC, boolean occlusionQueryPrecise, boolean pipelineStatisticsQuery, boolean vertexPipelineStoresAndAtomics, boolean fragmentStoresAndAtomics, boolean shaderTessellationAndGeometryPointSize, boolean shaderImageGatherExtended, boolean shaderStorageImageExtendedFormats, boolean shaderStorageImageMultisample, boolean shaderStorageImageReadWithoutFormat, boolean shaderStorageImageWriteWithoutFormat, boolean shaderUniformBufferArrayDynamicIndexing, boolean shaderSampledImageArrayDynamicIndexing, boolean shaderStorageBufferArrayDynamicIndexing, boolean shaderStorageImageArrayDynamicIndexing, boolean shaderClipDistance, boolean shaderCullDistance, boolean shaderFloat64, boolean shaderInt64, boolean shaderInt16, boolean shaderResourceResidency, boolean shaderResourceMinLod, boolean sparseBinding, boolean sparseResidencyBuffer, boolean sparseResidencyImage2D, boolean sparseResidencyImage3D, boolean sparseResidency2Samples, boolean sparseResidency4Samples, boolean sparseResidency8Samples, boolean sparseResidency16Samples, boolean sparseResidencyAliased, boolean variableMultisampleRate, boolean inheritedQueries) {
        robustBufferAccess(robustBufferAccess);
        fullDrawIndexUint32(fullDrawIndexUint32);
        imageCubeArray(imageCubeArray);
        independentBlend(independentBlend);
        geometryShader(geometryShader);
        tessellationShader(tessellationShader);
        sampleRateShading(sampleRateShading);
        dualSrcBlend(dualSrcBlend);
        logicOp(logicOp);
        multiDrawIndirect(multiDrawIndirect);
        drawIndirectFirstInstance(drawIndirectFirstInstance);
        depthClamp(depthClamp);
        depthBiasClamp(depthBiasClamp);
        fillModeNonSolid(fillModeNonSolid);
        depthBounds(depthBounds);
        wideLines(wideLines);
        largePoints(largePoints);
        alphaToOne(alphaToOne);
        multiViewport(multiViewport);
        samplerAnisotropy(samplerAnisotropy);
        textureCompressionETC2(textureCompressionETC2);
        textureCompressionASTC_LDR(textureCompressionASTC_LDR);
        textureCompressionBC(textureCompressionBC);
        occlusionQueryPrecise(occlusionQueryPrecise);
        pipelineStatisticsQuery(pipelineStatisticsQuery);
        vertexPipelineStoresAndAtomics(vertexPipelineStoresAndAtomics);
        fragmentStoresAndAtomics(fragmentStoresAndAtomics);
        shaderTessellationAndGeometryPointSize(shaderTessellationAndGeometryPointSize);
        shaderImageGatherExtended(shaderImageGatherExtended);
        shaderStorageImageExtendedFormats(shaderStorageImageExtendedFormats);
        shaderStorageImageMultisample(shaderStorageImageMultisample);
        shaderStorageImageReadWithoutFormat(shaderStorageImageReadWithoutFormat);
        shaderStorageImageWriteWithoutFormat(shaderStorageImageWriteWithoutFormat);
        shaderUniformBufferArrayDynamicIndexing(shaderUniformBufferArrayDynamicIndexing);
        shaderSampledImageArrayDynamicIndexing(shaderSampledImageArrayDynamicIndexing);
        shaderStorageBufferArrayDynamicIndexing(shaderStorageBufferArrayDynamicIndexing);
        shaderStorageImageArrayDynamicIndexing(shaderStorageImageArrayDynamicIndexing);
        shaderClipDistance(shaderClipDistance);
        shaderCullDistance(shaderCullDistance);
        shaderFloat64(shaderFloat64);
        shaderInt64(shaderInt64);
        shaderInt16(shaderInt16);
        shaderResourceResidency(shaderResourceResidency);
        shaderResourceMinLod(shaderResourceMinLod);
        sparseBinding(sparseBinding);
        sparseResidencyBuffer(sparseResidencyBuffer);
        sparseResidencyImage2D(sparseResidencyImage2D);
        sparseResidencyImage3D(sparseResidencyImage3D);
        sparseResidency2Samples(sparseResidency2Samples);
        sparseResidency4Samples(sparseResidency4Samples);
        sparseResidency8Samples(sparseResidency8Samples);
        sparseResidency16Samples(sparseResidency16Samples);
        sparseResidencyAliased(sparseResidencyAliased);
        variableMultisampleRate(variableMultisampleRate);
        inheritedQueries(inheritedQueries);
        return this;
    }

    public VkPhysicalDeviceFeatures set(VkPhysicalDeviceFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFeatures malloc() {
        return new VkPhysicalDeviceFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFeatures calloc() {
        return new VkPhysicalDeviceFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFeatures create(long address) {
        return new VkPhysicalDeviceFeatures(address, null);
    }

    public static VkPhysicalDeviceFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFeatures(address, null);
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

    public static VkPhysicalDeviceFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nrobustBufferAccess(long struct) {
        return MemoryUtil.memGetInt(struct + ROBUSTBUFFERACCESS);
    }

    public static int nfullDrawIndexUint32(long struct) {
        return MemoryUtil.memGetInt(struct + FULLDRAWINDEXUINT32);
    }

    public static int nimageCubeArray(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGECUBEARRAY);
    }

    public static int nindependentBlend(long struct) {
        return MemoryUtil.memGetInt(struct + INDEPENDENTBLEND);
    }

    public static int ngeometryShader(long struct) {
        return MemoryUtil.memGetInt(struct + GEOMETRYSHADER);
    }

    public static int ntessellationShader(long struct) {
        return MemoryUtil.memGetInt(struct + TESSELLATIONSHADER);
    }

    public static int nsampleRateShading(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERATESHADING);
    }

    public static int ndualSrcBlend(long struct) {
        return MemoryUtil.memGetInt(struct + DUALSRCBLEND);
    }

    public static int nlogicOp(long struct) {
        return MemoryUtil.memGetInt(struct + LOGICOP);
    }

    public static int nmultiDrawIndirect(long struct) {
        return MemoryUtil.memGetInt(struct + MULTIDRAWINDIRECT);
    }

    public static int ndrawIndirectFirstInstance(long struct) {
        return MemoryUtil.memGetInt(struct + DRAWINDIRECTFIRSTINSTANCE);
    }

    public static int ndepthClamp(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHCLAMP);
    }

    public static int ndepthBiasClamp(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHBIASCLAMP);
    }

    public static int nfillModeNonSolid(long struct) {
        return MemoryUtil.memGetInt(struct + FILLMODENONSOLID);
    }

    public static int ndepthBounds(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHBOUNDS);
    }

    public static int nwideLines(long struct) {
        return MemoryUtil.memGetInt(struct + WIDELINES);
    }

    public static int nlargePoints(long struct) {
        return MemoryUtil.memGetInt(struct + LARGEPOINTS);
    }

    public static int nalphaToOne(long struct) {
        return MemoryUtil.memGetInt(struct + ALPHATOONE);
    }

    public static int nmultiViewport(long struct) {
        return MemoryUtil.memGetInt(struct + MULTIVIEWPORT);
    }

    public static int nsamplerAnisotropy(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERANISOTROPY);
    }

    public static int ntextureCompressionETC2(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTURECOMPRESSIONETC2);
    }

    public static int ntextureCompressionASTC_LDR(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTURECOMPRESSIONASTC_LDR);
    }

    public static int ntextureCompressionBC(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTURECOMPRESSIONBC);
    }

    public static int nocclusionQueryPrecise(long struct) {
        return MemoryUtil.memGetInt(struct + OCCLUSIONQUERYPRECISE);
    }

    public static int npipelineStatisticsQuery(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINESTATISTICSQUERY);
    }

    public static int nvertexPipelineStoresAndAtomics(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXPIPELINESTORESANDATOMICS);
    }

    public static int nfragmentStoresAndAtomics(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSTORESANDATOMICS);
    }

    public static int nshaderTessellationAndGeometryPointSize(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTESSELLATIONANDGEOMETRYPOINTSIZE);
    }

    public static int nshaderImageGatherExtended(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERIMAGEGATHEREXTENDED);
    }

    public static int nshaderStorageImageExtendedFormats(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEIMAGEEXTENDEDFORMATS);
    }

    public static int nshaderStorageImageMultisample(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEIMAGEMULTISAMPLE);
    }

    public static int nshaderStorageImageReadWithoutFormat(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEIMAGEREADWITHOUTFORMAT);
    }

    public static int nshaderStorageImageWriteWithoutFormat(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT);
    }

    public static int nshaderUniformBufferArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING);
    }

    public static int nshaderSampledImageArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING);
    }

    public static int nshaderStorageBufferArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING);
    }

    public static int nshaderStorageImageArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING);
    }

    public static int nshaderClipDistance(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERCLIPDISTANCE);
    }

    public static int nshaderCullDistance(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERCULLDISTANCE);
    }

    public static int nshaderFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFLOAT64);
    }

    public static int nshaderInt64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINT64);
    }

    public static int nshaderInt16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINT16);
    }

    public static int nshaderResourceResidency(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERRESOURCERESIDENCY);
    }

    public static int nshaderResourceMinLod(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERRESOURCEMINLOD);
    }

    public static int nsparseBinding(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSEBINDING);
    }

    public static int nsparseResidencyBuffer(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSERESIDENCYBUFFER);
    }

    public static int nsparseResidencyImage2D(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSERESIDENCYIMAGE2D);
    }

    public static int nsparseResidencyImage3D(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSERESIDENCYIMAGE3D);
    }

    public static int nsparseResidency2Samples(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSERESIDENCY2SAMPLES);
    }

    public static int nsparseResidency4Samples(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSERESIDENCY4SAMPLES);
    }

    public static int nsparseResidency8Samples(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSERESIDENCY8SAMPLES);
    }

    public static int nsparseResidency16Samples(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSERESIDENCY16SAMPLES);
    }

    public static int nsparseResidencyAliased(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSERESIDENCYALIASED);
    }

    public static int nvariableMultisampleRate(long struct) {
        return MemoryUtil.memGetInt(struct + VARIABLEMULTISAMPLERATE);
    }

    public static int ninheritedQueries(long struct) {
        return MemoryUtil.memGetInt(struct + INHERITEDQUERIES);
    }

    public static void nrobustBufferAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + ROBUSTBUFFERACCESS, value);
    }

    public static void nfullDrawIndexUint32(long struct, int value) {
        MemoryUtil.memPutInt(struct + FULLDRAWINDEXUINT32, value);
    }

    public static void nimageCubeArray(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGECUBEARRAY, value);
    }

    public static void nindependentBlend(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEPENDENTBLEND, value);
    }

    public static void ngeometryShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + GEOMETRYSHADER, value);
    }

    public static void ntessellationShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + TESSELLATIONSHADER, value);
    }

    public static void nsampleRateShading(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERATESHADING, value);
    }

    public static void ndualSrcBlend(long struct, int value) {
        MemoryUtil.memPutInt(struct + DUALSRCBLEND, value);
    }

    public static void nlogicOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOGICOP, value);
    }

    public static void nmultiDrawIndirect(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTIDRAWINDIRECT, value);
    }

    public static void ndrawIndirectFirstInstance(long struct, int value) {
        MemoryUtil.memPutInt(struct + DRAWINDIRECTFIRSTINSTANCE, value);
    }

    public static void ndepthClamp(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHCLAMP, value);
    }

    public static void ndepthBiasClamp(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHBIASCLAMP, value);
    }

    public static void nfillModeNonSolid(long struct, int value) {
        MemoryUtil.memPutInt(struct + FILLMODENONSOLID, value);
    }

    public static void ndepthBounds(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHBOUNDS, value);
    }

    public static void nwideLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDELINES, value);
    }

    public static void nlargePoints(long struct, int value) {
        MemoryUtil.memPutInt(struct + LARGEPOINTS, value);
    }

    public static void nalphaToOne(long struct, int value) {
        MemoryUtil.memPutInt(struct + ALPHATOONE, value);
    }

    public static void nmultiViewport(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTIVIEWPORT, value);
    }

    public static void nsamplerAnisotropy(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERANISOTROPY, value);
    }

    public static void ntextureCompressionETC2(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEXTURECOMPRESSIONETC2, value);
    }

    public static void ntextureCompressionASTC_LDR(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEXTURECOMPRESSIONASTC_LDR, value);
    }

    public static void ntextureCompressionBC(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEXTURECOMPRESSIONBC, value);
    }

    public static void nocclusionQueryPrecise(long struct, int value) {
        MemoryUtil.memPutInt(struct + OCCLUSIONQUERYPRECISE, value);
    }

    public static void npipelineStatisticsQuery(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINESTATISTICSQUERY, value);
    }

    public static void nvertexPipelineStoresAndAtomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXPIPELINESTORESANDATOMICS, value);
    }

    public static void nfragmentStoresAndAtomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAGMENTSTORESANDATOMICS, value);
    }

    public static void nshaderTessellationAndGeometryPointSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERTESSELLATIONANDGEOMETRYPOINTSIZE, value);
    }

    public static void nshaderImageGatherExtended(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERIMAGEGATHEREXTENDED, value);
    }

    public static void nshaderStorageImageExtendedFormats(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGEIMAGEEXTENDEDFORMATS, value);
    }

    public static void nshaderStorageImageMultisample(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGEIMAGEMULTISAMPLE, value);
    }

    public static void nshaderStorageImageReadWithoutFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGEIMAGEREADWITHOUTFORMAT, value);
    }

    public static void nshaderStorageImageWriteWithoutFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT, value);
    }

    public static void nshaderUniformBufferArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderSampledImageArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderStorageBufferArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderStorageImageArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderClipDistance(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERCLIPDISTANCE, value);
    }

    public static void nshaderCullDistance(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERCULLDISTANCE, value);
    }

    public static void nshaderFloat64(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFLOAT64, value);
    }

    public static void nshaderInt64(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINT64, value);
    }

    public static void nshaderInt16(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINT16, value);
    }

    public static void nshaderResourceResidency(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERRESOURCERESIDENCY, value);
    }

    public static void nshaderResourceMinLod(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERRESOURCEMINLOD, value);
    }

    public static void nsparseBinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSEBINDING, value);
    }

    public static void nsparseResidencyBuffer(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSERESIDENCYBUFFER, value);
    }

    public static void nsparseResidencyImage2D(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSERESIDENCYIMAGE2D, value);
    }

    public static void nsparseResidencyImage3D(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSERESIDENCYIMAGE3D, value);
    }

    public static void nsparseResidency2Samples(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSERESIDENCY2SAMPLES, value);
    }

    public static void nsparseResidency4Samples(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSERESIDENCY4SAMPLES, value);
    }

    public static void nsparseResidency8Samples(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSERESIDENCY8SAMPLES, value);
    }

    public static void nsparseResidency16Samples(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSERESIDENCY16SAMPLES, value);
    }

    public static void nsparseResidencyAliased(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSERESIDENCYALIASED, value);
    }

    public static void nvariableMultisampleRate(long struct, int value) {
        MemoryUtil.memPutInt(struct + VARIABLEMULTISAMPLERATE, value);
    }

    public static void ninheritedQueries(long struct, int value) {
        MemoryUtil.memPutInt(struct + INHERITEDQUERIES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFeatures ELEMENT_FACTORY = VkPhysicalDeviceFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFeatures.SIZEOF);
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
        public VkPhysicalDeviceFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkBool32")
        public boolean robustBufferAccess() {
            return VkPhysicalDeviceFeatures.nrobustBufferAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fullDrawIndexUint32() {
            return VkPhysicalDeviceFeatures.nfullDrawIndexUint32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean imageCubeArray() {
            return VkPhysicalDeviceFeatures.nimageCubeArray(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean independentBlend() {
            return VkPhysicalDeviceFeatures.nindependentBlend(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean geometryShader() {
            return VkPhysicalDeviceFeatures.ngeometryShader(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tessellationShader() {
            return VkPhysicalDeviceFeatures.ntessellationShader(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sampleRateShading() {
            return VkPhysicalDeviceFeatures.nsampleRateShading(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dualSrcBlend() {
            return VkPhysicalDeviceFeatures.ndualSrcBlend(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean logicOp() {
            return VkPhysicalDeviceFeatures.nlogicOp(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean multiDrawIndirect() {
            return VkPhysicalDeviceFeatures.nmultiDrawIndirect(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean drawIndirectFirstInstance() {
            return VkPhysicalDeviceFeatures.ndrawIndirectFirstInstance(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean depthClamp() {
            return VkPhysicalDeviceFeatures.ndepthClamp(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean depthBiasClamp() {
            return VkPhysicalDeviceFeatures.ndepthBiasClamp(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fillModeNonSolid() {
            return VkPhysicalDeviceFeatures.nfillModeNonSolid(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean depthBounds() {
            return VkPhysicalDeviceFeatures.ndepthBounds(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean wideLines() {
            return VkPhysicalDeviceFeatures.nwideLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean largePoints() {
            return VkPhysicalDeviceFeatures.nlargePoints(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean alphaToOne() {
            return VkPhysicalDeviceFeatures.nalphaToOne(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean multiViewport() {
            return VkPhysicalDeviceFeatures.nmultiViewport(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean samplerAnisotropy() {
            return VkPhysicalDeviceFeatures.nsamplerAnisotropy(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean textureCompressionETC2() {
            return VkPhysicalDeviceFeatures.ntextureCompressionETC2(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean textureCompressionASTC_LDR() {
            return VkPhysicalDeviceFeatures.ntextureCompressionASTC_LDR(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean textureCompressionBC() {
            return VkPhysicalDeviceFeatures.ntextureCompressionBC(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean occlusionQueryPrecise() {
            return VkPhysicalDeviceFeatures.nocclusionQueryPrecise(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean pipelineStatisticsQuery() {
            return VkPhysicalDeviceFeatures.npipelineStatisticsQuery(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean vertexPipelineStoresAndAtomics() {
            return VkPhysicalDeviceFeatures.nvertexPipelineStoresAndAtomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fragmentStoresAndAtomics() {
            return VkPhysicalDeviceFeatures.nfragmentStoresAndAtomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderTessellationAndGeometryPointSize() {
            return VkPhysicalDeviceFeatures.nshaderTessellationAndGeometryPointSize(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderImageGatherExtended() {
            return VkPhysicalDeviceFeatures.nshaderImageGatherExtended(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageImageExtendedFormats() {
            return VkPhysicalDeviceFeatures.nshaderStorageImageExtendedFormats(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageImageMultisample() {
            return VkPhysicalDeviceFeatures.nshaderStorageImageMultisample(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageImageReadWithoutFormat() {
            return VkPhysicalDeviceFeatures.nshaderStorageImageReadWithoutFormat(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageImageWriteWithoutFormat() {
            return VkPhysicalDeviceFeatures.nshaderStorageImageWriteWithoutFormat(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayDynamicIndexing() {
            return VkPhysicalDeviceFeatures.nshaderUniformBufferArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayDynamicIndexing() {
            return VkPhysicalDeviceFeatures.nshaderSampledImageArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayDynamicIndexing() {
            return VkPhysicalDeviceFeatures.nshaderStorageBufferArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayDynamicIndexing() {
            return VkPhysicalDeviceFeatures.nshaderStorageImageArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderClipDistance() {
            return VkPhysicalDeviceFeatures.nshaderClipDistance(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderCullDistance() {
            return VkPhysicalDeviceFeatures.nshaderCullDistance(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderFloat64() {
            return VkPhysicalDeviceFeatures.nshaderFloat64(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderInt64() {
            return VkPhysicalDeviceFeatures.nshaderInt64(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderInt16() {
            return VkPhysicalDeviceFeatures.nshaderInt16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderResourceResidency() {
            return VkPhysicalDeviceFeatures.nshaderResourceResidency(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderResourceMinLod() {
            return VkPhysicalDeviceFeatures.nshaderResourceMinLod(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseBinding() {
            return VkPhysicalDeviceFeatures.nsparseBinding(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseResidencyBuffer() {
            return VkPhysicalDeviceFeatures.nsparseResidencyBuffer(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseResidencyImage2D() {
            return VkPhysicalDeviceFeatures.nsparseResidencyImage2D(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseResidencyImage3D() {
            return VkPhysicalDeviceFeatures.nsparseResidencyImage3D(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseResidency2Samples() {
            return VkPhysicalDeviceFeatures.nsparseResidency2Samples(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseResidency4Samples() {
            return VkPhysicalDeviceFeatures.nsparseResidency4Samples(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseResidency8Samples() {
            return VkPhysicalDeviceFeatures.nsparseResidency8Samples(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseResidency16Samples() {
            return VkPhysicalDeviceFeatures.nsparseResidency16Samples(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseResidencyAliased() {
            return VkPhysicalDeviceFeatures.nsparseResidencyAliased(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean variableMultisampleRate() {
            return VkPhysicalDeviceFeatures.nvariableMultisampleRate(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean inheritedQueries() {
            return VkPhysicalDeviceFeatures.ninheritedQueries(address()) != 0;
        }

        public Buffer robustBufferAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nrobustBufferAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer fullDrawIndexUint32(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nfullDrawIndexUint32(address(), value ? 1 : 0);
            return this;
        }

        public Buffer imageCubeArray(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nimageCubeArray(address(), value ? 1 : 0);
            return this;
        }

        public Buffer independentBlend(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nindependentBlend(address(), value ? 1 : 0);
            return this;
        }

        public Buffer geometryShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ngeometryShader(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tessellationShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ntessellationShader(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sampleRateShading(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsampleRateShading(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dualSrcBlend(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ndualSrcBlend(address(), value ? 1 : 0);
            return this;
        }

        public Buffer logicOp(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nlogicOp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer multiDrawIndirect(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nmultiDrawIndirect(address(), value ? 1 : 0);
            return this;
        }

        public Buffer drawIndirectFirstInstance(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ndrawIndirectFirstInstance(address(), value ? 1 : 0);
            return this;
        }

        public Buffer depthClamp(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ndepthClamp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer depthBiasClamp(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ndepthBiasClamp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer fillModeNonSolid(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nfillModeNonSolid(address(), value ? 1 : 0);
            return this;
        }

        public Buffer depthBounds(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ndepthBounds(address(), value ? 1 : 0);
            return this;
        }

        public Buffer wideLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nwideLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer largePoints(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nlargePoints(address(), value ? 1 : 0);
            return this;
        }

        public Buffer alphaToOne(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nalphaToOne(address(), value ? 1 : 0);
            return this;
        }

        public Buffer multiViewport(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nmultiViewport(address(), value ? 1 : 0);
            return this;
        }

        public Buffer samplerAnisotropy(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsamplerAnisotropy(address(), value ? 1 : 0);
            return this;
        }

        public Buffer textureCompressionETC2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ntextureCompressionETC2(address(), value ? 1 : 0);
            return this;
        }

        public Buffer textureCompressionASTC_LDR(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ntextureCompressionASTC_LDR(address(), value ? 1 : 0);
            return this;
        }

        public Buffer textureCompressionBC(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ntextureCompressionBC(address(), value ? 1 : 0);
            return this;
        }

        public Buffer occlusionQueryPrecise(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nocclusionQueryPrecise(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pipelineStatisticsQuery(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.npipelineStatisticsQuery(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vertexPipelineStoresAndAtomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nvertexPipelineStoresAndAtomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer fragmentStoresAndAtomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nfragmentStoresAndAtomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderTessellationAndGeometryPointSize(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderTessellationAndGeometryPointSize(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderImageGatherExtended(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderImageGatherExtended(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageImageExtendedFormats(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderStorageImageExtendedFormats(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageImageMultisample(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderStorageImageMultisample(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageImageReadWithoutFormat(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderStorageImageReadWithoutFormat(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageImageWriteWithoutFormat(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderStorageImageWriteWithoutFormat(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderUniformBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderUniformBufferArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSampledImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderSampledImageArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderStorageBufferArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderStorageImageArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderClipDistance(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderClipDistance(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderCullDistance(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderCullDistance(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderFloat64(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderFloat64(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderInt64(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderInt64(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderInt16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderInt16(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderResourceResidency(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderResourceResidency(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderResourceMinLod(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nshaderResourceMinLod(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseBinding(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsparseBinding(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseResidencyBuffer(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsparseResidencyBuffer(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseResidencyImage2D(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsparseResidencyImage2D(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseResidencyImage3D(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsparseResidencyImage3D(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseResidency2Samples(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsparseResidency2Samples(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseResidency4Samples(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsparseResidency4Samples(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseResidency8Samples(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsparseResidency8Samples(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseResidency16Samples(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsparseResidency16Samples(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseResidencyAliased(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nsparseResidencyAliased(address(), value ? 1 : 0);
            return this;
        }

        public Buffer variableMultisampleRate(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.nvariableMultisampleRate(address(), value ? 1 : 0);
            return this;
        }

        public Buffer inheritedQueries(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFeatures.ninheritedQueries(address(), value ? 1 : 0);
            return this;
        }
    }
}
