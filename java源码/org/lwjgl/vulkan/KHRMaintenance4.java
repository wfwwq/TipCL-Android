package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSparseImageMemoryRequirements2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRMaintenance4.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRMaintenance4.class */
public class KHRMaintenance4 {
    public static final int VK_KHR_MAINTENANCE_4_SPEC_VERSION = 2;
    public static final String VK_KHR_MAINTENANCE_4_EXTENSION_NAME = "VK_KHR_maintenance4";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR = 1000413000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR = 1000413001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR = 1000413002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR = 1000413003;
    public static final int VK_IMAGE_ASPECT_NONE_KHR = 0;

    protected KHRMaintenance4() {
        throw new UnsupportedOperationException();
    }

    public static void nvkGetDeviceBufferMemoryRequirementsKHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceBufferMemoryRequirementsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDeviceBufferMemoryRequirements.validate(pInfo);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetDeviceBufferMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceBufferMemoryRequirements const *") VkDeviceBufferMemoryRequirements pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceBufferMemoryRequirementsKHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static void nvkGetDeviceImageMemoryRequirementsKHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageMemoryRequirementsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDeviceImageMemoryRequirements.validate(pInfo);
        }
        JNI.callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    public static void vkGetDeviceImageMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceImageMemoryRequirementsKHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    public static void nvkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirementsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDeviceImageMemoryRequirements.validate(pInfo);
        }
        JNI.callPPPPV(device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    public static void vkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pSparseMemoryRequirementCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetDeviceImageSparseMemoryRequirementsKHR(device, pInfo.address(), MemoryUtil.memAddress(pSparseMemoryRequirementCount), MemoryUtil.memAddressSafe(pSparseMemoryRequirements));
    }

    public static void vkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirementsKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pSparseMemoryRequirementCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
            VkDeviceImageMemoryRequirements.validate(pInfo.address());
        }
        JNI.callPPPPV(device.address(), pInfo.address(), pSparseMemoryRequirementCount, MemoryUtil.memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }
}
