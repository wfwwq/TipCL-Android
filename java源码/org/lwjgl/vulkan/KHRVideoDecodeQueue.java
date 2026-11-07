package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRVideoDecodeQueue.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRVideoDecodeQueue.class */
public class KHRVideoDecodeQueue {
    public static final int VK_KHR_VIDEO_DECODE_QUEUE_SPEC_VERSION = 8;
    public static final String VK_KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_decode_queue";
    public static final int VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR = 1000024000;
    public static final int VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR = 1000024001;
    public static final int VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR = 1000024002;
    public static final int VK_QUEUE_VIDEO_DECODE_BIT_KHR = 32;
    public static final long VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR = 67108864;
    public static final long VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR = 34359738368L;
    public static final long VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR = 68719476736L;
    public static final int VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 8192;
    public static final int VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR = 16384;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR = 1024;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 2048;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR = 4096;
    public static final int VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR = 33554432;
    public static final int VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR = 67108864;
    public static final int VK_IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR = 1000024000;
    public static final int VK_IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR = 1000024001;
    public static final int VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR = 1000024002;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR = 33554432;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR = 67108864;
    public static final int VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR = 1;
    public static final int VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR = 2;
    public static final int VK_VIDEO_DECODE_USAGE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR = 1;
    public static final int VK_VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR = 2;
    public static final int VK_VIDEO_DECODE_USAGE_STREAMING_BIT_KHR = 4;

    protected KHRVideoDecodeQueue() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, long pDecodeInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecodeVideoKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkVideoDecodeInfoKHR.validate(pDecodeInfo);
        }
        JNI.callPPV(commandBuffer.address(), pDecodeInfo, __functionAddress);
    }

    public static void vkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoDecodeInfoKHR const *") VkVideoDecodeInfoKHR pDecodeInfo) {
        nvkCmdDecodeVideoKHR(commandBuffer, pDecodeInfo.address());
    }
}
