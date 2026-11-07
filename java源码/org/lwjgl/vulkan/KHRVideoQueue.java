package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBindVideoSessionMemoryInfoKHR;
import org.lwjgl.vulkan.VkVideoFormatPropertiesKHR;
import org.lwjgl.vulkan.VkVideoSessionMemoryRequirementsKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRVideoQueue.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRVideoQueue.class */
public class KHRVideoQueue {
    public static final int VK_KHR_VIDEO_QUEUE_SPEC_VERSION = 8;
    public static final String VK_KHR_VIDEO_QUEUE_EXTENSION_NAME = "VK_KHR_video_queue";
    public static final int VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR = 1000023000;
    public static final int VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR = 1000023001;
    public static final int VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR = 1000023002;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR = 1000023003;
    public static final int VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR = 1000023004;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR = 1000023005;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR = 1000023006;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR = 1000023007;
    public static final int VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR = 1000023008;
    public static final int VK_STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR = 1000023009;
    public static final int VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR = 1000023010;
    public static final int VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR = 1000023011;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR = 1000023012;
    public static final int VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR = 1000023013;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR = 1000023014;
    public static final int VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR = 1000023015;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR = 1000023016;
    public static final int VK_OBJECT_TYPE_VIDEO_SESSION_KHR = 1000023000;
    public static final int VK_OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR = 1000023001;
    public static final int VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR = 1000023000;
    public static final int VK_QUERY_RESULT_WITH_STATUS_BIT_KHR = 16;
    public static final int VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR = -1000023000;
    public static final int VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR = -1000023001;
    public static final int VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR = -1000023002;
    public static final int VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR = -1000023003;
    public static final int VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR = -1000023004;
    public static final int VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR = -1000023005;
    public static final int VK_VIDEO_CODEC_OPERATION_NONE_KHR = 0;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR = 0;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR = 1;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR = 2;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR = 4;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR = 8;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR = 0;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR = 1;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR = 4;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR = 16;
    public static final int VK_VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR = 1;
    public static final int VK_VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR = 2;
    public static final int VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR = 1;
    public static final int VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR = 1;
    public static final int VK_QUERY_RESULT_STATUS_NOT_READY_KHR = 0;
    public static final int VK_QUERY_RESULT_STATUS_COMPLETE_KHR = 1;
    public static final int VK_QUERY_RESULT_STATUS_ERROR_KHR = -1;

    protected KHRVideoQueue() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, long pVideoProfile, long pCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoCapabilitiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pVideoProfile, pCapabilities, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR pVideoProfile, @NativeType("VkVideoCapabilitiesKHR *") VkVideoCapabilitiesKHR pCapabilities) {
        return nvkGetPhysicalDeviceVideoCapabilitiesKHR(physicalDevice, pVideoProfile.address(), pCapabilities.address());
    }

    public static int nvkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, long pVideoFormatInfo, long pVideoFormatPropertyCount, long pVideoFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoFormatPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(physicalDevice.address(), pVideoFormatInfo, pVideoFormatPropertyCount, pVideoFormatProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceVideoFormatInfoKHR const *") VkPhysicalDeviceVideoFormatInfoKHR pVideoFormatInfo, @NativeType("uint32_t *") IntBuffer pVideoFormatPropertyCount, @NativeType("VkVideoFormatPropertiesKHR *") VkVideoFormatPropertiesKHR.Buffer pVideoFormatProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pVideoFormatPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pVideoFormatProperties, pVideoFormatPropertyCount.get(pVideoFormatPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceVideoFormatPropertiesKHR(physicalDevice, pVideoFormatInfo.address(), MemoryUtil.memAddress(pVideoFormatPropertyCount), MemoryUtil.memAddressSafe(pVideoFormatProperties));
    }

    public static int nvkCreateVideoSessionKHR(VkDevice device, long pCreateInfo, long pAllocator, long pVideoSession) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkVideoSessionCreateInfoKHR.validate(pCreateInfo);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pVideoSession, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateVideoSessionKHR(VkDevice device, @NativeType("VkVideoSessionCreateInfoKHR const *") VkVideoSessionCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionKHR *") LongBuffer pVideoSession) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pVideoSession, 1);
        }
        return nvkCreateVideoSessionKHR(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pVideoSession));
    }

    public static void nvkDestroyVideoSessionKHR(VkDevice device, long videoSession, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyVideoSessionKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), videoSession, pAllocator, __functionAddress);
    }

    public static void vkDestroyVideoSessionKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyVideoSessionKHR(device, videoSession, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static int nvkGetVideoSessionMemoryRequirementsKHR(VkDevice device, long videoSession, long pMemoryRequirementsCount, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetVideoSessionMemoryRequirementsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), videoSession, pMemoryRequirementsCount, pMemoryRequirements, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("uint32_t *") IntBuffer pMemoryRequirementsCount, @NativeType("VkVideoSessionMemoryRequirementsKHR *") VkVideoSessionMemoryRequirementsKHR.Buffer pMemoryRequirements) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pMemoryRequirementsCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pMemoryRequirements, pMemoryRequirementsCount.get(pMemoryRequirementsCount.position()));
        }
        return nvkGetVideoSessionMemoryRequirementsKHR(device, videoSession, MemoryUtil.memAddress(pMemoryRequirementsCount), MemoryUtil.memAddressSafe(pMemoryRequirements));
    }

    public static int nvkBindVideoSessionMemoryKHR(VkDevice device, long videoSession, int bindSessionMemoryInfoCount, long pBindSessionMemoryInfos) {
        long __functionAddress = device.getCapabilities().vkBindVideoSessionMemoryKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), videoSession, bindSessionMemoryInfoCount, pBindSessionMemoryInfos, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkBindVideoSessionMemoryKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("VkBindVideoSessionMemoryInfoKHR const *") VkBindVideoSessionMemoryInfoKHR.Buffer pBindSessionMemoryInfos) {
        return nvkBindVideoSessionMemoryKHR(device, videoSession, pBindSessionMemoryInfos.remaining(), pBindSessionMemoryInfos.address());
    }

    public static int nvkCreateVideoSessionParametersKHR(VkDevice device, long pCreateInfo, long pAllocator, long pVideoSessionParameters) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionParametersKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo, pAllocator, pVideoSessionParameters, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersCreateInfoKHR const *") VkVideoSessionParametersCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionParametersKHR *") LongBuffer pVideoSessionParameters) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pVideoSessionParameters, 1);
        }
        return nvkCreateVideoSessionParametersKHR(device, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pVideoSessionParameters));
    }

    public static int nvkUpdateVideoSessionParametersKHR(VkDevice device, long videoSessionParameters, long pUpdateInfo) {
        long __functionAddress = device.getCapabilities().vkUpdateVideoSessionParametersKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), videoSessionParameters, pUpdateInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkUpdateVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersKHR") long videoSessionParameters, @NativeType("VkVideoSessionParametersUpdateInfoKHR const *") VkVideoSessionParametersUpdateInfoKHR pUpdateInfo) {
        return nvkUpdateVideoSessionParametersKHR(device, videoSessionParameters, pUpdateInfo.address());
    }

    public static void nvkDestroyVideoSessionParametersKHR(VkDevice device, long videoSessionParameters, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyVideoSessionParametersKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), videoSessionParameters, pAllocator, __functionAddress);
    }

    public static void vkDestroyVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersKHR") long videoSessionParameters, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyVideoSessionParametersKHR(device, videoSessionParameters, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkCmdBeginVideoCodingKHR(VkCommandBuffer commandBuffer, long pBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginVideoCodingKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkVideoBeginCodingInfoKHR.validate(pBeginInfo);
        }
        JNI.callPPV(commandBuffer.address(), pBeginInfo, __functionAddress);
    }

    public static void vkCmdBeginVideoCodingKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoBeginCodingInfoKHR const *") VkVideoBeginCodingInfoKHR pBeginInfo) {
        nvkCmdBeginVideoCodingKHR(commandBuffer, pBeginInfo.address());
    }

    public static void nvkCmdEndVideoCodingKHR(VkCommandBuffer commandBuffer, long pEndCodingInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndVideoCodingKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pEndCodingInfo, __functionAddress);
    }

    public static void vkCmdEndVideoCodingKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoEndCodingInfoKHR const *") VkVideoEndCodingInfoKHR pEndCodingInfo) {
        nvkCmdEndVideoCodingKHR(commandBuffer, pEndCodingInfo.address());
    }

    public static void nvkCmdControlVideoCodingKHR(VkCommandBuffer commandBuffer, long pCodingControlInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdControlVideoCodingKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pCodingControlInfo, __functionAddress);
    }

    public static void vkCmdControlVideoCodingKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoCodingControlInfoKHR const *") VkVideoCodingControlInfoKHR pCodingControlInfo) {
        nvkCmdControlVideoCodingKHR(commandBuffer, pCodingControlInfo.address());
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceVideoFormatInfoKHR const *") VkPhysicalDeviceVideoFormatInfoKHR pVideoFormatInfo, @NativeType("uint32_t *") int[] pVideoFormatPropertyCount, @NativeType("VkVideoFormatPropertiesKHR *") VkVideoFormatPropertiesKHR.Buffer pVideoFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoFormatPropertiesKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pVideoFormatPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pVideoFormatProperties, pVideoFormatPropertyCount[0]);
        }
        return JNI.callPPPPI(physicalDevice.address(), pVideoFormatInfo.address(), pVideoFormatPropertyCount, MemoryUtil.memAddressSafe(pVideoFormatProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateVideoSessionKHR(VkDevice device, @NativeType("VkVideoSessionCreateInfoKHR const *") VkVideoSessionCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionKHR *") long[] pVideoSession) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pVideoSession, 1);
            VkVideoSessionCreateInfoKHR.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pVideoSession, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("uint32_t *") int[] pMemoryRequirementsCount, @NativeType("VkVideoSessionMemoryRequirementsKHR *") VkVideoSessionMemoryRequirementsKHR.Buffer pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetVideoSessionMemoryRequirementsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pMemoryRequirementsCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pMemoryRequirements, pMemoryRequirementsCount[0]);
        }
        return JNI.callPJPPI(device.address(), videoSession, pMemoryRequirementsCount, MemoryUtil.memAddressSafe(pMemoryRequirements), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersCreateInfoKHR const *") VkVideoSessionParametersCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionParametersKHR *") long[] pVideoSessionParameters) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionParametersKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pVideoSessionParameters, 1);
        }
        return JNI.callPPPPI(device.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pVideoSessionParameters, __functionAddress);
    }
}
