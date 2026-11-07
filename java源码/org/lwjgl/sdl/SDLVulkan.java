package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkAllocationCallbacks;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkPhysicalDevice;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLVulkan.class */
public class SDLVulkan {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLVulkan$Functions.class */
    public static final class Functions {
        public static final long Vulkan_LoadLibrary = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_LoadLibrary");
        public static final long Vulkan_GetVkGetInstanceProcAddr = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_GetVkGetInstanceProcAddr");
        public static final long Vulkan_UnloadLibrary = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_UnloadLibrary");
        public static final long Vulkan_GetInstanceExtensions = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_GetInstanceExtensions");
        public static final long Vulkan_CreateSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_CreateSurface");
        public static final long Vulkan_DestroySurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_DestroySurface");
        public static final long Vulkan_GetPresentationSupport = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Vulkan_GetPresentationSupport");

        private Functions() {
        }
    }

    protected SDLVulkan() {
        throw new UnsupportedOperationException();
    }

    public static boolean nSDL_Vulkan_LoadLibrary(long path) {
        long __functionAddress = Functions.Vulkan_LoadLibrary;
        return JNI.invokePZ(path, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_Vulkan_LoadLibrary(@NativeType("char const *") ByteBuffer path) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(path);
        }
        return nSDL_Vulkan_LoadLibrary(MemoryUtil.memAddressSafe(path));
    }

    @NativeType("bool")
    public static boolean SDL_Vulkan_LoadLibrary(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? 0L : stack.getPointerAddress();
            boolean zNSDL_Vulkan_LoadLibrary = nSDL_Vulkan_LoadLibrary(pathEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_Vulkan_LoadLibrary;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("SDL_FunctionPointer")
    public static long SDL_Vulkan_GetVkGetInstanceProcAddr() {
        long __functionAddress = Functions.Vulkan_GetVkGetInstanceProcAddr;
        return JNI.invokeP(__functionAddress);
    }

    public static void SDL_Vulkan_UnloadLibrary() {
        long __functionAddress = Functions.Vulkan_UnloadLibrary;
        JNI.invokeV(__functionAddress);
    }

    public static long nSDL_Vulkan_GetInstanceExtensions(long count) {
        long __functionAddress = Functions.Vulkan_GetInstanceExtensions;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("char const * const *")
    public static PointerBuffer SDL_Vulkan_GetInstanceExtensions() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_Vulkan_GetInstanceExtensions(MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_Vulkan_CreateSurface(long window, long instance, long allocator, long surface) {
        long __functionAddress = Functions.Vulkan_CreateSurface;
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPPPZ(window, instance, allocator, surface, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_Vulkan_CreateSurface(@NativeType("SDL_Window *") long window, VkInstance instance, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks allocator, @NativeType("VkSurfaceKHR *") LongBuffer surface) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) surface, 1);
        }
        return nSDL_Vulkan_CreateSurface(window, instance.address(), MemoryUtil.memAddressSafe(allocator), MemoryUtil.memAddress(surface));
    }

    public static void nSDL_Vulkan_DestroySurface(long instance, long surface, long allocator) {
        long __functionAddress = Functions.Vulkan_DestroySurface;
        JNI.invokePJPV(instance, surface, allocator, __functionAddress);
    }

    public static void SDL_Vulkan_DestroySurface(VkInstance instance, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks allocator) {
        nSDL_Vulkan_DestroySurface(instance.address(), surface, MemoryUtil.memAddressSafe(allocator));
    }

    @NativeType("bool")
    public static boolean SDL_Vulkan_GetPresentationSupport(VkInstance instance, VkPhysicalDevice physicalDevice, @NativeType("Uint32") int queueFamilyIndex) {
        long __functionAddress = Functions.Vulkan_GetPresentationSupport;
        return JNI.invokePPZ(instance.address(), physicalDevice.address(), queueFamilyIndex, __functionAddress);
    }
}
