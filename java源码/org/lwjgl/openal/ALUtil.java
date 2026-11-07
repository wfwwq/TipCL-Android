package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.system.MemoryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/ALUtil.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/ALUtil.class */
public final class ALUtil {
    private ALUtil() {
    }

    public static List<String> getStringList(long deviceHandle, int token) {
        long __result = ALC10.nalcGetString(deviceHandle, token);
        if (__result == 0) {
            return null;
        }
        ByteBuffer buffer = MemoryUtil.memByteBuffer(__result, 2147483639);
        List<String> strings = new ArrayList<>();
        int offset = 0;
        while (true) {
            if (buffer.get() == 0) {
                int limit = buffer.position() - 1;
                if (limit != offset) {
                    strings.add(MemoryUtil.memUTF8(buffer, limit - offset, offset));
                    offset = buffer.position();
                } else {
                    return strings;
                }
            }
        }
    }
}
