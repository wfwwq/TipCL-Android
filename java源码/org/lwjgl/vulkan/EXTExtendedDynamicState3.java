package org.lwjgl.vulkan;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkColorBlendAdvancedEXT;
import org.lwjgl.vulkan.VkColorBlendEquationEXT;
import org.lwjgl.vulkan.VkViewportSwizzleNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTExtendedDynamicState3.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTExtendedDynamicState3.class */
public class EXTExtendedDynamicState3 {
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_3_SPEC_VERSION = 2;
    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_3_EXTENSION_NAME = "VK_EXT_extended_dynamic_state3";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT = 1000455000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT = 1000455001;
    public static final int VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT = 1000455002;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT = 1000455003;
    public static final int VK_DYNAMIC_STATE_POLYGON_MODE_EXT = 1000455004;
    public static final int VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT = 1000455005;
    public static final int VK_DYNAMIC_STATE_SAMPLE_MASK_EXT = 1000455006;
    public static final int VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT = 1000455007;
    public static final int VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT = 1000455008;
    public static final int VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT = 1000455009;
    public static final int VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT = 1000455010;
    public static final int VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT = 1000455011;
    public static final int VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT = 1000455012;
    public static final int VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT = 1000455013;
    public static final int VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT = 1000455014;
    public static final int VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT = 1000455015;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT = 1000455016;
    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT = 1000455017;
    public static final int VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT = 1000455018;
    public static final int VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT = 1000455019;
    public static final int VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT = 1000455020;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT = 1000455021;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT = 1000455022;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV = 1000455023;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV = 1000455024;
    public static final int VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV = 1000455025;
    public static final int VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV = 1000455026;
    public static final int VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV = 1000455027;
    public static final int VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV = 1000455028;
    public static final int VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV = 1000455029;
    public static final int VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV = 1000455030;
    public static final int VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV = 1000455031;
    public static final int VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV = 1000455032;

    protected EXTExtendedDynamicState3() {
        throw new UnsupportedOperationException();
    }

    public static void vkCmdSetDepthClampEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthClampEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClampEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), depthClampEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetPolygonModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkPolygonMode") int polygonMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPolygonModeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), polygonMode, __functionAddress);
    }

    public static void vkCmdSetRasterizationSamplesEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int rasterizationSamples) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizationSamplesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), rasterizationSamples, __functionAddress);
    }

    public static void nvkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, int samples, long pSampleMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleMaskEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), samples, pSampleMask, __functionAddress);
    }

    public static void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkSampleMask const *") IntBuffer pSampleMask) {
        nvkCmdSetSampleMaskEXT(commandBuffer, samples, MemoryUtil.memAddressSafe(pSampleMask));
    }

    public static void vkCmdSetAlphaToCoverageEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean alphaToCoverageEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetAlphaToCoverageEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), alphaToCoverageEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetAlphaToOneEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean alphaToOneEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetAlphaToOneEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), alphaToOneEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetLogicOpEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean logicOpEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLogicOpEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), logicOpEnable ? 1 : 0, __functionAddress);
    }

    public static void nvkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendEnables, __functionAddress);
    }

    public static void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkBool32 const *") IntBuffer pColorBlendEnables) {
        nvkCmdSetColorBlendEnableEXT(commandBuffer, firstAttachment, pColorBlendEnables.remaining(), MemoryUtil.memAddress(pColorBlendEnables));
    }

    public static void nvkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendEquations) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEquationEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendEquations, __functionAddress);
    }

    public static void vkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorBlendEquationEXT const *") VkColorBlendEquationEXT.Buffer pColorBlendEquations) {
        nvkCmdSetColorBlendEquationEXT(commandBuffer, firstAttachment, pColorBlendEquations.remaining(), pColorBlendEquations.address());
    }

    public static void nvkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorWriteMasks) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteMaskEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorWriteMasks, __functionAddress);
    }

    public static void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorComponentFlags const *") IntBuffer pColorWriteMasks) {
        nvkCmdSetColorWriteMaskEXT(commandBuffer, firstAttachment, pColorWriteMasks.remaining(), MemoryUtil.memAddress(pColorWriteMasks));
    }

    public static void vkCmdSetTessellationDomainOriginEXT(VkCommandBuffer commandBuffer, @NativeType("VkTessellationDomainOrigin") int domainOrigin) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetTessellationDomainOriginEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), domainOrigin, __functionAddress);
    }

    public static void vkCmdSetRasterizationStreamEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int rasterizationStream) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizationStreamEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), rasterizationStream, __functionAddress);
    }

    public static void vkCmdSetConservativeRasterizationModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkConservativeRasterizationModeEXT") int conservativeRasterizationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetConservativeRasterizationModeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), conservativeRasterizationMode, __functionAddress);
    }

    public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExtraPrimitiveOverestimationSizeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), extraPrimitiveOverestimationSize, __functionAddress);
    }

    public static void vkCmdSetDepthClipEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthClipEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClipEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), depthClipEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetSampleLocationsEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean sampleLocationsEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleLocationsEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), sampleLocationsEnable ? 1 : 0, __functionAddress);
    }

    public static void nvkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendAdvanced) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendAdvancedEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendAdvanced, __functionAddress);
    }

    public static void vkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorBlendAdvancedEXT const *") VkColorBlendAdvancedEXT.Buffer pColorBlendAdvanced) {
        nvkCmdSetColorBlendAdvancedEXT(commandBuffer, firstAttachment, pColorBlendAdvanced.remaining(), pColorBlendAdvanced.address());
    }

    public static void vkCmdSetProvokingVertexModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkProvokingVertexModeEXT") int provokingVertexMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetProvokingVertexModeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), provokingVertexMode, __functionAddress);
    }

    public static void vkCmdSetLineRasterizationModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkLineRasterizationModeEXT") int lineRasterizationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineRasterizationModeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), lineRasterizationMode, __functionAddress);
    }

    public static void vkCmdSetLineStippleEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stippledLineEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStippleEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), stippledLineEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetDepthClipNegativeOneToOneEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean negativeOneToOne) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClipNegativeOneToOneEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), negativeOneToOne ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetViewportWScalingEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean viewportWScalingEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWScalingEnableNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), viewportWScalingEnable ? 1 : 0, __functionAddress);
    }

    public static void nvkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewportSwizzles) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportSwizzleNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstViewport, viewportCount, pViewportSwizzles, __functionAddress);
    }

    public static void vkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkViewportSwizzleNV const *") VkViewportSwizzleNV.Buffer pViewportSwizzles) {
        nvkCmdSetViewportSwizzleNV(commandBuffer, firstViewport, pViewportSwizzles.remaining(), pViewportSwizzles.address());
    }

    public static void vkCmdSetCoverageToColorEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean coverageToColorEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageToColorEnableNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), coverageToColorEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetCoverageToColorLocationNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int coverageToColorLocation) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageToColorLocationNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), coverageToColorLocation, __functionAddress);
    }

    public static void vkCmdSetCoverageModulationModeNV(VkCommandBuffer commandBuffer, @NativeType("VkCoverageModulationModeNV") int coverageModulationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationModeNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), coverageModulationMode, __functionAddress);
    }

    public static void vkCmdSetCoverageModulationTableEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean coverageModulationTableEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableEnableNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), coverageModulationTableEnable ? 1 : 0, __functionAddress);
    }

    public static void nvkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, int coverageModulationTableCount, long pCoverageModulationTable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), coverageModulationTableCount, pCoverageModulationTable, __functionAddress);
    }

    public static void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, @NativeType("float const *") FloatBuffer pCoverageModulationTable) {
        nvkCmdSetCoverageModulationTableNV(commandBuffer, pCoverageModulationTable.remaining(), MemoryUtil.memAddress(pCoverageModulationTable));
    }

    public static void vkCmdSetShadingRateImageEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean shadingRateImageEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetShadingRateImageEnableNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), shadingRateImageEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetRepresentativeFragmentTestEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean representativeFragmentTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRepresentativeFragmentTestEnableNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), representativeFragmentTestEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetCoverageReductionModeNV(VkCommandBuffer commandBuffer, @NativeType("VkCoverageReductionModeNV") int coverageReductionMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageReductionModeNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), coverageReductionMode, __functionAddress);
    }

    public static void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkSampleMask const *") int[] pSampleMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleMaskEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), samples, pSampleMask, __functionAddress);
    }

    public static void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkBool32 const *") int[] pColorBlendEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstAttachment, pColorBlendEnables.length, pColorBlendEnables, __functionAddress);
    }

    public static void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorComponentFlags const *") int[] pColorWriteMasks) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteMaskEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstAttachment, pColorWriteMasks.length, pColorWriteMasks, __functionAddress);
    }

    public static void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, @NativeType("float const *") float[] pCoverageModulationTable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pCoverageModulationTable.length, pCoverageModulationTable, __functionAddress);
    }
}
