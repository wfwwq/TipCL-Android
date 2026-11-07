package org.lwjgl.vulkan;

import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkHdrMetadataEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTHdrMetadata.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTHdrMetadata.class */
public class EXTHdrMetadata {
    public static final int VK_EXT_HDR_METADATA_SPEC_VERSION = 3;
    public static final String VK_EXT_HDR_METADATA_EXTENSION_NAME = "VK_EXT_hdr_metadata";
    public static final int VK_STRUCTURE_TYPE_HDR_METADATA_EXT = 1000105000;

    protected EXTHdrMetadata() {
        throw new UnsupportedOperationException();
    }

    public static void nvkSetHdrMetadataEXT(VkDevice device, int swapchainCount, long pSwapchains, long pMetadata) {
        long __functionAddress = device.getCapabilities().vkSetHdrMetadataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPPV(device.address(), swapchainCount, pSwapchains, pMetadata, __functionAddress);
    }

    public static void vkSetHdrMetadataEXT(VkDevice device, @NativeType("VkSwapchainKHR const *") LongBuffer pSwapchains, @NativeType("VkHdrMetadataEXT const *") VkHdrMetadataEXT.Buffer pMetadata) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pMetadata, pSwapchains.remaining());
        }
        nvkSetHdrMetadataEXT(device, pSwapchains.remaining(), MemoryUtil.memAddress(pSwapchains), pMetadata.address());
    }

    public static void vkSetHdrMetadataEXT(VkDevice device, @NativeType("VkSwapchainKHR const *") long[] pSwapchains, @NativeType("VkHdrMetadataEXT const *") VkHdrMetadataEXT.Buffer pMetadata) {
        long __functionAddress = device.getCapabilities().vkSetHdrMetadataEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check((CustomBuffer<?>) pMetadata, pSwapchains.length);
        }
        JNI.callPPPV(device.address(), pSwapchains.length, pSwapchains, pMetadata.address(), __functionAddress);
    }
}
