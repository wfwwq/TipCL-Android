package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTLineRasterization.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTLineRasterization.class */
public class EXTLineRasterization {
    public static final int VK_EXT_LINE_RASTERIZATION_SPEC_VERSION = 1;
    public static final String VK_EXT_LINE_RASTERIZATION_EXTENSION_NAME = "VK_EXT_line_rasterization";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT = 1000259000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT = 1000259001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_EXT = 1000259002;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE_EXT = 1000259000;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT_EXT = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_EXT = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT = 3;

    protected EXTLineRasterization() {
        throw new UnsupportedOperationException();
    }

    public static void vkCmdSetLineStippleEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int lineStippleFactor, @NativeType("uint16_t") short lineStipplePattern) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStippleEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPCV(commandBuffer.address(), lineStippleFactor, lineStipplePattern, __functionAddress);
    }
}
