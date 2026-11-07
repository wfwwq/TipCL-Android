package org.lwjgl.system.libc;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libc/LibCLocale.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libc/LibCLocale.class */
public class LibCLocale {
    public static final int LC_ALL;
    public static final int LC_COLLATE;
    public static final int LC_CTYPE;
    public static final int LC_MONETARY;
    public static final int LC_NUMERIC;
    public static final int LC_TIME;

    private static native int LC_ALL();

    private static native int LC_COLLATE();

    private static native int LC_CTYPE();

    private static native int LC_MONETARY();

    private static native int LC_NUMERIC();

    private static native int LC_TIME();

    public static native long nsetlocale(int i, long j);

    static {
        Library.initialize();
        LC_ALL = LC_ALL();
        LC_COLLATE = LC_COLLATE();
        LC_CTYPE = LC_CTYPE();
        LC_MONETARY = LC_MONETARY();
        LC_NUMERIC = LC_NUMERIC();
        LC_TIME = LC_TIME();
    }

    protected LibCLocale() {
        throw new UnsupportedOperationException();
    }

    @NativeType("char *")
    public static String setlocale(int category, @NativeType("char const *") ByteBuffer locale) {
        if (Checks.CHECKS) {
            Checks.checkNT1(locale);
        }
        long __result = nsetlocale(category, MemoryUtil.memAddress(locale));
        return MemoryUtil.memASCIISafe(__result);
    }

    @NativeType("char *")
    public static String setlocale(int category, @NativeType("char const *") CharSequence locale) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(locale, true);
            long localeEncoded = stack.getPointerAddress();
            long __result = nsetlocale(category, localeEncoded);
            String strMemASCIISafe = MemoryUtil.memASCIISafe(__result);
            stack.setPointer(stackPointer);
            return strMemASCIISafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
