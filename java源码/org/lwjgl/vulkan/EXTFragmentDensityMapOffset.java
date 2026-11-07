package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTFragmentDensityMapOffset.class */
public class EXTFragmentDensityMapOffset {
    public static final int VK_EXT_FRAGMENT_DENSITY_MAP_OFFSET_SPEC_VERSION = 1;
    public static final String VK_EXT_FRAGMENT_DENSITY_MAP_OFFSET_EXTENSION_NAME = "VK_EXT_fragment_density_map_offset";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT = 1000425000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT = 1000425001;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT = 1000425002;
    public static final int VK_STRUCTURE_TYPE_RENDERING_END_INFO_EXT = 1000619003;
    public static final int VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_EXT = 32768;

    protected EXTFragmentDensityMapOffset() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdEndRendering2EXT(VkCommandBuffer commandBuffer, long pRenderingEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRendering2EXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pRenderingEndInfo, __functionAddress);
    }

    public static void vkCmdEndRendering2EXT(VkCommandBuffer commandBuffer, @NativeType("VkRenderingEndInfoKHR const *") VkRenderingEndInfoKHR pRenderingEndInfo) {
        nvkCmdEndRendering2EXT(commandBuffer, MemoryUtil.memAddressSafe(pRenderingEndInfo));
    }
}
