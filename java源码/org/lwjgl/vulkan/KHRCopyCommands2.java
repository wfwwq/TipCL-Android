package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRCopyCommands2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRCopyCommands2.class */
public class KHRCopyCommands2 {
    public static final int VK_KHR_COPY_COMMANDS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_COPY_COMMANDS_2_EXTENSION_NAME = "VK_KHR_copy_commands2";
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR = 1000337000;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR = 1000337001;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR = 1000337002;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR = 1000337003;
    public static final int VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR = 1000337004;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR = 1000337005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COPY_2_KHR = 1000337006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COPY_2_KHR = 1000337007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR = 1000337008;
    public static final int VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR = 1000337009;
    public static final int VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR = 1000337010;

    protected KHRCopyCommands2() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdCopyBuffer2KHR(VkCommandBuffer commandBuffer, long pCopyBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBuffer2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyBufferInfo2.validate(pCopyBufferInfo);
        }
        JNI.callPPV(commandBuffer.address(), pCopyBufferInfo, __functionAddress);
    }

    public static void vkCmdCopyBuffer2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferInfo2 const *") VkCopyBufferInfo2 pCopyBufferInfo) {
        nvkCmdCopyBuffer2KHR(commandBuffer, pCopyBufferInfo.address());
    }

    public static void nvkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, long pCopyImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyImageInfo2.validate(pCopyImageInfo);
        }
        JNI.callPPV(commandBuffer.address(), pCopyImageInfo, __functionAddress);
    }

    public static void vkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageInfo2 const *") VkCopyImageInfo2 pCopyImageInfo) {
        nvkCmdCopyImage2KHR(commandBuffer, pCopyImageInfo.address());
    }

    public static void nvkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, long pCopyBufferToImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyBufferToImageInfo2.validate(pCopyBufferToImageInfo);
        }
        JNI.callPPV(commandBuffer.address(), pCopyBufferToImageInfo, __functionAddress);
    }

    public static void vkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferToImageInfo2 const *") VkCopyBufferToImageInfo2 pCopyBufferToImageInfo) {
        nvkCmdCopyBufferToImage2KHR(commandBuffer, pCopyBufferToImageInfo.address());
    }

    public static void nvkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, long pCopyImageToBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkCopyImageToBufferInfo2.validate(pCopyImageToBufferInfo);
        }
        JNI.callPPV(commandBuffer.address(), pCopyImageToBufferInfo, __functionAddress);
    }

    public static void vkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageToBufferInfo2 const *") VkCopyImageToBufferInfo2 pCopyImageToBufferInfo) {
        nvkCmdCopyImageToBuffer2KHR(commandBuffer, pCopyImageToBufferInfo.address());
    }

    public static void nvkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, long pBlitImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkBlitImageInfo2.validate(pBlitImageInfo);
        }
        JNI.callPPV(commandBuffer.address(), pBlitImageInfo, __functionAddress);
    }

    public static void vkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkBlitImageInfo2 const *") VkBlitImageInfo2 pBlitImageInfo) {
        nvkCmdBlitImage2KHR(commandBuffer, pBlitImageInfo.address());
    }

    public static void nvkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, long pResolveImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkResolveImageInfo2.validate(pResolveImageInfo);
        }
        JNI.callPPV(commandBuffer.address(), pResolveImageInfo, __functionAddress);
    }

    public static void vkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkResolveImageInfo2 const *") VkResolveImageInfo2 pResolveImageInfo) {
        nvkCmdResolveImage2KHR(commandBuffer, pResolveImageInfo.address());
    }
}
