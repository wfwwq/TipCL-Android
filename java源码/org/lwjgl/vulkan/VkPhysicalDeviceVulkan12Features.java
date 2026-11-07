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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Features.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Features.class */
public class VkPhysicalDeviceVulkan12Features extends Struct<VkPhysicalDeviceVulkan12Features> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SAMPLERMIRRORCLAMPTOEDGE;
    public static final int DRAWINDIRECTCOUNT;
    public static final int STORAGEBUFFER8BITACCESS;
    public static final int UNIFORMANDSTORAGEBUFFER8BITACCESS;
    public static final int STORAGEPUSHCONSTANT8;
    public static final int SHADERBUFFERINT64ATOMICS;
    public static final int SHADERSHAREDINT64ATOMICS;
    public static final int SHADERFLOAT16;
    public static final int SHADERINT8;
    public static final int DESCRIPTORINDEXING;
    public static final int SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING;
    public static final int SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING;
    public static final int SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING;
    public static final int SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING;
    public static final int SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING;
    public static final int SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING;
    public static final int SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING;
    public static final int SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING;
    public static final int SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING;
    public static final int SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING;
    public static final int DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND;
    public static final int DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING;
    public static final int DESCRIPTORBINDINGPARTIALLYBOUND;
    public static final int DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT;
    public static final int RUNTIMEDESCRIPTORARRAY;
    public static final int SAMPLERFILTERMINMAX;
    public static final int SCALARBLOCKLAYOUT;
    public static final int IMAGELESSFRAMEBUFFER;
    public static final int UNIFORMBUFFERSTANDARDLAYOUT;
    public static final int SHADERSUBGROUPEXTENDEDTYPES;
    public static final int SEPARATEDEPTHSTENCILLAYOUTS;
    public static final int HOSTQUERYRESET;
    public static final int TIMELINESEMAPHORE;
    public static final int BUFFERDEVICEADDRESS;
    public static final int BUFFERDEVICEADDRESSCAPTUREREPLAY;
    public static final int BUFFERDEVICEADDRESSMULTIDEVICE;
    public static final int VULKANMEMORYMODEL;
    public static final int VULKANMEMORYMODELDEVICESCOPE;
    public static final int VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS;
    public static final int SHADEROUTPUTVIEWPORTINDEX;
    public static final int SHADEROUTPUTLAYER;
    public static final int SUBGROUPBROADCASTDYNAMICID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLERMIRRORCLAMPTOEDGE = layout.offsetof(2);
        DRAWINDIRECTCOUNT = layout.offsetof(3);
        STORAGEBUFFER8BITACCESS = layout.offsetof(4);
        UNIFORMANDSTORAGEBUFFER8BITACCESS = layout.offsetof(5);
        STORAGEPUSHCONSTANT8 = layout.offsetof(6);
        SHADERBUFFERINT64ATOMICS = layout.offsetof(7);
        SHADERSHAREDINT64ATOMICS = layout.offsetof(8);
        SHADERFLOAT16 = layout.offsetof(9);
        SHADERINT8 = layout.offsetof(10);
        DESCRIPTORINDEXING = layout.offsetof(11);
        SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING = layout.offsetof(12);
        SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING = layout.offsetof(13);
        SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING = layout.offsetof(14);
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(15);
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING = layout.offsetof(16);
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(17);
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING = layout.offsetof(18);
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING = layout.offsetof(19);
        SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(20);
        SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(21);
        DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND = layout.offsetof(22);
        DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND = layout.offsetof(23);
        DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND = layout.offsetof(24);
        DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND = layout.offsetof(25);
        DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND = layout.offsetof(26);
        DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND = layout.offsetof(27);
        DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING = layout.offsetof(28);
        DESCRIPTORBINDINGPARTIALLYBOUND = layout.offsetof(29);
        DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT = layout.offsetof(30);
        RUNTIMEDESCRIPTORARRAY = layout.offsetof(31);
        SAMPLERFILTERMINMAX = layout.offsetof(32);
        SCALARBLOCKLAYOUT = layout.offsetof(33);
        IMAGELESSFRAMEBUFFER = layout.offsetof(34);
        UNIFORMBUFFERSTANDARDLAYOUT = layout.offsetof(35);
        SHADERSUBGROUPEXTENDEDTYPES = layout.offsetof(36);
        SEPARATEDEPTHSTENCILLAYOUTS = layout.offsetof(37);
        HOSTQUERYRESET = layout.offsetof(38);
        TIMELINESEMAPHORE = layout.offsetof(39);
        BUFFERDEVICEADDRESS = layout.offsetof(40);
        BUFFERDEVICEADDRESSCAPTUREREPLAY = layout.offsetof(41);
        BUFFERDEVICEADDRESSMULTIDEVICE = layout.offsetof(42);
        VULKANMEMORYMODEL = layout.offsetof(43);
        VULKANMEMORYMODELDEVICESCOPE = layout.offsetof(44);
        VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS = layout.offsetof(45);
        SHADEROUTPUTVIEWPORTINDEX = layout.offsetof(46);
        SHADEROUTPUTLAYER = layout.offsetof(47);
        SUBGROUPBROADCASTDYNAMICID = layout.offsetof(48);
    }

    protected VkPhysicalDeviceVulkan12Features(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVulkan12Features create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVulkan12Features(address, container);
    }

    public VkPhysicalDeviceVulkan12Features(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean samplerMirrorClampToEdge() {
        return nsamplerMirrorClampToEdge(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean drawIndirectCount() {
        return ndrawIndirectCount(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean storageBuffer8BitAccess() {
        return nstorageBuffer8BitAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer8BitAccess() {
        return nuniformAndStorageBuffer8BitAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean storagePushConstant8() {
        return nstoragePushConstant8(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderBufferInt64Atomics() {
        return nshaderBufferInt64Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedInt64Atomics() {
        return nshaderSharedInt64Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderFloat16() {
        return nshaderFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderInt8() {
        return nshaderInt8(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorIndexing() {
        return ndescriptorIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayDynamicIndexing() {
        return nshaderInputAttachmentArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayDynamicIndexing() {
        return nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayDynamicIndexing() {
        return nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexing() {
        return nshaderUniformBufferArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexing() {
        return nshaderSampledImageArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexing() {
        return nshaderStorageBufferArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexing() {
        return nshaderStorageImageArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexing() {
        return nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayNonUniformIndexing() {
        return nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayNonUniformIndexing() {
        return nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingUniformBufferUpdateAfterBind() {
        return ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingSampledImageUpdateAfterBind() {
        return ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingStorageImageUpdateAfterBind() {
        return ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingStorageBufferUpdateAfterBind() {
        return ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() {
        return ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() {
        return ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingUpdateUnusedWhilePending() {
        return ndescriptorBindingUpdateUnusedWhilePending(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingPartiallyBound() {
        return ndescriptorBindingPartiallyBound(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingVariableDescriptorCount() {
        return ndescriptorBindingVariableDescriptorCount(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean runtimeDescriptorArray() {
        return nruntimeDescriptorArray(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean samplerFilterMinmax() {
        return nsamplerFilterMinmax(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean scalarBlockLayout() {
        return nscalarBlockLayout(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean imagelessFramebuffer() {
        return nimagelessFramebuffer(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean uniformBufferStandardLayout() {
        return nuniformBufferStandardLayout(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSubgroupExtendedTypes() {
        return nshaderSubgroupExtendedTypes(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean separateDepthStencilLayouts() {
        return nseparateDepthStencilLayouts(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean hostQueryReset() {
        return nhostQueryReset(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean timelineSemaphore() {
        return ntimelineSemaphore(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean bufferDeviceAddress() {
        return nbufferDeviceAddress(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean bufferDeviceAddressCaptureReplay() {
        return nbufferDeviceAddressCaptureReplay(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean bufferDeviceAddressMultiDevice() {
        return nbufferDeviceAddressMultiDevice(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean vulkanMemoryModel() {
        return nvulkanMemoryModel(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean vulkanMemoryModelDeviceScope() {
        return nvulkanMemoryModelDeviceScope(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean vulkanMemoryModelAvailabilityVisibilityChains() {
        return nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderOutputViewportIndex() {
        return nshaderOutputViewportIndex(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderOutputLayer() {
        return nshaderOutputLayer(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean subgroupBroadcastDynamicId() {
        return nsubgroupBroadcastDynamicId(address()) != 0;
    }

    public VkPhysicalDeviceVulkan12Features sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features sType$Default() {
        return sType(51);
    }

    public VkPhysicalDeviceVulkan12Features pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdge(@NativeType("VkBool32") boolean value) {
        nsamplerMirrorClampToEdge(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features drawIndirectCount(@NativeType("VkBool32") boolean value) {
        ndrawIndirectCount(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) {
        nstorageBuffer8BitAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) {
        nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features storagePushConstant8(@NativeType("VkBool32") boolean value) {
        nstoragePushConstant8(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) {
        nshaderBufferInt64Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) {
        nshaderSharedInt64Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderFloat16(@NativeType("VkBool32") boolean value) {
        nshaderFloat16(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderInt8(@NativeType("VkBool32") boolean value) {
        nshaderInt8(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features descriptorIndexing(@NativeType("VkBool32") boolean value) {
        ndescriptorIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingPartiallyBound(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features runtimeDescriptorArray(@NativeType("VkBool32") boolean value) {
        nruntimeDescriptorArray(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features samplerFilterMinmax(@NativeType("VkBool32") boolean value) {
        nsamplerFilterMinmax(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features scalarBlockLayout(@NativeType("VkBool32") boolean value) {
        nscalarBlockLayout(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features imagelessFramebuffer(@NativeType("VkBool32") boolean value) {
        nimagelessFramebuffer(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) {
        nuniformBufferStandardLayout(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupExtendedTypes(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features separateDepthStencilLayouts(@NativeType("VkBool32") boolean value) {
        nseparateDepthStencilLayouts(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features hostQueryReset(@NativeType("VkBool32") boolean value) {
        nhostQueryReset(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features timelineSemaphore(@NativeType("VkBool32") boolean value) {
        ntimelineSemaphore(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features bufferDeviceAddress(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddress(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features vulkanMemoryModel(@NativeType("VkBool32") boolean value) {
        nvulkanMemoryModel(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) {
        nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) {
        nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderOutputViewportIndex(@NativeType("VkBool32") boolean value) {
        nshaderOutputViewportIndex(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features shaderOutputLayer(@NativeType("VkBool32") boolean value) {
        nshaderOutputLayer(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicId(@NativeType("VkBool32") boolean value) {
        nsubgroupBroadcastDynamicId(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features set(int sType, long pNext, boolean samplerMirrorClampToEdge, boolean drawIndirectCount, boolean storageBuffer8BitAccess, boolean uniformAndStorageBuffer8BitAccess, boolean storagePushConstant8, boolean shaderBufferInt64Atomics, boolean shaderSharedInt64Atomics, boolean shaderFloat16, boolean shaderInt8, boolean descriptorIndexing, boolean shaderInputAttachmentArrayDynamicIndexing, boolean shaderUniformTexelBufferArrayDynamicIndexing, boolean shaderStorageTexelBufferArrayDynamicIndexing, boolean shaderUniformBufferArrayNonUniformIndexing, boolean shaderSampledImageArrayNonUniformIndexing, boolean shaderStorageBufferArrayNonUniformIndexing, boolean shaderStorageImageArrayNonUniformIndexing, boolean shaderInputAttachmentArrayNonUniformIndexing, boolean shaderUniformTexelBufferArrayNonUniformIndexing, boolean shaderStorageTexelBufferArrayNonUniformIndexing, boolean descriptorBindingUniformBufferUpdateAfterBind, boolean descriptorBindingSampledImageUpdateAfterBind, boolean descriptorBindingStorageImageUpdateAfterBind, boolean descriptorBindingStorageBufferUpdateAfterBind, boolean descriptorBindingUniformTexelBufferUpdateAfterBind, boolean descriptorBindingStorageTexelBufferUpdateAfterBind, boolean descriptorBindingUpdateUnusedWhilePending, boolean descriptorBindingPartiallyBound, boolean descriptorBindingVariableDescriptorCount, boolean runtimeDescriptorArray, boolean samplerFilterMinmax, boolean scalarBlockLayout, boolean imagelessFramebuffer, boolean uniformBufferStandardLayout, boolean shaderSubgroupExtendedTypes, boolean separateDepthStencilLayouts, boolean hostQueryReset, boolean timelineSemaphore, boolean bufferDeviceAddress, boolean bufferDeviceAddressCaptureReplay, boolean bufferDeviceAddressMultiDevice, boolean vulkanMemoryModel, boolean vulkanMemoryModelDeviceScope, boolean vulkanMemoryModelAvailabilityVisibilityChains, boolean shaderOutputViewportIndex, boolean shaderOutputLayer, boolean subgroupBroadcastDynamicId) {
        sType(sType);
        pNext(pNext);
        samplerMirrorClampToEdge(samplerMirrorClampToEdge);
        drawIndirectCount(drawIndirectCount);
        storageBuffer8BitAccess(storageBuffer8BitAccess);
        uniformAndStorageBuffer8BitAccess(uniformAndStorageBuffer8BitAccess);
        storagePushConstant8(storagePushConstant8);
        shaderBufferInt64Atomics(shaderBufferInt64Atomics);
        shaderSharedInt64Atomics(shaderSharedInt64Atomics);
        shaderFloat16(shaderFloat16);
        shaderInt8(shaderInt8);
        descriptorIndexing(descriptorIndexing);
        shaderInputAttachmentArrayDynamicIndexing(shaderInputAttachmentArrayDynamicIndexing);
        shaderUniformTexelBufferArrayDynamicIndexing(shaderUniformTexelBufferArrayDynamicIndexing);
        shaderStorageTexelBufferArrayDynamicIndexing(shaderStorageTexelBufferArrayDynamicIndexing);
        shaderUniformBufferArrayNonUniformIndexing(shaderUniformBufferArrayNonUniformIndexing);
        shaderSampledImageArrayNonUniformIndexing(shaderSampledImageArrayNonUniformIndexing);
        shaderStorageBufferArrayNonUniformIndexing(shaderStorageBufferArrayNonUniformIndexing);
        shaderStorageImageArrayNonUniformIndexing(shaderStorageImageArrayNonUniformIndexing);
        shaderInputAttachmentArrayNonUniformIndexing(shaderInputAttachmentArrayNonUniformIndexing);
        shaderUniformTexelBufferArrayNonUniformIndexing(shaderUniformTexelBufferArrayNonUniformIndexing);
        shaderStorageTexelBufferArrayNonUniformIndexing(shaderStorageTexelBufferArrayNonUniformIndexing);
        descriptorBindingUniformBufferUpdateAfterBind(descriptorBindingUniformBufferUpdateAfterBind);
        descriptorBindingSampledImageUpdateAfterBind(descriptorBindingSampledImageUpdateAfterBind);
        descriptorBindingStorageImageUpdateAfterBind(descriptorBindingStorageImageUpdateAfterBind);
        descriptorBindingStorageBufferUpdateAfterBind(descriptorBindingStorageBufferUpdateAfterBind);
        descriptorBindingUniformTexelBufferUpdateAfterBind(descriptorBindingUniformTexelBufferUpdateAfterBind);
        descriptorBindingStorageTexelBufferUpdateAfterBind(descriptorBindingStorageTexelBufferUpdateAfterBind);
        descriptorBindingUpdateUnusedWhilePending(descriptorBindingUpdateUnusedWhilePending);
        descriptorBindingPartiallyBound(descriptorBindingPartiallyBound);
        descriptorBindingVariableDescriptorCount(descriptorBindingVariableDescriptorCount);
        runtimeDescriptorArray(runtimeDescriptorArray);
        samplerFilterMinmax(samplerFilterMinmax);
        scalarBlockLayout(scalarBlockLayout);
        imagelessFramebuffer(imagelessFramebuffer);
        uniformBufferStandardLayout(uniformBufferStandardLayout);
        shaderSubgroupExtendedTypes(shaderSubgroupExtendedTypes);
        separateDepthStencilLayouts(separateDepthStencilLayouts);
        hostQueryReset(hostQueryReset);
        timelineSemaphore(timelineSemaphore);
        bufferDeviceAddress(bufferDeviceAddress);
        bufferDeviceAddressCaptureReplay(bufferDeviceAddressCaptureReplay);
        bufferDeviceAddressMultiDevice(bufferDeviceAddressMultiDevice);
        vulkanMemoryModel(vulkanMemoryModel);
        vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope);
        vulkanMemoryModelAvailabilityVisibilityChains(vulkanMemoryModelAvailabilityVisibilityChains);
        shaderOutputViewportIndex(shaderOutputViewportIndex);
        shaderOutputLayer(shaderOutputLayer);
        subgroupBroadcastDynamicId(subgroupBroadcastDynamicId);
        return this;
    }

    public VkPhysicalDeviceVulkan12Features set(VkPhysicalDeviceVulkan12Features src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVulkan12Features malloc() {
        return new VkPhysicalDeviceVulkan12Features(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan12Features calloc() {
        return new VkPhysicalDeviceVulkan12Features(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan12Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan12Features(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVulkan12Features create(long address) {
        return new VkPhysicalDeviceVulkan12Features(address, null);
    }

    public static VkPhysicalDeviceVulkan12Features createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVulkan12Features(address, null);
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

    public static VkPhysicalDeviceVulkan12Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan12Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan12Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan12Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsamplerMirrorClampToEdge(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERMIRRORCLAMPTOEDGE);
    }

    public static int ndrawIndirectCount(long struct) {
        return MemoryUtil.memGetInt(struct + DRAWINDIRECTCOUNT);
    }

    public static int nstorageBuffer8BitAccess(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEBUFFER8BITACCESS);
    }

    public static int nuniformAndStorageBuffer8BitAccess(long struct) {
        return MemoryUtil.memGetInt(struct + UNIFORMANDSTORAGEBUFFER8BITACCESS);
    }

    public static int nstoragePushConstant8(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEPUSHCONSTANT8);
    }

    public static int nshaderBufferInt64Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERINT64ATOMICS);
    }

    public static int nshaderSharedInt64Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDINT64ATOMICS);
    }

    public static int nshaderFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFLOAT16);
    }

    public static int nshaderInt8(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINT8);
    }

    public static int ndescriptorIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORINDEXING);
    }

    public static int nshaderInputAttachmentArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING);
    }

    public static int nshaderUniformTexelBufferArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING);
    }

    public static int nshaderStorageTexelBufferArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING);
    }

    public static int nshaderUniformBufferArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderSampledImageArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderStorageBufferArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderStorageImageArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderInputAttachmentArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderUniformTexelBufferArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING);
    }

    public static int nshaderStorageTexelBufferArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING);
    }

    public static int ndescriptorBindingUniformBufferUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingSampledImageUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingStorageImageUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingStorageBufferUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND);
    }

    public static int ndescriptorBindingUpdateUnusedWhilePending(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING);
    }

    public static int ndescriptorBindingPartiallyBound(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGPARTIALLYBOUND);
    }

    public static int ndescriptorBindingVariableDescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT);
    }

    public static int nruntimeDescriptorArray(long struct) {
        return MemoryUtil.memGetInt(struct + RUNTIMEDESCRIPTORARRAY);
    }

    public static int nsamplerFilterMinmax(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERFILTERMINMAX);
    }

    public static int nscalarBlockLayout(long struct) {
        return MemoryUtil.memGetInt(struct + SCALARBLOCKLAYOUT);
    }

    public static int nimagelessFramebuffer(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGELESSFRAMEBUFFER);
    }

    public static int nuniformBufferStandardLayout(long struct) {
        return MemoryUtil.memGetInt(struct + UNIFORMBUFFERSTANDARDLAYOUT);
    }

    public static int nshaderSubgroupExtendedTypes(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSUBGROUPEXTENDEDTYPES);
    }

    public static int nseparateDepthStencilLayouts(long struct) {
        return MemoryUtil.memGetInt(struct + SEPARATEDEPTHSTENCILLAYOUTS);
    }

    public static int nhostQueryReset(long struct) {
        return MemoryUtil.memGetInt(struct + HOSTQUERYRESET);
    }

    public static int ntimelineSemaphore(long struct) {
        return MemoryUtil.memGetInt(struct + TIMELINESEMAPHORE);
    }

    public static int nbufferDeviceAddress(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERDEVICEADDRESS);
    }

    public static int nbufferDeviceAddressCaptureReplay(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERDEVICEADDRESSCAPTUREREPLAY);
    }

    public static int nbufferDeviceAddressMultiDevice(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERDEVICEADDRESSMULTIDEVICE);
    }

    public static int nvulkanMemoryModel(long struct) {
        return MemoryUtil.memGetInt(struct + VULKANMEMORYMODEL);
    }

    public static int nvulkanMemoryModelDeviceScope(long struct) {
        return MemoryUtil.memGetInt(struct + VULKANMEMORYMODELDEVICESCOPE);
    }

    public static int nvulkanMemoryModelAvailabilityVisibilityChains(long struct) {
        return MemoryUtil.memGetInt(struct + VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS);
    }

    public static int nshaderOutputViewportIndex(long struct) {
        return MemoryUtil.memGetInt(struct + SHADEROUTPUTVIEWPORTINDEX);
    }

    public static int nshaderOutputLayer(long struct) {
        return MemoryUtil.memGetInt(struct + SHADEROUTPUTLAYER);
    }

    public static int nsubgroupBroadcastDynamicId(long struct) {
        return MemoryUtil.memGetInt(struct + SUBGROUPBROADCASTDYNAMICID);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsamplerMirrorClampToEdge(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERMIRRORCLAMPTOEDGE, value);
    }

    public static void ndrawIndirectCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DRAWINDIRECTCOUNT, value);
    }

    public static void nstorageBuffer8BitAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEBUFFER8BITACCESS, value);
    }

    public static void nuniformAndStorageBuffer8BitAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNIFORMANDSTORAGEBUFFER8BITACCESS, value);
    }

    public static void nstoragePushConstant8(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEPUSHCONSTANT8, value);
    }

    public static void nshaderBufferInt64Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERINT64ATOMICS, value);
    }

    public static void nshaderSharedInt64Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDINT64ATOMICS, value);
    }

    public static void nshaderFloat16(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFLOAT16, value);
    }

    public static void nshaderInt8(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINT8, value);
    }

    public static void ndescriptorIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORINDEXING, value);
    }

    public static void nshaderInputAttachmentArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderUniformTexelBufferArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderStorageTexelBufferArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderUniformBufferArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderSampledImageArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderStorageBufferArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderStorageImageArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderInputAttachmentArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderUniformTexelBufferArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING, value);
    }

    public static void nshaderStorageTexelBufferArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING, value);
    }

    public static void ndescriptorBindingUniformBufferUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingSampledImageUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingStorageImageUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingStorageBufferUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND, value);
    }

    public static void ndescriptorBindingUpdateUnusedWhilePending(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING, value);
    }

    public static void ndescriptorBindingPartiallyBound(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGPARTIALLYBOUND, value);
    }

    public static void ndescriptorBindingVariableDescriptorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT, value);
    }

    public static void nruntimeDescriptorArray(long struct, int value) {
        MemoryUtil.memPutInt(struct + RUNTIMEDESCRIPTORARRAY, value);
    }

    public static void nsamplerFilterMinmax(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERFILTERMINMAX, value);
    }

    public static void nscalarBlockLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + SCALARBLOCKLAYOUT, value);
    }

    public static void nimagelessFramebuffer(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGELESSFRAMEBUFFER, value);
    }

    public static void nuniformBufferStandardLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNIFORMBUFFERSTANDARDLAYOUT, value);
    }

    public static void nshaderSubgroupExtendedTypes(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSUBGROUPEXTENDEDTYPES, value);
    }

    public static void nseparateDepthStencilLayouts(long struct, int value) {
        MemoryUtil.memPutInt(struct + SEPARATEDEPTHSTENCILLAYOUTS, value);
    }

    public static void nhostQueryReset(long struct, int value) {
        MemoryUtil.memPutInt(struct + HOSTQUERYRESET, value);
    }

    public static void ntimelineSemaphore(long struct, int value) {
        MemoryUtil.memPutInt(struct + TIMELINESEMAPHORE, value);
    }

    public static void nbufferDeviceAddress(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERDEVICEADDRESS, value);
    }

    public static void nbufferDeviceAddressCaptureReplay(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERDEVICEADDRESSCAPTUREREPLAY, value);
    }

    public static void nbufferDeviceAddressMultiDevice(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERDEVICEADDRESSMULTIDEVICE, value);
    }

    public static void nvulkanMemoryModel(long struct, int value) {
        MemoryUtil.memPutInt(struct + VULKANMEMORYMODEL, value);
    }

    public static void nvulkanMemoryModelDeviceScope(long struct, int value) {
        MemoryUtil.memPutInt(struct + VULKANMEMORYMODELDEVICESCOPE, value);
    }

    public static void nvulkanMemoryModelAvailabilityVisibilityChains(long struct, int value) {
        MemoryUtil.memPutInt(struct + VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS, value);
    }

    public static void nshaderOutputViewportIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADEROUTPUTVIEWPORTINDEX, value);
    }

    public static void nshaderOutputLayer(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADEROUTPUTLAYER, value);
    }

    public static void nsubgroupBroadcastDynamicId(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBGROUPBROADCASTDYNAMICID, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Features$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Features$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan12Features, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVulkan12Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan12Features.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVulkan12Features.SIZEOF);
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
        public VkPhysicalDeviceVulkan12Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVulkan12Features.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVulkan12Features.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean samplerMirrorClampToEdge() {
            return VkPhysicalDeviceVulkan12Features.nsamplerMirrorClampToEdge(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean drawIndirectCount() {
            return VkPhysicalDeviceVulkan12Features.ndrawIndirectCount(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean storageBuffer8BitAccess() {
            return VkPhysicalDeviceVulkan12Features.nstorageBuffer8BitAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer8BitAccess() {
            return VkPhysicalDeviceVulkan12Features.nuniformAndStorageBuffer8BitAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean storagePushConstant8() {
            return VkPhysicalDeviceVulkan12Features.nstoragePushConstant8(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderBufferInt64Atomics() {
            return VkPhysicalDeviceVulkan12Features.nshaderBufferInt64Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedInt64Atomics() {
            return VkPhysicalDeviceVulkan12Features.nshaderSharedInt64Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderFloat16() {
            return VkPhysicalDeviceVulkan12Features.nshaderFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderInt8() {
            return VkPhysicalDeviceVulkan12Features.nshaderInt8(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorIndexing() {
            return VkPhysicalDeviceVulkan12Features.ndescriptorIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayDynamicIndexing() {
            return VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayDynamicIndexing() {
            return VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayDynamicIndexing() {
            return VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexing() {
            return VkPhysicalDeviceVulkan12Features.nshaderUniformBufferArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexing() {
            return VkPhysicalDeviceVulkan12Features.nshaderSampledImageArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexing() {
            return VkPhysicalDeviceVulkan12Features.nshaderStorageBufferArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexing() {
            return VkPhysicalDeviceVulkan12Features.nshaderStorageImageArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexing() {
            return VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayNonUniformIndexing() {
            return VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayNonUniformIndexing() {
            return VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingUniformBufferUpdateAfterBind() {
            return VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingSampledImageUpdateAfterBind() {
            return VkPhysicalDeviceVulkan12Features.ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingStorageImageUpdateAfterBind() {
            return VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingStorageBufferUpdateAfterBind() {
            return VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() {
            return VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() {
            return VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingUpdateUnusedWhilePending() {
            return VkPhysicalDeviceVulkan12Features.ndescriptorBindingUpdateUnusedWhilePending(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingPartiallyBound() {
            return VkPhysicalDeviceVulkan12Features.ndescriptorBindingPartiallyBound(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingVariableDescriptorCount() {
            return VkPhysicalDeviceVulkan12Features.ndescriptorBindingVariableDescriptorCount(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean runtimeDescriptorArray() {
            return VkPhysicalDeviceVulkan12Features.nruntimeDescriptorArray(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean samplerFilterMinmax() {
            return VkPhysicalDeviceVulkan12Features.nsamplerFilterMinmax(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean scalarBlockLayout() {
            return VkPhysicalDeviceVulkan12Features.nscalarBlockLayout(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean imagelessFramebuffer() {
            return VkPhysicalDeviceVulkan12Features.nimagelessFramebuffer(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean uniformBufferStandardLayout() {
            return VkPhysicalDeviceVulkan12Features.nuniformBufferStandardLayout(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSubgroupExtendedTypes() {
            return VkPhysicalDeviceVulkan12Features.nshaderSubgroupExtendedTypes(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean separateDepthStencilLayouts() {
            return VkPhysicalDeviceVulkan12Features.nseparateDepthStencilLayouts(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean hostQueryReset() {
            return VkPhysicalDeviceVulkan12Features.nhostQueryReset(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean timelineSemaphore() {
            return VkPhysicalDeviceVulkan12Features.ntimelineSemaphore(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bufferDeviceAddress() {
            return VkPhysicalDeviceVulkan12Features.nbufferDeviceAddress(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bufferDeviceAddressCaptureReplay() {
            return VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressCaptureReplay(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bufferDeviceAddressMultiDevice() {
            return VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressMultiDevice(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean vulkanMemoryModel() {
            return VkPhysicalDeviceVulkan12Features.nvulkanMemoryModel(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean vulkanMemoryModelDeviceScope() {
            return VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelDeviceScope(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean vulkanMemoryModelAvailabilityVisibilityChains() {
            return VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderOutputViewportIndex() {
            return VkPhysicalDeviceVulkan12Features.nshaderOutputViewportIndex(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderOutputLayer() {
            return VkPhysicalDeviceVulkan12Features.nshaderOutputLayer(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean subgroupBroadcastDynamicId() {
            return VkPhysicalDeviceVulkan12Features.nsubgroupBroadcastDynamicId(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVulkan12Features.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(51);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVulkan12Features.npNext(address(), value);
            return this;
        }

        public Buffer samplerMirrorClampToEdge(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nsamplerMirrorClampToEdge(address(), value ? 1 : 0);
            return this;
        }

        public Buffer drawIndirectCount(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndrawIndirectCount(address(), value ? 1 : 0);
            return this;
        }

        public Buffer storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nstorageBuffer8BitAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer storagePushConstant8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nstoragePushConstant8(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderBufferInt64Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderSharedInt64Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderFloat16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderFloat16(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderInt8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderInt8(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndescriptorIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndescriptorBindingPartiallyBound(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0);
            return this;
        }

        public Buffer runtimeDescriptorArray(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nruntimeDescriptorArray(address(), value ? 1 : 0);
            return this;
        }

        public Buffer samplerFilterMinmax(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nsamplerFilterMinmax(address(), value ? 1 : 0);
            return this;
        }

        public Buffer scalarBlockLayout(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nscalarBlockLayout(address(), value ? 1 : 0);
            return this;
        }

        public Buffer imagelessFramebuffer(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nimagelessFramebuffer(address(), value ? 1 : 0);
            return this;
        }

        public Buffer uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nuniformBufferStandardLayout(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderSubgroupExtendedTypes(address(), value ? 1 : 0);
            return this;
        }

        public Buffer separateDepthStencilLayouts(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nseparateDepthStencilLayouts(address(), value ? 1 : 0);
            return this;
        }

        public Buffer hostQueryReset(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nhostQueryReset(address(), value ? 1 : 0);
            return this;
        }

        public Buffer timelineSemaphore(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.ntimelineSemaphore(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nbufferDeviceAddress(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vulkanMemoryModel(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nvulkanMemoryModel(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderOutputViewportIndex(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderOutputViewportIndex(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderOutputLayer(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nshaderOutputLayer(address(), value ? 1 : 0);
            return this;
        }

        public Buffer subgroupBroadcastDynamicId(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan12Features.nsubgroupBroadcastDynamicId(address(), value ? 1 : 0);
            return this;
        }
    }
}
