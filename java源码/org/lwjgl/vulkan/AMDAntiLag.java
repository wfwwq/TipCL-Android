package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/AMDAntiLag.class */
public class AMDAntiLag {
    public static final int VK_AMD_ANTI_LAG_SPEC_VERSION = 1;
    public static final String VK_AMD_ANTI_LAG_EXTENSION_NAME = "VK_AMD_anti_lag";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD = 1000476000;
    public static final int VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD = 1000476001;
    public static final int VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD = 1000476002;
    public static final int VK_ANTI_LAG_MODE_DRIVER_CONTROL_AMD = 0;
    public static final int VK_ANTI_LAG_MODE_ON_AMD = 1;
    public static final int VK_ANTI_LAG_MODE_OFF_AMD = 2;
    public static final int VK_ANTI_LAG_STAGE_INPUT_AMD = 0;
    public static final int VK_ANTI_LAG_STAGE_PRESENT_AMD = 1;

    protected AMDAntiLag() {
        throw new UnsupportedOperationException();
    }

    public static void nvkAntiLagUpdateAMD(VkDevice device, long pData) {
        long __functionAddress = device.getCapabilities().vkAntiLagUpdateAMD;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(device.address(), pData, __functionAddress);
    }

    public static void vkAntiLagUpdateAMD(VkDevice device, @NativeType("VkAntiLagDataAMD const *") VkAntiLagDataAMD pData) {
        nvkAntiLagUpdateAMD(device, pData.address());
    }
}
