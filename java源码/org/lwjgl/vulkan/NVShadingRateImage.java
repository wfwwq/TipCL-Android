package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.vulkan.VkCoarseSampleOrderCustomNV;
import org.lwjgl.vulkan.VkShadingRatePaletteNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVShadingRateImage.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVShadingRateImage.class */
public class NVShadingRateImage {
    public static final int VK_NV_SHADING_RATE_IMAGE_SPEC_VERSION = 3;
    public static final String VK_NV_SHADING_RATE_IMAGE_EXTENSION_NAME = "VK_NV_shading_rate_image";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV = 1000164000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV = 1000164001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV = 1000164002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV = 1000164005;
    public static final int VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV = 1000164003;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV = 1000164004;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV = 1000164006;
    public static final int VK_ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV = 8388608;
    public static final int VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV = 256;
    public static final int VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV = 4194304;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV = 0;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV = 1;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV = 2;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV = 3;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV = 4;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV = 5;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV = 6;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV = 7;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV = 8;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV = 9;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV = 10;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV = 11;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV = 0;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV = 1;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV = 2;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV = 3;

    protected NVShadingRateImage() {
        throw new UnsupportedOperationException();
    }

    public static void vkCmdBindShadingRateImageNV(VkCommandBuffer commandBuffer, @NativeType("VkImageView") long imageView, @NativeType("VkImageLayout") int imageLayout) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindShadingRateImageNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJV(commandBuffer.address(), imageView, imageLayout, __functionAddress);
    }

    public static void nvkCmdSetViewportShadingRatePaletteNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pShadingRatePalettes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportShadingRatePaletteNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Struct.validate(pShadingRatePalettes, viewportCount, VkShadingRatePaletteNV.SIZEOF, VkShadingRatePaletteNV::validate);
        }
        JNI.callPPV(commandBuffer.address(), firstViewport, viewportCount, pShadingRatePalettes, __functionAddress);
    }

    public static void vkCmdSetViewportShadingRatePaletteNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkShadingRatePaletteNV const *") VkShadingRatePaletteNV.Buffer pShadingRatePalettes) {
        nvkCmdSetViewportShadingRatePaletteNV(commandBuffer, firstViewport, pShadingRatePalettes.remaining(), pShadingRatePalettes.address());
    }

    public static void nvkCmdSetCoarseSampleOrderNV(VkCommandBuffer commandBuffer, int sampleOrderType, int customSampleOrderCount, long pCustomSampleOrders) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoarseSampleOrderNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            if (pCustomSampleOrders != 0) {
                Struct.validate(pCustomSampleOrders, customSampleOrderCount, VkCoarseSampleOrderCustomNV.SIZEOF, VkCoarseSampleOrderCustomNV::validate);
            }
        }
        JNI.callPPV(commandBuffer.address(), sampleOrderType, customSampleOrderCount, pCustomSampleOrders, __functionAddress);
    }

    public static void vkCmdSetCoarseSampleOrderNV(VkCommandBuffer commandBuffer, @NativeType("VkCoarseSampleOrderTypeNV") int sampleOrderType, @NativeType("VkCoarseSampleOrderCustomNV const *") VkCoarseSampleOrderCustomNV.Buffer pCustomSampleOrders) {
        nvkCmdSetCoarseSampleOrderNV(commandBuffer, sampleOrderType, Checks.remainingSafe(pCustomSampleOrders), MemoryUtil.memAddressSafe(pCustomSampleOrders));
    }
}
