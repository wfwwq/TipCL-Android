package org.lwjgl.vulkan;

import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.vulkan.VkDependencyInfo;
import org.lwjgl.vulkan.VkSubmitInfo2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRSynchronization2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRSynchronization2.class */
public class KHRSynchronization2 {
    public static final int VK_KHR_SYNCHRONIZATION_2_SPEC_VERSION = 1;
    public static final String VK_KHR_SYNCHRONIZATION_2_EXTENSION_NAME = "VK_KHR_synchronization2";
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR = 1000314000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2_KHR = 1000314001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2_KHR = 1000314002;
    public static final int VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR = 1000314003;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO_2_KHR = 1000314004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR = 1000314005;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR = 1000314006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES_KHR = 1000314007;
    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT_KHR = 1;
    public static final int VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR = 1000314000;
    public static final int VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR = 1000314001;
    public static final int VK_PIPELINE_STAGE_NONE_KHR = 0;
    public static final int VK_ACCESS_NONE_KHR = 0;
    public static final long VK_ACCESS_2_NONE_KHR = 0;
    public static final long VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR = 1;
    public static final long VK_ACCESS_2_INDEX_READ_BIT_KHR = 2;
    public static final long VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR = 4;
    public static final long VK_ACCESS_2_UNIFORM_READ_BIT_KHR = 8;
    public static final long VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR = 16;
    public static final long VK_ACCESS_2_SHADER_READ_BIT_KHR = 32;
    public static final long VK_ACCESS_2_SHADER_WRITE_BIT_KHR = 64;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR = 128;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR = 256;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR = 512;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR = 1024;
    public static final long VK_ACCESS_2_TRANSFER_READ_BIT_KHR = 2048;
    public static final long VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR = 4096;
    public static final long VK_ACCESS_2_HOST_READ_BIT_KHR = 8192;
    public static final long VK_ACCESS_2_HOST_WRITE_BIT_KHR = 16384;
    public static final long VK_ACCESS_2_MEMORY_READ_BIT_KHR = 32768;
    public static final long VK_ACCESS_2_MEMORY_WRITE_BIT_KHR = 65536;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV = 131072;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_EXT = 131072;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV = 262144;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_EXT = 262144;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = 524288;
    public static final long VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT = 1048576;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR = 2097152;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV = 2097152;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 4194304;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV = 4194304;
    public static final long VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 8388608;
    public static final long VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV = 8388608;
    public static final long VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT = 16777216;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT = 33554432;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT = 67108864;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 134217728;
    public static final long VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR = 4294967296L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR = 8589934592L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR = 17179869184L;
    public static final long VK_PIPELINE_STAGE_2_NONE_KHR = 0;
    public static final long VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR = 1;
    public static final long VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR = 2;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR = 4;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR = 8;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR = 16;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR = 32;
    public static final long VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR = 64;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR = 128;
    public static final long VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR = 256;
    public static final long VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR = 512;
    public static final long VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR = 1024;
    public static final long VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR = 2048;
    public static final long VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR = 4096;
    public static final long VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR = 4096;
    public static final long VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR = 8192;
    public static final long VK_PIPELINE_STAGE_2_HOST_BIT_KHR = 16384;
    public static final long VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR = 32768;
    public static final long VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR = 65536;
    public static final long VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV = 131072;
    public static final long VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_EXT = 131072;
    public static final long VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 262144;
    public static final long VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV = 524288;
    public static final long VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT = 524288;
    public static final long VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV = 1048576;
    public static final long VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT = 1048576;
    public static final long VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR = 2097152;
    public static final long VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV = 2097152;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 4194304;
    public static final long VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV = 4194304;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT = 8388608;
    public static final long VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT = 16777216;
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 33554432;
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV = 33554432;
    public static final long VK_PIPELINE_STAGE_2_COPY_BIT_KHR = 4294967296L;
    public static final long VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR = 8589934592L;
    public static final long VK_PIPELINE_STAGE_2_BLIT_BIT_KHR = 17179869184L;
    public static final long VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR = 34359738368L;
    public static final long VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR = 68719476736L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR = 137438953472L;
    public static final long VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR = 274877906944L;
    public static final int VK_SUBMIT_PROTECTED_BIT_KHR = 1;

    protected KHRSynchronization2() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdSetEvent2KHR(VkCommandBuffer commandBuffer, long event, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        JNI.callPJPV(commandBuffer.address(), event, pDependencyInfo, __functionAddress);
    }

    public static void vkCmdSetEvent2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdSetEvent2KHR(commandBuffer, event, pDependencyInfo.address());
    }

    public static void vkCmdResetEvent2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags2") long stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJV(commandBuffer.address(), event, stageMask, __functionAddress);
    }

    public static void nvkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, int eventCount, long pEvents, long pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Struct.validate(pDependencyInfos, eventCount, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        JNI.callPPPV(commandBuffer.address(), eventCount, pEvents, pDependencyInfos, __functionAddress);
    }

    public static void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") LongBuffer pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pDependencyInfos, pEvents.remaining());
        }
        nvkCmdWaitEvents2KHR(commandBuffer, pEvents.remaining(), MemoryUtil.memAddress(pEvents), pDependencyInfos.address());
    }

    public static void nvkCmdPipelineBarrier2KHR(VkCommandBuffer commandBuffer, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPipelineBarrier2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        JNI.callPPV(commandBuffer.address(), pDependencyInfo, __functionAddress);
    }

    public static void vkCmdPipelineBarrier2KHR(VkCommandBuffer commandBuffer, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdPipelineBarrier2KHR(commandBuffer, pDependencyInfo.address());
    }

    public static void vkCmdWriteTimestamp2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags2") long stage, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJV(commandBuffer.address(), stage, queryPool, query, __functionAddress);
    }

    public static int nvkQueueSubmit2KHR(VkQueue queue, int submitCount, long pSubmits, long fence) {
        long __functionAddress = queue.getCapabilities().vkQueueSubmit2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            if (pSubmits != 0) {
                Struct.validate(pSubmits, submitCount, VkSubmitInfo2.SIZEOF, VkSubmitInfo2::validate);
            }
        }
        return JNI.callPPJI(queue.address(), submitCount, pSubmits, fence, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkQueueSubmit2KHR(VkQueue queue, @NativeType("VkSubmitInfo2 const *") VkSubmitInfo2.Buffer pSubmits, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit2KHR(queue, Checks.remainingSafe(pSubmits), MemoryUtil.memAddressSafe(pSubmits), fence);
    }

    public static void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") long[] pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check((CustomBuffer<?>) pDependencyInfos, pEvents.length);
            Struct.validate(pDependencyInfos.address(), pEvents.length, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        JNI.callPPPV(commandBuffer.address(), pEvents.length, pEvents, pDependencyInfos.address(), __functionAddress);
    }
}
