package org.lwjgl.system.windows;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/Crypt32.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/Crypt32.class */
public class Crypt32 {
    private static final SharedLibrary CRYPT32 = Library.loadNative(Crypt32.class, "org.lwjgl", "crypt32");
    public static final int CRYPTPROTECT_UI_FORBIDDEN = 1;
    public static final int CRYPTPROTECT_LOCAL_MACHINE = 4;
    public static final int CRYPTPROTECT_AUDIT = 16;
    public static final int CRYPTPROTECT_VERIFY_PROTECTION = 64;
    public static final int CRYPTPROTECTMEMORY_SAME_PROCESS = 0;
    public static final int CRYPTPROTECTMEMORY_CROSS_PROCESS = 1;
    public static final int CRYPTPROTECTMEMORY_SAME_LOGON = 2;
    public static final int CRYPTPROTECT_PROMPT_ON_UNPROTECT = 1;
    public static final int CRYPTPROTECT_PROMPT_ON_PROTECT = 2;
    public static final int CRYPTPROTECTMEMORY_BLOCK_SIZE = 16;

    public static native int nCryptProtectData(long j, long j2, long j3, long j4, long j5, long j6, int i, long j7, long j8);

    public static native int nCryptProtectMemory(long j, long j2, int i, int i2, long j3);

    public static native int nCryptUnprotectData(long j, long j2, long j3, long j4, long j5, long j6, int i, long j7, long j8);

    public static native int nCryptUnprotectMemory(long j, long j2, int i, int i2, long j3);

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/Crypt32$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/Crypt32$Functions.class */
    public static final class Functions {
        public static final long CryptProtectData = APIUtil.apiGetFunctionAddress(Crypt32.CRYPT32, "CryptProtectData");
        public static final long CryptProtectMemory = APIUtil.apiGetFunctionAddressOptional(Crypt32.CRYPT32, "CryptProtectMemory");
        public static final long CryptUnprotectData = APIUtil.apiGetFunctionAddress(Crypt32.CRYPT32, "CryptUnprotectData");
        public static final long CryptUnprotectMemory = APIUtil.apiGetFunctionAddressOptional(Crypt32.CRYPT32, "CryptUnprotectMemory");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return CRYPT32;
    }

    protected Crypt32() {
        throw new UnsupportedOperationException();
    }

    public static int nCryptProtectData(long _GetLastError, long pDataIn, long szDataDescr, long pOptionalEntropy, long pvReserved, long pPromptStruct, int dwFlags, long pDataOut) {
        long __functionAddress = Functions.CryptProtectData;
        return nCryptProtectData(_GetLastError, pDataIn, szDataDescr, pOptionalEntropy, pvReserved, pPromptStruct, dwFlags, pDataOut, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean CryptProtectData(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("DATA_BLOB *") DATA_BLOB pDataIn, @NativeType("LPCWSTR") ByteBuffer szDataDescr, @NativeType("DATA_BLOB *") DATA_BLOB pOptionalEntropy, @NativeType("PVOID") long pvReserved, @NativeType("CRYPTPROTECT_PROMPTSTRUCT *") CRYPTPROTECT_PROMPTSTRUCT pPromptStruct, @NativeType("DWORD") int dwFlags, @NativeType("DATA_BLOB *") DATA_BLOB pDataOut) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
            Checks.checkNT2Safe(szDataDescr);
        }
        return nCryptProtectData(MemoryUtil.memAddressSafe(_GetLastError), pDataIn.address(), MemoryUtil.memAddressSafe(szDataDescr), MemoryUtil.memAddressSafe(pOptionalEntropy), pvReserved, MemoryUtil.memAddressSafe(pPromptStruct), dwFlags, pDataOut.address()) != 0;
    }

    @NativeType("BOOL")
    public static boolean CryptProtectData(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("DATA_BLOB *") DATA_BLOB pDataIn, @NativeType("LPCWSTR") CharSequence szDataDescr, @NativeType("DATA_BLOB *") DATA_BLOB pOptionalEntropy, @NativeType("PVOID") long pvReserved, @NativeType("CRYPTPROTECT_PROMPTSTRUCT *") CRYPTPROTECT_PROMPTSTRUCT pPromptStruct, @NativeType("DWORD") int dwFlags, @NativeType("DATA_BLOB *") DATA_BLOB pDataOut) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(szDataDescr, true);
            long szDataDescrEncoded = szDataDescr == null ? 0L : stack.getPointerAddress();
            return nCryptProtectData(MemoryUtil.memAddressSafe(_GetLastError), pDataIn.address(), szDataDescrEncoded, MemoryUtil.memAddressSafe(pOptionalEntropy), pvReserved, MemoryUtil.memAddressSafe(pPromptStruct), dwFlags, pDataOut.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int nCryptProtectMemory(long _GetLastError, long pDataIn, int cbDataIn, int dwFlags) {
        long __functionAddress = Functions.CryptProtectMemory;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return nCryptProtectMemory(_GetLastError, pDataIn, cbDataIn, dwFlags, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean CryptProtectMemory(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("LPVOID") ByteBuffer pDataIn, @NativeType("DWORD") int dwFlags) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nCryptProtectMemory(MemoryUtil.memAddressSafe(_GetLastError), MemoryUtil.memAddress(pDataIn), pDataIn.remaining(), dwFlags) != 0;
    }

    public static int nCryptUnprotectData(long _GetLastError, long pDataIn, long ppszDataDescr, long pOptionalEntropy, long pvReserved, long pPromptStruct, int dwFlags, long pDataOut) {
        long __functionAddress = Functions.CryptUnprotectData;
        return nCryptUnprotectData(_GetLastError, pDataIn, ppszDataDescr, pOptionalEntropy, pvReserved, pPromptStruct, dwFlags, pDataOut, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean CryptUnprotectData(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("DATA_BLOB *") DATA_BLOB pDataIn, @NativeType("LPWSTR *") PointerBuffer ppszDataDescr, @NativeType("DATA_BLOB *") DATA_BLOB pOptionalEntropy, @NativeType("PVOID") long pvReserved, @NativeType("CRYPTPROTECT_PROMPTSTRUCT *") CRYPTPROTECT_PROMPTSTRUCT pPromptStruct, @NativeType("DWORD") int dwFlags, @NativeType("DATA_BLOB *") DATA_BLOB pDataOut) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
            Checks.checkSafe((CustomBuffer<?>) ppszDataDescr, 1);
        }
        return nCryptUnprotectData(MemoryUtil.memAddressSafe(_GetLastError), pDataIn.address(), MemoryUtil.memAddressSafe(ppszDataDescr), MemoryUtil.memAddressSafe(pOptionalEntropy), pvReserved, MemoryUtil.memAddressSafe(pPromptStruct), dwFlags, pDataOut.address()) != 0;
    }

    public static int nCryptUnprotectMemory(long _GetLastError, long pDataIn, int cbDataIn, int dwFlags) {
        long __functionAddress = Functions.CryptUnprotectMemory;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return nCryptUnprotectMemory(_GetLastError, pDataIn, cbDataIn, dwFlags, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean CryptUnprotectMemory(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("LPVOID") ByteBuffer pDataIn, @NativeType("DWORD") int dwFlags) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nCryptUnprotectMemory(MemoryUtil.memAddressSafe(_GetLastError), MemoryUtil.memAddress(pDataIn), pDataIn.remaining(), dwFlags) != 0;
    }
}
