package org.lwjgl.system;

import java.nio.ByteBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/SharedLibraryUtil.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/SharedLibraryUtil.class */
public final class SharedLibraryUtil {
    private static native int getLibraryPath(long j, long j2, int i);

    private SharedLibraryUtil() {
    }

    public static String getLibraryPath(long pLib) {
        int maxLen = 256;
        ByteBuffer buffer = MemoryUtil.memAlloc(256);
        while (true) {
            try {
                int len = getLibraryPath(pLib, MemoryUtil.memAddress(buffer), maxLen);
                if (len != 0) {
                    if (len < maxLen) {
                        String strMemUTF8 = MemoryUtil.memUTF8(buffer, len - 1);
                        MemoryUtil.memFree(buffer);
                        return strMemUTF8;
                    }
                    int i = (maxLen * 3) / 2;
                    maxLen = i;
                    buffer = MemoryUtil.memRealloc(buffer, i);
                } else {
                    return null;
                }
            } finally {
                MemoryUtil.memFree(buffer);
            }
        }
    }
}
