package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTSeparateShaderObjects.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTSeparateShaderObjects.class */
public class EXTSeparateShaderObjects {
    public static final int GL_ACTIVE_PROGRAM_EXT = 35725;

    public static native void glUseShaderProgramEXT(@NativeType("GLenum") int i, @NativeType("GLuint") int i2);

    public static native void glActiveProgramEXT(@NativeType("GLuint") int i);

    public static native int nglCreateShaderProgramEXT(int i, long j);

    static {
        GL.initialize();
    }

    protected EXTSeparateShaderObjects() {
        throw new UnsupportedOperationException();
    }

    @NativeType("GLuint")
    public static int glCreateShaderProgramEXT(@NativeType("GLenum") int type, @NativeType("GLchar const *") ByteBuffer string) {
        if (Checks.CHECKS) {
            Checks.checkNT1(string);
        }
        return nglCreateShaderProgramEXT(type, MemoryUtil.memAddress(string));
    }

    @NativeType("GLuint")
    public static int glCreateShaderProgramEXT(@NativeType("GLenum") int type, @NativeType("GLchar const *") CharSequence string) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(string, true);
            long stringEncoded = stack.getPointerAddress();
            int iNglCreateShaderProgramEXT = nglCreateShaderProgramEXT(type, stringEncoded);
            stack.setPointer(stackPointer);
            return iNglCreateShaderProgramEXT;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
