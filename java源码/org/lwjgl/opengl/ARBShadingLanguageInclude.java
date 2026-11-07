package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBShadingLanguageInclude.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBShadingLanguageInclude.class */
public class ARBShadingLanguageInclude {
    public static final int GL_SHADER_INCLUDE_ARB = 36270;
    public static final int GL_NAMED_STRING_LENGTH_ARB = 36329;
    public static final int GL_NAMED_STRING_TYPE_ARB = 36330;

    public static native void nglNamedStringARB(int i, int i2, long j, int i3, long j2);

    public static native void nglDeleteNamedStringARB(int i, long j);

    public static native void nglCompileShaderIncludeARB(int i, int i2, long j, long j2);

    public static native boolean nglIsNamedStringARB(int i, long j);

    public static native void nglGetNamedStringARB(int i, long j, int i2, long j2, long j3);

    public static native void nglGetNamedStringivARB(int i, long j, int i2, long j2);

    static {
        GL.initialize();
    }

    protected ARBShadingLanguageInclude() {
        throw new UnsupportedOperationException();
    }

    public static void glNamedStringARB(@NativeType("GLenum") int type, @NativeType("GLchar const *") ByteBuffer name, @NativeType("GLchar const *") ByteBuffer string) {
        nglNamedStringARB(type, name.remaining(), MemoryUtil.memAddress(name), string.remaining(), MemoryUtil.memAddress(string));
    }

    public static void glNamedStringARB(@NativeType("GLenum") int type, @NativeType("GLchar const *") CharSequence name, @NativeType("GLchar const *") CharSequence string) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nglNamedStringARB(type, nameEncodedLength, nameEncoded, stringEncodedLength, stringEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glDeleteNamedStringARB(@NativeType("GLchar const *") ByteBuffer name) {
        nglDeleteNamedStringARB(name.remaining(), MemoryUtil.memAddress(name));
    }

    public static void glDeleteNamedStringARB(@NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            nglDeleteNamedStringARB(nameEncodedLength, nameEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glCompileShaderIncludeARB(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer path, @NativeType("GLint const *") IntBuffer length) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) length, path.remaining());
        }
        nglCompileShaderIncludeARB(shader, path.remaining(), MemoryUtil.memAddress(path), MemoryUtil.memAddressSafe(length));
    }

    @NativeType("GLboolean")
    public static boolean glIsNamedStringARB(@NativeType("GLchar const *") ByteBuffer name) {
        return nglIsNamedStringARB(name.remaining(), MemoryUtil.memAddress(name));
    }

    @NativeType("GLboolean")
    public static boolean glIsNamedStringARB(@NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            boolean zNglIsNamedStringARB = nglIsNamedStringARB(nameEncodedLength, nameEncoded);
            stack.setPointer(stackPointer);
            return zNglIsNamedStringARB;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetNamedStringARB(@NativeType("GLchar const *") ByteBuffer name, @NativeType("GLint *") IntBuffer stringlen, @NativeType("GLchar *") ByteBuffer string) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) stringlen, 1);
        }
        nglGetNamedStringARB(name.remaining(), MemoryUtil.memAddress(name), string.remaining(), MemoryUtil.memAddressSafe(stringlen), MemoryUtil.memAddress(string));
    }

    public static void glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLint *") IntBuffer stringlen, @NativeType("GLchar *") ByteBuffer string) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) stringlen, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            nglGetNamedStringARB(nameEncodedLength, nameEncoded, string.remaining(), MemoryUtil.memAddressSafe(stringlen), MemoryUtil.memAddress(string));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void")
    public static String glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            IntBuffer stringlen = stack.ints(0);
            ByteBuffer string = stack.malloc(bufSize);
            nglGetNamedStringARB(nameEncodedLength, nameEncoded, bufSize, MemoryUtil.memAddress(stringlen), MemoryUtil.memAddress(string));
            String strMemUTF8 = MemoryUtil.memUTF8(string, stringlen.get(0));
            stack.setPointer(stackPointer);
            return strMemUTF8;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void")
    public static String glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name) {
        return glGetNamedStringARB(name, glGetNamedStringiARB(name, GL_NAMED_STRING_LENGTH_ARB));
    }

    public static void glGetNamedStringivARB(@NativeType("GLchar const *") ByteBuffer name, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetNamedStringivARB(name.remaining(), MemoryUtil.memAddress(name), pname, MemoryUtil.memAddress(params));
    }

    public static void glGetNamedStringivARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            nglGetNamedStringivARB(nameEncodedLength, nameEncoded, pname, MemoryUtil.memAddress(params));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void")
    public static int glGetNamedStringiARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLenum") int pname) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            IntBuffer params = stack.callocInt(1);
            nglGetNamedStringivARB(nameEncodedLength, nameEncoded, pname, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glCompileShaderIncludeARB(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer path, @NativeType("GLint const *") int[] length) {
        long __functionAddress = GL.getICD().glCompileShaderIncludeARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(length, path.remaining());
        }
        JNI.callPPV(shader, path.remaining(), MemoryUtil.memAddress(path), length, __functionAddress);
    }

    public static void glGetNamedStringARB(@NativeType("GLchar const *") ByteBuffer name, @NativeType("GLint *") int[] stringlen, @NativeType("GLchar *") ByteBuffer string) {
        long __functionAddress = GL.getICD().glGetNamedStringARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(stringlen, 1);
        }
        JNI.callPPPV(name.remaining(), MemoryUtil.memAddress(name), string.remaining(), stringlen, MemoryUtil.memAddress(string), __functionAddress);
    }

    public static void glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLint *") int[] stringlen, @NativeType("GLchar *") ByteBuffer string) {
        long __functionAddress = GL.getICD().glGetNamedStringARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(stringlen, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            JNI.callPPPV(nameEncodedLength, nameEncoded, string.remaining(), stringlen, MemoryUtil.memAddress(string), __functionAddress);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetNamedStringivARB(@NativeType("GLchar const *") ByteBuffer name, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedStringivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPPV(name.remaining(), MemoryUtil.memAddress(name), pname, params, __functionAddress);
    }

    public static void glGetNamedStringivARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedStringivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            JNI.callPPV(nameEncodedLength, nameEncoded, pname, params, __functionAddress);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
