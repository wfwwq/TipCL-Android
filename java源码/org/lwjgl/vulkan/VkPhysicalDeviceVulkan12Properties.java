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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Properties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Properties.class */
public class VkPhysicalDeviceVulkan12Properties extends Struct<VkPhysicalDeviceVulkan12Properties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DRIVERID;
    public static final int DRIVERNAME;
    public static final int DRIVERINFO;
    public static final int CONFORMANCEVERSION;
    public static final int DENORMBEHAVIORINDEPENDENCE;
    public static final int ROUNDINGMODEINDEPENDENCE;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT16;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT32;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT64;
    public static final int SHADERDENORMPRESERVEFLOAT16;
    public static final int SHADERDENORMPRESERVEFLOAT32;
    public static final int SHADERDENORMPRESERVEFLOAT64;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT16;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT32;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT64;
    public static final int SHADERROUNDINGMODERTEFLOAT16;
    public static final int SHADERROUNDINGMODERTEFLOAT32;
    public static final int SHADERROUNDINGMODERTEFLOAT64;
    public static final int SHADERROUNDINGMODERTZFLOAT16;
    public static final int SHADERROUNDINGMODERTZFLOAT32;
    public static final int SHADERROUNDINGMODERTZFLOAT64;
    public static final int MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS;
    public static final int SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int ROBUSTBUFFERACCESSUPDATEAFTERBIND;
    public static final int QUADDIVERGENTIMPLICITLOD;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS;
    public static final int MAXPERSTAGEUPDATEAFTERBINDRESOURCES;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS;
    public static final int SUPPORTEDDEPTHRESOLVEMODES;
    public static final int SUPPORTEDSTENCILRESOLVEMODES;
    public static final int INDEPENDENTRESOLVENONE;
    public static final int INDEPENDENTRESOLVE;
    public static final int FILTERMINMAXSINGLECOMPONENTFORMATS;
    public static final int FILTERMINMAXIMAGECOMPONENTMAPPING;
    public static final int MAXTIMELINESEMAPHOREVALUEDIFFERENCE;
    public static final int FRAMEBUFFERINTEGERCOLORSAMPLECOUNTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __array(1, 256), __array(1, 256), __member(VkConformanceVersion.SIZEOF, VkConformanceVersion.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRIVERID = layout.offsetof(2);
        DRIVERNAME = layout.offsetof(3);
        DRIVERINFO = layout.offsetof(4);
        CONFORMANCEVERSION = layout.offsetof(5);
        DENORMBEHAVIORINDEPENDENCE = layout.offsetof(6);
        ROUNDINGMODEINDEPENDENCE = layout.offsetof(7);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT16 = layout.offsetof(8);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT32 = layout.offsetof(9);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT64 = layout.offsetof(10);
        SHADERDENORMPRESERVEFLOAT16 = layout.offsetof(11);
        SHADERDENORMPRESERVEFLOAT32 = layout.offsetof(12);
        SHADERDENORMPRESERVEFLOAT64 = layout.offsetof(13);
        SHADERDENORMFLUSHTOZEROFLOAT16 = layout.offsetof(14);
        SHADERDENORMFLUSHTOZEROFLOAT32 = layout.offsetof(15);
        SHADERDENORMFLUSHTOZEROFLOAT64 = layout.offsetof(16);
        SHADERROUNDINGMODERTEFLOAT16 = layout.offsetof(17);
        SHADERROUNDINGMODERTEFLOAT32 = layout.offsetof(18);
        SHADERROUNDINGMODERTEFLOAT64 = layout.offsetof(19);
        SHADERROUNDINGMODERTZFLOAT16 = layout.offsetof(20);
        SHADERROUNDINGMODERTZFLOAT32 = layout.offsetof(21);
        SHADERROUNDINGMODERTZFLOAT64 = layout.offsetof(22);
        MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS = layout.offsetof(23);
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(24);
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(25);
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(26);
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(27);
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(28);
        ROBUSTBUFFERACCESSUPDATEAFTERBIND = layout.offsetof(29);
        QUADDIVERGENTIMPLICITLOD = layout.offsetof(30);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS = layout.offsetof(31);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS = layout.offsetof(32);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS = layout.offsetof(33);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES = layout.offsetof(34);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES = layout.offsetof(35);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS = layout.offsetof(36);
        MAXPERSTAGEUPDATEAFTERBINDRESOURCES = layout.offsetof(37);
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS = layout.offsetof(38);
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS = layout.offsetof(39);
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC = layout.offsetof(40);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS = layout.offsetof(41);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC = layout.offsetof(42);
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES = layout.offsetof(43);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES = layout.offsetof(44);
        MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS = layout.offsetof(45);
        SUPPORTEDDEPTHRESOLVEMODES = layout.offsetof(46);
        SUPPORTEDSTENCILRESOLVEMODES = layout.offsetof(47);
        INDEPENDENTRESOLVENONE = layout.offsetof(48);
        INDEPENDENTRESOLVE = layout.offsetof(49);
        FILTERMINMAXSINGLECOMPONENTFORMATS = layout.offsetof(50);
        FILTERMINMAXIMAGECOMPONENTMAPPING = layout.offsetof(51);
        MAXTIMELINESEMAPHOREVALUEDIFFERENCE = layout.offsetof(52);
        FRAMEBUFFERINTEGERCOLORSAMPLECOUNTS = layout.offsetof(53);
    }

    protected VkPhysicalDeviceVulkan12Properties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVulkan12Properties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVulkan12Properties(address, container);
    }

    public VkPhysicalDeviceVulkan12Properties(ByteBuffer container) {
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

    @NativeType("VkDriverId")
    public int driverID() {
        return ndriverID(address());
    }

    @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
    public ByteBuffer driverName() {
        return ndriverName(address());
    }

    @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
    public String driverNameString() {
        return ndriverNameString(address());
    }

    @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
    public ByteBuffer driverInfo() {
        return ndriverInfo(address());
    }

    @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
    public String driverInfoString() {
        return ndriverInfoString(address());
    }

    public VkConformanceVersion conformanceVersion() {
        return nconformanceVersion(address());
    }

    @NativeType("VkShaderFloatControlsIndependence")
    public int denormBehaviorIndependence() {
        return ndenormBehaviorIndependence(address());
    }

    @NativeType("VkShaderFloatControlsIndependence")
    public int roundingModeIndependence() {
        return nroundingModeIndependence(address());
    }

    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat16() {
        return nshaderSignedZeroInfNanPreserveFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat32() {
        return nshaderSignedZeroInfNanPreserveFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat64() {
        return nshaderSignedZeroInfNanPreserveFloat64(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat16() {
        return nshaderDenormPreserveFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat32() {
        return nshaderDenormPreserveFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat64() {
        return nshaderDenormPreserveFloat64(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat16() {
        return nshaderDenormFlushToZeroFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat32() {
        return nshaderDenormFlushToZeroFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat64() {
        return nshaderDenormFlushToZeroFloat64(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat16() {
        return nshaderRoundingModeRTEFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat32() {
        return nshaderRoundingModeRTEFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat64() {
        return nshaderRoundingModeRTEFloat64(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat16() {
        return nshaderRoundingModeRTZFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat32() {
        return nshaderRoundingModeRTZFloat32(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat64() {
        return nshaderRoundingModeRTZFloat64(address()) != 0;
    }

    @NativeType("uint32_t")
    public int maxUpdateAfterBindDescriptorsInAllPools() {
        return nmaxUpdateAfterBindDescriptorsInAllPools(address());
    }

    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexingNative() {
        return nshaderUniformBufferArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexingNative() {
        return nshaderSampledImageArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexingNative() {
        return nshaderStorageBufferArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexingNative() {
        return nshaderStorageImageArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexingNative() {
        return nshaderInputAttachmentArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean robustBufferAccessUpdateAfterBind() {
        return nrobustBufferAccessUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean quadDivergentImplicitLod() {
        return nquadDivergentImplicitLod(address()) != 0;
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSamplers() {
        return nmaxPerStageDescriptorUpdateAfterBindSamplers(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
        return nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
        return nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() {
        return nmaxPerStageDescriptorUpdateAfterBindSampledImages(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() {
        return nmaxPerStageDescriptorUpdateAfterBindStorageImages(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
        return nmaxPerStageDescriptorUpdateAfterBindInputAttachments(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageUpdateAfterBindResources() {
        return nmaxPerStageUpdateAfterBindResources(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSamplers() {
        return nmaxDescriptorSetUpdateAfterBindSamplers(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() {
        return nmaxDescriptorSetUpdateAfterBindUniformBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
        return nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() {
        return nmaxDescriptorSetUpdateAfterBindStorageBuffers(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
        return nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSampledImages() {
        return nmaxDescriptorSetUpdateAfterBindSampledImages(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageImages() {
        return nmaxDescriptorSetUpdateAfterBindStorageImages(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInputAttachments() {
        return nmaxDescriptorSetUpdateAfterBindInputAttachments(address());
    }

    @NativeType("VkResolveModeFlags")
    public int supportedDepthResolveModes() {
        return nsupportedDepthResolveModes(address());
    }

    @NativeType("VkResolveModeFlags")
    public int supportedStencilResolveModes() {
        return nsupportedStencilResolveModes(address());
    }

    @NativeType("VkBool32")
    public boolean independentResolveNone() {
        return nindependentResolveNone(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean independentResolve() {
        return nindependentResolve(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean filterMinmaxSingleComponentFormats() {
        return nfilterMinmaxSingleComponentFormats(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean filterMinmaxImageComponentMapping() {
        return nfilterMinmaxImageComponentMapping(address()) != 0;
    }

    @NativeType("uint64_t")
    public long maxTimelineSemaphoreValueDifference() {
        return nmaxTimelineSemaphoreValueDifference(address());
    }

    @NativeType("VkSampleCountFlags")
    public int framebufferIntegerColorSampleCounts() {
        return nframebufferIntegerColorSampleCounts(address());
    }

    public VkPhysicalDeviceVulkan12Properties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan12Properties sType$Default() {
        return sType(52);
    }

    public VkPhysicalDeviceVulkan12Properties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan12Properties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceVulkan12Properties set(VkPhysicalDeviceVulkan12Properties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVulkan12Properties malloc() {
        return new VkPhysicalDeviceVulkan12Properties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan12Properties calloc() {
        return new VkPhysicalDeviceVulkan12Properties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan12Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan12Properties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVulkan12Properties create(long address) {
        return new VkPhysicalDeviceVulkan12Properties(address, null);
    }

    public static VkPhysicalDeviceVulkan12Properties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVulkan12Properties(address, null);
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

    public static VkPhysicalDeviceVulkan12Properties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan12Properties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan12Properties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan12Properties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndriverID(long struct) {
        return MemoryUtil.memGetInt(struct + DRIVERID);
    }

    public static ByteBuffer ndriverName(long struct) {
        return MemoryUtil.memByteBuffer(struct + DRIVERNAME, 256);
    }

    public static String ndriverNameString(long struct) {
        return MemoryUtil.memUTF8(struct + DRIVERNAME);
    }

    public static ByteBuffer ndriverInfo(long struct) {
        return MemoryUtil.memByteBuffer(struct + DRIVERINFO, 256);
    }

    public static String ndriverInfoString(long struct) {
        return MemoryUtil.memUTF8(struct + DRIVERINFO);
    }

    public static VkConformanceVersion nconformanceVersion(long struct) {
        return VkConformanceVersion.create(struct + CONFORMANCEVERSION);
    }

    public static int ndenormBehaviorIndependence(long struct) {
        return MemoryUtil.memGetInt(struct + DENORMBEHAVIORINDEPENDENCE);
    }

    public static int nroundingModeIndependence(long struct) {
        return MemoryUtil.memGetInt(struct + ROUNDINGMODEINDEPENDENCE);
    }

    public static int nshaderSignedZeroInfNanPreserveFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSIGNEDZEROINFNANPRESERVEFLOAT16);
    }

    public static int nshaderSignedZeroInfNanPreserveFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSIGNEDZEROINFNANPRESERVEFLOAT32);
    }

    public static int nshaderSignedZeroInfNanPreserveFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSIGNEDZEROINFNANPRESERVEFLOAT64);
    }

    public static int nshaderDenormPreserveFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMPRESERVEFLOAT16);
    }

    public static int nshaderDenormPreserveFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMPRESERVEFLOAT32);
    }

    public static int nshaderDenormPreserveFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMPRESERVEFLOAT64);
    }

    public static int nshaderDenormFlushToZeroFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMFLUSHTOZEROFLOAT16);
    }

    public static int nshaderDenormFlushToZeroFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMFLUSHTOZEROFLOAT32);
    }

    public static int nshaderDenormFlushToZeroFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDENORMFLUSHTOZEROFLOAT64);
    }

    public static int nshaderRoundingModeRTEFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTEFLOAT16);
    }

    public static int nshaderRoundingModeRTEFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTEFLOAT32);
    }

    public static int nshaderRoundingModeRTEFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTEFLOAT64);
    }

    public static int nshaderRoundingModeRTZFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTZFLOAT16);
    }

    public static int nshaderRoundingModeRTZFloat32(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTZFLOAT32);
    }

    public static int nshaderRoundingModeRTZFloat64(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERROUNDINGMODERTZFLOAT64);
    }

    public static int nmaxUpdateAfterBindDescriptorsInAllPools(long struct) {
        return MemoryUtil.memGetInt(struct + MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS);
    }

    public static int nshaderUniformBufferArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nshaderSampledImageArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nshaderStorageBufferArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nshaderStorageImageArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nshaderInputAttachmentArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nrobustBufferAccessUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + ROBUSTBUFFERACCESSUPDATEAFTERBIND);
    }

    public static int nquadDivergentImplicitLod(long struct) {
        return MemoryUtil.memGetInt(struct + QUADDIVERGENTIMPLICITLOD);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindSamplers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindSampledImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindStorageImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindInputAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS);
    }

    public static int nmaxPerStageUpdateAfterBindResources(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEUPDATEAFTERBINDRESOURCES);
    }

    public static int nmaxDescriptorSetUpdateAfterBindSamplers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS);
    }

    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS);
    }

    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS);
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetUpdateAfterBindSampledImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES);
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageImages(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES);
    }

    public static int nmaxDescriptorSetUpdateAfterBindInputAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS);
    }

    public static int nsupportedDepthResolveModes(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDDEPTHRESOLVEMODES);
    }

    public static int nsupportedStencilResolveModes(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDSTENCILRESOLVEMODES);
    }

    public static int nindependentResolveNone(long struct) {
        return MemoryUtil.memGetInt(struct + INDEPENDENTRESOLVENONE);
    }

    public static int nindependentResolve(long struct) {
        return MemoryUtil.memGetInt(struct + INDEPENDENTRESOLVE);
    }

    public static int nfilterMinmaxSingleComponentFormats(long struct) {
        return MemoryUtil.memGetInt(struct + FILTERMINMAXSINGLECOMPONENTFORMATS);
    }

    public static int nfilterMinmaxImageComponentMapping(long struct) {
        return MemoryUtil.memGetInt(struct + FILTERMINMAXIMAGECOMPONENTMAPPING);
    }

    public static long nmaxTimelineSemaphoreValueDifference(long struct) {
        return MemoryUtil.memGetLong(struct + MAXTIMELINESEMAPHOREVALUEDIFFERENCE);
    }

    public static int nframebufferIntegerColorSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMEBUFFERINTEGERCOLORSAMPLECOUNTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Properties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Properties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan12Properties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVulkan12Properties ELEMENT_FACTORY = VkPhysicalDeviceVulkan12Properties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVulkan12Properties.SIZEOF);
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
        public VkPhysicalDeviceVulkan12Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVulkan12Properties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVulkan12Properties.npNext(address());
        }

        @NativeType("VkDriverId")
        public int driverID() {
            return VkPhysicalDeviceVulkan12Properties.ndriverID(address());
        }

        @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
        public ByteBuffer driverName() {
            return VkPhysicalDeviceVulkan12Properties.ndriverName(address());
        }

        @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
        public String driverNameString() {
            return VkPhysicalDeviceVulkan12Properties.ndriverNameString(address());
        }

        @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
        public ByteBuffer driverInfo() {
            return VkPhysicalDeviceVulkan12Properties.ndriverInfo(address());
        }

        @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
        public String driverInfoString() {
            return VkPhysicalDeviceVulkan12Properties.ndriverInfoString(address());
        }

        public VkConformanceVersion conformanceVersion() {
            return VkPhysicalDeviceVulkan12Properties.nconformanceVersion(address());
        }

        @NativeType("VkShaderFloatControlsIndependence")
        public int denormBehaviorIndependence() {
            return VkPhysicalDeviceVulkan12Properties.ndenormBehaviorIndependence(address());
        }

        @NativeType("VkShaderFloatControlsIndependence")
        public int roundingModeIndependence() {
            return VkPhysicalDeviceVulkan12Properties.nroundingModeIndependence(address());
        }

        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat16() {
            return VkPhysicalDeviceVulkan12Properties.nshaderSignedZeroInfNanPreserveFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat32() {
            return VkPhysicalDeviceVulkan12Properties.nshaderSignedZeroInfNanPreserveFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat64() {
            return VkPhysicalDeviceVulkan12Properties.nshaderSignedZeroInfNanPreserveFloat64(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat16() {
            return VkPhysicalDeviceVulkan12Properties.nshaderDenormPreserveFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat32() {
            return VkPhysicalDeviceVulkan12Properties.nshaderDenormPreserveFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat64() {
            return VkPhysicalDeviceVulkan12Properties.nshaderDenormPreserveFloat64(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat16() {
            return VkPhysicalDeviceVulkan12Properties.nshaderDenormFlushToZeroFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat32() {
            return VkPhysicalDeviceVulkan12Properties.nshaderDenormFlushToZeroFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat64() {
            return VkPhysicalDeviceVulkan12Properties.nshaderDenormFlushToZeroFloat64(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat16() {
            return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTEFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat32() {
            return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTEFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat64() {
            return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTEFloat64(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat16() {
            return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTZFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat32() {
            return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTZFloat32(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat64() {
            return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTZFloat64(address()) != 0;
        }

        @NativeType("uint32_t")
        public int maxUpdateAfterBindDescriptorsInAllPools() {
            return VkPhysicalDeviceVulkan12Properties.nmaxUpdateAfterBindDescriptorsInAllPools(address());
        }

        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceVulkan12Properties.nshaderUniformBufferArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceVulkan12Properties.nshaderSampledImageArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceVulkan12Properties.nshaderStorageBufferArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceVulkan12Properties.nshaderStorageImageArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceVulkan12Properties.nshaderInputAttachmentArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean robustBufferAccessUpdateAfterBind() {
            return VkPhysicalDeviceVulkan12Properties.nrobustBufferAccessUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean quadDivergentImplicitLod() {
            return VkPhysicalDeviceVulkan12Properties.nquadDivergentImplicitLod(address()) != 0;
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSamplers() {
            return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindSamplers(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
            return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
            return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSampledImages() {
            return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindSampledImages(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageImages() {
            return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindStorageImages(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
            return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindInputAttachments(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageUpdateAfterBindResources() {
            return VkPhysicalDeviceVulkan12Properties.nmaxPerStageUpdateAfterBindResources(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSamplers() {
            return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindSamplers(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffers() {
            return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindUniformBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
            return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffers() {
            return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindStorageBuffers(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
            return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSampledImages() {
            return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindSampledImages(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageImages() {
            return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindStorageImages(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInputAttachments() {
            return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindInputAttachments(address());
        }

        @NativeType("VkResolveModeFlags")
        public int supportedDepthResolveModes() {
            return VkPhysicalDeviceVulkan12Properties.nsupportedDepthResolveModes(address());
        }

        @NativeType("VkResolveModeFlags")
        public int supportedStencilResolveModes() {
            return VkPhysicalDeviceVulkan12Properties.nsupportedStencilResolveModes(address());
        }

        @NativeType("VkBool32")
        public boolean independentResolveNone() {
            return VkPhysicalDeviceVulkan12Properties.nindependentResolveNone(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean independentResolve() {
            return VkPhysicalDeviceVulkan12Properties.nindependentResolve(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean filterMinmaxSingleComponentFormats() {
            return VkPhysicalDeviceVulkan12Properties.nfilterMinmaxSingleComponentFormats(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean filterMinmaxImageComponentMapping() {
            return VkPhysicalDeviceVulkan12Properties.nfilterMinmaxImageComponentMapping(address()) != 0;
        }

        @NativeType("uint64_t")
        public long maxTimelineSemaphoreValueDifference() {
            return VkPhysicalDeviceVulkan12Properties.nmaxTimelineSemaphoreValueDifference(address());
        }

        @NativeType("VkSampleCountFlags")
        public int framebufferIntegerColorSampleCounts() {
            return VkPhysicalDeviceVulkan12Properties.nframebufferIntegerColorSampleCounts(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVulkan12Properties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(52);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVulkan12Properties.npNext(address(), value);
            return this;
        }
    }
}
