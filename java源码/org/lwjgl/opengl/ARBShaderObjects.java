package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBShaderObjects.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBShaderObjects.class */
public class ARBShaderObjects {
    public static final int GL_PROGRAM_OBJECT_ARB = 35648;
    public static final int GL_OBJECT_TYPE_ARB = 35662;
    public static final int GL_OBJECT_SUBTYPE_ARB = 35663;
    public static final int GL_OBJECT_DELETE_STATUS_ARB = 35712;
    public static final int GL_OBJECT_COMPILE_STATUS_ARB = 35713;
    public static final int GL_OBJECT_LINK_STATUS_ARB = 35714;
    public static final int GL_OBJECT_VALIDATE_STATUS_ARB = 35715;
    public static final int GL_OBJECT_INFO_LOG_LENGTH_ARB = 35716;
    public static final int GL_OBJECT_ATTACHED_OBJECTS_ARB = 35717;
    public static final int GL_OBJECT_ACTIVE_UNIFORMS_ARB = 35718;
    public static final int GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = 35719;
    public static final int GL_OBJECT_SHADER_SOURCE_LENGTH_ARB = 35720;
    public static final int GL_SHADER_OBJECT_ARB = 35656;
    public static final int GL_FLOAT_VEC2_ARB = 35664;
    public static final int GL_FLOAT_VEC3_ARB = 35665;
    public static final int GL_FLOAT_VEC4_ARB = 35666;
    public static final int GL_INT_VEC2_ARB = 35667;
    public static final int GL_INT_VEC3_ARB = 35668;
    public static final int GL_INT_VEC4_ARB = 35669;
    public static final int GL_BOOL_ARB = 35670;
    public static final int GL_BOOL_VEC2_ARB = 35671;
    public static final int GL_BOOL_VEC3_ARB = 35672;
    public static final int GL_BOOL_VEC4_ARB = 35673;
    public static final int GL_FLOAT_MAT2_ARB = 35674;
    public static final int GL_FLOAT_MAT3_ARB = 35675;
    public static final int GL_FLOAT_MAT4_ARB = 35676;
    public static final int GL_SAMPLER_1D_ARB = 35677;
    public static final int GL_SAMPLER_2D_ARB = 35678;
    public static final int GL_SAMPLER_3D_ARB = 35679;
    public static final int GL_SAMPLER_CUBE_ARB = 35680;
    public static final int GL_SAMPLER_1D_SHADOW_ARB = 35681;
    public static final int GL_SAMPLER_2D_SHADOW_ARB = 35682;
    public static final int GL_SAMPLER_2D_RECT_ARB = 35683;
    public static final int GL_SAMPLER_2D_RECT_SHADOW_ARB = 35684;

    public static native void glDeleteObjectARB(@NativeType("GLhandleARB") int i);

    @NativeType("GLhandleARB")
    public static native int glGetHandleARB(@NativeType("GLenum") int i);

    public static native void glDetachObjectARB(@NativeType("GLhandleARB") int i, @NativeType("GLhandleARB") int i2);

    @NativeType("GLhandleARB")
    public static native int glCreateShaderObjectARB(@NativeType("GLenum") int i);

    public static native void nglShaderSourceARB(int i, int i2, long j, long j2);

    public static native void glCompileShaderARB(@NativeType("GLhandleARB") int i);

    @NativeType("GLhandleARB")
    public static native int glCreateProgramObjectARB();

    public static native void glAttachObjectARB(@NativeType("GLhandleARB") int i, @NativeType("GLhandleARB") int i2);

    public static native void glLinkProgramARB(@NativeType("GLhandleARB") int i);

    public static native void glUseProgramObjectARB(@NativeType("GLhandleARB") int i);

    public static native void glValidateProgramARB(@NativeType("GLhandleARB") int i);

    public static native void glUniform1fARB(@NativeType("GLint") int i, @NativeType("GLfloat") float f);

    public static native void glUniform2fARB(@NativeType("GLint") int i, @NativeType("GLfloat") float f, @NativeType("GLfloat") float f2);

    public static native void glUniform3fARB(@NativeType("GLint") int i, @NativeType("GLfloat") float f, @NativeType("GLfloat") float f2, @NativeType("GLfloat") float f3);

    public static native void glUniform4fARB(@NativeType("GLint") int i, @NativeType("GLfloat") float f, @NativeType("GLfloat") float f2, @NativeType("GLfloat") float f3, @NativeType("GLfloat") float f4);

    public static native void glUniform1iARB(@NativeType("GLint") int i, @NativeType("GLint") int i2);

    public static native void glUniform2iARB(@NativeType("GLint") int i, @NativeType("GLint") int i2, @NativeType("GLint") int i3);

    public static native void glUniform3iARB(@NativeType("GLint") int i, @NativeType("GLint") int i2, @NativeType("GLint") int i3, @NativeType("GLint") int i4);

    public static native void glUniform4iARB(@NativeType("GLint") int i, @NativeType("GLint") int i2, @NativeType("GLint") int i3, @NativeType("GLint") int i4, @NativeType("GLint") int i5);

    public static native void nglUniform1fvARB(int i, int i2, long j);

    public static native void nglUniform2fvARB(int i, int i2, long j);

    public static native void nglUniform3fvARB(int i, int i2, long j);

    public static native void nglUniform4fvARB(int i, int i2, long j);

    public static native void nglUniform1ivARB(int i, int i2, long j);

    public static native void nglUniform2ivARB(int i, int i2, long j);

    public static native void nglUniform3ivARB(int i, int i2, long j);

    public static native void nglUniform4ivARB(int i, int i2, long j);

    public static native void nglUniformMatrix2fvARB(int i, int i2, boolean z, long j);

    public static native void nglUniformMatrix3fvARB(int i, int i2, boolean z, long j);

    public static native void nglUniformMatrix4fvARB(int i, int i2, boolean z, long j);

    public static native void nglGetObjectParameterfvARB(int i, int i2, long j);

    public static native void nglGetObjectParameterivARB(int i, int i2, long j);

    public static native void nglGetInfoLogARB(int i, int i2, long j, long j2);

    public static native void nglGetAttachedObjectsARB(int i, int i2, long j, long j2);

    public static native int nglGetUniformLocationARB(int i, long j);

    public static native void nglGetActiveUniformARB(int i, int i2, int i3, long j, long j2, long j3, long j4);

    public static native void nglGetUniformfvARB(int i, int i2, long j);

    public static native void nglGetUniformivARB(int i, int i2, long j);

    public static native void nglGetShaderSourceARB(int i, int i2, long j, long j2);

    public static void glShaderSourceARB(int shader, ByteBuffer string) {
        byte[] b = new byte[string.remaining()];
        string.get(b);
        glShaderSourceARB(shader, new String(b));
    }

    public static void glUniform1ARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        glUniform1fvARB(location, value);
    }

    public static void glUniform2ARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        glUniform2fvARB(location, value);
    }

    public static void glUniform3ARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        glUniform3fvARB(location, value);
    }

    public static void glUniform4ARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        glUniform4fvARB(location, value);
    }

    public static void glUniform1ARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        glUniform1ivARB(location, value);
    }

    public static void glUniform2ARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        glUniform2ivARB(location, value);
    }

    public static void glUniform3ARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        glUniform3ivARB(location, value);
    }

    public static void glUniform4ARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        glUniform4ivARB(location, value);
    }

    public static void glUniformMatrix2ARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        glUniformMatrix2fvARB(location, transpose, value);
    }

    public static void glUniformMatrix3ARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        glUniformMatrix3fvARB(location, transpose, value);
    }

    public static void glUniformMatrix4ARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        glUniformMatrix4fvARB(location, transpose, value);
    }

    public static void glGetObjectParameterARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        glGetObjectParameterfvARB(obj, pname, params);
    }

    public static void glGetObjectParameterARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        glGetObjectParameterivARB(obj, pname, params);
    }

    public static void glGetUniformARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        glGetUniformfvARB(programObj, location, params);
    }

    public static void glGetUniformARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        glGetUniformivARB(programObj, location, params);
    }

    static {
        GL.initialize();
    }

    protected ARBShaderObjects() {
        throw new UnsupportedOperationException();
    }

    public static void glShaderSourceARB(@NativeType("GLhandleARB") int shaderObj, @NativeType("GLcharARB const **") PointerBuffer string, @NativeType("GLint const *") IntBuffer length) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) length, string.remaining());
        }
        nglShaderSourceARB(shaderObj, string.remaining(), MemoryUtil.memAddress(string), MemoryUtil.memAddressSafe(length));
    }

    public static void glShaderSourceARB(@NativeType("GLhandleARB") int shaderObj, @NativeType("GLcharARB const **") CharSequence... string) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long stringAddress = APIUtil.apiArrayi(stack, MemoryUtil::memUTF8, string);
            nglShaderSourceARB(shaderObj, string.length, stringAddress, stringAddress - (string.length << 2));
            APIUtil.apiArrayFree(stringAddress, string.length);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glShaderSourceARB(@NativeType("GLhandleARB") int shaderObj, @NativeType("GLcharARB const **") CharSequence string) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long stringAddress = APIUtil.apiArrayi(stack, MemoryUtil::memUTF8, string);
            nglShaderSourceARB(shaderObj, 1, stringAddress, stringAddress - 4);
            APIUtil.apiArrayFree(stringAddress, 1);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glUniform1fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform1fvARB(location, value.remaining(), MemoryUtil.memAddress(value));
    }

    public static void glUniform2fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform2fvARB(location, value.remaining() >> 1, MemoryUtil.memAddress(value));
    }

    public static void glUniform3fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform3fvARB(location, value.remaining() / 3, MemoryUtil.memAddress(value));
    }

    public static void glUniform4fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform4fvARB(location, value.remaining() >> 2, MemoryUtil.memAddress(value));
    }

    public static void glUniform1ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform1ivARB(location, value.remaining(), MemoryUtil.memAddress(value));
    }

    public static void glUniform2ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform2ivARB(location, value.remaining() >> 1, MemoryUtil.memAddress(value));
    }

    public static void glUniform3ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform3ivARB(location, value.remaining() / 3, MemoryUtil.memAddress(value));
    }

    public static void glUniform4ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform4ivARB(location, value.remaining() >> 2, MemoryUtil.memAddress(value));
    }

    public static void glUniformMatrix2fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2fvARB(location, value.remaining() >> 2, transpose, MemoryUtil.memAddress(value));
    }

    public static void glUniformMatrix3fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3fvARB(location, value.remaining() / 9, transpose, MemoryUtil.memAddress(value));
    }

    public static void glUniformMatrix4fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4fvARB(location, value.remaining() >> 4, transpose, MemoryUtil.memAddress(value));
    }

    public static void glGetObjectParameterfvARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetObjectParameterfvARB(obj, pname, MemoryUtil.memAddress(params));
    }

    public static void glGetObjectParameterivARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetObjectParameterivARB(obj, pname, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetObjectParameteriARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetObjectParameterivARB(obj, pname, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetInfoLogARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei *") IntBuffer length, @NativeType("GLcharARB *") ByteBuffer infoLog) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) length, 1);
        }
        nglGetInfoLogARB(obj, infoLog.remaining(), MemoryUtil.memAddressSafe(length), MemoryUtil.memAddress(infoLog));
    }

    @NativeType("void")
    public static String glGetInfoLogARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei") int maxLength) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        ByteBuffer infoLog = MemoryUtil.memAlloc(maxLength);
        try {
            IntBuffer length = stack.ints(0);
            nglGetInfoLogARB(obj, maxLength, MemoryUtil.memAddress(length), MemoryUtil.memAddress(infoLog));
            String strMemUTF8 = MemoryUtil.memUTF8(infoLog, length.get(0));
            MemoryUtil.memFree(infoLog);
            stack.setPointer(stackPointer);
            return strMemUTF8;
        } catch (Throwable th) {
            MemoryUtil.memFree(infoLog);
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void")
    public static String glGetInfoLogARB(@NativeType("GLhandleARB") int obj) {
        return glGetInfoLogARB(obj, glGetObjectParameteriARB(obj, 35716));
    }

    public static void glGetAttachedObjectsARB(@NativeType("GLhandleARB") int containerObj, @NativeType("GLsizei *") IntBuffer count, @NativeType("GLhandleARB *") IntBuffer obj) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) count, 1);
        }
        nglGetAttachedObjectsARB(containerObj, obj.remaining(), MemoryUtil.memAddressSafe(count), MemoryUtil.memAddress(obj));
    }

    @NativeType("GLint")
    public static int glGetUniformLocationARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLcharARB const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nglGetUniformLocationARB(programObj, MemoryUtil.memAddress(name));
    }

    @NativeType("GLint")
    public static int glGetUniformLocationARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLcharARB const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            int iNglGetUniformLocationARB = nglGetUniformLocationARB(programObj, nameEncoded);
            stack.setPointer(stackPointer);
            return iNglGetUniformLocationARB;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetActiveUniformARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLcharARB *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) length, 1);
            Checks.check((Buffer) size, 1);
            Checks.check((Buffer) type, 1);
        }
        nglGetActiveUniformARB(programObj, index, name.remaining(), MemoryUtil.memAddressSafe(length), MemoryUtil.memAddress(size), MemoryUtil.memAddress(type), MemoryUtil.memAddress(name));
    }

    @NativeType("void")
    public static String glGetActiveUniformARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) size, 1);
            Checks.check((Buffer) type, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(maxLength);
            nglGetActiveUniformARB(programObj, index, maxLength, MemoryUtil.memAddress(length), MemoryUtil.memAddress(size), MemoryUtil.memAddress(type), MemoryUtil.memAddress(name));
            String strMemUTF8 = MemoryUtil.memUTF8(name, length.get(0));
            stack.setPointer(stackPointer);
            return strMemUTF8;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void")
    public static String glGetActiveUniformARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveUniformARB(programObj, index, glGetObjectParameteriARB(programObj, 35719), size, type);
    }

    public static void glGetUniformfvARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetUniformfvARB(programObj, location, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static float glGetUniformfARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetUniformfvARB(programObj, location, MemoryUtil.memAddress(params));
            float f = params.get(0);
            stack.setPointer(stackPointer);
            return f;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetUniformivARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetUniformivARB(programObj, location, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetUniformiARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformivARB(programObj, location, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetShaderSourceARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei *") IntBuffer length, @NativeType("GLcharARB *") ByteBuffer source) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) length, 1);
        }
        nglGetShaderSourceARB(obj, source.remaining(), MemoryUtil.memAddressSafe(length), MemoryUtil.memAddress(source));
    }

    @NativeType("void")
    public static String glGetShaderSourceARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei") int maxLength) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        ByteBuffer source = MemoryUtil.memAlloc(maxLength);
        try {
            IntBuffer length = stack.ints(0);
            nglGetShaderSourceARB(obj, maxLength, MemoryUtil.memAddress(length), MemoryUtil.memAddress(source));
            String strMemUTF8 = MemoryUtil.memUTF8(source, length.get(0));
            MemoryUtil.memFree(source);
            stack.setPointer(stackPointer);
            return strMemUTF8;
        } catch (Throwable th) {
            MemoryUtil.memFree(source);
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void")
    public static String glGetShaderSourceARB(@NativeType("GLhandleARB") int obj) {
        return glGetShaderSourceARB(obj, glGetObjectParameteriARB(obj, 35720));
    }

    public static void glShaderSourceARB(@NativeType("GLhandleARB") int shaderObj, @NativeType("GLcharARB const **") PointerBuffer string, @NativeType("GLint const *") int[] length) {
        long __functionAddress = GL.getICD().glShaderSourceARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(length, string.remaining());
        }
        JNI.callPPV(shaderObj, string.remaining(), MemoryUtil.memAddress(string), length, __functionAddress);
    }

    public static void glUniform1fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform1fvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length, value, __functionAddress);
    }

    public static void glUniform2fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform2fvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length >> 1, value, __functionAddress);
    }

    public static void glUniform3fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform3fvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length / 3, value, __functionAddress);
    }

    public static void glUniform4fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform4fvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length >> 2, value, __functionAddress);
    }

    public static void glUniform1ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform1ivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length, value, __functionAddress);
    }

    public static void glUniform2ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform2ivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length >> 1, value, __functionAddress);
    }

    public static void glUniform3ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform3ivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length / 3, value, __functionAddress);
    }

    public static void glUniform4ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform4ivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length >> 2, value, __functionAddress);
    }

    public static void glUniformMatrix2fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2fvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length >> 2, transpose, value, __functionAddress);
    }

    public static void glUniformMatrix3fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3fvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length / 9, transpose, value, __functionAddress);
    }

    public static void glUniformMatrix4fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4fvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length >> 4, transpose, value, __functionAddress);
    }

    public static void glGetObjectParameterfvARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetObjectParameterfvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(obj, pname, params, __functionAddress);
    }

    public static void glGetObjectParameterivARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetObjectParameterivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(obj, pname, params, __functionAddress);
    }

    public static void glGetInfoLogARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei *") int[] length, @NativeType("GLcharARB *") ByteBuffer infoLog) {
        long __functionAddress = GL.getICD().glGetInfoLogARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(length, 1);
        }
        JNI.callPPV(obj, infoLog.remaining(), length, MemoryUtil.memAddress(infoLog), __functionAddress);
    }

    public static void glGetAttachedObjectsARB(@NativeType("GLhandleARB") int containerObj, @NativeType("GLsizei *") int[] count, @NativeType("GLhandleARB *") int[] obj) {
        long __functionAddress = GL.getICD().glGetAttachedObjectsARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(count, 1);
        }
        JNI.callPPV(containerObj, obj.length, count, obj, __functionAddress);
    }

    public static void glGetActiveUniformARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLcharARB *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveUniformARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(length, 1);
            Checks.check(size, 1);
            Checks.check(type, 1);
        }
        JNI.callPPPPV(programObj, index, name.remaining(), length, size, type, MemoryUtil.memAddress(name), __functionAddress);
    }

    public static void glGetUniformfvARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetUniformfvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(programObj, location, params, __functionAddress);
    }

    public static void glGetUniformivARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(programObj, location, params, __functionAddress);
    }

    public static void glGetShaderSourceARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei *") int[] length, @NativeType("GLcharARB *") ByteBuffer source) {
        long __functionAddress = GL.getICD().glGetShaderSourceARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(length, 1);
        }
        JNI.callPPV(obj, source.remaining(), length, MemoryUtil.memAddress(source), __functionAddress);
    }
}
