package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/INTELPerformanceQuery.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/INTELPerformanceQuery.class */
public class INTELPerformanceQuery {
    public static final int VK_INTEL_PERFORMANCE_QUERY_SPEC_VERSION = 2;
    public static final String VK_INTEL_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_INTEL_performance_query";
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL = 1000210000;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL = 1000210000;
    public static final int VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL = 1000210001;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL = 1000210002;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL = 1000210003;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL = 1000210004;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL = 1000210005;
    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL = 1000210000;
    public static final int VK_OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL = 1000210000;
    public static final int VK_PERFORMANCE_CONFIGURATION_TYPE_COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED_INTEL = 0;
    public static final int VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL = 0;
    public static final int VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL = 0;
    public static final int VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL = 1;
    public static final int VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL = 0;
    public static final int VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL = 1;
    public static final int VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL = 0;
    public static final int VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL = 1;
    public static final int VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL = 2;
    public static final int VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL = 3;
    public static final int VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL = 4;

    protected INTELPerformanceQuery() {
        throw new UnsupportedOperationException();
    }

    public static int nvkInitializePerformanceApiINTEL(VkDevice device, long pInitializeInfo) {
        long __functionAddress = device.getCapabilities().vkInitializePerformanceApiINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), pInitializeInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkInitializePerformanceApiINTEL(VkDevice device, @NativeType("VkInitializePerformanceApiInfoINTEL const *") VkInitializePerformanceApiInfoINTEL pInitializeInfo) {
        return nvkInitializePerformanceApiINTEL(device, pInitializeInfo.address());
    }

    public static void vkUninitializePerformanceApiINTEL(VkDevice device) {
        long __functionAddress = device.getCapabilities().vkUninitializePerformanceApiINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(device.address(), __functionAddress);
    }

    public static int nvkCmdSetPerformanceMarkerINTEL(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPerformanceMarkerINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCmdSetPerformanceMarkerINTEL(VkCommandBuffer commandBuffer, @NativeType("VkPerformanceMarkerInfoINTEL const *") VkPerformanceMarkerInfoINTEL pMarkerInfo) {
        return nvkCmdSetPerformanceMarkerINTEL(commandBuffer, pMarkerInfo.address());
    }

    public static int nvkCmdSetPerformanceStreamMarkerINTEL(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPerformanceStreamMarkerINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCmdSetPerformanceStreamMarkerINTEL(VkCommandBuffer commandBuffer, @NativeType("VkPerformanceStreamMarkerInfoINTEL const *") VkPerformanceStreamMarkerInfoINTEL pMarkerInfo) {
        return nvkCmdSetPerformanceStreamMarkerINTEL(commandBuffer, pMarkerInfo.address());
    }

    public static int nvkCmdSetPerformanceOverrideINTEL(VkCommandBuffer commandBuffer, long pOverrideInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPerformanceOverrideINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(commandBuffer.address(), pOverrideInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCmdSetPerformanceOverrideINTEL(VkCommandBuffer commandBuffer, @NativeType("VkPerformanceOverrideInfoINTEL const *") VkPerformanceOverrideInfoINTEL pOverrideInfo) {
        return nvkCmdSetPerformanceOverrideINTEL(commandBuffer, pOverrideInfo.address());
    }

    public static int nvkAcquirePerformanceConfigurationINTEL(VkDevice device, long pAcquireInfo, long pConfiguration) {
        long __functionAddress = device.getCapabilities().vkAcquirePerformanceConfigurationINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPPI(device.address(), pAcquireInfo, pConfiguration, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkAcquirePerformanceConfigurationINTEL(VkDevice device, @NativeType("VkPerformanceConfigurationAcquireInfoINTEL const *") VkPerformanceConfigurationAcquireInfoINTEL pAcquireInfo, @NativeType("VkPerformanceConfigurationINTEL *") LongBuffer pConfiguration) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pConfiguration, 1);
        }
        return nvkAcquirePerformanceConfigurationINTEL(device, pAcquireInfo.address(), MemoryUtil.memAddress(pConfiguration));
    }

    @NativeType("VkResult")
    public static int vkReleasePerformanceConfigurationINTEL(VkDevice device, @NativeType("VkPerformanceConfigurationINTEL") long configuration) {
        long __functionAddress = device.getCapabilities().vkReleasePerformanceConfigurationINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(device.address(), configuration, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkQueueSetPerformanceConfigurationINTEL(VkQueue queue, @NativeType("VkPerformanceConfigurationINTEL") long configuration) {
        long __functionAddress = queue.getCapabilities().vkQueueSetPerformanceConfigurationINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJI(queue.address(), configuration, __functionAddress);
    }

    public static int nvkGetPerformanceParameterINTEL(VkDevice device, int parameter, long pValue) {
        long __functionAddress = device.getCapabilities().vkGetPerformanceParameterINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPPI(device.address(), parameter, pValue, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetPerformanceParameterINTEL(VkDevice device, @NativeType("VkPerformanceParameterTypeINTEL") int parameter, @NativeType("VkPerformanceValueINTEL *") VkPerformanceValueINTEL pValue) {
        return nvkGetPerformanceParameterINTEL(device, parameter, pValue.address());
    }

    @NativeType("VkResult")
    public static int vkAcquirePerformanceConfigurationINTEL(VkDevice device, @NativeType("VkPerformanceConfigurationAcquireInfoINTEL const *") VkPerformanceConfigurationAcquireInfoINTEL pAcquireInfo, @NativeType("VkPerformanceConfigurationINTEL *") long[] pConfiguration) {
        long __functionAddress = device.getCapabilities().vkAcquirePerformanceConfigurationINTEL;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pConfiguration, 1);
        }
        return JNI.callPPPI(device.address(), pAcquireInfo.address(), pConfiguration, __functionAddress);
    }
}
