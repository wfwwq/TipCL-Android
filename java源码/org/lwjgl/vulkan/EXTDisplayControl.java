package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDisplayControl.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDisplayControl.class */
public class EXTDisplayControl {
    public static final int VK_EXT_DISPLAY_CONTROL_SPEC_VERSION = 1;
    public static final String VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME = "VK_EXT_display_control";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT = 1000091000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT = 1000091001;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT = 1000091002;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT = 1000091003;
    public static final int VK_DISPLAY_POWER_STATE_OFF_EXT = 0;
    public static final int VK_DISPLAY_POWER_STATE_SUSPEND_EXT = 1;
    public static final int VK_DISPLAY_POWER_STATE_ON_EXT = 2;
    public static final int VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = 0;
    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0;

    protected EXTDisplayControl() {
        throw new UnsupportedOperationException();
    }

    public static int nvkDisplayPowerControlEXT(VkDevice device, long display, long pDisplayPowerInfo) {
        long __functionAddress = device.getCapabilities().vkDisplayPowerControlEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), display, pDisplayPowerInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkDisplayPowerControlEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayPowerInfoEXT const *") VkDisplayPowerInfoEXT pDisplayPowerInfo) {
        return nvkDisplayPowerControlEXT(device, display, pDisplayPowerInfo.address());
    }

    public static int nvkRegisterDeviceEventEXT(VkDevice device, long pDeviceEventInfo, long pAllocator, long pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDeviceEventEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPPI(device.address(), pDeviceEventInfo, pAllocator, pFence, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkRegisterDeviceEventEXT(VkDevice device, @NativeType("VkDeviceEventInfoEXT const *") VkDeviceEventInfoEXT pDeviceEventInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") LongBuffer pFence) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFence, 1);
        }
        return nvkRegisterDeviceEventEXT(device, pDeviceEventInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pFence));
    }

    public static int nvkRegisterDisplayEventEXT(VkDevice device, long display, long pDisplayEventInfo, long pAllocator, long pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDisplayEventEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPPI(device.address(), display, pDisplayEventInfo, pAllocator, pFence, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkRegisterDisplayEventEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayEventInfoEXT const *") VkDisplayEventInfoEXT pDisplayEventInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") LongBuffer pFence) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pFence, 1);
        }
        return nvkRegisterDisplayEventEXT(device, display, pDisplayEventInfo.address(), MemoryUtil.memAddressSafe(pAllocator), MemoryUtil.memAddress(pFence));
    }

    public static int nvkGetSwapchainCounterEXT(VkDevice device, long swapchain, int counter, long pCounterValue) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainCounterEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPI(device.address(), swapchain, counter, pCounterValue, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSwapchainCounterEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSurfaceCounterFlagBitsEXT") int counter, @NativeType("uint64_t *") LongBuffer pCounterValue) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pCounterValue, 1);
        }
        return nvkGetSwapchainCounterEXT(device, swapchain, counter, MemoryUtil.memAddress(pCounterValue));
    }

    @NativeType("VkResult")
    public static int vkRegisterDeviceEventEXT(VkDevice device, @NativeType("VkDeviceEventInfoEXT const *") VkDeviceEventInfoEXT pDeviceEventInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") long[] pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDeviceEventEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pFence, 1);
        }
        return JNI.callPPPPI(device.address(), pDeviceEventInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pFence, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkRegisterDisplayEventEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayEventInfoEXT const *") VkDisplayEventInfoEXT pDisplayEventInfo, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") long[] pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDisplayEventEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pFence, 1);
        }
        return JNI.callPJPPPI(device.address(), display, pDisplayEventInfo.address(), MemoryUtil.memAddressSafe(pAllocator), pFence, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetSwapchainCounterEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSurfaceCounterFlagBitsEXT") int counter, @NativeType("uint64_t *") long[] pCounterValue) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainCounterEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pCounterValue, 1);
        }
        return JNI.callPJPI(device.address(), swapchain, counter, pCounterValue, __functionAddress);
    }
}
