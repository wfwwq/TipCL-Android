package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTPresentTiming.class */
public class EXTPresentTiming {
    public static final int VK_EXT_PRESENT_TIMING_SPEC_VERSION = 3;
    public static final String VK_EXT_PRESENT_TIMING_EXTENSION_NAME = "VK_EXT_present_timing";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT = 1000208000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_TIMING_PROPERTIES_EXT = 1000208001;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT = 1000208002;
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT = 1000208003;
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT = 1000208004;
    public static final int VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT = 1000208005;
    public static final int VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT = 1000208006;
    public static final int VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT = 1000208007;
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT = 1000208008;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT = 1000208009;
    public static final int VK_TIME_DOMAIN_PRESENT_STAGE_LOCAL_EXT = 1000208000;
    public static final int VK_TIME_DOMAIN_SWAPCHAIN_LOCAL_EXT = 1000208001;
    public static final int VK_ERROR_PRESENT_TIMING_QUEUE_FULL_EXT = -1000208000;
    public static final int VK_SWAPCHAIN_CREATE_PRESENT_TIMING_BIT_EXT = 512;
    public static final int VK_PRESENT_STAGE_QUEUE_OPERATIONS_END_BIT_EXT = 1;
    public static final int VK_PRESENT_STAGE_REQUEST_DEQUEUED_BIT_EXT = 2;
    public static final int VK_PRESENT_STAGE_IMAGE_FIRST_PIXEL_OUT_BIT_EXT = 4;
    public static final int VK_PRESENT_STAGE_IMAGE_FIRST_PIXEL_VISIBLE_BIT_EXT = 8;
    public static final int VK_PAST_PRESENTATION_TIMING_ALLOW_PARTIAL_RESULTS_BIT_EXT = 1;
    public static final int VK_PAST_PRESENTATION_TIMING_ALLOW_OUT_OF_ORDER_RESULTS_BIT_EXT = 2;
    public static final int VK_PRESENT_TIMING_INFO_PRESENT_AT_RELATIVE_TIME_BIT_EXT = 1;
    public static final int VK_PRESENT_TIMING_INFO_PRESENT_AT_NEAREST_REFRESH_CYCLE_BIT_EXT = 2;

    protected EXTPresentTiming() {
        throw new UnsupportedOperationException();
    }

    @NativeType("VkResult")
    public static int vkSetSwapchainPresentTimingQueueSizeEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t") int size) {
        long __functionAddress = device.getCapabilities().vkSetSwapchainPresentTimingQueueSizeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(device.address(), swapchain, size, __functionAddress);
    }

    public static int nvkGetSwapchainTimingPropertiesEXT(VkDevice device, long swapchain, long pSwapchainTimingProperties, long pSwapchainTimingPropertiesCounter) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainTimingPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), swapchain, pSwapchainTimingProperties, pSwapchainTimingPropertiesCounter, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSwapchainTimingPropertiesEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSwapchainTimingPropertiesEXT *") VkSwapchainTimingPropertiesEXT pSwapchainTimingProperties, @NativeType("uint64_t *") LongBuffer pSwapchainTimingPropertiesCounter) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) pSwapchainTimingPropertiesCounter, 1);
        }
        return nvkGetSwapchainTimingPropertiesEXT(device, swapchain, pSwapchainTimingProperties.address(), MemoryUtil.memAddressSafe(pSwapchainTimingPropertiesCounter));
    }

    public static int nvkGetSwapchainTimeDomainPropertiesEXT(VkDevice device, long swapchain, long pSwapchainTimeDomainProperties, long pTimeDomainsCounter) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainTimeDomainPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), swapchain, pSwapchainTimeDomainProperties, pTimeDomainsCounter, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSwapchainTimeDomainPropertiesEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSwapchainTimeDomainPropertiesEXT *") VkSwapchainTimeDomainPropertiesEXT pSwapchainTimeDomainProperties, @NativeType("uint64_t *") LongBuffer pTimeDomainsCounter) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) pTimeDomainsCounter, 1);
        }
        return nvkGetSwapchainTimeDomainPropertiesEXT(device, swapchain, pSwapchainTimeDomainProperties.address(), MemoryUtil.memAddressSafe(pTimeDomainsCounter));
    }

    public static int nvkGetPastPresentationTimingEXT(VkDevice device, long pPastPresentationTimingInfo, long pPastPresentationTimingProperties) {
        long __functionAddress = device.getCapabilities().vkGetPastPresentationTimingEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pPastPresentationTimingInfo, pPastPresentationTimingProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPastPresentationTimingEXT(VkDevice device, @NativeType("VkPastPresentationTimingInfoEXT const *") VkPastPresentationTimingInfoEXT pPastPresentationTimingInfo, @NativeType("VkPastPresentationTimingPropertiesEXT *") VkPastPresentationTimingPropertiesEXT pPastPresentationTimingProperties) {
        return nvkGetPastPresentationTimingEXT(device, pPastPresentationTimingInfo.address(), pPastPresentationTimingProperties.address());
    }

    @NativeType("VkResult")
    public static int vkGetSwapchainTimingPropertiesEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSwapchainTimingPropertiesEXT *") VkSwapchainTimingPropertiesEXT pSwapchainTimingProperties, @NativeType("uint64_t *") long[] pSwapchainTimingPropertiesCounter) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainTimingPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(pSwapchainTimingPropertiesCounter, 1);
        }
        return JNI.callPJPPI(device.address(), swapchain, pSwapchainTimingProperties.address(), pSwapchainTimingPropertiesCounter, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSwapchainTimeDomainPropertiesEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSwapchainTimeDomainPropertiesEXT *") VkSwapchainTimeDomainPropertiesEXT pSwapchainTimeDomainProperties, @NativeType("uint64_t *") long[] pTimeDomainsCounter) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainTimeDomainPropertiesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(pTimeDomainsCounter, 1);
        }
        return JNI.callPJPPI(device.address(), swapchain, pSwapchainTimeDomainProperties.address(), pTimeDomainsCounter, __functionAddress);
    }
}
