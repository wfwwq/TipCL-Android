package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDebugReport.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDebugReport.class */
public class EXTDebugReport {
    public static final int VK_EXT_DEBUG_REPORT_SPEC_VERSION = 10;
    public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";
    public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = 1000011000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT = 1000011000;
    public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;
    public static final int VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT = 1000011000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = 0;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = 2;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = 3;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = 4;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = 5;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = 6;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = 7;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = 8;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = 9;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = 10;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = 11;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = 12;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = 13;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = 14;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = 15;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = 16;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = 17;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = 18;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = 19;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = 20;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = 21;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = 22;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = 23;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = 24;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = 25;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = 26;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = 27;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT = 28;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = 28;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT = 29;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT = 30;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT = 33;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = 33;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT = 1000085000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT = 1000156000;
    public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 1;
    public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = 2;
    public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 4;
    public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = 8;
    public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = 16;

    protected EXTDebugReport() {
        throw new UnsupportedOperationException();
    }

    public static int nvkCreateDebugReportCallbackEXT(VkInstance instance, long pCreateInfo, long pAllocator, long pCallback) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugReportCallbackEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo);
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo, pAllocator, pCallback, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateDebugReportCallbackEXT(VkInstance instance, @NativeType("VkDebugReportCallbackCreateInfoEXT const *") VkDebugReportCallbackCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDebugReportCallbackEXT *") LongBuffer pCallback) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCallback, 1);
        }
        return nvkCreateDebugReportCallbackEXT(instance, pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pCallback));
    }

    public static void nvkDestroyDebugReportCallbackEXT(VkInstance instance, long callback, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroyDebugReportCallbackEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(instance.address(), callback, pAllocator, __functionAddress);
    }

    public static void vkDestroyDebugReportCallbackEXT(VkInstance instance, @NativeType("VkDebugReportCallbackEXT") long callback, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDebugReportCallbackEXT(instance, callback, MemoryUtil.memAddressSafe(pAllocator));
    }

    public static void nvkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage) {
        long __functionAddress = instance.getCapabilities().vkDebugReportMessageEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPPPV(instance.address(), flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, __functionAddress);
    }

    public static void vkDebugReportMessageEXT(VkInstance instance, @NativeType("VkDebugReportFlagsEXT") int flags, @NativeType("VkDebugReportObjectTypeEXT") int objectType, @NativeType("uint64_t") long object, @NativeType("size_t") long location, @NativeType("int32_t") int messageCode, @NativeType("char const *") ByteBuffer pLayerPrefix, @NativeType("char const *") ByteBuffer pMessage) {
        if (Checks.CHECKS) {
            Checks.checkNT1(pLayerPrefix);
            Checks.checkNT1(pMessage);
        }
        nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, MemoryUtil.memAddress(pLayerPrefix), MemoryUtil.memAddress(pMessage));
    }

    public static void vkDebugReportMessageEXT(VkInstance instance, @NativeType("VkDebugReportFlagsEXT") int flags, @NativeType("VkDebugReportObjectTypeEXT") int objectType, @NativeType("uint64_t") long object, @NativeType("size_t") long location, @NativeType("int32_t") int messageCode, @NativeType("char const *") CharSequence pLayerPrefix, @NativeType("char const *") CharSequence pMessage) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pLayerPrefix, true);
            long pLayerPrefixEncoded = stack.getPointerAddress();
            stack.nUTF8(pMessage, true);
            long pMessageEncoded = stack.getPointerAddress();
            nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, pLayerPrefixEncoded, pMessageEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("VkResult")
    public static int vkCreateDebugReportCallbackEXT(VkInstance instance, @NativeType("VkDebugReportCallbackCreateInfoEXT const *") VkDebugReportCallbackCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDebugReportCallbackEXT *") long[] pCallback) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugReportCallbackEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pCallback, 1);
            VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo.address());
        }
        return JNI.callPPPPI(instance.address(), pCreateInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pCallback, __functionAddress);
    }
}
