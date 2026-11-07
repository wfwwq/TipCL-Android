package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.LibFFI;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLGUID.class */
public class SDLGUID {
    private static final FFICIF SDL_GUIDToStringCIF = APIUtil.apiCreateCIF(LibFFI.ffi_type_void, APIUtil.apiCreateStruct(APIUtil.apiCreateArray(LibFFI.ffi_type_uint8, 16)), LibFFI.ffi_type_pointer, LibFFI.ffi_type_sint32);
    private static final FFICIF SDL_StringToGUIDCIF = APIUtil.apiCreateCIF(APIUtil.apiCreateStruct(APIUtil.apiCreateArray(LibFFI.ffi_type_uint8, 16)), LibFFI.ffi_type_pointer);

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLGUID$Functions.class */
    public static final class Functions {
        public static final long GUIDToString = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GUIDToString");
        public static final long StringToGUID = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_StringToGUID");

        private Functions() {
        }
    }

    protected SDLGUID() {
        throw new UnsupportedOperationException();
    }

    public static void nSDL_GUIDToString(long guid, long pszGUID, int cbGUID) {
        long __functionAddress = Functions.GUIDToString;
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(MemoryStack.POINTER_SIZE, MemoryStack.POINTER_SIZE * 3);
            MemoryUtil.memPutAddress(arguments, guid);
            MemoryUtil.memPutAddress(arguments + MemoryStack.POINTER_SIZE, stack.npointer(pszGUID));
            MemoryUtil.memPutAddress(arguments + (2 * MemoryStack.POINTER_SIZE), stack.nint(cbGUID));
            LibFFI.nffi_call(SDL_GUIDToStringCIF.address(), __functionAddress, 0L, arguments);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void SDL_GUIDToString(SDL_GUID guid, @NativeType("char *") ByteBuffer pszGUID) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pszGUID, 33);
        }
        nSDL_GUIDToString(guid.address(), MemoryUtil.memAddress(pszGUID), pszGUID.remaining());
    }

    public static void nSDL_StringToGUID(long pchGUID, long __result) {
        long __functionAddress = Functions.StringToGUID;
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(MemoryStack.POINTER_SIZE, MemoryStack.POINTER_SIZE * 1);
            MemoryUtil.memPutAddress(arguments, stack.npointer(pchGUID));
            LibFFI.nffi_call(SDL_StringToGUIDCIF.address(), __functionAddress, __result, arguments);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static SDL_GUID SDL_StringToGUID(@NativeType("char const *") ByteBuffer pchGUID, SDL_GUID __result) {
        if (Checks.CHECKS) {
            Checks.checkNT1(pchGUID);
        }
        nSDL_StringToGUID(MemoryUtil.memAddress(pchGUID), __result.address());
        return __result;
    }

    public static SDL_GUID SDL_StringToGUID(@NativeType("char const *") CharSequence pchGUID, SDL_GUID __result) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchGUID, true);
            long pchGUIDEncoded = stack.getPointerAddress();
            nSDL_StringToGUID(pchGUIDEncoded, __result.address());
            stack.setPointer(stackPointer);
            return __result;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
