package org.lwjgl.vulkan;

import com.pymcl.android.ui.SideBarRules;
import java.util.Set;
import javassist.compiler.TokenId;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.lwjgl.nanovg.OUI;
import org.lwjgl.sdl.SDLEvents;
import org.lwjgl.sdl.SDLScancode;
import org.lwjgl.system.Checks;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.linux.FCNTL;
import org.lwjgl.system.windows.User32;
import org.lwjgl.util.shaderc.Shaderc;
import org.lwjgl.util.spvc.Spv;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VKCapabilitiesDevice.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VKCapabilitiesDevice.class */
public class VKCapabilitiesDevice {
    public final long vkGetDeviceProcAddr;
    public final long vkDestroyDevice;
    public final long vkGetDeviceQueue;
    public final long vkQueueSubmit;
    public final long vkQueueWaitIdle;
    public final long vkDeviceWaitIdle;
    public final long vkAllocateMemory;
    public final long vkFreeMemory;
    public final long vkMapMemory;
    public final long vkUnmapMemory;
    public final long vkFlushMappedMemoryRanges;
    public final long vkInvalidateMappedMemoryRanges;
    public final long vkGetDeviceMemoryCommitment;
    public final long vkBindBufferMemory;
    public final long vkBindImageMemory;
    public final long vkGetBufferMemoryRequirements;
    public final long vkGetImageMemoryRequirements;
    public final long vkGetImageSparseMemoryRequirements;
    public final long vkQueueBindSparse;
    public final long vkCreateFence;
    public final long vkDestroyFence;
    public final long vkResetFences;
    public final long vkGetFenceStatus;
    public final long vkWaitForFences;
    public final long vkCreateSemaphore;
    public final long vkDestroySemaphore;
    public final long vkCreateQueryPool;
    public final long vkDestroyQueryPool;
    public final long vkGetQueryPoolResults;
    public final long vkCreateBuffer;
    public final long vkDestroyBuffer;
    public final long vkCreateImage;
    public final long vkDestroyImage;
    public final long vkGetImageSubresourceLayout;
    public final long vkCreateImageView;
    public final long vkDestroyImageView;
    public final long vkCreateCommandPool;
    public final long vkDestroyCommandPool;
    public final long vkResetCommandPool;
    public final long vkAllocateCommandBuffers;
    public final long vkFreeCommandBuffers;
    public final long vkBeginCommandBuffer;
    public final long vkEndCommandBuffer;
    public final long vkResetCommandBuffer;
    public final long vkCmdCopyBuffer;
    public final long vkCmdCopyImage;
    public final long vkCmdCopyBufferToImage;
    public final long vkCmdCopyImageToBuffer;
    public final long vkCmdUpdateBuffer;
    public final long vkCmdFillBuffer;
    public final long vkCmdPipelineBarrier;
    public final long vkCmdBeginQuery;
    public final long vkCmdEndQuery;
    public final long vkCmdResetQueryPool;
    public final long vkCmdWriteTimestamp;
    public final long vkCmdCopyQueryPoolResults;
    public final long vkCmdExecuteCommands;
    public final long vkCreateEvent;
    public final long vkDestroyEvent;
    public final long vkGetEventStatus;
    public final long vkSetEvent;
    public final long vkResetEvent;
    public final long vkCreateBufferView;
    public final long vkDestroyBufferView;
    public final long vkCreateShaderModule;
    public final long vkDestroyShaderModule;
    public final long vkCreatePipelineCache;
    public final long vkDestroyPipelineCache;
    public final long vkGetPipelineCacheData;
    public final long vkMergePipelineCaches;
    public final long vkCreateComputePipelines;
    public final long vkDestroyPipeline;
    public final long vkCreatePipelineLayout;
    public final long vkDestroyPipelineLayout;
    public final long vkCreateSampler;
    public final long vkDestroySampler;
    public final long vkCreateDescriptorSetLayout;
    public final long vkDestroyDescriptorSetLayout;
    public final long vkCreateDescriptorPool;
    public final long vkDestroyDescriptorPool;
    public final long vkResetDescriptorPool;
    public final long vkAllocateDescriptorSets;
    public final long vkFreeDescriptorSets;
    public final long vkUpdateDescriptorSets;
    public final long vkCmdBindPipeline;
    public final long vkCmdBindDescriptorSets;
    public final long vkCmdClearColorImage;
    public final long vkCmdDispatch;
    public final long vkCmdDispatchIndirect;
    public final long vkCmdSetEvent;
    public final long vkCmdResetEvent;
    public final long vkCmdWaitEvents;
    public final long vkCmdPushConstants;
    public final long vkCreateGraphicsPipelines;
    public final long vkCreateFramebuffer;
    public final long vkDestroyFramebuffer;
    public final long vkCreateRenderPass;
    public final long vkDestroyRenderPass;
    public final long vkGetRenderAreaGranularity;
    public final long vkCmdSetViewport;
    public final long vkCmdSetScissor;
    public final long vkCmdSetLineWidth;
    public final long vkCmdSetDepthBias;
    public final long vkCmdSetBlendConstants;
    public final long vkCmdSetDepthBounds;
    public final long vkCmdSetStencilCompareMask;
    public final long vkCmdSetStencilWriteMask;
    public final long vkCmdSetStencilReference;
    public final long vkCmdBindIndexBuffer;
    public final long vkCmdBindVertexBuffers;
    public final long vkCmdDraw;
    public final long vkCmdDrawIndexed;
    public final long vkCmdDrawIndirect;
    public final long vkCmdDrawIndexedIndirect;
    public final long vkCmdBlitImage;
    public final long vkCmdClearDepthStencilImage;
    public final long vkCmdClearAttachments;
    public final long vkCmdResolveImage;
    public final long vkCmdBeginRenderPass;
    public final long vkCmdNextSubpass;
    public final long vkCmdEndRenderPass;
    public final long vkBindBufferMemory2;
    public final long vkBindImageMemory2;
    public final long vkGetDeviceGroupPeerMemoryFeatures;
    public final long vkCmdSetDeviceMask;
    public final long vkGetImageMemoryRequirements2;
    public final long vkGetBufferMemoryRequirements2;
    public final long vkGetImageSparseMemoryRequirements2;
    public final long vkTrimCommandPool;
    public final long vkGetDeviceQueue2;
    public final long vkCmdDispatchBase;
    public final long vkCreateDescriptorUpdateTemplate;
    public final long vkDestroyDescriptorUpdateTemplate;
    public final long vkUpdateDescriptorSetWithTemplate;
    public final long vkGetDescriptorSetLayoutSupport;
    public final long vkCreateSamplerYcbcrConversion;
    public final long vkDestroySamplerYcbcrConversion;
    public final long vkResetQueryPool;
    public final long vkGetSemaphoreCounterValue;
    public final long vkWaitSemaphores;
    public final long vkSignalSemaphore;
    public final long vkGetBufferDeviceAddress;
    public final long vkGetBufferOpaqueCaptureAddress;
    public final long vkGetDeviceMemoryOpaqueCaptureAddress;
    public final long vkCmdDrawIndirectCount;
    public final long vkCmdDrawIndexedIndirectCount;
    public final long vkCreateRenderPass2;
    public final long vkCmdBeginRenderPass2;
    public final long vkCmdNextSubpass2;
    public final long vkCmdEndRenderPass2;
    public final long vkCreatePrivateDataSlot;
    public final long vkDestroyPrivateDataSlot;
    public final long vkSetPrivateData;
    public final long vkGetPrivateData;
    public final long vkCmdPipelineBarrier2;
    public final long vkCmdWriteTimestamp2;
    public final long vkQueueSubmit2;
    public final long vkCmdCopyBuffer2;
    public final long vkCmdCopyImage2;
    public final long vkCmdCopyBufferToImage2;
    public final long vkCmdCopyImageToBuffer2;
    public final long vkGetDeviceBufferMemoryRequirements;
    public final long vkGetDeviceImageMemoryRequirements;
    public final long vkGetDeviceImageSparseMemoryRequirements;
    public final long vkCmdSetEvent2;
    public final long vkCmdResetEvent2;
    public final long vkCmdWaitEvents2;
    public final long vkCmdBlitImage2;
    public final long vkCmdResolveImage2;
    public final long vkCmdBeginRendering;
    public final long vkCmdEndRendering;
    public final long vkCmdSetCullMode;
    public final long vkCmdSetFrontFace;
    public final long vkCmdSetPrimitiveTopology;
    public final long vkCmdSetViewportWithCount;
    public final long vkCmdSetScissorWithCount;
    public final long vkCmdBindVertexBuffers2;
    public final long vkCmdSetDepthTestEnable;
    public final long vkCmdSetDepthWriteEnable;
    public final long vkCmdSetDepthCompareOp;
    public final long vkCmdSetDepthBoundsTestEnable;
    public final long vkCmdSetStencilTestEnable;
    public final long vkCmdSetStencilOp;
    public final long vkCmdSetRasterizerDiscardEnable;
    public final long vkCmdSetDepthBiasEnable;
    public final long vkCmdSetPrimitiveRestartEnable;
    public final long vkMapMemory2;
    public final long vkUnmapMemory2;
    public final long vkGetDeviceImageSubresourceLayout;
    public final long vkGetImageSubresourceLayout2;
    public final long vkCopyMemoryToImage;
    public final long vkCopyImageToMemory;
    public final long vkCopyImageToImage;
    public final long vkTransitionImageLayout;
    public final long vkCmdPushDescriptorSet;
    public final long vkCmdPushDescriptorSetWithTemplate;
    public final long vkCmdBindDescriptorSets2;
    public final long vkCmdPushConstants2;
    public final long vkCmdPushDescriptorSet2;
    public final long vkCmdPushDescriptorSetWithTemplate2;
    public final long vkCmdSetLineStipple;
    public final long vkCmdBindIndexBuffer2;
    public final long vkGetRenderingAreaGranularity;
    public final long vkCmdSetRenderingAttachmentLocations;
    public final long vkCmdSetRenderingInputAttachmentIndices;
    public final long vkAntiLagUpdateAMD;
    public final long vkCmdWriteBufferMarkerAMD;
    public final long vkCmdWriteBufferMarker2AMD;
    public final long vkSetLocalDimmingAMD;
    public final long vkCmdDrawIndirectCountAMD;
    public final long vkCmdDrawIndexedIndirectCountAMD;
    public final long vkGetShaderInfoAMD;
    public final long vkCreateExecutionGraphPipelinesAMDX;
    public final long vkGetExecutionGraphPipelineScratchSizeAMDX;
    public final long vkGetExecutionGraphPipelineNodeIndexAMDX;
    public final long vkCmdInitializeGraphScratchMemoryAMDX;
    public final long vkCmdDispatchGraphAMDX;
    public final long vkCmdDispatchGraphIndirectAMDX;
    public final long vkCmdDispatchGraphIndirectCountAMDX;
    public final long vkGetAndroidHardwareBufferPropertiesANDROID;
    public final long vkGetMemoryAndroidHardwareBufferANDROID;
    public final long vkCreateDataGraphPipelinesARM;
    public final long vkCreateDataGraphPipelineSessionARM;
    public final long vkGetDataGraphPipelineSessionBindPointRequirementsARM;
    public final long vkGetDataGraphPipelineSessionMemoryRequirementsARM;
    public final long vkBindDataGraphPipelineSessionMemoryARM;
    public final long vkDestroyDataGraphPipelineSessionARM;
    public final long vkCmdDispatchDataGraphARM;
    public final long vkGetDataGraphPipelineAvailablePropertiesARM;
    public final long vkGetDataGraphPipelinePropertiesARM;
    public final long vkCreateTensorARM;
    public final long vkDestroyTensorARM;
    public final long vkCreateTensorViewARM;
    public final long vkDestroyTensorViewARM;
    public final long vkGetTensorMemoryRequirementsARM;
    public final long vkBindTensorMemoryARM;
    public final long vkGetDeviceTensorMemoryRequirementsARM;
    public final long vkCmdCopyTensorARM;
    public final long vkGetTensorOpaqueCaptureDescriptorDataARM;
    public final long vkGetTensorViewOpaqueCaptureDescriptorDataARM;
    public final long vkCmdSetAttachmentFeedbackLoopEnableEXT;
    public final long vkGetBufferDeviceAddressEXT;
    public final long vkGetCalibratedTimestampsEXT;
    public final long vkCmdSetColorWriteEnableEXT;
    public final long vkCmdBeginConditionalRenderingEXT;
    public final long vkCmdEndConditionalRenderingEXT;
    public final long vkCmdBeginCustomResolveEXT;
    public final long vkDebugMarkerSetObjectTagEXT;
    public final long vkDebugMarkerSetObjectNameEXT;
    public final long vkCmdDebugMarkerBeginEXT;
    public final long vkCmdDebugMarkerEndEXT;
    public final long vkCmdDebugMarkerInsertEXT;
    public final long vkCmdSetDepthBias2EXT;
    public final long vkCmdSetDepthClampRangeEXT;
    public final long vkGetDescriptorSetLayoutSizeEXT;
    public final long vkGetDescriptorSetLayoutBindingOffsetEXT;
    public final long vkGetDescriptorEXT;
    public final long vkCmdBindDescriptorBuffersEXT;
    public final long vkCmdSetDescriptorBufferOffsetsEXT;
    public final long vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
    public final long vkGetBufferOpaqueCaptureDescriptorDataEXT;
    public final long vkGetImageOpaqueCaptureDescriptorDataEXT;
    public final long vkGetImageViewOpaqueCaptureDescriptorDataEXT;
    public final long vkGetSamplerOpaqueCaptureDescriptorDataEXT;
    public final long vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
    public final long vkWriteSamplerDescriptorsEXT;
    public final long vkWriteResourceDescriptorsEXT;
    public final long vkCmdBindSamplerHeapEXT;
    public final long vkCmdBindResourceHeapEXT;
    public final long vkCmdPushDataEXT;
    public final long vkGetImageOpaqueCaptureDataEXT;
    public final long vkRegisterCustomBorderColorEXT;
    public final long vkUnregisterCustomBorderColorEXT;
    public final long vkGetTensorOpaqueCaptureDataARM;
    public final long vkGetDeviceFaultInfoEXT;
    public final long vkGetGeneratedCommandsMemoryRequirementsEXT;
    public final long vkCmdPreprocessGeneratedCommandsEXT;
    public final long vkCmdExecuteGeneratedCommandsEXT;
    public final long vkCreateIndirectCommandsLayoutEXT;
    public final long vkDestroyIndirectCommandsLayoutEXT;
    public final long vkCreateIndirectExecutionSetEXT;
    public final long vkDestroyIndirectExecutionSetEXT;
    public final long vkUpdateIndirectExecutionSetPipelineEXT;
    public final long vkUpdateIndirectExecutionSetShaderEXT;
    public final long vkCmdSetDiscardRectangleEXT;
    public final long vkCmdSetDiscardRectangleEnableEXT;
    public final long vkCmdSetDiscardRectangleModeEXT;
    public final long vkDisplayPowerControlEXT;
    public final long vkRegisterDeviceEventEXT;
    public final long vkRegisterDisplayEventEXT;
    public final long vkGetSwapchainCounterEXT;
    public final long vkCmdSetCullModeEXT;
    public final long vkCmdSetFrontFaceEXT;
    public final long vkCmdSetPrimitiveTopologyEXT;
    public final long vkCmdSetViewportWithCountEXT;
    public final long vkCmdSetScissorWithCountEXT;
    public final long vkCmdBindVertexBuffers2EXT;
    public final long vkCmdSetDepthTestEnableEXT;
    public final long vkCmdSetDepthWriteEnableEXT;
    public final long vkCmdSetDepthCompareOpEXT;
    public final long vkCmdSetDepthBoundsTestEnableEXT;
    public final long vkCmdSetStencilTestEnableEXT;
    public final long vkCmdSetStencilOpEXT;
    public final long vkCmdSetPatchControlPointsEXT;
    public final long vkCmdSetRasterizerDiscardEnableEXT;
    public final long vkCmdSetDepthBiasEnableEXT;
    public final long vkCmdSetLogicOpEXT;
    public final long vkCmdSetPrimitiveRestartEnableEXT;
    public final long vkCmdSetDepthClampEnableEXT;
    public final long vkCmdSetPolygonModeEXT;
    public final long vkCmdSetRasterizationSamplesEXT;
    public final long vkCmdSetSampleMaskEXT;
    public final long vkCmdSetAlphaToCoverageEnableEXT;
    public final long vkCmdSetAlphaToOneEnableEXT;
    public final long vkCmdSetLogicOpEnableEXT;
    public final long vkCmdSetColorBlendEnableEXT;
    public final long vkCmdSetColorBlendEquationEXT;
    public final long vkCmdSetColorWriteMaskEXT;
    public final long vkCmdSetTessellationDomainOriginEXT;
    public final long vkCmdSetRasterizationStreamEXT;
    public final long vkCmdSetConservativeRasterizationModeEXT;
    public final long vkCmdSetExtraPrimitiveOverestimationSizeEXT;
    public final long vkCmdSetDepthClipEnableEXT;
    public final long vkCmdSetSampleLocationsEnableEXT;
    public final long vkCmdSetColorBlendAdvancedEXT;
    public final long vkCmdSetProvokingVertexModeEXT;
    public final long vkCmdSetLineRasterizationModeEXT;
    public final long vkCmdSetLineStippleEnableEXT;
    public final long vkCmdSetDepthClipNegativeOneToOneEXT;
    public final long vkCmdSetViewportWScalingEnableNV;
    public final long vkCmdSetViewportSwizzleNV;
    public final long vkCmdSetCoverageToColorEnableNV;
    public final long vkCmdSetCoverageToColorLocationNV;
    public final long vkCmdSetCoverageModulationModeNV;
    public final long vkCmdSetCoverageModulationTableEnableNV;
    public final long vkCmdSetCoverageModulationTableNV;
    public final long vkCmdSetShadingRateImageEnableNV;
    public final long vkCmdSetRepresentativeFragmentTestEnableNV;
    public final long vkCmdSetCoverageReductionModeNV;
    public final long vkGetMemoryHostPointerPropertiesEXT;
    public final long vkGetMemoryMetalHandleEXT;
    public final long vkGetMemoryMetalHandlePropertiesEXT;
    public final long vkCmdEndRendering2EXT;
    public final long vkAcquireFullScreenExclusiveModeEXT;
    public final long vkReleaseFullScreenExclusiveModeEXT;
    public final long vkGetDeviceGroupSurfacePresentModes2EXT;
    public final long vkSetHdrMetadataEXT;
    public final long vkCopyMemoryToImageEXT;
    public final long vkCopyImageToMemoryEXT;
    public final long vkCopyImageToImageEXT;
    public final long vkTransitionImageLayoutEXT;
    public final long vkGetImageSubresourceLayout2EXT;
    public final long vkResetQueryPoolEXT;
    public final long vkGetImageDrmFormatModifierPropertiesEXT;
    public final long vkCmdSetLineStippleEXT;
    public final long vkCmdDecompressMemoryEXT;
    public final long vkCmdDecompressMemoryIndirectCountEXT;
    public final long vkCmdDrawMeshTasksEXT;
    public final long vkCmdDrawMeshTasksIndirectEXT;
    public final long vkCmdDrawMeshTasksIndirectCountEXT;
    public final long vkExportMetalObjectsEXT;
    public final long vkCmdDrawMultiEXT;
    public final long vkCmdDrawMultiIndexedEXT;
    public final long vkCreateMicromapEXT;
    public final long vkDestroyMicromapEXT;
    public final long vkCmdBuildMicromapsEXT;
    public final long vkBuildMicromapsEXT;
    public final long vkCopyMicromapEXT;
    public final long vkCopyMicromapToMemoryEXT;
    public final long vkCopyMemoryToMicromapEXT;
    public final long vkWriteMicromapsPropertiesEXT;
    public final long vkCmdCopyMicromapEXT;
    public final long vkCmdCopyMicromapToMemoryEXT;
    public final long vkCmdCopyMemoryToMicromapEXT;
    public final long vkCmdWriteMicromapsPropertiesEXT;
    public final long vkGetDeviceMicromapCompatibilityEXT;
    public final long vkGetMicromapBuildSizesEXT;
    public final long vkSetDeviceMemoryPriorityEXT;
    public final long vkGetPipelinePropertiesEXT;
    public final long vkSetSwapchainPresentTimingQueueSizeEXT;
    public final long vkGetSwapchainTimingPropertiesEXT;
    public final long vkGetSwapchainTimeDomainPropertiesEXT;
    public final long vkGetPastPresentationTimingEXT;
    public final long vkCreatePrivateDataSlotEXT;
    public final long vkDestroyPrivateDataSlotEXT;
    public final long vkSetPrivateDataEXT;
    public final long vkGetPrivateDataEXT;
    public final long vkCmdSetSampleLocationsEXT;
    public final long vkGetShaderModuleIdentifierEXT;
    public final long vkGetShaderModuleCreateInfoIdentifierEXT;
    public final long vkCreateShadersEXT;
    public final long vkDestroyShaderEXT;
    public final long vkGetShaderBinaryDataEXT;
    public final long vkCmdBindShadersEXT;
    public final long vkCmdSetVertexInputEXT;
    public final long vkReleaseSwapchainImagesEXT;
    public final long vkCmdBindTransformFeedbackBuffersEXT;
    public final long vkCmdBeginTransformFeedbackEXT;
    public final long vkCmdEndTransformFeedbackEXT;
    public final long vkCmdBeginQueryIndexedEXT;
    public final long vkCmdEndQueryIndexedEXT;
    public final long vkCmdDrawIndirectByteCountEXT;
    public final long vkCreateValidationCacheEXT;
    public final long vkDestroyValidationCacheEXT;
    public final long vkMergeValidationCachesEXT;
    public final long vkGetValidationCacheDataEXT;
    public final long vkGetRefreshCycleDurationGOOGLE;
    public final long vkGetPastPresentationTimingGOOGLE;
    public final long vkCmdDrawClusterHUAWEI;
    public final long vkCmdDrawClusterIndirectHUAWEI;
    public final long vkCmdBindInvocationMaskHUAWEI;
    public final long vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI;
    public final long vkCmdSubpassShadingHUAWEI;
    public final long vkInitializePerformanceApiINTEL;
    public final long vkUninitializePerformanceApiINTEL;
    public final long vkCmdSetPerformanceMarkerINTEL;
    public final long vkCmdSetPerformanceStreamMarkerINTEL;
    public final long vkCmdSetPerformanceOverrideINTEL;
    public final long vkAcquirePerformanceConfigurationINTEL;
    public final long vkReleasePerformanceConfigurationINTEL;
    public final long vkQueueSetPerformanceConfigurationINTEL;
    public final long vkGetPerformanceParameterINTEL;
    public final long vkCreateAccelerationStructureKHR;
    public final long vkDestroyAccelerationStructureKHR;
    public final long vkCmdBuildAccelerationStructuresKHR;
    public final long vkCmdBuildAccelerationStructuresIndirectKHR;
    public final long vkBuildAccelerationStructuresKHR;
    public final long vkCopyAccelerationStructureKHR;
    public final long vkCopyAccelerationStructureToMemoryKHR;
    public final long vkCopyMemoryToAccelerationStructureKHR;
    public final long vkWriteAccelerationStructuresPropertiesKHR;
    public final long vkCmdCopyAccelerationStructureKHR;
    public final long vkCmdCopyAccelerationStructureToMemoryKHR;
    public final long vkCmdCopyMemoryToAccelerationStructureKHR;
    public final long vkGetAccelerationStructureDeviceAddressKHR;
    public final long vkCmdWriteAccelerationStructuresPropertiesKHR;
    public final long vkGetDeviceAccelerationStructureCompatibilityKHR;
    public final long vkGetAccelerationStructureBuildSizesKHR;
    public final long vkBindBufferMemory2KHR;
    public final long vkBindImageMemory2KHR;
    public final long vkGetBufferDeviceAddressKHR;
    public final long vkGetBufferOpaqueCaptureAddressKHR;
    public final long vkGetDeviceMemoryOpaqueCaptureAddressKHR;
    public final long vkGetCalibratedTimestampsKHR;
    public final long vkCmdCopyBuffer2KHR;
    public final long vkCmdCopyImage2KHR;
    public final long vkCmdCopyBufferToImage2KHR;
    public final long vkCmdCopyImageToBuffer2KHR;
    public final long vkCmdBlitImage2KHR;
    public final long vkCmdResolveImage2KHR;
    public final long vkCmdCopyMemoryIndirectKHR;
    public final long vkCmdCopyMemoryToImageIndirectKHR;
    public final long vkCreateRenderPass2KHR;
    public final long vkCmdBeginRenderPass2KHR;
    public final long vkCmdNextSubpass2KHR;
    public final long vkCmdEndRenderPass2KHR;
    public final long vkCreateDeferredOperationKHR;
    public final long vkDestroyDeferredOperationKHR;
    public final long vkGetDeferredOperationMaxConcurrencyKHR;
    public final long vkGetDeferredOperationResultKHR;
    public final long vkDeferredOperationJoinKHR;
    public final long vkCreateDescriptorUpdateTemplateKHR;
    public final long vkDestroyDescriptorUpdateTemplateKHR;
    public final long vkUpdateDescriptorSetWithTemplateKHR;
    public final long vkCmdPushDescriptorSetWithTemplateKHR;
    public final long vkGetDeviceGroupPeerMemoryFeaturesKHR;
    public final long vkCmdSetDeviceMaskKHR;
    public final long vkCmdDispatchBaseKHR;
    public final long vkGetDeviceGroupPresentCapabilitiesKHR;
    public final long vkGetDeviceGroupSurfacePresentModesKHR;
    public final long vkAcquireNextImage2KHR;
    public final long vkCreateSharedSwapchainsKHR;
    public final long vkCmdDrawIndirectCountKHR;
    public final long vkCmdDrawIndexedIndirectCountKHR;
    public final long vkCmdBeginRenderingKHR;
    public final long vkCmdEndRenderingKHR;
    public final long vkCmdSetRenderingAttachmentLocationsKHR;
    public final long vkCmdSetRenderingInputAttachmentIndicesKHR;
    public final long vkImportFenceFdKHR;
    public final long vkGetFenceFdKHR;
    public final long vkImportFenceWin32HandleKHR;
    public final long vkGetFenceWin32HandleKHR;
    public final long vkGetMemoryFdKHR;
    public final long vkGetMemoryFdPropertiesKHR;
    public final long vkGetMemoryWin32HandleKHR;
    public final long vkGetMemoryWin32HandlePropertiesKHR;
    public final long vkImportSemaphoreFdKHR;
    public final long vkGetSemaphoreFdKHR;
    public final long vkImportSemaphoreWin32HandleKHR;
    public final long vkGetSemaphoreWin32HandleKHR;
    public final long vkCmdSetFragmentShadingRateKHR;
    public final long vkGetImageMemoryRequirements2KHR;
    public final long vkGetBufferMemoryRequirements2KHR;
    public final long vkGetImageSparseMemoryRequirements2KHR;
    public final long vkCmdSetLineStippleKHR;
    public final long vkTrimCommandPoolKHR;
    public final long vkCmdEndRendering2KHR;
    public final long vkGetDescriptorSetLayoutSupportKHR;
    public final long vkGetDeviceBufferMemoryRequirementsKHR;
    public final long vkGetDeviceImageMemoryRequirementsKHR;
    public final long vkGetDeviceImageSparseMemoryRequirementsKHR;
    public final long vkCmdBindIndexBuffer2KHR;
    public final long vkGetRenderingAreaGranularityKHR;
    public final long vkGetDeviceImageSubresourceLayoutKHR;
    public final long vkGetImageSubresourceLayout2KHR;
    public final long vkCmdBindDescriptorSets2KHR;
    public final long vkCmdPushConstants2KHR;
    public final long vkCmdPushDescriptorSet2KHR;
    public final long vkCmdPushDescriptorSetWithTemplate2KHR;
    public final long vkCmdSetDescriptorBufferOffsets2EXT;
    public final long vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;
    public final long vkMapMemory2KHR;
    public final long vkUnmapMemory2KHR;
    public final long vkAcquireProfilingLockKHR;
    public final long vkReleaseProfilingLockKHR;
    public final long vkCreatePipelineBinariesKHR;
    public final long vkDestroyPipelineBinaryKHR;
    public final long vkGetPipelineKeyKHR;
    public final long vkGetPipelineBinaryDataKHR;
    public final long vkReleaseCapturedPipelineDataKHR;
    public final long vkGetPipelineExecutablePropertiesKHR;
    public final long vkGetPipelineExecutableStatisticsKHR;
    public final long vkGetPipelineExecutableInternalRepresentationsKHR;
    public final long vkWaitForPresentKHR;
    public final long vkWaitForPresent2KHR;
    public final long vkCmdPushDescriptorSetKHR;
    public final long vkCmdTraceRaysIndirect2KHR;
    public final long vkCmdTraceRaysKHR;
    public final long vkCreateRayTracingPipelinesKHR;
    public final long vkGetRayTracingShaderGroupHandlesKHR;
    public final long vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
    public final long vkCmdTraceRaysIndirectKHR;
    public final long vkGetRayTracingShaderGroupStackSizeKHR;
    public final long vkCmdSetRayTracingPipelineStackSizeKHR;
    public final long vkCreateSamplerYcbcrConversionKHR;
    public final long vkDestroySamplerYcbcrConversionKHR;
    public final long vkGetSwapchainStatusKHR;
    public final long vkCreateSwapchainKHR;
    public final long vkDestroySwapchainKHR;
    public final long vkGetSwapchainImagesKHR;
    public final long vkAcquireNextImageKHR;
    public final long vkQueuePresentKHR;
    public final long vkReleaseSwapchainImagesKHR;
    public final long vkCmdSetEvent2KHR;
    public final long vkCmdResetEvent2KHR;
    public final long vkCmdWaitEvents2KHR;
    public final long vkCmdPipelineBarrier2KHR;
    public final long vkCmdWriteTimestamp2KHR;
    public final long vkQueueSubmit2KHR;
    public final long vkGetSemaphoreCounterValueKHR;
    public final long vkWaitSemaphoresKHR;
    public final long vkSignalSemaphoreKHR;
    public final long vkCmdDecodeVideoKHR;
    public final long vkGetEncodedVideoSessionParametersKHR;
    public final long vkCmdEncodeVideoKHR;
    public final long vkCreateVideoSessionKHR;
    public final long vkDestroyVideoSessionKHR;
    public final long vkGetVideoSessionMemoryRequirementsKHR;
    public final long vkBindVideoSessionMemoryKHR;
    public final long vkCreateVideoSessionParametersKHR;
    public final long vkUpdateVideoSessionParametersKHR;
    public final long vkDestroyVideoSessionParametersKHR;
    public final long vkCmdBeginVideoCodingKHR;
    public final long vkCmdEndVideoCodingKHR;
    public final long vkCmdControlVideoCodingKHR;
    public final long vkCmdSetViewportWScalingNV;
    public final long vkGetClusterAccelerationStructureBuildSizesNV;
    public final long vkCmdBuildClusterAccelerationStructureIndirectNV;
    public final long vkCmdSetComputeOccupancyPriorityNV;
    public final long vkConvertCooperativeVectorMatrixNV;
    public final long vkCmdConvertCooperativeVectorMatrixNV;
    public final long vkCmdCopyMemoryIndirectNV;
    public final long vkCmdCopyMemoryToImageIndirectNV;
    public final long vkCreateCudaModuleNV;
    public final long vkGetCudaModuleCacheNV;
    public final long vkCreateCudaFunctionNV;
    public final long vkDestroyCudaModuleNV;
    public final long vkDestroyCudaFunctionNV;
    public final long vkCmdCudaLaunchKernelNV;
    public final long vkCmdSetCheckpointNV;
    public final long vkGetQueueCheckpointDataNV;
    public final long vkGetQueueCheckpointData2NV;
    public final long vkGetGeneratedCommandsMemoryRequirementsNV;
    public final long vkCmdPreprocessGeneratedCommandsNV;
    public final long vkCmdExecuteGeneratedCommandsNV;
    public final long vkCmdBindPipelineShaderGroupNV;
    public final long vkCreateIndirectCommandsLayoutNV;
    public final long vkDestroyIndirectCommandsLayoutNV;
    public final long vkGetPipelineIndirectMemoryRequirementsNV;
    public final long vkCmdUpdatePipelineIndirectBufferNV;
    public final long vkGetPipelineIndirectDeviceAddressNV;
    public final long vkCreateExternalComputeQueueNV;
    public final long vkDestroyExternalComputeQueueNV;
    public final long vkGetExternalComputeQueueDataNV;
    public final long vkGetMemoryRemoteAddressNV;
    public final long vkGetMemoryWin32HandleNV;
    public final long vkCmdSetFragmentShadingRateEnumNV;
    public final long vkSetLatencySleepModeNV;
    public final long vkLatencySleepNV;
    public final long vkSetLatencyMarkerNV;
    public final long vkGetLatencyTimingsNV;
    public final long vkQueueNotifyOutOfBandNV;
    public final long vkCmdDecompressMemoryNV;
    public final long vkCmdDecompressMemoryIndirectCountNV;
    public final long vkCmdDrawMeshTasksNV;
    public final long vkCmdDrawMeshTasksIndirectNV;
    public final long vkCmdDrawMeshTasksIndirectCountNV;
    public final long vkCreateOpticalFlowSessionNV;
    public final long vkDestroyOpticalFlowSessionNV;
    public final long vkBindOpticalFlowSessionImageNV;
    public final long vkCmdOpticalFlowExecuteNV;
    public final long vkGetPartitionedAccelerationStructuresBuildSizesNV;
    public final long vkCmdBuildPartitionedAccelerationStructuresNV;
    public final long vkCreateAccelerationStructureNV;
    public final long vkDestroyAccelerationStructureNV;
    public final long vkGetAccelerationStructureMemoryRequirementsNV;
    public final long vkBindAccelerationStructureMemoryNV;
    public final long vkCmdBuildAccelerationStructureNV;
    public final long vkCmdCopyAccelerationStructureNV;
    public final long vkCmdTraceRaysNV;
    public final long vkCreateRayTracingPipelinesNV;
    public final long vkGetRayTracingShaderGroupHandlesNV;
    public final long vkGetAccelerationStructureHandleNV;
    public final long vkCmdWriteAccelerationStructuresPropertiesNV;
    public final long vkCompileDeferredNV;
    public final long vkCmdSetExclusiveScissorEnableNV;
    public final long vkCmdSetExclusiveScissorNV;
    public final long vkCmdBindShadingRateImageNV;
    public final long vkCmdSetViewportShadingRatePaletteNV;
    public final long vkCmdSetCoarseSampleOrderNV;
    public final long vkCreateCuModuleNVX;
    public final long vkCreateCuFunctionNVX;
    public final long vkDestroyCuModuleNVX;
    public final long vkDestroyCuFunctionNVX;
    public final long vkCmdCuLaunchKernelNVX;
    public final long vkGetImageViewHandleNVX;
    public final long vkGetImageViewHandle64NVX;
    public final long vkGetImageViewAddressNVX;
    public final long vkGetDeviceCombinedImageSamplerIndexNVX;
    public final long vkCmdBindTileMemoryQCOM;
    public final long vkGetFramebufferTilePropertiesQCOM;
    public final long vkGetDynamicRenderingTilePropertiesQCOM;
    public final long vkCmdDispatchTileQCOM;
    public final long vkCmdBeginPerTileExecutionQCOM;
    public final long vkCmdEndPerTileExecutionQCOM;
    public final long vkGetDescriptorSetLayoutHostMappingInfoVALVE;
    public final long vkGetDescriptorSetHostMappingVALVE;
    public final int apiVersion;
    public final boolean Vulkan10;
    public final boolean Vulkan11;
    public final boolean Vulkan12;
    public final boolean Vulkan13;
    public final boolean Vulkan14;
    public final boolean VK_AMD_anti_lag;
    public final boolean VK_AMD_buffer_marker;
    public final boolean VK_AMD_device_coherent_memory;
    public final boolean VK_AMD_display_native_hdr;
    public final boolean VK_AMD_draw_indirect_count;
    public final boolean VK_AMD_gcn_shader;
    public final boolean VK_AMD_gpu_shader_half_float;
    public final boolean VK_AMD_gpu_shader_int16;
    public final boolean VK_AMD_memory_overallocation_behavior;
    public final boolean VK_AMD_mixed_attachment_samples;
    public final boolean VK_AMD_negative_viewport_height;
    public final boolean VK_AMD_pipeline_compiler_control;
    public final boolean VK_AMD_rasterization_order;
    public final boolean VK_AMD_shader_ballot;
    public final boolean VK_AMD_shader_core_properties;
    public final boolean VK_AMD_shader_core_properties2;
    public final boolean VK_AMD_shader_early_and_late_fragment_tests;
    public final boolean VK_AMD_shader_explicit_vertex_parameter;
    public final boolean VK_AMD_shader_fragment_mask;
    public final boolean VK_AMD_shader_image_load_store_lod;
    public final boolean VK_AMD_shader_info;
    public final boolean VK_AMD_shader_trinary_minmax;
    public final boolean VK_AMD_texture_gather_bias_lod;
    public final boolean VK_AMDX_dense_geometry_format;
    public final boolean VK_AMDX_shader_enqueue;
    public final boolean VK_ANDROID_external_format_resolve;
    public final boolean VK_ANDROID_external_memory_android_hardware_buffer;
    public final boolean VK_ARM_data_graph;
    public final boolean VK_ARM_format_pack;
    public final boolean VK_ARM_performance_counters_by_region;
    public final boolean VK_ARM_pipeline_opacity_micromap;
    public final boolean VK_ARM_rasterization_order_attachment_access;
    public final boolean VK_ARM_render_pass_striped;
    public final boolean VK_ARM_scheduling_controls;
    public final boolean VK_ARM_shader_core_builtins;
    public final boolean VK_ARM_shader_core_properties;
    public final boolean VK_ARM_tensors;
    public final boolean VK_EXT_4444_formats;
    public final boolean VK_EXT_astc_decode_mode;
    public final boolean VK_EXT_attachment_feedback_loop_dynamic_state;
    public final boolean VK_EXT_attachment_feedback_loop_layout;
    public final boolean VK_EXT_blend_operation_advanced;
    public final boolean VK_EXT_border_color_swizzle;
    public final boolean VK_EXT_buffer_device_address;
    public final boolean VK_EXT_calibrated_timestamps;
    public final boolean VK_EXT_color_write_enable;
    public final boolean VK_EXT_conditional_rendering;
    public final boolean VK_EXT_conservative_rasterization;
    public final boolean VK_EXT_custom_border_color;
    public final boolean VK_EXT_custom_resolve;
    public final boolean VK_EXT_debug_marker;
    public final boolean VK_EXT_depth_bias_control;
    public final boolean VK_EXT_depth_clamp_control;
    public final boolean VK_EXT_depth_clamp_zero_one;
    public final boolean VK_EXT_depth_clip_control;
    public final boolean VK_EXT_depth_clip_enable;
    public final boolean VK_EXT_depth_range_unrestricted;
    public final boolean VK_EXT_descriptor_buffer;
    public final boolean VK_EXT_descriptor_heap;
    public final boolean VK_EXT_descriptor_indexing;
    public final boolean VK_EXT_device_address_binding_report;
    public final boolean VK_EXT_device_fault;
    public final boolean VK_EXT_device_generated_commands;
    public final boolean VK_EXT_device_memory_report;
    public final boolean VK_EXT_discard_rectangles;
    public final boolean VK_EXT_display_control;
    public final boolean VK_EXT_dynamic_rendering_unused_attachments;
    public final boolean VK_EXT_extended_dynamic_state;
    public final boolean VK_EXT_extended_dynamic_state2;
    public final boolean VK_EXT_extended_dynamic_state3;
    public final boolean VK_EXT_external_memory_acquire_unmodified;
    public final boolean VK_EXT_external_memory_dma_buf;
    public final boolean VK_EXT_external_memory_host;
    public final boolean VK_EXT_external_memory_metal;
    public final boolean VK_EXT_filter_cubic;
    public final boolean VK_EXT_fragment_density_map;
    public final boolean VK_EXT_fragment_density_map2;
    public final boolean VK_EXT_fragment_density_map_offset;
    public final boolean VK_EXT_fragment_shader_interlock;
    public final boolean VK_EXT_frame_boundary;
    public final boolean VK_EXT_full_screen_exclusive;
    public final boolean VK_EXT_global_priority;
    public final boolean VK_EXT_global_priority_query;
    public final boolean VK_EXT_graphics_pipeline_library;
    public final boolean VK_EXT_hdr_metadata;
    public final boolean VK_EXT_host_image_copy;
    public final boolean VK_EXT_host_query_reset;
    public final boolean VK_EXT_image_2d_view_of_3d;
    public final boolean VK_EXT_image_compression_control;
    public final boolean VK_EXT_image_compression_control_swapchain;
    public final boolean VK_EXT_image_drm_format_modifier;
    public final boolean VK_EXT_image_robustness;
    public final boolean VK_EXT_image_sliced_view_of_3d;
    public final boolean VK_EXT_image_view_min_lod;
    public final boolean VK_EXT_index_type_uint8;
    public final boolean VK_EXT_inline_uniform_block;
    public final boolean VK_EXT_legacy_dithering;
    public final boolean VK_EXT_legacy_vertex_attributes;
    public final boolean VK_EXT_line_rasterization;
    public final boolean VK_EXT_load_store_op_none;
    public final boolean VK_EXT_map_memory_placed;
    public final boolean VK_EXT_memory_budget;
    public final boolean VK_EXT_memory_decompression;
    public final boolean VK_EXT_memory_priority;
    public final boolean VK_EXT_mesh_shader;
    public final boolean VK_EXT_metal_objects;
    public final boolean VK_EXT_multi_draw;
    public final boolean VK_EXT_multisampled_render_to_single_sampled;
    public final boolean VK_EXT_mutable_descriptor_type;
    public final boolean VK_EXT_nested_command_buffer;
    public final boolean VK_EXT_non_seamless_cube_map;
    public final boolean VK_EXT_opacity_micromap;
    public final boolean VK_EXT_pageable_device_local_memory;
    public final boolean VK_EXT_pci_bus_info;
    public final boolean VK_EXT_physical_device_drm;
    public final boolean VK_EXT_pipeline_creation_cache_control;
    public final boolean VK_EXT_pipeline_creation_feedback;
    public final boolean VK_EXT_pipeline_library_group_handles;
    public final boolean VK_EXT_pipeline_properties;
    public final boolean VK_EXT_pipeline_protected_access;
    public final boolean VK_EXT_pipeline_robustness;
    public final boolean VK_EXT_post_depth_coverage;
    public final boolean VK_EXT_present_mode_fifo_latest_ready;
    public final boolean VK_EXT_present_timing;
    public final boolean VK_EXT_primitive_topology_list_restart;
    public final boolean VK_EXT_primitives_generated_query;
    public final boolean VK_EXT_private_data;
    public final boolean VK_EXT_provoking_vertex;
    public final boolean VK_EXT_queue_family_foreign;
    public final boolean VK_EXT_rasterization_order_attachment_access;
    public final boolean VK_EXT_ray_tracing_invocation_reorder;
    public final boolean VK_EXT_rgba10x6_formats;
    public final boolean VK_EXT_robustness2;
    public final boolean VK_EXT_sample_locations;
    public final boolean VK_EXT_sampler_filter_minmax;
    public final boolean VK_EXT_scalar_block_layout;
    public final boolean VK_EXT_separate_stencil_usage;
    public final boolean VK_EXT_shader_64bit_indexing;
    public final boolean VK_EXT_shader_atomic_float;
    public final boolean VK_EXT_shader_atomic_float2;
    public final boolean VK_EXT_shader_demote_to_helper_invocation;
    public final boolean VK_EXT_shader_float8;
    public final boolean VK_EXT_shader_image_atomic_int64;
    public final boolean VK_EXT_shader_long_vector;
    public final boolean VK_EXT_shader_module_identifier;
    public final boolean VK_EXT_shader_object;
    public final boolean VK_EXT_shader_replicated_composites;
    public final boolean VK_EXT_shader_stencil_export;
    public final boolean VK_EXT_shader_subgroup_ballot;
    public final boolean VK_EXT_shader_subgroup_partitioned;
    public final boolean VK_EXT_shader_subgroup_vote;
    public final boolean VK_EXT_shader_tile_image;
    public final boolean VK_EXT_shader_uniform_buffer_unsized_array;
    public final boolean VK_EXT_shader_viewport_index_layer;
    public final boolean VK_EXT_subgroup_size_control;
    public final boolean VK_EXT_subpass_merge_feedback;
    public final boolean VK_EXT_swapchain_maintenance1;
    public final boolean VK_EXT_texel_buffer_alignment;
    public final boolean VK_EXT_texture_compression_astc_3d;
    public final boolean VK_EXT_texture_compression_astc_hdr;
    public final boolean VK_EXT_tooling_info;
    public final boolean VK_EXT_transform_feedback;
    public final boolean VK_EXT_validation_cache;
    public final boolean VK_EXT_vertex_attribute_divisor;
    public final boolean VK_EXT_vertex_attribute_robustness;
    public final boolean VK_EXT_vertex_input_dynamic_state;
    public final boolean VK_EXT_ycbcr_2plane_444_formats;
    public final boolean VK_EXT_ycbcr_image_arrays;
    public final boolean VK_EXT_zero_initialize_device_memory;
    public final boolean VK_GOOGLE_decorate_string;
    public final boolean VK_GOOGLE_display_timing;
    public final boolean VK_GOOGLE_hlsl_functionality1;
    public final boolean VK_GOOGLE_user_type;
    public final boolean VK_HUAWEI_cluster_culling_shader;
    public final boolean VK_HUAWEI_hdr_vivid;
    public final boolean VK_HUAWEI_invocation_mask;
    public final boolean VK_HUAWEI_subpass_shading;
    public final boolean VK_IMG_filter_cubic;
    public final boolean VK_IMG_format_pvrtc;
    public final boolean VK_IMG_relaxed_line_rasterization;
    public final boolean VK_INTEL_performance_query;
    public final boolean VK_INTEL_shader_integer_functions2;
    public final boolean VK_KHR_16bit_storage;
    public final boolean VK_KHR_8bit_storage;
    public final boolean VK_KHR_acceleration_structure;
    public final boolean VK_KHR_bind_memory2;
    public final boolean VK_KHR_buffer_device_address;
    public final boolean VK_KHR_calibrated_timestamps;
    public final boolean VK_KHR_compute_shader_derivatives;
    public final boolean VK_KHR_cooperative_matrix;
    public final boolean VK_KHR_copy_commands2;
    public final boolean VK_KHR_copy_memory_indirect;
    public final boolean VK_KHR_create_renderpass2;
    public final boolean VK_KHR_dedicated_allocation;
    public final boolean VK_KHR_deferred_host_operations;
    public final boolean VK_KHR_depth_clamp_zero_one;
    public final boolean VK_KHR_depth_stencil_resolve;
    public final boolean VK_KHR_descriptor_update_template;
    public final boolean VK_KHR_device_group;
    public final boolean VK_KHR_display_swapchain;
    public final boolean VK_KHR_draw_indirect_count;
    public final boolean VK_KHR_driver_properties;
    public final boolean VK_KHR_dynamic_rendering;
    public final boolean VK_KHR_dynamic_rendering_local_read;
    public final boolean VK_KHR_external_fence;
    public final boolean VK_KHR_external_fence_fd;
    public final boolean VK_KHR_external_fence_win32;
    public final boolean VK_KHR_external_memory;
    public final boolean VK_KHR_external_memory_fd;
    public final boolean VK_KHR_external_memory_win32;
    public final boolean VK_KHR_external_semaphore;
    public final boolean VK_KHR_external_semaphore_fd;
    public final boolean VK_KHR_external_semaphore_win32;
    public final boolean VK_KHR_format_feature_flags2;
    public final boolean VK_KHR_fragment_shader_barycentric;
    public final boolean VK_KHR_fragment_shading_rate;
    public final boolean VK_KHR_get_memory_requirements2;
    public final boolean VK_KHR_global_priority;
    public final boolean VK_KHR_image_format_list;
    public final boolean VK_KHR_imageless_framebuffer;
    public final boolean VK_KHR_incremental_present;
    public final boolean VK_KHR_index_type_uint8;
    public final boolean VK_KHR_internally_synchronized_queues;
    public final boolean VK_KHR_line_rasterization;
    public final boolean VK_KHR_load_store_op_none;
    public final boolean VK_KHR_maintenance1;
    public final boolean VK_KHR_maintenance10;
    public final boolean VK_KHR_maintenance2;
    public final boolean VK_KHR_maintenance3;
    public final boolean VK_KHR_maintenance4;
    public final boolean VK_KHR_maintenance5;
    public final boolean VK_KHR_maintenance6;
    public final boolean VK_KHR_maintenance7;
    public final boolean VK_KHR_maintenance8;
    public final boolean VK_KHR_maintenance9;
    public final boolean VK_KHR_map_memory2;
    public final boolean VK_KHR_multiview;
    public final boolean VK_KHR_performance_query;
    public final boolean VK_KHR_pipeline_binary;
    public final boolean VK_KHR_pipeline_executable_properties;
    public final boolean VK_KHR_pipeline_library;
    public final boolean VK_KHR_portability_subset;
    public final boolean VK_KHR_present_id;
    public final boolean VK_KHR_present_id2;
    public final boolean VK_KHR_present_mode_fifo_latest_ready;
    public final boolean VK_KHR_present_wait;
    public final boolean VK_KHR_present_wait2;
    public final boolean VK_KHR_push_descriptor;
    public final boolean VK_KHR_ray_query;
    public final boolean VK_KHR_ray_tracing_maintenance1;
    public final boolean VK_KHR_ray_tracing_pipeline;
    public final boolean VK_KHR_ray_tracing_position_fetch;
    public final boolean VK_KHR_relaxed_block_layout;
    public final boolean VK_KHR_robustness2;
    public final boolean VK_KHR_sampler_mirror_clamp_to_edge;
    public final boolean VK_KHR_sampler_ycbcr_conversion;
    public final boolean VK_KHR_separate_depth_stencil_layouts;
    public final boolean VK_KHR_shader_atomic_int64;
    public final boolean VK_KHR_shader_bfloat16;
    public final boolean VK_KHR_shader_clock;
    public final boolean VK_KHR_shader_draw_parameters;
    public final boolean VK_KHR_shader_expect_assume;
    public final boolean VK_KHR_shader_float16_int8;
    public final boolean VK_KHR_shader_float_controls;
    public final boolean VK_KHR_shader_float_controls2;
    public final boolean VK_KHR_shader_fma;
    public final boolean VK_KHR_shader_integer_dot_product;
    public final boolean VK_KHR_shader_maximal_reconvergence;
    public final boolean VK_KHR_shader_non_semantic_info;
    public final boolean VK_KHR_shader_quad_control;
    public final boolean VK_KHR_shader_relaxed_extended_instruction;
    public final boolean VK_KHR_shader_subgroup_extended_types;
    public final boolean VK_KHR_shader_subgroup_rotate;
    public final boolean VK_KHR_shader_subgroup_uniform_control_flow;
    public final boolean VK_KHR_shader_terminate_invocation;
    public final boolean VK_KHR_shader_untyped_pointers;
    public final boolean VK_KHR_shared_presentable_image;
    public final boolean VK_KHR_spirv_1_4;
    public final boolean VK_KHR_storage_buffer_storage_class;
    public final boolean VK_KHR_swapchain;
    public final boolean VK_KHR_swapchain_maintenance1;
    public final boolean VK_KHR_swapchain_mutable_format;
    public final boolean VK_KHR_synchronization2;
    public final boolean VK_KHR_timeline_semaphore;
    public final boolean VK_KHR_unified_image_layouts;
    public final boolean VK_KHR_uniform_buffer_standard_layout;
    public final boolean VK_KHR_variable_pointers;
    public final boolean VK_KHR_vertex_attribute_divisor;
    public final boolean VK_KHR_video_decode_av1;
    public final boolean VK_KHR_video_decode_h264;
    public final boolean VK_KHR_video_decode_h265;
    public final boolean VK_KHR_video_decode_queue;
    public final boolean VK_KHR_video_decode_vp9;
    public final boolean VK_KHR_video_encode_av1;
    public final boolean VK_KHR_video_encode_h264;
    public final boolean VK_KHR_video_encode_h265;
    public final boolean VK_KHR_video_encode_intra_refresh;
    public final boolean VK_KHR_video_encode_quantization_map;
    public final boolean VK_KHR_video_encode_queue;
    public final boolean VK_KHR_video_maintenance1;
    public final boolean VK_KHR_video_maintenance2;
    public final boolean VK_KHR_video_queue;
    public final boolean VK_KHR_vulkan_memory_model;
    public final boolean VK_KHR_win32_keyed_mutex;
    public final boolean VK_KHR_workgroup_memory_explicit_layout;
    public final boolean VK_KHR_zero_initialize_workgroup_memory;
    public final boolean VK_MESA_image_alignment_control;
    public final boolean VK_MSFT_layered_driver;
    public final boolean VK_NV_acquire_winrt_display;
    public final boolean VK_NV_clip_space_w_scaling;
    public final boolean VK_NV_cluster_acceleration_structure;
    public final boolean VK_NV_command_buffer_inheritance;
    public final boolean VK_NV_compute_occupancy_priority;
    public final boolean VK_NV_compute_shader_derivatives;
    public final boolean VK_NV_cooperative_matrix;
    public final boolean VK_NV_cooperative_matrix2;
    public final boolean VK_NV_cooperative_vector;
    public final boolean VK_NV_copy_memory_indirect;
    public final boolean VK_NV_corner_sampled_image;
    public final boolean VK_NV_coverage_reduction_mode;
    public final boolean VK_NV_cuda_kernel_launch;
    public final boolean VK_NV_dedicated_allocation;
    public final boolean VK_NV_dedicated_allocation_image_aliasing;
    public final boolean VK_NV_descriptor_pool_overallocation;
    public final boolean VK_NV_device_diagnostic_checkpoints;
    public final boolean VK_NV_device_diagnostics_config;
    public final boolean VK_NV_device_generated_commands;
    public final boolean VK_NV_device_generated_commands_compute;
    public final boolean VK_NV_displacement_micromap;
    public final boolean VK_NV_extended_sparse_address_space;
    public final boolean VK_NV_external_compute_queue;
    public final boolean VK_NV_external_memory;
    public final boolean VK_NV_external_memory_rdma;
    public final boolean VK_NV_external_memory_win32;
    public final boolean VK_NV_fill_rectangle;
    public final boolean VK_NV_fragment_coverage_to_color;
    public final boolean VK_NV_fragment_shader_barycentric;
    public final boolean VK_NV_fragment_shading_rate_enums;
    public final boolean VK_NV_framebuffer_mixed_samples;
    public final boolean VK_NV_geometry_shader_passthrough;
    public final boolean VK_NV_glsl_shader;
    public final boolean VK_NV_inherited_viewport_scissor;
    public final boolean VK_NV_linear_color_attachment;
    public final boolean VK_NV_low_latency;
    public final boolean VK_NV_low_latency2;
    public final boolean VK_NV_memory_decompression;
    public final boolean VK_NV_mesh_shader;
    public final boolean VK_NV_optical_flow;
    public final boolean VK_NV_partitioned_acceleration_structure;
    public final boolean VK_NV_per_stage_descriptor_set;
    public final boolean VK_NV_present_barrier;
    public final boolean VK_NV_present_metering;
    public final boolean VK_NV_push_constant_bank;
    public final boolean VK_NV_raw_access_chains;
    public final boolean VK_NV_ray_tracing;
    public final boolean VK_NV_ray_tracing_invocation_reorder;
    public final boolean VK_NV_ray_tracing_linear_swept_spheres;
    public final boolean VK_NV_ray_tracing_motion_blur;
    public final boolean VK_NV_ray_tracing_validation;
    public final boolean VK_NV_representative_fragment_test;
    public final boolean VK_NV_sample_mask_override_coverage;
    public final boolean VK_NV_scissor_exclusive;
    public final boolean VK_NV_shader_atomic_float16_vector;
    public final boolean VK_NV_shader_image_footprint;
    public final boolean VK_NV_shader_sm_builtins;
    public final boolean VK_NV_shader_subgroup_partitioned;
    public final boolean VK_NV_shading_rate_image;
    public final boolean VK_NV_viewport_array2;
    public final boolean VK_NV_viewport_swizzle;
    public final boolean VK_NV_win32_keyed_mutex;
    public final boolean VK_NVX_binary_import;
    public final boolean VK_NVX_image_view_handle;
    public final boolean VK_NVX_multiview_per_view_attributes;
    public final boolean VK_QCOM_cooperative_matrix_conversion;
    public final boolean VK_QCOM_data_graph_model;
    public final boolean VK_QCOM_filter_cubic_clamp;
    public final boolean VK_QCOM_filter_cubic_weights;
    public final boolean VK_QCOM_fragment_density_map_offset;
    public final boolean VK_QCOM_image_processing;
    public final boolean VK_QCOM_image_processing2;
    public final boolean VK_QCOM_multiview_per_view_render_areas;
    public final boolean VK_QCOM_multiview_per_view_viewports;
    public final boolean VK_QCOM_render_pass_shader_resolve;
    public final boolean VK_QCOM_render_pass_store_ops;
    public final boolean VK_QCOM_render_pass_transform;
    public final boolean VK_QCOM_rotated_copy_commands;
    public final boolean VK_QCOM_tile_memory_heap;
    public final boolean VK_QCOM_tile_properties;
    public final boolean VK_QCOM_tile_shading;
    public final boolean VK_QCOM_ycbcr_degamma;
    public final boolean VK_SEC_amigo_profiling;
    public final boolean VK_SEC_pipeline_cache_incremental_mode;
    public final boolean STD_VIDEO_STD_vulkan_video_codec_av1;
    public final boolean STD_VIDEO_STD_vulkan_video_codec_h264;
    public final boolean STD_VIDEO_STD_vulkan_video_codec_h265;
    public final boolean STD_VIDEO_STD_vulkan_video_codec_vp9;
    public final boolean VK_VALVE_descriptor_set_host_mapping;
    public final boolean VK_VALVE_fragment_density_map_layered;
    public final boolean VK_VALVE_mutable_descriptor_type;
    public final boolean VK_VALVE_video_encode_rgb_conversion;

    VKCapabilitiesDevice(FunctionProvider provider, VKCapabilitiesInstance capsInstance, int apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;
        long[] caps = new long[647];
        this.Vulkan10 = check_VK10(provider, caps, ext);
        this.Vulkan11 = check_VK11(provider, caps, ext);
        this.Vulkan12 = check_VK12(provider, caps, ext);
        this.Vulkan13 = check_VK13(provider, caps, ext);
        this.Vulkan14 = check_VK14(provider, caps, ext);
        this.VK_AMD_anti_lag = check_AMD_anti_lag(provider, caps, ext);
        this.VK_AMD_buffer_marker = check_AMD_buffer_marker(provider, caps, ext);
        this.VK_AMD_device_coherent_memory = ext.contains(AMDDeviceCoherentMemory.VK_AMD_DEVICE_COHERENT_MEMORY_EXTENSION_NAME);
        this.VK_AMD_display_native_hdr = check_AMD_display_native_hdr(provider, caps, ext);
        this.VK_AMD_draw_indirect_count = check_AMD_draw_indirect_count(provider, caps, ext);
        this.VK_AMD_gcn_shader = ext.contains(AMDGCNShader.VK_AMD_GCN_SHADER_EXTENSION_NAME);
        this.VK_AMD_gpu_shader_half_float = ext.contains(AMDGPUShaderHalfFloat.VK_AMD_GPU_SHADER_HALF_FLOAT_EXTENSION_NAME);
        this.VK_AMD_gpu_shader_int16 = ext.contains(AMDGPUShaderInt16.VK_AMD_GPU_SHADER_INT16_EXTENSION_NAME);
        this.VK_AMD_memory_overallocation_behavior = ext.contains(AMDMemoryOverallocationBehavior.VK_AMD_MEMORY_OVERALLOCATION_BEHAVIOR_EXTENSION_NAME);
        this.VK_AMD_mixed_attachment_samples = ext.contains(AMDMixedAttachmentSamples.VK_AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME);
        this.VK_AMD_negative_viewport_height = ext.contains(AMDNegativeViewportHeight.VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_EXTENSION_NAME);
        this.VK_AMD_pipeline_compiler_control = ext.contains(AMDPipelineCompilerControl.VK_AMD_PIPELINE_COMPILER_CONTROL_EXTENSION_NAME);
        this.VK_AMD_rasterization_order = ext.contains(AMDRasterizationOrder.VK_AMD_RASTERIZATION_ORDER_EXTENSION_NAME);
        this.VK_AMD_shader_ballot = ext.contains(AMDShaderBallot.VK_AMD_SHADER_BALLOT_EXTENSION_NAME);
        this.VK_AMD_shader_core_properties = ext.contains(AMDShaderCoreProperties.VK_AMD_SHADER_CORE_PROPERTIES_EXTENSION_NAME);
        this.VK_AMD_shader_core_properties2 = ext.contains(AMDShaderCoreProperties2.VK_AMD_SHADER_CORE_PROPERTIES_2_EXTENSION_NAME);
        this.VK_AMD_shader_early_and_late_fragment_tests = ext.contains(AMDShaderEarlyAndLateFragmentTests.VK_AMD_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_EXTENSION_NAME);
        this.VK_AMD_shader_explicit_vertex_parameter = ext.contains(AMDShaderExplicitVertexParameter.VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME);
        this.VK_AMD_shader_fragment_mask = ext.contains(AMDShaderFragmentMask.VK_AMD_SHADER_FRAGMENT_MASK_EXTENSION_NAME);
        this.VK_AMD_shader_image_load_store_lod = ext.contains(AMDShaderImageLoadStoreLod.VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_EXTENSION_NAME);
        this.VK_AMD_shader_info = check_AMD_shader_info(provider, caps, ext);
        this.VK_AMD_shader_trinary_minmax = ext.contains(AMDShaderTrinaryMinmax.VK_AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME);
        this.VK_AMD_texture_gather_bias_lod = ext.contains(AMDTextureGatherBiasLod.VK_AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME);
        this.VK_AMDX_dense_geometry_format = ext.contains(AMDXDenseGeometryFormat.VK_AMDX_DENSE_GEOMETRY_FORMAT_EXTENSION_NAME);
        this.VK_AMDX_shader_enqueue = check_AMDX_shader_enqueue(provider, caps, ext);
        this.VK_ANDROID_external_format_resolve = ext.contains(ANDROIDExternalFormatResolve.VK_ANDROID_EXTERNAL_FORMAT_RESOLVE_EXTENSION_NAME);
        this.VK_ANDROID_external_memory_android_hardware_buffer = check_ANDROID_external_memory_android_hardware_buffer(provider, caps, ext);
        this.VK_ARM_data_graph = check_ARM_data_graph(provider, caps, ext);
        this.VK_ARM_format_pack = ext.contains(ARMFormatPack.VK_ARM_FORMAT_PACK_EXTENSION_NAME);
        this.VK_ARM_performance_counters_by_region = ext.contains(ARMPerformanceCountersByRegion.VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_EXTENSION_NAME);
        this.VK_ARM_pipeline_opacity_micromap = ext.contains(ARMPipelineOpacityMicromap.VK_ARM_PIPELINE_OPACITY_MICROMAP_EXTENSION_NAME);
        this.VK_ARM_rasterization_order_attachment_access = ext.contains(ARMRasterizationOrderAttachmentAccess.VK_ARM_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_EXTENSION_NAME);
        this.VK_ARM_render_pass_striped = ext.contains(ARMRenderPassStriped.VK_ARM_RENDER_PASS_STRIPED_EXTENSION_NAME);
        this.VK_ARM_scheduling_controls = ext.contains(ARMSchedulingControls.VK_ARM_SCHEDULING_CONTROLS_EXTENSION_NAME);
        this.VK_ARM_shader_core_builtins = ext.contains(ARMShaderCoreBuiltins.VK_ARM_SHADER_CORE_BUILTINS_EXTENSION_NAME);
        this.VK_ARM_shader_core_properties = ext.contains(ARMShaderCoreProperties.VK_ARM_SHADER_CORE_PROPERTIES_EXTENSION_NAME);
        this.VK_ARM_tensors = check_ARM_tensors(provider, caps, ext);
        this.VK_EXT_4444_formats = ext.contains(EXT4444Formats.VK_EXT_4444_FORMATS_EXTENSION_NAME);
        this.VK_EXT_astc_decode_mode = ext.contains(EXTAstcDecodeMode.VK_EXT_ASTC_DECODE_MODE_EXTENSION_NAME);
        this.VK_EXT_attachment_feedback_loop_dynamic_state = check_EXT_attachment_feedback_loop_dynamic_state(provider, caps, ext);
        this.VK_EXT_attachment_feedback_loop_layout = ext.contains(EXTAttachmentFeedbackLoopLayout.VK_EXT_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_EXTENSION_NAME);
        this.VK_EXT_blend_operation_advanced = ext.contains(EXTBlendOperationAdvanced.VK_EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME);
        this.VK_EXT_border_color_swizzle = ext.contains(EXTBorderColorSwizzle.VK_EXT_BORDER_COLOR_SWIZZLE_EXTENSION_NAME);
        this.VK_EXT_buffer_device_address = check_EXT_buffer_device_address(provider, caps, ext);
        this.VK_EXT_calibrated_timestamps = check_EXT_calibrated_timestamps(provider, caps, ext);
        this.VK_EXT_color_write_enable = check_EXT_color_write_enable(provider, caps, ext);
        this.VK_EXT_conditional_rendering = check_EXT_conditional_rendering(provider, caps, ext);
        this.VK_EXT_conservative_rasterization = ext.contains(EXTConservativeRasterization.VK_EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME);
        this.VK_EXT_custom_border_color = ext.contains(EXTCustomBorderColor.VK_EXT_CUSTOM_BORDER_COLOR_EXTENSION_NAME);
        this.VK_EXT_custom_resolve = check_EXT_custom_resolve(provider, caps, ext);
        this.VK_EXT_debug_marker = check_EXT_debug_marker(provider, caps, ext);
        this.VK_EXT_depth_bias_control = check_EXT_depth_bias_control(provider, caps, ext);
        this.VK_EXT_depth_clamp_control = check_EXT_depth_clamp_control(provider, caps, ext);
        this.VK_EXT_depth_clamp_zero_one = ext.contains(EXTDepthClampZeroOne.VK_EXT_DEPTH_CLAMP_ZERO_ONE_EXTENSION_NAME);
        this.VK_EXT_depth_clip_control = ext.contains(EXTDepthClipControl.VK_EXT_DEPTH_CLIP_CONTROL_EXTENSION_NAME);
        this.VK_EXT_depth_clip_enable = ext.contains(EXTDepthClipEnable.VK_EXT_DEPTH_CLIP_ENABLE_EXTENSION_NAME);
        this.VK_EXT_depth_range_unrestricted = ext.contains(EXTDepthRangeUnrestricted.VK_EXT_DEPTH_RANGE_UNRESTRICTED_EXTENSION_NAME);
        this.VK_EXT_descriptor_buffer = check_EXT_descriptor_buffer(provider, caps, ext);
        this.VK_EXT_descriptor_heap = check_EXT_descriptor_heap(provider, caps, ext);
        this.VK_EXT_descriptor_indexing = ext.contains(EXTDescriptorIndexing.VK_EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME);
        this.VK_EXT_device_address_binding_report = ext.contains(EXTDeviceAddressBindingReport.VK_EXT_DEVICE_ADDRESS_BINDING_REPORT_EXTENSION_NAME);
        this.VK_EXT_device_fault = check_EXT_device_fault(provider, caps, ext);
        this.VK_EXT_device_generated_commands = check_EXT_device_generated_commands(provider, caps, ext);
        this.VK_EXT_device_memory_report = ext.contains(EXTDeviceMemoryReport.VK_EXT_DEVICE_MEMORY_REPORT_EXTENSION_NAME);
        this.VK_EXT_discard_rectangles = check_EXT_discard_rectangles(provider, caps, ext);
        this.VK_EXT_display_control = check_EXT_display_control(provider, caps, ext);
        this.VK_EXT_dynamic_rendering_unused_attachments = ext.contains(EXTDynamicRenderingUnusedAttachments.VK_EXT_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_EXTENSION_NAME);
        this.VK_EXT_extended_dynamic_state = check_EXT_extended_dynamic_state(provider, caps, ext);
        this.VK_EXT_extended_dynamic_state2 = check_EXT_extended_dynamic_state2(provider, caps, ext);
        this.VK_EXT_extended_dynamic_state3 = check_EXT_extended_dynamic_state3(provider, caps, ext);
        this.VK_EXT_external_memory_acquire_unmodified = ext.contains(EXTExternalMemoryAcquireUnmodified.VK_EXT_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXTENSION_NAME);
        this.VK_EXT_external_memory_dma_buf = ext.contains(EXTExternalMemoryDmaBuf.VK_EXT_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME);
        this.VK_EXT_external_memory_host = check_EXT_external_memory_host(provider, caps, ext);
        this.VK_EXT_external_memory_metal = check_EXT_external_memory_metal(provider, caps, ext);
        this.VK_EXT_filter_cubic = ext.contains(EXTFilterCubic.VK_EXT_FILTER_CUBIC_EXTENSION_NAME);
        this.VK_EXT_fragment_density_map = ext.contains(EXTFragmentDensityMap.VK_EXT_FRAGMENT_DENSITY_MAP_EXTENSION_NAME);
        this.VK_EXT_fragment_density_map2 = ext.contains(EXTFragmentDensityMap2.VK_EXT_FRAGMENT_DENSITY_MAP_2_EXTENSION_NAME);
        this.VK_EXT_fragment_density_map_offset = check_EXT_fragment_density_map_offset(provider, caps, ext);
        this.VK_EXT_fragment_shader_interlock = ext.contains(EXTFragmentShaderInterlock.VK_EXT_FRAGMENT_SHADER_INTERLOCK_EXTENSION_NAME);
        this.VK_EXT_frame_boundary = ext.contains(EXTFrameBoundary.VK_EXT_FRAME_BOUNDARY_EXTENSION_NAME);
        this.VK_EXT_full_screen_exclusive = check_EXT_full_screen_exclusive(provider, caps, ext);
        this.VK_EXT_global_priority = ext.contains(EXTGlobalPriority.VK_EXT_GLOBAL_PRIORITY_EXTENSION_NAME);
        this.VK_EXT_global_priority_query = ext.contains(EXTGlobalPriorityQuery.VK_EXT_GLOBAL_PRIORITY_QUERY_EXTENSION_NAME);
        this.VK_EXT_graphics_pipeline_library = ext.contains(EXTGraphicsPipelineLibrary.VK_EXT_GRAPHICS_PIPELINE_LIBRARY_EXTENSION_NAME);
        this.VK_EXT_hdr_metadata = check_EXT_hdr_metadata(provider, caps, ext);
        this.VK_EXT_host_image_copy = check_EXT_host_image_copy(provider, caps, ext);
        this.VK_EXT_host_query_reset = check_EXT_host_query_reset(provider, caps, ext);
        this.VK_EXT_image_2d_view_of_3d = ext.contains(EXTImage2dViewOf3d.VK_EXT_IMAGE_2D_VIEW_OF_3D_EXTENSION_NAME);
        this.VK_EXT_image_compression_control = check_EXT_image_compression_control(provider, caps, ext);
        this.VK_EXT_image_compression_control_swapchain = ext.contains(EXTImageCompressionControlSwapchain.VK_EXT_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_EXTENSION_NAME);
        this.VK_EXT_image_drm_format_modifier = check_EXT_image_drm_format_modifier(provider, caps, ext);
        this.VK_EXT_image_robustness = ext.contains(EXTImageRobustness.VK_EXT_IMAGE_ROBUSTNESS_EXTENSION_NAME);
        this.VK_EXT_image_sliced_view_of_3d = ext.contains(EXTImageSlicedViewOf3d.VK_EXT_IMAGE_SLICED_VIEW_OF_3D_EXTENSION_NAME);
        this.VK_EXT_image_view_min_lod = ext.contains(EXTImageViewMinLod.VK_EXT_IMAGE_VIEW_MIN_LOD_EXTENSION_NAME);
        this.VK_EXT_index_type_uint8 = ext.contains(EXTIndexTypeUint8.VK_EXT_INDEX_TYPE_UINT8_EXTENSION_NAME);
        this.VK_EXT_inline_uniform_block = ext.contains(EXTInlineUniformBlock.VK_EXT_INLINE_UNIFORM_BLOCK_EXTENSION_NAME);
        this.VK_EXT_legacy_dithering = ext.contains(EXTLegacyDithering.VK_EXT_LEGACY_DITHERING_EXTENSION_NAME);
        this.VK_EXT_legacy_vertex_attributes = ext.contains(EXTLegacyVertexAttributes.VK_EXT_LEGACY_VERTEX_ATTRIBUTES_EXTENSION_NAME);
        this.VK_EXT_line_rasterization = check_EXT_line_rasterization(provider, caps, ext);
        this.VK_EXT_load_store_op_none = ext.contains(EXTLoadStoreOpNone.VK_EXT_LOAD_STORE_OP_NONE_EXTENSION_NAME);
        this.VK_EXT_map_memory_placed = ext.contains(EXTMapMemoryPlaced.VK_EXT_MAP_MEMORY_PLACED_EXTENSION_NAME);
        this.VK_EXT_memory_budget = ext.contains(EXTMemoryBudget.VK_EXT_MEMORY_BUDGET_EXTENSION_NAME);
        this.VK_EXT_memory_decompression = check_EXT_memory_decompression(provider, caps, ext);
        this.VK_EXT_memory_priority = ext.contains(EXTMemoryPriority.VK_EXT_MEMORY_PRIORITY_EXTENSION_NAME);
        this.VK_EXT_mesh_shader = check_EXT_mesh_shader(provider, caps, ext);
        this.VK_EXT_metal_objects = check_EXT_metal_objects(provider, caps, ext);
        this.VK_EXT_multi_draw = check_EXT_multi_draw(provider, caps, ext);
        this.VK_EXT_multisampled_render_to_single_sampled = ext.contains(EXTMultisampledRenderToSingleSampled.VK_EXT_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_EXTENSION_NAME);
        this.VK_EXT_mutable_descriptor_type = ext.contains(EXTMutableDescriptorType.VK_EXT_MUTABLE_DESCRIPTOR_TYPE_EXTENSION_NAME);
        this.VK_EXT_nested_command_buffer = ext.contains(EXTNestedCommandBuffer.VK_EXT_NESTED_COMMAND_BUFFER_EXTENSION_NAME);
        this.VK_EXT_non_seamless_cube_map = ext.contains(EXTNonSeamlessCubeMap.VK_EXT_NON_SEAMLESS_CUBE_MAP_EXTENSION_NAME);
        this.VK_EXT_opacity_micromap = check_EXT_opacity_micromap(provider, caps, ext);
        this.VK_EXT_pageable_device_local_memory = check_EXT_pageable_device_local_memory(provider, caps, ext);
        this.VK_EXT_pci_bus_info = ext.contains(EXTPciBusInfo.VK_EXT_PCI_BUS_INFO_EXTENSION_NAME);
        this.VK_EXT_physical_device_drm = ext.contains(EXTPhysicalDeviceDrm.VK_EXT_PHYSICAL_DEVICE_DRM_EXTENSION_NAME);
        this.VK_EXT_pipeline_creation_cache_control = ext.contains(EXTPipelineCreationCacheControl.VK_EXT_PIPELINE_CREATION_CACHE_CONTROL_EXTENSION_NAME);
        this.VK_EXT_pipeline_creation_feedback = ext.contains(EXTPipelineCreationFeedback.VK_EXT_PIPELINE_CREATION_FEEDBACK_EXTENSION_NAME);
        this.VK_EXT_pipeline_library_group_handles = ext.contains(EXTPipelineLibraryGroupHandles.VK_EXT_PIPELINE_LIBRARY_GROUP_HANDLES_EXTENSION_NAME);
        this.VK_EXT_pipeline_properties = check_EXT_pipeline_properties(provider, caps, ext);
        this.VK_EXT_pipeline_protected_access = ext.contains(EXTPipelineProtectedAccess.VK_EXT_PIPELINE_PROTECTED_ACCESS_EXTENSION_NAME);
        this.VK_EXT_pipeline_robustness = ext.contains(EXTPipelineRobustness.VK_EXT_PIPELINE_ROBUSTNESS_EXTENSION_NAME);
        this.VK_EXT_post_depth_coverage = ext.contains(EXTPostDepthCoverage.VK_EXT_POST_DEPTH_COVERAGE_EXTENSION_NAME);
        this.VK_EXT_present_mode_fifo_latest_ready = ext.contains(EXTPresentModeFifoLatestReady.VK_EXT_PRESENT_MODE_FIFO_LATEST_READY_EXTENSION_NAME);
        this.VK_EXT_present_timing = check_EXT_present_timing(provider, caps, ext);
        this.VK_EXT_primitive_topology_list_restart = ext.contains(EXTPrimitiveTopologyListRestart.VK_EXT_PRIMITIVE_TOPOLOGY_LIST_RESTART_EXTENSION_NAME);
        this.VK_EXT_primitives_generated_query = ext.contains(EXTPrimitivesGeneratedQuery.VK_EXT_PRIMITIVES_GENERATED_QUERY_EXTENSION_NAME);
        this.VK_EXT_private_data = check_EXT_private_data(provider, caps, ext);
        this.VK_EXT_provoking_vertex = ext.contains(EXTProvokingVertex.VK_EXT_PROVOKING_VERTEX_EXTENSION_NAME);
        this.VK_EXT_queue_family_foreign = ext.contains(EXTQueueFamilyForeign.VK_EXT_QUEUE_FAMILY_FOREIGN_EXTENSION_NAME);
        this.VK_EXT_rasterization_order_attachment_access = ext.contains(EXTRasterizationOrderAttachmentAccess.VK_EXT_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_EXTENSION_NAME);
        this.VK_EXT_ray_tracing_invocation_reorder = ext.contains(EXTRayTracingInvocationReorder.VK_EXT_RAY_TRACING_INVOCATION_REORDER_EXTENSION_NAME);
        this.VK_EXT_rgba10x6_formats = ext.contains(EXTRgba10x6Formats.VK_EXT_RGBA10X6_FORMATS_EXTENSION_NAME);
        this.VK_EXT_robustness2 = ext.contains(EXTRobustness2.VK_EXT_ROBUSTNESS_2_EXTENSION_NAME);
        this.VK_EXT_sample_locations = check_EXT_sample_locations(provider, caps, ext);
        this.VK_EXT_sampler_filter_minmax = ext.contains(EXTSamplerFilterMinmax.VK_EXT_SAMPLER_FILTER_MINMAX_EXTENSION_NAME);
        this.VK_EXT_scalar_block_layout = ext.contains(EXTScalarBlockLayout.VK_EXT_SCALAR_BLOCK_LAYOUT_EXTENSION_NAME);
        this.VK_EXT_separate_stencil_usage = ext.contains(EXTSeparateStencilUsage.VK_EXT_SEPARATE_STENCIL_USAGE_EXTENSION_NAME);
        this.VK_EXT_shader_64bit_indexing = ext.contains(EXTShader64bitIndexing.VK_EXT_SHADER_64BIT_INDEXING_EXTENSION_NAME);
        this.VK_EXT_shader_atomic_float = ext.contains(EXTShaderAtomicFloat.VK_EXT_SHADER_ATOMIC_FLOAT_EXTENSION_NAME);
        this.VK_EXT_shader_atomic_float2 = ext.contains(EXTShaderAtomicFloat2.VK_EXT_SHADER_ATOMIC_FLOAT_2_EXTENSION_NAME);
        this.VK_EXT_shader_demote_to_helper_invocation = ext.contains(EXTShaderDemoteToHelperInvocation.VK_EXT_SHADER_DEMOTE_TO_HELPER_INVOCATION_EXTENSION_NAME);
        this.VK_EXT_shader_float8 = ext.contains(EXTShaderFloat8.VK_EXT_SHADER_FLOAT8_EXTENSION_NAME);
        this.VK_EXT_shader_image_atomic_int64 = ext.contains(EXTShaderImageAtomicInt64.VK_EXT_SHADER_IMAGE_ATOMIC_INT64_EXTENSION_NAME);
        this.VK_EXT_shader_long_vector = ext.contains(EXTShaderLongVector.VK_EXT_SHADER_LONG_VECTOR_EXTENSION_NAME);
        this.VK_EXT_shader_module_identifier = check_EXT_shader_module_identifier(provider, caps, ext);
        this.VK_EXT_shader_object = check_EXT_shader_object(provider, caps, ext);
        this.VK_EXT_shader_replicated_composites = ext.contains(EXTShaderReplicatedComposites.VK_EXT_SHADER_REPLICATED_COMPOSITES_EXTENSION_NAME);
        this.VK_EXT_shader_stencil_export = ext.contains(EXTShaderStencilExport.VK_EXT_SHADER_STENCIL_EXPORT_EXTENSION_NAME);
        this.VK_EXT_shader_subgroup_ballot = ext.contains(EXTShaderSubgroupBallot.VK_EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME);
        this.VK_EXT_shader_subgroup_partitioned = ext.contains(EXTShaderSubgroupPartitioned.VK_EXT_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME);
        this.VK_EXT_shader_subgroup_vote = ext.contains(EXTShaderSubgroupVote.VK_EXT_SHADER_SUBGROUP_VOTE_EXTENSION_NAME);
        this.VK_EXT_shader_tile_image = ext.contains(EXTShaderTileImage.VK_EXT_SHADER_TILE_IMAGE_EXTENSION_NAME);
        this.VK_EXT_shader_uniform_buffer_unsized_array = ext.contains(EXTShaderUniformBufferUnsizedArray.VK_EXT_SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_EXTENSION_NAME);
        this.VK_EXT_shader_viewport_index_layer = ext.contains(EXTShaderViewportIndexLayer.VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_EXTENSION_NAME);
        this.VK_EXT_subgroup_size_control = ext.contains(EXTSubgroupSizeControl.VK_EXT_SUBGROUP_SIZE_CONTROL_EXTENSION_NAME);
        this.VK_EXT_subpass_merge_feedback = ext.contains(EXTSubpassMergeFeedback.VK_EXT_SUBPASS_MERGE_FEEDBACK_EXTENSION_NAME);
        this.VK_EXT_swapchain_maintenance1 = check_EXT_swapchain_maintenance1(provider, caps, ext);
        this.VK_EXT_texel_buffer_alignment = ext.contains(EXTTexelBufferAlignment.VK_EXT_TEXEL_BUFFER_ALIGNMENT_EXTENSION_NAME);
        this.VK_EXT_texture_compression_astc_3d = ext.contains(EXTTextureCompressionAstc3d.VK_EXT_TEXTURE_COMPRESSION_ASTC_3D_EXTENSION_NAME);
        this.VK_EXT_texture_compression_astc_hdr = ext.contains(EXTTextureCompressionAstcHdr.VK_EXT_TEXTURE_COMPRESSION_ASTC_HDR_EXTENSION_NAME);
        this.VK_EXT_tooling_info = ext.contains(EXTToolingInfo.VK_EXT_TOOLING_INFO_EXTENSION_NAME);
        this.VK_EXT_transform_feedback = check_EXT_transform_feedback(provider, caps, ext);
        this.VK_EXT_validation_cache = check_EXT_validation_cache(provider, caps, ext);
        this.VK_EXT_vertex_attribute_divisor = ext.contains(EXTVertexAttributeDivisor.VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME);
        this.VK_EXT_vertex_attribute_robustness = ext.contains(EXTVertexAttributeRobustness.VK_EXT_VERTEX_ATTRIBUTE_ROBUSTNESS_EXTENSION_NAME);
        this.VK_EXT_vertex_input_dynamic_state = check_EXT_vertex_input_dynamic_state(provider, caps, ext);
        this.VK_EXT_ycbcr_2plane_444_formats = ext.contains(EXTYcbcr2plane444Formats.VK_EXT_YCBCR_2PLANE_444_FORMATS_EXTENSION_NAME);
        this.VK_EXT_ycbcr_image_arrays = ext.contains(EXTYcbcrImageArrays.VK_EXT_YCBCR_IMAGE_ARRAYS_EXTENSION_NAME);
        this.VK_EXT_zero_initialize_device_memory = ext.contains(EXTZeroInitializeDeviceMemory.VK_EXT_ZERO_INITIALIZE_DEVICE_MEMORY_EXTENSION_NAME);
        this.VK_GOOGLE_decorate_string = ext.contains(GOOGLEDecorateString.VK_GOOGLE_DECORATE_STRING_EXTENSION_NAME);
        this.VK_GOOGLE_display_timing = check_GOOGLE_display_timing(provider, caps, ext);
        this.VK_GOOGLE_hlsl_functionality1 = ext.contains("VK_GOOGLE_hlsl_functionality1");
        this.VK_GOOGLE_user_type = ext.contains(GOOGLEUserType.VK_GOOGLE_USER_TYPE_EXTENSION_NAME);
        this.VK_HUAWEI_cluster_culling_shader = check_HUAWEI_cluster_culling_shader(provider, caps, ext);
        this.VK_HUAWEI_hdr_vivid = ext.contains(HUAWEIHdrVivid.VK_HUAWEI_HDR_VIVID_EXTENSION_NAME);
        this.VK_HUAWEI_invocation_mask = check_HUAWEI_invocation_mask(provider, caps, ext);
        this.VK_HUAWEI_subpass_shading = check_HUAWEI_subpass_shading(provider, caps, ext);
        this.VK_IMG_filter_cubic = ext.contains(IMGFilterCubic.VK_IMG_FILTER_CUBIC_EXTENSION_NAME);
        this.VK_IMG_format_pvrtc = ext.contains(IMGFormatPVRTC.VK_IMG_FORMAT_PVRTC_EXTENSION_NAME);
        this.VK_IMG_relaxed_line_rasterization = ext.contains(IMGRelaxedLineRasterization.VK_IMG_RELAXED_LINE_RASTERIZATION_EXTENSION_NAME);
        this.VK_INTEL_performance_query = check_INTEL_performance_query(provider, caps, ext);
        this.VK_INTEL_shader_integer_functions2 = ext.contains(INTELShaderIntegerFunctions2.VK_INTEL_SHADER_INTEGER_FUNCTIONS_2_EXTENSION_NAME);
        this.VK_KHR_16bit_storage = ext.contains(KHR16bitStorage.VK_KHR_16BIT_STORAGE_EXTENSION_NAME);
        this.VK_KHR_8bit_storage = ext.contains(KHR8bitStorage.VK_KHR_8BIT_STORAGE_EXTENSION_NAME);
        this.VK_KHR_acceleration_structure = check_KHR_acceleration_structure(provider, caps, ext);
        this.VK_KHR_bind_memory2 = check_KHR_bind_memory2(provider, caps, ext);
        this.VK_KHR_buffer_device_address = check_KHR_buffer_device_address(provider, caps, ext);
        this.VK_KHR_calibrated_timestamps = check_KHR_calibrated_timestamps(provider, caps, ext);
        this.VK_KHR_compute_shader_derivatives = ext.contains(KHRComputeShaderDerivatives.VK_KHR_COMPUTE_SHADER_DERIVATIVES_EXTENSION_NAME);
        this.VK_KHR_cooperative_matrix = ext.contains(KHRCooperativeMatrix.VK_KHR_COOPERATIVE_MATRIX_EXTENSION_NAME);
        this.VK_KHR_copy_commands2 = check_KHR_copy_commands2(provider, caps, ext);
        this.VK_KHR_copy_memory_indirect = check_KHR_copy_memory_indirect(provider, caps, ext);
        this.VK_KHR_create_renderpass2 = check_KHR_create_renderpass2(provider, caps, ext);
        this.VK_KHR_dedicated_allocation = ext.contains(KHRDedicatedAllocation.VK_KHR_DEDICATED_ALLOCATION_EXTENSION_NAME);
        this.VK_KHR_deferred_host_operations = check_KHR_deferred_host_operations(provider, caps, ext);
        this.VK_KHR_depth_clamp_zero_one = ext.contains(KHRDepthClampZeroOne.VK_KHR_DEPTH_CLAMP_ZERO_ONE_EXTENSION_NAME);
        this.VK_KHR_depth_stencil_resolve = ext.contains(KHRDepthStencilResolve.VK_KHR_DEPTH_STENCIL_RESOLVE_EXTENSION_NAME);
        this.VK_KHR_descriptor_update_template = check_KHR_descriptor_update_template(provider, caps, ext);
        this.VK_KHR_device_group = check_KHR_device_group(provider, caps, ext);
        this.VK_KHR_display_swapchain = check_KHR_display_swapchain(provider, caps, ext);
        this.VK_KHR_draw_indirect_count = check_KHR_draw_indirect_count(provider, caps, ext);
        this.VK_KHR_driver_properties = ext.contains(KHRDriverProperties.VK_KHR_DRIVER_PROPERTIES_EXTENSION_NAME);
        this.VK_KHR_dynamic_rendering = check_KHR_dynamic_rendering(provider, caps, ext);
        this.VK_KHR_dynamic_rendering_local_read = check_KHR_dynamic_rendering_local_read(provider, caps, ext);
        this.VK_KHR_external_fence = ext.contains(KHRExternalFence.VK_KHR_EXTERNAL_FENCE_EXTENSION_NAME);
        this.VK_KHR_external_fence_fd = check_KHR_external_fence_fd(provider, caps, ext);
        this.VK_KHR_external_fence_win32 = check_KHR_external_fence_win32(provider, caps, ext);
        this.VK_KHR_external_memory = ext.contains(KHRExternalMemory.VK_KHR_EXTERNAL_MEMORY_EXTENSION_NAME);
        this.VK_KHR_external_memory_fd = check_KHR_external_memory_fd(provider, caps, ext);
        this.VK_KHR_external_memory_win32 = check_KHR_external_memory_win32(provider, caps, ext);
        this.VK_KHR_external_semaphore = ext.contains(KHRExternalSemaphore.VK_KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME);
        this.VK_KHR_external_semaphore_fd = check_KHR_external_semaphore_fd(provider, caps, ext);
        this.VK_KHR_external_semaphore_win32 = check_KHR_external_semaphore_win32(provider, caps, ext);
        this.VK_KHR_format_feature_flags2 = ext.contains(KHRFormatFeatureFlags2.VK_KHR_FORMAT_FEATURE_FLAGS_2_EXTENSION_NAME);
        this.VK_KHR_fragment_shader_barycentric = ext.contains(KHRFragmentShaderBarycentric.VK_KHR_FRAGMENT_SHADER_BARYCENTRIC_EXTENSION_NAME);
        this.VK_KHR_fragment_shading_rate = check_KHR_fragment_shading_rate(provider, caps, ext);
        this.VK_KHR_get_memory_requirements2 = check_KHR_get_memory_requirements2(provider, caps, ext);
        this.VK_KHR_global_priority = ext.contains(KHRGlobalPriority.VK_KHR_GLOBAL_PRIORITY_EXTENSION_NAME);
        this.VK_KHR_image_format_list = ext.contains(KHRImageFormatList.VK_KHR_IMAGE_FORMAT_LIST_EXTENSION_NAME);
        this.VK_KHR_imageless_framebuffer = ext.contains(KHRImagelessFramebuffer.VK_KHR_IMAGELESS_FRAMEBUFFER_EXTENSION_NAME);
        this.VK_KHR_incremental_present = ext.contains(KHRIncrementalPresent.VK_KHR_INCREMENTAL_PRESENT_EXTENSION_NAME);
        this.VK_KHR_index_type_uint8 = ext.contains(KHRIndexTypeUint8.VK_KHR_INDEX_TYPE_UINT8_EXTENSION_NAME);
        this.VK_KHR_internally_synchronized_queues = ext.contains(KHRInternallySynchronizedQueues.VK_KHR_INTERNALLY_SYNCHRONIZED_QUEUES_EXTENSION_NAME);
        this.VK_KHR_line_rasterization = check_KHR_line_rasterization(provider, caps, ext);
        this.VK_KHR_load_store_op_none = ext.contains(KHRLoadStoreOpNone.VK_KHR_LOAD_STORE_OP_NONE_EXTENSION_NAME);
        this.VK_KHR_maintenance1 = check_KHR_maintenance1(provider, caps, ext);
        this.VK_KHR_maintenance10 = check_KHR_maintenance10(provider, caps, ext);
        this.VK_KHR_maintenance2 = ext.contains("VK_KHR_maintenance2");
        this.VK_KHR_maintenance3 = check_KHR_maintenance3(provider, caps, ext);
        this.VK_KHR_maintenance4 = check_KHR_maintenance4(provider, caps, ext);
        this.VK_KHR_maintenance5 = check_KHR_maintenance5(provider, caps, ext);
        this.VK_KHR_maintenance6 = check_KHR_maintenance6(provider, caps, ext);
        this.VK_KHR_maintenance7 = ext.contains(KHRMaintenance7.VK_KHR_MAINTENANCE_7_EXTENSION_NAME);
        this.VK_KHR_maintenance8 = ext.contains(KHRMaintenance8.VK_KHR_MAINTENANCE_8_EXTENSION_NAME);
        this.VK_KHR_maintenance9 = ext.contains(KHRMaintenance9.VK_KHR_MAINTENANCE_9_EXTENSION_NAME);
        this.VK_KHR_map_memory2 = check_KHR_map_memory2(provider, caps, ext);
        this.VK_KHR_multiview = ext.contains(KHRMultiview.VK_KHR_MULTIVIEW_EXTENSION_NAME);
        this.VK_KHR_performance_query = check_KHR_performance_query(provider, caps, ext);
        this.VK_KHR_pipeline_binary = check_KHR_pipeline_binary(provider, caps, ext);
        this.VK_KHR_pipeline_executable_properties = check_KHR_pipeline_executable_properties(provider, caps, ext);
        this.VK_KHR_pipeline_library = ext.contains(KHRPipelineLibrary.VK_KHR_PIPELINE_LIBRARY_EXTENSION_NAME);
        this.VK_KHR_portability_subset = ext.contains(KHRPortabilitySubset.VK_KHR_PORTABILITY_SUBSET_EXTENSION_NAME);
        this.VK_KHR_present_id = ext.contains(KHRPresentId.VK_KHR_PRESENT_ID_EXTENSION_NAME);
        this.VK_KHR_present_id2 = ext.contains(KHRPresentId2.VK_KHR_PRESENT_ID_2_EXTENSION_NAME);
        this.VK_KHR_present_mode_fifo_latest_ready = ext.contains(KHRPresentModeFifoLatestReady.VK_KHR_PRESENT_MODE_FIFO_LATEST_READY_EXTENSION_NAME);
        this.VK_KHR_present_wait = check_KHR_present_wait(provider, caps, ext);
        this.VK_KHR_present_wait2 = check_KHR_present_wait2(provider, caps, ext);
        this.VK_KHR_push_descriptor = check_KHR_push_descriptor(provider, caps, ext);
        this.VK_KHR_ray_query = ext.contains(KHRRayQuery.VK_KHR_RAY_QUERY_EXTENSION_NAME);
        this.VK_KHR_ray_tracing_maintenance1 = check_KHR_ray_tracing_maintenance1(provider, caps, ext);
        this.VK_KHR_ray_tracing_pipeline = check_KHR_ray_tracing_pipeline(provider, caps, ext);
        this.VK_KHR_ray_tracing_position_fetch = ext.contains(KHRRayTracingPositionFetch.VK_KHR_RAY_TRACING_POSITION_FETCH_EXTENSION_NAME);
        this.VK_KHR_relaxed_block_layout = ext.contains(KHRRelaxedBlockLayout.VK_KHR_RELAXED_BLOCK_LAYOUT_EXTENSION_NAME);
        this.VK_KHR_robustness2 = ext.contains(KHRRobustness2.VK_KHR_ROBUSTNESS_2_EXTENSION_NAME);
        this.VK_KHR_sampler_mirror_clamp_to_edge = ext.contains(KHRSamplerMirrorClampToEdge.VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME);
        this.VK_KHR_sampler_ycbcr_conversion = check_KHR_sampler_ycbcr_conversion(provider, caps, ext);
        this.VK_KHR_separate_depth_stencil_layouts = ext.contains(KHRSeparateDepthStencilLayouts.VK_KHR_SEPARATE_DEPTH_STENCIL_LAYOUTS_EXTENSION_NAME);
        this.VK_KHR_shader_atomic_int64 = ext.contains(KHRShaderAtomicInt64.VK_KHR_SHADER_ATOMIC_INT64_EXTENSION_NAME);
        this.VK_KHR_shader_bfloat16 = ext.contains(KHRShaderBfloat16.VK_KHR_SHADER_BFLOAT16_EXTENSION_NAME);
        this.VK_KHR_shader_clock = ext.contains(KHRShaderClock.VK_KHR_SHADER_CLOCK_EXTENSION_NAME);
        this.VK_KHR_shader_draw_parameters = ext.contains(KHRShaderDrawParameters.VK_KHR_SHADER_DRAW_PARAMETERS_EXTENSION_NAME);
        this.VK_KHR_shader_expect_assume = ext.contains(KHRShaderExpectAssume.VK_KHR_SHADER_EXPECT_ASSUME_EXTENSION_NAME);
        this.VK_KHR_shader_float16_int8 = ext.contains(KHRShaderFloat16Int8.VK_KHR_SHADER_FLOAT16_INT8_EXTENSION_NAME);
        this.VK_KHR_shader_float_controls = ext.contains(KHRShaderFloatControls.VK_KHR_SHADER_FLOAT_CONTROLS_EXTENSION_NAME);
        this.VK_KHR_shader_float_controls2 = ext.contains(KHRShaderFloatControls2.VK_KHR_SHADER_FLOAT_CONTROLS_2_EXTENSION_NAME);
        this.VK_KHR_shader_fma = ext.contains(KHRShaderFma.VK_KHR_SHADER_FMA_EXTENSION_NAME);
        this.VK_KHR_shader_integer_dot_product = ext.contains(KHRShaderIntegerDotProduct.VK_KHR_SHADER_INTEGER_DOT_PRODUCT_EXTENSION_NAME);
        this.VK_KHR_shader_maximal_reconvergence = ext.contains(KHRShaderMaximalReconvergence.VK_KHR_SHADER_MAXIMAL_RECONVERGENCE_EXTENSION_NAME);
        this.VK_KHR_shader_non_semantic_info = ext.contains(KHRShaderNonSemanticInfo.VK_KHR_SHADER_NON_SEMANTIC_INFO_EXTENSION_NAME);
        this.VK_KHR_shader_quad_control = ext.contains(KHRShaderQuadControl.VK_KHR_SHADER_QUAD_CONTROL_EXTENSION_NAME);
        this.VK_KHR_shader_relaxed_extended_instruction = ext.contains(KHRShaderRelaxedExtendedInstruction.VK_KHR_SHADER_RELAXED_EXTENDED_INSTRUCTION_EXTENSION_NAME);
        this.VK_KHR_shader_subgroup_extended_types = ext.contains(KHRShaderSubgroupExtendedTypes.VK_KHR_SHADER_SUBGROUP_EXTENDED_TYPES_EXTENSION_NAME);
        this.VK_KHR_shader_subgroup_rotate = ext.contains(KHRShaderSubgroupRotate.VK_KHR_SHADER_SUBGROUP_ROTATE_EXTENSION_NAME);
        this.VK_KHR_shader_subgroup_uniform_control_flow = ext.contains(KHRShaderSubgroupUniformControlFlow.VK_KHR_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_EXTENSION_NAME);
        this.VK_KHR_shader_terminate_invocation = ext.contains(KHRShaderTerminateInvocation.VK_KHR_SHADER_TERMINATE_INVOCATION_EXTENSION_NAME);
        this.VK_KHR_shader_untyped_pointers = ext.contains(KHRShaderUntypedPointers.VK_KHR_SHADER_UNTYPED_POINTERS_EXTENSION_NAME);
        this.VK_KHR_shared_presentable_image = check_KHR_shared_presentable_image(provider, caps, ext);
        this.VK_KHR_spirv_1_4 = ext.contains(KHRSpirv14.VK_KHR_SPIRV_1_4_EXTENSION_NAME);
        this.VK_KHR_storage_buffer_storage_class = ext.contains(KHRStorageBufferStorageClass.VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_EXTENSION_NAME);
        this.VK_KHR_swapchain = check_KHR_swapchain(provider, caps, ext);
        this.VK_KHR_swapchain_maintenance1 = check_KHR_swapchain_maintenance1(provider, caps, ext);
        this.VK_KHR_swapchain_mutable_format = ext.contains(KHRSwapchainMutableFormat.VK_KHR_SWAPCHAIN_MUTABLE_FORMAT_EXTENSION_NAME);
        this.VK_KHR_synchronization2 = check_KHR_synchronization2(provider, caps, ext);
        this.VK_KHR_timeline_semaphore = check_KHR_timeline_semaphore(provider, caps, ext);
        this.VK_KHR_unified_image_layouts = ext.contains(KHRUnifiedImageLayouts.VK_KHR_UNIFIED_IMAGE_LAYOUTS_EXTENSION_NAME);
        this.VK_KHR_uniform_buffer_standard_layout = ext.contains(KHRUniformBufferStandardLayout.VK_KHR_UNIFORM_BUFFER_STANDARD_LAYOUT_EXTENSION_NAME);
        this.VK_KHR_variable_pointers = ext.contains(KHRVariablePointers.VK_KHR_VARIABLE_POINTERS_EXTENSION_NAME);
        this.VK_KHR_vertex_attribute_divisor = ext.contains(KHRVertexAttributeDivisor.VK_KHR_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME);
        this.VK_KHR_video_decode_av1 = ext.contains(KHRVideoDecodeAV1.VK_KHR_VIDEO_DECODE_AV1_EXTENSION_NAME);
        this.VK_KHR_video_decode_h264 = ext.contains(KHRVideoDecodeH264.VK_KHR_VIDEO_DECODE_H264_EXTENSION_NAME);
        this.VK_KHR_video_decode_h265 = ext.contains(KHRVideoDecodeH265.VK_KHR_VIDEO_DECODE_H265_EXTENSION_NAME);
        this.VK_KHR_video_decode_queue = check_KHR_video_decode_queue(provider, caps, ext);
        this.VK_KHR_video_decode_vp9 = ext.contains(KHRVideoDecodeVP9.VK_KHR_VIDEO_DECODE_VP9_EXTENSION_NAME);
        this.VK_KHR_video_encode_av1 = ext.contains(KHRVideoEncodeAV1.VK_KHR_VIDEO_ENCODE_AV1_EXTENSION_NAME);
        this.VK_KHR_video_encode_h264 = ext.contains(KHRVideoEncodeH264.VK_KHR_VIDEO_ENCODE_H264_EXTENSION_NAME);
        this.VK_KHR_video_encode_h265 = ext.contains(KHRVideoEncodeH265.VK_KHR_VIDEO_ENCODE_H265_EXTENSION_NAME);
        this.VK_KHR_video_encode_intra_refresh = ext.contains(KHRVideoEncodeIntraRefresh.VK_KHR_VIDEO_ENCODE_INTRA_REFRESH_EXTENSION_NAME);
        this.VK_KHR_video_encode_quantization_map = ext.contains(KHRVideoEncodeQuantizationMap.VK_KHR_VIDEO_ENCODE_QUANTIZATION_MAP_EXTENSION_NAME);
        this.VK_KHR_video_encode_queue = check_KHR_video_encode_queue(provider, caps, ext);
        this.VK_KHR_video_maintenance1 = ext.contains(KHRVideoMaintenance1.VK_KHR_VIDEO_MAINTENANCE_1_EXTENSION_NAME);
        this.VK_KHR_video_maintenance2 = ext.contains(KHRVideoMaintenance2.VK_KHR_VIDEO_MAINTENANCE_2_EXTENSION_NAME);
        this.VK_KHR_video_queue = check_KHR_video_queue(provider, caps, ext);
        this.VK_KHR_vulkan_memory_model = ext.contains(KHRVulkanMemoryModel.VK_KHR_VULKAN_MEMORY_MODEL_EXTENSION_NAME);
        this.VK_KHR_win32_keyed_mutex = ext.contains(KHRWin32KeyedMutex.VK_KHR_WIN32_KEYED_MUTEX_EXTENSION_NAME);
        this.VK_KHR_workgroup_memory_explicit_layout = ext.contains(KHRWorkgroupMemoryExplicitLayout.VK_KHR_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_EXTENSION_NAME);
        this.VK_KHR_zero_initialize_workgroup_memory = ext.contains(KHRZeroInitializeWorkgroupMemory.VK_KHR_ZERO_INITIALIZE_WORKGROUP_MEMORY_EXTENSION_NAME);
        this.VK_MESA_image_alignment_control = ext.contains(MESAImageAlignmentControl.VK_MESA_IMAGE_ALIGNMENT_CONTROL_EXTENSION_NAME);
        this.VK_MSFT_layered_driver = ext.contains(MSFTLayeredDriver.VK_MSFT_LAYERED_DRIVER_EXTENSION_NAME);
        this.VK_NV_acquire_winrt_display = ext.contains(NVAcquireWinrtDisplay.VK_NV_ACQUIRE_WINRT_DISPLAY_EXTENSION_NAME);
        this.VK_NV_clip_space_w_scaling = check_NV_clip_space_w_scaling(provider, caps, ext);
        this.VK_NV_cluster_acceleration_structure = check_NV_cluster_acceleration_structure(provider, caps, ext);
        this.VK_NV_command_buffer_inheritance = ext.contains(NVCommandBufferInheritance.VK_NV_COMMAND_BUFFER_INHERITANCE_EXTENSION_NAME);
        this.VK_NV_compute_occupancy_priority = check_NV_compute_occupancy_priority(provider, caps, ext);
        this.VK_NV_compute_shader_derivatives = ext.contains(NVComputeShaderDerivatives.VK_NV_COMPUTE_SHADER_DERIVATIVES_EXTENSION_NAME);
        this.VK_NV_cooperative_matrix = ext.contains(NVCooperativeMatrix.VK_NV_COOPERATIVE_MATRIX_EXTENSION_NAME);
        this.VK_NV_cooperative_matrix2 = ext.contains(NVCooperativeMatrix2.VK_NV_COOPERATIVE_MATRIX_2_EXTENSION_NAME);
        this.VK_NV_cooperative_vector = check_NV_cooperative_vector(provider, caps, ext);
        this.VK_NV_copy_memory_indirect = check_NV_copy_memory_indirect(provider, caps, ext);
        this.VK_NV_corner_sampled_image = ext.contains(NVCornerSampledImage.VK_NV_CORNER_SAMPLED_IMAGE_EXTENSION_NAME);
        this.VK_NV_coverage_reduction_mode = ext.contains(NVCoverageReductionMode.VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME);
        this.VK_NV_cuda_kernel_launch = check_NV_cuda_kernel_launch(provider, caps, ext);
        this.VK_NV_dedicated_allocation = ext.contains(NVDedicatedAllocation.VK_NV_DEDICATED_ALLOCATION_EXTENSION_NAME);
        this.VK_NV_dedicated_allocation_image_aliasing = ext.contains(NVDedicatedAllocationImageAliasing.VK_NV_DEDICATED_ALLOCATION_IMAGE_ALIASING_EXTENSION_NAME);
        this.VK_NV_descriptor_pool_overallocation = ext.contains(NVDescriptorPoolOverallocation.VK_NV_DESCRIPTOR_POOL_OVERALLOCATION_EXTENSION_NAME);
        this.VK_NV_device_diagnostic_checkpoints = check_NV_device_diagnostic_checkpoints(provider, caps, ext);
        this.VK_NV_device_diagnostics_config = ext.contains(NVDeviceDiagnosticsConfig.VK_NV_DEVICE_DIAGNOSTICS_CONFIG_EXTENSION_NAME);
        this.VK_NV_device_generated_commands = check_NV_device_generated_commands(provider, caps, ext);
        this.VK_NV_device_generated_commands_compute = check_NV_device_generated_commands_compute(provider, caps, ext);
        this.VK_NV_displacement_micromap = ext.contains(NVDisplacementMicromap.VK_NV_DISPLACEMENT_MICROMAP_EXTENSION_NAME);
        this.VK_NV_extended_sparse_address_space = ext.contains(NVExtendedSparseAddressSpace.VK_NV_EXTENDED_SPARSE_ADDRESS_SPACE_EXTENSION_NAME);
        this.VK_NV_external_compute_queue = check_NV_external_compute_queue(provider, caps, ext);
        this.VK_NV_external_memory = ext.contains(NVExternalMemory.VK_NV_EXTERNAL_MEMORY_EXTENSION_NAME);
        this.VK_NV_external_memory_rdma = check_NV_external_memory_rdma(provider, caps, ext);
        this.VK_NV_external_memory_win32 = check_NV_external_memory_win32(provider, caps, ext);
        this.VK_NV_fill_rectangle = ext.contains(NVFillRectangle.VK_NV_FILL_RECTANGLE_EXTENSION_NAME);
        this.VK_NV_fragment_coverage_to_color = ext.contains(NVFragmentCoverageToColor.VK_NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME);
        this.VK_NV_fragment_shader_barycentric = ext.contains(NVFragmentShaderBarycentric.VK_NV_FRAGMENT_SHADER_BARYCENTRIC_EXTENSION_NAME);
        this.VK_NV_fragment_shading_rate_enums = check_NV_fragment_shading_rate_enums(provider, caps, ext);
        this.VK_NV_framebuffer_mixed_samples = ext.contains(NVFramebufferMixedSamples.VK_NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME);
        this.VK_NV_geometry_shader_passthrough = ext.contains(NVGeometryShaderPassthrough.VK_NV_GEOMETRY_SHADER_PASSTHROUGH_EXTENSION_NAME);
        this.VK_NV_glsl_shader = ext.contains(NVGLSLShader.VK_NV_GLSL_SHADER_EXTENSION_NAME);
        this.VK_NV_inherited_viewport_scissor = ext.contains(NVInheritedViewportScissor.VK_NV_INHERITED_VIEWPORT_SCISSOR_EXTENSION_NAME);
        this.VK_NV_linear_color_attachment = ext.contains(NVLinearColorAttachment.VK_NV_LINEAR_COLOR_ATTACHMENT_EXTENSION_NAME);
        this.VK_NV_low_latency = ext.contains(NVLowLatency.VK_NV_LOW_LATENCY_EXTENSION_NAME);
        this.VK_NV_low_latency2 = check_NV_low_latency2(provider, caps, ext);
        this.VK_NV_memory_decompression = check_NV_memory_decompression(provider, caps, ext);
        this.VK_NV_mesh_shader = check_NV_mesh_shader(provider, caps, ext);
        this.VK_NV_optical_flow = check_NV_optical_flow(provider, caps, ext);
        this.VK_NV_partitioned_acceleration_structure = check_NV_partitioned_acceleration_structure(provider, caps, ext);
        this.VK_NV_per_stage_descriptor_set = ext.contains(NVPerStageDescriptorSet.VK_NV_PER_STAGE_DESCRIPTOR_SET_EXTENSION_NAME);
        this.VK_NV_present_barrier = ext.contains(NVPresentBarrier.VK_NV_PRESENT_BARRIER_EXTENSION_NAME);
        this.VK_NV_present_metering = ext.contains(NVPresentMetering.VK_NV_PRESENT_METERING_EXTENSION_NAME);
        this.VK_NV_push_constant_bank = ext.contains(NVPushConstantBank.VK_NV_PUSH_CONSTANT_BANK_EXTENSION_NAME);
        this.VK_NV_raw_access_chains = ext.contains(NVRawAccessChains.VK_NV_RAW_ACCESS_CHAINS_EXTENSION_NAME);
        this.VK_NV_ray_tracing = check_NV_ray_tracing(provider, caps, ext);
        this.VK_NV_ray_tracing_invocation_reorder = ext.contains(NVRayTracingInvocationReorder.VK_NV_RAY_TRACING_INVOCATION_REORDER_EXTENSION_NAME);
        this.VK_NV_ray_tracing_linear_swept_spheres = ext.contains(NVRayTracingLinearSweptSpheres.VK_NV_RAY_TRACING_LINEAR_SWEPT_SPHERES_EXTENSION_NAME);
        this.VK_NV_ray_tracing_motion_blur = ext.contains(NVRayTracingMotionBlur.VK_NV_RAY_TRACING_MOTION_BLUR_EXTENSION_NAME);
        this.VK_NV_ray_tracing_validation = ext.contains(NVRayTracingValidation.VK_NV_RAY_TRACING_VALIDATION_EXTENSION_NAME);
        this.VK_NV_representative_fragment_test = ext.contains(NVRepresentativeFragmentTest.VK_NV_REPRESENTATIVE_FRAGMENT_TEST_EXTENSION_NAME);
        this.VK_NV_sample_mask_override_coverage = ext.contains(NVSampleMaskOverrideCoverage.VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME);
        this.VK_NV_scissor_exclusive = check_NV_scissor_exclusive(provider, caps, ext);
        this.VK_NV_shader_atomic_float16_vector = ext.contains(NVShaderAtomicFloat16Vector.VK_NV_SHADER_ATOMIC_FLOAT16_VECTOR_EXTENSION_NAME);
        this.VK_NV_shader_image_footprint = ext.contains(NVShaderImageFootprint.VK_NV_SHADER_IMAGE_FOOTPRINT_EXTENSION_NAME);
        this.VK_NV_shader_sm_builtins = ext.contains(NVShaderSmBuiltins.VK_NV_SHADER_SM_BUILTINS_EXTENSION_NAME);
        this.VK_NV_shader_subgroup_partitioned = ext.contains(NVShaderSubgroupPartitioned.VK_NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME);
        this.VK_NV_shading_rate_image = check_NV_shading_rate_image(provider, caps, ext);
        this.VK_NV_viewport_array2 = ext.contains("VK_NV_viewport_array2");
        this.VK_NV_viewport_swizzle = ext.contains(NVViewportSwizzle.VK_NV_VIEWPORT_SWIZZLE_EXTENSION_NAME);
        this.VK_NV_win32_keyed_mutex = ext.contains(NVWin32KeyedMutex.VK_NV_WIN32_KEYED_MUTEX_EXTENSION_NAME);
        this.VK_NVX_binary_import = check_NVX_binary_import(provider, caps, ext);
        this.VK_NVX_image_view_handle = check_NVX_image_view_handle(provider, caps, ext);
        this.VK_NVX_multiview_per_view_attributes = ext.contains(NVXMultiviewPerViewAttributes.VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_EXTENSION_NAME);
        this.VK_QCOM_cooperative_matrix_conversion = ext.contains(QCOMCooperativeMatrixConversion.VK_QCOM_COOPERATIVE_MATRIX_CONVERSION_EXTENSION_NAME);
        this.VK_QCOM_data_graph_model = ext.contains(QCOMDataGraphModel.VK_QCOM_DATA_GRAPH_MODEL_EXTENSION_NAME);
        this.VK_QCOM_filter_cubic_clamp = ext.contains(QCOMFilterCubicClamp.VK_QCOM_FILTER_CUBIC_CLAMP_EXTENSION_NAME);
        this.VK_QCOM_filter_cubic_weights = ext.contains(QCOMFilterCubicWeights.VK_QCOM_FILTER_CUBIC_WEIGHTS_EXTENSION_NAME);
        this.VK_QCOM_fragment_density_map_offset = ext.contains(QCOMFragmentDensityMapOffset.VK_QCOM_FRAGMENT_DENSITY_MAP_OFFSET_EXTENSION_NAME);
        this.VK_QCOM_image_processing = ext.contains(QCOMImageProcessing.VK_QCOM_IMAGE_PROCESSING_EXTENSION_NAME);
        this.VK_QCOM_image_processing2 = ext.contains(QCOMImageProcessing2.VK_QCOM_IMAGE_PROCESSING_2_EXTENSION_NAME);
        this.VK_QCOM_multiview_per_view_render_areas = ext.contains(QCOMMultiviewPerViewRenderAreas.VK_QCOM_MULTIVIEW_PER_VIEW_RENDER_AREAS_EXTENSION_NAME);
        this.VK_QCOM_multiview_per_view_viewports = ext.contains(QCOMMultiviewPerViewViewports.VK_QCOM_MULTIVIEW_PER_VIEW_VIEWPORTS_EXTENSION_NAME);
        this.VK_QCOM_render_pass_shader_resolve = ext.contains(QCOMRenderPassShaderResolve.VK_QCOM_RENDER_PASS_SHADER_RESOLVE_EXTENSION_NAME);
        this.VK_QCOM_render_pass_store_ops = ext.contains(QCOMRenderPassStoreOps.VK_QCOM_RENDER_PASS_STORE_OPS_EXTENSION_NAME);
        this.VK_QCOM_render_pass_transform = ext.contains(QCOMRenderPassTransform.VK_QCOM_RENDER_PASS_TRANSFORM_EXTENSION_NAME);
        this.VK_QCOM_rotated_copy_commands = ext.contains(QCOMRotatedCopyCommands.VK_QCOM_ROTATED_COPY_COMMANDS_EXTENSION_NAME);
        this.VK_QCOM_tile_memory_heap = check_QCOM_tile_memory_heap(provider, caps, ext);
        this.VK_QCOM_tile_properties = check_QCOM_tile_properties(provider, caps, ext);
        this.VK_QCOM_tile_shading = check_QCOM_tile_shading(provider, caps, ext);
        this.VK_QCOM_ycbcr_degamma = ext.contains(QCOMYcbcrDegamma.VK_QCOM_YCBCR_DEGAMMA_EXTENSION_NAME);
        this.VK_SEC_amigo_profiling = ext.contains(SECAmigoProfiling.VK_SEC_AMIGO_PROFILING_EXTENSION_NAME);
        this.VK_SEC_pipeline_cache_incremental_mode = ext.contains(SECPipelineCacheIncrementalMode.VK_SEC_PIPELINE_CACHE_INCREMENTAL_MODE_EXTENSION_NAME);
        this.STD_VIDEO_STD_vulkan_video_codec_av1 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_av1");
        this.STD_VIDEO_STD_vulkan_video_codec_h264 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_h264");
        this.STD_VIDEO_STD_vulkan_video_codec_h265 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_h265");
        this.STD_VIDEO_STD_vulkan_video_codec_vp9 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_vp9");
        this.VK_VALVE_descriptor_set_host_mapping = check_VALVE_descriptor_set_host_mapping(provider, caps, ext);
        this.VK_VALVE_fragment_density_map_layered = ext.contains(VALVEFragmentDensityMapLayered.VK_VALVE_FRAGMENT_DENSITY_MAP_LAYERED_EXTENSION_NAME);
        this.VK_VALVE_mutable_descriptor_type = ext.contains(VALVEMutableDescriptorType.VK_VALVE_MUTABLE_DESCRIPTOR_TYPE_EXTENSION_NAME);
        this.VK_VALVE_video_encode_rgb_conversion = ext.contains(VALVEVideoEncodeRgbConversion.VK_VALVE_VIDEO_ENCODE_RGB_CONVERSION_EXTENSION_NAME);
        this.vkGetDeviceProcAddr = caps[0];
        this.vkDestroyDevice = caps[1];
        this.vkGetDeviceQueue = caps[2];
        this.vkQueueSubmit = caps[3];
        this.vkQueueWaitIdle = caps[4];
        this.vkDeviceWaitIdle = caps[5];
        this.vkAllocateMemory = caps[6];
        this.vkFreeMemory = caps[7];
        this.vkMapMemory = caps[8];
        this.vkUnmapMemory = caps[9];
        this.vkFlushMappedMemoryRanges = caps[10];
        this.vkInvalidateMappedMemoryRanges = caps[11];
        this.vkGetDeviceMemoryCommitment = caps[12];
        this.vkBindBufferMemory = caps[13];
        this.vkBindImageMemory = caps[14];
        this.vkGetBufferMemoryRequirements = caps[15];
        this.vkGetImageMemoryRequirements = caps[16];
        this.vkGetImageSparseMemoryRequirements = caps[17];
        this.vkQueueBindSparse = caps[18];
        this.vkCreateFence = caps[19];
        this.vkDestroyFence = caps[20];
        this.vkResetFences = caps[21];
        this.vkGetFenceStatus = caps[22];
        this.vkWaitForFences = caps[23];
        this.vkCreateSemaphore = caps[24];
        this.vkDestroySemaphore = caps[25];
        this.vkCreateQueryPool = caps[26];
        this.vkDestroyQueryPool = caps[27];
        this.vkGetQueryPoolResults = caps[28];
        this.vkCreateBuffer = caps[29];
        this.vkDestroyBuffer = caps[30];
        this.vkCreateImage = caps[31];
        this.vkDestroyImage = caps[32];
        this.vkGetImageSubresourceLayout = caps[33];
        this.vkCreateImageView = caps[34];
        this.vkDestroyImageView = caps[35];
        this.vkCreateCommandPool = caps[36];
        this.vkDestroyCommandPool = caps[37];
        this.vkResetCommandPool = caps[38];
        this.vkAllocateCommandBuffers = caps[39];
        this.vkFreeCommandBuffers = caps[40];
        this.vkBeginCommandBuffer = caps[41];
        this.vkEndCommandBuffer = caps[42];
        this.vkResetCommandBuffer = caps[43];
        this.vkCmdCopyBuffer = caps[44];
        this.vkCmdCopyImage = caps[45];
        this.vkCmdCopyBufferToImage = caps[46];
        this.vkCmdCopyImageToBuffer = caps[47];
        this.vkCmdUpdateBuffer = caps[48];
        this.vkCmdFillBuffer = caps[49];
        this.vkCmdPipelineBarrier = caps[50];
        this.vkCmdBeginQuery = caps[51];
        this.vkCmdEndQuery = caps[52];
        this.vkCmdResetQueryPool = caps[53];
        this.vkCmdWriteTimestamp = caps[54];
        this.vkCmdCopyQueryPoolResults = caps[55];
        this.vkCmdExecuteCommands = caps[56];
        this.vkCreateEvent = caps[57];
        this.vkDestroyEvent = caps[58];
        this.vkGetEventStatus = caps[59];
        this.vkSetEvent = caps[60];
        this.vkResetEvent = caps[61];
        this.vkCreateBufferView = caps[62];
        this.vkDestroyBufferView = caps[63];
        this.vkCreateShaderModule = caps[64];
        this.vkDestroyShaderModule = caps[65];
        this.vkCreatePipelineCache = caps[66];
        this.vkDestroyPipelineCache = caps[67];
        this.vkGetPipelineCacheData = caps[68];
        this.vkMergePipelineCaches = caps[69];
        this.vkCreateComputePipelines = caps[70];
        this.vkDestroyPipeline = caps[71];
        this.vkCreatePipelineLayout = caps[72];
        this.vkDestroyPipelineLayout = caps[73];
        this.vkCreateSampler = caps[74];
        this.vkDestroySampler = caps[75];
        this.vkCreateDescriptorSetLayout = caps[76];
        this.vkDestroyDescriptorSetLayout = caps[77];
        this.vkCreateDescriptorPool = caps[78];
        this.vkDestroyDescriptorPool = caps[79];
        this.vkResetDescriptorPool = caps[80];
        this.vkAllocateDescriptorSets = caps[81];
        this.vkFreeDescriptorSets = caps[82];
        this.vkUpdateDescriptorSets = caps[83];
        this.vkCmdBindPipeline = caps[84];
        this.vkCmdBindDescriptorSets = caps[85];
        this.vkCmdClearColorImage = caps[86];
        this.vkCmdDispatch = caps[87];
        this.vkCmdDispatchIndirect = caps[88];
        this.vkCmdSetEvent = caps[89];
        this.vkCmdResetEvent = caps[90];
        this.vkCmdWaitEvents = caps[91];
        this.vkCmdPushConstants = caps[92];
        this.vkCreateGraphicsPipelines = caps[93];
        this.vkCreateFramebuffer = caps[94];
        this.vkDestroyFramebuffer = caps[95];
        this.vkCreateRenderPass = caps[96];
        this.vkDestroyRenderPass = caps[97];
        this.vkGetRenderAreaGranularity = caps[98];
        this.vkCmdSetViewport = caps[99];
        this.vkCmdSetScissor = caps[100];
        this.vkCmdSetLineWidth = caps[101];
        this.vkCmdSetDepthBias = caps[102];
        this.vkCmdSetBlendConstants = caps[103];
        this.vkCmdSetDepthBounds = caps[104];
        this.vkCmdSetStencilCompareMask = caps[105];
        this.vkCmdSetStencilWriteMask = caps[106];
        this.vkCmdSetStencilReference = caps[107];
        this.vkCmdBindIndexBuffer = caps[108];
        this.vkCmdBindVertexBuffers = caps[109];
        this.vkCmdDraw = caps[110];
        this.vkCmdDrawIndexed = caps[111];
        this.vkCmdDrawIndirect = caps[112];
        this.vkCmdDrawIndexedIndirect = caps[113];
        this.vkCmdBlitImage = caps[114];
        this.vkCmdClearDepthStencilImage = caps[115];
        this.vkCmdClearAttachments = caps[116];
        this.vkCmdResolveImage = caps[117];
        this.vkCmdBeginRenderPass = caps[118];
        this.vkCmdNextSubpass = caps[119];
        this.vkCmdEndRenderPass = caps[120];
        this.vkBindBufferMemory2 = caps[121];
        this.vkBindImageMemory2 = caps[122];
        this.vkGetDeviceGroupPeerMemoryFeatures = caps[123];
        this.vkCmdSetDeviceMask = caps[124];
        this.vkGetImageMemoryRequirements2 = caps[125];
        this.vkGetBufferMemoryRequirements2 = caps[126];
        this.vkGetImageSparseMemoryRequirements2 = caps[127];
        this.vkTrimCommandPool = caps[128];
        this.vkGetDeviceQueue2 = caps[129];
        this.vkCmdDispatchBase = caps[130];
        this.vkCreateDescriptorUpdateTemplate = caps[131];
        this.vkDestroyDescriptorUpdateTemplate = caps[132];
        this.vkUpdateDescriptorSetWithTemplate = caps[133];
        this.vkGetDescriptorSetLayoutSupport = caps[134];
        this.vkCreateSamplerYcbcrConversion = caps[135];
        this.vkDestroySamplerYcbcrConversion = caps[136];
        this.vkResetQueryPool = caps[137];
        this.vkGetSemaphoreCounterValue = caps[138];
        this.vkWaitSemaphores = caps[139];
        this.vkSignalSemaphore = caps[140];
        this.vkGetBufferDeviceAddress = caps[141];
        this.vkGetBufferOpaqueCaptureAddress = caps[142];
        this.vkGetDeviceMemoryOpaqueCaptureAddress = caps[143];
        this.vkCmdDrawIndirectCount = caps[144];
        this.vkCmdDrawIndexedIndirectCount = caps[145];
        this.vkCreateRenderPass2 = caps[146];
        this.vkCmdBeginRenderPass2 = caps[147];
        this.vkCmdNextSubpass2 = caps[148];
        this.vkCmdEndRenderPass2 = caps[149];
        this.vkCreatePrivateDataSlot = caps[150];
        this.vkDestroyPrivateDataSlot = caps[151];
        this.vkSetPrivateData = caps[152];
        this.vkGetPrivateData = caps[153];
        this.vkCmdPipelineBarrier2 = caps[154];
        this.vkCmdWriteTimestamp2 = caps[155];
        this.vkQueueSubmit2 = caps[156];
        this.vkCmdCopyBuffer2 = caps[157];
        this.vkCmdCopyImage2 = caps[158];
        this.vkCmdCopyBufferToImage2 = caps[159];
        this.vkCmdCopyImageToBuffer2 = caps[160];
        this.vkGetDeviceBufferMemoryRequirements = caps[161];
        this.vkGetDeviceImageMemoryRequirements = caps[162];
        this.vkGetDeviceImageSparseMemoryRequirements = caps[163];
        this.vkCmdSetEvent2 = caps[164];
        this.vkCmdResetEvent2 = caps[165];
        this.vkCmdWaitEvents2 = caps[166];
        this.vkCmdBlitImage2 = caps[167];
        this.vkCmdResolveImage2 = caps[168];
        this.vkCmdBeginRendering = caps[169];
        this.vkCmdEndRendering = caps[170];
        this.vkCmdSetCullMode = caps[171];
        this.vkCmdSetFrontFace = caps[172];
        this.vkCmdSetPrimitiveTopology = caps[173];
        this.vkCmdSetViewportWithCount = caps[174];
        this.vkCmdSetScissorWithCount = caps[175];
        this.vkCmdBindVertexBuffers2 = caps[176];
        this.vkCmdSetDepthTestEnable = caps[177];
        this.vkCmdSetDepthWriteEnable = caps[178];
        this.vkCmdSetDepthCompareOp = caps[179];
        this.vkCmdSetDepthBoundsTestEnable = caps[180];
        this.vkCmdSetStencilTestEnable = caps[181];
        this.vkCmdSetStencilOp = caps[182];
        this.vkCmdSetRasterizerDiscardEnable = caps[183];
        this.vkCmdSetDepthBiasEnable = caps[184];
        this.vkCmdSetPrimitiveRestartEnable = caps[185];
        this.vkMapMemory2 = caps[186];
        this.vkUnmapMemory2 = caps[187];
        this.vkGetDeviceImageSubresourceLayout = caps[188];
        this.vkGetImageSubresourceLayout2 = caps[189];
        this.vkCopyMemoryToImage = caps[190];
        this.vkCopyImageToMemory = caps[191];
        this.vkCopyImageToImage = caps[192];
        this.vkTransitionImageLayout = caps[193];
        this.vkCmdPushDescriptorSet = caps[194];
        this.vkCmdPushDescriptorSetWithTemplate = caps[195];
        this.vkCmdBindDescriptorSets2 = caps[196];
        this.vkCmdPushConstants2 = caps[197];
        this.vkCmdPushDescriptorSet2 = caps[198];
        this.vkCmdPushDescriptorSetWithTemplate2 = caps[199];
        this.vkCmdSetLineStipple = caps[200];
        this.vkCmdBindIndexBuffer2 = caps[201];
        this.vkGetRenderingAreaGranularity = caps[202];
        this.vkCmdSetRenderingAttachmentLocations = caps[203];
        this.vkCmdSetRenderingInputAttachmentIndices = caps[204];
        this.vkAntiLagUpdateAMD = caps[205];
        this.vkCmdWriteBufferMarkerAMD = caps[206];
        this.vkCmdWriteBufferMarker2AMD = caps[207];
        this.vkSetLocalDimmingAMD = caps[208];
        this.vkCmdDrawIndirectCountAMD = caps[209];
        this.vkCmdDrawIndexedIndirectCountAMD = caps[210];
        this.vkGetShaderInfoAMD = caps[211];
        this.vkCreateExecutionGraphPipelinesAMDX = caps[212];
        this.vkGetExecutionGraphPipelineScratchSizeAMDX = caps[213];
        this.vkGetExecutionGraphPipelineNodeIndexAMDX = caps[214];
        this.vkCmdInitializeGraphScratchMemoryAMDX = caps[215];
        this.vkCmdDispatchGraphAMDX = caps[216];
        this.vkCmdDispatchGraphIndirectAMDX = caps[217];
        this.vkCmdDispatchGraphIndirectCountAMDX = caps[218];
        this.vkGetAndroidHardwareBufferPropertiesANDROID = caps[219];
        this.vkGetMemoryAndroidHardwareBufferANDROID = caps[220];
        this.vkCreateDataGraphPipelinesARM = caps[221];
        this.vkCreateDataGraphPipelineSessionARM = caps[222];
        this.vkGetDataGraphPipelineSessionBindPointRequirementsARM = caps[223];
        this.vkGetDataGraphPipelineSessionMemoryRequirementsARM = caps[224];
        this.vkBindDataGraphPipelineSessionMemoryARM = caps[225];
        this.vkDestroyDataGraphPipelineSessionARM = caps[226];
        this.vkCmdDispatchDataGraphARM = caps[227];
        this.vkGetDataGraphPipelineAvailablePropertiesARM = caps[228];
        this.vkGetDataGraphPipelinePropertiesARM = caps[229];
        this.vkCreateTensorARM = caps[230];
        this.vkDestroyTensorARM = caps[231];
        this.vkCreateTensorViewARM = caps[232];
        this.vkDestroyTensorViewARM = caps[233];
        this.vkGetTensorMemoryRequirementsARM = caps[234];
        this.vkBindTensorMemoryARM = caps[235];
        this.vkGetDeviceTensorMemoryRequirementsARM = caps[236];
        this.vkCmdCopyTensorARM = caps[237];
        this.vkGetTensorOpaqueCaptureDescriptorDataARM = caps[238];
        this.vkGetTensorViewOpaqueCaptureDescriptorDataARM = caps[239];
        this.vkCmdSetAttachmentFeedbackLoopEnableEXT = caps[240];
        this.vkGetBufferDeviceAddressEXT = caps[241];
        this.vkGetCalibratedTimestampsEXT = caps[242];
        this.vkCmdSetColorWriteEnableEXT = caps[243];
        this.vkCmdBeginConditionalRenderingEXT = caps[244];
        this.vkCmdEndConditionalRenderingEXT = caps[245];
        this.vkCmdBeginCustomResolveEXT = caps[246];
        this.vkDebugMarkerSetObjectTagEXT = caps[247];
        this.vkDebugMarkerSetObjectNameEXT = caps[248];
        this.vkCmdDebugMarkerBeginEXT = caps[249];
        this.vkCmdDebugMarkerEndEXT = caps[250];
        this.vkCmdDebugMarkerInsertEXT = caps[251];
        this.vkCmdSetDepthBias2EXT = caps[252];
        this.vkCmdSetDepthClampRangeEXT = caps[253];
        this.vkGetDescriptorSetLayoutSizeEXT = caps[254];
        this.vkGetDescriptorSetLayoutBindingOffsetEXT = caps[255];
        this.vkGetDescriptorEXT = caps[256];
        this.vkCmdBindDescriptorBuffersEXT = caps[257];
        this.vkCmdSetDescriptorBufferOffsetsEXT = caps[258];
        this.vkCmdBindDescriptorBufferEmbeddedSamplersEXT = caps[259];
        this.vkGetBufferOpaqueCaptureDescriptorDataEXT = caps[260];
        this.vkGetImageOpaqueCaptureDescriptorDataEXT = caps[261];
        this.vkGetImageViewOpaqueCaptureDescriptorDataEXT = caps[262];
        this.vkGetSamplerOpaqueCaptureDescriptorDataEXT = caps[263];
        this.vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = caps[264];
        this.vkWriteSamplerDescriptorsEXT = caps[265];
        this.vkWriteResourceDescriptorsEXT = caps[266];
        this.vkCmdBindSamplerHeapEXT = caps[267];
        this.vkCmdBindResourceHeapEXT = caps[268];
        this.vkCmdPushDataEXT = caps[269];
        this.vkGetImageOpaqueCaptureDataEXT = caps[270];
        this.vkRegisterCustomBorderColorEXT = caps[271];
        this.vkUnregisterCustomBorderColorEXT = caps[272];
        this.vkGetTensorOpaqueCaptureDataARM = caps[273];
        this.vkGetDeviceFaultInfoEXT = caps[274];
        this.vkGetGeneratedCommandsMemoryRequirementsEXT = caps[275];
        this.vkCmdPreprocessGeneratedCommandsEXT = caps[276];
        this.vkCmdExecuteGeneratedCommandsEXT = caps[277];
        this.vkCreateIndirectCommandsLayoutEXT = caps[278];
        this.vkDestroyIndirectCommandsLayoutEXT = caps[279];
        this.vkCreateIndirectExecutionSetEXT = caps[280];
        this.vkDestroyIndirectExecutionSetEXT = caps[281];
        this.vkUpdateIndirectExecutionSetPipelineEXT = caps[282];
        this.vkUpdateIndirectExecutionSetShaderEXT = caps[283];
        this.vkCmdSetDiscardRectangleEXT = caps[284];
        this.vkCmdSetDiscardRectangleEnableEXT = caps[285];
        this.vkCmdSetDiscardRectangleModeEXT = caps[286];
        this.vkDisplayPowerControlEXT = caps[287];
        this.vkRegisterDeviceEventEXT = caps[288];
        this.vkRegisterDisplayEventEXT = caps[289];
        this.vkGetSwapchainCounterEXT = caps[290];
        this.vkCmdSetCullModeEXT = caps[291];
        this.vkCmdSetFrontFaceEXT = caps[292];
        this.vkCmdSetPrimitiveTopologyEXT = caps[293];
        this.vkCmdSetViewportWithCountEXT = caps[294];
        this.vkCmdSetScissorWithCountEXT = caps[295];
        this.vkCmdBindVertexBuffers2EXT = caps[296];
        this.vkCmdSetDepthTestEnableEXT = caps[297];
        this.vkCmdSetDepthWriteEnableEXT = caps[298];
        this.vkCmdSetDepthCompareOpEXT = caps[299];
        this.vkCmdSetDepthBoundsTestEnableEXT = caps[300];
        this.vkCmdSetStencilTestEnableEXT = caps[301];
        this.vkCmdSetStencilOpEXT = caps[302];
        this.vkCmdSetPatchControlPointsEXT = caps[303];
        this.vkCmdSetRasterizerDiscardEnableEXT = caps[304];
        this.vkCmdSetDepthBiasEnableEXT = caps[305];
        this.vkCmdSetLogicOpEXT = caps[306];
        this.vkCmdSetPrimitiveRestartEnableEXT = caps[307];
        this.vkCmdSetDepthClampEnableEXT = caps[308];
        this.vkCmdSetPolygonModeEXT = caps[309];
        this.vkCmdSetRasterizationSamplesEXT = caps[310];
        this.vkCmdSetSampleMaskEXT = caps[311];
        this.vkCmdSetAlphaToCoverageEnableEXT = caps[312];
        this.vkCmdSetAlphaToOneEnableEXT = caps[313];
        this.vkCmdSetLogicOpEnableEXT = caps[314];
        this.vkCmdSetColorBlendEnableEXT = caps[315];
        this.vkCmdSetColorBlendEquationEXT = caps[316];
        this.vkCmdSetColorWriteMaskEXT = caps[317];
        this.vkCmdSetTessellationDomainOriginEXT = caps[318];
        this.vkCmdSetRasterizationStreamEXT = caps[319];
        this.vkCmdSetConservativeRasterizationModeEXT = caps[320];
        this.vkCmdSetExtraPrimitiveOverestimationSizeEXT = caps[321];
        this.vkCmdSetDepthClipEnableEXT = caps[322];
        this.vkCmdSetSampleLocationsEnableEXT = caps[323];
        this.vkCmdSetColorBlendAdvancedEXT = caps[324];
        this.vkCmdSetProvokingVertexModeEXT = caps[325];
        this.vkCmdSetLineRasterizationModeEXT = caps[326];
        this.vkCmdSetLineStippleEnableEXT = caps[327];
        this.vkCmdSetDepthClipNegativeOneToOneEXT = caps[328];
        this.vkCmdSetViewportWScalingEnableNV = caps[329];
        this.vkCmdSetViewportSwizzleNV = caps[330];
        this.vkCmdSetCoverageToColorEnableNV = caps[331];
        this.vkCmdSetCoverageToColorLocationNV = caps[332];
        this.vkCmdSetCoverageModulationModeNV = caps[333];
        this.vkCmdSetCoverageModulationTableEnableNV = caps[334];
        this.vkCmdSetCoverageModulationTableNV = caps[335];
        this.vkCmdSetShadingRateImageEnableNV = caps[336];
        this.vkCmdSetRepresentativeFragmentTestEnableNV = caps[337];
        this.vkCmdSetCoverageReductionModeNV = caps[338];
        this.vkGetMemoryHostPointerPropertiesEXT = caps[339];
        this.vkGetMemoryMetalHandleEXT = caps[340];
        this.vkGetMemoryMetalHandlePropertiesEXT = caps[341];
        this.vkCmdEndRendering2EXT = caps[342];
        this.vkAcquireFullScreenExclusiveModeEXT = caps[343];
        this.vkReleaseFullScreenExclusiveModeEXT = caps[344];
        this.vkGetDeviceGroupSurfacePresentModes2EXT = caps[345];
        this.vkSetHdrMetadataEXT = caps[346];
        this.vkCopyMemoryToImageEXT = caps[347];
        this.vkCopyImageToMemoryEXT = caps[348];
        this.vkCopyImageToImageEXT = caps[349];
        this.vkTransitionImageLayoutEXT = caps[350];
        this.vkGetImageSubresourceLayout2EXT = caps[351];
        this.vkResetQueryPoolEXT = caps[352];
        this.vkGetImageDrmFormatModifierPropertiesEXT = caps[353];
        this.vkCmdSetLineStippleEXT = caps[354];
        this.vkCmdDecompressMemoryEXT = caps[355];
        this.vkCmdDecompressMemoryIndirectCountEXT = caps[356];
        this.vkCmdDrawMeshTasksEXT = caps[357];
        this.vkCmdDrawMeshTasksIndirectEXT = caps[358];
        this.vkCmdDrawMeshTasksIndirectCountEXT = caps[359];
        this.vkExportMetalObjectsEXT = caps[360];
        this.vkCmdDrawMultiEXT = caps[361];
        this.vkCmdDrawMultiIndexedEXT = caps[362];
        this.vkCreateMicromapEXT = caps[363];
        this.vkDestroyMicromapEXT = caps[364];
        this.vkCmdBuildMicromapsEXT = caps[365];
        this.vkBuildMicromapsEXT = caps[366];
        this.vkCopyMicromapEXT = caps[367];
        this.vkCopyMicromapToMemoryEXT = caps[368];
        this.vkCopyMemoryToMicromapEXT = caps[369];
        this.vkWriteMicromapsPropertiesEXT = caps[370];
        this.vkCmdCopyMicromapEXT = caps[371];
        this.vkCmdCopyMicromapToMemoryEXT = caps[372];
        this.vkCmdCopyMemoryToMicromapEXT = caps[373];
        this.vkCmdWriteMicromapsPropertiesEXT = caps[374];
        this.vkGetDeviceMicromapCompatibilityEXT = caps[375];
        this.vkGetMicromapBuildSizesEXT = caps[376];
        this.vkSetDeviceMemoryPriorityEXT = caps[377];
        this.vkGetPipelinePropertiesEXT = caps[378];
        this.vkSetSwapchainPresentTimingQueueSizeEXT = caps[379];
        this.vkGetSwapchainTimingPropertiesEXT = caps[380];
        this.vkGetSwapchainTimeDomainPropertiesEXT = caps[381];
        this.vkGetPastPresentationTimingEXT = caps[382];
        this.vkCreatePrivateDataSlotEXT = caps[383];
        this.vkDestroyPrivateDataSlotEXT = caps[384];
        this.vkSetPrivateDataEXT = caps[385];
        this.vkGetPrivateDataEXT = caps[386];
        this.vkCmdSetSampleLocationsEXT = caps[387];
        this.vkGetShaderModuleIdentifierEXT = caps[388];
        this.vkGetShaderModuleCreateInfoIdentifierEXT = caps[389];
        this.vkCreateShadersEXT = caps[390];
        this.vkDestroyShaderEXT = caps[391];
        this.vkGetShaderBinaryDataEXT = caps[392];
        this.vkCmdBindShadersEXT = caps[393];
        this.vkCmdSetVertexInputEXT = caps[394];
        this.vkReleaseSwapchainImagesEXT = caps[395];
        this.vkCmdBindTransformFeedbackBuffersEXT = caps[396];
        this.vkCmdBeginTransformFeedbackEXT = caps[397];
        this.vkCmdEndTransformFeedbackEXT = caps[398];
        this.vkCmdBeginQueryIndexedEXT = caps[399];
        this.vkCmdEndQueryIndexedEXT = caps[400];
        this.vkCmdDrawIndirectByteCountEXT = caps[401];
        this.vkCreateValidationCacheEXT = caps[402];
        this.vkDestroyValidationCacheEXT = caps[403];
        this.vkMergeValidationCachesEXT = caps[404];
        this.vkGetValidationCacheDataEXT = caps[405];
        this.vkGetRefreshCycleDurationGOOGLE = caps[406];
        this.vkGetPastPresentationTimingGOOGLE = caps[407];
        this.vkCmdDrawClusterHUAWEI = caps[408];
        this.vkCmdDrawClusterIndirectHUAWEI = caps[409];
        this.vkCmdBindInvocationMaskHUAWEI = caps[410];
        this.vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = caps[411];
        this.vkCmdSubpassShadingHUAWEI = caps[412];
        this.vkInitializePerformanceApiINTEL = caps[413];
        this.vkUninitializePerformanceApiINTEL = caps[414];
        this.vkCmdSetPerformanceMarkerINTEL = caps[415];
        this.vkCmdSetPerformanceStreamMarkerINTEL = caps[416];
        this.vkCmdSetPerformanceOverrideINTEL = caps[417];
        this.vkAcquirePerformanceConfigurationINTEL = caps[418];
        this.vkReleasePerformanceConfigurationINTEL = caps[419];
        this.vkQueueSetPerformanceConfigurationINTEL = caps[420];
        this.vkGetPerformanceParameterINTEL = caps[421];
        this.vkCreateAccelerationStructureKHR = caps[422];
        this.vkDestroyAccelerationStructureKHR = caps[423];
        this.vkCmdBuildAccelerationStructuresKHR = caps[424];
        this.vkCmdBuildAccelerationStructuresIndirectKHR = caps[425];
        this.vkBuildAccelerationStructuresKHR = caps[426];
        this.vkCopyAccelerationStructureKHR = caps[427];
        this.vkCopyAccelerationStructureToMemoryKHR = caps[428];
        this.vkCopyMemoryToAccelerationStructureKHR = caps[429];
        this.vkWriteAccelerationStructuresPropertiesKHR = caps[430];
        this.vkCmdCopyAccelerationStructureKHR = caps[431];
        this.vkCmdCopyAccelerationStructureToMemoryKHR = caps[432];
        this.vkCmdCopyMemoryToAccelerationStructureKHR = caps[433];
        this.vkGetAccelerationStructureDeviceAddressKHR = caps[434];
        this.vkCmdWriteAccelerationStructuresPropertiesKHR = caps[435];
        this.vkGetDeviceAccelerationStructureCompatibilityKHR = caps[436];
        this.vkGetAccelerationStructureBuildSizesKHR = caps[437];
        this.vkBindBufferMemory2KHR = caps[438];
        this.vkBindImageMemory2KHR = caps[439];
        this.vkGetBufferDeviceAddressKHR = caps[440];
        this.vkGetBufferOpaqueCaptureAddressKHR = caps[441];
        this.vkGetDeviceMemoryOpaqueCaptureAddressKHR = caps[442];
        this.vkGetCalibratedTimestampsKHR = caps[443];
        this.vkCmdCopyBuffer2KHR = caps[444];
        this.vkCmdCopyImage2KHR = caps[445];
        this.vkCmdCopyBufferToImage2KHR = caps[446];
        this.vkCmdCopyImageToBuffer2KHR = caps[447];
        this.vkCmdBlitImage2KHR = caps[448];
        this.vkCmdResolveImage2KHR = caps[449];
        this.vkCmdCopyMemoryIndirectKHR = caps[450];
        this.vkCmdCopyMemoryToImageIndirectKHR = caps[451];
        this.vkCreateRenderPass2KHR = caps[452];
        this.vkCmdBeginRenderPass2KHR = caps[453];
        this.vkCmdNextSubpass2KHR = caps[454];
        this.vkCmdEndRenderPass2KHR = caps[455];
        this.vkCreateDeferredOperationKHR = caps[456];
        this.vkDestroyDeferredOperationKHR = caps[457];
        this.vkGetDeferredOperationMaxConcurrencyKHR = caps[458];
        this.vkGetDeferredOperationResultKHR = caps[459];
        this.vkDeferredOperationJoinKHR = caps[460];
        this.vkCreateDescriptorUpdateTemplateKHR = caps[461];
        this.vkDestroyDescriptorUpdateTemplateKHR = caps[462];
        this.vkUpdateDescriptorSetWithTemplateKHR = caps[463];
        this.vkCmdPushDescriptorSetWithTemplateKHR = caps[464];
        this.vkGetDeviceGroupPeerMemoryFeaturesKHR = caps[465];
        this.vkCmdSetDeviceMaskKHR = caps[466];
        this.vkCmdDispatchBaseKHR = caps[467];
        this.vkGetDeviceGroupPresentCapabilitiesKHR = caps[468];
        this.vkGetDeviceGroupSurfacePresentModesKHR = caps[469];
        this.vkAcquireNextImage2KHR = caps[470];
        this.vkCreateSharedSwapchainsKHR = caps[471];
        this.vkCmdDrawIndirectCountKHR = caps[472];
        this.vkCmdDrawIndexedIndirectCountKHR = caps[473];
        this.vkCmdBeginRenderingKHR = caps[474];
        this.vkCmdEndRenderingKHR = caps[475];
        this.vkCmdSetRenderingAttachmentLocationsKHR = caps[476];
        this.vkCmdSetRenderingInputAttachmentIndicesKHR = caps[477];
        this.vkImportFenceFdKHR = caps[478];
        this.vkGetFenceFdKHR = caps[479];
        this.vkImportFenceWin32HandleKHR = caps[480];
        this.vkGetFenceWin32HandleKHR = caps[481];
        this.vkGetMemoryFdKHR = caps[482];
        this.vkGetMemoryFdPropertiesKHR = caps[483];
        this.vkGetMemoryWin32HandleKHR = caps[484];
        this.vkGetMemoryWin32HandlePropertiesKHR = caps[485];
        this.vkImportSemaphoreFdKHR = caps[486];
        this.vkGetSemaphoreFdKHR = caps[487];
        this.vkImportSemaphoreWin32HandleKHR = caps[488];
        this.vkGetSemaphoreWin32HandleKHR = caps[489];
        this.vkCmdSetFragmentShadingRateKHR = caps[490];
        this.vkGetImageMemoryRequirements2KHR = caps[491];
        this.vkGetBufferMemoryRequirements2KHR = caps[492];
        this.vkGetImageSparseMemoryRequirements2KHR = caps[493];
        this.vkCmdSetLineStippleKHR = caps[494];
        this.vkTrimCommandPoolKHR = caps[495];
        this.vkCmdEndRendering2KHR = caps[496];
        this.vkGetDescriptorSetLayoutSupportKHR = caps[497];
        this.vkGetDeviceBufferMemoryRequirementsKHR = caps[498];
        this.vkGetDeviceImageMemoryRequirementsKHR = caps[499];
        this.vkGetDeviceImageSparseMemoryRequirementsKHR = caps[500];
        this.vkCmdBindIndexBuffer2KHR = caps[501];
        this.vkGetRenderingAreaGranularityKHR = caps[502];
        this.vkGetDeviceImageSubresourceLayoutKHR = caps[503];
        this.vkGetImageSubresourceLayout2KHR = caps[504];
        this.vkCmdBindDescriptorSets2KHR = caps[505];
        this.vkCmdPushConstants2KHR = caps[506];
        this.vkCmdPushDescriptorSet2KHR = caps[507];
        this.vkCmdPushDescriptorSetWithTemplate2KHR = caps[508];
        this.vkCmdSetDescriptorBufferOffsets2EXT = caps[509];
        this.vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = caps[510];
        this.vkMapMemory2KHR = caps[511];
        this.vkUnmapMemory2KHR = caps[512];
        this.vkAcquireProfilingLockKHR = caps[513];
        this.vkReleaseProfilingLockKHR = caps[514];
        this.vkCreatePipelineBinariesKHR = caps[515];
        this.vkDestroyPipelineBinaryKHR = caps[516];
        this.vkGetPipelineKeyKHR = caps[517];
        this.vkGetPipelineBinaryDataKHR = caps[518];
        this.vkReleaseCapturedPipelineDataKHR = caps[519];
        this.vkGetPipelineExecutablePropertiesKHR = caps[520];
        this.vkGetPipelineExecutableStatisticsKHR = caps[521];
        this.vkGetPipelineExecutableInternalRepresentationsKHR = caps[522];
        this.vkWaitForPresentKHR = caps[523];
        this.vkWaitForPresent2KHR = caps[524];
        this.vkCmdPushDescriptorSetKHR = caps[525];
        this.vkCmdTraceRaysIndirect2KHR = caps[526];
        this.vkCmdTraceRaysKHR = caps[527];
        this.vkCreateRayTracingPipelinesKHR = caps[528];
        this.vkGetRayTracingShaderGroupHandlesKHR = caps[529];
        this.vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = caps[530];
        this.vkCmdTraceRaysIndirectKHR = caps[531];
        this.vkGetRayTracingShaderGroupStackSizeKHR = caps[532];
        this.vkCmdSetRayTracingPipelineStackSizeKHR = caps[533];
        this.vkCreateSamplerYcbcrConversionKHR = caps[534];
        this.vkDestroySamplerYcbcrConversionKHR = caps[535];
        this.vkGetSwapchainStatusKHR = caps[536];
        this.vkCreateSwapchainKHR = caps[537];
        this.vkDestroySwapchainKHR = caps[538];
        this.vkGetSwapchainImagesKHR = caps[539];
        this.vkAcquireNextImageKHR = caps[540];
        this.vkQueuePresentKHR = caps[541];
        this.vkReleaseSwapchainImagesKHR = caps[542];
        this.vkCmdSetEvent2KHR = caps[543];
        this.vkCmdResetEvent2KHR = caps[544];
        this.vkCmdWaitEvents2KHR = caps[545];
        this.vkCmdPipelineBarrier2KHR = caps[546];
        this.vkCmdWriteTimestamp2KHR = caps[547];
        this.vkQueueSubmit2KHR = caps[548];
        this.vkGetSemaphoreCounterValueKHR = caps[549];
        this.vkWaitSemaphoresKHR = caps[550];
        this.vkSignalSemaphoreKHR = caps[551];
        this.vkCmdDecodeVideoKHR = caps[552];
        this.vkGetEncodedVideoSessionParametersKHR = caps[553];
        this.vkCmdEncodeVideoKHR = caps[554];
        this.vkCreateVideoSessionKHR = caps[555];
        this.vkDestroyVideoSessionKHR = caps[556];
        this.vkGetVideoSessionMemoryRequirementsKHR = caps[557];
        this.vkBindVideoSessionMemoryKHR = caps[558];
        this.vkCreateVideoSessionParametersKHR = caps[559];
        this.vkUpdateVideoSessionParametersKHR = caps[560];
        this.vkDestroyVideoSessionParametersKHR = caps[561];
        this.vkCmdBeginVideoCodingKHR = caps[562];
        this.vkCmdEndVideoCodingKHR = caps[563];
        this.vkCmdControlVideoCodingKHR = caps[564];
        this.vkCmdSetViewportWScalingNV = caps[565];
        this.vkGetClusterAccelerationStructureBuildSizesNV = caps[566];
        this.vkCmdBuildClusterAccelerationStructureIndirectNV = caps[567];
        this.vkCmdSetComputeOccupancyPriorityNV = caps[568];
        this.vkConvertCooperativeVectorMatrixNV = caps[569];
        this.vkCmdConvertCooperativeVectorMatrixNV = caps[570];
        this.vkCmdCopyMemoryIndirectNV = caps[571];
        this.vkCmdCopyMemoryToImageIndirectNV = caps[572];
        this.vkCreateCudaModuleNV = caps[573];
        this.vkGetCudaModuleCacheNV = caps[574];
        this.vkCreateCudaFunctionNV = caps[575];
        this.vkDestroyCudaModuleNV = caps[576];
        this.vkDestroyCudaFunctionNV = caps[577];
        this.vkCmdCudaLaunchKernelNV = caps[578];
        this.vkCmdSetCheckpointNV = caps[579];
        this.vkGetQueueCheckpointDataNV = caps[580];
        this.vkGetQueueCheckpointData2NV = caps[581];
        this.vkGetGeneratedCommandsMemoryRequirementsNV = caps[582];
        this.vkCmdPreprocessGeneratedCommandsNV = caps[583];
        this.vkCmdExecuteGeneratedCommandsNV = caps[584];
        this.vkCmdBindPipelineShaderGroupNV = caps[585];
        this.vkCreateIndirectCommandsLayoutNV = caps[586];
        this.vkDestroyIndirectCommandsLayoutNV = caps[587];
        this.vkGetPipelineIndirectMemoryRequirementsNV = caps[588];
        this.vkCmdUpdatePipelineIndirectBufferNV = caps[589];
        this.vkGetPipelineIndirectDeviceAddressNV = caps[590];
        this.vkCreateExternalComputeQueueNV = caps[591];
        this.vkDestroyExternalComputeQueueNV = caps[592];
        this.vkGetExternalComputeQueueDataNV = caps[593];
        this.vkGetMemoryRemoteAddressNV = caps[594];
        this.vkGetMemoryWin32HandleNV = caps[595];
        this.vkCmdSetFragmentShadingRateEnumNV = caps[596];
        this.vkSetLatencySleepModeNV = caps[597];
        this.vkLatencySleepNV = caps[598];
        this.vkSetLatencyMarkerNV = caps[599];
        this.vkGetLatencyTimingsNV = caps[600];
        this.vkQueueNotifyOutOfBandNV = caps[601];
        this.vkCmdDecompressMemoryNV = caps[602];
        this.vkCmdDecompressMemoryIndirectCountNV = caps[603];
        this.vkCmdDrawMeshTasksNV = caps[604];
        this.vkCmdDrawMeshTasksIndirectNV = caps[605];
        this.vkCmdDrawMeshTasksIndirectCountNV = caps[606];
        this.vkCreateOpticalFlowSessionNV = caps[607];
        this.vkDestroyOpticalFlowSessionNV = caps[608];
        this.vkBindOpticalFlowSessionImageNV = caps[609];
        this.vkCmdOpticalFlowExecuteNV = caps[610];
        this.vkGetPartitionedAccelerationStructuresBuildSizesNV = caps[611];
        this.vkCmdBuildPartitionedAccelerationStructuresNV = caps[612];
        this.vkCreateAccelerationStructureNV = caps[613];
        this.vkDestroyAccelerationStructureNV = caps[614];
        this.vkGetAccelerationStructureMemoryRequirementsNV = caps[615];
        this.vkBindAccelerationStructureMemoryNV = caps[616];
        this.vkCmdBuildAccelerationStructureNV = caps[617];
        this.vkCmdCopyAccelerationStructureNV = caps[618];
        this.vkCmdTraceRaysNV = caps[619];
        this.vkCreateRayTracingPipelinesNV = caps[620];
        this.vkGetRayTracingShaderGroupHandlesNV = caps[621];
        this.vkGetAccelerationStructureHandleNV = caps[622];
        this.vkCmdWriteAccelerationStructuresPropertiesNV = caps[623];
        this.vkCompileDeferredNV = caps[624];
        this.vkCmdSetExclusiveScissorEnableNV = caps[625];
        this.vkCmdSetExclusiveScissorNV = caps[626];
        this.vkCmdBindShadingRateImageNV = caps[627];
        this.vkCmdSetViewportShadingRatePaletteNV = caps[628];
        this.vkCmdSetCoarseSampleOrderNV = caps[629];
        this.vkCreateCuModuleNVX = caps[630];
        this.vkCreateCuFunctionNVX = caps[631];
        this.vkDestroyCuModuleNVX = caps[632];
        this.vkDestroyCuFunctionNVX = caps[633];
        this.vkCmdCuLaunchKernelNVX = caps[634];
        this.vkGetImageViewHandleNVX = caps[635];
        this.vkGetImageViewHandle64NVX = caps[636];
        this.vkGetImageViewAddressNVX = caps[637];
        this.vkGetDeviceCombinedImageSamplerIndexNVX = caps[638];
        this.vkCmdBindTileMemoryQCOM = caps[639];
        this.vkGetFramebufferTilePropertiesQCOM = caps[640];
        this.vkGetDynamicRenderingTilePropertiesQCOM = caps[641];
        this.vkCmdDispatchTileQCOM = caps[642];
        this.vkCmdBeginPerTileExecutionQCOM = caps[643];
        this.vkCmdEndPerTileExecutionQCOM = caps[644];
        this.vkGetDescriptorSetLayoutHostMappingInfoVALVE = caps[645];
        this.vkGetDescriptorSetHostMappingVALVE = caps[646];
    }

    private static boolean check_VK10(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains("Vulkan10")) {
            return Checks.checkFunctions(provider, caps, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120}, "vkGetDeviceProcAddr", "vkDestroyDevice", "vkGetDeviceQueue", "vkQueueSubmit", "vkQueueWaitIdle", "vkDeviceWaitIdle", "vkAllocateMemory", "vkFreeMemory", "vkMapMemory", "vkUnmapMemory", "vkFlushMappedMemoryRanges", "vkInvalidateMappedMemoryRanges", "vkGetDeviceMemoryCommitment", "vkBindBufferMemory", "vkBindImageMemory", "vkGetBufferMemoryRequirements", "vkGetImageMemoryRequirements", "vkGetImageSparseMemoryRequirements", "vkQueueBindSparse", "vkCreateFence", "vkDestroyFence", "vkResetFences", "vkGetFenceStatus", "vkWaitForFences", "vkCreateSemaphore", "vkDestroySemaphore", "vkCreateQueryPool", "vkDestroyQueryPool", "vkGetQueryPoolResults", "vkCreateBuffer", "vkDestroyBuffer", "vkCreateImage", "vkDestroyImage", "vkGetImageSubresourceLayout", "vkCreateImageView", "vkDestroyImageView", "vkCreateCommandPool", "vkDestroyCommandPool", "vkResetCommandPool", "vkAllocateCommandBuffers", "vkFreeCommandBuffers", "vkBeginCommandBuffer", "vkEndCommandBuffer", "vkResetCommandBuffer", "vkCmdCopyBuffer", "vkCmdCopyImage", "vkCmdCopyBufferToImage", "vkCmdCopyImageToBuffer", "vkCmdUpdateBuffer", "vkCmdFillBuffer", "vkCmdPipelineBarrier", "vkCmdBeginQuery", "vkCmdEndQuery", "vkCmdResetQueryPool", "vkCmdWriteTimestamp", "vkCmdCopyQueryPoolResults", "vkCmdExecuteCommands", "vkCreateEvent", "vkDestroyEvent", "vkGetEventStatus", "vkSetEvent", "vkResetEvent", "vkCreateBufferView", "vkDestroyBufferView", "vkCreateShaderModule", "vkDestroyShaderModule", "vkCreatePipelineCache", "vkDestroyPipelineCache", "vkGetPipelineCacheData", "vkMergePipelineCaches", "vkCreateComputePipelines", "vkDestroyPipeline", "vkCreatePipelineLayout", "vkDestroyPipelineLayout", "vkCreateSampler", "vkDestroySampler", "vkCreateDescriptorSetLayout", "vkDestroyDescriptorSetLayout", "vkCreateDescriptorPool", "vkDestroyDescriptorPool", "vkResetDescriptorPool", "vkAllocateDescriptorSets", "vkFreeDescriptorSets", "vkUpdateDescriptorSets", "vkCmdBindPipeline", "vkCmdBindDescriptorSets", "vkCmdClearColorImage", "vkCmdDispatch", "vkCmdDispatchIndirect", "vkCmdSetEvent", "vkCmdResetEvent", "vkCmdWaitEvents", "vkCmdPushConstants", "vkCreateGraphicsPipelines", "vkCreateFramebuffer", "vkDestroyFramebuffer", "vkCreateRenderPass", "vkDestroyRenderPass", "vkGetRenderAreaGranularity", "vkCmdSetViewport", "vkCmdSetScissor", "vkCmdSetLineWidth", "vkCmdSetDepthBias", "vkCmdSetBlendConstants", "vkCmdSetDepthBounds", "vkCmdSetStencilCompareMask", "vkCmdSetStencilWriteMask", "vkCmdSetStencilReference", "vkCmdBindIndexBuffer", "vkCmdBindVertexBuffers", "vkCmdDraw", "vkCmdDrawIndexed", "vkCmdDrawIndirect", "vkCmdDrawIndexedIndirect", "vkCmdBlitImage", "vkCmdClearDepthStencilImage", "vkCmdClearAttachments", "vkCmdResolveImage", "vkCmdBeginRenderPass", "vkCmdNextSubpass", "vkCmdEndRenderPass") || Checks.reportMissing("VK", "Vulkan10");
        }
        return false;
    }

    private static boolean check_VK11(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains("Vulkan11")) {
            return Checks.checkFunctions(provider, caps, new int[]{121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136}, "vkBindBufferMemory2", "vkBindImageMemory2", "vkGetDeviceGroupPeerMemoryFeatures", "vkCmdSetDeviceMask", "vkGetImageMemoryRequirements2", "vkGetBufferMemoryRequirements2", "vkGetImageSparseMemoryRequirements2", "vkTrimCommandPool", "vkGetDeviceQueue2", "vkCmdDispatchBase", "vkCreateDescriptorUpdateTemplate", "vkDestroyDescriptorUpdateTemplate", "vkUpdateDescriptorSetWithTemplate", "vkGetDescriptorSetLayoutSupport", "vkCreateSamplerYcbcrConversion", "vkDestroySamplerYcbcrConversion") || Checks.reportMissing("VK", "Vulkan11");
        }
        return false;
    }

    private static boolean check_VK12(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains("Vulkan12")) {
            return Checks.checkFunctions(provider, caps, new int[]{137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149}, "vkResetQueryPool", "vkGetSemaphoreCounterValue", "vkWaitSemaphores", "vkSignalSemaphore", "vkGetBufferDeviceAddress", "vkGetBufferOpaqueCaptureAddress", "vkGetDeviceMemoryOpaqueCaptureAddress", "vkCmdDrawIndirectCount", "vkCmdDrawIndexedIndirectCount", "vkCreateRenderPass2", "vkCmdBeginRenderPass2", "vkCmdNextSubpass2", "vkCmdEndRenderPass2") || Checks.reportMissing("VK", "Vulkan12");
        }
        return false;
    }

    private static boolean check_VK13(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains("Vulkan13")) {
            return Checks.checkFunctions(provider, caps, new int[]{150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185}, "vkCreatePrivateDataSlot", "vkDestroyPrivateDataSlot", "vkSetPrivateData", "vkGetPrivateData", "vkCmdPipelineBarrier2", "vkCmdWriteTimestamp2", "vkQueueSubmit2", "vkCmdCopyBuffer2", "vkCmdCopyImage2", "vkCmdCopyBufferToImage2", "vkCmdCopyImageToBuffer2", "vkGetDeviceBufferMemoryRequirements", "vkGetDeviceImageMemoryRequirements", "vkGetDeviceImageSparseMemoryRequirements", "vkCmdSetEvent2", "vkCmdResetEvent2", "vkCmdWaitEvents2", "vkCmdBlitImage2", "vkCmdResolveImage2", "vkCmdBeginRendering", "vkCmdEndRendering", "vkCmdSetCullMode", "vkCmdSetFrontFace", "vkCmdSetPrimitiveTopology", "vkCmdSetViewportWithCount", "vkCmdSetScissorWithCount", "vkCmdBindVertexBuffers2", "vkCmdSetDepthTestEnable", "vkCmdSetDepthWriteEnable", "vkCmdSetDepthCompareOp", "vkCmdSetDepthBoundsTestEnable", "vkCmdSetStencilTestEnable", "vkCmdSetStencilOp", "vkCmdSetRasterizerDiscardEnable", "vkCmdSetDepthBiasEnable", "vkCmdSetPrimitiveRestartEnable") || Checks.reportMissing("VK", "Vulkan13");
        }
        return false;
    }

    private static boolean check_VK14(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains("Vulkan14")) {
            return Checks.checkFunctions(provider, caps, new int[]{186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204}, "vkMapMemory2", "vkUnmapMemory2", "vkGetDeviceImageSubresourceLayout", "vkGetImageSubresourceLayout2", "vkCopyMemoryToImage", "vkCopyImageToMemory", "vkCopyImageToImage", "vkTransitionImageLayout", "vkCmdPushDescriptorSet", "vkCmdPushDescriptorSetWithTemplate", "vkCmdBindDescriptorSets2", "vkCmdPushConstants2", "vkCmdPushDescriptorSet2", "vkCmdPushDescriptorSetWithTemplate2", "vkCmdSetLineStipple", "vkCmdBindIndexBuffer2", "vkGetRenderingAreaGranularity", "vkCmdSetRenderingAttachmentLocations", "vkCmdSetRenderingInputAttachmentIndices") || Checks.reportMissing("VK", "Vulkan14");
        }
        return false;
    }

    private static boolean check_AMD_anti_lag(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(AMDAntiLag.VK_AMD_ANTI_LAG_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{205}, "vkAntiLagUpdateAMD") || Checks.reportMissing("VK", AMDAntiLag.VK_AMD_ANTI_LAG_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_AMD_buffer_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(AMDBufferMarker.VK_AMD_BUFFER_MARKER_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = (ext.contains("Vulkan13") || ext.contains(KHRSynchronization2.VK_KHR_SYNCHRONIZATION_2_EXTENSION_NAME)) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{206, flag0 + 207}, "vkCmdWriteBufferMarkerAMD", "vkCmdWriteBufferMarker2AMD") || Checks.reportMissing("VK", AMDBufferMarker.VK_AMD_BUFFER_MARKER_EXTENSION_NAME);
    }

    private static boolean check_AMD_display_native_hdr(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(AMDDisplayNativeHdr.VK_AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{208}, "vkSetLocalDimmingAMD") || Checks.reportMissing("VK", AMDDisplayNativeHdr.VK_AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_AMD_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(AMDDrawIndirectCount.VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{209, 210}, "vkCmdDrawIndirectCountAMD", "vkCmdDrawIndexedIndirectCountAMD") || Checks.reportMissing("VK", AMDDrawIndirectCount.VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_AMD_shader_info(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(AMDShaderInfo.VK_AMD_SHADER_INFO_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{211}, "vkGetShaderInfoAMD") || Checks.reportMissing("VK", AMDShaderInfo.VK_AMD_SHADER_INFO_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_AMDX_shader_enqueue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(AMDXShaderEnqueue.VK_AMDX_SHADER_ENQUEUE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{212, 213, 214, 215, SDLScancode.SDL_SCANCODE_KP_CLEAR, SDLScancode.SDL_SCANCODE_KP_CLEARENTRY, 218}, "vkCreateExecutionGraphPipelinesAMDX", "vkGetExecutionGraphPipelineScratchSizeAMDX", "vkGetExecutionGraphPipelineNodeIndexAMDX", "vkCmdInitializeGraphScratchMemoryAMDX", "vkCmdDispatchGraphAMDX", "vkCmdDispatchGraphIndirectAMDX", "vkCmdDispatchGraphIndirectCountAMDX") || Checks.reportMissing("VK", AMDXShaderEnqueue.VK_AMDX_SHADER_ENQUEUE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_ANDROID_external_memory_android_hardware_buffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{219, 220}, "vkGetAndroidHardwareBufferPropertiesANDROID", "vkGetMemoryAndroidHardwareBufferANDROID") || Checks.reportMissing("VK", ANDROIDExternalMemoryAndroidHardwareBuffer.VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_ARM_data_graph(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(ARMDataGraph.VK_ARM_DATA_GRAPH_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{221, 222, 223, 224, 225, 226, 227, 228, 229}, "vkCreateDataGraphPipelinesARM", "vkCreateDataGraphPipelineSessionARM", "vkGetDataGraphPipelineSessionBindPointRequirementsARM", "vkGetDataGraphPipelineSessionMemoryRequirementsARM", "vkBindDataGraphPipelineSessionMemoryARM", "vkDestroyDataGraphPipelineSessionARM", "vkCmdDispatchDataGraphARM", "vkGetDataGraphPipelineAvailablePropertiesARM", "vkGetDataGraphPipelinePropertiesARM") || Checks.reportMissing("VK", ARMDataGraph.VK_ARM_DATA_GRAPH_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_ARM_tensors(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(ARMTensors.VK_ARM_TENSORS_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = ext.contains(EXTDescriptorBuffer.VK_EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{230, 231, Spv.SpvOpAtomicIIncrement, 233, 234, 235, 236, 237, flag0 + 238, flag0 + 239}, "vkCreateTensorARM", "vkDestroyTensorARM", "vkCreateTensorViewARM", "vkDestroyTensorViewARM", "vkGetTensorMemoryRequirementsARM", "vkBindTensorMemoryARM", "vkGetDeviceTensorMemoryRequirementsARM", "vkCmdCopyTensorARM", "vkGetTensorOpaqueCaptureDescriptorDataARM", "vkGetTensorViewOpaqueCaptureDescriptorDataARM") || Checks.reportMissing("VK", ARMTensors.VK_ARM_TENSORS_EXTENSION_NAME);
    }

    private static boolean check_EXT_attachment_feedback_loop_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTAttachmentFeedbackLoopDynamicState.VK_EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{240}, "vkCmdSetAttachmentFeedbackLoopEnableEXT") || Checks.reportMissing("VK", EXTAttachmentFeedbackLoopDynamicState.VK_EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTBufferDeviceAddress.VK_EXT_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{241}, "vkGetBufferDeviceAddressEXT") || Checks.reportMissing("VK", EXTBufferDeviceAddress.VK_EXT_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTCalibratedTimestamps.VK_EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{242}, "vkGetCalibratedTimestampsEXT") || Checks.reportMissing("VK", EXTCalibratedTimestamps.VK_EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_color_write_enable(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTColorWriteEnable.VK_EXT_COLOR_WRITE_ENABLE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{243}, "vkCmdSetColorWriteEnableEXT") || Checks.reportMissing("VK", EXTColorWriteEnable.VK_EXT_COLOR_WRITE_ENABLE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_conditional_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTConditionalRendering.VK_EXT_CONDITIONAL_RENDERING_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{244, 245}, "vkCmdBeginConditionalRenderingEXT", "vkCmdEndConditionalRenderingEXT") || Checks.reportMissing("VK", EXTConditionalRendering.VK_EXT_CONDITIONAL_RENDERING_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_custom_resolve(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(EXTCustomResolve.VK_EXT_CUSTOM_RESOLVE_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = (ext.contains(KHRDynamicRendering.VK_KHR_DYNAMIC_RENDERING_EXTENSION_NAME) || ext.contains("Vulkan13")) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{flag0 + 246}, "vkCmdBeginCustomResolveEXT") || Checks.reportMissing("VK", EXTCustomResolve.VK_EXT_CUSTOM_RESOLVE_EXTENSION_NAME);
    }

    private static boolean check_EXT_debug_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDebugMarker.VK_EXT_DEBUG_MARKER_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{247, 248, 249, 250, 251}, "vkDebugMarkerSetObjectTagEXT", "vkDebugMarkerSetObjectNameEXT", "vkCmdDebugMarkerBeginEXT", "vkCmdDebugMarkerEndEXT", "vkCmdDebugMarkerInsertEXT") || Checks.reportMissing("VK", EXTDebugMarker.VK_EXT_DEBUG_MARKER_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_depth_bias_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDepthBiasControl.VK_EXT_DEPTH_BIAS_CONTROL_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{252}, "vkCmdSetDepthBias2EXT") || Checks.reportMissing("VK", EXTDepthBiasControl.VK_EXT_DEPTH_BIAS_CONTROL_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_depth_clamp_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDepthClampControl.VK_EXT_DEPTH_CLAMP_CONTROL_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{253}, "vkCmdSetDepthClampRangeEXT") || Checks.reportMissing("VK", EXTDepthClampControl.VK_EXT_DEPTH_CLAMP_CONTROL_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_descriptor_buffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(EXTDescriptorBuffer.VK_EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = (ext.contains(KHRAccelerationStructure.VK_KHR_ACCELERATION_STRUCTURE_EXTENSION_NAME) || ext.contains(NVRayTracing.VK_NV_RAY_TRACING_EXTENSION_NAME)) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{254, 255, 256, 257, 258, 259, 260, 261, 262, 263, flag0 + 264}, "vkGetDescriptorSetLayoutSizeEXT", "vkGetDescriptorSetLayoutBindingOffsetEXT", "vkGetDescriptorEXT", "vkCmdBindDescriptorBuffersEXT", "vkCmdSetDescriptorBufferOffsetsEXT", "vkCmdBindDescriptorBufferEmbeddedSamplersEXT", "vkGetBufferOpaqueCaptureDescriptorDataEXT", "vkGetImageOpaqueCaptureDescriptorDataEXT", "vkGetImageViewOpaqueCaptureDescriptorDataEXT", "vkGetSamplerOpaqueCaptureDescriptorDataEXT", "vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT") || Checks.reportMissing("VK", EXTDescriptorBuffer.VK_EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME);
    }

    private static boolean check_EXT_descriptor_heap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(EXTDescriptorHeap.VK_EXT_DESCRIPTOR_HEAP_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = ext.contains(EXTCustomBorderColor.VK_EXT_CUSTOM_BORDER_COLOR_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains(ARMTensors.VK_ARM_TENSORS_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{265, 266, 267, 268, 269, 270, flag0 + 271, flag0 + 272, flag2 + 273}, "vkWriteSamplerDescriptorsEXT", "vkWriteResourceDescriptorsEXT", "vkCmdBindSamplerHeapEXT", "vkCmdBindResourceHeapEXT", "vkCmdPushDataEXT", "vkGetImageOpaqueCaptureDataEXT", "vkRegisterCustomBorderColorEXT", "vkUnregisterCustomBorderColorEXT", "vkGetTensorOpaqueCaptureDataARM") || Checks.reportMissing("VK", EXTDescriptorHeap.VK_EXT_DESCRIPTOR_HEAP_EXTENSION_NAME);
    }

    private static boolean check_EXT_device_fault(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDeviceFault.VK_EXT_DEVICE_FAULT_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{274}, "vkGetDeviceFaultInfoEXT") || Checks.reportMissing("VK", EXTDeviceFault.VK_EXT_DEVICE_FAULT_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_device_generated_commands(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDeviceGeneratedCommands.VK_EXT_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{275, 276, 277, 278, 279, 280, 281, 282, 283}, "vkGetGeneratedCommandsMemoryRequirementsEXT", "vkCmdPreprocessGeneratedCommandsEXT", "vkCmdExecuteGeneratedCommandsEXT", "vkCreateIndirectCommandsLayoutEXT", "vkDestroyIndirectCommandsLayoutEXT", "vkCreateIndirectExecutionSetEXT", "vkDestroyIndirectExecutionSetEXT", "vkUpdateIndirectExecutionSetPipelineEXT", "vkUpdateIndirectExecutionSetShaderEXT") || Checks.reportMissing("VK", EXTDeviceGeneratedCommands.VK_EXT_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_discard_rectangles(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDiscardRectangles.VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{284, 285, 286}, "vkCmdSetDiscardRectangleEXT", "vkCmdSetDiscardRectangleEnableEXT", "vkCmdSetDiscardRectangleModeEXT") || Checks.reportMissing("VK", EXTDiscardRectangles.VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_display_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDisplayControl.VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{287, 288, 289, 290}, "vkDisplayPowerControlEXT", "vkRegisterDeviceEventEXT", "vkRegisterDisplayEventEXT", "vkGetSwapchainCounterEXT") || Checks.reportMissing("VK", EXTDisplayControl.VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_extended_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTExtendedDynamicState.VK_EXT_EXTENDED_DYNAMIC_STATE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302}, "vkCmdSetCullModeEXT", "vkCmdSetFrontFaceEXT", "vkCmdSetPrimitiveTopologyEXT", "vkCmdSetViewportWithCountEXT", "vkCmdSetScissorWithCountEXT", "vkCmdBindVertexBuffers2EXT", "vkCmdSetDepthTestEnableEXT", "vkCmdSetDepthWriteEnableEXT", "vkCmdSetDepthCompareOpEXT", "vkCmdSetDepthBoundsTestEnableEXT", "vkCmdSetStencilTestEnableEXT", "vkCmdSetStencilOpEXT") || Checks.reportMissing("VK", EXTExtendedDynamicState.VK_EXT_EXTENDED_DYNAMIC_STATE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_extended_dynamic_state2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTExtendedDynamicState2.VK_EXT_EXTENDED_DYNAMIC_STATE_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{303, 304, 305, 306, 307}, "vkCmdSetPatchControlPointsEXT", "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetDepthBiasEnableEXT", "vkCmdSetLogicOpEXT", "vkCmdSetPrimitiveRestartEnableEXT") || Checks.reportMissing("VK", EXTExtendedDynamicState2.VK_EXT_EXTENDED_DYNAMIC_STATE_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_extended_dynamic_state3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(EXTExtendedDynamicState3.VK_EXT_EXTENDED_DYNAMIC_STATE_3_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = (ext.contains("VK_KHR_maintenance2") || ext.contains("Vulkan11")) ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains(EXTTransformFeedback.VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains(EXTConservativeRasterization.VK_EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag4 = ext.contains(EXTDepthClipEnable.VK_EXT_DEPTH_CLIP_ENABLE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag5 = ext.contains(EXTSampleLocations.VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag6 = ext.contains(EXTBlendOperationAdvanced.VK_EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag7 = ext.contains(EXTProvokingVertex.VK_EXT_PROVOKING_VERTEX_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag8 = ext.contains(EXTLineRasterization.VK_EXT_LINE_RASTERIZATION_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag10 = ext.contains(EXTDepthClipControl.VK_EXT_DEPTH_CLIP_CONTROL_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag11 = ext.contains(NVClipSpaceWScaling.VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag12 = ext.contains(NVViewportSwizzle.VK_NV_VIEWPORT_SWIZZLE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag13 = ext.contains(NVFragmentCoverageToColor.VK_NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag15 = ext.contains(NVFramebufferMixedSamples.VK_NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag18 = ext.contains(NVShadingRateImage.VK_NV_SHADING_RATE_IMAGE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag19 = ext.contains(NVRepresentativeFragmentTest.VK_NV_REPRESENTATIVE_FRAGMENT_TEST_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag20 = ext.contains(NVCoverageReductionMode.VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{308, 309, 310, 311, 312, 313, 314, 315, 316, 317, flag0 + 318, flag1 + 319, flag2 + 320, flag2 + 321, flag4 + 322, flag5 + 323, flag6 + 324, flag7 + 325, flag8 + 326, flag8 + 327, flag10 + 328, flag11 + 329, flag12 + 330, flag13 + 331, flag13 + 332, flag15 + 333, flag15 + 334, flag15 + 335, flag18 + 336, flag19 + 337, flag20 + 338}, "vkCmdSetDepthClampEnableEXT", "vkCmdSetPolygonModeEXT", "vkCmdSetRasterizationSamplesEXT", "vkCmdSetSampleMaskEXT", "vkCmdSetAlphaToCoverageEnableEXT", "vkCmdSetAlphaToOneEnableEXT", "vkCmdSetLogicOpEnableEXT", "vkCmdSetColorBlendEnableEXT", "vkCmdSetColorBlendEquationEXT", "vkCmdSetColorWriteMaskEXT", "vkCmdSetTessellationDomainOriginEXT", "vkCmdSetRasterizationStreamEXT", "vkCmdSetConservativeRasterizationModeEXT", "vkCmdSetExtraPrimitiveOverestimationSizeEXT", "vkCmdSetDepthClipEnableEXT", "vkCmdSetSampleLocationsEnableEXT", "vkCmdSetColorBlendAdvancedEXT", "vkCmdSetProvokingVertexModeEXT", "vkCmdSetLineRasterizationModeEXT", "vkCmdSetLineStippleEnableEXT", "vkCmdSetDepthClipNegativeOneToOneEXT", "vkCmdSetViewportWScalingEnableNV", "vkCmdSetViewportSwizzleNV", "vkCmdSetCoverageToColorEnableNV", "vkCmdSetCoverageToColorLocationNV", "vkCmdSetCoverageModulationModeNV", "vkCmdSetCoverageModulationTableEnableNV", "vkCmdSetCoverageModulationTableNV", "vkCmdSetShadingRateImageEnableNV", "vkCmdSetRepresentativeFragmentTestEnableNV", "vkCmdSetCoverageReductionModeNV") || Checks.reportMissing("VK", EXTExtendedDynamicState3.VK_EXT_EXTENDED_DYNAMIC_STATE_3_EXTENSION_NAME);
    }

    private static boolean check_EXT_external_memory_host(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTExternalMemoryHost.VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{339}, "vkGetMemoryHostPointerPropertiesEXT") || Checks.reportMissing("VK", EXTExternalMemoryHost.VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_external_memory_metal(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTExternalMemoryMetal.VK_EXT_EXTERNAL_MEMORY_METAL_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{340, 341}, "vkGetMemoryMetalHandleEXT", "vkGetMemoryMetalHandlePropertiesEXT") || Checks.reportMissing("VK", EXTExternalMemoryMetal.VK_EXT_EXTERNAL_MEMORY_METAL_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_fragment_density_map_offset(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTFragmentDensityMapOffset.VK_EXT_FRAGMENT_DENSITY_MAP_OFFSET_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{342}, "vkCmdEndRendering2EXT") || Checks.reportMissing("VK", EXTFragmentDensityMapOffset.VK_EXT_FRAGMENT_DENSITY_MAP_OFFSET_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_full_screen_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(EXTFullScreenExclusive.VK_EXT_FULL_SCREEN_EXCLUSIVE_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = (ext.contains(KHRDeviceGroup.VK_KHR_DEVICE_GROUP_EXTENSION_NAME) || ext.contains("Vulkan11")) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{343, 344, flag0 + 345}, "vkAcquireFullScreenExclusiveModeEXT", "vkReleaseFullScreenExclusiveModeEXT", "vkGetDeviceGroupSurfacePresentModes2EXT") || Checks.reportMissing("VK", EXTFullScreenExclusive.VK_EXT_FULL_SCREEN_EXCLUSIVE_EXTENSION_NAME);
    }

    private static boolean check_EXT_hdr_metadata(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTHdrMetadata.VK_EXT_HDR_METADATA_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{346}, "vkSetHdrMetadataEXT") || Checks.reportMissing("VK", EXTHdrMetadata.VK_EXT_HDR_METADATA_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_host_image_copy(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTHostImageCopy.VK_EXT_HOST_IMAGE_COPY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{347, 348, Spv.SpvOpGroupNonUniformIAdd, 350, 351}, "vkCopyMemoryToImageEXT", "vkCopyImageToMemoryEXT", "vkCopyImageToImageEXT", "vkTransitionImageLayoutEXT", "vkGetImageSubresourceLayout2EXT") || Checks.reportMissing("VK", EXTHostImageCopy.VK_EXT_HOST_IMAGE_COPY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_host_query_reset(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTHostQueryReset.VK_EXT_HOST_QUERY_RESET_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{352}, "vkResetQueryPoolEXT") || Checks.reportMissing("VK", EXTHostQueryReset.VK_EXT_HOST_QUERY_RESET_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_image_compression_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTImageCompressionControl.VK_EXT_IMAGE_COMPRESSION_CONTROL_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{351}, "vkGetImageSubresourceLayout2EXT") || Checks.reportMissing("VK", EXTImageCompressionControl.VK_EXT_IMAGE_COMPRESSION_CONTROL_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_image_drm_format_modifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTImageDrmFormatModifier.VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{353}, "vkGetImageDrmFormatModifierPropertiesEXT") || Checks.reportMissing("VK", EXTImageDrmFormatModifier.VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_line_rasterization(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTLineRasterization.VK_EXT_LINE_RASTERIZATION_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{354}, "vkCmdSetLineStippleEXT") || Checks.reportMissing("VK", EXTLineRasterization.VK_EXT_LINE_RASTERIZATION_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_memory_decompression(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTMemoryDecompression.VK_EXT_MEMORY_DECOMPRESSION_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{355, 356}, "vkCmdDecompressMemoryEXT", "vkCmdDecompressMemoryIndirectCountEXT") || Checks.reportMissing("VK", EXTMemoryDecompression.VK_EXT_MEMORY_DECOMPRESSION_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(EXTMeshShader.VK_EXT_MESH_SHADER_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = (ext.contains("Vulkan12") || ext.contains(KHRDrawIndirectCount.VK_KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME) || ext.contains(AMDDrawIndirectCount.VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME)) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{357, 358, flag0 + 359}, "vkCmdDrawMeshTasksEXT", "vkCmdDrawMeshTasksIndirectEXT", "vkCmdDrawMeshTasksIndirectCountEXT") || Checks.reportMissing("VK", EXTMeshShader.VK_EXT_MESH_SHADER_EXTENSION_NAME);
    }

    private static boolean check_EXT_metal_objects(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTMetalObjects.VK_EXT_METAL_OBJECTS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{360}, "vkExportMetalObjectsEXT") || Checks.reportMissing("VK", EXTMetalObjects.VK_EXT_METAL_OBJECTS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_multi_draw(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTMultiDraw.VK_EXT_MULTI_DRAW_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{361, 362}, "vkCmdDrawMultiEXT", "vkCmdDrawMultiIndexedEXT") || Checks.reportMissing("VK", EXTMultiDraw.VK_EXT_MULTI_DRAW_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_opacity_micromap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTOpacityMicromap.VK_EXT_OPACITY_MICROMAP_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{363, 364, 365, 366, TokenId.RSHIFT_E, TokenId.OROR, TokenId.ANDAND, TokenId.ARSHIFT, TokenId.ARSHIFT_E, 372, 373, 374, 375, 376}, "vkCreateMicromapEXT", "vkDestroyMicromapEXT", "vkCmdBuildMicromapsEXT", "vkBuildMicromapsEXT", "vkCopyMicromapEXT", "vkCopyMicromapToMemoryEXT", "vkCopyMemoryToMicromapEXT", "vkWriteMicromapsPropertiesEXT", "vkCmdCopyMicromapEXT", "vkCmdCopyMicromapToMemoryEXT", "vkCmdCopyMemoryToMicromapEXT", "vkCmdWriteMicromapsPropertiesEXT", "vkGetDeviceMicromapCompatibilityEXT", "vkGetMicromapBuildSizesEXT") || Checks.reportMissing("VK", EXTOpacityMicromap.VK_EXT_OPACITY_MICROMAP_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_pageable_device_local_memory(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTPageableDeviceLocalMemory.VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{377}, "vkSetDeviceMemoryPriorityEXT") || Checks.reportMissing("VK", EXTPageableDeviceLocalMemory.VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_pipeline_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTPipelineProperties.VK_EXT_PIPELINE_PROPERTIES_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{378}, "vkGetPipelinePropertiesEXT") || Checks.reportMissing("VK", EXTPipelineProperties.VK_EXT_PIPELINE_PROPERTIES_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_present_timing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTPresentTiming.VK_EXT_PRESENT_TIMING_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{379, 380, 381, 382}, "vkSetSwapchainPresentTimingQueueSizeEXT", "vkGetSwapchainTimingPropertiesEXT", "vkGetSwapchainTimeDomainPropertiesEXT", "vkGetPastPresentationTimingEXT") || Checks.reportMissing("VK", EXTPresentTiming.VK_EXT_PRESENT_TIMING_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_private_data(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTPrivateData.VK_EXT_PRIVATE_DATA_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{383, 384, 385, 386}, "vkCreatePrivateDataSlotEXT", "vkDestroyPrivateDataSlotEXT", "vkSetPrivateDataEXT", "vkGetPrivateDataEXT") || Checks.reportMissing("VK", EXTPrivateData.VK_EXT_PRIVATE_DATA_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTSampleLocations.VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{387}, "vkCmdSetSampleLocationsEXT") || Checks.reportMissing("VK", EXTSampleLocations.VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_shader_module_identifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTShaderModuleIdentifier.VK_EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{388, 389}, "vkGetShaderModuleIdentifierEXT", "vkGetShaderModuleCreateInfoIdentifierEXT") || Checks.reportMissing("VK", EXTShaderModuleIdentifier.VK_EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_shader_object(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(EXTShaderObject.VK_EXT_SHADER_OBJECT_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = ext.contains(EXTTransformFeedback.VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains(EXTConservativeRasterization.VK_EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag3 = ext.contains(EXTDepthClipEnable.VK_EXT_DEPTH_CLIP_ENABLE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag4 = ext.contains(EXTSampleLocations.VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag5 = ext.contains(EXTBlendOperationAdvanced.VK_EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag6 = ext.contains(EXTProvokingVertex.VK_EXT_PROVOKING_VERTEX_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag7 = ext.contains(EXTLineRasterization.VK_EXT_LINE_RASTERIZATION_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag9 = ext.contains(EXTDepthClipControl.VK_EXT_DEPTH_CLIP_CONTROL_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag10 = ext.contains(NVClipSpaceWScaling.VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag11 = ext.contains(NVViewportSwizzle.VK_NV_VIEWPORT_SWIZZLE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag12 = ext.contains(NVFragmentCoverageToColor.VK_NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag14 = ext.contains(NVFramebufferMixedSamples.VK_NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag17 = ext.contains(NVShadingRateImage.VK_NV_SHADING_RATE_IMAGE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag18 = ext.contains(NVRepresentativeFragmentTest.VK_NV_REPRESENTATIVE_FRAGMENT_TEST_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag19 = ext.contains(NVCoverageReductionMode.VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag20 = ext.contains(EXTDepthClampControl.VK_EXT_DEPTH_CLAMP_CONTROL_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{390, 391, User32.WS_EX_PALETTEWINDOW, 393, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 394, 303, 304, 305, 306, 307, 318, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, flag0 + 319, flag1 + 320, flag1 + 321, flag3 + 322, flag4 + 323, flag5 + 324, flag6 + 325, flag7 + 326, flag7 + 327, flag9 + 328, flag10 + 329, flag11 + 330, flag12 + 331, flag12 + 332, flag14 + 333, flag14 + 334, flag14 + 335, flag17 + 336, flag18 + 337, flag19 + 338, flag20 + 253}, "vkCreateShadersEXT", "vkDestroyShaderEXT", "vkGetShaderBinaryDataEXT", "vkCmdBindShadersEXT", "vkCmdSetCullModeEXT", "vkCmdSetFrontFaceEXT", "vkCmdSetPrimitiveTopologyEXT", "vkCmdSetViewportWithCountEXT", "vkCmdSetScissorWithCountEXT", "vkCmdBindVertexBuffers2EXT", "vkCmdSetDepthTestEnableEXT", "vkCmdSetDepthWriteEnableEXT", "vkCmdSetDepthCompareOpEXT", "vkCmdSetDepthBoundsTestEnableEXT", "vkCmdSetStencilTestEnableEXT", "vkCmdSetStencilOpEXT", "vkCmdSetVertexInputEXT", "vkCmdSetPatchControlPointsEXT", "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetDepthBiasEnableEXT", "vkCmdSetLogicOpEXT", "vkCmdSetPrimitiveRestartEnableEXT", "vkCmdSetTessellationDomainOriginEXT", "vkCmdSetDepthClampEnableEXT", "vkCmdSetPolygonModeEXT", "vkCmdSetRasterizationSamplesEXT", "vkCmdSetSampleMaskEXT", "vkCmdSetAlphaToCoverageEnableEXT", "vkCmdSetAlphaToOneEnableEXT", "vkCmdSetLogicOpEnableEXT", "vkCmdSetColorBlendEnableEXT", "vkCmdSetColorBlendEquationEXT", "vkCmdSetColorWriteMaskEXT", "vkCmdSetRasterizationStreamEXT", "vkCmdSetConservativeRasterizationModeEXT", "vkCmdSetExtraPrimitiveOverestimationSizeEXT", "vkCmdSetDepthClipEnableEXT", "vkCmdSetSampleLocationsEnableEXT", "vkCmdSetColorBlendAdvancedEXT", "vkCmdSetProvokingVertexModeEXT", "vkCmdSetLineRasterizationModeEXT", "vkCmdSetLineStippleEnableEXT", "vkCmdSetDepthClipNegativeOneToOneEXT", "vkCmdSetViewportWScalingEnableNV", "vkCmdSetViewportSwizzleNV", "vkCmdSetCoverageToColorEnableNV", "vkCmdSetCoverageToColorLocationNV", "vkCmdSetCoverageModulationModeNV", "vkCmdSetCoverageModulationTableEnableNV", "vkCmdSetCoverageModulationTableNV", "vkCmdSetShadingRateImageEnableNV", "vkCmdSetRepresentativeFragmentTestEnableNV", "vkCmdSetCoverageReductionModeNV", "vkCmdSetDepthClampRangeEXT") || Checks.reportMissing("VK", EXTShaderObject.VK_EXT_SHADER_OBJECT_EXTENSION_NAME);
    }

    private static boolean check_EXT_swapchain_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTSwapchainMaintenance1.VK_EXT_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{395}, "vkReleaseSwapchainImagesEXT") || Checks.reportMissing("VK", EXTSwapchainMaintenance1.VK_EXT_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_transform_feedback(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTTransformFeedback.VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{396, 397, 398, 399, 400, 401}, "vkCmdBindTransformFeedbackBuffersEXT", "vkCmdBeginTransformFeedbackEXT", "vkCmdEndTransformFeedbackEXT", "vkCmdBeginQueryIndexedEXT", "vkCmdEndQueryIndexedEXT", "vkCmdDrawIndirectByteCountEXT") || Checks.reportMissing("VK", EXTTransformFeedback.VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_validation_cache(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTValidationCache.VK_EXT_VALIDATION_CACHE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{402, 403, TokenId.FloatConstant, TokenId.DoubleConstant}, "vkCreateValidationCacheEXT", "vkDestroyValidationCacheEXT", "vkMergeValidationCachesEXT", "vkGetValidationCacheDataEXT") || Checks.reportMissing("VK", EXTValidationCache.VK_EXT_VALIDATION_CACHE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_vertex_input_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTVertexInputDynamicState.VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{394}, "vkCmdSetVertexInputEXT") || Checks.reportMissing("VK", EXTVertexInputDynamicState.VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_GOOGLE_display_timing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(GOOGLEDisplayTiming.VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{TokenId.StringL, 407}, "vkGetRefreshCycleDurationGOOGLE", "vkGetPastPresentationTimingGOOGLE") || Checks.reportMissing("VK", GOOGLEDisplayTiming.VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_HUAWEI_cluster_culling_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(HUAWEIClusterCullingShader.VK_HUAWEI_CLUSTER_CULLING_SHADER_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{408, 409}, "vkCmdDrawClusterHUAWEI", "vkCmdDrawClusterIndirectHUAWEI") || Checks.reportMissing("VK", HUAWEIClusterCullingShader.VK_HUAWEI_CLUSTER_CULLING_SHADER_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_HUAWEI_invocation_mask(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(HUAWEIInvocationMask.VK_HUAWEI_INVOCATION_MASK_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{TokenId.TRUE}, "vkCmdBindInvocationMaskHUAWEI") || Checks.reportMissing("VK", HUAWEIInvocationMask.VK_HUAWEI_INVOCATION_MASK_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_HUAWEI_subpass_shading(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(HUAWEISubpassShading.VK_HUAWEI_SUBPASS_SHADING_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{TokenId.FALSE, TokenId.NULL}, "vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", "vkCmdSubpassShadingHUAWEI") || Checks.reportMissing("VK", HUAWEISubpassShading.VK_HUAWEI_SUBPASS_SHADING_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_INTEL_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(INTELPerformanceQuery.VK_INTEL_PERFORMANCE_QUERY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{413, 414, 415, 416, 417, 418, 419, UnixStat.DEFAULT_FILE_PERM, 421}, "vkInitializePerformanceApiINTEL", "vkUninitializePerformanceApiINTEL", "vkCmdSetPerformanceMarkerINTEL", "vkCmdSetPerformanceStreamMarkerINTEL", "vkCmdSetPerformanceOverrideINTEL", "vkAcquirePerformanceConfigurationINTEL", "vkReleasePerformanceConfigurationINTEL", "vkQueueSetPerformanceConfigurationINTEL", "vkGetPerformanceParameterINTEL") || Checks.reportMissing("VK", INTELPerformanceQuery.VK_INTEL_PERFORMANCE_QUERY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_acceleration_structure(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRAccelerationStructure.VK_KHR_ACCELERATION_STRUCTURE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437}, "vkCreateAccelerationStructureKHR", "vkDestroyAccelerationStructureKHR", "vkCmdBuildAccelerationStructuresKHR", "vkCmdBuildAccelerationStructuresIndirectKHR", "vkBuildAccelerationStructuresKHR", "vkCopyAccelerationStructureKHR", "vkCopyAccelerationStructureToMemoryKHR", "vkCopyMemoryToAccelerationStructureKHR", "vkWriteAccelerationStructuresPropertiesKHR", "vkCmdCopyAccelerationStructureKHR", "vkCmdCopyAccelerationStructureToMemoryKHR", "vkCmdCopyMemoryToAccelerationStructureKHR", "vkGetAccelerationStructureDeviceAddressKHR", "vkCmdWriteAccelerationStructuresPropertiesKHR", "vkGetDeviceAccelerationStructureCompatibilityKHR", "vkGetAccelerationStructureBuildSizesKHR") || Checks.reportMissing("VK", KHRAccelerationStructure.VK_KHR_ACCELERATION_STRUCTURE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_bind_memory2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRBindMemory2.VK_KHR_BIND_MEMORY_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{438, 439}, "vkBindBufferMemory2KHR", "vkBindImageMemory2KHR") || Checks.reportMissing("VK", KHRBindMemory2.VK_KHR_BIND_MEMORY_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRBufferDeviceAddress.VK_KHR_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{440, 441, 442}, "vkGetBufferDeviceAddressKHR", "vkGetBufferOpaqueCaptureAddressKHR", "vkGetDeviceMemoryOpaqueCaptureAddressKHR") || Checks.reportMissing("VK", KHRBufferDeviceAddress.VK_KHR_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRCalibratedTimestamps.VK_KHR_CALIBRATED_TIMESTAMPS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{443}, "vkGetCalibratedTimestampsKHR") || Checks.reportMissing("VK", KHRCalibratedTimestamps.VK_KHR_CALIBRATED_TIMESTAMPS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_copy_commands2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRCopyCommands2.VK_KHR_COPY_COMMANDS_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{444, 445, 446, 447, FCNTL.S_IRWXU, 449}, "vkCmdCopyBuffer2KHR", "vkCmdCopyImage2KHR", "vkCmdCopyBufferToImage2KHR", "vkCmdCopyImageToBuffer2KHR", "vkCmdBlitImage2KHR", "vkCmdResolveImage2KHR") || Checks.reportMissing("VK", KHRCopyCommands2.VK_KHR_COPY_COMMANDS_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_copy_memory_indirect(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRCopyMemoryIndirect.VK_KHR_COPY_MEMORY_INDIRECT_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{450, Shaderc.shaderc_env_version_webgpu}, "vkCmdCopyMemoryIndirectKHR", "vkCmdCopyMemoryToImageIndirectKHR") || Checks.reportMissing("VK", KHRCopyMemoryIndirect.VK_KHR_COPY_MEMORY_INDIRECT_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_create_renderpass2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRCreateRenderpass2.VK_KHR_CREATE_RENDERPASS_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{452, 453, 454, 455}, "vkCreateRenderPass2KHR", "vkCmdBeginRenderPass2KHR", "vkCmdNextSubpass2KHR", "vkCmdEndRenderPass2KHR") || Checks.reportMissing("VK", KHRCreateRenderpass2.VK_KHR_CREATE_RENDERPASS_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_deferred_host_operations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRDeferredHostOperations.VK_KHR_DEFERRED_HOST_OPERATIONS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{456, 457, 458, 459, 460}, "vkCreateDeferredOperationKHR", "vkDestroyDeferredOperationKHR", "vkGetDeferredOperationMaxConcurrencyKHR", "vkGetDeferredOperationResultKHR", "vkDeferredOperationJoinKHR") || Checks.reportMissing("VK", KHRDeferredHostOperations.VK_KHR_DEFERRED_HOST_OPERATIONS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_descriptor_update_template(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(KHRDescriptorUpdateTemplate.VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = ext.contains(KHRPushDescriptor.VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{461, 462, 463, flag0 + TarConstants.XSTAR_MULTIVOLUME_OFFSET}, "vkCreateDescriptorUpdateTemplateKHR", "vkDestroyDescriptorUpdateTemplateKHR", "vkUpdateDescriptorSetWithTemplateKHR", "vkCmdPushDescriptorSetWithTemplateKHR") || Checks.reportMissing("VK", KHRDescriptorUpdateTemplate.VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME);
    }

    private static boolean check_KHR_device_group(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(KHRDeviceGroup.VK_KHR_DEVICE_GROUP_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = ext.contains(KHRSurface.VK_KHR_SURFACE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains(KHRSwapchain.VK_KHR_SWAPCHAIN_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{465, 466, 467, flag0 + 468, flag0 + 469, flag2 + 470}, "vkGetDeviceGroupPeerMemoryFeaturesKHR", "vkCmdSetDeviceMaskKHR", "vkCmdDispatchBaseKHR", "vkGetDeviceGroupPresentCapabilitiesKHR", "vkGetDeviceGroupSurfacePresentModesKHR", "vkAcquireNextImage2KHR") || Checks.reportMissing("VK", KHRDeviceGroup.VK_KHR_DEVICE_GROUP_EXTENSION_NAME);
    }

    private static boolean check_KHR_display_swapchain(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRDisplaySwapchain.VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{471}, "vkCreateSharedSwapchainsKHR") || Checks.reportMissing("VK", KHRDisplaySwapchain.VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRDrawIndirectCount.VK_KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{472, 473}, "vkCmdDrawIndirectCountKHR", "vkCmdDrawIndexedIndirectCountKHR") || Checks.reportMissing("VK", KHRDrawIndirectCount.VK_KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_dynamic_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRDynamicRendering.VK_KHR_DYNAMIC_RENDERING_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{474, 475}, "vkCmdBeginRenderingKHR", "vkCmdEndRenderingKHR") || Checks.reportMissing("VK", KHRDynamicRendering.VK_KHR_DYNAMIC_RENDERING_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_dynamic_rendering_local_read(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRDynamicRenderingLocalRead.VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{TarConstants.XSTAR_ATIME_OFFSET, 477}, "vkCmdSetRenderingAttachmentLocationsKHR", "vkCmdSetRenderingInputAttachmentIndicesKHR") || Checks.reportMissing("VK", KHRDynamicRenderingLocalRead.VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_external_fence_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRExternalFenceFd.VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{478, 479}, "vkImportFenceFdKHR", "vkGetFenceFdKHR") || Checks.reportMissing("VK", KHRExternalFenceFd.VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_external_fence_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRExternalFenceWin32.VK_KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{OUI.UI_FILL, User32.MN_GETHMENU}, "vkImportFenceWin32HandleKHR", "vkGetFenceWin32HandleKHR") || Checks.reportMissing("VK", KHRExternalFenceWin32.VK_KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_external_memory_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRExternalMemoryFd.VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{482, 483}, "vkGetMemoryFdKHR", "vkGetMemoryFdPropertiesKHR") || Checks.reportMissing("VK", KHRExternalMemoryFd.VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRExternalMemoryWin32.VK_KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{484, 485}, "vkGetMemoryWin32HandleKHR", "vkGetMemoryWin32HandlePropertiesKHR") || Checks.reportMissing("VK", KHRExternalMemoryWin32.VK_KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_external_semaphore_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRExternalSemaphoreFd.VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{486, 487}, "vkImportSemaphoreFdKHR", "vkGetSemaphoreFdKHR") || Checks.reportMissing("VK", KHRExternalSemaphoreFd.VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_external_semaphore_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRExternalSemaphoreWin32.VK_KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{TarConstants.XSTAR_CTIME_OFFSET, 489}, "vkImportSemaphoreWin32HandleKHR", "vkGetSemaphoreWin32HandleKHR") || Checks.reportMissing("VK", KHRExternalSemaphoreWin32.VK_KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_fragment_shading_rate(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRFragmentShadingRate.VK_KHR_FRAGMENT_SHADING_RATE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{490}, "vkCmdSetFragmentShadingRateKHR") || Checks.reportMissing("VK", KHRFragmentShadingRate.VK_KHR_FRAGMENT_SHADING_RATE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_get_memory_requirements2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRGetMemoryRequirements2.VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{491, 492, UnixStat.DEFAULT_DIR_PERM}, "vkGetImageMemoryRequirements2KHR", "vkGetBufferMemoryRequirements2KHR", "vkGetImageSparseMemoryRequirements2KHR") || Checks.reportMissing("VK", KHRGetMemoryRequirements2.VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_line_rasterization(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRLineRasterization.VK_KHR_LINE_RASTERIZATION_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{494}, "vkCmdSetLineStippleKHR") || Checks.reportMissing("VK", KHRLineRasterization.VK_KHR_LINE_RASTERIZATION_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains("VK_KHR_maintenance1")) {
            return Checks.checkFunctions(provider, caps, new int[]{495}, "vkTrimCommandPoolKHR") || Checks.reportMissing("VK", "VK_KHR_maintenance1");
        }
        return false;
    }

    private static boolean check_KHR_maintenance10(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRMaintenance10.VK_KHR_MAINTENANCE_10_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{496}, "vkCmdEndRendering2KHR") || Checks.reportMissing("VK", KHRMaintenance10.VK_KHR_MAINTENANCE_10_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_maintenance3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains("VK_KHR_maintenance3")) {
            return Checks.checkFunctions(provider, caps, new int[]{497}, "vkGetDescriptorSetLayoutSupportKHR") || Checks.reportMissing("VK", "VK_KHR_maintenance3");
        }
        return false;
    }

    private static boolean check_KHR_maintenance4(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRMaintenance4.VK_KHR_MAINTENANCE_4_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{498, 499, 500}, "vkGetDeviceBufferMemoryRequirementsKHR", "vkGetDeviceImageMemoryRequirementsKHR", "vkGetDeviceImageSparseMemoryRequirementsKHR") || Checks.reportMissing("VK", KHRMaintenance4.VK_KHR_MAINTENANCE_4_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_maintenance5(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRMaintenance5.VK_KHR_MAINTENANCE_5_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{501, 502, 503, 504}, "vkCmdBindIndexBuffer2KHR", "vkGetRenderingAreaGranularityKHR", "vkGetDeviceImageSubresourceLayoutKHR", "vkGetImageSubresourceLayout2KHR") || Checks.reportMissing("VK", KHRMaintenance5.VK_KHR_MAINTENANCE_5_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_maintenance6(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(KHRMaintenance6.VK_KHR_MAINTENANCE_6_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = ext.contains(KHRPushDescriptor.VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains(EXTDescriptorBuffer.VK_EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{505, 506, flag0 + 507, flag0 + TarConstants.XSTAR_MAGIC_OFFSET, flag2 + 509, flag2 + 510}, "vkCmdBindDescriptorSets2KHR", "vkCmdPushConstants2KHR", "vkCmdPushDescriptorSet2KHR", "vkCmdPushDescriptorSetWithTemplate2KHR", "vkCmdSetDescriptorBufferOffsets2EXT", "vkCmdBindDescriptorBufferEmbeddedSamplers2EXT") || Checks.reportMissing("VK", KHRMaintenance6.VK_KHR_MAINTENANCE_6_EXTENSION_NAME);
    }

    private static boolean check_KHR_map_memory2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRMapMemory2.VK_KHR_MAP_MEMORY_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{511, 512}, "vkMapMemory2KHR", "vkUnmapMemory2KHR") || Checks.reportMissing("VK", KHRMapMemory2.VK_KHR_MAP_MEMORY_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRPerformanceQuery.VK_KHR_PERFORMANCE_QUERY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{513, 514}, "vkAcquireProfilingLockKHR", "vkReleaseProfilingLockKHR") || Checks.reportMissing("VK", KHRPerformanceQuery.VK_KHR_PERFORMANCE_QUERY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_pipeline_binary(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRPipelineBinary.VK_KHR_PIPELINE_BINARY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{515, 516, 517, 518, 519}, "vkCreatePipelineBinariesKHR", "vkDestroyPipelineBinaryKHR", "vkGetPipelineKeyKHR", "vkGetPipelineBinaryDataKHR", "vkReleaseCapturedPipelineDataKHR") || Checks.reportMissing("VK", KHRPipelineBinary.VK_KHR_PIPELINE_BINARY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_pipeline_executable_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRPipelineExecutableProperties.VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{520, 521, 522}, "vkGetPipelineExecutablePropertiesKHR", "vkGetPipelineExecutableStatisticsKHR", "vkGetPipelineExecutableInternalRepresentationsKHR") || Checks.reportMissing("VK", KHRPipelineExecutableProperties.VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_present_wait(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRPresentWait.VK_KHR_PRESENT_WAIT_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{523}, "vkWaitForPresentKHR") || Checks.reportMissing("VK", KHRPresentWait.VK_KHR_PRESENT_WAIT_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_present_wait2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRPresentWait2.VK_KHR_PRESENT_WAIT_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{524}, "vkWaitForPresent2KHR") || Checks.reportMissing("VK", KHRPresentWait2.VK_KHR_PRESENT_WAIT_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_push_descriptor(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(KHRPushDescriptor.VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = (ext.contains("Vulkan11") || ext.contains(KHRDescriptorUpdateTemplate.VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME)) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{525, flag0 + TarConstants.XSTAR_MULTIVOLUME_OFFSET}, "vkCmdPushDescriptorSetKHR", "vkCmdPushDescriptorSetWithTemplateKHR") || Checks.reportMissing("VK", KHRPushDescriptor.VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME);
    }

    private static boolean check_KHR_ray_tracing_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(KHRRayTracingMaintenance1.VK_KHR_RAY_TRACING_MAINTENANCE_1_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = ext.contains(KHRRayTracingPipeline.VK_KHR_RAY_TRACING_PIPELINE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{flag0 + 526}, "vkCmdTraceRaysIndirect2KHR") || Checks.reportMissing("VK", KHRRayTracingMaintenance1.VK_KHR_RAY_TRACING_MAINTENANCE_1_EXTENSION_NAME);
    }

    private static boolean check_KHR_ray_tracing_pipeline(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRRayTracingPipeline.VK_KHR_RAY_TRACING_PIPELINE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{SDLEvents.SDL_EVENT_WINDOW_FOCUS_LOST, 528, 529, 530, 531, 532, 533}, "vkCmdTraceRaysKHR", "vkCreateRayTracingPipelinesKHR", "vkGetRayTracingShaderGroupHandlesKHR", "vkGetRayTracingCaptureReplayShaderGroupHandlesKHR", "vkCmdTraceRaysIndirectKHR", "vkGetRayTracingShaderGroupStackSizeKHR", "vkCmdSetRayTracingPipelineStackSizeKHR") || Checks.reportMissing("VK", KHRRayTracingPipeline.VK_KHR_RAY_TRACING_PIPELINE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_sampler_ycbcr_conversion(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRSamplerYcbcrConversion.VK_KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{534, SDLEvents.SDL_EVENT_WINDOW_ENTER_FULLSCREEN}, "vkCreateSamplerYcbcrConversionKHR", "vkDestroySamplerYcbcrConversionKHR") || Checks.reportMissing("VK", KHRSamplerYcbcrConversion.VK_KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_shared_presentable_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRSharedPresentableImage.VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{536}, "vkGetSwapchainStatusKHR") || Checks.reportMissing("VK", KHRSharedPresentableImage.VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_swapchain(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(KHRSwapchain.VK_KHR_SWAPCHAIN_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{537, 538, 539, 540, 541, flag0 + 468, flag0 + 469, flag0 + 470}, "vkCreateSwapchainKHR", "vkDestroySwapchainKHR", "vkGetSwapchainImagesKHR", "vkAcquireNextImageKHR", "vkQueuePresentKHR", "vkGetDeviceGroupPresentCapabilitiesKHR", "vkGetDeviceGroupSurfacePresentModesKHR", "vkAcquireNextImage2KHR") || Checks.reportMissing("VK", KHRSwapchain.VK_KHR_SWAPCHAIN_EXTENSION_NAME);
    }

    private static boolean check_KHR_swapchain_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRSwapchainMaintenance1.VK_KHR_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{542}, "vkReleaseSwapchainImagesKHR") || Checks.reportMissing("VK", KHRSwapchainMaintenance1.VK_KHR_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_synchronization2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRSynchronization2.VK_KHR_SYNCHRONIZATION_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{543, User32.WM_MDICREATE, User32.WM_MDIDESTROY, User32.WM_MDIACTIVATE, User32.WM_MDIRESTORE, User32.WM_MDINEXT}, "vkCmdSetEvent2KHR", "vkCmdResetEvent2KHR", "vkCmdWaitEvents2KHR", "vkCmdPipelineBarrier2KHR", "vkCmdWriteTimestamp2KHR", "vkQueueSubmit2KHR") || Checks.reportMissing("VK", KHRSynchronization2.VK_KHR_SYNCHRONIZATION_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_timeline_semaphore(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRTimelineSemaphore.VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{User32.WM_MDIMAXIMIZE, User32.WM_MDITILE, User32.WM_MDICASCADE}, "vkGetSemaphoreCounterValueKHR", "vkWaitSemaphoresKHR", "vkSignalSemaphoreKHR") || Checks.reportMissing("VK", KHRTimelineSemaphore.VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_video_decode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRVideoDecodeQueue.VK_KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{User32.WM_MDIICONARRANGE}, "vkCmdDecodeVideoKHR") || Checks.reportMissing("VK", KHRVideoDecodeQueue.VK_KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_video_encode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRVideoEncodeQueue.VK_KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{User32.WM_MDIGETACTIVE, 554}, "vkGetEncodedVideoSessionParametersKHR", "vkCmdEncodeVideoKHR") || Checks.reportMissing("VK", KHRVideoEncodeQueue.VK_KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_video_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRVideoQueue.VK_KHR_VIDEO_QUEUE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{555, 556, 557, 558, 559, User32.WM_MDISETMENU, User32.WM_ENTERSIZEMOVE, User32.WM_EXITSIZEMOVE, User32.WM_DROPFILES, User32.WM_MDIREFRESHMENU}, "vkCreateVideoSessionKHR", "vkDestroyVideoSessionKHR", "vkGetVideoSessionMemoryRequirementsKHR", "vkBindVideoSessionMemoryKHR", "vkCreateVideoSessionParametersKHR", "vkUpdateVideoSessionParametersKHR", "vkDestroyVideoSessionParametersKHR", "vkCmdBeginVideoCodingKHR", "vkCmdEndVideoCodingKHR", "vkCmdControlVideoCodingKHR") || Checks.reportMissing("VK", KHRVideoQueue.VK_KHR_VIDEO_QUEUE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_clip_space_w_scaling(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVClipSpaceWScaling.VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{565}, "vkCmdSetViewportWScalingNV") || Checks.reportMissing("VK", NVClipSpaceWScaling.VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_cluster_acceleration_structure(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVClusterAccelerationStructure.VK_NV_CLUSTER_ACCELERATION_STRUCTURE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{566, 567}, "vkGetClusterAccelerationStructureBuildSizesNV", "vkCmdBuildClusterAccelerationStructureIndirectNV") || Checks.reportMissing("VK", NVClusterAccelerationStructure.VK_NV_CLUSTER_ACCELERATION_STRUCTURE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_compute_occupancy_priority(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVComputeOccupancyPriority.VK_NV_COMPUTE_OCCUPANCY_PRIORITY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{568}, "vkCmdSetComputeOccupancyPriorityNV") || Checks.reportMissing("VK", NVComputeOccupancyPriority.VK_NV_COMPUTE_OCCUPANCY_PRIORITY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_cooperative_vector(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVCooperativeVector.VK_NV_COOPERATIVE_VECTOR_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{569, 570}, "vkConvertCooperativeVectorMatrixNV", "vkCmdConvertCooperativeVectorMatrixNV") || Checks.reportMissing("VK", NVCooperativeVector.VK_NV_COOPERATIVE_VECTOR_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_copy_memory_indirect(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVCopyMemoryIndirect.VK_NV_COPY_MEMORY_INDIRECT_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{571, 572}, "vkCmdCopyMemoryIndirectNV", "vkCmdCopyMemoryToImageIndirectNV") || Checks.reportMissing("VK", NVCopyMemoryIndirect.VK_NV_COPY_MEMORY_INDIRECT_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_cuda_kernel_launch(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVCudaKernelLaunch.VK_NV_CUDA_KERNEL_LAUNCH_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{573, 574, 575, User32.WM_TOUCH, 577, 578}, "vkCreateCudaModuleNV", "vkGetCudaModuleCacheNV", "vkCreateCudaFunctionNV", "vkDestroyCudaModuleNV", "vkDestroyCudaFunctionNV", "vkCmdCudaLaunchKernelNV") || Checks.reportMissing("VK", NVCudaKernelLaunch.VK_NV_CUDA_KERNEL_LAUNCH_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_device_diagnostic_checkpoints(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(NVDeviceDiagnosticCheckpoints.VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = (ext.contains("Vulkan13") || ext.contains(KHRSynchronization2.VK_KHR_SYNCHRONIZATION_2_EXTENSION_NAME)) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{579, 580, flag0 + 581}, "vkCmdSetCheckpointNV", "vkGetQueueCheckpointDataNV", "vkGetQueueCheckpointData2NV") || Checks.reportMissing("VK", NVDeviceDiagnosticCheckpoints.VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME);
    }

    private static boolean check_NV_device_generated_commands(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVDeviceGeneratedCommands.VK_NV_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{582, 583, 584, 585, 586, 587}, "vkGetGeneratedCommandsMemoryRequirementsNV", "vkCmdPreprocessGeneratedCommandsNV", "vkCmdExecuteGeneratedCommandsNV", "vkCmdBindPipelineShaderGroupNV", "vkCreateIndirectCommandsLayoutNV", "vkDestroyIndirectCommandsLayoutNV") || Checks.reportMissing("VK", NVDeviceGeneratedCommands.VK_NV_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_device_generated_commands_compute(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVDeviceGeneratedCommandsCompute.VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{588, 589, 590}, "vkGetPipelineIndirectMemoryRequirementsNV", "vkCmdUpdatePipelineIndirectBufferNV", "vkGetPipelineIndirectDeviceAddressNV") || Checks.reportMissing("VK", NVDeviceGeneratedCommandsCompute.VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_external_compute_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVExternalComputeQueue.VK_NV_EXTERNAL_COMPUTE_QUEUE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{591, 592, 593}, "vkCreateExternalComputeQueueNV", "vkDestroyExternalComputeQueueNV", "vkGetExternalComputeQueueDataNV") || Checks.reportMissing("VK", NVExternalComputeQueue.VK_NV_EXTERNAL_COMPUTE_QUEUE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_external_memory_rdma(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVExternalMemoryRdma.VK_NV_EXTERNAL_MEMORY_RDMA_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{594}, "vkGetMemoryRemoteAddressNV") || Checks.reportMissing("VK", NVExternalMemoryRdma.VK_NV_EXTERNAL_MEMORY_RDMA_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVExternalMemoryWin32.VK_NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{595}, "vkGetMemoryWin32HandleNV") || Checks.reportMissing("VK", NVExternalMemoryWin32.VK_NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_fragment_shading_rate_enums(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVFragmentShadingRateEnums.VK_NV_FRAGMENT_SHADING_RATE_ENUMS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{596}, "vkCmdSetFragmentShadingRateEnumNV") || Checks.reportMissing("VK", NVFragmentShadingRateEnums.VK_NV_FRAGMENT_SHADING_RATE_ENUMS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_low_latency2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVLowLatency2.VK_NV_LOW_LATENCY_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{597, 598, 599, SideBarRules.WIDE_WIDTH_DP, 601}, "vkSetLatencySleepModeNV", "vkLatencySleepNV", "vkSetLatencyMarkerNV", "vkGetLatencyTimingsNV", "vkQueueNotifyOutOfBandNV") || Checks.reportMissing("VK", NVLowLatency2.VK_NV_LOW_LATENCY_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_memory_decompression(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVMemoryDecompression.VK_NV_MEMORY_DECOMPRESSION_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{602, 603}, "vkCmdDecompressMemoryNV", "vkCmdDecompressMemoryIndirectCountNV") || Checks.reportMissing("VK", NVMemoryDecompression.VK_NV_MEMORY_DECOMPRESSION_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(NVMeshShader.VK_NV_MESH_SHADER_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = (ext.contains("Vulkan12") || ext.contains(KHRDrawIndirectCount.VK_KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME) || ext.contains(AMDDrawIndirectCount.VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME)) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{604, 605, flag0 + 606}, "vkCmdDrawMeshTasksNV", "vkCmdDrawMeshTasksIndirectNV", "vkCmdDrawMeshTasksIndirectCountNV") || Checks.reportMissing("VK", NVMeshShader.VK_NV_MESH_SHADER_EXTENSION_NAME);
    }

    private static boolean check_NV_optical_flow(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVOpticalFlow.VK_NV_OPTICAL_FLOW_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{607, 608, 609, 610}, "vkCreateOpticalFlowSessionNV", "vkDestroyOpticalFlowSessionNV", "vkBindOpticalFlowSessionImageNV", "vkCmdOpticalFlowExecuteNV") || Checks.reportMissing("VK", NVOpticalFlow.VK_NV_OPTICAL_FLOW_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_partitioned_acceleration_structure(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVPartitionedAccelerationStructure.VK_NV_PARTITIONED_ACCELERATION_STRUCTURE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{611, 612}, "vkGetPartitionedAccelerationStructuresBuildSizesNV", "vkCmdBuildPartitionedAccelerationStructuresNV") || Checks.reportMissing("VK", NVPartitionedAccelerationStructure.VK_NV_PARTITIONED_ACCELERATION_STRUCTURE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_ray_tracing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVRayTracing.VK_NV_RAY_TRACING_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624}, "vkCreateAccelerationStructureNV", "vkDestroyAccelerationStructureNV", "vkGetAccelerationStructureMemoryRequirementsNV", "vkBindAccelerationStructureMemoryNV", "vkCmdBuildAccelerationStructureNV", "vkCmdCopyAccelerationStructureNV", "vkCmdTraceRaysNV", "vkCreateRayTracingPipelinesNV", "vkGetRayTracingShaderGroupHandlesNV", "vkGetAccelerationStructureHandleNV", "vkCmdWriteAccelerationStructuresPropertiesNV", "vkCompileDeferredNV") || Checks.reportMissing("VK", NVRayTracing.VK_NV_RAY_TRACING_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_scissor_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVScissorExclusive.VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{625, 626}, "vkCmdSetExclusiveScissorEnableNV", "vkCmdSetExclusiveScissorNV") || Checks.reportMissing("VK", NVScissorExclusive.VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_shading_rate_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVShadingRateImage.VK_NV_SHADING_RATE_IMAGE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{627, 628, 629}, "vkCmdBindShadingRateImageNV", "vkCmdSetViewportShadingRatePaletteNV", "vkCmdSetCoarseSampleOrderNV") || Checks.reportMissing("VK", NVShadingRateImage.VK_NV_SHADING_RATE_IMAGE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NVX_binary_import(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVXBinaryImport.VK_NVX_BINARY_IMPORT_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{630, 631, 632, 633, 634}, "vkCreateCuModuleNVX", "vkCreateCuFunctionNVX", "vkDestroyCuModuleNVX", "vkDestroyCuFunctionNVX", "vkCmdCuLaunchKernelNVX") || Checks.reportMissing("VK", NVXBinaryImport.VK_NVX_BINARY_IMPORT_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NVX_image_view_handle(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVXImageViewHandle.VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{635, 636, 637, 638}, "vkGetImageViewHandleNVX", "vkGetImageViewHandle64NVX", "vkGetImageViewAddressNVX", "vkGetDeviceCombinedImageSamplerIndexNVX") || Checks.reportMissing("VK", NVXImageViewHandle.VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_QCOM_tile_memory_heap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(QCOMTileMemoryHeap.VK_QCOM_TILE_MEMORY_HEAP_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{639}, "vkCmdBindTileMemoryQCOM") || Checks.reportMissing("VK", QCOMTileMemoryHeap.VK_QCOM_TILE_MEMORY_HEAP_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_QCOM_tile_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(QCOMTileProperties.VK_QCOM_TILE_PROPERTIES_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{640, User32.WM_IME_SETCONTEXT}, "vkGetFramebufferTilePropertiesQCOM", "vkGetDynamicRenderingTilePropertiesQCOM") || Checks.reportMissing("VK", QCOMTileProperties.VK_QCOM_TILE_PROPERTIES_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_QCOM_tile_shading(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(QCOMTileShading.VK_QCOM_TILE_SHADING_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{User32.WM_IME_NOTIFY, User32.WM_IME_CONTROL, User32.WM_IME_COMPOSITIONFULL}, "vkCmdDispatchTileQCOM", "vkCmdBeginPerTileExecutionQCOM", "vkCmdEndPerTileExecutionQCOM") || Checks.reportMissing("VK", QCOMTileShading.VK_QCOM_TILE_SHADING_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_VALVE_descriptor_set_host_mapping(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(VALVEDescriptorSetHostMapping.VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{User32.WM_IME_SELECT, User32.WM_IME_CHAR}, "vkGetDescriptorSetLayoutHostMappingInfoVALVE", "vkGetDescriptorSetHostMappingVALVE") || Checks.reportMissing("VK", VALVEDescriptorSetHostMapping.VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_EXTENSION_NAME);
        }
        return false;
    }
}
