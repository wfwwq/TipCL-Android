package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkTilePropertiesQCOM;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/QCOMTileProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/QCOMTileProperties.class */
public class QCOMTileProperties {
    public static final int VK_QCOM_TILE_PROPERTIES_SPEC_VERSION = 1;
    public static final String VK_QCOM_TILE_PROPERTIES_EXTENSION_NAME = "VK_QCOM_tile_properties";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM = 1000484000;
    public static final int VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM = 1000484001;

    protected QCOMTileProperties() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetFramebufferTilePropertiesQCOM(VkDevice device, long framebuffer, long pPropertiesCount, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetFramebufferTilePropertiesQCOM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), framebuffer, pPropertiesCount, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetFramebufferTilePropertiesQCOM(VkDevice device, @NativeType("VkFramebuffer") long framebuffer, @NativeType("uint32_t *") IntBuffer pPropertiesCount, @NativeType("VkTilePropertiesQCOM *") VkTilePropertiesQCOM.Buffer pProperties) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pPropertiesCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertiesCount.get(pPropertiesCount.position()));
        }
        return nvkGetFramebufferTilePropertiesQCOM(device, framebuffer, MemoryUtil.memAddress(pPropertiesCount), MemoryUtil.memAddressSafe(pProperties));
    }

    public static int nvkGetDynamicRenderingTilePropertiesQCOM(VkDevice device, long pRenderingInfo, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetDynamicRenderingTilePropertiesQCOM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            VkRenderingInfo.validate(pRenderingInfo);
        }
        return JNI.callPPPI(device.address(), pRenderingInfo, pProperties, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDynamicRenderingTilePropertiesQCOM(VkDevice device, @NativeType("VkRenderingInfo const *") VkRenderingInfo pRenderingInfo, @NativeType("VkTilePropertiesQCOM *") VkTilePropertiesQCOM pProperties) {
        return nvkGetDynamicRenderingTilePropertiesQCOM(device, pRenderingInfo.address(), pProperties.address());
    }

    @NativeType("VkResult")
    public static int vkGetFramebufferTilePropertiesQCOM(VkDevice device, @NativeType("VkFramebuffer") long framebuffer, @NativeType("uint32_t *") int[] pPropertiesCount, @NativeType("VkTilePropertiesQCOM *") VkTilePropertiesQCOM.Buffer pProperties) {
        long __functionAddress = device.getCapabilities().vkGetFramebufferTilePropertiesQCOM;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pPropertiesCount, 1);
            Checks.checkSafe((CustomBuffer<?>) pProperties, pPropertiesCount[0]);
        }
        return JNI.callPJPPI(device.address(), framebuffer, pPropertiesCount, MemoryUtil.memAddressSafe(pProperties), __functionAddress);
    }
}
