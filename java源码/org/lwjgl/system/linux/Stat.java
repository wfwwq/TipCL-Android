package org.lwjgl.system.linux;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/Stat.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/Stat.class */
public class Stat {
    public static native int nstat(long j, long j2, long j3);

    public static native int nfstat(long j, int i, long j2);

    static {
        Library.initialize();
    }

    protected Stat() {
        throw new UnsupportedOperationException();
    }

    public static int stat(@NativeType("int *") IntBuffer _errno, @NativeType("char const *") ByteBuffer __file, @NativeType("struct stat *") long __buf) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
            Checks.checkNT1(__file);
            Checks.check(__buf);
        }
        return nstat(MemoryUtil.memAddressSafe(_errno), MemoryUtil.memAddress(__file), __buf);
    }

    public static int stat(@NativeType("int *") IntBuffer _errno, @NativeType("char const *") CharSequence __file, @NativeType("struct stat *") long __buf) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
            Checks.check(__buf);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(__file, true);
            long __fileEncoded = stack.getPointerAddress();
            int iNstat = nstat(MemoryUtil.memAddressSafe(_errno), __fileEncoded, __buf);
            stack.setPointer(stackPointer);
            return iNstat;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int fstat(@NativeType("int *") IntBuffer _errno, int __fd, @NativeType("struct stat *") long __buf) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
            Checks.check(__buf);
        }
        return nfstat(MemoryUtil.memAddressSafe(_errno), __fd, __buf);
    }
}
