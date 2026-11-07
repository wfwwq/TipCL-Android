package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTGPUShader4.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTGPUShader4.class */
public class EXTGPUShader4 {
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 35069;
    public static final int GL_SAMPLER_1D_ARRAY_EXT = 36288;
    public static final int GL_SAMPLER_2D_ARRAY_EXT = 36289;
    public static final int GL_SAMPLER_BUFFER_EXT = 36290;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 36291;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 36292;
    public static final int GL_SAMPLER_CUBE_SHADOW_EXT = 36293;
    public static final int GL_UNSIGNED_INT_VEC2_EXT = 36294;
    public static final int GL_UNSIGNED_INT_VEC3_EXT = 36295;
    public static final int GL_UNSIGNED_INT_VEC4_EXT = 36296;
    public static final int GL_INT_SAMPLER_1D_EXT = 36297;
    public static final int GL_INT_SAMPLER_2D_EXT = 36298;
    public static final int GL_INT_SAMPLER_3D_EXT = 36299;
    public static final int GL_INT_SAMPLER_CUBE_EXT = 36300;
    public static final int GL_INT_SAMPLER_2D_RECT_EXT = 36301;
    public static final int GL_INT_SAMPLER_1D_ARRAY_EXT = 36302;
    public static final int GL_INT_SAMPLER_2D_ARRAY_EXT = 36303;
    public static final int GL_INT_SAMPLER_BUFFER_EXT = 36304;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_EXT = 36305;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_EXT = 36306;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D_EXT = 36307;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_EXT = 36308;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT = 36309;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 36310;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 36311;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 36312;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 35076;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 35077;

    public static native void glVertexAttribI1iEXT(@NativeType("GLuint") int i, @NativeType("GLint") int i2);

    public static native void glVertexAttribI2iEXT(@NativeType("GLuint") int i, @NativeType("GLint") int i2, @NativeType("GLint") int i3);

    public static native void glVertexAttribI3iEXT(@NativeType("GLuint") int i, @NativeType("GLint") int i2, @NativeType("GLint") int i3, @NativeType("GLint") int i4);

    public static native void glVertexAttribI4iEXT(@NativeType("GLuint") int i, @NativeType("GLint") int i2, @NativeType("GLint") int i3, @NativeType("GLint") int i4, @NativeType("GLint") int i5);

    public static native void glVertexAttribI1uiEXT(@NativeType("GLuint") int i, @NativeType("GLuint") int i2);

    public static native void glVertexAttribI2uiEXT(@NativeType("GLuint") int i, @NativeType("GLuint") int i2, @NativeType("GLuint") int i3);

    public static native void glVertexAttribI3uiEXT(@NativeType("GLuint") int i, @NativeType("GLint") int i2, @NativeType("GLint") int i3, @NativeType("GLint") int i4);

    public static native void glVertexAttribI4uiEXT(@NativeType("GLuint") int i, @NativeType("GLint") int i2, @NativeType("GLint") int i3, @NativeType("GLint") int i4, @NativeType("GLint") int i5);

    public static native void nglVertexAttribI1ivEXT(int i, long j);

    public static native void nglVertexAttribI2ivEXT(int i, long j);

    public static native void nglVertexAttribI3ivEXT(int i, long j);

    public static native void nglVertexAttribI4ivEXT(int i, long j);

    public static native void nglVertexAttribI1uivEXT(int i, long j);

    public static native void nglVertexAttribI2uivEXT(int i, long j);

    public static native void nglVertexAttribI3uivEXT(int i, long j);

    public static native void nglVertexAttribI4uivEXT(int i, long j);

    public static native void nglVertexAttribI4bvEXT(int i, long j);

    public static native void nglVertexAttribI4svEXT(int i, long j);

    public static native void nglVertexAttribI4ubvEXT(int i, long j);

    public static native void nglVertexAttribI4usvEXT(int i, long j);

    public static native void nglVertexAttribIPointerEXT(int i, int i2, int i3, int i4, long j);

    public static native void nglGetVertexAttribIivEXT(int i, int i2, long j);

    public static native void nglGetVertexAttribIuivEXT(int i, int i2, long j);

    public static native void nglGetUniformuivEXT(int i, int i2, long j);

    public static native void nglBindFragDataLocationEXT(int i, int i2, long j);

    public static native int nglGetFragDataLocationEXT(int i, long j);

    public static native void glUniform1uiEXT(@NativeType("GLint") int i, @NativeType("GLuint") int i2);

    public static native void glUniform2uiEXT(@NativeType("GLint") int i, @NativeType("GLuint") int i2, @NativeType("GLuint") int i3);

    public static native void glUniform3uiEXT(@NativeType("GLint") int i, @NativeType("GLuint") int i2, @NativeType("GLuint") int i3, @NativeType("GLuint") int i4);

    public static native void glUniform4uiEXT(@NativeType("GLint") int i, @NativeType("GLuint") int i2, @NativeType("GLuint") int i3, @NativeType("GLuint") int i4, @NativeType("GLuint") int i5);

    public static native void nglUniform1uivEXT(int i, int i2, long j);

    public static native void nglUniform2uivEXT(int i, int i2, long j);

    public static native void nglUniform3uivEXT(int i, int i2, long j);

    public static native void nglUniform4uivEXT(int i, int i2, long j);

    static {
        GL.initialize();
    }

    protected EXTGPUShader4() {
        throw new UnsupportedOperationException();
    }

    public static void glVertexAttribI1ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 1);
        }
        nglVertexAttribI1ivEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI2ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 2);
        }
        nglVertexAttribI2ivEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI3ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 3);
        }
        nglVertexAttribI3ivEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI4ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 4);
        }
        nglVertexAttribI4ivEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI1uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 1);
        }
        nglVertexAttribI1uivEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI2uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 2);
        }
        nglVertexAttribI2uivEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI3uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 3);
        }
        nglVertexAttribI3uivEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI4uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 4);
        }
        nglVertexAttribI4uivEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI4bvEXT(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 4);
        }
        nglVertexAttribI4bvEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI4svEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 4);
        }
        nglVertexAttribI4svEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI4ubvEXT(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 4);
        }
        nglVertexAttribI4ubvEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribI4usvEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) v, 4);
        }
        nglVertexAttribI4usvEXT(index, MemoryUtil.memAddress(v));
    }

    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, MemoryUtil.memAddress(pointer));
    }

    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, pointer);
    }

    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, MemoryUtil.memAddress(pointer));
    }

    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, MemoryUtil.memAddress(pointer));
    }

    public static void glGetVertexAttribIivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 4);
        }
        nglGetVertexAttribIivEXT(index, pname, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetVertexAttribIiEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribIivEXT(index, pname, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetVertexAttribIuivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 4);
        }
        nglGetVertexAttribIuivEXT(index, pname, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetVertexAttribIuiEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribIuivEXT(index, pname, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetUniformuivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetUniformuivEXT(program, location, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetUniformuiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformuivEXT(program, location, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glBindFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int color, @NativeType("GLchar const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        nglBindFragDataLocationEXT(program, color, MemoryUtil.memAddress(name));
    }

    public static void glBindFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int color, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocationEXT(program, color, nameEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("GLint")
    public static int glGetFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nglGetFragDataLocationEXT(program, MemoryUtil.memAddress(name));
    }

    @NativeType("GLint")
    public static int glGetFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            int iNglGetFragDataLocationEXT = nglGetFragDataLocationEXT(program, nameEncoded);
            stack.setPointer(stackPointer);
            return iNglGetFragDataLocationEXT;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glUniform1uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform1uivEXT(location, value.remaining(), MemoryUtil.memAddress(value));
    }

    public static void glUniform2uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform2uivEXT(location, value.remaining() >> 1, MemoryUtil.memAddress(value));
    }

    public static void glUniform3uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform3uivEXT(location, value.remaining() / 3, MemoryUtil.memAddress(value));
    }

    public static void glUniform4uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform4uivEXT(location, value.remaining() >> 2, MemoryUtil.memAddress(value));
    }

    public static void glVertexAttribI1ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI1ivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 1);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glVertexAttribI2ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI2ivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 2);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glVertexAttribI3ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI3ivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 3);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glVertexAttribI4ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4ivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 4);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glVertexAttribI1uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI1uivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 1);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glVertexAttribI2uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI2uivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 2);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glVertexAttribI3uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI3uivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 3);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glVertexAttribI4uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4uivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 4);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glVertexAttribI4svEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4svEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 4);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glVertexAttribI4usvEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4usvEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(v, 4);
        }
        JNI.callPV(index, v, __functionAddress);
    }

    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glVertexAttribIPointerEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(index, size, type, stride, pointer, __functionAddress);
    }

    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glVertexAttribIPointerEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(index, size, type, stride, pointer, __functionAddress);
    }

    public static void glGetVertexAttribIivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 4);
        }
        JNI.callPV(index, pname, params, __functionAddress);
    }

    public static void glGetVertexAttribIuivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIuivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 4);
        }
        JNI.callPV(index, pname, params, __functionAddress);
    }

    public static void glGetUniformuivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformuivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(program, location, params, __functionAddress);
    }

    public static void glUniform1uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform1uivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length, value, __functionAddress);
    }

    public static void glUniform2uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform2uivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length >> 1, value, __functionAddress);
    }

    public static void glUniform3uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform3uivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length / 3, value, __functionAddress);
    }

    public static void glUniform4uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform4uivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(location, value.length >> 2, value, __functionAddress);
    }
}
