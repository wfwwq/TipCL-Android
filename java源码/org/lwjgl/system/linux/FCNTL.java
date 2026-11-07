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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/FCNTL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/FCNTL.class */
public class FCNTL {
    public static final int O_ACCMODE = 3;
    public static final int O_RDONLY = 0;
    public static final int O_WRONLY = 1;
    public static final int O_RDWR = 2;
    public static final int O_APPEND = 1024;
    public static final int O_ASYNC = 8192;
    public static final int O_CLOEXEC = 524288;
    public static final int O_CREAT = 64;
    public static final int O_DIRECT = 16384;
    public static final int O_DIRECTORY = 65536;
    public static final int O_DSYNC = 4096;
    public static final int O_EXCL = 128;
    public static final int O_LARGEFILE = 32768;
    public static final int O_NOATIME = 262144;
    public static final int O_NOCTTY = 256;
    public static final int O_NOFOLLOW = 131072;
    public static final int O_NONBLOCK = 2048;
    public static final int O_NDELAY = 2048;
    public static final int O_PATH = 2097152;
    public static final int O_SYNC = 1052672;
    public static final int O_TMPFILE = 4259840;
    public static final int O_TRUNC = 512;
    public static final int S_IFMT = 61440;
    public static final int S_IFBLK = 24576;
    public static final int S_IFCHR = 8192;
    public static final int S_IFIFO = 4096;
    public static final int S_IFREG = 32768;
    public static final int S_IFDIR = 16384;
    public static final int S_IFLNK = 40960;
    public static final int S_IFSOCK = 49152;
    public static final int S_IRWXU = 448;
    public static final int S_IRUSR = 256;
    public static final int S_IWUSR = 128;
    public static final int S_IXUSR = 64;
    public static final int S_IRWXG = 56;
    public static final int S_IRGRP = 32;
    public static final int S_IWGRP = 16;
    public static final int S_IXGRP = 8;
    public static final int S_IRWXO = 7;
    public static final int S_IROTH = 4;
    public static final int S_IWOTH = 2;
    public static final int S_IXOTH = 1;
    public static final int S_ISUID = 2048;
    public static final int S_ISGID = 1024;
    public static final int S_ISVTX = 512;
    public static final int F_DUPFD = 0;
    public static final int F_GETFD = 1;
    public static final int F_SETFD = 2;
    public static final int F_GETFL = 3;
    public static final int F_SETFL = 4;
    public static final int F_GETLK = 5;
    public static final int F_SETLK = 8;
    public static final int F_SETLKW = 7;
    public static final int F_SETOWN = 8;
    public static final int F_GETOWN = 9;
    public static final int F_SETSIG = 10;
    public static final int F_GETSIG = 11;
    public static final int F_SETOWN_EX = 15;
    public static final int F_GETOWN_EX = 16;
    public static final int F_OFD_GETLK = 36;
    public static final int F_OFD_SETLK = 37;
    public static final int F_OFD_SETLKW = 38;
    public static final int F_SETLEASE = 1024;
    public static final int F_GETLEASE = 1025;
    public static final int F_NOTIFY = 1026;
    public static final int F_SETPIPE_SZ = 1031;
    public static final int F_GETPIPE_SZ = 1032;
    public static final int F_ADD_SEALS = 1033;
    public static final int F_GET_SEALS = 1034;
    public static final int F_GET_RW_HINT = 1035;
    public static final int F_SET_RW_HINT = 1036;
    public static final int F_GET_FILE_RW_HINT = 1037;
    public static final int F_SET_FILE_RW_HINT = 1038;
    public static final int F_DUPFD_CLOEXEC = 1030;
    public static final int FD_CLOEXEC = 1;
    public static final int F_RDLCK = 0;
    public static final int F_WRLCK = 1;
    public static final int F_UNLCK = 2;
    public static final int F_EXLCK = 4;
    public static final int F_SHLCK = 8;
    public static final int F_OWNER_TID = 0;
    public static final int F_OWNER_PID = 1;
    public static final int F_OWNER_PGRP = 2;
    public static final int LOCK_SH = 1;
    public static final int LOCK_EX = 2;
    public static final int LOCK_NB = 4;
    public static final int LOCK_UN = 8;
    public static final int LOCK_MAND = 32;
    public static final int LOCK_READ = 64;
    public static final int LOCK_WRITE = 128;
    public static final int LOCK_RW = 192;
    public static final int DN_ACCESS = 1;
    public static final int DN_MODIFY = 2;
    public static final int DN_CREATE = 4;
    public static final int DN_DELETE = 8;
    public static final int DN_RENAME = 16;
    public static final int DN_ATTRIB = 32;
    public static final int DN_MULTISHOT = Integer.MIN_VALUE;
    public static final int F_SEAL_SEAL = 1;
    public static final int F_SEAL_SHRINK = 2;
    public static final int F_SEAL_GROW = 4;
    public static final int F_SEAL_WRITE = 8;
    public static final int F_SEAL_FUTURE_WRITE = 16;
    public static final int RWH_WRITE_LIFE_NOT_SET = 0;
    public static final int RWH_WRITE_LIFE_NONE = 1;
    public static final int RWH_WRITE_LIFE_SHORT = 2;
    public static final int RWH_WRITE_LIFE_MEDIUM = 3;
    public static final int RWH_WRITE_LIFE_LONG = 4;
    public static final int RWH_WRITE_LIFE_EXTREME = 5;

    public static native int nopen(long j, long j2, int i, int i2);

    public static native int nopenat(long j, int i, long j2, int i2, int i3);

    public static native int ncreat(long j, long j2, int i);

    public static native int nfcntl(long j, int i, int i2);

    public static native int nfcntli(long j, int i, int i2, int i3);

    public static native int nfcntlp(long j, int i, int i2, long j2);

    static {
        Library.initialize();
    }

    protected FCNTL() {
        throw new UnsupportedOperationException();
    }

    public static int open(@NativeType("int *") IntBuffer _errno, @NativeType("char const *") ByteBuffer pathname, int flags, @NativeType("mode_t") int mode) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
            Checks.checkNT1(pathname);
        }
        return nopen(MemoryUtil.memAddressSafe(_errno), MemoryUtil.memAddress(pathname), flags, mode);
    }

    public static int open(@NativeType("int *") IntBuffer _errno, @NativeType("char const *") CharSequence pathname, int flags, @NativeType("mode_t") int mode) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathname, true);
            long pathnameEncoded = stack.getPointerAddress();
            int iNopen = nopen(MemoryUtil.memAddressSafe(_errno), pathnameEncoded, flags, mode);
            stack.setPointer(stackPointer);
            return iNopen;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int openat(@NativeType("int *") IntBuffer _errno, int dirfd, @NativeType("char const *") ByteBuffer pathname, int flags, @NativeType("mode_t") int mode) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
            Checks.checkNT1(pathname);
        }
        return nopenat(MemoryUtil.memAddressSafe(_errno), dirfd, MemoryUtil.memAddress(pathname), flags, mode);
    }

    public static int openat(@NativeType("int *") IntBuffer _errno, int dirfd, @NativeType("char const *") CharSequence pathname, int flags, @NativeType("mode_t") int mode) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathname, true);
            long pathnameEncoded = stack.getPointerAddress();
            int iNopenat = nopenat(MemoryUtil.memAddressSafe(_errno), dirfd, pathnameEncoded, flags, mode);
            stack.setPointer(stackPointer);
            return iNopenat;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int creat(@NativeType("int *") IntBuffer _errno, @NativeType("char const *") ByteBuffer pathname, @NativeType("mode_t") int mode) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
            Checks.checkNT1(pathname);
        }
        return ncreat(MemoryUtil.memAddressSafe(_errno), MemoryUtil.memAddress(pathname), mode);
    }

    public static int creat(@NativeType("int *") IntBuffer _errno, @NativeType("char const *") CharSequence pathname, @NativeType("mode_t") int mode) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathname, true);
            long pathnameEncoded = stack.getPointerAddress();
            int iNcreat = ncreat(MemoryUtil.memAddressSafe(_errno), pathnameEncoded, mode);
            stack.setPointer(stackPointer);
            return iNcreat;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int fcntl(@NativeType("int *") IntBuffer _errno, int fd, int cmd) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return nfcntl(MemoryUtil.memAddressSafe(_errno), fd, cmd);
    }

    public static int fcntli(@NativeType("int *") IntBuffer _errno, int fd, int cmd, int arg) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return nfcntli(MemoryUtil.memAddressSafe(_errno), fd, cmd, arg);
    }

    public static int fcntlp(@NativeType("int *") IntBuffer _errno, int fd, int cmd, @NativeType("void *") long arg) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
            Checks.check(arg);
        }
        return nfcntlp(MemoryUtil.memAddressSafe(_errno), fd, cmd, arg);
    }
}
