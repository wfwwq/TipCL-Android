package org.lwjgl.system.linux;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/UNISTD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/UNISTD.class */
public class UNISTD {
    public static final int _SC_OPEN_MAX = 4;
    public static final int _SC_PAGE_SIZE = 30;
    public static final int _SC_IOV_MAX = 60;

    public static native int nclose(long j, int i);

    public static native long nsysconf(long j, int i);

    public static native long nread(long j, int i, long j2, long j3);

    @NativeType("pid_t")
    public static native int getpid();

    @NativeType("pid_t")
    public static native int getppid();

    @NativeType("pid_t")
    public static native int gettid();

    static {
        Library.initialize();
    }

    protected UNISTD() {
        throw new UnsupportedOperationException();
    }

    public static int close(@NativeType("int *") IntBuffer _errno, int fd) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return nclose(MemoryUtil.memAddressSafe(_errno), fd);
    }

    public static long sysconf(@NativeType("int *") IntBuffer _errno, int name) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return nsysconf(MemoryUtil.memAddressSafe(_errno), name);
    }

    @NativeType("ssize_t")
    public static long read(@NativeType("int *") IntBuffer _errno, int fd, @NativeType("void *") ByteBuffer buf) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return nread(MemoryUtil.memAddressSafe(_errno), fd, MemoryUtil.memAddress(buf), buf.remaining());
    }
}
