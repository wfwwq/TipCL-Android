package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDebugMarker.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDebugMarker.class */
public class EXTDebugMarker {
    public static final int VK_EXT_DEBUG_MARKER_SPEC_VERSION = 4;
    public static final String VK_EXT_DEBUG_MARKER_EXTENSION_NAME = "VK_EXT_debug_marker";
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = 1000022000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT = 1000022001;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT = 1000022002;

    protected EXTDebugMarker() {
        throw new UnsupportedOperationException();
    }

    public static int nvkDebugMarkerSetObjectTagEXT(VkDevice device, long pTagInfo) {
        long __functionAddress = device.getCapabilities().vkDebugMarkerSetObjectTagEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugMarkerObjectTagInfoEXT.validate(pTagInfo);
        }
        return JNI.callPPI(device.address(), pTagInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkDebugMarkerSetObjectTagEXT(VkDevice device, @NativeType("VkDebugMarkerObjectTagInfoEXT const *") VkDebugMarkerObjectTagInfoEXT pTagInfo) {
        return nvkDebugMarkerSetObjectTagEXT(device, pTagInfo.address());
    }

    public static int nvkDebugMarkerSetObjectNameEXT(VkDevice device, long pNameInfo) {
        long __functionAddress = device.getCapabilities().vkDebugMarkerSetObjectNameEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugMarkerObjectNameInfoEXT.validate(pNameInfo);
        }
        return JNI.callPPI(device.address(), pNameInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkDebugMarkerSetObjectNameEXT(VkDevice device, @NativeType("VkDebugMarkerObjectNameInfoEXT const *") VkDebugMarkerObjectNameInfoEXT pNameInfo) {
        return nvkDebugMarkerSetObjectNameEXT(device, pNameInfo.address());
    }

    public static void nvkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerBeginEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugMarkerMarkerInfoEXT.validate(pMarkerInfo);
        }
        JNI.callPPV(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    public static void vkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugMarkerMarkerInfoEXT const *") VkDebugMarkerMarkerInfoEXT pMarkerInfo) {
        nvkCmdDebugMarkerBeginEXT(commandBuffer, pMarkerInfo.address());
    }

    public static void vkCmdDebugMarkerEndEXT(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerEndEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(commandBuffer.address(), __functionAddress);
    }

    public static void nvkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerInsertEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkDebugMarkerMarkerInfoEXT.validate(pMarkerInfo);
        }
        JNI.callPPV(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    public static void vkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugMarkerMarkerInfoEXT const *") VkDebugMarkerMarkerInfoEXT pMarkerInfo) {
        nvkCmdDebugMarkerInsertEXT(commandBuffer, pMarkerInfo.address());
    }
}
