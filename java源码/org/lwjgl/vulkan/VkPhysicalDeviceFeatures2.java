package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFeatures2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFeatures2.class */
public class VkPhysicalDeviceFeatures2 extends Struct<VkPhysicalDeviceFeatures2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FEATURES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkPhysicalDeviceFeatures.SIZEOF, VkPhysicalDeviceFeatures.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FEATURES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFeatures2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFeatures2 create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFeatures2(address, container);
    }

    public VkPhysicalDeviceFeatures2(ByteBuffer container) {
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

    public VkPhysicalDeviceFeatures features() {
        return nfeatures(address());
    }

    public VkPhysicalDeviceFeatures2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFeatures2 sType$Default() {
        return sType(1000059000);
    }

    public VkPhysicalDeviceFeatures2 pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevice16BitStorageFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevice16BitStorageFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevice4444FormatsFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevice8BitStorageFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevice8BitStorageFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceASTCDecodeFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAccelerationStructureFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAddressBindingReportFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAmigoProfilingFeaturesSEC value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAntiLagFeaturesAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBufferAddressFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBufferDeviceAddressFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceClusterAccelerationStructureFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCoherentMemoryFeaturesAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceColorWriteEnableFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceConditionalRenderingFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeMatrix2FeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeMatrixFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeMatrixFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeVectorFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCornerSampledImageFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCoverageReductionModeFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCubicClampFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCubicWeightsFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCudaKernelLaunchFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCustomBorderColorFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCustomResolveFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDataGraphFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDataGraphModelFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthBiasControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClampControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClipControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClipEnableFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorBufferFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorBufferTensorFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorHeapFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorIndexingFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorIndexingFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDiagnosticsConfigFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDisplacementMicromapFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExclusiveScissorFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExternalFormatResolveFeaturesANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFaultFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFloat16Int8FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFormatPackFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMapFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShadingRateFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFrameBoundaryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceGlobalPriorityQueryFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHdrVividFeaturesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHostImageCopyFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHostImageCopyFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHostQueryResetFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHostQueryResetFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageAlignmentControlFeaturesMESA value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageCompressionControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageProcessing2FeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageProcessingFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageRobustnessFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageRobustnessFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageViewMinLodFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImagelessFramebufferFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImagelessFramebufferFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceIndexTypeUint8Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceIndexTypeUint8FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceIndexTypeUint8FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInheritedViewportScissorFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInlineUniformBlockFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInlineUniformBlockFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLegacyDitheringFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLineRasterizationFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLineRasterizationFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLineRasterizationFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLinearColorAttachmentFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance10FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance4Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance4FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance5Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance5FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance6Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance6FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance7FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance8FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance9FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMemoryDecompressionFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMemoryDecompressionFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMemoryPriorityFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMeshShaderFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMeshShaderFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiDrawFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiviewFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiviewFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceNestedCommandBufferFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceOpacityMicromapFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceOpticalFlowFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePerStageDescriptorSetFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePerformanceCountersByRegionFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePerformanceQueryFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineBinaryFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineCreationCacheControlFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelinePropertiesFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineProtectedAccessFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineProtectedAccessFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineRobustnessFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineRobustnessFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePortabilitySubsetFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentBarrierFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentId2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentIdFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentMeteringFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentTimingFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentWait2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentWaitFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrivateDataFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrivateDataFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceProtectedMemoryFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceProvokingVertexFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePushConstantBankFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRawAccessChainsFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayQueryFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingPipelineFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingValidationFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRenderPassStripedFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRobustness2FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRobustness2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSamplerYcbcrConversionFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceScalarBlockLayoutFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceScalarBlockLayoutFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSchedulingControlsFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShader64BitIndexingFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicInt64Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderBfloat16FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderClockFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDrawParameterFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDrawParametersFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderEnqueueFeaturesAMDX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderExpectAssumeFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderExpectAssumeFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloat16Int8Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloat8FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloatControls2Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloatControls2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFmaFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderImageFootprintFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderIntegerDotProductFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderLongVectorFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderObjectFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderQuadControlFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupRotateFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderTerminateInvocationFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderTileImageFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderUntypedPointersFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShadingRateImageFeaturesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubgroupSizeControlFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSynchronization2Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSynchronization2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTensorFeaturesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTileMemoryHeapFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTilePropertiesFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTileShadingFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTimelineSemaphoreFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTransformFeedbackFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVariablePointerFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVariablePointerFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVariablePointersFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVariablePointersFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexAttributeDivisorFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoDecodeVP9FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoEncodeAV1FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoMaintenance1FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoMaintenance2FeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan11Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan12Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan13Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan14Features value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkanMemoryModelFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceFeatures2 features(VkPhysicalDeviceFeatures value) {
        nfeatures(address(), value);
        return this;
    }

    public VkPhysicalDeviceFeatures2 features(Consumer<VkPhysicalDeviceFeatures> consumer) {
        consumer.accept(features());
        return this;
    }

    public VkPhysicalDeviceFeatures2 set(int sType, long pNext, VkPhysicalDeviceFeatures features) {
        sType(sType);
        pNext(pNext);
        features(features);
        return this;
    }

    public VkPhysicalDeviceFeatures2 set(VkPhysicalDeviceFeatures2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFeatures2 malloc() {
        return new VkPhysicalDeviceFeatures2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFeatures2 calloc() {
        return new VkPhysicalDeviceFeatures2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFeatures2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFeatures2(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFeatures2 create(long address) {
        return new VkPhysicalDeviceFeatures2(address, null);
    }

    public static VkPhysicalDeviceFeatures2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFeatures2(address, null);
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

    public static VkPhysicalDeviceFeatures2 malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFeatures2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFeatures2 calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFeatures2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPhysicalDeviceFeatures nfeatures(long struct) {
        return VkPhysicalDeviceFeatures.create(struct + FEATURES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfeatures(long struct, VkPhysicalDeviceFeatures value) {
        MemoryUtil.memCopy(value.address(), struct + FEATURES, VkPhysicalDeviceFeatures.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFeatures2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFeatures2$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFeatures2, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFeatures2 ELEMENT_FACTORY = VkPhysicalDeviceFeatures2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFeatures2.SIZEOF);
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
        public VkPhysicalDeviceFeatures2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFeatures2.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFeatures2.npNext(address());
        }

        public VkPhysicalDeviceFeatures features() {
            return VkPhysicalDeviceFeatures2.nfeatures(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFeatures2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000059000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFeatures2.npNext(address(), value);
            return this;
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

        public Buffer features(VkPhysicalDeviceFeatures value) {
            VkPhysicalDeviceFeatures2.nfeatures(address(), value);
            return this;
        }

        public Buffer features(Consumer<VkPhysicalDeviceFeatures> consumer) {
            consumer.accept(features());
            return this;
        }
    }
}
