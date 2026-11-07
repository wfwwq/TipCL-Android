package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTDebugMarker.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTDebugMarker.class */
public class EXTDebugMarker {
    public static native void nglInsertEventMarkerEXT(int i, long j);

    public static native void nglPushGroupMarkerEXT(int i, long j);

    public static native void glPopGroupMarkerEXT();

    static {
        GL.initialize();
    }

    protected EXTDebugMarker() {
        throw new UnsupportedOperationException();
    }

    public static void glInsertEventMarkerEXT(@NativeType("GLchar const *") ByteBuffer marker) {
        nglInsertEventMarkerEXT(marker.remaining(), MemoryUtil.memAddress(marker));
    }

    public static void glInsertEventMarkerEXT(@NativeType("GLchar const *") CharSequence marker) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int markerEncodedLength = stack.nUTF8(marker, false);
            long markerEncoded = stack.getPointerAddress();
            nglInsertEventMarkerEXT(markerEncodedLength, markerEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glPushGroupMarkerEXT(@NativeType("GLchar const *") ByteBuffer marker) {
        nglPushGroupMarkerEXT(marker.remaining(), MemoryUtil.memAddress(marker));
    }

    public static void glPushGroupMarkerEXT(@NativeType("GLchar const *") CharSequence marker) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int markerEncodedLength = stack.nUTF8(marker, false);
            long markerEncoded = stack.getPointerAddress();
            nglPushGroupMarkerEXT(markerEncodedLength, markerEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
