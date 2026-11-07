package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDebugUtils.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDebugUtils.class */
public class EXTDebugUtils {
    public static final int VK_EXT_DEBUG_UTILS_SPEC_VERSION = 2;
    public static final String VK_EXT_DEBUG_UTILS_EXTENSION_NAME = "VK_EXT_debug_utils";
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT = 1000128000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT = 1000128001;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT = 1000128002;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT = 1000128003;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT = 1000128004;
    public static final int VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT = 1000128000;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 1;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT = 16;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 256;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT = 4096;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT = 1;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT = 2;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = 4;

    protected EXTDebugUtils() {
        throw new UnsupportedOperationException();
    }

    public static int nvkSetDebugUtilsObjectNameEXT(VkDevice device, long pNameInfo) {
        long __functionAddress = device.getCapabilitiesInstance().vkSetDebugUtilsObjectNameEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pNameInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkSetDebugUtilsObjectNameEXT(VkDevice device, @NativeType("VkDebugUtilsObjectNameInfoEXT const *") VkDebugUtilsObjectNameInfoEXT pNameInfo) {
        return nvkSetDebugUtilsObjectNameEXT(device, pNameInfo.address());
    }

    public static int nvkSetDebugUtilsObjectTagEXT(VkDevice device, long pTagInfo) {
        long __functionAddress = device.getCapabilitiesInstance().vkSetDebugUtilsObjectTagEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugUtilsObjectTagInfoEXT.validate(pTagInfo);
        }
        return JNI.callPPI(device.address(), pTagInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkSetDebugUtilsObjectTagEXT(VkDevice device, @NativeType("VkDebugUtilsObjectTagInfoEXT const *") VkDebugUtilsObjectTagInfoEXT pTagInfo) {
        return nvkSetDebugUtilsObjectTagEXT(device, pTagInfo.address());
    }

    public static void nvkQueueBeginDebugUtilsLabelEXT(VkQueue queue, long pLabelInfo) {
        long __functionAddress = queue.getCapabilitiesInstance().vkQueueBeginDebugUtilsLabelEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        JNI.callPPV(queue.address(), pLabelInfo, __functionAddress);
    }

    public static void vkQueueBeginDebugUtilsLabelEXT(VkQueue queue, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkQueueBeginDebugUtilsLabelEXT(queue, pLabelInfo.address());
    }

    public static void vkQueueEndDebugUtilsLabelEXT(VkQueue queue) {
        long __functionAddress = queue.getCapabilitiesInstance().vkQueueEndDebugUtilsLabelEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(queue.address(), __functionAddress);
    }

    public static void nvkQueueInsertDebugUtilsLabelEXT(VkQueue queue, long pLabelInfo) {
        long __functionAddress = queue.getCapabilitiesInstance().vkQueueInsertDebugUtilsLabelEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        JNI.callPPV(queue.address(), pLabelInfo, __functionAddress);
    }

    public static void vkQueueInsertDebugUtilsLabelEXT(VkQueue queue, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkQueueInsertDebugUtilsLabelEXT(queue, pLabelInfo.address());
    }

    public static void nvkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, long pLabelInfo) {
        long __functionAddress = commandBuffer.getCapabilitiesInstance().vkCmdBeginDebugUtilsLabelEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        JNI.callPPV(commandBuffer.address(), pLabelInfo, __functionAddress);
    }

    public static void vkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkCmdBeginDebugUtilsLabelEXT(commandBuffer, pLabelInfo.address());
    }

    public static void vkCmdEndDebugUtilsLabelEXT(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilitiesInstance().vkCmdEndDebugUtilsLabelEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), __functionAddress);
    }

    public static void nvkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, long pLabelInfo) {
        long __functionAddress = commandBuffer.getCapabilitiesInstance().vkCmdInsertDebugUtilsLabelEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        JNI.callPPV(commandBuffer.address(), pLabelInfo, __functionAddress);
    }

    public static void vkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkCmdInsertDebugUtilsLabelEXT(commandBuffer, pLabelInfo.address());
    }

    public static int nvkCreateDebugUtilsMessengerEXT(VkInstance instance, long pCreateInfo, long pAllocator, long pMessenger) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugUtilsMessengerEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugUtilsMessengerCreateInfoEXT.validate(pCreateInfo);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo, pAllocator, pMessenger, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDebugUtilsMessengerEXT(VkInstance instance, @NativeType("VkDebugUtilsMessengerCreateInfoEXT const *") VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDebugUtilsMessengerEXT *") LongBuffer pMessenger) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pMessenger, 1);
        }
        return nvkCreateDebugUtilsMessengerEXT(instance, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pMessenger));
    }

    public static void nvkDestroyDebugUtilsMessengerEXT(VkInstance instance, long messenger, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroyDebugUtilsMessengerEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(instance.address(), messenger, pAllocator, __functionAddress);
    }

    public static void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, @NativeType("VkDebugUtilsMessengerEXT") long messenger, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDebugUtilsMessengerEXT(instance, messenger, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkSubmitDebugUtilsMessageEXT(VkInstance instance, int messageSeverity, int messageTypes, long pCallbackData) {
        long __functionAddress = instance.getCapabilities().vkSubmitDebugUtilsMessageEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugUtilsMessengerCallbackDataEXT.validate(pCallbackData);
        }
        JNI.callPPV(instance.address(), messageSeverity, messageTypes, pCallbackData, __functionAddress);
    }

    public static void vkSubmitDebugUtilsMessageEXT(VkInstance instance, @NativeType("VkDebugUtilsMessageSeverityFlagBitsEXT") int messageSeverity, @NativeType("VkDebugUtilsMessageTypeFlagsEXT") int messageTypes, @NativeType("VkDebugUtilsMessengerCallbackDataEXT const *") VkDebugUtilsMessengerCallbackDataEXT pCallbackData) {
        nvkSubmitDebugUtilsMessageEXT(instance, messageSeverity, messageTypes, pCallbackData.address());
    }

    @NativeType("VkResult")
    public static int vkCreateDebugUtilsMessengerEXT(VkInstance instance, @NativeType("VkDebugUtilsMessengerCreateInfoEXT const *") VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDebugUtilsMessengerEXT *") long[] pMessenger) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugUtilsMessengerEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pMessenger, 1);
            VkDebugUtilsMessengerCreateInfoEXT.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pMessenger, __functionAddress);
    }
}
