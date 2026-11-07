package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTMetalObjects.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTMetalObjects.class */
public class EXTMetalObjects {
    public static final int VK_EXT_METAL_OBJECTS_SPEC_VERSION = 2;
    public static final String VK_EXT_METAL_OBJECTS_EXTENSION_NAME = "VK_EXT_metal_objects";
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT = 1000311000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT = 1000311001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT = 1000311002;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT = 1000311003;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT = 1000311004;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT = 1000311005;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT = 1000311006;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT = 1000311007;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT = 1000311008;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT = 1000311009;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT = 1000311010;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT = 1000311011;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT = 1;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT = 2;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT = 4;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT = 8;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT = 16;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT = 32;

    protected EXTMetalObjects() {
        throw new UnsupportedOperationException();
    }

    public static void nvkExportMetalObjectsEXT(VkDevice device, long pMetalObjectsInfo) {
        long __functionAddress = device.getCapabilities().vkExportMetalObjectsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(device.address(), pMetalObjectsInfo, __functionAddress);
    }

    public static void vkExportMetalObjectsEXT(VkDevice device, @NativeType("VkExportMetalObjectsInfoEXT *") VkExportMetalObjectsInfoEXT pMetalObjectsInfo) {
        nvkExportMetalObjectsEXT(device, pMetalObjectsInfo.address());
    }
}
