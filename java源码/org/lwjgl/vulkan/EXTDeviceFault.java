package org.lwjgl.vulkan;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDeviceFault.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTDeviceFault.class */
public class EXTDeviceFault {
    public static final int VK_EXT_DEVICE_FAULT_SPEC_VERSION = 2;
    public static final String VK_EXT_DEVICE_FAULT_EXTENSION_NAME = "VK_EXT_device_fault";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT = 1000341000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT = 1000341001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT = 1000341002;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_NONE_EXT = 0;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_READ_INVALID_EXT = 1;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_WRITE_INVALID_EXT = 2;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_EXECUTE_INVALID_EXT = 3;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_UNKNOWN_EXT = 4;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_INVALID_EXT = 5;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_FAULT_EXT = 6;
    public static final int VK_DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT = 1;

    protected EXTDeviceFault() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetDeviceFaultInfoEXT(VkDevice device, long pFaultCounts, long pFaultInfo) {
        long __functionAddress = device.getCapabilities().vkGetDeviceFaultInfoEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pFaultCounts, pFaultInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetDeviceFaultInfoEXT(VkDevice device, @NativeType("VkDeviceFaultCountsEXT *") VkDeviceFaultCountsEXT pFaultCounts, @NativeType("VkDeviceFaultInfoEXT *") VkDeviceFaultInfoEXT pFaultInfo) {
        return nvkGetDeviceFaultInfoEXT(device, pFaultCounts.address(), MemoryUtil.memAddressSafe(pFaultInfo));
    }
}
