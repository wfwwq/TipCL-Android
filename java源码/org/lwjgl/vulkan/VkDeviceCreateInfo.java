package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkDeviceQueueCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceCreateInfo.class */
public class VkDeviceCreateInfo extends Struct<VkDeviceCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int QUEUECREATEINFOCOUNT;
    public static final int PQUEUECREATEINFOS;
    public static final int ENABLEDLAYERCOUNT;
    public static final int PPENABLEDLAYERNAMES;
    public static final int ENABLEDEXTENSIONCOUNT;
    public static final int PPENABLEDEXTENSIONNAMES;
    public static final int PENABLEDFEATURES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        QUEUECREATEINFOCOUNT = layout.offsetof(3);
        PQUEUECREATEINFOS = layout.offsetof(4);
        ENABLEDLAYERCOUNT = layout.offsetof(5);
        PPENABLEDLAYERNAMES = layout.offsetof(6);
        ENABLEDEXTENSIONCOUNT = layout.offsetof(7);
        PPENABLEDEXTENSIONNAMES = layout.offsetof(8);
        PENABLEDFEATURES = layout.offsetof(9);
    }

    protected VkDeviceCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceCreateInfo create(long address, ByteBuffer container) {
        return new VkDeviceCreateInfo(address, container);
    }

    public VkDeviceCreateInfo(ByteBuffer container) {
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

    @NativeType("VkDeviceCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int queueCreateInfoCount() {
        return nqueueCreateInfoCount(address());
    }

    @NativeType("VkDeviceQueueCreateInfo const *")
    public VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos() {
        return npQueueCreateInfos(address());
    }

    @NativeType("uint32_t")
    public int enabledLayerCount() {
        return nenabledLayerCount(address());
    }

    @NativeType("char const * const *")
    public PointerBuffer ppEnabledLayerNames() {
        return nppEnabledLayerNames(address());
    }

    @NativeType("uint32_t")
    public int enabledExtensionCount() {
        return nenabledExtensionCount(address());
    }

    @NativeType("char const * const *")
    public PointerBuffer ppEnabledExtensionNames() {
        return nppEnabledExtensionNames(address());
    }

    @NativeType("VkPhysicalDeviceFeatures const *")
    public VkPhysicalDeviceFeatures pEnabledFeatures() {
        return npEnabledFeatures(address());
    }

    public VkDeviceCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceCreateInfo sType$Default() {
        return sType(3);
    }

    public VkDeviceCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceCreateInfo pNext(VkDeviceDeviceMemoryReportCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkDeviceDiagnosticsConfigCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkDeviceGroupDeviceCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkDeviceGroupDeviceCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkDeviceMemoryOverallocationCreateInfoAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkDevicePipelineBinaryInternalCacheControlKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkDevicePrivateDataCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkDevicePrivateDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkDeviceQueueShaderCoreControlCreateInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkExternalComputeQueueDeviceCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevice16BitStorageFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevice16BitStorageFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevice4444FormatsFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevice8BitStorageFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevice8BitStorageFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceASTCDecodeFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAccelerationStructureFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAddressBindingReportFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAmigoProfilingFeaturesSEC value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAntiLagFeaturesAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBufferAddressFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBufferDeviceAddressFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceClusterAccelerationStructureFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCoherentMemoryFeaturesAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceColorWriteEnableFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceConditionalRenderingFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCooperativeMatrix2FeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCooperativeMatrixFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCooperativeMatrixFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCooperativeVectorFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCornerSampledImageFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCoverageReductionModeFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCubicClampFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCubicWeightsFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCudaKernelLaunchFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCustomBorderColorFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCustomResolveFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDataGraphFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDataGraphModelFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthBiasControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthClampControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthClipControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthClipEnableFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorBufferFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorBufferTensorFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorHeapFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorIndexingFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorIndexingFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDiagnosticsConfigFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDisplacementMicromapFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDynamicRenderingFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDynamicRenderingFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExclusiveScissorFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExternalFormatResolveFeaturesANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFaultFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFeatures2 value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFeatures2KHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFloat16Int8FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFormatPackFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentDensityMapFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentShadingRateFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFrameBoundaryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceGlobalPriorityQueryFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceHdrVividFeaturesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceHostImageCopyFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceHostImageCopyFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceHostQueryResetFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceHostQueryResetFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageAlignmentControlFeaturesMESA value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageCompressionControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageProcessing2FeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageProcessingFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageRobustnessFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageRobustnessFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageViewMinLodFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImagelessFramebufferFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImagelessFramebufferFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceIndexTypeUint8Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceIndexTypeUint8FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceIndexTypeUint8FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceInheritedViewportScissorFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceInlineUniformBlockFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceInlineUniformBlockFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLegacyDitheringFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLineRasterizationFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLineRasterizationFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLineRasterizationFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLinearColorAttachmentFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance10FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance4Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance4FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance5Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance5FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance6Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance6FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance7FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance8FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance9FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMemoryDecompressionFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMemoryDecompressionFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMemoryPriorityFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMeshShaderFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMeshShaderFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultiDrawFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultiviewFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultiviewFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceNestedCommandBufferFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceOpacityMicromapFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceOpticalFlowFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePerStageDescriptorSetFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePerformanceCountersByRegionFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePerformanceQueryFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineBinaryFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineCreationCacheControlFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelinePropertiesFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineProtectedAccessFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineProtectedAccessFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineRobustnessFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineRobustnessFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePortabilitySubsetFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentBarrierFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentId2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentIdFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentMeteringFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentTimingFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentWait2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentWaitFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePrivateDataFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePrivateDataFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceProtectedMemoryFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceProvokingVertexFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDevicePushConstantBankFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRawAccessChainsFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayQueryFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingPipelineFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingValidationFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRenderPassStripedFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRobustness2FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRobustness2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSamplerYcbcrConversionFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceScalarBlockLayoutFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceScalarBlockLayoutFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSchedulingControlsFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShader64BitIndexingFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderAtomicInt64Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderBfloat16FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderClockFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderDrawParameterFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderDrawParametersFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderEnqueueFeaturesAMDX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderExpectAssumeFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderExpectAssumeFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFloat16Int8Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFloat8FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFloatControls2Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFloatControls2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFmaFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderImageFootprintFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderIntegerDotProductFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderLongVectorFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderObjectFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderQuadControlFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupRotateFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderTerminateInvocationFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderTileImageFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderUntypedPointersFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShadingRateImageFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSubgroupSizeControlFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSynchronization2Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSynchronization2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTensorFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTileMemoryHeapFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTilePropertiesFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTileShadingFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTimelineSemaphoreFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTransformFeedbackFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVariablePointerFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVariablePointerFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVariablePointersFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVariablePointersFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVertexAttributeDivisorFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoDecodeVP9FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoEncodeAV1FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoMaintenance1FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoMaintenance2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkan11Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkan12Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkan13Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkan14Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkanMemoryModelFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDeviceCreateInfo flags(@NativeType("VkDeviceCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDeviceCreateInfo pQueueCreateInfos(@NativeType("VkDeviceQueueCreateInfo const *") VkDeviceQueueCreateInfo.Buffer value) {
        npQueueCreateInfos(address(), value);
        return this;
    }

    public VkDeviceCreateInfo ppEnabledLayerNames(@NativeType("char const * const *") PointerBuffer value) {
        nppEnabledLayerNames(address(), value);
        return this;
    }

    public VkDeviceCreateInfo ppEnabledExtensionNames(@NativeType("char const * const *") PointerBuffer value) {
        nppEnabledExtensionNames(address(), value);
        return this;
    }

    public VkDeviceCreateInfo pEnabledFeatures(@NativeType("VkPhysicalDeviceFeatures const *") VkPhysicalDeviceFeatures value) {
        npEnabledFeatures(address(), value);
        return this;
    }

    public VkDeviceCreateInfo set(int sType, long pNext, int flags, VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos, PointerBuffer ppEnabledLayerNames, PointerBuffer ppEnabledExtensionNames, VkPhysicalDeviceFeatures pEnabledFeatures) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pQueueCreateInfos(pQueueCreateInfos);
        ppEnabledLayerNames(ppEnabledLayerNames);
        ppEnabledExtensionNames(ppEnabledExtensionNames);
        pEnabledFeatures(pEnabledFeatures);
        return this;
    }

    public VkDeviceCreateInfo set(VkDeviceCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceCreateInfo malloc() {
        return new VkDeviceCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceCreateInfo calloc() {
        return new VkDeviceCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceCreateInfo create(long address) {
        return new VkDeviceCreateInfo(address, null);
    }

    public static VkDeviceCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceCreateInfo(address, null);
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

    public static VkDeviceCreateInfo malloc(MemoryStack stack) {
        return new VkDeviceCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceCreateInfo calloc(MemoryStack stack) {
        return new VkDeviceCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nqueueCreateInfoCount(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUECREATEINFOCOUNT);
    }

    public static VkDeviceQueueCreateInfo.Buffer npQueueCreateInfos(long struct) {
        return VkDeviceQueueCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PQUEUECREATEINFOS), nqueueCreateInfoCount(struct));
    }

    public static int nenabledLayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + ENABLEDLAYERCOUNT);
    }

    public static PointerBuffer nppEnabledLayerNames(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PPENABLEDLAYERNAMES), nenabledLayerCount(struct));
    }

    public static int nenabledExtensionCount(long struct) {
        return MemoryUtil.memGetInt(struct + ENABLEDEXTENSIONCOUNT);
    }

    public static PointerBuffer nppEnabledExtensionNames(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PPENABLEDEXTENSIONNAMES), nenabledExtensionCount(struct));
    }

    public static VkPhysicalDeviceFeatures npEnabledFeatures(long struct) {
        return VkPhysicalDeviceFeatures.createSafe(MemoryUtil.memGetAddress(struct + PENABLEDFEATURES));
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

    public static void nqueueCreateInfoCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUECREATEINFOCOUNT, value);
    }

    public static void npQueueCreateInfos(long struct, VkDeviceQueueCreateInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PQUEUECREATEINFOS, MemoryUtil.memAddressSafe(value));
        nqueueCreateInfoCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nenabledLayerCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENABLEDLAYERCOUNT, value);
    }

    public static void nppEnabledLayerNames(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PPENABLEDLAYERNAMES, MemoryUtil.memAddressSafe(value));
        nenabledLayerCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nenabledExtensionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENABLEDEXTENSIONCOUNT, value);
    }

    public static void nppEnabledExtensionNames(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PPENABLEDEXTENSIONNAMES, MemoryUtil.memAddressSafe(value));
        nenabledExtensionCount(struct, value == null ? 0 : value.remaining());
    }

    public static void npEnabledFeatures(long struct, VkPhysicalDeviceFeatures value) {
        MemoryUtil.memPutAddress(struct + PENABLEDFEATURES, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        int queueCreateInfoCount = nqueueCreateInfoCount(struct);
        if (queueCreateInfoCount != 0) {
            long pQueueCreateInfos = MemoryUtil.memGetAddress(struct + PQUEUECREATEINFOS);
            Checks.check(pQueueCreateInfos);
            validate(pQueueCreateInfos, queueCreateInfoCount, VkDeviceQueueCreateInfo.SIZEOF, VkDeviceQueueCreateInfo::validate);
        }
        if (nenabledLayerCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPENABLEDLAYERNAMES));
        }
        if (nenabledExtensionCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPENABLEDEXTENSIONNAMES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceCreateInfo, Buffer> implements NativeResource {
        private static final VkDeviceCreateInfo ELEMENT_FACTORY = VkDeviceCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceCreateInfo.SIZEOF);
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
        public VkDeviceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceCreateInfo.npNext(address());
        }

        @NativeType("VkDeviceCreateFlags")
        public int flags() {
            return VkDeviceCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int queueCreateInfoCount() {
            return VkDeviceCreateInfo.nqueueCreateInfoCount(address());
        }

        @NativeType("VkDeviceQueueCreateInfo const *")
        public VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos() {
            return VkDeviceCreateInfo.npQueueCreateInfos(address());
        }

        @NativeType("uint32_t")
        public int enabledLayerCount() {
            return VkDeviceCreateInfo.nenabledLayerCount(address());
        }

        @NativeType("char const * const *")
        public PointerBuffer ppEnabledLayerNames() {
            return VkDeviceCreateInfo.nppEnabledLayerNames(address());
        }

        @NativeType("uint32_t")
        public int enabledExtensionCount() {
            return VkDeviceCreateInfo.nenabledExtensionCount(address());
        }

        @NativeType("char const * const *")
        public PointerBuffer ppEnabledExtensionNames() {
            return VkDeviceCreateInfo.nppEnabledExtensionNames(address());
        }

        @NativeType("VkPhysicalDeviceFeatures const *")
        public VkPhysicalDeviceFeatures pEnabledFeatures() {
            return VkDeviceCreateInfo.npEnabledFeatures(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(3);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDeviceDeviceMemoryReportCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceDiagnosticsConfigCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceGroupDeviceCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceGroupDeviceCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceMemoryOverallocationCreateInfoAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDevicePipelineBinaryInternalCacheControlKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDevicePrivateDataCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDevicePrivateDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceQueueShaderCoreControlCreateInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalComputeQueueDeviceCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevice16BitStorageFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevice16BitStorageFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevice4444FormatsFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevice8BitStorageFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevice8BitStorageFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceASTCDecodeFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceAccelerationStructureFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceAddressBindingReportFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceAmigoProfilingFeaturesSEC value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceAntiLagFeaturesAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceBufferAddressFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceBufferDeviceAddressFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceClusterAccelerationStructureFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCoherentMemoryFeaturesAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceColorWriteEnableFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceConditionalRenderingFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCooperativeMatrix2FeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCooperativeMatrixFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCooperativeMatrixFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCooperativeVectorFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCornerSampledImageFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCoverageReductionModeFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCubicClampFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCubicWeightsFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCudaKernelLaunchFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCustomBorderColorFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCustomResolveFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDataGraphFeaturesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDataGraphModelFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDepthBiasControlFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDepthClampControlFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDepthClipControlFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDepthClipEnableFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorBufferFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorBufferTensorFeaturesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorHeapFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorIndexingFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorIndexingFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDiagnosticsConfigFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDisplacementMicromapFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDynamicRenderingFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDynamicRenderingFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExclusiveScissorFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExternalFormatResolveFeaturesANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFaultFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFeatures2 value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFeatures2KHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFloat16Int8FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFormatPackFeaturesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentDensityMapFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentShadingRateFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFrameBoundaryFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceHdrVividFeaturesHUAWEI value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceHostImageCopyFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceHostImageCopyFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceHostQueryResetFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceHostQueryResetFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageAlignmentControlFeaturesMESA value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageCompressionControlFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageProcessing2FeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageProcessingFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageRobustnessFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageRobustnessFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageViewMinLodFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImagelessFramebufferFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImagelessFramebufferFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceIndexTypeUint8Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceIndexTypeUint8FeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceIndexTypeUint8FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceInheritedViewportScissorFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceInlineUniformBlockFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceInlineUniformBlockFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLegacyDitheringFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLineRasterizationFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLineRasterizationFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLineRasterizationFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLinearColorAttachmentFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance10FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance4Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance4FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance5Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance5FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance6Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance6FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance7FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance8FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance9FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMemoryDecompressionFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMemoryDecompressionFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMemoryPriorityFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMeshShaderFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMeshShaderFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMultiDrawFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMultiviewFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMultiviewFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceNestedCommandBufferFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceOpacityMicromapFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceOpticalFlowFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePerStageDescriptorSetFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePerformanceCountersByRegionFeaturesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePerformanceQueryFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineBinaryFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineCreationCacheControlFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelinePropertiesFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineProtectedAccessFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineProtectedAccessFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineRobustnessFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineRobustnessFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePortabilitySubsetFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePresentBarrierFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePresentId2FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePresentIdFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePresentMeteringFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePresentTimingFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePresentWait2FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePresentWaitFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePrivateDataFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePrivateDataFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceProtectedMemoryFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceProvokingVertexFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePushConstantBankFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRawAccessChainsFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayQueryFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingPipelineFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingValidationFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRenderPassStripedFeaturesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRobustness2FeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRobustness2FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSamplerYcbcrConversionFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceScalarBlockLayoutFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceScalarBlockLayoutFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSchedulingControlsFeaturesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShader64BitIndexingFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderAtomicInt64Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderBfloat16FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderClockFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderDrawParameterFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderDrawParametersFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderEnqueueFeaturesAMDX value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderExpectAssumeFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderExpectAssumeFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderFloat16Int8Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderFloat8FeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderFloatControls2Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderFloatControls2FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderFmaFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderImageFootprintFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderIntegerDotProductFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderLongVectorFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderObjectFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderQuadControlFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderSubgroupRotateFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderTerminateInvocationFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderTileImageFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderUntypedPointersFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShadingRateImageFeaturesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSubgroupSizeControlFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSynchronization2Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSynchronization2FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTensorFeaturesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTileMemoryHeapFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTilePropertiesFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTileShadingFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTimelineSemaphoreFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTransformFeedbackFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVariablePointerFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVariablePointerFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVariablePointersFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVariablePointersFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVideoDecodeVP9FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVideoEncodeAV1FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVideoMaintenance1FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVideoMaintenance2FeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVulkan11Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVulkan12Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVulkan13Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVulkan14Features value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVulkanMemoryModelFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkDeviceCreateFlags") int value) {
            VkDeviceCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer pQueueCreateInfos(@NativeType("VkDeviceQueueCreateInfo const *") VkDeviceQueueCreateInfo.Buffer value) {
            VkDeviceCreateInfo.npQueueCreateInfos(address(), value);
            return this;
        }

        public Buffer ppEnabledLayerNames(@NativeType("char const * const *") PointerBuffer value) {
            VkDeviceCreateInfo.nppEnabledLayerNames(address(), value);
            return this;
        }

        public Buffer ppEnabledExtensionNames(@NativeType("char const * const *") PointerBuffer value) {
            VkDeviceCreateInfo.nppEnabledExtensionNames(address(), value);
            return this;
        }

        public Buffer pEnabledFeatures(@NativeType("VkPhysicalDeviceFeatures const *") VkPhysicalDeviceFeatures value) {
            VkDeviceCreateInfo.npEnabledFeatures(address(), value);
            return this;
        }
    }
}
