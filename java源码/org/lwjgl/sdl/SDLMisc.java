package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLMisc.class */
public class SDLMisc {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLMisc$Functions.class */
    public static final class Functions {
        public static final long OpenURL = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenURL");

        private Functions() {
        }
    }

    protected SDLMisc() {
        throw new UnsupportedOperationException();
    }

    public static boolean nSDL_OpenURL(long url) {
        long __functionAddress = Functions.OpenURL;
        return JNI.invokePZ(url, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_OpenURL(@NativeType("char const *") ByteBuffer url) {
        if (Checks.CHECKS) {
            Checks.checkNT1(url);
        }
        return nSDL_OpenURL(MemoryUtil.memAddress(url));
    }

    @NativeType("bool")
    public static boolean SDL_OpenURL(@NativeType("char const *") CharSequence url) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(url, true);
            long urlEncoded = stack.getPointerAddress();
            boolean zNSDL_OpenURL = nSDL_OpenURL(urlEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_OpenURL;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
