package org.lwjgl.system;

import java.nio.charset.StandardCharsets;
import kotlin.UByte;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MultiReleaseTextDecoding.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MultiReleaseTextDecoding.class */
final class MultiReleaseTextDecoding {
    private MultiReleaseTextDecoding() {
    }

    static String decodeUTF8(long source, int length) {
        char c;
        if (length <= 0) {
            return "";
        }
        if (Checks.DEBUG) {
            return jdkFallback(source, length);
        }
        char[] string = length <= MemoryUtil.ARRAY_TLC_SIZE ? MemoryUtil.ARRAY_TLC_CHAR.get() : new char[length];
        int i = 0;
        int position = 0;
        while (position < length) {
            int i2 = position;
            position++;
            int b0 = MemoryUtil.UNSAFE.getByte((Object) null, source + i2) & UByte.MAX_VALUE;
            if (b0 < 128) {
                c = (char) b0;
            } else {
                position++;
                int b1 = MemoryUtil.UNSAFE.getByte((Object) null, source + position) & 63;
                if ((b0 & 224) == 192) {
                    c = (char) (((b0 & 31) << 6) | b1);
                } else {
                    position++;
                    int b2 = MemoryUtil.UNSAFE.getByte((Object) null, source + position) & 63;
                    if ((b0 & 240) == 224) {
                        c = (char) (((b0 & 15) << 12) | (b1 << 6) | b2);
                    } else {
                        position++;
                        int b3 = MemoryUtil.UNSAFE.getByte((Object) null, source + position) & 63;
                        int cp = ((b0 & 7) << 18) | (b1 << 12) | (b2 << 6) | b3;
                        if (i < length) {
                            int i3 = i;
                            i++;
                            string[i3] = (char) ((cp >>> 10) + 55232);
                        }
                        c = (char) ((cp & 1023) + 56320);
                    }
                }
            }
            if (i < length) {
                int i4 = i;
                i++;
                string[i4] = c;
            }
        }
        return new String(string, 0, Math.min(i, length));
    }

    private static String jdkFallback(long source, int length) {
        byte[] bytes = length <= MemoryUtil.ARRAY_TLC_SIZE ? MemoryUtil.ARRAY_TLC_BYTE.get() : new byte[length];
        MemoryUtil.memByteBuffer(source, length).get(bytes, 0, length);
        return new String(bytes, 0, length, StandardCharsets.UTF_8);
    }
}
