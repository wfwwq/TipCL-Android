package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVLowLatency2.class */
public class NVLowLatency2 {
    public static final int VK_NV_LOW_LATENCY_2_SPEC_VERSION = 2;
    public static final String VK_NV_LOW_LATENCY_2_EXTENSION_NAME = "VK_NV_low_latency2";
    public static final int VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV = 1000505000;
    public static final int VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV = 1000505001;
    public static final int VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV = 1000505002;
    public static final int VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV = 1000505003;
    public static final int VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV = 1000505004;
    public static final int VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV = 1000505005;
    public static final int VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV = 1000505006;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV = 1000505007;
    public static final int VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV = 1000505008;
    public static final int VK_LATENCY_MARKER_SIMULATION_START_NV = 0;
    public static final int VK_LATENCY_MARKER_SIMULATION_END_NV = 1;
    public static final int VK_LATENCY_MARKER_RENDERSUBMIT_START_NV = 2;
    public static final int VK_LATENCY_MARKER_RENDERSUBMIT_END_NV = 3;
    public static final int VK_LATENCY_MARKER_PRESENT_START_NV = 4;
    public static final int VK_LATENCY_MARKER_PRESENT_END_NV = 5;
    public static final int VK_LATENCY_MARKER_INPUT_SAMPLE_NV = 6;
    public static final int VK_LATENCY_MARKER_TRIGGER_FLASH_NV = 7;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_START_NV = 8;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_END_NV = 9;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_START_NV = 10;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_END_NV = 11;
    public static final int VK_OUT_OF_BAND_QUEUE_TYPE_RENDER_NV = 0;
    public static final int VK_OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV = 1;

    protected NVLowLatency2() {
        throw new UnsupportedOperationException();
    }

    public static int nvkSetLatencySleepModeNV(VkDevice device, long swapchain, long pSleepModeInfo) {
        long __functionAddress = device.getCapabilities().vkSetLatencySleepModeNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), swapchain, pSleepModeInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkSetLatencySleepModeNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkLatencySleepModeInfoNV const *") VkLatencySleepModeInfoNV pSleepModeInfo) {
        return nvkSetLatencySleepModeNV(device, swapchain, pSleepModeInfo.address());
    }

    public static int nvkLatencySleepNV(VkDevice device, long swapchain, long pSleepInfo) {
        long __functionAddress = device.getCapabilities().vkLatencySleepNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), swapchain, pSleepInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkLatencySleepNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkLatencySleepInfoNV const *") VkLatencySleepInfoNV pSleepInfo) {
        return nvkLatencySleepNV(device, swapchain, pSleepInfo.address());
    }

    public static void nvkSetLatencyMarkerNV(VkDevice device, long swapchain, long pLatencyMarkerInfo) {
        long __functionAddress = device.getCapabilities().vkSetLatencyMarkerNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), swapchain, pLatencyMarkerInfo, __functionAddress);
    }

    public static void vkSetLatencyMarkerNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSetLatencyMarkerInfoNV const *") VkSetLatencyMarkerInfoNV pLatencyMarkerInfo) {
        nvkSetLatencyMarkerNV(device, swapchain, pLatencyMarkerInfo.address());
    }

    public static void nvkGetLatencyTimingsNV(VkDevice device, long swapchain, long pLatencyMarkerInfo) {
        long __functionAddress = device.getCapabilities().vkGetLatencyTimingsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), swapchain, pLatencyMarkerInfo, __functionAddress);
    }

    public static void vkGetLatencyTimingsNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkGetLatencyMarkerInfoNV *") VkGetLatencyMarkerInfoNV pLatencyMarkerInfo) {
        nvkGetLatencyTimingsNV(device, swapchain, pLatencyMarkerInfo.address());
    }

    public static void nvkQueueNotifyOutOfBandNV(VkQueue queue, long pQueueTypeInfo) {
        long __functionAddress = queue.getCapabilities().vkQueueNotifyOutOfBandNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(queue.address(), pQueueTypeInfo, __functionAddress);
    }

    public static void vkQueueNotifyOutOfBandNV(VkQueue queue, @NativeType("VkOutOfBandQueueTypeInfoNV const *") VkOutOfBandQueueTypeInfoNV pQueueTypeInfo) {
        nvkQueueNotifyOutOfBandNV(queue, pQueueTypeInfo.address());
    }
}
