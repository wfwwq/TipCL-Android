package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GL31C.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GL31C.class */
public class GL31C extends GL30C {
    public static final int GL_R8_SNORM = 36756;
    public static final int GL_RG8_SNORM = 36757;
    public static final int GL_RGB8_SNORM = 36758;
    public static final int GL_RGBA8_SNORM = 36759;
    public static final int GL_R16_SNORM = 36760;
    public static final int GL_RG16_SNORM = 36761;
    public static final int GL_RGB16_SNORM = 36762;
    public static final int GL_RGBA16_SNORM = 36763;
    public static final int GL_SIGNED_NORMALIZED = 36764;
    public static final int GL_SAMPLER_BUFFER = 36290;
    public static final int GL_INT_SAMPLER_2D_RECT = 36301;
    public static final int GL_INT_SAMPLER_BUFFER = 36304;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 36309;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 36312;
    public static final int GL_COPY_READ_BUFFER = 36662;
    public static final int GL_COPY_WRITE_BUFFER = 36663;
    public static final int GL_PRIMITIVE_RESTART = 36765;
    public static final int GL_PRIMITIVE_RESTART_INDEX = 36766;
    public static final int GL_TEXTURE_BUFFER = 35882;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE = 35883;
    public static final int GL_TEXTURE_BINDING_BUFFER = 35884;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 35885;
    public static final int GL_TEXTURE_RECTANGLE = 34037;
    public static final int GL_TEXTURE_BINDING_RECTANGLE = 34038;
    public static final int GL_PROXY_TEXTURE_RECTANGLE = 34039;
    public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 34040;
    public static final int GL_SAMPLER_2D_RECT = 35683;
    public static final int GL_SAMPLER_2D_RECT_SHADOW = 35684;
    public static final int GL_UNIFORM_BUFFER = 35345;
    public static final int GL_UNIFORM_BUFFER_BINDING = 35368;
    public static final int GL_UNIFORM_BUFFER_START = 35369;
    public static final int GL_UNIFORM_BUFFER_SIZE = 35370;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 35371;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 35372;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 35373;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 35374;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 35375;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 35376;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 35377;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 35378;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 35379;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 35380;
    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 35381;
    public static final int GL_ACTIVE_UNIFORM_BLOCKS = 35382;
    public static final int GL_UNIFORM_TYPE = 35383;
    public static final int GL_UNIFORM_SIZE = 35384;
    public static final int GL_UNIFORM_NAME_LENGTH = 35385;
    public static final int GL_UNIFORM_BLOCK_INDEX = 35386;
    public static final int GL_UNIFORM_OFFSET = 35387;
    public static final int GL_UNIFORM_ARRAY_STRIDE = 35388;
    public static final int GL_UNIFORM_MATRIX_STRIDE = 35389;
    public static final int GL_UNIFORM_IS_ROW_MAJOR = 35390;
    public static final int GL_UNIFORM_BLOCK_BINDING = 35391;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 35392;
    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 35393;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 35394;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 35395;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 35396;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 35397;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 35398;
    public static final int GL_INVALID_INDEX = -1;

    public static native void glDrawArraysInstanced(@NativeType("GLenum") int i, @NativeType("GLint") int i2, @NativeType("GLsizei") int i3, @NativeType("GLsizei") int i4);

    public static native void nglDrawElementsInstanced(int i, int i2, int i3, long j, int i4);

    public static native void glCopyBufferSubData(@NativeType("GLenum") int i, @NativeType("GLenum") int i2, @NativeType("GLintptr") long j, @NativeType("GLintptr") long j2, @NativeType("GLsizeiptr") long j3);

    public static native void glPrimitiveRestartIndex(@NativeType("GLuint") int i);

    public static native void glTexBuffer(@NativeType("GLenum") int i, @NativeType("GLenum") int i2, @NativeType("GLuint") int i3);

    public static native void nglGetUniformIndices(int i, int i2, long j, long j2);

    public static native void nglGetActiveUniformsiv(int i, int i2, long j, int i3, long j2);

    public static native void nglGetActiveUniformName(int i, int i2, int i3, long j, long j2);

    public static native int nglGetUniformBlockIndex(int i, long j);

    public static native void nglGetActiveUniformBlockiv(int i, int i2, int i3, long j);

    public static native void nglGetActiveUniformBlockName(int i, int i2, int i3, long j, long j2);

    public static native void glUniformBlockBinding(@NativeType("GLuint") int i, @NativeType("GLuint") int i2, @NativeType("GLuint") int i3);

    static {
        GL.initialize();
    }

    protected GL31C() {
        throw new UnsupportedOperationException();
    }

    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstanced(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, MemoryUtil.memAddress(indices), primcount);
    }

    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstanced(mode, indices.remaining(), 5121, MemoryUtil.memAddress(indices), primcount);
    }

    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstanced(mode, indices.remaining(), 5123, MemoryUtil.memAddress(indices), primcount);
    }

    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstanced(mode, indices.remaining(), 5125, MemoryUtil.memAddress(indices), primcount);
    }

    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) uniformIndices, uniformNames.remaining());
        }
        nglGetUniformIndices(program, uniformNames.remaining(), MemoryUtil.memAddress(uniformNames), MemoryUtil.memAddress(uniformIndices));
    }

    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) uniformIndices, uniformNames.length);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long uniformNamesAddress = APIUtil.apiArray(stack, MemoryUtil::memASCII, uniformNames);
            nglGetUniformIndices(program, uniformNames.length, uniformNamesAddress, MemoryUtil.memAddress(uniformIndices));
            APIUtil.apiArrayFree(uniformNamesAddress, uniformNames.length);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void")
    public static int glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence uniformName) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            long uniformNamesAddress = APIUtil.apiArray(stack, MemoryUtil::memASCII, uniformName);
            IntBuffer uniformIndices = stack.callocInt(1);
            nglGetUniformIndices(program, 1, uniformNamesAddress, MemoryUtil.memAddress(uniformIndices));
            APIUtil.apiArrayFree(uniformNamesAddress, 1);
            int i = uniformIndices.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") IntBuffer uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, uniformIndices.remaining());
        }
        nglGetActiveUniformsiv(program, uniformIndices.remaining(), MemoryUtil.memAddress(uniformIndices), pname, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetActiveUniformsi(@NativeType("GLuint") int program, @NativeType("GLuint const *") int uniformIndex, @NativeType("GLenum") int pname) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            IntBuffer uniformIndices = stack.ints(uniformIndex);
            nglGetActiveUniformsiv(program, 1, MemoryUtil.memAddress(uniformIndices), pname, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformName) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) length, 1);
        }
        nglGetActiveUniformName(program, uniformIndex, uniformName.remaining(), MemoryUtil.memAddressSafe(length), MemoryUtil.memAddress(uniformName));
    }

    @NativeType("void")
    public static String glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer uniformName = stack.malloc(bufSize);
            nglGetActiveUniformName(program, uniformIndex, bufSize, MemoryUtil.memAddress(length), MemoryUtil.memAddress(uniformName));
            String strMemASCII = MemoryUtil.memASCII(uniformName, length.get(0));
            stack.setPointer(stackPointer);
            return strMemASCII;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void")
    public static String glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex) {
        return glGetActiveUniformName(program, uniformIndex, glGetActiveUniformsi(program, uniformIndex, 35385));
    }

    @NativeType("GLuint")
    public static int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer uniformBlockName) {
        if (Checks.CHECKS) {
            Checks.checkNT1(uniformBlockName);
        }
        return nglGetUniformBlockIndex(program, MemoryUtil.memAddress(uniformBlockName));
    }

    @NativeType("GLuint")
    public static int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence uniformBlockName) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(uniformBlockName, true);
            long uniformBlockNameEncoded = stack.getPointerAddress();
            int iNglGetUniformBlockIndex = nglGetUniformBlockIndex(program, uniformBlockNameEncoded);
            stack.setPointer(stackPointer);
            return iNglGetUniformBlockIndex;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetActiveUniformBlocki(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) length, 1);
        }
        nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), MemoryUtil.memAddressSafe(length), MemoryUtil.memAddress(uniformBlockName));
    }

    @NativeType("void")
    public static String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer uniformBlockName = stack.malloc(bufSize);
            nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, MemoryUtil.memAddress(length), MemoryUtil.memAddress(uniformBlockName));
            String strMemASCII = MemoryUtil.memASCII(uniformBlockName, length.get(0));
            stack.setPointer(stackPointer);
            return strMemASCII;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void")
    public static String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex) {
        return glGetActiveUniformBlockName(program, uniformBlockIndex, glGetActiveUniformBlocki(program, uniformBlockIndex, 35393));
    }

    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") int[] uniformIndices) {
        long __functionAddress = GL.getICD().glGetUniformIndices;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(uniformIndices, uniformNames.remaining());
        }
        JNI.callPPV(program, uniformNames.remaining(), MemoryUtil.memAddress(uniformNames), uniformIndices, __functionAddress);
    }

    public static void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") int[] uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetActiveUniformsiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, uniformIndices.length);
        }
        JNI.callPPV(program, uniformIndices.length, uniformIndices, pname, params, __functionAddress);
    }

    public static void glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer uniformName) {
        long __functionAddress = GL.getICD().glGetActiveUniformName;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(length, 1);
        }
        JNI.callPPV(program, uniformIndex, uniformName.remaining(), length, MemoryUtil.memAddress(uniformName), __functionAddress);
    }

    public static void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetActiveUniformBlockiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(program, uniformBlockIndex, pname, params, __functionAddress);
    }

    public static void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        long __functionAddress = GL.getICD().glGetActiveUniformBlockName;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(length, 1);
        }
        JNI.callPPV(program, uniformBlockIndex, uniformBlockName.remaining(), length, MemoryUtil.memAddress(uniformBlockName), __functionAddress);
    }
}
