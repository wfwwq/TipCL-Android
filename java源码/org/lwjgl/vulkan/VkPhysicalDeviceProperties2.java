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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties2.class */
public class VkPhysicalDeviceProperties2 extends Struct<VkPhysicalDeviceProperties2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PROPERTIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkPhysicalDeviceProperties.SIZEOF, VkPhysicalDeviceProperties.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROPERTIES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceProperties2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceProperties2 create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceProperties2(address, container);
    }

    public VkPhysicalDeviceProperties2(ByteBuffer container) {
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

    public VkPhysicalDeviceProperties properties() {
        return nproperties(address());
    }

    public VkPhysicalDeviceProperties2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceProperties2 sType$Default() {
        return sType(1000059001);
    }

    public VkPhysicalDeviceProperties2 pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceAccelerationStructurePropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceClusterAccelerationStructurePropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceConservativeRasterizationPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceCooperativeMatrix2PropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceCooperativeMatrixPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceCooperativeMatrixPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceCooperativeVectorPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceCopyMemoryIndirectPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceCudaKernelLaunchPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceCustomBorderColorPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDepthStencilResolveProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDepthStencilResolvePropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDescriptorBufferPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDescriptorBufferTensorPropertiesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDescriptorHeapPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDescriptorHeapTensorPropertiesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDescriptorIndexingProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDescriptorIndexingPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDiscardRectanglePropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDisplacementMicromapPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDriverProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDriverPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDrmPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceExtendedDynamicState3PropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceExternalComputeQueuePropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceExternalFormatResolvePropertiesANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceExternalMemoryHostPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFloatControlsProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFloatControlsPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentDensityMapPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentShadingRatePropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceHostImageCopyProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceHostImageCopyPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceIDProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceIDPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceImageAlignmentControlPropertiesMESA value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceImageProcessing2PropertiesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceImageProcessingPropertiesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceInlineUniformBlockProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceInlineUniformBlockPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceLayeredApiPropertiesListKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceLayeredDriverPropertiesMSFT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceLineRasterizationProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceLineRasterizationPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceLineRasterizationPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance10PropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance3Properties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance3PropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance4Properties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance4PropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance5Properties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance5PropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance6Properties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance6PropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance7PropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance9PropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMapMemoryPlacedPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMemoryDecompressionPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMemoryDecompressionPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMeshShaderPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMeshShaderPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMultiDrawPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMultiviewProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMultiviewPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceNestedCommandBufferPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceOpacityMicromapPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceOpticalFlowPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePCIBusInfoPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePerformanceCountersByRegionPropertiesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePerformanceQueryPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePipelineBinaryPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePipelineRobustnessProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePipelineRobustnessPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePointClippingProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePointClippingPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePortabilitySubsetPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceProtectedMemoryProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceProvokingVertexPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePushConstantBankPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePushDescriptorProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePushDescriptorPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceRayTracingPipelinePropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceRayTracingPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceRenderPassStripedPropertiesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceRobustness2PropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceRobustness2PropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSampleLocationsPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSamplerFilterMinmaxProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSchedulingControlsPropertiesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderCoreProperties2AMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderCorePropertiesAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderCorePropertiesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderEnqueuePropertiesAMDX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderIntegerDotProductProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderLongVectorPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderObjectPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderTileImagePropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShadingRateImagePropertiesNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSubgroupProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSubgroupSizeControlProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTensorPropertiesARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTexelBufferAlignmentProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTileMemoryHeapPropertiesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTileShadingPropertiesQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTimelineSemaphoreProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTimelineSemaphorePropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTransformFeedbackPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVertexAttributeDivisorProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVulkan11Properties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVulkan12Properties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVulkan13Properties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVulkan14Properties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceProperties2 set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceProperties2 set(VkPhysicalDeviceProperties2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceProperties2 malloc() {
        return new VkPhysicalDeviceProperties2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceProperties2 calloc() {
        return new VkPhysicalDeviceProperties2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceProperties2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceProperties2(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceProperties2 create(long address) {
        return new VkPhysicalDeviceProperties2(address, null);
    }

    public static VkPhysicalDeviceProperties2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceProperties2(address, null);
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

    public static VkPhysicalDeviceProperties2 malloc(MemoryStack stack) {
        return new VkPhysicalDeviceProperties2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceProperties2 calloc(MemoryStack stack) {
        return new VkPhysicalDeviceProperties2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPhysicalDeviceProperties nproperties(long struct) {
        return VkPhysicalDeviceProperties.create(struct + PROPERTIES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties2$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProperties2, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceProperties2 ELEMENT_FACTORY = VkPhysicalDeviceProperties2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceProperties2.SIZEOF);
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
        public VkPhysicalDeviceProperties2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceProperties2.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceProperties2.npNext(address());
        }

        public VkPhysicalDeviceProperties properties() {
            return VkPhysicalDeviceProperties2.nproperties(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceProperties2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000059001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceProperties2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPhysicalDeviceAccelerationStructurePropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceClusterAccelerationStructurePropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceConservativeRasterizationPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCooperativeMatrix2PropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCooperativeMatrixPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCooperativeMatrixPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCooperativeVectorPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCopyMemoryIndirectPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCudaKernelLaunchPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceCustomBorderColorPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDepthStencilResolveProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDepthStencilResolvePropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorBufferPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorBufferTensorPropertiesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorHeapPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorHeapTensorPropertiesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorIndexingProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDescriptorIndexingPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDiscardRectanglePropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDisplacementMicromapPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDriverProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDriverPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceDrmPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExtendedDynamicState3PropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExternalComputeQueuePropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExternalFormatResolvePropertiesANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceExternalMemoryHostPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFloatControlsProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFloatControlsPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentDensityMapPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceFragmentShadingRatePropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceHostImageCopyProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceHostImageCopyPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceIDProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceIDPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageAlignmentControlPropertiesMESA value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageProcessing2PropertiesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceImageProcessingPropertiesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceInlineUniformBlockProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceInlineUniformBlockPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLayeredApiPropertiesListKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLayeredDriverPropertiesMSFT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLineRasterizationProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLineRasterizationPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceLineRasterizationPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance10PropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance3Properties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance3PropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance4Properties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance4PropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance5Properties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance5PropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance6Properties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance6PropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance7PropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMaintenance9PropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMapMemoryPlacedPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMemoryDecompressionPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMemoryDecompressionPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMeshShaderPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMeshShaderPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMultiDrawPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMultiviewProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceMultiviewPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceNestedCommandBufferPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceOpacityMicromapPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceOpticalFlowPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePCIBusInfoPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePerformanceCountersByRegionPropertiesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePerformanceQueryPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineBinaryPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineRobustnessProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePipelineRobustnessPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePointClippingProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePointClippingPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePortabilitySubsetPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceProtectedMemoryProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceProvokingVertexPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePushConstantBankPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePushDescriptorProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDevicePushDescriptorPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingPipelinePropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRayTracingPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRenderPassStripedPropertiesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRobustness2PropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceRobustness2PropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSampleLocationsPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSamplerFilterMinmaxProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSchedulingControlsPropertiesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderCoreProperties2AMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderCorePropertiesAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderCorePropertiesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderEnqueuePropertiesAMDX value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderIntegerDotProductProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderLongVectorPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderObjectPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShaderTileImagePropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceShadingRateImagePropertiesNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSubgroupProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSubgroupSizeControlProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTensorPropertiesARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTexelBufferAlignmentProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTileMemoryHeapPropertiesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTileShadingPropertiesQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTimelineSemaphoreProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTimelineSemaphorePropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceTransformFeedbackPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVulkan11Properties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVulkan12Properties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVulkan13Properties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPhysicalDeviceVulkan14Properties value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
