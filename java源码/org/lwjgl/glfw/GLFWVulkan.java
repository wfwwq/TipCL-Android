package org.lwjgl.glfw;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Platform;
import org.lwjgl.system.SharedLibrary;
import org.lwjgl.vulkan.EXTMetalSurface;
import org.lwjgl.vulkan.KHRAndroidSurface;
import org.lwjgl.vulkan.KHRSurface;
import org.lwjgl.vulkan.VK;
import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VkAllocationCallbacks;
import org.lwjgl.vulkan.VkAndroidSurfaceCreateInfoKHR;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkMetalSurfaceCreateInfoEXT;
import org.lwjgl.vulkan.VkPhysicalDevice;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWVulkan.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWVulkan.class */
public class GLFWVulkan {

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWVulkan$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWVulkan$Functions.class */
    public static final class Functions {
        public static final long InitVulkanLoader = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "pojavInitVulkanLoader");
        public static final long VulkanSupported = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "pojavVulkanSupported");
        public static final long GetRequiredInstanceExtensions = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "pojavGetRequiredInstanceExtensions");
        public static final long GetInstanceProcAddress = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "pojavGetInstanceProcAddress");
        public static final long GetPhysicalDevicePresentationSupport = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "pojavGetPhysicalDevicePresentationSupport");
        public static final long CreateWindowSurface = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "pojavCreateWindowSurface");

        private Functions() {
        }
    }

    static {
        if (Platform.get() == Platform.MACOSX) {
            setPath(VK.getFunctionProvider());
        }
    }

    protected GLFWVulkan() {
        throw new UnsupportedOperationException();
    }

    public static void glfwInitVulkanLoader(@NativeType("PFN_vkGetInstanceProcAddr") long loader) {
    }

    @NativeType("int")
    public static boolean glfwVulkanSupported() {
        return true;
    }

    @NativeType("char const **")
    public static PointerBuffer glfwGetRequiredInstanceExtensions() {
        String platformSurface;
        MemoryStack stack = MemoryStack.stackPush();
        if (Platform.get() == Platform.MACOSX) {
            platformSurface = EXTMetalSurface.VK_EXT_METAL_SURFACE_EXTENSION_NAME;
        } else {
            platformSurface = KHRAndroidSurface.VK_KHR_ANDROID_SURFACE_EXTENSION_NAME;
        }
        return stack.pointers(stack.UTF8(KHRSurface.VK_KHR_SURFACE_EXTENSION_NAME), stack.UTF8(platformSurface));
    }

    @NativeType("GLFWvkproc")
    public static long glfwGetInstanceProcAddress(@NativeType("VkInstance") VkInstance instance, @NativeType("char const *") ByteBuffer procname) {
        if (Checks.CHECKS) {
            Checks.checkNT1(procname);
        }
        return VK10.vkGetInstanceProcAddr(instance, procname);
    }

    @NativeType("GLFWvkproc")
    public static long glfwGetInstanceProcAddress(VkInstance instance, @NativeType("char const *") CharSequence procname) {
        return VK10.vkGetInstanceProcAddr(instance, procname);
    }

    @NativeType("int")
    public static boolean glfwGetPhysicalDevicePresentationSupport(VkInstance instance, VkPhysicalDevice device, @NativeType("uint32_t") int queuefamily) {
        return true;
    }

    @NativeType("VkResult")
    public static int glfwCreateWindowSurface(VkInstance instance, @NativeType("GLFWwindow *") long window, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks allocator, @NativeType("VkSurfaceKHR *") LongBuffer surface) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) surface, 1);
        }
        if (Platform.get() == Platform.MACOSX) {
            VkMetalSurfaceCreateInfoEXT pCreateInfo = VkMetalSurfaceCreateInfoEXT.calloc().sType(EXTMetalSurface.VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT).pLayer(PointerBuffer.create(window, 1));
            return EXTMetalSurface.vkCreateMetalSurfaceEXT(instance, pCreateInfo, (VkAllocationCallbacks) null, surface);
        }
        if (Platform.get() == Platform.LINUX) {
            VkAndroidSurfaceCreateInfoKHR pCreateInfo2 = VkAndroidSurfaceCreateInfoKHR.calloc().sType(KHRAndroidSurface.VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR).window(window);
            return KHRAndroidSurface.vkCreateAndroidSurfaceKHR(instance, pCreateInfo2, (VkAllocationCallbacks) null, surface);
        }
        return -7;
    }

    @NativeType("VkResult")
    public static int glfwCreateWindowSurface(VkInstance instance, @NativeType("GLFWwindow *") long window, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks allocator, @NativeType("VkSurfaceKHR *") long[] surface) {
        MemoryStack stack = MemoryStack.stackGet();
        LongBuffer pSurface = stack.mallocLong(1);
        int result = glfwCreateWindowSurface(instance, window, allocator, pSurface);
        surface[0] = pSurface.get(0);
        return result;
    }

    public static void setPath(FunctionProvider sharedLibrary) {
        if (!(sharedLibrary instanceof SharedLibrary)) {
            APIUtil.apiLog("GLFW Vulkan path override not set: function provider is not a shared library.");
            return;
        }
        String path = ((SharedLibrary) sharedLibrary).getPath();
        if (path == null) {
            APIUtil.apiLog("GLFW Vulkan path override not set: Could not resolve the shared library path.");
        } else {
            setPath(path);
        }
    }

    public static void setPath(String path) {
        long override = GLFW.getLibrary().getFunctionAddress("_glfw_vulkan_library");
        if (override == 0) {
            APIUtil.apiLog("GLFW Vulkan path override not set: Could not resolve override symbol.");
            return;
        }
        long a = MemoryUtil.memGetAddress(override);
        if (a != 0) {
            MemoryUtil.nmemFree(a);
        }
        MemoryUtil.memPutAddress(override, path == null ? 0L : MemoryUtil.memAddress(MemoryUtil.memUTF8(path)));
    }
}
