package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTTransformFeedback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTTransformFeedback.class */
public class EXTTransformFeedback {
    public static final int VK_EXT_TRANSFORM_FEEDBACK_SPEC_VERSION = 1;
    public static final String VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME = "VK_EXT_transform_feedback";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT = 1000028000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT = 1000028001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT = 1000028002;
    public static final int VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT = 1000028004;
    public static final int VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT = 2048;
    public static final int VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 4096;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT = 33554432;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT = 67108864;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 134217728;
    public static final int VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT = 16777216;

    protected EXTTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTransformFeedbackBuffersEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, __functionAddress);
    }

    public static void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @NativeType("VkDeviceSize const *") LongBuffer pSizes) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pOffsets, pBuffers.remaining());
            Checks.checkSafe((Buffer) pSizes, pBuffers.remaining());
        }
        nvkCmdBindTransformFeedbackBuffersEXT(commandBuffer, firstBinding, pBuffers.remaining(), MemoryUtil.memAddress(pBuffers), MemoryUtil.memAddress(pOffsets), MemoryUtil.memAddressSafe(pSizes));
    }

    public static void nvkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, long pCounterBuffers, long pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginTransformFeedbackEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(commandBuffer.address(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

    public static void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @NativeType("VkBuffer const *") LongBuffer pCounterBuffers, @NativeType("VkDeviceSize const *") LongBuffer pCounterBufferOffsets) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) pCounterBufferOffsets, Checks.remainingSafe(pCounterBuffers));
        }
        nvkCmdBeginTransformFeedbackEXT(commandBuffer, firstCounterBuffer, Checks.remainingSafe(pCounterBuffers), MemoryUtil.memAddressSafe(pCounterBuffers), MemoryUtil.memAddressSafe(pCounterBufferOffsets));
    }

    public static void nvkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, long pCounterBuffers, long pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndTransformFeedbackEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(commandBuffer.address(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

    public static void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @NativeType("VkBuffer const *") LongBuffer pCounterBuffers, @NativeType("VkDeviceSize const *") LongBuffer pCounterBufferOffsets) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) pCounterBufferOffsets, Checks.remainingSafe(pCounterBuffers));
        }
        nvkCmdEndTransformFeedbackEXT(commandBuffer, firstCounterBuffer, Checks.remainingSafe(pCounterBuffers), MemoryUtil.memAddressSafe(pCounterBuffers), MemoryUtil.memAddressSafe(pCounterBufferOffsets));
    }

    public static void vkCmdBeginQueryIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query, @NativeType("VkQueryControlFlags") int flags, @NativeType("uint32_t") int index) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginQueryIndexedEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJV(commandBuffer.address(), queryPool, query, flags, index, __functionAddress);
    }

    public static void vkCmdEndQueryIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query, @NativeType("uint32_t") int index) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndQueryIndexedEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJV(commandBuffer.address(), queryPool, query, index, __functionAddress);
    }

    public static void vkCmdDrawIndirectByteCountEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("VkBuffer") long counterBuffer, @NativeType("VkDeviceSize") long counterBufferOffset, @NativeType("uint32_t") int counterOffset, @NativeType("uint32_t") int vertexStride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirectByteCountEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJJV(commandBuffer.address(), instanceCount, firstInstance, counterBuffer, counterBufferOffset, counterOffset, vertexStride, __functionAddress);
    }

    public static void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @NativeType("VkDeviceSize const *") long[] pSizes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTransformFeedbackBuffersEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pOffsets, pBuffers.length);
            Checks.checkSafe(pSizes, pBuffers.length);
        }
        JNI.callPPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes, __functionAddress);
    }

    public static void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @NativeType("VkBuffer const *") long[] pCounterBuffers, @NativeType("VkDeviceSize const *") long[] pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginTransformFeedbackEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(pCounterBufferOffsets, Checks.lengthSafe(pCounterBuffers));
        }
        JNI.callPPPV(commandBuffer.address(), firstCounterBuffer, Checks.lengthSafe(pCounterBuffers), pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

    public static void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @NativeType("VkBuffer const *") long[] pCounterBuffers, @NativeType("VkDeviceSize const *") long[] pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndTransformFeedbackEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(pCounterBufferOffsets, Checks.lengthSafe(pCounterBuffers));
        }
        JNI.callPPPV(commandBuffer.address(), firstCounterBuffer, Checks.lengthSafe(pCounterBuffers), pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }
}
