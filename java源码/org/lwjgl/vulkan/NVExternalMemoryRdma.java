package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVExternalMemoryRdma.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/NVExternalMemoryRdma.class */
public class NVExternalMemoryRdma {
    public static final int VK_NV_EXTERNAL_MEMORY_RDMA_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_RDMA_EXTENSION_NAME = "VK_NV_external_memory_rdma";
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV = 1000371000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV = 1000371001;
    public static final int VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV = 256;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV = 4096;

    protected NVExternalMemoryRdma() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetMemoryRemoteAddressNV(VkDevice device, long pMemoryGetRemoteAddressInfo, long pAddress) {
        long __functionAddress = device.getCapabilities().vkGetMemoryRemoteAddressNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pMemoryGetRemoteAddressInfo, pAddress, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetMemoryRemoteAddressNV(VkDevice device, @NativeType("VkMemoryGetRemoteAddressInfoNV const *") VkMemoryGetRemoteAddressInfoNV pMemoryGetRemoteAddressInfo, @NativeType("VkRemoteAddressNV *") PointerBuffer pAddress) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pAddress, 1);
        }
        return nvkGetMemoryRemoteAddressNV(device, pMemoryGetRemoteAddressInfo.address(), MemoryUtil.memAddress(pAddress));
    }
}
