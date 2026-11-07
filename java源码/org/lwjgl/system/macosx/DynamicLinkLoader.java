package org.lwjgl.system.macosx;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/DynamicLinkLoader.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/DynamicLinkLoader.class */
public class DynamicLinkLoader {
    public static final int RTLD_LAZY = 1;
    public static final int RTLD_NOW = 2;
    public static final int RTLD_LOCAL = 4;
    public static final int RTLD_GLOBAL = 8;
    public static final int RTLD_NOLOAD = 16;
    public static final int RTLD_NODELETE = 128;
    public static final int RTLD_FIRST = 256;
    public static final long RTLD_NEXT = -1;
    public static final long RTLD_DEFAULT = -2;
    public static final long RTLD_SELF = -3;
    public static final long RTLD_MAIN_ONLY = -5;

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
    public static long dlopen(@NativeType("char const *") ByteBuffer path, int mode) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(path);
        }
        return ndlopen(MemoryUtil.memAddressSafe(path), mode);
    }

    @NativeType("void *")
    public static long dlopen(@NativeType("char const *") CharSequence path, int mode) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? 0L : stack.getPointerAddress();
            long jNdlopen = ndlopen(pathEncoded, mode);
            stack.setPointer(stackPointer);
            return jNdlopen;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char const *")
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
