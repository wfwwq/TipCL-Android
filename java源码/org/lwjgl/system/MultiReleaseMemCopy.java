package org.lwjgl.system;

import org.lwjgl.system.libc.LibCString;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MultiReleaseMemCopy.class */
final class MultiReleaseMemCopy {
    private MultiReleaseMemCopy() {
    }

    static void copy(long src, long dst, long bytes) {
        if (bytes <= 160) {
            if (Pointer.BITS64 && ((src | dst) & 7) == 0) {
                MemoryUtil.memCopyAligned64(src, dst, ((int) bytes) & 255);
                return;
            } else {
                MemoryUtil.UNSAFE.copyMemory((Object) null, src, (Object) null, dst, bytes);
                return;
            }
        }
        LibCString.nmemcpy(dst, src, bytes);
    }
}
