package org.lwjgl.system.windows;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/Kernel32.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/Kernel32.class */
public class Kernel32 {
    private static final SharedLibrary KERNEL32 = Library.loadNative(Kernel32.class, "org.lwjgl", "kernel32");

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/Kernel32$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/Kernel32$Functions.class */
    public static final class Functions {
        public static final long GetCurrentProcess = APIUtil.apiGetFunctionAddress(Kernel32.KERNEL32, "GetCurrentProcess");
        public static final long GetCurrentProcessId = APIUtil.apiGetFunctionAddress(Kernel32.KERNEL32, "GetCurrentProcessId");
        public static final long GetProcessId = APIUtil.apiGetFunctionAddress(Kernel32.KERNEL32, "GetProcessId");
        public static final long GetCurrentThread = APIUtil.apiGetFunctionAddress(Kernel32.KERNEL32, "GetCurrentThread");
        public static final long GetCurrentThreadId = APIUtil.apiGetFunctionAddress(Kernel32.KERNEL32, "GetCurrentThreadId");
        public static final long GetThreadId = APIUtil.apiGetFunctionAddressOptional(Kernel32.KERNEL32, "GetThreadId");
        public static final long GetProcessIdOfThread = APIUtil.apiGetFunctionAddressOptional(Kernel32.KERNEL32, "GetProcessIdOfThread");
        public static final long GetCurrentProcessorNumber = APIUtil.apiGetFunctionAddressOptional(Kernel32.KERNEL32, "GetCurrentProcessorNumber");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return KERNEL32;
    }

    protected Kernel32() {
        throw new UnsupportedOperationException();
    }

    @NativeType("HANDLE")
    public static long GetCurrentProcess() {
        long __functionAddress = Functions.GetCurrentProcess;
        return JNI.callP(__functionAddress);
    }

    @NativeType("DWORD")
    public static int GetCurrentProcessId() {
        long __functionAddress = Functions.GetCurrentProcessId;
        return JNI.callI(__functionAddress);
    }

    @NativeType("DWORD")
    public static int GetProcessId(@NativeType("HANDLE") long Process) {
        long __functionAddress = Functions.GetProcessId;
        if (Checks.CHECKS) {
            Checks.check(Process);
        }
        return JNI.callPI(Process, __functionAddress);
    }

    @NativeType("HANDLE")
    public static long GetCurrentThread() {
        long __functionAddress = Functions.GetCurrentThread;
        return JNI.callP(__functionAddress);
    }

    @NativeType("DWORD")
    public static int GetCurrentThreadId() {
        long __functionAddress = Functions.GetCurrentThreadId;
        return JNI.callI(__functionAddress);
    }

    @NativeType("DWORD")
    public static int GetThreadId(@NativeType("HANDLE") long Thread) {
        long __functionAddress = Functions.GetThreadId;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(Thread);
        }
        return JNI.callPI(Thread, __functionAddress);
    }

    @NativeType("DWORD")
    public static int GetProcessIdOfThread(@NativeType("HANDLE") long Thread) {
        long __functionAddress = Functions.GetProcessIdOfThread;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(Thread);
        }
        return JNI.callPI(Thread, __functionAddress);
    }

    @NativeType("DWORD")
    public static int GetCurrentProcessorNumber() {
        long __functionAddress = Functions.GetCurrentProcessorNumber;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callI(__functionAddress);
    }
}
