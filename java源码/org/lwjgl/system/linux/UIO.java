package org.lwjgl.system.linux;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/UIO.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/UIO.class */
public class UIO {
    public static final int UIO_FASTIOV = 8;
    public static final int UIO_MAXIOV = 1024;
    public static final int RWF_HIPRI = 1;
    public static final int RWF_DSYNC = 2;
    public static final int RWF_SYNC = 4;
    public static final int RWF_NOWAIT = 8;
    public static final int RWF_APPEND = 16;

    public static native long nreadv(long j, int i, long j2, int i2);

    public static native long nwritev(long j, int i, long j2, int i2);

    public static native long npreadv(long j, int i, long j2, int i2, long j3);

    public static native long npwritev(long j, int i, long j2, int i2, long j3);

    public static native long nprocess_vm_readv(long j, int i, long j2, long j3, long j4, long j5, long j6);

    public static native long nprocess_vm_writev(long j, int i, long j2, long j3, long j4, long j5, long j6);

    static {
        Library.initialize();
    }

    protected UIO() {
        throw new UnsupportedOperationException();
    }

    @NativeType("ssize_t")
    public static long readv(@NativeType("int *") IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return nreadv(MemoryUtil.memAddressSafe(_errno), __fd, __iovec.address(), __count);
    }

    @NativeType("ssize_t")
    public static long writev(@NativeType("int *") IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return nwritev(MemoryUtil.memAddressSafe(_errno), __fd, __iovec.address(), __count);
    }

    @NativeType("ssize_t")
    public static long preadv(@NativeType("int *") IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count, @NativeType("off_t") long __offset) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return npreadv(MemoryUtil.memAddressSafe(_errno), __fd, __iovec.address(), __count, __offset);
    }

    @NativeType("ssize_t")
    public static long pwritev(@NativeType("int *") IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count, @NativeType("off_t") long __offset) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return npwritev(MemoryUtil.memAddressSafe(_errno), __fd, __iovec.address(), __count, __offset);
    }

    @NativeType("ssize_t")
    public static long process_vm_readv(@NativeType("int *") IntBuffer _errno, @NativeType("pid_t") int __pid, @NativeType("struct iovec const *") IOVec __lvec, @NativeType("unsigned long int") long __liovcnt, @NativeType("struct iovec const *") IOVec __rvec, @NativeType("unsigned long int") long __riovcnt, @NativeType("unsigned long int") long __flags) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return nprocess_vm_readv(MemoryUtil.memAddressSafe(_errno), __pid, __lvec.address(), __liovcnt, __rvec.address(), __riovcnt, __flags);
    }

    @NativeType("ssize_t")
    public static long process_vm_writev(@NativeType("int *") IntBuffer _errno, @NativeType("pid_t") int __pid, @NativeType("struct iovec const *") IOVec __lvec, @NativeType("unsigned long int") long __liovcnt, @NativeType("struct iovec const *") IOVec __rvec, @NativeType("unsigned long int") long __riovcnt, @NativeType("unsigned long int") long __flags) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return nprocess_vm_writev(MemoryUtil.memAddressSafe(_errno), __pid, __lvec.address(), __liovcnt, __rvec.address(), __riovcnt, __flags);
    }
}
