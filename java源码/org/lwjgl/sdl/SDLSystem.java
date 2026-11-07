package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLSystem.class */
public class SDLSystem {
    public static final int SDL_SANDBOX_NONE = 0;
    public static final int SDL_SANDBOX_UNKNOWN_CONTAINER = 1;
    public static final int SDL_SANDBOX_FLATPAK = 2;
    public static final int SDL_SANDBOX_SNAP = 3;
    public static final int SDL_SANDBOX_MACOS = 4;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLSystem$Functions.class */
    public static final class Functions {
        public static final long SetWindowsMessageHook = APIUtil.apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SetWindowsMessageHook");
        public static final long GetDirect3D9AdapterIndex = APIUtil.apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_GetDirect3D9AdapterIndex");
        public static final long GetDXGIOutputInfo = APIUtil.apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_GetDXGIOutputInfo");
        public static final long SetX11EventHook = APIUtil.apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SetX11EventHook");
        public static final long SetLinuxThreadPriority = APIUtil.apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SetLinuxThreadPriority");
        public static final long SetLinuxThreadPriorityAndPolicy = APIUtil.apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SetLinuxThreadPriorityAndPolicy");
        public static final long IsTablet = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsTablet");
        public static final long IsTV = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsTV");
        public static final long GetSandbox = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSandbox");

        private Functions() {
        }
    }

    protected SDLSystem() {
        throw new UnsupportedOperationException();
    }

    public static void nSDL_SetWindowsMessageHook(long callback, long userdata) {
        long __functionAddress = Functions.SetWindowsMessageHook;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPV(callback, userdata, __functionAddress);
    }

    public static void SDL_SetWindowsMessageHook(@NativeType("SDL_WindowsMessageHook") SDL_WindowsMessageHookI callback, @NativeType("void *") long userdata) {
        nSDL_SetWindowsMessageHook(MemoryUtil.memAddressSafe(callback), userdata);
    }

    public static int SDL_GetDirect3D9AdapterIndex(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetDirect3D9AdapterIndex;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeI(displayID, __functionAddress);
    }

    public static boolean nSDL_GetDXGIOutputInfo(int displayID, long adapterIndex, long outputIndex) {
        long __functionAddress = Functions.GetDXGIOutputInfo;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokePPZ(displayID, adapterIndex, outputIndex, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetDXGIOutputInfo(@NativeType("SDL_DisplayID") int displayID, @NativeType("int *") IntBuffer adapterIndex, @NativeType("int *") IntBuffer outputIndex) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) adapterIndex, 1);
            Checks.check((Buffer) outputIndex, 1);
        }
        return nSDL_GetDXGIOutputInfo(displayID, MemoryUtil.memAddress(adapterIndex), MemoryUtil.memAddress(outputIndex));
    }

    public static void nSDL_SetX11EventHook(long callback, long userdata) {
        long __functionAddress = Functions.SetX11EventHook;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePPV(callback, userdata, __functionAddress);
    }

    public static void SDL_SetX11EventHook(@NativeType("SDL_X11EventHook") SDL_X11EventHookI callback, @NativeType("void *") long userdata) {
        nSDL_SetX11EventHook(MemoryUtil.memAddressSafe(callback), userdata);
    }

    @NativeType("bool")
    public static boolean SDL_SetLinuxThreadPriority(@NativeType("Sint64") long threadID, int priority) {
        long __functionAddress = Functions.SetLinuxThreadPriority;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeJZ(threadID, priority, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetLinuxThreadPriorityAndPolicy(@NativeType("Sint64") long threadID, int sdlPriority, int schedPolicy) {
        long __functionAddress = Functions.SetLinuxThreadPriorityAndPolicy;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeJZ(threadID, sdlPriority, schedPolicy, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_IsTablet() {
        long __functionAddress = Functions.IsTablet;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_IsTV() {
        long __functionAddress = Functions.IsTV;
        return JNI.invokeZ(__functionAddress);
    }

    @NativeType("SDL_Sandbox")
    public static int SDL_GetSandbox() {
        long __functionAddress = Functions.GetSandbox;
        return JNI.invokeI(__functionAddress);
    }
}
