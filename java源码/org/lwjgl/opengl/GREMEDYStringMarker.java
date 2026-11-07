package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GREMEDYStringMarker.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GREMEDYStringMarker.class */
public class GREMEDYStringMarker {
    public static native void nglStringMarkerGREMEDY(int i, long j);

    static {
        GL.initialize();
    }

    protected GREMEDYStringMarker() {
        throw new UnsupportedOperationException();
    }

    public static void glStringMarkerGREMEDY(@NativeType("GLchar const *") ByteBuffer string) {
        nglStringMarkerGREMEDY(string.remaining(), MemoryUtil.memAddress(string));
    }

    public static void glStringMarkerGREMEDY(@NativeType("GLchar const *") CharSequence string) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nglStringMarkerGREMEDY(stringEncodedLength, stringEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
