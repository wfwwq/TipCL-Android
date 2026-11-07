package org.lwjgl.vulkan;

import java.nio.IntBuffer;
import java.util.HashSet;
import java.util.Set;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Platform;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK.class */
public final class VK {
    private static FunctionProvider functionProvider;
    private static GlobalCommands globalCommands;

    public static native long getVulkanDriverHandle();

    public static native void updateFps();

    static {
        try {
            System.loadLibrary("pojavexec");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        if (!Configuration.VULKAN_EXPLICIT_INIT.get(false).booleanValue()) {
            create();
        }
    }

    private VK() {
    }

    public static void create() {
        SharedLibrary VK;
        if (tryCreateFromEnv()) {
            return;
        }
        switch (Platform.get()) {
            case FREEBSD:
            case LINUX:
                VK = Library.loadNative((Class<?>) VK.class, "org.lwjgl.vulkan", Configuration.VULKAN_LIBRARY_NAME, "libvulkan.so.1");
                break;
            case WINDOWS:
                VK = Library.loadNative((Class<?>) VK.class, "org.lwjgl.vulkan", Configuration.VULKAN_LIBRARY_NAME, "vulkan-1");
                break;
            case MACOSX:
                String override = Configuration.VULKAN_LIBRARY_NAME.get();
                if (override != null) {
                    VK = Library.loadNative(VK.class, "org.lwjgl.vulkan", override);
                    break;
                } else {
                    try {
                        VK = Library.loadNative((Class<?>) VK.class, "org.lwjgl.vulkan", "MoltenVK", true);
                        break;
                    } catch (Throwable th) {
                        VK = Library.loadNative(VK.class, "org.lwjgl.vulkan", "libvulkan.1.dylib");
                        break;
                    }
                }
            default:
                throw new IllegalStateException();
        }
        create(VK);
    }

    private static boolean tryCreateFromEnv() {
        if (Platform.get() != Platform.LINUX) {
            return false;
        }
        try {
            long vulkanHandle = getVulkanDriverHandle();
            SharedLibrary VK = Library.createFromHandle("libvulkan.so", vulkanHandle);
            create(VK);
            return true;
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void create(String libName) {
        create(Library.loadNative(VK.class, "org.lwjgl.vulkan", libName));
    }

    public static void create(FunctionProvider functionProvider2) {
        if (functionProvider != null) {
            return;
        }
        functionProvider = functionProvider2;
        globalCommands = new GlobalCommands(functionProvider2);
    }

    public static void destroy() {
        if (functionProvider == null) {
            return;
        }
        if (functionProvider instanceof NativeResource) {
            ((NativeResource) functionProvider).free();
        }
        functionProvider = null;
        globalCommands = null;
    }

    private static <T> T check(T t) {
        if (t == null) {
            throw new IllegalStateException("Vulkan library has not been loaded.");
        }
        return t;
    }

    public static FunctionProvider getFunctionProvider() {
        return (FunctionProvider) check(functionProvider);
    }

    public static int getInstanceVersionSupported() {
        long EnumerateInstanceVersion = getGlobalCommands().vkEnumerateInstanceVersion;
        if (EnumerateInstanceVersion != 0) {
            MemoryStack stack = MemoryStack.stackPush();
            try {
                IntBuffer pi = stack.callocInt(1);
                if (VK11.vkEnumerateInstanceVersion(pi) == 0) {
                    int i = pi.get(0);
                    if (stack != null) {
                        stack.close();
                    }
                    return i;
                }
                if (stack != null) {
                    stack.close();
                }
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
        return VK11.VK_API_VERSION_1_0;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK$GlobalCommands.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VK$GlobalCommands.class */
    static class GlobalCommands {
        final long vkGetInstanceProcAddr;
        final long vkCreateInstance;
        final long vkEnumerateInstanceExtensionProperties;
        final long vkEnumerateInstanceLayerProperties;
        final long vkEnumerateInstanceVersion;

        GlobalCommands(FunctionProvider library) {
            this.vkGetInstanceProcAddr = library.getFunctionAddress("vkGetInstanceProcAddr");
            if (this.vkGetInstanceProcAddr == 0) {
                throw new IllegalArgumentException("A critical function is missing. Make sure that Vulkan is available.");
            }
            this.vkCreateInstance = getFunctionAddress("vkCreateInstance");
            this.vkEnumerateInstanceExtensionProperties = getFunctionAddress("vkEnumerateInstanceExtensionProperties");
            this.vkEnumerateInstanceLayerProperties = getFunctionAddress("vkEnumerateInstanceLayerProperties");
            this.vkEnumerateInstanceVersion = getFunctionAddress("vkEnumerateInstanceVersion", false);
        }

        private long getFunctionAddress(String name) {
            return getFunctionAddress(name, true);
        }

        private long getFunctionAddress(String name, boolean required) {
            MemoryStack stack = MemoryStack.stackPush();
            try {
                long address = JNI.callPPP(0L, MemoryUtil.memAddress(stack.ASCII(name)), this.vkGetInstanceProcAddr);
                if (address == 0 && required) {
                    throw new IllegalArgumentException("A critical function is missing. Make sure that Vulkan is available.");
                }
                if (stack != null) {
                    stack.close();
                }
                return address;
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

    static GlobalCommands getGlobalCommands() {
        return (GlobalCommands) check(globalCommands);
    }

    static Set<String> getEnabledExtensionSet(int apiVersion, PointerBuffer extensionNames) {
        Set<String> enabledExtensions = new HashSet<>(16);
        int majorVersion = VK11.VK_VERSION_MAJOR(apiVersion);
        int minorVersion = VK11.VK_VERSION_MINOR(apiVersion);
        int[] VK_VERSIONS = {4};
        if (VK_VERSIONS.length < majorVersion) {
            printUnsupportedVersion(majorVersion, minorVersion);
        }
        int maxMajor = Math.min(majorVersion, VK_VERSIONS.length);
        for (int M = 1; M <= maxMajor; M++) {
            int maxMinor = VK_VERSIONS[M - 1];
            if (M == majorVersion) {
                if (maxMinor < minorVersion) {
                    printUnsupportedVersion(majorVersion, minorVersion);
                }
                maxMinor = Math.min(minorVersion, maxMinor);
            }
            for (int m = 0; m <= maxMinor; m++) {
                enabledExtensions.add("Vulkan" + M + m);
            }
        }
        if (extensionNames != null) {
            for (int i = extensionNames.position(); i < extensionNames.limit(); i++) {
                enabledExtensions.add(extensionNames.getStringUTF8(i));
            }
        }
        return enabledExtensions;
    }

    private static void printUnsupportedVersion(int majorVersion, int minorVersion) {
        APIUtil.apiLog("[Vulkan] Detected unsupported Vulkan version: " + majorVersion + '.' + minorVersion);
    }
}
