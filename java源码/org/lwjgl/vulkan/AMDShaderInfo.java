package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/AMDShaderInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/AMDShaderInfo.class */
public class AMDShaderInfo {
    public static final int VK_AMD_SHADER_INFO_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_INFO_EXTENSION_NAME = "VK_AMD_shader_info";
    public static final int VK_SHADER_INFO_TYPE_STATISTICS_AMD = 0;
    public static final int VK_SHADER_INFO_TYPE_BINARY_AMD = 1;
    public static final int VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = 2;

    protected AMDShaderInfo() {
        throw new UnsupportedOperationException();
    }

    public static int nvkGetShaderInfoAMD(VkDevice device, long pipeline, int shaderStage, int infoType, long pInfoSize, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetShaderInfoAMD;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callPJPPI(device.address(), pipeline, shaderStage, infoType, pInfoSize, pInfo, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetShaderInfoAMD(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("VkShaderStageFlagBits") int shaderStage, @NativeType("VkShaderInfoTypeAMD") int infoType, @NativeType("size_t *") PointerBuffer pInfoSize, @NativeType("void *") ByteBuffer pInfo) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pInfoSize, 1);
            Checks.checkSafe(pInfo, pInfoSize.get(pInfoSize.position()));
        }
        return nvkGetShaderInfoAMD(device, pipeline, shaderStage, infoType, MemoryUtil.memAddress(pInfoSize), MemoryUtil.memAddressSafe(pInfo));
    }
}
