package org.lwjgl.vulkan;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTColorWriteEnable.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTColorWriteEnable.class */
public class EXTColorWriteEnable {
    public static final int VK_EXT_COLOR_WRITE_ENABLE_SPEC_VERSION = 1;
    public static final String VK_EXT_COLOR_WRITE_ENABLE_EXTENSION_NAME = "VK_EXT_color_write_enable";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT = 1000381000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT = 1000381001;
    public static final int VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT = 1000381000;

    protected EXTColorWriteEnable() {
        throw new UnsupportedOperationException();
    }

    public static void nvkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, int attachmentCount, long pColorWriteEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), attachmentCount, pColorWriteEnables, __functionAddress);
    }

    public static void vkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32 const *") IntBuffer pColorWriteEnables) {
        nvkCmdSetColorWriteEnableEXT(commandBuffer, pColorWriteEnables.remaining(), MemoryUtil.memAddress(pColorWriteEnables));
    }

    public static void vkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32 const *") int[] pColorWriteEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteEnableEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(commandBuffer.address(), pColorWriteEnables.length, pColorWriteEnables, __functionAddress);
    }
}
