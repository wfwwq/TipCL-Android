package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCheckpointData2NV;
import org.lwjgl.vulkan.VkCheckpointDataNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVDeviceDiagnosticCheckpoints.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVDeviceDiagnosticCheckpoints.class */
public class NVDeviceDiagnosticCheckpoints {
    public static final int VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_SPEC_VERSION = 2;
    public static final String VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME = "VK_NV_device_diagnostic_checkpoints";
    public static final int VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV = 1000206000;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV = 1000206001;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV = 1000314008;
    public static final int VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV = 1000314009;

    protected NVDeviceDiagnosticCheckpoints() {
        throw new UnsupportedOperationException();
    }

    public static void vkCmdSetCheckpointNV(VkCommandBuffer commandBuffer, @NativeType("void const *") long pCheckpointMarker) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCheckpointNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pCheckpointMarker, __functionAddress);
    }

    public static void nvkGetQueueCheckpointDataNV(VkQueue queue, long pCheckpointDataCount, long pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointDataNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(queue.address(), pCheckpointDataCount, pCheckpointData, __functionAddress);
    }

    public static void vkGetQueueCheckpointDataNV(VkQueue queue, @NativeType("uint32_t *") IntBuffer pCheckpointDataCount, @NativeType("VkCheckpointDataNV *") VkCheckpointDataNV.Buffer pCheckpointData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCheckpointDataCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pCheckpointData, pCheckpointDataCount.get(pCheckpointDataCount.position()));
        }
        nvkGetQueueCheckpointDataNV(queue, MemoryUtil.memAddress(pCheckpointDataCount), MemoryUtil.memAddressSafe(pCheckpointData));
    }

    public static void nvkGetQueueCheckpointData2NV(VkQueue queue, long pCheckpointDataCount, long pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointData2NV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(queue.address(), pCheckpointDataCount, pCheckpointData, __functionAddress);
    }

    public static void vkGetQueueCheckpointData2NV(VkQueue queue, @NativeType("uint32_t *") IntBuffer pCheckpointDataCount, @NativeType("VkCheckpointData2NV *") VkCheckpointData2NV.Buffer pCheckpointData) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCheckpointDataCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pCheckpointData, pCheckpointDataCount.get(pCheckpointDataCount.position()));
        }
        nvkGetQueueCheckpointData2NV(queue, MemoryUtil.memAddress(pCheckpointDataCount), MemoryUtil.memAddressSafe(pCheckpointData));
    }

    public static void vkGetQueueCheckpointDataNV(VkQueue queue, @NativeType("uint32_t *") int[] pCheckpointDataCount, @NativeType("VkCheckpointDataNV *") VkCheckpointDataNV.Buffer pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointDataNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pCheckpointDataCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pCheckpointData, pCheckpointDataCount[0]);
        }
        JNI.callPPPV(queue.address(), pCheckpointDataCount, MemoryUtil.memAddressSafe(pCheckpointData), __functionAddress);
    }

    public static void vkGetQueueCheckpointData2NV(VkQueue queue, @NativeType("uint32_t *") int[] pCheckpointDataCount, @NativeType("VkCheckpointData2NV *") VkCheckpointData2NV.Buffer pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointData2NV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pCheckpointDataCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pCheckpointData, pCheckpointDataCount[0]);
        }
        JNI.callPPPV(queue.address(), pCheckpointDataCount, MemoryUtil.memAddressSafe(pCheckpointData), __functionAddress);
    }
}
