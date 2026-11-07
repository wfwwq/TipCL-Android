package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkRect2D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDiscardRectangles.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDiscardRectangles.class */
public class EXTDiscardRectangles {
    public static final int VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION = 2;
    public static final String VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME = "VK_EXT_discard_rectangles";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT = 1000099000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT = 1000099001;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT = 1000099000;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT = 1000099001;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT = 1000099002;
    public static final int VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = 0;
    public static final int VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = 1;

    protected EXTDiscardRectangles() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, int firstDiscardRectangle, int discardRectangleCount, long pDiscardRectangles) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDiscardRectangleEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), firstDiscardRectangle, discardRectangleCount, pDiscardRectangles, __functionAddress);
    }

    public static void vkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstDiscardRectangle, @NativeType("VkRect2D const *") VkRect2D.Buffer pDiscardRectangles) {
        nvkCmdSetDiscardRectangleEXT(commandBuffer, firstDiscardRectangle, pDiscardRectangles.remaining(), pDiscardRectangles.address());
    }

    public static void vkCmdSetDiscardRectangleEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean discardRectangleEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDiscardRectangleEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), discardRectangleEnable ? 1 : 0, __functionAddress);
    }

    public static void vkCmdSetDiscardRectangleModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkDiscardRectangleModeEXT") int discardRectangleMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDiscardRectangleModeEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), discardRectangleMode, __functionAddress);
    }
}
