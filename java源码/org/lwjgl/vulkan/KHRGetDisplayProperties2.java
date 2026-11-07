package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDisplayModeProperties2KHR;
import org.lwjgl.vulkan.VkDisplayPlaneProperties2KHR;
import org.lwjgl.vulkan.VkDisplayProperties2KHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRGetDisplayProperties2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRGetDisplayProperties2.class */
public class KHRGetDisplayProperties2 {
    public static final int VK_KHR_GET_DISPLAY_PROPERTIES_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_display_properties2";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR = 1000121000;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR = 1000121001;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR = 1000121002;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR = 1000121003;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR = 1000121004;

    protected KHRGetDisplayProperties2() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayProperties2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayProperties2KHR *") VkDisplayProperties2KHR.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayProperties2KHR(physicalDevice, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayPlaneProperties2KHR *") VkDisplayPlaneProperties2KHR.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayPlaneProperties2KHR(physicalDevice, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, long display, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModeProperties2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(physicalDevice.address(), display, pPropertyCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayModeProperties2KHR *") VkDisplayModeProperties2KHR.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetDisplayModeProperties2KHR(physicalDevice, display, MemoryUtil.memAddress(pPropertyCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkGetDisplayPlaneCapabilities2KHR(VkPhysicalDevice physicalDevice, long pDisplayPlaneInfo, long pCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneCapabilities2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(physicalDevice.address(), pDisplayPlaneInfo, pCapabilities, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDisplayPlaneCapabilities2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayPlaneInfo2KHR const *") VkDisplayPlaneInfo2KHR pDisplayPlaneInfo, @NativeType("VkDisplayPlaneCapabilities2KHR *") VkDisplayPlaneCapabilities2KHR pCapabilities) {
        return nvkGetDisplayPlaneCapabilities2KHR(physicalDevice, pDisplayPlaneInfo.address(), pCapabilities.address());
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayProperties2KHR *") VkDisplayProperties2KHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayProperties2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayPlaneProperties2KHR *") VkDisplayPlaneProperties2KHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPPPI(physicalDevice.address(), pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayModeProperties2KHR *") VkDisplayModeProperties2KHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModeProperties2KHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertyCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertyCount[0]);
        }
        return JNI.callPJPPI(physicalDevice.address(), display, pPropertyCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }
}
