package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/QCOMTileShading.class */
public class QCOMTileShading {
    public static final int VK_QCOM_TILE_SHADING_SPEC_VERSION = 2;
    public static final String VK_QCOM_TILE_SHADING_EXTENSION_NAME = "VK_QCOM_tile_shading";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM = 1000309000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM = 1000309001;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM = 1000309002;
    public static final int VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM = 1000309003;
    public static final int VK_STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM = 1000309004;
    public static final int VK_STRUCTURE_TYPE_DISPATCH_TILE_INFO_QCOM = 1000309005;
    public static final long VK_ACCESS_2_SHADER_TILE_ATTACHMENT_READ_BIT_QCOM = 2251799813685248L;
    public static final long VK_ACCESS_2_SHADER_TILE_ATTACHMENT_WRITE_BIT_QCOM = 4503599627370496L;
    public static final int VK_SUBPASS_DESCRIPTION_TILE_SHADING_APRON_BIT_QCOM = 256;
    public static final int VK_TILE_SHADING_RENDER_PASS_ENABLE_BIT_QCOM = 1;
    public static final int VK_TILE_SHADING_RENDER_PASS_PER_TILE_EXECUTION_BIT_QCOM = 2;

    protected QCOMTileShading() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdDispatchTileQCOM(VkCommandBuffer commandBuffer, long pDispatchTileInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchTileQCOM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pDispatchTileInfo, __functionAddress);
    }

    public static void vkCmdDispatchTileQCOM(VkCommandBuffer commandBuffer, @NativeType("VkDispatchTileInfoQCOM const *") VkDispatchTileInfoQCOM pDispatchTileInfo) {
        nvkCmdDispatchTileQCOM(commandBuffer, pDispatchTileInfo.address());
    }

    public static void nvkCmdBeginPerTileExecutionQCOM(VkCommandBuffer commandBuffer, long pPerTileBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginPerTileExecutionQCOM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pPerTileBeginInfo, __functionAddress);
    }

    public static void vkCmdBeginPerTileExecutionQCOM(VkCommandBuffer commandBuffer, @NativeType("VkPerTileBeginInfoQCOM const *") VkPerTileBeginInfoQCOM pPerTileBeginInfo) {
        nvkCmdBeginPerTileExecutionQCOM(commandBuffer, pPerTileBeginInfo.address());
    }

    public static void nvkCmdEndPerTileExecutionQCOM(VkCommandBuffer commandBuffer, long pPerTileEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndPerTileExecutionQCOM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pPerTileEndInfo, __functionAddress);
    }

    public static void vkCmdEndPerTileExecutionQCOM(VkCommandBuffer commandBuffer, @NativeType("VkPerTileEndInfoQCOM const *") VkPerTileEndInfoQCOM pPerTileEndInfo) {
        nvkCmdEndPerTileExecutionQCOM(commandBuffer, pPerTileEndInfo.address());
    }
}
