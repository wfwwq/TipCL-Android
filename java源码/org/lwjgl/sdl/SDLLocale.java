package org.lwjgl.sdl;

import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLLocale.class */
public class SDLLocale {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLLocale$Functions.class */
    public static final class Functions {
        public static final long GetPreferredLocales = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPreferredLocales");

        private Functions() {
        }
    }

    protected SDLLocale() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_GetPreferredLocales(long count) {
        long __functionAddress = Functions.GetPreferredLocales;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_Locale **")
    public static PointerBuffer SDL_GetPreferredLocales() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetPreferredLocales(MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
