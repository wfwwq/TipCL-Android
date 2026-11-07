package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRLineRasterization.class */
public class KHRLineRasterization {
    public static final int VK_KHR_LINE_RASTERIZATION_SPEC_VERSION = 1;
    public static final String VK_KHR_LINE_RASTERIZATION_EXTENSION_NAME = "VK_KHR_line_rasterization";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR = 1000259000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR = 1000259001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_KHR = 1000259002;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE_KHR = 1000259000;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR = 3;

    protected KHRLineRasterization() {
        throw new UnsupportedOperationException();
    }

    public static void vkCmdSetLineStippleKHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int lineStippleFactor, @NativeType("uint16_t") short lineStipplePattern) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStippleKHR;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPCV(commandBuffer.address(), lineStippleFactor, lineStipplePattern, __functionAddress);
    }
}
