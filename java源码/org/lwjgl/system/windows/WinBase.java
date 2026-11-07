package org.lwjgl.system.windows;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/WinBase.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/WinBase.class */
public class WinBase {
    public static final int FALSE = 0;
    public static final int TRUE = 1;

    public static native long nLocalFree(long j, long j2);

    @NativeType("DWORD")
    public static native int GetLastError();

    public static native long nGetModuleHandle(long j, long j2);

    public static native int nGetModuleFileName(long j, long j2, long j3, int i);

    public static native long nLoadLibrary(long j, long j2);

    public static native long nGetProcAddress(long j, long j2, long j3);

    public static native int nFreeLibrary(long j, long j2);

    static {
        Library.initialize();
    }

    protected WinBase() {
        throw new UnsupportedOperationException();
    }

    @NativeType("HLOCAL")
    public static long LocalFree(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HLOCAL") long hMem) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
            Checks.check(hMem);
        }
        return nLocalFree(MemoryUtil.memAddressSafe(_GetLastError), hMem);
    }

    @NativeType("HMODULE")
    public static long GetModuleHandle(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("LPCTSTR") ByteBuffer moduleName) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
            Checks.checkNT2Safe(moduleName);
        }
        return nGetModuleHandle(MemoryUtil.memAddressSafe(_GetLastError), MemoryUtil.memAddressSafe(moduleName));
    }

    @NativeType("HMODULE")
    public static long GetModuleHandle(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("LPCTSTR") CharSequence moduleName) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(moduleName, true);
            long moduleNameEncoded = moduleName == null ? 0L : stack.getPointerAddress();
            long jNGetModuleHandle = nGetModuleHandle(MemoryUtil.memAddressSafe(_GetLastError), moduleNameEncoded);
            stack.setPointer(stackPointer);
            return jNGetModuleHandle;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("DWORD")
    public static int GetModuleFileName(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HMODULE") long hModule, @NativeType("LPTSTR") ByteBuffer lpFilename) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nGetModuleFileName(MemoryUtil.memAddressSafe(_GetLastError), hModule, MemoryUtil.memAddress(lpFilename), lpFilename.remaining() >> 1);
    }

    @NativeType("DWORD")
    public static String GetModuleFileName(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HMODULE") long hModule, @NativeType("DWORD") int nSize) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            ByteBuffer lpFilename = stack.malloc(nSize << 1);
            int __result = nGetModuleFileName(MemoryUtil.memAddressSafe(_GetLastError), hModule, MemoryUtil.memAddress(lpFilename), nSize);
            String strMemUTF16 = MemoryUtil.memUTF16(lpFilename, __result);
            stack.setPointer(stackPointer);
            return strMemUTF16;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("HMODULE")
    public static long LoadLibrary(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("LPCTSTR") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
            Checks.checkNT2(name);
        }
        return nLoadLibrary(MemoryUtil.memAddressSafe(_GetLastError), MemoryUtil.memAddress(name));
    }

    @NativeType("HMODULE")
    public static long LoadLibrary(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("LPCTSTR") CharSequence name) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF16(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNLoadLibrary = nLoadLibrary(MemoryUtil.memAddressSafe(_GetLastError), nameEncoded);
            stack.setPointer(stackPointer);
            return jNLoadLibrary;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("FARPROC")
    public static long GetProcAddress(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HMODULE") long handle, @NativeType("LPCSTR") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
            Checks.check(handle);
            Checks.checkNT1(name);
        }
        return nGetProcAddress(MemoryUtil.memAddressSafe(_GetLastError), handle, MemoryUtil.memAddress(name));
    }

    @NativeType("FARPROC")
    public static long GetProcAddress(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HMODULE") long handle, @NativeType("LPCSTR") CharSequence name) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
            Checks.check(handle);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNGetProcAddress = nGetProcAddress(MemoryUtil.memAddressSafe(_GetLastError), handle, nameEncoded);
            stack.setPointer(stackPointer);
            return jNGetProcAddress;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("BOOL")
    public static boolean FreeLibrary(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HMODULE") long handle) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
            Checks.check(handle);
        }
        return nFreeLibrary(MemoryUtil.memAddressSafe(_GetLastError), handle) != 0;
    }
}
