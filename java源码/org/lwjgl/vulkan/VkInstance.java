package org.lwjgl.vulkan;

import java.nio.IntBuffer;
import java.util.HashSet;
import java.util.Set;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.vulkan.VkExtensionProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInstance.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInstance.class */
public class VkInstance extends DispatchableHandleInstance {
    @Override // org.lwjgl.vulkan.DispatchableHandleInstance
    public /* bridge */ /* synthetic */ VKCapabilitiesInstance getCapabilities() {
        return super.getCapabilities();
    }

    public VkInstance(long handle, VkInstanceCreateInfo ci) {
        super(handle, getInstanceCapabilities(handle, ci));
    }

    private static VKCapabilitiesInstance getInstanceCapabilities(long handle, VkInstanceCreateInfo ci) {
        int iApiVersion;
        VkApplicationInfo appInfo = ci.pApplicationInfo();
        if (appInfo != null && appInfo.apiVersion() != 0) {
            iApiVersion = appInfo.apiVersion();
        } else {
            iApiVersion = VK10.VK_API_VERSION_1_0;
        }
        int apiVersion = iApiVersion;
        return new VKCapabilitiesInstance(functionName -> {
            long address = JNI.callPPP(handle, MemoryUtil.memAddress(functionName), VK.getGlobalCommands().vkGetInstanceProcAddr);
            if (address == 0 && Checks.DEBUG_FUNCTIONS) {
                APIUtil.apiLogMissing("VK instance", functionName);
            }
            return address;
        }, apiVersion, VK.getEnabledExtensionSet(apiVersion, ci.ppEnabledExtensionNames()), getAvailableDeviceExtensions(handle));
    }

    private static Set<String> getAvailableDeviceExtensions(long instance) {
        HashSet<String> extensions = new HashSet<>();
        MemoryStack stack = MemoryStack.stackPush();
        try {
            IntBuffer ip = stack.callocInt(1);
            long GetInstanceProcAddr = VK.getGlobalCommands().vkGetInstanceProcAddr;
            long EnumeratePhysicalDevices = JNI.callPPP(instance, MemoryUtil.memAddress(stack.ASCII("vkEnumeratePhysicalDevices")), GetInstanceProcAddr);
            long EnumerateDeviceExtensionProperties = JNI.callPPP(instance, MemoryUtil.memAddress(stack.ASCII("vkEnumerateDeviceExtensionProperties")), GetInstanceProcAddr);
            if (EnumeratePhysicalDevices != 0 && EnumerateDeviceExtensionProperties != 0) {
                int err = JNI.callPPPI(instance, MemoryUtil.memAddress(ip), 0L, EnumeratePhysicalDevices);
                if (err == 0 && ip.get(0) != 0) {
                    PointerBuffer physicalDevices = stack.mallocPointer(ip.get(0));
                    int err2 = JNI.callPPPI(instance, MemoryUtil.memAddress(ip), MemoryUtil.memAddress(physicalDevices), EnumeratePhysicalDevices);
                    if (err2 == 0) {
                        for (int i = 0; i < physicalDevices.remaining(); i++) {
                            int err3 = JNI.callPPPPI(physicalDevices.get(i), 0L, MemoryUtil.memAddress(ip), 0L, EnumerateDeviceExtensionProperties);
                            if (err3 == 0 && ip.get(0) != 0) {
                                VkExtensionProperties.Buffer deviceExtensions = VkExtensionProperties.malloc(ip.get(0));
                                try {
                                    int err4 = JNI.callPPPPI(physicalDevices.get(i), 0L, MemoryUtil.memAddress(ip), deviceExtensions.address(), EnumerateDeviceExtensionProperties);
                                    if (err4 == 0) {
                                        for (int j = 0; j < deviceExtensions.remaining(); j++) {
                                            extensions.add(deviceExtensions.get(j).extensionNameString());
                                        }
                                        if (deviceExtensions != null) {
                                            deviceExtensions.close();
                                        }
                                    } else if (deviceExtensions != null) {
                                        deviceExtensions.close();
                                    }
                                } finally {
                                }
                            }
                        }
                        if (stack != null) {
                            stack.close();
                        }
                    } else if (stack != null) {
                        stack.close();
                    }
                } else if (stack != null) {
                    stack.close();
                }
            } else if (stack != null) {
                stack.close();
            }
            return extensions;
        } catch (Throwable th) {
            if (stack != null) {
                try {
                    stack.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
