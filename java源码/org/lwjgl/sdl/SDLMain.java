package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLMain.class */
public class SDLMain {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLMain$Functions.class */
    public static final class Functions {
        public static final long SetMainReady = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetMainReady");
        public static final long RunApp = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RunApp");
        public static final long EnterAppMainCallbacks = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EnterAppMainCallbacks");
        public static final long SDL_RegisterApp = APIUtil.apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SDL_RegisterApp");
        public static final long SDL_UnregisterApp = APIUtil.apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SDL_UnregisterApp");

        private Functions() {
        }
    }

    protected SDLMain() {
        throw new UnsupportedOperationException();
    }

    public static void SDL_SetMainReady() {
        long __functionAddress = Functions.SetMainReady;
        JNI.invokeV(__functionAddress);
    }

    public static int nSDL_RunApp(int argc, long argv, long mainFunction, long reserved) {
        long __functionAddress = Functions.RunApp;
        return JNI.invokePPPI(argc, argv, mainFunction, reserved, __functionAddress);
    }

    public static int SDL_RunApp(@NativeType("char **") PointerBuffer argv, @NativeType("SDL_main_func") SDL_main_funcI mainFunction, @NativeType("void *") long reserved) {
        return nSDL_RunApp(Checks.remainingSafe(argv), MemoryUtil.memAddressSafe(argv), mainFunction.address(), reserved);
    }

    public static int nSDL_EnterAppMainCallbacks(int argc, long argv, long appinit, long appiter, long appevent, long appquit) {
        long __functionAddress = Functions.EnterAppMainCallbacks;
        return JNI.invokePPPPPI(argc, argv, appinit, appiter, appevent, appquit, __functionAddress);
    }

    public static int SDL_EnterAppMainCallbacks(@NativeType("char **") PointerBuffer argv, @NativeType("SDL_AppInit_func") SDL_AppInit_funcI appinit, @NativeType("SDL_AppIterate_func") SDL_AppIterate_funcI appiter, @NativeType("SDL_AppEvent_func") SDL_AppEvent_funcI appevent, @NativeType("SDL_AppQuit_func") SDL_AppQuit_funcI appquit) {
        return nSDL_EnterAppMainCallbacks(Checks.remainingSafe(argv), MemoryUtil.memAddressSafe(argv), appinit.address(), appiter.address(), appevent.address(), appquit.address());
    }

    public static boolean nSDL_SDL_RegisterApp(long name, int style, long hInst) {
        long __functionAddress = Functions.SDL_RegisterApp;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokePPZ(name, style, hInst, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SDL_RegisterApp(@NativeType("char *") ByteBuffer name, @NativeType("Uint32") int style, @NativeType("HINSTANCE") long hInst) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(name);
        }
        return nSDL_SDL_RegisterApp(MemoryUtil.memAddressSafe(name), style, hInst);
    }

    public static void SDL_SDL_UnregisterApp() {
        long __functionAddress = Functions.SDL_UnregisterApp;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(__functionAddress);
    }
}
