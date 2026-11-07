package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTShaderModuleIdentifier.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTShaderModuleIdentifier.class */
public class EXTShaderModuleIdentifier {
    public static final int VK_EXT_SHADER_MODULE_IDENTIFIER_SPEC_VERSION = 1;
    public static final String VK_EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME = "VK_EXT_shader_module_identifier";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT = 1000462000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT = 1000462001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT = 1000462002;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT = 1000462003;
    public static final int VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT = 32;

    protected EXTShaderModuleIdentifier() {
        throw new UnsupportedOperationException();
    }

    public static void nvkGetShaderModuleIdentifierEXT(VkDevice device, long shaderModule, long pIdentifier) {
        long __functionAddress = device.getCapabilities().vkGetShaderModuleIdentifierEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPJPV(device.address(), shaderModule, pIdentifier, __functionAddress);
    }

    public static void vkGetShaderModuleIdentifierEXT(VkDevice device, @NativeType("VkShaderModule") long shaderModule, @NativeType("VkShaderModuleIdentifierEXT *") VkShaderModuleIdentifierEXT pIdentifier) {
        nvkGetShaderModuleIdentifierEXT(device, shaderModule, pIdentifier.address());
    }

    public static void nvkGetShaderModuleCreateInfoIdentifierEXT(VkDevice device, long pCreateInfo, long pIdentifier) {
        long __functionAddress = device.getCapabilities().vkGetShaderModuleCreateInfoIdentifierEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkShaderModuleCreateInfo.validate(pCreateInfo);
        }
        JNI.callPPPV(device.address(), pCreateInfo, pIdentifier, __functionAddress);
    }

    public static void vkGetShaderModuleCreateInfoIdentifierEXT(VkDevice device, @NativeType("VkShaderModuleCreateInfo const *") VkShaderModuleCreateInfo pCreateInfo, @NativeType("VkShaderModuleIdentifierEXT *") VkShaderModuleIdentifierEXT pIdentifier) {
        nvkGetShaderModuleCreateInfoIdentifierEXT(device, pCreateInfo.address(), pIdentifier.address());
    }
}
