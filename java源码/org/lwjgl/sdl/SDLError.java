package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLError.class */
public class SDLError {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLError$Functions.class */
    public static final class Functions {
        public static final long SetError = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetError");
        public static final long SetErrorV = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetErrorV");
        public static final long OutOfMemory = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OutOfMemory");
        public static final long GetError = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetError");
        public static final long ClearError = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearError");

        private Functions() {
        }
    }

    protected SDLError() {
        throw new UnsupportedOperationException();
    }

    public static boolean nSDL_SetError(long fmt) {
        long __functionAddress = Functions.SetError;
        return JNI.invokePZ(fmt, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetError(@NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        return nSDL_SetError(MemoryUtil.memAddress(fmt));
    }

    @NativeType("bool")
    public static boolean SDL_SetError(@NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            boolean zNSDL_SetError = nSDL_SetError(fmtEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_SetError;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SetErrorV(long fmt, long ap) {
        long __functionAddress = Functions.SetErrorV;
        if (Checks.CHECKS) {
            Checks.check(ap);
        }
        return JNI.invokePPZ(fmt, ap, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetErrorV(@NativeType("char const *") ByteBuffer fmt, @NativeType("va_list") long ap) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        return nSDL_SetErrorV(MemoryUtil.memAddress(fmt), ap);
    }

    @NativeType("bool")
    public static boolean SDL_SetErrorV(@NativeType("char const *") CharSequence fmt, @NativeType("va_list") long ap) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            boolean zNSDL_SetErrorV = nSDL_SetErrorV(fmtEncoded, ap);
            stack.setPointer(stackPointer);
            return zNSDL_SetErrorV;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("bool")
    public static boolean SDL_OutOfMemory() {
        long __functionAddress = Functions.OutOfMemory;
        return JNI.invokeZ(__functionAddress);
    }

    public static long nSDL_GetError() {
        long __functionAddress = Functions.GetError;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetError() {
        long __result = nSDL_GetError();
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("bool")
    public static boolean SDL_ClearError() {
        long __functionAddress = Functions.ClearError;
        return JNI.invokeZ(__functionAddress);
    }
}
