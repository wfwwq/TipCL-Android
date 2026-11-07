package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLThread.class */
public class SDLThread {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLThread$Functions.class */
    public static final class Functions {
        public static final long GetTLS = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTLS");
        public static final long SetTLS = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTLS");
        public static final long CleanupTLS = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CleanupTLS");

        private Functions() {
        }
    }

    protected SDLThread() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_GetTLS(long id) {
        long __functionAddress = Functions.GetTLS;
        return JNI.invokePP(id, __functionAddress);
    }

    @NativeType("void *")
    public static long SDL_GetTLS(@NativeType("SDL_TLSID *") IntBuffer id) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) id, 1);
        }
        return nSDL_GetTLS(MemoryUtil.memAddress(id));
    }

    public static boolean nSDL_SetTLS(long id, long value, long destructor) {
        long __functionAddress = Functions.SetTLS;
        return JNI.invokePPPZ(id, value, destructor, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetTLS(@NativeType("SDL_TLSID *") IntBuffer id, @NativeType("void *") long value, @NativeType("SDL_TLSDestructorCallback") SDL_TLSDestructorCallbackI destructor) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) id, 1);
        }
        return nSDL_SetTLS(MemoryUtil.memAddress(id), value, MemoryUtil.memAddressSafe(destructor));
    }

    public static void SDL_CleanupTLS() {
        long __functionAddress = Functions.CleanupTLS;
        JNI.invokeV(__functionAddress);
    }
}
