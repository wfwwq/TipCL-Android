package org.lwjgl.system.freebsd;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/freebsd/DynamicLinkLoader.class */
public class DynamicLinkLoader {
    public static final int RTLD_LAZY = 1;
    public static final int RTLD_NOW = 2;
    public static final int RTLD_MODEMASK = 3;
    public static final int RTLD_GLOBAL = 256;
    public static final int RTLD_LOCAL = 0;
    public static final int RTLD_TRACE = 512;
    public static final int RTLD_NODELETE = 4096;
    public static final int RTLD_NOLOAD = 8192;
    public static final int RTLD_DEEPBIND = 16384;

    public static native long ndlopen(long j, int i);

    public static native long ndlerror();

    public static native long ndlsym(long j, long j2);

    public static native int ndlclose(long j);

    static {
        Library.initialize();
    }

    protected DynamicLinkLoader() {
        throw new UnsupportedOperationException();
    }

    @NativeType("void *")
    public static long dlopen(@NativeType("char const *") ByteBuffer filename, int mode) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(filename);
        }
        return ndlopen(MemoryUtil.memAddressSafe(filename), mode);
    }

    @NativeType("void *")
    public static long dlopen(@NativeType("char const *") CharSequence filename, int mode) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(filename, true);
            long filenameEncoded = filename == null ? 0L : stack.getPointerAddress();
            long jNdlopen = ndlopen(filenameEncoded, mode);
            stack.setPointer(stackPointer);
            return jNdlopen;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char *")
    public static String dlerror() {
        long __result = ndlerror();
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("void *")
    public static long dlsym(@NativeType("void *") long handle, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.check(handle);
            Checks.checkNT1(name);
        }
        return ndlsym(handle, MemoryUtil.memAddress(name));
    }

    @NativeType("void *")
    public static long dlsym(@NativeType("void *") long handle, @NativeType("char const *") CharSequence name) {
        if (Checks.CHECKS) {
            Checks.check(handle);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNdlsym = ndlsym(handle, nameEncoded);
            stack.setPointer(stackPointer);
            return jNdlsym;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int dlclose(@NativeType("void *") long handle) {
        if (Checks.CHECKS) {
            Checks.check(handle);
        }
        return ndlclose(handle);
    }
}
