package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLClipboard.class */
public class SDLClipboard {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLClipboard$Functions.class */
    public static final class Functions {
        public static final long SetClipboardText = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetClipboardText");
        public static final long GetClipboardText = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetClipboardText");
        public static final long HasClipboardText = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasClipboardText");
        public static final long SetPrimarySelectionText = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetPrimarySelectionText");
        public static final long GetPrimarySelectionText = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPrimarySelectionText");
        public static final long HasPrimarySelectionText = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasPrimarySelectionText");
        public static final long SetClipboardData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetClipboardData");
        public static final long ClearClipboardData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearClipboardData");
        public static final long GetClipboardData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetClipboardData");
        public static final long HasClipboardData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasClipboardData");
        public static final long GetClipboardMimeTypes = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetClipboardMimeTypes");

        private Functions() {
        }
    }

    protected SDLClipboard() {
        throw new UnsupportedOperationException();
    }

    public static boolean nSDL_SetClipboardText(long text) {
        long __functionAddress = Functions.SetClipboardText;
        return JNI.invokePZ(text, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetClipboardText(@NativeType("char const *") ByteBuffer text) {
        if (Checks.CHECKS) {
            Checks.checkNT1(text);
        }
        return nSDL_SetClipboardText(MemoryUtil.memAddress(text));
    }

    @NativeType("bool")
    public static boolean SDL_SetClipboardText(@NativeType("char const *") CharSequence text) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            boolean zNSDL_SetClipboardText = nSDL_SetClipboardText(textEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_SetClipboardText;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetClipboardText() {
        long __functionAddress = Functions.GetClipboardText;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char *")
    public static String SDL_GetClipboardText() {
        long __result = 0;
        try {
            __result = nSDL_GetClipboardText();
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            SDLStdinc.nSDL_free(__result);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            SDLStdinc.nSDL_free(__result);
            throw th;
        }
    }

    @NativeType("bool")
    public static boolean SDL_HasClipboardText() {
        long __functionAddress = Functions.HasClipboardText;
        return JNI.invokeZ(__functionAddress);
    }

    public static boolean nSDL_SetPrimarySelectionText(long text) {
        long __functionAddress = Functions.SetPrimarySelectionText;
        return JNI.invokePZ(text, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetPrimarySelectionText(@NativeType("char const *") ByteBuffer text) {
        if (Checks.CHECKS) {
            Checks.checkNT1(text);
        }
        return nSDL_SetPrimarySelectionText(MemoryUtil.memAddress(text));
    }

    @NativeType("bool")
    public static boolean SDL_SetPrimarySelectionText(@NativeType("char const *") CharSequence text) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            boolean zNSDL_SetPrimarySelectionText = nSDL_SetPrimarySelectionText(textEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_SetPrimarySelectionText;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetPrimarySelectionText() {
        long __functionAddress = Functions.GetPrimarySelectionText;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char *")
    public static String SDL_GetPrimarySelectionText() {
        long __result = 0;
        try {
            __result = nSDL_GetPrimarySelectionText();
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            SDLStdinc.nSDL_free(__result);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            SDLStdinc.nSDL_free(__result);
            throw th;
        }
    }

    @NativeType("bool")
    public static boolean SDL_HasPrimarySelectionText() {
        long __functionAddress = Functions.HasPrimarySelectionText;
        return JNI.invokeZ(__functionAddress);
    }

    public static boolean nSDL_SetClipboardData(long callback, long cleanup, long userdata, long mime_types, long num_mime_types) {
        long __functionAddress = Functions.SetClipboardData;
        return JNI.invokePPPPPZ(callback, cleanup, userdata, mime_types, num_mime_types, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetClipboardData(@NativeType("SDL_ClipboardDataCallback") SDL_ClipboardDataCallbackI callback, @NativeType("SDL_ClipboardCleanupCallback") SDL_ClipboardCleanupCallbackI cleanup, @NativeType("void *") long userdata, @NativeType("char const **") PointerBuffer mime_types) {
        return nSDL_SetClipboardData(callback.address(), cleanup.address(), userdata, MemoryUtil.memAddress(mime_types), mime_types.remaining());
    }

    @NativeType("bool")
    public static boolean SDL_ClearClipboardData() {
        long __functionAddress = Functions.ClearClipboardData;
        return JNI.invokeZ(__functionAddress);
    }

    public static long nSDL_GetClipboardData(long mime_type, long size) {
        long __functionAddress = Functions.GetClipboardData;
        return JNI.invokePPP(mime_type, size, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_GetClipboardData(@NativeType("char const *") ByteBuffer mime_type) {
        if (Checks.CHECKS) {
            Checks.checkNT1(mime_type);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        PointerBuffer size = stack.callocPointer(1);
        try {
            long __result = nSDL_GetClipboardData(MemoryUtil.memAddress(mime_type), MemoryUtil.memAddress(size));
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, (int) size.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void *")
    public static ByteBuffer SDL_GetClipboardData(@NativeType("char const *") CharSequence mime_type) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            PointerBuffer size = stack.callocPointer(1);
            stack.nASCII(mime_type, true);
            long mime_typeEncoded = stack.getPointerAddress();
            long __result = nSDL_GetClipboardData(mime_typeEncoded, MemoryUtil.memAddress(size));
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, (int) size.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_HasClipboardData(long mime_type) {
        long __functionAddress = Functions.HasClipboardData;
        return JNI.invokePZ(mime_type, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasClipboardData(@NativeType("char const *") ByteBuffer mime_type) {
        if (Checks.CHECKS) {
            Checks.checkNT1(mime_type);
        }
        return nSDL_HasClipboardData(MemoryUtil.memAddress(mime_type));
    }

    @NativeType("bool")
    public static boolean SDL_HasClipboardData(@NativeType("char const *") CharSequence mime_type) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(mime_type, true);
            long mime_typeEncoded = stack.getPointerAddress();
            boolean zNSDL_HasClipboardData = nSDL_HasClipboardData(mime_typeEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_HasClipboardData;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetClipboardMimeTypes(long num_mime_types) {
        long __functionAddress = Functions.GetClipboardMimeTypes;
        return JNI.invokePP(num_mime_types, __functionAddress);
    }

    @NativeType("char **")
    public static PointerBuffer SDL_GetClipboardMimeTypes() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        PointerBuffer num_mime_types = stack.callocPointer(1);
        try {
            long __result = nSDL_GetClipboardMimeTypes(MemoryUtil.memAddress(num_mime_types));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, (int) num_mime_types.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
