package org.lwjgl.vulkan;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTAcquireXlibDisplay.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/EXTAcquireXlibDisplay.class */
public class EXTAcquireXlibDisplay {
    public static final int VK_EXT_ACQUIRE_XLIB_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_xlib_display";

    protected EXTAcquireXlibDisplay() {
        throw new UnsupportedOperationException();
    }

    @NativeType("VkResult")
    public static int vkAcquireXlibDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("Display *") long dpy, @NativeType("VkDisplayKHR") long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkAcquireXlibDisplayEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(dpy);
        }
        return JNI.callPPJI(physicalDevice.address(), dpy, display, __functionAddress);
    }

    public static int nvkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, long dpy, long rrOutput, long pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetRandROutputDisplayEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(dpy);
        }
        return JNI.callPPNPI(physicalDevice.address(), dpy, rrOutput, pDisplay, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("Display *") long dpy, @NativeType("RROutput") long rrOutput, @NativeType("VkDisplayKHR *") LongBuffer pDisplay) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pDisplay, 1);
        }
        return nvkGetRandROutputDisplayEXT(physicalDevice, dpy, rrOutput, MemoryUtil.memAddress(pDisplay));
    }

    @NativeType("VkResult")
    public static int vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("Display *") long dpy, @NativeType("RROutput") long rrOutput, @NativeType("VkDisplayKHR *") long[] pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetRandROutputDisplayEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(dpy);
            Checks.check(pDisplay, 1);
        }
        return JNI.callPPNPI(physicalDevice.address(), dpy, rrOutput, pDisplay, __functionAddress);
    }
}
