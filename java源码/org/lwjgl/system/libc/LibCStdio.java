package org.lwjgl.system.libc;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libc/LibCStdio.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libc/LibCStdio.class */
public class LibCStdio {
    public static final long stdin;
    public static final long stdout;
    public static final long stderr;
    public static final long fscanf;
    public static final long sscanf;
    public static final long fprintf;
    public static final long snprintf;

    @NativeType("FILE *")
    private static native long stdin();

    @NativeType("FILE *")
    private static native long stdout();

    @NativeType("FILE *")
    private static native long stderr();

    public static native int nfflush(long j);

    public static native int nfeof(long j);

    public static native int nferror(long j);

    @NativeType("void *")
    private static native long fscanf();

    @NativeType("void *")
    private static native long sscanf();

    public static native int nvsscanf(long j, long j2, long j3);

    @NativeType("void *")
    private static native long fprintf();

    @NativeType("void *")
    private static native long snprintf();

    public static native int nvsnprintf(long j, long j2, long j3, long j4);

    static {
        Library.initialize();
        stdin = stdin();
        stdout = stdout();
        stderr = stderr();
        fscanf = fscanf();
        sscanf = sscanf();
        fprintf = fprintf();
        snprintf = snprintf();
    }

    protected LibCStdio() {
        throw new UnsupportedOperationException();
    }

    public static int fflush(@NativeType("FILE *") long stream) {
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return nfflush(stream);
    }

    public static int feof(@NativeType("FILE *") long stream) {
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return nfeof(stream);
    }

    public static int ferror(@NativeType("FILE *") long stream) {
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return nferror(stream);
    }

    public static int vsscanf(@NativeType("char const *") ByteBuffer buffer, @NativeType("char const *") ByteBuffer format, @NativeType("va_list") long vlist) {
        if (Checks.CHECKS) {
            Checks.checkNT1(buffer);
            Checks.checkNT1(format);
            Checks.check(vlist);
        }
        return nvsscanf(MemoryUtil.memAddress(buffer), MemoryUtil.memAddress(format), vlist);
    }

    public static int vsscanf(@NativeType("char const *") CharSequence buffer, @NativeType("char const *") CharSequence format, @NativeType("va_list") long vlist) {
        if (Checks.CHECKS) {
            Checks.check(vlist);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(buffer, true);
            long bufferEncoded = stack.getPointerAddress();
            stack.nASCII(format, true);
            long formatEncoded = stack.getPointerAddress();
            int iNvsscanf = nvsscanf(bufferEncoded, formatEncoded, vlist);
            stack.setPointer(stackPointer);
            return iNvsscanf;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int vsnprintf(@NativeType("char *") ByteBuffer buffer, @NativeType("char const *") ByteBuffer format, @NativeType("va_list") long vlist) {
        if (Checks.CHECKS) {
            Checks.checkNT1(format);
            Checks.check(vlist);
        }
        return nvsnprintf(MemoryUtil.memAddressSafe(buffer), Checks.remainingSafe(buffer), MemoryUtil.memAddress(format), vlist);
    }

    public static int vsnprintf(@NativeType("char *") ByteBuffer buffer, @NativeType("char const *") CharSequence format, @NativeType("va_list") long vlist) {
        if (Checks.CHECKS) {
            Checks.check(vlist);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(format, true);
            long formatEncoded = stack.getPointerAddress();
            int iNvsnprintf = nvsnprintf(MemoryUtil.memAddressSafe(buffer), Checks.remainingSafe(buffer), formatEncoded, vlist);
            stack.setPointer(stackPointer);
            return iNvsnprintf;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
