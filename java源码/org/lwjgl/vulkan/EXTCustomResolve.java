package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTCustomResolve.class */
public class EXTCustomResolve {
    public static final int VK_EXT_CUSTOM_RESOLVE_SPEC_VERSION = 1;
    public static final String VK_EXT_CUSTOM_RESOLVE_EXTENSION_NAME = "VK_EXT_custom_resolve";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT = 1000628000;
    public static final int VK_STRUCTURE_TYPE_BEGIN_CUSTOM_RESOLVE_INFO_EXT = 1000628001;
    public static final int VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT = 1000628002;
    public static final int VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_EXT = 4;
    public static final int VK_SUBPASS_DESCRIPTION_CUSTOM_RESOLVE_BIT_EXT = 8;
    public static final int VK_RENDERING_FRAGMENT_REGION_BIT_EXT = 64;
    public static final int VK_RENDERING_CUSTOM_RESOLVE_BIT_EXT = 128;
    public static final int VK_RESOLVE_MODE_CUSTOM_BIT_EXT = 32;

    protected EXTCustomResolve() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdBeginCustomResolveEXT(VkCommandBuffer commandBuffer, long pBeginCustomResolveInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginCustomResolveEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pBeginCustomResolveInfo, __functionAddress);
    }

    public static void vkCmdBeginCustomResolveEXT(VkCommandBuffer commandBuffer, @NativeType("VkBeginCustomResolveInfoEXT const *") VkBeginCustomResolveInfoEXT pBeginCustomResolveInfo) {
        nvkCmdBeginCustomResolveEXT(commandBuffer, MemoryUtil.memAddressSafe(pBeginCustomResolveInfo));
    }
}
