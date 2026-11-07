package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLLoadSO.class */
public class SDLLoadSO {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLLoadSO$Functions.class */
    public static final class Functions {
        public static final long LoadObject = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadObject");
        public static final long LoadFunction = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadFunction");
        public static final long UnloadObject = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnloadObject");

        private Functions() {
        }
    }

    protected SDLLoadSO() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_LoadObject(long sofile) {
        long __functionAddress = Functions.LoadObject;
        return JNI.invokePP(sofile, __functionAddress);
    }

    @NativeType("SDL_SharedObject *")
    public static long SDL_LoadObject(@NativeType("char const *") ByteBuffer sofile) {
        if (Checks.CHECKS) {
            Checks.checkNT1(sofile);
        }
        return nSDL_LoadObject(MemoryUtil.memAddress(sofile));
    }

    @NativeType("SDL_SharedObject *")
    public static long SDL_LoadObject(@NativeType("char const *") CharSequence sofile) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(sofile, true);
            long sofileEncoded = stack.getPointerAddress();
            long jNSDL_LoadObject = nSDL_LoadObject(sofileEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_LoadObject;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_LoadFunction(long handle, long name) {
        long __functionAddress = Functions.LoadFunction;
        if (Checks.CHECKS) {
            Checks.check(handle);
        }
        return JNI.invokePPP(handle, name, __functionAddress);
    }

    @NativeType("SDL_FunctionPointer")
    public static long SDL_LoadFunction(@NativeType("SDL_SharedObject *") long handle, @NativeType("char *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_LoadFunction(handle, MemoryUtil.memAddress(name));
    }

    public static void SDL_UnloadObject(@NativeType("SDL_SharedObject *") long handle) {
        long __functionAddress = Functions.UnloadObject;
        if (Checks.CHECKS) {
            Checks.check(handle);
        }
        JNI.invokePV(handle, __functionAddress);
    }
}
